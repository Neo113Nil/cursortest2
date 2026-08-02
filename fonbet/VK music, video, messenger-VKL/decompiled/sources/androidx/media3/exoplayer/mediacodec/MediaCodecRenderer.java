package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import androidx.annotation.Nullable;
import androidx.media3.common.a;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.j;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.c;
import androidx.media3.exoplayer.source.i;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.i;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.ahn;
import xsna.dvf;
import xsna.dw70;
import xsna.dwo0;
import xsna.fxc0;
import xsna.g8l;
import xsna.hq10;
import xsna.hr80;
import xsna.kgs;
import xsna.m0h0;
import xsna.n8l;
import xsna.qzf;
import xsna.r11;
import xsna.rjk;
import xsna.s4q0;
import xsna.tjk;
import xsna.tu6;
import xsna.tu8;
import xsna.vrl;
import xsna.w8s;
import xsna.x1b0;
import xsna.y2r0;

/* loaded from: classes12.dex */
public abstract class MediaCodecRenderer extends androidx.media3.exoplayer.a {
    public static final byte[] H0 = {0, 0, 1, 103, 66, -64, AmfConstants.TYPE_DATE_MARKER, -38, 37, -112, 0, 0, 1, 104, -50, AmfConstants.TYPE_XML_DOCUMENT_MARKER, 19, 32, 0, 0, 1, 101, -120, -124, AmfConstants.TYPE_UNSUPPORTED_MARKER, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final DecoderInputBuffer A;
    public boolean A0;
    public final tu6 B;
    public boolean B0;
    public final MediaCodec.BufferInfo C;
    public boolean C0;
    public final ArrayDeque<b> D;
    public long D0;
    public final dw70 E;
    public qzf E0;
    public final AtomicInteger F;
    public qzf F0;

    @Nullable
    public androidx.media3.common.a G;
    public ImmutableSet<String> G0;
    public androidx.media3.common.a H;

    @Nullable
    public DrmSession I;

    @Nullable
    public DrmSession J;
    public j.a K;

    @Nullable
    public MediaCrypto L;
    public final long M;
    public float N;
    public float O;

    @Nullable
    public c P;

    @Nullable
    public androidx.media3.common.a Q;

    @Nullable
    public MediaFormat R;
    public boolean S;
    public float T;

    @Nullable
    public ArrayDeque<hq10> U;

    @Nullable
    public DecoderInitializationException V;

    @Nullable
    public hq10 W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public long b0;
    public long c0;
    public int d0;
    public int e0;

    @Nullable
    public ByteBuffer f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public int l0;
    public int m0;
    public int n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public long r0;
    public boolean s0;
    public final Context t;
    public boolean t0;
    public final c.b u;
    public boolean u0;
    public final e v;
    public boolean v0;
    public final boolean w;

    @Nullable
    public ExoPlaybackException w0;
    public final float x;
    public g8l x0;
    public final DecoderInputBuffer y;
    public b y0;
    public final DecoderInputBuffer z;
    public long z0;

    public final class a {
        public a() {
        }
    }

    public static final class b {
        public static final b f = new b(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET);
        public final long a;
        public final long b;
        public final long c;
        public final dwo0<androidx.media3.common.a> d = new dwo0<>();
        public long e = C.TIME_UNSET;

        public b(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
        }
    }

    public MediaCodecRenderer(Context context, int i, c.b bVar, e eVar, boolean z, float f) {
        super(i);
        this.t = context.getApplicationContext();
        this.u = bVar;
        this.v = eVar;
        this.w = z;
        this.x = f;
        this.F = new AtomicInteger();
        this.y = new DecoderInputBuffer(0);
        this.z = new DecoderInputBuffer(0);
        this.A = new DecoderInputBuffer(2);
        tu6 tu6Var = new tu6(2);
        tu6Var.l = 32;
        this.B = tu6Var;
        this.C = new MediaCodec.BufferInfo();
        this.N = 1.0f;
        this.O = 1.0f;
        this.M = C.TIME_UNSET;
        this.D = new ArrayDeque<>();
        this.y0 = b.f;
        tu6Var.e(0);
        tu6Var.e.order(ByteOrder.nativeOrder());
        dw70 dw70Var = new dw70();
        dw70Var.a = AudioProcessor.a;
        dw70Var.c = 0;
        dw70Var.b = 2;
        this.E = dw70Var;
        this.T = -1.0f;
        this.l0 = 0;
        this.d0 = -1;
        this.e0 = -1;
        this.c0 = C.TIME_UNSET;
        this.r0 = C.TIME_UNSET;
        this.z0 = C.TIME_UNSET;
        this.b0 = C.TIME_UNSET;
        this.m0 = 0;
        this.n0 = 0;
        this.x0 = new g8l();
        this.C0 = false;
        this.D0 = 0L;
        int i2 = ImmutableSet.d;
        this.G0 = i.k;
        qzf qzfVar = qzf.b;
        this.E0 = qzfVar;
        this.F0 = qzfVar;
    }

    public final void C(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry<String, Object> entry : this.E0.a.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(key, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(key, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(key, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(key, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(key, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(key, (ByteBuffer) value);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0316, code lost:
    
        r24.i0 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(long j, long j2) throws ExoPlaybackException {
        tu6 tu6Var;
        int i;
        int i2;
        int i3;
        fxc0.z(!this.t0);
        tu6 tu6Var2 = this.B;
        if (tu6Var2.j()) {
            ByteBuffer byteBuffer = tu6Var2.e;
            int i4 = this.e0;
            int i5 = tu6Var2.k;
            long j3 = tu6Var2.g;
            boolean T = T(this.m, tu6Var2.j);
            boolean b2 = tu6Var2.b(4);
            androidx.media3.common.a aVar = this.H;
            aVar.getClass();
            tu6Var = tu6Var2;
            if (i0(j, j2, null, byteBuffer, i4, 0, i5, j3, T, b2, aVar)) {
                e0(tu6Var.j);
                tu6Var.c();
            }
        }
        tu6Var = tu6Var2;
        if (this.s0) {
            this.t0 = true;
            return false;
        }
        ?? r2 = 0;
        boolean z = this.i0;
        DecoderInputBuffer decoderInputBuffer = this.A;
        if (z) {
            fxc0.z(tu6Var.i(decoderInputBuffer));
            this.i0 = false;
        }
        if (this.j0) {
            if (tu6Var.j()) {
                return true;
            }
            this.h0 = false;
            m0();
            this.j0 = false;
            U();
            if (!this.h0) {
                return false;
            }
        }
        fxc0.z(!this.s0);
        w8s w8sVar = this.d;
        w8sVar.a();
        decoderInputBuffer.c();
        while (true) {
            decoderInputBuffer.c();
            int B = B(w8sVar, decoderInputBuffer, r2);
            if (B == -5) {
                b0(w8sVar);
                break;
            }
            if (B != -4) {
                if (B != -3) {
                    throw new IllegalStateException();
                }
                if (hasReadStreamToEnd()) {
                    P().e = this.r0;
                }
            } else {
                if (decoderInputBuffer.b(4)) {
                    this.s0 = true;
                    P().e = this.r0;
                    break;
                }
                this.r0 = Math.max(this.r0, decoderInputBuffer.g);
                if (hasReadStreamToEnd() || this.z.b(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING)) {
                    P().e = this.r0;
                }
                byte[] bArr = null;
                if (this.u0) {
                    androidx.media3.common.a aVar2 = this.G;
                    aVar2.getClass();
                    this.H = aVar2;
                    if (Objects.equals(aVar2.n, MimeTypes.AUDIO_OPUS) && !this.H.q.isEmpty()) {
                        byte[] bArr2 = this.H.q.get(r2);
                        int i6 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                        a.C0043a a2 = this.H.a();
                        a2.H = i6;
                        this.H = new androidx.media3.common.a(a2);
                    }
                    c0(this.H, null);
                    this.u0 = r2;
                }
                decoderInputBuffer.h();
                androidx.media3.common.a aVar3 = this.H;
                if (aVar3 != null && Objects.equals(aVar3.n, MimeTypes.AUDIO_OPUS)) {
                    if (decoderInputBuffer.b(268435456)) {
                        decoderInputBuffer.c = this.H;
                        R(decoderInputBuffer);
                    }
                    if (this.m - decoderInputBuffer.g <= 80000) {
                        List<byte[]> list = this.H.q;
                        dw70 dw70Var = this.E;
                        dw70Var.getClass();
                        decoderInputBuffer.e.getClass();
                        if (decoderInputBuffer.e.limit() - decoderInputBuffer.e.position() != 0) {
                            if (dw70Var.b == 2 && (list.size() == 1 || list.size() == 3)) {
                                bArr = list.get(r2);
                            }
                            ByteBuffer byteBuffer2 = decoderInputBuffer.e;
                            int position = byteBuffer2.position();
                            int limit = byteBuffer2.limit();
                            int i7 = limit - position;
                            int i8 = (i7 + 255) / 255;
                            int i9 = i8 + 27 + i7;
                            if (dw70Var.b == 2) {
                                i = bArr != null ? bArr.length + 28 : 47;
                                i9 = i + 44 + i9;
                            } else {
                                i = r2;
                            }
                            if (dw70Var.a.capacity() < i9) {
                                dw70Var.a = ByteBuffer.allocate(i9).order(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                dw70Var.a.clear();
                            }
                            ByteBuffer byteBuffer3 = dw70Var.a;
                            if (dw70Var.b == 2) {
                                if (bArr != null) {
                                    dw70.a(byteBuffer3, 0L, 0, 1, true);
                                    i3 = limit;
                                    byteBuffer3.put(hr80.q(bArr.length));
                                    byteBuffer3.put(bArr);
                                    i2 = i;
                                    byteBuffer3.putInt(22, y2r0.n(byteBuffer3.arrayOffset(), bArr.length + 28, 0, byteBuffer3.array()));
                                    byteBuffer3.position(bArr.length + 28);
                                } else {
                                    i2 = i;
                                    i3 = limit;
                                    byteBuffer3.put(dw70.d);
                                }
                                byteBuffer3.put(dw70.e);
                            } else {
                                i2 = i;
                                i3 = limit;
                            }
                            int w = dw70Var.c + ((int) ((hr80.w(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
                            dw70Var.c = w;
                            dw70.a(byteBuffer3, w, dw70Var.b, i8, false);
                            for (int i10 = 0; i10 < i8; i10++) {
                                if (i7 >= 255) {
                                    byteBuffer3.put((byte) -1);
                                    i7 -= 255;
                                } else {
                                    byteBuffer3.put((byte) i7);
                                    i7 = 0;
                                }
                            }
                            int i11 = i3;
                            while (position < i11) {
                                byteBuffer3.put(byteBuffer2.get(position));
                                position++;
                            }
                            byteBuffer2.position(byteBuffer2.limit());
                            byteBuffer3.flip();
                            if (dw70Var.b == 2) {
                                byteBuffer3.putInt(i2 + 66, y2r0.n(byteBuffer3.arrayOffset() + i2 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            } else {
                                byteBuffer3.putInt(22, y2r0.n(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            }
                            dw70Var.b++;
                            dw70Var.a = byteBuffer3;
                            decoderInputBuffer.c();
                            decoderInputBuffer.e(dw70Var.a.remaining());
                            decoderInputBuffer.e.put(dw70Var.a);
                            decoderInputBuffer.h();
                        }
                    }
                }
                if (tu6Var.j()) {
                    long j4 = this.m;
                    if (T(j4, tu6Var.j) != T(j4, decoderInputBuffer.g)) {
                        break;
                    }
                }
                if (!tu6Var.i(decoderInputBuffer)) {
                    break;
                }
                r2 = 0;
            }
        }
        if (tu6Var.j()) {
            tu6Var.h();
        }
        return tu6Var.j() || this.s0 || this.j0;
    }

    public abstract n8l E(hq10 hq10Var, androidx.media3.common.a aVar, androidx.media3.common.a aVar2);

    public MediaCodecDecoderException F(IllegalStateException illegalStateException, @Nullable hq10 hq10Var) {
        return new MediaCodecDecoderException(illegalStateException, hq10Var);
    }

    public final boolean G() throws ExoPlaybackException {
        if (!this.o0) {
            y0();
            return true;
        }
        this.m0 = 1;
        this.n0 = 2;
        return true;
    }

    public final boolean H(long j, long j2) throws ExoPlaybackException {
        int valueTypeForKey;
        c cVar = this.P;
        cVar.getClass();
        int i = this.e0;
        MediaCodec.BufferInfo bufferInfo = this.C;
        if (i < 0) {
            int e = cVar.e(bufferInfo);
            if (e < 0) {
                if (e != -2) {
                    if (this.a0 && (this.s0 || this.m0 == 2)) {
                        h0();
                    }
                    long j3 = this.b0;
                    if (j3 != C.TIME_UNSET) {
                        long j4 = j3 + 100;
                        dvf dvfVar = this.h;
                        dvfVar.getClass();
                        if (j4 < dvfVar.currentTimeMillis()) {
                            h0();
                            return false;
                        }
                    }
                    return false;
                }
                this.q0 = true;
                c cVar2 = this.P;
                cVar2.getClass();
                MediaFormat outputFormat = cVar2.getOutputFormat();
                if (Build.VERSION.SDK_INT >= 29 && !this.G0.isEmpty()) {
                    ImmutableSet<String> immutableSet = this.G0;
                    qzf qzfVar = qzf.b;
                    HashMap hashMap = new HashMap();
                    for (String str : immutableSet) {
                        if (outputFormat.containsKey(str)) {
                            valueTypeForKey = outputFormat.getValueTypeForKey(str);
                            if (valueTypeForKey == 1) {
                                hashMap.put(str, Integer.valueOf(outputFormat.getInteger(str)));
                            } else if (valueTypeForKey == 2) {
                                hashMap.put(str, Long.valueOf(outputFormat.getLong(str)));
                            } else if (valueTypeForKey == 3) {
                                hashMap.put(str, Float.valueOf(outputFormat.getFloat(str)));
                            } else if (valueTypeForKey == 4) {
                                hashMap.put(str, outputFormat.getString(str));
                            } else if (valueTypeForKey == 5) {
                                ByteBuffer byteBuffer = outputFormat.getByteBuffer(str);
                                if (byteBuffer == null) {
                                    hashMap.put(str, null);
                                } else {
                                    ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                                    allocate.put(byteBuffer.duplicate());
                                    allocate.flip();
                                    hashMap.put(str, allocate);
                                }
                            }
                        }
                    }
                    qzf qzfVar2 = new qzf(hashMap);
                    if (!qzfVar2.equals(this.F0)) {
                        this.F0 = qzfVar2;
                        Z(qzfVar2);
                    }
                }
                this.R = outputFormat;
                this.S = true;
                return true;
            }
            bufferInfo.presentationTimeUs -= this.D0;
            if (this.Z) {
                this.Z = false;
                cVar.d(e);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                h0();
                return false;
            }
            this.e0 = e;
            ByteBuffer outputBuffer = cVar.getOutputBuffer(e);
            this.f0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo.offset);
                this.f0.limit(bufferInfo.offset + bufferInfo.size);
            }
            z0(bufferInfo.presentationTimeUs);
        }
        boolean z = this.C0 || bufferInfo.presentationTimeUs < this.m;
        long j5 = this.y0.e;
        boolean z2 = j5 != C.TIME_UNSET && j5 <= bufferInfo.presentationTimeUs;
        this.g0 = z2;
        ByteBuffer byteBuffer2 = this.f0;
        int i2 = this.e0;
        int i3 = bufferInfo.flags;
        long j6 = bufferInfo.presentationTimeUs;
        androidx.media3.common.a aVar = this.H;
        aVar.getClass();
        if (!i0(j, j2, cVar, byteBuffer2, i2, i3, 1, j6, z, z2, aVar)) {
            return false;
        }
        e0(bufferInfo.presentationTimeUs);
        boolean z3 = (bufferInfo.flags & 4) != 0;
        if (!z3 && this.p0 && this.g0) {
            dvf dvfVar2 = this.h;
            dvfVar2.getClass();
            this.b0 = dvfVar2.currentTimeMillis();
        }
        this.e0 = -1;
        this.f0 = null;
        if (!z3) {
            return true;
        }
        h0();
        return false;
    }

    public final boolean I() throws ExoPlaybackException {
        c cVar = this.P;
        if (cVar != null && this.m0 != 2 && !this.s0) {
            int i = this.d0;
            DecoderInputBuffer decoderInputBuffer = this.z;
            if (i < 0) {
                int j = cVar.j();
                this.d0 = j;
                if (j >= 0) {
                    decoderInputBuffer.e = cVar.getInputBuffer(j);
                    decoderInputBuffer.c();
                }
            }
            if (this.m0 == 1) {
                if (!this.a0) {
                    this.p0 = true;
                    cVar.a(this.d0, 0, 4, 0L);
                    this.d0 = -1;
                    decoderInputBuffer.e = null;
                }
                this.m0 = 2;
                return false;
            }
            if (this.Y) {
                this.Y = false;
                ByteBuffer byteBuffer = decoderInputBuffer.e;
                byteBuffer.getClass();
                byteBuffer.put(H0);
                cVar.a(this.d0, 38, 0, 0L);
                this.d0 = -1;
                decoderInputBuffer.e = null;
                this.o0 = true;
                return true;
            }
            if (this.l0 == 1) {
                int i2 = 0;
                while (true) {
                    androidx.media3.common.a aVar = this.Q;
                    aVar.getClass();
                    if (i2 >= aVar.q.size()) {
                        break;
                    }
                    byte[] bArr = this.Q.q.get(i2);
                    ByteBuffer byteBuffer2 = decoderInputBuffer.e;
                    byteBuffer2.getClass();
                    byteBuffer2.put(bArr);
                    i2++;
                }
                this.l0 = 2;
            }
            ByteBuffer byteBuffer3 = decoderInputBuffer.e;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            w8s w8sVar = this.d;
            w8sVar.a();
            try {
                cVar.l(new vrl(3, this, w8sVar));
                int i3 = this.F.get();
                if (i3 == -3) {
                    if (hasReadStreamToEnd()) {
                        P().e = this.r0;
                        return false;
                    }
                } else {
                    if (i3 == -5) {
                        if (this.l0 == 2) {
                            decoderInputBuffer.c();
                            this.l0 = 1;
                        }
                        b0(w8sVar);
                        return true;
                    }
                    if (!decoderInputBuffer.b(4)) {
                        if (this.o0 || decoderInputBuffer.b(1)) {
                            long j2 = decoderInputBuffer.g;
                            if (!r0(decoderInputBuffer)) {
                                boolean b2 = decoderInputBuffer.b(1073741824);
                                if (b2) {
                                    tjk tjkVar = decoderInputBuffer.d;
                                    if (position == 0) {
                                        tjkVar.getClass();
                                    } else {
                                        if (tjkVar.d == null) {
                                            int[] iArr = new int[1];
                                            tjkVar.d = iArr;
                                            tjkVar.i.numBytesOfClearData = iArr;
                                        }
                                        int[] iArr2 = tjkVar.d;
                                        iArr2[0] = iArr2[0] + position;
                                    }
                                }
                                if (this.u0) {
                                    dwo0<androidx.media3.common.a> dwo0Var = P().d;
                                    androidx.media3.common.a aVar2 = this.G;
                                    aVar2.getClass();
                                    dwo0Var.a(j2, aVar2);
                                    this.u0 = false;
                                }
                                this.r0 = Math.max(this.r0, j2);
                                if (hasReadStreamToEnd() || decoderInputBuffer.b(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING)) {
                                    P().e = this.r0;
                                }
                                decoderInputBuffer.h();
                                if (decoderInputBuffer.b(268435456)) {
                                    R(decoderInputBuffer);
                                }
                                if (this.C0) {
                                    long j3 = this.r0;
                                    if (j2 <= j3) {
                                        this.D0 = (j3 - j2) + 1 + this.D0;
                                    }
                                    this.r0 = j2;
                                    this.C0 = false;
                                }
                                g0(decoderInputBuffer);
                                int L = L(decoderInputBuffer);
                                long j4 = j2 + this.D0;
                                if (b2) {
                                    cVar.b(this.d0, decoderInputBuffer.d, j4, L);
                                } else {
                                    int i4 = this.d0;
                                    ByteBuffer byteBuffer4 = decoderInputBuffer.e;
                                    byteBuffer4.getClass();
                                    cVar.a(i4, byteBuffer4.limit(), L, j4);
                                }
                                this.d0 = -1;
                                decoderInputBuffer.e = null;
                                this.o0 = true;
                                this.l0 = 0;
                                this.x0.c++;
                                return true;
                            }
                        } else {
                            decoderInputBuffer.c();
                            if (this.l0 == 2) {
                                this.l0 = 1;
                                return true;
                            }
                        }
                        return true;
                    }
                    P().e = this.r0;
                    if (this.l0 == 2) {
                        decoderInputBuffer.c();
                        this.l0 = 1;
                    }
                    this.s0 = true;
                    if (!this.o0) {
                        h0();
                        return false;
                    }
                    if (!this.a0) {
                        this.p0 = true;
                        cVar.a(this.d0, 0, 4, 0L);
                        this.d0 = -1;
                        decoderInputBuffer.e = null;
                        return false;
                    }
                }
            } catch (DecoderInputBuffer.InsufficientCapacityException e) {
                X(e);
                j0(0);
                J();
                return true;
            }
        }
        return false;
    }

    public final void J() {
        try {
            c cVar = this.P;
            cVar.getClass();
            cVar.flush();
        } finally {
            n0();
        }
    }

    public final List<hq10> K(boolean z) throws MediaCodecUtil.DecoderQueryException {
        androidx.media3.common.a aVar = this.G;
        aVar.getClass();
        e eVar = this.v;
        ArrayList N = N(eVar, aVar, z);
        if (!N.isEmpty() || !z) {
            return N;
        }
        ArrayList N2 = N(eVar, aVar, false);
        if (!N2.isEmpty()) {
            ahn.F("Drm session requires secure decoder for " + aVar.n + ", but no secure decoder available. Trying to proceed with " + N2 + ".");
        }
        return N2;
    }

    public int L(DecoderInputBuffer decoderInputBuffer) {
        return 0;
    }

    public abstract float M(float f, androidx.media3.common.a aVar, androidx.media3.common.a[] aVarArr);

    public abstract ArrayList N(e eVar, androidx.media3.common.a aVar, boolean z) throws MediaCodecUtil.DecoderQueryException;

    public long O(long j, long j2) {
        return super.o(j, j2);
    }

    public final b P() {
        ArrayDeque<b> arrayDeque = this.D;
        return !arrayDeque.isEmpty() ? arrayDeque.getLast() : this.y0;
    }

    public abstract c.a Q(hq10 hq10Var, androidx.media3.common.a aVar, @Nullable MediaCrypto mediaCrypto, float f);

    public abstract void R(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException;

    public final void S(hq10 hq10Var, @Nullable MediaCrypto mediaCrypto) throws Exception {
        boolean equals;
        String stringId;
        LogSessionId unused;
        this.W = hq10Var;
        androidx.media3.common.a aVar = this.G;
        aVar.getClass();
        String str = hq10Var.a;
        float f = this.O;
        androidx.media3.common.a[] aVarArr = this.k;
        aVarArr.getClass();
        float M = M(f, aVar, aVarArr);
        if (M <= this.x) {
            M = -1.0f;
        }
        dvf dvfVar = this.h;
        dvfVar.getClass();
        long elapsedRealtime = dvfVar.elapsedRealtime();
        c.a Q = Q(hq10Var, aVar, mediaCrypto, M);
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            x1b0 x1b0Var = this.g;
            x1b0Var.getClass();
            LogSessionId a2 = x1b0Var.a();
            unused = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a2.equals(LogSessionId.LOG_SESSION_ID_NONE);
            if (!equals) {
                MediaFormat mediaFormat = Q.b;
                stringId = a2.getStringId();
                mediaFormat.setString("log-session-id", stringId);
            }
        }
        try {
            Trace.beginSection("createCodec:" + str);
            c a3 = this.u.a(Q);
            this.P = a3;
            a3.g(new a());
            Trace.endSection();
            dvf dvfVar2 = this.h;
            dvfVar2.getClass();
            long elapsedRealtime2 = dvfVar2.elapsedRealtime();
            if (!hq10Var.e(this.t, aVar)) {
                String d = androidx.media3.common.a.d(aVar);
                Locale locale = Locale.US;
                ahn.F("Format exceeds selected codec's capabilities [" + d + ", " + str + X3.j.e);
            }
            this.T = M;
            this.Q = aVar;
            boolean z = false;
            this.X = i == 29 && "c2.android.aac.decoder".equals(str);
            String str2 = hq10Var.a;
            if ((i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2) || "OMX.bcm.vdec.avc.tunnel".equals(str2) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str2) || "OMX.bcm.vdec.hevc.tunnel".equals(str2) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && hq10Var.g)) {
                z = true;
            }
            this.a0 = z;
            this.P.getClass();
            if (this.i == 2) {
                dvf dvfVar3 = this.h;
                dvfVar3.getClass();
                this.c0 = dvfVar3.elapsedRealtime() + 1000;
            }
            this.x0.a++;
            long j = elapsedRealtime2 - elapsedRealtime;
            if (i >= 31 && !this.G0.isEmpty()) {
                c cVar = this.P;
                cVar.getClass();
                cVar.k(new ArrayList(this.G0));
            }
            Y(str, elapsedRealtime2, j);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean T(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        androidx.media3.common.a aVar = this.H;
        return aVar == null || !Objects.equals(aVar.n, MimeTypes.AUDIO_OPUS) || j - j2 > 80000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        if (r8 != 4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r2.getError() != null) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U() throws ExoPlaybackException {
        androidx.media3.common.a aVar;
        MediaCrypto mediaCrypto;
        if (this.P != null || this.h0 || (aVar = this.G) == null) {
            return;
        }
        String str = aVar.n;
        boolean z = true;
        if (this.J == null && v0(aVar)) {
            this.h0 = false;
            m0();
            boolean equals = "audio/mp4a-latm".equals(str);
            tu6 tu6Var = this.B;
            if (equals || MimeTypes.AUDIO_MPEG.equals(str) || MimeTypes.AUDIO_OPUS.equals(str)) {
                tu6Var.getClass();
                tu6Var.l = 32;
            } else {
                tu6Var.getClass();
                tu6Var.l = 1;
            }
            this.h0 = true;
            return;
        }
        p0(this.J);
        if (this.I != null) {
            fxc0.z(this.L == null);
            DrmSession drmSession = this.I;
            rjk d = drmSession.d();
            if (kgs.a && (d instanceof kgs)) {
                int state = drmSession.getState();
                if (state == 1) {
                    DrmSession.DrmSessionException error = drmSession.getError();
                    error.getClass();
                    throw r(error, this.G, false, error.errorCode);
                }
            }
            if (d != null) {
                if (d instanceof kgs) {
                    try {
                        this.L = new MediaCrypto(null, null);
                    } catch (MediaCryptoException e) {
                        throw r(e, this.G, false, AuthCode.StatusCode.PERMISSION_EXPIRED);
                    }
                }
            }
        }
        try {
            DrmSession drmSession2 = this.I;
            if (drmSession2 != null) {
                if (drmSession2.getState() != 3) {
                    if (this.I.getState() == 4) {
                    }
                }
                DrmSession drmSession3 = this.I;
                str.getClass();
                if (drmSession3.f(str)) {
                    V(this.L, z);
                    mediaCrypto = this.L;
                    if (mediaCrypto == null && this.P == null) {
                        mediaCrypto.release();
                        this.L = null;
                        return;
                    }
                }
            }
            z = false;
            V(this.L, z);
            mediaCrypto = this.L;
            if (mediaCrypto == null) {
            }
        } catch (DecoderInitializationException e2) {
            throw r(e2, aVar, false, 4001);
        }
    }

    public final void V(@Nullable MediaCrypto mediaCrypto, boolean z) throws DecoderInitializationException, ExoPlaybackException {
        androidx.media3.common.a aVar = this.G;
        aVar.getClass();
        if (this.U == null) {
            try {
                List<hq10> K = K(z);
                ArrayDeque<hq10> arrayDeque = new ArrayDeque<>();
                this.U = arrayDeque;
                if (this.w) {
                    arrayDeque.addAll(K);
                } else {
                    ArrayList arrayList = (ArrayList) K;
                    if (!arrayList.isEmpty()) {
                        this.U.add((hq10) arrayList.get(0));
                    }
                }
                this.V = null;
            } catch (MediaCodecUtil.DecoderQueryException e) {
                throw new DecoderInitializationException(aVar, e, z, -49998);
            }
        }
        if (this.U.isEmpty()) {
            throw new DecoderInitializationException(aVar, null, z, -49999);
        }
        ArrayDeque<hq10> arrayDeque2 = this.U;
        arrayDeque2.getClass();
        while (this.P == null) {
            hq10 peekFirst = arrayDeque2.peekFirst();
            peekFirst.getClass();
            if (!W(aVar) || !t0(peekFirst)) {
                return;
            }
            try {
                S(peekFirst, mediaCrypto);
            } catch (Exception e2) {
                ahn.G("Failed to initialize decoder: " + peekFirst, e2);
                arrayDeque2.removeFirst();
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException("Decoder init failed: " + peekFirst.a + ", " + aVar, e2, aVar.n, z, peekFirst, e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null, null);
                X(decoderInitializationException);
                DecoderInitializationException decoderInitializationException2 = this.V;
                if (decoderInitializationException2 == null) {
                    this.V = decoderInitializationException;
                } else {
                    this.V = new DecoderInitializationException(decoderInitializationException2.getMessage(), decoderInitializationException2.getCause(), decoderInitializationException2.mimeType, decoderInitializationException2.secureDecoderRequired, decoderInitializationException2.codecInfo, decoderInitializationException2.diagnosticInfo, decoderInitializationException);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.V;
                }
            }
        }
        this.U = null;
    }

    public boolean W(androidx.media3.common.a aVar) throws ExoPlaybackException {
        return true;
    }

    public abstract void X(Exception exc);

    public abstract void Y(String str, long j, long j2);

    public abstract void Z(qzf qzfVar);

    @Override // androidx.media3.exoplayer.k
    public final int a(androidx.media3.common.a aVar) throws ExoPlaybackException {
        try {
            return w0(this.v, aVar);
        } catch (MediaCodecUtil.DecoderQueryException e) {
            throw r(e, aVar, false, 4002);
        }
    }

    public abstract void a0(String str);

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00df, code lost:
    
        if (r4.f(r2) != false) goto L109;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n8l b0(w8s w8sVar) throws ExoPlaybackException {
        androidx.media3.common.a aVar;
        int i;
        rjk d;
        rjk d2;
        this.u0 = true;
        androidx.media3.common.a aVar2 = w8sVar.b;
        aVar2.getClass();
        String str = aVar2.n;
        if (str == null) {
            throw r(new IllegalArgumentException("Sample MIME type is null."), aVar2, false, 4005);
        }
        if ((str.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_AV1) || str.equals(MimeTypes.VIDEO_VP9)) && !aVar2.q.isEmpty()) {
            a.C0043a a2 = aVar2.a();
            a2.p = null;
            aVar = new androidx.media3.common.a(a2);
        } else {
            aVar = aVar2;
        }
        DrmSession drmSession = w8sVar.a;
        DrmSession drmSession2 = this.J;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                drmSession.e(null);
            }
            if (drmSession2 != null) {
                drmSession2.b(null);
            }
        }
        this.J = drmSession;
        this.G = aVar;
        if (this.h0) {
            this.j0 = true;
            return null;
        }
        c cVar = this.P;
        if (cVar == null) {
            this.U = null;
            U();
            return null;
        }
        hq10 hq10Var = this.W;
        hq10Var.getClass();
        androidx.media3.common.a aVar3 = this.Q;
        aVar3.getClass();
        DrmSession drmSession3 = this.I;
        DrmSession drmSession4 = this.J;
        if (drmSession3 != drmSession4) {
            if (drmSession4 != null && drmSession3 != null && (d = drmSession4.d()) != null && (d2 = drmSession3.d()) != null && d.getClass().equals(d2.getClass())) {
                if (d instanceof kgs) {
                    if (drmSession4.c().equals(drmSession3.c())) {
                        UUID uuid = tu8.e;
                        if (!uuid.equals(drmSession3.c()) && !uuid.equals(drmSession4.c())) {
                            if (!hq10Var.g) {
                                if (drmSession4.getState() != 2) {
                                    if (drmSession4.getState() == 3 || drmSession4.getState() == 4) {
                                        String str2 = aVar.n;
                                        str2.getClass();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (this.o0) {
                this.m0 = 1;
                this.n0 = 3;
            } else {
                k0();
                U();
            }
            return new n8l(hq10Var.a, aVar3, aVar, 0, 128);
        }
        boolean z = this.J != this.I;
        n8l E = E(hq10Var, aVar3, aVar);
        int i2 = E.d;
        if (i2 != 0) {
            if (i2 == 1) {
                if (x0(aVar)) {
                    this.Q = aVar;
                    if (z) {
                        G();
                    } else if (this.o0) {
                        this.m0 = 1;
                        this.n0 = 1;
                    }
                }
                i = 16;
            } else if (i2 == 2) {
                if (x0(aVar)) {
                    this.k0 = true;
                    this.l0 = 1;
                    this.Y = false;
                    this.Q = aVar;
                    if (z) {
                        G();
                    }
                }
                i = 16;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException();
                }
                if (x0(aVar)) {
                    this.Q = aVar;
                    if (z) {
                        G();
                    }
                }
                i = 16;
            }
            return (i2 != 0 || (this.P == cVar && this.n0 != 3)) ? E : new n8l(hq10Var.a, aVar3, aVar, 0, i);
        }
        if (this.o0) {
            this.m0 = 1;
            this.n0 = 3;
        } else {
            k0();
            U();
        }
        i = 0;
        if (i2 != 0) {
        }
    }

    public abstract void c0(androidx.media3.common.a aVar, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException;

    public void e0(long j) {
        this.z0 = j;
        while (true) {
            ArrayDeque<b> arrayDeque = this.D;
            if (arrayDeque.isEmpty() || j < arrayDeque.peek().a) {
                return;
            }
            b poll = arrayDeque.poll();
            poll.getClass();
            q0(poll);
            f0();
        }
    }

    public abstract void f0();

    public final void h0() throws ExoPlaybackException {
        int i = this.n0;
        if (i == 1) {
            J();
            return;
        }
        if (i == 2) {
            J();
            y0();
        } else if (i != 3) {
            this.t0 = true;
            l0();
        } else {
            k0();
            U();
        }
    }

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.i.b
    public void handleMessage(int i, @Nullable Object obj) throws ExoPlaybackException {
        int i2;
        if (i == 11) {
            j.a aVar = (j.a) obj;
            aVar.getClass();
            this.K = aVar;
            return;
        }
        if (i != 21) {
            if (i == 22 && (i2 = Build.VERSION.SDK_INT) >= 29) {
                obj.getClass();
                ImmutableSet<String> immutableSet = (ImmutableSet) obj;
                if (this.G0.equals(immutableSet)) {
                    return;
                }
                if (i2 >= 31) {
                    HashSet hashSet = new HashSet(immutableSet);
                    HashSet hashSet2 = new HashSet();
                    s4q0<String> it = this.G0.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (!hashSet.remove(next)) {
                            hashSet2.add(next);
                        }
                    }
                    c cVar = this.P;
                    if (cVar != null) {
                        if (!hashSet2.isEmpty()) {
                            cVar.f(new ArrayList(hashSet2));
                        }
                        if (!hashSet.isEmpty()) {
                            cVar.k(new ArrayList(hashSet));
                        }
                    }
                }
                this.G0 = immutableSet;
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            obj.getClass();
            qzf qzfVar = (qzf) obj;
            this.E0 = qzfVar;
            c cVar2 = this.P;
            if (cVar2 != null) {
                Bundle bundle = new Bundle();
                for (Map.Entry<String, Object> entry : qzfVar.a.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        if (value instanceof Integer) {
                            bundle.putInt(key, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            bundle.putLong(key, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            bundle.putFloat(key, ((Float) value).floatValue());
                        } else if (value instanceof String) {
                            bundle.putString(key, (String) value);
                        } else if (value instanceof ByteBuffer) {
                            ByteBuffer byteBuffer = (ByteBuffer) value;
                            byte[] bArr = new byte[byteBuffer.remaining()];
                            byteBuffer.duplicate().get(bArr);
                            bundle.putByteArray(key, bArr);
                        }
                    }
                }
                cVar2.setParameters(bundle);
            }
        }
    }

    public abstract boolean i0(long j, long j2, @Nullable c cVar, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, androidx.media3.common.a aVar) throws ExoPlaybackException;

    public final boolean j0(int i) throws ExoPlaybackException {
        w8s w8sVar = this.d;
        w8sVar.a();
        DecoderInputBuffer decoderInputBuffer = this.y;
        decoderInputBuffer.c();
        int B = B(w8sVar, decoderInputBuffer, i | 4);
        if (B == -5) {
            b0(w8sVar);
            return true;
        }
        if (B != -4 || !decoderInputBuffer.b(4)) {
            return false;
        }
        this.s0 = true;
        h0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k0() {
        try {
            c cVar = this.P;
            if (cVar != null) {
                cVar.release();
                this.x0.b++;
                hq10 hq10Var = this.W;
                hq10Var.getClass();
                a0(hq10Var.a);
            }
            this.P = null;
            try {
                MediaCrypto mediaCrypto = this.L;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.P = null;
            try {
                MediaCrypto mediaCrypto2 = this.L;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public abstract void l0() throws ExoPlaybackException;

    public final void m0() {
        this.r0 = C.TIME_UNSET;
        P().e = C.TIME_UNSET;
        this.z0 = C.TIME_UNSET;
        this.j0 = false;
        this.B.c();
        this.A.c();
        this.i0 = false;
        dw70 dw70Var = this.E;
        dw70Var.getClass();
        dw70Var.a = AudioProcessor.a;
        dw70Var.c = 0;
        dw70Var.b = 2;
    }

    public void n0() {
        this.d0 = -1;
        this.z.e = null;
        this.e0 = -1;
        this.f0 = null;
        this.r0 = C.TIME_UNSET;
        P().e = C.TIME_UNSET;
        this.z0 = C.TIME_UNSET;
        this.c0 = C.TIME_UNSET;
        this.p0 = false;
        this.b0 = C.TIME_UNSET;
        this.o0 = false;
        this.Y = false;
        this.Z = false;
        this.g0 = false;
        this.m0 = 0;
        this.n0 = 0;
        this.l0 = this.k0 ? 1 : 0;
        this.C0 = false;
        this.D0 = 0L;
    }

    @Override // androidx.media3.exoplayer.j
    public final long o(long j, long j2) {
        return O(j, j2);
    }

    public final void o0() {
        n0();
        this.w0 = null;
        this.U = null;
        this.W = null;
        this.Q = null;
        this.R = null;
        this.S = false;
        this.q0 = false;
        this.T = -1.0f;
        this.X = false;
        this.a0 = false;
        this.k0 = false;
        this.l0 = 0;
    }

    public final void p0(@Nullable DrmSession drmSession) {
        DrmSession drmSession2 = this.I;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                drmSession.e(null);
            }
            if (drmSession2 != null) {
                drmSession2.b(null);
            }
        }
        this.I = drmSession;
    }

    @Override // androidx.media3.exoplayer.j
    public void q(float f, float f2) throws ExoPlaybackException {
        this.N = f;
        this.O = f2;
        x0(this.Q);
    }

    public final void q0(b bVar) {
        this.y0 = bVar;
        long j = bVar.c;
        if (j != C.TIME_UNSET) {
            this.A0 = true;
            d0(j);
        }
    }

    public boolean r0(DecoderInputBuffer decoderInputBuffer) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0078 A[LOOP:1: B:33:0x0053->B:42:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079 A[EDGE_INSN: B:43:0x0079->B:44:? BREAK  A[LOOP:1: B:33:0x0053->B:42:0x0078], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099 A[LOOP:2: B:45:0x0079->B:54:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a A[EDGE_INSN: B:55:0x009a->B:56:0x009a BREAK  A[LOOP:2: B:45:0x0079->B:54:0x0099], SYNTHETIC] */
    @Override // androidx.media3.exoplayer.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void render(long j, long j2) throws ExoPlaybackException {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.v0) {
            this.v0 = false;
            h0();
        }
        ExoPlaybackException exoPlaybackException = this.w0;
        if (exoPlaybackException != null) {
            this.w0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.t0) {
                l0();
                return;
            }
            if (this.G != null || j0(2)) {
                U();
                if (this.h0) {
                    Trace.beginSection("bypassRender");
                    while (D(j, j2)) {
                    }
                    Trace.endSection();
                } else if (this.P != null) {
                    dvf dvfVar = this.h;
                    dvfVar.getClass();
                    long elapsedRealtime = dvfVar.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (H(j, j2)) {
                        long j3 = this.M;
                        if (j3 != C.TIME_UNSET) {
                            dvf dvfVar2 = this.h;
                            dvfVar2.getClass();
                            if (dvfVar2.elapsedRealtime() - elapsedRealtime >= j3) {
                                z2 = false;
                                if (z2) {
                                    break;
                                }
                            }
                        }
                        z2 = true;
                        if (z2) {
                        }
                    }
                    while (I()) {
                        long j4 = this.M;
                        if (j4 != C.TIME_UNSET) {
                            dvf dvfVar3 = this.h;
                            dvfVar3.getClass();
                            if (dvfVar3.elapsedRealtime() - elapsedRealtime >= j4) {
                                z = false;
                                if (z) {
                                    break;
                                }
                            }
                        }
                        z = true;
                        if (z) {
                        }
                    }
                    Trace.endSection();
                } else {
                    g8l g8lVar = this.x0;
                    int i = g8lVar.d;
                    m0h0 m0h0Var = this.j;
                    m0h0Var.getClass();
                    g8lVar.d = i + m0h0Var.skipData(j - this.l);
                    j0(1);
                }
                synchronized (this.x0) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw r(e, this.G, false, y2r0.A(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            boolean z4 = e2 instanceof MediaCodec.CodecException;
            if (!z4) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            X(e2);
            if (z4 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z3 = true;
            }
            if (z3) {
                k0();
            }
            MediaCodecDecoderException F = F(e2, this.W);
            throw r(F, this.G, z3, F.errorCode == 1101 ? 4006 : 4003);
        }
    }

    @Override // androidx.media3.exoplayer.a
    public void s() {
        this.G = null;
        q0(b.f);
        this.D.clear();
        if (this.h0) {
            this.h0 = false;
            m0();
        } else {
            if (this.P == null) {
                return;
            }
            if (u0()) {
                k0();
            } else if (s0()) {
                J();
            } else {
                this.C0 = true;
            }
        }
    }

    public boolean s0() {
        return true;
    }

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.k
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public boolean t0(hq10 hq10Var) {
        return true;
    }

    @Override // androidx.media3.exoplayer.a
    public void u(long j, boolean z, boolean z2) throws ExoPlaybackException {
        ArrayDeque<b> arrayDeque = this.D;
        if (!arrayDeque.isEmpty()) {
            this.y0 = arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.s0 = false;
            this.t0 = false;
            this.v0 = false;
            if (this.h0) {
                m0();
            } else if (this.P != null) {
                if (u0()) {
                    k0();
                    U();
                } else if (s0()) {
                    J();
                } else {
                    this.C0 = true;
                }
            }
            if (this.y0.d.h() > 0) {
                this.u0 = true;
            }
            this.y0.d.b();
        }
    }

    public boolean u0() {
        int i = this.n0;
        if (i == 3 || (this.X && !this.q0)) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            y0();
            return false;
        } catch (ExoPlaybackException e) {
            ahn.G("Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    public boolean v0(androidx.media3.common.a aVar) {
        return false;
    }

    public abstract int w0(e eVar, androidx.media3.common.a aVar) throws MediaCodecUtil.DecoderQueryException;

    public final boolean x0(@Nullable androidx.media3.common.a aVar) throws ExoPlaybackException {
        if (this.P != null && this.n0 != 3 && this.i != 0) {
            float f = this.O;
            aVar.getClass();
            androidx.media3.common.a[] aVarArr = this.k;
            aVarArr.getClass();
            float M = M(f, aVar, aVarArr);
            float f2 = this.T;
            if (f2 != M) {
                if (M == -1.0f) {
                    if (this.o0) {
                        this.m0 = 1;
                        this.n0 = 3;
                        return false;
                    }
                    k0();
                    U();
                    return false;
                }
                if (f2 != -1.0f || M > this.x) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", M);
                    c cVar = this.P;
                    cVar.getClass();
                    cVar.setParameters(bundle);
                    this.T = M;
                }
            }
        }
        return true;
    }

    public final void y0() throws ExoPlaybackException {
        DrmSession drmSession = this.J;
        drmSession.getClass();
        rjk d = drmSession.d();
        if (d instanceof kgs) {
            try {
                MediaCrypto mediaCrypto = this.L;
                mediaCrypto.getClass();
                ((kgs) d).getClass();
                mediaCrypto.setMediaDrmSession(null);
            } catch (MediaCryptoException e) {
                throw r(e, this.G, false, AuthCode.StatusCode.PERMISSION_EXPIRED);
            }
        }
        p0(this.J);
        this.m0 = 0;
        this.n0 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // androidx.media3.exoplayer.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void z(androidx.media3.common.a[] aVarArr, long j, long j2, i.b bVar) throws ExoPlaybackException {
        if (this.y0.c == C.TIME_UNSET) {
            q0(new b(C.TIME_UNSET, j, j2));
            if (this.B0) {
                f0();
                return;
            }
            return;
        }
        ArrayDeque<b> arrayDeque = this.D;
        if (arrayDeque.isEmpty()) {
            long j3 = this.r0;
            if (j3 != C.TIME_UNSET) {
                long j4 = this.z0;
                if (j4 != C.TIME_UNSET) {
                }
            }
            q0(new b(C.TIME_UNSET, j, j2));
            if (this.y0.c != C.TIME_UNSET) {
                f0();
                return;
            }
            return;
        }
        arrayDeque.add(new b(this.r0, j, j2));
    }

    public final void z0(long j) throws ExoPlaybackException {
        androidx.media3.common.a f = this.y0.d.f(j);
        if (f == null && this.A0 && this.R != null) {
            f = this.y0.d.e();
        }
        if (f != null) {
            this.H = f;
        } else if (!this.S || this.H == null) {
            return;
        }
        androidx.media3.common.a aVar = this.H;
        aVar.getClass();
        c0(aVar, this.R);
        this.S = false;
        this.A0 = false;
    }

    public static class DecoderInitializationException extends Exception {

        @Nullable
        public final hq10 codecInfo;

        @Nullable
        public final String diagnosticInfo;

        @Nullable
        public final DecoderInitializationException fallbackDecoderInitializationException;

        @Nullable
        public final String mimeType;
        public final boolean secureDecoderRequired;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public DecoderInitializationException(androidx.media3.common.a aVar, @Nullable MediaCodecUtil.DecoderQueryException decoderQueryException, boolean z, int i) {
            this(r3, decoderQueryException, r5, z, null, r11.toString(), null);
            String str = "Decoder init failed: [" + i + "], " + aVar;
            String str2 = aVar.n;
            StringBuilder c = r11.c("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_", i < 0 ? "neg_" : "");
            c.append(Math.abs(i));
        }

        public DecoderInitializationException(@Nullable String str, @Nullable Throwable th, @Nullable String str2, boolean z, @Nullable hq10 hq10Var, @Nullable String str3, @Nullable DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z;
            this.codecInfo = hq10Var;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }
    }

    public void d0(long j) {
    }

    public void g0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }
}
