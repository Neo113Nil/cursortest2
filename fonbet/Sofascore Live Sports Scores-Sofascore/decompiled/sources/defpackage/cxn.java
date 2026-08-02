package defpackage;

import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzdgq;
import com.google.android.gms.internal.ads.zzdim;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class cxn implements zzdim {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cxn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzdim
    public final /* synthetic */ void zza() {
        zzm zzL;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((zzdgq) obj).zzc();
                break;
            default:
                zzclm zzclmVar = (zzclm) obj;
                if (zzclmVar != null && (zzL = zzclmVar.zzL()) != null) {
                    zzL.zza();
                    break;
                }
                break;
        }
    }
}
