package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzdo;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zziv;
import com.google.android.gms.internal.ads.zzvl;
import com.google.android.gms.internal.ads.zzvp;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fl0 implements r2c, zzvp {
    public final MediaCodec a;
    public boolean b;
    public int c = 0;
    public final MediaCodec.Callback d;
    public final Object e;
    public final Object f;

    public /* synthetic */ fl0(MediaCodec mediaCodec, HandlerThread handlerThread, p9p p9pVar, zzvl zzvlVar) {
        this.a = mediaCodec;
        this.d = new ml0(handlerThread, 1);
        this.e = p9pVar;
        this.f = zzvlVar;
    }

    public static String E(int i, String str) {
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

    public static String H(int i, String str) {
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

    @Override // com.google.android.gms.internal.ads.zzvp
    public boolean A(t9p t9pVar) {
        ml0 ml0Var = (ml0) this.d;
        synchronized (ml0Var.b) {
            ml0Var.p = t9pVar;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public void B(int i, int i2, int i3, long j) {
        ((p9p) this.e).e(i, i2, i3, j);
    }

    @Override // defpackage.r2c
    public void C(ArrayList arrayList) {
        this.a.subscribeToVendorParameters(arrayList);
    }

    @Override // defpackage.r2c
    public void D(ArrayList arrayList) {
        this.a.unsubscribeFromVendorParameters(arrayList);
    }

    public void F(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        umb umbVar;
        ml0 ml0Var = (ml0) this.d;
        HandlerThread handlerThread = ml0Var.c;
        z1a.E(ml0Var.d == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = this.a;
        mediaCodec.setCallback(ml0Var, handler);
        ml0Var.d = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        ((v2c) this.e).start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (umbVar = (umb) this.f) != null) {
            umbVar.a(mediaCodec);
        }
        this.c = 1;
    }

    public void G(MediaFormat mediaFormat, Surface surface, int i) {
        zzvl zzvlVar;
        ml0 ml0Var = (ml0) this.d;
        zzguk.f(ml0Var.d == null);
        HandlerThread handlerThread = ml0Var.c;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = this.a;
        mediaCodec.setCallback(ml0Var, handler);
        ml0Var.d = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i);
        Trace.endSection();
        ((p9p) this.e).mo905zza();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (zzvlVar = (zzvl) this.f) != null) {
            zzvlVar.b(mediaCodec);
        }
        this.c = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public void a(ArrayList arrayList) {
        this.a.subscribeToVendorParameters(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public void b(int i, zziv zzivVar, long j, int i2) {
        ((p9p) this.e).c(i, zzivVar, j, i2);
    }

    @Override // defpackage.r2c
    public void c(Bundle bundle) {
        ((v2c) this.e).c(bundle);
    }

    @Override // defpackage.r2c
    public void d(int i, int i2, int i3, long j) {
        ((v2c) this.e).d(i, i2, i3, j);
    }

    @Override // defpackage.r2c
    public MediaFormat e() {
        MediaFormat mediaFormat;
        ml0 ml0Var = (ml0) this.d;
        synchronized (ml0Var.b) {
            try {
                mediaFormat = ml0Var.g;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.r2c
    public void f(int i, d74 d74Var, long j, int i2) {
        ((v2c) this.e).f(i, d74Var, j, i2);
    }

    @Override // defpackage.r2c
    public void flush() {
        ((v2c) this.e).flush();
        this.a.flush();
        ml0 ml0Var = (ml0) this.d;
        synchronized (ml0Var.b) {
            ml0Var.k++;
            Handler handler = ml0Var.d;
            String str = nik.a;
            handler.post(new y2(ml0Var, 15));
        }
        this.a.start();
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public ByteBuffer g(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.r2c
    public ByteBuffer h(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.r2c
    public void i(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public void j(Bundle bundle) {
        ((p9p) this.e).d(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public void k(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.r2c
    public void l(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x0028, DONT_GENERATE, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x000e, B:6:0x001b, B:12:0x0026, B:15:0x002a, B:20:0x0046, B:23:0x003a, B:24:0x0048, B:25:0x004d), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x000e, B:6:0x001b, B:12:0x0026, B:15:0x002a, B:20:0x0046, B:23:0x003a, B:24:0x0048, B:25:0x004d), top: B:3:0x000e }] */
    @Override // defpackage.r2c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m() {
        boolean z;
        ((v2c) this.e).k();
        ml0 ml0Var = (ml0) this.d;
        synchronized (ml0Var.b) {
            try {
                ml0Var.b();
                if (ml0Var.k <= 0 && !ml0Var.l) {
                    z = false;
                    int i = -1;
                    if (!z) {
                        return -1;
                    }
                    zz0 zz0Var = (zz0) ml0Var.n;
                    int i2 = zz0Var.b;
                    int i3 = zz0Var.c;
                    if (!(i2 == i3)) {
                        if (i2 == i3) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i = ((int[]) zz0Var.e)[i2];
                        zz0Var.b = (i2 + 1) & zz0Var.d;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x0028, DONT_GENERATE, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x000e, B:6:0x001b, B:12:0x0026, B:15:0x002b, B:19:0x0038, B:22:0x003c, B:24:0x004a, B:25:0x0071, B:29:0x0067, B:30:0x0073, B:31:0x0078), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x000e, B:6:0x001b, B:12:0x0026, B:15:0x002b, B:19:0x0038, B:22:0x003c, B:24:0x004a, B:25:0x0071, B:29:0x0067, B:30:0x0073, B:31:0x0078), top: B:3:0x000e }] */
    @Override // defpackage.r2c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int n(MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        ((v2c) this.e).k();
        ml0 ml0Var = (ml0) this.d;
        synchronized (ml0Var.b) {
            try {
                ml0Var.b();
                if (ml0Var.k <= 0 && !ml0Var.l) {
                    z = false;
                    if (!z) {
                        return -1;
                    }
                    zz0 zz0Var = (zz0) ml0Var.o;
                    int i = zz0Var.b;
                    int i2 = zz0Var.c;
                    if (i == i2) {
                        return -1;
                    }
                    if (i == i2) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    int i3 = ((int[]) zz0Var.e)[i];
                    zz0Var.b = zz0Var.d & (i + 1);
                    if (i3 >= 0) {
                        ml0Var.g.getClass();
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) ml0Var.e.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (i3 == -2) {
                        ml0Var.g = (MediaFormat) ml0Var.f.remove();
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

    @Override // defpackage.r2c
    public ByteBuffer o(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public ByteBuffer p(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.r2c
    public boolean q(e3c e3cVar) {
        ml0 ml0Var = (ml0) this.d;
        synchronized (ml0Var.b) {
            ml0Var.p = e3cVar;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public void r(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.r2c
    public void release() {
        umb umbVar;
        umb umbVar2;
        try {
            if (this.c == 1) {
                ((v2c) this.e).shutdown();
                ml0 ml0Var = (ml0) this.d;
                synchronized (ml0Var.b) {
                    ml0Var.l = true;
                    ml0Var.c.quit();
                    ml0Var.a();
                }
            }
            this.c = 2;
            if (this.b) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.a.stop();
                }
                if (i >= 35 && (umbVar2 = (umb) this.f) != null) {
                    umbVar2.b(this.a);
                }
                this.a.release();
                this.b = true;
            } finally {
            }
        } catch (Throwable th) {
            if (!this.b) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.a.stop();
                    }
                    if (i2 >= 35 && (umbVar = (umb) this.f) != null) {
                        umbVar.b(this.a);
                    }
                    this.a.release();
                    this.b = true;
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.r2c
    public void s(z3c z3cVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new dl0(this, z3cVar, 0), handler);
    }

    @Override // defpackage.r2c
    public void setVideoScalingMode(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.r2c
    public void t() {
        this.a.detachOutputSurface();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x0028, DONT_GENERATE, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x000e, B:6:0x001b, B:12:0x0026, B:15:0x002b, B:19:0x0038, B:22:0x003c, B:24:0x0048, B:26:0x004c, B:27:0x0071, B:30:0x0062, B:33:0x0066, B:34:0x0073, B:35:0x0078), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x000e, B:6:0x001b, B:12:0x0026, B:15:0x002b, B:19:0x0038, B:22:0x003c, B:24:0x0048, B:26:0x004c, B:27:0x0071, B:30:0x0062, B:33:0x0066, B:34:0x0073, B:35:0x0078), top: B:3:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzvp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int u(MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        ((p9p) this.e).zzg();
        ml0 ml0Var = (ml0) this.d;
        synchronized (ml0Var.b) {
            try {
                ml0Var.d();
                if (ml0Var.k <= 0 && !ml0Var.l) {
                    z = false;
                    if (!z) {
                        return -1;
                    }
                    zzdo zzdoVar = (zzdo) ml0Var.o;
                    int i = zzdoVar.b;
                    int i2 = zzdoVar.c;
                    if (i == i2) {
                        return -1;
                    }
                    if (i == i2) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    int i3 = zzdoVar.a[i];
                    zzdoVar.b = zzdoVar.d & (i + 1);
                    if (i3 >= 0) {
                        if (ml0Var.g == null) {
                            throw null;
                        }
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) ml0Var.e.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (i3 == -2) {
                        ml0Var.g = (MediaFormat) ml0Var.f.remove();
                        i3 = -2;
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

    @Override // com.google.android.gms.internal.ads.zzvp
    public void v(jyo jyoVar) {
        vvo vvoVar = new vvo(8, this, jyoVar);
        ml0 ml0Var = (ml0) this.d;
        synchronized (ml0Var.b) {
            ml0Var.d();
            vvoVar.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public void w(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.r2c
    public void x(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public void y(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.r2c
    public void z(yq5 yq5Var) {
        ml0 ml0Var = (ml0) this.d;
        r0 r0Var = new r0(12, this, yq5Var);
        synchronized (ml0Var.b) {
            ml0Var.b();
            r0Var.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x0028, DONT_GENERATE, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x000e, B:6:0x001b, B:12:0x0026, B:15:0x002a, B:20:0x0044, B:23:0x003a, B:24:0x0046, B:25:0x004b), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x000e, B:6:0x001b, B:12:0x0026, B:15:0x002a, B:20:0x0044, B:23:0x003a, B:24:0x0046, B:25:0x004b), top: B:3:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzvp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int zze() {
        boolean z;
        ((p9p) this.e).zzg();
        ml0 ml0Var = (ml0) this.d;
        synchronized (ml0Var.b) {
            try {
                ml0Var.d();
                if (ml0Var.k <= 0 && !ml0Var.l) {
                    z = false;
                    int i = -1;
                    if (!z) {
                        return -1;
                    }
                    zzdo zzdoVar = (zzdo) ml0Var.n;
                    int i2 = zzdoVar.b;
                    int i3 = zzdoVar.c;
                    if (!(i2 == i3)) {
                        if (i2 == i3) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i = zzdoVar.a[i2];
                        zzdoVar.b = (i2 + 1) & zzdoVar.d;
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

    @Override // com.google.android.gms.internal.ads.zzvp
    public MediaFormat zzg() {
        MediaFormat mediaFormat;
        ml0 ml0Var = (ml0) this.d;
        synchronized (ml0Var.b) {
            try {
                mediaFormat = ml0Var.g;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public void zzk() {
        ((p9p) this.e).zze();
        MediaCodec mediaCodec = this.a;
        mediaCodec.flush();
        ml0 ml0Var = (ml0) this.d;
        synchronized (ml0Var.b) {
            ml0Var.k++;
            Handler handler = ml0Var.d;
            String str = zzfm.a;
            handler.post(new dno(ml0Var, 23));
        }
        mediaCodec.start();
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public void zzl() {
        zzvl zzvlVar;
        zzvl zzvlVar2;
        zzvl zzvlVar3;
        try {
            try {
                if (this.c == 1) {
                    ((p9p) this.e).zzf();
                    ml0 ml0Var = (ml0) this.d;
                    synchronized (ml0Var.b) {
                        ml0Var.l = true;
                        ml0Var.c.quit();
                        ml0Var.c();
                    }
                }
                this.c = 2;
                if (this.b) {
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.a.stop();
                }
                if (i >= 35 && (zzvlVar3 = (zzvl) this.f) != null) {
                    zzvlVar3.c(this.a);
                }
                this.a.release();
                this.b = true;
            } catch (Throwable th) {
                if (!this.b) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.a.stop();
                    }
                    if (i2 >= 35 && (zzvlVar2 = (zzvl) this.f) != null) {
                        zzvlVar2.c(this.a);
                    }
                    this.a.release();
                    this.b = true;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && (zzvlVar = (zzvl) this.f) != null) {
                zzvlVar.c(this.a);
            }
            this.a.release();
            this.b = true;
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public void zzo() {
        this.a.detachOutputSurface();
    }

    public fl0(MediaCodec mediaCodec, HandlerThread handlerThread, v2c v2cVar, umb umbVar) {
        this.a = mediaCodec;
        this.d = new ml0(handlerThread, 0);
        this.e = v2cVar;
        this.f = umbVar;
    }
}
