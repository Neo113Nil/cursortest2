package n8;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: n8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8451a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f76560a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<w<? super T>> f76561b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<n> f76562c;

    /* renamed from: d, reason: collision with root package name */
    private final int f76563d;

    /* renamed from: e, reason: collision with root package name */
    private final int f76564e;

    /* renamed from: f, reason: collision with root package name */
    private final e<T> f76565f;

    /* renamed from: g, reason: collision with root package name */
    private final Set<Class<?>> f76566g;

    /* synthetic */ C8451a(String str, HashSet hashSet, HashSet hashSet2, int i11, int i12, e eVar, HashSet hashSet3) {
        this(str, hashSet, (Set<n>) hashSet2, i11, i12, eVar, (Set<Class<?>>) hashSet3);
    }

    public static <T> C1292a<T> a(Class<T> cls) {
        return new C1292a<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> C1292a<T> b(Class<T> cls, Class<? super T>... clsArr) {
        return new C1292a<>(cls, clsArr);
    }

    public static <T> C1292a<T> c(w<T> wVar) {
        return new C1292a<>(wVar, new w[0]);
    }

    @SafeVarargs
    public static <T> C1292a<T> d(w<T> wVar, w<? super T>... wVarArr) {
        return new C1292a<>(wVar, wVarArr);
    }

    public static <T> C1292a<T> j(Class<T> cls) {
        C1292a<T> a11 = a(cls);
        C1292a.a(a11);
        return a11;
    }

    @SafeVarargs
    public static <T> C8451a<T> n(T t2, Class<T> cls, Class<? super T>... clsArr) {
        C1292a c1292a = new C1292a(cls, clsArr);
        c1292a.f(new Uy.a(t2));
        return c1292a.d();
    }

    public final Set<n> e() {
        return this.f76562c;
    }

    public final e<T> f() {
        return this.f76565f;
    }

    public final String g() {
        return this.f76560a;
    }

    public final Set<w<? super T>> h() {
        return this.f76561b;
    }

    public final Set<Class<?>> i() {
        return this.f76566g;
    }

    public final boolean k() {
        return this.f76563d == 1;
    }

    public final boolean l() {
        return this.f76563d == 2;
    }

    public final boolean m() {
        return this.f76564e == 0;
    }

    public final C8451a o(I8.a aVar) {
        return new C8451a(this.f76560a, this.f76561b, this.f76562c, this.f76563d, this.f76564e, aVar, this.f76566g);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f76561b.toArray()) + ">{" + this.f76563d + ", type=" + this.f76564e + ", deps=" + Arrays.toString(this.f76562c.toArray()) + "}";
    }

    private C8451a(String str, Set<w<? super T>> set, Set<n> set2, int i11, int i12, e<T> eVar, Set<Class<?>> set3) {
        this.f76560a = str;
        this.f76561b = Collections.unmodifiableSet(set);
        this.f76562c = Collections.unmodifiableSet(set2);
        this.f76563d = i11;
        this.f76564e = i12;
        this.f76565f = eVar;
        this.f76566g = Collections.unmodifiableSet(set3);
    }

    /* renamed from: n8.a$a, reason: collision with other inner class name */
    public static class C1292a<T> {

        /* renamed from: a, reason: collision with root package name */
        private String f76567a = null;

        /* renamed from: b, reason: collision with root package name */
        private final HashSet f76568b;

        /* renamed from: c, reason: collision with root package name */
        private final HashSet f76569c;

        /* renamed from: d, reason: collision with root package name */
        private int f76570d;

        /* renamed from: e, reason: collision with root package name */
        private int f76571e;

        /* renamed from: f, reason: collision with root package name */
        private e<T> f76572f;

        /* renamed from: g, reason: collision with root package name */
        private final HashSet f76573g;

        C1292a(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.f76568b = hashSet;
            this.f76569c = new HashSet();
            this.f76570d = 0;
            this.f76571e = 0;
            this.f76573g = new HashSet();
            hashSet.add(w.a(cls));
            for (Class cls2 : clsArr) {
                Hj0.r.a(cls2, "Null interface");
                this.f76568b.add(w.a(cls2));
            }
        }

        static void a(C1292a c1292a) {
            c1292a.f76571e = 1;
        }

        public final void b(n nVar) {
            if (this.f76568b.contains(nVar.a())) {
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            this.f76569c.add(nVar);
        }

        public final void c() {
            if (this.f76570d != 0) {
                throw new IllegalStateException("Instantiation type has already been set.");
            }
            this.f76570d = 1;
        }

        public final C8451a<T> d() {
            if (this.f76572f != null) {
                return new C8451a<>(this.f76567a, new HashSet(this.f76568b), new HashSet(this.f76569c), this.f76570d, this.f76571e, (e) this.f76572f, this.f76573g);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public final void e() {
            if (this.f76570d != 0) {
                throw new IllegalStateException("Instantiation type has already been set.");
            }
            this.f76570d = 2;
        }

        public final void f(e eVar) {
            this.f76572f = eVar;
        }

        public final void g(@NonNull String str) {
            this.f76567a = str;
        }

        C1292a(w wVar, w[] wVarArr) {
            HashSet hashSet = new HashSet();
            this.f76568b = hashSet;
            this.f76569c = new HashSet();
            this.f76570d = 0;
            this.f76571e = 0;
            this.f76573g = new HashSet();
            hashSet.add(wVar);
            for (w wVar2 : wVarArr) {
                Hj0.r.a(wVar2, "Null interface");
            }
            Collections.addAll(this.f76568b, wVarArr);
        }
    }
}
