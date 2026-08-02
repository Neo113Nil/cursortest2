package t2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import android.util.Pair;
import android.util.SparseArray;
import b1.AbstractC2335D;
import b1.C2334C;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4131A;
import e1.AbstractC4134a;
import e1.AbstractC4144k;
import e1.AbstractC4156x;
import f1.C4228f;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.Locale;
import r2.C6198a;
import r2.C6200c;
import r2.InterfaceC6199b;

/* loaded from: classes.dex */
public final class B0 implements InterfaceC6199b {

    /* renamed from: h, reason: collision with root package name */
    public static final String f64979h = "android.media:" + Build.VERSION.SDK_INT;

    /* renamed from: i, reason: collision with root package name */
    public static final AbstractC3445z f64980i = J();

    /* renamed from: j, reason: collision with root package name */
    public static final AbstractC3445z f64981j = AbstractC3445z.w("audio/mp4a-latm", "audio/3gpp", "audio/amr-wb");

    /* renamed from: a, reason: collision with root package name */
    public final MediaMuxer f64982a;

    /* renamed from: b, reason: collision with root package name */
    public final long f64983b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f64984c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f64985d;

    /* renamed from: e, reason: collision with root package name */
    public int f64986e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f64987f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f64988g;

    public static final class b implements InterfaceC6199b.a {

        /* renamed from: a, reason: collision with root package name */
        public long f64989a = -9223372036854775807L;

        @Override // r2.InterfaceC6199b.a
        public AbstractC3445z a(int i10) {
            return i10 == 2 ? B0.f64980i : i10 == 1 ? B0.f64981j : AbstractC3445z.t();
        }

