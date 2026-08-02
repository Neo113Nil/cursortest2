package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.vk.reefton.protocol.ReefProtocol$Event;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.jvo0;
import xsna.k830;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidInitializeBoldSDK.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2", f = "AndroidInitializeBoldSDK.kt", l = {64, ReefProtocol$Event.Type.IMAGES_IMAGE_LOADED_VALUE}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidInitializeBoldSDK$invoke$2 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $source;
    int I$0;
    long J$0;
    int label;
    final /* synthetic */ AndroidInitializeBoldSDK this$0;

    /* compiled from: AndroidInitializeBoldSDK.kt */
    @b6l(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1", f = "AndroidInitializeBoldSDK.kt", l = {65, 67, 69, 70}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ boolean $isRetry;
        final /* synthetic */ String $source;
        int label;
        final /* synthetic */ AndroidInitializeBoldSDK this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidInitializeBoldSDK androidInitializeBoldSDK, String str, boolean z, spj<? super AnonymousClass1> spjVar) {
            super(2, spjVar);
            this.this$0 = androidInitializeBoldSDK;
            this.$source = str;
            this.$isRetry = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new AnonymousClass1(this.this$0, this.$source, this.$isRetry, spjVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0084, code lost:
        
            if (r1.invoke((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13, r12) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0086, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
        
            if (r13 == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
        
            if (r13 == r0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
        
            if (r13 == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
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
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                AndroidInitializeBoldSDK androidInitializeBoldSDK = this.this$0;
                String str = this.$source;
                boolean z = this.$isRetry;
                this.label = 1;
                initializationStart = androidInitializeBoldSDK.initializationStart(str, z, this);
            } else if (i == 1) {
                kotlin.a.a(obj);
            } else if (i == 2) {
                kotlin.a.a(obj);
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
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                kotlin.a.a(obj);
                anonymousClass1 = this;
                handleGatewayInitializationResponse = anonymousClass1.this$0.handleGatewayInitializationResponse;
                anonymousClass1.label = 4;
            }
            this.this$0.checkCanInitialize();
            getInitializationRequest = this.this$0.getInitializeRequest;
            this.label = 2;
            obj = getInitializationRequest.invoke(this);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((AnonymousClass1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidInitializeBoldSDK$invoke$2(AndroidInitializeBoldSDK androidInitializeBoldSDK, String str, spj<? super AndroidInitializeBoldSDK$invoke$2> spjVar) {
        super(2, spjVar);
        this.this$0 = androidInitializeBoldSDK;
        this.$source = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidInitializeBoldSDK$invoke$2(this.this$0, this.$source, spjVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (r11 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (xsna.oxo0.b(com.unity3d.services.UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, r11, r10) == r0) goto L23;
     */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.String, long] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SessionRepository sessionRepository;
        long b;
        SessionRepository sessionRepository2;
        ?? r5;
        Object initializationSuccess;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                b = k830.b();
                sessionRepository2 = this.this$0.sessionRepository;
                ?? r1 = !sessionRepository2.isFirstInitAttempt();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$source, r1, null);
                this.J$0 = b;
                this.I$0 = r1;
                this.label = 1;
                i = r1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                int i2 = this.I$0;
                b = this.J$0;
                kotlin.a.a(obj);
                i = i2;
            }
            AndroidInitializeBoldSDK androidInitializeBoldSDK = this.this$0;
            jvo0.a aVar = new jvo0.a(b);
            r5 = this.$source;
            boolean z = i != 0;
            this.label = 2;
            initializationSuccess = androidInitializeBoldSDK.initializationSuccess(aVar, r5, z, this);
        } catch (Exception e) {
            InitializationException parseFrom = InitializationException.Companion.parseFrom(e);
            if (e instanceof GatewayException) {
                sessionRepository = this.this$0.sessionRepository;
                sessionRepository.setShouldInitialize(false);
            }
            this.this$0.initializationFailure(new jvo0.a(r5), parseFrom, this.$source, i != 0);
            return s3q0.a;
        }
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((AndroidInitializeBoldSDK$invoke$2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
