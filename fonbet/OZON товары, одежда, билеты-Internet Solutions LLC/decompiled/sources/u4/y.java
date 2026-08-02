package u4;

import N3.AbstractC3654e;
import N3.C3659j;
import java.io.IOException;
import m3.C8050C;
import m3.C8056I;
import m3.N;

/* loaded from: classes8.dex */
final class y extends AbstractC3654e {

    private static final class a implements AbstractC3654e.f {

        /* renamed from: a, reason: collision with root package name */
        private final C8056I f100284a;

        /* renamed from: b, reason: collision with root package name */
        private final C8050C f100285b = new C8050C();

        a(C8056I c8056i) {
            this.f100284a = c8056i;
        }

        @Override // N3.AbstractC3654e.f
        public final AbstractC3654e.C0355e a(C3659j c3659j, long j11) throws IOException {
            long position = c3659j.getPosition();
            int min = (int) Math.min(20000L, c3659j.getLength() - position);
            C8050C c8050c = this.f100285b;
            c8050c.O(min);
            c3659j.d(c8050c.e(), 0, min, false);
            int i11 = -1;
            int i12 = -1;
            long j12 = -9223372036854775807L;
            while (c8050c.a() >= 4) {
                if (y.f(c8050c.f(), c8050c.e()) != 442) {
                    c8050c.S(1);
                } else {
                    c8050c.S(4);
                    long g10 = z.g(c8050c);
                    if (g10 != -9223372036854775807L) {
                        long b11 = this.f100284a.b(g10);
                        if (b11 > j11) {
                            return j12 == -9223372036854775807L ? AbstractC3654e.C0355e.d(b11, position) : AbstractC3654e.C0355e.e(position + i12);
                        }
                        if (100000 + b11 > j11) {
                            return AbstractC3654e.C0355e.e(position + c8050c.f());
                        }
                        i12 = c8050c.f();
                        j12 = b11;
                    }
                    int i13 = c8050c.i();
                    if (c8050c.a() >= 10) {
                        c8050c.S(9);
                        int E11 = c8050c.E() & 7;
                        if (c8050c.a() >= E11) {
                            c8050c.S(E11);
                            if (c8050c.a() >= 4) {
                                if (y.f(c8050c.f(), c8050c.e()) == 443) {
                                    c8050c.S(4);
                                    int L11 = c8050c.L();
                                    if (c8050c.a() < L11) {
                                        c8050c.R(i13);
                                    } else {
                                        c8050c.S(L11);
                                    }
                                }
                                while (true) {
                                    if (c8050c.a() < 4) {
                                        break;
                                    }
                                    int f7 = y.f(c8050c.f(), c8050c.e());
                                    if (f7 == 442 || f7 == 441 || (f7 >>> 8) != 1) {
                                        break;
                                    }
                                    c8050c.S(4);
                                    if (c8050c.a() < 2) {
                                        c8050c.R(i13);
                                        break;
                                    }
                                    c8050c.R(Math.min(c8050c.i(), c8050c.f() + c8050c.L()));
                                }
                            } else {
                                c8050c.R(i13);
                            }
                        } else {
                            c8050c.R(i13);
                        }
                    } else {
                        c8050c.R(i13);
                    }
                    i11 = c8050c.f();
                }
            }
            return j12 != -9223372036854775807L ? AbstractC3654e.C0355e.f(j12, position + i11) : AbstractC3654e.C0355e.f18598d;
        }

        @Override // N3.AbstractC3654e.f
        public final void b() {
            byte[] bArr = N.f74291c;
            C8050C c8050c = this.f100285b;
            c8050c.getClass();
            c8050c.P(bArr.length, bArr);
        }
    }

    public y(C8056I c8056i, long j11, long j12) {
        super(new AbstractC3654e.b(), new a(c8056i), j11, j11 + 1, 0L, j12, 188L, 1000);
    }

    static int f(int i11, byte[] bArr) {
        return (bArr[i11 + 3] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
    }
}
