package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.media3.common.b;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class h3c extends n51 {
    public static final byte[] F0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final MediaCodec.BufferInfo A;
    public boolean A0;
    public final ArrayDeque B;
    public long B0;
    public final und C;
    public vz2 C0;
    public final AtomicInteger D;
    public vz2 D0;
    public b E;
    public vv9 E0;
    public b F;
    public xb5 G;
    public xb5 H;
    public zg6 I;
    public MediaCrypto J;
    public float K;
    public float L;
    public r2c M;
    public b N;
    public MediaFormat O;
    public boolean P;
    public float Q;
    public ArrayDeque R;
    public d3c S;
    public a3c T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public long Y;
    public boolean Z;
    public long a0;
    public int b0;
    public int c0;
    public ByteBuffer d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public int j0;
    public int k0;
    public int l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public long p0;
    public boolean q0;
    public boolean r0;
    public final Context s;
    public boolean s0;
    public final p2c t;
    public boolean t0;
    public final boolean u;
    public tf6 u0;
    public final float v;
    public dm4 v0;
    public final im4 w;
    public f3c w0;
    public final im4 x;
    public long x0;
    public final im4 y;
    public boolean y0;
    public final dt1 z;
    public boolean z0;

    public h3c(Context context, int i, p2c p2cVar, boolean z, float f) {
        super(i);
        this.s = context.getApplicationContext();
        this.t = p2cVar;
        this.u = z;
        this.v = f;
        this.D = new AtomicInteger();
        this.w = new im4(0);
        this.x = new im4(0);
        this.y = new im4(2);
        dt1 dt1Var = new dt1(2);
        dt1Var.p = 32;
        this.z = dt1Var;
        this.A = new MediaCodec.BufferInfo();
        this.K = 1.0f;
        this.L = 1.0f;
        this.B = new ArrayDeque();
        this.w0 = f3c.g;
        dt1Var.C(0);
        dt1Var.i.order(ByteOrder.nativeOrder());
        und undVar = new und(0);
        undVar.d = mo0.a;
        undVar.c = 0;
        undVar.b = 2;
        this.C = undVar;
        this.Q = -1.0f;
        this.j0 = 0;
        this.b0 = -1;
        this.c0 = -1;
        this.a0 = C.TIME_UNSET;
        this.p0 = C.TIME_UNSET;
        this.x0 = C.TIME_UNSET;
        this.Y = C.TIME_UNSET;
        this.k0 = 0;
        this.l0 = 0;
        this.v0 = new dm4(1);
        this.A0 = false;
        this.B0 = 0L;
        int i2 = vv9.c;
        this.E0 = ewf.j;
        vz2 vz2Var = vz2.b;
        this.C0 = vz2Var;
        this.D0 = vz2Var;
    }

    @Override // defpackage.n51
    public final int A(b bVar) {
        try {
            return x0(bVar);
        } catch (m3c e) {
            throw this.d(e, bVar, false, 4002);
        }
    }

    public final void A0(long j) {
        b bVar = (b) this.w0.d.f(j);
        if (bVar == null && this.y0 && this.O != null) {
            bVar = (b) this.w0.d.e();
        }
        if (bVar != null) {
            this.F = bVar;
        } else if (!this.P || (bVar = this.F) == null) {
            return;
        }
        d0(bVar, this.O);
        this.P = false;
        this.y0 = false;
    }

    @Override // defpackage.n51
    public final int B() {
        return 8;
    }

    public final void D(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.C0.a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(str, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(str, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(str, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(str, (ByteBuffer) value);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E(long j, long j2) {
        dt1 dt1Var;
        dt1 dt1Var2;
        int i;
        ByteBuffer byteBuffer;
        z1a.E(!this.r0);
        dt1 dt1Var3 = this.z;
        if (dt1Var3.F()) {
            ByteBuffer byteBuffer2 = dt1Var3.i;
            int i2 = this.c0;
            int i3 = dt1Var3.o;
            long j3 = dt1Var3.k;
            boolean U = U(this.l, dt1Var3.n);
            boolean i4 = dt1Var3.i(4);
            b bVar = this.F;
            bVar.getClass();
            dt1Var = dt1Var3;
            if (!j0(j, j2, null, byteBuffer2, i2, 0, i3, j3, U, i4, bVar)) {
                return false;
            }
            f0(dt1Var.n);
            dt1Var.A();
        } else {
            dt1Var = dt1Var3;
        }
        if (this.q0) {
            this.r0 = true;
            return false;
        }
        boolean z = this.g0;
        im4 im4Var = this.y;
        if (z) {
            z1a.E(dt1Var.E(im4Var));
            this.g0 = false;
        }
        if (this.h0) {
            if (dt1Var.F()) {
                return true;
            }
            this.f0 = false;
            n0();
            this.h0 = false;
            V();
            if (!this.f0) {
                return false;
            }
        }
        z1a.E(!this.q0);
        fp4 fp4Var = this.c;
        fp4Var.j();
        im4Var.A();
        do {
            im4Var.A();
            int v = v(fp4Var, im4Var, 0);
            if (v == -5) {
                c0(fp4Var);
                break;
            }
            if (v != -4) {
                if (v != -3) {
                    zzl.s();
                    return false;
                }
                if (i()) {
                    Q().f = this.p0;
                }
            } else {
                if (im4Var.i(4)) {
                    this.q0 = true;
                    Q().f = this.p0;
                    break;
                }
                this.p0 = Math.max(this.p0, im4Var.k);
                if (i() || this.x.i(536870912)) {
                    Q().f = this.p0;
                }
                byte[] bArr = null;
                if (this.s0) {
                    b bVar2 = this.E;
                    bVar2.getClass();
                    this.F = bVar2;
                    if (Objects.equals(bVar2.o, MimeTypes.AUDIO_OPUS) && !this.F.r.isEmpty()) {
                        byte[] bArr2 = (byte[]) this.F.r.get(0);
                        int i5 = (bArr2[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr2[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
                        qm8 a = this.F.a();
                        a.I = i5;
                        this.F = new b(a);
                    }
                    d0(this.F, null);
                    this.s0 = false;
                }
                im4Var.D();
                b bVar3 = this.F;
                if (bVar3 != null && Objects.equals(bVar3.o, MimeTypes.AUDIO_OPUS)) {
                    if (im4Var.i(268435456)) {
                        im4Var.g = this.F;
                        S(im4Var);
                    }
                    if (this.l - im4Var.k <= 80000) {
                        List list = this.F.r;
                        im4Var.i.getClass();
                        if (im4Var.i.limit() - im4Var.i.position() != 0) {
                            und undVar = this.C;
                            if (undVar.b == 2 && (list.size() == 1 || list.size() == 3)) {
                                bArr = (byte[]) list.get(0);
                            }
                            ByteBuffer byteBuffer3 = im4Var.i;
                            int position = byteBuffer3.position();
                            int limit = byteBuffer3.limit();
                            int i6 = limit - position;
                            int i7 = (i6 + 255) / 255;
                            int i8 = i7 + 27 + i6;
                            if (undVar.b == 2) {
                                i = bArr != null ? bArr.length + 28 : 47;
                                i8 = i + 44 + i8;
                            } else {
                                i = 0;
                            }
                            if (((ByteBuffer) undVar.d).capacity() < i8) {
                                undVar.d = ByteBuffer.allocate(i8).order(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                ((ByteBuffer) undVar.d).clear();
                            }
                            ByteBuffer byteBuffer4 = (ByteBuffer) undVar.d;
                            if (undVar.b == 2) {
                                if (bArr != null) {
                                    und.h(byteBuffer4, 0L, 0, 1, true);
                                    byteBuffer = byteBuffer4;
                                    dt1Var2 = dt1Var;
                                    byteBuffer.put(i9a.t(bArr.length));
                                    byteBuffer.put(bArr);
                                    byteBuffer.putInt(22, nik.p(byteBuffer.arrayOffset(), bArr.length + 28, 0, byteBuffer.array()));
                                    byteBuffer.position(bArr.length + 28);
                                } else {
                                    dt1Var2 = dt1Var;
                                    byteBuffer = byteBuffer4;
                                    byteBuffer.put(und.e);
                                }
                                byteBuffer.put(und.f);
                            } else {
                                dt1Var2 = dt1Var;
                                byteBuffer = byteBuffer4;
                            }
                            int C = undVar.c + ((int) ((kda.C(byteBuffer3.get(0), byteBuffer3.limit() > 1 ? byteBuffer3.get(1) : (byte) 0) * 48000) / 1000000));
                            undVar.c = C;
                            und.h(byteBuffer, C, undVar.b, i7, false);
                            for (int i9 = 0; i9 < i7; i9++) {
                                if (i6 >= 255) {
                                    byteBuffer.put((byte) -1);
                                    i6 -= 255;
                                } else {
                                    byteBuffer.put((byte) i6);
                                    i6 = 0;
                                }
                            }
                            while (position < limit) {
                                byteBuffer.put(byteBuffer3.get(position));
                                position++;
                            }
                            byteBuffer3.position(byteBuffer3.limit());
                            byteBuffer.flip();
                            if (undVar.b == 2) {
                                byteBuffer.putInt(i + 66, nik.p(byteBuffer.arrayOffset() + i + 44, byteBuffer.limit() - byteBuffer.position(), 0, byteBuffer.array()));
                            } else {
                                byteBuffer.putInt(22, nik.p(byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position(), 0, byteBuffer.array()));
                            }
                            undVar.b++;
                            undVar.d = byteBuffer;
                            im4Var.A();
                            im4Var.C(((ByteBuffer) undVar.d).remaining());
                            im4Var.i.put((ByteBuffer) undVar.d);
                            im4Var.D();
                            if (!dt1Var2.F()) {
                                long j4 = this.l;
                                dt1Var = dt1Var2;
                                if (U(j4, dt1Var.n) != U(j4, im4Var.k)) {
                                    break;
                                }
                            } else {
                                dt1Var = dt1Var2;
                            }
                        }
                    }
                }
                dt1Var2 = dt1Var;
                if (!dt1Var2.F()) {
                }
            }
        } while (dt1Var.E(im4Var));
        this.g0 = true;
        if (dt1Var.F()) {
            dt1Var.D();
        }
        return dt1Var.F() || this.q0 || this.h0;
    }

    public abstract lm4 F(a3c a3cVar, b bVar, b bVar2, boolean z);

    public x2c G(IllegalStateException illegalStateException, a3c a3cVar) {
        return new x2c(illegalStateException, a3cVar);
    }

    public final boolean H() {
        if (!this.m0) {
            z0();
            return true;
        }
        this.k0 = 1;
        this.l0 = 2;
        return true;
    }

    public final boolean I(long j, long j2) {
        r2c r2cVar = this.M;
        r2cVar.getClass();
        int i = this.c0;
        MediaCodec.BufferInfo bufferInfo = this.A;
        if (i < 0) {
            int n = r2cVar.n(bufferInfo);
            if (n < 0) {
                if (n != -2) {
                    if (this.X && (this.q0 || this.k0 == 2)) {
                        i0();
                    }
                    long j3 = this.Y;
                    if (j3 != C.TIME_UNSET) {
                        long j4 = j3 + 100;
                        this.g.getClass();
                        if (j4 < System.currentTimeMillis()) {
                            i0();
                            return false;
                        }
                    }
                    return false;
                }
                this.o0 = true;
                r2c r2cVar2 = this.M;
                r2cVar2.getClass();
                MediaFormat e = r2cVar2.e();
                if (Build.VERSION.SDK_INT >= 29 && !this.E0.isEmpty()) {
                    vz2 vz2Var = new vz2(vz2.a(e, this.E0).a);
                    if (!vz2Var.equals(this.D0)) {
                        this.D0 = vz2Var;
                        a0(vz2Var);
                    }
                }
                this.O = e;
                this.P = true;
                return true;
            }
            bufferInfo.presentationTimeUs -= this.B0;
            if (this.W) {
                this.W = false;
                r2cVar.x(n);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                i0();
                return false;
            }
            this.c0 = n;
            ByteBuffer o = r2cVar.o(n);
            this.d0 = o;
            if (o != null) {
                o.position(bufferInfo.offset);
                this.d0.limit(bufferInfo.offset + bufferInfo.size);
            }
            A0(bufferInfo.presentationTimeUs);
        }
        boolean z = this.A0 || bufferInfo.presentationTimeUs < this.l;
        long j5 = this.w0.f;
        boolean z2 = j5 != C.TIME_UNSET && j5 <= bufferInfo.presentationTimeUs;
        this.e0 = z2;
        ByteBuffer byteBuffer = this.d0;
        int i2 = this.c0;
        int i3 = bufferInfo.flags;
        long j6 = bufferInfo.presentationTimeUs;
        b bVar = this.F;
        bVar.getClass();
        if (!j0(j, j2, r2cVar, byteBuffer, i2, i3, 1, j6, z, z2, bVar)) {
            return false;
        }
        f0(bufferInfo.presentationTimeUs);
        boolean z3 = (bufferInfo.flags & 4) != 0;
        if (!z3 && this.n0 && this.e0) {
            this.g.getClass();
            this.Y = System.currentTimeMillis();
        }
        this.c0 = -1;
        this.d0 = null;
        if (!z3) {
            return true;
        }
        i0();
        return false;
    }

    public final boolean J() {
        im4 im4Var = this.x;
        d74 d74Var = im4Var.h;
        r2c r2cVar = this.M;
        if (r2cVar != null && this.k0 != 2 && !this.q0) {
            if (this.b0 < 0) {
                int m = r2cVar.m();
                this.b0 = m;
                if (m >= 0) {
                    im4Var.i = r2cVar.h(m);
                    im4Var.A();
                }
            }
            if (this.k0 == 1) {
                if (!this.X) {
                    this.n0 = true;
                    r2cVar.d(this.b0, 0, 4, 0L);
                    this.b0 = -1;
                    im4Var.i = null;
                }
                this.k0 = 2;
                return false;
            }
            if (this.V) {
                this.V = false;
                ByteBuffer byteBuffer = im4Var.i;
                byteBuffer.getClass();
                byteBuffer.put(F0);
                r2cVar.d(this.b0, 38, 0, 0L);
                this.b0 = -1;
                im4Var.i = null;
                this.m0 = true;
                return true;
            }
            if (this.j0 == 1) {
                int i = 0;
                while (true) {
                    b bVar = this.N;
                    bVar.getClass();
                    if (i >= bVar.r.size()) {
                        break;
                    }
                    byte[] bArr = (byte[]) this.N.r.get(i);
                    ByteBuffer byteBuffer2 = im4Var.i;
                    byteBuffer2.getClass();
                    byteBuffer2.put(bArr);
                    i++;
                }
                this.j0 = 2;
            }
            ByteBuffer byteBuffer3 = im4Var.i;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            fp4 fp4Var = this.c;
            fp4Var.j();
            try {
                r2cVar.z(new yq5(23, this, fp4Var));
                int i2 = this.D.get();
                if (i2 == -3) {
                    if (i()) {
                        Q().f = this.p0;
                        return false;
                    }
                } else {
                    if (i2 == -5) {
                        if (this.j0 == 2) {
                            im4Var.A();
                            this.j0 = 1;
                        }
                        c0(fp4Var);
                        return true;
                    }
                    if (!im4Var.i(4)) {
                        if (this.m0 || im4Var.i(1)) {
                            long j = im4Var.k;
                            if (!s0(im4Var)) {
                                boolean i3 = im4Var.i(1073741824);
                                if (i3 && position != 0) {
                                    int[] iArr = d74Var.d;
                                    if (iArr == null) {
                                        iArr = new int[1];
                                        d74Var.d = iArr;
                                        d74Var.i.numBytesOfClearData = iArr;
                                    }
                                    iArr[0] = iArr[0] + position;
                                }
                                if (this.s0) {
                                    f3c Q = Q();
                                    eij eijVar = Q.d;
                                    b bVar2 = this.E;
                                    bVar2.getClass();
                                    eijVar.a(bVar2, j);
                                    Q.e = true;
                                    this.s0 = false;
                                }
                                this.p0 = Math.max(this.p0, j);
                                if (i() || im4Var.i(536870912)) {
                                    Q().f = this.p0;
                                }
                                im4Var.D();
                                if (im4Var.i(268435456)) {
                                    S(im4Var);
                                }
                                if (this.A0) {
                                    long j2 = this.p0;
                                    if (j <= j2) {
                                        this.B0 = (j2 - j) + 1 + this.B0;
                                    }
                                    this.p0 = j;
                                    this.A0 = false;
                                }
                                h0(im4Var);
                                int M = M(im4Var);
                                long j3 = this.B0 + j;
                                int i4 = this.b0;
                                if (i3) {
                                    r2cVar.f(i4, d74Var, j3, M);
                                } else {
                                    ByteBuffer byteBuffer4 = im4Var.i;
                                    byteBuffer4.getClass();
                                    r2cVar.d(i4, byteBuffer4.limit(), M, j3);
                                }
                                this.b0 = -1;
                                im4Var.i = null;
                                this.m0 = true;
                                this.j0 = 0;
                                this.v0.d++;
                                return true;
                            }
                        } else {
                            im4Var.A();
                            if (this.j0 == 2) {
                                this.j0 = 1;
                                return true;
                            }
                        }
                        return true;
                    }
                    Q().f = this.p0;
                    if (this.j0 == 2) {
                        im4Var.A();
                        this.j0 = 1;
                    }
                    this.q0 = true;
                    if (!this.m0) {
                        i0();
                        return false;
                    }
                    if (!this.X) {
                        this.n0 = true;
                        r2cVar.d(this.b0, 0, 4, 0L);
                        this.b0 = -1;
                        im4Var.i = null;
                        return false;
                    }
                }
            } catch (gm4 e) {
                Y(e);
                k0(0);
                K();
                return true;
            }
        }
        return false;
    }

    public final void K() {
        try {
            r2c r2cVar = this.M;
            r2cVar.getClass();
            r2cVar.flush();
        } finally {
            o0();
        }
    }

    public final List L(boolean z) {
        b bVar = this.E;
        bVar.getClass();
        ArrayList O = O(bVar, z);
        if (!O.isEmpty() || !z) {
            return O;
        }
        ArrayList O2 = O(bVar, false);
        if (!O2.isEmpty()) {
            tgj.d0("Drm session requires secure decoder for " + bVar.o + ", but no secure decoder available. Trying to proceed with " + O2 + ".");
        }
        return O2;
    }

    public int M(im4 im4Var) {
        return 0;
    }

    public abstract float N(float f, b bVar, b[] bVarArr);

    public abstract ArrayList O(b bVar, boolean z);

    public long P(boolean z, long j, long j2) {
        return super.f(j, j2);
    }

    public final f3c Q() {
        ArrayDeque arrayDeque = this.B;
        return !arrayDeque.isEmpty() ? (f3c) arrayDeque.getLast() : this.w0;
    }

    public abstract vng R(a3c a3cVar, b bVar, MediaCrypto mediaCrypto, float f);

    public abstract void S(im4 im4Var);

    public final void T(a3c a3cVar, MediaCrypto mediaCrypto) {
        this.T = a3cVar;
        b bVar = this.E;
        bVar.getClass();
        String str = a3cVar.a;
        float f = this.L;
        b[] bVarArr = this.j;
        bVarArr.getClass();
        float N = N(f, bVar, bVarArr);
        if (N <= this.v) {
            N = -1.0f;
        }
        this.g.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        vng R = R(a3cVar, bVar, mediaCrypto, N);
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            cse cseVar = this.f;
            cseVar.getClass();
            qz.x(R, cseVar);
        }
        try {
            Trace.beginSection("createCodec:" + str);
            r2c d = this.t.d(R);
            this.M = d;
            boolean z = false;
            z = false;
            z = false;
            this.Z = d.q(new e3c(this, z ? 1 : 0));
            Trace.endSection();
            this.g.getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!a3cVar.e(this.s, bVar)) {
                String c = b.c(bVar);
                Locale locale = Locale.US;
                tgj.d0("Format exceeds selected codec's capabilities [" + c + ", " + str + U3.j.e);
            }
            this.Q = N;
            this.N = bVar;
            this.U = i == 29 && "c2.android.aac.decoder".equals(str);
            String str2 = a3cVar.a;
            if ((i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2) || "OMX.bcm.vdec.avc.tunnel".equals(str2) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str2) || "OMX.bcm.vdec.hevc.tunnel".equals(str2) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && a3cVar.f)) {
                z = true;
            }
            this.X = z;
            this.M.getClass();
            if (this.h == 2) {
                this.g.getClass();
                this.a0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.v0.b++;
            long j = elapsedRealtime2 - elapsedRealtime;
            if (i >= 31 && !this.E0.isEmpty()) {
                r2c r2cVar = this.M;
                r2cVar.getClass();
                r2cVar.C(new ArrayList(this.E0));
            }
            Z(str, elapsedRealtime2, j);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean U(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        b bVar = this.F;
        return bVar == null || !Objects.equals(bVar.o, MimeTypes.AUDIO_OPUS) || j - j2 > 80000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        if (r7 != 4) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0084, code lost:
    
        if (r2.getError() != null) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V() {
        b bVar;
        MediaCrypto mediaCrypto;
        if (this.M != null || this.f0 || (bVar = this.E) == null) {
            return;
        }
        String str = bVar.o;
        boolean z = true;
        if (this.H == null && w0(bVar)) {
            this.f0 = false;
            n0();
            boolean equals = MimeTypes.AUDIO_AAC.equals(str);
            dt1 dt1Var = this.z;
            if (equals || MimeTypes.AUDIO_MPEG.equals(str) || MimeTypes.AUDIO_OPUS.equals(str)) {
                dt1Var.p = 32;
            } else {
                dt1Var.p = 1;
            }
            this.f0 = true;
            return;
        }
        q0(this.H);
        if (this.G != null) {
            z1a.E(this.J == null);
            xb5 xb5Var = this.G;
            nr8 c = xb5Var.c();
            if (nr8.c && c != null) {
                int state = xb5Var.getState();
                if (state == 1) {
                    wb5 error = xb5Var.getError();
                    error.getClass();
                    throw d(error, this.E, false, error.a);
                }
            }
            if (c != null) {
                try {
                    this.J = new MediaCrypto(c.a, c.b);
                } catch (MediaCryptoException e) {
                    throw d(e, this.E, false, 6006);
                }
            }
        }
        try {
            xb5 xb5Var2 = this.G;
            if (xb5Var2 != null) {
                if (xb5Var2.getState() != 3) {
                    if (this.G.getState() == 4) {
                    }
                }
                xb5 xb5Var3 = this.G;
                str.getClass();
                if (xb5Var3.f(str)) {
                    W(this.J, z);
                    mediaCrypto = this.J;
                    if (mediaCrypto == null && this.M == null) {
                        mediaCrypto.release();
                        this.J = null;
                        return;
                    }
                }
            }
            z = false;
            W(this.J, z);
            mediaCrypto = this.J;
            if (mediaCrypto == null) {
            }
        } catch (d3c e2) {
            throw d(e2, bVar, false, 4001);
        }
    }

    public final void W(MediaCrypto mediaCrypto, boolean z) {
        b bVar = this.E;
        bVar.getClass();
        if (this.R == null) {
            try {
                List L = L(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.R = arrayDeque;
                if (this.u) {
                    arrayDeque.addAll(L);
                } else {
                    ArrayList arrayList = (ArrayList) L;
                    if (!arrayList.isEmpty()) {
                        this.R.add((a3c) arrayList.get(0));
                    }
                }
                this.S = null;
            } catch (m3c e) {
                throw new d3c(bVar, e, z, -49998);
            }
        }
        if (this.R.isEmpty()) {
            throw new d3c(bVar, null, z, -49999);
        }
        ArrayDeque arrayDeque2 = this.R;
        arrayDeque2.getClass();
        while (this.M == null) {
            a3c a3cVar = (a3c) arrayDeque2.peekFirst();
            a3cVar.getClass();
            if (!X(bVar) || !u0(a3cVar)) {
                return;
            }
            try {
                T(a3cVar, mediaCrypto);
            } catch (Exception e2) {
                tgj.e0("Failed to initialize decoder: " + a3cVar, e2);
                arrayDeque2.removeFirst();
                d3c d3cVar = new d3c("Decoder init failed: " + a3cVar.a + ", " + bVar, e2, bVar.o, z, a3cVar, e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null);
                Y(d3cVar);
                d3c d3cVar2 = this.S;
                if (d3cVar2 == null) {
                    this.S = d3cVar;
                } else {
                    this.S = new d3c(d3cVar2.getMessage(), d3cVar2.getCause(), d3cVar2.a, d3cVar2.b, d3cVar2.c, d3cVar2.d);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.S;
                }
            }
        }
        this.R = null;
    }

    public boolean X(b bVar) {
        return true;
    }

    public abstract void Y(Exception exc);

    public abstract void Z(String str, long j, long j2);

    public abstract void a0(vz2 vz2Var);

    public abstract void b0(String str);

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if (java.util.Objects.equals(r2, com.unity3d.services.core.device.MimeTypes.VIDEO_AV1) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011b, code lost:
    
        if (r4.f(r2) != false) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lm4 c0(fp4 fp4Var) {
        b bVar;
        xb5 xb5Var;
        xb5 xb5Var2;
        int i;
        Pair b;
        String str;
        this.s0 = true;
        b bVar2 = (b) fp4Var.c;
        bVar2.getClass();
        String str2 = bVar2.o;
        if (str2 == null) {
            throw d(new IllegalArgumentException("Sample MIME type is null."), bVar2, false, 4005);
        }
        if (!str2.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_AV1) && !str2.equals(MimeTypes.VIDEO_VP9)) {
            if (str2.equals("video/dolby-vision")) {
                byte[] bArr = wz2.a;
                if (str2.equals("video/dolby-vision") && (b = wz2.b(bVar2)) != null) {
                    int intValue = ((Integer) b.first).intValue();
                    if (intValue == 16 || intValue == 32 || intValue == 256) {
                        str = "video/hevc";
                    } else if (intValue == 512) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                    }
                }
                str = null;
            }
            bVar = bVar2;
            xb5Var = (xb5) fp4Var.b;
            xb5Var2 = this.H;
            if (xb5Var2 != xb5Var) {
                if (xb5Var != null) {
                    xb5Var.e(null);
                }
                if (xb5Var2 != null) {
                    xb5Var2.d(null);
                }
            }
            this.H = xb5Var;
            this.E = bVar;
            if (this.f0) {
                this.h0 = true;
                return null;
            }
            r2c r2cVar = this.M;
            if (r2cVar == null) {
                this.R = null;
                V();
                return null;
            }
            a3c a3cVar = this.T;
            a3cVar.getClass();
            b bVar3 = this.N;
            bVar3.getClass();
            xb5 xb5Var3 = this.G;
            xb5 xb5Var4 = this.H;
            if (xb5Var3 != xb5Var4) {
                if (xb5Var4 != null && xb5Var3 != null && xb5Var4.c() != null && xb5Var3.c() != null && nr8.class.equals(nr8.class) && xb5Var4.a().equals(xb5Var3.a())) {
                    UUID uuid = yc2.e;
                    if (!uuid.equals(xb5Var3.a()) && !uuid.equals(xb5Var4.a())) {
                        if (!a3cVar.f) {
                            if (xb5Var4.getState() != 2) {
                                if (xb5Var4.getState() == 3 || xb5Var4.getState() == 4) {
                                    String str3 = bVar.o;
                                    str3.getClass();
                                }
                            }
                        }
                    }
                }
                if (this.m0) {
                    this.k0 = 1;
                    this.l0 = 3;
                } else {
                    l0();
                    V();
                }
                return new lm4(a3cVar.a, bVar3, bVar, 0, 128);
            }
            boolean z = this.H != this.G;
            lm4 F = F(a3cVar, bVar3, bVar, Q().e);
            int i2 = F.d;
            if (i2 != 0) {
                if (i2 == 1) {
                    if (y0(bVar)) {
                        this.N = bVar;
                        if (z) {
                            H();
                        } else if (this.m0) {
                            this.k0 = 1;
                            this.l0 = 1;
                        }
                    }
                    i = 16;
                } else if (i2 == 2) {
                    if (y0(bVar)) {
                        this.i0 = true;
                        this.j0 = 1;
                        this.V = false;
                        this.N = bVar;
                        if (z) {
                            H();
                        }
                    }
                    i = 16;
                } else {
                    if (i2 != 3) {
                        zzl.s();
                        return null;
                    }
                    if (y0(bVar)) {
                        this.N = bVar;
                        if (z) {
                            H();
                        }
                    }
                    i = 16;
                }
                return (i2 != 0 || (this.M == r2cVar && this.l0 != 3)) ? F : new lm4(a3cVar.a, bVar3, bVar, 0, i);
            }
            if (this.m0) {
                this.k0 = 1;
                this.l0 = 3;
            } else {
                l0();
                V();
            }
            i = 0;
            if (i2 != 0) {
            }
        }
        if (!bVar2.r.isEmpty()) {
            qm8 a = bVar2.a();
            a.q = null;
            bVar = new b(a);
            xb5Var = (xb5) fp4Var.b;
            xb5Var2 = this.H;
            if (xb5Var2 != xb5Var) {
            }
            this.H = xb5Var;
            this.E = bVar;
            if (this.f0) {
            }
        }
        bVar = bVar2;
        xb5Var = (xb5) fp4Var.b;
        xb5Var2 = this.H;
        if (xb5Var2 != xb5Var) {
        }
        this.H = xb5Var;
        this.E = bVar;
        if (this.f0) {
        }
    }

    public abstract void d0(b bVar, MediaFormat mediaFormat);

    @Override // defpackage.n51
    public final long f(long j, long j2) {
        return P(this.Z, j, j2);
    }

    public void f0(long j) {
        this.x0 = j;
        while (true) {
            ArrayDeque arrayDeque = this.B;
            if (arrayDeque.isEmpty() || j < ((f3c) arrayDeque.peek()).a) {
                return;
            }
            f3c f3cVar = (f3c) arrayDeque.poll();
            f3cVar.getClass();
            r0(f3cVar);
            g0();
        }
    }

    public abstract void g0();

    @Override // defpackage.n51, defpackage.jte
    public void handleMessage(int i, Object obj) {
        int i2;
        if (i == 11) {
            zg6 zg6Var = (zg6) obj;
            zg6Var.getClass();
            this.I = zg6Var;
            return;
        }
        if (i != 21) {
            if (i == 22 && (i2 = Build.VERSION.SDK_INT) >= 29) {
                obj.getClass();
                vv9 vv9Var = (vv9) obj;
                if (this.E0.equals(vv9Var)) {
                    return;
                }
                if (i2 >= 31) {
                    HashSet hashSet = new HashSet(vv9Var);
                    HashSet hashSet2 = new HashSet();
                    cck it = this.E0.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!hashSet.remove(str)) {
                            hashSet2.add(str);
                        }
                    }
                    r2c r2cVar = this.M;
                    if (r2cVar != null) {
                        if (!hashSet2.isEmpty()) {
                            r2cVar.D(new ArrayList(hashSet2));
                        }
                        if (!hashSet.isEmpty()) {
                            r2cVar.C(new ArrayList(hashSet));
                        }
                    }
                }
                this.E0 = vv9Var;
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            obj.getClass();
            vz2 vz2Var = (vz2) obj;
            this.C0 = vz2Var;
            r2c r2cVar2 = this.M;
            if (r2cVar2 != null) {
                Bundle bundle = new Bundle();
                for (Map.Entry entry : vz2Var.a.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        if (value instanceof Integer) {
                            bundle.putInt(str2, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            bundle.putLong(str2, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            bundle.putFloat(str2, ((Float) value).floatValue());
                        } else if (value instanceof String) {
                            bundle.putString(str2, (String) value);
                        } else if (value instanceof ByteBuffer) {
                            ByteBuffer byteBuffer = (ByteBuffer) value;
                            byte[] bArr = new byte[byteBuffer.remaining()];
                            byteBuffer.duplicate().get(bArr);
                            bundle.putByteArray(str2, bArr);
                        }
                    }
                }
                r2cVar2.c(bundle);
            }
        }
    }

    public final void i0() {
        int i = this.l0;
        if (i == 1) {
            K();
            return;
        }
        if (i == 2) {
            K();
            z0();
        } else if (i != 3) {
            this.r0 = true;
            m0();
        } else {
            l0();
            V();
        }
    }

    public abstract boolean j0(long j, long j2, r2c r2cVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, b bVar);

    public final boolean k0(int i) {
        fp4 fp4Var = this.c;
        fp4Var.j();
        im4 im4Var = this.w;
        im4Var.A();
        int v = v(fp4Var, im4Var, i | 4);
        if (v == -5) {
            c0(fp4Var);
            return true;
        }
        if (v != -4 || !im4Var.i(4)) {
            return false;
        }
        this.q0 = true;
        i0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l0() {
        try {
            r2c r2cVar = this.M;
            if (r2cVar != null) {
                r2cVar.release();
                this.v0.c++;
                a3c a3cVar = this.T;
                a3cVar.getClass();
                b0(a3cVar.a);
            }
            this.M = null;
            try {
                MediaCrypto mediaCrypto = this.J;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.M = null;
            try {
                MediaCrypto mediaCrypto2 = this.J;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.n51
    public void m() {
        this.E = null;
        r0(f3c.g);
        this.B.clear();
        if (this.f0) {
            this.f0 = false;
            n0();
        } else {
            if (this.M == null) {
                return;
            }
            if (v0()) {
                l0();
            } else if (t0()) {
                K();
            } else {
                this.A0 = true;
            }
        }
    }

    public abstract void m0();

    public final void n0() {
        this.p0 = C.TIME_UNSET;
        Q().f = C.TIME_UNSET;
        this.x0 = C.TIME_UNSET;
        this.h0 = false;
        this.z.A();
        this.y.A();
        this.g0 = false;
        ByteBuffer byteBuffer = mo0.a;
        und undVar = this.C;
        undVar.d = byteBuffer;
        undVar.c = 0;
        undVar.b = 2;
    }

    @Override // defpackage.n51
    public void o(long j, boolean z, boolean z2) {
        ArrayDeque arrayDeque = this.B;
        if (!arrayDeque.isEmpty()) {
            this.w0 = (f3c) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.q0 = false;
            this.r0 = false;
            this.t0 = false;
            if (this.f0) {
                n0();
            } else if (this.M != null) {
                if (v0()) {
                    l0();
                    V();
                } else if (t0()) {
                    K();
                } else {
                    this.A0 = true;
                }
            }
            if (this.w0.d.h() > 0) {
                this.s0 = true;
            }
            this.w0.d.b();
            this.w0.e = false;
        }
    }

    public void o0() {
        this.b0 = -1;
        this.x.i = null;
        this.c0 = -1;
        this.d0 = null;
        this.p0 = C.TIME_UNSET;
        Q().f = C.TIME_UNSET;
        this.x0 = C.TIME_UNSET;
        this.a0 = C.TIME_UNSET;
        this.n0 = false;
        this.Y = C.TIME_UNSET;
        this.m0 = false;
        this.V = false;
        this.W = false;
        this.e0 = false;
        this.k0 = 0;
        this.l0 = 0;
        this.j0 = this.i0 ? 1 : 0;
        this.A0 = false;
        this.B0 = 0L;
    }

    public final void p0() {
        o0();
        this.u0 = null;
        this.R = null;
        this.T = null;
        this.N = null;
        this.O = null;
        this.P = false;
        this.o0 = false;
        this.Q = -1.0f;
        this.U = false;
        this.X = false;
        this.Z = false;
        this.i0 = false;
        this.j0 = 0;
    }

    public final void q0(xb5 xb5Var) {
        xb5 xb5Var2 = this.G;
        if (xb5Var2 != xb5Var) {
            if (xb5Var != null) {
                xb5Var.e(null);
            }
            if (xb5Var2 != null) {
                xb5Var2.d(null);
            }
        }
        this.G = xb5Var;
    }

    public final void r0(f3c f3cVar) {
        this.w0 = f3cVar;
        if (f3cVar.c != C.TIME_UNSET) {
            this.y0 = true;
            e0();
        }
    }

    public boolean s0(im4 im4Var) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // defpackage.n51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t(b[] bVarArr, long j, long j2, scc sccVar) {
        if (this.w0.c == C.TIME_UNSET) {
            r0(new f3c(C.TIME_UNSET, j, j2));
            if (this.z0) {
                g0();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.B;
        if (arrayDeque.isEmpty()) {
            long j3 = this.p0;
            if (j3 != C.TIME_UNSET) {
                long j4 = this.x0;
                if (j4 != C.TIME_UNSET) {
                }
            }
            r0(new f3c(C.TIME_UNSET, j, j2));
            if (this.w0.c != C.TIME_UNSET) {
                g0();
                return;
            }
            return;
        }
        arrayDeque.add(new f3c(this.p0, j, j2));
    }

    public boolean t0() {
        return true;
    }

    public boolean u0(a3c a3cVar) {
        return true;
    }

    public boolean v0() {
        int i = this.l0;
        if (i == 3 || (this.U && !this.o0)) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            z0();
            return false;
        } catch (tf6 e) {
            tgj.e0("Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    @Override // defpackage.n51
    public void w(long j, long j2) {
        boolean z = false;
        if (this.t0) {
            this.t0 = false;
            i0();
        }
        tf6 tf6Var = this.u0;
        if (tf6Var != null) {
            this.u0 = null;
            throw tf6Var;
        }
        try {
            if (this.r0) {
                m0();
                return;
            }
            if (this.E != null || k0(2)) {
                V();
                if (this.f0) {
                    Trace.beginSection("bypassRender");
                    while (E(j, j2)) {
                    }
                    Trace.endSection();
                } else if (this.M != null) {
                    this.g.getClass();
                    SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (I(j, j2)) {
                    }
                    while (J()) {
                    }
                    Trace.endSection();
                } else {
                    dm4 dm4Var = this.v0;
                    int i = dm4Var.e;
                    jpg jpgVar = this.i;
                    jpgVar.getClass();
                    dm4Var.e = i + jpgVar.skipData(j - this.k);
                    k0(1);
                }
                synchronized (this.v0) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw d(e, this.E, false, nik.A(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            boolean z2 = e2 instanceof MediaCodec.CodecException;
            if (!z2) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            Y(e2);
            if (z2 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z = true;
            }
            if (z) {
                l0();
            }
            x2c G = G(e2, this.T);
            throw d(G, this.E, z, G.a == 1101 ? 4006 : 4003);
        }
    }

    public boolean w0(b bVar) {
        return false;
    }

    public abstract int x0(b bVar);

    public final boolean y0(b bVar) {
        if (this.M != null && this.l0 != 3 && this.h != 0) {
            float f = this.L;
            bVar.getClass();
            b[] bVarArr = this.j;
            bVarArr.getClass();
            float N = N(f, bVar, bVarArr);
            float f2 = this.Q;
            if (f2 != N) {
                if (N == -1.0f) {
                    if (this.m0) {
                        this.k0 = 1;
                        this.l0 = 3;
                        return false;
                    }
                    l0();
                    V();
                    return false;
                }
                if (f2 != -1.0f || N > this.v) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", N);
                    r2c r2cVar = this.M;
                    r2cVar.getClass();
                    r2cVar.c(bundle);
                    this.Q = N;
                }
            }
        }
        return true;
    }

    @Override // defpackage.n51
    public void z(float f, float f2) {
        this.K = f;
        this.L = f2;
        y0(this.N);
    }

    public final void z0() {
        xb5 xb5Var = this.H;
        xb5Var.getClass();
        nr8 c = xb5Var.c();
        if (c != null) {
            try {
                MediaCrypto mediaCrypto = this.J;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(c.b);
            } catch (MediaCryptoException e) {
                throw d(e, this.E, false, 6006);
            }
        }
        q0(this.H);
        this.k0 = 0;
        this.l0 = 0;
    }

    public void e0() {
    }

    public void h0(im4 im4Var) {
    }
}
