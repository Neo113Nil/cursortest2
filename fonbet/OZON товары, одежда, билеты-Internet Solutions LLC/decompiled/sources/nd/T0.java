package nd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.V;
import nd.X0;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9845k;

/* loaded from: classes10.dex */
public final class T0 implements kotlin.reflect.r, Z {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f76916d = {kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(T0.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final td.i0 f76917a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final X0.a f76918b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final U0 f76919c;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76920a;

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
            f76920a = iArr;
        }
    }

    public T0(U0 u02, @NotNull td.i0 descriptor) {
        Class<?> e11;
        X x11;
        Object X9;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f76917a = descriptor;
        this.f76918b = X0.a(null, new S0(this));
        if (u02 == null) {
            InterfaceC9845k d11 = descriptor.d();
            Intrinsics.checkNotNullExpressionValue(d11, "getContainingDeclaration(...)");
            if (d11 instanceof InterfaceC9839e) {
                X9 = c((InterfaceC9839e) d11);
            } else {
                if (!(d11 instanceof InterfaceC9836b)) {
                    throw new V0("Unknown type parameter container: " + d11);
                }
                InterfaceC9845k d12 = ((InterfaceC9836b) d11).d();
                Intrinsics.checkNotNullExpressionValue(d12, "getContainingDeclaration(...)");
                if (d12 instanceof InterfaceC9839e) {
                    x11 = c((InterfaceC9839e) d12);
                } else {
                    he.w wVar = d11 instanceof he.w ? (he.w) d11 : null;
                    if (wVar == null) {
                        throw new V0("Non-class callable descriptor must be deserialized: " + d11);
                    }
                    he.v b02 = wVar.b0();
                    Ld.t tVar = b02 instanceof Ld.t ? (Ld.t) b02 : null;
                    Object e12 = tVar != null ? tVar.e() : null;
                    yd.f fVar = e12 instanceof yd.f ? (yd.f) e12 : null;
                    if (fVar == null || (e11 = fVar.e()) == null) {
                        throw new V0("Container of deserialized member is not resolved: " + wVar);
                    }
                    Intrinsics.checkNotNullParameter(e11, "<this>");
                    x11 = (X) kotlin.jvm.internal.N.b(e11);
                }
                X9 = d11.X(new C8544j(x11), Unit.f71690a);
            }
            u02 = (U0) X9;
        }
        this.f76919c = u02;
    }

    static ArrayList a(T0 t02) {
        List<je.N> upperBounds = t02.f76917a.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        List<je.N> list = upperBounds;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new R0((je.N) it.next(), null));
        }
        return arrayList;
    }

    private static X c(InterfaceC9839e interfaceC9839e) {
        kotlin.reflect.d dVar;
        Class<?> l11 = g1.l(interfaceC9839e);
        if (l11 != null) {
            Intrinsics.checkNotNullParameter(l11, "<this>");
            dVar = kotlin.jvm.internal.N.b(l11);
        } else {
            dVar = null;
        }
        X x11 = (X) dVar;
        if (x11 != null) {
            return x11;
        }
        throw new V0("Type parameter container is not resolved: " + interfaceC9839e.d());
    }

    @Override // nd.Z
    public final InterfaceC9842h b() {
        return this.f76917a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof T0)) {
            return false;
        }
        T0 t02 = (T0) obj;
        return Intrinsics.d(this.f76919c, t02.f76919c) && Intrinsics.d(getName(), t02.getName());
    }

    @Override // kotlin.reflect.r
    @NotNull
    public final String getName() {
        String b11 = this.f76917a.getName().b();
        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
        return b11;
    }

    @Override // kotlin.reflect.r
    @NotNull
    public final List<kotlin.reflect.q> getUpperBounds() {
        kotlin.reflect.m<Object> mVar = f76916d[0];
        Object invoke = this.f76918b.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
        return (List) invoke;
    }

    public final int hashCode() {
        return getName().hashCode() + (this.f76919c.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        kotlin.reflect.s sVar;
        kotlin.jvm.internal.V.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(this, "typeParameter");
        StringBuilder sb2 = new StringBuilder();
        int i11 = a.f76920a[this.f76917a.x().ordinal()];
        if (i11 == 1) {
            sVar = kotlin.reflect.s.INVARIANT;
        } else if (i11 == 2) {
            sVar = kotlin.reflect.s.IN;
        } else {
            if (i11 != 3) {
                throw new Sc.o();
            }
            sVar = kotlin.reflect.s.OUT;
        }
        int i12 = V.Companion.C1189a.f71794a[sVar.ordinal()];
        if (i12 == 2) {
            sb2.append("in ");
        } else if (i12 == 3) {
            sb2.append("out ");
        }
        sb2.append(getName());
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
