package v4;

import B0.d2;
import N3.C3659j;
import N3.G;
import N3.InterfaceC3665p;
import N3.M;
import N3.q;
import N3.r;
import android.util.Pair;
import j3.C7272n;
import j3.v;
import java.io.IOException;
import java.math.RoundingMode;
import m3.C8050C;
import m3.N;
import m3.s;

/* renamed from: v4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10221b implements InterfaceC3665p {

    /* renamed from: a, reason: collision with root package name */
    private r f102088a;

    /* renamed from: b, reason: collision with root package name */
    private M f102089b;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC2222b f102092e;

    /* renamed from: c, reason: collision with root package name */
    private int f102090c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f102091d = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f102093f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f102094g = -1;

    /* renamed from: v4.b$a */
    /* loaded from: classes8.dex */
    private static final class a implements InterfaceC2222b {

        /* renamed from: m, reason: collision with root package name */
        private static final int[] f102095m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n, reason: collision with root package name */
        private static final int[] f102096n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a, reason: collision with root package name */
        private final r f102097a;

        /* renamed from: b, reason: collision with root package name */
        private final M f102098b;

        /* renamed from: c, reason: collision with root package name */
        private final C10222c f102099c;

        /* renamed from: d, reason: collision with root package name */
        private final int f102100d;

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f102101e;

        /* renamed from: f, reason: collision with root package name */
        private final C8050C f102102f;

        /* renamed from: g, reason: collision with root package name */
        private final int f102103g;

        /* renamed from: h, reason: collision with root package name */
        private final C7272n f102104h;

        /* renamed from: i, reason: collision with root package name */
        private int f102105i;

        /* renamed from: j, reason: collision with root package name */
        private long f102106j;

        /* renamed from: k, reason: collision with root package name */
        private int f102107k;

        /* renamed from: l, reason: collision with root package name */
        private long f102108l;

        public a(r rVar, M m11, C10222c c10222c) throws v {
            this.f102097a = rVar;
            this.f102098b = m11;
            this.f102099c = c10222c;
            int i11 = c10222c.f102119c;
            int max = Math.max(1, i11 / 10);
            this.f102103g = max;
            C8050C c8050c = new C8050C(c10222c.f102122f);
            c8050c.x();
            int x11 = c8050c.x();
            this.f102100d = x11;
            int i12 = c10222c.f102118b;
            int i13 = c10222c.f102120d;
            int i14 = (((i13 - (i12 * 4)) * 8) / (c10222c.f102121e * i12)) + 1;
            if (x11 != i14) {
                throw v.a(null, "Expected frames per block: " + i14 + "; got: " + x11);
            }
            int f7 = N.f(max, x11);
            this.f102101e = new byte[f7 * i13];
            this.f102102f = new C8050C(x11 * 2 * i12 * f7);
            int i15 = ((i13 * i11) * 8) / x11;
            C7272n.a aVar = new C7272n.a();
            aVar.y0("audio/raw");
            aVar.S(i15);
            aVar.t0(i15);
            aVar.o0(max * 2 * i12);
            aVar.T(i12);
            aVar.z0(i11);
            aVar.s0(2);
            this.f102104h = aVar.P();
        }

        private void d(int i11) {
            long j11 = this.f102106j;
            long j12 = this.f102108l;
            C10222c c10222c = this.f102099c;
            long j13 = c10222c.f102119c;
            int i12 = N.f74289a;
            long Z11 = j11 + N.Z(j12, 1000000L, j13, RoundingMode.DOWN);
            int i13 = i11 * 2 * c10222c.f102118b;
            this.f102098b.b(Z11, 1, i13, this.f102107k - i13, null);
            this.f102108l += i11;
            this.f102107k -= i13;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:49:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:5:0x0023->B:11:0x003f], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003c -> B:3:0x0020). Please report as a decompilation issue!!! */
        @Override // v4.C10221b.InterfaceC2222b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean a(N3.C3659j r25, long r26) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 331
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: v4.C10221b.a.a(N3.j, long):boolean");
        }

        @Override // v4.C10221b.InterfaceC2222b
        public final void b(int i11, long j11) {
            this.f102097a.seekMap(new C10224e(this.f102099c, this.f102100d, i11, j11));
            this.f102098b.a(this.f102104h);
        }

        @Override // v4.C10221b.InterfaceC2222b
        public final void c(long j11) {
            this.f102105i = 0;
            this.f102106j = j11;
            this.f102107k = 0;
            this.f102108l = 0L;
        }
    }

    /* renamed from: v4.b$b, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    private interface InterfaceC2222b {
        boolean a(C3659j c3659j, long j11) throws IOException;

        void b(int i11, long j11) throws v;

        void c(long j11);
    }

    /* renamed from: v4.b$c */
    /* loaded from: classes8.dex */
    private static final class c implements InterfaceC2222b {

        /* renamed from: a, reason: collision with root package name */
        private final r f102109a;

        /* renamed from: b, reason: collision with root package name */
        private final M f102110b;

        /* renamed from: c, reason: collision with root package name */
        private final C10222c f102111c;

        /* renamed from: d, reason: collision with root package name */
        private final C7272n f102112d;

        /* renamed from: e, reason: collision with root package name */
        private final int f102113e;

        /* renamed from: f, reason: collision with root package name */
        private long f102114f;

        /* renamed from: g, reason: collision with root package name */
        private int f102115g;

        /* renamed from: h, reason: collision with root package name */
        private long f102116h;

        public c(r rVar, M m11, C10222c c10222c, String str, int i11) throws v {
            this.f102109a = rVar;
            this.f102110b = m11;
            this.f102111c = c10222c;
            int i12 = c10222c.f102121e;
            int i13 = c10222c.f102118b;
            int i14 = (i12 * i13) / 8;
            int i15 = c10222c.f102120d;
            if (i15 != i14) {
                throw v.a(null, "Expected block size: " + i14 + "; got: " + i15);
            }
            int i16 = c10222c.f102119c;
            int i17 = i16 * i14;
            int i18 = i17 * 8;
            int max = Math.max(i14, i17 / 10);
            this.f102113e = max;
            C7272n.a aVar = new C7272n.a();
            aVar.W("audio/wav");
            aVar.y0(str);
            aVar.S(i18);
            aVar.t0(i18);
            aVar.o0(max);
            aVar.T(i13);
            aVar.z0(i16);
            aVar.s0(i11);
            this.f102112d = aVar.P();
        }

        @Override // v4.C10221b.InterfaceC2222b
        public final boolean a(C3659j c3659j, long j11) throws IOException {
            int i11;
            int i12;
            long j12 = j11;
            while (j12 > 0 && (i11 = this.f102115g) < (i12 = this.f102113e)) {
                int d11 = this.f102110b.d(c3659j, (int) Math.min(i12 - i11, j12), true);
                if (d11 == -1) {
                    j12 = 0;
                } else {
                    this.f102115g += d11;
                    j12 -= d11;
                }
            }
            C10222c c10222c = this.f102111c;
            int i13 = this.f102115g;
            int i14 = c10222c.f102120d;
            int i15 = i13 / i14;
            if (i15 > 0) {
                long j13 = this.f102114f;
                long j14 = this.f102116h;
                long j15 = c10222c.f102119c;
                int i16 = N.f74289a;
                long Z11 = j13 + N.Z(j14, 1000000L, j15, RoundingMode.DOWN);
                int i17 = i15 * i14;
                int i18 = this.f102115g - i17;
                this.f102110b.b(Z11, 1, i17, i18, null);
                this.f102116h += i15;
                this.f102115g = i18;
            }
            return j12 <= 0;
        }

        @Override // v4.C10221b.InterfaceC2222b
        public final void b(int i11, long j11) {
            this.f102109a.seekMap(new C10224e(this.f102111c, 1, i11, j11));
            this.f102110b.a(this.f102112d);
        }

        @Override // v4.C10221b.InterfaceC2222b
        public final void c(long j11) {
            this.f102114f = j11;
            this.f102115g = 0;
            this.f102116h = 0L;
        }
    }

    @Override // N3.InterfaceC3665p
    public final void a(long j11, long j12) {
        this.f102090c = j11 == 0 ? 0 : 4;
        InterfaceC2222b interfaceC2222b = this.f102092e;
        if (interfaceC2222b != null) {
            interfaceC2222b.c(j12);
        }
    }

    @Override // N3.InterfaceC3665p
    public final void b(r rVar) {
        this.f102088a = rVar;
        this.f102089b = rVar.track(0, 1);
        rVar.endTracks();
    }

    @Override // N3.InterfaceC3665p
    public final boolean d(q qVar) throws IOException {
        return C10223d.a((C3659j) qVar);
    }

    @Override // N3.InterfaceC3665p
    public final int f(q qVar, G g10) throws IOException {
        G10.a.i(this.f102089b);
        int i11 = N.f74289a;
        int i12 = this.f102090c;
        if (i12 == 0) {
            C3659j c3659j = (C3659j) qVar;
            G10.a.h(c3659j.getPosition() == 0);
            int i13 = this.f102093f;
            if (i13 != -1) {
                c3659j.m(i13, false);
                this.f102090c = 4;
                return 0;
            }
            if (!C10223d.a(c3659j)) {
                throw v.a(null, "Unsupported or unrecognized wav file type.");
            }
            c3659j.m((int) (c3659j.f() - c3659j.getPosition()), false);
            this.f102090c = 1;
            return 0;
        }
        if (i12 == 1) {
            this.f102091d = C10223d.c((C3659j) qVar);
            this.f102090c = 2;
            return 0;
        }
        if (i12 == 2) {
            C10222c b11 = C10223d.b((C3659j) qVar);
            int i14 = b11.f102117a;
            if (i14 == 17) {
                this.f102092e = new a(this.f102088a, this.f102089b, b11);
            } else if (i14 == 6) {
                this.f102092e = new c(this.f102088a, this.f102089b, b11, "audio/g711-alaw", -1);
            } else if (i14 == 7) {
                this.f102092e = new c(this.f102088a, this.f102089b, b11, "audio/g711-mlaw", -1);
            } else {
                int a11 = d2.a(i14, b11.f102121e);
                if (a11 == 0) {
                    throw v.e("Unsupported WAV format type: " + i14);
                }
                this.f102092e = new c(this.f102088a, this.f102089b, b11, "audio/raw", a11);
            }
            this.f102090c = 3;
            return 0;
        }
        if (i12 != 3) {
            if (i12 != 4) {
                throw new IllegalStateException();
            }
            G10.a.h(this.f102094g != -1);
            C3659j c3659j2 = (C3659j) qVar;
            long position = this.f102094g - c3659j2.getPosition();
            InterfaceC2222b interfaceC2222b = this.f102092e;
            interfaceC2222b.getClass();
            return interfaceC2222b.a(c3659j2, position) ? -1 : 0;
        }
        C3659j c3659j3 = (C3659j) qVar;
        Pair e11 = C10223d.e(c3659j3);
        this.f102093f = ((Long) e11.first).intValue();
        long longValue = ((Long) e11.second).longValue();
        long j11 = this.f102091d;
        if (j11 != -1 && longValue == 4294967295L) {
            longValue = j11;
        }
        this.f102094g = this.f102093f + longValue;
        long length = c3659j3.getLength();
        if (length != -1 && this.f102094g > length) {
            s.f("WavExtractor", "Data exceeds input length: " + this.f102094g + ", " + length);
            this.f102094g = length;
        }
        InterfaceC2222b interfaceC2222b2 = this.f102092e;
        interfaceC2222b2.getClass();
        interfaceC2222b2.b(this.f102093f, this.f102094g);
        this.f102090c = 4;
        return 0;
    }

    @Override // N3.InterfaceC3665p
    public final void release() {
    }
}
