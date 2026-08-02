package defpackage;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbhb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dao extends zzbhb {
    public iao a;
    public String b;

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void X(zzbgz zzbgzVar) {
        iao iaoVar = this.a;
        if (iaoVar == null) {
            return;
        }
        iaoVar.a.d(zzbgzVar);
        this.a = null;
        this.b = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzb(int i) {
        this.a = null;
        this.b = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzc(zze zzeVar) {
        iao iaoVar = this.a;
        if (iaoVar == null) {
            return;
        }
        String loadAdError = zzeVar.zzb().toString();
        String str = this.b;
        StringBuilder sb = new StringBuilder(loadAdError.length() + 60 + String.valueOf(str).length());
        sb.append("Failed to load app open ad with error parcel: ");
        sb.append(loadAdError);
        sb.append(" for ad unit: ");
        sb.append(str);
        zzo.zzi(sb.toString());
        iaoVar.b.c(zzeVar);
        this.a = null;
        this.b = null;
    }
}
