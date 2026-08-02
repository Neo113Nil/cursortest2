package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeua implements AppEventListener, zzdgv, zzdfd, zzdds, zzdej, com.google.android.gms.ads.internal.client.zza, zzddp, zzdgg, zzdef, zzdlw {
    public final zzeaj j;
    public final AtomicReference a = new AtomicReference();
    public final AtomicReference b = new AtomicReference();
    public final AtomicReference c = new AtomicReference();
    public final AtomicReference d = new AtomicReference();
    public final AtomicReference e = new AtomicReference();
    public final AtomicBoolean f = new AtomicBoolean(true);
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final AtomicReference i = new AtomicReference();
    public final ArrayBlockingQueue k = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.sa)).intValue());

    public zzeua(zzeaj zzeajVar) {
        this.j = zzeajVar;
    }

    public final void A(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        this.b.set(zzclVar);
        this.g.set(true);
        D();
    }

    public final void D() {
        if (this.g.get() && this.h.get()) {
            ArrayBlockingQueue arrayBlockingQueue = this.k;
            Iterator it = arrayBlockingQueue.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = this.b.get();
                if (obj != null) {
                    try {
                        ((com.google.android.gms.ads.internal.client.zzcl) obj).zza((String) pair.first, (String) pair.second);
                    } catch (RemoteException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzl("#007 Could not call remote method.", e);
                    } catch (NullPointerException e2) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
                    }
                }
            }
            arrayBlockingQueue.clear();
            this.f.set(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void I() {
        Object obj = this.a.get();
        if (obj != null) {
            try {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zza();
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
                ((zzcs) obj2).zzc();
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
        Object obj = this.a.get();
        if (obj != null) {
            try {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzf();
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        AtomicReference atomicReference = this.e;
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((zzcs) obj2).zzb();
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
            ((zzcs) obj3).zzd();
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
        Object obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.sc)).booleanValue() && (obj = this.a.get()) != null) {
            try {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzg();
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
            ((zzcs) obj2).zze();
        } catch (RemoteException e3) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e3);
        } catch (NullPointerException e4) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void N(zzflo zzfloVar) {
        this.f.set(true);
        this.h.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void O() {
        Object obj = this.a.get();
        if (obj == null) {
            return;
        }
        try {
            ((com.google.android.gms.ads.internal.client.zzbh) obj).zzh();
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
        Object obj = this.a.get();
        if (obj == null) {
            return;
        }
        try {
            ((com.google.android.gms.ads.internal.client.zzbh) obj).zzd();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbh c() {
        return (com.google.android.gms.ads.internal.client.zzbh) this.a.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final void h(com.google.android.gms.ads.internal.client.zzt zztVar) {
        Object obj = this.c.get();
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
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzc(zzeVar);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((com.google.android.gms.ads.internal.client.zzbh) obj2).zzb(zzeVar.zza);
            } catch (RemoteException e3) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        Object obj3 = this.d.get();
        if (obj3 != null) {
            try {
                ((com.google.android.gms.ads.internal.client.zzbk) obj3).zzb(zzeVar);
            } catch (RemoteException e5) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e5);
            } catch (NullPointerException e6) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e6);
            }
        }
        this.f.set(false);
        this.k.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void j() {
        Object obj = this.a.get();
        if (obj == null) {
            return;
        }
        try {
            ((com.google.android.gms.ads.internal.client.zzbh) obj).zzi();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        Object obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.sc)).booleanValue() || (obj = this.a.get()) == null) {
            return;
        }
        try {
            ((com.google.android.gms.ads.internal.client.zzbh) obj).zzg();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(String str, String str2) {
        if (!this.f.get()) {
            Object obj = this.b.get();
            if (obj != null) {
                try {
                    ((com.google.android.gms.ads.internal.client.zzcl) obj).zza(str, str2);
                } catch (RemoteException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzl("#007 Could not call remote method.", e);
                } catch (NullPointerException e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
                }
            }
            return;
        }
        if (!this.k.offer(new Pair(str, str2))) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzd("The queue for app events is full, dropping the new event.");
            zzeaj zzeajVar = this.j;
            if (zzeajVar != null) {
                zzeai a = zzeajVar.a();
                a.b("action", "dae_action");
                a.b("dae_name", str);
                a.b("dae_data", str2);
                a.c();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void t(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Object obj = this.e.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzcs) obj).zza(zzeVar);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final synchronized void zzg() {
        Object obj = this.a.get();
        if (obj != null) {
            try {
                try {
                    ((com.google.android.gms.ads.internal.client.zzbh) obj).zze();
                } catch (RemoteException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzl("#007 Could not call remote method.", e);
                }
            } catch (NullPointerException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.d.get();
        if (obj2 != null) {
            try {
                try {
                    ((com.google.android.gms.ads.internal.client.zzbk) obj2).zza();
                } catch (NullPointerException e3) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e3);
                }
            } catch (RemoteException e4) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e4);
            }
        }
        this.h.set(true);
        D();
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void Z(zzcbv zzcbvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void n(zzcce zzcceVar, String str, String str2) {
    }
}
