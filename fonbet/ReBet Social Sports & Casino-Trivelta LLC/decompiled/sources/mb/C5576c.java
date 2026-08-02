package mb;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: mb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5576c {

    /* renamed from: a, reason: collision with root package name */
    public final String f56437a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f56438b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f56439c;

    /* renamed from: d, reason: collision with root package name */
    public final int f56440d;

    /* renamed from: e, reason: collision with root package name */
    public final int f56441e;

    /* renamed from: f, reason: collision with root package name */
    public final g f56442f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f56443g;

    public static /* synthetic */ Object a(Object obj, InterfaceC5577d interfaceC5577d) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, InterfaceC5577d interfaceC5577d) {
        return obj;
    }

    public static b c(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b d(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static b e(D d10) {
        return new b(d10, new D[0]);
    }

    public static b f(D d10, D... dArr) {
        return new b(d10, dArr);
    }

    public static C5576c l(final Object obj, Class cls) {
        return m(cls).f(new g() { // from class: mb.a
            @Override // mb.g
            public final Object a(InterfaceC5577d interfaceC5577d) {
                return C5576c.b(obj, interfaceC5577d);
            }
        }).d();
    }

    public static b m(Class cls) {
        return c(cls).g();
    }

    public static C5576c q(final Object obj, Class cls, Class... clsArr) {
        return d(cls, clsArr).f(new g() { // from class: mb.b
            @Override // mb.g
            public final Object a(InterfaceC5577d interfaceC5577d) {
                return C5576c.a(obj, interfaceC5577d);
            }
        }).d();
    }

    public Set g() {
        return this.f56439c;
    }

    public g h() {
        return this.f56442f;
    }

    public String i() {
        return this.f56437a;
    }

    public Set j() {
        return this.f56438b;
    }

    public Set k() {
        return this.f56443g;
    }

    public boolean n() {
        return this.f56440d == 1;
    }

    public boolean o() {
        return this.f56440d == 2;
    }

    public boolean p() {
        return this.f56441e == 0;
    }

    public C5576c r(g gVar) {
        return new C5576c(this.f56437a, this.f56438b, this.f56439c, this.f56440d, this.f56441e, gVar, this.f56443g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f56438b.toArray()) + ">{" + this.f56440d + ", type=" + this.f56441e + ", deps=" + Arrays.toString(this.f56439c.toArray()) + "}";
    }

    /* renamed from: mb.c$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public String f56444a;

        /* renamed from: b, reason: collision with root package name */
        public final Set f56445b;

        /* renamed from: c, reason: collision with root package name */
        public final Set f56446c;

        /* renamed from: d, reason: collision with root package name */
        public int f56447d;

        /* renamed from: e, reason: collision with root package name */
        public int f56448e;

        /* renamed from: f, reason: collision with root package name */
        public g f56449f;

        /* renamed from: g, reason: collision with root package name */
        public final Set f56450g;

        public b b(q qVar) {
            AbstractC5573C.c(qVar, "Null dependency");
            j(qVar.b());
            this.f56446c.add(qVar);
            return this;
        }

        public b c() {
            return i(1);
        }

        public C5576c d() {
            AbstractC5573C.d(this.f56449f != null, "Missing required property: factory.");
            return new C5576c(this.f56444a, new HashSet(this.f56445b), new HashSet(this.f56446c), this.f56447d, this.f56448e, this.f56449f, this.f56450g);
        }

        public b e() {
            return i(2);
        }

        public b f(g gVar) {
            this.f56449f = (g) AbstractC5573C.c(gVar, "Null factory");
            return this;
        }

        public final b g() {
            this.f56448e = 1;
            return this;
        }

        public b h(String str) {
            this.f56444a = str;
            return this;
        }

        public final b i(int i10) {
            AbstractC5573C.d(this.f56447d == 0, "Instantiation type has already been set.");
            this.f56447d = i10;
            return this;
        }

        public final void j(D d10) {
            AbstractC5573C.a(!this.f56445b.contains(d10), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b(Class cls, Class... clsArr) {
            this.f56444a = null;
            HashSet hashSet = new HashSet();
            this.f56445b = hashSet;
            this.f56446c = new HashSet();
            this.f56447d = 0;
            this.f56448e = 0;
            this.f56450g = new HashSet();
            AbstractC5573C.c(cls, "Null interface");
            hashSet.add(D.b(cls));
            for (Class cls2 : clsArr) {
                AbstractC5573C.c(cls2, "Null interface");
                this.f56445b.add(D.b(cls2));
            }
        }

        public b(D d10, D... dArr) {
            this.f56444a = null;
            HashSet hashSet = new HashSet();
            this.f56445b = hashSet;
            this.f56446c = new HashSet();
            this.f56447d = 0;
            this.f56448e = 0;
            this.f56450g = new HashSet();
            AbstractC5573C.c(d10, "Null interface");
            hashSet.add(d10);
            for (D d11 : dArr) {
                AbstractC5573C.c(d11, "Null interface");
            }
            Collections.addAll(this.f56445b, dArr);
        }
    }

    public C5576c(String str, Set set, Set set2, int i10, int i11, g gVar, Set set3) {
        this.f56437a = str;
        this.f56438b = Collections.unmodifiableSet(set);
        this.f56439c = Collections.unmodifiableSet(set2);
        this.f56440d = i10;
        this.f56441e = i11;
        this.f56442f = gVar;
        this.f56443g = Collections.unmodifiableSet(set3);
    }
}
