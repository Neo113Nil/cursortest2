package nd;

import ed.C6347c;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.l;
import nd.X0;
import od.m;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9828T;
import td.InterfaceC9834Z;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9845k;

/* renamed from: nd.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8577z0 implements kotlin.reflect.l {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f77059f = {kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(C8577z0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(C8577z0.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC8504A<?> f77060a;

    /* renamed from: b, reason: collision with root package name */
    private final int f77061b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final l.a f77062c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final X0.a f77063d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final X0.a f77064e;

    /* renamed from: nd.z0$a */
    /* loaded from: classes10.dex */
    private static final class a implements Type {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Type[] f77065a;

        /* renamed from: b, reason: collision with root package name */
        private final int f77066b;

        public a(@NotNull Type[] types) {
            Intrinsics.checkNotNullParameter(types, "types");
            this.f77065a = types;
            this.f77066b = Arrays.hashCode(types);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Arrays.equals(this.f77065a, ((a) obj).f77065a);
            }
            return false;
        }

        @Override // java.lang.reflect.Type
        @NotNull
        public final String getTypeName() {
            return C7705l.P(this.f77065a, ", ", "[", "]", null, 56);
        }

        public final int hashCode() {
            return this.f77066b;
        }

        @NotNull
        public final String toString() {
            return getTypeName();
        }
    }

    public C8577z0(@NotNull AbstractC8504A<?> callable, int i11, @NotNull l.a kind, @NotNull Function0<? extends InterfaceC9828T> computeDescriptor) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(computeDescriptor, "computeDescriptor");
        this.f77060a = callable;
        this.f77061b = i11;
        this.f77062c = kind;
        this.f77063d = X0.a(null, computeDescriptor);
        this.f77064e = X0.a(null, new C8573x0(this));
    }

    static ArrayList b(C8577z0 c8577z0) {
        return g1.d(c8577z0.i());
    }

    static Type c(C8577z0 c8577z0) {
        List E02;
        InterfaceC9828T i11 = c8577z0.i();
        boolean z11 = i11 instanceof InterfaceC9834Z;
        AbstractC8504A<?> abstractC8504A = c8577z0.f77060a;
        if (z11 && Intrinsics.d(g1.g(abstractC8504A.t()), i11) && abstractC8504A.t().getKind() == InterfaceC9836b.a.FAKE_OVERRIDE) {
            InterfaceC9845k d11 = abstractC8504A.t().d();
            Intrinsics.g(d11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class<?> l11 = g1.l((InterfaceC9839e) d11);
            if (l11 != null) {
                return l11;
            }
            throw new V0("Cannot determine receiver Java type of inherited declaration: " + i11);
        }
        od.h<?> o11 = abstractC8504A.o();
        boolean z12 = o11 instanceof od.m;
        int i12 = c8577z0.f77061b;
        if (!z12) {
            if (!(o11 instanceof m.b)) {
                return o11.a().get(i12);
            }
            Class[] clsArr = (Class[]) ((Collection) ((m.b) o11).c().get(i12)).toArray(new Class[0]);
            Type[] typeArr = (Type[]) Arrays.copyOf(clsArr, clsArr.length);
            int length = typeArr.length;
            if (length != 0) {
                return length != 1 ? new a(typeArr) : (Type) C7705l.Y(typeArr);
            }
            throw new C6347c(0);
        }
        if (abstractC8504A.z()) {
            od.m mVar = (od.m) o11;
            IntRange c11 = mVar.c(i12 + 1);
            int f71843b = mVar.c(0).getF71843b() + 1;
            E02 = C7714v.E0(mVar.a(), new IntRange(c11.getF71842a() - f71843b, c11.getF71843b() - f71843b, 1));
        } else {
            od.m mVar2 = (od.m) o11;
            E02 = C7714v.E0(mVar2.a(), mVar2.c(i12));
        }
        Type[] typeArr2 = (Type[]) E02.toArray(new Type[0]);
        Type[] typeArr3 = (Type[]) Arrays.copyOf(typeArr2, typeArr2.length);
        int length2 = typeArr3.length;
        if (length2 != 0) {
            return length2 != 1 ? new a(typeArr3) : (Type) C7705l.Y(typeArr3);
        }
        throw new C6347c(0);
    }

    private final InterfaceC9828T i() {
        kotlin.reflect.m<Object> mVar = f77059f[0];
        Object invoke = this.f77063d.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
        return (InterfaceC9828T) invoke;
    }

    @Override // kotlin.reflect.l
    public final boolean a() {
        InterfaceC9828T i11 = i();
        return (i11 instanceof td.p0) && ((td.p0) i11).x0() != null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8577z0)) {
            return false;
        }
        C8577z0 c8577z0 = (C8577z0) obj;
        if (Intrinsics.d(this.f77060a, c8577z0.f77060a)) {
            return this.f77061b == c8577z0.f77061b;
        }
        return false;
    }

    @Override // kotlin.reflect.b
    @NotNull
    public final List<Annotation> getAnnotations() {
        kotlin.reflect.m<Object> mVar = f77059f[1];
        Object invoke = this.f77064e.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
        return (List) invoke;
    }

    @Override // kotlin.reflect.l
    public final int getIndex() {
        return this.f77061b;
    }

    @Override // kotlin.reflect.l
    @NotNull
    public final l.a getKind() {
        return this.f77062c;
    }

    @Override // kotlin.reflect.l
    public final String getName() {
        InterfaceC9828T i11 = i();
        td.p0 p0Var = i11 instanceof td.p0 ? (td.p0) i11 : null;
        if (p0Var != null && !p0Var.d().m0()) {
            Sd.f name = p0Var.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (!name.g()) {
                return name.b();
            }
        }
        return null;
    }

    @Override // kotlin.reflect.l
    @NotNull
    public final R0 getType() {
        je.N type = i().getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return new R0(type, new C8575y0(this));
    }

    @NotNull
    public final AbstractC8504A<?> h() {
        return this.f77060a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f77061b) + (this.f77060a.hashCode() * 31);
    }

    @Override // kotlin.reflect.l
    public final boolean j() {
        InterfaceC9828T i11 = i();
        td.p0 p0Var = i11 instanceof td.p0 ? (td.p0) i11 : null;
        if (p0Var != null) {
            return Zd.e.a(p0Var);
        }
        return false;
    }

    @NotNull
    public final String toString() {
        return b1.d(this);
    }
}
