package v1;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import b1.AbstractC2335D;
import e1.T;
import java.nio.ByteBuffer;
import v1.C6613c;
import v1.InterfaceC6627q;

/* renamed from: v1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6613c implements InterfaceC6627q {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f66921a;

    /* renamed from: b, reason: collision with root package name */
    public final C6618h f66922b;

    /* renamed from: c, reason: collision with root package name */
    public final r f66923c;

    /* renamed from: d, reason: collision with root package name */
    public final C6625o f66924d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f66925e;

    /* renamed from: f, reason: collision with root package name */
    public int f66926f;

    /* renamed from: v1.c$b */
    public static final class b implements InterfaceC6627q.b {

        /* renamed from: b, reason: collision with root package name */
        public final Ra.t f66927b;

        /* renamed from: c, reason: collision with root package name */
        public final Ra.t f66928c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f66929d;

        public b(final int i10) {
            this(new Ra.t() { // from class: v1.d
                @Override // Ra.t
                public final Object get() {
                    return C6613c.b.d(i10);
                }
            }, new Ra.t() { // from class: v1.e
                @Override // Ra.t
                public final Object get() {
                    return C6613c.b.c(i10);
                }
            });
        }

        public static /* synthetic */ HandlerThread c(int i10) {
            return new HandlerThread(C6613c.r(i10));
        }

        public static /* synthetic */ HandlerThread d(int i10) {
            return new HandlerThread(C6613c.q(i10));
        }

        public static boolean g(androidx.media3.common.a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 34) {
                return false;
            }
            return i10 >= 35 || AbstractC2335D.t(aVar.f20543o);
        }

        @Override // v1.InterfaceC6627q.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C6613c b(InterfaceC6627q.a aVar) {
            Exception exc;
            MediaCodec mediaCodec;
            r c6616f;
            int i10;
            String str = aVar.f66976a.f66986a;
            C6613c c6613c = null;
            try {
                T.a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    if (this.f66929d && g(aVar.f66978c)) {
                        c6616f = new S(mediaCodec);
                        i10 = 4;
                    } else {
                        c6616f = new C6616f(mediaCodec, (HandlerThread) this.f66928c.get());
                        i10 = 0;
                    }
                    C6613c c6613c2 = new C6613c(mediaCodec, (HandlerThread) this.f66927b.get(), c6616f, aVar.f66981f);
                    try {
                        T.b();
                        Surface surface = aVar.f66979d;
                        if (surface == null && aVar.f66976a.f66996k && Build.VERSION.SDK_INT >= 35) {
                            i10 |= 8;
                        }
                        c6613c2.t(aVar.f66977b, surface, aVar.f66980e, i10);
                        return c6613c2;
                    } catch (Exception e10) {
                        exc = e10;
                        c6613c = c6613c2;
                        if (c6613c != null) {
                            c6613c.release();
                            throw exc;
                        }
                        if (mediaCodec == null) {
                            throw exc;
                        }
                        mediaCodec.release();
                        throw exc;
                    }
                } catch (Exception e11) {
                    exc = e11;
                }
            } catch (Exception e12) {
                exc = e12;
                mediaCodec = null;
            }
        }

        public void f(boolean z10) {
            this.f66929d = z10;
        }

        public b(Ra.t tVar, Ra.t tVar2) {
            this.f66927b = tVar;
            this.f66928c = tVar2;
            this.f66929d = false;
        }
    }

    public static /* synthetic */ void m(C6613c c6613c, InterfaceC6627q.d dVar, MediaCodec mediaCodec, long j10, long j11) {
        c6613c.getClass();
        dVar.a(c6613c, j10, j11);
    }

    public static String q(int i10) {
        return s(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static String r(int i10) {
        return s(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public static String s(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // v1.InterfaceC6627q
    public void a(int i10, int i11, k1.c cVar, long j10, int i12) {
        this.f66923c.a(i10, i11, cVar, j10, i12);
    }

    @Override // v1.InterfaceC6627q
    public void b() {
        this.f66921a.detachOutputSurface();
    }

    @Override // v1.InterfaceC6627q
    public void c(int i10) {
        this.f66921a.setVideoScalingMode(i10);
    }

    @Override // v1.InterfaceC6627q
    public ByteBuffer d(int i10) {
        return this.f66921a.getInputBuffer(i10);
    }

    @Override // v1.InterfaceC6627q
    public void e(Surface surface) {
        this.f66921a.setOutputSurface(surface);
    }

    @Override // v1.InterfaceC6627q
    public void f(final InterfaceC6627q.d dVar, Handler handler) {
        this.f66921a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: v1.b
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                C6613c.m(C6613c.this, dVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // v1.InterfaceC6627q
    public void flush() {
        this.f66923c.flush();
        this.f66921a.flush();
        this.f66922b.e();
        this.f66921a.start();
    }

    @Override // v1.InterfaceC6627q
    public boolean g() {
        return false;
    }

    @Override // v1.InterfaceC6627q
    public MediaFormat getOutputFormat() {
        return this.f66922b.g();
    }

    @Override // v1.InterfaceC6627q
    public boolean h(InterfaceC6627q.c cVar) {
        this.f66922b.p(cVar);
        return true;
    }

    @Override // v1.InterfaceC6627q
    public void i(int i10, long j10) {
        this.f66921a.releaseOutputBuffer(i10, j10);
    }

    @Override // v1.InterfaceC6627q
    public int j() {
        this.f66923c.b();
        return this.f66922b.c();
    }

    @Override // v1.InterfaceC6627q
    public int k(MediaCodec.BufferInfo bufferInfo) {
        this.f66923c.b();
        return this.f66922b.d(bufferInfo);
    }

    @Override // v1.InterfaceC6627q
    public ByteBuffer l(int i10) {
        return this.f66921a.getOutputBuffer(i10);
    }

    @Override // v1.InterfaceC6627q
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        this.f66923c.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // v1.InterfaceC6627q
    public void release() {
        C6625o c6625o;
        C6625o c6625o2;
        try {
            if (this.f66926f == 1) {
                this.f66923c.shutdown();
                this.f66922b.q();
            }
            this.f66926f = 2;
            if (this.f66925e) {
                return;
            }
            try {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30 && i10 < 33) {
                    this.f66921a.stop();
                }
                if (i10 >= 35 && (c6625o2 = this.f66924d) != null) {
                    c6625o2.d(this.f66921a);
                }
                this.f66921a.release();
                this.f66925e = true;
            } finally {
            }
        } catch (Throwable th2) {
            if (!this.f66925e) {
                try {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30 && i11 < 33) {
                        this.f66921a.stop();
                    }
                    if (i11 >= 35 && (c6625o = this.f66924d) != null) {
                        c6625o.d(this.f66921a);
                    }
                    this.f66921a.release();
                    this.f66925e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override // v1.InterfaceC6627q
    public void releaseOutputBuffer(int i10, boolean z10) {
        this.f66921a.releaseOutputBuffer(i10, z10);
    }

    @Override // v1.InterfaceC6627q
    public void setParameters(Bundle bundle) {
        this.f66923c.setParameters(bundle);
    }

    public final void t(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        C6625o c6625o;
        this.f66922b.h(this.f66921a);
        T.a("configureCodec");
        this.f66921a.configure(mediaFormat, surface, mediaCrypto, i10);
        T.b();
        this.f66923c.start();
        T.a("startCodec");
        this.f66921a.start();
        T.b();
        if (Build.VERSION.SDK_INT >= 35 && (c6625o = this.f66924d) != null) {
            c6625o.b(this.f66921a);
        }
        this.f66926f = 1;
    }

    public C6613c(MediaCodec mediaCodec, HandlerThread handlerThread, r rVar, C6625o c6625o) {
        this.f66921a = mediaCodec;
        this.f66922b = new C6618h(handlerThread);
        this.f66923c = rVar;
        this.f66924d = c6625o;
        this.f66926f = 0;
    }
}
