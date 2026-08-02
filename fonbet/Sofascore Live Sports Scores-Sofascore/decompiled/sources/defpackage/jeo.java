package defpackage;

import com.google.android.gms.internal.ads.zzggr;
import com.google.android.gms.internal.ads.zzgnz;
import com.google.android.gms.internal.ads.zzhcg;
import com.google.android.gms.internal.ads.zzhcy;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class jeo implements zzhcg {
    public final /* synthetic */ int a;
    public final /* synthetic */ meo b;

    public /* synthetic */ jeo(meo meoVar, int i) {
        this.a = i;
        this.b = meoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final /* synthetic */ ddb zza(Object obj) {
        int i = this.a;
        meo meoVar = this.b;
        switch (i) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    return meoVar.b(0);
                }
                meoVar.d.b(1003);
                return zzhcy.a(leo.b);
            default:
                zzggr zzggrVar = (zzggr) obj;
                zzgnz zzgnzVar = meoVar.c;
                if (zzggrVar.K() == 2) {
                    return zzgnzVar.a(zzggrVar.D(), zzggrVar.E().d());
                }
                if (zzggrVar.K() == 3) {
                    return zzgnzVar.b(zzggrVar.D(), zzggrVar.F().d(), zzggrVar.E().d());
                }
                a70.j("Unreachable");
                return null;
        }
    }
}
