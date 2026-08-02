package defpackage;

import com.google.android.gms.internal.ads.zzabe;
import com.google.android.gms.internal.ads.zzabg;
import com.google.android.gms.internal.ads.zzbg;
import com.google.android.gms.internal.ads.zzv;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class gdp extends zzabg {
    public final zzbg b;

    public gdp(zzabe zzabeVar, zzbg zzbgVar) {
        super(zzabeVar);
        this.b = zzbgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof gdp)) {
            return this.b.equals(((gdp) obj).b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzabg, com.google.android.gms.internal.ads.zzabj
    public final zzbg zza() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzabg, com.google.android.gms.internal.ads.zzabj
    public final zzv zzb(int i) {
        return this.b.d[this.a.zzf(i)];
    }

    @Override // com.google.android.gms.internal.ads.zzabg, com.google.android.gms.internal.ads.zzabe
    public final zzv zzc() {
        return this.b.d[this.a.zzh()];
    }
}
