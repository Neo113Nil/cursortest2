package defpackage;

import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzao;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzaw;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class d5p extends zzai {
    public final boolean c;
    public final boolean d;
    public final /* synthetic */ zzt e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5p(zzt zztVar, boolean z, boolean z2) {
        super("log");
        this.e = zztVar;
        this.c = z;
        this.d = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    @Override // com.google.android.gms.internal.measurement.zzai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzao d(zzg zzgVar, List list) {
        int i;
        int i2;
        zzh.b(1, "log", list);
        int size = list.size();
        zzat zzatVar = zzao.I7;
        zzt zztVar = this.e;
        if (size == 1) {
            zztVar.c.d(3, zzgVar.b.b(zzgVar, (zzao) list.get(0)).zzc(), Collections.EMPTY_LIST, this.c, this.d);
            return zzatVar;
        }
        zzao zzaoVar = (zzao) list.get(0);
        zzaw zzawVar = zzgVar.b;
        zzaw zzawVar2 = zzgVar.b;
        int g = zzh.g(zzawVar.b(zzgVar, zzaoVar).zzd().doubleValue());
        if (g != 2) {
            i = 3;
            if (g == 3) {
                i2 = 1;
            } else if (g == 5) {
                i2 = 5;
            } else if (g == 6) {
                i2 = 2;
            }
            String zzc = zzawVar2.b(zzgVar, (zzao) list.get(1)).zzc();
            if (list.size() != 2) {
                zztVar.c.d(i2, zzc, Collections.EMPTY_LIST, this.c, this.d);
                return zzatVar;
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                arrayList.add(zzawVar2.b(zzgVar, (zzao) list.get(i3)).zzc());
            }
            zztVar.c.d(i2, zzc, arrayList, this.c, this.d);
            return zzatVar;
        }
        i = 4;
        i2 = i;
        String zzc2 = zzawVar2.b(zzgVar, (zzao) list.get(1)).zzc();
        if (list.size() != 2) {
        }
    }
}
