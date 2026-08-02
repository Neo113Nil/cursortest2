package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import defpackage.d1l;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfkh implements OnAdMetadataChangedListener, zzdfd, zzdds, zzddp, zzdef, zzdgg, zzfir, zzdlw {
    public final zzfnh a;
    public final AtomicReference b = new AtomicReference();
    public final AtomicReference c = new AtomicReference();
    public final AtomicReference d = new AtomicReference();
    public final AtomicReference e = new AtomicReference();
    public final AtomicReference f = new AtomicReference();
    public final AtomicReference g = new AtomicReference();
    public final AtomicReference h = new AtomicReference();
    public final AtomicReference i = new AtomicReference();
    public zzfkh j = null;

    public zzfkh(zzfnh zzfnhVar) {
        this.a = zzfnhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void I() {
        zzfkh zzfkhVar = this.j;
        if (zzfkhVar != null) {
            zzfkhVar.I();
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
        Object obj = this.d.get();
        if (obj != null) {
            try {
                ((zzcdd) obj).zzf();
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.e.get();
        if (obj2 != null) {
            try {
                ((zzccn) obj2).zzh();
            } catch (RemoteException e3) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        Object obj3 = this.i.get();
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

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void L() {
        zzfkh zzfkhVar = this.j;
        if (zzfkhVar != null) {
            zzfkhVar.L();
            return;
        }
        AtomicReference atomicReference = this.d;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((zzcdd) obj).zze();
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.e.get();
        if (obj2 != null) {
            try {
                ((zzccn) obj2).zzf();
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
            ((zzcdd) obj3).zzj();
        } catch (RemoteException e5) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e5);
        } catch (NullPointerException e6) {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void M() {
        zzfkh zzfkhVar = this.j;
        if (zzfkhVar != null) {
            zzfkhVar.M();
            return;
        }
        Object obj = this.d.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzcdd) obj).zzk();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void a0() {
        zzfkh zzfkhVar = this.j;
        if (zzfkhVar != null) {
            zzfkhVar.a0();
            return;
        }
        Object obj = this.e.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzccn) obj).zzj();
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
        this.j = (zzfkh) zzfirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final void h(com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfkh zzfkhVar = this.j;
        if (zzfkhVar != null) {
            zzfkhVar.h(zztVar);
            return;
        }
        Object obj = this.h.get();
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
        zzfkh zzfkhVar = this.j;
        if (zzfkhVar != null) {
            zzfkhVar.i0(zzeVar);
            return;
        }
        int i = zzeVar.zza;
        AtomicReference atomicReference = this.c;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((zzcdh) obj).a(zzeVar);
            } catch (RemoteException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((zzcdh) obj2).zzf(i);
            } catch (RemoteException e3) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        Object obj3 = this.e.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((zzccn) obj3).d(i);
        } catch (RemoteException e5) {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e5);
        } catch (NullPointerException e6) {
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void n(zzcce zzcceVar, String str, String str2) {
        zzfkh zzfkhVar = this.j;
        if (zzfkhVar != null) {
            zzfkhVar.n(zzcceVar, str, str2);
            return;
        }
        Object obj = this.d.get();
        if (obj != null) {
            try {
                ((zzcdd) obj).N2(new zzcdr(zzcceVar.zza(), zzcceVar.zzb()));
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.f.get();
        if (obj2 != null) {
            try {
                zzcdi zzcdiVar = (zzcdi) obj2;
                zzcdr zzcdrVar = new zzcdr(zzcceVar.a, zzcceVar.b);
                Parcel J = zzcdiVar.J();
                zzbew.e(J, zzcdrVar);
                J.writeString(str);
                J.writeString(str2);
                zzcdiVar.Z1(J, 2);
            } catch (RemoteException e3) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        Object obj3 = this.e.get();
        if (obj3 != null) {
            try {
                ((zzccn) obj3).O2(zzcceVar);
            } catch (RemoteException e5) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e5);
            } catch (NullPointerException e6) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e6);
            }
        }
        Object obj4 = this.g.get();
        if (obj4 == null) {
            return;
        }
        try {
            zzcci zzcciVar = (zzcci) obj4;
            Parcel J2 = zzcciVar.J();
            zzbew.e(J2, zzcceVar);
            J2.writeString(str);
            J2.writeString(str2);
            zzcciVar.Z1(J2, 2);
        } catch (RemoteException e7) {
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e7);
        } catch (NullPointerException e8) {
            int i8 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e8);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzfkh zzfkhVar = this.j;
        if (zzfkhVar != null) {
            zzfkhVar.onAdMetadataChanged();
            return;
        }
        Object obj = this.b.get();
        if (obj == null) {
            return;
        }
        try {
            ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void t(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfkh zzfkhVar = this.j;
        if (zzfkhVar != null) {
            zzfkhVar.t(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.d;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((zzcdd) obj).z1(zzeVar);
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
            ((zzcdd) obj2).g(zzeVar.zza);
        } catch (RemoteException e3) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e3);
        } catch (NullPointerException e4) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zze() {
        zzfkh zzfkhVar = this.j;
        if (zzfkhVar != null) {
            zzfkhVar.zze();
            return;
        }
        Object obj = this.e.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzccn) obj).zzg();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzf() {
        zzfkh zzfkhVar = this.j;
        if (zzfkhVar != null) {
            zzfkhVar.zzf();
            return;
        }
        Object obj = this.e.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzccn) obj).zzl();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzg() {
        zzfkh zzfkhVar = this.j;
        if (zzfkhVar != null) {
            zzfkhVar.zzg();
            return;
        }
        Object obj = this.c.get();
        if (obj != null) {
            try {
                ((zzcdh) obj).zze();
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.e.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((zzccn) obj2).zze();
        } catch (RemoteException e3) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e3);
        } catch (NullPointerException e4) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void O() {
    }
}
