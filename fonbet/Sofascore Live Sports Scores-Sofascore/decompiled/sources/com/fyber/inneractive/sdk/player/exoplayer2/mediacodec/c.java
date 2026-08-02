package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.p;
import com.fyber.inneractive.sdk.player.exoplayer2.util.w;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.zzl;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class c extends com.fyber.inneractive.sdk.player.exoplayer2.a {
    public static final byte[] O;
    public ByteBuffer[] A;
    public long B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public DecoderCounters N;
    public final d h;
    public final com.fyber.inneractive.sdk.player.exoplayer2.decoder.c i;
    public final com.fyber.inneractive.sdk.player.exoplayer2.decoder.c j;
    public final p k;
    public final ArrayList l;
    public final MediaCodec.BufferInfo m;
    public o n;
    public MediaCodec o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public ByteBuffer[] z;

    static {
        int i = z.a;
        byte[] bArr = new byte[38];
        for (int i2 = 0; i2 < 38; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i3 + 1), 16) + (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i3), 16) << 4));
        }
        O = bArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i, boolean z) {
        super(i);
        d dVar = d.a;
        if (z.a < 16) {
            zzl.s();
            throw null;
        }
        this.h = dVar;
        this.i = new com.fyber.inneractive.sdk.player.exoplayer2.decoder.c();
        this.j = new com.fyber.inneractive.sdk.player.exoplayer2.decoder.c();
        this.k = new p();
        this.l = new ArrayList();
        this.m = new MediaCodec.BufferInfo();
        this.G = 0;
        this.H = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(long j, long j2) {
        boolean a;
        int dequeueOutputBuffer;
        boolean z;
        if (this.L) {
            p();
            return;
        }
        if (this.n == null) {
            this.j.a();
            int a2 = a(this.k, this.j, true);
            if (a2 != -5) {
                if (a2 == -4) {
                    if (!this.j.b(4)) {
                        zzl.s();
                        return;
                    } else {
                        this.K = true;
                        n();
                        return;
                    }
                }
                return;
            }
            a(this.k.a);
        }
        l();
        if (this.o != null) {
            w.a("drainAndFeed");
            while (true) {
                if (this.D < 0) {
                    if (this.v && this.J) {
                        try {
                            dequeueOutputBuffer = this.o.dequeueOutputBuffer(this.m, 0L);
                            this.D = dequeueOutputBuffer;
                        } catch (IllegalStateException unused) {
                            n();
                            if (this.L) {
                                o();
                            }
                        }
                    } else {
                        dequeueOutputBuffer = this.o.dequeueOutputBuffer(this.m, 0L);
                        this.D = dequeueOutputBuffer;
                    }
                    if (dequeueOutputBuffer >= 0) {
                        if (this.y) {
                            this.y = false;
                            this.o.releaseOutputBuffer(dequeueOutputBuffer, false);
                            this.D = -1;
                        } else {
                            MediaCodec.BufferInfo bufferInfo = this.m;
                            if ((bufferInfo.flags & 4) != 0) {
                                n();
                                this.D = -1;
                                break;
                            }
                            ByteBuffer byteBuffer = this.A[dequeueOutputBuffer];
                            if (byteBuffer != null) {
                                byteBuffer.position(bufferInfo.offset);
                                MediaCodec.BufferInfo bufferInfo2 = this.m;
                                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                            }
                            long j3 = this.m.presentationTimeUs;
                            int size = this.l.size();
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    z = false;
                                    break;
                                } else {
                                    if (((Long) this.l.get(i)).longValue() == j3) {
                                        this.l.remove(i);
                                        z = true;
                                        break;
                                    }
                                    i++;
                                }
                            }
                            this.E = z;
                        }
                    } else if (dequeueOutputBuffer == -2) {
                        MediaFormat outputFormat = this.o.getOutputFormat();
                        if (this.s && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                            this.y = true;
                        } else {
                            if (this.w) {
                                outputFormat.setInteger("channel-count", 1);
                            }
                            a(this.o, outputFormat);
                        }
                    } else if (dequeueOutputBuffer == -3) {
                        this.A = this.o.getOutputBuffers();
                    } else if (this.t && (this.K || this.H == 2)) {
                        n();
                    }
                }
                if (this.v && this.J) {
                    try {
                        MediaCodec mediaCodec = this.o;
                        ByteBuffer[] byteBufferArr = this.A;
                        int i2 = this.D;
                        ByteBuffer byteBuffer2 = byteBufferArr[i2];
                        MediaCodec.BufferInfo bufferInfo3 = this.m;
                        int i3 = bufferInfo3.flags;
                        a = a(j, j2, mediaCodec, byteBuffer2, i2, bufferInfo3.presentationTimeUs, this.E);
                    } catch (IllegalStateException unused2) {
                        n();
                        if (this.L) {
                            o();
                        }
                    }
                } else {
                    MediaCodec mediaCodec2 = this.o;
                    ByteBuffer[] byteBufferArr2 = this.A;
                    int i4 = this.D;
                    ByteBuffer byteBuffer3 = byteBufferArr2[i4];
                    MediaCodec.BufferInfo bufferInfo4 = this.m;
                    int i5 = bufferInfo4.flags;
                    a = a(j, j2, mediaCodec2, byteBuffer3, i4, bufferInfo4.presentationTimeUs, this.E);
                }
                if (!a) {
                    break;
                }
                long j4 = this.m.presentationTimeUs;
                this.D = -1;
            }
            while (k()) {
            }
            w.a();
        } else {
            this.d.a(j - this.e);
            this.j.a();
            int a3 = a(this.k, this.j, false);
            if (a3 == -5) {
                a(this.k.a);
            } else if (a3 == -4) {
                if (!this.j.b(4)) {
                    zzl.s();
                    return;
                } else {
                    this.K = true;
                    n();
                }
            }
        }
        this.N.ensureUpdated();
    }

    public abstract void a(MediaCodec mediaCodec, MediaFormat mediaFormat);

    public abstract void a(a aVar, MediaCodec mediaCodec, o oVar);

    public abstract void a(String str, long j, long j2);

    public abstract boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, long j3, boolean z);

    public abstract int b(d dVar, o oVar);

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public boolean e() {
        return this.L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public boolean f() {
        if (this.n == null) {
            return false;
        }
        if ((this.f ? this.g : this.d.isReady()) || this.D >= 0) {
            return true;
        }
        return this.B != C.TIME_UNSET && SystemClock.elapsedRealtime() < this.B;
    }

    public final boolean k() {
        MediaCodec mediaCodec = this.o;
        if (mediaCodec == null || this.H == 2 || this.K) {
            return false;
        }
        if (this.C < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.C = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar = this.i;
            cVar.c = this.z[dequeueInputBuffer];
            cVar.a();
        }
        if (this.H == 1) {
            if (!this.t) {
                this.J = true;
                this.o.queueInputBuffer(this.C, 0, 0, 0L, 4);
                this.C = -1;
            }
            this.H = 2;
            return false;
        }
        if (this.x) {
            this.x = false;
            ByteBuffer byteBuffer = this.i.c;
            byte[] bArr = O;
            byteBuffer.put(bArr);
            this.o.queueInputBuffer(this.C, 0, bArr.length, 0L, 0);
            this.C = -1;
            this.I = true;
            return true;
        }
        if (this.G == 1) {
            for (int i = 0; i < this.n.h.size(); i++) {
                this.i.c.put((byte[]) this.n.h.get(i));
            }
            this.G = 2;
        }
        int position = this.i.c.position();
        int a = a(this.k, this.i, false);
        if (a == -3) {
            return false;
        }
        if (a == -5) {
            if (this.G == 2) {
                this.i.a();
                this.G = 1;
            }
            a(this.k.a);
            return true;
        }
        if (this.i.b(4)) {
            if (this.G == 2) {
                this.i.a();
                this.G = 1;
            }
            this.K = true;
            if (!this.I) {
                n();
                return false;
            }
            try {
                if (!this.t) {
                    this.J = true;
                    this.o.queueInputBuffer(this.C, 0, 0, 0L, 4);
                    this.C = -1;
                }
                return false;
            } catch (MediaCodec.CryptoException e) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e);
            }
        }
        if (this.M && !this.i.b(1)) {
            this.i.a();
            if (this.G == 2) {
                this.G = 1;
            }
            return true;
        }
        this.M = false;
        boolean b = this.i.b(1073741824);
        if (this.q && !b) {
            ByteBuffer byteBuffer2 = this.i.c;
            int position2 = byteBuffer2.position();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = i2 + 1;
                if (i4 >= position2) {
                    byteBuffer2.clear();
                    break;
                }
                int i5 = byteBuffer2.get(i2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (i3 == 3) {
                    if (i5 == 1 && (byteBuffer2.get(i4) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer2.duplicate();
                        duplicate.position(i2 - 3);
                        duplicate.limit(position2);
                        byteBuffer2.position(0);
                        byteBuffer2.put(duplicate);
                        break;
                    }
                } else if (i5 == 0) {
                    i3++;
                }
                if (i5 != 0) {
                    i3 = 0;
                }
                i2 = i4;
            }
            if (this.i.c.position() == 0) {
                return true;
            }
            this.q = false;
        }
        try {
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar2 = this.i;
            long j = cVar2.d;
            if (cVar2.b(Integer.MIN_VALUE)) {
                this.l.add(Long.valueOf(j));
            }
            this.i.c.flip();
            m();
            if (b) {
                MediaCodec.CryptoInfo cryptoInfo = this.i.b.d;
                if (position != 0) {
                    int[] iArr = cryptoInfo.numBytesOfClearData;
                    if (iArr == null) {
                        iArr = new int[1];
                        cryptoInfo.numBytesOfClearData = iArr;
                    }
                    iArr[0] = iArr[0] + position;
                }
                this.o.queueSecureInputBuffer(this.C, 0, cryptoInfo, j, 0);
            } else {
                this.o.queueInputBuffer(this.C, 0, this.i.c.limit(), j, 0);
            }
            this.C = -1;
            this.I = true;
            this.G = 0;
            this.N.inputBufferCount++;
            return true;
        } catch (MediaCodec.CryptoException e2) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e2);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:9|(1:102)(1:15)|16|(1:101)(1:30)|31|(7:(2:37|(19:45|46|(1:99)(1:52)|53|(1:98)(1:57)|58|(1:90)(1:62)|63|(1:69)|70|71|72|73|74|75|76|(1:78)(1:81)|79|80))|74|75|76|(0)(0)|79|80)|100|46|(2:48|50)|99|53|(1:55)|98|58|(1:60)|90|63|(3:65|67|69)|70|71|72|73) */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0190, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0191, code lost:
    
        r2 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        boolean z;
        c cVar;
        if (!q()) {
            return;
        }
        o oVar = this.n;
        String str = oVar.f;
        try {
            a a = a(this.h, oVar);
            if (a == null) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.d(new b(this.n, (f) null, -49999));
            }
            String str2 = a.a;
            this.p = a.b;
            o oVar2 = this.n;
            int i = z.a;
            boolean z2 = false;
            this.q = i < 21 && oVar2.h.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
            this.r = i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (i == 19 && z.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
            try {
                if (i < 24 && ("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2))) {
                    String str3 = z.b;
                    if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
                        z = true;
                        this.s = z;
                        this.t = i > 17 && ("OMX.rk.video_decoder.avc".equals(str2) || "OMX.allwinner.video.decoder.avc".equals(str2));
                        this.u = (i > 23 && "OMX.google.vorbis.decoder".equals(str2)) || (i <= 19 && "hb2000".equals(z.b) && ("OMX.amlogic.avc.decoder.awesome".equals(str2) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str2)));
                        this.v = i != 21 && "OMX.google.aac.decoder".equals(str2);
                        o oVar3 = this.n;
                        if (i <= 18 && oVar3.r == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2)) {
                            z2 = true;
                        }
                        this.w = z2;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        w.a("createCodec:" + str2);
                        this.o = MediaCodec.createByCodecName(str2);
                        w.a();
                        w.a("configureCodec");
                        a(a, this.o, this.n);
                        w.a();
                        w.a("startCodec");
                        this.o.start();
                        w.a();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        cVar = this;
                        cVar.a(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                        cVar.z = cVar.o.getInputBuffers();
                        cVar.A = cVar.o.getOutputBuffers();
                        cVar.B = cVar.c != 2 ? SystemClock.elapsedRealtime() + 1000 : C.TIME_UNSET;
                        cVar.C = -1;
                        cVar.D = -1;
                        cVar.M = true;
                        cVar.N.decoderInitCount++;
                        return;
                    }
                }
                cVar.a(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                cVar.z = cVar.o.getInputBuffers();
                cVar.A = cVar.o.getOutputBuffers();
                cVar.B = cVar.c != 2 ? SystemClock.elapsedRealtime() + 1000 : C.TIME_UNSET;
                cVar.C = -1;
                cVar.D = -1;
                cVar.M = true;
                cVar.N.decoderInitCount++;
                return;
            } catch (Exception e) {
                e = e;
                throw new com.fyber.inneractive.sdk.player.exoplayer2.d(new b(cVar.n, e, str2));
            }
            z = false;
            this.s = z;
            this.t = i > 17 && ("OMX.rk.video_decoder.avc".equals(str2) || "OMX.allwinner.video.decoder.avc".equals(str2));
            this.u = (i > 23 && "OMX.google.vorbis.decoder".equals(str2)) || (i <= 19 && "hb2000".equals(z.b) && ("OMX.amlogic.avc.decoder.awesome".equals(str2) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str2)));
            this.v = i != 21 && "OMX.google.aac.decoder".equals(str2);
            o oVar32 = this.n;
            if (i <= 18) {
                z2 = true;
            }
            this.w = z2;
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            w.a("createCodec:" + str2);
            this.o = MediaCodec.createByCodecName(str2);
            w.a();
            w.a("configureCodec");
            a(a, this.o, this.n);
            w.a();
            w.a("startCodec");
            this.o.start();
            w.a();
            long elapsedRealtime22 = SystemClock.elapsedRealtime();
            cVar = this;
        } catch (f e2) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.d(new b(this.n, e2, -49998));
        }
    }

    public final void n() {
        if (this.H == 2) {
            o();
            l();
        } else {
            this.L = true;
            p();
        }
    }

    public final void o() {
        if (this.o != null) {
            this.B = C.TIME_UNSET;
            this.C = -1;
            this.D = -1;
            this.E = false;
            this.l.clear();
            this.z = null;
            this.A = null;
            this.F = false;
            this.I = false;
            this.p = false;
            this.q = false;
            this.r = false;
            this.s = false;
            this.t = false;
            this.u = false;
            this.w = false;
            this.x = false;
            this.y = false;
            this.J = false;
            this.G = 0;
            this.H = 0;
            this.N.decoderReleaseCount++;
            this.i.c = null;
            try {
                this.o.stop();
                try {
                    this.o.release();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    this.o.release();
                    throw th;
                } finally {
                }
            }
        }
    }

    public boolean q() {
        return this.o == null && this.n != null;
    }

    public void m() {
    }

    public void p() {
    }

    public boolean a(boolean z, o oVar, o oVar2) {
        return false;
    }

    public a a(d dVar, o oVar) {
        String str = oVar.f;
        dVar.getClass();
        return j.a(false, str);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public void a(boolean z, long j) {
        this.K = false;
        this.L = false;
        if (this.o != null) {
            this.B = C.TIME_UNSET;
            this.C = -1;
            this.D = -1;
            this.M = true;
            this.E = false;
            this.l.clear();
            this.x = false;
            this.y = false;
            if (!this.r && (!this.u || !this.J)) {
                if (this.H != 0) {
                    o();
                    l();
                } else {
                    this.o.flush();
                    this.I = false;
                }
            } else {
                o();
                l();
            }
            if (!this.F || this.n == null) {
                return;
            }
            this.G = 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r5.k == r0.k) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(o oVar) {
        o oVar2 = this.n;
        this.n = oVar;
        if (!z.a(oVar.i, oVar2 == null ? null : oVar2.i) && this.n.i != null) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.d(new IllegalStateException("Media requires a DrmSessionManager"));
        }
        boolean z = true;
        if (this.o != null && a(this.p, oVar2, this.n)) {
            this.F = true;
            this.G = 1;
            if (this.s) {
                o oVar3 = this.n;
                if (oVar3.j == oVar2.j) {
                }
            }
            z = false;
            this.x = z;
            return;
        }
        if (this.I) {
            this.H = 1;
        } else {
            o();
            l();
        }
    }
}
