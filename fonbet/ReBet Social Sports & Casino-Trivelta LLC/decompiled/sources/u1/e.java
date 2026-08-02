package u1;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.q;
import androidx.media3.exoplayer.source.D;
import e1.AbstractC4134a;
import e1.T;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import k1.f;
import m1.O0;
import u1.InterfaceC6485b;

/* loaded from: classes.dex */
public class e extends androidx.media3.exoplayer.c {

    /* renamed from: A, reason: collision with root package name */
    public int f65932A;

    /* renamed from: B, reason: collision with root package name */
    public androidx.media3.common.a f65933B;

    /* renamed from: C, reason: collision with root package name */
    public InterfaceC6485b f65934C;

    /* renamed from: D, reason: collision with root package name */
    public f f65935D;

    /* renamed from: E, reason: collision with root package name */
    public ImageOutput f65936E;

    /* renamed from: F, reason: collision with root package name */
    public Bitmap f65937F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f65938G;

    /* renamed from: H, reason: collision with root package name */
    public b f65939H;

    /* renamed from: I, reason: collision with root package name */
    public b f65940I;

    /* renamed from: J, reason: collision with root package name */
    public int f65941J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f65942K;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC6485b.a f65943r;

    /* renamed from: s, reason: collision with root package name */
    public final f f65944s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayDeque f65945t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f65946u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f65947v;

    /* renamed from: w, reason: collision with root package name */
    public a f65948w;

    /* renamed from: x, reason: collision with root package name */
    public long f65949x;

    /* renamed from: y, reason: collision with root package name */
    public long f65950y;

