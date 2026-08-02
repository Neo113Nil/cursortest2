package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.b6l;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.xh50;
import xsna.yvj;

/* compiled from: AndroidAdRefresh.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$showing$1", f = "AndroidAdRefresh.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidAdRefresh$invoke$3$1$showing$1 extends SuspendLambda implements wzs<yvj, spj<? super AdObjectState>, Object> {
    final /* synthetic */ AdObject $adObject;
    int label;

    /* compiled from: AndroidAdRefresh.kt */
    /* renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$showing$1$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements wzs<Object, spj<? super Boolean>, Object> {
        public AnonymousClass1(Object obj) {
            super(2, obj, AdObjectState.class, "equals", "equals(Ljava/lang/Object;)Z", 4);
        }

        @Override // xsna.wzs
        public final Object invoke(Object obj, spj<? super Boolean> spjVar) {
            return AndroidAdRefresh$invoke$3$1$showing$1.invokeSuspend$equals((AdObjectState) this.receiver, obj, spjVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdRefresh$invoke$3$1$showing$1(AdObject adObject, spj<? super AndroidAdRefresh$invoke$3$1$showing$1> spjVar) {
        super(2, spjVar);
        this.$adObject = adObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invokeSuspend$equals(AdObjectState adObjectState, Object obj, spj spjVar) {
        return Boolean.valueOf(adObjectState.equals(obj));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidAdRefresh$invoke$3$1$showing$1(this.$adObject, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        xh50<AdObjectState> state = this.$adObject.getState();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(AdObjectState.SHOWING);
        this.label = 1;
        Object o = rsr.o(state, anonymousClass1, this);
        return o == coroutineSingletons ? coroutineSingletons : o;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super AdObjectState> spjVar) {
        return ((AndroidAdRefresh$invoke$3$1$showing$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
