package defpackage;

import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcyl;
import com.google.android.gms.internal.ads.zzcyt;
import com.google.android.gms.internal.ads.zzcza;
import com.google.android.gms.internal.ads.zzhcv;
import com.google.android.gms.internal.ads.zzhcy;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class pxn implements zzhcv {
    public final /* synthetic */ int a;
    public final /* synthetic */ p03 b;
    public final /* synthetic */ zzcza c;

    public /* synthetic */ pxn(zzcza zzczaVar, p03 p03Var, int i) {
        this.a = i;
        this.b = p03Var;
        this.c = zzczaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        int i = this.a;
        p03 p03Var = this.b;
        int i2 = 14;
        zzcza zzczaVar = this.c;
        switch (i) {
            case 0:
                p03Var.zza(th);
                zzcgj.f.execute(new fsn(zzczaVar, i2));
                break;
            default:
                zzcgj.f.execute(new fsn(zzczaVar, i2));
                p03Var.zza(th);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zzb(Object obj) {
        int i = this.a;
        p03 p03Var = this.b;
        zzcza zzczaVar = this.c;
        switch (i) {
            case 0:
                List list = ((zzcyt) obj).a;
                hsn hsnVar = zzczaVar.a;
                int i2 = 0;
                if (list != null && !list.isEmpty()) {
                    ddb ddbVar = xlo.b;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ddbVar = zzhcy.h(zzhcy.f(ddbVar, Throwable.class, new cpn(p03Var, 3), hsnVar), new qxn(i2, zzczaVar, p03Var, (ddb) it.next()), hsnVar);
                    }
                    ddbVar.addListener(new vlo(i2, ddbVar, new pxn(zzczaVar, p03Var, 1)), hsnVar);
                    break;
                } else {
                    hsnVar.execute(new rxn(p03Var, i2));
                    break;
                }
                break;
            default:
                zzcgj.f.execute(new fsn(zzczaVar, 14));
                p03Var.zzb((zzcyl) obj);
                break;
        }
    }
}
