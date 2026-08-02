package u4;

import N3.C3659j;
import java.io.IOException;
import m3.C8050C;
import m3.C8056I;
import m3.N;

/* loaded from: classes.dex */
final class z {

    /* renamed from: c, reason: collision with root package name */
    private boolean f100288c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f100289d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f100290e;

    /* renamed from: a, reason: collision with root package name */
    private final C8056I f100286a = new C8056I(0);

    /* renamed from: f, reason: collision with root package name */
    private long f100291f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f100292g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f100293h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final C8050C f100287b = new C8050C();

    z() {
    }

    private void a(C3659j c3659j) {
        byte[] bArr = N.f74291c;
        C8050C c8050c = this.f100287b;
        c8050c.getClass();
        c8050c.P(bArr.length, bArr);
        this.f100288c = true;
        c3659j.e();
    }

    private static int e(int i11, byte[] bArr) {
        return (bArr[i11 + 3] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
    }

    public static long g(C8050C c8050c) {
        int f7 = c8050c.f();
        if (c8050c.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c8050c.n(0, 9, bArr);
        c8050c.R(f7);
        byte b11 = bArr[0];
        if ((b11 & 196) == 68) {
            byte b12 = bArr[2];
            if ((b12 & 4) == 4) {
                byte b13 = bArr[4];
                if ((b13 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j11 = b11;
                    long j12 = b12;
                    return ((j12 & 3) << 13) | ((j11 & 3) << 28) | (((56 & j11) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j12 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b13 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final long b() {
        return this.f100293h;
    }

    public final C8056I c() {
        return this.f100286a;
    }

    public final boolean d() {
        return this.f100288c;
    }

    public final int f(C3659j c3659j, N3.G g10) throws IOException {
        boolean z11 = this.f100290e;
        C8050C c8050c = this.f100287b;
        long j11 = -9223372036854775807L;
        if (!z11) {
            long length = c3659j.getLength();
            int min = (int) Math.min(20000L, length);
            long j12 = length - min;
            if (c3659j.getPosition() != j12) {
                g10.f18501a = j12;
                return 1;
            }
            c8050c.O(min);
            c3659j.e();
            c3659j.d(c8050c.e(), 0, min, false);
            int f7 = c8050c.f();
            int i11 = c8050c.i() - 4;
            while (true) {
                if (i11 < f7) {
                    break;
                }
                if (e(i11, c8050c.e()) == 442) {
                    c8050c.R(i11 + 4);
                    long g11 = g(c8050c);
                    if (g11 != -9223372036854775807L) {
                        j11 = g11;
                        break;
                    }
                }
                i11--;
            }
            this.f100292g = j11;
            this.f100290e = true;
            return 0;
        }
        if (this.f100292g == -9223372036854775807L) {
            a(c3659j);
            return 0;
        }
        if (this.f100289d) {
            long j13 = this.f100291f;
            if (j13 == -9223372036854775807L) {
                a(c3659j);
                return 0;
            }
            C8056I c8056i = this.f100286a;
            this.f100293h = c8056i.c(this.f100292g) - c8056i.b(j13);
            a(c3659j);
            return 0;
        }
        int min2 = (int) Math.min(20000L, c3659j.getLength());
        long j14 = 0;
        if (c3659j.getPosition() != j14) {
            g10.f18501a = j14;
            return 1;
        }
        c8050c.O(min2);
        c3659j.e();
        c3659j.d(c8050c.e(), 0, min2, false);
        int f11 = c8050c.f();
        int i12 = c8050c.i();
        while (true) {
            if (f11 >= i12 - 3) {
                break;
            }
            if (e(f11, c8050c.e()) == 442) {
                c8050c.R(f11 + 4);
                long g12 = g(c8050c);
                if (g12 != -9223372036854775807L) {
                    j11 = g12;
                    break;
                }
            }
            f11++;
        }
        this.f100291f = j11;
        this.f100289d = true;
        return 0;
    }
}
