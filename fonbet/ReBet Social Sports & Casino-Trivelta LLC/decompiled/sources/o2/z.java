package o2;

import H1.AbstractC1172e;
import H1.InterfaceC1184q;
import ai.verisoul.sdk.helpers.webview.VerisoulWebViewImplKt;
import e1.Q;
import e1.Z;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class z extends AbstractC1172e {

    public static final class b implements AbstractC1172e.f {

        /* renamed from: a, reason: collision with root package name */
        public final Q f59302a;

        /* renamed from: b, reason: collision with root package name */
        public final e1.J f59303b;

        public static void d(e1.J j10) {
            int k10;
            int j11 = j10.j();
            if (j10.a() < 10) {
                j10.b0(j11);
                return;
            }
            j10.c0(9);
            int M10 = j10.M() & 7;
            if (j10.a() < M10) {
                j10.b0(j11);
                return;
            }
            j10.c0(M10);
            if (j10.a() < 4) {
                j10.b0(j11);
                return;
            }
            if (z.k(j10.f(), j10.g()) == 443) {
                j10.c0(4);
                int U10 = j10.U();
                if (j10.a() < U10) {
                    j10.b0(j11);
                    return;
                }
                j10.c0(U10);
            }
            while (j10.a() >= 4 && (k10 = z.k(j10.f(), j10.g())) != 442 && k10 != 441 && (k10 >>> 8) == 1) {
                j10.c0(4);
                if (j10.a() < 2) {
                    j10.b0(j11);
                    return;
                }
                j10.b0(Math.min(j10.j(), j10.g() + j10.U()));
            }
        }

        @Override // H1.AbstractC1172e.f
        public AbstractC1172e.C0097e a(InterfaceC1184q interfaceC1184q, long j10) {
            long position = interfaceC1184q.getPosition();
            int min = (int) Math.min(VerisoulWebViewImplKt.WEBVIEW_TIMEOUT, interfaceC1184q.getLength() - position);
            this.f59303b.X(min);
            interfaceC1184q.n(this.f59303b.f(), 0, min);
            return c(this.f59303b, j10, position);
        }

        @Override // H1.AbstractC1172e.f
        public void b() {
            this.f59303b.Y(Z.EMPTY_BYTE_ARRAY);
        }

        public final AbstractC1172e.C0097e c(e1.J j10, long j11, long j12) {
            int i10 = -1;
            int i11 = -1;
            long j13 = -9223372036854775807L;
            while (j10.a() >= 4) {
                if (z.k(j10.f(), j10.g()) != 442) {
                    j10.c0(1);
                } else {
                    j10.c0(4);
                    long l10 = C5774A.l(j10);
                    if (l10 != -9223372036854775807L) {
                        long b10 = this.f59302a.b(l10);
                        if (b10 > j11) {
                            return j13 == -9223372036854775807L ? AbstractC1172e.C0097e.d(b10, j12) : AbstractC1172e.C0097e.e(j12 + i11);
                        }
                        if (100000 + b10 > j11) {
                            return AbstractC1172e.C0097e.e(j12 + j10.g());
                        }
                        i11 = j10.g();
                        j13 = b10;
                    }
                    d(j10);
                    i10 = j10.g();
                }
            }
            return j13 != -9223372036854775807L ? AbstractC1172e.C0097e.f(j13, j12 + i10) : AbstractC1172e.C0097e.f4430d;
        }

        public b(Q q10) {
            this.f59302a = q10;
            this.f59303b = new e1.J();
        }
    }

    public z(Q q10, long j10, long j11) {
        super(new AbstractC1172e.b(), new b(q10), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & UByte.MAX_VALUE) | ((bArr[i10] & UByte.MAX_VALUE) << 24) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8);
    }
}
