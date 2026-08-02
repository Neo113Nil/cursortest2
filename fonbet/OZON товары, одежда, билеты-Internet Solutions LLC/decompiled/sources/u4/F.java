package u4;

import N3.AbstractC3654e;
import N3.C3659j;
import java.io.IOException;
import m3.C8050C;
import m3.C8056I;
import m3.N;

/* loaded from: classes8.dex */
final class F extends AbstractC3654e {

    private static final class a implements AbstractC3654e.f {

        /* renamed from: a, reason: collision with root package name */
        private final C8056I f99922a;

        /* renamed from: b, reason: collision with root package name */
        private final C8050C f99923b = new C8050C();

        /* renamed from: c, reason: collision with root package name */
        private final int f99924c;

        public a(int i11, C8056I c8056i) {
            this.f99924c = i11;
            this.f99922a = c8056i;
        }

        @Override // N3.AbstractC3654e.f
        public final AbstractC3654e.C0355e a(C3659j c3659j, long j11) throws IOException {
            long position = c3659j.getPosition();
            int min = (int) Math.min(112800, c3659j.getLength() - position);
            C8050C c8050c = this.f99923b;
            c8050c.O(min);
            c3659j.d(c8050c.e(), 0, min, false);
            int i11 = c8050c.i();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (c8050c.a() >= 188) {
                int c11 = O7.h.c(c8050c.f(), i11, c8050c.e());
                int i12 = c11 + 188;
                if (i12 > i11) {
                    break;
                }
                long l11 = O7.h.l(c8050c, c11, this.f99924c);
                if (l11 != -9223372036854775807L) {
                    long b11 = this.f99922a.b(l11);
                    if (b11 > j11) {
                        return j14 == -9223372036854775807L ? AbstractC3654e.C0355e.d(b11, position) : AbstractC3654e.C0355e.e(position + j13);
                    }
                    if (100000 + b11 > j11) {
                        return AbstractC3654e.C0355e.e(position + c11);
                    }
                    j13 = c11;
                    j14 = b11;
                }
                c8050c.R(i12);
                j12 = i12;
            }
            return j14 != -9223372036854775807L ? AbstractC3654e.C0355e.f(j14, position + j12) : AbstractC3654e.C0355e.f18598d;
        }

        @Override // N3.AbstractC3654e.f
        public final void b() {
            byte[] bArr = N.f74291c;
            C8050C c8050c = this.f99923b;
            c8050c.getClass();
            c8050c.P(bArr.length, bArr);
        }
    }

    public F(C8056I c8056i, long j11, long j12, int i11) {
        super(new AbstractC3654e.b(), new a(i11, c8056i), j11, j11 + 1, 0L, j12, 188L, 940);
    }
}
