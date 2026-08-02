package v1;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.AbstractC2177b;
import e1.AbstractC4134a;
import e1.C4146m;
import e1.Z;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: v1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6616f implements r {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f66932g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f66933h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f66934a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f66935b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f66936c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f66937d;

    /* renamed from: e, reason: collision with root package name */
    public final C4146m f66938e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f66939f;

    /* renamed from: v1.f$a */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C6616f.this.h(message);
        }
    }

    /* renamed from: v1.f$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f66941a;

        /* renamed from: b, reason: collision with root package name */
        public int f66942b;

        /* renamed from: c, reason: collision with root package name */
        public int f66943c;

        /* renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f66944d = new MediaCodec.CryptoInfo();

        /* renamed from: e, reason: collision with root package name */
        public long f66945e;

        /* renamed from: f, reason: collision with root package name */
        public int f66946f;

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f66941a = i10;
            this.f66942b = i11;
            this.f66943c = i12;
            this.f66945e = j10;
            this.f66946f = i13;
        }
    }

    public C6616f(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new C4146m());
    }

    public static void e(k1.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f54099b;
        cryptoInfo.numBytesOfClearData = g(cVar.numBytesOfClearData, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = g(cVar.numBytesOfEncryptedData, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) AbstractC4134a.e(f(cVar.key, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) AbstractC4134a.e(f(cVar.iv, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f54098a;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f54100c, cVar.f54101d));
    }

    public static byte[] f(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int[] g(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static b m() {
        ArrayDeque arrayDeque = f66932g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return (b) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void n(b bVar) {
        ArrayDeque arrayDeque = f66932g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    @Override // v1.r
    public void a(int i10, int i11, k1.c cVar, long j10, int i12) {
        b();
        b m10 = m();
        m10.a(i10, i11, 0, j10, i12);
        e(cVar, m10.f66944d);
        ((Handler) Z.i(this.f66936c)).obtainMessage(2, m10).sendToTarget();
    }

    @Override // v1.r
    public void b() {
        RuntimeException runtimeException = (RuntimeException) this.f66937d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final void d() {
        this.f66938e.d();
        ((Handler) AbstractC4134a.e(this.f66936c)).obtainMessage(3).sendToTarget();
        this.f66938e.a();
    }

    @Override // v1.r
    public void flush() {
        if (this.f66939f) {
            try {
                l();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Message message) {
        b bVar;
        b bVar2;
        int i10 = message.what;
        if (i10 == 1) {
            bVar = (b) message.obj;
            i(bVar.f66941a, bVar.f66942b, bVar.f66943c, bVar.f66945e, bVar.f66946f);
        } else {
            if (i10 != 2) {
                bVar2 = null;
                if (i10 == 3) {
                    this.f66938e.f();
                } else if (i10 != 4) {
                    AbstractC2177b.a(this.f66937d, null, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    k((Bundle) message.obj);
                }
                if (bVar2 == null) {
                    n(bVar2);
                    return;
                }
                return;
            }
            bVar = (b) message.obj;
            j(bVar.f66941a, bVar.f66942b, bVar.f66944d, bVar.f66945e, bVar.f66946f);
        }
        bVar2 = bVar;
        if (bVar2 == null) {
        }
    }

    public final void i(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f66934a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            AbstractC2177b.a(this.f66937d, null, e10);
        }
    }

    public final void j(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f66933h) {
                this.f66934a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            AbstractC2177b.a(this.f66937d, null, e10);
        }
    }

    public final void k(Bundle bundle) {
        try {
            this.f66934a.setParameters(bundle);
        } catch (RuntimeException e10) {
            AbstractC2177b.a(this.f66937d, null, e10);
        }
    }

    public final void l() {
        ((Handler) AbstractC4134a.e(this.f66936c)).removeCallbacksAndMessages(null);
        d();
    }

    @Override // v1.r
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        b();
        b m10 = m();
        m10.a(i10, i11, i12, j10, i13);
        ((Handler) Z.i(this.f66936c)).obtainMessage(1, m10).sendToTarget();
    }

    @Override // v1.r
    public void setParameters(Bundle bundle) {
        b();
        ((Handler) Z.i(this.f66936c)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // v1.r
    public void shutdown() {
        if (this.f66939f) {
            flush();
            this.f66935b.quit();
        }
        this.f66939f = false;
    }

    @Override // v1.r
    public void start() {
        if (this.f66939f) {
            return;
        }
        this.f66935b.start();
        this.f66936c = new a(this.f66935b.getLooper());
        this.f66939f = true;
    }

    public C6616f(MediaCodec mediaCodec, HandlerThread handlerThread, C4146m c4146m) {
        this.f66934a = mediaCodec;
        this.f66935b = handlerThread;
        this.f66938e = c4146m;
        this.f66937d = new AtomicReference();
    }
}
