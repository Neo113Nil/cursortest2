package com.unity3d.ads.core.domain;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.unity3d.ads.core.domain.LifecycleEvent;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.j8f;
import defpackage.k8f;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.v7a;
import defpackage.y6a;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk8f;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "", "<anonymous>", "(Lk8f;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2", f = "AndroidGetLifecycleFlow.kt", l = {65}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidGetLifecycleFlow$invoke$2 extends hoi implements Function2<k8f, rq3<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidGetLifecycleFlow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetLifecycleFlow$invoke$2(AndroidGetLifecycleFlow androidGetLifecycleFlow, rq3<? super AndroidGetLifecycleFlow$invoke$2> rq3Var) {
        super(2, rq3Var);
        this.this$0 = androidGetLifecycleFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(AndroidGetLifecycleFlow androidGetLifecycleFlow, AndroidGetLifecycleFlow$invoke$2$listener$1 androidGetLifecycleFlow$invoke$2$listener$1) {
        Context context;
        context = androidGetLifecycleFlow.applicationContext;
        ((Application) context).unregisterActivityLifecycleCallbacks(androidGetLifecycleFlow$invoke$2$listener$1);
        return Unit.a;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        AndroidGetLifecycleFlow$invoke$2 androidGetLifecycleFlow$invoke$2 = new AndroidGetLifecycleFlow$invoke$2(this.this$0, rq3Var);
        androidGetLifecycleFlow$invoke$2.L$0 = obj;
        return androidGetLifecycleFlow$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(k8f k8fVar, rq3<? super Unit> rq3Var) {
        return ((AndroidGetLifecycleFlow$invoke$2) create(k8fVar, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Application$ActivityLifecycleCallbacks, com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1] */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Context context;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            final k8f k8fVar = (k8f) this.L$0;
            final ?? r1 = new Application.ActivityLifecycleCallbacks() { // from class: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    activity.getClass();
                    ((j8f) k8f.this).d(new LifecycleEvent.Created(new WeakReference(activity), bundle));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    activity.getClass();
                    ((j8f) k8f.this).d(new LifecycleEvent.Destroyed(new WeakReference(activity)));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    activity.getClass();
                    ((j8f) k8f.this).d(new LifecycleEvent.Paused(new WeakReference(activity)));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    activity.getClass();
                    ((j8f) k8f.this).d(new LifecycleEvent.Resumed(new WeakReference(activity)));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    activity.getClass();
                    bundle.getClass();
                    ((j8f) k8f.this).d(new LifecycleEvent.SaveInstanceState(new WeakReference(activity), bundle));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    activity.getClass();
                    ((j8f) k8f.this).d(new LifecycleEvent.Started(new WeakReference(activity)));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    activity.getClass();
                    ((j8f) k8f.this).d(new LifecycleEvent.Stopped(new WeakReference(activity)));
                }
            };
            context = this.this$0.applicationContext;
            ((Application) context).registerActivityLifecycleCallbacks(r1);
            final AndroidGetLifecycleFlow androidGetLifecycleFlow = this.this$0;
            Function0 function0 = new Function0() { // from class: com.unity3d.ads.core.domain.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = AndroidGetLifecycleFlow$invoke$2.invokeSuspend$lambda$0(AndroidGetLifecycleFlow.this, r1);
                    return invokeSuspend$lambda$0;
                }
            };
            this.label = 1;
            if (v7a.i(k8fVar, function0, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
