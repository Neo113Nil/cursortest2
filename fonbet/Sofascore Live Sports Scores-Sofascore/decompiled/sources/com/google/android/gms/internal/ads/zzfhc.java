package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.d1l;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfhc implements zzdds, zzdfo, zzfir, com.google.android.gms.ads.internal.overlay.zzr, zzdgg, zzdef, zzdlw {
    public final zzfnh a;
    public final AtomicReference b = new AtomicReference();
    public final AtomicReference c = new AtomicReference();
    public final AtomicReference d = new AtomicReference();
    public final AtomicReference e = new AtomicReference();
    public final AtomicReference f = new AtomicReference();
    public final AtomicReference g = new AtomicReference();
    public final AtomicReference h = new AtomicReference();
    public zzfhc i = null;

    public zzfhc(zzfnh zzfnhVar) {
        this.a = zzfnhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void M() {
        zzfhc zzfhcVar = this.i;
        if (zzfhcVar != null) {
            zzfhcVar.M();
            return;
        }
        Object obj = this.d.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzbhg) obj).zzf();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfir
    public final void c(zzfir zzfirVar) {
        this.i = (zzfhc) zzfirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final void h(com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfhc zzfhcVar = this.i;
        if (zzfhcVar != null) {
            zzfhcVar.h(zztVar);
            return;
        }
        Object obj = this.g.get();
        if (obj == null) {
            return;
        }
        try {
            ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(zztVar);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void i0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfhc zzfhcVar = this.i;
        if (zzfhcVar != null) {
            zzfhcVar.i0(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.b;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((zzbhc) obj).zzc(zzeVar);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((zzbhc) obj2).zzb(zzeVar.zza);
        } catch (RemoteException e3) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e3);
        } catch (NullPointerException e4) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e4);
        }
    }

    public final void j(zzcvy zzcvyVar) {
        zzfhc zzfhcVar = this.i;
        if (zzfhcVar != null) {
            zzfhcVar.j(zzcvyVar);
            return;
        }
        Object obj = this.b.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzbhc) obj).X(zzcvyVar);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    public final void n() {
        zzfhc zzfhcVar = this.i;
        if (zzfhcVar != null) {
            zzfhcVar.n();
            return;
        }
        d1l d1lVar = this.a.a;
        if (d1lVar != null) {
            zzfoh zzfohVar = (zzfoh) d1lVar.b;
            synchronized (zzfohVar) {
                zzfohVar.e = 1;
                zzfohVar.a();
            }
        }
        Object obj = this.c.get();
        if (obj != null) {
            try {
                ((zzbhd) obj).zza();
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.d.get();
        if (obj2 != null) {
            try {
                ((zzbhg) obj2).zzc();
            } catch (RemoteException e3) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        Object obj3 = this.h.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((zzfua) obj3).a();
        } catch (RemoteException e5) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e5);
        } catch (NullPointerException e6) {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void t(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfhc zzfhcVar = this.i;
        if (zzfhcVar != null) {
            zzfhcVar.t(zzeVar);
            return;
        }
        Object obj = this.d.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzbhg) obj).E0(zzeVar);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdV() {
        zzfhc zzfhcVar = this.i;
        if (zzfhcVar != null) {
            zzfhcVar.zzdV();
            return;
        }
        Object obj = this.f.get();
        if (obj == null) {
            return;
        }
        try {
            ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdV();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdW(int i) {
        zzfhc zzfhcVar = this.i;
        if (zzfhcVar != null) {
            zzfhcVar.zzdW(i);
            return;
        }
        Object obj = this.f.get();
        if (obj == null) {
            return;
        }
        try {
            ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdW(i);
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzfhc zzfhcVar = this.i;
        if (zzfhcVar != null) {
            zzfhcVar.zzdv();
            return;
        }
        Object obj = this.f.get();
        if (obj == null) {
            return;
        }
        try {
            ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdv();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzfhc zzfhcVar = this.i;
        if (zzfhcVar != null) {
            zzfhcVar.zzh();
            return;
        }
        Object obj = this.f.get();
        if (obj != null) {
            try {
                ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzh();
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        AtomicReference atomicReference = this.d;
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((zzbhg) obj2).zzb();
            } catch (RemoteException e3) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        Object obj3 = atomicReference.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((zzbhg) obj3).zze();
        } catch (RemoteException e5) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e5);
        } catch (NullPointerException e6) {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfo
    public final void zzl() {
        zzfhc zzfhcVar = this.i;
        if (zzfhcVar != null) {
            zzfhcVar.zzl();
            return;
        }
        Object obj = this.e.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzdfo) obj).zzl();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void O() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }
}
