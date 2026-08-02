package i4;

import N3.C3659j;
import N3.H;
import N3.v;
import N3.w;
import N3.x;
import N3.y;
import i4.i;
import j3.C7272n;
import java.util.Arrays;
import m3.C8050C;
import m3.N;

/* loaded from: classes8.dex */
final class b extends i {

    /* renamed from: n, reason: collision with root package name */
    private y f65808n;

    /* renamed from: o, reason: collision with root package name */
    private a f65809o;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        private y f65810a;

        /* renamed from: b, reason: collision with root package name */
        private y.a f65811b;

        /* renamed from: c, reason: collision with root package name */
        private long f65812c = -1;

        /* renamed from: d, reason: collision with root package name */
        private long f65813d = -1;

        public a(y yVar, y.a aVar) {
            this.f65810a = yVar;
            this.f65811b = aVar;
        }

        @Override // i4.g
        public final long a(C3659j c3659j) {
            long j11 = this.f65813d;
            if (j11 < 0) {
                return -1L;
            }
            long j12 = -(j11 + 2);
            this.f65813d = -1L;
            return j12;
        }

        @Override // i4.g
        public final H b() {
            G10.a.h(this.f65812c != -1);
            return new x(this.f65810a, this.f65812c);
        }

        @Override // i4.g
        public final void c(long j11) {
            long[] jArr = this.f65811b.f18665a;
            this.f65813d = jArr[N.e(jArr, j11, true)];
        }

        public final void d(long j11) {
            this.f65812c = j11;
        }
    }

    b() {
    }

    public static boolean j(C8050C c8050c) {
        return c8050c.a() >= 5 && c8050c.E() == 127 && c8050c.G() == 1179402563;
    }

    @Override // i4.i
    protected final long e(C8050C c8050c) {
        if (c8050c.e()[0] != -1) {
            return -1L;
        }
        int i11 = (c8050c.e()[2] & 255) >> 4;
        if (i11 == 6 || i11 == 7) {
            c8050c.S(4);
            c8050c.M();
        }
        int c11 = v.c(i11, c8050c);
        c8050c.R(0);
        return c11;
    }

    @Override // i4.i
    protected final boolean g(C8050C c8050c, long j11, i.a aVar) {
        byte[] e11 = c8050c.e();
        y yVar = this.f65808n;
        if (yVar == null) {
            y yVar2 = new y(17, e11);
            this.f65808n = yVar2;
            C7272n.a a11 = yVar2.f(Arrays.copyOfRange(e11, 9, c8050c.i()), null).a();
            a11.W("audio/ogg");
            aVar.f65845a = a11.P();
            return true;
        }
        byte b11 = e11[0];
        if ((b11 & Byte.MAX_VALUE) == 3) {
            y.a f7 = w.f(c8050c);
            y b12 = yVar.b(f7);
            this.f65808n = b12;
            this.f65809o = new a(b12, f7);
            return true;
        }
        if (b11 != -1) {
            return true;
        }
        a aVar2 = this.f65809o;
        if (aVar2 != null) {
            aVar2.d(j11);
            aVar.f65846b = this.f65809o;
        }
        aVar.f65845a.getClass();
        return false;
    }

    @Override // i4.i
    protected final void h(boolean z11) {
        super.h(z11);
        if (z11) {
            this.f65808n = null;
            this.f65809o = null;
        }
    }
}
