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
import defpackage.a70;
import defpackage.be5;
import defpackage.dij;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.ndd;
import defpackage.p2g;
import defpackage.rq3;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.whj;
import defpackage.xd5;
import defpackage.xhj;
import defpackage.xuc;
import defpackage.y6a;
import defpackage.zzl;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.AdResponseKt;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import gatewayprotocol.v1.WebviewConfiguration;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "Lcom/unity3d/ads/core/data/model/LoadResult;", "<anonymous>", "(Lku3;)Lcom/unity3d/ads/core/data/model/LoadResult;"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.domain.AndroidLoad$invoke$2", f = "AndroidLoad.kt", l = {97, 101, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 164}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidLoad$invoke$2 extends hoi implements Function2<ku3, rq3<? super LoadResult>, Object> {
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
    public AndroidLoad$invoke$2(AdRequestOuterClass.BannerSize bannerSize, AndroidLoad androidLoad, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, ByteString byteString, String str, UnityAdsLoadOptions unityAdsLoadOptions, Context context, rq3<? super AndroidLoad$invoke$2> rq3Var) {
        super(2, rq3Var);
        this.$bannerSize = bannerSize;
        this.this$0 = androidLoad;
        this.$headerBiddingAdMarkup = headerBiddingAdMarkup;
        this.$opportunityId = byteString;
        this.$placement = str;
        this.$loadOptions = unityAdsLoadOptions;
        this.$context = context;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        AndroidLoad$invoke$2 androidLoad$invoke$2 = new AndroidLoad$invoke$2(this.$bannerSize, this.this$0, this.$headerBiddingAdMarkup, this.$opportunityId, this.$placement, this.$loadOptions, this.$context, rq3Var);
        androidLoad$invoke$2.L$0 = obj;
        return androidLoad$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super LoadResult> rq3Var) {
        return ((AndroidLoad$invoke$2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(1:(1:(6:(1:(1:(4:8|9|10|11)(2:44|45))(13:46|47|48|49|50|51|52|53|54|55|(1:57)(1:96)|58|(7:60|(6:62|(1:64)|65|66|(2:22|(1:24)(2:25|(2:27|(1:29))(2:30|31)))|33)|67|65|66|(0)|33)(16:68|(1:70)|71|(1:73)|74|75|76|77|78|(1:80)(1:94)|81|82|83|84|85|(1:88)(1:87))))(21:111|112|113|114|115|116|117|118|119|121|122|123|124|125|126|127|128|129|130|131|(1:134)(10:133|50|51|52|53|54|55|(0)(0)|58|(0)(0)))|41|19|20|(0)|33)(22:157|158|159|160|161|162|163|164|165|(1:167)(1:171)|168|169|76|77|78|(0)(0)|81|82|83|84|85|(0)(0)))(18:188|189|190|191|192|193|194|195|196|197|198|199|200|201|202|203|204|(2:206|207)(19:208|161|162|163|164|165|(0)(0)|168|169|76|77|78|(0)(0)|81|82|83|84|85|(0)(0))))(7:228|(1:230)(1:307)|231|232|233|234|(4:236|20|(0)|33)(12:(1:238)(1:303)|239|240|241|242|243|244|245|246|(3:248|249|250)(1:297)|251|(6:279|280|281|282|283|(2:285|286)(15:287|192|193|194|195|196|197|198|199|200|201|202|203|204|(0)(0)))(13:253|254|255|(2:257|258)(1:276)|259|260|261|262|263|264|265|266|(1:269)(18:268|115|116|117|118|119|121|122|123|124|125|126|127|128|129|130|131|(0)(0)))))|12|13|(2:15|(1:17)(1:34))(2:35|(2:37|38))|18|19|20|(0)|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x065b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x065c, code lost:
    
        r1 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x051a A[Catch: UnityAdsNetworkException -> 0x053b, TryCatch #6 {UnityAdsNetworkException -> 0x053b, blocks: (B:55:0x04ca, B:58:0x04ef, B:60:0x051a, B:62:0x0531, B:66:0x0542, B:68:0x0566, B:70:0x05cb, B:71:0x05d5, B:73:0x05e2, B:74:0x05f3), top: B:54:0x04ca }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0566 A[Catch: UnityAdsNetworkException -> 0x053b, TryCatch #6 {UnityAdsNetworkException -> 0x053b, blocks: (B:55:0x04ca, B:58:0x04ef, B:60:0x051a, B:62:0x0531, B:66:0x0542, B:68:0x0566, B:70:0x05cb, B:71:0x05d5, B:73:0x05e2, B:74:0x05f3), top: B:54:0x04ca }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04ed  */
    /* JADX WARN: Type inference failed for: r0v124, types: [int] */
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
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v27 */
    @Override // defpackage.h21
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
        Object u2gVar;
        ByteString byteString7;
        HandleGatewayAdResponse handleGatewayAdResponse;
        boolean z5;
        AndroidLoad$invoke$2 androidLoad$invoke$2;
        Object invoke3;
        boolean z6;
        SendDiagnosticEvent sendDiagnosticEvent2;
        UniversalResponseOuterClass.UniversalResponse universalResponse;
        String str9;
        Object failure2;
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
        Object obj9 = lu3.a;
        int i12 = androidLoad$invoke$22.label;
        if (i12 == 0) {
            y6a.M(obj);
            ku3 ku3Var = (ku3) androidLoad$invoke$22.L$0;
            z = androidLoad$invoke$22.$bannerSize != null;
            xhj.a.getClass();
            xuc.a.getClass();
            b = xuc.b();
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
                failure2 = failure;
                if (!z) {
                }
                return failure2;
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
                            Unit unit = Unit.a;
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
                            failure2 = failure;
                            if (!z) {
                            }
                            return failure2;
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
                                androidLoad$invoke$22.L$5 = ku3Var;
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
                                xhj.a.getClass();
                                xuc.a.getClass();
                                i4 = i;
                                b2 = xuc.b();
                                p2g p2gVar = w2g.b;
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
                                failure2 = failure;
                                if (!z) {
                                }
                                return failure2;
                            }
                        } else {
                            obj4 = obj2;
                            try {
                                androidLoad.incrementLoadRequestAdmCount(z);
                                getAdPlayerConfigRequest = androidLoad.getAdPlayerConfigRequest;
                                configurationToken = headerBiddingAdMarkup.getConfigurationToken();
                                configurationToken.getClass();
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
                                androidLoad$invoke$22.L$6 = ku3Var;
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
                                xhj.a.getClass();
                                xuc.a.getClass();
                                i9 = i2;
                                b3 = xuc.b();
                                p2g p2gVar2 = w2g.b;
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
                                failure2 = failure;
                                if (!z) {
                                }
                                return failure2;
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
                y6a.M(obj);
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
                    xhj.a.getClass();
                    xuc.a.getClass();
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
                failure2 = failure;
                if (!z) {
                }
                return failure2;
            }
            try {
                b2 = xuc.b();
                try {
                    p2g p2gVar3 = w2g.b;
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
                            p2g p2gVar4 = w2g.b;
                            u2g u2gVar2 = new u2g(th);
                            Context context9 = context3;
                            androidLoad = r4;
                            i6 = i5;
                            context4 = context9;
                            obj6 = u2gVar2;
                            j4 = b;
                            adObject3 = tmpAdObject;
                            unityAdsLoadOptions4 = unityAdsLoadOptions3;
                            diagnosticAdType3 = diagnosticAdType;
                            dij dijVar = new dij(new w2g(obj6), whj.b(j3), null);
                            Object obj10 = dijVar.a;
                            Object obj11 = ((w2g) obj10).a;
                            long j9 = dijVar.b;
                            sendDiagnosticEvent = androidLoad.sendDiagnosticEvent;
                            if (!(obj11 instanceof u2g)) {
                            }
                            be5 be5Var = be5.NANOSECONDS;
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, r28, new Double(xd5.j(j9)), (Map) null, (Map) null, adObject3, (Integer) null, (ByteString) null, 108, (Object) null);
                            Object obj12 = ((w2g) obj10).a;
                            y6a.M(obj12);
                            adResponse = ((UniversalResponseOuterClass.UniversalResponse) obj12).getPayload().getAdResponse();
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
                            adResponse2.getClass();
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
                p2g p2gVar5 = w2g.b;
                adObject3 = adObject2;
                dij dijVar2 = new dij(new w2g(obj6), whj.b(j3), null);
                Object obj102 = dijVar2.a;
                Object obj112 = ((w2g) obj102).a;
                long j92 = dijVar2.b;
                sendDiagnosticEvent = androidLoad.sendDiagnosticEvent;
                if (!(obj112 instanceof u2g)) {
                }
                be5 be5Var2 = be5.NANOSECONDS;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, r28, new Double(xd5.j(j92)), (Map) null, (Map) null, adObject3, (Integer) null, (ByteString) null, 108, (Object) null);
                Object obj122 = ((w2g) obj102).a;
                y6a.M(obj122);
                adResponse = ((UniversalResponseOuterClass.UniversalResponse) obj122).getPayload().getAdResponse();
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
                adResponse22.getClass();
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
                failure2 = failure;
                if (!z) {
                }
                return failure2;
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
                        y6a.M(obj);
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
                            xhj.a.getClass();
                            xuc.a.getClass();
                            i9 = i2;
                            try {
                                b3 = xuc.b();
                                try {
                                    p2g p2gVar22 = w2g.b;
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
                                            p2g p2gVar6 = w2g.b;
                                            u2gVar = new u2g(th);
                                            j8 = b;
                                            r3 = r3;
                                            r4 = r4;
                                            z6 = z4;
                                            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType8 = diagnosticAdType2;
                                            AdObject adObject6 = adObject;
                                            UnityAdsLoadOptions unityAdsLoadOptions12 = unityAdsLoadOptions7;
                                            byteString4 = byteString6;
                                            str6 = str8;
                                            dij dijVar3 = new dij(new w2g(u2gVar), whj.b(j7), null);
                                            Object obj13 = dijVar3.a;
                                            Object obj14 = ((w2g) obj13).a;
                                            long j10 = dijVar3.b;
                                            sendDiagnosticEvent2 = ((AndroidLoad) r4).sendDiagnosticEvent;
                                            if (!(obj14 instanceof u2g)) {
                                            }
                                            be5 be5Var3 = be5.NANOSECONDS;
                                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, r28, new Double(xd5.j(j10)), (Map) null, (Map) null, adObject6, (Integer) null, (ByteString) null, 108, (Object) null);
                                            Object obj15 = ((w2g) obj13).a;
                                            y6a.M(obj15);
                                            universalResponse = (UniversalResponseOuterClass.UniversalResponse) obj15;
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
                                        p2g p2gVar62 = w2g.b;
                                        u2gVar = new u2g(th);
                                        j8 = b;
                                        r3 = r3;
                                        r4 = r4;
                                        z6 = z4;
                                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType82 = diagnosticAdType2;
                                        AdObject adObject62 = adObject;
                                        UnityAdsLoadOptions unityAdsLoadOptions122 = unityAdsLoadOptions7;
                                        byteString4 = byteString6;
                                        str6 = str8;
                                        dij dijVar32 = new dij(new w2g(u2gVar), whj.b(j7), null);
                                        Object obj132 = dijVar32.a;
                                        Object obj142 = ((w2g) obj132).a;
                                        long j102 = dijVar32.b;
                                        sendDiagnosticEvent2 = ((AndroidLoad) r4).sendDiagnosticEvent;
                                        if (!(obj142 instanceof u2g)) {
                                        }
                                        be5 be5Var32 = be5.NANOSECONDS;
                                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, r28, new Double(xd5.j(j102)), (Map) null, (Map) null, adObject62, (Integer) null, (ByteString) null, 108, (Object) null);
                                        Object obj152 = ((w2g) obj132).a;
                                        y6a.M(obj152);
                                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) obj152;
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
                                    p2g p2gVar622 = w2g.b;
                                    u2gVar = new u2g(th);
                                    j8 = b;
                                    r3 = r3;
                                    r4 = r4;
                                    z6 = z4;
                                    DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType822 = diagnosticAdType2;
                                    AdObject adObject622 = adObject;
                                    UnityAdsLoadOptions unityAdsLoadOptions1222 = unityAdsLoadOptions7;
                                    byteString4 = byteString6;
                                    str6 = str8;
                                    dij dijVar322 = new dij(new w2g(u2gVar), whj.b(j7), null);
                                    Object obj1322 = dijVar322.a;
                                    Object obj1422 = ((w2g) obj1322).a;
                                    long j1022 = dijVar322.b;
                                    sendDiagnosticEvent2 = ((AndroidLoad) r4).sendDiagnosticEvent;
                                    if (!(obj1422 instanceof u2g)) {
                                    }
                                    be5 be5Var322 = be5.NANOSECONDS;
                                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, r28, new Double(xd5.j(j1022)), (Map) null, (Map) null, adObject622, (Integer) null, (ByteString) null, 108, (Object) null);
                                    Object obj1522 = ((w2g) obj1322).a;
                                    y6a.M(obj1522);
                                    universalResponse = (UniversalResponseOuterClass.UniversalResponse) obj1522;
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
                                u2gVar = (UniversalResponseOuterClass.UniversalResponse) request$default2;
                                p2g p2gVar7 = w2g.b;
                                z6 = r33;
                                r3 = i11;
                                r4 = androidLoad3;
                                DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType8222 = diagnosticAdType2;
                                AdObject adObject6222 = adObject;
                                UnityAdsLoadOptions unityAdsLoadOptions12222 = unityAdsLoadOptions7;
                                byteString4 = byteString6;
                                str6 = str8;
                                dij dijVar3222 = new dij(new w2g(u2gVar), whj.b(j7), null);
                                Object obj13222 = dijVar3222.a;
                                Object obj14222 = ((w2g) obj13222).a;
                                long j10222 = dijVar3222.b;
                                sendDiagnosticEvent2 = ((AndroidLoad) r4).sendDiagnosticEvent;
                                if (!(obj14222 instanceof u2g)) {
                                }
                                be5 be5Var3222 = be5.NANOSECONDS;
                                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, r28, new Double(xd5.j(j10222)), (Map) null, (Map) null, adObject6222, (Integer) null, (ByteString) null, 108, (Object) null);
                                Object obj15222 = ((w2g) obj13222).a;
                                y6a.M(obj15222);
                                universalResponse = (UniversalResponseOuterClass.UniversalResponse) obj15222;
                                if (universalResponse.hasError()) {
                                }
                            } catch (UnityAdsNetworkException e13) {
                                e = e13;
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
                                failure2 = failure;
                                if (!z) {
                                }
                                return failure2;
                            }
                        } catch (UnityAdsNetworkException e14) {
                            e = e14;
                            i8 = i2;
                        }
                    } catch (UnityAdsNetworkException e15) {
                        e = e15;
                        r4 = androidLoad6;
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
                            y6a.M(obj);
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
                                p2g p2gVar6222 = w2g.b;
                                u2gVar = new u2g(th);
                                j8 = b;
                                r3 = r3;
                                r4 = r4;
                                z6 = z4;
                                DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType82222 = diagnosticAdType2;
                                AdObject adObject62222 = adObject;
                                UnityAdsLoadOptions unityAdsLoadOptions122222 = unityAdsLoadOptions7;
                                byteString4 = byteString6;
                                str6 = str8;
                                dij dijVar32222 = new dij(new w2g(u2gVar), whj.b(j7), null);
                                Object obj132222 = dijVar32222.a;
                                Object obj142222 = ((w2g) obj132222).a;
                                long j102222 = dijVar32222.b;
                                sendDiagnosticEvent2 = ((AndroidLoad) r4).sendDiagnosticEvent;
                                if (!(obj142222 instanceof u2g)) {
                                }
                                be5 be5Var32222 = be5.NANOSECONDS;
                                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, r28, new Double(xd5.j(j102222)), (Map) null, (Map) null, adObject62222, (Integer) null, (ByteString) null, 108, (Object) null);
                                Object obj152222 = ((w2g) obj132222).a;
                                y6a.M(obj152222);
                                universalResponse = (UniversalResponseOuterClass.UniversalResponse) obj152222;
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
                                failure2 = failure;
                                if (!z) {
                                }
                                return failure2;
                            }
                        }
                        try {
                            u2gVar = (UniversalResponseOuterClass.UniversalResponse) request$default2;
                            p2g p2gVar72 = w2g.b;
                            z6 = r33;
                            r3 = i11;
                            r4 = androidLoad3;
                        } catch (Throwable th9) {
                            th = th9;
                            z4 = r33;
                            r3 = i11;
                            b = j8;
                            r4 = androidLoad3;
                            p2g p2gVar62222 = w2g.b;
                            u2gVar = new u2g(th);
                            j8 = b;
                            r3 = r3;
                            r4 = r4;
                            z6 = z4;
                            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType822222 = diagnosticAdType2;
                            AdObject adObject622222 = adObject;
                            UnityAdsLoadOptions unityAdsLoadOptions1222222 = unityAdsLoadOptions7;
                            byteString4 = byteString6;
                            str6 = str8;
                            dij dijVar322222 = new dij(new w2g(u2gVar), whj.b(j7), null);
                            Object obj1322222 = dijVar322222.a;
                            Object obj1422222 = ((w2g) obj1322222).a;
                            long j1022222 = dijVar322222.b;
                            sendDiagnosticEvent2 = ((AndroidLoad) r4).sendDiagnosticEvent;
                            if (!(obj1422222 instanceof u2g)) {
                            }
                            be5 be5Var322222 = be5.NANOSECONDS;
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, r28, new Double(xd5.j(j1022222)), (Map) null, (Map) null, adObject622222, (Integer) null, (ByteString) null, 108, (Object) null);
                            Object obj1522222 = ((w2g) obj1322222).a;
                            y6a.M(obj1522222);
                            universalResponse = (UniversalResponseOuterClass.UniversalResponse) obj1522222;
                            if (universalResponse.hasError()) {
                            }
                        }
                        dij dijVar3222222 = new dij(new w2g(u2gVar), whj.b(j7), null);
                        Object obj13222222 = dijVar3222222.a;
                        Object obj14222222 = ((w2g) obj13222222).a;
                        long j10222222 = dijVar3222222.b;
                        sendDiagnosticEvent2 = ((AndroidLoad) r4).sendDiagnosticEvent;
                        String str14 = !(obj14222222 instanceof u2g) ? str : str2;
                        be5 be5Var3222222 = be5.NANOSECONDS;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, str14, new Double(xd5.j(j10222222)), (Map) null, (Map) null, adObject622222, (Integer) null, (ByteString) null, 108, (Object) null);
                        Object obj15222222 = ((w2g) obj13222222).a;
                        y6a.M(obj15222222);
                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) obj15222222;
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
                        errorCode.getClass();
                        ErrorOuterClass.PublicErrorCode errorCode2 = universalResponse.getError().getErrorCode();
                        if (errorCode2 != null) {
                            str9 = UnityAdsErrorKt.getLoadErrorMsg(errorCode2);
                            if (str9 == null) {
                            }
                            String str15 = str9;
                            String errorText = universalResponse.getError().getErrorText();
                            ErrorOuterClass.Error error = universalResponse.getError();
                            error.getClass();
                            b = j8;
                            failure2 = new LoadResult.Failure(errorCode, str15, null, "gateway", errorText, ErrorExtensionsKt.getErrorTokenOrNull(error), 4, null);
                            z = r3;
                            if (!z) {
                                sessionRepository2 = androidLoad$invoke$22.this$0.sessionRepository;
                                sessionRepository2.setLastLoadLatency((int) TimeExtensionsKt.elapsedMillis(new whj(b)));
                                if (failure2 instanceof LoadResult.Success) {
                                    sessionRepository5 = androidLoad$invoke$22.this$0.sessionRepository;
                                    sessionRepository5.incrementSuccessCount();
                                } else {
                                    if (!(failure2 instanceof LoadResult.Failure)) {
                                        zzl.b();
                                        return null;
                                    }
                                    sessionRepository3 = androidLoad$invoke$22.this$0.sessionRepository;
                                    sessionRepository3.incrementAllErrorsCount();
                                    isCachePhaseFailure = androidLoad$invoke$22.this$0.isCachePhaseFailure((LoadResult.Failure) failure2);
                                    if (isCachePhaseFailure) {
                                        sessionRepository4 = androidLoad$invoke$22.this$0.sessionRepository;
                                        sessionRepository4.incrementCacheTimeoutErrorsCount();
                                    }
                                }
                            }
                            return failure2;
                        }
                        str9 = UnityAdsConstants.Messages.MSG_INTERNAL_ERROR;
                        String str152 = str9;
                        String errorText2 = universalResponse.getError().getErrorText();
                        ErrorOuterClass.Error error2 = universalResponse.getError();
                        error2.getClass();
                        b = j8;
                        failure2 = new LoadResult.Failure(errorCode, str152, null, "gateway", errorText2, ErrorExtensionsKt.getErrorTokenOrNull(error2), 4, null);
                        z = r3;
                        if (!z) {
                        }
                        return failure2;
                    }
                    AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse = universalResponse.getPayload().getAdPlayerConfigResponse();
                    AdResponseKt.Dsl.Companion companion = AdResponseKt.Dsl.INSTANCE;
                    AdResponseOuterClass.AdResponse.Builder newBuilder = AdResponseOuterClass.AdResponse.newBuilder();
                    newBuilder.getClass();
                    AdResponseKt.Dsl _create = companion._create(newBuilder);
                    ByteString adData = headerBiddingAdMarkup5.getAdData();
                    adData.getClass();
                    _create.setAdData(adData);
                    _create.setAdDataVersion(headerBiddingAdMarkup5.getAdDataVersion());
                    ByteString trackingToken = adPlayerConfigResponse.getTrackingToken();
                    trackingToken.getClass();
                    _create.setTrackingToken(trackingToken);
                    ByteString impressionConfiguration = adPlayerConfigResponse.getImpressionConfiguration();
                    impressionConfiguration.getClass();
                    _create.setImpressionConfiguration(impressionConfiguration);
                    _create.setImpressionConfigurationVersion(adPlayerConfigResponse.getImpressionConfigurationVersion());
                    WebviewConfiguration.WebViewConfiguration webviewConfiguration = adPlayerConfigResponse.getWebviewConfiguration();
                    webviewConfiguration.getClass();
                    _create.setWebviewConfiguration(webviewConfiguration);
                    ByteString adDataRefreshToken = adPlayerConfigResponse.getAdDataRefreshToken();
                    adDataRefreshToken.getClass();
                    _create.setAdDataRefreshToken(adDataRefreshToken);
                    CampaignMetadataOuterClass.CampaignMetadata campaignMetadata = adPlayerConfigResponse.getCampaignMetadata();
                    campaignMetadata.getClass();
                    _create.setCampaignMetadata(campaignMetadata);
                    if (adPlayerConfigResponse.hasError()) {
                        ErrorOuterClass.Error error3 = adPlayerConfigResponse.getError();
                        error3.getClass();
                        _create.setError(error3);
                    }
                    ByteString adData2 = adPlayerConfigResponse.getAdData();
                    adData2.getClass();
                    if (ByteStringsKt.isNotEmpty(adData2)) {
                        ByteString adData3 = adPlayerConfigResponse.getAdData();
                        adData3.getClass();
                        _create.setAdData(adData3);
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
                        adResponse222.getClass();
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
                        failure2 = failure;
                        if (!z) {
                        }
                        return failure2;
                    }
                } else {
                    if (i12 != 5) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = androidLoad$invoke$22.J$0;
                    r3 = androidLoad$invoke$22.I$0;
                    ByteString byteString11 = (ByteString) androidLoad$invoke$22.L$1;
                    r4 = (AndroidLoad) androidLoad$invoke$22.L$0;
                    try {
                        y6a.M(obj);
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
                failure2 = failure;
                if (!z) {
                }
                return failure2;
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
                y6a.M(obj);
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
                    p2g p2gVar42 = w2g.b;
                    u2g u2gVar22 = new u2g(th);
                    Context context92 = context3;
                    androidLoad = r4;
                    i6 = i5;
                    context4 = context92;
                    obj6 = u2gVar22;
                    j4 = b;
                    adObject3 = tmpAdObject;
                    unityAdsLoadOptions4 = unityAdsLoadOptions3;
                    diagnosticAdType3 = diagnosticAdType;
                    dij dijVar22 = new dij(new w2g(obj6), whj.b(j3), null);
                    Object obj1022 = dijVar22.a;
                    Object obj1122 = ((w2g) obj1022).a;
                    long j922 = dijVar22.b;
                    sendDiagnosticEvent = androidLoad.sendDiagnosticEvent;
                    if (!(obj1122 instanceof u2g)) {
                    }
                    be5 be5Var22 = be5.NANOSECONDS;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, r28, new Double(xd5.j(j922)), (Map) null, (Map) null, adObject3, (Integer) null, (ByteString) null, 108, (Object) null);
                    Object obj1222 = ((w2g) obj1022).a;
                    y6a.M(obj1222);
                    adResponse = ((UniversalResponseOuterClass.UniversalResponse) obj1222).getPayload().getAdResponse();
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
                    adResponse2222.getClass();
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
                try {
                    obj6 = (UniversalResponseOuterClass.UniversalResponse) request$default;
                    p2g p2gVar52 = w2g.b;
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
                    p2g p2gVar422 = w2g.b;
                    u2g u2gVar222 = new u2g(th);
                    Context context922 = context3;
                    androidLoad = r4;
                    i6 = i5;
                    context4 = context922;
                    obj6 = u2gVar222;
                    j4 = b;
                    adObject3 = tmpAdObject;
                    unityAdsLoadOptions4 = unityAdsLoadOptions3;
                    diagnosticAdType3 = diagnosticAdType;
                    dij dijVar222 = new dij(new w2g(obj6), whj.b(j3), null);
                    Object obj10222 = dijVar222.a;
                    Object obj11222 = ((w2g) obj10222).a;
                    long j9222 = dijVar222.b;
                    sendDiagnosticEvent = androidLoad.sendDiagnosticEvent;
                    if (!(obj11222 instanceof u2g)) {
                    }
                    be5 be5Var222 = be5.NANOSECONDS;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, r28, new Double(xd5.j(j9222)), (Map) null, (Map) null, adObject3, (Integer) null, (ByteString) null, 108, (Object) null);
                    Object obj12222 = ((w2g) obj10222).a;
                    y6a.M(obj12222);
                    adResponse = ((UniversalResponseOuterClass.UniversalResponse) obj12222).getPayload().getAdResponse();
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
                    adResponse22222.getClass();
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
                dij dijVar2222 = new dij(new w2g(obj6), whj.b(j3), null);
                Object obj102222 = dijVar2222.a;
                Object obj112222 = ((w2g) obj102222).a;
                long j92222 = dijVar2222.b;
                sendDiagnosticEvent = androidLoad.sendDiagnosticEvent;
                String str16 = !(obj112222 instanceof u2g) ? str : str2;
                be5 be5Var2222 = be5.NANOSECONDS;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, str16, new Double(xd5.j(j92222)), (Map) null, (Map) null, adObject3, (Integer) null, (ByteString) null, 108, (Object) null);
                Object obj122222 = ((w2g) obj102222).a;
                y6a.M(obj122222);
                adResponse = ((UniversalResponseOuterClass.UniversalResponse) obj122222).getPayload().getAdResponse();
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
                adResponse222222.getClass();
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
                failure2 = failure;
                if (!z) {
                }
                return failure2;
            }
        }
        Object obj16 = (LoadResult) invoke3;
        if (obj16 instanceof LoadResult.Success) {
            adRepository = ((AndroidLoad) r4).adRepository;
            AdObject ad = adRepository.getAd(byteString7);
            obj8 = ad == null ? new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, LoadResult.MSG_AD_OBJECT, null, "ad_object_not_found", null, null, 52, null) : new LoadResult.Success(ad);
        } else {
            boolean z10 = obj16 instanceof LoadResult.Failure;
            obj8 = obj16;
            if (!z10) {
                throw new ndd();
            }
        }
        b = j5;
        obj7 = obj8;
        z7 = r3;
        failure = obj7;
        z = z7;
        failure2 = failure;
        if (!z) {
        }
        return failure2;
    }
}
