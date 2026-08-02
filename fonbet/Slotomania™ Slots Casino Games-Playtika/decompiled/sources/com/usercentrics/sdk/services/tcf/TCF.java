package com.usercentrics.sdk.services.tcf;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.usercentrics.sdk.AdTechProvider;
import com.usercentrics.sdk.AssertionsKt;
import com.usercentrics.sdk.acm.service.AdditionalConsentModeService;
import com.usercentrics.sdk.core.settings.SettingsOrchestrator;
import com.usercentrics.sdk.errors.UsercentricsException;
import com.usercentrics.sdk.extensions.ArrayExtensionsKt;
import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.models.settings.UsercentricsConsentAction;
import com.usercentrics.sdk.services.deviceStorage.DeviceStorage;
import com.usercentrics.sdk.services.deviceStorage.models.StorageTCF;
import com.usercentrics.sdk.services.deviceStorage.models.StorageVendor;
import com.usercentrics.sdk.services.tcf.interfaces.IdAndConsent;
import com.usercentrics.sdk.services.tcf.interfaces.IdAndName;
import com.usercentrics.sdk.services.tcf.interfaces.TCFConsentDecision;
import com.usercentrics.sdk.services.tcf.interfaces.TCFConsentWithLegitimateInterestDecision;
import com.usercentrics.sdk.services.tcf.interfaces.TCFData;
import com.usercentrics.sdk.services.tcf.interfaces.TCFFeature;
import com.usercentrics.sdk.services.tcf.interfaces.TCFPurpose;
import com.usercentrics.sdk.services.tcf.interfaces.TCFSpecialFeature;
import com.usercentrics.sdk.services.tcf.interfaces.TCFSpecialPurpose;
import com.usercentrics.sdk.services.tcf.interfaces.TCFStack;
import com.usercentrics.sdk.services.tcf.interfaces.TCFUserDecisionOnPurpose;
import com.usercentrics.sdk.services.tcf.interfaces.TCFUserDecisionOnSpecialFeature;
import com.usercentrics.sdk.services.tcf.interfaces.TCFUserDecisionOnVendor;
import com.usercentrics.sdk.services.tcf.interfaces.TCFUserDecisions;
import com.usercentrics.sdk.services.tcf.interfaces.TCFVendor;
import com.usercentrics.sdk.services.tcf.interfaces.TCFVendorRestriction;
import com.usercentrics.sdk.v2.async.dispatcher.Dispatcher;
import com.usercentrics.sdk.v2.async.dispatcher.Semaphore;
import com.usercentrics.sdk.v2.consent.service.ConsentsService;
import com.usercentrics.sdk.v2.location.service.ILocationService;
import com.usercentrics.sdk.v2.settings.data.NewSettingsData;
import com.usercentrics.sdk.v2.settings.data.TCF2ChangedPurposes;
import com.usercentrics.sdk.v2.settings.data.TCF2Settings;
import com.usercentrics.sdk.v2.settings.data.UsercentricsSettings;
import com.usercentrics.sdk.v2.settings.service.ISettingsService;
import com.usercentrics.sdk.v2.tcf.facade.TCFFacade;
import com.usercentrics.tcf.core.GVL;
import com.usercentrics.tcf.core.IABTCFKeys;
import com.usercentrics.tcf.core.StringOrNumber;
import com.usercentrics.tcf.core.TCModel;
import com.usercentrics.tcf.core.TCString;
import com.usercentrics.tcf.core.encoder.TCFKeysEncoder;
import com.usercentrics.tcf.core.model.ConsentLanguages;
import com.usercentrics.tcf.core.model.PurposeRestriction;
import com.usercentrics.tcf.core.model.PurposeRestrictionVector;
import com.usercentrics.tcf.core.model.RestrictionType;
import com.usercentrics.tcf.core.model.SortedSet;
import com.usercentrics.tcf.core.model.Vector;
import com.usercentrics.tcf.core.model.gvl.DataCategory;
import com.usercentrics.tcf.core.model.gvl.DataRetention;
import com.usercentrics.tcf.core.model.gvl.Feature;
import com.usercentrics.tcf.core.model.gvl.GvlDataRetention;
import com.usercentrics.tcf.core.model.gvl.Purpose;
import com.usercentrics.tcf.core.model.gvl.RetentionPeriod;
import com.usercentrics.tcf.core.model.gvl.Stack;
import com.usercentrics.tcf.core.model.gvl.Vendor;
import com.usercentrics.tcf.core.model.gvl.VendorUrl;
import io.sentry.SentryEvent;
import io.sentry.protocol.Device;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* compiled from: TCF.kt */
@Metadata(d1 = {"\u0000¸\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u000200H\u0002J\u0010\u00104\u001a\u0002002\u0006\u00105\u001a\u000206H\u0002J$\u00107\u001a\b\u0012\u0004\u0012\u000200082\u0006\u00109\u001a\u000206H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020%H\u0002¢\u0006\u0002\u0010AJ\u0016\u0010B\u001a\u0002002\f\u0010C\u001a\b\u0012\u0004\u0012\u0002060DH\u0002J\b\u0010E\u001a\u000200H\u0016J\u0010\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020GH\u0002J\u0010\u0010I\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J*\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001b0K2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001b0M2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001b0KH\u0002J\u000e\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001b0KH\u0002J\u000e\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0KH\u0002J\b\u0010R\u001a\u00020=H\u0016J\b\u0010S\u001a\u00020=H\u0016J\u001e\u0010T\u001a\u00020\u001b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0K2\u0006\u0010U\u001a\u00020\u001bH\u0002J\u000e\u0010V\u001a\b\u0012\u0004\u0012\u00020\u001b0KH\u0002J\u000e\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001f0KH\u0002J\u000e\u0010X\u001a\b\u0012\u0004\u0012\u00020\u001b0KH\u0002J\u000e\u0010Y\u001a\b\u0012\u0004\u0012\u0002060DH\u0002J\b\u0010Z\u001a\u00020=H\u0016J\b\u0010[\u001a\u00020=H\u0016J\b\u0010\\\u001a\u00020=H\u0016J\b\u0010]\u001a\u00020=H\u0016J\u000e\u0010^\u001a\b\u0012\u0004\u0012\u00020-0KH\u0002J\b\u0010_\u001a\u00020\u001bH\u0016J\u000e\u0010`\u001a\b\u0012\u0004\u0012\u00020\u001b0KH\u0002J\u000e\u0010a\u001a\b\u0012\u0004\u0012\u00020b0KH\u0002J\u000e\u0010c\u001a\b\u0012\u0004\u0012\u00020\u001b0KH\u0002J\u000e\u0010d\u001a\b\u0012\u0004\u0012\u00020e0KH\u0002J\u000e\u0010f\u001a\b\u0012\u0004\u0012\u00020g0KH\u0002J\b\u0010h\u001a\u00020\u001bH\u0016J\b\u0010i\u001a\u00020'H\u0016J\u0006\u0010j\u001a\u000206J\u0016\u0010k\u001a\b\u0012\u0004\u0012\u00020l0K2\u0006\u0010m\u001a\u00020\u001bH\u0002J\u000e\u0010n\u001a\b\u0012\u0004\u0012\u00020-0KH\u0002J8\u0010o\u001a\u00020=\"\u0004\b\u0000\u0010p2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002Hp0K2\f\u0010q\u001a\b\u0012\u0004\u0012\u0002Hp0K2\f\u0010r\u001a\b\u0012\u0004\u0012\u0002Hp0KH\u0002J\u0018\u0010s\u001a\u0002002\u0006\u0010t\u001a\u00020)2\u0006\u0010u\u001a\u00020vH\u0002J,\u0010w\u001a\b\u0012\u0004\u0012\u000200082\u0006\u0010t\u001a\u00020)2\u0006\u0010u\u001a\u00020vH\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bx\u0010yJ$\u0010z\u001a\b\u0012\u0004\u0012\u000200082\u0006\u0010{\u001a\u000206H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b|\u0010;J\b\u0010}\u001a\u00020=H\u0002J\u00ad\u0001\u0010~\u001a\b\u0012\u0004\u0012\u00020\u007f0K\"\u0004\b\u0000\u0010p2\r\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u0002Hp0K2\u0014\u0010\u0081\u0001\u001a\u000f\u0012\u0004\u0012\u0002Hp\u0012\u0004\u0012\u00020\u001b0\u0082\u00012\u0014\u0010\u0083\u0001\u001a\u000f\u0012\u0004\u0012\u0002Hp\u0012\u0004\u0012\u00020=0\u0082\u00012\u0014\u0010\u0084\u0001\u001a\u000f\u0012\u0004\u0012\u0002Hp\u0012\u0004\u0012\u00020=0\u0082\u00012\u0016\u0010\u0085\u0001\u001a\u0011\u0012\u0004\u0012\u0002Hp\u0012\u0006\u0012\u0004\u0018\u00010=0\u0082\u00012\u0016\u0010\u0086\u0001\u001a\u0011\u0012\u0004\u0012\u0002Hp\u0012\u0006\u0012\u0004\u0018\u00010=0\u0082\u00012\u0016\b\u0002\u0010\u0087\u0001\u001a\u000f\u0012\u0004\u0012\u0002Hp\u0012\u0004\u0012\u00020=0\u0082\u0001H\u0002J.\u0010\u0088\u0001\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010K2\r\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0K2\r\u0010H\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010KH\u0002J\u0011\u0010\u008c\u0001\u001a\u0002002\u0006\u0010t\u001a\u00020)H\u0002J&\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u000200082\u0006\u00109\u001a\u000206H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u008e\u0001\u0010;J\t\u0010\u008f\u0001\u001a\u000200H\u0002J\u0011\u0010\u0090\u0001\u001a\u0002062\u0006\u00109\u001a\u000206H\u0002J0\u0010\u0091\u0001\u001a\u0002002\u0006\u00105\u001a\u0002062\u0007\u0010\u0092\u0001\u001a\u0002062\u0014\u0010\u0093\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u0094\u0001H\u0016J\u0018\u0010\u0095\u0001\u001a\u0002002\r\u0010H\u001a\t\u0012\u0005\u0012\u00030\u0096\u00010KH\u0002J\u0018\u0010\u0097\u0001\u001a\u0002002\r\u0010H\u001a\t\u0012\u0005\u0012\u00030\u0098\u00010KH\u0002J\u0018\u0010\u0099\u0001\u001a\u0002002\r\u0010H\u001a\t\u0012\u0005\u0012\u00030\u009a\u00010KH\u0002J\u0011\u0010\u009b\u0001\u001a\u0002002\u0006\u0010t\u001a\u00020)H\u0002J\u0012\u0010\u009c\u0001\u001a\u0002002\u0007\u0010\u009d\u0001\u001a\u00020\u001bH\u0016J'\u0010\u009e\u0001\u001a\u0002002\u0006\u0010t\u001a\u00020)2\u0014\u0010\u009f\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u0094\u0001H\u0002J\t\u0010 \u0001\u001a\u000200H\u0002J\t\u0010¡\u0001\u001a\u000200H\u0002J\t\u0010¢\u0001\u001a\u000200H\u0002J\t\u0010£\u0001\u001a\u000200H\u0002J\t\u0010¤\u0001\u001a\u00020\u001bH\u0002J\u0019\u0010¥\u0001\u001a\u0002002\u0006\u0010H\u001a\u00020G2\u0006\u00101\u001a\u000202H\u0016J\u0011\u0010¦\u0001\u001a\u0002002\u0006\u00105\u001a\u000206H\u0016J\u001a\u0010§\u0001\u001a\u0002002\u0006\u0010{\u001a\u0002062\u0007\u0010¨\u0001\u001a\u00020vH\u0002J\t\u0010©\u0001\u001a\u000200H\u0002J\u0011\u0010ª\u0001\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\u0004\u0018\u00010!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010(\u001a\u0004\u0018\u00010)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006«\u0001"}, d2 = {"Lcom/usercentrics/sdk/services/tcf/TCF;", "Lcom/usercentrics/sdk/services/tcf/TCFUseCase;", SentryEvent.JsonKeys.LOGGER, "Lcom/usercentrics/sdk/log/UsercentricsLogger;", "settingsService", "Lcom/usercentrics/sdk/v2/settings/service/ISettingsService;", "storageInstance", "Lcom/usercentrics/sdk/services/deviceStorage/DeviceStorage;", "consentsService", "Lcom/usercentrics/sdk/v2/consent/service/ConsentsService;", "locationService", "Lcom/usercentrics/sdk/v2/location/service/ILocationService;", "additionalConsentModeService", "Lcom/usercentrics/sdk/acm/service/AdditionalConsentModeService;", "tcfFacade", "Lcom/usercentrics/sdk/v2/tcf/facade/TCFFacade;", "dispatcher", "Lcom/usercentrics/sdk/v2/async/dispatcher/Dispatcher;", "semaphore", "Lcom/usercentrics/sdk/v2/async/dispatcher/Semaphore;", "settingsOrchestrator", "Lcom/usercentrics/sdk/core/settings/SettingsOrchestrator;", "(Lcom/usercentrics/sdk/log/UsercentricsLogger;Lcom/usercentrics/sdk/v2/settings/service/ISettingsService;Lcom/usercentrics/sdk/services/deviceStorage/DeviceStorage;Lcom/usercentrics/sdk/v2/consent/service/ConsentsService;Lcom/usercentrics/sdk/v2/location/service/ILocationService;Lcom/usercentrics/sdk/acm/service/AdditionalConsentModeService;Lcom/usercentrics/sdk/v2/tcf/facade/TCFFacade;Lcom/usercentrics/sdk/v2/async/dispatcher/Dispatcher;Lcom/usercentrics/sdk/v2/async/dispatcher/Semaphore;Lcom/usercentrics/sdk/core/settings/SettingsOrchestrator;)V", "changedPurposes", "Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;", "disclosedVendorsMap", "", "", "Lcom/usercentrics/sdk/services/deviceStorage/models/StorageVendor;", "purposes", "", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;", "settings", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;", "getSettings", "()Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;", "tcModel", "Lcom/usercentrics/tcf/core/TCModel;", "tcfData", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;", "tcfSettings", "Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;", "getTcfSettings", "()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;", "vendors", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;", "vendorsIdsWithImplicitLegitimateInterest", "acceptAllDisclosed", "", "fromLayer", "Lcom/usercentrics/sdk/services/tcf/TCFDecisionUILayer;", "applyRemoteRestrictions", "applyTCString", "tcString", "", "changeLanguage", "Lkotlin/Result;", Device.JsonKeys.LANGUAGE, "changeLanguage-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checklegitimateInterestConsent", "", "vendor", "Lcom/usercentrics/tcf/core/model/gvl/Vendor;", "globalTCModel", "(Lcom/usercentrics/tcf/core/model/gvl/Vendor;Lcom/usercentrics/tcf/core/TCModel;)Ljava/lang/Boolean;", "clearAlreadyAppliedRestrictionsFromTcString", "remoteRestrictions", "", "clearTCFConsentsData", "createTCFUserDecisionsMergingWithCurrentData", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFUserDecisions;", "decisions", "denyAllDisclosed", "filterNotAllowedPurposes", "", "consents", "", "notAllowedPurposes", "getFeatureIdsFromVendors", "getFeaturesFromVendors", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFFeature;", "getGdprAppliesOnTCF", "getHideNonIabOnFirstLayer", "getNumberOfVendorsPerPurpose", "purposeId", "getPurposeIdsFromVendorsAndStacks", "getPurposesFromVendors", "getRawSelectedVendorIds", "getRemoteRestrictions", "getResurfaceATPChanged", "getResurfacePeriodEnded", "getResurfacePurposeChanged", "getResurfaceVendorAdded", "getSelectedTCFVendors", "getSettingsTCFPolicyVersion", "getSpecialFeatureIdsFromVendorsAndStacks", "getSpecialFeaturesFromVendorsAndStacks", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;", "getSpecialPurposeIdsFromVendors", "getSpecialPurposesFromVendors", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;", "getStacks", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;", "getStoredTcStringPolicyVersion", "getTCFData", "getTCStringFromModel", "getVendorRestrictions", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction;", "vendorId", "getVendors", "hasImplicitLegitimateInterest", "T", "legIntPurposes", "specialPurposes", "initDisclosedVendors", "tcf2Settings", "storedTCFData", "Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;", "initTCModel", "initTCModel-0E7RQCE", "(Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", MobileAdsBridgeBase.initializeMethodName, "settingsId", "initialize-gIAlu-s", "isRulesetMarkedNoShow", "mapToIdAndConsent", "Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndConsent;", FirebaseAnalytics.Param.ITEMS, "getId", "Lkotlin/Function1;", "showConsentToggle", "showLegitimateInterestToggle", "getConsent", "getLegitimateInterestConsent", "implicitLegitimateInterest", "mergeConsentsWithUserDecisions", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFConsentDecision;", "data", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFConsentWithLegitimateInterestDecision;", "overrideTCModel", "resetGVLWithLanguage", "resetGVLWithLanguage-gIAlu-s", "resetTCFData", "resolveLanguage", "restore", "acString", "vendorsDisclosed", "", "savePurposes", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFUserDecisionOnPurpose;", "saveSpecialFeatures", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFUserDecisionOnSpecialFeature;", "saveVendors", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFUserDecisionOnVendor;", "setChangedPurposes", "setCmpId", "id", "setDisclosedVendors", "disclosedVendors", "setNewGdprAppliesValue", "setPurposes", "setTCFData", "setVendors", "thirdPartyCount", "updateChoices", "updateIABTCFKeys", "updateLocalStorageIfNeeded", "actualTCFSettings", "updatePolicyVersion", "updateTCString", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TCF implements TCFUseCase {
    private final AdditionalConsentModeService additionalConsentModeService;
    private TCF2ChangedPurposes changedPurposes;
    private final ConsentsService consentsService;
    private Map<Integer, StorageVendor> disclosedVendorsMap;
    private final Dispatcher dispatcher;
    private final ILocationService locationService;
    private final UsercentricsLogger logger;
    private final List<TCFPurpose> purposes;
    private final Semaphore semaphore;
    private final SettingsOrchestrator settingsOrchestrator;
    private final ISettingsService settingsService;
    private final DeviceStorage storageInstance;
    private TCModel tcModel;
    private TCFData tcfData;
    private final TCFFacade tcfFacade;
    private final List<TCFVendor> vendors;
    private final List<Integer> vendorsIdsWithImplicitLegitimateInterest;

    /* compiled from: TCF.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RestrictionType.values().length];
            try {
                iArr[RestrictionType.REQUIRE_LI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RestrictionType.REQUIRE_CONSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RestrictionType.NOT_ALLOWED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.usercentrics.sdk.services.tcf.TCFUseCase
    public int getSettingsTCFPolicyVersion() {
        return 5;
    }

    public TCF(UsercentricsLogger logger, ISettingsService settingsService, DeviceStorage storageInstance, ConsentsService consentsService, ILocationService locationService, AdditionalConsentModeService additionalConsentModeService, TCFFacade tcfFacade, Dispatcher dispatcher, Semaphore semaphore, SettingsOrchestrator settingsOrchestrator) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(settingsService, "settingsService");
        Intrinsics.checkNotNullParameter(storageInstance, "storageInstance");
        Intrinsics.checkNotNullParameter(consentsService, "consentsService");
        Intrinsics.checkNotNullParameter(locationService, "locationService");
        Intrinsics.checkNotNullParameter(additionalConsentModeService, "additionalConsentModeService");
        Intrinsics.checkNotNullParameter(tcfFacade, "tcfFacade");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(semaphore, "semaphore");
        Intrinsics.checkNotNullParameter(settingsOrchestrator, "settingsOrchestrator");
        this.logger = logger;
        this.settingsService = settingsService;
        this.storageInstance = storageInstance;
        this.consentsService = consentsService;
        this.locationService = locationService;
        this.additionalConsentModeService = additionalConsentModeService;
        this.tcfFacade = tcfFacade;
        this.dispatcher = dispatcher;
        this.semaphore = semaphore;
        this.settingsOrchestrator = settingsOrchestrator;
        this.vendors = new ArrayList();
        this.purposes = new ArrayList();
        this.disclosedVendorsMap = new LinkedHashMap();
        this.changedPurposes = new TCF2ChangedPurposes((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
        this.vendorsIdsWithImplicitLegitimateInterest = new ArrayList();
    }

    private final UsercentricsSettings getSettings() {
        NewSettingsData settings = this.settingsService.getSettings();
        if (settings != null) {
            return settings.getData();
        }
        return null;
    }

    private final TCF2Settings getTcfSettings() {
        UsercentricsSettings settings = getSettings();
        if (settings != null) {
            return settings.getTcf2();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.usercentrics.sdk.services.tcf.TCFUseCase
    /* renamed from: initialize-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo10609initializegIAlus(String str, Continuation<? super Result<Unit>> continuation) {
        TCF$initialize$1 tCF$initialize$1;
        int i;
        StorageTCF bootTCFData;
        Object m10606initTCModel0E7RQCE;
        TCF tcf;
        Throwable m11183exceptionOrNullimpl;
        if (continuation instanceof TCF$initialize$1) {
            tCF$initialize$1 = (TCF$initialize$1) continuation;
            if ((tCF$initialize$1.label & Integer.MIN_VALUE) != 0) {
                tCF$initialize$1.label -= Integer.MIN_VALUE;
                Object obj = tCF$initialize$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tCF$initialize$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    TCF2Settings tcfSettings = getTcfSettings();
                    if (tcfSettings == null) {
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m11180constructorimpl(ResultKt.createFailure(new UsercentricsException("TCF Options are empty", new IllegalStateException())));
                    }
                    bootTCFData = this.storageInstance.bootTCFData(str);
                    tCF$initialize$1.L$0 = this;
                    tCF$initialize$1.L$1 = str;
                    tCF$initialize$1.L$2 = bootTCFData;
                    tCF$initialize$1.label = 1;
                    m10606initTCModel0E7RQCE = m10606initTCModel0E7RQCE(tcfSettings, bootTCFData, tCF$initialize$1);
                    if (m10606initTCModel0E7RQCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tcf = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    StorageTCF storageTCF = (StorageTCF) tCF$initialize$1.L$2;
                    String str2 = (String) tCF$initialize$1.L$1;
                    tcf = (TCF) tCF$initialize$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    m10606initTCModel0E7RQCE = ((Result) obj).getValue();
                    bootTCFData = storageTCF;
                    str = str2;
                }
                m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m10606initTCModel0E7RQCE);
                if (m11183exceptionOrNullimpl == null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl));
                }
                tcf.updateLocalStorageIfNeeded(str, bootTCFData);
                Result.Companion companion3 = Result.INSTANCE;
                return Result.m11180constructorimpl(Unit.INSTANCE);
            }
        }
        tCF$initialize$1 = new TCF$initialize$1(this, continuation);
        Object obj2 = tCF$initialize$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tCF$initialize$1.label;
        if (i != 0) {
        }
        m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m10606initTCModel0E7RQCE);
        if (m11183exceptionOrNullimpl == null) {
        }
    }

    @Override // com.usercentrics.sdk.services.tcf.TCFUseCase
    public void restore(String tcString, String acString, Map<Integer, StorageVendor> vendorsDisclosed) {
        Intrinsics.checkNotNullParameter(tcString, "tcString");
        Intrinsics.checkNotNullParameter(acString, "acString");
        Intrinsics.checkNotNullParameter(vendorsDisclosed, "vendorsDisclosed");
        TCF2Settings tcfSettings = getTcfSettings();
        Intrinsics.checkNotNull(tcfSettings);
        setDisclosedVendors(tcfSettings, vendorsDisclosed);
        this.storageInstance.saveTCFData(new StorageTCF(tcString, vendorsDisclosed, acString));
        applyTCString(tcString);
        updateIABTCFKeys(tcString);
        overrideTCModel(tcfSettings);
        resetTCFData();
    }

    @Override // com.usercentrics.sdk.services.tcf.TCFUseCase
    public void acceptAllDisclosed(TCFDecisionUILayer fromLayer) {
        Object m11180constructorimpl;
        Map<Integer, StorageVendor> storageVendorMap;
        Intrinsics.checkNotNullParameter(fromLayer, "fromLayer");
        try {
            Result.Companion companion = Result.INSTANCE;
            TCF tcf = this;
            TCModel tCModel = this.tcModel;
            Intrinsics.checkNotNull(tCModel);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            List<TCFVendor> vendors = getVendors();
            List<Integer> excludedVendors$usercentrics_release = UsercentricsTCFSettings.INSTANCE.getExcludedVendors$usercentrics_release();
            for (TCFVendor tCFVendor : vendors) {
                if (!excludedVendors$usercentrics_release.contains(Integer.valueOf(tCFVendor.getId()))) {
                    if (!tCFVendor.getPurposes().isEmpty()) {
                        arrayList.add(Integer.valueOf(tCFVendor.getId()));
                        List<IdAndName> purposes = tCFVendor.getPurposes();
                        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(purposes, 10));
                        Iterator<T> it = purposes.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(Integer.valueOf(((IdAndName) it.next()).getId()));
                        }
                        linkedHashSet.addAll(arrayList4);
                    } else {
                        arrayList2.add(Integer.valueOf(tCFVendor.getId()));
                    }
                    arrayList3.add(Integer.valueOf(tCFVendor.getId()));
                    List<IdAndName> legitimateInterestPurposes = tCFVendor.getLegitimateInterestPurposes();
                    ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(legitimateInterestPurposes, 10));
                    Iterator<T> it2 = legitimateInterestPurposes.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(Integer.valueOf(((IdAndName) it2.next()).getId()));
                    }
                    linkedHashSet2.addAll(arrayList5);
                }
            }
            TCF2Settings tcfSettings = getTcfSettings();
            Intrinsics.checkNotNull(tcfSettings);
            storageVendorMap = TCFKt.toStorageVendorMap(vendors);
            setDisclosedVendors(tcfSettings, storageVendorMap);
            tCModel.getVendorConsents().set(arrayList);
            tCModel.getVendorConsents().unset(arrayList2);
            tCModel.getVendorLegitimateInterests().set(arrayList3);
            tCModel.getVendorLegitimateInterests().unset(new ArrayList());
            List<Integer> notAllowedPurposes = this.changedPurposes.getNotAllowedPurposes();
            tCModel.getPurposeConsents().set(filterNotAllowedPurposes(linkedHashSet, notAllowedPurposes));
            tCModel.getPurposeLegitimateInterests().set(filterNotAllowedPurposes(linkedHashSet2, notAllowedPurposes));
            TCF2Settings tcfSettings2 = getTcfSettings();
            Intrinsics.checkNotNull(tcfSettings2);
            if (tcfSettings2.getHideLegitimateInterestToggles()) {
                tCModel.unsetAllVendorLegitimateInterests();
                tCModel.unsetAllPurposeLegitimateInterests();
            }
            tCModel.getSpecialFeatureOptins().set(getSpecialFeatureIdsFromVendorsAndStacks());
            updateTCString(fromLayer);
            m11180constructorimpl = Result.m11180constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
        if (m11183exceptionOrNullimpl != null) {
            this.logger.error("Something went wrong with TCF acceptAllDisclosed method: " + m11183exceptionOrNullimpl, m11183exceptionOrNullimpl);
        }
    }

    private final List<Integer> filterNotAllowedPurposes(Set<Integer> consents, List<Integer> notAllowedPurposes) {
        if (notAllowedPurposes.isEmpty()) {
            return CollectionsKt.toList(consents);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : consents) {
            if (!notAllowedPurposes.contains(Integer.valueOf(((Number) obj).intValue()))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.usercentrics.sdk.services.tcf.TCFUseCase
    /* renamed from: changeLanguage-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo10608changeLanguagegIAlus(String str, Continuation<? super Result<Unit>> continuation) {
        TCF$changeLanguage$1 tCF$changeLanguage$1;
        int i;
        Object m10607resetGVLWithLanguagegIAlus;
        TCF tcf;
        Throwable m11183exceptionOrNullimpl;
        GVL gvl_;
        if (continuation instanceof TCF$changeLanguage$1) {
            tCF$changeLanguage$1 = (TCF$changeLanguage$1) continuation;
            if ((tCF$changeLanguage$1.label & Integer.MIN_VALUE) != 0) {
                tCF$changeLanguage$1.label -= Integer.MIN_VALUE;
                Object obj = tCF$changeLanguage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tCF$changeLanguage$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String resolveLanguage = resolveLanguage(str);
                    tCF$changeLanguage$1.L$0 = this;
                    tCF$changeLanguage$1.label = 1;
                    m10607resetGVLWithLanguagegIAlus = m10607resetGVLWithLanguagegIAlus(resolveLanguage, tCF$changeLanguage$1);
                    if (m10607resetGVLWithLanguagegIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tcf = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tcf = (TCF) tCF$changeLanguage$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    m10607resetGVLWithLanguagegIAlus = ((Result) obj).getValue();
                }
                m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m10607resetGVLWithLanguagegIAlus);
                if (m11183exceptionOrNullimpl == null) {
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl));
                }
                TCModel tCModel = tcf.tcModel;
                if (tCModel != null && (gvl_ = tCModel.getGvl_()) != null) {
                    gvl_.narrowVendorsTo(tcf.getRawSelectedVendorIds());
                }
                tcf.resetTCFData();
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m11180constructorimpl(Unit.INSTANCE);
            }
        }
        tCF$changeLanguage$1 = new TCF$changeLanguage$1(this, continuation);
        Object obj2 = tCF$changeLanguage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tCF$changeLanguage$1.label;
        if (i != 0) {
        }
        m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m10607resetGVLWithLanguagegIAlus);
        if (m11183exceptionOrNullimpl == null) {
        }
    }

    @Override // com.usercentrics.sdk.services.tcf.TCFUseCase
    public void denyAllDisclosed(TCFDecisionUILayer fromLayer) {
        Object m11180constructorimpl;
        Map<Integer, StorageVendor> storageVendorMap;
        Intrinsics.checkNotNullParameter(fromLayer, "fromLayer");
        try {
            Result.Companion companion = Result.INSTANCE;
            TCF tcf = this;
            TCModel tCModel = this.tcModel;
            Intrinsics.checkNotNull(tCModel);
            tCModel.unsetAllVendorConsents();
            tCModel.unsetAllVendorLegitimateInterests();
            tCModel.getVendorLegitimateInterests().set(this.vendorsIdsWithImplicitLegitimateInterest);
            tCModel.getPurposeConsents().unset(getPurposeIdsFromVendorsAndStacks());
            tCModel.getPurposeLegitimateInterests().unset(getPurposeIdsFromVendorsAndStacks());
            tCModel.getSpecialFeatureOptins().unset(getSpecialFeatureIdsFromVendorsAndStacks());
            TCF2Settings tcfSettings = getTcfSettings();
            Intrinsics.checkNotNull(tcfSettings);
            storageVendorMap = TCFKt.toStorageVendorMap(getVendors());
            setDisclosedVendors(tcfSettings, storageVendorMap);
            updateTCString(fromLayer);
            m11180constructorimpl = Result.m11180constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
        if (m11183exceptionOrNullimpl != null) {
            this.logger.error("Something went wrong with TCF denyAllDisclosed method: " + m11183exceptionOrNullimpl, m11183exceptionOrNullimpl);
        }
    }

    @Override // com.usercentrics.sdk.services.tcf.TCFUseCase
    public TCFData getTCFData() {
        AssertionsKt.assertNotUIThread();
        this.semaphore.acquire();
        try {
            try {
                if (this.tcfData == null) {
                    setTCFData();
                }
                this.semaphore.release();
                TCFData tCFData = this.tcfData;
                Intrinsics.checkNotNull(tCFData);
                return tCFData;
            } catch (Exception e) {
                throw e;
            }
        } catch (Throwable th) {
            this.semaphore.release();
            throw th;
        }
    }

    private final void updateLocalStorageIfNeeded(String settingsId, StorageTCF actualTCFSettings) {
        setNewGdprAppliesValue();
        String actualTCFSettingsId = this.storageInstance.getActualTCFSettingsId();
        if (StringsKt.isBlank(actualTCFSettingsId) || Intrinsics.areEqual(actualTCFSettingsId, settingsId)) {
            return;
        }
        DeviceStorage deviceStorage = this.storageInstance;
        deviceStorage.saveActualTCFSettingsId(settingsId);
        deviceStorage.clearTCFStorageEntries();
        updateIABTCFKeys(actualTCFSettings.getTcString());
        String acString = actualTCFSettings.getAcString();
        if (acString == null || !(!StringsKt.isBlank(acString))) {
            return;
        }
        this.additionalConsentModeService.save(acString);
    }

    private final void setNewGdprAppliesValue() {
        if (isRulesetMarkedNoShow()) {
            this.storageInstance.storeValuesDefaultStorage(MapsKt.mapOf(TuplesKt.to(IABTCFKeys.GDPR_APPLIES.getKey(), 0)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTCFData() {
        AssertionsKt.assertNotUIThread();
        this.tcfData = new TCFData(ArrayExtensionsKt.sortedAlphaBy$default(getFeaturesFromVendors(), false, new Function1<TCFFeature, String>() { // from class: com.usercentrics.sdk.services.tcf.TCF$setTCFData$1
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(TCFFeature it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getName();
            }
        }, 1, null), CollectionsKt.toMutableList((Collection) getPurposesFromVendors()), ArrayExtensionsKt.sortedAlphaBy$default(getSpecialFeaturesFromVendorsAndStacks(), false, new Function1<TCFSpecialFeature, String>() { // from class: com.usercentrics.sdk.services.tcf.TCF$setTCFData$2
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(TCFSpecialFeature it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getName();
            }
        }, 1, null), ArrayExtensionsKt.sortedAlphaBy$default(getSpecialPurposesFromVendors(), false, new Function1<TCFSpecialPurpose, String>() { // from class: com.usercentrics.sdk.services.tcf.TCF$setTCFData$3
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(TCFSpecialPurpose it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getName();
            }
        }, 1, null), ArrayExtensionsKt.sortedAlphaBy$default(getStacks(), false, new Function1<TCFStack, String>() { // from class: com.usercentrics.sdk.services.tcf.TCF$setTCFData$4
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(TCFStack it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getName();
            }
        }, 1, null), ArrayExtensionsKt.sortedAlphaBy$default(getVendors(), false, new Function1<TCFVendor, String>() { // from class: com.usercentrics.sdk.services.tcf.TCF$setTCFData$5
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(TCFVendor it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getName();
            }
        }, 1, null), this.storageInstance.getTCFData().getTcString(), thirdPartyCount());
    }

    private final int thirdPartyCount() {
        NewSettingsData settings = this.settingsService.getSettings();
        int servicesCount = settings != null ? settings.getServicesCount() : 0;
        List<AdTechProvider> adTechProviderList = this.additionalConsentModeService.getAdTechProviderList();
        return this.vendors.size() + servicesCount + (adTechProviderList != null ? adTechProviderList.size() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: initTCModel-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m10606initTCModel0E7RQCE(TCF2Settings tCF2Settings, StorageTCF storageTCF, Continuation<? super Result<Unit>> continuation) {
        TCF$initTCModel$1 tCF$initTCModel$1;
        int i;
        GVL gvl;
        TCF2Settings tCF2Settings2;
        StorageTCF storageTCF2;
        Object m10629initializeIoAF18A;
        TCF tcf;
        Throwable m11183exceptionOrNullimpl;
        TCF2Settings tCF2Settings3;
        Object obj;
        TCF tcf2;
        GVL gvl2;
        Throwable m11183exceptionOrNullimpl2;
        PurposeRestrictionVector publisherRestrictions;
        GVL gvl_;
        if (continuation instanceof TCF$initTCModel$1) {
            tCF$initTCModel$1 = (TCF$initTCModel$1) continuation;
            if ((tCF$initTCModel$1.label & Integer.MIN_VALUE) != 0) {
                tCF$initTCModel$1.label -= Integer.MIN_VALUE;
                Object obj2 = tCF$initTCModel$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tCF$initTCModel$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    gvl = new GVL(this.tcfFacade, null, null, null, null, null, null, null, null, null, null, null, 4094, null);
                    this.tcModel = new TCModel(gvl);
                    String tcString = storageTCF.getTcString();
                    if (!StringsKt.isBlank(tcString)) {
                        applyTCString(tcString);
                    }
                    overrideTCModel(tCF2Settings);
                    tCF$initTCModel$1.L$0 = this;
                    tCF2Settings2 = tCF2Settings;
                    tCF$initTCModel$1.L$1 = tCF2Settings2;
                    storageTCF2 = storageTCF;
                    tCF$initTCModel$1.L$2 = storageTCF2;
                    tCF$initTCModel$1.L$3 = gvl;
                    tCF$initTCModel$1.label = 1;
                    m10629initializeIoAF18A = gvl.m10629initializeIoAF18A(tCF$initTCModel$1);
                    if (m10629initializeIoAF18A != coroutine_suspended) {
                        tcf = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gvl2 = (GVL) tCF$initTCModel$1.L$3;
                    storageTCF2 = (StorageTCF) tCF$initTCModel$1.L$2;
                    tCF2Settings3 = (TCF2Settings) tCF$initTCModel$1.L$1;
                    tcf2 = (TCF) tCF$initTCModel$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    obj = ((Result) obj2).getValue();
                    m11183exceptionOrNullimpl2 = Result.m11183exceptionOrNullimpl(obj);
                    if (m11183exceptionOrNullimpl2 == null) {
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl2));
                    }
                    List<Integer> rawSelectedVendorIds = tcf2.getRawSelectedVendorIds();
                    TCModel tCModel = tcf2.tcModel;
                    if (tCModel != null && (gvl_ = tCModel.getGvl_()) != null) {
                        gvl_.narrowVendorsTo(rawSelectedVendorIds);
                    }
                    TCModel tCModel2 = tcf2.tcModel;
                    if (tCModel2 != null && (publisherRestrictions = tCModel2.getPublisherRestrictions()) != null) {
                        publisherRestrictions.setGvl$usercentrics_release(gvl2);
                    }
                    if (tCF2Settings3.isServiceSpecific()) {
                        tcf2.setChangedPurposes(tCF2Settings3);
                        tcf2.applyRemoteRestrictions();
                    }
                    tcf2.initDisclosedVendors(tCF2Settings3, storageTCF2);
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m11180constructorimpl(Unit.INSTANCE);
                }
                GVL gvl3 = (GVL) tCF$initTCModel$1.L$3;
                StorageTCF storageTCF3 = (StorageTCF) tCF$initTCModel$1.L$2;
                TCF2Settings tCF2Settings4 = (TCF2Settings) tCF$initTCModel$1.L$1;
                tcf = (TCF) tCF$initTCModel$1.L$0;
                ResultKt.throwOnFailure(obj2);
                gvl = gvl3;
                storageTCF2 = storageTCF3;
                m10629initializeIoAF18A = ((Result) obj2).getValue();
                tCF2Settings2 = tCF2Settings4;
                m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m10629initializeIoAF18A);
                if (m11183exceptionOrNullimpl == null) {
                    Result.Companion companion3 = Result.INSTANCE;
                    return Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl));
                }
                UsercentricsSettings settings = tcf.getSettings();
                Intrinsics.checkNotNull(settings);
                String resolveLanguage = tcf.resolveLanguage(settings.getLanguage());
                tCF$initTCModel$1.L$0 = tcf;
                tCF$initTCModel$1.L$1 = tCF2Settings2;
                tCF$initTCModel$1.L$2 = storageTCF2;
                tCF$initTCModel$1.L$3 = gvl;
                tCF$initTCModel$1.label = 2;
                Object m10607resetGVLWithLanguagegIAlus = tcf.m10607resetGVLWithLanguagegIAlus(resolveLanguage, tCF$initTCModel$1);
                if (m10607resetGVLWithLanguagegIAlus != coroutine_suspended) {
                    tCF2Settings3 = tCF2Settings2;
                    obj = m10607resetGVLWithLanguagegIAlus;
                    tcf2 = tcf;
                    gvl2 = gvl;
                    m11183exceptionOrNullimpl2 = Result.m11183exceptionOrNullimpl(obj);
                    if (m11183exceptionOrNullimpl2 == null) {
                    }
                }
                return coroutine_suspended;
            }
        }
        tCF$initTCModel$1 = new TCF$initTCModel$1(this, continuation);
        Object obj22 = tCF$initTCModel$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tCF$initTCModel$1.label;
        if (i != 0) {
        }
        m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m10629initializeIoAF18A);
        if (m11183exceptionOrNullimpl == null) {
        }
    }

    private final void setChangedPurposes(TCF2Settings tcf2Settings) {
        TCF2ChangedPurposes changedPurposes = tcf2Settings.getChangedPurposes();
        if (changedPurposes != null) {
            if (!changedPurposes.getNotAllowedPurposes().isEmpty()) {
                this.changedPurposes = changedPurposes;
            } else {
                this.changedPurposes = TCF2ChangedPurposes.copy$default(changedPurposes, null, null, UsercentricsTCFSettings.INSTANCE.getPurposesFlatlyNotAllowed$usercentrics_release(), 3, null);
            }
        }
    }

    private final void clearAlreadyAppliedRestrictionsFromTcString(Set<String> remoteRestrictions) {
        Set emptySet;
        PurposeRestrictionVector publisherRestrictions;
        Map<String, SortedSet<Integer>> map;
        PurposeRestrictionVector publisherRestrictions2;
        Map<String, SortedSet<Integer>> map2;
        Set<String> keySet;
        PurposeRestrictionVector publisherRestrictions3;
        Map<String, SortedSet<Integer>> map3;
        TCModel tCModel = this.tcModel;
        if (tCModel == null || (publisherRestrictions3 = tCModel.getPublisherRestrictions()) == null || (map3 = publisherRestrictions3.getMap()) == null || !map3.isEmpty()) {
            TCModel tCModel2 = this.tcModel;
            if (tCModel2 == null || (publisherRestrictions2 = tCModel2.getPublisherRestrictions()) == null || (map2 = publisherRestrictions2.getMap()) == null || (keySet = map2.keySet()) == null || (emptySet = CollectionsKt.toSet(keySet)) == null) {
                emptySet = SetsKt.emptySet();
            }
            for (String str : SetsKt.minus(emptySet, (Iterable) remoteRestrictions)) {
                TCModel tCModel3 = this.tcModel;
                if (tCModel3 != null && (publisherRestrictions = tCModel3.getPublisherRestrictions()) != null && (map = publisherRestrictions.getMap()) != null) {
                    map.remove(str);
                }
            }
        }
    }

    private final void initDisclosedVendors(TCF2Settings tcf2Settings, StorageTCF storedTCFData) {
        if (storedTCFData.getVendorsDisclosedMap().isEmpty()) {
            return;
        }
        setDisclosedVendors(tcf2Settings, storedTCFData.getVendorsDisclosedMap());
    }

    private final void applyTCString(String tcString) {
        try {
            TCString.Companion companion = TCString.INSTANCE;
            TCModel tCModel = this.tcModel;
            Intrinsics.checkNotNull(tCModel);
            this.tcModel = companion.decode$usercentrics_release(tcString, tCModel);
        } catch (Throwable th) {
            this.logger.error(TCF_WARN_MESSAGES.INIT_TCF_ERROR.getMessage(), th);
        }
    }

    private final void overrideTCModel(TCF2Settings tcf2Settings) {
        TCModel tCModel = this.tcModel;
        if (tCModel != null) {
            tCModel.setCmpId(new StringOrNumber.Int(tcf2Settings.getCmpId()));
            tCModel.setCmpVersion(new StringOrNumber.Int(tcf2Settings.getCmpVersion()));
            tCModel.setIsServiceSpecific(tcf2Settings.isServiceSpecific());
            tCModel.setPublisherCountryCode(tcf2Settings.getPublisherCountryCode());
            tCModel.setPurposeOneTreatment(tcf2Settings.getPurposeOneTreatment());
        }
    }

    private final void applyRemoteRestrictions() {
        PurposeRestrictionVector publisherRestrictions;
        Set<String> remoteRestrictions = getRemoteRestrictions();
        clearAlreadyAppliedRestrictionsFromTcString(remoteRestrictions);
        TCModel tCModel = this.tcModel;
        if (tCModel == null || (publisherRestrictions = tCModel.getPublisherRestrictions()) == null) {
            return;
        }
        publisherRestrictions.initTCModelRestrictPurposeToLegalBasis(remoteRestrictions);
    }

    private final Set<String> getRemoteRestrictions() {
        List<Integer> purposes = this.changedPurposes.getPurposes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(purposes, 10));
        Iterator<T> it = purposes.iterator();
        while (it.hasNext()) {
            arrayList.add(new PurposeRestriction(Integer.valueOf(((Number) it.next()).intValue()), RestrictionType.REQUIRE_CONSENT).getHash());
        }
        ArrayList arrayList2 = arrayList;
        List<Integer> legIntPurposes = this.changedPurposes.getLegIntPurposes();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(legIntPurposes, 10));
        Iterator<T> it2 = legIntPurposes.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new PurposeRestriction(Integer.valueOf(((Number) it2.next()).intValue()), RestrictionType.REQUIRE_LI).getHash());
        }
        ArrayList arrayList4 = arrayList3;
        List<Integer> notAllowedPurposes = this.changedPurposes.getNotAllowedPurposes();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(notAllowedPurposes, 10));
        Iterator<T> it3 = notAllowedPurposes.iterator();
        while (it3.hasNext()) {
            arrayList5.add(new PurposeRestriction(Integer.valueOf(((Number) it3.next()).intValue()), RestrictionType.NOT_ALLOWED).getHash());
        }
        return CollectionsKt.toSet(CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList4), (Iterable) arrayList5));
    }

    private final List<TCFVendorRestriction> getVendorRestrictions(int vendorId) {
        PurposeRestrictionVector publisherRestrictions;
        List<PurposeRestriction> restrictions;
        ArrayList arrayList = new ArrayList();
        TCModel tCModel = this.tcModel;
        if (tCModel != null && (publisherRestrictions = tCModel.getPublisherRestrictions()) != null && (restrictions = publisherRestrictions.getRestrictions(Integer.valueOf(vendorId))) != null) {
            for (PurposeRestriction purposeRestriction : restrictions) {
                Integer purposeId_ = purposeRestriction.getPurposeId_();
                if (purposeId_ != null) {
                    arrayList.add(new TCFVendorRestriction(purposeId_.intValue(), purposeRestriction.getRestrictionType()));
                }
            }
        }
        return arrayList;
    }

    private final List<TCFVendor> getVendors() {
        if (this.vendors.isEmpty()) {
            setVendors();
        }
        return CollectionsKt.toList(this.vendors);
    }

    /* JADX WARN: Type inference failed for: r2v38, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v50, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v58, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v62, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v6, types: [T, java.util.List] */
    private final void setVendors() {
        GVL gvl_;
        Map<String, Vendor> vendors;
        ArrayList arrayList;
        String str;
        DataCategory dataCategory;
        String str2;
        Purpose purpose;
        String str3;
        Feature feature;
        String str4;
        Purpose purpose2;
        String str5;
        Feature feature2;
        TCF2Settings tCF2Settings;
        String str6;
        Purpose purpose3;
        String str7;
        Purpose purpose4;
        TCModel tCModel = this.tcModel;
        TCF2Settings tcfSettings = getTcfSettings();
        Intrinsics.checkNotNull(tcfSettings);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (tCModel != null && (gvl_ = tCModel.getGvl_()) != null && (vendors = gvl_.getVendors()) != null) {
            for (Map.Entry<String, Vendor> entry : vendors.entrySet()) {
                String key = entry.getKey();
                Vendor value = entry.getValue();
                List<Integer> legIntPurposes = value.getLegIntPurposes();
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(legIntPurposes, 10));
                Iterator<T> it = legIntPurposes.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    Map<String, Purpose> purposes = gvl_.getPurposes();
                    if (purposes == null || (purpose4 = purposes.get(String.valueOf(intValue))) == null || (str7 = purpose4.getName()) == null) {
                        str7 = "";
                    }
                    arrayList4.add(new IdAndName(intValue, str7));
                }
                ArrayList arrayList5 = arrayList4;
                List<Integer> purposes2 = value.getPurposes();
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(purposes2, 10));
                Iterator<T> it2 = purposes2.iterator();
                while (it2.hasNext()) {
                    int intValue2 = ((Number) it2.next()).intValue();
                    Map<String, Purpose> purposes3 = gvl_.getPurposes();
                    if (purposes3 == null || (purpose3 = purposes3.get(String.valueOf(intValue2))) == null || (str6 = purpose3.getName()) == null) {
                        str6 = "";
                    }
                    arrayList6.add(new IdAndName(intValue2, str6));
                }
                ArrayList arrayList7 = arrayList6;
                if (tcfSettings.getPurposeOneTreatment()) {
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj : arrayList7) {
                        if (((IdAndName) obj).getId() != 1) {
                            arrayList8.add(obj);
                        }
                    }
                    arrayList7 = CollectionsKt.toMutableList((Collection) arrayList8);
                }
                List<TCFVendorRestriction> vendorRestrictions = getVendorRestrictions(Integer.parseInt(key));
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                ArrayList<IdAndName> arrayList9 = arrayList5;
                ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                for (IdAndName idAndName : arrayList9) {
                    arrayList10.add(new IdAndName(idAndName.getId(), idAndName.getName()));
                }
                objectRef.element = CollectionsKt.toMutableList((Collection) arrayList10);
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                Iterable iterable = arrayList7;
                ArrayList arrayList11 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    arrayList11.add((IdAndName) it3.next());
                }
                objectRef2.element = CollectionsKt.toMutableList((Collection) arrayList11);
                for (TCFVendorRestriction tCFVendorRestriction : vendorRestrictions) {
                    int i = WhenMappings.$EnumSwitchMapping$0[tCFVendorRestriction.getRestrictionType().ordinal()];
                    if (i == 1) {
                        tCF2Settings = tcfSettings;
                        Iterable iterable2 = (Iterable) objectRef2.element;
                        ArrayList arrayList12 = new ArrayList();
                        Iterator it4 = iterable2.iterator();
                        while (it4.hasNext()) {
                            Object next = it4.next();
                            IdAndName idAndName2 = (IdAndName) next;
                            Iterator it5 = it4;
                            if (idAndName2.getId() == tCFVendorRestriction.getPurposeId()) {
                                if (value.getFlexiblePurposes().contains(Integer.valueOf(idAndName2.getId()))) {
                                    ((List) objectRef.element).add(new IdAndName(idAndName2.getId(), idAndName2.getName()));
                                }
                            } else {
                                arrayList12.add(next);
                            }
                            it4 = it5;
                        }
                        objectRef2.element = CollectionsKt.toMutableList((Collection) arrayList12);
                    } else if (i == 2) {
                        tCF2Settings = tcfSettings;
                        Iterable iterable3 = (Iterable) objectRef.element;
                        ArrayList arrayList13 = new ArrayList();
                        Iterator it6 = iterable3.iterator();
                        while (it6.hasNext()) {
                            Object next2 = it6.next();
                            IdAndName idAndName3 = (IdAndName) next2;
                            Iterator it7 = it6;
                            if (idAndName3.getId() == tCFVendorRestriction.getPurposeId()) {
                                if (value.getFlexiblePurposes().contains(Integer.valueOf(idAndName3.getId()))) {
                                    ((List) objectRef2.element).add(idAndName3);
                                }
                            } else {
                                arrayList13.add(next2);
                            }
                            it6 = it7;
                        }
                        objectRef.element = CollectionsKt.toMutableList((Collection) arrayList13);
                    } else if (i != 3) {
                        tCF2Settings = tcfSettings;
                    } else {
                        Iterable iterable4 = (Iterable) objectRef2.element;
                        ArrayList arrayList14 = new ArrayList();
                        for (Object obj2 : iterable4) {
                            TCF2Settings tCF2Settings2 = tcfSettings;
                            if (((IdAndName) obj2).getId() != tCFVendorRestriction.getPurposeId()) {
                                arrayList14.add(obj2);
                            }
                            tcfSettings = tCF2Settings2;
                        }
                        tCF2Settings = tcfSettings;
                        objectRef2.element = CollectionsKt.toMutableList((Collection) arrayList14);
                        Iterable iterable5 = (Iterable) objectRef.element;
                        ArrayList arrayList15 = new ArrayList();
                        for (Object obj3 : iterable5) {
                            if (((IdAndName) obj3).getId() != tCFVendorRestriction.getPurposeId()) {
                                arrayList15.add(obj3);
                            }
                        }
                        objectRef.element = CollectionsKt.toMutableList((Collection) arrayList15);
                    }
                    tcfSettings = tCF2Settings;
                }
                TCF2Settings tCF2Settings3 = tcfSettings;
                List<Integer> features = value.getFeatures();
                ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(features, 10));
                Iterator<T> it8 = features.iterator();
                while (it8.hasNext()) {
                    int intValue3 = ((Number) it8.next()).intValue();
                    Map<String, Feature> features2 = gvl_.getFeatures();
                    if (features2 == null || (feature2 = features2.get(String.valueOf(intValue3))) == null || (str5 = feature2.getName()) == null) {
                        str5 = "";
                    }
                    arrayList16.add(new IdAndName(intValue3, str5));
                }
                ArrayList arrayList17 = arrayList16;
                List<Integer> flexiblePurposes = value.getFlexiblePurposes();
                ArrayList arrayList18 = new ArrayList(CollectionsKt.collectionSizeOrDefault(flexiblePurposes, 10));
                Iterator<T> it9 = flexiblePurposes.iterator();
                while (it9.hasNext()) {
                    int intValue4 = ((Number) it9.next()).intValue();
                    Map<String, Purpose> purposes4 = gvl_.getPurposes();
                    if (purposes4 == null || (purpose2 = purposes4.get(String.valueOf(intValue4))) == null || (str4 = purpose2.getName()) == null) {
                        str4 = "";
                    }
                    arrayList18.add(new IdAndName(intValue4, str4));
                }
                ArrayList arrayList19 = arrayList18;
                List<Integer> specialFeatures = value.getSpecialFeatures();
                ArrayList arrayList20 = new ArrayList();
                for (Object obj4 : specialFeatures) {
                    if (!tCF2Settings3.getDisabledSpecialFeatures().contains(Integer.valueOf(((Number) obj4).intValue()))) {
                        arrayList20.add(obj4);
                    }
                }
                ArrayList arrayList21 = arrayList20;
                ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList21, 10));
                Iterator it10 = arrayList21.iterator();
                while (it10.hasNext()) {
                    int intValue5 = ((Number) it10.next()).intValue();
                    Map<String, Feature> specialFeatures2 = gvl_.getSpecialFeatures();
                    if (specialFeatures2 == null || (feature = specialFeatures2.get(String.valueOf(intValue5))) == null || (str3 = feature.getName()) == null) {
                        str3 = "";
                    }
                    arrayList22.add(new IdAndName(intValue5, str3));
                }
                ArrayList arrayList23 = arrayList22;
                List<Integer> specialPurposes = value.getSpecialPurposes();
                ArrayList arrayList24 = new ArrayList(CollectionsKt.collectionSizeOrDefault(specialPurposes, 10));
                Iterator<T> it11 = specialPurposes.iterator();
                while (it11.hasNext()) {
                    int intValue6 = ((Number) it11.next()).intValue();
                    Map<String, Purpose> specialPurposes2 = gvl_.getSpecialPurposes();
                    if (specialPurposes2 == null || (purpose = specialPurposes2.get(String.valueOf(intValue6))) == null || (str2 = purpose.getName()) == null) {
                        str2 = "";
                    }
                    arrayList24.add(new IdAndName(intValue6, str2));
                }
                ArrayList arrayList25 = arrayList24;
                List<Integer> dataDeclaration = value.getDataDeclaration();
                if (dataDeclaration != null) {
                    List<Integer> list = dataDeclaration;
                    ArrayList arrayList26 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it12 = list.iterator();
                    while (it12.hasNext()) {
                        int intValue7 = ((Number) it12.next()).intValue();
                        Map<String, DataCategory> dataCategories = gvl_.getDataCategories();
                        if (dataCategories == null || (dataCategory = dataCategories.get(String.valueOf(intValue7))) == null || (str = dataCategory.getName()) == null) {
                            str = "";
                        }
                        arrayList26.add(new IdAndName(intValue7, str));
                    }
                    arrayList = arrayList26;
                } else {
                    arrayList = null;
                }
                GvlDataRetention dataRetention = value.getDataRetention();
                if (hasImplicitLegitimateInterest(value.getPurposes(), value.getLegIntPurposes(), value.getSpecialPurposes())) {
                    arrayList3.add(Integer.valueOf(value.getId()));
                }
                boolean has = tCModel.getVendorConsents().has(value.getId());
                Double cookieMaxAgeSeconds = value.getCookieMaxAgeSeconds();
                String deviceStorageDisclosureUrl = value.getDeviceStorageDisclosureUrl();
                int id = value.getId();
                Boolean checklegitimateInterestConsent = checklegitimateInterestConsent(value, tCModel);
                List list2 = (List) objectRef.element;
                String name = value.getName();
                String policyUrl = value.getPolicyUrl();
                List list3 = (List) objectRef2.element;
                boolean z = !((Collection) objectRef2.element).isEmpty() && tCF2Settings3.getUseGranularChoice();
                boolean z2 = (((Collection) objectRef.element).isEmpty() || !tCF2Settings3.getUseGranularChoice() || tCF2Settings3.getHideLegitimateInterestToggles()) ? false : true;
                boolean usesNonCookieAccess = value.getUsesNonCookieAccess();
                boolean usesCookies = value.getUsesCookies();
                Boolean cookieRefresh = value.getCookieRefresh();
                boolean contains = tCF2Settings3.getVendorIdsOutsideEUList().contains(Integer.valueOf(value.getId()));
                DataRetention dataRetention2 = new DataRetention(dataRetention != null ? dataRetention.getStdRetention() : null, RetentionPeriod.INSTANCE.parseFromGvlMap(dataRetention != null ? dataRetention.getPurposes() : null), RetentionPeriod.INSTANCE.parseFromGvlMap(dataRetention != null ? dataRetention.getSpecialPurposes() : null));
                if (arrayList == null) {
                    arrayList = CollectionsKt.emptyList();
                }
                List list4 = arrayList;
                List<VendorUrl> urls = value.getUrls();
                if (urls == null) {
                    urls = CollectionsKt.emptyList();
                }
                arrayList2.add(new TCFVendor(Boolean.valueOf(has), arrayList17, arrayList19, id, checklegitimateInterestConsent, list2, name, policyUrl, list3, vendorRestrictions, arrayList23, arrayList25, z, z2, cookieMaxAgeSeconds, usesNonCookieAccess, deviceStorageDisclosureUrl, usesCookies, cookieRefresh, Boolean.valueOf(contains), dataRetention2, list4, urls));
                tcfSettings = tCF2Settings3;
            }
            Unit unit = Unit.INSTANCE;
        }
        List<TCFVendor> list5 = this.vendors;
        list5.clear();
        list5.addAll(ArrayExtensionsKt.sortedAlphaBy$default(arrayList2, false, new Function1<TCFVendor, String>() { // from class: com.usercentrics.sdk.services.tcf.TCF$setVendors$2$1
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(TCFVendor it13) {
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.getName();
            }
        }, 1, null));
        List<Integer> list6 = this.vendorsIdsWithImplicitLegitimateInterest;
        list6.clear();
        list6.addAll(arrayList3);
    }

    private final Boolean checklegitimateInterestConsent(Vendor vendor, TCModel globalTCModel) {
        if (this.disclosedVendorsMap.get(Integer.valueOf(vendor.getId())) != null) {
            return Boolean.valueOf(globalTCModel.getVendorLegitimateInterests().has(vendor.getId()) || hasImplicitLegitimateInterest(vendor.getPurposes(), vendor.getLegIntPurposes(), vendor.getSpecialPurposes()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> boolean hasImplicitLegitimateInterest(List<? extends T> purposes, List<? extends T> legIntPurposes, List<? extends T> specialPurposes) {
        if (purposes.isEmpty() && legIntPurposes.isEmpty() && !specialPurposes.isEmpty()) {
            return true;
        }
        return (purposes.isEmpty() || !legIntPurposes.isEmpty() || specialPurposes.isEmpty()) ? false : true;
    }

    private final List<TCFStack> getStacks() {
        TCModel tCModel = this.tcModel;
        GVL gvl_ = tCModel != null ? tCModel.getGvl_() : null;
        TCF2Settings tcfSettings = getTcfSettings();
        Intrinsics.checkNotNull(tcfSettings);
        List<Integer> disabledSpecialFeatures = tcfSettings.getDisabledSpecialFeatures();
        ArrayList arrayList = new ArrayList();
        if (gvl_ != null) {
            TCF2Settings tcfSettings2 = getTcfSettings();
            Intrinsics.checkNotNull(tcfSettings2);
            Iterator<T> it = tcfSettings2.getSelectedStacks().iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                Map<String, Stack> stacks = gvl_.getStacks();
                Stack stack = stacks != null ? stacks.get(String.valueOf(intValue)) : null;
                if (stack != null) {
                    String description = stack.getDescription();
                    int id = stack.getId();
                    String name = stack.getName();
                    List<Integer> purposes = stack.getPurposes();
                    List<Integer> specialFeatures = stack.getSpecialFeatures();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : specialFeatures) {
                        if (!disabledSpecialFeatures.contains(Integer.valueOf(((Number) obj).intValue()))) {
                            arrayList2.add(obj);
                        }
                    }
                    arrayList.add(new TCFStack(description, id, name, purposes, arrayList2));
                }
            }
        }
        return arrayList;
    }

    private final List<Integer> getRawSelectedVendorIds() {
        TCF2Settings tcfSettings = getTcfSettings();
        Intrinsics.checkNotNull(tcfSettings);
        return tcfSettings.getSelectedVendorIds();
    }

    private final List<TCFVendor> getSelectedTCFVendors() {
        TCF2Settings tcfSettings = getTcfSettings();
        Intrinsics.checkNotNull(tcfSettings);
        Set set = CollectionsKt.toSet(tcfSettings.getSelectedVendorIds());
        List<TCFVendor> vendors = getVendors();
        ArrayList arrayList = new ArrayList();
        for (Object obj : vendors) {
            if (set.contains(Integer.valueOf(((TCFVendor) obj).getId()))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void setDisclosedVendors(TCF2Settings tcf2Settings, Map<Integer, StorageVendor> disclosedVendors) {
        Map<Integer, StorageVendor> map = this.disclosedVendorsMap;
        map.clear();
        map.putAll(disclosedVendors);
        if (tcf2Settings.isServiceSpecific()) {
            return;
        }
        TCModel tCModel = this.tcModel;
        Intrinsics.checkNotNull(tCModel);
        tCModel.getVendorsDisclosed().set(CollectionsKt.toList(disclosedVendors.keySet()));
    }

    @Override // com.usercentrics.sdk.services.tcf.TCFUseCase
    public int getStoredTcStringPolicyVersion() {
        TCModel tCModel = this.tcModel;
        Intrinsics.checkNotNull(tCModel);
        return tCModel.getPolicyVersion();
    }

    @Override // com.usercentrics.sdk.services.tcf.TCFUseCase
    public boolean getHideNonIabOnFirstLayer() {
        TCF2Settings tcfSettings = getTcfSettings();
        if (tcfSettings != null) {
            return tcfSettings.getHideNonIabOnFirstLayer();
        }
        return false;
    }

    @Override // com.usercentrics.sdk.services.tcf.TCFUseCase
    public boolean getResurfacePurposeChanged() {
        StorageVendor storageVendor;
        boolean contains;
        TCF2Settings tcfSettings = getTcfSettings();
        Intrinsics.checkNotNull(tcfSettings);
        if (tcfSettings.getResurfacePurposeChanged()) {
            List<TCFVendor> selectedTCFVendors = getSelectedTCFVendors();
            if (!(selectedTCFVendors instanceof Collection) || !selectedTCFVendors.isEmpty()) {
                for (TCFVendor tCFVendor : selectedTCFVendors) {
                    StorageVendor storageVendor2 = this.disclosedVendorsMap.get(Integer.valueOf(tCFVendor.getId()));
                    if (storageVendor2 == null) {
                        contains = false;
                    } else {
                        storageVendor = TCFKt.toStorageVendor(tCFVendor);
                        contains = storageVendor2.contains(storageVendor);
                    }
                    if (!contains) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.usercentrics.sdk.services.tcf.TCFUseCase
    public boolean getResurfacePeriodEnded() {
        TCF2Settings tcfSettings = getTcfSettings();
        Intrinsics.checkNotNull(tcfSettings);
        if (tcfSettings.getResurfacePeriodEnded()) {
            this.storageInstance.lastInteractionTimestamp();
        }
        TCF2Settings tcfSettings2 = getTcfSettings();
        Intrinsics.checkNotNull(tcfSettings2);
        return tcfSettings2.getResurfacePeriodEnded();
    }

    @Override // com.usercentrics.sdk.services.tcf.TCFUseCase
    public boolean getResurfaceVendorAdded() {
        TCF2Settings tcfSettings = getTcfSettings();
        Intrinsics.checkNotNull(tcfSettings);
        if (!tcfSettings.getResurfaceVendorAdded()) {
            return false;
        }
        List<TCFVendor> selectedTCFVendors = getSelectedTCFVendors();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selectedTCFVendors, 10));
        Iterator<T> it = selectedTCFVendors.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((TCFVendor) it.next()).getId()));
        }
        ArrayList arrayList2 = arrayList;
        if ((arrayList2 instanceof Collection) && arrayList2.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            if (!this.disclosedVendorsMap.keySet().contains(Integer.valueOf(((Number) it2.next()).intValue()))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.usercentrics.sdk.services.tcf.TCFUseCase
    public boolean getResurfaceATPChanged() {
        List<Integer> emptyList;
        List<Integer> selectedATPIds;
        TCF2Settings tcfSettings = getTcfSettings();
        if (Intrinsics.areEqual((Object) (tcfSettings != null ? Boolean.valueOf(tcfSettings.getResurfaceATPListChanged()) : null), (Object) false)) {
            return false;
        }
        AdditionalConsentModeService additionalConsentModeService = this.additionalConsentModeService;
        TCF2Settings tcfSettings2 = getTcfSettings();
        if (tcfSettings2 == null || (selectedATPIds = tcfSettings2.getSelectedATPIds()) == null || (emptyList = CollectionsKt.sorted(selectedATPIds)) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        return additionalConsentModeService.didATPSChange(emptyList);
    }

    private final List<Integer> getPurposeIdsFromVendorsAndStacks() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (TCFVendor tCFVendor : getVendors()) {
            List<IdAndName> purposes = tCFVendor.getPurposes();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(purposes, 10));
            Iterator<T> it = purposes.iterator();
            while (it.hasNext()) {
                arrayList3.add(Integer.valueOf(((IdAndName) it.next()).getId()));
            }
            arrayList.addAll(arrayList3);
            List<IdAndName> legitimateInterestPurposes = tCFVendor.getLegitimateInterestPurposes();
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(legitimateInterestPurposes, 10));
            Iterator<T> it2 = legitimateInterestPurposes.iterator();
            while (it2.hasNext()) {
                arrayList4.add(Integer.valueOf(((IdAndName) it2.next()).getId()));
            }
            arrayList.addAll(arrayList4);
        }
        Iterator<T> it3 = getStacks().iterator();
        while (it3.hasNext()) {
            arrayList2.addAll(((TCFStack) it3.next()).getPurposeIds());
        }
        ArrayList arrayList5 = new ArrayList();
        arrayList5.addAll(arrayList);
        arrayList5.addAll(arrayList2);
        List<Integer> notAllowedPurposes = this.changedPurposes.getNotAllowedPurposes();
        List distinct = CollectionsKt.distinct(arrayList5);
        ArrayList arrayList6 = new ArrayList();
        for (Object obj : distinct) {
            if (!notAllowedPurposes.contains(Integer.valueOf(((Number) obj).intValue()))) {
                arrayList6.add(obj);
            }
        }
        ArrayList arrayList7 = arrayList6;
        TCF2Settings tcfSettings = getTcfSettings();
        Intrinsics.checkNotNull(tcfSettings);
        if (tcfSettings.getPurposeOneTreatment()) {
            return CollectionsKt.drop(arrayList7, 1);
        }
        return CollectionsKt.toList(arrayList7);
    }

    private final List<Integer> getSpecialFeatureIdsFromVendorsAndStacks() {
        TCF2Settings tcfSettings = getTcfSettings();
        Intrinsics.checkNotNull(tcfSettings);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = getVendors().iterator();
        while (it.hasNext()) {
            List<IdAndName> specialFeatures = ((TCFVendor) it.next()).getSpecialFeatures();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : specialFeatures) {
                if (!tcfSettings.getDisabledSpecialFeatures().contains(Integer.valueOf(((IdAndName) obj).getId()))) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList5.add(Integer.valueOf(((IdAndName) it2.next()).getId()));
            }
            arrayList.addAll(arrayList5);
        }
        Iterator<T> it3 = getStacks().iterator();
        while (it3.hasNext()) {
            List<Integer> specialFeatureIds = ((TCFStack) it3.next()).getSpecialFeatureIds();
            ArrayList arrayList6 = new ArrayList();
            for (Object obj2 : specialFeatureIds) {
                if (!tcfSettings.getDisabledSpecialFeatures().contains(Integer.valueOf(((Number) obj2).intValue()))) {
                    arrayList6.add(obj2);
                }
            }
            arrayList2.addAll(arrayList6);
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList);
        arrayList7.addAll(arrayList2);
        return CollectionsKt.distinct(arrayList7);
    }

    @Override // com.usercentrics.sdk.services.tcf.TCFUseCase
    public boolean getGdprAppliesOnTCF() {
        if (isRulesetMarkedNoShow()) {
            return false;
        }
        TCF2Settings tcfSettings = getTcfSettings();
        return !(tcfSettings != null ? tcfSettings.getGdprApplies() : false) || this.locationService.getLocation().isInEU();
    }

    private final boolean isRulesetMarkedNoShow() {
        return this.settingsOrchestrator.getNoShow();
    }

    @Override // com.usercentrics.sdk.services.tcf.TCFUseCase
    public void updateIABTCFKeys(String tcString) {
        Intrinsics.checkNotNullParameter(tcString, "tcString");
        AssertionsKt.assertNotUIThread();
        TCModel tCModel = this.tcModel;
        if (tCModel == null) {
            return;
        }
        this.storageInstance.storeValuesDefaultStorage(new TCFKeysEncoder(tCModel, tcString, getGdprAppliesOnTCF() ? 1 : 0).encode().saveKeys().getValues());
    }

    public final String getTCStringFromModel() {
        TCString.Companion companion = TCString.INSTANCE;
        TCModel tCModel = this.tcModel;
        Intrinsics.checkNotNull(tCModel);
        return companion.encode$usercentrics_release(tCModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePolicyVersion() {
        TCModel tCModel = this.tcModel;
        Intrinsics.checkNotNull(tCModel);
        if (tCModel.getPolicyVersion() != 5) {
            TCModel tCModel2 = this.tcModel;
            Intrinsics.checkNotNull(tCModel2);
            tCModel2.setPolicyVersion(new StringOrNumber.Int(5));
        }
    }

    private final void updateTCString(TCFDecisionUILayer fromLayer) {
        TCModel tCModel = this.tcModel;
        if (tCModel != null) {
            tCModel.setConsentScreen(new StringOrNumber.Int(fromLayer.getValue()));
        }
        TCModel tCModel2 = this.tcModel;
        if (tCModel2 != null) {
            tCModel2.setCreatedAndUpdatedFields();
        }
        resetTCFData();
        this.dispatcher.dispatch(new TCF$updateTCString$1(this, null)).onSuccess(new Function1<Unit, Unit>() { // from class: com.usercentrics.sdk.services.tcf.TCF$updateTCString$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
                invoke2(unit);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Unit it) {
                ConsentsService consentsService;
                Semaphore semaphore;
                Intrinsics.checkNotNullParameter(it, "it");
                consentsService = TCF.this.consentsService;
                consentsService.saveConsentsState(UsercentricsConsentAction.TCF_STRING_CHANGE);
                semaphore = TCF.this.semaphore;
                semaphore.release();
            }
        }).onFailure(new Function1<Throwable, Unit>() { // from class: com.usercentrics.sdk.services.tcf.TCF$updateTCString$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it) {
                UsercentricsLogger usercentricsLogger;
                Semaphore semaphore;
                Intrinsics.checkNotNullParameter(it, "it");
                usercentricsLogger = TCF.this.logger;
                usercentricsLogger.error("Failed while trying to updateTCString method", it);
                semaphore = TCF.this.semaphore;
                semaphore.release();
            }
        });
    }

    @Override // com.usercentrics.sdk.services.tcf.TCFUseCase
    public void setCmpId(int id) {
        this.dispatcher.dispatch(new TCF$setCmpId$1(this, id, null)).onFailure(new Function1<Throwable, Unit>() { // from class: com.usercentrics.sdk.services.tcf.TCF$setCmpId$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it) {
                UsercentricsLogger usercentricsLogger;
                Intrinsics.checkNotNullParameter(it, "it");
                usercentricsLogger = TCF.this.logger;
                usercentricsLogger.error("Failed while trying to setCmpId method", it);
            }
        });
    }

    @Override // com.usercentrics.sdk.services.tcf.TCFUseCase
    public void updateChoices(TCFUserDecisions decisions, TCFDecisionUILayer fromLayer) {
        Object m11180constructorimpl;
        Map<Integer, StorageVendor> storageVendorMap;
        Intrinsics.checkNotNullParameter(decisions, "decisions");
        Intrinsics.checkNotNullParameter(fromLayer, "fromLayer");
        try {
            Result.Companion companion = Result.INSTANCE;
            TCF tcf = this;
            TCF2Settings tcfSettings = getTcfSettings();
            Intrinsics.checkNotNull(tcfSettings);
            TCFUserDecisions createTCFUserDecisionsMergingWithCurrentData = createTCFUserDecisionsMergingWithCurrentData(decisions);
            if (createTCFUserDecisionsMergingWithCurrentData.getPurposes() != null) {
                savePurposes(createTCFUserDecisionsMergingWithCurrentData.getPurposes());
            }
            if (createTCFUserDecisionsMergingWithCurrentData.getSpecialFeatures() != null) {
                saveSpecialFeatures(createTCFUserDecisionsMergingWithCurrentData.getSpecialFeatures());
            }
            if (createTCFUserDecisionsMergingWithCurrentData.getVendors() != null) {
                saveVendors(createTCFUserDecisionsMergingWithCurrentData.getVendors());
            }
            TCF2Settings tcfSettings2 = getTcfSettings();
            Intrinsics.checkNotNull(tcfSettings2);
            storageVendorMap = TCFKt.toStorageVendorMap(getVendors());
            setDisclosedVendors(tcfSettings2, storageVendorMap);
            if (tcfSettings.getHideLegitimateInterestToggles()) {
                TCModel tCModel = this.tcModel;
                Intrinsics.checkNotNull(tCModel);
                tCModel.unsetAllVendorLegitimateInterests();
                TCModel tCModel2 = this.tcModel;
                Intrinsics.checkNotNull(tCModel2);
                tCModel2.unsetAllPurposeLegitimateInterests();
            }
            if (createTCFUserDecisionsMergingWithCurrentData.getPurposes() != null || createTCFUserDecisionsMergingWithCurrentData.getSpecialFeatures() != null || createTCFUserDecisionsMergingWithCurrentData.getVendors() != null) {
                updateTCString(fromLayer);
            }
            m11180constructorimpl = Result.m11180constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
        if (m11183exceptionOrNullimpl != null) {
            this.logger.error("Something went wrong with TCF updateChoices method: " + m11183exceptionOrNullimpl, m11183exceptionOrNullimpl);
        }
    }

    private final TCFUserDecisions createTCFUserDecisionsMergingWithCurrentData(TCFUserDecisions decisions) {
        List<TCFUserDecisionOnPurpose> purposes = decisions.getPurposes();
        if (purposes == null) {
            purposes = CollectionsKt.emptyList();
        }
        List<TCFUserDecisionOnPurpose> list = purposes;
        List<TCFUserDecisionOnVendor> vendors = decisions.getVendors();
        if (vendors == null) {
            vendors = CollectionsKt.emptyList();
        }
        List<TCFUserDecisionOnVendor> list2 = vendors;
        List<IdAndConsent> mapToIdAndConsent$default = mapToIdAndConsent$default(this, this.purposes, new Function1<TCFPurpose, Integer>() { // from class: com.usercentrics.sdk.services.tcf.TCF$createTCFUserDecisionsMergingWithCurrentData$purposesData$1
            @Override // kotlin.jvm.functions.Function1
            public final Integer invoke(TCFPurpose it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.getId());
            }
        }, new Function1<TCFPurpose, Boolean>() { // from class: com.usercentrics.sdk.services.tcf.TCF$createTCFUserDecisionsMergingWithCurrentData$purposesData$2
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(TCFPurpose it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getShowConsentToggle());
            }
        }, new Function1<TCFPurpose, Boolean>() { // from class: com.usercentrics.sdk.services.tcf.TCF$createTCFUserDecisionsMergingWithCurrentData$purposesData$3
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(TCFPurpose it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getShowLegitimateInterestToggle());
            }
        }, new Function1<TCFPurpose, Boolean>() { // from class: com.usercentrics.sdk.services.tcf.TCF$createTCFUserDecisionsMergingWithCurrentData$purposesData$4
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(TCFPurpose it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getConsent();
            }
        }, new Function1<TCFPurpose, Boolean>() { // from class: com.usercentrics.sdk.services.tcf.TCF$createTCFUserDecisionsMergingWithCurrentData$purposesData$5
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(TCFPurpose it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getLegitimateInterestConsent();
            }
        }, null, 64, null);
        List<IdAndConsent> mapToIdAndConsent = mapToIdAndConsent(this.vendors, new Function1<TCFVendor, Integer>() { // from class: com.usercentrics.sdk.services.tcf.TCF$createTCFUserDecisionsMergingWithCurrentData$vendorsData$1
            @Override // kotlin.jvm.functions.Function1
            public final Integer invoke(TCFVendor it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.getId());
            }
        }, new Function1<TCFVendor, Boolean>() { // from class: com.usercentrics.sdk.services.tcf.TCF$createTCFUserDecisionsMergingWithCurrentData$vendorsData$2
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(TCFVendor it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getShowConsentToggle());
            }
        }, new Function1<TCFVendor, Boolean>() { // from class: com.usercentrics.sdk.services.tcf.TCF$createTCFUserDecisionsMergingWithCurrentData$vendorsData$3
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(TCFVendor it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getShowLegitimateInterestToggle());
            }
        }, new Function1<TCFVendor, Boolean>() { // from class: com.usercentrics.sdk.services.tcf.TCF$createTCFUserDecisionsMergingWithCurrentData$vendorsData$4
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(TCFVendor it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getConsent();
            }
        }, new Function1<TCFVendor, Boolean>() { // from class: com.usercentrics.sdk.services.tcf.TCF$createTCFUserDecisionsMergingWithCurrentData$vendorsData$5
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(TCFVendor it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getLegitimateInterestConsent();
            }
        }, new Function1<TCFVendor, Boolean>() { // from class: com.usercentrics.sdk.services.tcf.TCF$createTCFUserDecisionsMergingWithCurrentData$vendorsData$6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(TCFVendor vendor) {
                boolean hasImplicitLegitimateInterest;
                Intrinsics.checkNotNullParameter(vendor, "vendor");
                hasImplicitLegitimateInterest = TCF.this.hasImplicitLegitimateInterest(vendor.getPurposes(), vendor.getLegitimateInterestPurposes(), vendor.getSpecialPurposes());
                return Boolean.valueOf(hasImplicitLegitimateInterest);
            }
        });
        List<TCFConsentDecision> mergeConsentsWithUserDecisions = mergeConsentsWithUserDecisions(mapToIdAndConsent$default, list);
        List<TCFConsentDecision> mergeConsentsWithUserDecisions2 = mergeConsentsWithUserDecisions(mapToIdAndConsent, list2);
        List<TCFConsentDecision> list3 = mergeConsentsWithUserDecisions;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        for (TCFConsentDecision tCFConsentDecision : list3) {
            arrayList.add(new TCFUserDecisionOnPurpose(tCFConsentDecision.getId(), tCFConsentDecision.getConsent(), tCFConsentDecision.getLegitimateInterestConsent()));
        }
        ArrayList arrayList2 = arrayList;
        List<TCFConsentDecision> list4 = mergeConsentsWithUserDecisions2;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        for (TCFConsentDecision tCFConsentDecision2 : list4) {
            arrayList3.add(new TCFUserDecisionOnVendor(tCFConsentDecision2.getId(), tCFConsentDecision2.getConsent(), tCFConsentDecision2.getLegitimateInterestConsent()));
        }
        return new TCFUserDecisions(arrayList2, decisions.getSpecialFeatures(), arrayList3, null, 8, null);
    }

    static /* synthetic */ List mapToIdAndConsent$default(TCF tcf, List list, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, int i, Object obj) {
        return tcf.mapToIdAndConsent(list, function1, function12, function13, function14, function15, (i & 64) != 0 ? new Function1<T, Boolean>() { // from class: com.usercentrics.sdk.services.tcf.TCF$mapToIdAndConsent$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(T t) {
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj2) {
                return invoke((TCF$mapToIdAndConsent$1<T>) obj2);
            }
        } : function16);
    }

    private final <T> List<IdAndConsent> mapToIdAndConsent(List<? extends T> items, Function1<? super T, Integer> getId, Function1<? super T, Boolean> showConsentToggle, Function1<? super T, Boolean> showLegitimateInterestToggle, Function1<? super T, Boolean> getConsent, Function1<? super T, Boolean> getLegitimateInterestConsent, Function1<? super T, Boolean> implicitLegitimateInterest) {
        Boolean bool;
        List<? extends T> list = items;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (T t : list) {
            Boolean bool2 = null;
            if (implicitLegitimateInterest.invoke(t).booleanValue()) {
                bool = true;
            } else if (showLegitimateInterestToggle.invoke(t).booleanValue()) {
                Boolean invoke = getLegitimateInterestConsent.invoke(t);
                bool = Boolean.valueOf(invoke != null ? invoke.booleanValue() : true);
            } else {
                bool = null;
            }
            int intValue = getId.invoke(t).intValue();
            if (showConsentToggle.invoke(t).booleanValue()) {
                Boolean invoke2 = getConsent.invoke(t);
                bool2 = Boolean.valueOf(invoke2 != null ? invoke2.booleanValue() : false);
            }
            arrayList.add(new IdAndConsent(intValue, bool2, bool));
        }
        return arrayList;
    }

    private final List<TCFConsentDecision> mergeConsentsWithUserDecisions(List<IdAndConsent> data, List<? extends TCFConsentWithLegitimateInterestDecision> decisions) {
        Object obj;
        Boolean consent;
        Boolean legitimateInterestConsent;
        ArrayList arrayList = new ArrayList();
        for (IdAndConsent idAndConsent : data) {
            Iterator<T> it = decisions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((TCFConsentWithLegitimateInterestDecision) obj).getId() == idAndConsent.getId()) {
                    break;
                }
            }
            TCFConsentWithLegitimateInterestDecision tCFConsentWithLegitimateInterestDecision = (TCFConsentWithLegitimateInterestDecision) obj;
            int id = idAndConsent.getId();
            if (tCFConsentWithLegitimateInterestDecision == null || (consent = tCFConsentWithLegitimateInterestDecision.getConsent()) == null) {
                consent = idAndConsent.getConsent();
            }
            if (tCFConsentWithLegitimateInterestDecision == null || (legitimateInterestConsent = tCFConsentWithLegitimateInterestDecision.getLegitimateInterestConsent()) == null) {
                legitimateInterestConsent = idAndConsent.getLegitimateInterestConsent();
            }
            arrayList.add(new TCFConsentDecision(consent, id, legitimateInterestConsent));
        }
        return arrayList;
    }

    private final List<TCFFeature> getFeaturesFromVendors() {
        GVL gvl_;
        Map<String, Feature> features;
        List<Integer> featureIdsFromVendors = getFeatureIdsFromVendors();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = featureIdsFromVendors.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            TCModel tCModel = this.tcModel;
            Feature feature = (tCModel == null || (gvl_ = tCModel.getGvl_()) == null || (features = gvl_.getFeatures()) == null) ? null : features.get(String.valueOf(intValue));
            if (feature != null) {
                arrayList.add(new TCFFeature(feature.getDescription(), feature.getIllustrations(), feature.getId(), feature.getName()));
            }
        }
        return CollectionsKt.toList(arrayList);
    }

    private final List<Integer> getFeatureIdsFromVendors() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = getVendors().iterator();
        while (it.hasNext()) {
            List<IdAndName> features = ((TCFVendor) it.next()).getFeatures();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(features, 10));
            Iterator<T> it2 = features.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((IdAndName) it2.next()).getId()));
            }
            arrayList.addAll(arrayList2);
        }
        return CollectionsKt.distinct(arrayList);
    }

    private final List<TCFPurpose> getPurposesFromVendors() {
        if (this.purposes.isEmpty()) {
            setPurposes();
        }
        return CollectionsKt.toList(this.purposes);
    }

    private final void setPurposes() {
        Object obj;
        TCModel tCModel;
        Vector purposeLegitimateInterests;
        Vector purposeConsents;
        GVL gvl_;
        Map<String, Purpose> purposes;
        List<Integer> purposeIdsFromVendorsAndStacks = getPurposeIdsFromVendorsAndStacks();
        List<TCFStack> stacks = getStacks();
        List<TCFVendor> vendors = getVendors();
        TCF2Settings tcfSettings = getTcfSettings();
        Intrinsics.checkNotNull(tcfSettings);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        List<TCFVendor> list = vendors;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<IdAndName> legitimateInterestPurposes = ((TCFVendor) it.next()).getLegitimateInterestPurposes();
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(legitimateInterestPurposes, 10));
            Iterator<T> it2 = legitimateInterestPurposes.iterator();
            while (it2.hasNext()) {
                arrayList5.add(Integer.valueOf(((IdAndName) it2.next()).getId()));
            }
            arrayList4.add(arrayList5);
        }
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList2.addAll((List) it3.next());
        }
        List mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.distinct(arrayList2));
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it4 = list.iterator();
        while (it4.hasNext()) {
            List<IdAndName> purposes2 = ((TCFVendor) it4.next()).getPurposes();
            ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(purposes2, 10));
            Iterator<T> it5 = purposes2.iterator();
            while (it5.hasNext()) {
                arrayList7.add(Integer.valueOf(((IdAndName) it5.next()).getId()));
            }
            arrayList6.add(arrayList7);
        }
        Iterator it6 = arrayList6.iterator();
        while (it6.hasNext()) {
            arrayList.addAll((List) it6.next());
        }
        List mutableList2 = CollectionsKt.toMutableList((Collection) CollectionsKt.distinct(arrayList));
        Iterator<T> it7 = purposeIdsFromVendorsAndStacks.iterator();
        while (true) {
            if (it7.hasNext()) {
                int intValue = ((Number) it7.next()).intValue();
                TCModel tCModel2 = this.tcModel;
                Purpose purpose = (tCModel2 == null || (gvl_ = tCModel2.getGvl_()) == null || (purposes = gvl_.getPurposes()) == null) ? null : purposes.get(String.valueOf(intValue));
                Iterator<T> it8 = stacks.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it8.next();
                        if (((TCFStack) obj).getPurposeIds().contains(Integer.valueOf(intValue))) {
                            break;
                        }
                    }
                }
                TCFStack tCFStack = (TCFStack) obj;
                if (purpose != null) {
                    TCModel tCModel3 = this.tcModel;
                    arrayList3.add(new TCFPurpose(purpose.getDescription(), purpose.getIllustrations(), purpose.getId(), purpose.getName(), (tCModel3 == null || (purposeConsents = tCModel3.getPurposeConsents()) == null) ? null : Boolean.valueOf(purposeConsents.has(intValue)), tCFStack != null, (this.disclosedVendorsMap.isEmpty() || (tCModel = this.tcModel) == null || (purposeLegitimateInterests = tCModel.getPurposeLegitimateInterests()) == null) ? null : Boolean.valueOf(purposeLegitimateInterests.has(intValue)), mutableList2.contains(Integer.valueOf(intValue)) && tcfSettings.getUseGranularChoice(), purpose.getId() != 1 && mutableList.contains(Integer.valueOf(intValue)) && tcfSettings.getUseGranularChoice() && !tcfSettings.getHideLegitimateInterestToggles(), tCFStack != null ? Integer.valueOf(tCFStack.getId()) : null, Integer.valueOf(getNumberOfVendorsPerPurpose(vendors, intValue))));
                }
            } else {
                List<TCFPurpose> list2 = this.purposes;
                list2.clear();
                list2.addAll(ArrayExtensionsKt.sortedAlphaBy$default(CollectionsKt.toList(arrayList3), false, new Function1<TCFPurpose, String>() { // from class: com.usercentrics.sdk.services.tcf.TCF$setPurposes$6$1
                    @Override // kotlin.jvm.functions.Function1
                    public final String invoke(TCFPurpose it9) {
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return it9.getName();
                    }
                }, 1, null));
                return;
            }
        }
    }

    private final int getNumberOfVendorsPerPurpose(List<TCFVendor> vendors, int purposeId) {
        int i;
        int i2 = 0;
        for (TCFVendor tCFVendor : vendors) {
            List plus = CollectionsKt.plus((Collection) tCFVendor.getPurposes(), (Iterable) tCFVendor.getLegitimateInterestPurposes());
            if ((plus instanceof Collection) && plus.isEmpty()) {
                i = 0;
            } else {
                Iterator it = plus.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((IdAndName) it.next()).getId() == purposeId && (i = i + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            i2 += i;
        }
        return i2;
    }

    private final List<TCFSpecialFeature> getSpecialFeaturesFromVendorsAndStacks() {
        Object obj;
        Vector specialFeatureOptins;
        GVL gvl_;
        Map<String, Feature> specialFeatures;
        List<Integer> specialFeatureIdsFromVendorsAndStacks = getSpecialFeatureIdsFromVendorsAndStacks();
        List<TCFStack> stacks = getStacks();
        TCF2Settings tcfSettings = getTcfSettings();
        Intrinsics.checkNotNull(tcfSettings);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = specialFeatureIdsFromVendorsAndStacks.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            TCModel tCModel = this.tcModel;
            Feature feature = (tCModel == null || (gvl_ = tCModel.getGvl_()) == null || (specialFeatures = gvl_.getSpecialFeatures()) == null) ? null : specialFeatures.get(String.valueOf(intValue));
            Iterator<T> it2 = stacks.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((TCFStack) obj).getSpecialFeatureIds().contains(Integer.valueOf(intValue))) {
                    break;
                }
            }
            TCFStack tCFStack = (TCFStack) obj;
            if (feature != null) {
                TCModel tCModel2 = this.tcModel;
                Boolean valueOf = (tCModel2 == null || (specialFeatureOptins = tCModel2.getSpecialFeatureOptins()) == null) ? null : Boolean.valueOf(specialFeatureOptins.has(intValue));
                arrayList.add(new TCFSpecialFeature(feature.getDescription(), feature.getIllustrations(), feature.getId(), feature.getName(), valueOf, tCFStack != null, tCFStack != null ? Integer.valueOf(tCFStack.getId()) : null, tcfSettings.getUseGranularChoice()));
            }
        }
        return CollectionsKt.toList(arrayList);
    }

    private final List<TCFSpecialPurpose> getSpecialPurposesFromVendors() {
        GVL gvl_;
        Map<String, Purpose> specialPurposes;
        List<Integer> specialPurposeIdsFromVendors = getSpecialPurposeIdsFromVendors();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = specialPurposeIdsFromVendors.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            TCModel tCModel = this.tcModel;
            Purpose purpose = (tCModel == null || (gvl_ = tCModel.getGvl_()) == null || (specialPurposes = gvl_.getSpecialPurposes()) == null) ? null : specialPurposes.get(String.valueOf(intValue));
            if (purpose != null) {
                arrayList.add(new TCFSpecialPurpose(purpose.getDescription(), purpose.getIllustrations(), purpose.getId(), purpose.getName()));
            }
        }
        return CollectionsKt.toList(arrayList);
    }

    private final List<Integer> getSpecialPurposeIdsFromVendors() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = getVendors().iterator();
        while (it.hasNext()) {
            List<IdAndName> specialPurposes = ((TCFVendor) it.next()).getSpecialPurposes();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(specialPurposes, 10));
            Iterator<T> it2 = specialPurposes.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((IdAndName) it2.next()).getId()));
            }
            arrayList.addAll(arrayList2);
        }
        return CollectionsKt.distinct(arrayList);
    }

    private final void savePurposes(List<TCFUserDecisionOnPurpose> decisions) {
        Vector purposeConsents;
        Vector purposeLegitimateInterests;
        Vector purposeLegitimateInterests2;
        Vector purposeConsents2;
        for (TCFUserDecisionOnPurpose tCFUserDecisionOnPurpose : decisions) {
            if (Intrinsics.areEqual((Object) tCFUserDecisionOnPurpose.getConsent(), (Object) true)) {
                TCModel tCModel = this.tcModel;
                if (tCModel != null && (purposeConsents2 = tCModel.getPurposeConsents()) != null) {
                    purposeConsents2.set(tCFUserDecisionOnPurpose.getId());
                }
            } else {
                TCModel tCModel2 = this.tcModel;
                if (tCModel2 != null && (purposeConsents = tCModel2.getPurposeConsents()) != null) {
                    purposeConsents.unset(tCFUserDecisionOnPurpose.getId());
                }
            }
            if (Intrinsics.areEqual((Object) tCFUserDecisionOnPurpose.getLegitimateInterestConsent(), (Object) true)) {
                TCModel tCModel3 = this.tcModel;
                if (tCModel3 != null && (purposeLegitimateInterests = tCModel3.getPurposeLegitimateInterests()) != null) {
                    purposeLegitimateInterests.set(tCFUserDecisionOnPurpose.getId());
                }
            } else {
                TCModel tCModel4 = this.tcModel;
                if (tCModel4 != null && (purposeLegitimateInterests2 = tCModel4.getPurposeLegitimateInterests()) != null) {
                    purposeLegitimateInterests2.unset(tCFUserDecisionOnPurpose.getId());
                }
            }
        }
    }

    private final void saveSpecialFeatures(List<TCFUserDecisionOnSpecialFeature> decisions) {
        Vector specialFeatureOptins;
        Vector specialFeatureOptins2;
        for (TCFUserDecisionOnSpecialFeature tCFUserDecisionOnSpecialFeature : decisions) {
            if (Intrinsics.areEqual((Object) tCFUserDecisionOnSpecialFeature.getConsent(), (Object) true)) {
                TCModel tCModel = this.tcModel;
                if (tCModel != null && (specialFeatureOptins = tCModel.getSpecialFeatureOptins()) != null) {
                    specialFeatureOptins.set(tCFUserDecisionOnSpecialFeature.getId());
                }
            } else {
                TCModel tCModel2 = this.tcModel;
                if (tCModel2 != null && (specialFeatureOptins2 = tCModel2.getSpecialFeatureOptins()) != null) {
                    specialFeatureOptins2.unset(tCFUserDecisionOnSpecialFeature.getId());
                }
            }
        }
    }

    private final void saveVendors(List<TCFUserDecisionOnVendor> decisions) {
        TCModel tCModel = this.tcModel;
        Intrinsics.checkNotNull(tCModel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (TCFUserDecisionOnVendor tCFUserDecisionOnVendor : decisions) {
            if (Intrinsics.areEqual((Object) tCFUserDecisionOnVendor.getConsent(), (Object) true)) {
                arrayList.add(Integer.valueOf(tCFUserDecisionOnVendor.getId()));
            } else {
                arrayList2.add(Integer.valueOf(tCFUserDecisionOnVendor.getId()));
            }
            if (Intrinsics.areEqual((Object) tCFUserDecisionOnVendor.getLegitimateInterestConsent(), (Object) true)) {
                arrayList3.add(Integer.valueOf(tCFUserDecisionOnVendor.getId()));
            } else {
                arrayList4.add(Integer.valueOf(tCFUserDecisionOnVendor.getId()));
            }
        }
        tCModel.getVendorConsents().set(arrayList);
        tCModel.getVendorConsents().unset(arrayList2);
        tCModel.getVendorLegitimateInterests().set(arrayList3);
        tCModel.getVendorLegitimateInterests().unset(arrayList4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0059 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:10:0x0026, B:11:0x0053, B:13:0x0059, B:16:0x0062, B:20:0x003d, B:22:0x0041, B:23:0x0047), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:10:0x0026, B:11:0x0053, B:13:0x0059, B:16:0x0062, B:20:0x003d, B:22:0x0041, B:23:0x0047), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: resetGVLWithLanguage-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m10607resetGVLWithLanguagegIAlus(String str, Continuation<? super Result<Unit>> continuation) {
        TCF$resetGVLWithLanguage$1 tCF$resetGVLWithLanguage$1;
        int i;
        Object m10628changeLanguagegIAlus;
        Throwable m11183exceptionOrNullimpl;
        try {
            if (continuation instanceof TCF$resetGVLWithLanguage$1) {
                tCF$resetGVLWithLanguage$1 = (TCF$resetGVLWithLanguage$1) continuation;
                if ((tCF$resetGVLWithLanguage$1.label & Integer.MIN_VALUE) != 0) {
                    tCF$resetGVLWithLanguage$1.label -= Integer.MIN_VALUE;
                    Object obj = tCF$resetGVLWithLanguage$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = tCF$resetGVLWithLanguage$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        TCModel tCModel = this.tcModel;
                        GVL gvl_ = tCModel != null ? tCModel.getGvl_() : null;
                        Intrinsics.checkNotNull(gvl_);
                        tCF$resetGVLWithLanguage$1.label = 1;
                        m10628changeLanguagegIAlus = gvl_.m10628changeLanguagegIAlus(str, tCF$resetGVLWithLanguage$1);
                        if (m10628changeLanguagegIAlus == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        m10628changeLanguagegIAlus = ((Result) obj).getValue();
                    }
                    m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m10628changeLanguagegIAlus);
                    if (m11183exceptionOrNullimpl == null) {
                        throw m11183exceptionOrNullimpl;
                    }
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m11180constructorimpl(Unit.INSTANCE);
                }
            }
            if (i != 0) {
            }
            m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m10628changeLanguagegIAlus);
            if (m11183exceptionOrNullimpl == null) {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(new UsercentricsException(TCF_WARN_MESSAGES.RESET_GVL_FAILURE.getMessage() + ": " + th.getMessage(), th)));
        }
        tCF$resetGVLWithLanguage$1 = new TCF$resetGVLWithLanguage$1(this, continuation);
        Object obj2 = tCF$resetGVLWithLanguage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tCF$resetGVLWithLanguage$1.label;
    }

    @Override // com.usercentrics.sdk.services.tcf.TCFUseCase
    public void clearTCFConsentsData() {
        resetTCFData();
        this.disclosedVendorsMap.clear();
        TCModel tCModel = this.tcModel;
        if (tCModel != null) {
            tCModel.clearConsents();
        }
    }

    private final void resetTCFData() {
        this.vendors.clear();
        this.purposes.clear();
        this.tcfData = null;
        this.vendorsIdsWithImplicitLegitimateInterest.clear();
    }

    private final String resolveLanguage(String language) {
        return ConsentLanguages.INSTANCE.getLanguageOrSimilarDialect(language);
    }
}
