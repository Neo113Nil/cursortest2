package v1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import e1.AbstractC4134a;
import e1.T;
import java.io.IOException;
import java.nio.ByteBuffer;
import v1.InterfaceC6627q;

/* loaded from: classes.dex */
public final class Q implements InterfaceC6627q {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f66916a;

    /* renamed from: b, reason: collision with root package name */
    public final C6625o f66917b;

    public static class b implements InterfaceC6627q.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
        /* JADX WARN: Type inference failed for: r0v0, types: [v1.Q$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // v1.InterfaceC6627q.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public InterfaceC6627q b(InterfaceC6627q.a aVar) {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec c10 = c(aVar);
                try {
                    T.a("configureCodec");
                    Surface surface = aVar.f66979d;
                    c10.configure(aVar.f66977b, surface, aVar.f66980e, (surface == null && aVar.f66976a.f66996k && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                    T.b();
                    T.a("startCodec");
                    c10.start();
                    T.b();
                    return new Q(c10, aVar.f66981f);
                } catch (IOException e10) {
                    e = e10;
                    mediaCodec = c10;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                } catch (RuntimeException e11) {
                    e = e11;
                    mediaCodec = c10;
                    if (mediaCodec != 0) {
                    }
                    throw e;
                }
            } catch (IOException e12) {
                e = e12;
            } catch (RuntimeException e13) {
                e = e13;
            }
        }

        public MediaCodec c(InterfaceC6627q.a aVar) {
            AbstractC4134a.e(aVar.f66976a);
            String str = aVar.f66976a.f66986a;
            T.a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            T.b();
            return createByCodecName;
        }
    }

    public static /* synthetic */ void m(Q q10, InterfaceC6627q.d dVar, MediaCodec mediaCodec, long j10, long j11) {
        q10.getClass();
        dVar.a(q10, j10, j11);
    }

    @Override // v1.InterfaceC6627q
    public void a(int i10, int i11, k1.c cVar, long j10, int i12) {
        this.f66916a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    @Override // v1.InterfaceC6627q
    public void b() {
        this.f66916a.detachOutputSurface();
    }

    @Override // v1.InterfaceC6627q
    public void c(int i10) {
        this.f66916a.setVideoScalingMode(i10);
    }

    @Override // v1.InterfaceC6627q
    public ByteBuffer d(int i10) {
        return this.f66916a.getInputBuffer(i10);
    }

    @Override // v1.InterfaceC6627q
    public void e(Surface surface) {
        this.f66916a.setOutputSurface(surface);
    }

    @Override // v1.InterfaceC6627q
    public void f(final InterfaceC6627q.d dVar, Handler handler) {
        this.f66916a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: v1.P
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                Q.m(Q.this, dVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // v1.InterfaceC6627q
    public void flush() {
        this.f66916a.flush();
    }

    @Override // v1.InterfaceC6627q
    public boolean g() {
        return false;
    }

    @Override // v1.InterfaceC6627q
    public MediaFormat getOutputFormat() {
        return this.f66916a.getOutputFormat();
    }

    @Override // v1.InterfaceC6627q
    public void i(int i10, long j10) {
        this.f66916a.releaseOutputBuffer(i10, j10);
    }

    @Override // v1.InterfaceC6627q
    public int j() {
        return this.f66916a.dequeueInputBuffer(0L);
    }

    @Override // v1.InterfaceC6627q
    public int k(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f66916a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // v1.InterfaceC6627q
    public ByteBuffer l(int i10) {
        return this.f66916a.getOutputBuffer(i10);
    }

    @Override // v1.InterfaceC6627q
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        this.f66916a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // v1.InterfaceC6627q
    public void release() {
        C6625o c6625o;
        C6625o c6625o2;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && i10 < 33) {
                this.f66916a.stop();
            }
            if (i10 >= 35 && (c6625o2 = this.f66917b) != null) {
                c6625o2.d(this.f66916a);
            }
            this.f66916a.release();
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && (c6625o = this.f66917b) != null) {
                c6625o.d(this.f66916a);
            }
            this.f66916a.release();
            throw th2;
        }
    }

    @Override // v1.InterfaceC6627q
    public void releaseOutputBuffer(int i10, boolean z10) {
        this.f66916a.releaseOutputBuffer(i10, z10);
    }

    @Override // v1.InterfaceC6627q
    public void setParameters(Bundle bundle) {
        this.f66916a.setParameters(bundle);
    }

    public Q(MediaCodec mediaCodec, C6625o c6625o) {
        this.f66916a = mediaCodec;
        this.f66917b = c6625o;
        if (Build.VERSION.SDK_INT < 35 || c6625o == null) {
            return;
        }
        c6625o.b(mediaCodec);
    }
}
