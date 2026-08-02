package nd;

import Sc.InterfaceC4008j;
import ed.C6345a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import je.C7363H;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InterfaceC7736s;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import md.C8129b;
import nd.X0;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import zd.C11104f;

/* loaded from: classes.dex */
public final class R0 implements InterfaceC7736s {

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f76906e = {kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(R0.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(R0.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final je.N f76907a;

    /* renamed from: b, reason: collision with root package name */
    private final X0.a<Type> f76908b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final X0.a f76909c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final X0.a f76910d;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76911a;

        static {
            int[] iArr = new int[je.L0.values().length];
            try {
                iArr[je.L0.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[je.L0.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[je.L0.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f76911a = iArr;
        }
    }

    public R0(@NotNull je.N type, Function0<? extends Type> function0) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f76907a = type;
        X0.a<Type> aVar = function0 instanceof X0.a ? (X0.a) function0 : null;
        this.f76908b = aVar == null ? function0 != null ? X0.a(null, function0) : null : aVar;
        this.f76909c = X0.a(null, new N0(this));
        this.f76910d = X0.a(null, new O0(this, function0));
    }

    static kotlin.reflect.f b(R0 r02) {
        return r02.h(r02.f76907a);
    }

    static List c(R0 r02, Function0 function0) {
        KTypeProjection kTypeProjection;
        List<je.y0> F02 = r02.f76907a.F0();
        if (F02.isEmpty()) {
            return kotlin.collections.K.f71697a;
        }
        InterfaceC4008j a11 = Sc.k.a(Sc.n.PUBLICATION, new P0(r02));
        List<je.y0> list = F02;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            je.y0 y0Var = (je.y0) obj;
            if (y0Var.a()) {
                KTypeProjection.INSTANCE.getClass();
                kTypeProjection = KTypeProjection.f71852d;
            } else {
                je.N type = y0Var.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                R0 type2 = new R0(type, function0 != null ? new Q0(r02, i11, a11) : null);
                int i13 = a.f76911a[y0Var.b().ordinal()];
                if (i13 == 1) {
                    KTypeProjection.INSTANCE.getClass();
                    Intrinsics.checkNotNullParameter(type2, "type");
                    kTypeProjection = new KTypeProjection(kotlin.reflect.s.INVARIANT, type2);
                } else if (i13 == 2) {
                    KTypeProjection.INSTANCE.getClass();
                    Intrinsics.checkNotNullParameter(type2, "type");
                    kTypeProjection = new KTypeProjection(kotlin.reflect.s.IN, type2);
                } else {
                    if (i13 != 3) {
                        throw new Sc.o();
                    }
                    KTypeProjection.INSTANCE.getClass();
                    Intrinsics.checkNotNullParameter(type2, "type");
                    kTypeProjection = new KTypeProjection(kotlin.reflect.s.OUT, type2);
                }
            }
            arrayList.add(kTypeProjection);
            i11 = i12;
        }
        return arrayList;
    }

    private final kotlin.reflect.f h(je.N n11) {
        je.N type;
        InterfaceC9842h p11 = n11.H0().p();
        if (p11 instanceof InterfaceC9839e) {
            Class<?> l11 = g1.l((InterfaceC9839e) p11);
            if (l11 != null) {
                if (!l11.isArray()) {
                    if (je.H0.g(n11)) {
                        return new X(l11);
                    }
                    Class<?> e11 = C11104f.e(l11);
                    if (e11 != null) {
                        l11 = e11;
                    }
                    return new X(l11);
                }
                je.y0 y0Var = (je.y0) C7714v.D0(n11.F0());
                if (y0Var == null || (type = y0Var.getType()) == null) {
                    return new X(l11);
                }
                kotlin.reflect.f h11 = h(type);
                if (h11 != null) {
                    Class b11 = C6345a.b(C8129b.a(h11));
                    Intrinsics.checkNotNullParameter(b11, "<this>");
                    return new X(Array.newInstance((Class<?>) b11, 0).getClass());
                }
                throw new V0("Cannot determine classifier for array element type: " + this);
            }
        } else {
            if (p11 instanceof td.i0) {
                return new T0(null, (td.i0) p11);
            }
            if (p11 instanceof td.h0) {
                Intrinsics.checkNotNullParameter("An operation is not implemented: Type alias classifiers are not yet supported", "message");
                throw new Sc.p("An operation is not implemented: Type alias classifiers are not yet supported");
            }
        }
        return null;
    }

    @Override // kotlin.reflect.q
    public final kotlin.reflect.f d() {
        kotlin.reflect.m<Object> mVar = f76906e[0];
        return (kotlin.reflect.f) this.f76909c.invoke();
    }

    @Override // kotlin.reflect.q
    @NotNull
    public final List<KTypeProjection> e() {
        kotlin.reflect.m<Object> mVar = f76906e[1];
        Object invoke = this.f76910d.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
        return (List) invoke;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof R0)) {
            return false;
        }
        R0 r02 = (R0) obj;
        return Intrinsics.d(this.f76907a, r02.f76907a) && Intrinsics.d(d(), r02.d()) && Intrinsics.d(e(), r02.e());
    }

    @Override // kotlin.jvm.internal.InterfaceC7736s
    public final Type f() {
        X0.a<Type> aVar = this.f76908b;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    @Override // kotlin.reflect.b
    @NotNull
    public final List<Annotation> getAnnotations() {
        return g1.d(this.f76907a);
    }

    public final int hashCode() {
        int hashCode = this.f76907a.hashCode() * 31;
        kotlin.reflect.f d11 = d();
        return e().hashCode() + ((hashCode + (d11 != null ? d11.hashCode() : 0)) * 31);
    }

    @NotNull
    public final je.N i() {
        return this.f76907a;
    }

    @NotNull
    public final R0 k() {
        je.N n11 = this.f76907a;
        if (!C7363H.a(n11) && !n11.I0()) {
            return this;
        }
        je.K0 k11 = je.H0.k(n11, false);
        Intrinsics.checkNotNullExpressionValue(k11, "makeNullableAsSpecified(...)");
        return new R0(k11, this.f76908b);
    }

    @Override // kotlin.reflect.q
    public final boolean l() {
        return this.f76907a.I0();
    }

    @NotNull
    public final String toString() {
        int i11 = b1.f76953b;
        return b1.f(this.f76907a);
    }
}
