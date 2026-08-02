package defpackage;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzcdg;
import com.google.android.gms.internal.ads.zzfku;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nao extends zzcdg {
    public zzfku a;
    public iao b;
    public String c;

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void a(zze zzeVar) {
        iao iaoVar = this.b;
        if (this.a == null || iaoVar == null) {
            return;
        }
        String loadAdError = zzeVar.zzb().toString();
        String str = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(loadAdError).length() + 51 + String.valueOf(str).length());
        sb.append("Failed to load rewarded ad with error: ");
        sb.append(loadAdError);
        sb.append(", adUnitId: ");
        sb.append(str);
        zzo.zzi(sb.toString());
        iaoVar.b.c(zzeVar);
        this.a = null;
        this.b = null;
        this.c = null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zze() {
        iao iaoVar = this.b;
        zzfku zzfkuVar = this.a;
        if (zzfkuVar == null || iaoVar == null) {
            return;
        }
        iaoVar.a.d(zzfkuVar);
        this.a = null;
        this.b = null;
        this.c = null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zzf(int i) {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
