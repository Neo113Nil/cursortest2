package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC2185j;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class N {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2172w f20046a;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f20047b;

    /* renamed from: d, reason: collision with root package name */
    public int f20049d;

    /* renamed from: e, reason: collision with root package name */
    public int f20050e;

    /* renamed from: f, reason: collision with root package name */
    public int f20051f;

    /* renamed from: g, reason: collision with root package name */
    public int f20052g;

    /* renamed from: h, reason: collision with root package name */
    public int f20053h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20054i;

    /* renamed from: k, reason: collision with root package name */
    public String f20056k;

    /* renamed from: l, reason: collision with root package name */
    public int f20057l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f20058m;

    /* renamed from: n, reason: collision with root package name */
    public int f20059n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f20060o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f20061p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f20062q;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f20064s;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f20048c = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public boolean f20055j = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f20063r = false;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f20065a;

        /* renamed from: b, reason: collision with root package name */
        public Fragment f20066b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f20067c;

        /* renamed from: d, reason: collision with root package name */
        public int f20068d;

        /* renamed from: e, reason: collision with root package name */
        public int f20069e;

        /* renamed from: f, reason: collision with root package name */
        public int f20070f;

        /* renamed from: g, reason: collision with root package name */
        public int f20071g;

        /* renamed from: h, reason: collision with root package name */
        public AbstractC2185j.b f20072h;

        /* renamed from: i, reason: collision with root package name */
        public AbstractC2185j.b f20073i;

        public a() {
        }

        public a(int i10, Fragment fragment) {
            this.f20065a = i10;
            this.f20066b = fragment;
            this.f20067c = false;
            AbstractC2185j.b bVar = AbstractC2185j.b.f20394e;
            this.f20072h = bVar;
            this.f20073i = bVar;
        }

        public a(int i10, Fragment fragment, boolean z10) {
            this.f20065a = i10;
            this.f20066b = fragment;
            this.f20067c = z10;
            AbstractC2185j.b bVar = AbstractC2185j.b.f20394e;
            this.f20072h = bVar;
            this.f20073i = bVar;
        }

        public a(int i10, Fragment fragment, AbstractC2185j.b bVar) {
            this.f20065a = i10;
            this.f20066b = fragment;
            this.f20067c = false;
            this.f20072h = fragment.mMaxState;
            this.f20073i = bVar;
        }
    }

    public N(AbstractC2172w abstractC2172w, ClassLoader classLoader) {
        this.f20046a = abstractC2172w;
        this.f20047b = classLoader;
    }

    public N b(int i10, Fragment fragment) {
        m(i10, fragment, null, 1);
        return this;
    }

    public N c(int i10, Fragment fragment, String str) {
        m(i10, fragment, str, 1);
        return this;
    }

    public final N d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        fragment.mInDynamicContainer = true;
        return c(viewGroup.getId(), fragment, str);
    }

    public N e(Fragment fragment, String str) {
        m(0, fragment, str, 1);
        return this;
    }

    public void f(a aVar) {
        this.f20048c.add(aVar);
        aVar.f20068d = this.f20049d;
        aVar.f20069e = this.f20050e;
        aVar.f20070f = this.f20051f;
        aVar.f20071g = this.f20052g;
    }

    public N g(String str) {
        if (!this.f20055j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f20054i = true;
        this.f20056k = str;
        return this;
    }

    public abstract int h();

    public abstract int i();

    public abstract void j();

    public abstract void k();

    public N l() {
        if (this.f20054i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f20055j = false;
        return this;
    }

    public void m(int i10, Fragment fragment, String str, int i11) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            S0.c.f(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i12 = fragment.mFragmentId;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i10);
            }
            fragment.mFragmentId = i10;
            fragment.mContainerId = i10;
        }
        f(new a(i11, fragment));
    }

    public N n(Fragment fragment) {
        f(new a(3, fragment));
        return this;
    }

    public N o(int i10, Fragment fragment) {
        return p(i10, fragment, null);
    }

    public N p(int i10, Fragment fragment, String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        m(i10, fragment, str, 2);
        return this;
    }

    public N q(Runnable runnable) {
        return r(false, runnable);
    }

    public N r(boolean z10, Runnable runnable) {
        if (!z10) {
            l();
        }
        if (this.f20064s == null) {
            this.f20064s = new ArrayList();
        }
        this.f20064s.add(runnable);
        return this;
    }

    public N s(int i10, int i11) {
        return t(i10, i11, 0, 0);
    }

    public N t(int i10, int i11, int i12, int i13) {
        this.f20049d = i10;
        this.f20050e = i11;
        this.f20051f = i12;
        this.f20052g = i13;
        return this;
    }

    public N u(Fragment fragment, AbstractC2185j.b bVar) {
        f(new a(10, fragment, bVar));
        return this;
    }

    public N v(Fragment fragment) {
        f(new a(8, fragment));
        return this;
    }

    public N w(boolean z10) {
        this.f20063r = z10;
        return this;
    }

    public N x(int i10) {
        this.f20053h = i10;
        return this;
    }
}
