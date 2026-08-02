package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f0 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ boolean s;
    public final /* synthetic */ g0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(g0 g0Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = g0Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        g0 g0Var = this.t;
        switch (i) {
            case 0:
                f0 f0Var = new f0(g0Var, rq3Var, 0);
                f0Var.s = ((Boolean) obj).booleanValue();
                return f0Var;
            case 1:
                f0 f0Var2 = new f0(g0Var, rq3Var, 1);
                f0Var2.s = ((Boolean) obj).booleanValue();
                return f0Var2;
            default:
                f0 f0Var3 = new f0(g0Var, rq3Var, 2);
                f0Var3.s = ((Boolean) obj).booleanValue();
                return f0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        rq3 rq3Var = (rq3) obj2;
        switch (i) {
        }
        return ((f0) create(bool, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        g0 g0Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                g0Var.m.m(null, Boolean.valueOf(this.s));
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                g0Var.o.m(null, Boolean.valueOf(this.s));
                break;
            default:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                g0Var.q.m(null, Boolean.valueOf(this.s));
                break;
        }
        return Unit.a;
    }
}
