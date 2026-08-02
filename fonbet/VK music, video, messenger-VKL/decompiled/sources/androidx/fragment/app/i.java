package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.lifecycle.e0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import xsna.nyt0;
import xsna.wyt0;

/* compiled from: FragmentManagerViewModel.java */
/* loaded from: classes.dex */
public final class i extends nyt0 {
    public static final a h = new a();
    public final boolean e;
    public final HashMap<String, Fragment> b = new HashMap<>();
    public final HashMap<String, i> c = new HashMap<>();
    public final HashMap<String, wyt0> d = new HashMap<>();
    public boolean f = false;
    public boolean g = false;

    /* compiled from: FragmentManagerViewModel.java */
    public class a implements e0.c {
        @Override // androidx.lifecycle.e0.c
        @NonNull
        public final <T extends nyt0> T a(@NonNull Class<T> cls) {
            return new i(true);
        }
    }

    public i(boolean z) {
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.b.equals(iVar.b) && this.c.equals(iVar.c) && this.d.equals(iVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.nyt0
    public final void h() {
        if (FragmentManager.P(3)) {
            toString();
        }
        this.f = true;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final void i(@NonNull Fragment fragment) {
        if (this.g) {
            return;
        }
        String str = fragment.mWho;
        HashMap<String, Fragment> hashMap = this.b;
        if (hashMap.containsKey(str)) {
            return;
        }
        hashMap.put(fragment.mWho, fragment);
        if (FragmentManager.P(2)) {
            fragment.toString();
        }
    }

    public final void j(@NonNull String str, boolean z) {
        HashMap<String, i> hashMap = this.c;
        i iVar = hashMap.get(str);
        if (iVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(iVar.c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    iVar.j((String) it.next(), true);
                }
            }
            iVar.h();
            hashMap.remove(str);
        }
        HashMap<String, wyt0> hashMap2 = this.d;
        wyt0 wyt0Var = hashMap2.get(str);
        if (wyt0Var != null) {
            wyt0Var.a();
            hashMap2.remove(str);
        }
    }

    public final void k(@NonNull Fragment fragment) {
        if (this.g || this.b.remove(fragment.mWho) == null || !FragmentManager.P(2)) {
            return;
        }
        fragment.toString();
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
