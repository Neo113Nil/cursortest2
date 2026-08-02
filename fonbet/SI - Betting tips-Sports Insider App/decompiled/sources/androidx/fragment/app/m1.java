package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m1 extends androidx.lifecycle.k1 {

    /* renamed from: h, reason: collision with root package name */
    public static final l1 f2002h = new l1();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2006e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2003b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2004c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f2005d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f2007f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2008g = false;

    public m1(boolean z5) {
        this.f2006e = z5;
    }

    @Override // androidx.lifecycle.k1
    public final void d() {
        if (j1.L(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2007f = true;
    }

    public final void e(Fragment fragment) {
        if (this.f2008g) {
            if (j1.L(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = fragment.mWho;
        HashMap hashMap = this.f2003b;
        if (hashMap.containsKey(str)) {
            return;
        }
        hashMap.put(fragment.mWho, fragment);
        if (j1.L(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.f2003b.equals(m1Var.f2003b) && this.f2004c.equals(m1Var.f2004c) && this.f2005d.equals(m1Var.f2005d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(Fragment fragment, boolean z5) {
        if (j1.L(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        h(fragment.mWho, z5);
    }

    public final void g(String str, boolean z5) {
        if (j1.L(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        h(str, z5);
    }

    public final void h(String str, boolean z5) {
        HashMap hashMap = this.f2004c;
        m1 m1Var = (m1) hashMap.get(str);
        if (m1Var != null) {
            if (z5) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(m1Var.f2004c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m1Var.g((String) it.next(), true);
                }
            }
            m1Var.d();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f2005d;
        androidx.lifecycle.o1 o1Var = (androidx.lifecycle.o1) hashMap2.get(str);
        if (o1Var != null) {
            o1Var.a();
            hashMap2.remove(str);
        }
    }

    public final int hashCode() {
        return this.f2005d.hashCode() + ((this.f2004c.hashCode() + (this.f2003b.hashCode() * 31)) * 31);
    }

    public final void i(Fragment fragment) {
        if (this.f2008g) {
            if (j1.L(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f2003b.remove(fragment.mWho) == null || !j1.L(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f2003b.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f2004c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f2005d.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
