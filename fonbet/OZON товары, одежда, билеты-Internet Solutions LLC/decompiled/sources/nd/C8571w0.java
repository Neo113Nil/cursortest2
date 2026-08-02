package nd;

import Qd.C3856a;
import Td.h;
import ce.l;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7734p;
import kotlin.jvm.internal.Intrinsics;
import nd.AbstractC8537f0;
import nd.X0;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9831W;
import td.InterfaceC9844j;
import td.InterfaceC9857w;
import zd.C11104f;

/* renamed from: nd.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8571w0 extends AbstractC8537f0 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Class<?> f77045c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f77046d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nd.w0$a */
    /* loaded from: classes10.dex */
    final class a extends AbstractC8537f0.a {

        /* renamed from: g, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.m<Object>[] f77047g = {kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(a.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(a.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(a.class), "members", "getMembers()Ljava/util/Collection;"))};

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final X0.a f77048c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final X0.a f77049d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final Object f77050e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final Object f77051f;

        public a(C8571w0 c8571w0) {
            super(c8571w0);
            this.f77048c = X0.a(null, new C8561r0(c8571w0));
            this.f77049d = X0.a(null, new C8563s0(this));
            Sc.n nVar = Sc.n.PUBLICATION;
            this.f77050e = Sc.k.a(nVar, new C8565t0(this, c8571w0));
            this.f77051f = Sc.k.a(nVar, new C8567u0(this));
            X0.a(null, new C8569v0(this, c8571w0));
        }

        static ce.l b(a aVar) {
            aVar.getClass();
            kotlin.reflect.m<Object> mVar = f77047g[0];
            yd.f fVar = (yd.f) aVar.f77048c.invoke();
            return fVar != null ? aVar.a().c().a(fVar) : l.b.f57046b;
        }

        static Class c(a aVar, C8571w0 c8571w0) {
            Md.a a11;
            aVar.getClass();
            kotlin.reflect.m<Object> mVar = f77047g[0];
            yd.f fVar = (yd.f) aVar.f77048c.invoke();
            String e11 = (fVar == null || (a11 = fVar.a()) == null) ? null : a11.e();
            if (e11 == null || e11.length() <= 0) {
                return null;
            }
            return c8571w0.c().getClassLoader().loadClass(kotlin.text.h.Y(e11, '/', '.'));
        }

        static Sc.v d(a aVar) {
            Md.a a11;
            aVar.getClass();
            kotlin.reflect.m<Object> mVar = f77047g[0];
            yd.f fVar = (yd.f) aVar.f77048c.invoke();
            if (fVar == null || (a11 = fVar.a()) == null) {
                return null;
            }
            String[] a12 = a11.a();
            String[] g10 = a11.g();
            if (a12 == null || g10 == null) {
                return null;
            }
            Pair<Rd.f, Nd.k> j11 = Rd.h.j(a12, g10);
            return new Sc.v(j11.a(), j11.b(), a11.d());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        public final Sc.v<Rd.f, Nd.k, Rd.e> e() {
            return (Sc.v) this.f77051f.getValue();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        public final Class<?> f() {
            return (Class) this.f77050e.getValue();
        }

        @NotNull
        public final ce.l g() {
            kotlin.reflect.m<Object> mVar = f77047g[1];
            Object invoke = this.f77049d.invoke();
            Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
            return (ce.l) invoke;
        }
    }

    /* renamed from: nd.w0$b */
    /* loaded from: classes10.dex */
    /* synthetic */ class b extends C7734p implements Function2<fe.K, Nd.m, InterfaceC9831W> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f77052a = new b(2);

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

    public C8571w0(@NotNull Class<?> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f77045c = jClass;
        this.f77046d = Sc.k.a(Sc.n.PUBLICATION, new C8559q0(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // nd.AbstractC8537f0
    @NotNull
    protected final Class<?> C() {
        Class<?> f7 = ((a) this.f77046d.getValue()).f();
        return f7 == null ? this.f77045c : f7;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    @Override // nd.AbstractC8537f0
    @NotNull
    public final Collection<InterfaceC9831W> D(@NotNull Sd.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return ((a) this.f77046d.getValue()).g().b(name, Bd.c.FROM_REFLECTION);
    }

    @Override // kotlin.jvm.internal.InterfaceC7726h
    @NotNull
    public final Class<?> c() {
        return this.f77045c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8571w0) {
            return Intrinsics.d(this.f77045c, ((C8571w0) obj).f77045c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f77045c.hashCode();
    }

    @Override // nd.AbstractC8537f0
    @NotNull
    public final Collection<InterfaceC9844j> t() {
        return kotlin.collections.K.f71697a;
    }

    @NotNull
    public final String toString() {
        return "file class " + C11104f.a(this.f77045c).a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    @Override // nd.AbstractC8537f0
    @NotNull
    public final Collection<InterfaceC9857w> w(@NotNull Sd.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return ((a) this.f77046d.getValue()).g().g(name, Bd.c.FROM_REFLECTION);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // nd.AbstractC8537f0
    public final InterfaceC9831W x(int i11) {
        Sc.v<Rd.f, Nd.k, Rd.e> e11 = ((a) this.f77046d.getValue()).e();
        if (e11 != null) {
            Rd.f a11 = e11.a();
            Nd.k b11 = e11.b();
            Rd.e d11 = e11.d();
            h.f<Nd.k, List<Nd.m>> extension = C3856a.f23245n;
            Intrinsics.checkNotNullExpressionValue(extension, "packageLocalVariable");
            Intrinsics.checkNotNullParameter(b11, "<this>");
            Intrinsics.checkNotNullParameter(extension, "extension");
            Nd.m mVar = (Nd.m) (i11 < b11.j(extension) ? b11.i(extension, i11) : null);
            if (mVar != null) {
                Nd.s L11 = b11.L();
                Intrinsics.checkNotNullExpressionValue(L11, "getTypeTable(...)");
                return (InterfaceC9831W) g1.f(this.f77045c, mVar, a11, new Pd.g(L11), d11, b.f77052a);
            }
        }
        return null;
    }
}
