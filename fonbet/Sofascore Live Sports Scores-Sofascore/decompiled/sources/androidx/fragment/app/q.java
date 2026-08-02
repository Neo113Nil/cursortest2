package androidx.fragment.app;

import defpackage.cp8;
import defpackage.dp8;
import defpackage.fq8;
import defpackage.mz1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q implements dp8 {
    public final /* synthetic */ s a;

    public q(s sVar) {
        this.a = sVar;
    }

    @Override // defpackage.dp8
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean X;
        s sVar = this.a;
        ArrayList arrayList5 = sVar.o;
        if (s.O(2)) {
            Objects.toString(sVar.a);
        }
        if (sVar.d.isEmpty()) {
            X = false;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
        } else {
            a aVar = (a) mz1.h(sVar.d, 1);
            sVar.h = aVar;
            Iterator it = aVar.c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((fq8) it.next()).b;
                if (fragment != null) {
                    fragment.mTransitioning = true;
                }
            }
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            X = sVar.X(arrayList3, arrayList4, null, -1, 0);
        }
        if (!arrayList5.isEmpty() && arrayList3.size() > 0) {
            boolean booleanValue = ((Boolean) arrayList4.get(arrayList3.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(s.I((a) it2.next()));
            }
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                cp8 cp8Var = (cp8) it3.next();
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    cp8Var.b((Fragment) it4.next(), booleanValue);
                }
            }
        }
        return X;
    }
}
