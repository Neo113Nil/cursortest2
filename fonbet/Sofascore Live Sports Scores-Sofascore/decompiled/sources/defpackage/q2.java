package defpackage;

import com.sofascore.results.ads.iml.banner.AdBannerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class q2 extends w0 {
    public static void O(Object obj, ArrayList arrayList) {
        arrayList.add(obj);
        if (obj instanceof p2) {
            p2 p2Var = (p2) obj;
            if (p2Var.g()) {
                Iterator it = CollectionsKt.W(p2Var.d()).iterator();
                while (it.hasNext()) {
                    O(it.next(), arrayList);
                }
            }
        }
    }

    @Override // defpackage.g7
    public final void A() {
        if (getItemCount() > 0) {
            fsf fsfVar = new fsf();
            ArrayList arrayList = this.i;
            fsfVar.a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof p2) {
                    arrayList2.add(next);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                p2 p2Var = (p2) it2.next();
                Iterable iterable = (Iterable) fsfVar.a;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : iterable) {
                    if (!CollectionsKt.R(p2Var.d(), obj)) {
                        arrayList3.add(obj);
                    }
                }
                fsfVar.a = arrayList3;
            }
            F((List) fsfVar.a);
        }
    }

    @Override // defpackage.w0, defpackage.g7
    public final void F(List list) {
        ArrayList k = me4.k(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(obj instanceof AdBannerView)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            O(it.next(), k);
        }
        super.F(k);
    }
}
