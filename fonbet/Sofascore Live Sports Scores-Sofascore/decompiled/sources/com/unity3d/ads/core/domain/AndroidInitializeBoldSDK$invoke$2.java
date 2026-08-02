package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.whj;
import defpackage.xhj;
import defpackage.xuc;
import defpackage.y6a;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2", f = "AndroidInitializeBoldSDK.kt", l = {64, 81}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidInitializeBoldSDK$invoke$2 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ String $source;
    int I$0;
    long J$0;
    int label;
    final /* synthetic */ AndroidInitializeBoldSDK this$0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
    @il4(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1", f = "AndroidInitializeBoldSDK.kt", l = {65, 67, 69, 70}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
        final /* synthetic */ boolean $isRetry;
        final /* synthetic */ String $source;
        int label;
        final /* synthetic */ AndroidInitializeBoldSDK this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidInitializeBoldSDK androidInitializeBoldSDK, String str, boolean z, rq3<? super AnonymousClass1> rq3Var) {
            super(2, rq3Var);
            this.this$0 = androidInitializeBoldSDK;
            this.$source = str;
            this.$isRetry = z;
        }

        @Override // defpackage.h21
        public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
            return new AnonymousClass1(this.this$0, this.$source, this.$isRetry, rq3Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
            return ((AnonymousClass1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0081, code lost:
        
            if (r12.invoke((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13, r9) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0083, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
        
            if (r13 == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
        
            if (r13 == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x003a, code lost:
        
            if (r13 == r0) goto L25;
         */
        @Override // defpackage.h21
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object initializationStart;
            GetInitializationRequest getInitializationRequest;
            GetRequestPolicy getRequestPolicy;
            GatewayClient gatewayClient;
            AnonymousClass1 anonymousClass1;
            HandleGatewayInitializationResponse handleGatewayInitializationResponse;
            lu3 lu3Var = lu3.a;
            int i = this.label;
            if (i == 0) {
                y6a.M(obj);
                AndroidInitializeBoldSDK androidInitializeBoldSDK = this.this$0;
                String str = this.$source;
                boolean z = this.$isRetry;
                this.label = 1;
                initializationStart = androidInitializeBoldSDK.initializationStart(str, z, this);
            } else if (i == 1) {
                y6a.M(obj);
            } else if (i == 2) {
                y6a.M(obj);
                UniversalRequestOuterClass.UniversalRequest universalRequest = (UniversalRequestOuterClass.UniversalRequest) obj;
                getRequestPolicy = this.this$0.getRequestPolicy;
                RequestPolicy invoke = getRequestPolicy.invoke();
                gatewayClient = this.this$0.gatewayClient;
                OperationType operationType = OperationType.INITIALIZATION;
                this.label = 3;
                anonymousClass1 = this;
                obj = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, invoke, operationType, anonymousClass1, 1, null);
            } else {
                if (i != 3) {
                    if (i == 4) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                anonymousClass1 = this;
                handleGatewayInitializationResponse = anonymousClass1.this$0.handleGatewayInitializationResponse;
                anonymousClass1.label = 4;
            }
            this.this$0.checkCanInitialize();
            getInitializationRequest = this.this$0.getInitializeRequest;
            this.label = 2;
            obj = getInitializationRequest.invoke(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidInitializeBoldSDK$invoke$2(AndroidInitializeBoldSDK androidInitializeBoldSDK, String str, rq3<? super AndroidInitializeBoldSDK$invoke$2> rq3Var) {
        super(2, rq3Var);
        this.this$0 = androidInitializeBoldSDK;
        this.$source = str;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidInitializeBoldSDK$invoke$2(this.this$0, this.$source, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((AndroidInitializeBoldSDK$invoke$2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (r10 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (defpackage.wba.U(com.unity3d.services.UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, r11, r10) == r0) goto L23;
     */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.String, long] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SessionRepository sessionRepository;
        long b;
        SessionRepository sessionRepository2;
        ?? r6;
        Object initializationSuccess;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        try {
            if (i == 0) {
                y6a.M(obj);
                xhj.a.getClass();
                xuc.a.getClass();
                b = xuc.b();
                sessionRepository2 = this.this$0.sessionRepository;
                ?? r1 = !sessionRepository2.isFirstInitAttempt();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$source, r1, null);
                this.J$0 = b;
                this.I$0 = r1;
                this.label = 1;
                i = r1;
            } else {
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i2 = this.I$0;
                b = this.J$0;
                y6a.M(obj);
                i = i2;
            }
            AndroidInitializeBoldSDK androidInitializeBoldSDK = this.this$0;
            whj whjVar = new whj(b);
            r6 = this.$source;
            boolean z = i != 0;
            this.label = 2;
            initializationSuccess = androidInitializeBoldSDK.initializationSuccess(whjVar, r6, z, this);
        } catch (Exception e) {
            InitializationException parseFrom = InitializationException.INSTANCE.parseFrom(e);
            if (e instanceof GatewayException) {
                sessionRepository = this.this$0.sessionRepository;
                sessionRepository.setShouldInitialize(false);
            }
            this.this$0.initializationFailure(new whj(r6), parseFrom, this.$source, i != 0);
            return Unit.a;
        }
    }
}
