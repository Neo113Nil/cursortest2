package nd;

import Md.a;
import Qd.C3856a;
import Sc.InterfaceC4008j;
import Td.h;
import ed.C6345a;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7734p;
import kotlin.jvm.internal.Intrinsics;
import nd.AbstractC8537f0;
import nd.X0;
import org.jetbrains.annotations.NotNull;
import td.EnumC9812C;
import td.EnumC9840f;
import td.InterfaceC9831W;
import td.InterfaceC9838d;
import td.InterfaceC9839e;
import td.InterfaceC9844j;
import td.InterfaceC9857w;
import wd.C10530p;
import wd.C10533t;
import yd.f;
import zd.C11104f;

/* loaded from: classes.dex */
public final class X<T> extends AbstractC8537f0 implements kotlin.reflect.d<T>, Z, U0 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Class<T> f76927c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f76928d;

    public final class a extends AbstractC8537f0.a {

        /* renamed from: p, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.m<Object>[] f76929p = {kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(a.class), "annotations", "getAnnotations()Ljava/util/List;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(a.class), "simpleName", "getSimpleName()Ljava/lang/String;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(a.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(a.class), "constructors", "getConstructors()Ljava/util/Collection;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(a.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(a.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(a.class), "supertypes", "getSupertypes()Ljava/util/List;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(a.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(a.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(a.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(a.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(a.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(a.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(a.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(a.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(a.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final X0.a f76930c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final X0.a f76931d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final X0.a f76932e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final X0.a f76933f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private final X0.a f76934g;

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        private final Object f76935h;

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        private final X0.a f76936i;

        /* renamed from: j, reason: collision with root package name */
        @NotNull
        private final X0.a f76937j;

        /* renamed from: k, reason: collision with root package name */
        @NotNull
        private final X0.a f76938k;

        /* renamed from: l, reason: collision with root package name */
        @NotNull
        private final X0.a f76939l;

        /* renamed from: m, reason: collision with root package name */
        @NotNull
        private final X0.a f76940m;

        /* renamed from: n, reason: collision with root package name */
        @NotNull
        private final X0.a f76941n;

        /* renamed from: o, reason: collision with root package name */
        @NotNull
        private final X0.a f76942o;

        public a(X x11) {
            super(x11);
            this.f76930c = X0.a(null, new C8506C(x11));
            this.f76931d = X0.a(null, new C8517N(this));
            this.f76932e = X0.a(null, new C8518O(this, x11));
            this.f76933f = X0.a(null, new C8519P(x11));
            this.f76934g = X0.a(null, new C8520Q(x11));
            X0.a(null, new C8521S(this));
            this.f76935h = Sc.k.a(Sc.n.PUBLICATION, new C8522T(this, x11));
            X0.a(null, new C8523U(this, x11));
            X0.a(null, new C8524V(this, x11));
            this.f76936i = X0.a(null, new C8525W(this));
            this.f76937j = X0.a(null, new C8507D(x11));
            this.f76938k = X0.a(null, new C8508E(x11));
            this.f76939l = X0.a(null, new C8509F(x11));
            this.f76940m = X0.a(null, new C8510G(x11));
            this.f76941n = X0.a(null, new C8511H(this));
            this.f76942o = X0.a(null, new C8512I(this));
            X0.a(null, new C8513J(this));
            X0.a(null, new C8514K(this));
        }

        static ArrayList b(a aVar) {
            Collection<AbstractC8504A<?>> i11 = aVar.i();
            kotlin.reflect.m<Object> mVar = f76929p[11];
            Object invoke = aVar.f76939l.invoke();
            Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
            return C7714v.p0((Collection) invoke, i11);
        }

        static ArrayList c(a aVar) {
            aVar.getClass();
            kotlin.reflect.m<Object>[] mVarArr = f76929p;
            kotlin.reflect.m<Object> mVar = mVarArr[10];
            Object invoke = aVar.f76938k.invoke();
            Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
            kotlin.reflect.m<Object> mVar2 = mVarArr[12];
            Object invoke2 = aVar.f76940m.invoke();
            Intrinsics.checkNotNullExpressionValue(invoke2, "getValue(...)");
            return C7714v.p0((Collection) invoke2, (Collection) invoke);
        }

        static ArrayList d(a aVar) {
            Collection<AbstractC8504A<?>> i11 = aVar.i();
            kotlin.reflect.m<Object> mVar = f76929p[10];
            Object invoke = aVar.f76938k.invoke();
            Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
            return C7714v.p0((Collection) invoke, i11);
        }

        static ArrayList e(a aVar) {
            Collection<AbstractC8504A<?>> f7 = aVar.f();
            kotlin.reflect.m<Object> mVar = f76929p[14];
            Object invoke = aVar.f76942o.invoke();
            Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
            return C7714v.p0((Collection) invoke, f7);
        }

        @NotNull
        public final Collection<AbstractC8504A<?>> f() {
            kotlin.reflect.m<Object> mVar = f76929p[13];
            Object invoke = this.f76941n.invoke();
            Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
            return (Collection) invoke;
        }

        @NotNull
        public final List<Annotation> g() {
            kotlin.reflect.m<Object> mVar = f76929p[1];
            Object invoke = this.f76931d.invoke();
            Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
            return (List) invoke;
        }

        @NotNull
        public final Collection<kotlin.reflect.h<T>> h() {
            kotlin.reflect.m<Object> mVar = f76929p[4];
            Object invoke = this.f76934g.invoke();
            Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
            return (Collection) invoke;
        }

        @NotNull
        public final Collection<AbstractC8504A<?>> i() {
            kotlin.reflect.m<Object> mVar = f76929p[9];
            Object invoke = this.f76937j.invoke();
            Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
            return (Collection) invoke;
        }

        @NotNull
        public final InterfaceC9839e j() {
            kotlin.reflect.m<Object> mVar = f76929p[0];
            Object invoke = this.f76930c.invoke();
            Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
            return (InterfaceC9839e) invoke;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        public final T k() {
            return (T) this.f76935h.getValue();
        }

        public final String l() {
            kotlin.reflect.m<Object> mVar = f76929p[3];
            return (String) this.f76933f.invoke();
        }

        @NotNull
        public final List<kotlin.reflect.d<? extends T>> m() {
            kotlin.reflect.m<Object> mVar = f76929p[8];
            Object invoke = this.f76936i.invoke();
            Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
            return (List) invoke;
        }

        public final String n() {
            kotlin.reflect.m<Object> mVar = f76929p[2];
            return (String) this.f76932e.invoke();
        }
    }

    /* loaded from: classes10.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76943a;

        static {
            int[] iArr = new int[a.EnumC0345a.values().length];
            try {
                iArr[a.EnumC0345a.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC0345a.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.EnumC0345a.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.EnumC0345a.SYNTHETIC_CLASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.EnumC0345a.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.EnumC0345a.CLASS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f76943a = iArr;
        }
    }

    /* loaded from: classes10.dex */
    /* synthetic */ class c extends C7734p implements Function2<fe.K, Nd.m, InterfaceC9831W> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f76944a = new c(2);

        @Override // kotlin.jvm.internal.AbstractC7724f, kotlin.reflect.c
        public final String getName() {
            return "loadProperty";
        }

        @Override // kotlin.jvm.internal.AbstractC7724f
        public final kotlin.reflect.g getOwner() {
            return kotlin.jvm.internal.N.b(fe.K.class);
        }

        @Override // kotlin.jvm.internal.AbstractC7724f
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        @Override // kotlin.jvm.functions.Function2
        public final InterfaceC9831W invoke(fe.K k11, Nd.m mVar) {
            fe.K p02 = k11;
            Nd.m p12 = mVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return p02.n(p12);
        }
    }

    public X(@NotNull Class<T> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f76927c = jClass;
        this.f76928d = Sc.k.a(Sc.n.PUBLICATION, new C8505B(this));
    }

    public static final C10530p J(X x11, Sd.b bVar, yd.j jVar) {
        Md.a a11;
        Class<T> cls = x11.f76927c;
        if (cls.isSynthetic()) {
            return L(bVar, jVar);
        }
        yd.f a12 = f.a.a(cls);
        a.EnumC0345a c11 = (a12 == null || (a11 = a12.a()) == null) ? null : a11.c();
        switch (c11 == null ? -1 : b.f76943a[c11.ordinal()]) {
            case -1:
            case 6:
                throw new V0("Unresolved class: " + cls + " (kind = " + c11 + ')');
            case 0:
            default:
                throw new Sc.o();
            case 1:
            case 2:
            case 3:
            case 4:
                return L(bVar, jVar);
            case 5:
                throw new V0("Unknown class: " + cls + " (kind = " + c11 + ')');
        }
    }

    public static final Sd.b K(X x11) {
        x11.getClass();
        int i11 = c1.f76958b;
        return c1.a(x11.f76927c);
    }

    private static C10530p L(Sd.b bVar, yd.j jVar) {
        C10530p c10530p = new C10530p(new C10533t(jVar.b(), bVar.f()), bVar.h(), EnumC9812C.FINAL, EnumC9840f.CLASS, C7714v.a0(jVar.b().n().h().q()), jVar.a().u());
        c10530p.F0(new Y(c10530p, jVar.a().u()), kotlin.collections.M.f71699a, null);
        return c10530p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.d
    public final boolean A(Object obj) {
        Class cls = this.f76927c;
        Integer c11 = C11104f.c(cls);
        if (c11 != null) {
            return kotlin.jvm.internal.U.h(c11.intValue(), obj);
        }
        Class g10 = C11104f.g(cls);
        if (g10 != null) {
            cls = g10;
        }
        return cls.isInstance(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.reflect.d
    public final String B() {
        return ((a) this.f76928d.getValue()).n();
    }

    @Override // nd.AbstractC8537f0
    @NotNull
    public final Collection<InterfaceC9831W> D(@NotNull Sd.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ce.l p11 = b().q().p();
        Bd.c cVar = Bd.c.FROM_REFLECTION;
        Collection b11 = p11.b(name, cVar);
        ce.l q02 = b().q0();
        Intrinsics.checkNotNullExpressionValue(q02, "getStaticScope(...)");
        return C7714v.p0(q02.b(name, cVar), b11);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final Collection<kotlin.reflect.h<T>> M() {
        return ((a) this.f76928d.getValue()).h();
    }

    @NotNull
    public final InterfaceC4008j<X<T>.a> N() {
        return (InterfaceC4008j<X<T>.a>) this.f76928d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // nd.Z
    @NotNull
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final InterfaceC9839e b() {
        return ((a) this.f76928d.getValue()).j();
    }

    @Override // kotlin.jvm.internal.InterfaceC7726h
    @NotNull
    public final Class<T> c() {
        return this.f76927c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof X) && C6345a.c(this).equals(C6345a.c((kotlin.reflect.d) obj));
    }

    @Override // kotlin.reflect.d
    public final boolean g() {
        return b().g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.reflect.b
    @NotNull
    public final List<Annotation> getAnnotations() {
        return ((a) this.f76928d.getValue()).g();
    }

    @Override // kotlin.reflect.d
    public final int hashCode() {
        return C6345a.c(this).hashCode();
    }

    @Override // kotlin.reflect.d
    public final boolean isAbstract() {
        return b().h() == EnumC9812C.ABSTRACT;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.reflect.d
    @NotNull
    public final List<kotlin.reflect.d<? extends T>> m() {
        return ((a) this.f76928d.getValue()).m();
    }

    @Override // kotlin.reflect.d
    public final boolean n() {
        return b().h() == EnumC9812C.SEALED;
    }

    @Override // kotlin.reflect.d
    public final boolean s() {
        return b().s();
    }

    @Override // nd.AbstractC8537f0
    @NotNull
    public final Collection<InterfaceC9844j> t() {
        InterfaceC9839e b11 = b();
        if (b11.getKind() == EnumC9840f.INTERFACE || b11.getKind() == EnumC9840f.OBJECT) {
            return kotlin.collections.K.f71697a;
        }
        Collection<InterfaceC9838d> l11 = b11.l();
        Intrinsics.checkNotNullExpressionValue(l11, "getConstructors(...)");
        return l11;
    }

    @NotNull
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("class ");
        int i11 = c1.f76958b;
        Sd.b a11 = c1.a(this.f76927c);
        Sd.c f7 = a11.f();
        if (f7.d()) {
            str = "";
        } else {
            str = f7.b() + '.';
        }
        String b11 = a11.g().b();
        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
        sb2.append(str + kotlin.text.h.Y(b11, '.', '$'));
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.reflect.d
    public final String u() {
        return ((a) this.f76928d.getValue()).l();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // kotlin.reflect.d
    public final T v() {
        return (T) ((a) this.f76928d.getValue()).k();
    }

    @Override // nd.AbstractC8537f0
    @NotNull
    public final Collection<InterfaceC9857w> w(@NotNull Sd.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ce.l p11 = b().q().p();
        Bd.c cVar = Bd.c.FROM_REFLECTION;
        Collection<? extends td.c0> g10 = p11.g(name, cVar);
        ce.l q02 = b().q0();
        Intrinsics.checkNotNullExpressionValue(q02, "getStaticScope(...)");
        return C7714v.p0(q02.g(name, cVar), g10);
    }

    @Override // nd.AbstractC8537f0
    public final InterfaceC9831W x(int i11) {
        Class<?> declaringClass;
        Class<T> cls = this.f76927c;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            Intrinsics.checkNotNullParameter(declaringClass, "<this>");
            return ((X) kotlin.jvm.internal.N.b(declaringClass)).x(i11);
        }
        InterfaceC9839e b11 = b();
        he.n nVar = b11 instanceof he.n ? (he.n) b11 : null;
        if (nVar != null) {
            Nd.b Q02 = nVar.Q0();
            h.f<Nd.b, List<Nd.m>> extension = C3856a.f23241j;
            Intrinsics.checkNotNullExpressionValue(extension, "classLocalVariable");
            Intrinsics.checkNotNullParameter(Q02, "<this>");
            Intrinsics.checkNotNullParameter(extension, "extension");
            Nd.m mVar = (Nd.m) (i11 < Q02.j(extension) ? Q02.i(extension, i11) : null);
            if (mVar != null) {
                return (InterfaceC9831W) g1.f(this.f76927c, mVar, nVar.P0().g(), nVar.P0().j(), nVar.S0(), c.f76944a);
            }
        }
        return null;
    }
}
