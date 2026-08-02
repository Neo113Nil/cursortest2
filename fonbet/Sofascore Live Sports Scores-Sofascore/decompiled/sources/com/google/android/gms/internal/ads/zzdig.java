package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdig implements AppEventListener, OnAdMetadataChangedListener, zzddp, com.google.android.gms.ads.internal.client.zza, zzdgg, zzdej, zzdfo, com.google.android.gms.ads.internal.overlay.zzr, zzdef, zzdlw {
    public final zzdhf a = new zzdhf(this);
    public zzeua b;
    public zzeue c;
    public zzfhc d;
    public zzfkh e;

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void I() {
        zzeua zzeuaVar = this.b;
        if (zzeuaVar != null) {
            zzeuaVar.I();
        }
        zzfkh zzfkhVar = this.e;
        if (zzfkhVar != null) {
            zzfkhVar.I();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void L() {
        zzeua zzeuaVar = this.b;
        if (zzeuaVar != null) {
            zzeuaVar.L();
        }
        zzfkh zzfkhVar = this.e;
        if (zzfkhVar != null) {
            zzfkhVar.L();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void M() {
        zzeua zzeuaVar = this.b;
        if (zzeuaVar != null) {
            zzeuaVar.M();
        }
        zzeue zzeueVar = this.c;
        if (zzeueVar != null) {
            zzeueVar.M();
        }
        zzfkh zzfkhVar = this.e;
        if (zzfkhVar != null) {
            zzfkhVar.M();
        }
        zzfhc zzfhcVar = this.d;
        if (zzfhcVar != null) {
            zzfhcVar.M();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void O() {
        zzeua zzeuaVar = this.b;
        if (zzeuaVar != null) {
            zzeuaVar.O();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void a0() {
        zzeua zzeuaVar = this.b;
        if (zzeuaVar != null) {
            zzeuaVar.a0();
        }
        zzfkh zzfkhVar = this.e;
        if (zzfkhVar != null) {
            zzfkhVar.a0();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final void h(com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzeua zzeuaVar = this.b;
        if (zzeuaVar != null) {
            zzeuaVar.h(zztVar);
        }
        zzfkh zzfkhVar = this.e;
        if (zzfkhVar != null) {
            zzfkhVar.h(zztVar);
        }
        zzfhc zzfhcVar = this.d;
        if (zzfhcVar != null) {
            zzfhcVar.h(zztVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void j() {
        zzeua zzeuaVar = this.b;
        if (zzeuaVar != null) {
            zzeuaVar.j();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void n(zzcce zzcceVar, String str, String str2) {
        zzfkh zzfkhVar = this.e;
        if (zzfkhVar != null) {
            zzfkhVar.n(zzcceVar, str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzeua zzeuaVar = this.b;
        if (zzeuaVar != null) {
            zzeuaVar.onAdClicked();
        }
        zzeue zzeueVar = this.c;
        if (zzeueVar != null) {
            zzeueVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzfkh zzfkhVar = this.e;
        if (zzfkhVar != null) {
            zzfkhVar.onAdMetadataChanged();
        }
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        zzeua zzeuaVar = this.b;
        if (zzeuaVar != null) {
            zzeuaVar.onAppEvent(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void t(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfkh zzfkhVar = this.e;
        if (zzfkhVar != null) {
            zzfkhVar.t(zzeVar);
        }
        zzeua zzeuaVar = this.b;
        if (zzeuaVar != null) {
            zzeuaVar.t(zzeVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdV() {
        zzfhc zzfhcVar = this.d;
        if (zzfhcVar != null) {
            zzfhcVar.zzdV();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdW(int i) {
        zzfhc zzfhcVar = this.d;
        if (zzfhcVar != null) {
            zzfhcVar.zzdW(i);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzfhc zzfhcVar = this.d;
        if (zzfhcVar != null) {
            zzfhcVar.zzdv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zze() {
        zzfkh zzfkhVar = this.e;
        if (zzfkhVar != null) {
            zzfkhVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzf() {
        zzfkh zzfkhVar = this.e;
        if (zzfkhVar != null) {
            zzfkhVar.zzf();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzfhc zzfhcVar = this.d;
        if (zzfhcVar != null) {
            zzfhcVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfo
    public final void zzl() {
        zzfhc zzfhcVar = this.d;
        if (zzfhcVar != null) {
            zzfhcVar.zzl();
        }
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
