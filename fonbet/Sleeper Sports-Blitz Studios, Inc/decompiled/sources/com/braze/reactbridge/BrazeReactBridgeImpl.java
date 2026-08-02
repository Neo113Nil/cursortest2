package com.braze.reactbridge;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.autofill.HintConstants;
import com.appsflyer.AppsFlyerProperties;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.Channel;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.events.BannersUpdatedEvent;
import com.braze.events.BrazePushEvent;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.IValueCallback;
import com.braze.models.Banner;
import com.braze.models.FeatureFlag;
import com.braze.models.IBrazeLocation;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageImmersiveBase;
import com.braze.models.inappmessage.MessageButton;
import com.braze.models.outgoing.AttributionData;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.reactbridge.BrazeReactBridgeImpl;
import com.braze.reactbridge.util.MapFactoryKt;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import com.braze.support.PermissionUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;
import com.braze.ui.activities.ContentCardsActivity;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.InAppMessageOperation;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageManagerListener;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import io.sentry.metrics.MetricsUnit;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: BrazeReactBridgeImpl.kt */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 Ñ\u00012\u00020\u0001:\u0004Ð\u0001Ñ\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010*\u001a\u00020+J\u0018\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010.J\u000e\u00100\u001a\u00020+2\u0006\u00101\u001a\u000202J\u0016\u00103\u001a\u00020+2\u0006\u00104\u001a\u00020.2\u0006\u00105\u001a\u00020.J\u000e\u00106\u001a\u00020+2\u0006\u00107\u001a\u00020.J\u0018\u00108\u001a\u00020+2\u0006\u00109\u001a\u00020.2\b\u0010:\u001a\u0004\u0018\u00010;J0\u0010<\u001a\u00020+2\u0006\u0010=\u001a\u00020.2\u0006\u0010>\u001a\u00020.2\u0006\u0010?\u001a\u00020.2\u0006\u0010@\u001a\u00020A2\b\u0010:\u001a\u0004\u0018\u00010;J \u0010B\u001a\u00020+2\u0006\u0010C\u001a\u00020.2\u0006\u0010D\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u000102J \u0010E\u001a\u00020+2\u0006\u0010C\u001a\u00020.2\u0006\u0010D\u001a\u00020F2\b\u00101\u001a\u0004\u0018\u000102J \u0010G\u001a\u00020+2\u0006\u0010C\u001a\u00020.2\u0006\u0010D\u001a\u00020A2\b\u00101\u001a\u0004\u0018\u000102J \u0010H\u001a\u00020+2\u0006\u0010C\u001a\u00020.2\u0006\u0010D\u001a\u00020I2\b\u00101\u001a\u0004\u0018\u000102J \u0010J\u001a\u00020+2\u0006\u0010C\u001a\u00020.2\u0006\u0010K\u001a\u00020A2\b\u00101\u001a\u0004\u0018\u000102J \u0010L\u001a\u00020+2\u0006\u0010C\u001a\u00020.2\u0006\u0010M\u001a\u00020A2\b\u00101\u001a\u0004\u0018\u000102J\u0018\u0010N\u001a\u00020+2\u0006\u0010C\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u000102J \u0010O\u001a\u00020+2\u0006\u0010C\u001a\u00020.2\u0006\u0010D\u001a\u00020P2\b\u00101\u001a\u0004\u0018\u000102J \u0010Q\u001a\u00020+2\u0006\u0010C\u001a\u00020.2\u0006\u0010D\u001a\u00020P2\b\u00101\u001a\u0004\u0018\u000102J,\u0010R\u001a\u00020+2\b\u0010C\u001a\u0004\u0018\u00010.2\b\u0010D\u001a\u0004\u0018\u00010;2\u0006\u0010S\u001a\u00020F2\b\u00101\u001a\u0004\u0018\u000102J \u0010T\u001a\u00020+2\u0006\u0010C\u001a\u00020.2\u0006\u0010D\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u000102J \u0010U\u001a\u00020+2\u0006\u0010C\u001a\u00020.2\u0006\u0010D\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u000102J\u0010\u0010V\u001a\u00020+2\b\u0010W\u001a\u0004\u0018\u00010.J\u0010\u0010X\u001a\u00020+2\b\u0010Y\u001a\u0004\u0018\u00010.J\u0010\u0010Z\u001a\u00020+2\b\u0010[\u001a\u0004\u0018\u00010.J\u001a\u0010\\\u001a\u00020+2\b\u0010]\u001a\u0004\u0018\u00010.2\b\u00101\u001a\u0004\u0018\u000102J\u001e\u0010^\u001a\u00020+2\u0006\u0010_\u001a\u00020A2\u0006\u0010`\u001a\u00020A2\u0006\u0010a\u001a\u00020AJ\u0010\u0010b\u001a\u00020+2\b\u0010c\u001a\u0004\u0018\u00010.J\u0010\u0010d\u001a\u00020+2\b\u0010e\u001a\u0004\u0018\u00010.J\u0010\u0010f\u001a\u00020+2\b\u0010g\u001a\u0004\u0018\u00010.J\u0010\u0010h\u001a\u00020+2\b\u0010i\u001a\u0004\u0018\u00010.J\u0018\u0010j\u001a\u00020+2\u0006\u0010k\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u000102J\u0018\u0010l\u001a\u00020+2\u0006\u0010k\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u000102J\u0018\u0010m\u001a\u00020+2\u0006\u0010n\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u000102J\u0018\u0010o\u001a\u00020+2\u0006\u0010n\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u000102J\u0016\u0010p\u001a\u00020+2\u0006\u0010q\u001a\u00020.2\u0006\u0010r\u001a\u00020sJ\u000e\u0010t\u001a\u00020+2\u0006\u0010u\u001a\u00020PJ\u000e\u0010v\u001a\u00020+2\u0006\u0010q\u001a\u00020.J\u0018\u0010w\u001a\u00020+2\u0006\u0010q\u001a\u00020.2\b\u0010x\u001a\u0004\u0018\u00010.J\u0015\u0010y\u001a\u00020+2\b\u0010z\u001a\u0004\u0018\u00010F¢\u0006\u0002\u0010{J\u0006\u0010|\u001a\u00020+J\u000e\u0010}\u001a\u00020+2\u0006\u0010r\u001a\u00020sJ\u000e\u0010~\u001a\u00020+2\u0006\u0010r\u001a\u00020sJ\u000e\u0010\u007f\u001a\u00020+2\u0006\u00107\u001a\u00020.J\u0012\u0010\u0080\u0001\u001a\u00020+2\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010;J\t\u0010\u0082\u0001\u001a\u00020+H\u0002J\t\u0010\u0083\u0001\u001a\u00020+H\u0002J\t\u0010\u0084\u0001\u001a\u00020+H\u0002J\t\u0010\u0085\u0001\u001a\u00020+H\u0002J\t\u0010\u0086\u0001\u001a\u00020+H\u0002J\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u00010.2\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001H\u0001¢\u0006\u0003\b\u008a\u0001J\u0010\u0010\u008b\u0001\u001a\u00020+2\u0007\u0010\u008c\u0001\u001a\u00020.J\u0010\u0010\u008d\u0001\u001a\u00020+2\u0007\u0010\u008c\u0001\u001a\u00020.J\u0010\u0010\u008e\u0001\u001a\u00020+2\u0007\u0010\u008c\u0001\u001a\u00020.J\u0010\u0010\u008f\u0001\u001a\u00020+2\u0007\u0010\u008c\u0001\u001a\u00020.J\u0007\u0010\u0090\u0001\u001a\u00020+J\u0007\u0010\u0091\u0001\u001a\u00020+J\u0007\u0010\u0092\u0001\u001a\u00020+J\u0007\u0010\u0093\u0001\u001a\u00020+J\u001b\u0010\u0094\u0001\u001a\u00020+2\b\u0010\u0095\u0001\u001a\u00030\u0096\u00012\b\u0010\u0097\u0001\u001a\u00030\u0096\u0001J-\u0010\u0098\u0001\u001a\u00020+2\u0006\u0010C\u001a\u00020.2\b\u0010\u0095\u0001\u001a\u00030\u0096\u00012\b\u0010\u0097\u0001\u001a\u00030\u0096\u00012\b\u00101\u001a\u0004\u0018\u000102JE\u0010\u0099\u0001\u001a\u00020+2\b\u0010\u0095\u0001\u001a\u00030\u0096\u00012\b\u0010\u0097\u0001\u001a\u00030\u0096\u00012\n\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0096\u00012\n\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0096\u00012\n\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u0096\u0001¢\u0006\u0003\u0010\u009d\u0001J\u0010\u0010\u009e\u0001\u001a\u00020+2\u0007\u0010\u009f\u0001\u001a\u00020FJ\u0007\u0010 \u0001\u001a\u00020+J\u0010\u0010¡\u0001\u001a\u00020+2\u0007\u0010¢\u0001\u001a\u00020.J\u0018\u0010£\u0001\u001a\u0004\u0018\u00010F2\u0007\u0010¢\u0001\u001a\u00020.¢\u0006\u0003\u0010¤\u0001J\u0018\u0010¥\u0001\u001a\u00020+2\u0007\u0010¢\u0001\u001a\u00020.2\u0006\u0010x\u001a\u00020AJ\u0018\u0010¦\u0001\u001a\u00020+2\u0007\u0010¢\u0001\u001a\u00020.2\u0006\u0010x\u001a\u00020AJ\u001e\u0010§\u0001\u001a\u0005\u0018\u00010¨\u00012\b\u0010©\u0001\u001a\u00030ª\u00012\u0006\u0010x\u001a\u00020AH\u0002J\u001d\u0010«\u0001\u001a\u00020+2\b\u0010¬\u0001\u001a\u00030¨\u00012\b\u0010©\u0001\u001a\u00030ª\u0001H\u0002J\u001d\u0010\u00ad\u0001\u001a\u00020+2\b\u0010¬\u0001\u001a\u00030¨\u00012\b\u0010©\u0001\u001a\u00030ª\u0001H\u0002J3\u0010®\u0001\u001a\u00020+2\t\u0010¯\u0001\u001a\u0004\u0018\u00010.2\t\u0010°\u0001\u001a\u0004\u0018\u00010.2\t\u0010±\u0001\u001a\u0004\u0018\u00010.2\t\u0010²\u0001\u001a\u0004\u0018\u00010.J\u000f\u0010³\u0001\u001a\u00020+2\u0006\u00101\u001a\u000202J\u000f\u0010´\u0001\u001a\u00020+2\u0006\u00101\u001a\u000202J2\u0010µ\u0001\u001a\u00020+2'\u0010¶\u0001\u001a\"\u0012\u0017\u0012\u00150¸\u0001¢\u0006\u000f\b¹\u0001\u0012\n\bº\u0001\u0012\u0005\b\b(»\u0001\u0012\u0004\u0012\u00020+0·\u0001H\u0002J\u000f\u0010¼\u0001\u001a\u00020+2\u0006\u00109\u001a\u00020.J\u0010\u0010½\u0001\u001a\u00020+2\u0007\u0010¾\u0001\u001a\u00020AJ\u0012\u0010¿\u0001\u001a\u00020+2\u0007\u0010À\u0001\u001a\u00020\u0017H\u0002J\u0014\u0010Á\u0001\u001a\u0004\u0018\u00010\u000e2\u0007\u0010\u008c\u0001\u001a\u00020.H\u0002J\u000f\u0010Â\u0001\u001a\u00020+2\u0006\u0010r\u001a\u00020sJ\u0018\u0010Ã\u0001\u001a\u00020+2\u0007\u0010\u008c\u0001\u001a\u00020.2\u0006\u0010r\u001a\u00020sJ\u0007\u0010Ä\u0001\u001a\u00020+J\u0010\u0010Å\u0001\u001a\u00020+2\u0007\u0010\u008c\u0001\u001a\u00020.J \u0010Æ\u0001\u001a\u00020+2\u0007\u0010\u008c\u0001\u001a\u00020.2\u0006\u0010C\u001a\u00020.2\u0006\u0010r\u001a\u00020sJ \u0010Ç\u0001\u001a\u00020+2\u0007\u0010\u008c\u0001\u001a\u00020.2\u0006\u0010C\u001a\u00020.2\u0006\u0010r\u001a\u00020sJ \u0010È\u0001\u001a\u00020+2\u0007\u0010\u008c\u0001\u001a\u00020.2\u0006\u0010C\u001a\u00020.2\u0006\u0010r\u001a\u00020sJ \u0010É\u0001\u001a\u00020+2\u0007\u0010\u008c\u0001\u001a\u00020.2\u0006\u0010C\u001a\u00020.2\u0006\u0010r\u001a\u00020sJ \u0010Ê\u0001\u001a\u00020+2\u0007\u0010\u008c\u0001\u001a\u00020.2\u0006\u0010C\u001a\u00020.2\u0006\u0010r\u001a\u00020sJ \u0010Ë\u0001\u001a\u00020+2\u0007\u0010\u008c\u0001\u001a\u00020.2\u0006\u0010C\u001a\u00020.2\u0006\u0010r\u001a\u00020sJ\u001b\u0010Ì\u0001\u001a\u00020+2\u0007\u0010Í\u0001\u001a\u00020F2\t\u0010Î\u0001\u001a\u0004\u0018\u00010.J\t\u0010Ï\u0001\u001a\u00020+H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0016X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0016X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0016X\u0082.¢\u0006\u0002\n\u0000R&\u0010 \u001a\u0004\u0018\u00010!8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b)\u0010%¨\u0006Ò\u0001"}, d2 = {"Lcom/braze/reactbridge/BrazeReactBridgeImpl;", "", "reactApplicationContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "currentActivity", "Landroid/app/Activity;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Landroid/app/Activity;)V", "getReactApplicationContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "getCurrentActivity", "()Landroid/app/Activity;", "contentCards", "", "Lcom/braze/models/cards/Card;", "contentCardsLock", "Ljava/util/concurrent/locks/ReentrantLock;", "contentCardsUpdatedAt", "", "inAppMessageDisplayOperation", "Lcom/braze/ui/inappmessage/InAppMessageOperation;", "contentCardsUpdatedSubscriber", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/ContentCardsUpdatedEvent;", "bannersUpdatedSubscriber", "Lcom/braze/events/BannersUpdatedEvent;", "sdkAuthErrorSubscriber", "Lcom/braze/events/BrazeSdkAuthenticationErrorEvent;", "pushNotificationEventSubscriber", "Lcom/braze/events/BrazePushEvent;", "featureFlagsUpdatedSubscriber", "Lcom/braze/events/FeatureFlagsUpdatedEvent;", "brazeTestingMock", "Lcom/braze/Braze;", "getBrazeTestingMock$braze_react_native_sdk_release$annotations", "()V", "getBrazeTestingMock$braze_react_native_sdk_release", "()Lcom/braze/Braze;", "setBrazeTestingMock$braze_react_native_sdk_release", "(Lcom/braze/Braze;)V", "braze", "getBraze", "requestImmediateDataFlush", "", "changeUser", "userName", "", "sdkAuthToken", "getUserId", "callback", "Lcom/facebook/react/bridge/Callback;", "addAlias", "aliasName", "aliasLabel", "registerPushToken", AnalyticsConstantsKt.KEY_TOKEN, "logCustomEvent", "eventName", "eventProperties", "Lcom/facebook/react/bridge/ReadableMap;", "logPurchase", "productIdentifier", FirebaseAnalytics.Param.PRICE, AppsFlyerProperties.CURRENCY_CODE, "quantity", "", "setStringCustomUserAttribute", SDKConstants.PARAM_KEY, "value", "setBoolCustomUserAttribute", "", "setIntCustomUserAttribute", "setDoubleCustomUserAttribute", "", "setDateCustomUserAttribute", "timeStamp", "incrementCustomUserAttribute", "incrementValue", "unsetCustomUserAttribute", "setCustomUserAttributeObjectArray", "Lcom/facebook/react/bridge/ReadableArray;", "setCustomUserAttributeArray", "setCustomUserAttributeObject", "merge", "addToCustomAttributeArray", "removeFromCustomAttributeArray", "setFirstName", "firstName", "setLastName", "lastName", "setEmail", "email", "setGender", HintConstants.AUTOFILL_HINT_GENDER, "setDateOfBirth", "year", "month", MetricsUnit.Duration.DAY, "setCountry", "country", "setHomeCity", "homeCity", "setPhoneNumber", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "setLanguage", "language", "addToSubscriptionGroup", "groupId", "removeFromSubscriptionGroup", "setPushNotificationSubscriptionType", "subscriptionType", "setEmailNotificationSubscriptionType", "getBanner", "placementId", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "requestBannersRefresh", "placementIds", "logBannerImpression", "logBannerClick", "buttonId", "launchContentCards", "dismissAutomaticallyOnCardClick", "(Ljava/lang/Boolean;)V", "requestContentCardsRefresh", "getContentCards", "getCachedContentCards", "setSdkAuthenticationSignature", "requestPushPermission", "options", "subscribeToContentCardsUpdatedEvent", "subscribeToBannersUpdatedEvent", "subscribeToFeatureFlagsUpdatedEvent", "subscribeToSdkAuthenticationErrorEvents", "subscribeToPushNotificationEvents", "getPushEventType", "eventType", "Lcom/braze/enums/BrazePushEventType;", "getPushEventType$braze_react_native_sdk_release", "logContentCardDismissed", "id", "logContentCardClicked", "logContentCardImpression", "processContentCardClickAction", "wipeData", "disableSDK", "enableSDK", "requestLocationInitialization", "requestGeofences", "latitude", "", "longitude", "setLocationCustomAttribute", "setLastKnownLocation", IBrazeLocation.ALTITUDE, "horizontalAccuracy", "verticalAccuracy", "(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "subscribeToInAppMessage", "useBrazeUI", "hideCurrentInAppMessage", "logInAppMessageClicked", "inAppMessageString", "logInAppMessageImpression", "(Ljava/lang/String;)Ljava/lang/Boolean;", "logInAppMessageButtonClicked", "performInAppMessageAction", "getInAppMessageActionData", "Lcom/braze/reactbridge/BrazeReactBridgeImpl$InAppMessageActionData;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "executeInAppMessageAction", "actionData", "executeUriAction", "setAttributionData", "network", "campaign", "adGroup", "creative", "getDeviceId", "getInitialPushPayload", "runOnUser", "block", "Lkotlin/Function1;", "Lcom/braze/BrazeUser;", "Lkotlin/ParameterName;", "name", "user", "addListener", "removeListeners", "count", "updateContentCardsIfNeeded", "event", "getContentCardById", "getAllFeatureFlags", "getFeatureFlag", "refreshFeatureFlags", "logFeatureFlagImpression", "getFeatureFlagBooleanProperty", "getFeatureFlagStringProperty", "getFeatureFlagNumberProperty", "getFeatureFlagTimestampProperty", "getFeatureFlagJSONProperty", "getFeatureFlagImageProperty", "setAdTrackingEnabled", "adTrackingEnabled", "googleAdvertisingId", "setDefaultInAppMessageListener", "InAppMessageActionData", "Companion", "braze_react-native-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BrazeReactBridgeImpl {
    private static final String BANNER_CARDS_UPDATED_EVENT_NAME = "bannerCardsUpdated";
    private static final String CONTENT_CARDS_UPDATED_EVENT_NAME = "contentCardsUpdated";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FEATURE_FLAGS_UPDATED_EVENT_NAME = "featureFlagsUpdated";
    private static final String IN_APP_MESSAGE_RECEIVED_EVENT_NAME = "inAppMessageReceived";
    public static final String NAME = "BrazeReactBridge";
    private static final String PUSH_NOTIFICATION_EVENT_NAME = "pushNotificationEvent";
    private static final String SDK_AUTH_ERROR_EVENT_NAME = "sdkAuthenticationError";
    private IEventSubscriber<BannersUpdatedEvent> bannersUpdatedSubscriber;
    private Braze brazeTestingMock;
    private final List<Card> contentCards;
    private final ReentrantLock contentCardsLock;
    private long contentCardsUpdatedAt;
    private IEventSubscriber<ContentCardsUpdatedEvent> contentCardsUpdatedSubscriber;
    private final Activity currentActivity;
    private IEventSubscriber<FeatureFlagsUpdatedEvent> featureFlagsUpdatedSubscriber;
    private InAppMessageOperation inAppMessageDisplayOperation;
    private IEventSubscriber<BrazePushEvent> pushNotificationEventSubscriber;
    private final ReactApplicationContext reactApplicationContext;
    private IEventSubscriber<BrazeSdkAuthenticationErrorEvent> sdkAuthErrorSubscriber;

    /* compiled from: BrazeReactBridgeImpl.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BrazePushEventType.values().length];
            try {
                iArr[BrazePushEventType.NOTIFICATION_RECEIVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrazePushEventType.NOTIFICATION_OPENED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ClickAction.values().length];
            try {
                iArr2[ClickAction.URI.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ void getBrazeTestingMock$braze_react_native_sdk_release$annotations() {
    }

    public final void removeListeners(int count) {
    }

    public BrazeReactBridgeImpl(ReactApplicationContext reactApplicationContext, Activity activity) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        this.reactApplicationContext = reactApplicationContext;
        this.currentActivity = activity;
        this.contentCards = new ArrayList();
        this.contentCardsLock = new ReentrantLock();
        this.inAppMessageDisplayOperation = InAppMessageOperation.DISPLAY_NOW;
        subscribeToContentCardsUpdatedEvent();
        subscribeToBannersUpdatedEvent();
        subscribeToSdkAuthenticationErrorEvents();
        subscribeToFeatureFlagsUpdatedEvent();
    }

    public final ReactApplicationContext getReactApplicationContext() {
        return this.reactApplicationContext;
    }

    public final Activity getCurrentActivity() {
        return this.currentActivity;
    }

    /* renamed from: getBrazeTestingMock$braze_react_native_sdk_release, reason: from getter */
    public final Braze getBrazeTestingMock() {
        return this.brazeTestingMock;
    }

    public final void setBrazeTestingMock$braze_react_native_sdk_release(Braze braze) {
        this.brazeTestingMock = braze;
    }

    public final Braze getBraze() {
        Braze braze = this.brazeTestingMock;
        return braze == null ? Braze.INSTANCE.getInstance(this.reactApplicationContext) : braze;
    }

    public final void requestImmediateDataFlush() {
        getBraze().requestImmediateDataFlush();
    }

    public final void changeUser(String userName, String sdkAuthToken) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        getBraze().changeUser(userName, sdkAuthToken);
    }

    public final void getUserId(final Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda47
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit userId$lambda$0;
                userId$lambda$0 = BrazeReactBridgeImpl.getUserId$lambda$0(Callback.this, (BrazeUser) obj);
                return userId$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserId$lambda$0(Callback callback, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!StringsKt.isBlank(it.getUserId())) {
            Companion.reportResult$default(INSTANCE, callback, it.getUserId(), null, 2, null);
        } else {
            INSTANCE.reportResult(callback, null, "User ID not found.");
        }
        return Unit.INSTANCE;
    }

    public final void addAlias(final String aliasName, final String aliasLabel) {
        Intrinsics.checkNotNullParameter(aliasName, "aliasName");
        Intrinsics.checkNotNullParameter(aliasLabel, "aliasLabel");
        if (StringsKt.isBlank(aliasName)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addAlias$lambda$1;
                    addAlias$lambda$1 = BrazeReactBridgeImpl.addAlias$lambda$1();
                    return addAlias$lambda$1;
                }
            }, 6, (Object) null);
        } else if (StringsKt.isBlank(aliasLabel)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addAlias$lambda$2;
                    addAlias$lambda$2 = BrazeReactBridgeImpl.addAlias$lambda$2();
                    return addAlias$lambda$2;
                }
            }, 6, (Object) null);
        } else {
            runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit addAlias$lambda$3;
                    addAlias$lambda$3 = BrazeReactBridgeImpl.addAlias$lambda$3(aliasName, aliasLabel, (BrazeUser) obj);
                    return addAlias$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addAlias$lambda$1() {
        return "Invalid alias parameter: alias is required to be non-empty. Not adding alias.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addAlias$lambda$2() {
        return "Invalid label parameter: label is required to be non-empty. Not adding alias.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addAlias$lambda$3(String str, String str2, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.addAlias(str, str2);
        return Unit.INSTANCE;
    }

    public final void registerPushToken(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        getBraze().setRegisteredPushToken(token);
    }

    public final void logCustomEvent(String eventName, ReadableMap eventProperties) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        getBraze().logCustomEvent(eventName, INSTANCE.populateEventPropertiesFromReadableMap(eventProperties));
    }

    public final void logPurchase(String productIdentifier, String price, String currencyCode, int quantity, ReadableMap eventProperties) {
        Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        getBraze().logPurchase(productIdentifier, currencyCode, new BigDecimal(price), quantity, INSTANCE.populateEventPropertiesFromReadableMap(eventProperties));
    }

    public final void setStringCustomUserAttribute(final String key, final String value, final Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit stringCustomUserAttribute$lambda$4;
                stringCustomUserAttribute$lambda$4 = BrazeReactBridgeImpl.setStringCustomUserAttribute$lambda$4(Callback.this, key, value, (BrazeUser) obj);
                return stringCustomUserAttribute$lambda$4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setStringCustomUserAttribute$lambda$4(Callback callback, String str, String str2, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.setCustomUserAttribute(str, str2)), null, 2, null);
        return Unit.INSTANCE;
    }

    public final void setBoolCustomUserAttribute(final String key, final boolean value, final Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit boolCustomUserAttribute$lambda$5;
                boolCustomUserAttribute$lambda$5 = BrazeReactBridgeImpl.setBoolCustomUserAttribute$lambda$5(Callback.this, key, value, (BrazeUser) obj);
                return boolCustomUserAttribute$lambda$5;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setBoolCustomUserAttribute$lambda$5(Callback callback, String str, boolean z, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.setCustomUserAttribute(str, z)), null, 2, null);
        return Unit.INSTANCE;
    }

    public final void setIntCustomUserAttribute(final String key, final int value, final Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit intCustomUserAttribute$lambda$6;
                intCustomUserAttribute$lambda$6 = BrazeReactBridgeImpl.setIntCustomUserAttribute$lambda$6(Callback.this, key, value, (BrazeUser) obj);
                return intCustomUserAttribute$lambda$6;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setIntCustomUserAttribute$lambda$6(Callback callback, String str, int i, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.setCustomUserAttribute(str, i)), null, 2, null);
        return Unit.INSTANCE;
    }

    public final void setDoubleCustomUserAttribute(final String key, final float value, final Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit doubleCustomUserAttribute$lambda$7;
                doubleCustomUserAttribute$lambda$7 = BrazeReactBridgeImpl.setDoubleCustomUserAttribute$lambda$7(Callback.this, key, value, (BrazeUser) obj);
                return doubleCustomUserAttribute$lambda$7;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDoubleCustomUserAttribute$lambda$7(Callback callback, String str, float f, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.setCustomUserAttribute(str, f)), null, 2, null);
        return Unit.INSTANCE;
    }

    public final void setDateCustomUserAttribute(final String key, final int timeStamp, final Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit dateCustomUserAttribute$lambda$8;
                dateCustomUserAttribute$lambda$8 = BrazeReactBridgeImpl.setDateCustomUserAttribute$lambda$8(Callback.this, key, timeStamp, (BrazeUser) obj);
                return dateCustomUserAttribute$lambda$8;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDateCustomUserAttribute$lambda$8(Callback callback, String str, int i, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.setCustomUserAttributeToSecondsFromEpoch(str, i)), null, 2, null);
        return Unit.INSTANCE;
    }

    public final void incrementCustomUserAttribute(final String key, final int incrementValue, final Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit incrementCustomUserAttribute$lambda$9;
                incrementCustomUserAttribute$lambda$9 = BrazeReactBridgeImpl.incrementCustomUserAttribute$lambda$9(Callback.this, key, incrementValue, (BrazeUser) obj);
                return incrementCustomUserAttribute$lambda$9;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit incrementCustomUserAttribute$lambda$9(Callback callback, String str, int i, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.incrementCustomUserAttribute(str, i)), null, 2, null);
        return Unit.INSTANCE;
    }

    public final void unsetCustomUserAttribute(final String key, final Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit unsetCustomUserAttribute$lambda$10;
                unsetCustomUserAttribute$lambda$10 = BrazeReactBridgeImpl.unsetCustomUserAttribute$lambda$10(Callback.this, key, (BrazeUser) obj);
                return unsetCustomUserAttribute$lambda$10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unsetCustomUserAttribute$lambda$10(Callback callback, String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.unsetCustomUserAttribute(str)), null, 2, null);
        return Unit.INSTANCE;
    }

    public final void setCustomUserAttributeObjectArray(final String key, ReadableArray value, final Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        final JSONArray jSONArray = new JSONArray((Collection) INSTANCE.parseReadableArray(value));
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda50
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit customUserAttributeObjectArray$lambda$11;
                customUserAttributeObjectArray$lambda$11 = BrazeReactBridgeImpl.setCustomUserAttributeObjectArray$lambda$11(Callback.this, key, jSONArray, (BrazeUser) obj);
                return customUserAttributeObjectArray$lambda$11;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCustomUserAttributeObjectArray$lambda$11(Callback callback, String str, JSONArray jSONArray, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.setCustomUserAttribute(str, jSONArray)), null, 2, null);
        return Unit.INSTANCE;
    }

    public final void setCustomUserAttributeArray(final String key, ReadableArray value, final Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.size();
        final String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = value.getString(i);
        }
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit customUserAttributeArray$lambda$12;
                customUserAttributeArray$lambda$12 = BrazeReactBridgeImpl.setCustomUserAttributeArray$lambda$12(Callback.this, key, strArr, (BrazeUser) obj);
                return customUserAttributeArray$lambda$12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCustomUserAttributeArray$lambda$12(Callback callback, String str, String[] strArr, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.setCustomAttributeArray(str, strArr)), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttributeObject$lambda$13() {
        return "Key was null. Not logging setCustomUserAttributeObject.";
    }

    public final void setCustomUserAttributeObject(final String key, ReadableMap value, final boolean merge, final Callback callback) {
        if (key == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda44
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customUserAttributeObject$lambda$13;
                    customUserAttributeObject$lambda$13 = BrazeReactBridgeImpl.setCustomUserAttributeObject$lambda$13();
                    return customUserAttributeObject$lambda$13;
                }
            }, 7, (Object) null);
        } else if (value == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda55
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customUserAttributeObject$lambda$14;
                    customUserAttributeObject$lambda$14 = BrazeReactBridgeImpl.setCustomUserAttributeObject$lambda$14();
                    return customUserAttributeObject$lambda$14;
                }
            }, 7, (Object) null);
        } else {
            final JSONObject jSONObject = new JSONObject(INSTANCE.parseReadableMap(value));
            runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda56
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit customUserAttributeObject$lambda$15;
                    customUserAttributeObject$lambda$15 = BrazeReactBridgeImpl.setCustomUserAttributeObject$lambda$15(Callback.this, key, jSONObject, merge, (BrazeUser) obj);
                    return customUserAttributeObject$lambda$15;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttributeObject$lambda$14() {
        return "Value was null. Not logging setCustomUserAttributeObject.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCustomUserAttributeObject$lambda$15(Callback callback, String str, JSONObject jSONObject, boolean z, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.setCustomAttribute(str, jSONObject, z)), null, 2, null);
        return Unit.INSTANCE;
    }

    public final void addToCustomAttributeArray(final String key, final String value, final Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda51
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit addToCustomAttributeArray$lambda$16;
                addToCustomAttributeArray$lambda$16 = BrazeReactBridgeImpl.addToCustomAttributeArray$lambda$16(Callback.this, key, value, (BrazeUser) obj);
                return addToCustomAttributeArray$lambda$16;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addToCustomAttributeArray$lambda$16(Callback callback, String str, String str2, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.addToCustomAttributeArray(str, str2)), null, 2, null);
        return Unit.INSTANCE;
    }

    public final void removeFromCustomAttributeArray(final String key, final String value, final Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit removeFromCustomAttributeArray$lambda$17;
                removeFromCustomAttributeArray$lambda$17 = BrazeReactBridgeImpl.removeFromCustomAttributeArray$lambda$17(Callback.this, key, value, (BrazeUser) obj);
                return removeFromCustomAttributeArray$lambda$17;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeFromCustomAttributeArray$lambda$17(Callback callback, String str, String str2, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.removeFromCustomAttributeArray(str, str2)), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setFirstName$lambda$18(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setFirstName(str);
        return Unit.INSTANCE;
    }

    public final void setFirstName(final String firstName) {
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit firstName$lambda$18;
                firstName$lambda$18 = BrazeReactBridgeImpl.setFirstName$lambda$18(firstName, (BrazeUser) obj);
                return firstName$lambda$18;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLastName$lambda$19(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setLastName(str);
        return Unit.INSTANCE;
    }

    public final void setLastName(final String lastName) {
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit lastName$lambda$19;
                lastName$lambda$19 = BrazeReactBridgeImpl.setLastName$lambda$19(lastName, (BrazeUser) obj);
                return lastName$lambda$19;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setEmail$lambda$20(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setEmail(str);
        return Unit.INSTANCE;
    }

    public final void setEmail(final String email) {
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda54
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit email$lambda$20;
                email$lambda$20 = BrazeReactBridgeImpl.setEmail$lambda$20(email, (BrazeUser) obj);
                return email$lambda$20;
            }
        });
    }

    public final void setGender(String gender, final Callback callback) {
        String str;
        Gender.Companion companion = Gender.INSTANCE;
        if (gender != null) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            str = gender.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        final Gender gender2 = companion.getGender(str);
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit gender$lambda$21;
                gender$lambda$21 = BrazeReactBridgeImpl.setGender$lambda$21(Callback.this, gender2, (BrazeUser) obj);
                return gender$lambda$21;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setGender$lambda$21(Callback callback, Gender gender, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.setGender(gender)), null, 2, null);
        return Unit.INSTANCE;
    }

    public final void setDateOfBirth(final int year, final int month, final int day) {
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit dateOfBirth$lambda$23;
                dateOfBirth$lambda$23 = BrazeReactBridgeImpl.setDateOfBirth$lambda$23(month, year, day, this, (BrazeUser) obj);
                return dateOfBirth$lambda$23;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDateOfBirth$lambda$23(int i, int i2, int i3, BrazeReactBridgeImpl brazeReactBridgeImpl, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Month month = Month.INSTANCE.getMonth(i - 1);
        if (month != null) {
            it.setDateOfBirth(i2, month, i3);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeReactBridgeImpl, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda46
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String dateOfBirth$lambda$23$lambda$22;
                    dateOfBirth$lambda$23$lambda$22 = BrazeReactBridgeImpl.setDateOfBirth$lambda$23$lambda$22();
                    return dateOfBirth$lambda$23$lambda$22;
                }
            }, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$23$lambda$22() {
        return "Invalid date of birth parameter: month is required to be within specified range. Not setting date of birth.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCountry$lambda$24(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setCountry(str);
        return Unit.INSTANCE;
    }

    public final void setCountry(final String country) {
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda52
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit country$lambda$24;
                country$lambda$24 = BrazeReactBridgeImpl.setCountry$lambda$24(country, (BrazeUser) obj);
                return country$lambda$24;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setHomeCity$lambda$25(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setHomeCity(str);
        return Unit.INSTANCE;
    }

    public final void setHomeCity(final String homeCity) {
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit homeCity$lambda$25;
                homeCity$lambda$25 = BrazeReactBridgeImpl.setHomeCity$lambda$25(homeCity, (BrazeUser) obj);
                return homeCity$lambda$25;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setPhoneNumber$lambda$26(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setPhoneNumber(str);
        return Unit.INSTANCE;
    }

    public final void setPhoneNumber(final String phoneNumber) {
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda59
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit phoneNumber$lambda$26;
                phoneNumber$lambda$26 = BrazeReactBridgeImpl.setPhoneNumber$lambda$26(phoneNumber, (BrazeUser) obj);
                return phoneNumber$lambda$26;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLanguage$lambda$27(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setLanguage(str);
        return Unit.INSTANCE;
    }

    public final void setLanguage(final String language) {
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit language$lambda$27;
                language$lambda$27 = BrazeReactBridgeImpl.setLanguage$lambda$27(language, (BrazeUser) obj);
                return language$lambda$27;
            }
        });
    }

    public final void addToSubscriptionGroup(final String groupId, final Callback callback) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit addToSubscriptionGroup$lambda$28;
                addToSubscriptionGroup$lambda$28 = BrazeReactBridgeImpl.addToSubscriptionGroup$lambda$28(Callback.this, groupId, (BrazeUser) obj);
                return addToSubscriptionGroup$lambda$28;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addToSubscriptionGroup$lambda$28(Callback callback, String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.addToSubscriptionGroup(str)), null, 2, null);
        return Unit.INSTANCE;
    }

    public final void removeFromSubscriptionGroup(final String groupId, final Callback callback) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit removeFromSubscriptionGroup$lambda$29;
                removeFromSubscriptionGroup$lambda$29 = BrazeReactBridgeImpl.removeFromSubscriptionGroup$lambda$29(Callback.this, groupId, (BrazeUser) obj);
                return removeFromSubscriptionGroup$lambda$29;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeFromSubscriptionGroup$lambda$29(Callback callback, String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.removeFromSubscriptionGroup(str)), null, 2, null);
        return Unit.INSTANCE;
    }

    public final void setPushNotificationSubscriptionType(String subscriptionType, final Callback callback) {
        Intrinsics.checkNotNullParameter(subscriptionType, "subscriptionType");
        Companion companion = INSTANCE;
        final NotificationSubscriptionType parseNotificationSubscriptionType = companion.parseNotificationSubscriptionType(subscriptionType);
        if (parseNotificationSubscriptionType == null) {
            Companion.reportResult$default(companion, callback, null, "Invalid subscription type " + subscriptionType + ". Push notification subscription type not set.", 1, null);
            return;
        }
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda53
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit pushNotificationSubscriptionType$lambda$30;
                pushNotificationSubscriptionType$lambda$30 = BrazeReactBridgeImpl.setPushNotificationSubscriptionType$lambda$30(Callback.this, parseNotificationSubscriptionType, (BrazeUser) obj);
                return pushNotificationSubscriptionType$lambda$30;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setPushNotificationSubscriptionType$lambda$30(Callback callback, NotificationSubscriptionType notificationSubscriptionType, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.setPushNotificationSubscriptionType(notificationSubscriptionType)), null, 2, null);
        return Unit.INSTANCE;
    }

    public final void setEmailNotificationSubscriptionType(String subscriptionType, final Callback callback) {
        Intrinsics.checkNotNullParameter(subscriptionType, "subscriptionType");
        Companion companion = INSTANCE;
        final NotificationSubscriptionType parseNotificationSubscriptionType = companion.parseNotificationSubscriptionType(subscriptionType);
        if (parseNotificationSubscriptionType == null) {
            Companion.reportResult$default(companion, callback, null, "Invalid subscription type " + subscriptionType + ". Email notification subscription type not set.", 1, null);
            return;
        }
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit emailNotificationSubscriptionType$lambda$31;
                emailNotificationSubscriptionType$lambda$31 = BrazeReactBridgeImpl.setEmailNotificationSubscriptionType$lambda$31(Callback.this, parseNotificationSubscriptionType, (BrazeUser) obj);
                return emailNotificationSubscriptionType$lambda$31;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setEmailNotificationSubscriptionType$lambda$31(Callback callback, NotificationSubscriptionType notificationSubscriptionType, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Companion.reportResult$default(INSTANCE, callback, Boolean.valueOf(it.setEmailNotificationSubscriptionType(notificationSubscriptionType)), null, 2, null);
        return Unit.INSTANCE;
    }

    public final void getBanner(String placementId, Promise promise) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Banner banner = getBraze().getBanner(placementId);
        if (banner != null) {
            promise.resolve(BannerUtilKt.mapBanner(banner));
        } else {
            promise.resolve(null);
        }
    }

    public final void requestBannersRefresh(ReadableArray placementIds) {
        Intrinsics.checkNotNullParameter(placementIds, "placementIds");
        ArrayList<Object> arrayList = placementIds.toArrayList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(String.valueOf(it.next()));
        }
        getBraze().requestBannersRefresh(arrayList2);
    }

    public final void logBannerImpression(String placementId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        getBraze().logBannerImpression(placementId);
    }

    public final void logBannerClick(String placementId, String buttonId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        getBraze().logBannerClick(placementId, buttonId);
    }

    public final void launchContentCards(Boolean dismissAutomaticallyOnCardClick) {
        Intent intent = new Intent(this.currentActivity, (Class<?>) ContentCardsActivity.class);
        intent.setFlags(872415232);
        this.reactApplicationContext.startActivity(intent);
    }

    public final void requestContentCardsRefresh() {
        getBraze().requestContentCardsRefresh();
    }

    public final void getContentCards(final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        getBraze().subscribeToContentCardsUpdates(new IEventSubscriber() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda6
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeReactBridgeImpl.getContentCards$lambda$34(Promise.this, this, (ContentCardsUpdatedEvent) obj);
            }
        });
        getBraze().requestContentCardsRefresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getContentCards$lambda$34(Promise promise, BrazeReactBridgeImpl brazeReactBridgeImpl, ContentCardsUpdatedEvent message) {
        Intrinsics.checkNotNullParameter(message, "message");
        promise.resolve(ContentCardUtilKt.mapContentCards(message.getAllCards()));
        brazeReactBridgeImpl.updateContentCardsIfNeeded(message);
    }

    public final void getCachedContentCards(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        ReentrantLock reentrantLock = this.contentCardsLock;
        reentrantLock.lock();
        try {
            promise.resolve(ContentCardUtilKt.mapContentCards(this.contentCards));
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setSdkAuthenticationSignature(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        getBraze().setSdkAuthenticationSignature(token);
    }

    public final void requestPushPermission(ReadableMap options) {
        PermissionUtils.requestPushPermissionPrompt(this.currentActivity);
    }

    private final void subscribeToContentCardsUpdatedEvent() {
        IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber = null;
        if (this.contentCardsUpdatedSubscriber != null) {
            Braze braze = getBraze();
            IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber2 = this.contentCardsUpdatedSubscriber;
            if (iEventSubscriber2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentCardsUpdatedSubscriber");
                iEventSubscriber2 = null;
            }
            braze.removeSingleSubscription(iEventSubscriber2, ContentCardsUpdatedEvent.class);
        }
        this.contentCardsUpdatedSubscriber = new IEventSubscriber() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda9
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeReactBridgeImpl.subscribeToContentCardsUpdatedEvent$lambda$36(BrazeReactBridgeImpl.this, (ContentCardsUpdatedEvent) obj);
            }
        };
        Braze braze2 = getBraze();
        IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber3 = this.contentCardsUpdatedSubscriber;
        if (iEventSubscriber3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentCardsUpdatedSubscriber");
        } else {
            iEventSubscriber = iEventSubscriber3;
        }
        braze2.subscribeToContentCardsUpdates(iEventSubscriber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToContentCardsUpdatedEvent$lambda$36(BrazeReactBridgeImpl brazeReactBridgeImpl, ContentCardsUpdatedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        WritableMap mutableMap = MapFactoryKt.getMutableMap();
        mutableMap.putArray("cards", ContentCardUtilKt.mapContentCards(event.getAllCards()));
        if (brazeReactBridgeImpl.reactApplicationContext.hasActiveReactInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) brazeReactBridgeImpl.reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(CONTENT_CARDS_UPDATED_EVENT_NAME, mutableMap);
        }
        brazeReactBridgeImpl.updateContentCardsIfNeeded(event);
    }

    private final void subscribeToBannersUpdatedEvent() {
        IEventSubscriber<BannersUpdatedEvent> iEventSubscriber = null;
        if (this.bannersUpdatedSubscriber != null) {
            Braze braze = getBraze();
            IEventSubscriber<BannersUpdatedEvent> iEventSubscriber2 = this.bannersUpdatedSubscriber;
            if (iEventSubscriber2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bannersUpdatedSubscriber");
                iEventSubscriber2 = null;
            }
            braze.removeSingleSubscription(iEventSubscriber2, BannersUpdatedEvent.class);
        }
        this.bannersUpdatedSubscriber = new IEventSubscriber() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda22
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeReactBridgeImpl.subscribeToBannersUpdatedEvent$lambda$37(BrazeReactBridgeImpl.this, (BannersUpdatedEvent) obj);
            }
        };
        Braze braze2 = getBraze();
        IEventSubscriber<BannersUpdatedEvent> iEventSubscriber3 = this.bannersUpdatedSubscriber;
        if (iEventSubscriber3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannersUpdatedSubscriber");
        } else {
            iEventSubscriber = iEventSubscriber3;
        }
        braze2.subscribeToBannersUpdates(iEventSubscriber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToBannersUpdatedEvent$lambda$37(BrazeReactBridgeImpl brazeReactBridgeImpl, BannersUpdatedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        WritableMap mutableMap = MapFactoryKt.getMutableMap();
        mutableMap.putArray("banners", BannerUtilKt.mapBanners(event.getBanners()));
        if (brazeReactBridgeImpl.reactApplicationContext.hasActiveReactInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) brazeReactBridgeImpl.reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(BANNER_CARDS_UPDATED_EVENT_NAME, mutableMap);
        }
    }

    private final void subscribeToFeatureFlagsUpdatedEvent() {
        IEventSubscriber<FeatureFlagsUpdatedEvent> iEventSubscriber = null;
        if (this.featureFlagsUpdatedSubscriber != null) {
            Braze braze = getBraze();
            IEventSubscriber<FeatureFlagsUpdatedEvent> iEventSubscriber2 = this.featureFlagsUpdatedSubscriber;
            if (iEventSubscriber2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("featureFlagsUpdatedSubscriber");
                iEventSubscriber2 = null;
            }
            braze.removeSingleSubscription(iEventSubscriber2, FeatureFlagsUpdatedEvent.class);
        }
        this.featureFlagsUpdatedSubscriber = new IEventSubscriber() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda19
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeReactBridgeImpl.subscribeToFeatureFlagsUpdatedEvent$lambda$39(BrazeReactBridgeImpl.this, (FeatureFlagsUpdatedEvent) obj);
            }
        };
        Braze braze2 = getBraze();
        IEventSubscriber<FeatureFlagsUpdatedEvent> iEventSubscriber3 = this.featureFlagsUpdatedSubscriber;
        if (iEventSubscriber3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("featureFlagsUpdatedSubscriber");
        } else {
            iEventSubscriber = iEventSubscriber3;
        }
        braze2.subscribeToFeatureFlagsUpdates(iEventSubscriber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToFeatureFlagsUpdatedEvent$lambda$39(BrazeReactBridgeImpl brazeReactBridgeImpl, FeatureFlagsUpdatedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        WritableArray mutableArray = MapFactoryKt.getMutableArray();
        Iterator<T> it = event.getFeatureFlags().iterator();
        while (it.hasNext()) {
            mutableArray.pushMap(FeatureFlagUtilKt.convertFeatureFlag((FeatureFlag) it.next()));
        }
        if (brazeReactBridgeImpl.reactApplicationContext.hasActiveReactInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) brazeReactBridgeImpl.reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(FEATURE_FLAGS_UPDATED_EVENT_NAME, mutableArray);
        }
    }

    private final void subscribeToSdkAuthenticationErrorEvents() {
        IEventSubscriber<BrazeSdkAuthenticationErrorEvent> iEventSubscriber = null;
        if (this.sdkAuthErrorSubscriber != null) {
            Braze braze = getBraze();
            IEventSubscriber<BrazeSdkAuthenticationErrorEvent> iEventSubscriber2 = this.sdkAuthErrorSubscriber;
            if (iEventSubscriber2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sdkAuthErrorSubscriber");
                iEventSubscriber2 = null;
            }
            braze.removeSingleSubscription(iEventSubscriber2, BrazeSdkAuthenticationErrorEvent.class);
        }
        this.sdkAuthErrorSubscriber = new IEventSubscriber() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda8
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeReactBridgeImpl.subscribeToSdkAuthenticationErrorEvents$lambda$40(BrazeReactBridgeImpl.this, (BrazeSdkAuthenticationErrorEvent) obj);
            }
        };
        Braze braze2 = getBraze();
        IEventSubscriber<BrazeSdkAuthenticationErrorEvent> iEventSubscriber3 = this.sdkAuthErrorSubscriber;
        if (iEventSubscriber3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sdkAuthErrorSubscriber");
        } else {
            iEventSubscriber = iEventSubscriber3;
        }
        braze2.subscribeToSdkAuthenticationFailures(iEventSubscriber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToSdkAuthenticationErrorEvents$lambda$40(BrazeReactBridgeImpl brazeReactBridgeImpl, BrazeSdkAuthenticationErrorEvent errorEvent) {
        Intrinsics.checkNotNullParameter(errorEvent, "errorEvent");
        if (brazeReactBridgeImpl.reactApplicationContext.hasActiveReactInstance()) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putInt("error_code", errorEvent.getErrorCode());
            writableNativeMap.putString("user_id", errorEvent.getUserId());
            writableNativeMap.putString("original_signature", errorEvent.getSignature());
            writableNativeMap.putString("error_reason", errorEvent.getErrorReason());
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) brazeReactBridgeImpl.reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(SDK_AUTH_ERROR_EVENT_NAME, writableNativeMap);
        }
    }

    private final void subscribeToPushNotificationEvents() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String subscribeToPushNotificationEvents$lambda$41;
                subscribeToPushNotificationEvents$lambda$41 = BrazeReactBridgeImpl.subscribeToPushNotificationEvents$lambda$41();
                return subscribeToPushNotificationEvents$lambda$41;
            }
        }, 6, (Object) null);
        if (!this.reactApplicationContext.hasActiveReactInstance()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String subscribeToPushNotificationEvents$lambda$42;
                    subscribeToPushNotificationEvents$lambda$42 = BrazeReactBridgeImpl.subscribeToPushNotificationEvents$lambda$42();
                    return subscribeToPushNotificationEvents$lambda$42;
                }
            }, 7, (Object) null);
            return;
        }
        IEventSubscriber<BrazePushEvent> iEventSubscriber = null;
        if (this.pushNotificationEventSubscriber != null) {
            Braze braze = getBraze();
            IEventSubscriber<BrazePushEvent> iEventSubscriber2 = this.pushNotificationEventSubscriber;
            if (iEventSubscriber2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pushNotificationEventSubscriber");
                iEventSubscriber2 = null;
            }
            braze.removeSingleSubscription(iEventSubscriber2, BrazePushEvent.class);
        }
        this.pushNotificationEventSubscriber = new IEventSubscriber() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda30
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeReactBridgeImpl.subscribeToPushNotificationEvents$lambda$44(BrazeReactBridgeImpl.this, (BrazePushEvent) obj);
            }
        };
        Braze braze2 = getBraze();
        IEventSubscriber<BrazePushEvent> iEventSubscriber3 = this.pushNotificationEventSubscriber;
        if (iEventSubscriber3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pushNotificationEventSubscriber");
        } else {
            iEventSubscriber = iEventSubscriber3;
        }
        braze2.subscribeToPushNotificationEvents(iEventSubscriber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToPushNotificationEvents$lambda$41() {
        return "subscribeToPushNotificationEvents called";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToPushNotificationEvents$lambda$42() {
        return "Cannot call subscribeToPushNotificationEvents without an active react instance";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToPushNotificationEvents$lambda$44(BrazeReactBridgeImpl brazeReactBridgeImpl, BrazePushEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String pushEventType$braze_react_native_sdk_release = brazeReactBridgeImpl.getPushEventType$braze_react_native_sdk_release(event.getEventType());
        if (pushEventType$braze_react_native_sdk_release == null) {
            return;
        }
        final WritableMap createPushNotificationMap$default = PushPayloadMapper.createPushNotificationMap$default(event.getNotificationPayload(), pushEventType$braze_react_native_sdk_release, null, null, 12, null);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeReactBridgeImpl, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String subscribeToPushNotificationEvents$lambda$44$lambda$43;
                subscribeToPushNotificationEvents$lambda$44$lambda$43 = BrazeReactBridgeImpl.subscribeToPushNotificationEvents$lambda$44$lambda$43(WritableMap.this);
                return subscribeToPushNotificationEvents$lambda$44$lambda$43;
            }
        }, 7, (Object) null);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) brazeReactBridgeImpl.reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(PUSH_NOTIFICATION_EVENT_NAME, createPushNotificationMap$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToPushNotificationEvents$lambda$44$lambda$43(WritableMap writableMap) {
        return "Sending push notification event with data " + writableMap;
    }

    public final String getPushEventType$braze_react_native_sdk_release(BrazePushEventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        int i = WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
        if (i == 1) {
            return "push_received";
        }
        if (i != 2) {
            return null;
        }
        return "push_opened";
    }

    public final void logContentCardDismissed(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Card contentCardById = getContentCardById(id);
        if (contentCardById != null) {
            contentCardById.setDismissed(true);
        }
    }

    public final void logContentCardClicked(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Card contentCardById = getContentCardById(id);
        if (contentCardById != null) {
            contentCardById.logClick();
        }
    }

    public final void logContentCardImpression(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Card contentCardById = getContentCardById(id);
        if (contentCardById != null) {
            contentCardById.logImpression();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processContentCardClickAction$lambda$45(String str) {
        return "Processing content card action " + str;
    }

    public final void processContentCardClickAction(final String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String processContentCardClickAction$lambda$45;
                processContentCardClickAction$lambda$45 = BrazeReactBridgeImpl.processContentCardClickAction$lambda$45(id);
                return processContentCardClickAction$lambda$45;
            }
        }, 6, (Object) null);
        Card contentCardById = getContentCardById(id);
        if (contentCardById != null) {
            Bundle bundle = new Bundle();
            for (String str : contentCardById.getExtras().keySet()) {
                bundle.putString(str, contentCardById.getExtras().get(str));
            }
            String url = contentCardById.getUrl();
            if (url == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String processContentCardClickAction$lambda$46;
                        processContentCardClickAction$lambda$46 = BrazeReactBridgeImpl.processContentCardClickAction$lambda$46();
                        return processContentCardClickAction$lambda$46;
                    }
                }, 6, (Object) null);
                return;
            }
            UriAction createUriActionFromUrlString = BrazeDeeplinkHandler.INSTANCE.getInstance().createUriActionFromUrlString(url, bundle, contentCardById.getOpenUriInWebView(), Channel.CONTENT_CARD);
            if (createUriActionFromUrlString != null) {
                BrazeDeeplinkHandler.INSTANCE.getInstance().gotoUri(this.reactApplicationContext, createUriActionFromUrlString);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processContentCardClickAction$lambda$46() {
        return "Card URL is null, returning null for getUriActionForCard";
    }

    public final void wipeData() {
        Braze.INSTANCE.wipeData(this.reactApplicationContext);
    }

    public final void disableSDK() {
        Braze.INSTANCE.disableSdk(this.reactApplicationContext);
    }

    public final void enableSDK() {
        Braze.INSTANCE.enableSdk(this.reactApplicationContext);
    }

    public final void requestLocationInitialization() {
        getBraze().requestLocationInitialization();
    }

    public final void requestGeofences(double latitude, double longitude) {
        getBraze().requestGeofences(latitude, longitude);
    }

    public final void setLocationCustomAttribute(final String key, final double latitude, final double longitude, final Callback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda49
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit locationCustomAttribute$lambda$47;
                locationCustomAttribute$lambda$47 = BrazeReactBridgeImpl.setLocationCustomAttribute$lambda$47(key, latitude, longitude, callback, (BrazeUser) obj);
                return locationCustomAttribute$lambda$47;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLocationCustomAttribute$lambda$47(String str, double d, double d2, Callback callback, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setLocationCustomAttribute(str, d, d2);
        Companion.reportResult$default(INSTANCE, callback, true, null, 2, null);
        return Unit.INSTANCE;
    }

    public final void setLastKnownLocation(final double latitude, final double longitude, final Double altitude, final Double horizontalAccuracy, final Double verticalAccuracy) {
        runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit lastKnownLocation$lambda$51;
                lastKnownLocation$lambda$51 = BrazeReactBridgeImpl.setLastKnownLocation$lambda$51(horizontalAccuracy, verticalAccuracy, altitude, latitude, longitude, (BrazeUser) obj);
                return lastKnownLocation$lambda$51;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLastKnownLocation$lambda$51(Double d, Double d2, Double d3, double d4, double d5, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (d != null && d.doubleValue() < 0.0d) {
            d = null;
        }
        if (d2 != null && d2.doubleValue() < 0.0d) {
            d2 = null;
        }
        it.setLastKnownLocation(d4, d5, d2 == null ? null : d3, d, d2);
        return Unit.INSTANCE;
    }

    public final void subscribeToInAppMessage(boolean useBrazeUI) {
        InAppMessageOperation inAppMessageOperation;
        if (useBrazeUI) {
            inAppMessageOperation = InAppMessageOperation.DISPLAY_NOW;
        } else {
            inAppMessageOperation = InAppMessageOperation.DISPLAY_LATER;
        }
        this.inAppMessageDisplayOperation = inAppMessageOperation;
        setDefaultInAppMessageListener();
    }

    public final void hideCurrentInAppMessage() {
        BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    public final void logInAppMessageClicked(String inAppMessageString) {
        Intrinsics.checkNotNullParameter(inAppMessageString, "inAppMessageString");
        IInAppMessage deserializeInAppMessageString = getBraze().deserializeInAppMessageString(inAppMessageString);
        if (deserializeInAppMessageString != null) {
            deserializeInAppMessageString.logClick();
        }
    }

    public final Boolean logInAppMessageImpression(String inAppMessageString) {
        Intrinsics.checkNotNullParameter(inAppMessageString, "inAppMessageString");
        IInAppMessage deserializeInAppMessageString = getBraze().deserializeInAppMessageString(inAppMessageString);
        if (deserializeInAppMessageString != null) {
            return Boolean.valueOf(deserializeInAppMessageString.logImpression());
        }
        return null;
    }

    public final void logInAppMessageButtonClicked(String inAppMessageString, int buttonId) {
        Object obj;
        Intrinsics.checkNotNullParameter(inAppMessageString, "inAppMessageString");
        IInAppMessage deserializeInAppMessageString = getBraze().deserializeInAppMessageString(inAppMessageString);
        if (deserializeInAppMessageString instanceof InAppMessageImmersiveBase) {
            InAppMessageImmersiveBase inAppMessageImmersiveBase = (InAppMessageImmersiveBase) deserializeInAppMessageString;
            Iterator<T> it = inAppMessageImmersiveBase.getMessageButtons().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((MessageButton) obj).getId() == buttonId) {
                        break;
                    }
                }
            }
            MessageButton messageButton = (MessageButton) obj;
            if (messageButton != null) {
                inAppMessageImmersiveBase.logButtonClick(messageButton);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String performInAppMessageAction$lambda$54(String str) {
        return "Processing in-app message action " + str;
    }

    public final void performInAppMessageAction(final String inAppMessageString, int buttonId) {
        Intrinsics.checkNotNullParameter(inAppMessageString, "inAppMessageString");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String performInAppMessageAction$lambda$54;
                performInAppMessageAction$lambda$54 = BrazeReactBridgeImpl.performInAppMessageAction$lambda$54(inAppMessageString);
                return performInAppMessageAction$lambda$54;
            }
        }, 6, (Object) null);
        IInAppMessage deserializeInAppMessageString = getBraze().deserializeInAppMessageString(inAppMessageString);
        Activity activity = this.currentActivity;
        InAppMessageActionData inAppMessageActionData = (deserializeInAppMessageString == null || activity == null) ? null : getInAppMessageActionData(deserializeInAppMessageString, buttonId);
        if (deserializeInAppMessageString != null && activity != null && inAppMessageActionData != null) {
            executeInAppMessageAction(inAppMessageActionData, deserializeInAppMessageString);
        } else if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String performInAppMessageAction$lambda$55;
                    performInAppMessageAction$lambda$55 = BrazeReactBridgeImpl.performInAppMessageAction$lambda$55();
                    return performInAppMessageAction$lambda$55;
                }
            }, 6, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String performInAppMessageAction$lambda$55() {
        return "Can't perform click action because the cached activity is null.";
    }

    private final InAppMessageActionData getInAppMessageActionData(IInAppMessage inAppMessage, int buttonId) {
        Object obj;
        if (buttonId < 0) {
            return new InAppMessageActionData(inAppMessage.getInternalClickAction(), inAppMessage.getInternalUri(), inAppMessage.getOpenUriInWebView());
        }
        if (!(inAppMessage instanceof InAppMessageImmersiveBase)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String inAppMessageActionData$lambda$57;
                    inAppMessageActionData$lambda$57 = BrazeReactBridgeImpl.getInAppMessageActionData$lambda$57();
                    return inAppMessageActionData$lambda$57;
                }
            }, 7, (Object) null);
            return null;
        }
        Iterator<T> it = ((InAppMessageImmersiveBase) inAppMessage).getMessageButtons().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((MessageButton) obj).getId() == buttonId) {
                break;
            }
        }
        MessageButton messageButton = (MessageButton) obj;
        return new InAppMessageActionData(messageButton != null ? messageButton.getClickAction() : null, messageButton != null ? messageButton.getUri() : null, messageButton != null ? messageButton.getOpenUriInWebview() : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getInAppMessageActionData$lambda$57() {
        return "Cannot perform IAM action because button was not null but message is not InAppMessageImmersiveBase";
    }

    private final void executeInAppMessageAction(final InAppMessageActionData actionData, IInAppMessage inAppMessage) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String executeInAppMessageAction$lambda$58;
                executeInAppMessageAction$lambda$58 = BrazeReactBridgeImpl.executeInAppMessageAction$lambda$58(BrazeReactBridgeImpl.InAppMessageActionData.this);
                return executeInAppMessageAction$lambda$58;
            }
        }, 7, (Object) null);
        ClickAction clickAction = actionData.getClickAction();
        if ((clickAction == null ? -1 : WhenMappings.$EnumSwitchMapping$1[clickAction.ordinal()]) == 1) {
            executeUriAction(actionData, inAppMessage);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String executeInAppMessageAction$lambda$59;
                    executeInAppMessageAction$lambda$59 = BrazeReactBridgeImpl.executeInAppMessageAction$lambda$59(BrazeReactBridgeImpl.InAppMessageActionData.this);
                    return executeInAppMessageAction$lambda$59;
                }
            }, 7, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String executeInAppMessageAction$lambda$58(InAppMessageActionData inAppMessageActionData) {
        return "GOT ACTION: " + inAppMessageActionData.getClickUri() + ", " + inAppMessageActionData.getOpenUriInWebView() + ", " + inAppMessageActionData.getClickAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String executeInAppMessageAction$lambda$59(InAppMessageActionData inAppMessageActionData) {
        return "Unhandled action " + inAppMessageActionData.getClickAction();
    }

    private final void executeUriAction(final InAppMessageActionData actionData, IInAppMessage inAppMessage) {
        final Uri clickUri = actionData.getClickUri();
        if (clickUri == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda36
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String executeUriAction$lambda$61$lambda$60;
                    executeUriAction$lambda$61$lambda$60 = BrazeReactBridgeImpl.executeUriAction$lambda$61$lambda$60();
                    return executeUriAction$lambda$61$lambda$60;
                }
            }, 7, (Object) null);
            return;
        }
        UriAction createUriActionFromUri = BrazeDeeplinkHandler.INSTANCE.getInstance().createUriActionFromUri(clickUri, BundleUtils.toBundle(inAppMessage.getExtras()), actionData.getOpenUriInWebView(), Channel.INAPP_MESSAGE);
        if (!this.reactApplicationContext.hasActiveReactInstance()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String executeUriAction$lambda$62;
                    executeUriAction$lambda$62 = BrazeReactBridgeImpl.executeUriAction$lambda$62();
                    return executeUriAction$lambda$62;
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String executeUriAction$lambda$63;
                    executeUriAction$lambda$63 = BrazeReactBridgeImpl.executeUriAction$lambda$63(clickUri, actionData);
                    return executeUriAction$lambda$63;
                }
            }, 6, (Object) null);
            BrazeDeeplinkHandler.INSTANCE.getInstance().gotoUri(this.reactApplicationContext, createUriActionFromUri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String executeUriAction$lambda$61$lambda$60() {
        return "clickUri is null, not performing click action";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String executeUriAction$lambda$62() {
        return "reactApplicationContext instance not active, not performing click action";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String executeUriAction$lambda$63(Uri uri, InAppMessageActionData inAppMessageActionData) {
        return "Performing gotoUri " + uri + " " + inAppMessageActionData.getOpenUriInWebView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BrazeReactBridgeImpl.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/braze/reactbridge/BrazeReactBridgeImpl$InAppMessageActionData;", "", "clickAction", "Lcom/braze/enums/inappmessage/ClickAction;", "clickUri", "Landroid/net/Uri;", "openUriInWebView", "", "<init>", "(Lcom/braze/enums/inappmessage/ClickAction;Landroid/net/Uri;Z)V", "getClickAction", "()Lcom/braze/enums/inappmessage/ClickAction;", "getClickUri", "()Landroid/net/Uri;", "getOpenUriInWebView", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "braze_react-native-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final /* data */ class InAppMessageActionData {
        private final ClickAction clickAction;
        private final Uri clickUri;
        private final boolean openUriInWebView;

        public static /* synthetic */ InAppMessageActionData copy$default(InAppMessageActionData inAppMessageActionData, ClickAction clickAction, Uri uri, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                clickAction = inAppMessageActionData.clickAction;
            }
            if ((i & 2) != 0) {
                uri = inAppMessageActionData.clickUri;
            }
            if ((i & 4) != 0) {
                z = inAppMessageActionData.openUriInWebView;
            }
            return inAppMessageActionData.copy(clickAction, uri, z);
        }

        /* renamed from: component1, reason: from getter */
        public final ClickAction getClickAction() {
            return this.clickAction;
        }

        /* renamed from: component2, reason: from getter */
        public final Uri getClickUri() {
            return this.clickUri;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getOpenUriInWebView() {
            return this.openUriInWebView;
        }

        public final InAppMessageActionData copy(ClickAction clickAction, Uri clickUri, boolean openUriInWebView) {
            return new InAppMessageActionData(clickAction, clickUri, openUriInWebView);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InAppMessageActionData)) {
                return false;
            }
            InAppMessageActionData inAppMessageActionData = (InAppMessageActionData) other;
            return this.clickAction == inAppMessageActionData.clickAction && Intrinsics.areEqual(this.clickUri, inAppMessageActionData.clickUri) && this.openUriInWebView == inAppMessageActionData.openUriInWebView;
        }

        public int hashCode() {
            ClickAction clickAction = this.clickAction;
            int hashCode = (clickAction == null ? 0 : clickAction.hashCode()) * 31;
            Uri uri = this.clickUri;
            return ((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + Boolean.hashCode(this.openUriInWebView);
        }

        public String toString() {
            return "InAppMessageActionData(clickAction=" + this.clickAction + ", clickUri=" + this.clickUri + ", openUriInWebView=" + this.openUriInWebView + ")";
        }

        public InAppMessageActionData(ClickAction clickAction, Uri uri, boolean z) {
            this.clickAction = clickAction;
            this.clickUri = uri;
            this.openUriInWebView = z;
        }

        public final ClickAction getClickAction() {
            return this.clickAction;
        }

        public final Uri getClickUri() {
            return this.clickUri;
        }

        public final boolean getOpenUriInWebView() {
            return this.openUriInWebView;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setAttributionData$lambda$64() {
        return "Attribution data arguments were null. Not logging.";
    }

    public final void setAttributionData(String network, String campaign, String adGroup, String creative) {
        if (network == null || campaign == null || adGroup == null || creative == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String attributionData$lambda$64;
                    attributionData$lambda$64 = BrazeReactBridgeImpl.setAttributionData$lambda$64();
                    return attributionData$lambda$64;
                }
            }, 7, (Object) null);
        } else {
            final AttributionData attributionData = new AttributionData(network, campaign, adGroup, creative);
            runOnUser(new Function1() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda42
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit attributionData$lambda$65;
                    attributionData$lambda$65 = BrazeReactBridgeImpl.setAttributionData$lambda$65(AttributionData.this, (BrazeUser) obj);
                    return attributionData$lambda$65;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAttributionData$lambda$65(AttributionData attributionData, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setAttributionData(attributionData);
        return Unit.INSTANCE;
    }

    public final void getDeviceId(final Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        getBraze().getDeviceIdAsync(new IValueCallback<String>() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$getDeviceId$1
            @Override // com.braze.events.IValueCallback
            public void onSuccess(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BrazeReactBridgeImpl.Companion.reportResult$default(BrazeReactBridgeImpl.INSTANCE, Callback.this, value, null, 2, null);
            }

            @Override // com.braze.events.IValueCallback
            public void onError() {
                BrazeReactBridgeImpl.Companion.reportResult$default(BrazeReactBridgeImpl.INSTANCE, Callback.this, null, "Failed to retrieve the current device id.", 1, null);
            }
        });
    }

    public final void getInitialPushPayload(Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        final WritableMap initialPushPayload = BrazeReactUtils.getInitialPushPayload();
        if (initialPushPayload != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda57
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String initialPushPayload$lambda$66;
                    initialPushPayload$lambda$66 = BrazeReactBridgeImpl.getInitialPushPayload$lambda$66(WritableMap.this);
                    return initialPushPayload$lambda$66;
                }
            }, 7, (Object) null);
            Companion.reportResult$default(INSTANCE, callback, initialPushPayload, null, 2, null);
            BrazeReactUtils.clearInitialPushPayload();
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda58
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String initialPushPayload$lambda$67;
                    initialPushPayload$lambda$67 = BrazeReactBridgeImpl.getInitialPushPayload$lambda$67();
                    return initialPushPayload$lambda$67;
                }
            }, 7, (Object) null);
            Companion.reportResult$default(INSTANCE, callback, null, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getInitialPushPayload$lambda$66(WritableMap writableMap) {
        return "getInitialPushPayload returning payload: " + writableMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getInitialPushPayload$lambda$67() {
        return "getInitialPushPayload returning null - no initial payload available";
    }

    private final void runOnUser(final Function1<? super BrazeUser, Unit> block) {
        getBraze().getCurrentUser(new IValueCallback() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda48
            @Override // com.braze.events.IValueCallback
            public final void onSuccess(Object obj) {
                BrazeReactBridgeImpl.runOnUser$lambda$68(Function1.this, (BrazeUser) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runOnUser$lambda$68(Function1 function1, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
    }

    public final void addListener(final String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (Intrinsics.areEqual(eventName, PUSH_NOTIFICATION_EVENT_NAME)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addListener$lambda$69;
                    addListener$lambda$69 = BrazeReactBridgeImpl.addListener$lambda$69(eventName);
                    return addListener$lambda$69;
                }
            }, 7, (Object) null);
            subscribeToPushNotificationEvents();
        } else if (Intrinsics.areEqual(eventName, IN_APP_MESSAGE_RECEIVED_EVENT_NAME) && (BrazeInAppMessageManager.INSTANCE.getInstance().getInAppMessageManagerListener() instanceof DefaultInAppMessageManagerListener)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addListener$lambda$70;
                    addListener$lambda$70 = BrazeReactBridgeImpl.addListener$lambda$70(eventName);
                    return addListener$lambda$70;
                }
            }, 7, (Object) null);
            setDefaultInAppMessageListener();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addListener$lambda$69(String str) {
        return "Adding push notification event listener " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addListener$lambda$70(String str) {
        return "Adding in-app message event listener " + str;
    }

    private final void updateContentCardsIfNeeded(ContentCardsUpdatedEvent event) {
        if (event.getTimestampSeconds() > this.contentCardsUpdatedAt) {
            ReentrantLock reentrantLock = this.contentCardsLock;
            reentrantLock.lock();
            try {
                this.contentCardsUpdatedAt = event.getTimestampSeconds();
                this.contentCards.clear();
                this.contentCards.addAll(event.getAllCards());
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    private final Card getContentCardById(String id) {
        Object obj;
        ReentrantLock reentrantLock = this.contentCardsLock;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.contentCards.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((Card) obj).getId(), id)) {
                    break;
                }
            }
            return (Card) obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void getAllFeatureFlags(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        WritableArray mutableArray = MapFactoryKt.getMutableArray();
        Iterator<T> it = getBraze().getAllFeatureFlags().iterator();
        while (it.hasNext()) {
            mutableArray.pushMap(FeatureFlagUtilKt.convertFeatureFlag((FeatureFlag) it.next()));
        }
        promise.resolve(mutableArray);
    }

    public final void getFeatureFlag(String id, Promise promise) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(promise, "promise");
        FeatureFlag featureFlag = getBraze().getFeatureFlag(id);
        if (featureFlag == null) {
            promise.resolve(null);
        } else {
            promise.resolve(FeatureFlagUtilKt.convertFeatureFlag(featureFlag));
        }
    }

    public final void refreshFeatureFlags() {
        getBraze().refreshFeatureFlags();
    }

    public final void logFeatureFlagImpression(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        getBraze().logFeatureFlagImpression(id);
    }

    public final void getFeatureFlagBooleanProperty(String id, String key, Promise promise) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(promise, "promise");
        FeatureFlag featureFlag = getBraze().getFeatureFlag(id);
        promise.resolve(featureFlag != null ? featureFlag.getBooleanProperty(key) : null);
    }

    public final void getFeatureFlagStringProperty(String id, String key, Promise promise) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(promise, "promise");
        FeatureFlag featureFlag = getBraze().getFeatureFlag(id);
        promise.resolve(featureFlag != null ? featureFlag.getStringProperty(key) : null);
    }

    public final void getFeatureFlagNumberProperty(String id, String key, Promise promise) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(promise, "promise");
        FeatureFlag featureFlag = getBraze().getFeatureFlag(id);
        promise.resolve(featureFlag != null ? featureFlag.getNumberProperty(key) : null);
    }

    public final void getFeatureFlagTimestampProperty(String id, String key, Promise promise) {
        Long timestampProperty;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(promise, "promise");
        FeatureFlag featureFlag = getBraze().getFeatureFlag(id);
        promise.resolve((featureFlag == null || (timestampProperty = featureFlag.getTimestampProperty(key)) == null) ? null : Double.valueOf(timestampProperty.longValue()));
    }

    public final void getFeatureFlagJSONProperty(String id, String key, Promise promise) {
        JSONObject jSONProperty;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(promise, "promise");
        FeatureFlag featureFlag = getBraze().getFeatureFlag(id);
        promise.resolve((featureFlag == null || (jSONProperty = featureFlag.getJSONProperty(key)) == null) ? null : JsonUtilsKt.toNativeMap(jSONProperty));
    }

    public final void getFeatureFlagImageProperty(String id, String key, Promise promise) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(promise, "promise");
        FeatureFlag featureFlag = getBraze().getFeatureFlag(id);
        promise.resolve(featureFlag != null ? featureFlag.getImageProperty(key) : null);
    }

    public final void setAdTrackingEnabled(boolean adTrackingEnabled, String googleAdvertisingId) {
        if (googleAdvertisingId == null) {
            googleAdvertisingId = "";
        }
        getBraze().setGoogleAdvertisingId(googleAdvertisingId, adTrackingEnabled);
    }

    private final void setDefaultInAppMessageListener() {
        BrazeInAppMessageManager.INSTANCE.getInstance().setCustomInAppMessageManagerListener(new DefaultInAppMessageManagerListener() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$setDefaultInAppMessageListener$1
            @Override // com.braze.ui.inappmessage.listeners.DefaultInAppMessageManagerListener, com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener
            public InAppMessageOperation beforeInAppMessageDisplayed(IInAppMessage inAppMessage) {
                InAppMessageOperation inAppMessageOperation;
                Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putMap("inAppMessage", InAppMessageUtilKt.mapInAppMessage(inAppMessage));
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) BrazeReactBridgeImpl.this.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("inAppMessageReceived", writableNativeMap);
                inAppMessageOperation = BrazeReactBridgeImpl.this.inAppMessageDisplayOperation;
                return inAppMessageOperation;
            }
        });
    }

    /* compiled from: BrazeReactBridgeImpl.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\f\u001a\u00020\r*\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0002J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0018\u0010\u0015\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J\u0014\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001d*\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/braze/reactbridge/BrazeReactBridgeImpl$Companion;", "", "<init>", "()V", "NAME", "", "CONTENT_CARDS_UPDATED_EVENT_NAME", "BANNER_CARDS_UPDATED_EVENT_NAME", "FEATURE_FLAGS_UPDATED_EVENT_NAME", "SDK_AUTH_ERROR_EVENT_NAME", "IN_APP_MESSAGE_RECEIVED_EVENT_NAME", "PUSH_NOTIFICATION_EVENT_NAME", "reportResult", "", "Lcom/facebook/react/bridge/Callback;", "result", "error", "populateEventPropertiesFromReadableMap", "Lcom/braze/models/outgoing/BrazeProperties;", "eventProperties", "Lcom/facebook/react/bridge/ReadableMap;", "parseReadableMap", "", "readableMap", "parseReadableArray", "", "readableArray", "Lcom/facebook/react/bridge/ReadableArray;", "parseNotificationSubscriptionType", "Lcom/braze/enums/NotificationSubscriptionType;", "braze_react-native-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: BrazeReactBridgeImpl.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.Map.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.Array.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        static /* synthetic */ void reportResult$default(Companion companion, Callback callback, Object obj, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = null;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            companion.reportResult(callback, obj, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void reportResult(Callback callback, Object obj, String str) {
            if (callback == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.BrazeReactBridgeImpl$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String reportResult$lambda$0;
                        reportResult$lambda$0 = BrazeReactBridgeImpl.Companion.reportResult$lambda$0();
                        return reportResult$lambda$0;
                    }
                }, 6, (Object) null);
            } else if (str != null) {
                callback.invoke(str);
            } else {
                callback.invoke(null, obj);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String reportResult$lambda$0() {
            return "Warning: BrazeReactBridge callback was null.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final BrazeProperties populateEventPropertiesFromReadableMap(ReadableMap eventProperties) {
            if (eventProperties == null) {
                return null;
            }
            if (Intrinsics.areEqual(eventProperties, JSONObject.NULL)) {
                return new BrazeProperties();
            }
            return new BrazeProperties(new JSONObject(parseReadableMap(eventProperties)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<?, ?> parseReadableMap(ReadableMap readableMap) {
            ReadableArray array;
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            HashMap<String, Object> hashMap = readableMap.toHashMap();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                int i = WhenMappings.$EnumSwitchMapping$0[readableMap.getType(nextKey).ordinal()];
                if (i == 1) {
                    ReadableMap map = readableMap.getMap(nextKey);
                    if (map != null) {
                        if (map.hasKey("type") && map.getType("type") == ReadableType.String && Intrinsics.areEqual(map.getString("type"), "UNIX_timestamp")) {
                            hashMap.put(nextKey, new Date((long) map.getDouble("value")));
                        } else {
                            hashMap.put(nextKey, parseReadableMap(map));
                        }
                    }
                } else if (i == 2 && (array = readableMap.getArray(nextKey)) != null) {
                    hashMap.put(nextKey, BrazeReactBridgeImpl.INSTANCE.parseReadableArray(array));
                }
            }
            return hashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<?> parseReadableArray(ReadableArray readableArray) {
            ReadableArray array;
            ArrayList<Object> arrayList = readableArray.toArrayList();
            int size = readableArray.size();
            for (int i = 0; i < size; i++) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[readableArray.getType(i).ordinal()];
                if (i2 == 1) {
                    ReadableMap map = readableArray.getMap(i);
                    if (map != null) {
                        if (map.hasKey("type") && map.getType("type") == ReadableType.String && Intrinsics.areEqual(map.getString("type"), "UNIX_timestamp")) {
                            arrayList.set(i, new Date((long) map.getDouble("value")));
                        } else {
                            arrayList.set(i, parseReadableMap(map));
                        }
                    }
                } else if (i2 == 2 && (array = readableArray.getArray(i)) != null) {
                    arrayList.set(i, BrazeReactBridgeImpl.INSTANCE.parseReadableArray(array));
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final NotificationSubscriptionType parseNotificationSubscriptionType(String str) {
            if (str == null) {
                return null;
            }
            int hashCode = str.hashCode();
            if (hashCode == -1249604809) {
                if (str.equals("optedin")) {
                    return NotificationSubscriptionType.OPTED_IN;
                }
                return null;
            }
            if (hashCode == -1219769254) {
                if (str.equals("subscribed")) {
                    return NotificationSubscriptionType.SUBSCRIBED;
                }
                return null;
            }
            if (hashCode == 901853107 && str.equals("unsubscribed")) {
                return NotificationSubscriptionType.UNSUBSCRIBED;
            }
            return null;
        }
    }
}
