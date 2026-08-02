package androidx.media3.exoplayer.mediacodec;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Trace;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.c;
import androidx.media3.exoplayer.video.c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import xsna.a04;
import xsna.b04;
import xsna.b900;
import xsna.c04;
import xsna.dq10;
import xsna.fpn0;
import xsna.fxc0;
import xsna.kdc;
import xsna.tjk;
import xsna.vrl;
import xsna.xz3;
import xsna.y2r0;
import xsna.yz3;
import xsna.zz3;

/* compiled from: AsynchronousMediaCodecAdapter.java */
/* loaded from: classes12.dex */
public final class a implements c {
    public final MediaCodec a;
    public final c04 b;
    public final dq10 c;

    @Nullable
    public final b900 d;
    public boolean e;
    public int f = 0;

    /* compiled from: AsynchronousMediaCodecAdapter.java */
    /* renamed from: androidx.media3.exoplayer.mediacodec.a$a, reason: collision with other inner class name */
    public static final class C0059a implements c.b {
        public final yz3 a;
        public final zz3 b;
        public boolean c = true;

        public C0059a(yz3 yz3Var, zz3 zz3Var) {
            this.a = yz3Var;
            this.b = zz3Var;
        }

        @Override // androidx.media3.exoplayer.mediacodec.c.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a a(c.a aVar) throws IOException {
            MediaCodec mediaCodec;
            dq10 a04Var;
            int i;
            String str = aVar.a.a;
            a aVar2 = null;
            try {
                Trace.beginSection("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    if (!this.c || Build.VERSION.SDK_INT < 36) {
                        a04Var = new a04(mediaCodec, (HandlerThread) this.b.get());
                        i = 0;
                    } else {
                        a04Var = new fpn0(mediaCodec);
                        i = 4;
                    }
                    a aVar3 = new a(mediaCodec, (HandlerThread) this.a.get(), a04Var, aVar.f);
                    try {
                        Trace.endSection();
                        Surface surface = aVar.d;
                        if (surface == null && aVar.a.k && Build.VERSION.SDK_INT >= 35) {
                            i |= 8;
                        }
                        a.n(aVar3, aVar.b, surface, aVar.e, i);
                        return aVar3;
                    } catch (Exception e) {
                        e = e;
                        aVar2 = aVar3;
                        if (aVar2 != null) {
                            aVar2.release();
                        } else if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                mediaCodec = null;
            }
        }
    }

