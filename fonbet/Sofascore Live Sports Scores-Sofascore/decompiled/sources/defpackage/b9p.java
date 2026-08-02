package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import com.google.android.gms.internal.ads.zzdt;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zziv;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b9p implements p9p {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public gl0 c;
    public final AtomicReference d = new AtomicReference();
    public final zzdt e;
    public boolean f;

    public b9p(MediaCodec mediaCodec, HandlerThread handlerThread, zzdt zzdtVar) {
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = zzdtVar;
    }

    public static a9p a() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new a9p();
                }
                return (a9p) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.p9p
    public final void c(int i, zziv zzivVar, long j, int i2) {
        int length;
        int length2;
        int length3;
        int length4;
        zzg();
        a9p a = a();
        a.a = i;
        a.b = 0;
        a.d = j;
        a.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = a.c;
        cryptoInfo.numSubSamples = zzivVar.f;
        int[] iArr = zzivVar.d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < (length4 = iArr.length)) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, length4);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = zzivVar.e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < (length3 = iArr3.length)) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, length3);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = zzivVar.b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < (length2 = bArr.length)) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = zzivVar.a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < (length = bArr3.length)) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = zzivVar.c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzivVar.g, zzivVar.h));
        gl0 gl0Var = this.c;
        String str = zzfm.a;
        gl0Var.obtainMessage(2, a).sendToTarget();
    }

    @Override // defpackage.p9p
    public final void d(Bundle bundle) {
        zzg();
        gl0 gl0Var = this.c;
        String str = zzfm.a;
        gl0Var.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.p9p
    public final void e(int i, int i2, int i3, long j) {
        zzg();
        a9p a = a();
        a.a = i;
        a.b = i2;
        a.d = j;
        a.e = i3;
        gl0 gl0Var = this.c;
        String str = zzfm.a;
        gl0Var.obtainMessage(1, a).sendToTarget();
    }

    @Override // defpackage.p9p
    /* renamed from: zza */
    public final void mo905zza() {
        if (this.f) {
            return;
        }
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        this.c = new gl0(this, handlerThread.getLooper(), 14);
        this.f = true;
    }

    @Override // defpackage.p9p
    public final void zze() {
        if (this.f) {
            try {
                gl0 gl0Var = this.c;
                if (gl0Var == null) {
                    throw null;
                }
                gl0Var.removeCallbacksAndMessages(null);
                zzdt zzdtVar = this.e;
                synchronized (zzdtVar) {
                    zzdtVar.a = false;
                }
                gl0 gl0Var2 = this.c;
                if (gl0Var2 == null) {
                    throw null;
                }
                gl0Var2.obtainMessage(3).sendToTarget();
                synchronized (zzdtVar) {
                    while (!zzdtVar.a) {
                        zzdtVar.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                yhk.q(e);
            }
        }
    }

    @Override // defpackage.p9p
    public final void zzf() {
        if (this.f) {
            zze();
            this.b.quit();
        }
        this.f = false;
    }

    @Override // defpackage.p9p
    public final void zzg() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }
}
