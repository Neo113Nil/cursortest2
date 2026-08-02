package com.usercentrics.sdk;

import com.getcapacitor.PluginMethod;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.usercentrics.ccpa.CCPAData;
import com.usercentrics.sdk.core.application.Application;
import com.usercentrics.sdk.core.json.JsonParserKt;
import com.usercentrics.sdk.core.settings.SettingsOrchestrator;
import com.usercentrics.sdk.errors.LanguageNotAvailableException;
import com.usercentrics.sdk.errors.UsercentricsError;
import com.usercentrics.sdk.errors.UsercentricsException;
import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.mediation.data.MediationResultPayload;
import com.usercentrics.sdk.mediation.data.TCFConsentPayload;
import com.usercentrics.sdk.models.ccpa.CCPAErrors;
import com.usercentrics.sdk.models.common.InitialView;
import com.usercentrics.sdk.models.common.UserSessionData;
import com.usercentrics.sdk.models.common.UserSessionDataCCPA;
import com.usercentrics.sdk.models.common.UserSessionDataConsent;
import com.usercentrics.sdk.models.common.UserSessionDataTCF;
import com.usercentrics.sdk.models.common.UsercentricsVariant;
import com.usercentrics.sdk.models.dataFacade.MergedServicesSettings;
import com.usercentrics.sdk.models.settings.LegacyConsent;
import com.usercentrics.sdk.models.settings.LegacyDataKt;
import com.usercentrics.sdk.models.settings.LegacyExtendedSettings;
import com.usercentrics.sdk.models.settings.LegacyService;
import com.usercentrics.sdk.models.settings.PredefinedUIVariant;
import com.usercentrics.sdk.models.settings.PredefinedUIViewSettings;
import com.usercentrics.sdk.models.settings.UsercentricsConsentAction;
import com.usercentrics.sdk.models.settings.UsercentricsConsentType;
import com.usercentrics.sdk.predefinedUI.PredefinedUIConsentManagerImpl;
import com.usercentrics.sdk.services.ccpa.ICcpa;
import com.usercentrics.sdk.services.deviceStorage.DeviceStorage;
import com.usercentrics.sdk.services.deviceStorage.models.StorageTCF;
import com.usercentrics.sdk.services.settings.ISettingsLegacy;
import com.usercentrics.sdk.services.tcf.TCFDecisionUILayer;
import com.usercentrics.sdk.services.tcf.TCFUseCase;
import com.usercentrics.sdk.services.tcf.interfaces.AdTechProviderDecision;
import com.usercentrics.sdk.services.tcf.interfaces.TCFData;
import com.usercentrics.sdk.services.tcf.interfaces.TCFUserDecisions;
import com.usercentrics.sdk.ui.PredefinedUIApplicationManager;
import com.usercentrics.sdk.ui.PredefinedUIFactoryHolder;
import com.usercentrics.sdk.ui.PredefinedUIHolder;
import com.usercentrics.sdk.v2.async.dispatcher.Dispatcher;
import com.usercentrics.sdk.v2.banner.service.BannerViewDataServiceImpl;
import com.usercentrics.sdk.v2.settings.data.NewSettingsData;
import com.usercentrics.sdk.v2.settings.data.UsercentricsService;
import com.usercentrics.sdk.v2.settings.data.UsercentricsSettings;
import com.usercentrics.sdk.v2.settings.data.VariantsSettings;
import com.usercentrics.sdk.v2.translation.data.LegalBasisLocalization;
import io.sentry.protocol.Device;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;

