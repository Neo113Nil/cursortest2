package v1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import e1.AbstractC4134a;
import e1.Z;
import java.util.ArrayDeque;
import v1.InterfaceC6627q;
import z.C6904e;

/* renamed from: v1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6618h extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f66949b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f66950c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f66955h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f66956i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f66957j;

    /* renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f66958k;

    /* renamed from: l, reason: collision with root package name */
    public long f66959l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f66960m;

    /* renamed from: n, reason: collision with root package name */
    public IllegalStateException f66961n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC6627q.c f66962o;

    /* renamed from: a, reason: collision with root package name */
    public final Object f66948a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final C6904e f66951d = new C6904e();

    /* renamed from: e, reason: collision with root package name */
    public final C6904e f66952e = new C6904e();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f66953f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f66954g = new ArrayDeque();

    public C6618h(HandlerThread handlerThread) {
        this.f66949b = handlerThread;
    }

    public final void b(MediaFormat mediaFormat) {
        this.f66952e.a(-2);
        this.f66954g.add(mediaFormat);
    }

    public int c() {
        synchronized (this.f66948a) {
            try {
                j();
                int i10 = -1;
                if (i()) {
                    return -1;
                }
                if (!this.f66951d.d()) {
                    i10 = this.f66951d.e();
                }
                return i10;
            } finally {
            }
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f66948a) {
            try {
                j();
                if (i()) {
                    return -1;
                }
                if (this.f66952e.d()) {
                    return -1;
                }
                int e10 = this.f66952e.e();
                if (e10 >= 0) {
                    AbstractC4134a.i(this.f66955h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f66953f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (e10 == -2) {
                    this.f66955h = (MediaFormat) this.f66954g.remove();
                }
                return e10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        synchronized (this.f66948a) {
            this.f66959l++;
            ((Handler) Z.i(this.f66950c)).post(new Runnable() { // from class: v1.g
                @Override // java.lang.Runnable
                public final void run() {
                    C6618h.this.n();
                }
            });
        }
    }

    public final void f() {
        if (!this.f66954g.isEmpty()) {
            this.f66956i = (MediaFormat) this.f66954g.getLast();
        }
        this.f66951d.b();
        this.f66952e.b();
        this.f66953f.clear();
        this.f66954g.clear();
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f66948a) {
            try {
                mediaFormat = this.f66955h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        AbstractC4134a.g(this.f66950c == null);
        this.f66949b.start();
        Handler handler = new Handler(this.f66949b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f66950c = handler;
    }

    public final boolean i() {
        return this.f66959l > 0 || this.f66960m;
    }

    public final void j() {
        k();
        m();
        l();
    }

    public final void k() {
        IllegalStateException illegalStateException = this.f66961n;
        if (illegalStateException == null) {
            return;
        }
        this.f66961n = null;
        throw illegalStateException;
    }

    public final void l() {
        MediaCodec.CryptoException cryptoException = this.f66958k;
        if (cryptoException == null) {
            return;
        }
        this.f66958k = null;
        throw cryptoException;
    }

    public final void m() {
        MediaCodec.CodecException codecException = this.f66957j;
        if (codecException == null) {
            return;
        }
        this.f66957j = null;
        throw codecException;
    }

    public final void n() {
        synchronized (this.f66948a) {
            try {
                if (this.f66960m) {
                    return;
                }
                long j10 = this.f66959l - 1;
                this.f66959l = j10;
                if (j10 > 0) {
                    return;
                }
                if (j10 < 0) {
                    o(new IllegalStateException());
                } else {
                    f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void o(IllegalStateException illegalStateException) {
        synchronized (this.f66948a) {
            this.f66961n = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f66948a) {
            this.f66958k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f66948a) {
            this.f66957j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f66948a) {
            try {
                this.f66951d.a(i10);
                InterfaceC6627q.c cVar = this.f66962o;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f66948a) {
            try {
                MediaFormat mediaFormat = this.f66956i;
                if (mediaFormat != null) {
                    b(mediaFormat);
                    this.f66956i = null;
                }
                this.f66952e.a(i10);
                this.f66953f.add(bufferInfo);
                InterfaceC6627q.c cVar = this.f66962o;
                if (cVar != null) {
                    cVar.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f66948a) {
            b(mediaFormat);
            this.f66956i = null;
        }
    }

    public void p(InterfaceC6627q.c cVar) {
        synchronized (this.f66948a) {
            this.f66962o = cVar;
        }
    }

    public void q() {
        synchronized (this.f66948a) {
            this.f66960m = true;
            this.f66949b.quit();
            f();
        }
    }
}
