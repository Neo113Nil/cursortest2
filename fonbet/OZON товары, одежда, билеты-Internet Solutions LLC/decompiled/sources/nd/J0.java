package nd;

import Cd.C2753n;
import Qd.C3856a;
import Rd.d;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7724f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.i;
import kotlin.reflect.m;
import ld.C7921b;
import md.C8128a;
import nd.AbstractC8556p;
import nd.X0;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9830V;
import td.InterfaceC9831W;
import td.InterfaceC9832X;
import td.InterfaceC9833Y;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9845k;
import wd.AbstractC10532s;

/* loaded from: classes.dex */
public abstract class J0<V> extends AbstractC8504A<V> implements kotlin.reflect.m<V> {

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private static final Object f76874m = new Object();

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final AbstractC8537f0 f76875g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f76876h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final String f76877i;

    /* renamed from: j, reason: collision with root package name */
    private final Object f76878j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Object f76879k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final X0.a<InterfaceC9831W> f76880l;

    public static abstract class a<PropertyType, ReturnType> extends AbstractC8504A<ReturnType> implements kotlin.reflect.h<ReturnType>, m.a<PropertyType> {
        @NotNull
        public abstract InterfaceC9830V C();

        @NotNull
        public abstract J0<PropertyType> D();

        @Override // kotlin.reflect.h
        public final boolean isExternal() {
            return C().isExternal();
        }

        @Override // kotlin.reflect.h
        public final boolean isInfix() {
            return C().isInfix();
        }

        @Override // kotlin.reflect.h
        public final boolean isInline() {
            return C().isInline();
        }

        @Override // kotlin.reflect.h
        public final boolean isOperator() {
            return C().isOperator();
        }

        @Override // kotlin.reflect.c
        public final boolean isSuspend() {
            return C().isSuspend();
        }

        @Override // nd.AbstractC8504A
        @NotNull
        public final AbstractC8537f0 q() {
            return D().q();
        }

        @Override // nd.AbstractC8504A
        public final od.h<?> r() {
            return null;
        }

        @Override // nd.AbstractC8504A
        public final boolean z() {
            return D().z();
        }
    }

    public static abstract class b<V> extends a<V, V> implements m.b<V> {

        /* renamed from: i, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.m<Object>[] f76881i = {kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(b.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private final X0.a f76882g = X0.a(null, new C8562s(this, 1));

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        private final Object f76883h = Sc.k.a(Sc.n.PUBLICATION, new C8564t(this, 1));

        @Override // nd.J0.a
        public final InterfaceC9830V C() {
            kotlin.reflect.m<Object> mVar = f76881i[0];
            Object invoke = this.f76882g.invoke();
            Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
            return (InterfaceC9832X) invoke;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof b) && Intrinsics.d(D(), ((b) obj).D());
        }

        @Override // kotlin.reflect.c
        @NotNull
        public final String getName() {
            return "<get-" + D().getName() + '>';
        }

        public final int hashCode() {
            return D().hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // nd.AbstractC8504A
        @NotNull
        public final od.h<?> o() {
            return (od.h) this.f76883h.getValue();
        }

        @Override // nd.AbstractC8504A
        public final InterfaceC9836b t() {
            kotlin.reflect.m<Object> mVar = f76881i[0];
            Object invoke = this.f76882g.invoke();
            Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
            return (InterfaceC9832X) invoke;
        }

        @NotNull
        public final String toString() {
            return "getter of " + D();
        }
    }

    /* loaded from: classes10.dex */
    public static abstract class c<V> extends a<V, Unit> implements i.a<V> {

