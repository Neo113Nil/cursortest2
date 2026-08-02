package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ErrorExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.AdResponseKt;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import xsna.b6l;
import xsna.jvo0;
import xsna.k830;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;
import xsna.zno;

/* compiled from: AndroidLoad.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidLoad$invoke$2", f = "AndroidLoad.kt", l = {97, 101, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 164}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidLoad$invoke$2 extends SuspendLambda implements wzs<yvj, spj<? super LoadResult>, Object> {
    final /* synthetic */ AdRequestOuterClass.BannerSize $bannerSize;
    final /* synthetic */ Context $context;
    final /* synthetic */ HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup $headerBiddingAdMarkup;
    final /* synthetic */ UnityAdsLoadOptions $loadOptions;
    final /* synthetic */ ByteString $opportunityId;
    final /* synthetic */ String $placement;
    int I$0;
    int I$1;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ AndroidLoad this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLoad$invoke$2(AdRequestOuterClass.BannerSize bannerSize, AndroidLoad androidLoad, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, ByteString byteString, String str, UnityAdsLoadOptions unityAdsLoadOptions, Context context, spj<? super AndroidLoad$invoke$2> spjVar) {
        super(2, spjVar);
        this.$bannerSize = bannerSize;
        this.this$0 = androidLoad;
        this.$headerBiddingAdMarkup = headerBiddingAdMarkup;
        this.$opportunityId = byteString;
        this.$placement = str;
        this.$loadOptions = unityAdsLoadOptions;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        AndroidLoad$invoke$2 androidLoad$invoke$2 = new AndroidLoad$invoke$2(this.$bannerSize, this.this$0, this.$headerBiddingAdMarkup, this.$opportunityId, this.$placement, this.$loadOptions, this.$context, spjVar);
        androidLoad$invoke$2.L$0 = obj;
        return androidLoad$invoke$2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(1:(1:(6:(1:(1:(4:8|9|10|11)(2:44|45))(13:46|47|48|49|50|51|52|53|54|55|(1:57)(1:96)|58|(7:60|(6:62|(1:64)|65|66|(2:22|(1:24)(2:25|(2:27|(1:29))(2:30|31)))|33)|67|65|66|(0)|33)(16:68|(1:70)|71|(1:73)|74|75|76|77|78|(1:80)(1:94)|81|82|83|84|85|(1:88)(1:87))))(22:111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|(1:134)(10:133|50|51|52|53|54|55|(0)(0)|58|(0)(0)))|41|19|20|(0)|33)(22:158|159|160|161|162|163|164|165|166|(1:168)(1:172)|169|170|76|77|78|(0)(0)|81|82|83|84|85|(0)(0)))(19:189|190|191|192|193|194|195|196|197|198|199|200|201|202|203|204|205|206|(2:208|209)(19:210|162|163|164|165|166|(0)(0)|169|170|76|77|78|(0)(0)|81|82|83|84|85|(0)(0))))(7:230|(1:232)(1:309)|233|234|235|236|(4:238|20|(0)|33)(12:(1:240)(1:305)|241|242|243|244|245|246|247|248|(3:250|251|252)(1:299)|253|(6:281|282|283|284|285|(2:287|288)(16:289|193|194|195|196|197|198|199|200|201|202|203|204|205|206|(0)(0)))(13:255|256|257|(2:259|260)(1:278)|261|262|263|264|265|266|267|268|(1:271)(19:270|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|(0)(0)))))|12|13|(2:15|(1:17)(1:34))(2:35|(2:37|38))|18|19|20|(0)|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x05ef, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x05f0, code lost:
    
        r1 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x04d7 A[Catch: UnityAdsNetworkException -> 0x04f5, TryCatch #6 {UnityAdsNetworkException -> 0x04f5, blocks: (B:55:0x0492, B:58:0x04ac, B:60:0x04d7, B:62:0x04eb, B:66:0x04fc, B:68:0x051d, B:70:0x056d, B:71:0x0574, B:73:0x057e, B:74:0x058c), top: B:54:0x0492 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x051d A[Catch: UnityAdsNetworkException -> 0x04f5, TryCatch #6 {UnityAdsNetworkException -> 0x04f5, blocks: (B:55:0x0492, B:58:0x04ac, B:60:0x04d7, B:62:0x04eb, B:66:0x04fc, B:68:0x051d, B:70:0x056d, B:71:0x0574, B:73:0x057e, B:74:0x058c), top: B:54:0x0492 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04aa  */
    /* JADX WARN: Type inference failed for: r0v121, types: [int] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47, types: [int] */
    /* JADX WARN: Type inference failed for: r3v49, types: [int] */
    /* JADX WARN: Type inference failed for: r3v50, types: [int] */
    /* JADX WARN: Type inference failed for: r3v52, types: [int] */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54, types: [int] */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.unity3d.ads.core.domain.AndroidLoad] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36, types: [com.unity3d.ads.core.domain.AndroidLoad] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41, types: [com.unity3d.ads.core.domain.AndroidLoad] */
    /* JADX WARN: Type inference failed for: r4v42, types: [com.unity3d.ads.core.domain.AndroidLoad] */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v55, types: [com.unity3d.ads.core.domain.AndroidLoad] */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v23 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        long b;
        ?? r4;
        ?? r3;
        SessionRepository sessionRepository;
        AndroidLoad androidLoad;
        long j;
        AdObject tmpAdObject;
        String str;
        String str2;
        Object obj2;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup;
        GetAdRequest getAdRequest;
        Object invoke;
        Object obj3;
        ByteString byteString;
        UnityAdsLoadOptions unityAdsLoadOptions;
        String str3;
        Context context;
        AndroidLoad androidLoad2;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType;
        int i;
        Object obj4;
        GetAdPlayerConfigRequest getAdPlayerConfigRequest;
        ByteString configurationToken;
        GetAdPlayerConfigRequest getAdPlayerConfigRequest2;
        AdFormatOuterClass.AdFormat adFormat;
        LoadConfigurationInternal loadConfigurationInternal;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup2;
        Object invoke2;
        String str4;
        ByteString byteString2;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup3;
        Context context2;
        UnityAdsLoadOptions unityAdsLoadOptions2;
        AndroidLoad androidLoad3;
        AdObject adObject;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2;
        int i2;
        ValidateExtrasSize validateExtrasSize;
        Object failure;
        ?? r9;
        int i3;
        GetRequestPolicy getRequestPolicy;
        int i4;
        long b2;
        Context context3;
        UnityAdsLoadOptions unityAdsLoadOptions3;
        ByteString byteString3;
        long j2;
        int i5;
        Object obj5;
        String str5;
        ?? r32;
        String str6;
        ByteString byteString4;
        long j3;
        GatewayClient gatewayClient;
        Object request$default;
        long j4;
        int i6;
        AdObject adObject2;
        UnityAdsLoadOptions unityAdsLoadOptions4;
        Context context4;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType3;
        Object obj6;
        AdObject adObject3;
        AndroidLoad androidLoad4;
        SendDiagnosticEvent sendDiagnosticEvent;
        AdResponseOuterClass.AdResponse adResponse;
        boolean z2;
        long j5;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType4;
        UnityAdsLoadOptions unityAdsLoadOptions5;
        AndroidLoad androidLoad5;
        int i7;
        Context context5;
        boolean z3;
        int i8;
        GetRequestPolicy getRequestPolicy2;
        int i9;
        long b3;
        Context context6;
        String str7;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup4;
        long j6;
        int i10;
        UnityAdsLoadOptions unityAdsLoadOptions6;
        ByteString byteString5;
        ByteString byteString6;
        String str8;
        UnityAdsLoadOptions unityAdsLoadOptions7;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup5;
        long j7;
        GatewayClient gatewayClient2;
        Object request$default2;
        ?? r33;
        long j8;
        int i11;
        boolean z4;
        Object failure2;
        ByteString byteString7;
        HandleGatewayAdResponse handleGatewayAdResponse;
        boolean z5;
        AndroidLoad$invoke$2 androidLoad$invoke$2;
        Object invoke3;
        boolean z6;
        SendDiagnosticEvent sendDiagnosticEvent2;
        UniversalResponseOuterClass.UniversalResponse universalResponse;
        String str9;
        Object failure3;
        Object handleGatewayException;
        SessionRepository sessionRepository2;
        SessionRepository sessionRepository3;
        boolean isCachePhaseFailure;
        SessionRepository sessionRepository4;
        SessionRepository sessionRepository5;
        boolean z7;
        Object obj7;
        Object obj8;
        AdRepository adRepository;
        AndroidLoad$invoke$2 androidLoad$invoke$22 = this;
        Object obj9 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = androidLoad$invoke$22.label;
        if (i12 == 0) {
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) androidLoad$invoke$22.L$0;
            z = androidLoad$invoke$22.$bannerSize != null;
            b = k830.b();
            r4 = androidLoad$invoke$22.this$0;
            HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup6 = androidLoad$invoke$22.$headerBiddingAdMarkup;
            ByteString byteString8 = androidLoad$invoke$22.$opportunityId;
            String str10 = androidLoad$invoke$22.$placement;
            UnityAdsLoadOptions unityAdsLoadOptions8 = androidLoad$invoke$22.$loadOptions;
            AdRequestOuterClass.BannerSize bannerSize = androidLoad$invoke$22.$bannerSize;
            Context context7 = androidLoad$invoke$22.$context;
            try {
                sessionRepository = ((AndroidLoad) r4).sessionRepository;
                try {
                } catch (UnityAdsNetworkException e) {
                    e = e;
                }
            } catch (UnityAdsNetworkException e2) {
                e = e2;
            }
            if (!sessionRepository.isSdkInitialized()) {
                failure = new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED, UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_SDK_NOT_INITIALIZED, null, "not_initialized", null, null, 52, null);
                failure3 = failure;
                if (!z) {
                }
                return failure3;
            }
            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType5 = z ? DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER : DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
            boolean isEmpty = headerBiddingAdMarkup6.getAdData().isEmpty();
            boolean z8 = !isEmpty;
            androidLoad = r4;
            try {
                tmpAdObject = androidLoad.getTmpAdObject(byteString8, str10, z8, diagnosticAdType5, unityAdsLoadOptions8);
                str = "native_load_config_success_time";
                boolean z9 = z8;
                str2 = "native_load_config_failure_time";
                try {
                    LoadConfigurationInternal loadConfigurationInternal2 = unityAdsLoadOptions8.loadConfiguration;
                    if (loadConfigurationInternal2 != null) {
                        try {
                            validateExtrasSize = androidLoad.validateExtrasSize;
                            headerBiddingAdMarkup = headerBiddingAdMarkup6;
                            obj2 = obj9;
                            obj9 = "load";
                            validateExtrasSize.invoke(loadConfigurationInternal2.getExtras(), "load", tmpAdObject);
                            s3q0 s3q0Var = s3q0.a;
                        } catch (UnityAdsNetworkException e3) {
                            e = e3;
                            r4 = androidLoad;
                            r3 = z ? 1 : 0;
                            j = b;
                            handleGatewayException = r4.handleGatewayException(e);
                            b = j;
                            obj7 = handleGatewayException;
                            z7 = r3;
                            failure = obj7;
                            z = z7;
                            failure3 = failure;
                            if (!z) {
                            }
                            return failure3;
                        }
                    } else {
                        obj2 = obj9;
                        headerBiddingAdMarkup = headerBiddingAdMarkup6;
                    }
                    try {
                        if (isEmpty) {
                            try {
                                androidLoad.incrementLoadRequestCount(z);
                                getAdRequest = androidLoad.getAdRequest;
                                LoadConfigurationInternal loadConfigurationInternal3 = unityAdsLoadOptions8.loadConfiguration;
                                androidLoad$invoke$22.L$0 = androidLoad;
                                androidLoad$invoke$22.L$1 = byteString8;
                                androidLoad$invoke$22.L$2 = str10;
                                androidLoad$invoke$22.L$3 = unityAdsLoadOptions8;
                                androidLoad$invoke$22.L$4 = context7;
                                androidLoad$invoke$22.L$5 = yvjVar;
                                androidLoad$invoke$22.L$6 = diagnosticAdType5;
                                androidLoad$invoke$22.L$7 = tmpAdObject;
                                androidLoad$invoke$22.I$0 = z ? 1 : 0;
                                androidLoad$invoke$22.J$0 = b;
                                androidLoad$invoke$22.I$1 = z9 ? 1 : 0;
                                androidLoad$invoke$22.label = 1;
                                invoke = getAdRequest.invoke(str10, byteString8, bannerSize, loadConfigurationInternal3, androidLoad$invoke$22);
                                obj3 = obj2;
                                if (invoke == obj3) {
                                    return obj3;
                                }
                                byteString = byteString8;
                                unityAdsLoadOptions = unityAdsLoadOptions8;
                                str3 = str10;
                                context = context7;
                                androidLoad2 = androidLoad;
                                diagnosticAdType = diagnosticAdType5;
                                i = z ? 1 : 0;
                                r9 = z9;
                                UniversalRequestOuterClass.UniversalRequest universalRequest = (UniversalRequestOuterClass.UniversalRequest) invoke;
                                getRequestPolicy = androidLoad2.getRequestPolicy;
                                RequestPolicy invoke4 = getRequestPolicy.invoke();
                                i4 = i;
                                b2 = k830.b();
                                gatewayClient = androidLoad2.gatewayClient;
                                OperationType operationType = OperationType.LOAD;
                                androidLoad$invoke$22.L$0 = androidLoad2;
                                androidLoad$invoke$22.L$1 = byteString;
                                androidLoad$invoke$22.L$2 = str3;
                                androidLoad$invoke$22.L$3 = unityAdsLoadOptions;
                                androidLoad$invoke$22.L$4 = context;
                                androidLoad$invoke$22.L$5 = diagnosticAdType;
                                androidLoad$invoke$22.L$6 = tmpAdObject;
                                androidLoad$invoke$22.L$7 = null;
                                i5 = i4;
                                androidLoad$invoke$22.I$0 = i5;
                                androidLoad$invoke$22.J$0 = b;
                                androidLoad$invoke$22.I$1 = r9;
                                androidLoad$invoke$22.J$1 = b2;
                                androidLoad$invoke$22.label = 2;
                                context3 = context;
                                byteString3 = byteString;
                                j2 = b2;
                                unityAdsLoadOptions3 = unityAdsLoadOptions;
                                obj5 = obj3;
                                str5 = str3;
                                request$default = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, invoke4, operationType, androidLoad$invoke$22, 1, null);
                                if (request$default != obj5) {
                                }
                            } catch (UnityAdsNetworkException e4) {
                                e = e4;
                                obj9 = androidLoad;
                                r3 = z ? 1 : 0;
                                r4 = obj9;
                                j = b;
                                handleGatewayException = r4.handleGatewayException(e);
                                b = j;
                                obj7 = handleGatewayException;
                                z7 = r3;
                                failure = obj7;
                                z = z7;
                                failure3 = failure;
                                if (!z) {
                                }
                                return failure3;
                            }
                        } else {
                            obj4 = obj2;
                            try {
                                androidLoad.incrementLoadRequestAdmCount(z);
                                getAdPlayerConfigRequest = androidLoad.getAdPlayerConfigRequest;
                                configurationToken = headerBiddingAdMarkup.getConfigurationToken();
                                if (bannerSize != null) {
                                    getAdPlayerConfigRequest2 = getAdPlayerConfigRequest;
                                    adFormat = AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER;
                                } else {
                                    getAdPlayerConfigRequest2 = getAdPlayerConfigRequest;
                                    adFormat = null;
                                }
                                loadConfigurationInternal = unityAdsLoadOptions8.loadConfiguration;
                                androidLoad$invoke$22.L$0 = androidLoad;
                                androidLoad = androidLoad;
                                headerBiddingAdMarkup2 = headerBiddingAdMarkup;
                                androidLoad$invoke$22.L$1 = headerBiddingAdMarkup2;
                                androidLoad$invoke$22.L$2 = byteString8;
                                androidLoad$invoke$22.L$3 = str10;
                                androidLoad$invoke$22.L$4 = unityAdsLoadOptions8;
                                androidLoad$invoke$22.L$5 = context7;
                                androidLoad$invoke$22.L$6 = yvjVar;
                                androidLoad$invoke$22.L$7 = diagnosticAdType5;
                                androidLoad$invoke$22.L$8 = tmpAdObject;
                                androidLoad$invoke$22.I$0 = z ? 1 : 0;
                                androidLoad$invoke$22.J$0 = b;
                                androidLoad$invoke$22.I$1 = z9 ? 1 : 0;
                                androidLoad$invoke$22.label = 3;
                            } catch (UnityAdsNetworkException e5) {
                                e = e5;
                                androidLoad = androidLoad;
                            }
                            try {
                                invoke2 = getAdPlayerConfigRequest2.invoke(str10, byteString8, configurationToken, adFormat, loadConfigurationInternal, androidLoad$invoke$22);
                                androidLoad$invoke$22 = androidLoad$invoke$22;
                                if (invoke2 == obj4) {
                                    return obj4;
                                }
                                str4 = str10;
                                byteString2 = byteString8;
                                headerBiddingAdMarkup3 = headerBiddingAdMarkup2;
                                context2 = context7;
                                unityAdsLoadOptions2 = unityAdsLoadOptions8;
                                androidLoad3 = androidLoad;
                                adObject = tmpAdObject;
                                diagnosticAdType2 = diagnosticAdType5;
                                i2 = z ? 1 : 0;
                                z3 = z9;
                                UniversalRequestOuterClass.UniversalRequest universalRequest2 = (UniversalRequestOuterClass.UniversalRequest) invoke2;
                                getRequestPolicy2 = androidLoad3.getRequestPolicy;
                                RequestPolicy invoke5 = getRequestPolicy2.invoke();
                                i9 = i2;
                                b3 = k830.b();
                                gatewayClient2 = androidLoad3.gatewayClient;
                                OperationType operationType2 = OperationType.LOAD_HEADER_BIDDING;
                                androidLoad$invoke$22.L$0 = androidLoad3;
                                androidLoad$invoke$22.L$1 = headerBiddingAdMarkup3;
                                androidLoad$invoke$22.L$2 = byteString2;
                                androidLoad$invoke$22.L$3 = str4;
                                androidLoad$invoke$22.L$4 = unityAdsLoadOptions2;
                                androidLoad$invoke$22.L$5 = context2;
                                androidLoad$invoke$22.L$6 = diagnosticAdType2;
                                androidLoad$invoke$22.L$7 = adObject;
                                context6 = context2;
                                androidLoad$invoke$22.L$8 = null;
                                androidLoad$invoke$22.I$0 = i9;
                                androidLoad$invoke$22.J$0 = b;
                                androidLoad$invoke$22.I$1 = z3 ? 1 : 0;
                                androidLoad$invoke$22.J$1 = b3;
                                androidLoad$invoke$22.label = 4;
                                headerBiddingAdMarkup4 = headerBiddingAdMarkup3;
                                j6 = b3;
                                byteString5 = byteString2;
                                unityAdsLoadOptions6 = unityAdsLoadOptions2;
                                i10 = i9;
                                str7 = str4;
                                request$default2 = GatewayClient.DefaultImpls.request$default(gatewayClient2, null, universalRequest2, invoke5, operationType2, androidLoad$invoke$22, 1, null);
                                if (request$default2 != obj4) {
                                }
                            } catch (UnityAdsNetworkException e6) {
                                e = e6;
                                androidLoad$invoke$22 = androidLoad$invoke$22;
                                r3 = z ? 1 : 0;
                                j = b;
                                r4 = androidLoad;
                                handleGatewayException = r4.handleGatewayException(e);
                                b = j;
                                obj7 = handleGatewayException;
                                z7 = r3;
                                failure = obj7;
                                z = z7;
                                failure3 = failure;
                                if (!z) {
                                }
                                return failure3;
                            }
                        }
                    } catch (UnityAdsNetworkException e7) {
                        e = e7;
                    }
                } catch (UnityAdsNetworkException e8) {
                    e = e8;
                    androidLoad = androidLoad;
                }
            } catch (UnityAdsNetworkException e9) {
                e = e9;
            }
        } else if (i12 == 1) {
            int i13 = androidLoad$invoke$22.I$1;
            j = androidLoad$invoke$22.J$0;
            r3 = androidLoad$invoke$22.I$0;
            AdObject adObject4 = (AdObject) androidLoad$invoke$22.L$7;
            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType6 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) androidLoad$invoke$22.L$6;
            Context context8 = (Context) androidLoad$invoke$22.L$4;
            UnityAdsLoadOptions unityAdsLoadOptions9 = (UnityAdsLoadOptions) androidLoad$invoke$22.L$3;
            String str11 = (String) androidLoad$invoke$22.L$2;
            ByteString byteString9 = (ByteString) androidLoad$invoke$22.L$1;
            androidLoad2 = (AndroidLoad) androidLoad$invoke$22.L$0;
            try {
                kotlin.a.a(obj);
                str2 = "native_load_config_failure_time";
                str = "native_load_config_success_time";
                byteString = byteString9;
                r9 = i13;
                i = r3;
                tmpAdObject = adObject4;
                obj3 = obj9;
                str3 = str11;
                invoke = obj;
                diagnosticAdType = diagnosticAdType6;
                context = context8;
                unityAdsLoadOptions = unityAdsLoadOptions9;
                b = j;
                try {
                    UniversalRequestOuterClass.UniversalRequest universalRequest3 = (UniversalRequestOuterClass.UniversalRequest) invoke;
                    getRequestPolicy = androidLoad2.getRequestPolicy;
                    RequestPolicy invoke42 = getRequestPolicy.invoke();
                    i4 = i;
                } catch (UnityAdsNetworkException e10) {
                    e = e10;
                    i3 = i;
                }
            } catch (UnityAdsNetworkException e11) {
                e = e11;
                r4 = androidLoad2;
                handleGatewayException = r4.handleGatewayException(e);
                b = j;
                obj7 = handleGatewayException;
                z7 = r3;
                failure = obj7;
                z = z7;
                failure3 = failure;
                if (!z) {
                }
                return failure3;
            }
            try {
                b2 = k830.b();
                try {
                    gatewayClient = androidLoad2.gatewayClient;
                    OperationType operationType3 = OperationType.LOAD;
                    androidLoad$invoke$22.L$0 = androidLoad2;
                    androidLoad$invoke$22.L$1 = byteString;
                    androidLoad$invoke$22.L$2 = str3;
                    androidLoad$invoke$22.L$3 = unityAdsLoadOptions;
                    androidLoad$invoke$22.L$4 = context;
                    androidLoad$invoke$22.L$5 = diagnosticAdType;
                    androidLoad$invoke$22.L$6 = tmpAdObject;
                    androidLoad$invoke$22.L$7 = null;
                    i5 = i4;
                    try {
                        androidLoad$invoke$22.I$0 = i5;
                        androidLoad$invoke$22.J$0 = b;
                        androidLoad$invoke$22.I$1 = r9;
                        androidLoad$invoke$22.J$1 = b2;
                        androidLoad$invoke$22.label = 2;
                        context3 = context;
                        byteString3 = byteString;
                        j2 = b2;
                        unityAdsLoadOptions3 = unityAdsLoadOptions;
                        obj5 = obj3;
                        str5 = str3;
                        try {
                            request$default = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest3, invoke42, operationType3, androidLoad$invoke$22, 1, null);
                        } catch (Throwable th) {
                            th = th;
                            r32 = r9;
                            r4 = androidLoad2;
                            str6 = str5;
                            byteString4 = byteString3;
                            j3 = j2;
                            Result.Failure failure4 = new Result.Failure(th);
                            Context context9 = context3;
                            androidLoad = r4;
                            i6 = i5;
                            context4 = context9;
                            obj6 = failure4;
                            j4 = b;
                            adObject3 = tmpAdObject;
                            unityAdsLoadOptions4 = unityAdsLoadOptions3;
                            diagnosticAdType3 = diagnosticAdType;
                            Result result = new Result(obj6);
                            long b4 = jvo0.a.b(j3);
                            Object d = result.d();
                            sendDiagnosticEvent = androidLoad.sendDiagnosticEvent;
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, !(d instanceof Result.Failure) ? str : str2, new Double(zno.k(b4, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject3, (Integer) null, (ByteString) null, 108, (Object) null);
                            Object d2 = result.d();
                            kotlin.a.a(d2);
                            adResponse = ((UniversalResponseOuterClass.UniversalResponse) d2).getPayload().getAdResponse();
                            z2 = r32;
                            j5 = j4;
                            diagnosticAdType4 = diagnosticAdType3;
                            unityAdsLoadOptions5 = unityAdsLoadOptions4;
                            androidLoad5 = androidLoad;
                            i7 = i6;
                            context5 = context4;
                            obj4 = obj5;
                            byteString7 = byteString4;
                            AdResponseOuterClass.AdResponse adResponse2 = adResponse;
                            handleGatewayAdResponse = androidLoad5.handleGatewayAdResponse;
                            if (!z2) {
                            }
                            androidLoad$invoke$22.L$0 = androidLoad5;
                            androidLoad$invoke$22.L$1 = byteString7;
                            androidLoad$invoke$22.L$2 = null;
                            androidLoad$invoke$22.L$3 = null;
                            androidLoad$invoke$22.L$4 = null;
                            androidLoad$invoke$22.L$5 = null;
                            androidLoad$invoke$22.L$6 = null;
                            androidLoad$invoke$22.L$7 = null;
                            androidLoad$invoke$22.L$8 = null;
                            androidLoad$invoke$22.I$0 = i7;
                            androidLoad$invoke$22.J$0 = j5;
                            androidLoad$invoke$22.label = 5;
                            androidLoad$invoke$2 = androidLoad$invoke$22;
                            invoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions5, byteString7, adResponse2, context5, str6, diagnosticAdType4, z5, false, androidLoad$invoke$2);
                            androidLoad$invoke$22 = androidLoad$invoke$2;
                            if (invoke3 != obj4) {
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        context3 = context;
                        unityAdsLoadOptions3 = unityAdsLoadOptions;
                        str5 = str3;
                        byteString3 = byteString;
                        j2 = b2;
                        obj5 = obj3;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    context3 = context;
                    unityAdsLoadOptions3 = unityAdsLoadOptions;
                    byteString3 = byteString;
                    j2 = b2;
                    i5 = i4;
                    obj5 = obj3;
                    str5 = str3;
                }
                if (request$default != obj5) {
                    return obj5;
                }
                r32 = r9;
                j4 = b;
                i6 = i5;
                adObject2 = tmpAdObject;
                unityAdsLoadOptions4 = unityAdsLoadOptions3;
                context4 = context3;
                j3 = j2;
                diagnosticAdType3 = diagnosticAdType;
                androidLoad = androidLoad2;
                str6 = str5;
                byteString4 = byteString3;
                obj6 = (UniversalResponseOuterClass.UniversalResponse) request$default;
                adObject3 = adObject2;
                Result result2 = new Result(obj6);
                long b42 = jvo0.a.b(j3);
                Object d3 = result2.d();
                sendDiagnosticEvent = androidLoad.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, !(d3 instanceof Result.Failure) ? str : str2, new Double(zno.k(b42, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject3, (Integer) null, (ByteString) null, 108, (Object) null);
                Object d22 = result2.d();
                kotlin.a.a(d22);
                adResponse = ((UniversalResponseOuterClass.UniversalResponse) d22).getPayload().getAdResponse();
                z2 = r32;
                j5 = j4;
                diagnosticAdType4 = diagnosticAdType3;
                unityAdsLoadOptions5 = unityAdsLoadOptions4;
                androidLoad5 = androidLoad;
                i7 = i6;
                context5 = context4;
                obj4 = obj5;
                byteString7 = byteString4;
                AdResponseOuterClass.AdResponse adResponse22 = adResponse;
                handleGatewayAdResponse = androidLoad5.handleGatewayAdResponse;
                if (!z2) {
                }
                androidLoad$invoke$22.L$0 = androidLoad5;
                androidLoad$invoke$22.L$1 = byteString7;
                androidLoad$invoke$22.L$2 = null;
                androidLoad$invoke$22.L$3 = null;
                androidLoad$invoke$22.L$4 = null;
                androidLoad$invoke$22.L$5 = null;
                androidLoad$invoke$22.L$6 = null;
                androidLoad$invoke$22.L$7 = null;
                androidLoad$invoke$22.L$8 = null;
                androidLoad$invoke$22.I$0 = i7;
                androidLoad$invoke$22.J$0 = j5;
                androidLoad$invoke$22.label = 5;
                androidLoad$invoke$2 = androidLoad$invoke$22;
                invoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions5, byteString7, adResponse22, context5, str6, diagnosticAdType4, z5, false, androidLoad$invoke$2);
                androidLoad$invoke$22 = androidLoad$invoke$2;
                if (invoke3 != obj4) {
                }
            } catch (UnityAdsNetworkException e12) {
                e = e12;
                i3 = i4;
                j = b;
                r3 = i3;
                r4 = androidLoad2;
                handleGatewayException = r4.handleGatewayException(e);
                b = j;
                obj7 = handleGatewayException;
                z7 = r3;
                failure = obj7;
                z = z7;
                failure3 = failure;
                if (!z) {
                }
                return failure3;
            }
        } else {
            if (i12 != 2) {
                if (i12 == 3) {
                    ?? r0 = androidLoad$invoke$22.I$1;
                    j = androidLoad$invoke$22.J$0;
                    r3 = androidLoad$invoke$22.I$0;
                    AdObject adObject5 = (AdObject) androidLoad$invoke$22.L$8;
                    DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType7 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) androidLoad$invoke$22.L$7;
                    Context context10 = (Context) androidLoad$invoke$22.L$5;
                    UnityAdsLoadOptions unityAdsLoadOptions10 = (UnityAdsLoadOptions) androidLoad$invoke$22.L$4;
                    String str12 = (String) androidLoad$invoke$22.L$3;
                    ByteString byteString10 = (ByteString) androidLoad$invoke$22.L$2;
                    HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup7 = (HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup) androidLoad$invoke$22.L$1;
                    AndroidLoad androidLoad6 = (AndroidLoad) androidLoad$invoke$22.L$0;
                    try {
                        kotlin.a.a(obj);
                        diagnosticAdType2 = diagnosticAdType7;
                        headerBiddingAdMarkup3 = headerBiddingAdMarkup7;
                        obj4 = obj9;
                        androidLoad3 = androidLoad6;
                        str2 = "native_load_config_failure_time";
                        str = "native_load_config_success_time";
                        z3 = r0;
                        i2 = r3;
                        str4 = str12;
                        invoke2 = obj;
                        adObject = adObject5;
                        byteString2 = byteString10;
                        unityAdsLoadOptions2 = unityAdsLoadOptions10;
                        b = j;
                        context2 = context10;
                        try {
                            UniversalRequestOuterClass.UniversalRequest universalRequest22 = (UniversalRequestOuterClass.UniversalRequest) invoke2;
                            getRequestPolicy2 = androidLoad3.getRequestPolicy;
                            RequestPolicy invoke52 = getRequestPolicy2.invoke();
                            i9 = i2;
                        } catch (UnityAdsNetworkException e13) {
                            e = e13;
                            i8 = i2;
                        }
                    } catch (UnityAdsNetworkException e14) {
                        e = e14;
                        r4 = androidLoad6;
                    }
                    try {
                        b3 = k830.b();
                        try {
                            gatewayClient2 = androidLoad3.gatewayClient;
                            OperationType operationType22 = OperationType.LOAD_HEADER_BIDDING;
                            androidLoad$invoke$22.L$0 = androidLoad3;
                            androidLoad$invoke$22.L$1 = headerBiddingAdMarkup3;
                            androidLoad$invoke$22.L$2 = byteString2;
                            androidLoad$invoke$22.L$3 = str4;
                            androidLoad$invoke$22.L$4 = unityAdsLoadOptions2;
                            androidLoad$invoke$22.L$5 = context2;
                            androidLoad$invoke$22.L$6 = diagnosticAdType2;
                            androidLoad$invoke$22.L$7 = adObject;
                            context6 = context2;
                            try {
                                androidLoad$invoke$22.L$8 = null;
                                try {
                                    androidLoad$invoke$22.I$0 = i9;
                                    androidLoad$invoke$22.J$0 = b;
                                    androidLoad$invoke$22.I$1 = z3 ? 1 : 0;
                                    androidLoad$invoke$22.J$1 = b3;
                                    androidLoad$invoke$22.label = 4;
                                    headerBiddingAdMarkup4 = headerBiddingAdMarkup3;
                                    j6 = b3;
                                    byteString5 = byteString2;
                                    unityAdsLoadOptions6 = unityAdsLoadOptions2;
                                    i10 = i9;
                                    str7 = str4;
                                } catch (Throwable th4) {
                                    th = th4;
                                    i10 = i9;
                                    unityAdsLoadOptions6 = unityAdsLoadOptions2;
                                    str7 = str4;
                                    headerBiddingAdMarkup4 = headerBiddingAdMarkup3;
                                    j6 = b3;
                                    byteString5 = byteString2;
                                    UnityAdsLoadOptions unityAdsLoadOptions11 = unityAdsLoadOptions6;
                                    byteString6 = byteString5;
                                    str8 = str7;
                                    unityAdsLoadOptions7 = unityAdsLoadOptions11;
                                    r4 = androidLoad3;
                                    r3 = i10;
                                    headerBiddingAdMarkup5 = headerBiddingAdMarkup4;
                                    j7 = j6;
                                    z4 = z3;
                                    failure2 = new Result.Failure(th);
                                    j8 = b;
                                    r3 = r3;
                                    r4 = r4;
                                    z6 = z4;
                                    DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType8 = diagnosticAdType2;
                                    AdObject adObject6 = adObject;
                                    UnityAdsLoadOptions unityAdsLoadOptions12 = unityAdsLoadOptions7;
                                    byteString4 = byteString6;
                                    str6 = str8;
                                    Result result3 = new Result(failure2);
                                    long b5 = jvo0.a.b(j7);
                                    Object d4 = result3.d();
                                    sendDiagnosticEvent2 = ((AndroidLoad) r4).sendDiagnosticEvent;
                                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, !(d4 instanceof Result.Failure) ? str : str2, new Double(zno.k(b5, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject6, (Integer) null, (ByteString) null, 108, (Object) null);
                                    Object d5 = result3.d();
                                    kotlin.a.a(d5);
                                    universalResponse = (UniversalResponseOuterClass.UniversalResponse) d5;
                                    if (universalResponse.hasError()) {
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                str7 = str4;
                                headerBiddingAdMarkup4 = headerBiddingAdMarkup3;
                                j6 = b3;
                                i10 = i9;
                                unityAdsLoadOptions6 = unityAdsLoadOptions2;
                                byteString5 = byteString2;
                                UnityAdsLoadOptions unityAdsLoadOptions112 = unityAdsLoadOptions6;
                                byteString6 = byteString5;
                                str8 = str7;
                                unityAdsLoadOptions7 = unityAdsLoadOptions112;
                                r4 = androidLoad3;
                                r3 = i10;
                                headerBiddingAdMarkup5 = headerBiddingAdMarkup4;
                                j7 = j6;
                                z4 = z3;
                                failure2 = new Result.Failure(th);
                                j8 = b;
                                r3 = r3;
                                r4 = r4;
                                z6 = z4;
                                DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType82 = diagnosticAdType2;
                                AdObject adObject62 = adObject;
                                UnityAdsLoadOptions unityAdsLoadOptions122 = unityAdsLoadOptions7;
                                byteString4 = byteString6;
                                str6 = str8;
                                Result result32 = new Result(failure2);
                                long b52 = jvo0.a.b(j7);
                                Object d42 = result32.d();
                                sendDiagnosticEvent2 = ((AndroidLoad) r4).sendDiagnosticEvent;
                                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, !(d42 instanceof Result.Failure) ? str : str2, new Double(zno.k(b52, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject62, (Integer) null, (ByteString) null, 108, (Object) null);
                                Object d52 = result32.d();
                                kotlin.a.a(d52);
                                universalResponse = (UniversalResponseOuterClass.UniversalResponse) d52;
                                if (universalResponse.hasError()) {
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            context6 = context2;
                        }
                        try {
                            request$default2 = GatewayClient.DefaultImpls.request$default(gatewayClient2, null, universalRequest22, invoke52, operationType22, androidLoad$invoke$22, 1, null);
                        } catch (Throwable th7) {
                            th = th7;
                            UnityAdsLoadOptions unityAdsLoadOptions1122 = unityAdsLoadOptions6;
                            byteString6 = byteString5;
                            str8 = str7;
                            unityAdsLoadOptions7 = unityAdsLoadOptions1122;
                            r4 = androidLoad3;
                            r3 = i10;
                            headerBiddingAdMarkup5 = headerBiddingAdMarkup4;
                            j7 = j6;
                            z4 = z3;
                            failure2 = new Result.Failure(th);
                            j8 = b;
                            r3 = r3;
                            r4 = r4;
                            z6 = z4;
                            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType822 = diagnosticAdType2;
                            AdObject adObject622 = adObject;
                            UnityAdsLoadOptions unityAdsLoadOptions1222 = unityAdsLoadOptions7;
                            byteString4 = byteString6;
                            str6 = str8;
                            Result result322 = new Result(failure2);
                            long b522 = jvo0.a.b(j7);
                            Object d422 = result322.d();
                            sendDiagnosticEvent2 = ((AndroidLoad) r4).sendDiagnosticEvent;
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, !(d422 instanceof Result.Failure) ? str : str2, new Double(zno.k(b522, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject622, (Integer) null, (ByteString) null, 108, (Object) null);
                            Object d522 = result322.d();
                            kotlin.a.a(d522);
                            universalResponse = (UniversalResponseOuterClass.UniversalResponse) d522;
                            if (universalResponse.hasError()) {
                            }
                        }
                        if (request$default2 != obj4) {
                            return obj4;
                        }
                        byteString6 = byteString5;
                        str8 = str7;
                        unityAdsLoadOptions7 = unityAdsLoadOptions6;
                        r33 = z3 ? 1 : 0;
                        j8 = b;
                        i11 = i10;
                        headerBiddingAdMarkup5 = headerBiddingAdMarkup4;
                        j7 = j6;
                        failure2 = (UniversalResponseOuterClass.UniversalResponse) request$default2;
                        z6 = r33;
                        r3 = i11;
                        r4 = androidLoad3;
                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType8222 = diagnosticAdType2;
                        AdObject adObject6222 = adObject;
                        UnityAdsLoadOptions unityAdsLoadOptions12222 = unityAdsLoadOptions7;
                        byteString4 = byteString6;
                        str6 = str8;
                        Result result3222 = new Result(failure2);
                        long b5222 = jvo0.a.b(j7);
                        Object d4222 = result3222.d();
                        sendDiagnosticEvent2 = ((AndroidLoad) r4).sendDiagnosticEvent;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, !(d4222 instanceof Result.Failure) ? str : str2, new Double(zno.k(b5222, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject6222, (Integer) null, (ByteString) null, 108, (Object) null);
                        Object d5222 = result3222.d();
                        kotlin.a.a(d5222);
                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) d5222;
                        if (universalResponse.hasError()) {
                        }
                    } catch (UnityAdsNetworkException e15) {
                        e = e15;
                        i8 = i9;
                        r4 = androidLoad3;
                        j = b;
                        r3 = i8;
                        handleGatewayException = r4.handleGatewayException(e);
                        b = j;
                        obj7 = handleGatewayException;
                        z7 = r3;
                        failure = obj7;
                        z = z7;
                        failure3 = failure;
                        if (!z) {
                        }
                        return failure3;
                    }
                } else if (i12 == 4) {
                    j7 = androidLoad$invoke$22.J$1;
                    r33 = androidLoad$invoke$22.I$1;
                    j8 = androidLoad$invoke$22.J$0;
                    i11 = androidLoad$invoke$22.I$0;
                    adObject = (AdObject) androidLoad$invoke$22.L$7;
                    DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType9 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) androidLoad$invoke$22.L$6;
                    Context context11 = (Context) androidLoad$invoke$22.L$5;
                    unityAdsLoadOptions7 = (UnityAdsLoadOptions) androidLoad$invoke$22.L$4;
                    String str13 = (String) androidLoad$invoke$22.L$3;
                    byteString6 = (ByteString) androidLoad$invoke$22.L$2;
                    headerBiddingAdMarkup5 = (HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup) androidLoad$invoke$22.L$1;
                    AndroidLoad androidLoad7 = (AndroidLoad) androidLoad$invoke$22.L$0;
                    try {
                        try {
                            kotlin.a.a(obj);
                            request$default2 = obj;
                            str = "native_load_config_success_time";
                            obj4 = obj9;
                            diagnosticAdType2 = diagnosticAdType9;
                            context6 = context11;
                            androidLoad3 = androidLoad7;
                            str2 = "native_load_config_failure_time";
                            str8 = str13;
                        } catch (Throwable th8) {
                            th = th8;
                            b = j8;
                            str = "native_load_config_success_time";
                            obj4 = obj9;
                            diagnosticAdType2 = diagnosticAdType9;
                            context6 = context11;
                            z4 = r33;
                            r3 = i11;
                            r4 = androidLoad7;
                            str2 = "native_load_config_failure_time";
                            str8 = str13;
                            try {
                                failure2 = new Result.Failure(th);
                                j8 = b;
                                r3 = r3;
                                r4 = r4;
                                z6 = z4;
                                DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType82222 = diagnosticAdType2;
                                AdObject adObject62222 = adObject;
                                UnityAdsLoadOptions unityAdsLoadOptions122222 = unityAdsLoadOptions7;
                                byteString4 = byteString6;
                                str6 = str8;
                                Result result32222 = new Result(failure2);
                                long b52222 = jvo0.a.b(j7);
                                Object d42222 = result32222.d();
                                sendDiagnosticEvent2 = ((AndroidLoad) r4).sendDiagnosticEvent;
                                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, !(d42222 instanceof Result.Failure) ? str : str2, new Double(zno.k(b52222, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject62222, (Integer) null, (ByteString) null, 108, (Object) null);
                                Object d52222 = result32222.d();
                                kotlin.a.a(d52222);
                                universalResponse = (UniversalResponseOuterClass.UniversalResponse) d52222;
                                if (universalResponse.hasError()) {
                                }
                            } catch (UnityAdsNetworkException e16) {
                                e = e16;
                                j = b;
                                handleGatewayException = r4.handleGatewayException(e);
                                b = j;
                                obj7 = handleGatewayException;
                                z7 = r3;
                                failure = obj7;
                                z = z7;
                                failure3 = failure;
                                if (!z) {
                                }
                                return failure3;
                            }
                        }
                        try {
                            failure2 = (UniversalResponseOuterClass.UniversalResponse) request$default2;
                            z6 = r33;
                            r3 = i11;
                            r4 = androidLoad3;
                        } catch (Throwable th9) {
                            th = th9;
                            z4 = r33;
                            r3 = i11;
                            b = j8;
                            r4 = androidLoad3;
                            failure2 = new Result.Failure(th);
                            j8 = b;
                            r3 = r3;
                            r4 = r4;
                            z6 = z4;
                            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType822222 = diagnosticAdType2;
                            AdObject adObject622222 = adObject;
                            UnityAdsLoadOptions unityAdsLoadOptions1222222 = unityAdsLoadOptions7;
                            byteString4 = byteString6;
                            str6 = str8;
                            Result result322222 = new Result(failure2);
                            long b522222 = jvo0.a.b(j7);
                            Object d422222 = result322222.d();
                            sendDiagnosticEvent2 = ((AndroidLoad) r4).sendDiagnosticEvent;
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, !(d422222 instanceof Result.Failure) ? str : str2, new Double(zno.k(b522222, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject622222, (Integer) null, (ByteString) null, 108, (Object) null);
                            Object d522222 = result322222.d();
                            kotlin.a.a(d522222);
                            universalResponse = (UniversalResponseOuterClass.UniversalResponse) d522222;
                            if (universalResponse.hasError()) {
                            }
                        }
                        Result result3222222 = new Result(failure2);
                        long b5222222 = jvo0.a.b(j7);
                        Object d4222222 = result3222222.d();
                        sendDiagnosticEvent2 = ((AndroidLoad) r4).sendDiagnosticEvent;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, !(d4222222 instanceof Result.Failure) ? str : str2, new Double(zno.k(b5222222, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject622222, (Integer) null, (ByteString) null, 108, (Object) null);
                        Object d5222222 = result3222222.d();
                        kotlin.a.a(d5222222);
                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) d5222222;
                    } catch (UnityAdsNetworkException e17) {
                        e = e17;
                        j = j8;
                    }
                    DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType8222222 = diagnosticAdType2;
                    AdObject adObject6222222 = adObject;
                    UnityAdsLoadOptions unityAdsLoadOptions12222222 = unityAdsLoadOptions7;
                    byteString4 = byteString6;
                    str6 = str8;
                    if (universalResponse.hasError()) {
                        ErrorOuterClass.PublicErrorCode errorCode = universalResponse.getError().getErrorCode();
                        ErrorOuterClass.PublicErrorCode errorCode2 = universalResponse.getError().getErrorCode();
                        if (errorCode2 != null) {
                            str9 = UnityAdsErrorKt.getLoadErrorMsg(errorCode2);
                            if (str9 == null) {
                            }
                            b = j8;
                            failure3 = new LoadResult.Failure(errorCode, str9, null, "gateway", universalResponse.getError().getErrorText(), ErrorExtensionsKt.getErrorTokenOrNull(universalResponse.getError()), 4, null);
                            z = r3;
                            if (!z) {
                                sessionRepository2 = androidLoad$invoke$22.this$0.sessionRepository;
                                sessionRepository2.setLastLoadLatency((int) TimeExtensionsKt.elapsedMillis(new jvo0.a(b)));
                                if (failure3 instanceof LoadResult.Success) {
                                    sessionRepository5 = androidLoad$invoke$22.this$0.sessionRepository;
                                    sessionRepository5.incrementSuccessCount();
                                } else {
                                    if (!(failure3 instanceof LoadResult.Failure)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    sessionRepository3 = androidLoad$invoke$22.this$0.sessionRepository;
                                    sessionRepository3.incrementAllErrorsCount();
                                    isCachePhaseFailure = androidLoad$invoke$22.this$0.isCachePhaseFailure((LoadResult.Failure) failure3);
                                    if (isCachePhaseFailure) {
                                        sessionRepository4 = androidLoad$invoke$22.this$0.sessionRepository;
                                        sessionRepository4.incrementCacheTimeoutErrorsCount();
                                    }
                                }
                            }
                            return failure3;
                        }
                        str9 = UnityAdsConstants.Messages.MSG_INTERNAL_ERROR;
                        b = j8;
                        failure3 = new LoadResult.Failure(errorCode, str9, null, "gateway", universalResponse.getError().getErrorText(), ErrorExtensionsKt.getErrorTokenOrNull(universalResponse.getError()), 4, null);
                        z = r3;
                        if (!z) {
                        }
                        return failure3;
                    }
                    AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse = universalResponse.getPayload().getAdPlayerConfigResponse();
                    AdResponseKt.Dsl _create = AdResponseKt.Dsl.Companion._create(AdResponseOuterClass.AdResponse.newBuilder());
                    _create.setAdData(headerBiddingAdMarkup5.getAdData());
                    _create.setAdDataVersion(headerBiddingAdMarkup5.getAdDataVersion());
                    _create.setTrackingToken(adPlayerConfigResponse.getTrackingToken());
                    _create.setImpressionConfiguration(adPlayerConfigResponse.getImpressionConfiguration());
                    _create.setImpressionConfigurationVersion(adPlayerConfigResponse.getImpressionConfigurationVersion());
                    _create.setWebviewConfiguration(adPlayerConfigResponse.getWebviewConfiguration());
                    _create.setAdDataRefreshToken(adPlayerConfigResponse.getAdDataRefreshToken());
                    _create.setCampaignMetadata(adPlayerConfigResponse.getCampaignMetadata());
                    if (adPlayerConfigResponse.hasError()) {
                        _create.setError(adPlayerConfigResponse.getError());
                    }
                    if (ByteStringsKt.isNotEmpty(adPlayerConfigResponse.getAdData())) {
                        _create.setAdData(adPlayerConfigResponse.getAdData());
                        _create.setAdDataVersion(adPlayerConfigResponse.getAdDataVersion());
                    }
                    adResponse = _create._build();
                    j5 = j8;
                    diagnosticAdType4 = diagnosticAdType8222222;
                    unityAdsLoadOptions5 = unityAdsLoadOptions12222222;
                    i7 = r3;
                    androidLoad5 = r4;
                    context5 = context6;
                    z2 = z6;
                    byteString7 = byteString4;
                    AdResponseOuterClass.AdResponse adResponse222 = adResponse;
                    try {
                        handleGatewayAdResponse = androidLoad5.handleGatewayAdResponse;
                        z5 = !z2;
                        androidLoad$invoke$22.L$0 = androidLoad5;
                        androidLoad$invoke$22.L$1 = byteString7;
                        androidLoad$invoke$22.L$2 = null;
                        androidLoad$invoke$22.L$3 = null;
                        androidLoad$invoke$22.L$4 = null;
                        androidLoad$invoke$22.L$5 = null;
                        androidLoad$invoke$22.L$6 = null;
                        androidLoad$invoke$22.L$7 = null;
                        androidLoad$invoke$22.L$8 = null;
                        androidLoad$invoke$22.I$0 = i7;
                        androidLoad$invoke$22.J$0 = j5;
                        androidLoad$invoke$22.label = 5;
                        androidLoad$invoke$2 = androidLoad$invoke$22;
                    } catch (UnityAdsNetworkException e18) {
                        e = e18;
                    }
                    try {
                        invoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions5, byteString7, adResponse222, context5, str6, diagnosticAdType4, z5, false, androidLoad$invoke$2);
                        androidLoad$invoke$22 = androidLoad$invoke$2;
                        if (invoke3 != obj4) {
                            return obj4;
                        }
                        r3 = i7;
                        r4 = androidLoad5;
                    } catch (UnityAdsNetworkException e19) {
                        e = e19;
                        androidLoad$invoke$22 = androidLoad$invoke$2;
                        j = j5;
                        r3 = i7;
                        r4 = androidLoad5;
                        handleGatewayException = r4.handleGatewayException(e);
                        b = j;
                        obj7 = handleGatewayException;
                        z7 = r3;
                        failure = obj7;
                        z = z7;
                        failure3 = failure;
                        if (!z) {
                        }
                        return failure3;
                    }
                } else {
                    if (i12 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = androidLoad$invoke$22.J$0;
                    r3 = androidLoad$invoke$22.I$0;
                    ByteString byteString11 = (ByteString) androidLoad$invoke$22.L$1;
                    r4 = (AndroidLoad) androidLoad$invoke$22.L$0;
                    try {
                        kotlin.a.a(obj);
                        j5 = j;
                        byteString7 = byteString11;
                        invoke3 = obj;
                        r3 = r3;
                        r4 = r4;
                    } catch (UnityAdsNetworkException e20) {
                        e = e20;
                    }
                }
                handleGatewayException = r4.handleGatewayException(e);
                b = j;
                obj7 = handleGatewayException;
                z7 = r3;
                failure = obj7;
                z = z7;
                failure3 = failure;
                if (!z) {
                }
                return failure3;
            }
            j3 = androidLoad$invoke$22.J$1;
            r32 = androidLoad$invoke$22.I$1;
            j4 = androidLoad$invoke$22.J$0;
            i6 = androidLoad$invoke$22.I$0;
            adObject2 = (AdObject) androidLoad$invoke$22.L$6;
            diagnosticAdType3 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) androidLoad$invoke$22.L$5;
            context4 = (Context) androidLoad$invoke$22.L$4;
            unityAdsLoadOptions4 = (UnityAdsLoadOptions) androidLoad$invoke$22.L$3;
            str6 = (String) androidLoad$invoke$22.L$2;
            byteString4 = (ByteString) androidLoad$invoke$22.L$1;
            androidLoad = (AndroidLoad) androidLoad$invoke$22.L$0;
            try {
                kotlin.a.a(obj);
                request$default = obj;
                str2 = "native_load_config_failure_time";
                str = "native_load_config_success_time";
                obj5 = obj9;
            } catch (Throwable th10) {
                th = th10;
                i5 = i6;
                androidLoad4 = androidLoad;
                context3 = context4;
                str2 = "native_load_config_failure_time";
                str = "native_load_config_success_time";
                obj5 = obj9;
                diagnosticAdType = diagnosticAdType3;
                unityAdsLoadOptions3 = unityAdsLoadOptions4;
                tmpAdObject = adObject2;
                b = j4;
                r4 = androidLoad4;
                try {
                    Result.Failure failure42 = new Result.Failure(th);
                    Context context92 = context3;
                    androidLoad = r4;
                    i6 = i5;
                    context4 = context92;
                    obj6 = failure42;
                    j4 = b;
                    adObject3 = tmpAdObject;
                    unityAdsLoadOptions4 = unityAdsLoadOptions3;
                    diagnosticAdType3 = diagnosticAdType;
                    Result result22 = new Result(obj6);
                    long b422 = jvo0.a.b(j3);
                    Object d32 = result22.d();
                    sendDiagnosticEvent = androidLoad.sendDiagnosticEvent;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, !(d32 instanceof Result.Failure) ? str : str2, new Double(zno.k(b422, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject3, (Integer) null, (ByteString) null, 108, (Object) null);
                    Object d222 = result22.d();
                    kotlin.a.a(d222);
                    adResponse = ((UniversalResponseOuterClass.UniversalResponse) d222).getPayload().getAdResponse();
                    z2 = r32;
                    j5 = j4;
                    diagnosticAdType4 = diagnosticAdType3;
                    unityAdsLoadOptions5 = unityAdsLoadOptions4;
                    androidLoad5 = androidLoad;
                    i7 = i6;
                    context5 = context4;
                    obj4 = obj5;
                    byteString7 = byteString4;
                    AdResponseOuterClass.AdResponse adResponse2222 = adResponse;
                    handleGatewayAdResponse = androidLoad5.handleGatewayAdResponse;
                    if (!z2) {
                    }
                    androidLoad$invoke$22.L$0 = androidLoad5;
                    androidLoad$invoke$22.L$1 = byteString7;
                    androidLoad$invoke$22.L$2 = null;
                    androidLoad$invoke$22.L$3 = null;
                    androidLoad$invoke$22.L$4 = null;
                    androidLoad$invoke$22.L$5 = null;
                    androidLoad$invoke$22.L$6 = null;
                    androidLoad$invoke$22.L$7 = null;
                    androidLoad$invoke$22.L$8 = null;
                    androidLoad$invoke$22.I$0 = i7;
                    androidLoad$invoke$22.J$0 = j5;
                    androidLoad$invoke$22.label = 5;
                    androidLoad$invoke$2 = androidLoad$invoke$22;
                    invoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions5, byteString7, adResponse2222, context5, str6, diagnosticAdType4, z5, false, androidLoad$invoke$2);
                    androidLoad$invoke$22 = androidLoad$invoke$2;
                    if (invoke3 != obj4) {
                    }
                } catch (UnityAdsNetworkException e21) {
                    e = e21;
                    j = b;
                    r3 = i5;
                }
            }
            try {
                obj6 = (UniversalResponseOuterClass.UniversalResponse) request$default;
                adObject3 = adObject2;
            } catch (Throwable th11) {
                th = th11;
                Context context12 = context4;
                i5 = i6;
                androidLoad4 = androidLoad;
                context3 = context12;
                diagnosticAdType = diagnosticAdType3;
                unityAdsLoadOptions3 = unityAdsLoadOptions4;
                tmpAdObject = adObject2;
                b = j4;
                r4 = androidLoad4;
                Result.Failure failure422 = new Result.Failure(th);
                Context context922 = context3;
                androidLoad = r4;
                i6 = i5;
                context4 = context922;
                obj6 = failure422;
                j4 = b;
                adObject3 = tmpAdObject;
                unityAdsLoadOptions4 = unityAdsLoadOptions3;
                diagnosticAdType3 = diagnosticAdType;
                Result result222 = new Result(obj6);
                long b4222 = jvo0.a.b(j3);
                Object d322 = result222.d();
                sendDiagnosticEvent = androidLoad.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, !(d322 instanceof Result.Failure) ? str : str2, new Double(zno.k(b4222, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject3, (Integer) null, (ByteString) null, 108, (Object) null);
                Object d2222 = result222.d();
                kotlin.a.a(d2222);
                adResponse = ((UniversalResponseOuterClass.UniversalResponse) d2222).getPayload().getAdResponse();
                z2 = r32;
                j5 = j4;
                diagnosticAdType4 = diagnosticAdType3;
                unityAdsLoadOptions5 = unityAdsLoadOptions4;
                androidLoad5 = androidLoad;
                i7 = i6;
                context5 = context4;
                obj4 = obj5;
                byteString7 = byteString4;
                AdResponseOuterClass.AdResponse adResponse22222 = adResponse;
                handleGatewayAdResponse = androidLoad5.handleGatewayAdResponse;
                if (!z2) {
                }
                androidLoad$invoke$22.L$0 = androidLoad5;
                androidLoad$invoke$22.L$1 = byteString7;
                androidLoad$invoke$22.L$2 = null;
                androidLoad$invoke$22.L$3 = null;
                androidLoad$invoke$22.L$4 = null;
                androidLoad$invoke$22.L$5 = null;
                androidLoad$invoke$22.L$6 = null;
                androidLoad$invoke$22.L$7 = null;
                androidLoad$invoke$22.L$8 = null;
                androidLoad$invoke$22.I$0 = i7;
                androidLoad$invoke$22.J$0 = j5;
                androidLoad$invoke$22.label = 5;
                androidLoad$invoke$2 = androidLoad$invoke$22;
                invoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions5, byteString7, adResponse22222, context5, str6, diagnosticAdType4, z5, false, androidLoad$invoke$2);
                androidLoad$invoke$22 = androidLoad$invoke$2;
                if (invoke3 != obj4) {
                }
            }
            try {
                Result result2222 = new Result(obj6);
                long b42222 = jvo0.a.b(j3);
                Object d3222 = result2222.d();
                sendDiagnosticEvent = androidLoad.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, !(d3222 instanceof Result.Failure) ? str : str2, new Double(zno.k(b42222, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject3, (Integer) null, (ByteString) null, 108, (Object) null);
                Object d22222 = result2222.d();
                kotlin.a.a(d22222);
                adResponse = ((UniversalResponseOuterClass.UniversalResponse) d22222).getPayload().getAdResponse();
                z2 = r32;
                j5 = j4;
                diagnosticAdType4 = diagnosticAdType3;
                unityAdsLoadOptions5 = unityAdsLoadOptions4;
                androidLoad5 = androidLoad;
                i7 = i6;
                context5 = context4;
                obj4 = obj5;
                byteString7 = byteString4;
                AdResponseOuterClass.AdResponse adResponse222222 = adResponse;
                handleGatewayAdResponse = androidLoad5.handleGatewayAdResponse;
                if (!z2) {
                }
                androidLoad$invoke$22.L$0 = androidLoad5;
                androidLoad$invoke$22.L$1 = byteString7;
                androidLoad$invoke$22.L$2 = null;
                androidLoad$invoke$22.L$3 = null;
                androidLoad$invoke$22.L$4 = null;
                androidLoad$invoke$22.L$5 = null;
                androidLoad$invoke$22.L$6 = null;
                androidLoad$invoke$22.L$7 = null;
                androidLoad$invoke$22.L$8 = null;
                androidLoad$invoke$22.I$0 = i7;
                androidLoad$invoke$22.J$0 = j5;
                androidLoad$invoke$22.label = 5;
                androidLoad$invoke$2 = androidLoad$invoke$22;
                invoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions5, byteString7, adResponse222222, context5, str6, diagnosticAdType4, z5, false, androidLoad$invoke$2);
                androidLoad$invoke$22 = androidLoad$invoke$2;
                if (invoke3 != obj4) {
                }
            } catch (UnityAdsNetworkException e22) {
                e = e22;
                r3 = i6;
                j = j4;
                r4 = androidLoad;
                handleGatewayException = r4.handleGatewayException(e);
                b = j;
                obj7 = handleGatewayException;
                z7 = r3;
                failure = obj7;
                z = z7;
                failure3 = failure;
                if (!z) {
                }
                return failure3;
            }
        }
        Object obj10 = (LoadResult) invoke3;
        if (obj10 instanceof LoadResult.Success) {
            adRepository = ((AndroidLoad) r4).adRepository;
            AdObject ad = adRepository.getAd(byteString7);
            obj8 = ad == null ? new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, LoadResult.MSG_AD_OBJECT, null, "ad_object_not_found", null, null, 52, null) : new LoadResult.Success(ad);
        } else {
            boolean z10 = obj10 instanceof LoadResult.Failure;
            obj8 = obj10;
            if (!z10) {
                throw new NoWhenBranchMatchedException();
            }
        }
        b = j5;
        obj7 = obj8;
        z7 = r3;
        failure = obj7;
        z = z7;
        failure3 = failure;
        if (!z) {
        }
        return failure3;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super LoadResult> spjVar) {
        return ((AndroidLoad$invoke$2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
