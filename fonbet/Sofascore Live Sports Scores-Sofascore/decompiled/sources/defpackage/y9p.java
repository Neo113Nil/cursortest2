package defpackage;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.internal.zza;
import com.google.android.gms.cast.internal.zzac;
import com.google.android.gms.cast.internal.zzai;
import com.google.android.gms.cast.internal.zzx;
import com.google.android.gms.internal.cast.zzfk;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class y9p extends zzai {
    public final AtomicReference a;
    public final zzfk b;

    public y9p(zzx zzxVar) {
        this.a = new AtomicReference(zzxVar);
        this.b = new zzfk(zzxVar.getLooper());
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void A2(String str, String str2) {
        zzx zzxVar = (zzx) this.a.get();
        if (zzxVar == null) {
            return;
        }
        zzx.a0.a("Receive (type=text, ns=%s) %s", str, str2);
        this.b.post(new u8p(this, zzxVar, str, str2));
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void B3(int i, long j) {
        zzx zzxVar = (zzx) this.a.get();
        if (zzxVar == null) {
            return;
        }
        zzxVar.v(i, j);
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void H2(zza zzaVar) {
        zzx zzxVar = (zzx) this.a.get();
        if (zzxVar == null) {
            return;
        }
        zzx.a0.a("onApplicationStatusChanged", new Object[0]);
        this.b.post(new yuo(this, zzxVar, zzaVar));
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void P0() {
        zzx.a0.a("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void Z(String str, byte[] bArr) {
        if (((zzx) this.a.get()) == null) {
            return;
        }
        Logger logger = zzx.a0;
        zzx.a0.a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void f(int i) {
        zzx zzxVar = (zzx) this.a.get();
        if (zzxVar == null) {
            return;
        }
        zzxVar.w(i);
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void g(int i) {
        zzx zzxVar = (zzx) this.a.get();
        if (zzxVar == null) {
            return;
        }
        zzxVar.w(i);
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void h(int i) {
        zzx zzxVar = (zzx) this.a.get();
        if (zzxVar == null) {
            return;
        }
        zzxVar.W = null;
        zzxVar.X = null;
        zzxVar.w(i);
        if (zzxVar.K != null) {
            this.b.post(new c5p(this, zzxVar, i));
        }
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void m4(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        zzx zzxVar = (zzx) this.a.get();
        if (zzxVar == null) {
            return;
        }
        zzxVar.I = applicationMetadata;
        zzxVar.W = applicationMetadata.a;
        zzxVar.X = str2;
        zzxVar.O = str;
        synchronized (zzx.b0) {
        }
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void v3(zzac zzacVar) {
        zzx zzxVar = (zzx) this.a.get();
        if (zzxVar == null) {
            return;
        }
        zzx.a0.a("onDeviceStatusChanged", new Object[0]);
        this.b.post(new jyo(this, zzxVar, zzacVar));
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void zzb(int i) {
        zzx zzxVar = null;
        zzx zzxVar2 = (zzx) this.a.getAndSet(null);
        if (zzxVar2 != null) {
            zzxVar2.U = -1;
            zzxVar2.V = -1;
            zzxVar2.I = null;
            zzxVar2.O = null;
            zzxVar2.S = 0.0d;
            zzxVar2.t();
            zzxVar2.P = false;
            zzxVar2.T = null;
            zzxVar = zzxVar2;
        }
        if (zzxVar == null) {
            return;
        }
        zzx.a0.a("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
        if (i != 0) {
            zzxVar.triggerConnectionSuspended(2);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void zzf(int i) {
        if (((zzx) this.a.get()) == null) {
            return;
        }
        synchronized (zzx.b0) {
        }
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void zzp(long j) {
        zzx zzxVar = (zzx) this.a.get();
        if (zzxVar == null) {
            return;
        }
        zzxVar.v(0, j);
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void i(int i) {
    }

    @Override // com.google.android.gms.cast.internal.zzaj
    public final void k(int i) {
    }
}
