package fe;

import Nd.p;
import fe.O;
import he.C6929K;
import he.C6931a;
import ie.C7056e;
import ie.InterfaceC7060i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import je.A0;
import je.C7373c0;
import je.C7375d0;
import je.C7379f0;
import je.C7387j0;
import je.C7389k0;
import je.C7401v;
import je.H0;
import je.L0;
import je.n0;
import je.o0;
import je.s0;
import je.y0;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;
import td.C9856v;
import td.InterfaceC9815F;
import td.InterfaceC9835a;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9845k;
import td.h0;
import td.i0;
import ud.InterfaceC10030h;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6537p f63190a;

    /* renamed from: b, reason: collision with root package name */
    private final X f63191b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f63192c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f63193d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC7060i f63194e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC7060i f63195f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Object f63196g;

    /* loaded from: classes10.dex */
    /* synthetic */ class a extends kotlin.jvm.internal.D {

        /* renamed from: a, reason: collision with root package name */
        public static final a f63197a = new a();

        @Override // kotlin.reflect.o
        public final Object get(Object obj) {
            return ((Sd.b) obj).e();
        }

        @Override // kotlin.jvm.internal.AbstractC7724f, kotlin.reflect.c
        public final String getName() {
            return "outerClassId";
        }

        @Override // kotlin.jvm.internal.AbstractC7724f
        public final kotlin.reflect.g getOwner() {
            return kotlin.jvm.internal.N.b(Sd.b.class);
        }

        @Override // kotlin.jvm.internal.AbstractC7724f
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }
    }

    public X(@NotNull C6537p c11, X x11, @NotNull List<Nd.r> typeParameterProtos, @NotNull String debugName, @NotNull String containerPresentableName) {
        Map linkedHashMap;
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(typeParameterProtos, "typeParameterProtos");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        Intrinsics.checkNotNullParameter(containerPresentableName, "containerPresentableName");
        this.f63190a = c11;
        this.f63191b = x11;
        this.f63192c = debugName;
        this.f63193d = containerPresentableName;
        this.f63194e = ((C7056e) c11.h()).j(new S(this));
        this.f63195f = ((C7056e) c11.h()).j(new T(this));
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = kotlin.collections.U.c();
        } else {
            linkedHashMap = new LinkedHashMap();
            int i11 = 0;
            for (Nd.r rVar : typeParameterProtos) {
                linkedHashMap.put(Integer.valueOf(rVar.I()), new C6929K(this.f63190a, rVar, i11));
                i11++;
            }
        }
        this.f63196g = linkedHashMap;
    }

    static InterfaceC9842h a(X x11, int i11) {
        C6537p c6537p = x11.f63190a;
        Sd.b a11 = L.a(c6537p.g(), i11);
        return a11.i() ? c6537p.c().b(a11) : C9856v.b(c6537p.c().q(), a11);
    }

    static h0 b(X x11, int i11) {
        C6537p c6537p = x11.f63190a;
        Sd.b classId = L.a(c6537p.g(), i11);
        if (classId.i()) {
            return null;
        }
        InterfaceC9815F q11 = c6537p.c().q();
        Intrinsics.checkNotNullParameter(q11, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        InterfaceC9842h b11 = C9856v.b(q11, classId);
        if (b11 instanceof h0) {
            return (h0) b11;
        }
        return null;
    }

    static List c(Nd.p pVar, X x11) {
        return x11.f63190a.c().d().k(pVar, x11.f63190a.g());
    }

    static Nd.p d(Nd.p it, X x11) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Pd.f.a(it, x11.f63190a.j());
    }

    private static je.Y e(je.Y y11, je.N n11) {
        qd.m h11 = C8701c.h(y11);
        InterfaceC10030h annotations = y11.getAnnotations();
        je.N f7 = qd.i.f(y11);
        List<je.N> d11 = qd.i.d(y11);
        List E11 = C7714v.E(qd.i.h(y11));
        ArrayList arrayList = new ArrayList(C7714v.z(E11, 10));
        Iterator it = E11.iterator();
        while (it.hasNext()) {
            arrayList.add(((y0) it.next()).getType());
        }
        return qd.i.b(h11, annotations, f7, d11, arrayList, n11, true).L0(y11.I0());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    private final i0 g(int i11) {
        i0 i0Var = (i0) this.f63196g.get(Integer.valueOf(i11));
        if (i0Var != null) {
            return i0Var;
        }
        X x11 = this.f63191b;
        if (x11 != null) {
            return x11.g(i11);
        }
        return null;
    }

    private static final ArrayList i(Nd.p pVar, X x11) {
        List<p.b> R11 = pVar.R();
        Intrinsics.checkNotNullExpressionValue(R11, "getArgumentList(...)");
        List<p.b> list = R11;
        Nd.p a11 = Pd.f.a(pVar, x11.f63190a.j());
        Iterable i11 = a11 != null ? i(a11, x11) : null;
        if (i11 == null) {
            i11 = kotlin.collections.K.f71697a;
        }
        return C7714v.p0(i11, list);
    }

    private static o0 j(List list, InterfaceC10030h interfaceC10030h, s0 s0Var, InterfaceC9845k interfaceC9845k) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((n0) it.next()).a(interfaceC10030h));
        }
        ArrayList N11 = C7714v.N(arrayList);
        o0.f69907b.getClass();
        return o0.a.f(N11);
    }

    private static final InterfaceC9839e l(X x11, Nd.p pVar, int i11) {
        Sd.b a11 = L.a(x11.f63190a.g(), i11);
        ArrayList D11 = kotlin.sequences.l.D(kotlin.sequences.l.v(kotlin.sequences.l.q(pVar, new V(x11)), W.f63189a));
        int d11 = kotlin.sequences.l.d(kotlin.sequences.l.q(a11, a.f63197a));
        while (D11.size() < d11) {
            D11.add(0);
        }
        return x11.f63190a.c().r().c(a11, D11);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @NotNull
    public final List<i0> f() {
        return C7714v.U0(this.f63196g.values());
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x036a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r8, r3) == false) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03b4  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final je.Y h(@NotNull Nd.p proto, boolean z11) {
        s0 typeConstructor;
        InterfaceC9842h interfaceC9842h;
        Object obj;
        Nd.p pVar;
        je.Y y11;
        je.Y f7;
        y0 y0Var;
        je.N type;
        Sd.c cVar;
        je.Y d11;
        L0 l02;
        ne.j a02;
        boolean z12 = true;
        Intrinsics.checkNotNullParameter(proto, "proto");
        boolean g02 = proto.g0();
        C6537p c6537p = this.f63190a;
        if (g02) {
            if (L.a(c6537p.g(), proto.S()).i()) {
                c6537p.c().o().getClass();
            }
        } else if (proto.o0()) {
            if (L.a(c6537p.g(), proto.b0()).i()) {
                c6537p.c().o().getClass();
            }
        }
        if (!proto.g0()) {
            if (proto.p0()) {
                interfaceC9842h = g(proto.c0());
                if (interfaceC9842h == null) {
                    int i11 = le.l.f73271f;
                    typeConstructor = le.l.d(le.k.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(proto.c0()), this.f63193d);
                }
            } else if (proto.q0()) {
                String string = c6537p.g().getString(proto.d0());
                Iterator<T> it = f().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.d(((i0) obj).getName().b(), string)) {
                        break;
                    }
                }
                i0 i0Var = (i0) obj;
                if (i0Var == null) {
                    int i12 = le.l.f73271f;
                    typeConstructor = le.l.d(le.k.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, c6537p.e().toString());
                } else {
                    interfaceC9842h = i0Var;
                }
            } else if (proto.o0()) {
                interfaceC9842h = (InterfaceC9842h) this.f63195f.invoke(Integer.valueOf(proto.b0()));
                if (interfaceC9842h == null) {
                    interfaceC9842h = l(this, proto, proto.b0());
                }
            } else {
                int i13 = le.l.f73271f;
                typeConstructor = le.l.d(le.k.UNKNOWN_TYPE, new String[0]);
            }
            if (!le.l.k(typeConstructor.p())) {
                int i14 = le.l.f73271f;
                le.k kind = le.k.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR;
                String[] formatParams = {typeConstructor.toString()};
                Intrinsics.checkNotNullParameter(kind, "kind");
                Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
                Intrinsics.checkNotNullParameter(formatParams, "formatParams");
                return le.l.e(kind, kotlin.collections.K.f71697a, typeConstructor, (String[]) Arrays.copyOf(formatParams, 1));
            }
            C6931a c6931a = new C6931a(c6537p.h(), new U(proto, this));
            o0 j11 = j(c6537p.c().v(), c6931a, typeConstructor, c6537p.e());
            ArrayList i15 = i(proto, this);
            ArrayList arrayList = new ArrayList(C7714v.z(i15, 10));
            Iterator it2 = i15.iterator();
            int i16 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i17 = i16 + 1;
                if (i16 < 0) {
                    C7714v.O0();
                    throw null;
                }
                p.b bVar = (p.b) next;
                List<i0> parameters = typeConstructor.getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                i0 i0Var2 = (i0) C7714v.Q(i16, parameters);
                if (bVar.l() == p.b.c.STAR) {
                    a02 = i0Var2 == null ? new C7375d0(c6537p.c().q().n()) : new C7379f0(i0Var2);
                } else {
                    p.b.c projection = bVar.l();
                    Intrinsics.checkNotNullExpressionValue(projection, "getProjection(...)");
                    Intrinsics.checkNotNullParameter(projection, "projection");
                    int i18 = O.a.f63180d[projection.ordinal()];
                    if (i18 == 1) {
                        l02 = L0.IN_VARIANCE;
                    } else if (i18 == 2) {
                        l02 = L0.OUT_VARIANCE;
                    } else {
                        if (i18 != 3) {
                            if (i18 != 4) {
                                throw new Sc.o();
                            }
                            throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + projection);
                        }
                        l02 = L0.INVARIANT;
                    }
                    Pd.g typeTable = c6537p.j();
                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                    Intrinsics.checkNotNullParameter(typeTable, "typeTable");
                    Nd.p m11 = bVar.s() ? bVar.m() : bVar.u() ? typeTable.a(bVar.n()) : null;
                    a02 = m11 == null ? new A0(le.l.c(le.k.NO_RECORDED_TYPE, bVar.toString())) : new A0(k(m11), l02);
                }
                arrayList.add(a02);
                i16 = i17;
            }
            List arguments = C7714v.U0(arrayList);
            InterfaceC9842h p11 = typeConstructor.p();
            if (z11 && (p11 instanceof h0)) {
                h0 h0Var = (h0) p11;
                Intrinsics.checkNotNullParameter(h0Var, "<this>");
                Intrinsics.checkNotNullParameter(arguments, "arguments");
                C7387j0 c7387j0 = new C7387j0();
                C7389k0 a11 = C7389k0.a.a(null, h0Var, arguments);
                o0.f69907b.getClass();
                je.Y b11 = c7387j0.b(a11, o0.f69908c);
                o0 j12 = j(c6537p.c().v(), InterfaceC10030h.a.a(C7714v.n0(c6931a, b11.getAnnotations())), typeConstructor, c6537p.e());
                Intrinsics.checkNotNullParameter(b11, "<this>");
                if (!H0.g(b11) && !proto.Y()) {
                    z12 = false;
                }
                y11 = b11.L0(z12).N0(j12);
            } else {
                if (!Pd.b.f22228a.d(proto.U()).booleanValue()) {
                    pVar = null;
                    je.Y f11 = je.Q.f(arguments, j11, typeConstructor, null, proto.Y());
                    if (Pd.b.f22229b.d(proto.U()).booleanValue()) {
                        y11 = C7401v.a.a(f11, true);
                        if (y11 == null) {
                            throw new IllegalStateException(("null DefinitelyNotNullType for '" + f11 + '\'').toString());
                        }
                    } else {
                        y11 = f11;
                    }
                    Pd.g typeTable2 = c6537p.j();
                    Intrinsics.checkNotNullParameter(proto, "<this>");
                    Intrinsics.checkNotNullParameter(typeTable2, "typeTable");
                    Nd.p O11 = !proto.e0() ? proto.O() : proto.f0() ? typeTable2.a(proto.P()) : pVar;
                    return (O11 != null || (d11 = C7373c0.d(y11, h(O11, false))) == null) ? y11 : d11;
                }
                boolean Y11 = proto.Y();
                int size = typeConstructor.getParameters().size() - arguments.size();
                if (size != 0) {
                    if (size == 1) {
                        int size2 = arguments.size() - 1;
                        if (size2 >= 0) {
                            s0 k11 = typeConstructor.n().O(size2).k();
                            Intrinsics.checkNotNullExpressionValue(k11, "getTypeConstructor(...)");
                            f7 = je.Q.f(arguments, j11, k11, null, Y11);
                        } else {
                            f7 = null;
                        }
                        if (f7 != null) {
                            int i19 = le.l.f73271f;
                            y11 = le.l.e(le.k.INCONSISTENT_SUSPEND_FUNCTION, arguments, typeConstructor, new String[0]);
                        } else {
                            y11 = f7;
                        }
                    }
                    f7 = null;
                    if (f7 != null) {
                    }
                } else {
                    f7 = je.Q.f(arguments, j11, typeConstructor, null, Y11);
                    if (qd.i.k(f7) && (y0Var = (y0) C7714v.Z(qd.i.h(f7))) != null && (type = y0Var.getType()) != null) {
                        InterfaceC9842h p12 = type.H0().p();
                        Sd.c g10 = p12 != null ? Zd.e.g(p12) : null;
                        if (type.F0().size() == 1) {
                            if (!Intrinsics.d(g10, qd.s.f81860g)) {
                                cVar = Y.f63198a;
                            }
                            je.N type2 = ((y0) C7714v.B0(type.F0())).getType();
                            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                            InterfaceC9845k e11 = c6537p.e();
                            InterfaceC9835a interfaceC9835a = e11 instanceof InterfaceC9835a ? (InterfaceC9835a) e11 : null;
                            f7 = Intrinsics.d(interfaceC9835a != null ? Zd.e.c(interfaceC9835a) : null, Q.f63183a) ? e(f7, type2) : e(f7, type2);
                        }
                        if (f7 != null) {
                        }
                    }
                    f7 = null;
                    if (f7 != null) {
                    }
                }
            }
            pVar = null;
            Pd.g typeTable22 = c6537p.j();
            Intrinsics.checkNotNullParameter(proto, "<this>");
            Intrinsics.checkNotNullParameter(typeTable22, "typeTable");
            if (!proto.e0()) {
            }
            if (O11 != null) {
            }
        }
        interfaceC9842h = (InterfaceC9842h) this.f63194e.invoke(Integer.valueOf(proto.S()));
        if (interfaceC9842h == null) {
            interfaceC9842h = l(this, proto, proto.S());
        }
        typeConstructor = interfaceC9842h.k();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        if (!le.l.k(typeConstructor.p())) {
        }
    }

    @NotNull
    public final je.N k(@NotNull Nd.p proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        if (!proto.i0()) {
            return h(proto, true);
        }
        C6537p c6537p = this.f63190a;
        String string = c6537p.g().getString(proto.V());
        je.Y h11 = h(proto, true);
        Pd.g typeTable = c6537p.j();
        Intrinsics.checkNotNullParameter(proto, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Nd.p W11 = proto.j0() ? proto.W() : proto.k0() ? typeTable.a(proto.X()) : null;
        Intrinsics.f(W11);
        return c6537p.c().m().a(proto, string, h11, h(W11, true));
    }

    @NotNull
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f63192c);
        X x11 = this.f63191b;
        if (x11 == null) {
            str = "";
        } else {
            str = ". Child of " + x11.f63192c;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
