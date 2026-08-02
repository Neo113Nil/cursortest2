package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends s1 implements f1 {

    /* renamed from: r, reason: collision with root package name */
    public final j1 f1860r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1861s;

    /* renamed from: t, reason: collision with root package name */
    public int f1862t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1863u;

    public a(j1 j1Var) {
        j1Var.I();
        t0 t0Var = j1Var.f1983w;
        if (t0Var != null) {
            t0Var.f2087b.getClassLoader();
        }
        this.f1862t = -1;
        this.f1863u = false;
        this.f1860r = j1Var;
    }

    @Override // androidx.fragment.app.f1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (j1.L(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2075g) {
            return true;
        }
        this.f1860r.f1966d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.s1
    public final void c(int i5, Fragment fragment, String str, int i10) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            o1.d.d(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(": was ");
                throw new IllegalStateException(d9.e.m(sb2, fragment.mTag, " now ", str));
            }
            fragment.mTag = str;
        }
        if (i5 != 0) {
            if (i5 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i11 = fragment.mFragmentId;
            if (i11 != 0 && i11 != i5) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i5);
            }
            fragment.mFragmentId = i5;
            fragment.mContainerId = i5;
        }
        b(new r1(fragment, i10));
        fragment.mFragmentManager = this.f1860r;
    }

    public final void d(int i5) {
        if (this.f2075g) {
            if (j1.L(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i5);
            }
            ArrayList arrayList = this.f2069a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                r1 r1Var = (r1) arrayList.get(i10);
                Fragment fragment = r1Var.f2061b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i5;
                    if (j1.L(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + r1Var.f2061b + " to " + r1Var.f2061b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.f2069a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            r1 r1Var = (r1) arrayList.get(size);
            if (r1Var.f2062c) {
                if (r1Var.f2060a == 8) {
                    r1Var.f2062c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i5 = r1Var.f2061b.mContainerId;
                    r1Var.f2060a = 2;
                    r1Var.f2062c = false;
                    for (int i10 = size - 1; i10 >= 0; i10--) {
                        r1 r1Var2 = (r1) arrayList.get(i10);
                        if (r1Var2.f2062c && r1Var2.f2061b.mContainerId == i5) {
                            arrayList.remove(i10);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int f() {
        return g(false, true);
    }

    public final int g(boolean z5, boolean z7) {
        if (this.f1861s) {
            throw new IllegalStateException("commit already called");
        }
        if (j1.L(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new c2());
            h("  ", printWriter, true);
            printWriter.close();
        }
        this.f1861s = true;
        boolean z10 = this.f2075g;
        j1 j1Var = this.f1860r;
        if (z10) {
            this.f1862t = j1Var.f1972k.getAndIncrement();
        } else {
            this.f1862t = -1;
        }
        if (z7) {
            j1Var.x(this, z5);
        }
        return this.f1862t;
    }

    public final void h(String str, PrintWriter printWriter, boolean z5) {
        String str2;
        if (z5) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2077i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1862t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1861s);
            if (this.f2074f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2074f));
            }
            if (this.f2070b != 0 || this.f2071c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2070b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2071c));
            }
            if (this.f2072d != 0 || this.f2073e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2072d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2073e));
            }
            if (this.j != 0 || this.f2078k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2078k);
            }
            if (this.f2079l != 0 || this.f2080m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2079l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2080m);
            }
        }
        ArrayList arrayList = this.f2069a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            r1 r1Var = (r1) arrayList.get(i5);
            switch (r1Var.f2060a) {
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
                    str2 = "cmd=" + r1Var.f2060a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i5);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(r1Var.f2061b);
            if (z5) {
                if (r1Var.f2063d != 0 || r1Var.f2064e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(r1Var.f2063d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(r1Var.f2064e));
                }
                if (r1Var.f2065f != 0 || r1Var.f2066g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(r1Var.f2065f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(r1Var.f2066g));
                }
            }
        }
    }

    public final a i(Fragment fragment) {
        j1 j1Var = fragment.mFragmentManager;
        if (j1Var == null || j1Var == this.f1860r) {
            b(new r1(fragment, 8));
            return this;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1862t >= 0) {
            sb2.append(" #");
            sb2.append(this.f1862t);
        }
        if (this.f2077i != null) {
            sb2.append(" ");
            sb2.append(this.f2077i);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public a(a aVar) {
        aVar.f1860r.I();
        t0 t0Var = aVar.f1860r.f1983w;
        if (t0Var != null) {
            t0Var.f2087b.getClassLoader();
        }
        Iterator it = aVar.f2069a.iterator();
        while (it.hasNext()) {
            r1 r1Var = (r1) it.next();
            ArrayList arrayList = this.f2069a;
            r1 r1Var2 = new r1();
            r1Var2.f2060a = r1Var.f2060a;
            r1Var2.f2061b = r1Var.f2061b;
            r1Var2.f2062c = r1Var.f2062c;
            r1Var2.f2063d = r1Var.f2063d;
            r1Var2.f2064e = r1Var.f2064e;
            r1Var2.f2065f = r1Var.f2065f;
            r1Var2.f2066g = r1Var.f2066g;
            r1Var2.f2067h = r1Var.f2067h;
            r1Var2.f2068i = r1Var.f2068i;
            arrayList.add(r1Var2);
        }
        this.f2070b = aVar.f2070b;
        this.f2071c = aVar.f2071c;
        this.f2072d = aVar.f2072d;
        this.f2073e = aVar.f2073e;
        this.f2074f = aVar.f2074f;
        this.f2075g = aVar.f2075g;
        this.f2076h = aVar.f2076h;
        this.f2077i = aVar.f2077i;
        this.f2079l = aVar.f2079l;
        this.f2080m = aVar.f2080m;
        this.j = aVar.j;
        this.f2078k = aVar.f2078k;
        if (aVar.f2081n != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f2081n = arrayList2;
            arrayList2.addAll(aVar.f2081n);
        }
        if (aVar.f2082o != null) {
            ArrayList arrayList3 = new ArrayList();
            this.f2082o = arrayList3;
            arrayList3.addAll(aVar.f2082o);
        }
        this.f2083p = aVar.f2083p;
        this.f1862t = -1;
        this.f1863u = false;
        this.f1860r = aVar.f1860r;
        this.f1861s = aVar.f1861s;
        this.f1862t = aVar.f1862t;
        this.f1863u = aVar.f1863u;
    }
}
