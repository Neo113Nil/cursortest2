package androidx.fragment.app;

import androidx.lifecycle.U;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class H extends androidx.lifecycle.Q {

    /* renamed from: z, reason: collision with root package name */
    public static final U.c f20020z = new a();

    /* renamed from: v, reason: collision with root package name */
    public final boolean f20024v;

    /* renamed from: s, reason: collision with root package name */
    public final HashMap f20021s = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f20022t = new HashMap();

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f20023u = new HashMap();

    /* renamed from: w, reason: collision with root package name */
    public boolean f20025w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20026x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f20027y = false;

    public class a implements U.c {
        @Override // androidx.lifecycle.U.c
        public androidx.lifecycle.Q create(Class cls) {
            return new H(true);
        }
    }

    public H(boolean z10) {
        this.f20024v = z10;
    }

    public static H g(androidx.lifecycle.V v10) {
        return (H) new androidx.lifecycle.U(v10, f20020z).a(H.class);
    }

    public void a(Fragment fragment) {
        if (this.f20027y) {
            FragmentManager.Q0(2);
        } else {
            if (this.f20021s.containsKey(fragment.mWho)) {
                return;
            }
            this.f20021s.put(fragment.mWho, fragment);
            if (FragmentManager.Q0(2)) {
                fragment.toString();
            }
        }
    }

    public void b(Fragment fragment, boolean z10) {
        if (FragmentManager.Q0(3)) {
            Objects.toString(fragment);
        }
        d(fragment.mWho, z10);
    }

    public void c(String str, boolean z10) {
        FragmentManager.Q0(3);
        d(str, z10);
    }

    public final void d(String str, boolean z10) {
        H h10 = (H) this.f20022t.get(str);
        if (h10 != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(h10.f20022t.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    h10.c((String) it.next(), true);
                }
            }
            h10.onCleared();
            this.f20022t.remove(str);
        }
        androidx.lifecycle.V v10 = (androidx.lifecycle.V) this.f20023u.get(str);
        if (v10 != null) {
            v10.a();
            this.f20023u.remove(str);
        }
    }

    public Fragment e(String str) {
        return (Fragment) this.f20021s.get(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && H.class == obj.getClass()) {
            H h10 = (H) obj;
            if (this.f20021s.equals(h10.f20021s) && this.f20022t.equals(h10.f20022t) && this.f20023u.equals(h10.f20023u)) {
                return true;
            }
        }
        return false;
    }

    public H f(Fragment fragment) {
        H h10 = (H) this.f20022t.get(fragment.mWho);
        if (h10 != null) {
            return h10;
        }
        H h11 = new H(this.f20024v);
        this.f20022t.put(fragment.mWho, h11);
        return h11;
    }

    public Collection h() {
        return new ArrayList(this.f20021s.values());
    }

    public int hashCode() {
        return (((this.f20021s.hashCode() * 31) + this.f20022t.hashCode()) * 31) + this.f20023u.hashCode();
    }

    public androidx.lifecycle.V i(Fragment fragment) {
        androidx.lifecycle.V v10 = (androidx.lifecycle.V) this.f20023u.get(fragment.mWho);
        if (v10 != null) {
            return v10;
        }
        androidx.lifecycle.V v11 = new androidx.lifecycle.V();
        this.f20023u.put(fragment.mWho, v11);
        return v11;
    }

    public boolean j() {
        return this.f20025w;
    }

    public void k(Fragment fragment) {
        if (this.f20027y) {
            FragmentManager.Q0(2);
        } else {
            if (this.f20021s.remove(fragment.mWho) == null || !FragmentManager.Q0(2)) {
                return;
            }
            fragment.toString();
        }
    }

    public void l(boolean z10) {
        this.f20027y = z10;
    }

    public boolean m(Fragment fragment) {
        if (this.f20021s.containsKey(fragment.mWho)) {
            return this.f20024v ? this.f20025w : !this.f20026x;
        }
        return true;
    }

    @Override // androidx.lifecycle.Q
    public void onCleared() {
        if (FragmentManager.Q0(3)) {
            toString();
        }
        this.f20025w = true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f20021s.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f20022t.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f20023u.keySet().iterator();
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
