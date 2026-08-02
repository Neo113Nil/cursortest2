package defpackage;

import com.google.android.gms.ads.internal.client.zzbj;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzeui;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class gao extends zzbj {
    public zzeui a;
    public iao b;
    public String c;

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zza() {
        iao iaoVar = this.b;
        zzeui zzeuiVar = this.a;
        if (zzeuiVar == null || iaoVar == null) {
            return;
        }
        iaoVar.a.d(zzeuiVar);
        this.a = null;
        this.b = null;
        this.c = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb(zze zzeVar) {
        iao iaoVar = this.b;
        if (this.a == null || iaoVar == null) {
            return;
        }
        String loadAdError = zzeVar.zzb().toString();
        String str = this.c;
        StringBuilder sb = new StringBuilder(loadAdError.length() + 57 + String.valueOf(str).length());
        sb.append("Failed to load interstitial ad with error: ");
        sb.append(loadAdError);
        sb.append(" for ad unit: ");
        sb.append(str);
        zzo.zzi(sb.toString());
        iaoVar.b.c(zzeVar);
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
