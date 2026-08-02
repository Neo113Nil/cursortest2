package h6;

import T7.A;
import T7.C1678s;
import T7.C1682w;
import h6.C4466B;
import m6.C5562a;
import o6.C5817b;
import o6.C5818c;
import s6.C6340a;

/* renamed from: h6.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4466B {

    /* renamed from: a, reason: collision with root package name */
    public static final C4466B f47716a = new C4466B();

    public static final void a() {
        if (Y7.a.d(C4466B.class)) {
            return;
        }
        try {
            T7.A a10 = T7.A.f10965a;
            T7.A.d(new a());
        } catch (Throwable th2) {
            Y7.a.b(th2, C4466B.class);
        }
    }

    /* renamed from: h6.B$a */
    public static final class a implements A.b {
        public static final void j(boolean z10) {
            if (z10) {
                i6.b.b();
            }
        }

        public static final void k(boolean z10) {
            if (z10) {
                C6340a.a();
            }
        }

        public static final void l(boolean z10) {
            if (z10) {
                q6.f.f();
            }
        }

        public static final void m(boolean z10) {
            if (z10) {
                C5562a.a();
            }
        }

        public static final void n(boolean z10) {
            if (z10) {
                n6.k.a();
            }
        }

        public static final void o(boolean z10) {
            if (z10) {
                C5818c.b();
            }
        }

        public static final void p(boolean z10) {
            if (z10) {
                C5817b.a();
            }
        }

        public static final void q(boolean z10) {
            if (z10) {
                j6.d.b();
            }
        }

        @Override // T7.A.b
        public void a(C1682w c1682w) {
            C1678s c1678s = C1678s.f11164a;
            C1678s.a(C1678s.b.AAM, new C1678s.a() { // from class: h6.t
                @Override // T7.C1678s.a
                public final void a(boolean z10) {
                    C4466B.a.j(z10);
                }
            });
            C1678s.a(C1678s.b.RestrictiveDataFiltering, new C1678s.a() { // from class: h6.u
                @Override // T7.C1678s.a
                public final void a(boolean z10) {
                    C4466B.a.k(z10);
                }
            });
            C1678s.a(C1678s.b.PrivacyProtection, new C1678s.a() { // from class: h6.v
                @Override // T7.C1678s.a
                public final void a(boolean z10) {
                    C4466B.a.l(z10);
                }
            });
            C1678s.a(C1678s.b.EventDeactivation, new C1678s.a() { // from class: h6.w
                @Override // T7.C1678s.a
                public final void a(boolean z10) {
                    C4466B.a.m(z10);
                }
            });
            C1678s.a(C1678s.b.IapLogging, new C1678s.a() { // from class: h6.x
                @Override // T7.C1678s.a
                public final void a(boolean z10) {
                    C4466B.a.n(z10);
                }
            });
            C1678s.a(C1678s.b.ProtectedMode, new C1678s.a() { // from class: h6.y
                @Override // T7.C1678s.a
                public final void a(boolean z10) {
                    C4466B.a.o(z10);
                }
            });
            C1678s.a(C1678s.b.MACARuleMatching, new C1678s.a() { // from class: h6.z
                @Override // T7.C1678s.a
                public final void a(boolean z10) {
                    C4466B.a.p(z10);
                }
            });
            C1678s.a(C1678s.b.CloudBridge, new C1678s.a() { // from class: h6.A
                @Override // T7.C1678s.a
                public final void a(boolean z10) {
                    C4466B.a.q(z10);
                }
            });
        }

        @Override // T7.A.b
        public void onError() {
        }
    }
}
