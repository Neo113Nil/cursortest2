package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i7g extends dfb {
    public final ArrayList a;
    public final AtomicInteger b;
    public final int c;

    public i7g(ArrayList arrayList, AtomicInteger atomicInteger) {
        z1a.r("empty list", !arrayList.isEmpty());
        this.a = arrayList;
        this.b = atomicInteger;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((dfb) it.next()).hashCode();
        }
        this.c = i;
    }

    @Override // defpackage.dfb
    public final bfb a(kge kgeVar) {
        int andIncrement = this.b.getAndIncrement() & Integer.MAX_VALUE;
        ArrayList arrayList = this.a;
        return ((dfb) arrayList.get(andIncrement % arrayList.size())).a(kgeVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i7g)) {
            return false;
        }
        i7g i7gVar = (i7g) obj;
        ArrayList arrayList = i7gVar.a;
        if (i7gVar == this) {
            return true;
        }
        if (this.c != i7gVar.c || this.b != i7gVar.b) {
            return false;
        }
        ArrayList arrayList2 = this.a;
        return arrayList2.size() == arrayList.size() && new HashSet(arrayList2).containsAll(arrayList);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        en0 en0Var = new en0(i7g.class.getSimpleName());
        en0Var.e(this.a, "subchannelPickers");
        return en0Var.toString();
    }
}
