package fe;

import Nd.a;
import Xd.C4884a;
import Xd.C4885b;
import Xd.C4886c;
import Xd.C4887d;
import Xd.C4888e;
import Xd.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kd.C7665d;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C9819J;
import td.C9856v;
import td.InterfaceC9815F;
import td.InterfaceC9838d;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.d0;
import td.p0;
import ud.C10026d;

/* renamed from: fe.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6528g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9815F f63208a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C9819J f63209b;

    /* renamed from: fe.g$a */
    /* loaded from: classes10.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63210a;

        static {
            int[] iArr = new int[a.b.c.EnumC0379c.values().length];
            try {
                iArr[a.b.c.EnumC0379c.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.b.c.EnumC0379c.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.b.c.EnumC0379c.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.b.c.EnumC0379c.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.b.c.EnumC0379c.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.b.c.EnumC0379c.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.b.c.EnumC0379c.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.b.c.EnumC0379c.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[a.b.c.EnumC0379c.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[a.b.c.EnumC0379c.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[a.b.c.EnumC0379c.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[a.b.c.EnumC0379c.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[a.b.c.EnumC0379c.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f63210a = iArr;
        }
    }

    public C6528g(@NotNull InterfaceC9815F module, @NotNull C9819J notFoundClasses) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        this.f63208a = module;
        this.f63209b = notFoundClasses;
    }

    private final boolean b(Xd.g<?> gVar, je.N n11, a.b.c cVar) {
        a.b.c.EnumC0379c M11 = cVar.M();
        int i11 = M11 == null ? -1 : a.f63210a[M11.ordinal()];
        if (i11 == 10) {
            InterfaceC9842h p11 = n11.H0().p();
            InterfaceC9839e interfaceC9839e = p11 instanceof InterfaceC9839e ? (InterfaceC9839e) p11 : null;
            return interfaceC9839e == null || qd.m.a0(interfaceC9839e);
        }
        InterfaceC9815F interfaceC9815F = this.f63208a;
        if (i11 != 13) {
            return Intrinsics.d(gVar.a(interfaceC9815F), n11);
        }
        if (gVar instanceof C4885b) {
            C4885b c4885b = (C4885b) gVar;
            if (c4885b.b().size() == cVar.D().size()) {
                je.N k11 = interfaceC9815F.n().k(n11);
                Intrinsics.checkNotNullExpressionValue(k11, "getArrayElementType(...)");
                Iterable O11 = C7714v.O(c4885b.b());
                if ((O11 instanceof Collection) && ((Collection) O11).isEmpty()) {
                    return true;
                }
                C7665d it = O11.iterator();
                while (it.hasNext()) {
                    int b11 = it.b();
                    Xd.g<?> gVar2 = c4885b.b().get(b11);
                    a.b.c C11 = cVar.C(b11);
                    Intrinsics.checkNotNullExpressionValue(C11, "getArrayElement(...)");
                    if (!b(gVar2, k11, C11)) {
                        return false;
                    }
                }
                return true;
            }
        }
        throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.Pair] */
    @NotNull
    public final C10026d a(@NotNull Nd.a proto, @NotNull Pd.c nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        InterfaceC9839e c11 = C9856v.c(this.f63208a, L.a(nameResolver, proto.n()), this.f63209b);
        Map c12 = kotlin.collections.U.c();
        if (proto.j() != 0 && !le.l.k(c11) && Vd.i.p(c11)) {
            Collection<InterfaceC9838d> l11 = c11.l();
            Intrinsics.checkNotNullExpressionValue(l11, "getConstructors(...)");
            InterfaceC9838d interfaceC9838d = (InterfaceC9838d) C7714v.C0(l11);
            if (interfaceC9838d != null) {
                List<p0> f7 = interfaceC9838d.f();
                Intrinsics.checkNotNullExpressionValue(f7, "getValueParameters(...)");
                List<p0> list = f7;
                int h11 = kotlin.collections.U.h(C7714v.z(list, 10));
                if (h11 < 16) {
                    h11 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
                for (Object obj : list) {
                    linkedHashMap.put(((p0) obj).getName(), obj);
                }
                List<a.b> l12 = proto.l();
                Intrinsics.checkNotNullExpressionValue(l12, "getArgumentList(...)");
                ArrayList arrayList = new ArrayList();
                for (a.b bVar : l12) {
                    Intrinsics.f(bVar);
                    p0 p0Var = (p0) linkedHashMap.get(L.b(nameResolver, bVar.j()));
                    if (p0Var != null) {
                        Sd.f b11 = L.b(nameResolver, bVar.j());
                        je.N type = p0Var.getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        a.b.c l13 = bVar.l();
                        Intrinsics.checkNotNullExpressionValue(l13, "getValue(...)");
                        Xd.g<?> c13 = c(type, l13, nameResolver);
                        r5 = b(c13, type, l13) ? c13 : null;
                        if (r5 == null) {
                            r5 = l.a.a("Unexpected argument value: actual type " + l13.M() + " != expected type " + type);
                        }
                        r5 = new Pair(b11, r5);
                    }
                    if (r5 != null) {
                        arrayList.add(r5);
                    }
                }
                c12 = kotlin.collections.U.s(arrayList);
            }
        }
        return new C10026d(c11.q(), c12, d0.f99392a);
    }

    @NotNull
    public final Xd.g<?> c(@NotNull je.N type, @NotNull a.b.c value, @NotNull Pd.c nameResolver) {
        Intrinsics.checkNotNullParameter(type, "expectedType");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Boolean d11 = Pd.b.f22227N.d(value.I());
        Intrinsics.checkNotNullExpressionValue(d11, "get(...)");
        boolean booleanValue = d11.booleanValue();
        a.b.c.EnumC0379c M11 = value.M();
        switch (M11 == null ? -1 : a.f63210a[M11.ordinal()]) {
            case 1:
                byte K11 = (byte) value.K();
                return booleanValue ? new Xd.A(K11) : new C4887d(K11);
            case 2:
                return new C4888e((char) value.K());
            case 3:
                short K12 = (short) value.K();
                return booleanValue ? new Xd.D(K12) : new Xd.w(K12);
            case 4:
                int K13 = (int) value.K();
                return booleanValue ? new Xd.B(K13) : new Xd.n(K13);
            case 5:
                long K14 = value.K();
                return booleanValue ? new Xd.C(K14) : new Xd.u(K14);
            case 6:
                return new Xd.m(value.J());
            case 7:
                return new Xd.j(value.G());
            case 8:
                return new C4886c(value.K() != 0);
            case 9:
                return new Xd.x(nameResolver.getString(value.L()));
            case 10:
                return new Xd.t(L.a(nameResolver, value.E()), value.B());
            case 11:
                return new Xd.k(L.a(nameResolver, value.E()), L.b(nameResolver, value.H()));
            case 12:
                Nd.a A11 = value.A();
                Intrinsics.checkNotNullExpressionValue(A11, "getAnnotation(...)");
                C10026d value2 = a(A11, nameResolver);
                Intrinsics.checkNotNullParameter(value2, "value");
                return new C4884a(value2);
            case 13:
                List<a.b.c> D11 = value.D();
                Intrinsics.checkNotNullExpressionValue(D11, "getArrayElementList(...)");
                List<a.b.c> list = D11;
                ArrayList value3 = new ArrayList(C7714v.z(list, 10));
                for (a.b.c cVar : list) {
                    je.Y i11 = this.f63208a.n().i();
                    Intrinsics.checkNotNullExpressionValue(i11, "getAnyType(...)");
                    Intrinsics.f(cVar);
                    value3.add(c(i11, cVar, nameResolver));
                }
                Intrinsics.checkNotNullParameter(value3, "value");
                Intrinsics.checkNotNullParameter(type, "type");
                return new Xd.z(value3, type);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.M() + " (expected " + type + ')').toString());
        }
    }
}
