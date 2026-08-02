package com.unity3d.ads.core.domain;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.unity3d.ads.core.domain.LifecycleEvent;
import java.lang.ref.WeakReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.gzs;
import xsna.phd0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.zhd0;

/* compiled from: AndroidGetLifecycleFlow.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2", f = "AndroidGetLifecycleFlow.kt", l = {65}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidGetLifecycleFlow$invoke$2 extends SuspendLambda implements wzs<zhd0<? super LifecycleEvent>, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidGetLifecycleFlow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetLifecycleFlow$invoke$2(AndroidGetLifecycleFlow androidGetLifecycleFlow, spj<? super AndroidGetLifecycleFlow$invoke$2> spjVar) {
        super(2, spjVar);
        this.this$0 = androidGetLifecycleFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 invokeSuspend$lambda$0(AndroidGetLifecycleFlow androidGetLifecycleFlow, AndroidGetLifecycleFlow$invoke$2$listener$1 androidGetLifecycleFlow$invoke$2$listener$1) {
        Context context;
        context = androidGetLifecycleFlow.applicationContext;
        ((Application) context).unregisterActivityLifecycleCallbacks(androidGetLifecycleFlow$invoke$2$listener$1);
        return s3q0.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        AndroidGetLifecycleFlow$invoke$2 androidGetLifecycleFlow$invoke$2 = new AndroidGetLifecycleFlow$invoke$2(this.this$0, spjVar);
        androidGetLifecycleFlow$invoke$2.L$0 = obj;
        return androidGetLifecycleFlow$invoke$2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Application$ActivityLifecycleCallbacks, com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            final zhd0 zhd0Var = (zhd0) this.L$0;
            final ?? r1 = new Application.ActivityLifecycleCallbacks() { // from class: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    zhd0Var.f(new LifecycleEvent.Created(new WeakReference(activity), bundle));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    zhd0Var.f(new LifecycleEvent.Destroyed(new WeakReference(activity)));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    zhd0Var.f(new LifecycleEvent.Paused(new WeakReference(activity)));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    zhd0Var.f(new LifecycleEvent.Resumed(new WeakReference(activity)));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    zhd0Var.f(new LifecycleEvent.SaveInstanceState(new WeakReference(activity), bundle));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    zhd0Var.f(new LifecycleEvent.Started(new WeakReference(activity)));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    zhd0Var.f(new LifecycleEvent.Stopped(new WeakReference(activity)));
                }
            };
            context = this.this$0.applicationContext;
            ((Application) context).registerActivityLifecycleCallbacks(r1);
            final AndroidGetLifecycleFlow androidGetLifecycleFlow = this.this$0;
            gzs gzsVar = new gzs() { // from class: com.unity3d.ads.core.domain.a
                @Override // xsna.gzs
                public final Object invoke() {
                    s3q0 invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = AndroidGetLifecycleFlow$invoke$2.invokeSuspend$lambda$0(AndroidGetLifecycleFlow.this, r1);
                    return invokeSuspend$lambda$0;
                }
            };
            this.label = 1;
            if (phd0.a(zhd0Var, gzsVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(zhd0<? super LifecycleEvent> zhd0Var, spj<? super s3q0> spjVar) {
        return ((AndroidGetLifecycleFlow$invoke$2) create(zhd0Var, spjVar)).invokeSuspend(s3q0.a);
    }
}
