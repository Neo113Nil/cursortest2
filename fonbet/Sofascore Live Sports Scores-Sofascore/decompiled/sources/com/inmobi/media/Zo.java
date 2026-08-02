package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import defpackage.a70;
import defpackage.hoi;
import defpackage.j8f;
import defpackage.k8f;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.ufl;
import defpackage.v7a;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Zo extends hoi implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zo(ViewGroup viewGroup, rq3 rq3Var) {
        super(2, rq3Var);
        this.c = viewGroup;
    }

    public static final Unit a(View view, Yo yo) {
        view.removeOnAttachStateChangeListener(yo);
        return Unit.a;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        Zo zo = new Zo(this.c, rq3Var);
        zo.b = obj;
        return zo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Zo zo = new Zo(this.c, (rq3) obj2);
        zo.b = (k8f) obj;
        return zo.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            j8f j8fVar = (j8f) ((k8f) this.b);
            j8fVar.d(Boolean.valueOf(this.c.isAttachedToWindow()));
            Yo yo = new Yo(j8fVar);
            this.c.addOnAttachStateChangeListener(yo);
            ufl uflVar = new ufl(5, this.c, yo);
            this.a = 1;
            if (v7a.i(j8fVar, uflVar, this) == lu3Var) {
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
