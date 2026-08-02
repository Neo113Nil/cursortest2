package com.unity3d.ads.core.data.repository;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.xh50;

/* compiled from: OrientationRepository.kt */
@b6l(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$4", f = "OrientationRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class OrientationRepository$invoke$4 extends SuspendLambda implements wzs<WeakReference<Activity>, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OrientationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrientationRepository$invoke$4(OrientationRepository orientationRepository, spj<? super OrientationRepository$invoke$4> spjVar) {
        super(2, spjVar);
        this.this$0 = orientationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        OrientationRepository$invoke$4 orientationRepository$invoke$4 = new OrientationRepository$invoke$4(this.this$0, spjVar);
        orientationRepository$invoke$4.L$0 = obj;
        return orientationRepository$invoke$4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xh50 xh50Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.a(obj);
        WeakReference weakReference = (WeakReference) this.L$0;
        xh50Var = this.this$0._resumedActivityOrientation;
        Activity activity = (Activity) weakReference.get();
        xh50Var.setValue(new Integer(activity != null ? activity.getRequestedOrientation() : -1));
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(WeakReference<Activity> weakReference, spj<? super s3q0> spjVar) {
        return ((OrientationRepository$invoke$4) create(weakReference, spjVar)).invokeSuspend(s3q0.a);
    }
}
