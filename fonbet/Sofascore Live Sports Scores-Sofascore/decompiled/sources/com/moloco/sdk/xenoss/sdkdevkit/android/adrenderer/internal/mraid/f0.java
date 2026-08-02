package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.graphics.Rect;
import android.view.View;
import defpackage.a70;
import defpackage.fdi;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.n4o;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f0 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ b0 s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(b0 b0Var, int i, int i2, int i3, int i4, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = b0Var;
        this.t = i;
        this.u = i2;
        this.v = i3;
        this.w = i4;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new f0(this.s, this.t, this.u, this.v, this.w, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            this.r = 1;
            if (n4o.y(200L, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        b0 b0Var = this.s;
        fdi fdiVar = (fdi) b0Var.e;
        Boolean valueOf = Boolean.valueOf(((View) b0Var.a).isShown());
        fdiVar.getClass();
        fdiVar.m(null, valueOf);
        int i2 = this.t;
        int i3 = this.u;
        Rect rect = new Rect(i2, i3, this.v, this.w);
        int width = rect.width();
        int height = rect.height();
        b0 b0Var2 = (b0) b0Var.g;
        Rect rect2 = (Rect) b0Var2.f;
        int i4 = i2 + width;
        int i5 = i3 + height;
        rect2.set(i2, i3, i4, i5);
        b0Var2.a(rect2, (Rect) b0Var2.g);
        Rect rect3 = (Rect) b0Var2.h;
        rect3.set(i2, i3, i4, i5);
        b0Var2.a(rect3, (Rect) b0Var2.i);
        Rect rect4 = (Rect) b0Var2.d;
        rect4.set(i2, i3, i4, i5);
        b0Var2.a(rect4, (Rect) b0Var2.e);
        Rect rect5 = (Rect) b0Var2.b;
        rect5.set(0, 0, width, height);
        b0Var2.a(rect5, (Rect) b0Var2.c);
        fdi fdiVar2 = (fdi) b0Var.h;
        e0 e0Var = new e0(b0Var2);
        fdiVar2.getClass();
        fdiVar2.m(null, e0Var);
        return Unit.a;
    }
}