    public a(MediaCodec mediaCodec, HandlerThread handlerThread, dq10 dq10Var, b900 b900Var) {
        this.a = mediaCodec;
        this.b = new c04(handlerThread);
        this.c = dq10Var;
        this.d = b900Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        if (r7 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void n(a aVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        b900 b900Var;
        boolean addMediaCodec;
        c04 c04Var = aVar.b;
        MediaCodec mediaCodec = aVar.a;
        HandlerThread handlerThread = c04Var.b;
        fxc0.z(c04Var.c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(c04Var, handler);
        c04Var.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        aVar.c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (b900Var = aVar.d) != null) {
            LoudnessCodecController loudnessCodecController = b900Var.c;
            if (loudnessCodecController != null) {
                addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            }
            fxc0.z(b900Var.a.add(mediaCodec));
        }
        aVar.f = 1;
    }

    public static String o(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void a(int i, int i2, int i3, long j) {
        this.c.a(i, i2, i3, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void b(int i, tjk tjkVar, long j, int i2) {
        this.c.b(i, tjkVar, j, i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void c(final c.e eVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener(this) { // from class: xsna.wz3
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                c.e eVar2 = eVar;
                Handler handler2 = eVar2.b;
                if (Build.VERSION.SDK_INT < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                } else {
                    eVar2.a(j);
                }
            }
        }, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void d(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0024, DONT_GENERATE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0027, B:19:0x0032, B:22:0x0036, B:24:0x0042, B:25:0x0069, B:29:0x005f, B:30:0x006b, B:31:0x0070), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0027, B:19:0x0032, B:22:0x0036, B:24:0x0042, B:25:0x0069, B:29:0x005f, B:30:0x006b, B:31:0x0070), top: B:3:0x000a }] */
    @Override // androidx.media3.exoplayer.mediacodec.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        this.c.c();
        c04 c04Var = this.b;
        synchronized (c04Var.a) {
            try {
                c04Var.b();
                if (c04Var.l <= 0 && !c04Var.m) {
                    z = false;
                    if (!z) {
                        return -1;
                    }
                    kdc kdcVar = c04Var.e;
                    int i = kdcVar.b;
                    int i2 = kdcVar.c;
                    if (i == i2) {
                        return -1;
                    }
                    if (i == i2) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    int i3 = kdcVar.a[i];
                    kdcVar.b = kdcVar.d & (i + 1);
                    if (i3 >= 0) {
                        c04Var.h.getClass();
                        MediaCodec.BufferInfo remove = c04Var.f.remove();
                        bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
                    } else if (i3 == -2) {
                        c04Var.h = c04Var.g.remove();
                    }
                    return i3;
                }
                z = true;
                if (!z) {
                }
            } finally {
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void f(ArrayList arrayList) {
        this.a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void flush() {
        this.c.flush();
        this.a.flush();
        c04 c04Var = this.b;
        synchronized (c04Var.a) {
            c04Var.l++;
            Handler handler = c04Var.c;
            String str = y2r0.a;
            handler.post(new b04(c04Var, 0));
        }
        this.a.start();
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final boolean g(MediaCodecRenderer.a aVar) {
        c04 c04Var = this.b;
        synchronized (c04Var.a) {
            c04Var.o = aVar;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    @Nullable
    public final ByteBuffer getInputBuffer(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    @Nullable
    public final ByteBuffer getOutputBuffer(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        c04 c04Var = this.b;
        synchronized (c04Var.a) {
            try {
                mediaFormat = c04Var.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void h() {
        this.a.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void i(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0024, DONT_GENERATE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0026, B:20:0x003e, B:23:0x0034, B:24:0x0040, B:25:0x0045), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0026, B:20:0x003e, B:23:0x0034, B:24:0x0040, B:25:0x0045), top: B:3:0x000a }] */
    @Override // androidx.media3.exoplayer.mediacodec.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j() {
        boolean z;
        this.c.c();
        c04 c04Var = this.b;
        synchronized (c04Var.a) {
            try {
                c04Var.b();
                if (c04Var.l <= 0 && !c04Var.m) {
                    z = false;
                    int i = -1;
                    if (!z) {
                        return -1;
                    }
                    kdc kdcVar = c04Var.d;
                    int i2 = kdcVar.b;
                    int i3 = kdcVar.c;
                    if (!(i2 == i3)) {
                        if (i2 == i3) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i = kdcVar.a[i2];
                        kdcVar.b = (i2 + 1) & kdcVar.d;
                    }
                    return i;
                }
                z = true;
                int i4 = -1;
                if (!z) {
                }
            } finally {
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void k(ArrayList arrayList) {
        this.a.subscribeToVendorParameters(arrayList);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void l(vrl vrlVar) {
        c04 c04Var = this.b;
        xz3 xz3Var = new xz3(0, this, vrlVar);
        synchronized (c04Var.a) {
            c04Var.b();
            xz3Var.run();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void m(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void release() {
        b900 b900Var;
        b900 b900Var2;
        try {
            if (this.f == 1) {
                this.c.shutdown();
                c04 c04Var = this.b;
                synchronized (c04Var.a) {
                    c04Var.m = true;
                    c04Var.b.quit();
                    c04Var.a();
                }
            }
            this.f = 2;
            if (this.e) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.a.stop();
                }
                if (i >= 35 && (b900Var2 = this.d) != null) {
                    b900Var2.a(this.a);
                }
                this.a.release();
                this.e = true;
            } finally {
            }
        } catch (Throwable th) {
            if (!this.e) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.a.stop();
                    }
                    if (i2 >= 35 && (b900Var = this.d) != null) {
                        b900Var.a(this.a);
                    }
                    this.a.release();
                    this.e = true;
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void setParameters(Bundle bundle) {
        this.c.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void setVideoScalingMode(int i) {
        this.a.setVideoScalingMode(i);
    }
}
