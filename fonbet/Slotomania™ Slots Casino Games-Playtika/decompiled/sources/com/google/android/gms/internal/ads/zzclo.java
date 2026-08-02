package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzclo extends com.google.android.gms.ads.internal.client.zzdz {
    private final zzchb zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private com.google.android.gms.ads.internal.client.zzed zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbmx zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzclo(zzchb zzchbVar, float f, boolean z, boolean z2) {
        this.zza = zzchbVar;
        this.zzi = f;
        this.zzc = z;
        this.zzd = z2;
    }

    private final void zzw(String str, Map map) {
        final HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzcff.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcln
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzclo.this.zzt(hashMap);
            }
        });
    }

    private final void zzx(final int i, final int i2, final boolean z, final boolean z2) {
        zzcff.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzclo.this.zzu(i, i2, z, z2);
            }
        });
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
        Object obj = this.zzb;
        boolean z = zzfwVar.zzb;
        boolean z2 = zzfwVar.zzc;
        synchronized (obj) {
            this.zzl = z;
            this.zzm = z2;
        }
        boolean z3 = zzfwVar.zza;
        zzw("initialState", CollectionUtils.mapOf("muteStart", true != z3 ? "0" : "1", "customControlsRequested", true != z ? "0" : "1", "clickToExpandRequested", true != z2 ? "0" : "1"));
    }

    public final void zzd(float f) {
        synchronized (this.zzb) {
            this.zzj = f;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zze() {
        zzw("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzf() {
        zzw("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzg(boolean z) {
        zzw(true != z ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzh() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zzh;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final int zzi() {
        int i;
        synchronized (this.zzb) {
            i = this.zze;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzj() {
        float f;
        synchronized (this.zzb) {
            f = this.zzi;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzk() {
        float f;
        synchronized (this.zzb) {
            f = this.zzj;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzl(com.google.android.gms.ads.internal.client.zzed zzedVar) {
        synchronized (this.zzb) {
            this.zzf = zzedVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzm() {
        float f;
        synchronized (this.zzb) {
            f = this.zzk;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzn() {
        boolean z;
        synchronized (this.zzb) {
            z = false;
            if (this.zzc && this.zzl) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final com.google.android.gms.ads.internal.client.zzed zzo() throws RemoteException {
        com.google.android.gms.ads.internal.client.zzed zzedVar;
        synchronized (this.zzb) {
            zzedVar = this.zzf;
        }
        return zzedVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzp() {
        boolean z;
        Object obj = this.zzb;
        boolean zzn = zzn();
        synchronized (obj) {
            z = false;
            if (!zzn) {
                try {
                    if (this.zzm && this.zzd) {
                        z = true;
                    }
                } finally {
                }
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzq() {
        zzw("stop", null);
    }

    public final void zzr() {
        boolean z;
        int i;
        synchronized (this.zzb) {
            z = this.zzh;
            i = this.zze;
            this.zze = 3;
        }
        zzx(i, 3, z, z);
    }

    public final void zzs(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.zzb) {
            z2 = true;
            if (f2 == this.zzi && f3 == this.zzk) {
                z2 = false;
            }
            this.zzi = f2;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzok)).booleanValue()) {
                this.zzj = f;
            }
            z3 = this.zzh;
            this.zzh = z;
            i2 = this.zze;
            this.zze = i;
            float f4 = this.zzk;
            this.zzk = f3;
            if (Math.abs(f3 - f4) > 1.0E-4f) {
                this.zza.zzE().invalidate();
            }
        }
        if (z2) {
            try {
                zzbmx zzbmxVar = this.zzn;
                if (zzbmxVar != null) {
                    zzbmxVar.zze();
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        zzx(i2, i, z3, z);
    }

    final /* synthetic */ void zzt(Map map) {
        this.zza.zze("pubVideoCmd", map);
    }

    final /* synthetic */ void zzu(int i, int i2, boolean z, boolean z2) {
        int i3;
        boolean z3;
        boolean z4;
        com.google.android.gms.ads.internal.client.zzed zzedVar;
        com.google.android.gms.ads.internal.client.zzed zzedVar2;
        com.google.android.gms.ads.internal.client.zzed zzedVar3;
        synchronized (this.zzb) {
            boolean z5 = this.zzg;
            if (z5 || i2 != 1) {
                i3 = i2;
                z3 = false;
            } else {
                i2 = 1;
                i3 = 1;
                z3 = true;
            }
            boolean z6 = i != i2;
            if (z6 && i3 == 1) {
                z4 = true;
                i3 = 1;
            } else {
                z4 = false;
            }
            boolean z7 = z6 && i3 == 2;
            boolean z8 = z6 && i3 == 3;
            this.zzg = z5 || z3;
            if (z3) {
                try {
                    com.google.android.gms.ads.internal.client.zzed zzedVar4 = this.zzf;
                    if (zzedVar4 != null) {
                        zzedVar4.zze();
                    }
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                }
            }
            if (z4 && (zzedVar3 = this.zzf) != null) {
                zzedVar3.zzf();
            }
            if (z7 && (zzedVar2 = this.zzf) != null) {
                zzedVar2.zzg();
            }
            if (z8) {
                com.google.android.gms.ads.internal.client.zzed zzedVar5 = this.zzf;
                if (zzedVar5 != null) {
                    zzedVar5.zzh();
                }
                this.zza.zzz();
            }
            if (z != z2 && (zzedVar = this.zzf) != null) {
                zzedVar.zzi(z2);
            }
        }
    }

    public final void zzv(zzbmx zzbmxVar) {
        synchronized (this.zzb) {
            this.zzn = zzbmxVar;
        }
    }
}
