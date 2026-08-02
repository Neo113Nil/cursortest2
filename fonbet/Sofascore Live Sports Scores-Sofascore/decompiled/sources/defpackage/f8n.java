package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.google.android.gms.internal.ads.zzacc;
import com.google.android.gms.internal.ads.zzach;
import com.google.android.gms.internal.ads.zzaci;
import com.google.android.gms.internal.ads.zzahk;
import com.google.android.gms.internal.ads.zzat;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzht;
import com.google.android.gms.internal.ads.zzig;
import com.google.android.gms.internal.ads.zzip;
import com.google.android.gms.internal.ads.zzxf;
import com.google.android.gms.internal.ads.zzxk;
import com.google.android.gms.internal.ads.zzxy;
import com.google.android.gms.internal.ads.zzzf;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class f8n extends Handler implements Runnable {
    public final vdp a;
    public kep b;
    public IOException c;
    public int d;
    public Thread e;
    public boolean f;
    public volatile boolean g;
    public final /* synthetic */ zzaci h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8n(zzaci zzaciVar, Looper looper, vdp vdpVar, kep kepVar, long j) {
        super(looper);
        Objects.requireNonNull(zzaciVar);
        this.h = zzaciVar;
        this.a = vdpVar;
        this.b = kepVar;
    }

    public final void a(boolean z) {
        this.g = z;
        this.c = null;
        if (hasMessages(1)) {
            this.f = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f = true;
                    this.a.g = true;
                    Thread thread = this.e;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.h.b = null;
            SystemClock.elapsedRealtime();
            kep kepVar = this.b;
            kepVar.getClass();
            kepVar.i(this.a, true);
            this.b = null;
        }
    }

    public final void b() {
        zzxf zzxfVar;
        SystemClock.elapsedRealtime();
        kep kepVar = this.b;
        kepVar.getClass();
        int i = this.d;
        vdp vdpVar = this.a;
        zzip zzipVar = vdpVar.b;
        if (i == 0) {
            Uri uri = vdpVar.j.a;
            zzxfVar = new zzxf();
        } else {
            Uri uri2 = zzipVar.b;
            zzxfVar = new zzxf();
        }
        zzxy zzxyVar = kepVar.d;
        zzxyVar.a(new fig(zzxyVar, zzxfVar, new zzxk(-1, null, zzfm.t(vdpVar.i), zzfm.t(kepVar.A)), i));
        this.c = null;
        zzaci zzaciVar = this.h;
        f8n f8nVar = zzaciVar.b;
        f8nVar.getClass();
        zzaciVar.a.execute(f8nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long min;
        zzacc zzaccVar;
        zzahk zzahkVar;
        if (this.g) {
            return;
        }
        int i = message.what;
        int i2 = 1;
        if (i == 1) {
            b();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        zzaci zzaciVar = this.h;
        zzaciVar.b = null;
        SystemClock.elapsedRealtime();
        kep kepVar = this.b;
        kepVar.getClass();
        if (this.f) {
            kepVar.i(this.a, false);
            return;
        }
        int i3 = message.what;
        if (i3 == 2) {
            try {
                kepVar.j(this.a);
                return;
            } catch (RuntimeException e) {
                zzeh.f("Unexpected exception handling load completed", e);
                this.h.c = new zzach(e);
                return;
            }
        }
        if (i3 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.c = iOException;
        int i4 = this.d;
        this.d = i4 + 1;
        vdp vdpVar = this.a;
        Uri uri = vdpVar.b.b;
        zzxf zzxfVar = new zzxf();
        String str = zzfm.a;
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof zzat) || (th instanceof FileNotFoundException) || (th instanceof zzig) || (th instanceof zzach) || ((th instanceof zzht) && ((zzht) th).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min(i4 * 1000, 5000);
        if (min == C.TIME_UNSET) {
            zzaccVar = zzaci.e;
        } else {
            int q = kepVar.q();
            int i5 = q > kepVar.L ? 1 : 0;
            if (kepVar.H || !((zzahkVar = kepVar.z) == null || zzahkVar.zza() == C.TIME_UNSET)) {
                kepVar.L = q;
            } else {
                boolean z = kepVar.v;
                if (!z || kepVar.m()) {
                    kepVar.E = z;
                    kepVar.I = 0L;
                    kepVar.L = 0;
                    for (zzzf zzzfVar : kepVar.s) {
                        zzzfVar.k(false);
                    }
                    vdpVar.f.a = 0L;
                    vdpVar.i = 0L;
                    i2 = 1;
                    vdpVar.h = true;
                    vdpVar.l = false;
                } else {
                    kepVar.K = true;
                    zzaccVar = zzaci.d;
                }
            }
            zzaccVar = new zzacc(i5, min);
        }
        int i6 = zzaccVar.a;
        int i7 = (i6 == 0 || i6 == i2) ? i2 : 0;
        zzxy zzxyVar = kepVar.d;
        zzxyVar.a(new n72(zzxyVar, zzxfVar, new zzxk(-1, null, zzfm.t(vdpVar.i), zzfm.t(kepVar.A)), iOException, i7 ^ 1));
        int i8 = zzaccVar.a;
        if (i8 == 3) {
            zzaciVar.c = this.c;
            return;
        }
        if (i8 != 2) {
            if (i8 == 1) {
                this.d = 1;
            }
            long j = zzaccVar.b;
            if (j == C.TIME_UNSET) {
                j = Math.min((this.d - 1) * 1000, 5000);
            }
            zzaci zzaciVar2 = this.h;
            zzguk.f(zzaciVar2.b == null);
            zzaciVar2.b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(1, j);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.f;
                this.e = Thread.currentThread();
            }
            if (!z) {
                vdp vdpVar = this.a;
                String simpleName = vdp.class.getSimpleName();
                StringBuilder sb = new StringBuilder(simpleName.length() + 5);
                sb.append("load:");
                sb.append(simpleName);
                Trace.beginSection(sb.toString());
                try {
                    vdpVar.a();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.e = null;
                Thread.interrupted();
            }
            if (this.g) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.g) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Error e2) {
            if (!this.g) {
                zzeh.f("Unexpected error loading stream", e2);
                obtainMessage(4, e2).sendToTarget();
            }
            throw e2;
        } catch (Exception e3) {
            if (this.g) {
                return;
            }
            zzeh.f("Unexpected exception loading stream", e3);
            obtainMessage(3, new zzach(e3)).sendToTarget();
        } catch (OutOfMemoryError e4) {
            if (this.g) {
                return;
            }
            zzeh.f("OutOfMemory error loading stream", e4);
            obtainMessage(3, new zzach(e4)).sendToTarget();
        }
    }
}
