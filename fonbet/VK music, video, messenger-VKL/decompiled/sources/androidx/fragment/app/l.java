package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.bds;
import xsna.iut0;
import xsna.zr;

/* compiled from: FragmentTransaction.java */
/* loaded from: classes.dex */
public abstract class l {
    public final f a;
    public final ClassLoader b;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;

    @Nullable
    public String k;
    public int l;
    public CharSequence m;
    public int n;
    public CharSequence o;
    public ArrayList<String> p;
    public ArrayList<String> q;
    public ArrayList<Runnable> s;
    public final ArrayList<a> c = new ArrayList<>();
    public boolean j = true;
    public boolean r = false;

    /* compiled from: FragmentTransaction.java */
    public static final class a {
        public int a;
        public Fragment b;
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public Lifecycle.State h;
        public Lifecycle.State i;

        public a() {
        }

        public a(Fragment fragment, int i) {
            this.a = i;
            this.b = fragment;
            this.c = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.h = state;
            this.i = state;
        }

        public a(int i, Fragment fragment, int i2) {
            this.a = i;
            this.b = fragment;
            this.c = true;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.h = state;
            this.i = state;
        }
    }

    public l(@NonNull f fVar, @Nullable ClassLoader classLoader) {
        this.a = fVar;
        this.b = classLoader;
    }

    public final void b(a aVar) {
        this.c.add(aVar);
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
    }

    @NonNull
    public final void c(@NonNull View view, @NonNull String str) {
        if (bds.e()) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            String transitionName = view.getTransitionName();
            if (transitionName == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.p == null) {
                this.p = new ArrayList<>();
                this.q = new ArrayList<>();
            } else {
                if (this.q.contains(str)) {
                    throw new IllegalArgumentException(zr.a("A shared element with the target name '", str, "' has already been added to the transaction."));
                }
                if (this.p.contains(transitionName)) {
                    throw new IllegalArgumentException(zr.a("A shared element with the source name '", transitionName, "' has already been added to the transaction."));
                }
            }
            this.p.add(transitionName);
            this.q.add(str);
        }
    }

    @NonNull
    public final void d(@Nullable String str) {
        if (!this.j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.i = true;
        this.k = str;
    }

    @NonNull
    public final Fragment e(@NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle) {
        f fVar = this.a;
        if (fVar == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        if (this.b == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        Fragment a2 = fVar.a(cls.getName());
        if (bundle != null) {
            a2.setArguments(bundle);
        }
        return a2;
    }

    public abstract void f(int i, Fragment fragment, @Nullable String str, int i2);

    @NonNull
    public final void g(int i, @NonNull Fragment fragment, @Nullable String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        f(i, fragment, str, 2);
    }

    @NonNull
    public final void h(@NonNull Runnable runnable, boolean z) {
        if (!z) {
            if (this.i) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            this.j = false;
        }
        if (this.s == null) {
            this.s = new ArrayList<>();
        }
        this.s.add(runnable);
    }

    @NonNull
    public final void i(int i, int i2, int i3, int i4) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }
}
