package androidx.media3.transformer;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.transformer.ExportException;
import com.google.common.collect.ImmutableList;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import xsna.a7l;
import xsna.ahn;
import xsna.efz;
import xsna.fi20;
import xsna.fxc0;
import xsna.io20;
import xsna.lhg;
import xsna.m6g;
import xsna.tzf;
import xsna.y2r0;

/* compiled from: DefaultCodec.java */
/* loaded from: classes12.dex */
public final class i implements e {
    public final MediaCodec.BufferInfo a;
    public final MediaFormat b;
    public final androidx.media3.common.a c;
    public final MediaCodec d;

    @Nullable
    public final Surface e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final AtomicBoolean i;
    public androidx.media3.common.a j;

    @Nullable
    public ByteBuffer k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:19:0x0052, B:21:0x0061, B:23:0x0067, B:25:0x006f, B:29:0x0078, B:32:0x0084, B:33:0x0088), top: B:18:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(Context context, androidx.media3.common.a aVar, MediaFormat mediaFormat, String str, boolean z, @Nullable Surface surface) throws ExportException {
        int i;
        Object[] objArr;
        Surface surface2;
        MediaCodec mediaCodec;
        this.c = aVar;
        this.b = mediaFormat;
        this.g = z;
        String str2 = aVar.n;
        str2.getClass();
        boolean p = io20.p(str2);
        this.h = p;
        this.a = new MediaCodec.BufferInfo();
        this.l = -1;
        this.m = -1;
        this.i = new AtomicBoolean();
        LinkedHashMap linkedHashMap = a7l.a;
        try {
            try {
                synchronized (a7l.class) {
                    synchronized (a7l.class) {
                    }
                    i = Build.VERSION.SDK_INT;
                    boolean z2 = false;
                    if (i >= 31) {
                        if ((mediaFormat.containsKey("color-transfer-request") ? mediaFormat.getInteger("color-transfer-request") : 0) == 3) {
                            objArr = true;
                            surface2 = null;
                            mediaCodec = MediaCodec.createByCodecName(str);
                            Trace.beginSection("configureCodec");
                            mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, !z ? 1 : 0);
                            Trace.endSection();
                            if (objArr != false) {
                                MediaFormat inputFormat = mediaCodec.getInputFormat();
                                if (i >= 31) {
                                    if ((inputFormat.containsKey("color-transfer-request") ? inputFormat.getInteger("color-transfer-request") : 0) == 3) {
                                        z2 = true;
                                    }
                                }
                                fxc0.q(z2, "Tone-mapping requested but not supported by the decoder.");
                            }
                            if (p && !z) {
                                surface2 = mediaCodec.createInputSurface();
                            }
                            Trace.beginSection("startCodec");
                            mediaCodec.start();
                            Trace.endSection();
                            this.d = mediaCodec;
                            this.e = surface2;
                            this.f = y2r0.N(context) ? 1 : 5;
                            return;
                        }
                    }
                    objArr = false;
                    surface2 = null;
                    mediaCodec = MediaCodec.createByCodecName(str);
                    Trace.beginSection("configureCodec");
                    mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, !z ? 1 : 0);
                    Trace.endSection();
                    if (objArr != false) {
                    }
                    if (p) {
                        surface2 = mediaCodec.createInputSurface();
                    }
                    Trace.beginSection("startCodec");
                    mediaCodec.start();
                    Trace.endSection();
                    this.d = mediaCodec;
                    this.e = surface2;
                    this.f = y2r0.N(context) ? 1 : 5;
                    return;
                }
                Trace.beginSection("configureCodec");
                mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, !z ? 1 : 0);
                Trace.endSection();
                if (objArr != false) {
                }
                if (p) {
                }
                Trace.beginSection("startCodec");
                mediaCodec.start();
                Trace.endSection();
                this.d = mediaCodec;
                this.e = surface2;
                this.f = y2r0.N(context) ? 1 : 5;
                return;
            } catch (Exception e) {
                e = e;
                ahn.l(e);
                if (surface2 != null) {
                    surface2.release();
                }
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw ExportException.c(e, ((e instanceof IOException) || (e instanceof MediaCodec.CodecException)) ? z ? 3001 : 4001 : e instanceof IllegalArgumentException ? z ? Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE : 4003 : 1001, new ExportException.a(mediaFormat.toString(), str, this.h, z));
            }
            mediaCodec = MediaCodec.createByCodecName(str);
        } catch (Exception e2) {
            e = e2;
            mediaCodec = null;
        }
        i = Build.VERSION.SDK_INT;
        boolean z22 = false;
        if (i >= 31) {
        }
        objArr = false;
        surface2 = null;
    }

    public static androidx.media3.common.a a(MediaFormat mediaFormat, boolean z, @Nullable fi20 fi20Var) {
        String string;
        int i;
        int i2;
        int integer;
        float f;
        int valueTypeForKey;
        byte[] bArr;
        a.C0043a c0043a = new a.C0043a();
        c0043a.m = io20.q(mediaFormat.getString("mime"));
        c0043a.d = mediaFormat.getString("language");
        c0043a.i = mediaFormat.containsKey("max-bitrate") ? mediaFormat.getInteger("max-bitrate") : -1;
        c0043a.h = mediaFormat.containsKey(BadConnectionSignaling.KEY_BAD_NET_BITRATE) ? mediaFormat.getInteger(BadConnectionSignaling.KEY_BAD_NET_BITRATE) : -1;
        int i3 = 0;
        if (Objects.equals(mediaFormat.getString("mime"), MimeTypes.VIDEO_H263) && mediaFormat.containsKey(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE) && mediaFormat.containsKey("level")) {
            int integer2 = mediaFormat.getInteger(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
            int integer3 = mediaFormat.getInteger("level");
            byte[] bArr2 = tzf.a;
            String str = y2r0.a;
            Locale locale = Locale.US;
            string = efz.a(integer2, integer3, "s263.", ".");
        } else if (Objects.equals(mediaFormat.getString("mime"), "video/dolby-vision") && mediaFormat.containsKey(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE) && mediaFormat.containsKey("level")) {
            int integer4 = mediaFormat.getInteger(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
            byte[] bArr3 = tzf.a;
            if (integer4 == 1) {
                i = 0;
            } else if (integer4 == 2) {
                i = 1;
            } else if (integer4 == 4) {
                i = 2;
            } else if (integer4 == 8) {
                i = 3;
            } else if (integer4 == 16) {
                i = 4;
            } else if (integer4 == 32) {
                i = 5;
            } else if (integer4 == 64) {
                i = 6;
            } else if (integer4 == 128) {
                i = 7;
            } else if (integer4 == 256) {
                i = 8;
            } else if (integer4 == 512) {
                i = 9;
            } else {
                if (integer4 != 1024) {
                    throw new IllegalArgumentException(lhg.a(integer4, "Unknown Dolby Vision profile: "));
                }
                i = 10;
            }
            int integer5 = mediaFormat.getInteger("level");
            if (integer5 == 1) {
                i2 = 1;
            } else if (integer5 != 2) {
                switch (integer5) {
                    case 4:
                        i2 = 3;
                        break;
                    case 8:
                        i2 = 4;
                        break;
                    case 16:
                        i2 = 5;
                        break;
                    case 32:
                        i2 = 6;
                        break;
                    case 64:
                        i2 = 7;
                        break;
                    case 128:
                        i2 = 8;
                        break;
                    case 256:
                        i2 = 9;
                        break;
                    case 512:
                        i2 = 10;
                        break;
                    case 1024:
                        i2 = 11;
                        break;
                    case 2048:
                        i2 = 12;
                        break;
                    case 4096:
                        i2 = 13;
                        break;
                    default:
                        throw new IllegalArgumentException(lhg.a(integer5, "Unknown Dolby Vision level: "));
                }
            } else {
                i2 = 2;
            }
            if (i > 9) {
                Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str2 = y2r0.a;
                string = String.format(Locale.US, "dvh1.%02d.%02d", objArr);
            } else if (i > 8) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str3 = y2r0.a;
                string = String.format(Locale.US, "dvav.%02d.%02d", objArr2);
            } else {
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str4 = y2r0.a;
                string = String.format(Locale.US, "dvhe.%02d.%02d", objArr3);
            }
        } else {
            string = mediaFormat.containsKey("codecs-string") ? mediaFormat.getString("codecs-string") : null;
        }
        c0043a.j = string;
        if (!mediaFormat.containsKey("frame-rate")) {
            f = -1.0f;
        } else if (Build.VERSION.SDK_INT >= 29) {
            valueTypeForKey = mediaFormat.getValueTypeForKey("frame-rate");
            if (valueTypeForKey == 3) {
                f = mediaFormat.getFloat("frame-rate");
            } else {
                integer = mediaFormat.getInteger("frame-rate");
                f = integer;
            }
        } else {
            try {
                f = mediaFormat.getFloat("frame-rate");
            } catch (ClassCastException unused) {
                integer = mediaFormat.getInteger("frame-rate");
            }
        }
        c0043a.x = f;
        c0043a.t = mediaFormat.containsKey("width") ? mediaFormat.getInteger("width") : -1;
        c0043a.u = mediaFormat.containsKey("height") ? mediaFormat.getInteger("height") : -1;
        c0043a.z = (mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) ? mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height") : 1.0f;
        c0043a.n = mediaFormat.containsKey("max-input-size") ? mediaFormat.getInteger("max-input-size") : -1;
        c0043a.y = mediaFormat.containsKey("rotation-degrees") ? mediaFormat.getInteger("rotation-degrees") : 0;
        int integer6 = mediaFormat.containsKey("color-standard") ? mediaFormat.getInteger("color-standard") : -1;
        int integer7 = mediaFormat.containsKey("color-range") ? mediaFormat.getInteger("color-range") : -1;
        int integer8 = mediaFormat.containsKey("color-transfer") ? mediaFormat.getInteger("color-transfer") : -1;
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        if (byteBuffer != null) {
            byte[] bArr4 = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr4);
            bArr = bArr4;
        } else {
            bArr = null;
        }
        if (integer6 != 2 && integer6 != 1 && integer6 != 6 && integer6 != -1) {
            integer6 = -1;
        }
        if (integer7 != 2 && integer7 != 1 && integer7 != -1) {
            integer7 = -1;
        }
        if (integer8 != 1 && integer8 != 3 && integer8 != 2 && integer8 != 6 && integer8 != 7 && integer8 != -1) {
            integer8 = -1;
        }
        c0043a.C = (integer6 == -1 && integer7 == -1 && integer8 == -1 && bArr == null) ? null : new m6g(integer6, integer7, integer8, -1, -1, bArr);
        c0043a.F = mediaFormat.containsKey("sample-rate") ? mediaFormat.getInteger("sample-rate") : -1;
        c0043a.E = mediaFormat.containsKey("channel-count") ? mediaFormat.getInteger("channel-count") : -1;
        c0043a.G = mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : -1;
        ImmutableList.a aVar = new ImmutableList.a();
        while (true) {
            ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-" + i3);
            if (byteBuffer2 == null) {
                c0043a.p = aVar.g();
                if (mediaFormat.containsKey("track-id")) {
                    c0043a.i(mediaFormat.getInteger("track-id"));
                }
                androidx.media3.common.a aVar2 = new androidx.media3.common.a(c0043a);
                a.C0043a a = aVar2.a();
                a.k = fi20Var;
                if (z && aVar2.H == -1 && Objects.equals(aVar2.n, MimeTypes.AUDIO_RAW)) {
                    a.G = 2;
                }
                return new androidx.media3.common.a(a);
            }
            byte[] bArr5 = new byte[byteBuffer2.remaining()];
            byteBuffer2.get(bArr5);
            byteBuffer2.rewind();
            aVar.c(bArr5);
            i3++;
        }
    }

    public final ExportException b(RuntimeException runtimeException) {
        boolean z = this.g;
        return ExportException.c(runtimeException, z ? 3002 : 4002, new ExportException.a(this.b.toString(), c(), this.h, z));
    }

    public final String c() {
        String canonicalName;
        int i = Build.VERSION.SDK_INT;
        MediaCodec mediaCodec = this.d;
        if (i < 29) {
            return mediaCodec.getName();
        }
        canonicalName = mediaCodec.getCanonicalName();
        return canonicalName;
    }

    @Nullable
    public final ByteBuffer d() throws ExportException {
        if (!g(true)) {
            return null;
        }
        long j = this.a.presentationTimeUs;
        LinkedHashMap linkedHashMap = a7l.a;
        synchronized (a7l.class) {
            synchronized (a7l.class) {
            }
            return this.k;
        }
        return this.k;
    }

    public final boolean e() {
        return this.o && this.m == -1;
    }

    public final boolean f(DecoderInputBuffer decoderInputBuffer) throws ExportException {
        MediaCodec mediaCodec = this.d;
        if (this.n) {
            return false;
        }
        if (this.l < 0) {
            try {
                int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
                this.l = dequeueInputBuffer;
                if (dequeueInputBuffer < 0) {
                    return false;
                }
                try {
                    decoderInputBuffer.e = mediaCodec.getInputBuffer(dequeueInputBuffer);
                    decoderInputBuffer.c();
                } catch (RuntimeException e) {
                    ahn.l(e);
                    throw b(e);
                }
            } catch (RuntimeException e2) {
                ahn.l(e2);
                throw b(e2);
            }
        }
        decoderInputBuffer.e.getClass();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(boolean z) throws ExportException {
        boolean z2 = this.g;
        androidx.media3.common.a aVar = this.c;
        MediaCodec mediaCodec = this.d;
        MediaCodec.BufferInfo bufferInfo = this.a;
        if (this.m < 0) {
            if (!this.o) {
                try {
                    int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
                    this.m = dequeueOutputBuffer;
                    if (dequeueOutputBuffer >= 0) {
                        if ((bufferInfo.flags & 4) != 0) {
                            this.o = true;
                            LinkedHashMap linkedHashMap = a7l.a;
                            synchronized (a7l.class) {
                                synchronized (a7l.class) {
                                }
                                if (bufferInfo.size != 0) {
                                    j();
                                    return false;
                                }
                                bufferInfo.flags &= -5;
                            }
                            if (bufferInfo.size != 0) {
                            }
                        }
                        if ((bufferInfo.flags & 2) != 0) {
                            j();
                            return false;
                        }
                        if (z) {
                            try {
                                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(this.m);
                                outputBuffer.getClass();
                                this.k = outputBuffer;
                                outputBuffer.position(bufferInfo.offset);
                                this.k.limit(bufferInfo.offset + bufferInfo.size);
                                return true;
                            } catch (RuntimeException e) {
                                ahn.l(e);
                                throw b(e);
                            }
                        }
                    } else if (dequeueOutputBuffer == -2) {
                        this.j = a(mediaCodec.getOutputFormat(), z2, aVar.l);
                        if (z2) {
                            if (Objects.equals(aVar.n, MimeTypes.AUDIO_RAW)) {
                                a.C0043a a = this.j.a();
                                a.E = aVar.F;
                                a.G = aVar.H;
                                this.j = new androidx.media3.common.a(a);
                            }
                        } else if (this.h) {
                            this.i.set(true);
                        } else if (Objects.equals(c(), "c2.android.aac.encoder")) {
                            a.C0043a a2 = this.j.a();
                            a2.H = 1600;
                            this.j = new androidx.media3.common.a(a2);
                        }
                        long j = bufferInfo.presentationTimeUs;
                        LinkedHashMap linkedHashMap2 = a7l.a;
                        synchronized (a7l.class) {
                            synchronized (a7l.class) {
                            }
                            return false;
                        }
                        return false;
                    }
                } catch (RuntimeException e2) {
                    ahn.l(e2);
                    throw b(e2);
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(DecoderInputBuffer decoderInputBuffer) throws ExportException {
        int i;
        int i2;
        boolean z = true;
        fxc0.A(!this.n, "Input buffer can not be queued after the input stream has ended.");
        ByteBuffer byteBuffer = decoderInputBuffer.e;
        int i3 = 0;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            i = 0;
            i2 = 0;
        } else {
            i = decoderInputBuffer.e.position();
            i2 = decoderInputBuffer.e.remaining();
        }
        long j = decoderInputBuffer.g;
        int i4 = 4;
        try {
            if (decoderInputBuffer.b(4)) {
                this.n = true;
                LinkedHashMap linkedHashMap = a7l.a;
                synchronized (a7l.class) {
                    synchronized (a7l.class) {
                    }
                    if (this.g) {
                        ByteBuffer byteBuffer2 = decoderInputBuffer.e;
                        if (byteBuffer2 != null && byteBuffer2.hasRemaining()) {
                            z = false;
                        }
                        fxc0.z(z);
                        j = 0;
                        i2 = 0;
                        this.d.queueInputBuffer(this.l, i3, i2, j, i4);
                        LinkedHashMap linkedHashMap2 = a7l.a;
                        synchronized (a7l.class) {
                            synchronized (a7l.class) {
                            }
                            this.l = -1;
                            decoderInputBuffer.e = null;
                            return;
                        }
                        this.l = -1;
                        decoderInputBuffer.e = null;
                        return;
                    }
                }
                if (this.g) {
                }
            } else {
                i4 = 0;
            }
            this.d.queueInputBuffer(this.l, i3, i2, j, i4);
            LinkedHashMap linkedHashMap22 = a7l.a;
            synchronized (a7l.class) {
            }
        } catch (RuntimeException e) {
            ahn.l(e);
            throw b(e);
        }
        i3 = i;
    }

    public final void i() {
        this.k = null;
        Surface surface = this.e;
        if (surface != null) {
            surface.release();
        }
        this.d.release();
    }

    public final void j() throws ExportException {
        MediaCodec.BufferInfo bufferInfo = this.a;
        bufferInfo.getClass();
        k(bufferInfo.presentationTimeUs, false);
    }

    public final void k(long j, boolean z) throws ExportException {
        MediaCodec mediaCodec = this.d;
        this.k = null;
        try {
            if (z) {
                mediaCodec.releaseOutputBuffer(this.m, j * 1000);
                LinkedHashMap linkedHashMap = a7l.a;
                synchronized (a7l.class) {
                    try {
                        synchronized (a7l.class) {
                        }
                    } finally {
                    }
                }
            } else {
                mediaCodec.releaseOutputBuffer(this.m, false);
            }
            this.m = -1;
        } catch (RuntimeException e) {
            ahn.l(e);
            throw b(e);
        }
    }
}
