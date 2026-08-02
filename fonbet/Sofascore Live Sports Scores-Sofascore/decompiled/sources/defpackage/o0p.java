package defpackage;

import com.google.android.gms.internal.measurement.zzmk;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzqt;
import com.google.android.gms.internal.measurement.zzqv;
import com.google.android.gms.internal.measurement.zzrf;
import com.google.android.gms.internal.measurement.zztj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0p implements fj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o0p(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.fj0
    public final ddb apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zzpg zzpgVar = (zzpg) obj2;
                int i2 = ((zzmk) obj).a;
                if ((i2 == 29501 || i2 == 29537 || i2 == 29538 || i2 == 29539 || i2 == 29540 || i2 == 29541 || i2 == 29542 || i2 == 29543 || i2 == 29544) && !zzpgVar.g.b()) {
                    zzpgVar.b();
                }
                return ru9.b;
            case 1:
                zzqt zzqtVar = (zzqt) obj2;
                een eenVar = new een(22, zzqtVar, (zzqv) obj);
                lvc a = zzqtVar.a.a();
                v1k v1kVar = new v1k(eenVar);
                a.execute(v1kVar);
                return v1kVar;
            case 2:
                return hkg.h0((ddb) ((zzrf) obj2).e.get());
            default:
                return ((zztj) obj2).zzc();
        }
    }
}
