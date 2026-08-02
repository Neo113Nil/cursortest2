package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nbd implements q2c {
    public static nbd f;
    public boolean a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public nbd(Context context) {
        Executor u = dy0.u();
        this.c = u;
        this.d = new CopyOnWriteArrayList();
        this.e = new Object();
        this.b = 0;
        u.execute(new gjc(8, this, context));
    }

    public static String a(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            wt3.u(i, "Unknown(", ")", sb);
        }
        return sb.toString();
    }

    public static synchronized nbd b(Context context) {
        nbd nbdVar;
        synchronized (nbd.class) {
            nbdVar = f;
            if (nbdVar == null) {
                nbdVar = new nbd(context);
                f = nbdVar;
            }
        }
        return nbdVar;
    }

    @Override // defpackage.q2c
    public void C(int i, boolean z) {
        ((MediaCodec) this.c).releaseOutputBuffer(i, z);
    }

    @Override // defpackage.q2c
    public void D(int i, d74 d74Var, long j) {
        jl0 jl0Var = (jl0) this.e;
        RuntimeException runtimeException = (RuntimeException) jl0Var.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        hl0 b = jl0.b();
        b.a = i;
        b.b = 0;
        b.d = j;
        b.e = 0;
        MediaCodec.CryptoInfo cryptoInfo = b.c;
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
        if (lik.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(d74Var.g, d74Var.h));
        }
        jl0Var.c.obtainMessage(1, b).sendToTarget();
    }

    @Override // defpackage.q2c
    public void F(z3c z3cVar, Handler handler) {
        ((MediaCodec) this.c).setOnFrameRenderedListener(new cl0(this, z3cVar, 0), handler);
    }

    @Override // defpackage.q2c
    public void c(Bundle bundle) {
        ((MediaCodec) this.c).setParameters(bundle);
    }

    @Override // defpackage.q2c
    public void d(int i, int i2, int i3, long j) {
        jl0 jl0Var = (jl0) this.e;
        RuntimeException runtimeException = (RuntimeException) jl0Var.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        hl0 b = jl0.b();
        b.a = i;
        b.b = i2;
        b.d = j;
        b.e = i3;
        gl0 gl0Var = jl0Var.c;
        int i4 = lik.a;
        gl0Var.obtainMessage(0, b).sendToTarget();
    }

    @Override // defpackage.q2c
    public MediaFormat e() {
        MediaFormat mediaFormat;
        ll0 ll0Var = (ll0) this.d;
        synchronized (ll0Var.a) {
            try {
                mediaFormat = ll0Var.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public int f() {
        int i;
        synchronized (this.e) {
            i = this.b;
        }
        return i;
    }

    @Override // defpackage.q2c
    public void flush() {
        ((jl0) this.e).a();
        ((MediaCodec) this.c).flush();
        ll0 ll0Var = (ll0) this.d;
        synchronized (ll0Var.a) {
            ll0Var.k++;
            Handler handler = ll0Var.c;
            int i = lik.a;
            handler.post(new y2(ll0Var, 14));
        }
        ((MediaCodec) this.c).start();
    }

    public void g(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        ll0 ll0Var = (ll0) this.d;
        MediaCodec mediaCodec = (MediaCodec) this.c;
        HandlerThread handlerThread = ll0Var.b;
        int i = 0;
        qx9.t(ll0Var.c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(ll0Var, handler);
        ll0Var.c = handler;
        q5a.y("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        q5a.B();
        jl0 jl0Var = (jl0) this.e;
        HandlerThread handlerThread2 = jl0Var.b;
        if (!jl0Var.f) {
            handlerThread2.start();
            jl0Var.c = new gl0(jl0Var, handlerThread2.getLooper(), i);
            jl0Var.f = true;
        }
        q5a.y("startCodec");
        mediaCodec.start();
        q5a.B();
        this.b = 1;
    }

    @Override // defpackage.q2c
    public ByteBuffer h(int i) {
        return ((MediaCodec) this.c).getInputBuffer(i);
    }

    @Override // defpackage.q2c
    public void i(Surface surface) {
        ((MediaCodec) this.c).setOutputSurface(surface);
    }

    public void j(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            lbd lbdVar = (lbd) it.next();
            if (lbdVar.a.get() == null) {
                copyOnWriteArrayList.remove(lbdVar);
            }
        }
        synchronized (this.e) {
            try {
                if (this.a && this.b == i) {
                    return;
                }
                this.a = true;
                this.b = i;
                Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    lbd lbdVar2 = (lbd) it2.next();
                    lbdVar2.b.execute(new yp8(lbdVar2, 21));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.q2c
    public void l(int i, long j) {
        ((MediaCodec) this.c).releaseOutputBuffer(i, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[Catch: all -> 0x001e, DONT_GENERATE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x0007, B:6:0x0011, B:12:0x001c, B:15:0x0020, B:17:0x0025, B:19:0x0029, B:24:0x0038, B:26:0x0034, B:28:0x003a, B:29:0x003c, B:30:0x003d, B:31:0x003f), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0020 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x0007, B:6:0x0011, B:12:0x001c, B:15:0x0020, B:17:0x0025, B:19:0x0029, B:24:0x0038, B:26:0x0034, B:28:0x003a, B:29:0x003c, B:30:0x003d, B:31:0x003f), top: B:3:0x0007 }] */
    @Override // defpackage.q2c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m() {
        boolean z;
        ll0 ll0Var = (ll0) this.d;
        synchronized (ll0Var.a) {
            try {
                boolean z2 = true;
                if (ll0Var.k <= 0 && !ll0Var.l) {
                    z = false;
                    int i = -1;
                    if (!z) {
                        return -1;
                    }
                    IllegalStateException illegalStateException = ll0Var.m;
                    if (illegalStateException != null) {
                        ll0Var.m = null;
                        throw illegalStateException;
                    }
                    MediaCodec.CodecException codecException = ll0Var.j;
                    if (codecException != null) {
                        ll0Var.j = null;
                        throw codecException;
                    }
                    xl0 xl0Var = ll0Var.d;
                    if (xl0Var.d != 0) {
                        z2 = false;
                    }
                    if (!z2) {
                        i = xl0Var.f();
                    }
                    return i;
                }
                z = true;
                int i2 = -1;
                if (!z) {
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[Catch: all -> 0x001e, DONT_GENERATE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x0007, B:6:0x0011, B:12:0x001c, B:15:0x0021, B:17:0x0026, B:19:0x002a, B:23:0x0034, B:25:0x0036, B:27:0x003c, B:28:0x0063, B:32:0x0059, B:34:0x0065, B:35:0x0067, B:36:0x0068, B:37:0x006a), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0021 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x0007, B:6:0x0011, B:12:0x001c, B:15:0x0021, B:17:0x0026, B:19:0x002a, B:23:0x0034, B:25:0x0036, B:27:0x003c, B:28:0x0063, B:32:0x0059, B:34:0x0065, B:35:0x0067, B:36:0x0068, B:37:0x006a), top: B:3:0x0007 }] */
    @Override // defpackage.q2c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int n(MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        ll0 ll0Var = (ll0) this.d;
        synchronized (ll0Var.a) {
            try {
                boolean z2 = true;
                if (ll0Var.k <= 0 && !ll0Var.l) {
                    z = false;
                    if (!z) {
                        return -1;
                    }
                    IllegalStateException illegalStateException = ll0Var.m;
                    if (illegalStateException != null) {
                        ll0Var.m = null;
                        throw illegalStateException;
                    }
                    MediaCodec.CodecException codecException = ll0Var.j;
                    if (codecException != null) {
                        ll0Var.j = null;
                        throw codecException;
                    }
                    xl0 xl0Var = ll0Var.e;
                    if (xl0Var.d != 0) {
                        z2 = false;
                    }
                    if (z2) {
                        return -1;
                    }
                    int f2 = xl0Var.f();
                    if (f2 >= 0) {
                        qx9.u(ll0Var.h);
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) ll0Var.f.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (f2 == -2) {
                        ll0Var.h = (MediaFormat) ll0Var.g.remove();
                    }
                    return f2;
                }
                z = true;
                if (!z) {
                }
            } finally {
            }
        }
    }

    @Override // defpackage.q2c
    public ByteBuffer o(int i) {
        return ((MediaCodec) this.c).getOutputBuffer(i);
    }

    @Override // defpackage.q2c
    public void release() {
        try {
            if (this.b == 1) {
                jl0 jl0Var = (jl0) this.e;
                if (jl0Var.f) {
                    jl0Var.a();
                    jl0Var.b.quit();
                }
                jl0Var.f = false;
                ll0 ll0Var = (ll0) this.d;
                synchronized (ll0Var.a) {
                    ll0Var.l = true;
                    ll0Var.b.quit();
                    ll0Var.a();
                }
            }
            this.b = 2;
        } finally {
            if (!this.a) {
                ((MediaCodec) this.c).release();
                this.a = true;
            }
        }
    }

    @Override // defpackage.q2c
    public void setVideoScalingMode(int i) {
        ((MediaCodec) this.c).setVideoScalingMode(i);
    }

    public nbd(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this.c = mediaCodec;
        this.d = new ll0(handlerThread);
        this.e = new jl0(mediaCodec, handlerThread2);
        this.b = 0;
    }
}
