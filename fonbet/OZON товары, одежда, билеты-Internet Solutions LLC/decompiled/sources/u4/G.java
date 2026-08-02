package u4;

import N3.C3659j;
import java.io.IOException;
import m3.C8050C;
import m3.C8056I;
import m3.N;

/* loaded from: classes.dex */
final class G {

    /* renamed from: c, reason: collision with root package name */
    private boolean f99927c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f99928d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f99929e;

    /* renamed from: a, reason: collision with root package name */
    private final C8056I f99925a = new C8056I(0);

    /* renamed from: f, reason: collision with root package name */
    private long f99930f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f99931g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f99932h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final C8050C f99926b = new C8050C();

    G() {
    }

    private void a(C3659j c3659j) {
        byte[] bArr = N.f74291c;
        C8050C c8050c = this.f99926b;
        c8050c.getClass();
        c8050c.P(bArr.length, bArr);
        this.f99927c = true;
        c3659j.e();
    }

    public final long b() {
        return this.f99932h;
    }

    public final C8056I c() {
        return this.f99925a;
    }

    public final boolean d() {
        return this.f99927c;
    }

    public final int e(C3659j c3659j, N3.G g10, int i11) throws IOException {
        if (i11 <= 0) {
            a(c3659j);
            return 0;
        }
        boolean z11 = this.f99929e;
        C8050C c8050c = this.f99926b;
        long j11 = -9223372036854775807L;
        if (!z11) {
            long length = c3659j.getLength();
            int min = (int) Math.min(112800, length);
            long j12 = length - min;
            if (c3659j.getPosition() != j12) {
                g10.f18501a = j12;
                return 1;
            }
            c8050c.O(min);
            c3659j.e();
            c3659j.d(c8050c.e(), 0, min, false);
            int f7 = c8050c.f();
            int i12 = c8050c.i();
            int i13 = i12 - 188;
            while (true) {
                if (i13 < f7) {
                    break;
                }
                if (O7.h.j(f7, c8050c.e(), i12, i13)) {
                    long l11 = O7.h.l(c8050c, i13, i11);
                    if (l11 != -9223372036854775807L) {
                        j11 = l11;
                        break;
                    }
                }
                i13--;
            }
            this.f99931g = j11;
            this.f99929e = true;
            return 0;
        }
        if (this.f99931g == -9223372036854775807L) {
            a(c3659j);
            return 0;
        }
        if (this.f99928d) {
            long j13 = this.f99930f;
            if (j13 == -9223372036854775807L) {
                a(c3659j);
                return 0;
            }
            C8056I c8056i = this.f99925a;
            this.f99932h = c8056i.c(this.f99931g) - c8056i.b(j13);
            a(c3659j);
            return 0;
        }
        int min2 = (int) Math.min(112800, c3659j.getLength());
        long j14 = 0;
        if (c3659j.getPosition() != j14) {
            g10.f18501a = j14;
            return 1;
        }
        c8050c.O(min2);
        c3659j.e();
        c3659j.d(c8050c.e(), 0, min2, false);
        int f11 = c8050c.f();
        int i14 = c8050c.i();
        while (true) {
            if (f11 >= i14) {
                break;
            }
            if (c8050c.e()[f11] == 71) {
                long l12 = O7.h.l(c8050c, f11, i11);
                if (l12 != -9223372036854775807L) {
                    j11 = l12;
                    break;
                }
            }
            f11++;
        }
        this.f99930f = j11;
        this.f99928d = true;
        return 0;
    }
}
