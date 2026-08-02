package defpackage;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzccx;
import com.google.android.gms.internal.ads.zzcdc;
import com.google.android.gms.internal.ads.zzebw;
import com.google.android.gms.internal.ads.zzech;
import com.ironsource.Wf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class z2o extends zzcdc {
    public final /* synthetic */ zzech a;

    public z2o(zzech zzechVar) {
        this.a = zzechVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void N2(zzccx zzccxVar) {
        zzech zzechVar = this.a;
        zzebw zzebwVar = zzechVar.b;
        long j = zzechVar.a;
        ox9 ox9Var = new ox9("rewarded");
        ox9Var.b = Long.valueOf(j);
        ox9Var.d = "onUserEarnedReward";
        ox9Var.f = zzccxVar.zze();
        ox9Var.g = Integer.valueOf(zzccxVar.zzf());
        zzebwVar.b(ox9Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void g(int i) {
        zzech zzechVar = this.a;
        zzebw zzebwVar = zzechVar.b;
        long j = zzechVar.a;
        ox9 ox9Var = new ox9("rewarded");
        ox9Var.b = Long.valueOf(j);
        ox9Var.d = "onRewardedAdFailedToShow";
        ox9Var.e = Integer.valueOf(i);
        zzebwVar.b(ox9Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void z1(zze zzeVar) {
        zzech zzechVar = this.a;
        zzebw zzebwVar = zzechVar.b;
        long j = zzechVar.a;
        int i = zzeVar.zza;
        ox9 ox9Var = new ox9("rewarded");
        ox9Var.b = Long.valueOf(j);
        ox9Var.d = "onRewardedAdFailedToShow";
        ox9Var.e = Integer.valueOf(i);
        zzebwVar.b(ox9Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zze() {
        zzech zzechVar = this.a;
        zzebw zzebwVar = zzechVar.b;
        long j = zzechVar.a;
        ox9 ox9Var = new ox9("rewarded");
        ox9Var.b = Long.valueOf(j);
        ox9Var.d = "onRewardedAdOpened";
        zzebwVar.b(ox9Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzf() {
        zzech zzechVar = this.a;
        zzebw zzebwVar = zzechVar.b;
        long j = zzechVar.a;
        ox9 ox9Var = new ox9("rewarded");
        ox9Var.b = Long.valueOf(j);
        ox9Var.d = "onRewardedAdClosed";
        zzebwVar.b(ox9Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzj() {
        zzech zzechVar = this.a;
        zzebw zzebwVar = zzechVar.b;
        long j = zzechVar.a;
        ox9 ox9Var = new ox9("rewarded");
        ox9Var.b = Long.valueOf(j);
        ox9Var.d = "onAdImpression";
        zzebwVar.b(ox9Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzk() {
        zzech zzechVar = this.a;
        zzebw zzebwVar = zzechVar.b;
        long j = zzechVar.a;
        ox9 ox9Var = new ox9("rewarded");
        ox9Var.b = Long.valueOf(j);
        ox9Var.d = Wf.f;
        zzebwVar.b(ox9Var);
    }
}
