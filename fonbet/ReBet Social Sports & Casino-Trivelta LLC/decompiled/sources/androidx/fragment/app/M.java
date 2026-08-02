package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class M {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f20042a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f20043b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f20044c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public H f20045d;

    public void A(H h10) {
        this.f20045d = h10;
    }

    public Bundle B(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.f20044c.put(str, bundle) : (Bundle) this.f20044c.remove(str);
    }

    public void a(Fragment fragment) {
        if (this.f20042a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f20042a) {
            this.f20042a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public void b() {
        this.f20043b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        return this.f20043b.get(str) != null;
    }

    public void d(int i10) {
        for (K k10 : this.f20043b.values()) {
            if (k10 != null) {
                k10.t(i10);
            }
        }
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f20043b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (K k10 : this.f20043b.values()) {
                printWriter.print(str);
                if (k10 != null) {
                    Fragment k11 = k10.k();
                    printWriter.println(k11);
                    k11.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f20042a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = (Fragment) this.f20042a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    public Fragment f(String str) {
        K k10 = (K) this.f20043b.get(str);
        if (k10 != null) {
            return k10.k();
        }
        return null;
    }

    public Fragment g(int i10) {
        for (int size = this.f20042a.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f20042a.get(size);
            if (fragment != null && fragment.mFragmentId == i10) {
                return fragment;
            }
        }
        for (K k10 : this.f20043b.values()) {
            if (k10 != null) {
                Fragment k11 = k10.k();
                if (k11.mFragmentId == i10) {
                    return k11;
                }
            }
        }
        return null;
    }

    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.f20042a.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f20042a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (K k10 : this.f20043b.values()) {
            if (k10 != null) {
                Fragment k11 = k10.k();
                if (str.equals(k11.mTag)) {
                    return k11;
                }
            }
        }
        return null;
    }

    public Fragment i(String str) {
        Fragment findFragmentByWho;
        for (K k10 : this.f20043b.values()) {
            if (k10 != null && (findFragmentByWho = k10.k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f20042a.indexOf(fragment);
        for (int i10 = indexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = (Fragment) this.f20042a.get(i10);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f20042a.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f20042a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public List k() {
        ArrayList arrayList = new ArrayList();
        for (K k10 : this.f20043b.values()) {
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return arrayList;
    }

    public List l() {
        ArrayList arrayList = new ArrayList();
        for (K k10 : this.f20043b.values()) {
            if (k10 != null) {
                arrayList.add(k10.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public HashMap m() {
        return this.f20044c;
    }

    public K n(String str) {
        return (K) this.f20043b.get(str);
    }

    public List o() {
        ArrayList arrayList;
        if (this.f20042a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f20042a) {
            arrayList = new ArrayList(this.f20042a);
        }
        return arrayList;
    }

    public H p() {
        return this.f20045d;
    }

    public Bundle q(String str) {
        return (Bundle) this.f20044c.get(str);
    }

    public void r(K k10) {
        Fragment k11 = k10.k();
        if (c(k11.mWho)) {
            return;
        }
        this.f20043b.put(k11.mWho, k10);
        if (k11.mRetainInstanceChangedWhileDetached) {
            if (k11.mRetainInstance) {
                this.f20045d.a(k11);
            } else {
                this.f20045d.k(k11);
            }
            k11.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.Q0(2)) {
            k11.toString();
        }
    }

    public void s(K k10) {
        Fragment k11 = k10.k();
        if (k11.mRetainInstance) {
            this.f20045d.k(k11);
        }
        if (this.f20043b.get(k11.mWho) == k10 && ((K) this.f20043b.put(k11.mWho, null)) != null && FragmentManager.Q0(2)) {
            k11.toString();
        }
    }

    public void t() {
        Iterator it = this.f20042a.iterator();
        while (it.hasNext()) {
            K k10 = (K) this.f20043b.get(((Fragment) it.next()).mWho);
            if (k10 != null) {
                k10.m();
            }
        }
        for (K k11 : this.f20043b.values()) {
            if (k11 != null) {
                k11.m();
                Fragment k12 = k11.k();
                if (k12.mRemoving && !k12.isInBackStack()) {
                    if (k12.mBeingSaved && !this.f20044c.containsKey(k12.mWho)) {
                        B(k12.mWho, k11.r());
                    }
                    s(k11);
                }
            }
        }
    }

    public void u(Fragment fragment) {
        synchronized (this.f20042a) {
            this.f20042a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    public void v() {
        this.f20043b.clear();
    }

    public void w(List list) {
        this.f20042a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment f10 = f(str);
                if (f10 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.Q0(2)) {
                    f10.toString();
                }
                a(f10);
            }
        }
    }

    public void x(HashMap hashMap) {
        this.f20044c.clear();
        this.f20044c.putAll(hashMap);
    }

    public ArrayList y() {
        ArrayList arrayList = new ArrayList(this.f20043b.size());
        for (K k10 : this.f20043b.values()) {
            if (k10 != null) {
                Fragment k11 = k10.k();
                B(k11.mWho, k10.r());
                arrayList.add(k11.mWho);
                if (FragmentManager.Q0(2)) {
                    k11.toString();
                    Objects.toString(k11.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    public ArrayList z() {
        synchronized (this.f20042a) {
            try {
                if (this.f20042a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f20042a.size());
                Iterator it = this.f20042a.iterator();
                while (it.hasNext()) {
                    Fragment fragment = (Fragment) it.next();
                    arrayList.add(fragment.mWho);
                    if (FragmentManager.Q0(2)) {
                        fragment.toString();
                    }
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
