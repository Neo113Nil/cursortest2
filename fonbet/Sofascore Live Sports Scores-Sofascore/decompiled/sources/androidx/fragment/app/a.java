package androidx.fragment.app;

import android.os.Bundle;
import defpackage.a70;
import defpackage.bq8;
import defpackage.dp8;
import defpackage.e6b;
import defpackage.fq8;
import defpackage.is8;
import defpackage.no8;
import defpackage.sw9;
import defpackage.wt3;
import defpackage.xib;
import defpackage.xo8;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a implements dp8 {
    public final xo8 a;
    public final ClassLoader b;
    public final ArrayList c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public String k;
    public int l;
    public CharSequence m;
    public int n;
    public CharSequence o;
    public ArrayList p;
    public ArrayList q;
    public boolean r;
    public ArrayList s;
    public final s t;
    public boolean u;
    public int v;
    public boolean w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(a aVar) {
        this(r0, r1 != null ? r1.b.getClassLoader() : null);
        xo8 M = aVar.t.M();
        no8 no8Var = aVar.t.x;
        Iterator it = aVar.c.iterator();
        while (it.hasNext()) {
            fq8 fq8Var = (fq8) it.next();
            ArrayList arrayList = this.c;
            fq8 fq8Var2 = new fq8();
            fq8Var2.a = fq8Var.a;
            fq8Var2.b = fq8Var.b;
            fq8Var2.c = fq8Var.c;
            fq8Var2.d = fq8Var.d;
            fq8Var2.e = fq8Var.e;
            fq8Var2.f = fq8Var.f;
            fq8Var2.g = fq8Var.g;
            fq8Var2.h = fq8Var.h;
            fq8Var2.i = fq8Var.i;
            arrayList.add(fq8Var2);
        }
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.n = aVar.n;
        this.o = aVar.o;
        this.l = aVar.l;
        this.m = aVar.m;
        if (aVar.p != null) {
            ArrayList arrayList2 = new ArrayList();
            this.p = arrayList2;
            arrayList2.addAll(aVar.p);
        }
        if (aVar.q != null) {
            ArrayList arrayList3 = new ArrayList();
            this.q = arrayList3;
            arrayList3.addAll(aVar.q);
        }
        this.r = aVar.r;
        this.v = -1;
        this.w = false;
        this.t = aVar.t;
        this.u = aVar.u;
        this.v = aVar.v;
        this.w = aVar.w;
    }

    @Override // defpackage.dp8
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (s.O(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.i) {
            return true;
        }
        this.t.d.add(this);
        return true;
    }

    public final void b(fq8 fq8Var) {
        this.c.add(fq8Var);
        fq8Var.d = this.d;
        fq8Var.e = this.e;
        fq8Var.f = this.f;
        fq8Var.g = this.g;
    }

    public final void c(String str) {
        if (!this.j) {
            a70.r("This FragmentTransaction is not allowed to be added to the back stack.");
        } else {
            this.i = true;
            this.k = str;
        }
    }

    public final void d(int i) {
        if (this.i) {
            if (s.O(2)) {
                toString();
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                fq8 fq8Var = (fq8) arrayList.get(i2);
                Fragment fragment = fq8Var.b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (s.O(2)) {
                        Objects.toString(fq8Var.b);
                        int i3 = fq8Var.b.mBackStackNesting;
                    }
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.c;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            fq8 fq8Var = (fq8) arrayList.get(size);
            if (fq8Var.c) {
                if (fq8Var.a == 8) {
                    fq8Var.c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = fq8Var.b.mContainerId;
                    fq8Var.a = 2;
                    fq8Var.c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        fq8 fq8Var2 = (fq8) arrayList.get(i2);
                        if (fq8Var2.c && fq8Var2.b.mContainerId == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final void f() {
        g(false, true);
    }

    public final int g(boolean z, boolean z2) {
        if (this.u) {
            a70.r("commit already called");
            return 0;
        }
        if (s.O(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new xib());
            j("  ", printWriter, true);
            printWriter.close();
        }
        this.u = true;
        boolean z3 = this.i;
        s sVar = this.t;
        if (z3) {
            this.v = sVar.k.getAndIncrement();
        } else {
            this.v = -1;
        }
        if (z2) {
            sVar.x(this, z);
        }
        return this.v;
    }

    public final Fragment h(Class cls, Bundle bundle) {
        xo8 xo8Var = this.a;
        if (xo8Var == null) {
            a70.r("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
            return null;
        }
        if (this.b == null) {
            a70.r("The FragmentManager must be attached to itshost to create a Fragment");
            return null;
        }
        Fragment a = xo8Var.a(cls.getName());
        if (bundle != null) {
            a.setArguments(bundle);
        }
        return a;
    }

    public final void i(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            bq8.d(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            a70.l(cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.", "Fragment ");
            return;
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                a70.r(wt3.m(fragment.mTag, " now ", sb, str));
                return;
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.mFragmentId;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(fragment);
                int i4 = fragment.mFragmentId;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        b(new fq8(fragment, i2));
        fragment.mFragmentManager = this.t;
    }

    public final void j(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.u);
            if (this.h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.h));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.m);
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.o);
            }
        }
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            fq8 fq8Var = (fq8) arrayList.get(i);
            switch (fq8Var.a) {
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
                    str2 = "cmd=" + fq8Var.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(fq8Var.b);
            if (z) {
                if (fq8Var.d != 0 || fq8Var.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(fq8Var.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(fq8Var.e));
                }
                if (fq8Var.f != 0 || fq8Var.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(fq8Var.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(fq8Var.g));
                }
            }
        }
    }

    public final void k(Fragment fragment) {
        s sVar = fragment.mFragmentManager;
        if (sVar == null || sVar == this.t) {
            b(new fq8(fragment, 3));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final void l(int i, Fragment fragment, String str) {
        if (i != 0) {
            i(i, fragment, str, 2);
        } else {
            a70.p("Must use non-zero containerViewId");
        }
    }

    public final void m(Fragment fragment, e6b e6bVar) {
        s sVar = fragment.mFragmentManager;
        s sVar2 = this.t;
        if (sVar != sVar2) {
            is8.c(sVar2, "Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            return;
        }
        if (e6bVar == e6b.b && fragment.mState > -1) {
            sw9.o(e6bVar, " after the Fragment has been created", "Cannot set maximum Lifecycle to ");
            return;
        }
        if (e6bVar == e6b.a) {
            sw9.o(e6bVar, ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.", "Cannot set maximum Lifecycle to ");
            return;
        }
        fq8 fq8Var = new fq8();
        fq8Var.a = 10;
        fq8Var.b = fragment;
        fq8Var.c = false;
        fq8Var.h = fragment.mMaxState;
        fq8Var.i = e6bVar;
        b(fq8Var);
    }

    public final void n(Fragment fragment) {
        s sVar = fragment.mFragmentManager;
        if (sVar == null || sVar == this.t) {
            b(new fq8(fragment, 8));
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.v >= 0) {
            sb.append(" #");
            sb.append(this.v);
        }
        if (this.k != null) {
            sb.append(" ");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(s sVar) {
        this(r0, r1 != null ? r1.b.getClassLoader() : null);
        xo8 M = sVar.M();
        no8 no8Var = sVar.x;
        this.v = -1;
        this.w = false;
        this.t = sVar;
    }

    public a(xo8 xo8Var, ClassLoader classLoader) {
        this.c = new ArrayList();
        this.j = true;
        this.r = false;
        this.a = xo8Var;
        this.b = classLoader;
    }
}
