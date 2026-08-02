package defpackage;

import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzeqf;
import com.google.android.gms.internal.ads.zzhcg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0o implements zzhcg {
    public final /* synthetic */ int a;
    public final /* synthetic */ hlo b;

    public /* synthetic */ u0o(hlo hloVar, int i) {
        this.a = i;
        this.b = hloVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final ddb zza(Object obj) {
        int i = this.a;
        hlo hloVar = this.b;
        zzclm zzclmVar = (zzclm) obj;
        switch (i) {
            case 0:
                if (zzclmVar != null) {
                    return hloVar;
                }
                throw new zzeqf(1, "Retrieve Web View from image ad response failed.");
            default:
                if (zzclmVar == null || zzclmVar.zzh() == null) {
                    throw new zzeqf(1, "Retrieve video view in html5 ad response failed.");
                }
                return hloVar;
        }
    }
}
