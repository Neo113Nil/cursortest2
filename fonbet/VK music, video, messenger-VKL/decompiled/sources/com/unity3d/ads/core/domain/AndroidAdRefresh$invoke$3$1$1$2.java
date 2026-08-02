package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObjectState;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.zrl;

/* compiled from: AndroidAdRefresh.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$1$2", f = "AndroidAdRefresh.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidAdRefresh$invoke$3$1$1$2 extends SuspendLambda implements wzs<Result<? extends s3q0>, spj<? super s3q0>, Object> {
    final /* synthetic */ zrl<AdObjectState> $showing;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidAdRefresh$invoke$3$1$1$2(zrl<? extends AdObjectState> zrlVar, spj<? super AndroidAdRefresh$invoke$3$1$1$2> spjVar) {
        super(2, spjVar);
        this.$showing = zrlVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidAdRefresh$invoke$3$1$1$2(this.$showing, spjVar);
    }

    @Override // xsna.wzs
    public /* bridge */ /* synthetic */ Object invoke(Result<? extends s3q0> result, spj<? super s3q0> spjVar) {
        return invoke(result.d(), spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$showing.b(null);
        return s3q0.a;
    }

    public final Object invoke(Object obj, spj<? super s3q0> spjVar) {
        return ((AndroidAdRefresh$invoke$3$1$1$2) create(new Result(obj), spjVar)).invokeSuspend(s3q0.a);
    }
}
