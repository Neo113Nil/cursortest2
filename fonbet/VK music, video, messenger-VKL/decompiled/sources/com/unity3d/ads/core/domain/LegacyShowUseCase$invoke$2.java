package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.AdObject;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b0t;
import xsna.b6l;
import xsna.gzs;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.xh50;

/* compiled from: LegacyShowUseCase.kt */
@b6l(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2", f = "LegacyShowUseCase.kt", l = {178, 184, 185}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class LegacyShowUseCase$invoke$2 extends SuspendLambda implements wzs<gzs<? extends s3q0>, spj<? super s3q0>, Object> {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ String $placement;
    final /* synthetic */ b0t<String, UnityAds.UnityAdsShowError, String, Integer, String, spj<? super s3q0>, Object> $reportShowError;
    final /* synthetic */ boolean $useTimeout;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LegacyShowUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LegacyShowUseCase$invoke$2(LegacyShowUseCase legacyShowUseCase, AdObject adObject, boolean z, b0t<? super String, ? super UnityAds.UnityAdsShowError, ? super String, ? super Integer, ? super String, ? super spj<? super s3q0>, ? extends Object> b0tVar, String str, spj<? super LegacyShowUseCase$invoke$2> spjVar) {
        super(2, spjVar);
        this.this$0 = legacyShowUseCase;
        this.$adObject = adObject;
        this.$useTimeout = z;
        this.$reportShowError = b0tVar;
        this.$placement = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        LegacyShowUseCase$invoke$2 legacyShowUseCase$invoke$2 = new LegacyShowUseCase$invoke$2(this.this$0, this.$adObject, this.$useTimeout, this.$reportShowError, this.$placement, spjVar);
        legacyShowUseCase$invoke$2.L$0 = obj;
        return legacyShowUseCase$invoke$2;
    }

    @Override // xsna.wzs
    public /* bridge */ /* synthetic */ Object invoke(gzs<? extends s3q0> gzsVar, spj<? super s3q0> spjVar) {
        return invoke2((gzs<s3q0>) gzsVar, spjVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        if (r11.terminate(r4, r10) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (r11 == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        gzs gzsVar;
        xh50 xh50Var;
        xh50 xh50Var2;
        Object sendOperativeError;
        Show show;
        gzs gzsVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            gzsVar = (gzs) this.L$0;
            xh50Var = this.this$0.hasStarted;
            if (!((Boolean) xh50Var.getValue()).booleanValue()) {
                xh50Var2 = this.this$0.timeoutCancellationRequested;
                if (!((Boolean) xh50Var2.getValue()).booleanValue()) {
                    LegacyShowUseCase legacyShowUseCase = this.this$0;
                    OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType = OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT;
                    AdObject adObject = this.$adObject;
                    this.L$0 = gzsVar;
                    this.label = 1;
                    sendOperativeError = legacyShowUseCase.sendOperativeError(operativeEventErrorType, "timeout", adObject, this);
                }
            }
            return s3q0.a;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gzsVar2 = (gzs) this.L$0;
                kotlin.a.a(obj);
                gzsVar2.invoke();
                return s3q0.a;
            }
            gzsVar = (gzs) this.L$0;
            kotlin.a.a(obj);
            b0t<String, UnityAds.UnityAdsShowError, String, Integer, String, spj<? super s3q0>, Object> b0tVar = this.$reportShowError;
            UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.TIMEOUT;
            String str = LegacyShowUseCase.MESSAGE_TIMEOUT + this.$placement;
            this.L$0 = gzsVar;
            this.label = 3;
            if (b0tVar.invoke("timeout", unityAdsShowError, str, null, null, this) != coroutineSingletons) {
                gzsVar2 = gzsVar;
                gzsVar2.invoke();
                return s3q0.a;
            }
            return coroutineSingletons;
        }
        gzsVar = (gzs) this.L$0;
        kotlin.a.a(obj);
        if (this.$useTimeout) {
            show = this.this$0.show;
            AdObject adObject2 = this.$adObject;
            this.L$0 = gzsVar;
            this.label = 2;
        }
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(gzs<s3q0> gzsVar, spj<? super s3q0> spjVar) {
        return ((LegacyShowUseCase$invoke$2) create(gzsVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