    /* renamed from: z, reason: collision with root package name */
    public int f65951z;

    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f65952c = new a(-9223372036854775807L, -9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f65953a;

        /* renamed from: b, reason: collision with root package name */
        public final long f65954b;

        public a(long j10, long j11) {
            this.f65953a = j10;
            this.f65954b = j11;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f65955a;

        /* renamed from: b, reason: collision with root package name */
        public final long f65956b;

        /* renamed from: c, reason: collision with root package name */
        public Bitmap f65957c;

        public b(int i10, long j10) {
            this.f65955a = i10;
            this.f65956b = j10;
        }

        public long a() {
            return this.f65956b;
        }

        public Bitmap b() {
            return this.f65957c;
        }

        public int c() {
            return this.f65955a;
        }

        public boolean d() {
            return this.f65957c != null;
        }

        public void e(Bitmap bitmap) {
            this.f65957c = bitmap;
        }
    }

    public e(InterfaceC6485b.a aVar, ImageOutput imageOutput) {
        super(4);
        this.f65943r = aVar;
        this.f65936E = v0(imageOutput);
        this.f65944s = f.s();
        this.f65948w = a.f65952c;
        this.f65945t = new ArrayDeque();
        this.f65950y = -9223372036854775807L;
        this.f65949x = -9223372036854775807L;
        this.f65951z = 0;
        this.f65932A = 1;
    }

    private void B0(long j10) {
        this.f65949x = j10;
        while (!this.f65945t.isEmpty() && j10 >= ((a) this.f65945t.peek()).f65953a) {
            this.f65948w = (a) this.f65945t.removeFirst();
        }
    }

    public static ImageOutput v0(ImageOutput imageOutput) {
        return imageOutput == null ? ImageOutput.f21341a : imageOutput;
    }

    public boolean A0() {
        return true;
    }

    public boolean C0(long j10, long j11, Bitmap bitmap, long j12) {
        long j13 = j12 - j10;
        if (!F0() && j13 >= 30000) {
            return false;
        }
        this.f65936E.onImageAvailable(j12 - this.f65948w.f65954b, bitmap);
        return true;
    }

    public final void D0() {
        this.f65935D = null;
        this.f65951z = 0;
        this.f65950y = -9223372036854775807L;
        InterfaceC6485b interfaceC6485b = this.f65934C;
        if (interfaceC6485b != null) {
            interfaceC6485b.release();
            this.f65934C = null;
        }
    }

    public final void E0(ImageOutput imageOutput) {
        this.f65936E = v0(imageOutput);
    }

    public final boolean F0() {
        boolean z10 = getState() == 2;
        int i10 = this.f65932A;
        if (i10 == 0) {
            return z10;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 3) {
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.q
    public int a(androidx.media3.common.a aVar) {
        return this.f65943r.a(aVar);
    }

    @Override // androidx.media3.exoplayer.p
    public boolean b() {
        return this.f65947v;
    }

    @Override // androidx.media3.exoplayer.p
    public boolean c() {
        int i10 = this.f65932A;
        if (i10 != 3) {
            return i10 == 0 && this.f65938G;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.c
    public void d0() {
        this.f65933B = null;
        this.f65948w = a.f65952c;
        this.f65945t.clear();
        D0();
        this.f65936E.a();
    }

    @Override // androidx.media3.exoplayer.c
    public void e0(boolean z10, boolean z11) {
        this.f65932A = z11 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.c
    public void g0(long j10, boolean z10) {
        x0(1);
        this.f65947v = false;
        this.f65946u = false;
        this.f65937F = null;
        this.f65939H = null;
        this.f65940I = null;
        this.f65938G = false;
        this.f65935D = null;
        InterfaceC6485b interfaceC6485b = this.f65934C;
        if (interfaceC6485b != null) {
            interfaceC6485b.flush();
        }
        this.f65945t.clear();
    }

    @Override // androidx.media3.exoplayer.p, androidx.media3.exoplayer.q
    public String getName() {
        return "ImageRenderer";
    }

    @Override // androidx.media3.exoplayer.p
    public void h(long j10, long j11) {
        if (this.f65947v) {
            return;
        }
        if (this.f65933B == null) {
            O0 V10 = V();
            this.f65944s.f();
            int o02 = o0(V10, this.f65944s, 2);
            if (o02 != -5) {
                if (o02 == -4) {
                    AbstractC4134a.g(this.f65944s.i());
                    this.f65946u = true;
                    this.f65947v = true;
                    return;
                }
                return;
            }
            this.f65933B = (androidx.media3.common.a) AbstractC4134a.i(V10.f56121b);
            this.f65942K = true;
        }
        if (this.f65934C != null || z0()) {
            try {
                T.a("drainAndFeedDecoder");
                while (t0(j10, j11)) {
                }
                while (u0(j10)) {
                }
                T.b();
            } catch (C6486c e10) {
                throw R(e10, null, 4003);
            }
        }
    }

    @Override // androidx.media3.exoplayer.c
    public void h0() {
        D0();
    }

    @Override // androidx.media3.exoplayer.c
    public void j0() {
        D0();
        x0(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // androidx.media3.exoplayer.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m0(androidx.media3.common.a[] aVarArr, long j10, long j11, D.b bVar) {
        super.m0(aVarArr, j10, j11, bVar);
        if (this.f65948w.f65954b != -9223372036854775807L) {
            if (this.f65945t.isEmpty()) {
                long j12 = this.f65950y;
                if (j12 != -9223372036854775807L) {
                    long j13 = this.f65949x;
                    if (j13 != -9223372036854775807L) {
                    }
                }
            }
            this.f65945t.add(new a(this.f65950y, j11));
            return;
        }
        this.f65948w = new a(-9223372036854775807L, j11);
    }

    public final boolean r0(androidx.media3.common.a aVar) {
        int a10 = this.f65943r.a(aVar);
        return a10 == q.r(4) || a10 == q.r(3);
    }

    public final Bitmap s0(int i10) {
        AbstractC4134a.i(this.f65937F);
        int width = this.f65937F.getWidth() / ((androidx.media3.common.a) AbstractC4134a.i(this.f65933B)).f20525M;
        int height = this.f65937F.getHeight() / ((androidx.media3.common.a) AbstractC4134a.i(this.f65933B)).f20526N;
        int i11 = this.f65933B.f20525M;
        return Bitmap.createBitmap(this.f65937F, (i10 % i11) * width, (i10 / i11) * height, width, height);
    }

    @Override // androidx.media3.exoplayer.c, androidx.media3.exoplayer.o.b
    public void t(int i10, Object obj) {
        if (i10 != 15) {
            super.t(i10, obj);
        } else {
            E0(obj instanceof ImageOutput ? (ImageOutput) obj : null);
        }
    }

    public final boolean t0(long j10, long j11) {
        if (this.f65937F != null && this.f65939H == null) {
            return false;
        }
        if (this.f65932A == 0 && getState() != 2) {
            return false;
        }
        if (this.f65937F == null) {
            AbstractC4134a.i(this.f65934C);
            d a10 = this.f65934C.a();
            if (a10 == null) {
                return false;
            }
            if (((d) AbstractC4134a.i(a10)).i()) {
                if (this.f65951z == 3) {
                    D0();
                    AbstractC4134a.i(this.f65933B);
                    z0();
                } else {
                    ((d) AbstractC4134a.i(a10)).o();
                    if (this.f65945t.isEmpty()) {
                        this.f65947v = true;
                    }
                }
                return false;
            }
            AbstractC4134a.j(a10.f65931e, "Non-EOS buffer came back from the decoder without bitmap.");
            this.f65937F = a10.f65931e;
            ((d) AbstractC4134a.i(a10)).o();
        }
        if (!this.f65938G || this.f65937F == null || this.f65939H == null) {
            return false;
        }
        AbstractC4134a.i(this.f65933B);
        androidx.media3.common.a aVar = this.f65933B;
        int i10 = aVar.f20525M;
        boolean z10 = ((i10 == 1 && aVar.f20526N == 1) || i10 == -1 || aVar.f20526N == -1) ? false : true;
        if (!this.f65939H.d()) {
            b bVar = this.f65939H;
            bVar.e(z10 ? s0(bVar.c()) : (Bitmap) AbstractC4134a.i(this.f65937F));
        }
        if (!C0(j10, j11, (Bitmap) AbstractC4134a.i(this.f65939H.b()), this.f65939H.a())) {
            return false;
        }
        B0(((b) AbstractC4134a.i(this.f65939H)).a());
        this.f65932A = 3;
        if (!z10 || ((b) AbstractC4134a.i(this.f65939H)).c() == (((androidx.media3.common.a) AbstractC4134a.i(this.f65933B)).f20526N * ((androidx.media3.common.a) AbstractC4134a.i(this.f65933B)).f20525M) - 1) {
            this.f65937F = null;
        }
        this.f65939H = this.f65940I;
        this.f65940I = null;
        return true;
    }

    public final boolean u0(long j10) {
        if (this.f65938G && this.f65939H != null) {
            return false;
        }
        O0 V10 = V();
        InterfaceC6485b interfaceC6485b = this.f65934C;
        if (interfaceC6485b == null || this.f65951z == 3 || this.f65946u) {
            return false;
        }
        if (this.f65935D == null) {
            f fVar = (f) interfaceC6485b.f();
            this.f65935D = fVar;
            if (fVar == null) {
                return false;
            }
        }
        if (this.f65951z == 2) {
            AbstractC4134a.i(this.f65935D);
            this.f65935D.n(4);
            ((InterfaceC6485b) AbstractC4134a.i(this.f65934C)).c(this.f65935D);
            this.f65935D = null;
            this.f65951z = 3;
            return false;
        }
        int o02 = o0(V10, this.f65935D, 0);
        if (o02 == -5) {
            this.f65933B = (androidx.media3.common.a) AbstractC4134a.i(V10.f56121b);
            this.f65942K = true;
            this.f65951z = 2;
            return true;
        }
        if (o02 != -4) {
            if (o02 == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.f65935D.q();
        ByteBuffer byteBuffer = this.f65935D.f54108d;
        boolean z10 = (byteBuffer != null && byteBuffer.remaining() > 0) || ((f) AbstractC4134a.i(this.f65935D)).i();
        if (z10) {
            ((f) AbstractC4134a.i(this.f65935D)).f54106b = this.f65933B;
            ((InterfaceC6485b) AbstractC4134a.i(this.f65934C)).c((f) AbstractC4134a.i(this.f65935D));
            this.f65941J = 0;
        }
        y0(j10, (f) AbstractC4134a.i(this.f65935D));
        if (((f) AbstractC4134a.i(this.f65935D)).i()) {
            this.f65946u = true;
            this.f65935D = null;
            return false;
        }
        this.f65950y = Math.max(this.f65950y, ((f) AbstractC4134a.i(this.f65935D)).f54110f);
        if (z10) {
            this.f65935D = null;
        } else {
            ((f) AbstractC4134a.i(this.f65935D)).f();
        }
        return !this.f65938G;
    }

    public final boolean w0(b bVar) {
        return ((androidx.media3.common.a) AbstractC4134a.i(this.f65933B)).f20525M == -1 || this.f65933B.f20526N == -1 || bVar.c() == (((androidx.media3.common.a) AbstractC4134a.i(this.f65933B)).f20526N * this.f65933B.f20525M) - 1;
    }

    public final void x0(int i10) {
        this.f65932A = Math.min(this.f65932A, i10);
    }

    public final void y0(long j10, f fVar) {
        boolean z10 = true;
        if (fVar.i()) {
            this.f65938G = true;
            return;
        }
        b bVar = new b(this.f65941J, fVar.f54110f);
        this.f65940I = bVar;
        this.f65941J++;
        if (!this.f65938G) {
            long a10 = bVar.a();
            boolean z11 = a10 - 30000 <= j10 && j10 <= 30000 + a10;
            b bVar2 = this.f65939H;
            boolean z12 = bVar2 != null && bVar2.a() <= j10 && j10 < a10;
            boolean w02 = w0((b) AbstractC4134a.i(this.f65940I));
            if (!z11 && !z12 && !w02) {
                z10 = false;
            }
            this.f65938G = z10;
            if (z12 && !z11) {
                return;
            }
        }
        this.f65939H = this.f65940I;
        this.f65940I = null;
    }

    public final boolean z0() {
        if (!A0()) {
            return false;
        }
        if (!this.f65942K) {
            return true;
        }
        if (!r0((androidx.media3.common.a) AbstractC4134a.e(this.f65933B))) {
            throw R(new C6486c("Provided decoder factory can't create decoder for format."), this.f65933B, 4005);
        }
        InterfaceC6485b interfaceC6485b = this.f65934C;
        if (interfaceC6485b != null) {
            interfaceC6485b.release();
        }
        this.f65934C = this.f65943r.b();
        this.f65942K = false;
        return true;
    }
}
