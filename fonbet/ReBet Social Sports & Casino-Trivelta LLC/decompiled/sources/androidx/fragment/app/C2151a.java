package androidx.fragment.app;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.N;
import androidx.lifecycle.AbstractC2185j;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2151a extends N implements FragmentManager.n {

    /* renamed from: t, reason: collision with root package name */
    public final FragmentManager f20142t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f20143u;

    /* renamed from: v, reason: collision with root package name */
    public int f20144v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f20145w;

    public C2151a(FragmentManager fragmentManager) {
        super(fragmentManager.B0(), fragmentManager.D0() != null ? fragmentManager.D0().f().getClassLoader() : null);
        this.f20144v = -1;
        this.f20145w = false;
        this.f20142t = fragmentManager;
    }

    public int A(boolean z10, boolean z11) {
        if (this.f20143u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.Q0(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new U("FragmentManager"));
            B("  ", printWriter);
            printWriter.close();
        }
        this.f20143u = true;
        if (this.f20054i) {
            this.f20144v = this.f20142t.p();
        } else {
            this.f20144v = -1;
        }
        if (z11) {
            this.f20142t.e0(this, z10);
        }
        return this.f20144v;
    }

    public void B(String str, PrintWriter printWriter) {
        C(str, printWriter, true);
    }

    public void C(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f20056k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f20144v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f20143u);
            if (this.f20053h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f20053h));
            }
            if (this.f20049d != 0 || this.f20050e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f20049d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f20050e));
            }
            if (this.f20051f != 0 || this.f20052g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f20051f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f20052g));
            }
            if (this.f20057l != 0 || this.f20058m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f20057l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f20058m);
            }
            if (this.f20059n != 0 || this.f20060o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f20059n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f20060o);
            }
        }
        if (this.f20048c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f20048c.size();
        for (int i10 = 0; i10 < size; i10++) {
            N.a aVar = (N.a) this.f20048c.get(i10);
            switch (aVar.f20065a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f20065a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f20066b);
            if (z10) {
                if (aVar.f20068d != 0 || aVar.f20069e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f20068d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f20069e));
                }
                if (aVar.f20070f != 0 || aVar.f20071g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f20070f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f20071g));
                }
            }
        }
    }

    public void D() {
        int size = this.f20048c.size();
        for (int i10 = 0; i10 < size; i10++) {
            N.a aVar = (N.a) this.f20048c.get(i10);
            Fragment fragment = aVar.f20066b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f20145w;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f20053h);
                fragment.setSharedElementNames(this.f20061p, this.f20062q);
            }
            switch (aVar.f20065a) {
                case 1:
                    fragment.setAnimations(aVar.f20068d, aVar.f20069e, aVar.f20070f, aVar.f20071g);
                    this.f20142t.z1(fragment, false);
                    this.f20142t.l(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f20065a);
                case 3:
                    fragment.setAnimations(aVar.f20068d, aVar.f20069e, aVar.f20070f, aVar.f20071g);
                    this.f20142t.p1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f20068d, aVar.f20069e, aVar.f20070f, aVar.f20071g);
                    this.f20142t.N0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f20068d, aVar.f20069e, aVar.f20070f, aVar.f20071g);
                    this.f20142t.z1(fragment, false);
                    this.f20142t.F1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f20068d, aVar.f20069e, aVar.f20070f, aVar.f20071g);
                    this.f20142t.C(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f20068d, aVar.f20069e, aVar.f20070f, aVar.f20071g);
                    this.f20142t.z1(fragment, false);
                    this.f20142t.r(fragment);
                    break;
                case 8:
                    this.f20142t.D1(fragment);
                    break;
                case 9:
                    this.f20142t.D1(null);
                    break;
                case 10:
                    aVar.f20072h = fragment.mMaxState;
                    this.f20142t.C1(fragment, aVar.f20073i);
                    break;
            }
        }
    }

    public void E() {
        for (int size = this.f20048c.size() - 1; size >= 0; size--) {
            N.a aVar = (N.a) this.f20048c.get(size);
            Fragment fragment = aVar.f20066b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f20145w;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.v1(this.f20053h));
                fragment.setSharedElementNames(this.f20062q, this.f20061p);
            }
            switch (aVar.f20065a) {
                case 1:
                    fragment.setAnimations(aVar.f20068d, aVar.f20069e, aVar.f20070f, aVar.f20071g);
                    this.f20142t.z1(fragment, true);
                    this.f20142t.p1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f20065a);
                case 3:
                    fragment.setAnimations(aVar.f20068d, aVar.f20069e, aVar.f20070f, aVar.f20071g);
                    this.f20142t.l(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f20068d, aVar.f20069e, aVar.f20070f, aVar.f20071g);
                    this.f20142t.F1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f20068d, aVar.f20069e, aVar.f20070f, aVar.f20071g);
                    this.f20142t.z1(fragment, true);
                    this.f20142t.N0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f20068d, aVar.f20069e, aVar.f20070f, aVar.f20071g);
                    this.f20142t.r(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f20068d, aVar.f20069e, aVar.f20070f, aVar.f20071g);
                    this.f20142t.z1(fragment, true);
                    this.f20142t.C(fragment);
                    break;
                case 8:
                    this.f20142t.D1(null);
                    break;
                case 9:
                    this.f20142t.D1(fragment);
                    break;
                case 10:
                    aVar.f20073i = fragment.mMaxState;
                    this.f20142t.C1(fragment, aVar.f20072h);
                    break;
            }
        }
    }

    public Fragment F(ArrayList arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i10 = 0;
        while (i10 < this.f20048c.size()) {
            N.a aVar = (N.a) this.f20048c.get(i10);
            int i11 = aVar.f20065a;
            if (i11 != 1) {
                if (i11 == 2) {
                    Fragment fragment3 = aVar.f20066b;
                    int i12 = fragment3.mContainerId;
                    boolean z10 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = (Fragment) arrayList.get(size);
                        if (fragment4.mContainerId == i12) {
                            if (fragment4 == fragment3) {
                                z10 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f20048c.add(i10, new N.a(9, fragment4, true));
                                    i10++;
                                    fragment2 = null;
                                }
                                N.a aVar2 = new N.a(3, fragment4, true);
                                aVar2.f20068d = aVar.f20068d;
                                aVar2.f20070f = aVar.f20070f;
                                aVar2.f20069e = aVar.f20069e;
                                aVar2.f20071g = aVar.f20071g;
                                this.f20048c.add(i10, aVar2);
                                arrayList.remove(fragment4);
                                i10++;
                            }
                        }
                    }
                    if (z10) {
                        this.f20048c.remove(i10);
                        i10--;
                    } else {
                        aVar.f20065a = 1;
                        aVar.f20067c = true;
                        arrayList.add(fragment3);
                    }
                } else if (i11 == 3 || i11 == 6) {
                    arrayList.remove(aVar.f20066b);
                    Fragment fragment5 = aVar.f20066b;
                    if (fragment5 == fragment2) {
                        this.f20048c.add(i10, new N.a(9, fragment5));
                        i10++;
                        fragment2 = null;
                    }
                } else if (i11 != 7) {
                    if (i11 == 8) {
                        this.f20048c.add(i10, new N.a(9, fragment2, true));
                        aVar.f20067c = true;
                        i10++;
                        fragment2 = aVar.f20066b;
                    }
                }
                i10++;
            }
            arrayList.add(aVar.f20066b);
            i10++;
        }
        return fragment2;
    }

    public String G() {
        return this.f20056k;
    }

    public void H() {
        if (this.f20064s != null) {
            for (int i10 = 0; i10 < this.f20064s.size(); i10++) {
                ((Runnable) this.f20064s.get(i10)).run();
            }
            this.f20064s = null;
        }
    }

    public Fragment I(ArrayList arrayList, Fragment fragment) {
        for (int size = this.f20048c.size() - 1; size >= 0; size--) {
            N.a aVar = (N.a) this.f20048c.get(size);
            int i10 = aVar.f20065a;
            if (i10 != 1) {
                if (i10 != 3) {
                    switch (i10) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f20066b;
                            break;
                        case 10:
                            aVar.f20073i = aVar.f20072h;
                            break;
                    }
                }
                arrayList.add(aVar.f20066b);
            }
            arrayList.remove(aVar.f20066b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.n
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (FragmentManager.Q0(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f20054i) {
            return true;
        }
        this.f20142t.k(this);
        return true;
    }

    @Override // androidx.fragment.app.N
    public int h() {
        return A(false, true);
    }

    @Override // androidx.fragment.app.N
    public int i() {
        return A(true, true);
    }

    @Override // androidx.fragment.app.N
    public void j() {
        l();
        this.f20142t.h0(this, false);
    }

    @Override // androidx.fragment.app.N
    public void k() {
        l();
        this.f20142t.h0(this, true);
    }

    @Override // androidx.fragment.app.N
    public void m(int i10, Fragment fragment, String str, int i11) {
        super.m(i10, fragment, str, i11);
        fragment.mFragmentManager = this.f20142t;
    }

    @Override // androidx.fragment.app.N
    public N n(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f20142t) {
            return super.n(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f20144v >= 0) {
            sb2.append(" #");
            sb2.append(this.f20144v);
        }
        if (this.f20056k != null) {
            sb2.append(" ");
            sb2.append(this.f20056k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // androidx.fragment.app.N
    public N u(Fragment fragment, AbstractC2185j.b bVar) {
        if (fragment.mFragmentManager != this.f20142t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f20142t);
        }
        if (bVar == AbstractC2185j.b.f20391b && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        }
        if (bVar != AbstractC2185j.b.f20390a) {
            return super.u(fragment, bVar);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    @Override // androidx.fragment.app.N
    public N v(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.f20142t) {
            return super.v(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public void y(int i10) {
        if (this.f20054i) {
            if (FragmentManager.Q0(2)) {
                toString();
            }
            int size = this.f20048c.size();
            for (int i11 = 0; i11 < size; i11++) {
                N.a aVar = (N.a) this.f20048c.get(i11);
                Fragment fragment = aVar.f20066b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i10;
                    if (FragmentManager.Q0(2)) {
                        Objects.toString(aVar.f20066b);
                        int i12 = aVar.f20066b.mBackStackNesting;
                    }
                }
            }
        }
    }

    public void z() {
        int size = this.f20048c.size() - 1;
        while (size >= 0) {
            N.a aVar = (N.a) this.f20048c.get(size);
            if (aVar.f20067c) {
                if (aVar.f20065a == 8) {
                    aVar.f20067c = false;
                    this.f20048c.remove(size - 1);
                    size--;
                } else {
                    int i10 = aVar.f20066b.mContainerId;
                    aVar.f20065a = 2;
                    aVar.f20067c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        N.a aVar2 = (N.a) this.f20048c.get(i11);
                        if (aVar2.f20067c && aVar2.f20066b.mContainerId == i10) {
                            this.f20048c.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }
}
