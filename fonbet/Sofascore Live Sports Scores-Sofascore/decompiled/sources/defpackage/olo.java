package defpackage;

import com.google.android.gms.internal.ads.zzgxm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class olo extends klo {
    public List p;

    public olo(zzgxm zzgxmVar, boolean z) {
        super(zzgxmVar, z, true);
        List arrayList;
        if (zzgxmVar.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            int size = zzgxmVar.size();
            u0a.S(size, "initialArraySize");
            arrayList = new ArrayList(size);
        }
        for (int i = 0; i < zzgxmVar.size(); i++) {
            arrayList.add(null);
        }
        this.p = arrayList;
        v();
    }

    @Override // defpackage.klo
    public final void r(int i) {
        this.l = null;
        this.p = null;
    }

    @Override // defpackage.klo
    public final void w(int i, Object obj) {
        List list = this.p;
        if (list != null) {
            list.set(i, new plo(obj));
        }
    }

    @Override // defpackage.klo
    public final void x() {
        List<plo> list = this.p;
        if (list != null) {
            int size = list.size();
            u0a.S(size, "initialArraySize");
            ArrayList arrayList = new ArrayList(size);
            for (plo ploVar : list) {
                arrayList.add(ploVar != null ? ploVar.a : null);
            }
            d(Collections.unmodifiableList(arrayList));
        }
    }
}
