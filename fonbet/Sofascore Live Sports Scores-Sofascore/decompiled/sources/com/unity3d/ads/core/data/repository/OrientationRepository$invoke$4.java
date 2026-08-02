package com.unity3d.ads.core.data.repository;

import android.app.Activity;
import defpackage.a70;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.hoi;
import defpackage.il4;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@il4(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$4", f = "OrientationRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class OrientationRepository$invoke$4 extends hoi implements Function2<WeakReference<Activity>, rq3<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OrientationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrientationRepository$invoke$4(OrientationRepository orientationRepository, rq3<? super OrientationRepository$invoke$4> rq3Var) {
        super(2, rq3Var);
        this.this$0 = orientationRepository;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        OrientationRepository$invoke$4 orientationRepository$invoke$4 = new OrientationRepository$invoke$4(this.this$0, rq3Var);
        orientationRepository$invoke$4.L$0 = obj;
        return orientationRepository$invoke$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WeakReference<Activity> weakReference, rq3<? super Unit> rq3Var) {
        return ((OrientationRepository$invoke$4) create(weakReference, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        f1d f1dVar;
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        WeakReference weakReference = (WeakReference) this.L$0;
        f1dVar = this.this$0._resumedActivityOrientation;
        Activity activity = (Activity) weakReference.get();
        Integer num = new Integer(activity != null ? activity.getRequestedOrientation() : -1);
        fdi fdiVar = (fdi) f1dVar;
        fdiVar.getClass();
        fdiVar.m(null, num);
        return Unit.a;
    }
}
