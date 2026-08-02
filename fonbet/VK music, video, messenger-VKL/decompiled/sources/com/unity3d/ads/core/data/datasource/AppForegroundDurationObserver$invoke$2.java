package com.unity3d.ads.core.data.datasource;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* compiled from: AppForegroundDurationObserver.kt */
@b6l(c = "com.unity3d.ads.core.data.datasource.AppForegroundDurationObserver$invoke$2", f = "AppForegroundDurationObserver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AppForegroundDurationObserver$invoke$2 extends SuspendLambda implements wzs<Boolean, spj<? super s3q0>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ AppForegroundDurationObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppForegroundDurationObserver$invoke$2(AppForegroundDurationObserver appForegroundDurationObserver, spj<? super AppForegroundDurationObserver$invoke$2> spjVar) {
        super(2, spjVar);
        this.this$0 = appForegroundDurationObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        AppForegroundDurationObserver$invoke$2 appForegroundDurationObserver$invoke$2 = new AppForegroundDurationObserver$invoke$2(this.this$0, spjVar);
        appForegroundDurationObserver$invoke$2.Z$0 = ((Boolean) obj).booleanValue();
        return appForegroundDurationObserver$invoke$2;
    }

    @Override // xsna.wzs
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, spj<? super s3q0> spjVar) {
        return invoke(bool.booleanValue(), spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (this.Z$0) {
            this.this$0.onForeground();
        } else {
            this.this$0.onBackground();
        }
        return s3q0.a;
    }

    public final Object invoke(boolean z, spj<? super s3q0> spjVar) {
        return ((AppForegroundDurationObserver$invoke$2) create(Boolean.valueOf(z), spjVar)).invokeSuspend(s3q0.a);
    }
}
