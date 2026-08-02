package com.unity3d.ads.core.domain.adquality;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.ironsource.L6;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.log.LogLevelInternal;
import com.unity3d.ads.core.log.Logger;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.bf3;
import defpackage.c10;
import defpackage.dmi;
import defpackage.tub;
import defpackage.whj;
import defpackage.wv8;
import defpackage.xd5;
import defpackage.xhj;
import defpackage.xuc;
import defpackage.zzl;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0019\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0082\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J \u0010'\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.¨\u0006/"}, d2 = {"Lcom/unity3d/ads/core/domain/adquality/AndroidInitializeAdQuality;", "Lcom/unity3d/ads/core/domain/adquality/InitializeAdQuality;", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/log/Logger;", "logger", "Lcom/unity3d/ads/core/domain/GetGameId;", "getGameId", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/log/Logger;Lcom/unity3d/ads/core/domain/GetGameId;)V", "Lcom/google/protobuf/ByteString;", "sessionToken", "Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;", "startInitialization", "(Lcom/google/protobuf/ByteString;)Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;", "Lwhj;", "startTime", "buildConfig-LaDbsBc", "(JLcom/google/protobuf/ByteString;)Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;", "buildConfig", "Lkotlin/Function0;", "", "block", "safeRun", "(Lkotlin/jvm/functions/Function0;)V", "", "e", "", "fallbackReason", "reportLoadFailure", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "Lcom/unity3d/ads/core/log/LogLevelInternal;", "logLevelInternal", "Lcom/ironsource/adqualitysdk/sdk/ISAdQualityLogLevel;", "mapLogLevel", "(Lcom/unity3d/ads/core/log/LogLevelInternal;)Lcom/ironsource/adqualitysdk/sdk/ISAdQualityLogLevel;", "appKey", "invoke", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;)V", "invokeWithGameId", "(Lcom/google/protobuf/ByteString;)V", "Landroid/content/Context;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/log/Logger;", "Lcom/unity3d/ads/core/domain/GetGameId;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidInitializeAdQuality implements InitializeAdQuality {

    @NotNull
    private final Context context;

    @NotNull
    private final GetGameId getGameId;

    @NotNull
    private final Logger logger;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogLevelInternal.values().length];
            try {
                iArr[LogLevelInternal.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogLevelInternal.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogLevelInternal.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogLevelInternal.DEBUG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LogLevelInternal.TRACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidInitializeAdQuality(@NotNull Context context, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull Logger logger, @NotNull GetGameId getGameId) {
        context.getClass();
        sendDiagnosticEvent.getClass();
        logger.getClass();
        getGameId.getClass();
        this.context = context;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
        this.getGameId = getGameId;
    }

    /* renamed from: buildConfig-LaDbsBc, reason: not valid java name */
    private final ISAdQualityConfig m751buildConfigLaDbsBc(final long startTime, ByteString sessionToken) {
        ISAdQualityConfig.Builder addAdQualityInitListener = new ISAdQualityConfig.Builder().setInitializationSource(L6.H1).setLogLevel(mapLogLevel(this.logger.getLogLevel())).setMetaData(AdQualityConstants.SESSION_TOKEN_METADATA_KEY, ProtobufExtensionsKt.toBase64$default(sessionToken, false, 1, null)).addAdQualityInitListener(new ISAdQualityInitListener() { // from class: com.unity3d.ads.core.domain.adquality.AndroidInitializeAdQuality$buildConfig$configBuilder$1
            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitFailed(ISAdQualityInitError isAdQualityInitError, String message) {
                SendDiagnosticEvent sendDiagnosticEvent;
                Logger logger;
                isAdQualityInitError.getClass();
                message.getClass();
                double e = xd5.e(whj.b(startTime));
                sendDiagnosticEvent = this.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME, Double.valueOf(e), tub.h(new Pair("reason", isAdQualityInitError.name()), new Pair("reason_debug", message)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                logger = this.logger;
                Logger.DefaultImpls.error$default(logger, dmi.q("Ad Quality failed to initialize: ", message), null, 2, null);
            }

            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitSuccess() {
                SendDiagnosticEvent sendDiagnosticEvent;
                double e = xd5.e(whj.b(startTime));
                sendDiagnosticEvent = this.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME, Double.valueOf(e), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
            }
        });
        String userIdentifier = UnityAds.getUserIdentifier();
        if (userIdentifier != null) {
            addAdQualityInitListener.setUserId(userIdentifier);
        }
        ISAdQualityConfig build = addAdQualityInitListener.build();
        build.getClass();
        return build;
    }

    private final ISAdQualityLogLevel mapLogLevel(LogLevelInternal logLevelInternal) {
        int i = WhenMappings.$EnumSwitchMapping$0[logLevelInternal.ordinal()];
        if (i == 1) {
            return ISAdQualityLogLevel.NONE;
        }
        if (i == 2) {
            return ISAdQualityLogLevel.ERROR;
        }
        if (i == 3) {
            return ISAdQualityLogLevel.INFO;
        }
        if (i == 4) {
            return ISAdQualityLogLevel.DEBUG;
        }
        if (i == 5) {
            return ISAdQualityLogLevel.VERBOSE;
        }
        zzl.b();
        return null;
    }

    private final void reportLoadFailure(Throwable e, String fallbackReason) {
        this.logger.debug(new c10(0, e));
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME;
        Double valueOf = Double.valueOf(0.0d);
        String message = e.getMessage();
        if (message != null) {
            fallbackReason = message;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, valueOf, wv8.o("reason_debug", fallbackReason), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String reportLoadFailure$lambda$3(Throwable th) {
        return bf3.o(new StringBuilder("Ad Quality SDK not available: "), th);
    }

    private final void safeRun(Function0<Unit> block) {
        try {
            block.invoke();
        } catch (ClassNotFoundException e) {
            reportLoadFailure(e, "ClassNotFoundException");
        } catch (NoClassDefFoundError e2) {
            reportLoadFailure(e2, "NoClassDefFoundError");
        } catch (NoSuchMethodError e3) {
            reportLoadFailure(e3, "NoSuchMethodError");
        } catch (Throwable th) {
            this.logger.error("Ad Quality SDK initialization failed", th);
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME;
            Double valueOf = Double.valueOf(0.0d);
            String message = th.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, valueOf, wv8.o("reason_debug", message), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        }
    }

    private final ISAdQualityConfig startInitialization(ByteString sessionToken) {
        xhj.a.getClass();
        xuc.a.getClass();
        long b = xuc.b();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED, (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
        return m751buildConfigLaDbsBc(b, sessionToken);
    }

    @Override // com.unity3d.ads.core.domain.adquality.InitializeAdQuality
    public void invoke(@NotNull String appKey, @NotNull ByteString sessionToken) {
        appKey.getClass();
        sessionToken.getClass();
        try {
            IronSourceAdQuality.getInstance().initialize(this.context, appKey, startInitialization(sessionToken));
        } catch (ClassNotFoundException e) {
            reportLoadFailure(e, "ClassNotFoundException");
        } catch (NoClassDefFoundError e2) {
            reportLoadFailure(e2, "NoClassDefFoundError");
        } catch (NoSuchMethodError e3) {
            reportLoadFailure(e3, "NoSuchMethodError");
        } catch (Throwable th) {
            this.logger.error("Ad Quality SDK initialization failed", th);
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME;
            Double valueOf = Double.valueOf(0.0d);
            String message = th.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, valueOf, wv8.o("reason_debug", message), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        }
    }

    @Override // com.unity3d.ads.core.domain.adquality.InitializeAdQuality
    public void invokeWithGameId(@NotNull ByteString sessionToken) {
        sessionToken.getClass();
        String invoke = this.getGameId.invoke();
        if (invoke == null || StringsKt.R(invoke)) {
            return;
        }
        try {
            IronSourceAdQuality.getInstance().initializeWithGameId(this.context, invoke, startInitialization(sessionToken));
        } catch (ClassNotFoundException e) {
            reportLoadFailure(e, "ClassNotFoundException");
        } catch (NoClassDefFoundError e2) {
            reportLoadFailure(e2, "NoClassDefFoundError");
        } catch (NoSuchMethodError e3) {
            reportLoadFailure(e3, "NoSuchMethodError");
        } catch (Throwable th) {
            this.logger.error("Ad Quality SDK initialization failed", th);
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME;
            Double valueOf = Double.valueOf(0.0d);
            String message = th.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, valueOf, wv8.o("reason_debug", message), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        }
    }
}
