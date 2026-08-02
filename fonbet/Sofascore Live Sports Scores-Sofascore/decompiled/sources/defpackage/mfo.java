package defpackage;

import com.google.android.gms.internal.ads.zzggt;
import com.google.android.gms.internal.ads.zzhcg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class mfo implements zzhcg {
    public final /* synthetic */ int a;
    public final /* synthetic */ nfo b;
    public final /* synthetic */ zzggt c;

    public /* synthetic */ mfo(nfo nfoVar, zzggt zzggtVar, int i) {
        this.a = i;
        this.b = nfoVar;
        this.c = zzggtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final ddb zza(Object obj) {
        int i = this.a;
        zzggt zzggtVar = this.c;
        nfo nfoVar = this.b;
        switch (i) {
            case 0:
                emo b = nfoVar.a.b(zzggtVar);
                nfoVar.d.e(20303, b);
                return b;
            default:
                emo b2 = nfoVar.a.b(zzggtVar);
                nfoVar.d.e(20303, b2);
                return b2;
        }
    }
}
