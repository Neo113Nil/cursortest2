package defpackage;

import com.google.android.gms.ads.internal.client.zzbg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzebw;
import com.google.android.gms.internal.ads.zzecd;
import com.ironsource.Wf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class x2o extends zzbg {
    public final /* synthetic */ zzebw a;
    public final /* synthetic */ zzecd b;

    public x2o(zzecd zzecdVar, zzebw zzebwVar) {
        this.a = zzebwVar;
        this.b = zzecdVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zza() {
        long j = this.b.a;
        ox9 ox9Var = new ox9("interstitial");
        ox9Var.b = Long.valueOf(j);
        ox9Var.d = Wf.g;
        this.a.b(ox9Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzb(int i) {
        long j = this.b.a;
        ox9 ox9Var = new ox9("interstitial");
        ox9Var.b = Long.valueOf(j);
        ox9Var.d = "onAdFailedToLoad";
        ox9Var.e = Integer.valueOf(i);
        this.a.b(ox9Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc(zze zzeVar) {
        long j = this.b.a;
        int i = zzeVar.zza;
        ox9 ox9Var = new ox9("interstitial");
        ox9Var.b = Long.valueOf(j);
        ox9Var.d = "onAdFailedToLoad";
        ox9Var.e = Integer.valueOf(i);
        this.a.b(ox9Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze() {
        long j = this.b.a;
        ox9 ox9Var = new ox9("interstitial");
        ox9Var.b = Long.valueOf(j);
        ox9Var.d = Wf.j;
        this.a.b(ox9Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf() {
        long j = this.b.a;
        ox9 ox9Var = new ox9("interstitial");
        ox9Var.b = Long.valueOf(j);
        ox9Var.d = Wf.c;
        this.a.b(ox9Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
        long j = this.b.a;
        ox9 ox9Var = new ox9("interstitial");
        ox9Var.b = Long.valueOf(j);
        ox9Var.d = Wf.f;
        this.a.a.zza(ox9Var.u());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() {
    }
}