        /* renamed from: i, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.m<Object>[] f76884i = {kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(c.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private final X0.a f76885g = X0.a(null, new K0(this));

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        private final Object f76886h = Sc.k.a(Sc.n.PUBLICATION, new L0(this));

        @Override // nd.J0.a
        public final InterfaceC9830V C() {
            kotlin.reflect.m<Object> mVar = f76884i[0];
            Object invoke = this.f76885g.invoke();
            Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
            return (InterfaceC9833Y) invoke;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof c) && Intrinsics.d(D(), ((c) obj).D());
        }

        @Override // kotlin.reflect.c
        @NotNull
        public final String getName() {
            return "<set-" + D().getName() + '>';
        }

        public final int hashCode() {
            return D().hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // nd.AbstractC8504A
        @NotNull
        public final od.h<?> o() {
            return (od.h) this.f76886h.getValue();
        }

        @Override // nd.AbstractC8504A
        public final InterfaceC9836b t() {
            kotlin.reflect.m<Object> mVar = f76884i[0];
            Object invoke = this.f76885g.invoke();
            Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
            return (InterfaceC9833Y) invoke;
        }

        @NotNull
        public final String toString() {
            return "setter of " + D();
        }
    }

    private J0(AbstractC8537f0 abstractC8537f0, String str, String str2, wd.Q q11, Object obj) {
        this.f76875g = abstractC8537f0;
        this.f76876h = str;
        this.f76877i = str2;
        this.f76878j = obj;
        this.f76879k = Sc.k.a(Sc.n.PUBLICATION, new C8558q(this, 1));
        X0.a<InterfaceC9831W> a11 = X0.a(q11, new C8560r(this, 1));
        Intrinsics.checkNotNullExpressionValue(a11, "lazySoft(...)");
        this.f76880l = a11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static Field C(J0 j02) {
        Class<?> enclosingClass;
        int i11 = c1.f76958b;
        AbstractC8556p c11 = c1.c(j02.t());
        if (!(c11 instanceof AbstractC8556p.c)) {
            if (c11 instanceof AbstractC8556p.a) {
                return ((AbstractC8556p.a) c11).b();
            }
            if ((c11 instanceof AbstractC8556p.b) || (c11 instanceof AbstractC8556p.d)) {
                return null;
            }
            throw new Sc.o();
        }
        AbstractC8556p.c cVar = (AbstractC8556p.c) c11;
        InterfaceC9831W b11 = cVar.b();
        int i12 = Rd.h.f25024b;
        d.a c12 = Rd.h.c(cVar.d(), cVar.c(), cVar.f(), true);
        if (c12 == null) {
            return null;
        }
        boolean b12 = C2753n.b(b11);
        AbstractC8537f0 abstractC8537f0 = j02.f76875g;
        if (b12 || Rd.h.e(cVar.d())) {
            enclosingClass = abstractC8537f0.c().getEnclosingClass();
        } else {
            InterfaceC9845k d11 = ((AbstractC10532s) b11).d();
            enclosingClass = d11 instanceof InterfaceC9839e ? g1.l((InterfaceC9839e) d11) : abstractC8537f0.c();
        }
        if (enclosingClass == null) {
            return null;
        }
        try {
            return enclosingClass.getDeclaredField(c12.e());
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    static InterfaceC9831W D(J0 j02) {
        return j02.f76875g.r(j02.f76876h, j02.f76877i);
    }

    protected final Member E() {
        if (!t().Y()) {
            return null;
        }
        int i11 = c1.f76958b;
        AbstractC8556p c11 = c1.c(t());
        if (c11 instanceof AbstractC8556p.c) {
            AbstractC8556p.c cVar = (AbstractC8556p.c) c11;
            if (cVar.e().y()) {
                C3856a.b n11 = cVar.e().n();
                if (!n11.n() || !n11.m()) {
                    return null;
                }
                return this.f76875g.q(cVar.c().getString(n11.l()), cVar.c().getString(n11.j()));
            }
        }
        return J();
    }

    public final Object F() {
        return od.n.c(this.f76878j, t());
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final Object G(Member member) {
        try {
            Object obj = f76874m;
            Object F11 = z() ? F() : null;
            if (F11 == obj) {
                F11 = null;
            }
            z();
            AccessibleObject accessibleObject = member != 0 ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(C8128a.a(this));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(F11);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, new Object[0]);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (F11 == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    Intrinsics.checkNotNullExpressionValue(cls, "get(...)");
                    F11 = g1.e(cls);
                }
                return method.invoke(null, F11);
            }
            if (length == 2) {
                Method method2 = (Method) member;
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                Intrinsics.checkNotNullExpressionValue(cls2, "get(...)");
                return method2.invoke(null, F11, g1.e(cls2));
            }
            throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
        } catch (IllegalAccessException e11) {
            throw new C7921b(e11);
        }
    }

    @Override // nd.AbstractC8504A
    @NotNull
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final InterfaceC9831W t() {
        InterfaceC9831W invoke = this.f76880l.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "invoke(...)");
        return invoke;
    }

    @NotNull
    public abstract b<V> I();

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final Field J() {
        return (Field) this.f76879k.getValue();
    }

    @NotNull
    public final String K() {
        return this.f76877i;
    }

    public final boolean equals(Object obj) {
        J0<?> c11 = g1.c(obj);
        return c11 != null && Intrinsics.d(this.f76875g, c11.f76875g) && Intrinsics.d(this.f76876h, c11.f76876h) && Intrinsics.d(this.f76877i, c11.f76877i) && Intrinsics.d(this.f76878j, c11.f76878j);
    }

    @Override // kotlin.reflect.c
    @NotNull
    public final String getName() {
        return this.f76876h;
    }

    public final int hashCode() {
        return this.f76877i.hashCode() + G.g.a(this.f76875g.hashCode() * 31, 31, this.f76876h);
    }

    @Override // kotlin.reflect.c
    public final boolean isSuspend() {
        return false;
    }

    @Override // nd.AbstractC8504A
    @NotNull
    public final od.h<?> o() {
        return I().o();
    }

    @Override // nd.AbstractC8504A
    @NotNull
    public final AbstractC8537f0 q() {
        return this.f76875g;
    }

    @Override // nd.AbstractC8504A
    public final od.h<?> r() {
        I().getClass();
        return null;
    }

    @NotNull
    public final String toString() {
        int i11 = b1.f76953b;
        return b1.e(t());
    }

    @Override // nd.AbstractC8504A
    public final boolean z() {
        return this.f76878j != AbstractC7724f.NO_RECEIVER;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public J0(@NotNull AbstractC8537f0 container, @NotNull String name, @NotNull String signature, Object obj) {
        this(container, name, signature, null, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public J0(@NotNull AbstractC8537f0 container, @NotNull wd.Q descriptor) {
        this(container, r3, c1.c(descriptor).a(), descriptor, AbstractC7724f.NO_RECEIVER);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String b11 = descriptor.getName().b();
        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
    }
}
