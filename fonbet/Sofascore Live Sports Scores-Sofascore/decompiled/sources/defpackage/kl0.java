package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kl0 implements v2c {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public gl0 c;
    public final AtomicReference d;
    public final yh3 e;
    public boolean f;

    public kl0(MediaCodec mediaCodec, HandlerThread handlerThread) {
        yh3 yh3Var = new yh3(0);
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = yh3Var;
        this.d = new AtomicReference();
    }

    public static il0 a() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new il0();
                }
                return (il0) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.v2c
    public final void c(Bundle bundle) {
        k();
        gl0 gl0Var = this.c;
        String str = nik.a;
        gl0Var.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.v2c
    public final void d(int i, int i2, int i3, long j) {
        k();
        il0 a = a();
        a.a = i;
        a.b = i2;
        a.d = j;
        a.e = i3;
        gl0 gl0Var = this.c;
        String str = nik.a;
        gl0Var.obtainMessage(1, a).sendToTarget();
    }

    @Override // defpackage.v2c
    public final void f(int i, d74 d74Var, long j, int i2) {
        k();
        il0 a = a();
        a.a = i;
        a.b = 0;
        a.d = j;
        a.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = a.c;
        cryptoInfo.numSubSamples = d74Var.f;
        int[] iArr = d74Var.d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < iArr.length) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = d74Var.e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < iArr3.length) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = d74Var.b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < bArr.length) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = d74Var.a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < bArr3.length) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = d74Var.c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(d74Var.g, d74Var.h));
        gl0 gl0Var = this.c;
        String str = nik.a;
        gl0Var.obtainMessage(2, a).sendToTarget();
    }

    @Override // defpackage.v2c
    public final void flush() {
        if (this.f) {
            try {
                gl0 gl0Var = this.c;
                gl0Var.getClass();
                gl0Var.removeCallbacksAndMessages(null);
                yh3 yh3Var = this.e;
                synchronized (yh3Var) {
                    yh3Var.b = false;
                }
                gl0 gl0Var2 = this.c;
                gl0Var2.getClass();
                gl0Var2.obtainMessage(3).sendToTarget();
                synchronized (yh3Var) {
                    while (!yh3Var.b) {
                        yh3Var.a.getClass();
                        yh3Var.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                yhk.q(e);
            }
        }
    }

    @Override // defpackage.v2c
    public final void k() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // defpackage.v2c
    public final void shutdown() {
        if (this.f) {
            flush();
            this.b.quit();
        }
        this.f = false;
    }

    @Override // defpackage.v2c
    public final void start() {
        if (this.f) {
            return;
        }
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        this.c = new gl0(this, handlerThread.getLooper(), 1);
        this.f = true;
    }
}
