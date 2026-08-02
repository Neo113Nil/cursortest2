package defpackage;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzcdg;
import com.google.android.gms.internal.ads.zzebw;
import com.google.android.gms.internal.ads.zzech;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class y2o extends zzcdg {
    public final /* synthetic */ zzech a;

    public y2o(zzech zzechVar) {
        this.a = zzechVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void a(zze zzeVar) {
        zzech zzechVar = this.a;
        zzebw zzebwVar = zzechVar.b;
        long j = zzechVar.a;
        int i = zzeVar.zza;
        ox9 ox9Var = new ox9("rewarded");
        ox9Var.b = Long.valueOf(j);
        ox9Var.d = "onRewardedAdFailedToLoad";
        ox9Var.e = Integer.valueOf(i);
        zzebwVar.b(ox9Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zze() {
        zzech zzechVar = this.a;
        zzebw zzebwVar = zzechVar.b;
        long j = zzechVar.a;
        ox9 ox9Var = new ox9("rewarded");
        ox9Var.b = Long.valueOf(j);
        ox9Var.d = "onRewardedAdLoaded";
        zzebwVar.b(ox9Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zzf(int i) {
        zzech zzechVar = this.a;
        zzebw zzebwVar = zzechVar.b;
        long j = zzechVar.a;
        ox9 ox9Var = new ox9("rewarded");
        ox9Var.b = Long.valueOf(j);
        ox9Var.d = "onRewardedAdFailedToLoad";
        ox9Var.e = Integer.valueOf(i);
        zzebwVar.b(ox9Var);
    }
}
