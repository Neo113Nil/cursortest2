package u4;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import m3.C8050C;
import m3.C8056I;
import m3.N;
import u4.J;

/* loaded from: classes.dex */
public final class D implements J {

    /* renamed from: a, reason: collision with root package name */
    private final C f99913a;

    /* renamed from: b, reason: collision with root package name */
    private final C8050C f99914b = new C8050C(32);

    /* renamed from: c, reason: collision with root package name */
    private int f99915c;

    /* renamed from: d, reason: collision with root package name */
    private int f99916d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f99917e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f99918f;

    public D(C c11) {
        this.f99913a = c11;
    }

    @Override // u4.J
    public final void a(C8056I c8056i, N3.r rVar, J.d dVar) {
        this.f99913a.a(c8056i, rVar, dVar);
        this.f99918f = true;
    }

    @Override // u4.J
    public final void b() {
        this.f99918f = true;
    }

    @Override // u4.J
    public final void c(int i11, C8050C c8050c) {
        boolean z11 = (i11 & 1) != 0;
        int f7 = z11 ? c8050c.f() + c8050c.E() : -1;
        if (this.f99918f) {
            if (!z11) {
                return;
            }
            this.f99918f = false;
            c8050c.R(f7);
            this.f99916d = 0;
        }
        while (c8050c.a() > 0) {
            int i12 = this.f99916d;
            C8050C c8050c2 = this.f99914b;
            if (i12 < 3) {
                if (i12 == 0) {
                    int E11 = c8050c.E();
                    c8050c.R(c8050c.f() - 1);
                    if (E11 == 255) {
                        this.f99918f = true;
                        return;
                    }
                }
                int min = Math.min(c8050c.a(), 3 - this.f99916d);
                c8050c.n(this.f99916d, min, c8050c2.e());
                int i13 = this.f99916d + min;
                this.f99916d = i13;
                if (i13 == 3) {
                    c8050c2.R(0);
                    c8050c2.Q(3);
                    c8050c2.S(1);
                    int E12 = c8050c2.E();
                    int E13 = c8050c2.E();
                    this.f99917e = (E12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
                    this.f99915c = (((E12 & 15) << 8) | E13) + 3;
                    int b11 = c8050c2.b();
                    int i14 = this.f99915c;
                    if (b11 < i14) {
                        c8050c2.d(Math.min(4098, Math.max(i14, c8050c2.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(c8050c.a(), this.f99915c - this.f99916d);
                c8050c.n(this.f99916d, min2, c8050c2.e());
                int i15 = this.f99916d + min2;
                this.f99916d = i15;
                int i16 = this.f99915c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (!this.f99917e) {
                        c8050c2.Q(i16);
                    } else {
                        if (N.n(0, c8050c2.e(), this.f99915c, -1) != 0) {
                            this.f99918f = true;
                            return;
                        }
                        c8050c2.Q(this.f99915c - 4);
                    }
                    c8050c2.R(0);
                    this.f99913a.c(c8050c2);
                    this.f99916d = 0;
                }
            }
        }
    }
}
