package defpackage;

import com.google.android.gms.internal.ads.zziy;
import com.google.android.gms.internal.ads.zzma;
import com.google.android.gms.internal.ads.zzzg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ofp implements zzzg {
    public final zzzg a;
    public final long b;

    public ofp(zzzg zzzgVar, long j) {
        this.a = zzzgVar;
        this.b = j;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final int a(zzma zzmaVar, zziy zziyVar, int i) {
        int a = this.a.a(zzmaVar, zziyVar, i);
        if (a != -4) {
            return a;
        }
        zziyVar.e += this.b;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final int l(long j) {
        return this.a.l(j - this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final boolean zza() {
        return this.a.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zzb() {
        this.a.zzb();
    }
}
