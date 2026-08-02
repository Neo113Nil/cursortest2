package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2049a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2050b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2051c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public m1 f2052d;

    public final void a(Fragment fragment) {
        if (this.f2049a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f2049a) {
            this.f2049a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final Fragment b(String str) {
        p1 p1Var = (p1) this.f2050b.get(str);
        if (p1Var != null) {
            return p1Var.f2041c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment findFragmentByWho;
        for (p1 p1Var : this.f2050b.values()) {
            if (p1Var != null && (findFragmentByWho = p1Var.f2041c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (p1 p1Var : this.f2050b.values()) {
            if (p1Var != null) {
                arrayList.add(p1Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (p1 p1Var : this.f2050b.values()) {
            if (p1Var != null) {
                arrayList.add(p1Var.f2041c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f2049a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f2049a) {
            arrayList = new ArrayList(this.f2049a);
        }
        return arrayList;
    }

    public final void g(p1 p1Var) {
        Fragment fragment = p1Var.f2041c;
        String str = fragment.mWho;
        HashMap hashMap = this.f2050b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(fragment.mWho, p1Var);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.f2052d.e(fragment);
            } else {
                this.f2052d.i(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (j1.L(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public final void h(p1 p1Var) {
        Fragment fragment = p1Var.f2041c;
        if (fragment.mRetainInstance) {
            this.f2052d.i(fragment);
        }
        String str = fragment.mWho;
        HashMap hashMap = this.f2050b;
        if (hashMap.get(str) == p1Var && ((p1) hashMap.put(fragment.mWho, null)) != null && j1.L(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap hashMap = this.f2051c;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }
}
