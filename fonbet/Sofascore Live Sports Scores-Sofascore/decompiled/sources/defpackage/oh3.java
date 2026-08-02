package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class oh3 implements vm8 {
    public final ArrayList a;

    public oh3(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.vm8
    public wm8 a() {
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((fed) it.next()).a());
        }
        return arrayList2.size() == 1 ? (wm8) CollectionsKt.D0(arrayList2) : new ph3();
    }

    @Override // defpackage.vm8
    public v9e b() {
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((fed) it.next()).b());
        }
        return nq8.v(arrayList2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oh3) {
            return this.a.equals(((oh3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return lnb.q(new StringBuilder("ConcatenatedFormatStructure("), CollectionsKt.f0(this.a, ", ", null, null, null, 62), ')');
    }
}
