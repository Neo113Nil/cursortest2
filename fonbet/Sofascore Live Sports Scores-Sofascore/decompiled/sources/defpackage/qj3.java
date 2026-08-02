package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class qj3 extends g62 {
    public final a62 s;

    public qj3(int i, a62 a62Var, Function1 function1) {
        super(i, function1);
        this.s = a62Var;
        if (a62Var == a62.a) {
            pvd.A(duf.a.getOrCreateKotlinClass(g62.class).getSimpleName(), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        ogj.h(lnb.k(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    @Override // defpackage.g62
    public final boolean C() {
        return this.s == a62.b;
    }

    public final Object Q(Object obj, boolean z) {
        Function1 function1;
        fb3 w;
        if (this.s == a62.c) {
            Object d = super.d(obj);
            if (!(d instanceof fo2) || (d instanceof eo2)) {
                return d;
            }
            if (!z || (function1 = this.b) == null || (w = y6a.w(function1, obj, null)) == null) {
                return Unit.a;
            }
            throw w;
        }
        Object obj2 = obj;
        Object obj3 = i62.d;
        ho2 ho2Var = (ho2) g62.h.get(this);
        while (true) {
            long andIncrement = g62.d.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean z2 = z(andIncrement, false);
            int i = i62.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (ho2Var.d != j3) {
                ho2 m = m(j3, ho2Var);
                if (m != null) {
                    ho2Var = m;
                } else if (z2) {
                    return new eo2(u());
                }
            }
            int N = N(ho2Var, i2, obj2, j, obj3, z2);
            if (N == 0) {
                ho2Var.b();
                return Unit.a;
            }
            if (N == 1) {
                return Unit.a;
            }
            if (N == 2) {
                if (z2) {
                    ho2Var.i();
                    return new eo2(u());
                }
                kzk kzkVar = obj3 instanceof kzk ? (kzk) obj3 : null;
                if (kzkVar != null) {
                    kzkVar.b(ho2Var, i2 + i);
                }
                i((ho2Var.d * j2) + i2);
                return Unit.a;
            }
            if (N == 3) {
                a70.r("unexpected");
                return null;
            }
            if (N == 4) {
                if (j < t()) {
                    ho2Var.b();
                }
                return new eo2(u());
            }
            if (N == 5) {
                ho2Var.b();
            }
            obj2 = obj;
        }
    }

    @Override // defpackage.g62, defpackage.l4h
    public final Object d(Object obj) {
        return Q(obj, false);
    }

    @Override // defpackage.g62, defpackage.l4h
    public final Object q(rq3 rq3Var, Object obj) {
        fb3 w;
        if (!(Q(obj, true) instanceof eo2)) {
            return Unit.a;
        }
        Function1 function1 = this.b;
        if (function1 == null || (w = y6a.w(function1, obj, null)) == null) {
            throw u();
        }
        de6.a(w, u());
        throw w;
    }
}
