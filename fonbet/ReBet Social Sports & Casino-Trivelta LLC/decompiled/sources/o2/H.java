package o2;

import H1.AbstractC1172e;
import H1.InterfaceC1184q;
import e1.Q;
import e1.Z;

/* loaded from: classes.dex */
public final class H extends AbstractC1172e {

    public static final class a implements AbstractC1172e.f {

        /* renamed from: a, reason: collision with root package name */
        public final Q f58938a;

        /* renamed from: b, reason: collision with root package name */
        public final e1.J f58939b = new e1.J();

        /* renamed from: c, reason: collision with root package name */
        public final int f58940c;

        /* renamed from: d, reason: collision with root package name */
        public final int f58941d;

        public a(int i10, Q q10, int i11) {
            this.f58940c = i10;
            this.f58938a = q10;
            this.f58941d = i11;
        }

        @Override // H1.AbstractC1172e.f
        public AbstractC1172e.C0097e a(InterfaceC1184q interfaceC1184q, long j10) {
            long position = interfaceC1184q.getPosition();
            int min = (int) Math.min(this.f58941d, interfaceC1184q.getLength() - position);
            this.f58939b.X(min);
            interfaceC1184q.n(this.f58939b.f(), 0, min);
            return c(this.f58939b, j10, position);
        }

        @Override // H1.AbstractC1172e.f
        public void b() {
            this.f58939b.Y(Z.EMPTY_BYTE_ARRAY);
        }

        public final AbstractC1172e.C0097e c(e1.J j10, long j11, long j12) {
            int a10;
            int a11;
            int j13 = j10.j();
            long j14 = -1;
            long j15 = -1;
            long j16 = -9223372036854775807L;
            while (j10.a() >= 188 && (a11 = (a10 = M.a(j10.f(), j10.g(), j13)) + 188) <= j13) {
                long c10 = M.c(j10, a10, this.f58940c);
                if (c10 != -9223372036854775807L) {
                    long b10 = this.f58938a.b(c10);
                    if (b10 > j11) {
                        return j16 == -9223372036854775807L ? AbstractC1172e.C0097e.d(b10, j12) : AbstractC1172e.C0097e.e(j12 + j15);
                    }
                    if (100000 + b10 > j11) {
                        return AbstractC1172e.C0097e.e(j12 + a10);
                    }
                    j15 = a10;
                    j16 = b10;
                }
                j10.b0(a11);
                j14 = a11;
            }
            return j16 != -9223372036854775807L ? AbstractC1172e.C0097e.f(j16, j12 + j14) : AbstractC1172e.C0097e.f4430d;
        }
    }

    public H(Q q10, long j10, long j11, int i10, int i11) {
        super(new AbstractC1172e.b(), new a(i10, q10, i11), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}