/* compiled from: UsercentricsSDKImpl.kt */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 |2\u00020\u0001:\u0001|B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J \u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J2\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\"2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u001b0$H\u0016J0\u0010&\u001a\u00020\u001b2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001b0$2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u001b0$H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J2\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\"2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u001b0$H\u0002J*\u0010.\u001a\u00020\u001b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u00100\u001a\u00020\b2\b\b\u0002\u00101\u001a\u00020\bH\u0002J+\u00102\u001a\b\u0012\u0004\u0012\u00020\u001b032\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u000103H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106J$\u00107\u001a\b\u0012\u0004\u0012\u00020\u001b032\u0006\u0010 \u001a\u00020\bH\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109J\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u00132\f\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u0013H\u0002J\n\u0010>\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u00020BH\u0016J\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\b\u0010E\u001a\u00020\bH\u0016J\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u0013H\u0002J\u001c\u0010H\u001a\u00020\u001b2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u001b0$H\u0016J\u0010\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020NH\u0016J0\u0010O\u001a\u00020\u001b2\b\u0010P\u001a\u0004\u0018\u00010\b2\b\u0010M\u001a\u0004\u0018\u00010N2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020\u001b0$H\u0016J\b\u0010R\u001a\u00020SH\u0016J\b\u0010T\u001a\u00020\bH\u0002J\b\u0010U\u001a\u00020\bH\u0016J$\u0010V\u001a\b\u0012\u0004\u0012\u00020\u001b032\u0006\u0010W\u001a\u00020\nH\u0090@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bX\u0010YJ\b\u0010Z\u001a\u00020\u001bH\u0002J\b\u0010[\u001a\u00020\u001bH\u0002J\b\u0010\\\u001a\u00020\nH\u0002J\b\u0010]\u001a\u00020\u001bH\u0002J\u0010\u0010^\u001a\u00020\u001e2\u0006\u0010_\u001a\u00020JH\u0002J\r\u0010`\u001a\u00020'H\u0010¢\u0006\u0002\baJ8\u0010b\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\b2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001b0$2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u001b0$H\u0016J\b\u0010c\u001a\u00020\u001bH\u0002J\u0016\u0010d\u001a\u00020\u001b2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020f0\u0013H\u0002J$\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010h\u001a\b\u0012\u0004\u0012\u00020;0\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J4\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010j\u001a\u00020k2\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010l\u001a\b\u0012\u0004\u0012\u00020;0\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001e\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010n\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010o\u001a\u00020\u001b2\u0006\u0010p\u001a\u00020\bH\u0016J\u0010\u0010q\u001a\u00020\u001b2\u0006\u0010r\u001a\u00020sH\u0016J\b\u0010t\u001a\u00020\u001bH\u0002J\b\u0010u\u001a\u00020\nH\u0016J\u001a\u0010v\u001a\u00020\u001b2\b\u0010M\u001a\u0004\u0018\u00010N2\u0006\u0010w\u001a\u00020xH\u0002J\u0010\u0010y\u001a\u00020\u001b2\u0006\u0010z\u001a\u00020{H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006}"}, d2 = {"Lcom/usercentrics/sdk/UsercentricsSDKImpl;", "Lcom/usercentrics/sdk/UsercentricsSDK;", "application", "Lcom/usercentrics/sdk/core/application/Application;", "options", "Lcom/usercentrics/sdk/UsercentricsOptions;", "(Lcom/usercentrics/sdk/core/application/Application;Lcom/usercentrics/sdk/UsercentricsOptions;)V", "activeControllerId", "", "isTCFEnabled", "", "()Z", "getOptions$usercentrics_release", "()Lcom/usercentrics/sdk/UsercentricsOptions;", "tcfInstance", "Lcom/usercentrics/sdk/services/tcf/TCFUseCase;", "getTcfInstance", "()Lcom/usercentrics/sdk/services/tcf/TCFUseCase;", "acceptAll", "", "Lcom/usercentrics/sdk/UsercentricsServiceConsent;", "consentType", "Lcom/usercentrics/sdk/models/settings/UsercentricsConsentType;", "acceptAllForTCF", "fromLayer", "Lcom/usercentrics/sdk/services/tcf/TCFDecisionUILayer;", "applyMediationIfNeeded", "", "consents", "tcfConsentPayload", "Lcom/usercentrics/sdk/mediation/data/TCFConsentPayload;", "changeLanguage", Device.JsonKeys.LANGUAGE, "onSuccess", "Lkotlin/Function0;", "onFailure", "Lkotlin/Function1;", "Lcom/usercentrics/sdk/errors/UsercentricsError;", "clearUserSession", "Lcom/usercentrics/sdk/UsercentricsReadyStatus;", "onError", "denyAll", "denyAllForTCF", "doRestoreUserSession", "controllerId", "Lcom/usercentrics/sdk/errors/UsercentricsException;", "emitUpdatedConsentEvent", "consentsList", "tcString", "acString", "finalizeInitializationRegardlessOfCancellation", "Lkotlin/Result;", "coldInitializeResult", "finalizeInitializationRegardlessOfCancellation-otoQ2dE", "(Lkotlin/Result;)Ljava/lang/Object;", "finishChangeLanguage", "finishChangeLanguage-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateGDPRDecisions", "Lcom/usercentrics/sdk/UserDecision;", "allServices", "Lcom/usercentrics/sdk/models/settings/LegacyService;", "getABTestingVariant", "getAdditionalConsentModeData", "Lcom/usercentrics/sdk/AdditionalConsentModeData;", "getCMPData", "Lcom/usercentrics/sdk/UsercentricsCMPData;", "getConsents", "getConsentsTriggeringMediationAndConsentsUpdateEvent", "getControllerId", "getServices", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;", "getTCFData", PluginMethod.RETURN_CALLBACK, "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;", "getUIApplication", "Lcom/usercentrics/sdk/ui/PredefinedUIApplicationManager;", "predefinedUIVariant", "Lcom/usercentrics/sdk/models/settings/PredefinedUIVariant;", "getUIFactoryHolder", "abTestingVariant", "Lcom/usercentrics/sdk/ui/PredefinedUIFactoryHolder;", "getUSPData", "Lcom/usercentrics/ccpa/CCPAData;", "getUSPStringIfAvailable", "getUserSessionData", MobileAdsBridgeBase.initializeMethodName, "offlineMode", "initialize-gIAlu-s$usercentrics_release", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializeControllerId", "invokeClearUserSession", "isCCPAEnabled", "logConsentMediationInitialState", "mapTCFConsentPayload", "tcfData", "readyStatus", "readyStatus$usercentrics_release", "restoreUserSession", "runMediationAfterInitialize", "saveAdTechProvidersDecisions", "adTechProviders", "Lcom/usercentrics/sdk/services/tcf/interfaces/AdTechProviderDecision;", "saveDecisions", "decisions", "saveDecisionsForTCF", "tcfDecisions", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFUserDecisions;", "serviceDecisions", "saveOptOutForCCPA", "isOptedOut", "setABTestingVariant", "variantName", "setCMPId", "id", "", "setupABTestingIfNeeded", "shouldCollectConsent", "storeVariant", "settings", "Lcom/usercentrics/sdk/models/settings/PredefinedUIViewSettings;", "track", "event", "Lcom/usercentrics/sdk/UsercentricsAnalyticsEventType;", k.M, "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UsercentricsSDKImpl extends UsercentricsSDK {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String setCmpIdError = "To set the CMP ID you *must* have the TCF settings enabled";
    private String activeControllerId;
    private final Application application;
    private final UsercentricsOptions options;

    /* renamed from: getOptions$usercentrics_release, reason: from getter */
    public final UsercentricsOptions getOptions() {
        return this.options;
    }

    public UsercentricsSDKImpl(Application application, UsercentricsOptions options) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(options, "options");
        this.application = application;
        this.options = options;
        this.activeControllerId = "";
    }

    /* compiled from: UsercentricsSDKImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/usercentrics/sdk/UsercentricsSDKImpl$Companion;", "", "()V", "setCmpIdError", "", "customUITCFError", "operation", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String customUITCFError(String operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return "You *must* have the TCF settings enabled to do this operation: " + operation;
        }
    }

    private final boolean isTCFEnabled() {
        return this.application.getSettingsInstance().getValue().isTCFEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TCFUseCase getTcfInstance() {
        return this.application.getTcfInstance().getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        if (r8 != r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r7v13, types: [com.usercentrics.sdk.UsercentricsSDKImpl] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    @Override // com.usercentrics.sdk.UsercentricsSDK
    /* renamed from: initialize-gIAlu-s$usercentrics_release */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo10585initializegIAlus$usercentrics_release(boolean z, Continuation<? super Result<Unit>> continuation) {
        UsercentricsSDKImpl$initialize$1 usercentricsSDKImpl$initialize$1;
        int i;
        SettingsOrchestrator settingsOrchestrator;
        UsercentricsSDKImpl usercentricsSDKImpl;
        Object mo10590coldInitializegIAlus;
        try {
            try {
                if (continuation instanceof UsercentricsSDKImpl$initialize$1) {
                    usercentricsSDKImpl$initialize$1 = (UsercentricsSDKImpl$initialize$1) continuation;
                    if ((usercentricsSDKImpl$initialize$1.label & Integer.MIN_VALUE) != 0) {
                        usercentricsSDKImpl$initialize$1.label -= Integer.MIN_VALUE;
                        Object obj = usercentricsSDKImpl$initialize$1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = usercentricsSDKImpl$initialize$1.label;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            this.application.getNetworkStrategy().getValue().set(z);
                            SettingsOrchestrator value = this.application.getSettingsOrchestrator().getValue();
                            UsercentricsOptions usercentricsOptions = this.options;
                            usercentricsSDKImpl$initialize$1.L$0 = this;
                            usercentricsSDKImpl$initialize$1.L$1 = value;
                            usercentricsSDKImpl$initialize$1.label = 1;
                            if (value.boot(usercentricsOptions, usercentricsSDKImpl$initialize$1) != coroutine_suspended) {
                                settingsOrchestrator = value;
                                usercentricsSDKImpl = this;
                            }
                            return coroutine_suspended;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            UsercentricsSDKImpl usercentricsSDKImpl2 = (UsercentricsSDKImpl) usercentricsSDKImpl$initialize$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            mo10590coldInitializegIAlus = ((Result) obj).getValue();
                            z = usercentricsSDKImpl2;
                            return z.m10587finalizeInitializationRegardlessOfCancellationotoQ2dE(Result.m11179boximpl(mo10590coldInitializegIAlus));
                        }
                        SettingsOrchestrator settingsOrchestrator2 = (SettingsOrchestrator) usercentricsSDKImpl$initialize$1.L$1;
                        UsercentricsSDKImpl usercentricsSDKImpl3 = (UsercentricsSDKImpl) usercentricsSDKImpl$initialize$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        settingsOrchestrator = settingsOrchestrator2;
                        usercentricsSDKImpl = usercentricsSDKImpl3;
                        usercentricsSDKImpl.initializeControllerId();
                        String str = usercentricsSDKImpl.activeControllerId;
                        usercentricsSDKImpl$initialize$1.L$0 = usercentricsSDKImpl;
                        usercentricsSDKImpl$initialize$1.L$1 = null;
                        usercentricsSDKImpl$initialize$1.label = 2;
                        mo10590coldInitializegIAlus = settingsOrchestrator.mo10590coldInitializegIAlus(str, usercentricsSDKImpl$initialize$1);
                        z = usercentricsSDKImpl;
                    }
                }
                if (i != 0) {
                }
                usercentricsSDKImpl.initializeControllerId();
                String str2 = usercentricsSDKImpl.activeControllerId;
                usercentricsSDKImpl$initialize$1.L$0 = usercentricsSDKImpl;
                usercentricsSDKImpl$initialize$1.L$1 = null;
                usercentricsSDKImpl$initialize$1.label = 2;
                mo10590coldInitializegIAlus = settingsOrchestrator.mo10590coldInitializegIAlus(str2, usercentricsSDKImpl$initialize$1);
                z = usercentricsSDKImpl;
            } catch (UsercentricsException e) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m11180constructorimpl(ResultKt.createFailure(e));
            }
        } catch (Throwable unused) {
            return z.m10587finalizeInitializationRegardlessOfCancellationotoQ2dE(null);
        }
        usercentricsSDKImpl$initialize$1 = new UsercentricsSDKImpl$initialize$1(this, continuation);
        Object obj2 = usercentricsSDKImpl$initialize$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = usercentricsSDKImpl$initialize$1.label;
    }

    /* renamed from: finalizeInitializationRegardlessOfCancellation-otoQ2dE, reason: not valid java name */
    private final Object m10587finalizeInitializationRegardlessOfCancellationotoQ2dE(Result<Unit> coldInitializeResult) {
        if ((coldInitializeResult != null ? Result.m11183exceptionOrNullimpl(coldInitializeResult.getValue()) : null) != null) {
            return coldInitializeResult.getValue();
        }
        if (isTCFEnabled()) {
            getTcfInstance().getTCFData();
        }
        logConsentMediationInitialState();
        runMediationAfterInitialize();
        setupABTestingIfNeeded();
        Result.Companion companion = Result.INSTANCE;
        return Result.m11180constructorimpl(Unit.INSTANCE);
    }

    private final void initializeControllerId() {
        String controllerId = this.application.getStorageInstance().getValue().getControllerId();
        if (StringsKt.isBlank(controllerId)) {
            return;
        }
        this.activeControllerId = controllerId;
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public boolean shouldCollectConsent() {
        Object m11180constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(Boolean.valueOf(this.application.getInitialValuesStrategy().getValue().resolveInitialView() != InitialView.NONE));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m11186isFailureimpl(m11180constructorimpl)) {
            m11180constructorimpl = null;
        }
        Boolean bool = (Boolean) m11180constructorimpl;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public List<UsercentricsServiceConsent> getConsents() {
        List<LegacyService> services = this.application.getSettingsInstance().getValue().getSettings().getServices();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(services, 10));
        Iterator<T> it = services.iterator();
        while (it.hasNext()) {
            arrayList.add(UsercentricsServiceConsentKt.mapConsent((LegacyService) it.next()));
        }
        return arrayList;
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public UsercentricsCMPData getCMPData() {
        NewSettingsData settings = this.application.getSettingsService().getSettings();
        Intrinsics.checkNotNull(settings);
        UsercentricsSettings data = settings.getData();
        List<UsercentricsService> services = getServices();
        LegalBasisLocalization translations = this.application.getTranslationService().getTranslations();
        Intrinsics.checkNotNull(translations);
        UsercentricsVariant variant = this.application.getInitialValuesStrategy().getValue().getVariant();
        Intrinsics.checkNotNull(variant);
        return new UsercentricsCMPData(data, services, translations, variant, this.application.getLocationService().getValue().getLocation());
    }

    private final List<UsercentricsService> getServices() {
        NewSettingsData settings = this.application.getSettingsService().getSettings();
        Intrinsics.checkNotNull(settings);
        return settings.getServices();
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public String getControllerId() {
        String str = this.activeControllerId;
        return StringsKt.isBlank(str) ? this.application.getSettingsInstance().getValue().getSettings().getControllerId() : str;
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public void restoreUserSession(String controllerId, final Function1<? super UsercentricsReadyStatus, Unit> onSuccess, final Function1<? super UsercentricsError, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(controllerId, "controllerId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.usercentrics.sdk.UsercentricsSDKImpl$restoreUserSession$onSuccessCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Application application;
                application = UsercentricsSDKImpl.this.application;
                Dispatcher dispatcher = application.getDispatcher();
                final UsercentricsSDKImpl usercentricsSDKImpl = UsercentricsSDKImpl.this;
                final Function1<UsercentricsReadyStatus, Unit> function1 = onSuccess;
                dispatcher.dispatchMain(new Function0<Unit>() { // from class: com.usercentrics.sdk.UsercentricsSDKImpl$restoreUserSession$onSuccessCallback$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Application application2;
                        application2 = UsercentricsSDKImpl.this.application;
                        UsercentricsLogger.DefaultImpls.debug$default(application2.getLogger(), "Restore User Session finished with success", null, 2, null);
                        function1.invoke(UsercentricsSDKImpl.this.readyStatus$usercentrics_release());
                    }
                });
            }
        };
        this.application.getDispatcher().dispatch(new UsercentricsSDKImpl$restoreUserSession$1(this, new Function1<UsercentricsException, Unit>() { // from class: com.usercentrics.sdk.UsercentricsSDKImpl$restoreUserSession$onError$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UsercentricsException usercentricsException) {
                invoke2(usercentricsException);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final UsercentricsException exception) {
                Application application;
                Intrinsics.checkNotNullParameter(exception, "exception");
                application = UsercentricsSDKImpl.this.application;
                Dispatcher dispatcher = application.getDispatcher();
                final UsercentricsSDKImpl usercentricsSDKImpl = UsercentricsSDKImpl.this;
                final Function1<UsercentricsError, Unit> function1 = onFailure;
                dispatcher.dispatchMain(new Function0<Unit>() { // from class: com.usercentrics.sdk.UsercentricsSDKImpl$restoreUserSession$onError$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Application application2;
                        UsercentricsError asError$usercentrics_release = UsercentricsException.this.asError$usercentrics_release();
                        application2 = usercentricsSDKImpl.application;
                        application2.getLogger().error(asError$usercentrics_release);
                        function1.invoke(asError$usercentrics_release);
                    }
                });
            }
        }, controllerId, function0, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doRestoreUserSession(final String controllerId, final Function0<Unit> onSuccess, Function1<? super UsercentricsException, Unit> onError) {
        invokeClearUserSession();
        if (!this.options.isSelfHostedConfigurationValid$usercentrics_release()) {
            this.application.getBillingSessionLifecycleCallback().invoke2();
        }
        this.application.getDataFacadeInstance().restoreUserSession(controllerId, this.application.getInitialValuesStrategy().getValue().getVariant(), new Function0<Unit>() { // from class: com.usercentrics.sdk.UsercentricsSDKImpl$doRestoreUserSession$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                UsercentricsSDKImpl.this.activeControllerId = controllerId;
                UsercentricsSDKImpl.this.getConsentsTriggeringMediationAndConsentsUpdateEvent();
                onSuccess.invoke();
            }
        }, onError);
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public String getUserSessionData() {
        Object m11180constructorimpl;
        UserSessionDataTCF userSessionDataTCF;
        UserSessionDataCCPA userSessionDataCCPA;
        Json json;
        try {
            Result.Companion companion = Result.INSTANCE;
            DeviceStorage value = this.application.getStorageInstance().getValue();
            List<UserSessionDataConsent> userSessionDataConsents = value.getUserSessionDataConsents();
            String controllerId = getControllerId();
            String settingsLanguage = value.getSettingsLanguage();
            if (isTCFEnabled()) {
                StorageTCF tCFData = value.getTCFData();
                userSessionDataTCF = new UserSessionDataTCF(tCFData.getTcString(), CollectionsKt.toList(tCFData.getVendorsDisclosedMap().keySet()), getAdditionalConsentModeData().getAcString());
            } else {
                userSessionDataTCF = null;
            }
            if (isCCPAEnabled()) {
                String cCPADataAsString = this.application.getCcpaInstance().getValue().getCCPADataAsString();
                Long ccpaTimestampInMillis = value.getCcpaTimestampInMillis();
                userSessionDataCCPA = new UserSessionDataCCPA(cCPADataAsString, ccpaTimestampInMillis != null ? ccpaTimestampInMillis.longValue() : 0L);
            } else {
                userSessionDataCCPA = null;
            }
            UserSessionData userSessionData = new UserSessionData(userSessionDataConsents, controllerId, settingsLanguage, userSessionDataTCF, userSessionDataCCPA);
            this.application.getJsonParserInstance();
            KSerializer<UserSessionData> serializer = UserSessionData.INSTANCE.serializer();
            json = JsonParserKt.json;
            m11180constructorimpl = Result.m11180constructorimpl(json.encodeToString(serializer, userSessionData));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        String str = (String) (Result.m11186isFailureimpl(m11180constructorimpl) ? null : m11180constructorimpl);
        return str == null ? "" : str;
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public CCPAData getUSPData() {
        return this.application.getCcpaInstance().getValue().getCCPAData();
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public void setCMPId(int id) {
        if (isTCFEnabled()) {
            getTcfInstance().setCmpId(id);
        } else {
            UsercentricsLogger.DefaultImpls.error$default(this.application.getLogger(), setCmpIdError, null, 2, null);
        }
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public void getTCFData(final Function1<? super TCFData, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.application.getDispatcher().dispatch(new UsercentricsSDKImpl$getTCFData$1(this, null)).onSuccess(new Function1<TCFData, Unit>() { // from class: com.usercentrics.sdk.UsercentricsSDKImpl$getTCFData$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TCFData tCFData) {
                invoke2(tCFData);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final TCFData it) {
                Application application;
                Intrinsics.checkNotNullParameter(it, "it");
                application = UsercentricsSDKImpl.this.application;
                Dispatcher dispatcher = application.getDispatcher();
                final Function1<TCFData, Unit> function1 = callback;
                dispatcher.dispatchMain(new Function0<Unit>() { // from class: com.usercentrics.sdk.UsercentricsSDKImpl$getTCFData$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        function1.invoke(it);
                    }
                });
            }
        });
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public void changeLanguage(String language, final Function0<Unit> onSuccess, final Function1<? super UsercentricsError, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        SettingsOrchestrator value = this.application.getSettingsOrchestrator().getValue();
        if (value.isLanguageAlreadySelected(language)) {
            onSuccess.invoke();
        } else if (!value.isLanguageAvailable(language)) {
            onFailure.invoke(new LanguageNotAvailableException(language).asError$usercentrics_release());
        } else {
            this.application.getDispatcher().dispatch(new UsercentricsSDKImpl$changeLanguage$1(value, this, language, null)).onSuccess(new Function1<Result<? extends Unit>, Unit>() { // from class: com.usercentrics.sdk.UsercentricsSDKImpl$changeLanguage$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Result<? extends Unit> result) {
                    m10589invoke(result.getValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m10589invoke(Object obj) {
                    Application application;
                    application = UsercentricsSDKImpl.this.application;
                    Dispatcher dispatcher = application.getDispatcher();
                    final Function0<Unit> function0 = onSuccess;
                    dispatcher.dispatchMain(new Function0<Unit>() { // from class: com.usercentrics.sdk.UsercentricsSDKImpl$changeLanguage$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function0.invoke();
                        }
                    });
                }
            }).onFailure(new Function1<Throwable, Unit>() { // from class: com.usercentrics.sdk.UsercentricsSDKImpl$changeLanguage$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(final Throwable it) {
                    Application application;
                    Intrinsics.checkNotNullParameter(it, "it");
                    application = UsercentricsSDKImpl.this.application;
                    Dispatcher dispatcher = application.getDispatcher();
                    final Function1<UsercentricsError, Unit> function1 = onFailure;
                    dispatcher.dispatchMain(new Function0<Unit>() { // from class: com.usercentrics.sdk.UsercentricsSDKImpl$changeLanguage$3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function1.invoke(new UsercentricsError(new UsercentricsException("", it)));
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: finishChangeLanguage-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m10588finishChangeLanguagegIAlus(String str, Continuation<? super Result<Unit>> continuation) {
        UsercentricsSDKImpl$finishChangeLanguage$1 usercentricsSDKImpl$finishChangeLanguage$1;
        int i;
        LegacyExtendedSettings copy;
        Object mo10608changeLanguagegIAlus;
        Throwable m11183exceptionOrNullimpl;
        if (continuation instanceof UsercentricsSDKImpl$finishChangeLanguage$1) {
            usercentricsSDKImpl$finishChangeLanguage$1 = (UsercentricsSDKImpl$finishChangeLanguage$1) continuation;
            if ((usercentricsSDKImpl$finishChangeLanguage$1.label & Integer.MIN_VALUE) != 0) {
                usercentricsSDKImpl$finishChangeLanguage$1.label -= Integer.MIN_VALUE;
                Object obj = usercentricsSDKImpl$finishChangeLanguage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = usercentricsSDKImpl$finishChangeLanguage$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    MergedServicesSettings mergedServicesAndSettingsFromStorage = this.application.getDataFacadeInstance().getMergedServicesAndSettingsFromStorage();
                    LegacyExtendedSettings mergedSettings = mergedServicesAndSettingsFromStorage.getMergedSettings();
                    List<LegacyService> mergedServices = mergedServicesAndSettingsFromStorage.getMergedServices();
                    ISettingsLegacy value = this.application.getSettingsInstance().getValue();
                    copy = mergedSettings.copy((r29 & 1) != 0 ? mergedSettings.categories : null, (r29 & 2) != 0 ? mergedSettings.services : LegacyDataKt.updateServices(this.application.getSettingsInstance().getValue().getSettings().getServices(), mergedServices), (r29 & 4) != 0 ? mergedSettings.gdpr : null, (r29 & 8) != 0 ? mergedSettings.ccpa : null, (r29 & 16) != 0 ? mergedSettings.controllerId : null, (r29 & 32) != 0 ? mergedSettings.id : null, (r29 & 64) != 0 ? mergedSettings.isTcfEnabled : false, (r29 & 128) != 0 ? mergedSettings.showFirstLayerOnVersionChange : null, (r29 & 256) != 0 ? mergedSettings.tcfui : null, (r29 & 512) != 0 ? mergedSettings.ui : null, (r29 & 1024) != 0 ? mergedSettings.version : null, (r29 & 2048) != 0 ? mergedSettings.framework : null, (r29 & 4096) != 0 ? mergedSettings.restoredSessionLastInteractionTimestamp : null, (r29 & 8192) != 0 ? mergedSettings.renewConsentsTimestampInSeconds : null);
                    value.setSettings(copy);
                    this.application.getStorageInstance().getValue().saveSettings(mergedSettings, mergedServices);
                    if (!isTCFEnabled()) {
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m11180constructorimpl(Unit.INSTANCE);
                    }
                    TCFUseCase tcfInstance = getTcfInstance();
                    usercentricsSDKImpl$finishChangeLanguage$1.label = 1;
                    mo10608changeLanguagegIAlus = tcfInstance.mo10608changeLanguagegIAlus(str, usercentricsSDKImpl$finishChangeLanguage$1);
                    if (mo10608changeLanguagegIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    mo10608changeLanguagegIAlus = ((Result) obj).getValue();
                }
                m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(mo10608changeLanguagegIAlus);
                if (m11183exceptionOrNullimpl == null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl));
                }
                Result.Companion companion3 = Result.INSTANCE;
                return Result.m11180constructorimpl(Unit.INSTANCE);
            }
        }
        usercentricsSDKImpl$finishChangeLanguage$1 = new UsercentricsSDKImpl$finishChangeLanguage$1(this, continuation);
        Object obj2 = usercentricsSDKImpl$finishChangeLanguage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = usercentricsSDKImpl$finishChangeLanguage$1.label;
        if (i != 0) {
        }
        m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(mo10608changeLanguagegIAlus);
        if (m11183exceptionOrNullimpl == null) {
        }
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public List<UsercentricsServiceConsent> acceptAllForTCF(TCFDecisionUILayer fromLayer, UsercentricsConsentType consentType) {
        Intrinsics.checkNotNullParameter(fromLayer, "fromLayer");
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        if (isTCFEnabled()) {
            if (this.application.getSettingsInstance().getValue().isAdditionalConsentModeEnabled()) {
                this.application.getAdditionalConsentModeService().getValue().acceptAll();
            }
            getTcfInstance().acceptAllDisclosed(fromLayer);
        } else {
            UsercentricsLogger.DefaultImpls.error$default(this.application.getLogger(), INSTANCE.customUITCFError("acceptAllForTCF"), null, 2, null);
        }
        return acceptAll(consentType);
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public List<UsercentricsServiceConsent> acceptAll(UsercentricsConsentType consentType) {
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        List<LegacyService> services = this.application.getSettingsInstance().getValue().getSettings().getServices();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(services, 10));
        for (LegacyService legacyService : services) {
            arrayList.add(LegacyService.copy$default(legacyService, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new LegacyConsent(legacyService.getConsent().getHistory(), true), false, false, null, null, null, null, null, null, false, null, 67076095, null));
        }
        this.application.getDataFacadeInstance().execute(this.activeControllerId, arrayList, UsercentricsConsentAction.ACCEPT_ALL_SERVICES, consentType);
        return getConsentsTriggeringMediationAndConsentsUpdateEvent();
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public List<UsercentricsServiceConsent> denyAllForTCF(TCFDecisionUILayer fromLayer, UsercentricsConsentType consentType) {
        Intrinsics.checkNotNullParameter(fromLayer, "fromLayer");
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        if (isTCFEnabled()) {
            if (this.application.getSettingsInstance().getValue().isAdditionalConsentModeEnabled()) {
                this.application.getAdditionalConsentModeService().getValue().denyAll();
            }
            getTcfInstance().denyAllDisclosed(fromLayer);
        } else {
            UsercentricsLogger.DefaultImpls.error$default(this.application.getLogger(), INSTANCE.customUITCFError("denyAllForTCF"), null, 2, null);
        }
        return denyAll(consentType);
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public List<UsercentricsServiceConsent> denyAll(UsercentricsConsentType consentType) {
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        List<LegacyService> services = this.application.getSettingsInstance().getValue().getSettings().getServices();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(services, 10));
        for (LegacyService legacyService : services) {
            arrayList.add(LegacyService.copy$default(legacyService, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new LegacyConsent(legacyService.getConsent().getHistory(), legacyService.isEssential()), false, false, null, null, null, null, null, null, false, null, 67076095, null));
        }
        this.application.getDataFacadeInstance().execute(this.activeControllerId, arrayList, UsercentricsConsentAction.DENY_ALL_SERVICES, consentType);
        return getConsentsTriggeringMediationAndConsentsUpdateEvent();
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public List<UsercentricsServiceConsent> saveDecisionsForTCF(TCFUserDecisions tcfDecisions, TCFDecisionUILayer fromLayer, List<UserDecision> serviceDecisions, UsercentricsConsentType consentType) {
        Intrinsics.checkNotNullParameter(tcfDecisions, "tcfDecisions");
        Intrinsics.checkNotNullParameter(fromLayer, "fromLayer");
        Intrinsics.checkNotNullParameter(serviceDecisions, "serviceDecisions");
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        if (isTCFEnabled()) {
            if (this.application.getSettingsInstance().getValue().isAdditionalConsentModeEnabled()) {
                saveAdTechProvidersDecisions(tcfDecisions.getAdTechProviders());
            }
            getTcfInstance().updateChoices(tcfDecisions, fromLayer);
        } else {
            UsercentricsLogger.DefaultImpls.error$default(this.application.getLogger(), INSTANCE.customUITCFError("saveDecisionsForTCF"), null, 2, null);
        }
        return saveDecisions(serviceDecisions, consentType);
    }

    private final void saveAdTechProvidersDecisions(List<AdTechProviderDecision> adTechProviders) {
        ArrayList arrayList = new ArrayList();
        for (AdTechProviderDecision adTechProviderDecision : adTechProviders) {
            Integer valueOf = !adTechProviderDecision.getConsent() ? null : Integer.valueOf(adTechProviderDecision.getId());
            if (valueOf != null) {
                arrayList.add(valueOf);
            }
        }
        this.application.getAdditionalConsentModeService().getValue().save(arrayList);
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public List<UsercentricsServiceConsent> saveDecisions(List<UserDecision> decisions, UsercentricsConsentType consentType) {
        boolean z;
        List<UserDecision> decisions2 = decisions;
        Intrinsics.checkNotNullParameter(decisions2, "decisions");
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        List<LegacyService> services = this.application.getSettingsInstance().getValue().getSettings().getServices();
        boolean hideNonIabOnFirstLayer = getTcfInstance().getHideNonIabOnFirstLayer();
        if (isTCFEnabled() && decisions2.isEmpty() && hideNonIabOnFirstLayer) {
            decisions2 = generateGDPRDecisions(services);
        }
        List<UserDecision> list = decisions2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (UserDecision userDecision : list) {
            Pair pair = TuplesKt.to(userDecision.getServiceId(), Boolean.valueOf(userDecision.getConsent()));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : services) {
            if (linkedHashMap.containsKey(((LegacyService) obj).getId())) {
                arrayList.add(obj);
            }
        }
        ArrayList<LegacyService> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (LegacyService legacyService : arrayList2) {
            if (!legacyService.isEssential()) {
                Boolean bool = (Boolean) linkedHashMap.get(legacyService.getId());
                if (!(bool != null ? bool.booleanValue() : legacyService.getConsent().getStatus())) {
                    z = false;
                    arrayList3.add(LegacyService.copy$default(legacyService, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new LegacyConsent(legacyService.getConsent().getHistory(), z), false, false, null, null, null, null, null, null, false, null, 67076095, null));
                }
            }
            z = true;
            arrayList3.add(LegacyService.copy$default(legacyService, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new LegacyConsent(legacyService.getConsent().getHistory(), z), false, false, null, null, null, null, null, null, false, null, 67076095, null));
        }
        ArrayList arrayList4 = arrayList3;
        if (!arrayList4.isEmpty()) {
            this.application.getDataFacadeInstance().execute(this.activeControllerId, arrayList4, UsercentricsConsentAction.UPDATE_SERVICES, consentType);
        }
        return getConsentsTriggeringMediationAndConsentsUpdateEvent();
    }

    private final List<UserDecision> generateGDPRDecisions(List<LegacyService> allServices) {
        boolean z = !getTcfInstance().getGdprAppliesOnTCF();
        List<LegacyService> list = allServices;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new UserDecision(((LegacyService) it.next()).getId(), z));
        }
        return arrayList;
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public List<UsercentricsServiceConsent> saveOptOutForCCPA(boolean isOptedOut, UsercentricsConsentType consentType) {
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        if (!isCCPAEnabled()) {
            UsercentricsLogger.DefaultImpls.error$default(this.application.getLogger(), CCPAErrors.SETTINGS_UNDEFINED, null, 2, null);
            if (isOptedOut) {
                return denyAll(consentType);
            }
            return acceptAll(consentType);
        }
        ICcpa.DefaultImpls.setCcpaStorage$default(this.application.getCcpaInstance().getValue(), isOptedOut, null, 2, null);
        UsercentricsConsentAction usercentricsConsentAction = isOptedOut ? UsercentricsConsentAction.DENY_ALL_SERVICES : UsercentricsConsentAction.ACCEPT_ALL_SERVICES;
        List<LegacyService> services = this.application.getSettingsInstance().getValue().getSettings().getServices();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(services, 10));
        for (LegacyService legacyService : services) {
            boolean z = true;
            if (!legacyService.isEssential() && isOptedOut) {
                z = false;
            }
            arrayList.add(LegacyService.copy$default(legacyService, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new LegacyConsent(legacyService.getConsent().getHistory(), z), false, false, null, null, null, null, null, null, false, null, 67076095, null));
        }
        this.application.getDataFacadeInstance().execute(this.activeControllerId, arrayList, usercentricsConsentAction, consentType);
        return getConsentsTriggeringMediationAndConsentsUpdateEvent();
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public PredefinedUIApplicationManager getUIApplication(PredefinedUIVariant predefinedUIVariant) {
        Intrinsics.checkNotNullParameter(predefinedUIVariant, "predefinedUIVariant");
        UsercentricsVariant variant = this.application.getInitialValuesStrategy().getValue().getVariant();
        if (variant == null) {
            throw new UsercentricsException("Usercentrics is still initializing. Please, check if you are trying to show the UI before the `isReady` was invoked.", null, 2, null);
        }
        this.application.getPredefinedUIMediator().storeVariant(predefinedUIVariant);
        track(UsercentricsAnalyticsEventType.CMP_SHOWN);
        return new PredefinedUIApplicationManager(new PredefinedUIConsentManagerImpl(this, variant, getControllerId()), this.application.getLogger(), this.application.getCookieInformationService(), new BannerViewDataServiceImpl(this.application.getSettingsService(), this.application.getSettingsInstance().getValue(), this.application.getTranslationService(), getTcfInstance(), this.application.getCcpaInstance().getValue(), this.application.getAdditionalConsentModeService().getValue(), variant, this.application.getDispatcher()));
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public void getUIFactoryHolder(String abTestingVariant, final PredefinedUIVariant predefinedUIVariant, final Function1<? super PredefinedUIFactoryHolder, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        AssertionsKt.assertUIThread();
        UsercentricsVariant variant = this.application.getInitialValuesStrategy().getValue().getVariant();
        if (variant == null) {
            throw new UsercentricsException("Usercentrics is still initializing. Please, check if you are trying to show the UI before the `isReady` was invoked.", null, 2, null);
        }
        if (abTestingVariant != null) {
            setABTestingVariant(abTestingVariant);
        }
        UsercentricsSDKImpl usercentricsSDKImpl = this;
        new UsercentricsView(usercentricsSDKImpl, variant, getControllerId(), this.application.getLogger(), this.application.getSettingsService(), this.application.getTranslationService(), this.application.getCcpaInstance().getValue(), this.application.getSettingsInstance().getValue(), getTcfInstance(), this.application.getAdditionalConsentModeService().getValue(), this.application.getDispatcher()).getUIHolder(new Function1<PredefinedUIHolder, Unit>() { // from class: com.usercentrics.sdk.UsercentricsSDKImpl$getUIFactoryHolder$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PredefinedUIHolder predefinedUIHolder) {
                invoke2(predefinedUIHolder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PredefinedUIHolder uiHolder) {
                Application application;
                Intrinsics.checkNotNullParameter(uiHolder, "uiHolder");
                UsercentricsSDKImpl.this.storeVariant(predefinedUIVariant, uiHolder.getData().getSettings());
                Function1<PredefinedUIFactoryHolder, Unit> function1 = callback;
                application = UsercentricsSDKImpl.this.application;
                function1.invoke(new PredefinedUIFactoryHolder(uiHolder, application.getUiDependencyManager()));
            }
        });
        track(UsercentricsAnalyticsEventType.CMP_SHOWN);
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public void track(UsercentricsAnalyticsEventType event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.application.getAnalyticsFacade().getValue().report(event, this.application.getSettingsOrchestrator().getValue().getActiveSettingsId(), getABTestingVariant());
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public void setABTestingVariant(String variantName) {
        List<String> emptyList;
        UsercentricsSettings data;
        Intrinsics.checkNotNullParameter(variantName, "variantName");
        if (StringsKt.isBlank(variantName) || Intrinsics.areEqual(variantName, getABTestingVariant())) {
            return;
        }
        NewSettingsData settings = this.application.getSettingsService().getSettings();
        VariantsSettings variants = (settings == null || (data = settings.getData()) == null) ? null : data.getVariants();
        if (variants != null) {
            variants.getEnabled();
        }
        if (variants == null || (emptyList = variants.decodeVariants$usercentrics_release(this.application.getJsonParserInstance())) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        UsercentricsLogger.DefaultImpls.debug$default(this.application.getLogger(), "Select AB Testing Variant '" + variantName + "'. Admin Interface list: " + emptyList + ".", null, 2, null);
        emptyList.contains(variantName);
        this.application.getStorageInstance().getValue().saveABTestingVariant(variantName);
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public String getABTestingVariant() {
        return this.application.getStorageInstance().getValue().getABTestingVariant();
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public AdditionalConsentModeData getAdditionalConsentModeData() {
        return this.application.getAdditionalConsentModeService().getValue().getData();
    }

    private final void setupABTestingIfNeeded() {
        List<String> emptyList;
        UsercentricsSettings data;
        String aBTestingVariant = getABTestingVariant();
        String str = aBTestingVariant;
        if (str != null && !StringsKt.isBlank(str)) {
            UsercentricsLogger.DefaultImpls.debug$default(this.application.getLogger(), "AB Testing Variant was already selected '" + aBTestingVariant + "'.", null, 2, null);
            return;
        }
        NewSettingsData settings = this.application.getSettingsService().getSettings();
        VariantsSettings variants = (settings == null || (data = settings.getData()) == null) ? null : data.getVariants();
        boolean z = false;
        if (variants != null && variants.getEnabled()) {
            z = true;
        }
        boolean areEqual = Intrinsics.areEqual(variants != null ? variants.getActivateWith() : null, VariantsSettings.activateWithUC);
        if (z && areEqual) {
            UsercentricsLogger.DefaultImpls.debug$default(this.application.getLogger(), "AB Testing 'Activate with Usercentrics' option triggered the variant selection.", null, 2, null);
            if (variants == null || (emptyList = variants.decodeVariants$usercentrics_release(this.application.getJsonParserInstance())) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            String str2 = (String) CollectionsKt.firstOrNull(CollectionsKt.shuffled(emptyList));
            if (str2 == null) {
                str2 = "";
            }
            setABTestingVariant(str2);
        }
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public UsercentricsReadyStatus readyStatus$usercentrics_release() {
        return new UsercentricsReadyStatus(shouldCollectConsent(), getConsents(), !StringsKt.isBlank(this.options.getRuleSetId()) ? new GeolocationRuleset(this.application.getSettingsOrchestrator().getValue().getActiveSettingsId(), !r0.getNoShow()) : null, this.application.getLocationService().getValue().getLocation());
    }

    @Override // com.usercentrics.sdk.UsercentricsSDK
    public void clearUserSession(final Function1<? super UsercentricsReadyStatus, Unit> onSuccess, final Function1<? super UsercentricsError, Unit> onError) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.application.getDispatcher().dispatch(new UsercentricsSDKImpl$clearUserSession$1(this, null)).onSuccess(new Function1<Unit, Unit>() { // from class: com.usercentrics.sdk.UsercentricsSDKImpl$clearUserSession$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                Application application;
                Intrinsics.checkNotNullParameter(it, "it");
                application = UsercentricsSDKImpl.this.application;
                Dispatcher dispatcher = application.getDispatcher();
                final UsercentricsSDKImpl usercentricsSDKImpl = UsercentricsSDKImpl.this;
                final Function1<UsercentricsReadyStatus, Unit> function1 = onSuccess;
                dispatcher.dispatchMain(new Function0<Unit>() { // from class: com.usercentrics.sdk.UsercentricsSDKImpl$clearUserSession$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Application application2;
                        application2 = UsercentricsSDKImpl.this.application;
                        UsercentricsLogger.DefaultImpls.debug$default(application2.getLogger(), "Clear User Session finished with success", null, 2, null);
                        function1.invoke(UsercentricsSDKImpl.this.readyStatus$usercentrics_release());
                    }
                });
            }
        }).onFailure(new Function1<Throwable, Unit>() { // from class: com.usercentrics.sdk.UsercentricsSDKImpl$clearUserSession$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final Throwable it) {
                Application application;
                Intrinsics.checkNotNullParameter(it, "it");
                application = UsercentricsSDKImpl.this.application;
                Dispatcher dispatcher = application.getDispatcher();
                final UsercentricsSDKImpl usercentricsSDKImpl = UsercentricsSDKImpl.this;
                final Function1<UsercentricsError, Unit> function1 = onError;
                dispatcher.dispatchMain(new Function0<Unit>() { // from class: com.usercentrics.sdk.UsercentricsSDKImpl$clearUserSession$3.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Application application2;
                        UsercentricsError asError$usercentrics_release = new UsercentricsException("Clear User Session failed", it).asError$usercentrics_release();
                        application2 = usercentricsSDKImpl.application;
                        application2.getLogger().error(asError$usercentrics_release);
                        function1.invoke(asError$usercentrics_release);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invokeClearUserSession() {
        UsercentricsLogger.DefaultImpls.debug$default(this.application.getLogger(), "Clearing User Session", null, 2, null);
        this.activeControllerId = "";
        this.application.getStorageInstance().getValue().clear();
        this.application.getSettingsInstance().getValue().clearConsents();
        if (isTCFEnabled()) {
            this.application.getTcfInstance().getValue().clearTCFConsentsData();
            if (this.application.getSettingsInstance().getValue().isAdditionalConsentModeEnabled()) {
                this.application.getAdditionalConsentModeService().getValue().reset();
            }
        }
        this.application.getInitialValuesStrategy().getValue().loadConsents(true, "");
        getConsentsTriggeringMediationAndConsentsUpdateEvent();
    }

    private final void logConsentMediationInitialState() {
        if (this.options.getConsentMediation()) {
            this.application.getMediationFacade().getValue().logInitialState(getServices());
        }
    }

    private final void runMediationAfterInitialize() {
        if (this.options.getConsentMediation()) {
            final List<UsercentricsServiceConsent> consents = getConsents();
            if (isTCFEnabled()) {
                getTCFData(new Function1<TCFData, Unit>() { // from class: com.usercentrics.sdk.UsercentricsSDKImpl$runMediationAfterInitialize$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TCFData tCFData) {
                        invoke2(tCFData);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TCFData tcfData) {
                        TCFConsentPayload mapTCFConsentPayload;
                        Intrinsics.checkNotNullParameter(tcfData, "tcfData");
                        UsercentricsSDKImpl usercentricsSDKImpl = UsercentricsSDKImpl.this;
                        List<UsercentricsServiceConsent> list = consents;
                        mapTCFConsentPayload = usercentricsSDKImpl.mapTCFConsentPayload(tcfData);
                        usercentricsSDKImpl.applyMediationIfNeeded(list, mapTCFConsentPayload);
                    }
                });
            } else {
                applyMediationIfNeeded(consents, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<UsercentricsServiceConsent> getConsentsTriggeringMediationAndConsentsUpdateEvent() {
        final List<UsercentricsServiceConsent> consents = getConsents();
        if (!isTCFEnabled()) {
            applyMediationIfNeeded(consents, null);
            emitUpdatedConsentEvent$default(this, consents, null, null, 6, null);
            return consents;
        }
        getTCFData(new Function1<TCFData, Unit>() { // from class: com.usercentrics.sdk.UsercentricsSDKImpl$getConsentsTriggeringMediationAndConsentsUpdateEvent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TCFData tCFData) {
                invoke2(tCFData);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TCFData tcfData) {
                TCFConsentPayload mapTCFConsentPayload;
                Intrinsics.checkNotNullParameter(tcfData, "tcfData");
                UsercentricsSDKImpl usercentricsSDKImpl = UsercentricsSDKImpl.this;
                List<UsercentricsServiceConsent> list = consents;
                mapTCFConsentPayload = usercentricsSDKImpl.mapTCFConsentPayload(tcfData);
                usercentricsSDKImpl.applyMediationIfNeeded(list, mapTCFConsentPayload);
                UsercentricsSDKImpl.this.emitUpdatedConsentEvent(consents, tcfData.getTcString(), UsercentricsSDKImpl.this.getAdditionalConsentModeData().getAcString());
            }
        });
        return consents;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TCFConsentPayload mapTCFConsentPayload(TCFData tcfData) {
        return new TCFConsentPayload(this.application.getLocationService().getValue().getLocation().isInEU(), tcfData.getPurposes(), tcfData.getVendors());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyMediationIfNeeded(List<UsercentricsServiceConsent> consents, TCFConsentPayload tcfConsentPayload) {
        if (this.options.getConsentMediation()) {
            this.application.getDispatcher().dispatch(new UsercentricsSDKImpl$applyMediationIfNeeded$1(this, consents, tcfConsentPayload, null)).onSuccess(new Function1<MediationResultPayload, Unit>() { // from class: com.usercentrics.sdk.UsercentricsSDKImpl$applyMediationIfNeeded$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MediationResultPayload mediationResultPayload) {
                    invoke2(mediationResultPayload);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(final MediationResultPayload it) {
                    Application application;
                    Intrinsics.checkNotNullParameter(it, "it");
                    application = UsercentricsSDKImpl.this.application;
                    application.getDispatcher().dispatchMain(new Function0<Unit>() { // from class: com.usercentrics.sdk.UsercentricsSDKImpl$applyMediationIfNeeded$2.1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            UsercentricsEvent.INSTANCE.getMediationConsentEvent$usercentrics_release().emit(MediationResultPayload.this);
                        }
                    });
                }
            });
        }
    }

    static /* synthetic */ void emitUpdatedConsentEvent$default(UsercentricsSDKImpl usercentricsSDKImpl, List list, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        usercentricsSDKImpl.emitUpdatedConsentEvent(list, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitUpdatedConsentEvent(List<UsercentricsServiceConsent> consentsList, String tcString, String acString) {
        final UpdatedConsentPayload updatedConsentPayload = new UpdatedConsentPayload(consentsList, getControllerId(), tcString, getUSPStringIfAvailable(), acString);
        this.application.getDispatcher().dispatchMain(new Function0<Unit>() { // from class: com.usercentrics.sdk.UsercentricsSDKImpl$emitUpdatedConsentEvent$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                UsercentricsEvent.INSTANCE.getUpdatedConsentEvent$usercentrics_release().emit(UpdatedConsentPayload.this);
            }
        });
    }

    private final String getUSPStringIfAvailable() {
        if (isCCPAEnabled()) {
            return getUSPData().getUspString();
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCCPAEnabled() {
        return this.application.getSettingsInstance().getValue().isCCPAEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void storeVariant(PredefinedUIVariant predefinedUIVariant, PredefinedUIViewSettings settings) {
        if (predefinedUIVariant == null) {
            predefinedUIVariant = settings.getFirstLayerV2().getLayout().toPredefinedUIVariant$usercentrics_release();
        }
        this.application.getPredefinedUIMediator().storeVariant(predefinedUIVariant);
    }
}
