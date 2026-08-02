package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.appsflyer.sdk_base.referrer.Payload;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class g3c extends m51 {
    public static final byte[] D0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public sm8 A;
    public long A0;
    public hpo B;
    public long B0;
    public hpo C;
    public int C0;
    public MediaCrypto D;
    public boolean E;
    public final long F;
    public float G;
    public float H;
    public q2c I;
    public sm8 J;
    public MediaFormat K;
    public boolean L;
    public float M;
    public ArrayDeque N;
    public c3c O;
    public z2c P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public qc2 b0;
    public long c0;
    public int d0;
    public int e0;
    public ByteBuffer f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public final o2c m;
    public int m0;
    public final hc5 n;
    public int n0;
    public final float o;
    public int o0;
    public final hm4 p;
    public boolean p0;
    public final hm4 q;
    public boolean q0;
    public final hm4 r;
    public boolean r0;
    public final ct1 s;
    public long s0;
    public final eij t;
    public long t0;
    public final ArrayList u;
    public boolean u0;
    public final MediaCodec.BufferInfo v;
    public boolean v0;
    public final long[] w;
    public boolean w0;
    public final long[] x;
    public boolean x0;
    public final long[] y;
    public sf6 y0;
    public sm8 z;
    public dm4 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3c(int i, o2c o2cVar, float f) {
        super(i);
        hc5 hc5Var = hc5.d;
        this.m = o2cVar;
        this.n = hc5Var;
        this.o = f;
        this.p = new hm4(0);
        this.q = new hm4(0);
        this.r = new hm4(2);
        ct1 ct1Var = new ct1(2);
        ct1Var.o = 32;
        this.s = ct1Var;
        this.t = new eij(0);
        this.u = new ArrayList();
        this.v = new MediaCodec.BufferInfo();
        this.G = 1.0f;
        this.H = 1.0f;
        this.F = C.TIME_UNSET;
        this.w = new long[10];
        this.x = new long[10];
        this.y = new long[10];
        this.A0 = C.TIME_UNSET;
        e0(C.TIME_UNSET);
        ct1Var.C(0);
        ct1Var.h.order(ByteOrder.nativeOrder());
        this.M = -1.0f;
        this.Q = 0;
        this.m0 = 0;
        this.d0 = -1;
        this.e0 = -1;
        this.c0 = C.TIME_UNSET;
        this.s0 = C.TIME_UNSET;
        this.t0 = C.TIME_UNSET;
        this.n0 = 0;
        this.o0 = 0;
    }

    public final boolean A() {
        if (!this.p0) {
            j0();
            return true;
        }
        this.n0 = 1;
        if (this.S || this.U) {
            this.o0 = 3;
            return false;
        }
        this.o0 = 2;
        return true;
    }

    public final boolean B(long j, long j2) {
        boolean z;
        boolean z2;
        MediaCodec.BufferInfo bufferInfo;
        boolean X;
        int n;
        boolean z3;
        int i = this.e0;
        MediaCodec.BufferInfo bufferInfo2 = this.v;
        if (i < 0) {
            if (this.V && this.q0) {
                try {
                    n = this.I.n(bufferInfo2);
                } catch (IllegalStateException unused) {
                    W();
                    if (this.v0) {
                        Z();
                    }
                }
            } else {
                n = this.I.n(bufferInfo2);
            }
            if (n < 0) {
                if (n != -2) {
                    if (this.a0 && (this.u0 || this.n0 == 2)) {
                        W();
                        return false;
                    }
                    return false;
                }
                this.r0 = true;
                MediaFormat e = this.I.e();
                if (this.Q != 0 && e.getInteger("width") == 32 && e.getInteger("height") == 32) {
                    this.Z = true;
                    return true;
                }
                if (this.X) {
                    e.setInteger("channel-count", 1);
                }
                this.K = e;
                this.L = true;
                return true;
            }
            if (this.Z) {
                this.Z = false;
                this.I.C(n, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                W();
                return false;
            }
            this.e0 = n;
            ByteBuffer o = this.I.o(n);
            this.f0 = o;
            if (o != null) {
                o.position(bufferInfo2.offset);
                this.f0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.W && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j3 = this.s0;
                if (j3 != C.TIME_UNSET) {
                    bufferInfo2.presentationTimeUs = j3;
                }
            }
            long j4 = bufferInfo2.presentationTimeUs;
            ArrayList arrayList = this.u;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z3 = false;
                    break;
                }
                if (((Long) arrayList.get(i2)).longValue() == j4) {
                    arrayList.remove(i2);
                    z3 = true;
                    break;
                }
                i2++;
            }
            this.g0 = z3;
            long j5 = this.t0;
            long j6 = bufferInfo2.presentationTimeUs;
            this.h0 = j5 == j6;
            k0(j6);
        }
        if (this.V && this.q0) {
            try {
                z = false;
                z2 = true;
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused2) {
                z = false;
            }
            try {
                X = X(j, j2, this.I, this.f0, this.e0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.g0, this.h0, this.A);
            } catch (IllegalStateException unused3) {
                W();
                if (!this.v0) {
                    return z;
                }
                Z();
                return z;
            }
        } else {
            z = false;
            z2 = true;
            bufferInfo = bufferInfo2;
            X = X(j, j2, this.I, this.f0, this.e0, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.g0, this.h0, this.A);
        }
        if (!X) {
            return z;
        }
        T(bufferInfo.presentationTimeUs);
        boolean z4 = (bufferInfo.flags & 4) != 0 ? z2 : z;
        this.e0 = -1;
        this.f0 = null;
        if (!z4) {
            return z2;
        }
        W();
        return z;
    }

    public final boolean C() {
        boolean z;
        q2c q2cVar = this.I;
        if (q2cVar != null && this.n0 != 2 && !this.u0) {
            int i = this.d0;
            hm4 hm4Var = this.q;
            if (i < 0) {
                int m = q2cVar.m();
                this.d0 = m;
                if (m >= 0) {
                    hm4Var.h = this.I.h(m);
                    hm4Var.A();
                }
            }
            if (this.n0 == 1) {
                if (!this.a0) {
                    this.q0 = true;
                    this.I.d(this.d0, 0, 4, 0L);
                    this.d0 = -1;
                    hm4Var.h = null;
                }
                this.n0 = 2;
                return false;
            }
            if (this.Y) {
                this.Y = false;
                hm4Var.h.put(D0);
                this.I.d(this.d0, 38, 0, 0L);
                this.d0 = -1;
                hm4Var.h = null;
                this.p0 = true;
                return true;
            }
            if (this.m0 == 1) {
                for (int i2 = 0; i2 < this.J.n.size(); i2++) {
                    hm4Var.h.put((byte[]) this.J.n.get(i2));
                }
                this.m0 = 2;
            }
            ByteBuffer byteBuffer = hm4Var.h;
            d74 d74Var = hm4Var.g;
            int position = byteBuffer.position();
            fp4 fp4Var = this.b;
            fp4Var.j();
            try {
                int p = p(fp4Var, hm4Var, 0);
                if (f()) {
                    this.t0 = this.s0;
                }
                if (p != -3) {
                    if (p == -5) {
                        if (this.m0 == 2) {
                            hm4Var.A();
                            this.m0 = 1;
                        }
                        Q(fp4Var);
                        return true;
                    }
                    if (!hm4Var.i(4)) {
                        if (this.p0 || hm4Var.i(1)) {
                            boolean i3 = hm4Var.i(1073741824);
                            if (i3 && position != 0) {
                                int[] iArr = d74Var.d;
                                if (iArr == null) {
                                    iArr = new int[1];
                                    d74Var.d = iArr;
                                    d74Var.i.numBytesOfClearData = iArr;
                                }
                                iArr[0] = iArr[0] + position;
                            }
                            if (this.R && !i3) {
                                ByteBuffer byteBuffer2 = hm4Var.h;
                                int position2 = byteBuffer2.position();
                                int i4 = 0;
                                int i5 = 0;
                                while (true) {
                                    int i6 = i4 + 1;
                                    if (i6 >= position2) {
                                        byteBuffer2.clear();
                                        break;
                                    }
                                    int i7 = byteBuffer2.get(i4) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    if (i5 == 3) {
                                        if (i7 == 1 && (byteBuffer2.get(i6) & 31) == 7) {
                                            ByteBuffer duplicate = byteBuffer2.duplicate();
                                            duplicate.position(i4 - 3);
                                            duplicate.limit(position2);
                                            byteBuffer2.position(0);
                                            byteBuffer2.put(duplicate);
                                            break;
                                        }
                                    } else if (i7 == 0) {
                                        i5++;
                                    }
                                    if (i7 != 0) {
                                        i5 = 0;
                                    }
                                    i4 = i6;
                                }
                                if (hm4Var.h.position() != 0) {
                                    this.R = false;
                                }
                            }
                            long j = hm4Var.j;
                            qc2 qc2Var = this.b0;
                            if (qc2Var != null) {
                                sm8 sm8Var = this.z;
                                if (qc2Var.b == 0) {
                                    qc2Var.a = j;
                                }
                                if (!qc2Var.c) {
                                    ByteBuffer byteBuffer3 = hm4Var.h;
                                    byteBuffer3.getClass();
                                    int i8 = 0;
                                    for (int i9 = 0; i9 < 4; i9++) {
                                        i8 = (i8 << 8) | (byteBuffer3.get(i9) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                    }
                                    int G = yso.G(i8);
                                    if (G == -1) {
                                        qc2Var.c = true;
                                        qc2Var.b = 0L;
                                        qc2Var.a = hm4Var.j;
                                        m6k.f0();
                                        j = hm4Var.j;
                                    } else {
                                        j = Math.max(0L, ((qc2Var.b - 529) * 1000000) / sm8Var.z) + qc2Var.a;
                                        qc2Var.b += G;
                                    }
                                }
                                long j2 = this.s0;
                                qc2 qc2Var2 = this.b0;
                                sm8 sm8Var2 = this.z;
                                qc2Var2.getClass();
                                long j3 = sm8Var2.z;
                                z = i3;
                                this.s0 = Math.max(j2, Math.max(0L, ((qc2Var2.b - 529) * 1000000) / j3) + qc2Var2.a);
                            } else {
                                z = i3;
                            }
                            if (hm4Var.i(Integer.MIN_VALUE)) {
                                this.u.add(Long.valueOf(j));
                            }
                            if (this.w0) {
                                this.t.a(this.z, j);
                                this.w0 = false;
                            }
                            this.s0 = Math.max(this.s0, j);
                            hm4Var.D();
                            if (hm4Var.i(268435456)) {
                                J(hm4Var);
                            }
                            V(hm4Var);
                            q2c q2cVar2 = this.I;
                            int i10 = this.d0;
                            try {
                                if (z) {
                                    q2cVar2.D(i10, d74Var, j);
                                } else {
                                    q2cVar2.d(i10, hm4Var.h.limit(), 0, j);
                                }
                                this.d0 = -1;
                                hm4Var.h = null;
                                this.p0 = true;
                                this.m0 = 0;
                                this.z0.d++;
                                return true;
                            } catch (MediaCodec.CryptoException e) {
                                throw c(e, this.z, false, lik.l(e.getErrorCode()));
                            }
                        }
                        hm4Var.A();
                        if (this.m0 == 2) {
                            this.m0 = 1;
                            return true;
                        }
                        return true;
                    }
                    if (this.m0 == 2) {
                        hm4Var.A();
                        this.m0 = 1;
                    }
                    this.u0 = true;
                    if (!this.p0) {
                        W();
                        return false;
                    }
                    try {
                        if (!this.a0) {
                            this.q0 = true;
                            this.I.d(this.d0, 0, 4, 0L);
                            this.d0 = -1;
                            hm4Var.h = null;
                            return false;
                        }
                    } catch (MediaCodec.CryptoException e2) {
                        throw c(e2, this.z, false, lik.l(e2.getErrorCode()));
                    }
                }
            } catch (fm4 e3) {
                N(e3);
                Y(0);
                D();
                return true;
            }
        }
        return false;
    }

    public final void D() {
        try {
            this.I.flush();
        } finally {
            b0();
        }
    }

    public final boolean E() {
        if (this.I == null) {
            return false;
        }
        int i = this.o0;
        if (i == 3 || this.S || ((this.T && !this.r0) || (this.U && this.q0))) {
            Z();
            return true;
        }
        if (i == 2) {
            int i2 = lik.a;
            qx9.t(i2 >= 23);
            if (i2 >= 23) {
                try {
                    j0();
                } catch (sf6 e) {
                    m6k.g0("Failed to update the DRM session, releasing the codec instead.", e);
                    Z();
                    return true;
                }
            }
        }
        D();
        return false;
    }

    public boolean F() {
        return false;
    }

    public abstract float G(float f, sm8[] sm8VarArr);

    public abstract ArrayList H(hc5 hc5Var, sm8 sm8Var, boolean z);

    public abstract n2c I(z2c z2cVar, sm8 sm8Var, MediaCrypto mediaCrypto, float f);

    /* JADX WARN: Code restructure failed: missing block: B:127:0x014f, code lost:
    
        if ("stvm8".equals(r5) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x015f, code lost:
    
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r3) == false) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(z2c z2cVar, MediaCrypto mediaCrypto) {
        float G;
        int i;
        boolean z;
        boolean z2;
        String str;
        String str2 = z2cVar.a;
        int i2 = lik.a;
        if (i2 < 23) {
            G = -1.0f;
        } else {
            float f = this.H;
            sm8[] sm8VarArr = this.h;
            sm8VarArr.getClass();
            G = G(f, sm8VarArr);
        }
        float f2 = G > this.o ? G : -1.0f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        n2c I = I(z2cVar, this.z, mediaCrypto, f2);
        if (i2 >= 31) {
            bse bseVar = this.e;
            bseVar.getClass();
            b3c.a(I, bseVar);
        }
        try {
            q5a.y("createCodec:" + str2);
            this.I = this.m.d(I);
            q5a.B();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.P = z2cVar;
            this.M = f2;
            this.J = this.z;
            if (i2 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str2)) {
                String str3 = lik.d;
                if (str3.startsWith("SM-T585") || str3.startsWith("SM-A510") || str3.startsWith("SM-A520") || str3.startsWith("SM-J700")) {
                    i = 2;
                    this.Q = i;
                    this.R = i2 >= 21 && this.J.n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
                    this.S = i2 >= 18 || (i2 == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (i2 == 19 && lik.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
                    this.T = i2 != 29 && "c2.android.aac.decoder".equals(str2);
                    if (i2 <= 23 || !"OMX.google.vorbis.decoder".equals(str2)) {
                        if (i2 <= 19) {
                            String str4 = lik.b;
                            if (!"hb2000".equals(str4)) {
                            }
                            if (!"OMX.amlogic.avc.decoder.awesome".equals(str2)) {
                            }
                        }
                        z = false;
                        this.U = z;
                        this.V = i2 != 21 && "OMX.google.aac.decoder".equals(str2);
                        if (i2 < 21 && "OMX.SEC.mp3.dec".equals(str2) && Payload.SOURCE_SAMSUNG.equals(lik.c)) {
                            str = lik.b;
                            if (!str.startsWith("baffin") || str.startsWith("grand") || str.startsWith("fortuna") || str.startsWith("gprimelte") || str.startsWith("j2y18lte") || str.startsWith("ms01")) {
                                z2 = true;
                                this.W = z2;
                                this.X = i2 > 18 && this.J.y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
                                this.a0 = (i2 > 25 && "OMX.rk.video_decoder.avc".equals(str2)) || (i2 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str2)) || ((i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2))) || (("Amazon".equals(lik.c) && "AFTS".equals(lik.d) && z2cVar.f) || F()));
                                this.I.getClass();
                                if ("c2.android.mp3.decoder".equals(str2)) {
                                    this.b0 = new qc2();
                                }
                                if (this.f == 2) {
                                    this.c0 = SystemClock.elapsedRealtime() + 1000;
                                }
                                this.z0.b++;
                                O(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                            }
                        }
                        z2 = false;
                        this.W = z2;
                        this.X = i2 > 18 && this.J.y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
                        this.a0 = (i2 > 25 && "OMX.rk.video_decoder.avc".equals(str2)) || (i2 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str2)) || ((i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2))) || (("Amazon".equals(lik.c) && "AFTS".equals(lik.d) && z2cVar.f) || F()));
                        this.I.getClass();
                        if ("c2.android.mp3.decoder".equals(str2)) {
                        }
                        if (this.f == 2) {
                        }
                        this.z0.b++;
                        O(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    }
                    z = true;
                    this.U = z;
                    this.V = i2 != 21 && "OMX.google.aac.decoder".equals(str2);
                    if (i2 < 21) {
                        str = lik.b;
                        if (!str.startsWith("baffin")) {
                        }
                        z2 = true;
                        this.W = z2;
                        this.X = i2 > 18 && this.J.y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
                        this.a0 = (i2 > 25 && "OMX.rk.video_decoder.avc".equals(str2)) || (i2 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str2)) || ((i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2))) || (("Amazon".equals(lik.c) && "AFTS".equals(lik.d) && z2cVar.f) || F()));
                        this.I.getClass();
                        if ("c2.android.mp3.decoder".equals(str2)) {
                        }
                        if (this.f == 2) {
                        }
                        this.z0.b++;
                        O(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    }
                    z2 = false;
                    this.W = z2;
                    this.X = i2 > 18 && this.J.y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
                    this.a0 = (i2 > 25 && "OMX.rk.video_decoder.avc".equals(str2)) || (i2 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str2)) || ((i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2))) || (("Amazon".equals(lik.c) && "AFTS".equals(lik.d) && z2cVar.f) || F()));
                    this.I.getClass();
                    if ("c2.android.mp3.decoder".equals(str2)) {
                    }
                    if (this.f == 2) {
                    }
                    this.z0.b++;
                    O(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                }
            }
            if (i2 < 24 && ("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2))) {
                String str5 = lik.b;
                if ("flounder".equals(str5) || "flounder_lte".equals(str5) || "grouper".equals(str5) || "tilapia".equals(str5)) {
                    i = 1;
                    this.Q = i;
                    this.R = i2 >= 21 && this.J.n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
                    this.S = i2 >= 18 || (i2 == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (i2 == 19 && lik.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
                    this.T = i2 != 29 && "c2.android.aac.decoder".equals(str2);
                    if (i2 <= 23) {
                    }
                    if (i2 <= 19) {
                    }
                    z = false;
                    this.U = z;
                    this.V = i2 != 21 && "OMX.google.aac.decoder".equals(str2);
                    if (i2 < 21) {
                    }
                    z2 = false;
                    this.W = z2;
                    this.X = i2 > 18 && this.J.y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
                    this.a0 = (i2 > 25 && "OMX.rk.video_decoder.avc".equals(str2)) || (i2 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str2)) || ((i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2))) || (("Amazon".equals(lik.c) && "AFTS".equals(lik.d) && z2cVar.f) || F()));
                    this.I.getClass();
                    if ("c2.android.mp3.decoder".equals(str2)) {
                    }
                    if (this.f == 2) {
                    }
                    this.z0.b++;
                    O(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                }
            }
            i = 0;
            this.Q = i;
            this.R = i2 >= 21 && this.J.n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
            this.S = i2 >= 18 || (i2 == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (i2 == 19 && lik.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
            this.T = i2 != 29 && "c2.android.aac.decoder".equals(str2);
            if (i2 <= 23) {
            }
            if (i2 <= 19) {
            }
            z = false;
            this.U = z;
            this.V = i2 != 21 && "OMX.google.aac.decoder".equals(str2);
            if (i2 < 21) {
            }
            z2 = false;
            this.W = z2;
            this.X = i2 > 18 && this.J.y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
            this.a0 = (i2 > 25 && "OMX.rk.video_decoder.avc".equals(str2)) || (i2 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str2)) || ((i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2))) || (("Amazon".equals(lik.c) && "AFTS".equals(lik.d) && z2cVar.f) || F()));
            this.I.getClass();
            if ("c2.android.mp3.decoder".equals(str2)) {
            }
            if (this.f == 2) {
            }
            this.z0.b++;
            O(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            q5a.B();
            throw th;
        }
    }

    public final void L() {
        sm8 sm8Var;
        if (this.I != null || this.i0 || (sm8Var = this.z) == null) {
            return;
        }
        if (this.C == null && g0(sm8Var)) {
            sm8 sm8Var2 = this.z;
            z();
            String str = sm8Var2.l;
            boolean equals = MimeTypes.AUDIO_AAC.equals(str);
            ct1 ct1Var = this.s;
            if (equals || MimeTypes.AUDIO_MPEG.equals(str) || MimeTypes.AUDIO_OPUS.equals(str)) {
                ct1Var.getClass();
                ct1Var.o = 32;
            } else {
                ct1Var.getClass();
                ct1Var.o = 1;
            }
            this.i0 = true;
            return;
        }
        d0(this.C);
        String str2 = this.z.l;
        if (this.B != null) {
            if (this.D == null && this.B.v() == null) {
                return;
            }
            if (mr8.a) {
                int x = this.B.x();
                if (x == 1) {
                    vb5 v = this.B.v();
                    v.getClass();
                    throw c(v, this.z, false, v.a);
                }
                if (x != 4) {
                    return;
                }
            }
        }
        try {
            M(this.D, this.E);
        } catch (c3c e) {
            throw c(e, this.z, false, 4001);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(MediaCrypto mediaCrypto, boolean z) {
        String str;
        c3c c3cVar;
        if (this.N == null) {
            try {
                hc5 hc5Var = this.n;
                ArrayList H = H(hc5Var, this.z, z);
                if (H.isEmpty() && z) {
                    H = H(hc5Var, this.z, false);
                    if (!H.isEmpty()) {
                        String str2 = this.z.l;
                        H.toString();
                        m6k.f0();
                    }
                }
                this.N = new ArrayDeque();
                if (!H.isEmpty()) {
                    this.N.add((z2c) H.get(0));
                }
                this.O = null;
            } catch (l3c e) {
                throw new c3c(this.z, e, z, -49998);
            }
        }
        if (this.N.isEmpty()) {
            throw new c3c(this.z, null, z, -49999);
        }
        z2c z2cVar = (z2c) this.N.peekFirst();
        while (this.I == null) {
            z2c z2cVar2 = (z2c) this.N.peekFirst();
            if (!f0(z2cVar2)) {
                return;
            }
            try {
                K(z2cVar2, mediaCrypto);
            } catch (Exception e2) {
                if (z2cVar2 != z2cVar) {
                    throw e2;
                }
                try {
                    m6k.f0();
                    Thread.sleep(50L);
                    K(z2cVar2, mediaCrypto);
                } catch (Exception e3) {
                    m6k.g0("Failed to initialize decoder: " + z2cVar2, e3);
                    this.N.removeFirst();
                    sm8 sm8Var = this.z;
                    String str3 = "Decoder init failed: " + z2cVar2.a + ", " + sm8Var;
                    String str4 = sm8Var.l;
                    if (lik.a < 21) {
                    }
                    c3c c3cVar2 = new c3c(str3, e3, str4, z, z2cVar2, str);
                    N(c3cVar2);
                    c3cVar = this.O;
                    if (c3cVar != null) {
                    }
                    if (!this.N.isEmpty()) {
                    }
                }
                m6k.g0("Failed to initialize decoder: " + z2cVar2, e3);
                this.N.removeFirst();
                sm8 sm8Var2 = this.z;
                String str32 = "Decoder init failed: " + z2cVar2.a + ", " + sm8Var2;
                String str42 = sm8Var2.l;
                if (lik.a < 21) {
                    str = e3 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e3).getDiagnosticInfo() : null;
                } else {
                    str = null;
                }
                c3c c3cVar22 = new c3c(str32, e3, str42, z, z2cVar2, str);
                N(c3cVar22);
                c3cVar = this.O;
                if (c3cVar != null) {
                    this.O = c3cVar22;
                } else {
                    this.O = new c3c(c3cVar.getMessage(), c3cVar.getCause(), c3cVar.a, c3cVar.b, c3cVar.c, c3cVar.d);
                }
                if (!this.N.isEmpty()) {
                    throw this.O;
                }
            }
        }
        this.N = null;
    }

    public abstract void N(Exception exc);

    public abstract void O(String str, long j, long j2);

    public abstract void P(String str);

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0070, code lost:
    
        if (A() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a2, code lost:
    
        if (A() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b4, code lost:
    
        if (A() == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public km4 Q(fp4 fp4Var) {
        boolean z = true;
        this.w0 = true;
        sm8 sm8Var = (sm8) fp4Var.c;
        sm8Var.getClass();
        int i = 0;
        if (sm8Var.l == null) {
            throw c(new IllegalArgumentException(), sm8Var, false, 4005);
        }
        hpo hpoVar = (hpo) fp4Var.b;
        hpo hpoVar2 = this.C;
        this.C = hpoVar;
        this.z = sm8Var;
        if (this.i0) {
            this.k0 = true;
            return null;
        }
        q2c q2cVar = this.I;
        if (q2cVar == null) {
            this.N = null;
            L();
            return null;
        }
        z2c z2cVar = this.P;
        sm8 sm8Var2 = this.J;
        hpo hpoVar3 = this.B;
        if (hpoVar3 != hpoVar) {
            if (hpoVar != null && hpoVar3 != null && hpoVar.w().equals(hpoVar3.w()) && lik.a >= 23) {
                UUID uuid = nc2.d;
                if (!uuid.equals(hpoVar3.w())) {
                    uuid.equals(hpoVar.w());
                }
            }
            if (this.p0) {
                this.n0 = 1;
                this.o0 = 3;
            } else {
                Z();
                L();
            }
            return new km4(z2cVar.a, sm8Var2, sm8Var, 0, 128);
        }
        boolean z2 = this.C != this.B;
        qx9.t(!z2 || lik.a >= 23);
        km4 x = x(z2cVar, sm8Var2, sm8Var);
        int i2 = x.d;
        if (i2 != 0) {
            if (i2 == 1) {
                if (i0(sm8Var)) {
                    this.J = sm8Var;
                    if (!z2) {
                        if (this.p0) {
                            this.n0 = 1;
                            if (this.S || this.U) {
                                this.o0 = 3;
                                i = 2;
                            } else {
                                this.o0 = 1;
                            }
                        }
                    }
                }
                i = 16;
            } else if (i2 == 2) {
                if (i0(sm8Var)) {
                    this.l0 = true;
                    this.m0 = 1;
                    int i3 = this.Q;
                    if (i3 != 2 && (i3 != 1 || sm8Var.q != sm8Var2.q || sm8Var.r != sm8Var2.r)) {
                        z = false;
                    }
                    this.Y = z;
                    this.J = sm8Var;
                    if (z2) {
                    }
                }
                i = 16;
            } else {
                if (i2 != 3) {
                    zzl.s();
                    return null;
                }
                if (i0(sm8Var)) {
                    this.J = sm8Var;
                    if (z2) {
                    }
                }
                i = 16;
            }
        } else if (this.p0) {
            this.n0 = 1;
            this.o0 = 3;
        } else {
            Z();
            L();
        }
        if (i2 == 0 || (this.I == q2cVar && this.o0 != 3)) {
            return x;
        }
        return new km4(z2cVar.a, sm8Var2, sm8Var, 0, i);
    }

    public abstract void R(sm8 sm8Var, MediaFormat mediaFormat);

    public void T(long j) {
        while (this.C0 != 0) {
            long[] jArr = this.y;
            if (j < jArr[0]) {
                return;
            }
            long[] jArr2 = this.w;
            this.A0 = jArr2[0];
            long[] jArr3 = this.x;
            e0(jArr3[0]);
            int i = this.C0 - 1;
            this.C0 = i;
            System.arraycopy(jArr2, 1, jArr2, 0, i);
            System.arraycopy(jArr3, 1, jArr3, 0, this.C0);
            System.arraycopy(jArr, 1, jArr, 0, this.C0);
            U();
        }
    }

    public abstract void U();

    public abstract void V(hm4 hm4Var);

    public final void W() {
        int i = this.o0;
        if (i == 1) {
            D();
            return;
        }
        if (i == 2) {
            D();
            j0();
        } else if (i != 3) {
            this.v0 = true;
            a0();
        } else {
            Z();
            L();
        }
    }

    public abstract boolean X(long j, long j2, q2c q2cVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, sm8 sm8Var);

    public final boolean Y(int i) {
        fp4 fp4Var = this.b;
        fp4Var.j();
        hm4 hm4Var = this.p;
        hm4Var.A();
        int p = p(fp4Var, hm4Var, i | 4);
        if (p == -5) {
            Q(fp4Var);
            return true;
        }
        if (p != -4 || !hm4Var.i(4)) {
            return false;
        }
        this.u0 = true;
        W();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z() {
        try {
            q2c q2cVar = this.I;
            if (q2cVar != null) {
                q2cVar.release();
                this.z0.c++;
                P(this.P.a);
            }
            this.I = null;
            try {
                MediaCrypto mediaCrypto = this.D;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.I = null;
            try {
                MediaCrypto mediaCrypto2 = this.D;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void b0() {
        this.d0 = -1;
        this.q.h = null;
        this.e0 = -1;
        this.f0 = null;
        this.c0 = C.TIME_UNSET;
        this.q0 = false;
        this.p0 = false;
        this.Y = false;
        this.Z = false;
        this.g0 = false;
        this.h0 = false;
        this.u.clear();
        this.s0 = C.TIME_UNSET;
        this.t0 = C.TIME_UNSET;
        qc2 qc2Var = this.b0;
        if (qc2Var != null) {
            qc2Var.a = 0L;
            qc2Var.b = 0L;
            qc2Var.c = false;
        }
        this.n0 = 0;
        this.o0 = 0;
        this.m0 = this.l0 ? 1 : 0;
    }

    public final void c0() {
        b0();
        this.y0 = null;
        this.b0 = null;
        this.N = null;
        this.P = null;
        this.J = null;
        this.K = null;
        this.L = false;
        this.r0 = false;
        this.M = -1.0f;
        this.Q = 0;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.a0 = false;
        this.l0 = false;
        this.m0 = 0;
        this.E = false;
    }

    public final void d0(hpo hpoVar) {
        hpo hpoVar2 = this.B;
        this.B = hpoVar;
    }

    public final void e0(long j) {
        this.B0 = j;
        if (j != C.TIME_UNSET) {
            S();
        }
    }

    public boolean f0(z2c z2cVar) {
        return true;
    }

    @Override // defpackage.m51
    public boolean g() {
        return this.v0;
    }

    public boolean g0(sm8 sm8Var) {
        return false;
    }

    @Override // defpackage.m51
    public boolean h() {
        boolean isReady;
        if (this.z == null) {
            return false;
        }
        if (f()) {
            isReady = this.k;
        } else {
            ipg ipgVar = this.g;
            ipgVar.getClass();
            isReady = ipgVar.isReady();
        }
        if (isReady || this.e0 >= 0) {
            return true;
        }
        return this.c0 != C.TIME_UNSET && SystemClock.elapsedRealtime() < this.c0;
    }

    public abstract int h0(hc5 hc5Var, sm8 sm8Var);

    @Override // defpackage.m51
    public void i() {
        this.z = null;
        this.A0 = C.TIME_UNSET;
        e0(C.TIME_UNSET);
        this.C0 = 0;
        E();
    }

    public final boolean i0(sm8 sm8Var) {
        if (lik.a >= 23 && this.I != null && this.o0 != 3 && this.f != 0) {
            float f = this.H;
            sm8[] sm8VarArr = this.h;
            sm8VarArr.getClass();
            float G = G(f, sm8VarArr);
            float f2 = this.M;
            if (f2 != G) {
                if (G == -1.0f) {
                    if (this.p0) {
                        this.n0 = 1;
                        this.o0 = 3;
                        return false;
                    }
                    Z();
                    L();
                    return false;
                }
                if (f2 != -1.0f || G > this.o) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", G);
                    this.I.c(bundle);
                    this.M = G;
                }
            }
        }
        return true;
    }

    public final void j0() {
        try {
            MediaCrypto mediaCrypto = this.D;
            this.C.u().getClass();
            mediaCrypto.setMediaDrmSession(null);
            d0(this.C);
            this.n0 = 0;
            this.o0 = 0;
        } catch (MediaCryptoException e) {
            throw c(e, this.z, false, 6006);
        }
    }

    @Override // defpackage.m51
    public void k(long j, boolean z) {
        int i;
        this.u0 = false;
        this.v0 = false;
        this.x0 = false;
        if (this.i0) {
            this.s.A();
            this.r.A();
            this.j0 = false;
        } else if (E()) {
            L();
        }
        eij eijVar = this.t;
        synchronized (eijVar) {
            i = eijVar.e;
        }
        if (i > 0) {
            this.w0 = true;
        }
        this.t.b();
        int i2 = this.C0;
        if (i2 != 0) {
            e0(this.x[i2 - 1]);
            this.A0 = this.w[this.C0 - 1];
            this.C0 = 0;
        }
    }

    public final void k0(long j) {
        Object d;
        Object g;
        eij eijVar = this.t;
        synchronized (eijVar) {
            d = eijVar.d(j, true);
        }
        sm8 sm8Var = (sm8) d;
        if (sm8Var == null && this.L) {
            eij eijVar2 = this.t;
            synchronized (eijVar2) {
                g = eijVar2.e == 0 ? null : eijVar2.g();
            }
            sm8Var = (sm8) g;
        }
        if (sm8Var != null) {
            this.A = sm8Var;
        } else if (!this.L || (sm8Var = this.A) == null) {
            return;
        }
        R(sm8Var, this.K);
        this.L = false;
    }

    @Override // defpackage.m51
    public final void o(sm8[] sm8VarArr, long j, long j2) {
        if (this.B0 == C.TIME_UNSET) {
            qx9.t(this.A0 == C.TIME_UNSET);
            this.A0 = j;
            e0(j2);
            return;
        }
        int i = this.C0;
        long[] jArr = this.x;
        if (i == jArr.length) {
            long j3 = jArr[i - 1];
            m6k.f0();
        } else {
            this.C0 = i + 1;
        }
        int i2 = this.C0 - 1;
        this.w[i2] = j;
        jArr[i2] = j2;
        this.y[i2] = this.s0;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x006b A[LOOP:1: B:33:0x004b->B:42:0x006b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006c A[EDGE_INSN: B:43:0x006c->B:44:? BREAK  A[LOOP:1: B:33:0x004b->B:42:0x006b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0087 A[LOOP:2: B:45:0x006c->B:54:0x0087, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0088 A[EDGE_INSN: B:55:0x0088->B:56:0x0088 BREAK  A[LOOP:2: B:45:0x006c->B:54:0x0087], SYNTHETIC] */
    @Override // defpackage.m51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.x0) {
            this.x0 = false;
            W();
        }
        sf6 sf6Var = this.y0;
        if (sf6Var != null) {
            this.y0 = null;
            throw sf6Var;
        }
        try {
            if (this.v0) {
                a0();
                return;
            }
            if (this.z != null || Y(2)) {
                L();
                if (this.i0) {
                    q5a.y("bypassRender");
                    while (w(j, j2)) {
                    }
                    q5a.B();
                } else if (this.I != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    q5a.y("drainAndFeed");
                    while (B(j, j2)) {
                        long j3 = this.F;
                        if (j3 != C.TIME_UNSET && SystemClock.elapsedRealtime() - elapsedRealtime >= j3) {
                            z2 = false;
                            if (z2) {
                                break;
                            }
                        }
                        z2 = true;
                        if (z2) {
                        }
                    }
                    while (C()) {
                        long j4 = this.F;
                        if (j4 != C.TIME_UNSET && SystemClock.elapsedRealtime() - elapsedRealtime >= j4) {
                            z = false;
                            if (z) {
                                break;
                            }
                        }
                        z = true;
                        if (z) {
                        }
                    }
                    q5a.B();
                } else {
                    dm4 dm4Var = this.z0;
                    int i = dm4Var.e;
                    ipg ipgVar = this.g;
                    ipgVar.getClass();
                    dm4Var.e = i + ipgVar.skipData(j - this.i);
                    Y(1);
                }
                synchronized (this.z0) {
                }
            }
        } catch (IllegalStateException e) {
            int i2 = lik.a;
            if (i2 < 21 || !(e instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e;
                }
            }
            N(e);
            if (i2 >= 21) {
                if (e instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e).isRecoverable() : false) {
                    z3 = true;
                }
            }
            if (z3) {
                Z();
            }
            throw c(y(e, this.P), this.z, z3, 4003);
        }
    }

    @Override // defpackage.m51
    public void t(float f, float f2) {
        this.G = f;
        this.H = f2;
        i0(this.J);
    }

    @Override // defpackage.m51
    public final int u(sm8 sm8Var) {
        try {
            return h0(this.n, sm8Var);
        } catch (l3c e) {
            throw this.c(e, sm8Var, false, 4002);
        }
    }

    @Override // defpackage.m51
    public final int v() {
        return 8;
    }

    public final boolean w(long j, long j2) {
        ct1 ct1Var;
        qx9.t(!this.v0);
        ct1 ct1Var2 = this.s;
        int i = ct1Var2.n;
        if (i > 0) {
            ct1Var = ct1Var2;
            if (!X(j, j2, null, ct1Var2.h, this.e0, 0, i, ct1Var2.j, ct1Var2.i(Integer.MIN_VALUE), ct1Var2.i(4), this.A)) {
                return false;
            }
            T(ct1Var.m);
            ct1Var.A();
        } else {
            ct1Var = ct1Var2;
        }
        if (this.u0) {
            this.v0 = true;
            return false;
        }
        boolean z = this.j0;
        hm4 hm4Var = this.r;
        if (z) {
            qx9.t(ct1Var.E(hm4Var));
            this.j0 = false;
        }
        if (this.k0) {
            if (ct1Var.n > 0) {
                return true;
            }
            z();
            this.k0 = false;
            L();
            if (!this.i0) {
                return false;
            }
        }
        qx9.t(!this.u0);
        fp4 fp4Var = this.b;
        fp4Var.j();
        hm4Var.A();
        while (true) {
            hm4Var.A();
            int p = p(fp4Var, hm4Var, 0);
            if (p == -5) {
                Q(fp4Var);
                break;
            }
            if (p != -4) {
                if (p != -3) {
                    zzl.s();
                    return false;
                }
            } else {
                if (hm4Var.i(4)) {
                    this.u0 = true;
                    break;
                }
                if (this.w0) {
                    sm8 sm8Var = this.z;
                    sm8Var.getClass();
                    this.A = sm8Var;
                    R(sm8Var, null);
                    this.w0 = false;
                }
                hm4Var.D();
                if (!ct1Var.E(hm4Var)) {
                    this.j0 = true;
                    break;
                }
            }
        }
        if (ct1Var.n > 0) {
            ct1Var.D();
        }
        return ct1Var.n > 0 || this.u0 || this.k0;
    }

    public abstract km4 x(z2c z2cVar, sm8 sm8Var, sm8 sm8Var2);

    public w2c y(IllegalStateException illegalStateException, z2c z2cVar) {
        return new w2c(illegalStateException, z2cVar);
    }

    public final void z() {
        this.k0 = false;
        this.s.A();
        this.r.A();
        this.j0 = false;
        this.i0 = false;
    }

    public void S() {
    }

    public void a0() {
    }

    public void J(hm4 hm4Var) {
    }
}
