package com.unity3d.ads.core.domain;

import android.content.Context;
import android.util.Base64;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CoroutineOpportunity;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CacheWebViewAssets;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.adload.WebViewLessLoadStrategy;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.ErrorExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import org.json.JSONObject;
import xsna.brm0;
import xsna.cwo0;
import xsna.drm0;
import xsna.hpj;
import xsna.jvo0;
import xsna.k830;
import xsna.ksr;
import xsna.myc0;
import xsna.r570;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.yvj;
import xsna.zno;
import xsna.zvj;

/* compiled from: AndroidHandleGatewayAdResponse.kt */
/* loaded from: classes14.dex */
public final class AndroidHandleGatewayAdResponse implements HandleGatewayAdResponse {
    private final AdPlayerScope adPlayerScope;
    private final AdRepository adRepository;
    private final CacheWebViewAssets cacheWebViewAssets;
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetAdPlayer getAdPlayer;
    private final HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer;
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;
    private final GetOperativeEventApi getOperativeEventApi;
    private final GetWebViewBridgeUseCase getWebViewBridge;
    private final AndroidGetWebViewContainerUseCase getWebViewContainerUseCase;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final WebViewLessLoadStrategy webViewLessLoadStrategy;

    public AndroidHandleGatewayAdResponse(AdRepository adRepository, AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase, GetWebViewBridgeUseCase getWebViewBridgeUseCase, DeviceInfoRepository deviceInfoRepository, HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, CampaignRepository campaignRepository, SendDiagnosticEvent sendDiagnosticEvent, GetOperativeEventApi getOperativeEventApi, GetLatestWebViewConfiguration getLatestWebViewConfiguration, AdPlayerScope adPlayerScope, GetAdPlayer getAdPlayer, CacheWebViewAssets cacheWebViewAssets, WebViewLessLoadStrategy webViewLessLoadStrategy, SessionRepository sessionRepository) {
        this.adRepository = adRepository;
        this.getWebViewContainerUseCase = androidGetWebViewContainerUseCase;
        this.getWebViewBridge = getWebViewBridgeUseCase;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getHandleInvocationsFromAdViewer = handleInvocationsFromAdViewer;
        this.campaignRepository = campaignRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration;
        this.adPlayerScope = adPlayerScope;
        this.getAdPlayer = getAdPlayer;
        this.cacheWebViewAssets = cacheWebViewAssets;
        this.webViewLessLoadStrategy = webViewLessLoadStrategy;
        this.sessionRepository = sessionRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
    
        if (r14.destroy(r9) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        if (com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke$default(r2, r0, r15, r5, r6, null, null, r9, 48, null) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cleanup(Throwable th, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, AdPlayer adPlayer, spj<? super s3q0> spjVar) {
        AndroidHandleGatewayAdResponse$cleanup$1 androidHandleGatewayAdResponse$cleanup$1;
        int i;
        String message;
        AdPlayer adPlayer2;
        if (spjVar instanceof AndroidHandleGatewayAdResponse$cleanup$1) {
            androidHandleGatewayAdResponse$cleanup$1 = (AndroidHandleGatewayAdResponse$cleanup$1) spjVar;
            int i2 = androidHandleGatewayAdResponse$cleanup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidHandleGatewayAdResponse$cleanup$1.label = i2 - Integer.MIN_VALUE;
                AndroidHandleGatewayAdResponse$cleanup$1 androidHandleGatewayAdResponse$cleanup$12 = androidHandleGatewayAdResponse$cleanup$1;
                Object obj = androidHandleGatewayAdResponse$cleanup$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidHandleGatewayAdResponse$cleanup$12.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    OperativeEventErrorDataKt.Dsl _create = OperativeEventErrorDataKt.Dsl.Companion._create(OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder());
                    _create.setErrorType(OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED);
                    Throwable cause = th.getCause();
                    if ((cause == null || (message = cause.getMessage()) == null) && (message = th.getMessage()) == null) {
                        message = "";
                    }
                    _create.setMessage(message);
                    OperativeEventRequestOuterClass.OperativeEventErrorData _build = _create._build();
                    GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
                    OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_LOAD_ERROR;
                    ByteString trackingToken = adResponse.getTrackingToken();
                    ByteString byteString2 = _build.toByteString();
                    adPlayer2 = adPlayer;
                    androidHandleGatewayAdResponse$cleanup$12.L$0 = adPlayer2;
                    androidHandleGatewayAdResponse$cleanup$12.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    adPlayer2 = (AdPlayer) androidHandleGatewayAdResponse$cleanup$12.L$0;
                    kotlin.a.a(obj);
                }
                if (adPlayer2 != null) {
                    return s3q0.a;
                }
                androidHandleGatewayAdResponse$cleanup$12.L$0 = null;
                androidHandleGatewayAdResponse$cleanup$12.label = 2;
            }
        }
        androidHandleGatewayAdResponse$cleanup$1 = new AndroidHandleGatewayAdResponse$cleanup$1(this, spjVar);
        AndroidHandleGatewayAdResponse$cleanup$1 androidHandleGatewayAdResponse$cleanup$122 = androidHandleGatewayAdResponse$cleanup$1;
        Object obj2 = androidHandleGatewayAdResponse$cleanup$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidHandleGatewayAdResponse$cleanup$122.label;
        if (i != 0) {
        }
        if (adPlayer2 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadUrl(AdObject adObject, String str, WebViewContainer webViewContainer, spj<? super s3q0> spjVar) {
        AndroidHandleGatewayAdResponse$loadUrl$1 androidHandleGatewayAdResponse$loadUrl$1;
        int i;
        Throwable th;
        AdObject adObject2;
        long j;
        Object failure;
        if (spjVar instanceof AndroidHandleGatewayAdResponse$loadUrl$1) {
            androidHandleGatewayAdResponse$loadUrl$1 = (AndroidHandleGatewayAdResponse$loadUrl$1) spjVar;
            int i2 = androidHandleGatewayAdResponse$loadUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidHandleGatewayAdResponse$loadUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidHandleGatewayAdResponse$loadUrl$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidHandleGatewayAdResponse$loadUrl$1.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    long b = k830.b();
                    try {
                        androidHandleGatewayAdResponse$loadUrl$1.L$0 = adObject;
                        androidHandleGatewayAdResponse$loadUrl$1.J$0 = b;
                        androidHandleGatewayAdResponse$loadUrl$1.label = 1;
                        if (webViewContainer.loadUrl(str, androidHandleGatewayAdResponse$loadUrl$1) == obj2) {
                            return obj2;
                        }
                        adObject2 = adObject;
                        j = b;
                    } catch (Throwable th2) {
                        th = th2;
                        adObject2 = adObject;
                        j = b;
                        failure = new Result.Failure(th);
                        AdObject adObject3 = adObject2;
                        Result result = new Result(failure);
                        long b2 = jvo0.a.b(j);
                        Object d = result.d();
                        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, d instanceof Result.Failure ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_FAILURE_TIME, new Double(zno.k(b2, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject3, (Integer) null, (ByteString) null, 108, (Object) null);
                        kotlin.a.a(d);
                        return s3q0.a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = androidHandleGatewayAdResponse$loadUrl$1.J$0;
                    adObject2 = (AdObject) androidHandleGatewayAdResponse$loadUrl$1.L$0;
                    try {
                        kotlin.a.a(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        failure = new Result.Failure(th);
                        AdObject adObject32 = adObject2;
                        Result result2 = new Result(failure);
                        long b22 = jvo0.a.b(j);
                        Object d2 = result2.d();
                        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, d2 instanceof Result.Failure ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_FAILURE_TIME, new Double(zno.k(b22, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject32, (Integer) null, (ByteString) null, 108, (Object) null);
                        kotlin.a.a(d2);
                        return s3q0.a;
                    }
                }
                failure = s3q0.a;
                AdObject adObject322 = adObject2;
                Result result22 = new Result(failure);
                long b222 = jvo0.a.b(j);
                Object d22 = result22.d();
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, d22 instanceof Result.Failure ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_FAILURE_TIME, new Double(zno.k(b222, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject322, (Integer) null, (ByteString) null, 108, (Object) null);
                kotlin.a.a(d22);
                return s3q0.a;
            }
        }
        androidHandleGatewayAdResponse$loadUrl$1 = new AndroidHandleGatewayAdResponse$loadUrl$1(this, spjVar);
        Object obj3 = androidHandleGatewayAdResponse$loadUrl$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidHandleGatewayAdResponse$loadUrl$1.label;
        if (i != 0) {
        }
        failure = s3q0.a;
        AdObject adObject3222 = adObject2;
        Result result222 = new Result(failure);
        long b2222 = jvo0.a.b(j);
        Object d222 = result222.d();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, d222 instanceof Result.Failure ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_FAILURE_TIME, new Double(zno.k(b2222, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject3222, (Integer) null, (ByteString) null, 108, (Object) null);
        kotlin.a.a(d222);
        return s3q0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x064c A[Catch: CancellationException -> 0x08c8, TRY_ENTER, TryCatch #40 {CancellationException -> 0x08c8, blocks: (B:102:0x063b, B:106:0x064f, B:124:0x0760, B:104:0x064c), top: B:101:0x063b }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x071d A[Catch: CancellationException -> 0x0646, TRY_ENTER, TryCatch #44 {CancellationException -> 0x0646, blocks: (B:131:0x0641, B:108:0x071d, B:110:0x072d, B:115:0x0741), top: B:130:0x0641 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0641 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04ad A[Catch: CancellationException -> 0x04c3, TRY_ENTER, TRY_LEAVE, TryCatch #42 {CancellationException -> 0x04c3, blocks: (B:167:0x04ad, B:173:0x04de), top: B:165:0x04ab }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04c9 A[Catch: CancellationException -> 0x08df, TRY_ENTER, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x08df, blocks: (B:164:0x04a3, B:169:0x04c9, B:176:0x04e7, B:179:0x0504), top: B:163:0x04a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0441 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x03f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x095c  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x02f3 A[Catch: CancellationException -> 0x01fd, TRY_ENTER, TryCatch #24 {CancellationException -> 0x01fd, blocks: (B:318:0x01ee, B:323:0x02f3, B:325:0x02fb, B:330:0x035f), top: B:317:0x01ee }] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x035f A[Catch: CancellationException -> 0x01fd, TRY_ENTER, TRY_LEAVE, TryCatch #24 {CancellationException -> 0x01fd, blocks: (B:318:0x01ee, B:323:0x02f3, B:325:0x02fb, B:330:0x035f), top: B:317:0x01ee }] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x031f A[Catch: CancellationException -> 0x0901, TRY_ENTER, TRY_LEAVE, TryCatch #21 {CancellationException -> 0x0901, blocks: (B:321:0x02e4, B:328:0x034f, B:349:0x031f), top: B:320:0x02e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x07d6 A[Catch: CancellationException -> 0x0855, TRY_LEAVE, TryCatch #14 {CancellationException -> 0x0855, blocks: (B:42:0x07d2, B:44:0x07d6, B:48:0x0811, B:56:0x0863, B:58:0x088c, B:59:0x0896, B:61:0x08a6, B:63:0x08bf, B:65:0x08ac, B:67:0x08b2, B:69:0x08ba), top: B:41:0x07d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0863 A[Catch: CancellationException -> 0x0855, TRY_ENTER, TryCatch #14 {CancellationException -> 0x0855, blocks: (B:42:0x07d2, B:44:0x07d6, B:48:0x0811, B:56:0x0863, B:58:0x088c, B:59:0x0896, B:61:0x08a6, B:63:0x08bf, B:65:0x08ac, B:67:0x08b2, B:69:0x08ba), top: B:41:0x07d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r6v12, types: [int] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v31, types: [T, com.unity3d.ads.adplayer.AdPlayer] */
    /* JADX WARN: Type inference failed for: r6v47 */
    @Override // com.unity3d.ads.core.domain.HandleGatewayAdResponse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(UnityAdsLoadOptions unityAdsLoadOptions, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, Context context, String str, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, boolean z, boolean z2, spj<? super LoadResult> spjVar) {
        AndroidHandleGatewayAdResponse$invoke$1 androidHandleGatewayAdResponse$invoke$1;
        AndroidHandleGatewayAdResponse$invoke$1 androidHandleGatewayAdResponse$invoke$12;
        ByteString byteString2;
        AdResponseOuterClass.AdResponse adResponse2;
        CoroutineSingletons coroutineSingletons;
        AndroidHandleGatewayAdResponse$invoke$1 androidHandleGatewayAdResponse$invoke$13;
        Ref$ObjectRef ref$ObjectRef;
        ByteString byteString3;
        AdResponseOuterClass.AdResponse adResponse3;
        Integer num;
        List<String> additionalFilesList;
        String type;
        boolean z3;
        Object invoke;
        UnityAdsLoadOptions unityAdsLoadOptions2;
        Ref$ObjectRef ref$ObjectRef2;
        ByteString byteString4;
        AdResponseOuterClass.AdResponse adResponse4;
        String str2;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2;
        boolean z4;
        String errorText;
        yvj yvjVar;
        String str3;
        UnityAdsLoadOptions unityAdsLoadOptions3;
        boolean z5;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType3;
        AdObject adObject;
        String str4;
        UnityAdsLoadOptions unityAdsLoadOptions4;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType4;
        String str5;
        cwo0 cwo0Var;
        WebViewConfiguration webViewConfiguration;
        long b;
        Object warmFromDisk;
        yvj yvjVar2;
        AdObject adObject2;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType5;
        String str6;
        boolean z6;
        Ref$ObjectRef ref$ObjectRef3;
        long j;
        boolean z7;
        ?? r6;
        CoroutineSingletons coroutineSingletons2;
        AdObject adObject3;
        CacheWebViewAssets cacheWebViewAssets;
        ByteString byteString5;
        Ref$ObjectRef ref$ObjectRef4;
        boolean z8;
        int i;
        AdObject adObject4;
        AdResponseOuterClass.AdResponse adResponse5;
        WebViewConfiguration webViewConfiguration2;
        UnityAdsLoadOptions unityAdsLoadOptions5;
        UnityAdsLoadOptions unityAdsLoadOptions6;
        Ref$ObjectRef ref$ObjectRef5;
        WebViewConfiguration webViewConfiguration3;
        AdObject adObject5;
        String str7;
        boolean z9;
        yvj yvjVar3;
        int i2;
        boolean z10;
        ByteString byteString6;
        Ref$ObjectRef ref$ObjectRef6;
        UnityAdsLoadOptions unityAdsLoadOptions7;
        yvj yvjVar4;
        CoroutineSingletons coroutineSingletons3;
        String encodeToString;
        String str8;
        int i3;
        CoroutineSingletons coroutineSingletons4;
        boolean z11;
        String str9;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType6;
        WebViewConfiguration webViewConfiguration4;
        long j2;
        boolean z12;
        Object invoke2;
        WebViewConfiguration webViewConfiguration5;
        ByteString byteString7;
        String str10;
        AdResponseOuterClass.AdResponse adResponse6;
        UnityAdsLoadOptions unityAdsLoadOptions8;
        Ref$ObjectRef ref$ObjectRef7;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType7;
        UnityAdsLoadOptions unityAdsLoadOptions9;
        AdObject adObject6;
        String str11;
        Object failure;
        int i4;
        boolean z13;
        Object d;
        CoroutineSingletons coroutineSingletons5;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType;
        AdObject adObject7;
        AndroidWebViewContainer androidWebViewContainer;
        AdObject copy$default;
        WebViewConfiguration webViewConfiguration6;
        long b2;
        yvj yvjVar5;
        String str12;
        yvj yvjVar6;
        WebViewConfiguration webViewConfiguration7;
        AdObject adObject8;
        int i5;
        long j3;
        String str13;
        LoadEvent loadEvent;
        AdObject adObject9;
        UnityAdsLoadOptions unityAdsLoadOptions10;
        int i6;
        long j4;
        WebViewConfiguration webViewConfiguration8;
        Object u;
        AdObject adObject10;
        JSONObject data;
        LoadEvent loadEvent2;
        ByteString byteString8;
        r570 r570Var;
        AndroidHandleGatewayAdResponse$invoke$5 androidHandleGatewayAdResponse$invoke$5;
        CancellationException cancellationException;
        Throwable cause;
        AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = this;
        if (spjVar instanceof AndroidHandleGatewayAdResponse$invoke$1) {
            androidHandleGatewayAdResponse$invoke$1 = (AndroidHandleGatewayAdResponse$invoke$1) spjVar;
            int i7 = androidHandleGatewayAdResponse$invoke$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                androidHandleGatewayAdResponse$invoke$1.label = i7 - Integer.MIN_VALUE;
                androidHandleGatewayAdResponse$invoke$12 = androidHandleGatewayAdResponse$invoke$1;
                Object obj = androidHandleGatewayAdResponse$invoke$12.result;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (androidHandleGatewayAdResponse$invoke$12.label) {
                    case 0:
                        kotlin.a.a(obj);
                        Ref$ObjectRef ref$ObjectRef8 = new Ref$ObjectRef();
                        try {
                        } catch (CancellationException e) {
                            e = e;
                            byteString2 = byteString;
                        }
                        try {
                            if (adResponse.hasError()) {
                                ErrorOuterClass.PublicErrorCode errorCode = adResponse.getError().getErrorCode();
                                ErrorOuterClass.Error error = adResponse.getError();
                                if (error != null) {
                                    ErrorOuterClass.PublicErrorCode errorCode2 = error.getErrorCode();
                                    if (errorCode2 != null) {
                                        errorText = UnityAdsErrorKt.getLoadErrorMsg(errorCode2);
                                        if (errorText == null) {
                                        }
                                        return new LoadResult.Failure(errorCode, errorText, null, "gateway", adResponse.getError().getErrorText(), ErrorExtensionsKt.getErrorTokenOrNull(adResponse.getError()), 4, null);
                                    }
                                }
                                errorText = adResponse.getError().getErrorText();
                                return new LoadResult.Failure(errorCode, errorText, null, "gateway", adResponse.getError().getErrorText(), ErrorExtensionsKt.getErrorTokenOrNull(adResponse.getError()), 4, null);
                            }
                            if (adResponse.getAdData().isEmpty()) {
                                return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NO_FILL, UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_NO_FILL, null, "no_fill", null, null, 52, null);
                            }
                            GetLatestWebViewConfiguration getLatestWebViewConfiguration = androidHandleGatewayAdResponse.getLatestWebViewConfiguration;
                            String entryPoint = adResponse.getWebviewConfiguration().getEntryPoint();
                            try {
                                num = new Integer(adResponse.getWebviewConfiguration().getVersion());
                                additionalFilesList = adResponse.getWebviewConfiguration().getAdditionalFilesList();
                                type = adResponse.getWebviewConfiguration().getType();
                                androidHandleGatewayAdResponse$invoke$12.L$0 = unityAdsLoadOptions;
                                byteString2 = byteString;
                            } catch (CancellationException e2) {
                                e = e2;
                                byteString2 = byteString;
                                adResponse2 = adResponse;
                            }
                            try {
                                androidHandleGatewayAdResponse$invoke$12.L$1 = byteString2;
                                adResponse2 = adResponse;
                            } catch (CancellationException e3) {
                                e = e3;
                                adResponse2 = adResponse;
                                coroutineSingletons = coroutineSingletons6;
                                androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                                ref$ObjectRef = ref$ObjectRef8;
                                byteString3 = byteString2;
                                adResponse3 = adResponse2;
                                r570Var = r570.b;
                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                                androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                                androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                                androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                                androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                                androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                                androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                                androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                                androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                                androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                                androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                                androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                                androidHandleGatewayAdResponse$invoke$13.label = 9;
                                if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                                }
                            }
                            try {
                                androidHandleGatewayAdResponse$invoke$12.L$2 = adResponse2;
                                androidHandleGatewayAdResponse$invoke$12.L$3 = str;
                                androidHandleGatewayAdResponse$invoke$12.L$4 = diagnosticAdType;
                                androidHandleGatewayAdResponse$invoke$12.L$5 = ref$ObjectRef8;
                                androidHandleGatewayAdResponse$invoke$12.Z$0 = z;
                                z3 = z2;
                                androidHandleGatewayAdResponse$invoke$12.Z$1 = z3;
                                androidHandleGatewayAdResponse$invoke$12.label = 1;
                                invoke = getLatestWebViewConfiguration.invoke(entryPoint, num, additionalFilesList, type, androidHandleGatewayAdResponse$invoke$12);
                                if (invoke == coroutineSingletons6) {
                                    return coroutineSingletons6;
                                }
                                unityAdsLoadOptions2 = unityAdsLoadOptions;
                                ref$ObjectRef2 = ref$ObjectRef8;
                                byteString4 = byteString2;
                                adResponse4 = adResponse2;
                                str2 = str;
                                diagnosticAdType2 = diagnosticAdType;
                                z4 = z;
                                try {
                                    WebViewConfiguration webViewConfiguration9 = (WebViewConfiguration) invoke;
                                    hpj g = zvj.g(androidHandleGatewayAdResponse.adPlayerScope, new CoroutineOpportunity(byteString4));
                                    if (z3) {
                                        ByteString byteString9 = byteString4;
                                        try {
                                            yvjVar = g;
                                            str3 = str2;
                                            unityAdsLoadOptions3 = unityAdsLoadOptions2;
                                            z5 = z4;
                                            diagnosticAdType3 = diagnosticAdType2;
                                            adObject = new AdObject(g, byteString9, str2, adResponse4.getTrackingToken(), false, null, null, null, unityAdsLoadOptions2, z4, diagnosticAdType2, null, null, null, null, null, null, 129264, null);
                                        } catch (CancellationException e4) {
                                            e = e4;
                                            coroutineSingletons = coroutineSingletons6;
                                            androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                                            byteString4 = byteString9;
                                            ref$ObjectRef = ref$ObjectRef2;
                                            adResponse3 = adResponse4;
                                            byteString3 = byteString4;
                                            r570Var = r570.b;
                                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                                            androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                                            androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                                            androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                                            androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                                            androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                                            androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                                            androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                                            androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                                            androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                                            androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                                            androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                                            androidHandleGatewayAdResponse$invoke$13.label = 9;
                                            if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                                            }
                                        }
                                    } else {
                                        AdObject ad = androidHandleGatewayAdResponse.adRepository.getAd(byteString4);
                                        if (ad == null) {
                                            return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "webviewless_ad_not_found", null, null, 52, null);
                                        }
                                        adObject = ad;
                                        yvjVar = g;
                                        str3 = str2;
                                        unityAdsLoadOptions3 = unityAdsLoadOptions2;
                                        z5 = z4;
                                        diagnosticAdType3 = diagnosticAdType2;
                                    }
                                    if (androidHandleGatewayAdResponse.sessionRepository.getNativeConfiguration().getFeatureFlags().getUseOptimisticWebviewCache()) {
                                        str4 = "?platform=android&mode=ad-viewer&webviewType=";
                                        coroutineSingletons = coroutineSingletons6;
                                        unityAdsLoadOptions4 = unityAdsLoadOptions3;
                                        diagnosticAdType4 = diagnosticAdType3;
                                        str5 = str3;
                                        cwo0Var = null;
                                        webViewConfiguration = webViewConfiguration9;
                                        ref$ObjectRef = ref$ObjectRef2;
                                        z7 = z5;
                                        if (cwo0Var != null) {
                                        }
                                        if (cwo0Var != null) {
                                        }
                                        if (r6 == 0) {
                                        }
                                    } else {
                                        SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_STARTED, (Double) null, (Map) null, (Map) null, adObject, (Integer) null, (ByteString) null, 110, (Object) null);
                                        AdObject adObject11 = adObject;
                                        str4 = "?platform=android&mode=ad-viewer&webviewType=";
                                        coroutineSingletons = coroutineSingletons6;
                                        try {
                                            b = k830.b();
                                        } catch (CancellationException e5) {
                                            e = e5;
                                        }
                                        try {
                                            CacheWebViewAssets cacheWebViewAssets2 = androidHandleGatewayAdResponse.cacheWebViewAssets;
                                            androidHandleGatewayAdResponse$invoke$12.L$0 = unityAdsLoadOptions3;
                                            androidHandleGatewayAdResponse$invoke$12.L$1 = byteString4;
                                            androidHandleGatewayAdResponse$invoke$12.L$2 = adResponse4;
                                            androidHandleGatewayAdResponse$invoke$12.L$3 = str3;
                                            androidHandleGatewayAdResponse$invoke$12.L$4 = diagnosticAdType3;
                                            androidHandleGatewayAdResponse$invoke$12.L$5 = ref$ObjectRef2;
                                            androidHandleGatewayAdResponse$invoke$12.L$6 = webViewConfiguration9;
                                            androidHandleGatewayAdResponse$invoke$12.L$7 = yvjVar;
                                            androidHandleGatewayAdResponse$invoke$12.L$8 = adObject11;
                                            androidHandleGatewayAdResponse$invoke$12.Z$0 = z5;
                                            androidHandleGatewayAdResponse$invoke$12.Z$1 = z3;
                                            androidHandleGatewayAdResponse$invoke$12.J$0 = b;
                                            boolean z14 = z3;
                                            androidHandleGatewayAdResponse$invoke$12.label = 2;
                                            warmFromDisk = cacheWebViewAssets2.warmFromDisk(webViewConfiguration9, androidHandleGatewayAdResponse$invoke$12);
                                            coroutineSingletons = coroutineSingletons;
                                            if (warmFromDisk == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType8 = diagnosticAdType3;
                                            yvjVar2 = yvjVar;
                                            adObject2 = adObject11;
                                            diagnosticAdType5 = diagnosticAdType8;
                                            str6 = str3;
                                            webViewConfiguration = webViewConfiguration9;
                                            z6 = z14;
                                            ref$ObjectRef3 = ref$ObjectRef2;
                                            j = b;
                                            try {
                                                Boolean bool = (Boolean) warmFromDisk;
                                                bool.getClass();
                                                boolean z15 = z6;
                                                cwo0Var = new cwo0(jvo0.a.b(j), bool);
                                                z3 = z15;
                                                ref$ObjectRef = ref$ObjectRef3;
                                                adObject = adObject2;
                                                unityAdsLoadOptions4 = unityAdsLoadOptions3;
                                                yvjVar = yvjVar2;
                                                diagnosticAdType4 = diagnosticAdType5;
                                                str5 = str6;
                                                z7 = z5;
                                                if (cwo0Var != null) {
                                                    try {
                                                        r6 = cwo0Var.a.booleanValue();
                                                    } catch (CancellationException e6) {
                                                        e = e6;
                                                        androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                                                        adResponse3 = adResponse4;
                                                        byteString3 = byteString4;
                                                        r570Var = r570.b;
                                                        androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                                                        androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                                                        androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.label = 9;
                                                        if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                                                        }
                                                    }
                                                } else {
                                                    r6 = 0;
                                                }
                                                if (cwo0Var != null) {
                                                    try {
                                                        coroutineSingletons2 = coroutineSingletons;
                                                        try {
                                                            SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, r6 != 0 ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_FAILURE_TIME, new Double(zno.k(cwo0Var.b, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject, (Integer) null, (ByteString) null, 108, (Object) null);
                                                            adObject3 = adObject;
                                                        } catch (CancellationException e7) {
                                                            e = e7;
                                                            androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                                                            coroutineSingletons = coroutineSingletons2;
                                                            adResponse3 = adResponse4;
                                                            byteString3 = byteString4;
                                                            r570Var = r570.b;
                                                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                                                            androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                                                            androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                                                            androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                                                            androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                                                            androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                                                            androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                                                            androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                                                            androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                                                            androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                                                            androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                                                            androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                                                            androidHandleGatewayAdResponse$invoke$13.label = 9;
                                                            if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                                                            }
                                                        }
                                                    } catch (CancellationException e8) {
                                                        e = e8;
                                                        androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                                                        adResponse3 = adResponse4;
                                                        byteString3 = byteString4;
                                                        r570Var = r570.b;
                                                        androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                                                        androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                                                        androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.label = 9;
                                                        if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                                                        }
                                                    }
                                                } else {
                                                    coroutineSingletons2 = coroutineSingletons;
                                                    adObject3 = adObject;
                                                }
                                                if (r6 == 0) {
                                                    try {
                                                        cacheWebViewAssets = androidHandleGatewayAdResponse.cacheWebViewAssets;
                                                        androidHandleGatewayAdResponse$invoke$12.L$0 = unityAdsLoadOptions4;
                                                        androidHandleGatewayAdResponse$invoke$12.L$1 = byteString4;
                                                        androidHandleGatewayAdResponse$invoke$12.L$2 = adResponse4;
                                                        androidHandleGatewayAdResponse$invoke$12.L$3 = str5;
                                                        androidHandleGatewayAdResponse$invoke$12.L$4 = diagnosticAdType4;
                                                        androidHandleGatewayAdResponse$invoke$12.L$5 = ref$ObjectRef;
                                                        androidHandleGatewayAdResponse$invoke$12.L$6 = webViewConfiguration;
                                                        androidHandleGatewayAdResponse$invoke$12.L$7 = yvjVar;
                                                        androidHandleGatewayAdResponse$invoke$12.L$8 = adObject3;
                                                        androidHandleGatewayAdResponse$invoke$12.Z$0 = z7;
                                                        androidHandleGatewayAdResponse$invoke$12.Z$1 = z3;
                                                        androidHandleGatewayAdResponse$invoke$12.I$0 = r6;
                                                        androidHandleGatewayAdResponse$invoke$12.label = 3;
                                                    } catch (CancellationException e9) {
                                                        e = e9;
                                                    }
                                                    try {
                                                        coroutineSingletons = coroutineSingletons2;
                                                        if (CacheWebViewAssets.DefaultImpls.invoke$default(cacheWebViewAssets, webViewConfiguration, false, androidHandleGatewayAdResponse$invoke$12, 2, null) == coroutineSingletons) {
                                                            return coroutineSingletons;
                                                        }
                                                        byteString5 = byteString4;
                                                        ref$ObjectRef4 = ref$ObjectRef;
                                                        z8 = z3;
                                                        i = r6;
                                                        adObject4 = adObject3;
                                                        adResponse5 = adResponse4;
                                                        webViewConfiguration2 = webViewConfiguration;
                                                        unityAdsLoadOptions5 = unityAdsLoadOptions4;
                                                        ref$ObjectRef5 = ref$ObjectRef4;
                                                        str7 = str5;
                                                        z9 = z7;
                                                        yvjVar3 = yvjVar;
                                                        unityAdsLoadOptions6 = unityAdsLoadOptions5;
                                                        adObject5 = adObject4;
                                                        z10 = z8;
                                                        webViewConfiguration3 = webViewConfiguration2;
                                                        byteString3 = byteString5;
                                                        i2 = i;
                                                        try {
                                                            try {
                                                                if (webViewConfiguration3.getEntryPoint().length() == 0) {
                                                                    return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "no_webview_entry_point", null, null, 52, null);
                                                                }
                                                                String configUrl = SdkProperties.getConfigUrl();
                                                                yvj yvjVar7 = yvjVar3;
                                                                UnityAdsLoadOptions unityAdsLoadOptions11 = unityAdsLoadOptions6;
                                                                if (!brm0.v(configUrl, ".html", false)) {
                                                                    configUrl = null;
                                                                }
                                                                if (configUrl == null) {
                                                                    configUrl = webViewConfiguration3.getEntryPoint();
                                                                }
                                                                try {
                                                                    URI uri = new URI(configUrl);
                                                                    StringBuilder sb = new StringBuilder(str4);
                                                                    sb.append(webViewConfiguration3.getType());
                                                                    sb.append('&');
                                                                    String query = uri.getQuery();
                                                                    if (query == null) {
                                                                        query = "";
                                                                    }
                                                                    sb.append(query);
                                                                    String sb2 = sb.toString();
                                                                    StringBuilder sb3 = new StringBuilder();
                                                                    String str14 = str7;
                                                                    sb3.append(drm0.n0(configUrl, "?"));
                                                                    sb3.append(sb2);
                                                                    String sb4 = sb3.toString();
                                                                    if (!z10) {
                                                                        try {
                                                                            if (diagnosticAdType4 != DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER && adResponse5.hasCampaignMetadata() && adResponse5.getCampaignMetadata().getAssetsToCacheCount() > 0) {
                                                                                WebViewLessLoadStrategy webViewLessLoadStrategy = androidHandleGatewayAdResponse.webViewLessLoadStrategy;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$0 = byteString3;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$1 = adResponse5;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$2 = ref$ObjectRef5;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.label = 4;
                                                                                adResponse3 = adResponse5;
                                                                                try {
                                                                                    Object invoke3 = webViewLessLoadStrategy.invoke(yvjVar7, sb4, unityAdsLoadOptions11, byteString3, adResponse3, str14, diagnosticAdType4, z9, androidHandleGatewayAdResponse$invoke$12);
                                                                                    return invoke3 == coroutineSingletons ? coroutineSingletons : invoke3;
                                                                                } catch (CancellationException e10) {
                                                                                    e = e10;
                                                                                    androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                                                                                    ref$ObjectRef = ref$ObjectRef5;
                                                                                    r570Var = r570.b;
                                                                                    androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                                                                                    androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                                                                                    androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$13.label = 9;
                                                                                    if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                                                                                        return coroutineSingletons;
                                                                                    }
                                                                                    cancellationException = e;
                                                                                    cause = cancellationException.getCause();
                                                                                    if (cause != null) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        } catch (CancellationException e11) {
                                                                            e = e11;
                                                                            androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                                                                            adResponse3 = adResponse5;
                                                                        }
                                                                    }
                                                                    unityAdsLoadOptions7 = unityAdsLoadOptions11;
                                                                    androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                                                                    adResponse3 = adResponse5;
                                                                    yvjVar4 = yvjVar7;
                                                                    try {
                                                                        coroutineSingletons3 = coroutineSingletons;
                                                                    } catch (CancellationException e12) {
                                                                        e = e12;
                                                                        ref$ObjectRef6 = ref$ObjectRef5;
                                                                    }
                                                                    try {
                                                                        encodeToString = Base64.encodeToString(adResponse3.getImpressionConfiguration().toByteArray(), 2);
                                                                        str8 = sb4;
                                                                        boolean z16 = z10;
                                                                        long b3 = k830.b();
                                                                        try {
                                                                            AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase = androidHandleGatewayAdResponse.getWebViewContainerUseCase;
                                                                            AdPlayerScope adPlayerScope = androidHandleGatewayAdResponse.adPlayerScope;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$0 = unityAdsLoadOptions7;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$1 = byteString3;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$2 = adResponse3;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$3 = str14;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$4 = diagnosticAdType4;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$5 = ref$ObjectRef5;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$6 = webViewConfiguration3;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$7 = yvjVar4;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$8 = adObject5;
                                                                            ref$ObjectRef6 = ref$ObjectRef5;
                                                                            try {
                                                                                androidHandleGatewayAdResponse$invoke$13.L$9 = str8;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$10 = encodeToString;
                                                                                str8 = str8;
                                                                                z11 = z16;
                                                                                try {
                                                                                    androidHandleGatewayAdResponse$invoke$13.Z$0 = z11;
                                                                                    androidHandleGatewayAdResponse$invoke$13.I$0 = i2;
                                                                                    androidHandleGatewayAdResponse$invoke$13.J$0 = b3;
                                                                                    i3 = i2;
                                                                                    try {
                                                                                        androidHandleGatewayAdResponse$invoke$13.label = 5;
                                                                                        invoke2 = androidGetWebViewContainerUseCase.invoke(adPlayerScope, adObject5, androidHandleGatewayAdResponse$invoke$13);
                                                                                        coroutineSingletons4 = coroutineSingletons3;
                                                                                    } catch (Throwable th) {
                                                                                        th = th;
                                                                                        coroutineSingletons4 = coroutineSingletons3;
                                                                                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType9 = diagnosticAdType4;
                                                                                        str9 = str14;
                                                                                        diagnosticAdType6 = diagnosticAdType9;
                                                                                        webViewConfiguration4 = webViewConfiguration3;
                                                                                        j2 = b3;
                                                                                        z12 = z11;
                                                                                        try {
                                                                                            String str15 = str9;
                                                                                            diagnosticAdType7 = diagnosticAdType6;
                                                                                            unityAdsLoadOptions9 = unityAdsLoadOptions7;
                                                                                            ref$ObjectRef7 = ref$ObjectRef6;
                                                                                            adObject6 = adObject5;
                                                                                            str11 = str15;
                                                                                            failure = new Result.Failure(th);
                                                                                            webViewConfiguration5 = webViewConfiguration4;
                                                                                            long j5 = j2;
                                                                                            i4 = i3;
                                                                                            try {
                                                                                                Result result = new Result(failure);
                                                                                                z13 = z12;
                                                                                                long b4 = jvo0.a.b(j5);
                                                                                                d = result.d();
                                                                                                coroutineSingletons5 = coroutineSingletons4;
                                                                                            } catch (CancellationException e13) {
                                                                                                e = e13;
                                                                                                coroutineSingletons = coroutineSingletons4;
                                                                                            }
                                                                                        } catch (CancellationException e14) {
                                                                                            e = e14;
                                                                                            coroutineSingletons = coroutineSingletons4;
                                                                                            ref$ObjectRef = ref$ObjectRef6;
                                                                                            r570Var = r570.b;
                                                                                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.label = 9;
                                                                                            if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            SendDiagnosticEvent sendDiagnosticEvent = androidHandleGatewayAdResponse.sendDiagnosticEvent;
                                                                                            if (d instanceof Result.Failure) {
                                                                                            }
                                                                                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, new Double(zno.k(b4, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject6, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                                            adObject7 = adObject6;
                                                                                            Object d2 = result.d();
                                                                                            kotlin.a.a(d2);
                                                                                            androidWebViewContainer = (AndroidWebViewContainer) d2;
                                                                                            WebViewBridge invoke4 = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer, androidHandleGatewayAdResponse.adPlayerScope);
                                                                                            ?? invoke5 = androidHandleGatewayAdResponse.getAdPlayer.invoke(invoke4, androidWebViewContainer, adObject7, diagnosticAdType7);
                                                                                            ref$ObjectRef7.element = invoke5;
                                                                                            copy$default = AdObject.copy$default(adObject7, adObject7.getAdScope(), null, null, null, false, null, invoke5, null, null, false, null, null, null, null, null, null, adObject7.getWebViewLessLoadingRequiredData(), 65470, null);
                                                                                            rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(ref$ObjectRef7, null)), ((AdPlayer) ref$ObjectRef7.element).getScope());
                                                                                            webViewConfiguration6 = webViewConfiguration5;
                                                                                            b2 = k830.b();
                                                                                            SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy$default, (Integer) null, (ByteString) null, 110, (Object) null);
                                                                                            yvjVar5 = yvjVar4;
                                                                                            invoke4.setExposedFunctions(androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer.invoke(ProtobufExtensionsKt.toBase64$default(adResponse3.getAdData(), false, 1, null), ProtobufExtensionsKt.toBase64$default(adResponse3.getAdDataRefreshToken(), false, 1, null), encodeToString, copy$default));
                                                                                            if (z13) {
                                                                                            }
                                                                                            str12 = str8;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$0 = unityAdsLoadOptions9;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$1 = byteString3;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$2 = adResponse3;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$3 = str11;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$4 = ref$ObjectRef7;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$5 = webViewConfiguration6;
                                                                                            yvjVar6 = yvjVar5;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$6 = yvjVar6;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$7 = copy$default;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.I$0 = i4;
                                                                                            androidHandleGatewayAdResponse$invoke$13.J$0 = b2;
                                                                                            androidHandleGatewayAdResponse$invoke$13.label = 6;
                                                                                            coroutineSingletons = coroutineSingletons5;
                                                                                            if (androidHandleGatewayAdResponse.loadUrl(adObject7, str12, androidWebViewContainer, androidHandleGatewayAdResponse$invoke$13) != coroutineSingletons) {
                                                                                            }
                                                                                        } catch (CancellationException e15) {
                                                                                            e = e15;
                                                                                            coroutineSingletons = coroutineSingletons5;
                                                                                            ref$ObjectRef = ref$ObjectRef7;
                                                                                            r570Var = r570.b;
                                                                                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.label = 9;
                                                                                            if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th2) {
                                                                                    th = th2;
                                                                                    i3 = i2;
                                                                                }
                                                                            } catch (Throwable th3) {
                                                                                th = th3;
                                                                                i3 = i2;
                                                                                str8 = str8;
                                                                                coroutineSingletons4 = coroutineSingletons3;
                                                                                z11 = z16;
                                                                                DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType92 = diagnosticAdType4;
                                                                                str9 = str14;
                                                                                diagnosticAdType6 = diagnosticAdType92;
                                                                                webViewConfiguration4 = webViewConfiguration3;
                                                                                j2 = b3;
                                                                                z12 = z11;
                                                                                String str152 = str9;
                                                                                diagnosticAdType7 = diagnosticAdType6;
                                                                                unityAdsLoadOptions9 = unityAdsLoadOptions7;
                                                                                ref$ObjectRef7 = ref$ObjectRef6;
                                                                                adObject6 = adObject5;
                                                                                str11 = str152;
                                                                                failure = new Result.Failure(th);
                                                                                webViewConfiguration5 = webViewConfiguration4;
                                                                                long j52 = j2;
                                                                                i4 = i3;
                                                                                Result result2 = new Result(failure);
                                                                                z13 = z12;
                                                                                long b42 = jvo0.a.b(j52);
                                                                                d = result2.d();
                                                                                coroutineSingletons5 = coroutineSingletons4;
                                                                                SendDiagnosticEvent sendDiagnosticEvent2 = androidHandleGatewayAdResponse.sendDiagnosticEvent;
                                                                                if (d instanceof Result.Failure) {
                                                                                }
                                                                                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, diagnosticEventType, new Double(zno.k(b42, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject6, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                                adObject7 = adObject6;
                                                                                Object d22 = result2.d();
                                                                                kotlin.a.a(d22);
                                                                                androidWebViewContainer = (AndroidWebViewContainer) d22;
                                                                                WebViewBridge invoke42 = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer, androidHandleGatewayAdResponse.adPlayerScope);
                                                                                ?? invoke52 = androidHandleGatewayAdResponse.getAdPlayer.invoke(invoke42, androidWebViewContainer, adObject7, diagnosticAdType7);
                                                                                ref$ObjectRef7.element = invoke52;
                                                                                copy$default = AdObject.copy$default(adObject7, adObject7.getAdScope(), null, null, null, false, null, invoke52, null, null, false, null, null, null, null, null, null, adObject7.getWebViewLessLoadingRequiredData(), 65470, null);
                                                                                rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(ref$ObjectRef7, null)), ((AdPlayer) ref$ObjectRef7.element).getScope());
                                                                                webViewConfiguration6 = webViewConfiguration5;
                                                                                b2 = k830.b();
                                                                                SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy$default, (Integer) null, (ByteString) null, 110, (Object) null);
                                                                                yvjVar5 = yvjVar4;
                                                                                invoke42.setExposedFunctions(androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer.invoke(ProtobufExtensionsKt.toBase64$default(adResponse3.getAdData(), false, 1, null), ProtobufExtensionsKt.toBase64$default(adResponse3.getAdDataRefreshToken(), false, 1, null), encodeToString, copy$default));
                                                                                if (z13) {
                                                                                }
                                                                                str12 = str8;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$0 = unityAdsLoadOptions9;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$1 = byteString3;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$2 = adResponse3;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$3 = str11;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$4 = ref$ObjectRef7;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$5 = webViewConfiguration6;
                                                                                yvjVar6 = yvjVar5;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$6 = yvjVar6;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$7 = copy$default;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.I$0 = i4;
                                                                                androidHandleGatewayAdResponse$invoke$13.J$0 = b2;
                                                                                androidHandleGatewayAdResponse$invoke$13.label = 6;
                                                                                coroutineSingletons = coroutineSingletons5;
                                                                                if (androidHandleGatewayAdResponse.loadUrl(adObject7, str12, androidWebViewContainer, androidHandleGatewayAdResponse$invoke$13) != coroutineSingletons) {
                                                                                }
                                                                            }
                                                                        } catch (Throwable th4) {
                                                                            th = th4;
                                                                            i3 = i2;
                                                                            ref$ObjectRef6 = ref$ObjectRef5;
                                                                        }
                                                                        if (invoke2 == coroutineSingletons4) {
                                                                            return coroutineSingletons4;
                                                                        }
                                                                        z12 = z11;
                                                                        webViewConfiguration5 = webViewConfiguration3;
                                                                        j2 = b3;
                                                                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType10 = diagnosticAdType4;
                                                                        str9 = str14;
                                                                        diagnosticAdType6 = diagnosticAdType10;
                                                                        byteString7 = byteString3;
                                                                        str10 = str8;
                                                                        adResponse6 = adResponse3;
                                                                        unityAdsLoadOptions8 = unityAdsLoadOptions7;
                                                                        ref$ObjectRef7 = ref$ObjectRef6;
                                                                        try {
                                                                            failure = (AndroidWebViewContainer) invoke2;
                                                                            adObject6 = adObject5;
                                                                            str11 = str9;
                                                                            diagnosticAdType7 = diagnosticAdType6;
                                                                            unityAdsLoadOptions9 = unityAdsLoadOptions8;
                                                                            adResponse3 = adResponse6;
                                                                            str8 = str10;
                                                                            byteString3 = byteString7;
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            webViewConfiguration4 = webViewConfiguration5;
                                                                            ref$ObjectRef6 = ref$ObjectRef7;
                                                                            unityAdsLoadOptions7 = unityAdsLoadOptions8;
                                                                            adResponse3 = adResponse6;
                                                                            str8 = str10;
                                                                            byteString3 = byteString7;
                                                                            String str1522 = str9;
                                                                            diagnosticAdType7 = diagnosticAdType6;
                                                                            unityAdsLoadOptions9 = unityAdsLoadOptions7;
                                                                            ref$ObjectRef7 = ref$ObjectRef6;
                                                                            adObject6 = adObject5;
                                                                            str11 = str1522;
                                                                            failure = new Result.Failure(th);
                                                                            webViewConfiguration5 = webViewConfiguration4;
                                                                            long j522 = j2;
                                                                            i4 = i3;
                                                                            Result result22 = new Result(failure);
                                                                            z13 = z12;
                                                                            long b422 = jvo0.a.b(j522);
                                                                            d = result22.d();
                                                                            coroutineSingletons5 = coroutineSingletons4;
                                                                            SendDiagnosticEvent sendDiagnosticEvent22 = androidHandleGatewayAdResponse.sendDiagnosticEvent;
                                                                            if (d instanceof Result.Failure) {
                                                                            }
                                                                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent22, diagnosticEventType, new Double(zno.k(b422, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject6, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                            adObject7 = adObject6;
                                                                            Object d222 = result22.d();
                                                                            kotlin.a.a(d222);
                                                                            androidWebViewContainer = (AndroidWebViewContainer) d222;
                                                                            WebViewBridge invoke422 = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer, androidHandleGatewayAdResponse.adPlayerScope);
                                                                            ?? invoke522 = androidHandleGatewayAdResponse.getAdPlayer.invoke(invoke422, androidWebViewContainer, adObject7, diagnosticAdType7);
                                                                            ref$ObjectRef7.element = invoke522;
                                                                            copy$default = AdObject.copy$default(adObject7, adObject7.getAdScope(), null, null, null, false, null, invoke522, null, null, false, null, null, null, null, null, null, adObject7.getWebViewLessLoadingRequiredData(), 65470, null);
                                                                            rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(ref$ObjectRef7, null)), ((AdPlayer) ref$ObjectRef7.element).getScope());
                                                                            webViewConfiguration6 = webViewConfiguration5;
                                                                            b2 = k830.b();
                                                                            SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy$default, (Integer) null, (ByteString) null, 110, (Object) null);
                                                                            yvjVar5 = yvjVar4;
                                                                            invoke422.setExposedFunctions(androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer.invoke(ProtobufExtensionsKt.toBase64$default(adResponse3.getAdData(), false, 1, null), ProtobufExtensionsKt.toBase64$default(adResponse3.getAdDataRefreshToken(), false, 1, null), encodeToString, copy$default));
                                                                            if (z13) {
                                                                            }
                                                                            str12 = str8;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$0 = unityAdsLoadOptions9;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$1 = byteString3;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$2 = adResponse3;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$3 = str11;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$4 = ref$ObjectRef7;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$5 = webViewConfiguration6;
                                                                            yvjVar6 = yvjVar5;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$6 = yvjVar6;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$7 = copy$default;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                                                                            androidHandleGatewayAdResponse$invoke$13.I$0 = i4;
                                                                            androidHandleGatewayAdResponse$invoke$13.J$0 = b2;
                                                                            androidHandleGatewayAdResponse$invoke$13.label = 6;
                                                                            coroutineSingletons = coroutineSingletons5;
                                                                            if (androidHandleGatewayAdResponse.loadUrl(adObject7, str12, androidWebViewContainer, androidHandleGatewayAdResponse$invoke$13) != coroutineSingletons) {
                                                                            }
                                                                        }
                                                                        long j5222 = j2;
                                                                        i4 = i3;
                                                                        Result result222 = new Result(failure);
                                                                        z13 = z12;
                                                                        long b4222 = jvo0.a.b(j5222);
                                                                        d = result222.d();
                                                                        coroutineSingletons5 = coroutineSingletons4;
                                                                        SendDiagnosticEvent sendDiagnosticEvent222 = androidHandleGatewayAdResponse.sendDiagnosticEvent;
                                                                        if (d instanceof Result.Failure) {
                                                                            try {
                                                                                diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_SUCCESS_TIME;
                                                                            } catch (CancellationException e16) {
                                                                                e = e16;
                                                                                ref$ObjectRef = ref$ObjectRef7;
                                                                                coroutineSingletons = coroutineSingletons5;
                                                                                r570Var = r570.b;
                                                                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                                                                                androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.label = 9;
                                                                                if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_FAILURE_TIME;
                                                                        }
                                                                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent222, diagnosticEventType, new Double(zno.k(b4222, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject6, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                        adObject7 = adObject6;
                                                                        Object d2222 = result222.d();
                                                                        kotlin.a.a(d2222);
                                                                        androidWebViewContainer = (AndroidWebViewContainer) d2222;
                                                                        WebViewBridge invoke4222 = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer, androidHandleGatewayAdResponse.adPlayerScope);
                                                                        ?? invoke5222 = androidHandleGatewayAdResponse.getAdPlayer.invoke(invoke4222, androidWebViewContainer, adObject7, diagnosticAdType7);
                                                                        ref$ObjectRef7.element = invoke5222;
                                                                        copy$default = AdObject.copy$default(adObject7, adObject7.getAdScope(), null, null, null, false, null, invoke5222, null, null, false, null, null, null, null, null, null, adObject7.getWebViewLessLoadingRequiredData(), 65470, null);
                                                                        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(ref$ObjectRef7, null)), ((AdPlayer) ref$ObjectRef7.element).getScope());
                                                                        webViewConfiguration6 = webViewConfiguration5;
                                                                        b2 = k830.b();
                                                                        SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy$default, (Integer) null, (ByteString) null, 110, (Object) null);
                                                                        yvjVar5 = yvjVar4;
                                                                        invoke4222.setExposedFunctions(androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer.invoke(ProtobufExtensionsKt.toBase64$default(adResponse3.getAdData(), false, 1, null), ProtobufExtensionsKt.toBase64$default(adResponse3.getAdDataRefreshToken(), false, 1, null), encodeToString, copy$default));
                                                                        if (z13 || !androidHandleGatewayAdResponse.sessionRepository.getNativeConfiguration().getFeatureFlags().getWebviewLessLoadParallelActivityLaunch()) {
                                                                            str12 = str8;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$0 = unityAdsLoadOptions9;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$1 = byteString3;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$2 = adResponse3;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$3 = str11;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$4 = ref$ObjectRef7;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$5 = webViewConfiguration6;
                                                                            yvjVar6 = yvjVar5;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$6 = yvjVar6;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$7 = copy$default;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                                                                            androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                                                                            androidHandleGatewayAdResponse$invoke$13.I$0 = i4;
                                                                            androidHandleGatewayAdResponse$invoke$13.J$0 = b2;
                                                                            androidHandleGatewayAdResponse$invoke$13.label = 6;
                                                                            coroutineSingletons = coroutineSingletons5;
                                                                            if (androidHandleGatewayAdResponse.loadUrl(adObject7, str12, androidWebViewContainer, androidHandleGatewayAdResponse$invoke$13) != coroutineSingletons) {
                                                                                return coroutineSingletons;
                                                                            }
                                                                            webViewConfiguration7 = webViewConfiguration6;
                                                                            adObject8 = copy$default;
                                                                            i5 = i4;
                                                                            j3 = b2;
                                                                            ref$ObjectRef = ref$ObjectRef7;
                                                                            str13 = str11;
                                                                            try {
                                                                                ksr<LoadEvent> onLoadEvent = ((AdPlayer) ref$ObjectRef.element).getOnLoadEvent();
                                                                                androidHandleGatewayAdResponse$invoke$13.L$0 = unityAdsLoadOptions9;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$1 = byteString3;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$2 = adResponse3;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$3 = str13;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$4 = ref$ObjectRef;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$5 = webViewConfiguration7;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$6 = yvjVar6;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$7 = adObject8;
                                                                                androidHandleGatewayAdResponse$invoke$13.I$0 = i5;
                                                                                androidHandleGatewayAdResponse$invoke$13.J$0 = j3;
                                                                                androidHandleGatewayAdResponse$invoke$13.label = 7;
                                                                                u = rsr.u(onLoadEvent, androidHandleGatewayAdResponse$invoke$13);
                                                                                if (u != coroutineSingletons) {
                                                                                    return coroutineSingletons;
                                                                                }
                                                                                WebViewConfiguration webViewConfiguration10 = webViewConfiguration7;
                                                                                adObject10 = adObject8;
                                                                                obj = u;
                                                                                unityAdsLoadOptions10 = unityAdsLoadOptions9;
                                                                                webViewConfiguration8 = webViewConfiguration10;
                                                                                loadEvent = (LoadEvent) obj;
                                                                                adObject9 = adObject10;
                                                                                str11 = str13;
                                                                                ref$ObjectRef7 = ref$ObjectRef;
                                                                                i6 = i5;
                                                                                j4 = j3;
                                                                                try {
                                                                                    if (!(loadEvent instanceof LoadEvent.Error)) {
                                                                                        SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CREATE_AD_OBJECT_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(j4))), (Map) null, (Map) null, adObject9, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                                        AdObject adObject12 = adObject9;
                                                                                        if (i6 != 0) {
                                                                                            myc0.h(yvjVar6, null, null, new AndroidHandleGatewayAdResponse$invoke$4(androidHandleGatewayAdResponse, webViewConfiguration8, null), 3);
                                                                                        }
                                                                                        androidHandleGatewayAdResponse.campaignRepository.setLoadTimestamp(byteString3);
                                                                                        androidHandleGatewayAdResponse.adRepository.addAd(byteString3, adObject12);
                                                                                        String objectId = unityAdsLoadOptions10.getObjectId();
                                                                                        if ((objectId == null || drm0.N(objectId)) && (data = unityAdsLoadOptions10.getData()) != null && !data.has("adMarkup")) {
                                                                                            androidHandleGatewayAdResponse.adRepository.enqueueOpportunityForPlacement(str11, byteString3);
                                                                                        }
                                                                                        return new LoadResult.Success(adObject12);
                                                                                    }
                                                                                    SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CREATE_AD_OBJECT_FAILURE_TIME, new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(j4))), (Map) null, (Map) null, adObject9, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                                    r570 r570Var2 = r570.b;
                                                                                    ByteString byteString10 = byteString3;
                                                                                    AdResponseOuterClass.AdResponse adResponse7 = adResponse3;
                                                                                    Ref$ObjectRef ref$ObjectRef9 = ref$ObjectRef7;
                                                                                    try {
                                                                                        AndroidHandleGatewayAdResponse$invoke$3 androidHandleGatewayAdResponse$invoke$3 = new AndroidHandleGatewayAdResponse$invoke$3(androidHandleGatewayAdResponse, loadEvent, byteString10, adResponse7, ref$ObjectRef9, null);
                                                                                        androidHandleGatewayAdResponse$invoke$13.L$0 = byteString3;
                                                                                        androidHandleGatewayAdResponse$invoke$13.L$1 = adResponse3;
                                                                                        androidHandleGatewayAdResponse$invoke$13.L$2 = ref$ObjectRef7;
                                                                                        androidHandleGatewayAdResponse$invoke$13.L$3 = loadEvent;
                                                                                        androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$13.label = 8;
                                                                                        if (myc0.k(r570Var2, androidHandleGatewayAdResponse$invoke$3, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                                                                                            return coroutineSingletons;
                                                                                        }
                                                                                        loadEvent2 = loadEvent;
                                                                                        byteString8 = byteString3;
                                                                                        ref$ObjectRef = ref$ObjectRef7;
                                                                                        try {
                                                                                            return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent2).getMessage(), null, 36, null);
                                                                                        } catch (CancellationException e17) {
                                                                                            e = e17;
                                                                                            byteString3 = byteString8;
                                                                                            r570Var = r570.b;
                                                                                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$13.label = 9;
                                                                                            if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                                                                                            }
                                                                                        }
                                                                                    } catch (CancellationException e18) {
                                                                                        e = e18;
                                                                                        androidHandleGatewayAdResponse = androidHandleGatewayAdResponse;
                                                                                        byteString3 = byteString10;
                                                                                        adResponse3 = adResponse7;
                                                                                        ref$ObjectRef7 = ref$ObjectRef9;
                                                                                        ref$ObjectRef = ref$ObjectRef7;
                                                                                        r570Var = r570.b;
                                                                                        androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                                                                                        androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                                                                                        androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$13.label = 9;
                                                                                        if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                                                                                        }
                                                                                    }
                                                                                } catch (CancellationException e19) {
                                                                                    e = e19;
                                                                                }
                                                                            } catch (CancellationException e20) {
                                                                                e = e20;
                                                                                r570Var = r570.b;
                                                                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                                                                                androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.label = 9;
                                                                                if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            try {
                                                                                myc0.h(androidHandleGatewayAdResponse.adPlayerScope, null, null, new AndroidHandleGatewayAdResponse$invoke$loadEvent$1(androidHandleGatewayAdResponse, adObject7, str8, androidWebViewContainer, null), 3);
                                                                                loadEvent = LoadEvent.Completed.INSTANCE;
                                                                                adObject9 = copy$default;
                                                                                unityAdsLoadOptions10 = unityAdsLoadOptions9;
                                                                                i6 = i4;
                                                                                yvjVar6 = yvjVar5;
                                                                                j4 = b2;
                                                                                coroutineSingletons = coroutineSingletons5;
                                                                                webViewConfiguration8 = webViewConfiguration6;
                                                                                if (!(loadEvent instanceof LoadEvent.Error)) {
                                                                                }
                                                                            } catch (CancellationException e21) {
                                                                                e = e21;
                                                                                androidHandleGatewayAdResponse = androidHandleGatewayAdResponse;
                                                                                ref$ObjectRef = ref$ObjectRef7;
                                                                                coroutineSingletons = coroutineSingletons5;
                                                                                r570Var = r570.b;
                                                                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                                                                                androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                                                                                androidHandleGatewayAdResponse$invoke$13.label = 9;
                                                                                if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                                                                                }
                                                                            }
                                                                        }
                                                                    } catch (CancellationException e22) {
                                                                        e = e22;
                                                                        ref$ObjectRef6 = ref$ObjectRef5;
                                                                        coroutineSingletons = coroutineSingletons3;
                                                                        ref$ObjectRef = ref$ObjectRef6;
                                                                        r570Var = r570.b;
                                                                        androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                                                                        androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                                                                        androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                                                                        androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                                                                        androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                                                                        androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                                                                        androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                                                                        androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                                                                        androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                                                                        androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                                                                        androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                                                                        androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                                                                        androidHandleGatewayAdResponse$invoke$13.label = 9;
                                                                        if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                                                                        }
                                                                    }
                                                                } catch (Throwable unused) {
                                                                    ref$ObjectRef6 = ref$ObjectRef5;
                                                                    androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                                                                    adResponse3 = adResponse5;
                                                                    try {
                                                                        return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "invalid_url", configUrl, null, 36, null);
                                                                    } catch (CancellationException e23) {
                                                                        e = e23;
                                                                        ref$ObjectRef = ref$ObjectRef6;
                                                                        r570Var = r570.b;
                                                                        androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                                                                        androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                                                                        androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                                                                        androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                                                                        androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                                                                        androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                                                                        androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                                                                        androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                                                                        androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                                                                        androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                                                                        androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                                                                        androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                                                                        androidHandleGatewayAdResponse$invoke$13.label = 9;
                                                                        if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                                                                        }
                                                                    }
                                                                }
                                                            } catch (CancellationException e24) {
                                                                e = e24;
                                                                ref$ObjectRef = ref$ObjectRef5;
                                                                androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                                                                adResponse3 = adResponse5;
                                                            }
                                                        } catch (CancellationException e25) {
                                                            e = e25;
                                                            ref$ObjectRef6 = ref$ObjectRef5;
                                                            androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                                                            adResponse3 = adResponse5;
                                                        }
                                                    } catch (CancellationException e26) {
                                                        e = e26;
                                                        androidHandleGatewayAdResponse$invoke$12 = androidHandleGatewayAdResponse$invoke$12;
                                                        coroutineSingletons = coroutineSingletons2;
                                                        androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                                                        adResponse3 = adResponse4;
                                                        byteString3 = byteString4;
                                                        r570Var = r570.b;
                                                        androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                                                        androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                                                        androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                                                        androidHandleGatewayAdResponse$invoke$13.label = 9;
                                                        if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                                                        }
                                                    }
                                                } else {
                                                    coroutineSingletons = coroutineSingletons2;
                                                    yvj yvjVar8 = yvjVar;
                                                    unityAdsLoadOptions6 = unityAdsLoadOptions4;
                                                    ref$ObjectRef5 = ref$ObjectRef;
                                                    webViewConfiguration3 = webViewConfiguration;
                                                    adObject5 = adObject3;
                                                    adResponse5 = adResponse4;
                                                    byteString3 = byteString4;
                                                    str7 = str5;
                                                    z9 = z7;
                                                    yvjVar3 = yvjVar8;
                                                    i2 = r6;
                                                    z10 = z3;
                                                    if (webViewConfiguration3.getEntryPoint().length() == 0) {
                                                    }
                                                }
                                            } catch (CancellationException e27) {
                                                e = e27;
                                                ref$ObjectRef = ref$ObjectRef3;
                                                androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                                                adResponse3 = adResponse4;
                                                byteString3 = byteString4;
                                                r570Var = r570.b;
                                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                                                androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                                                androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                                                androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                                                androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                                                androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                                                androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                                                androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                                                androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                                                androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                                                androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                                                androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                                                androidHandleGatewayAdResponse$invoke$13.label = 9;
                                                if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                                                }
                                            }
                                        } catch (CancellationException e28) {
                                            e = e28;
                                            coroutineSingletons = coroutineSingletons;
                                            ref$ObjectRef = ref$ObjectRef2;
                                            androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                                            adResponse3 = adResponse4;
                                            byteString3 = byteString4;
                                            r570Var = r570.b;
                                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                                            androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                                            androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                                            androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                                            androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                                            androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                                            androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                                            androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                                            androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                                            androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                                            androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                                            androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                                            androidHandleGatewayAdResponse$invoke$13.label = 9;
                                            if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                                            }
                                        }
                                    }
                                } catch (CancellationException e29) {
                                    e = e29;
                                    coroutineSingletons = coroutineSingletons6;
                                    androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                                }
                            } catch (CancellationException e30) {
                                e = e30;
                                coroutineSingletons = coroutineSingletons6;
                                androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                                ref$ObjectRef = ref$ObjectRef8;
                                byteString3 = byteString2;
                                adResponse3 = adResponse2;
                                r570Var = r570.b;
                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                                androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                                androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                                androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                                androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                                androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                                androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                                androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                                androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                                androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                                androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                                androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                                androidHandleGatewayAdResponse$invoke$13.label = 9;
                                if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                                }
                            }
                        } catch (CancellationException e31) {
                            e = e31;
                            byteString3 = byteString;
                            coroutineSingletons = coroutineSingletons6;
                            androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                            ref$ObjectRef = ref$ObjectRef8;
                            adResponse3 = adResponse;
                            r570Var = r570.b;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                            androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                            androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$13.label = 9;
                            if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                            }
                        }
                        break;
                    case 1:
                        z3 = androidHandleGatewayAdResponse$invoke$12.Z$1;
                        boolean z17 = androidHandleGatewayAdResponse$invoke$12.Z$0;
                        ref$ObjectRef2 = (Ref$ObjectRef) androidHandleGatewayAdResponse$invoke$12.L$5;
                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType11 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) androidHandleGatewayAdResponse$invoke$12.L$4;
                        String str16 = (String) androidHandleGatewayAdResponse$invoke$12.L$3;
                        adResponse4 = (AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$12.L$2;
                        byteString4 = (ByteString) androidHandleGatewayAdResponse$invoke$12.L$1;
                        UnityAdsLoadOptions unityAdsLoadOptions12 = (UnityAdsLoadOptions) androidHandleGatewayAdResponse$invoke$12.L$0;
                        try {
                            kotlin.a.a(obj);
                            z4 = z17;
                            diagnosticAdType2 = diagnosticAdType11;
                            str2 = str16;
                            unityAdsLoadOptions2 = unityAdsLoadOptions12;
                            invoke = obj;
                            WebViewConfiguration webViewConfiguration92 = (WebViewConfiguration) invoke;
                            hpj g2 = zvj.g(androidHandleGatewayAdResponse.adPlayerScope, new CoroutineOpportunity(byteString4));
                            if (z3) {
                            }
                            if (androidHandleGatewayAdResponse.sessionRepository.getNativeConfiguration().getFeatureFlags().getUseOptimisticWebviewCache()) {
                            }
                        } catch (CancellationException e32) {
                            e = e32;
                            coroutineSingletons = coroutineSingletons6;
                            ref$ObjectRef = ref$ObjectRef2;
                            androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                            adResponse3 = adResponse4;
                            byteString3 = byteString4;
                            r570Var = r570.b;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                            androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                            androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$13.label = 9;
                            if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                            }
                        }
                        break;
                    case 2:
                        j = androidHandleGatewayAdResponse$invoke$12.J$0;
                        boolean z18 = androidHandleGatewayAdResponse$invoke$12.Z$1;
                        z5 = androidHandleGatewayAdResponse$invoke$12.Z$0;
                        adObject2 = (AdObject) androidHandleGatewayAdResponse$invoke$12.L$8;
                        yvj yvjVar9 = (yvj) androidHandleGatewayAdResponse$invoke$12.L$7;
                        WebViewConfiguration webViewConfiguration11 = (WebViewConfiguration) androidHandleGatewayAdResponse$invoke$12.L$6;
                        Ref$ObjectRef ref$ObjectRef10 = (Ref$ObjectRef) androidHandleGatewayAdResponse$invoke$12.L$5;
                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType12 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) androidHandleGatewayAdResponse$invoke$12.L$4;
                        String str17 = (String) androidHandleGatewayAdResponse$invoke$12.L$3;
                        adResponse5 = (AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$12.L$2;
                        byteString6 = (ByteString) androidHandleGatewayAdResponse$invoke$12.L$1;
                        UnityAdsLoadOptions unityAdsLoadOptions13 = (UnityAdsLoadOptions) androidHandleGatewayAdResponse$invoke$12.L$0;
                        try {
                            kotlin.a.a(obj);
                            str4 = "?platform=android&mode=ad-viewer&webviewType=";
                            z6 = z18;
                            yvjVar2 = yvjVar9;
                            adResponse4 = adResponse5;
                            diagnosticAdType5 = diagnosticAdType12;
                            str6 = str17;
                            webViewConfiguration = webViewConfiguration11;
                            byteString4 = byteString6;
                            coroutineSingletons = coroutineSingletons6;
                            ref$ObjectRef3 = ref$ObjectRef10;
                            unityAdsLoadOptions3 = unityAdsLoadOptions13;
                            warmFromDisk = obj;
                            Boolean bool2 = (Boolean) warmFromDisk;
                            bool2.getClass();
                            boolean z152 = z6;
                            cwo0Var = new cwo0(jvo0.a.b(j), bool2);
                            z3 = z152;
                            ref$ObjectRef = ref$ObjectRef3;
                            adObject = adObject2;
                            unityAdsLoadOptions4 = unityAdsLoadOptions3;
                            yvjVar = yvjVar2;
                            diagnosticAdType4 = diagnosticAdType5;
                            str5 = str6;
                            z7 = z5;
                            if (cwo0Var != null) {
                            }
                            if (cwo0Var != null) {
                            }
                            if (r6 == 0) {
                            }
                        } catch (CancellationException e33) {
                            e = e33;
                            androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                            ref$ObjectRef = ref$ObjectRef10;
                            adResponse3 = adResponse5;
                            byteString3 = byteString6;
                            coroutineSingletons = coroutineSingletons6;
                            r570Var = r570.b;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                            androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                            androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$13.label = 9;
                            if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                            }
                        }
                        break;
                    case 3:
                        i = androidHandleGatewayAdResponse$invoke$12.I$0;
                        z8 = androidHandleGatewayAdResponse$invoke$12.Z$1;
                        z7 = androidHandleGatewayAdResponse$invoke$12.Z$0;
                        adObject4 = (AdObject) androidHandleGatewayAdResponse$invoke$12.L$8;
                        yvjVar = (yvj) androidHandleGatewayAdResponse$invoke$12.L$7;
                        webViewConfiguration2 = (WebViewConfiguration) androidHandleGatewayAdResponse$invoke$12.L$6;
                        ref$ObjectRef4 = (Ref$ObjectRef) androidHandleGatewayAdResponse$invoke$12.L$5;
                        diagnosticAdType4 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) androidHandleGatewayAdResponse$invoke$12.L$4;
                        str5 = (String) androidHandleGatewayAdResponse$invoke$12.L$3;
                        adResponse5 = (AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$12.L$2;
                        byteString6 = (ByteString) androidHandleGatewayAdResponse$invoke$12.L$1;
                        unityAdsLoadOptions5 = (UnityAdsLoadOptions) androidHandleGatewayAdResponse$invoke$12.L$0;
                        try {
                            kotlin.a.a(obj);
                            str4 = "?platform=android&mode=ad-viewer&webviewType=";
                            byteString5 = byteString6;
                            coroutineSingletons = coroutineSingletons6;
                            ref$ObjectRef5 = ref$ObjectRef4;
                            str7 = str5;
                            z9 = z7;
                            yvjVar3 = yvjVar;
                            unityAdsLoadOptions6 = unityAdsLoadOptions5;
                            adObject5 = adObject4;
                            z10 = z8;
                            webViewConfiguration3 = webViewConfiguration2;
                            byteString3 = byteString5;
                            i2 = i;
                            if (webViewConfiguration3.getEntryPoint().length() == 0) {
                            }
                        } catch (CancellationException e34) {
                            e = e34;
                            androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                            ref$ObjectRef = ref$ObjectRef4;
                            adResponse3 = adResponse5;
                            byteString3 = byteString6;
                            coroutineSingletons = coroutineSingletons6;
                            r570Var = r570.b;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                            androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                            androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$13.label = 9;
                            if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                            }
                        }
                        break;
                    case 4:
                        ref$ObjectRef = (Ref$ObjectRef) androidHandleGatewayAdResponse$invoke$12.L$2;
                        AdResponseOuterClass.AdResponse adResponse8 = (AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$12.L$1;
                        ByteString byteString11 = (ByteString) androidHandleGatewayAdResponse$invoke$12.L$0;
                        try {
                            kotlin.a.a(obj);
                            return obj;
                        } catch (CancellationException e35) {
                            e = e35;
                            coroutineSingletons = coroutineSingletons6;
                            byteString3 = byteString11;
                            androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                            adResponse3 = adResponse8;
                            r570Var = r570.b;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                            androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                            androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$13.label = 9;
                            if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                            }
                        }
                        break;
                    case 5:
                        j2 = androidHandleGatewayAdResponse$invoke$12.J$0;
                        int i8 = androidHandleGatewayAdResponse$invoke$12.I$0;
                        z12 = androidHandleGatewayAdResponse$invoke$12.Z$0;
                        String str18 = (String) androidHandleGatewayAdResponse$invoke$12.L$10;
                        str10 = (String) androidHandleGatewayAdResponse$invoke$12.L$9;
                        adObject5 = (AdObject) androidHandleGatewayAdResponse$invoke$12.L$8;
                        yvjVar4 = (yvj) androidHandleGatewayAdResponse$invoke$12.L$7;
                        WebViewConfiguration webViewConfiguration12 = (WebViewConfiguration) androidHandleGatewayAdResponse$invoke$12.L$6;
                        ref$ObjectRef7 = (Ref$ObjectRef) androidHandleGatewayAdResponse$invoke$12.L$5;
                        diagnosticAdType6 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) androidHandleGatewayAdResponse$invoke$12.L$4;
                        str9 = (String) androidHandleGatewayAdResponse$invoke$12.L$3;
                        adResponse6 = (AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$12.L$2;
                        byteString7 = (ByteString) androidHandleGatewayAdResponse$invoke$12.L$1;
                        UnityAdsLoadOptions unityAdsLoadOptions14 = (UnityAdsLoadOptions) androidHandleGatewayAdResponse$invoke$12.L$0;
                        try {
                            kotlin.a.a(obj);
                            i3 = i8;
                            coroutineSingletons4 = coroutineSingletons6;
                            webViewConfiguration5 = webViewConfiguration12;
                            encodeToString = str18;
                            androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                            unityAdsLoadOptions8 = unityAdsLoadOptions14;
                            invoke2 = obj;
                            failure = (AndroidWebViewContainer) invoke2;
                            adObject6 = adObject5;
                            str11 = str9;
                            diagnosticAdType7 = diagnosticAdType6;
                            unityAdsLoadOptions9 = unityAdsLoadOptions8;
                            adResponse3 = adResponse6;
                            str8 = str10;
                            byteString3 = byteString7;
                        } catch (Throwable th6) {
                            th = th6;
                            ref$ObjectRef6 = ref$ObjectRef7;
                            webViewConfiguration4 = webViewConfiguration12;
                            unityAdsLoadOptions7 = unityAdsLoadOptions14;
                            i3 = i8;
                            coroutineSingletons4 = coroutineSingletons6;
                            encodeToString = str18;
                            androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                            adResponse3 = adResponse6;
                            str8 = str10;
                            byteString3 = byteString7;
                            String str15222 = str9;
                            diagnosticAdType7 = diagnosticAdType6;
                            unityAdsLoadOptions9 = unityAdsLoadOptions7;
                            ref$ObjectRef7 = ref$ObjectRef6;
                            adObject6 = adObject5;
                            str11 = str15222;
                            failure = new Result.Failure(th);
                            webViewConfiguration5 = webViewConfiguration4;
                            long j52222 = j2;
                            i4 = i3;
                            Result result2222 = new Result(failure);
                            z13 = z12;
                            long b42222 = jvo0.a.b(j52222);
                            d = result2222.d();
                            coroutineSingletons5 = coroutineSingletons4;
                            SendDiagnosticEvent sendDiagnosticEvent2222 = androidHandleGatewayAdResponse.sendDiagnosticEvent;
                            if (d instanceof Result.Failure) {
                            }
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2222, diagnosticEventType, new Double(zno.k(b42222, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject6, (Integer) null, (ByteString) null, 108, (Object) null);
                            adObject7 = adObject6;
                            Object d22222 = result2222.d();
                            kotlin.a.a(d22222);
                            androidWebViewContainer = (AndroidWebViewContainer) d22222;
                            WebViewBridge invoke42222 = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer, androidHandleGatewayAdResponse.adPlayerScope);
                            ?? invoke52222 = androidHandleGatewayAdResponse.getAdPlayer.invoke(invoke42222, androidWebViewContainer, adObject7, diagnosticAdType7);
                            ref$ObjectRef7.element = invoke52222;
                            copy$default = AdObject.copy$default(adObject7, adObject7.getAdScope(), null, null, null, false, null, invoke52222, null, null, false, null, null, null, null, null, null, adObject7.getWebViewLessLoadingRequiredData(), 65470, null);
                            rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(ref$ObjectRef7, null)), ((AdPlayer) ref$ObjectRef7.element).getScope());
                            webViewConfiguration6 = webViewConfiguration5;
                            b2 = k830.b();
                            SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy$default, (Integer) null, (ByteString) null, 110, (Object) null);
                            yvjVar5 = yvjVar4;
                            invoke42222.setExposedFunctions(androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer.invoke(ProtobufExtensionsKt.toBase64$default(adResponse3.getAdData(), false, 1, null), ProtobufExtensionsKt.toBase64$default(adResponse3.getAdDataRefreshToken(), false, 1, null), encodeToString, copy$default));
                            if (z13) {
                            }
                            str12 = str8;
                            androidHandleGatewayAdResponse$invoke$13.L$0 = unityAdsLoadOptions9;
                            androidHandleGatewayAdResponse$invoke$13.L$1 = byteString3;
                            androidHandleGatewayAdResponse$invoke$13.L$2 = adResponse3;
                            androidHandleGatewayAdResponse$invoke$13.L$3 = str11;
                            androidHandleGatewayAdResponse$invoke$13.L$4 = ref$ObjectRef7;
                            androidHandleGatewayAdResponse$invoke$13.L$5 = webViewConfiguration6;
                            yvjVar6 = yvjVar5;
                            androidHandleGatewayAdResponse$invoke$13.L$6 = yvjVar6;
                            androidHandleGatewayAdResponse$invoke$13.L$7 = copy$default;
                            androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$13.I$0 = i4;
                            androidHandleGatewayAdResponse$invoke$13.J$0 = b2;
                            androidHandleGatewayAdResponse$invoke$13.label = 6;
                            coroutineSingletons = coroutineSingletons5;
                            if (androidHandleGatewayAdResponse.loadUrl(adObject7, str12, androidWebViewContainer, androidHandleGatewayAdResponse$invoke$13) != coroutineSingletons) {
                            }
                        }
                        long j522222 = j2;
                        i4 = i3;
                        Result result22222 = new Result(failure);
                        z13 = z12;
                        long b422222 = jvo0.a.b(j522222);
                        d = result22222.d();
                        coroutineSingletons5 = coroutineSingletons4;
                        SendDiagnosticEvent sendDiagnosticEvent22222 = androidHandleGatewayAdResponse.sendDiagnosticEvent;
                        if (d instanceof Result.Failure) {
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent22222, diagnosticEventType, new Double(zno.k(b422222, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject6, (Integer) null, (ByteString) null, 108, (Object) null);
                        adObject7 = adObject6;
                        Object d222222 = result22222.d();
                        kotlin.a.a(d222222);
                        androidWebViewContainer = (AndroidWebViewContainer) d222222;
                        WebViewBridge invoke422222 = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer, androidHandleGatewayAdResponse.adPlayerScope);
                        ?? invoke522222 = androidHandleGatewayAdResponse.getAdPlayer.invoke(invoke422222, androidWebViewContainer, adObject7, diagnosticAdType7);
                        ref$ObjectRef7.element = invoke522222;
                        copy$default = AdObject.copy$default(adObject7, adObject7.getAdScope(), null, null, null, false, null, invoke522222, null, null, false, null, null, null, null, null, null, adObject7.getWebViewLessLoadingRequiredData(), 65470, null);
                        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(ref$ObjectRef7, null)), ((AdPlayer) ref$ObjectRef7.element).getScope());
                        webViewConfiguration6 = webViewConfiguration5;
                        b2 = k830.b();
                        SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy$default, (Integer) null, (ByteString) null, 110, (Object) null);
                        yvjVar5 = yvjVar4;
                        invoke422222.setExposedFunctions(androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer.invoke(ProtobufExtensionsKt.toBase64$default(adResponse3.getAdData(), false, 1, null), ProtobufExtensionsKt.toBase64$default(adResponse3.getAdDataRefreshToken(), false, 1, null), encodeToString, copy$default));
                        if (z13) {
                            break;
                        }
                        str12 = str8;
                        androidHandleGatewayAdResponse$invoke$13.L$0 = unityAdsLoadOptions9;
                        androidHandleGatewayAdResponse$invoke$13.L$1 = byteString3;
                        androidHandleGatewayAdResponse$invoke$13.L$2 = adResponse3;
                        androidHandleGatewayAdResponse$invoke$13.L$3 = str11;
                        androidHandleGatewayAdResponse$invoke$13.L$4 = ref$ObjectRef7;
                        androidHandleGatewayAdResponse$invoke$13.L$5 = webViewConfiguration6;
                        yvjVar6 = yvjVar5;
                        androidHandleGatewayAdResponse$invoke$13.L$6 = yvjVar6;
                        androidHandleGatewayAdResponse$invoke$13.L$7 = copy$default;
                        androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                        androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                        androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                        androidHandleGatewayAdResponse$invoke$13.I$0 = i4;
                        androidHandleGatewayAdResponse$invoke$13.J$0 = b2;
                        androidHandleGatewayAdResponse$invoke$13.label = 6;
                        coroutineSingletons = coroutineSingletons5;
                        if (androidHandleGatewayAdResponse.loadUrl(adObject7, str12, androidWebViewContainer, androidHandleGatewayAdResponse$invoke$13) != coroutineSingletons) {
                        }
                        break;
                    case 6:
                        long j6 = androidHandleGatewayAdResponse$invoke$12.J$0;
                        i5 = androidHandleGatewayAdResponse$invoke$12.I$0;
                        AdObject adObject13 = (AdObject) androidHandleGatewayAdResponse$invoke$12.L$7;
                        yvj yvjVar10 = (yvj) androidHandleGatewayAdResponse$invoke$12.L$6;
                        WebViewConfiguration webViewConfiguration13 = (WebViewConfiguration) androidHandleGatewayAdResponse$invoke$12.L$5;
                        Ref$ObjectRef ref$ObjectRef11 = (Ref$ObjectRef) androidHandleGatewayAdResponse$invoke$12.L$4;
                        str13 = (String) androidHandleGatewayAdResponse$invoke$12.L$3;
                        AdResponseOuterClass.AdResponse adResponse9 = (AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$12.L$2;
                        ByteString byteString12 = (ByteString) androidHandleGatewayAdResponse$invoke$12.L$1;
                        UnityAdsLoadOptions unityAdsLoadOptions15 = (UnityAdsLoadOptions) androidHandleGatewayAdResponse$invoke$12.L$0;
                        try {
                            kotlin.a.a(obj);
                            adObject8 = adObject13;
                            unityAdsLoadOptions9 = unityAdsLoadOptions15;
                            coroutineSingletons = coroutineSingletons6;
                            j3 = j6;
                            webViewConfiguration7 = webViewConfiguration13;
                            ref$ObjectRef = ref$ObjectRef11;
                            byteString3 = byteString12;
                            yvjVar6 = yvjVar10;
                            androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                            adResponse3 = adResponse9;
                            ksr<LoadEvent> onLoadEvent2 = ((AdPlayer) ref$ObjectRef.element).getOnLoadEvent();
                            androidHandleGatewayAdResponse$invoke$13.L$0 = unityAdsLoadOptions9;
                            androidHandleGatewayAdResponse$invoke$13.L$1 = byteString3;
                            androidHandleGatewayAdResponse$invoke$13.L$2 = adResponse3;
                            androidHandleGatewayAdResponse$invoke$13.L$3 = str13;
                            androidHandleGatewayAdResponse$invoke$13.L$4 = ref$ObjectRef;
                            androidHandleGatewayAdResponse$invoke$13.L$5 = webViewConfiguration7;
                            androidHandleGatewayAdResponse$invoke$13.L$6 = yvjVar6;
                            androidHandleGatewayAdResponse$invoke$13.L$7 = adObject8;
                            androidHandleGatewayAdResponse$invoke$13.I$0 = i5;
                            androidHandleGatewayAdResponse$invoke$13.J$0 = j3;
                            androidHandleGatewayAdResponse$invoke$13.label = 7;
                            u = rsr.u(onLoadEvent2, androidHandleGatewayAdResponse$invoke$13);
                            if (u != coroutineSingletons) {
                            }
                        } catch (CancellationException e36) {
                            e = e36;
                            coroutineSingletons = coroutineSingletons6;
                            androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                            ref$ObjectRef = ref$ObjectRef11;
                            adResponse3 = adResponse9;
                            byteString3 = byteString12;
                            r570Var = r570.b;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                            androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                            androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$13.label = 9;
                            if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                            }
                        }
                        break;
                    case 7:
                        long j7 = androidHandleGatewayAdResponse$invoke$12.J$0;
                        i5 = androidHandleGatewayAdResponse$invoke$12.I$0;
                        AdObject adObject14 = (AdObject) androidHandleGatewayAdResponse$invoke$12.L$7;
                        yvj yvjVar11 = (yvj) androidHandleGatewayAdResponse$invoke$12.L$6;
                        WebViewConfiguration webViewConfiguration14 = (WebViewConfiguration) androidHandleGatewayAdResponse$invoke$12.L$5;
                        Ref$ObjectRef ref$ObjectRef12 = (Ref$ObjectRef) androidHandleGatewayAdResponse$invoke$12.L$4;
                        str13 = (String) androidHandleGatewayAdResponse$invoke$12.L$3;
                        AdResponseOuterClass.AdResponse adResponse10 = (AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$12.L$2;
                        byteString6 = (ByteString) androidHandleGatewayAdResponse$invoke$12.L$1;
                        UnityAdsLoadOptions unityAdsLoadOptions16 = (UnityAdsLoadOptions) androidHandleGatewayAdResponse$invoke$12.L$0;
                        try {
                            kotlin.a.a(obj);
                            webViewConfiguration8 = webViewConfiguration14;
                            byteString3 = byteString6;
                            coroutineSingletons = coroutineSingletons6;
                            adObject10 = adObject14;
                            j3 = j7;
                            ref$ObjectRef = ref$ObjectRef12;
                            unityAdsLoadOptions10 = unityAdsLoadOptions16;
                            yvjVar6 = yvjVar11;
                            androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                            adResponse3 = adResponse10;
                            loadEvent = (LoadEvent) obj;
                            adObject9 = adObject10;
                            str11 = str13;
                            ref$ObjectRef7 = ref$ObjectRef;
                            i6 = i5;
                            j4 = j3;
                            if (!(loadEvent instanceof LoadEvent.Error)) {
                            }
                        } catch (CancellationException e37) {
                            e = e37;
                            androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                            ref$ObjectRef = ref$ObjectRef12;
                            adResponse3 = adResponse10;
                            byteString3 = byteString6;
                            coroutineSingletons = coroutineSingletons6;
                            r570Var = r570.b;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                            androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                            androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$13.label = 9;
                            if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                            }
                        }
                        break;
                    case 8:
                        loadEvent2 = (LoadEvent) androidHandleGatewayAdResponse$invoke$12.L$3;
                        ref$ObjectRef = (Ref$ObjectRef) androidHandleGatewayAdResponse$invoke$12.L$2;
                        AdResponseOuterClass.AdResponse adResponse11 = (AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$12.L$1;
                        byteString8 = (ByteString) androidHandleGatewayAdResponse$invoke$12.L$0;
                        try {
                            kotlin.a.a(obj);
                            coroutineSingletons = coroutineSingletons6;
                            androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                            adResponse3 = adResponse11;
                            return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent2).getMessage(), null, 36, null);
                        } catch (CancellationException e38) {
                            e = e38;
                            coroutineSingletons = coroutineSingletons6;
                            byteString3 = byteString8;
                            androidHandleGatewayAdResponse$invoke$13 = androidHandleGatewayAdResponse$invoke$12;
                            adResponse3 = adResponse11;
                            r570Var = r570.b;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, e, byteString3, adResponse3, ref$ObjectRef, null);
                            androidHandleGatewayAdResponse$invoke$13.L$0 = e;
                            androidHandleGatewayAdResponse$invoke$13.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$13.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$13.label = 9;
                            if (myc0.k(r570Var, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$13) == coroutineSingletons) {
                            }
                        }
                        break;
                    case 9:
                        cancellationException = (CancellationException) androidHandleGatewayAdResponse$invoke$12.L$0;
                        kotlin.a.a(obj);
                        cause = cancellationException.getCause();
                        if (cause != null) {
                            throw cancellationException;
                        }
                        throw cause;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        androidHandleGatewayAdResponse$invoke$1 = new AndroidHandleGatewayAdResponse$invoke$1(androidHandleGatewayAdResponse, spjVar);
        androidHandleGatewayAdResponse$invoke$12 = androidHandleGatewayAdResponse$invoke$1;
        Object obj2 = androidHandleGatewayAdResponse$invoke$12.result;
        CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (androidHandleGatewayAdResponse$invoke$12.label) {
        }
    }
}
