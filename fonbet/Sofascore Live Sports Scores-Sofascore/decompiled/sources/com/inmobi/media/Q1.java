package com.inmobi.media;

import android.view.ViewGroup;
import defpackage.a70;
import defpackage.b98;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.hs4;
import defpackage.jof;
import defpackage.k53;
import defpackage.kif;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.pvd;
import defpackage.rob;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.th2;
import defpackage.un0;
import defpackage.weh;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yda;
import defpackage.yso;
import defpackage.z45;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Q1 implements b98 {
    public final ku3 a;
    public final ViewGroup b;
    public final f1d c;
    public final long d;
    public final InterfaceC3880x9 e;
    public yda f;

    public Q1(long j, ViewGroup viewGroup, InterfaceC3880x9 interfaceC3880x9, ku3 ku3Var, f1d f1dVar) {
        ku3Var.getClass();
        viewGroup.getClass();
        f1dVar.getClass();
        this.a = ku3Var;
        this.b = viewGroup;
        this.c = f1dVar;
        this.d = j;
        this.e = interfaceC3880x9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        if (r13.a.collect(r14, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c7, code lost:
    
        if (r15.a.collect(r5, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Q1 q1, ViewGroup viewGroup, ku3 ku3Var, sq3 sq3Var) {
        O1 o1;
        int i;
        q1.getClass();
        if (sq3Var instanceof O1) {
            o1 = (O1) sq3Var;
            int i2 = o1.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o1.c = i2 - Integer.MIN_VALUE;
                Object obj = o1.a;
                lu3 lu3Var = lu3.a;
                i = o1.c;
                if (i == 0) {
                    if (i == 1) {
                        y6a.M(obj);
                        pvd.x();
                        return null;
                    }
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    pvd.x();
                    return null;
                }
                y6a.M(obj);
                F5.a.getClass();
                boolean B = F5.B();
                InterfaceC3880x9 interfaceC3880x9 = q1.e;
                kif kifVar = weh.a;
                if (B) {
                    if (interfaceC3880x9 != null) {
                        ((C3906y9) interfaceC3880x9).a("WindowLifecycleHandler", "startObservingVisibility - Using window visibility observer (UDC+)");
                    }
                    th2 q = yso.q(new dp(viewGroup, null));
                    hs4 hs4Var = z45.a;
                    jof K = un0.K(k53.g0(q, rob.a), ku3Var, kifVar, Boolean.valueOf(viewGroup.getWindowVisibility() == 0));
                    P1 p1 = new P1(q1);
                    o1.c = 1;
                } else {
                    if (interfaceC3880x9 != null) {
                        ((C3906y9) interfaceC3880x9).a("WindowLifecycleHandler", "startObservingVisibility - Using window focus observer (pre-UDC)");
                    }
                    th2 q2 = yso.q(new bp(viewGroup, null));
                    hs4 hs4Var2 = z45.a;
                    jof K2 = un0.K(k53.g0(q2, rob.a), ku3Var, kifVar, Boolean.valueOf(viewGroup.isFocused()));
                    C3361d7 c3361d7 = new C3361d7(q1.d, viewGroup, q1.e, ku3Var, q1.c);
                    o1.c = 2;
                }
                return lu3Var;
            }
        }
        o1 = new O1(q1, sq3Var);
        Object obj2 = o1.a;
        lu3 lu3Var2 = lu3.a;
        i = o1.c;
        if (i == 0) {
        }
    }

    @Override // defpackage.b98
    public final /* bridge */ /* synthetic */ Object emit(Object obj, rq3 rq3Var) {
        return a(((Boolean) obj).booleanValue());
    }

    public final Unit a(boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.e;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("WindowLifecycleHandler", com.appsflyer.internal.i.j("AttachedStateCollector - view attachment state changed: ", z));
        }
        InterfaceC3880x9 interfaceC3880x92 = this.e;
        if (z) {
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).a("WindowLifecycleHandler", "AttachedStateCollector - starting visibility observation");
            }
            this.f = xw3.L(this.a, null, null, new N1(this, null), 3);
        } else {
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).a("WindowLifecycleHandler", "AttachedStateCollector - view detached, stopping observation");
            }
            f1d f1dVar = this.c;
            Boolean bool = Boolean.FALSE;
            fdi fdiVar = (fdi) f1dVar;
            fdiVar.getClass();
            fdiVar.m(null, bool);
            P6.a(this.f);
            this.f = null;
        }
        return Unit.a;
    }
}