        @Override // r2.InterfaceC6199b.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public B0 c(String str) {
            try {
                return new B0(new MediaMuxer(str, 0), this.f64989a);
            } catch (IOException e10) {
                throw new C6200c("Error creating muxer", e10);
            }
        }
    }

    public static int B() {
        return 256;
    }

    public static AbstractC3445z J() {
        AbstractC3445z.a j10 = new AbstractC3445z.a().j("video/avc", "video/3gpp", "video/mp4v-es");
        int i10 = Build.VERSION.SDK_INT;
        j10.a("video/hevc");
        if (i10 >= 33) {
            j10.a("video/dolby-vision");
        }
        if (i10 >= 34) {
            j10.a("video/av01");
        }
        if (i10 >= 36) {
            j10.a("video/apv");
        }
        return j10.m();
    }

    public static int r(androidx.media3.common.a aVar) {
        if (aVar.f20539k != null) {
            return ((Integer) ((Pair) AbstractC4134a.e(AbstractC4144k.w(aVar))).second).intValue();
        }
        int max = Integer.max(aVar.f20550v, aVar.f20551w);
        AbstractC4134a.g(max <= 7680);
        float f10 = aVar.f20550v * aVar.f20551w * aVar.f20554z;
        if (max <= 1280) {
            return f10 <= 2.21184E7f ? 1 : 2;
        }
        if (max <= 1920 && f10 <= 4.97664E7f) {
            return 4;
        }
        if (max <= 2560 && f10 <= 6.2208E7f) {
            return 8;
        }
        if (max > 3840) {
            if (max <= 7680) {
                return f10 <= 9.95328E8f ? 1024 : 2048;
            }
            return -1;
        }
        if (f10 <= 1.24416E8f) {
            return 16;
        }
        if (f10 <= 1.990656E8f) {
            return 32;
        }
        if (f10 <= 2.48832E8f) {
            return 64;
        }
        if (f10 <= 3.981312E8f) {
            return 128;
        }
        return f10 <= 4.97664E8f ? 256 : 512;
    }

    public static void w0(MediaMuxer mediaMuxer) {
        try {
            mediaMuxer.stop();
        } catch (RuntimeException e10) {
            if (Build.VERSION.SDK_INT < 30) {
                try {
                    Field declaredField = MediaMuxer.class.getDeclaredField("MUXER_STATE_STOPPED");
                    declaredField.setAccessible(true);
                    Integer num = (Integer) e1.Z.i((Integer) declaredField.get(mediaMuxer));
                    num.intValue();
                    Field declaredField2 = MediaMuxer.class.getDeclaredField("mState");
                    declaredField2.setAccessible(true);
                    declaredField2.set(mediaMuxer, num);
                } catch (Exception unused) {
                }
            }
            throw e10;
        }
    }

    @Override // r2.InterfaceC6199b
    public void H(C2334C.a aVar) {
        if (aVar instanceof C4228f) {
            C4228f c4228f = (C4228f) aVar;
            this.f64982a.setLocation(c4228f.f46180a, c4228f.f46181b);
        }
    }

    @Override // r2.InterfaceC6199b
    public int I1(androidx.media3.common.a aVar) {
        MediaFormat createAudioFormat;
        String str = (String) AbstractC4134a.e(aVar.f20543o);
        boolean t10 = AbstractC2335D.t(str);
        if (t10) {
            createAudioFormat = MediaFormat.createVideoFormat(str, aVar.f20550v, aVar.f20551w);
            AbstractC4131A.n(createAudioFormat, aVar.f20516D);
            if (str.equals("video/dolby-vision") && Build.VERSION.SDK_INT >= 33) {
                createAudioFormat.setInteger("profile", B());
                createAudioFormat.setInteger("level", r(aVar));
            }
            try {
                this.f64982a.setOrientationHint(aVar.f20513A);
            } catch (RuntimeException e10) {
                throw new C6200c("Failed to set orientation hint with rotationDegrees=" + aVar.f20513A, e10);
            }
        } else {
            createAudioFormat = MediaFormat.createAudioFormat(str, aVar.f20519G, aVar.f20518F);
            AbstractC4131A.s(createAudioFormat, "language", aVar.f20532d);
        }
        AbstractC4131A.u(createAudioFormat, aVar.f20546r);
        try {
            int addTrack = this.f64982a.addTrack(createAudioFormat);
            if (t10) {
                this.f64986e = addTrack;
            }
            return addTrack;
        } catch (RuntimeException e11) {
            throw new C6200c("Failed to add track with format=" + aVar, e11);
        }
    }

    @Override // r2.InterfaceC6199b
    public void L(int i10, ByteBuffer byteBuffer, C6198a c6198a) {
        long j10 = c6198a.f63925a;
        long j11 = this.f64983b;
        if (j11 != -9223372036854775807L && i10 == this.f64986e && j10 > j11) {
            AbstractC4156x.i("FrameworkMuxer", String.format(Locale.US, "Skipped sample with presentation time (%d) > video duration (%d)", Long.valueOf(j10), Long.valueOf(this.f64983b)));
            return;
        }
        if (!this.f64987f) {
            if (Build.VERSION.SDK_INT < 30 && j10 < 0) {
                this.f64985d.put(i10, Long.valueOf(-j10));
            }
            U();
        }
        long longValue = ((Long) this.f64985d.get(i10, 0L)).longValue();
        long j12 = j10 + longValue;
        boolean z10 = true;
        AbstractC4134a.h(true, "Samples not in presentation order (" + j12 + " < " + (e1.Z.q(this.f64984c, i10) ? ((Long) this.f64984c.get(i10)).longValue() : 0L) + ") unsupported on this API version");
        this.f64984c.put(i10, Long.valueOf(j12));
        if (longValue != 0 && j12 < 0) {
            z10 = false;
        }
        AbstractC4134a.h(z10, String.format(Locale.US, "Sample presentation time (%d) < first sample presentation time (%d). Ensure the first sample has the smallest timestamp when using the negative PTS workaround.", Long.valueOf(j12 - longValue), Long.valueOf(-longValue)));
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(byteBuffer.position(), c6198a.f63926b, j12, k1.e(c6198a.f63927c));
        try {
            this.f64982a.writeSampleData(i10, byteBuffer, bufferInfo);
        } catch (RuntimeException e10) {
            throw new C6200c("Failed to write sample for presentationTimeUs=" + j12 + ", size=" + c6198a.f63926b, e10);
        }
    }

    public final void U() {
        try {
            this.f64982a.start();
            this.f64987f = true;
        } catch (RuntimeException e10) {
            throw new C6200c("Failed to start the muxer", e10);
        }
    }

    @Override // r2.InterfaceC6199b, java.lang.AutoCloseable
    public void close() {
        if (this.f64988g) {
            return;
        }
        if (!this.f64987f) {
            U();
        }
        long j10 = this.f64983b;
        if (j10 != -9223372036854775807L && this.f64986e != -1) {
            L(this.f64986e, ByteBuffer.allocateDirect(0), new C6198a(j10, 0, 4));
        }
        this.f64987f = false;
        try {
            try {
                w0(this.f64982a);
            } catch (RuntimeException e10) {
                throw new C6200c("Failed to stop the MediaMuxer", e10);
            }
        } finally {
            this.f64982a.release();
            this.f64988g = true;
        }
    }

    public B0(MediaMuxer mediaMuxer, long j10) {
        this.f64982a = mediaMuxer;
        this.f64983b = j10;
        this.f64984c = new SparseArray();
        this.f64985d = new SparseArray();
        this.f64986e = -1;
    }
}
