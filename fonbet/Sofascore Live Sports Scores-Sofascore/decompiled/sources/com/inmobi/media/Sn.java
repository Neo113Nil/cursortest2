package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import defpackage.a70;
import defpackage.deh;
import defpackage.hoi;
import defpackage.j8f;
import defpackage.k8f;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.v7a;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Sn extends hoi implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewGroup d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sn(View view, ViewGroup viewGroup, rq3 rq3Var) {
        super(2, rq3Var);
        this.c = view;
        this.d = viewGroup;
    }

    public static final Unit a(View view, Rn rn) {
        view.removeOnAttachStateChangeListener(rn);
        return Unit.a;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        Sn sn = new Sn(this.c, this.d, rq3Var);
        sn.b = obj;
        return sn;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Sn) create((k8f) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            k8f k8fVar = (k8f) this.b;
            View view = this.c;
            Rn rn = new Rn(k8fVar, view, this.d);
            view.addOnAttachStateChangeListener(rn);
            j8f j8fVar = (j8f) k8fVar;
            j8fVar.d(Boolean.valueOf(Un.b(this.c, this.d)));
            deh dehVar = new deh(4, this.c, rn);
            this.a = 1;
            if (v7a.i(j8fVar, dehVar, this) == lu3Var) {
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
