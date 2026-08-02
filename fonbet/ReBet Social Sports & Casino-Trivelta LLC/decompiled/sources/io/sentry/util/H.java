package io.sentry.util;

import io.sentry.C4734d;
import io.sentry.E1;
import io.sentry.F3;
import io.sentry.InterfaceC4730c0;
import io.sentry.InterfaceC4740e0;
import io.sentry.L1;
import io.sentry.N1;
import io.sentry.U0;
import io.sentry.l4;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class H {
    public static /* synthetic */ void b(InterfaceC4730c0 interfaceC4730c0, F3 f32, E1 e12) {
        C4734d c10 = e12.c();
        if (c10.x()) {
            c10.P(interfaceC4730c0, f32);
            c10.d();
        }
    }

    public static C4734d d(C4734d c4734d, l4 l4Var) {
        return e(c4734d, l4Var == null ? null : l4Var.e(), l4Var == null ? null : l4Var.d(), l4Var != null ? l4Var.c() : null);
    }

    public static C4734d e(C4734d c4734d, Boolean bool, Double d10, Double d11) {
        if (c4734d == null) {
            c4734d = new C4734d(U0.e());
        }
        if (c4734d.o() == null) {
            Double p10 = c4734d.p();
            if (p10 != null) {
                d10 = p10;
            }
            c4734d.J(A.b(d11, d10, bool));
        }
        if (c4734d.x() && c4734d.y()) {
            c4734d.d();
        }
        return c4734d;
    }

    public static boolean f(List list, String str) {
        if (str != null && list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((io.sentry.H) it.next()).a().equalsIgnoreCase(str)) {
                    return true;
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((io.sentry.H) it2.next()).b(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static E1 g(final InterfaceC4730c0 interfaceC4730c0, final F3 f32) {
        return interfaceC4730c0.V(new L1.a() { // from class: io.sentry.util.E
            @Override // io.sentry.L1.a
            public final void a(E1 e12) {
                H.b(InterfaceC4730c0.this, f32, e12);
            }
        });
    }

    public static boolean h(F3 f32, C4734d c4734d) {
        String effectiveOrgId = f32.getEffectiveOrgId();
        String str = null;
        String k10 = c4734d != null ? c4734d.k() : null;
        if (k10 != null && !k10.trim().isEmpty()) {
            str = k10.trim();
        }
        if (effectiveOrgId != null && str != null && !effectiveOrgId.equals(str)) {
            return false;
        }
        if (!f32.isStrictTraceContinuation()) {
            return true;
        }
        if (effectiveOrgId == null && str == null) {
            return true;
        }
        return effectiveOrgId != null && effectiveOrgId.equals(str);
    }

    public static void i(InterfaceC4740e0 interfaceC4740e0) {
        interfaceC4740e0.l(new N1() { // from class: io.sentry.util.F
            @Override // io.sentry.N1
            public final void a(InterfaceC4730c0 interfaceC4730c0) {
                interfaceC4730c0.V(new L1.a() { // from class: io.sentry.util.G
                    @Override // io.sentry.L1.a
                    public final void a(E1 e12) {
                        InterfaceC4730c0.this.Z(new E1());
                    }
                });
            }
        });
    }
}
