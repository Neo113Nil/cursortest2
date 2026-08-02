package t2;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import androidx.media3.common.a;
import b1.AbstractC2335D;
import b1.C2334C;
import e1.AbstractC4131A;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import l1.AbstractC5366l;
import t2.C6427w0;

/* renamed from: t2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6422u implements InterfaceC6399i {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec.BufferInfo f65550a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaFormat f65551b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.media3.common.a f65552c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodec f65553d;

    /* renamed from: e, reason: collision with root package name */
    public final Surface f65554e;

    /* renamed from: f, reason: collision with root package name */
    public final int f65555f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f65556g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f65557h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f65558i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.media3.common.a f65559j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f65560k;

    /* renamed from: l, reason: collision with root package name */
    public int f65561l;

    /* renamed from: m, reason: collision with root package name */
    public int f65562m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f65563n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f65564o;

    /* renamed from: t2.u$a */
    public static final class a {
        public static String a(MediaCodec mediaCodec) {
            String canonicalName;
            canonicalName = mediaCodec.getCanonicalName();
            return canonicalName;
        }
    }

    public C6422u(Context context, androidx.media3.common.a aVar, MediaFormat mediaFormat, String str, boolean z10, Surface surface) {
        Exception exc;
        MediaCodec mediaCodec;
        this.f65552c = aVar;
        this.f65551b = mediaFormat;
        this.f65556g = z10;
        boolean t10 = AbstractC2335D.t((String) AbstractC4134a.e(aVar.f20543o));
        this.f65557h = t10;
        this.f65550a = new MediaCodec.BufferInfo();
        this.f65561l = -1;
        this.f65562m = -1;
        this.f65558i = new AtomicBoolean();
        AbstractC5366l.d(z10, t10, "InputFormat", -9223372036854775807L, "%s", aVar);
        boolean r10 = r(mediaFormat);
        Surface surface2 = null;
        try {
            mediaCodec = MediaCodec.createByCodecName(str);
        } catch (Exception e10) {
            exc = e10;
            mediaCodec = null;
        }
        try {
            a(mediaCodec, mediaFormat, z10, surface);
            if (r10) {
                AbstractC4134a.b(r(mediaCodec.getInputFormat()), "Tone-mapping requested but not supported by the decoder.");
            }
            if (t10 && !z10) {
                surface2 = mediaCodec.createInputSurface();
            }
            u(mediaCodec);
            this.f65553d = mediaCodec;
            this.f65554e = surface2;
            this.f65555f = e1.Z.k0(context);
        } catch (Exception e11) {
            exc = e11;
            AbstractC4156x.c("DefaultCodec", "MediaCodec error", exc);
            if (surface2 != null) {
                surface2.release();
            }
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw n(mediaFormat, this.f65557h, z10, exc, ((exc instanceof IOException) || (exc instanceof MediaCodec.CodecException)) ? z10 ? 3001 : 4001 : exc instanceof IllegalArgumentException ? z10 ? 3003 : 4003 : 1001, str);
        }
    }

    public static void a(MediaCodec mediaCodec, MediaFormat mediaFormat, boolean z10, Surface surface) {
        e1.T.a("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, !z10 ? 1 : 0);
        e1.T.b();
    }

    public static androidx.media3.common.a m(MediaFormat mediaFormat, boolean z10, C2334C c2334c) {
        androidx.media3.common.a a10 = AbstractC4131A.a(mediaFormat);
        a.b r02 = a10.b().r0(c2334c);
        if (z10 && a10.f20520H == -1 && Objects.equals(a10.f20543o, "audio/raw")) {
            r02.s0(2);
        }
        return r02.P();
    }

    public static C6427w0 n(MediaFormat mediaFormat, boolean z10, boolean z11, Exception exc, int i10, String str) {
        return C6427w0.c(exc, i10, new C6427w0.a(mediaFormat.toString(), z10, z11, str));
    }

    public static boolean r(MediaFormat mediaFormat) {
        return Build.VERSION.SDK_INT >= 31 && AbstractC4131A.g(mediaFormat, "color-transfer-request", 0) == 3;
    }

    public static void u(MediaCodec mediaCodec) {
        e1.T.a("startCodec");
        mediaCodec.start();
        e1.T.b();
    }

    @Override // t2.InterfaceC6399i
    public boolean b() {
        return this.f65564o && this.f65562m == -1;
    }

    @Override // t2.InterfaceC6399i
    public void c(k1.f fVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j10;
        boolean z10 = true;
        AbstractC4134a.h(!this.f65563n, "Input buffer can not be queued after the input stream has ended.");
        ByteBuffer byteBuffer = fVar.f54108d;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = fVar.f54108d.position();
            i11 = fVar.f54108d.remaining();
        }
        long j11 = fVar.f54110f;
        if (fVar.i()) {
            this.f65563n = true;
            p("InputEnded", Long.MIN_VALUE);
            if (this.f65556g) {
                ByteBuffer byteBuffer2 = fVar.f54108d;
                if (byteBuffer2 != null && byteBuffer2.hasRemaining()) {
                    z10 = false;
                }
                AbstractC4134a.g(z10);
                j11 = 0;
                i12 = 0;
                i14 = 0;
            } else {
                i12 = i10;
                i14 = i11;
            }
            j10 = j11;
            i13 = 4;
        } else {
            i12 = i10;
            i13 = 0;
            i14 = i11;
            j10 = j11;
        }
        try {
            this.f65553d.queueInputBuffer(this.f65561l, i12, i14, j10, i13);
            q("AcceptedInput", j10, "bytes=%s", Integer.valueOf(i14));
            this.f65561l = -1;
            fVar.f54108d = null;
        } catch (RuntimeException e10) {
            AbstractC4156x.c("DefaultCodec", "MediaCodec error", e10);
            throw o(e10);
        }
    }

    @Override // t2.InterfaceC6399i
    public Surface d() {
        return (Surface) AbstractC4134a.i(this.f65554e);
    }

    @Override // t2.InterfaceC6399i
    public androidx.media3.common.a e() {
        try {
            return m(this.f65553d.getInputFormat(), this.f65556g, this.f65552c.f20540l);
        } catch (RuntimeException e10) {
            AbstractC4156x.c("DefaultCodec", "MediaCodec error", e10);
            throw o(e10);
        }
    }

    @Override // t2.InterfaceC6399i
    public boolean f(k1.f fVar) {
        if (this.f65563n) {
            return false;
        }
        if (this.f65561l < 0) {
            try {
                int dequeueInputBuffer = this.f65553d.dequeueInputBuffer(0L);
                this.f65561l = dequeueInputBuffer;
                if (dequeueInputBuffer < 0) {
                    return false;
                }
                try {
                    fVar.f54108d = this.f65553d.getInputBuffer(dequeueInputBuffer);
                    fVar.f();
                } catch (RuntimeException e10) {
                    AbstractC4156x.c("DefaultCodec", "MediaCodec error", e10);
                    throw o(e10);
                }
            } catch (RuntimeException e11) {
                AbstractC4156x.c("DefaultCodec", "MediaCodec error", e11);
                throw o(e11);
            }
        }
        AbstractC4134a.e(fVar.f54108d);
        return true;
    }

    @Override // t2.InterfaceC6399i
    public void g(long j10) {
        t(true, j10);
    }

    @Override // t2.InterfaceC6399i
    public String getName() {
        return Build.VERSION.SDK_INT >= 29 ? a.a(this.f65553d) : this.f65553d.getName();
    }

    @Override // t2.InterfaceC6399i
    public androidx.media3.common.a getOutputFormat() {
        s(false);
        return this.f65559j;
    }

    @Override // t2.InterfaceC6399i
    public MediaCodec.BufferInfo h() {
        if (s(false)) {
            return this.f65550a;
        }
        return null;
    }

    @Override // t2.InterfaceC6399i
    public void i(boolean z10) {
        t(z10, ((MediaCodec.BufferInfo) AbstractC4134a.i(this.f65550a)).presentationTimeUs);
    }

    @Override // t2.InterfaceC6399i
    public ByteBuffer j() {
        if (!s(true)) {
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = this.f65550a;
        q("ProducedOutput", bufferInfo.presentationTimeUs, "bytesOutput=%s", Integer.valueOf(bufferInfo.size));
        return this.f65560k;
    }

    @Override // t2.InterfaceC6399i
    public int k() {
        return this.f65555f;
    }

    @Override // t2.InterfaceC6399i
    public androidx.media3.common.a l() {
        return this.f65552c;
    }

    public final C6427w0 o(Exception exc) {
        MediaFormat mediaFormat = this.f65551b;
        boolean z10 = this.f65557h;
        boolean z11 = this.f65556g;
        return n(mediaFormat, z10, z11, exc, z11 ? 3002 : 4002, getName());
    }

    public final void p(String str, long j10) {
        q(str, j10, "", new Object[0]);
    }

    public final void q(String str, long j10, String str2, Object... objArr) {
        AbstractC5366l.d(this.f65556g, this.f65557h, str, j10, str2, objArr);
    }

    @Override // t2.InterfaceC6399i
    public void release() {
        this.f65560k = null;
        Surface surface = this.f65554e;
        if (surface != null) {
            surface.release();
        }
        this.f65553d.release();
    }

    public final boolean s(boolean z10) {
        if (this.f65562m >= 0) {
            return true;
        }
        if (this.f65564o) {
            return false;
        }
        try {
            int dequeueOutputBuffer = this.f65553d.dequeueOutputBuffer(this.f65550a, 0L);
            this.f65562m = dequeueOutputBuffer;
            if (dequeueOutputBuffer < 0) {
                if (dequeueOutputBuffer == -2) {
                    this.f65559j = m(this.f65553d.getOutputFormat(), this.f65556g, this.f65552c.f20540l);
                    if (this.f65556g && Objects.equals(this.f65552c.f20543o, "audio/raw")) {
                        this.f65559j = this.f65559j.b().T(this.f65552c.f20518F).s0(this.f65552c.f20520H).P();
                    }
                    if (!this.f65556g && this.f65557h) {
                        this.f65558i.set(true);
                    }
                    q("OutputFormat", this.f65550a.presentationTimeUs, "%s", this.f65559j);
                }
                return false;
            }
            if ((this.f65550a.flags & 4) != 0) {
                this.f65564o = true;
                p("OutputEnded", Long.MIN_VALUE);
                MediaCodec.BufferInfo bufferInfo = this.f65550a;
                if (bufferInfo.size == 0) {
                    i(false);
                    return false;
                }
                bufferInfo.flags &= -5;
            }
            if ((this.f65550a.flags & 2) != 0) {
                i(false);
                return false;
            }
            if (z10) {
                try {
                    ByteBuffer byteBuffer = (ByteBuffer) AbstractC4134a.e(this.f65553d.getOutputBuffer(this.f65562m));
                    this.f65560k = byteBuffer;
                    byteBuffer.position(this.f65550a.offset);
                    ByteBuffer byteBuffer2 = this.f65560k;
                    MediaCodec.BufferInfo bufferInfo2 = this.f65550a;
                    byteBuffer2.limit(bufferInfo2.offset + bufferInfo2.size);
                } catch (RuntimeException e10) {
                    AbstractC4156x.c("DefaultCodec", "MediaCodec error", e10);
                    throw o(e10);
                }
            }
            return true;
        } catch (RuntimeException e11) {
            AbstractC4156x.c("DefaultCodec", "MediaCodec error", e11);
            throw o(e11);
        }
    }

    @Override // t2.InterfaceC6399i
    public void signalEndOfInputStream() {
        if (!this.f65558i.get()) {
            try {
                Thread.sleep(30L);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        p("InputEnded", Long.MIN_VALUE);
        try {
            this.f65553d.signalEndOfInputStream();
        } catch (RuntimeException e10) {
            AbstractC4156x.c("DefaultCodec", "MediaCodec error", e10);
            throw o(e10);
        }
    }

    public void t(boolean z10, long j10) {
        this.f65560k = null;
        try {
            if (z10) {
                this.f65553d.releaseOutputBuffer(this.f65562m, 1000 * j10);
                p("ProducedOutput", j10);
            } else {
                this.f65553d.releaseOutputBuffer(this.f65562m, false);
            }
            this.f65562m = -1;
        } catch (RuntimeException e10) {
            AbstractC4156x.c("DefaultCodec", "MediaCodec error", e10);
            throw o(e10);
        }
    }
}
