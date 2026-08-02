package defpackage;

import com.google.android.gms.internal.ads.zzeqf;
import com.google.android.gms.internal.ads.zzhcg;
import com.google.android.gms.internal.ads.zzhcy;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0o implements zzhcg {
    public final /* synthetic */ int a;
    public final /* synthetic */ ddb b;

    public /* synthetic */ v0o(int i, ddb ddbVar) {
        this.a = i;
        this.b = ddbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final ddb zza(Object obj) {
        int i = this.a;
        ddb ddbVar = this.b;
        switch (i) {
            case 0:
                return obj != null ? ddbVar : zzhcy.b(new zzeqf(1, "Retrieve required value in native ad response failed."));
            default:
                return ddbVar;
        }
    }
}
