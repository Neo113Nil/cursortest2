package androidx.fragment.app;

import defpackage.ltk;
import defpackage.stk;
import defpackage.uu4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t extends ltk {
    public static final uu4 h = new uu4(1);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public t(boolean z) {
        this.e = z;
    }

    @Override // defpackage.ltk
    public final void e() {
        if (s.O(3)) {
            toString();
        }
        this.f = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return this.b.equals(tVar.b) && this.c.equals(tVar.c) && this.d.equals(tVar.d);
    }

    public final void f(Fragment fragment) {
        if (this.g) {
            return;
        }
        String str = fragment.mWho;
        HashMap hashMap = this.b;
        if (hashMap.containsKey(str)) {
            return;
        }
        hashMap.put(fragment.mWho, fragment);
        if (s.O(2)) {
            fragment.toString();
        }
    }

    public final void g(String str, boolean z) {
        HashMap hashMap = this.c;
        t tVar = (t) hashMap.get(str);
        if (tVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(tVar.c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    tVar.g((String) it.next(), true);
                }
            }
            tVar.e();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.d;
        stk stkVar = (stk) hashMap2.get(str);
        if (stkVar != null) {
            stkVar.a();
            hashMap2.remove(str);
        }
    }

    public final void h(Fragment fragment) {
        if (this.g || this.b.remove(fragment.mWho) == null || !s.O(2)) {
            return;
        }
        fragment.toString();
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
