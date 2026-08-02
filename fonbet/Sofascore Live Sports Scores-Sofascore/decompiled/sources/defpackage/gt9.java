package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.common.b;
import androidx.media3.exoplayer.image.ImageOutput;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gt9 extends n51 {
    public int A;
    public int B;
    public b C;
    public xw1 D;
    public im4 E;
    public ImageOutput F;
    public xg6 G;
    public Bitmap H;
    public boolean I;
    public bm2 J;
    public bm2 K;
    public int L;
    public boolean M;
    public final u00 s;
    public final im4 t;
    public final ArrayDeque u;
    public boolean v;
    public boolean w;
    public ft9 x;
    public long y;
    public long z;

    public gt9(u00 u00Var) {
        super(4);
        this.s = u00Var;
        this.F = ImageOutput.a;
        this.t = new im4(0);
        this.x = ft9.c;
        this.u = new ArrayDeque();
        this.z = C.TIME_UNSET;
        this.y = C.TIME_UNSET;
        this.A = 0;
        this.B = 1;
    }

    @Override // defpackage.n51
    public final int A(b bVar) {
        return u00.b(bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x015b, code lost:
    
        if (r14 == ((r0 * r1.N) - 1)) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(long j) {
        Bitmap bitmap;
        Bitmap bitmap2 = this.H;
        if ((bitmap2 == null || this.J != null) && (this.B != 0 || this.h == 2)) {
            ArrayDeque arrayDeque = this.u;
            if (bitmap2 == null) {
                this.D.getClass();
                ww1 ww1Var = (ww1) this.D.dequeueOutputBuffer();
                if (ww1Var != null) {
                    if (!ww1Var.i(4)) {
                        z1a.y(ww1Var.i, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.H = ww1Var.i;
                        ww1Var.B();
                    } else {
                        if (this.A == 3) {
                            G();
                            this.C.getClass();
                            F();
                            return false;
                        }
                        ww1Var.B();
                        if (arrayDeque.isEmpty()) {
                            this.w = true;
                            return false;
                        }
                    }
                }
            }
            if (this.I && this.H != null && this.J != null) {
                this.C.getClass();
                b bVar = this.C;
                int i = bVar.N;
                int i2 = bVar.O;
                boolean z = ((i == 1 && i2 == 1) || i == -1 || i2 == -1) ? false : true;
                bm2 bm2Var = this.J;
                if (((Bitmap) bm2Var.d) == null) {
                    if (z) {
                        int i3 = bm2Var.c;
                        this.H.getClass();
                        int width = this.H.getWidth();
                        b bVar2 = this.C;
                        bVar2.getClass();
                        int i4 = width / bVar2.N;
                        int height = this.H.getHeight();
                        b bVar3 = this.C;
                        bVar3.getClass();
                        int i5 = height / bVar3.O;
                        int i6 = this.C.N;
                        bitmap = Bitmap.createBitmap(this.H, (i3 % i6) * i4, (i3 / i6) * i5, i4, i5);
                    } else {
                        bitmap = this.H;
                        bitmap.getClass();
                    }
                    bm2Var.d = bitmap;
                }
                Bitmap bitmap3 = (Bitmap) this.J.d;
                bitmap3.getClass();
                long j2 = this.J.b;
                long j3 = j2 - j;
                boolean z2 = this.h == 2;
                int i7 = this.B;
                if (i7 != 0) {
                    if (i7 == 1) {
                        z2 = true;
                    } else {
                        if (i7 != 3) {
                            zzl.s();
                            return false;
                        }
                        z2 = false;
                    }
                }
                if (z2 || j3 < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                    xg6 xg6Var = this.G;
                    if (xg6Var != null) {
                        long j4 = this.x.b;
                        this.C.getClass();
                        ih6 ih6Var = xg6Var.a;
                        if (ih6Var.D) {
                            ih6Var.h.a(37).b();
                        }
                    }
                    this.F.onImageAvailable(j2 - this.x.b, bitmap3);
                    bm2 bm2Var2 = this.J;
                    bm2Var2.getClass();
                    long j5 = bm2Var2.b;
                    this.y = j5;
                    while (!arrayDeque.isEmpty() && j5 >= ((ft9) arrayDeque.peek()).a) {
                        this.x = (ft9) arrayDeque.removeFirst();
                    }
                    this.B = 3;
                    if (z) {
                        bm2 bm2Var3 = this.J;
                        bm2Var3.getClass();
                        int i8 = bm2Var3.c;
                        b bVar4 = this.C;
                        bVar4.getClass();
                        int i9 = bVar4.O;
                        b bVar5 = this.C;
                        bVar5.getClass();
                    }
                    this.H = null;
                    this.J = this.K;
                    this.K = null;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r3 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0101, code lost:
    
        if (r2 == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E(long j) {
        boolean z;
        im4 im4Var;
        b bVar;
        int i;
        im4 im4Var2;
        if (!this.I || this.J == null) {
            fp4 fp4Var = this.c;
            fp4Var.j();
            xw1 xw1Var = this.D;
            if (xw1Var != null && this.A != 3 && !this.v) {
                im4 im4Var3 = this.E;
                if (im4Var3 == null) {
                    im4Var3 = (im4) xw1Var.dequeueInputBuffer();
                    this.E = im4Var3;
                }
                im4 im4Var4 = im4Var3;
                if (this.A == 2) {
                    im4Var4.b = 4;
                    xw1 xw1Var2 = this.D;
                    xw1Var2.getClass();
                    xw1Var2.a(this.E);
                    this.E = null;
                    this.A = 3;
                    return false;
                }
                int v = v(fp4Var, im4Var3, 0);
                if (v == -5) {
                    b bVar2 = (b) fp4Var.c;
                    bVar2.getClass();
                    this.C = bVar2;
                    this.M = true;
                    this.A = 2;
                    return true;
                }
                if (v == -4) {
                    this.E.D();
                    ByteBuffer byteBuffer = this.E.i;
                    if (byteBuffer == null || byteBuffer.remaining() <= 0) {
                        im4 im4Var5 = this.E;
                        im4Var5.getClass();
                        if (!im4Var5.i(4)) {
                            z = false;
                            if (z) {
                                im4 im4Var6 = this.E;
                                im4Var6.getClass();
                                im4Var6.g = this.C;
                                xw1 xw1Var3 = this.D;
                                xw1Var3.getClass();
                                im4 im4Var7 = this.E;
                                im4Var7.getClass();
                                xw1Var3.a(im4Var7);
                                this.L = 0;
                            }
                            im4Var = this.E;
                            im4Var.getClass();
                            if (im4Var.i(4)) {
                                int i2 = this.L;
                                long j2 = im4Var.k;
                                this.K = new bm2(i2, j2);
                                this.L = i2 + 1;
                                if (!this.I) {
                                    boolean z2 = j2 - CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL <= j && j <= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL + j2;
                                    bm2 bm2Var = this.J;
                                    boolean z3 = bm2Var != null && bm2Var.b <= j && j < j2;
                                    b bVar3 = this.C;
                                    bVar3.getClass();
                                    this.I = z2 || z3 || (bVar3.N == -1 || (i = (bVar = this.C).O) == -1 || i2 == (i * bVar.N) - 1);
                                    if (z3) {
                                    }
                                }
                                this.J = this.K;
                                this.K = null;
                            } else {
                                this.I = true;
                            }
                            im4Var2 = this.E;
                            im4Var2.getClass();
                            if (!im4Var2.i(4)) {
                                this.v = true;
                                this.E = null;
                                return false;
                            }
                            long j3 = this.z;
                            im4 im4Var8 = this.E;
                            im4Var8.getClass();
                            this.z = Math.max(j3, im4Var8.k);
                            if (z) {
                                this.E = null;
                            } else {
                                im4 im4Var9 = this.E;
                                im4Var9.getClass();
                                im4Var9.A();
                            }
                            return !this.I;
                        }
                    }
                    z = true;
                    if (z) {
                    }
                    im4Var = this.E;
                    im4Var.getClass();
                    if (im4Var.i(4)) {
                    }
                    im4Var2 = this.E;
                    im4Var2.getClass();
                    if (!im4Var2.i(4)) {
                    }
                } else if (v != -3) {
                    zzl.s();
                    return false;
                }
            }
        }
        return false;
    }

    public final void F() {
        if (this.M) {
            b bVar = this.C;
            bVar.getClass();
            int b = u00.b(bVar);
            if (b != n51.a(4, 0, 0, 0) && b != n51.a(3, 0, 0, 0)) {
                throw d(new ur9("Provided decoder factory can't create decoder for format."), this.C, false, 4005);
            }
            xw1 xw1Var = this.D;
            if (xw1Var != null) {
                xw1Var.release();
            }
            this.D = new xw1(this.s.a);
            this.M = false;
        }
    }

    public final void G() {
        this.E = null;
        this.A = 0;
        this.z = C.TIME_UNSET;
        xw1 xw1Var = this.D;
        if (xw1Var != null) {
            xw1Var.release();
            this.D = null;
        }
    }

    @Override // defpackage.n51
    public final String h() {
        return "ImageRenderer";
    }

    @Override // defpackage.n51, defpackage.jte
    public final void handleMessage(int i, Object obj) {
        if (i != 15) {
            if (i != 23) {
                return;
            }
            this.G = (xg6) obj;
        } else {
            ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
            if (imageOutput == null) {
                imageOutput = ImageOutput.a;
            }
            this.F = imageOutput;
        }
    }

    @Override // defpackage.n51
    public final boolean j() {
        return this.w;
    }

    @Override // defpackage.n51
    public final boolean l() {
        int i = this.B;
        if (i != 3) {
            return i == 0 && this.I;
        }
        return true;
    }

    @Override // defpackage.n51
    public final void m() {
        this.C = null;
        this.x = ft9.c;
        this.u.clear();
        G();
        this.F.a();
    }

    @Override // defpackage.n51
    public final void n(boolean z, boolean z2) {
        this.B = z2 ? 1 : 0;
    }

    @Override // defpackage.n51
    public final void o(long j, boolean z, boolean z2) {
        this.B = Math.min(this.B, 1);
        this.w = false;
        this.v = false;
        this.H = null;
        this.J = null;
        this.K = null;
        this.I = false;
        this.E = null;
        xw1 xw1Var = this.D;
        if (xw1Var != null) {
            xw1Var.flush();
        }
        this.u.clear();
    }

    @Override // defpackage.n51
    public final void p() {
        G();
    }

    @Override // defpackage.n51
    public final void q() {
        G();
        this.B = Math.min(this.B, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // defpackage.n51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(b[] bVarArr, long j, long j2, scc sccVar) {
        if (this.x.b != C.TIME_UNSET) {
            ArrayDeque arrayDeque = this.u;
            if (arrayDeque.isEmpty()) {
                long j3 = this.z;
                if (j3 != C.TIME_UNSET) {
                    long j4 = this.y;
                    if (j4 != C.TIME_UNSET) {
                    }
                }
            }
            arrayDeque.add(new ft9(this.z, j2));
            return;
        }
        this.x = new ft9(C.TIME_UNSET, j2);
    }

    @Override // defpackage.n51
    public final void w(long j, long j2) {
        if (this.w) {
            return;
        }
        if (this.C == null) {
            fp4 fp4Var = this.c;
            fp4Var.j();
            im4 im4Var = this.t;
            im4Var.A();
            int v = v(fp4Var, im4Var, 2);
            if (v != -5) {
                if (v == -4) {
                    z1a.E(im4Var.i(4));
                    this.v = true;
                    this.w = true;
                    return;
                }
                return;
            }
            b bVar = (b) fp4Var.c;
            bVar.getClass();
            this.C = bVar;
            this.M = true;
        }
        if (this.D == null) {
            F();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (D(j)) {
            }
            while (E(j)) {
            }
            Trace.endSection();
        } catch (ur9 e) {
            throw d(e, null, false, 4003);
        }
    }
}
