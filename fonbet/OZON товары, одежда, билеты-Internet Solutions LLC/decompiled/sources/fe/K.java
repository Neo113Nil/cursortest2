package fe;

import Pd.b;
import Td.h;
import fe.InterfaceC6534m;
import fe.N;
import he.C6925G;
import he.C6926H;
import he.C6927I;
import he.C6930L;
import he.C6931a;
import he.C6933c;
import ie.C7056e;
import ie.InterfaceC7062k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.AbstractC9850p;
import td.EnumC9812C;
import td.EnumC9840f;
import td.InterfaceC9820K;
import td.InterfaceC9834Z;
import td.InterfaceC9835a;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9845k;
import td.d0;
import td.i0;
import td.p0;
import ud.InterfaceC10025c;
import ud.InterfaceC10030h;
import wd.C10536w;
import wd.c0;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6537p f63161a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C6528g f63162b;

    public K(@NotNull C6537p c11) {
        Intrinsics.checkNotNullParameter(c11, "c");
        this.f63161a = c11;
        this.f63162b = new C6528g(c11.c().q(), c11.c().r());
    }

    static InterfaceC7062k a(K k11, Nd.m mVar, C6925G c6925g) {
        return ((C7056e) k11.f63161a.h()).b(new I(k11, mVar, c6925g));
    }

    static InterfaceC7062k b(K k11, Nd.m mVar, C6925G c6925g) {
        return ((C7056e) k11.f63161a.h()).b(new J(k11, mVar, c6925g));
    }

    static List c(K k11, h.d dVar, EnumC6525d enumC6525d) {
        N i11 = k11.i(k11.f63161a.e());
        List U02 = i11 != null ? C7714v.U0(k11.f63161a.c().d().h(i11, dVar, enumC6525d)) : null;
        return U02 == null ? kotlin.collections.K.f71697a : U02;
    }

    static List d(K k11, boolean z11, Nd.m mVar) {
        List list;
        N i11 = k11.i(k11.f63161a.e());
        if (i11 != null) {
            C6537p c6537p = k11.f63161a;
            list = z11 ? C7714v.U0(c6537p.c().d().f(i11, mVar)) : C7714v.U0(c6537p.c().d().j(i11, mVar));
        } else {
            list = null;
        }
        return list == null ? kotlin.collections.K.f71697a : list;
    }

    static List e(K k11, h.d dVar, EnumC6525d enumC6525d) {
        N i11 = k11.i(k11.f63161a.e());
        List e11 = i11 != null ? k11.f63161a.c().d().e(i11, dVar, enumC6525d) : null;
        return e11 == null ? kotlin.collections.K.f71697a : e11;
    }

    static List f(K k11, N n11, h.d dVar, EnumC6525d enumC6525d, int i11, Nd.t tVar) {
        return C7714v.U0(k11.f63161a.c().d().b(n11, dVar, enumC6525d, i11, tVar));
    }

    static Xd.g g(K k11, Nd.m mVar, C6925G c6925g) {
        N i11 = k11.i(k11.f63161a.e());
        Intrinsics.f(i11);
        InterfaceC6526e<InterfaceC10025c, Xd.g<?>> d11 = k11.f63161a.c().d();
        je.N returnType = c6925g.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        return d11.c(i11, mVar, returnType);
    }

    static Xd.g h(K k11, Nd.m mVar, C6925G c6925g) {
        N i11 = k11.i(k11.f63161a.e());
        Intrinsics.f(i11);
        InterfaceC6526e<InterfaceC10025c, Xd.g<?>> d11 = k11.f63161a.c().d();
        je.N returnType = c6925g.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        return d11.d(i11, mVar, returnType);
    }

    private final N i(InterfaceC9845k interfaceC9845k) {
        if (interfaceC9845k instanceof InterfaceC9820K) {
            Sd.c c11 = ((InterfaceC9820K) interfaceC9845k).c();
            C6537p c6537p = this.f63161a;
            return new N.b(c11, c6537p.g(), c6537p.j(), c6537p.d());
        }
        if (interfaceC9845k instanceof he.n) {
            return ((he.n) interfaceC9845k).T0();
        }
        return null;
    }

    private final InterfaceC10030h j(h.d dVar, int i11, EnumC6525d enumC6525d) {
        return !Pd.b.f22230c.d(i11).booleanValue() ? InterfaceC10030h.a.b() : new C6930L(this.f63161a.h(), new C6520E(this, dVar, enumC6525d));
    }

    private final InterfaceC10030h k(Nd.m mVar, boolean z11) {
        return !Pd.b.f22230c.d(mVar.U()).booleanValue() ? InterfaceC10030h.a.b() : new C6930L(this.f63161a.h(), new C6521F(this, z11, mVar));
    }

    private final List p(List list, h.d dVar, EnumC6525d enumC6525d) {
        K k11 = this;
        C6537p c6537p = k11.f63161a;
        InterfaceC9845k e11 = c6537p.e();
        Intrinsics.g(e11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        InterfaceC9835a interfaceC9835a = (InterfaceC9835a) e11;
        InterfaceC9845k d11 = interfaceC9835a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "getContainingDeclaration(...)");
        N i11 = k11.i(d11);
        List list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            je.N n11 = null;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            Nd.t tVar = (Nd.t) obj;
            int G11 = tVar.M() ? tVar.G() : 0;
            InterfaceC10030h b11 = (i11 == null || !Pd.b.f22230c.d(G11).booleanValue()) ? InterfaceC10030h.a.b() : new C6930L(c6537p.h(), new H(k11, i11, dVar, enumC6525d, i12, tVar));
            Sd.f b12 = L.b(c6537p.g(), tVar.H());
            je.N k12 = c6537p.i().k(Pd.f.e(tVar, c6537p.j()));
            Boolean d12 = Pd.b.f22221H.d(G11);
            Intrinsics.checkNotNullExpressionValue(d12, "get(...)");
            boolean booleanValue = d12.booleanValue();
            Boolean d13 = Pd.b.f22222I.d(G11);
            Intrinsics.checkNotNullExpressionValue(d13, "get(...)");
            boolean booleanValue2 = d13.booleanValue();
            Boolean d14 = Pd.b.f22223J.d(G11);
            Intrinsics.checkNotNullExpressionValue(d14, "get(...)");
            boolean booleanValue3 = d14.booleanValue();
            Pd.g typeTable = c6537p.j();
            Intrinsics.checkNotNullParameter(tVar, "<this>");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            Nd.p K11 = tVar.Q() ? tVar.K() : tVar.R() ? typeTable.a(tVar.L()) : null;
            if (K11 != null) {
                n11 = c6537p.i().k(K11);
            }
            d0 NO_SOURCE = d0.f99392a;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new c0(interfaceC9835a, null, i12, b11, b12, k12, booleanValue, booleanValue2, booleanValue3, n11, NO_SOURCE));
            arrayList = arrayList2;
            i12 = i13;
            k11 = this;
        }
        return C7714v.U0(arrayList);
    }

    @NotNull
    public final C6933c l(@NotNull Nd.c proto, boolean z11) {
        C6537p a11;
        Intrinsics.checkNotNullParameter(proto, "proto");
        C6537p c6537p = this.f63161a;
        InterfaceC9845k e11 = c6537p.e();
        Intrinsics.g(e11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        InterfaceC9839e interfaceC9839e = (InterfaceC9839e) e11;
        int F11 = proto.F();
        EnumC6525d enumC6525d = EnumC6525d.FUNCTION;
        C6933c c6933c = new C6933c(interfaceC9839e, null, j(proto, F11, enumC6525d), z11, InterfaceC9836b.a.DECLARATION, proto, c6537p.g(), c6537p.j(), c6537p.k(), c6537p.d(), null);
        a11 = c6537p.a(c6933c, kotlin.collections.K.f71697a, c6537p.f63245b, c6537p.f63247d, c6537p.f63248e, c6537p.f63249f);
        K f7 = a11.f();
        List<Nd.t> G11 = proto.G();
        Intrinsics.checkNotNullExpressionValue(G11, "getValueParameterList(...)");
        c6933c.d1(f7.p(G11, proto, enumC6525d), P.a(Pd.b.f22231d.c(proto.F())));
        c6933c.W0(interfaceC9839e.q());
        c6933c.P0(interfaceC9839e.p0());
        c6933c.R0(!Pd.b.f22242o.d(proto.F()).booleanValue());
        return c6933c;
    }

    @NotNull
    public final C6926H m(@NotNull Nd.h proto) {
        int i11;
        C6537p a11;
        je.N k11;
        Intrinsics.checkNotNullParameter(proto, "proto");
        if (proto.h0()) {
            i11 = proto.W();
        } else {
            int Y11 = proto.Y();
            i11 = ((Y11 >> 8) << 6) + (Y11 & 63);
        }
        int i12 = i11;
        EnumC6525d enumC6525d = EnumC6525d.FUNCTION;
        InterfaceC10030h j11 = j(proto, i12, enumC6525d);
        Intrinsics.checkNotNullParameter(proto, "<this>");
        boolean k02 = proto.k0();
        C6537p c6537p = this.f63161a;
        InterfaceC10030h c6931a = (k02 || proto.l0()) ? new C6931a(c6537p.h(), new G(this, proto, enumC6525d)) : InterfaceC10030h.a.b();
        C6926H ownerFunction = new C6926H(c6537p.e(), null, j11, L.b(c6537p.g(), proto.X()), P.b(Pd.b.f22243p.c(i12)), proto, c6537p.g(), c6537p.j(), Zd.e.g(c6537p.e()).c(L.b(c6537p.g(), proto.X())).equals(Q.f63183a) ? Pd.h.f22261b : c6537p.k(), c6537p.d(), null);
        List<Nd.r> d02 = proto.d0();
        Intrinsics.checkNotNullExpressionValue(d02, "getTypeParameterList(...)");
        a11 = c6537p.a(ownerFunction, d02, c6537p.f63245b, c6537p.f63247d, c6537p.f63248e, c6537p.f63249f);
        Nd.p b11 = Pd.f.b(proto, c6537p.j());
        wd.U h11 = (b11 == null || (k11 = a11.i().k(b11)) == null) ? null : Vd.h.h(ownerFunction, k11, c6931a);
        InterfaceC9845k e11 = c6537p.e();
        InterfaceC9839e interfaceC9839e = e11 instanceof InterfaceC9839e ? (InterfaceC9839e) e11 : null;
        InterfaceC9834Z W11 = interfaceC9839e != null ? interfaceC9839e.W() : null;
        Pd.g typeTable = c6537p.j();
        Intrinsics.checkNotNullParameter(proto, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<Nd.p> T11 = proto.T();
        if (T11.isEmpty()) {
            T11 = null;
        }
        if (T11 == null) {
            List<Integer> S11 = proto.S();
            Intrinsics.checkNotNullExpressionValue(S11, "getContextReceiverTypeIdList(...)");
            List<Integer> list = S11;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            for (Integer num : list) {
                Intrinsics.f(num);
                arrayList.add(typeTable.a(num.intValue()));
            }
            T11 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i13 = 0;
        for (Object obj : T11) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C7714v.O0();
                throw null;
            }
            wd.U b12 = Vd.h.b(ownerFunction, a11.i().k((Nd.p) obj), null, InterfaceC10030h.a.b(), i13);
            if (b12 != null) {
                arrayList2.add(b12);
            }
            i13 = i14;
        }
        List<i0> f7 = a11.i().f();
        K f11 = a11.f();
        List<Nd.t> f02 = proto.f0();
        Intrinsics.checkNotNullExpressionValue(f02, "getValueParameterList(...)");
        ownerFunction.e1(h11, W11, arrayList2, f7, f11.p(f02, proto, EnumC6525d.FUNCTION), a11.i().k(Pd.f.c(proto, c6537p.j())), O.a(Pd.b.f22232e.c(i12)), P.a(Pd.b.f22231d.c(i12)), kotlin.collections.U.c());
        ownerFunction.V0(Pd.b.f22244q.d(i12).booleanValue());
        ownerFunction.T0(Pd.b.f22245r.d(i12).booleanValue());
        ownerFunction.Q0(Pd.b.f22248u.d(i12).booleanValue());
        ownerFunction.U0(Pd.b.f22246s.d(i12).booleanValue());
        ownerFunction.Y0(Pd.b.f22247t.d(i12).booleanValue());
        ownerFunction.X0(Pd.b.f22249v.d(i12).booleanValue());
        ownerFunction.P0(Pd.b.f22250w.d(i12).booleanValue());
        ownerFunction.R0(!Pd.b.f22251x.d(i12).booleanValue());
        InterfaceC6534m h12 = c6537p.c().h();
        Pd.g typeTable2 = c6537p.j();
        X typeDeserializer = a11.i();
        ((InterfaceC6534m.a.C1011a) h12).getClass();
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(ownerFunction, "ownerFunction");
        Intrinsics.checkNotNullParameter(typeTable2, "typeTable");
        Intrinsics.checkNotNullParameter(typeDeserializer, "typeDeserializer");
        return ownerFunction;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0152  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C6925G n(@NotNull Nd.m proto) {
        int i11;
        C6537p a11;
        K k11;
        InterfaceC10030h b11;
        List<Nd.p> S11;
        C6537p c6537p;
        Iterator it;
        b.c<Nd.w> cVar;
        String str;
        C6537p c6537p2;
        C6925G c6925g;
        b.c<Nd.j> cVar2;
        K k12;
        wd.S s11;
        wd.S s12;
        boolean z11;
        wd.T t2;
        InterfaceC9839e interfaceC9839e;
        C6537p a12;
        wd.S c11;
        je.N k13;
        Intrinsics.checkNotNullParameter(proto, "proto");
        if (proto.f0()) {
            i11 = proto.U();
        } else {
            int X9 = proto.X();
            i11 = ((X9 >> 8) << 6) + (X9 & 63);
        }
        C6537p c6537p3 = this.f63161a;
        InterfaceC9845k e11 = c6537p3.e();
        InterfaceC10030h j11 = j(proto, i11, EnumC6525d.PROPERTY);
        EnumC9812C a13 = O.a(Pd.b.f22232e.c(i11));
        AbstractC9850p a14 = P.a(Pd.b.f22231d.c(i11));
        Boolean d11 = Pd.b.f22252y.d(i11);
        Intrinsics.checkNotNullExpressionValue(d11, "get(...)");
        boolean booleanValue = d11.booleanValue();
        Sd.f b12 = L.b(c6537p3.g(), proto.W());
        InterfaceC9836b.a b13 = P.b(Pd.b.f22243p.c(i11));
        Boolean d12 = Pd.b.f22216C.d(i11);
        Intrinsics.checkNotNullExpressionValue(d12, "get(...)");
        boolean booleanValue2 = d12.booleanValue();
        Boolean d13 = Pd.b.f22215B.d(i11);
        Intrinsics.checkNotNullExpressionValue(d13, "get(...)");
        boolean booleanValue3 = d13.booleanValue();
        Boolean d14 = Pd.b.f22218E.d(i11);
        Intrinsics.checkNotNullExpressionValue(d14, "get(...)");
        boolean booleanValue4 = d14.booleanValue();
        Boolean d15 = Pd.b.f22219F.d(i11);
        Intrinsics.checkNotNullExpressionValue(d15, "get(...)");
        boolean booleanValue5 = d15.booleanValue();
        Boolean d16 = Pd.b.f22220G.d(i11);
        Intrinsics.checkNotNullExpressionValue(d16, "get(...)");
        int i12 = i11;
        C6925G c6925g2 = new C6925G(e11, null, j11, a13, a14, booleanValue, b12, b13, booleanValue2, booleanValue3, booleanValue4, booleanValue5, d16.booleanValue(), proto, c6537p3.g(), c6537p3.j(), c6537p3.k(), c6537p3.d());
        List<Nd.r> e02 = proto.e0();
        Intrinsics.checkNotNullExpressionValue(e02, "getTypeParameterList(...)");
        a11 = c6537p3.a(c6925g2, e02, c6537p3.f63245b, c6537p3.f63247d, c6537p3.f63248e, c6537p3.f63249f);
        Boolean d17 = Pd.b.f22253z.d(i12);
        Intrinsics.checkNotNullExpressionValue(d17, "get(...)");
        boolean booleanValue6 = d17.booleanValue();
        if (booleanValue6) {
            Intrinsics.checkNotNullParameter(proto, "<this>");
            if (proto.j0() || proto.k0()) {
                k11 = this;
                b11 = new C6931a(c6537p3.h(), new G(k11, proto, EnumC6525d.PROPERTY_GETTER));
                je.N k14 = a11.i().k(Pd.f.d(proto, c6537p3.j()));
                List<i0> f7 = a11.i().f();
                InterfaceC9845k e12 = c6537p3.e();
                InterfaceC9839e interfaceC9839e2 = !(e12 instanceof InterfaceC9839e) ? (InterfaceC9839e) e12 : null;
                InterfaceC9834Z W11 = interfaceC9839e2 == null ? interfaceC9839e2.W() : null;
                Pd.g typeTable = c6537p3.j();
                Intrinsics.checkNotNullParameter(proto, "<this>");
                Intrinsics.checkNotNullParameter(typeTable, "typeTable");
                Nd.p Y11 = !proto.j0() ? proto.Y() : proto.k0() ? typeTable.a(proto.Z()) : null;
                wd.U h11 = (Y11 != null || (k13 = a11.i().k(Y11)) == null) ? null : Vd.h.h(c6925g2, k13, b11);
                Pd.g typeTable2 = c6537p3.j();
                Intrinsics.checkNotNullParameter(proto, "<this>");
                Intrinsics.checkNotNullParameter(typeTable2, "typeTable");
                S11 = proto.S();
                if (S11.isEmpty()) {
                    S11 = null;
                }
                if (S11 != null) {
                    List<Integer> R11 = proto.R();
                    Intrinsics.checkNotNullExpressionValue(R11, "getContextReceiverTypeIdList(...)");
                    List<Integer> list = R11;
                    c6537p = c6537p3;
                    ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                    for (Integer num : list) {
                        Intrinsics.f(num);
                        arrayList.add(typeTable2.a(num.intValue()));
                    }
                    S11 = arrayList;
                } else {
                    c6537p = c6537p3;
                }
                List<Nd.p> list2 = S11;
                ArrayList arrayList2 = new ArrayList(C7714v.z(list2, 10));
                int i13 = 0;
                for (it = list2.iterator(); it.hasNext(); it = it) {
                    Object next = it.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    arrayList2.add(Vd.h.b(c6925g2, a11.i().k((Nd.p) next), null, InterfaceC10030h.a.b(), i13));
                    i13 = i14;
                }
                c6925g2.P0(k14, f7, W11, h11, arrayList2);
                Boolean d18 = Pd.b.f22230c.d(i12);
                Intrinsics.checkNotNullExpressionValue(d18, "get(...)");
                boolean booleanValue7 = d18.booleanValue();
                b.c<Nd.w> cVar3 = Pd.b.f22231d;
                Nd.w c12 = cVar3.c(i12);
                b.c<Nd.j> cVar4 = Pd.b.f22232e;
                int b14 = Pd.b.b(booleanValue7, c12, cVar4.c(i12));
                d0 d0Var = d0.f99392a;
                if (booleanValue6) {
                    cVar = cVar3;
                    str = "get(...)";
                    c6537p2 = a11;
                    c6925g = c6925g2;
                    cVar2 = cVar4;
                    k12 = k11;
                    s11 = null;
                } else {
                    int V11 = proto.g0() ? proto.V() : b14;
                    Boolean d19 = Pd.b.f22224K.d(V11);
                    Intrinsics.checkNotNullExpressionValue(d19, "get(...)");
                    boolean booleanValue8 = d19.booleanValue();
                    Boolean d21 = Pd.b.f22225L.d(V11);
                    Intrinsics.checkNotNullExpressionValue(d21, "get(...)");
                    boolean booleanValue9 = d21.booleanValue();
                    Boolean d22 = Pd.b.f22226M.d(V11);
                    Intrinsics.checkNotNullExpressionValue(d22, "get(...)");
                    boolean booleanValue10 = d22.booleanValue();
                    InterfaceC10030h j12 = k11.j(proto, V11, EnumC6525d.PROPERTY_GETTER);
                    if (booleanValue8) {
                        InterfaceC9836b.a kind = c6925g2.getKind();
                        c6537p2 = a11;
                        str = "get(...)";
                        cVar2 = cVar4;
                        cVar = cVar3;
                        c6925g = c6925g2;
                        k12 = this;
                        c11 = new wd.S(c6925g, j12, O.a(cVar4.c(V11)), P.a(cVar3.c(V11)), !booleanValue8, booleanValue9, booleanValue10, kind, null, d0Var);
                    } else {
                        cVar = cVar3;
                        str = "get(...)";
                        c6537p2 = a11;
                        c6925g = c6925g2;
                        cVar2 = cVar4;
                        k12 = k11;
                        c11 = Vd.h.c(c6925g, j12);
                    }
                    s11 = c11;
                    s11.L0(c6925g.getReturnType());
                }
                if (Pd.b.f22214A.d(i12).booleanValue()) {
                    s12 = s11;
                    z11 = true;
                    t2 = null;
                } else {
                    if (proto.n0()) {
                        b14 = proto.c0();
                    }
                    int i15 = b14;
                    Boolean d23 = Pd.b.f22224K.d(i15);
                    Intrinsics.checkNotNullExpressionValue(d23, str);
                    boolean booleanValue11 = d23.booleanValue();
                    Boolean d24 = Pd.b.f22225L.d(i15);
                    Intrinsics.checkNotNullExpressionValue(d24, str);
                    boolean booleanValue12 = d24.booleanValue();
                    Boolean d25 = Pd.b.f22226M.d(i15);
                    Intrinsics.checkNotNullExpressionValue(d25, str);
                    boolean booleanValue13 = d25.booleanValue();
                    EnumC6525d enumC6525d = EnumC6525d.PROPERTY_SETTER;
                    InterfaceC10030h j13 = k12.j(proto, i15, enumC6525d);
                    if (booleanValue11) {
                        z11 = true;
                        s12 = s11;
                        wd.T t11 = new wd.T(c6925g, j13, O.a(cVar2.c(i15)), P.a(cVar.c(i15)), !booleanValue11, booleanValue12, booleanValue13, c6925g.getKind(), null, d0Var);
                        a12 = r5.a(t11, kotlin.collections.K.f71697a, r5.f63245b, r5.f63247d, r5.f63248e, c6537p2.f63249f);
                        t11.M0((p0) C7714v.B0(a12.f().p(C7714v.a0(proto.d0()), proto, enumC6525d)));
                        t2 = t11;
                    } else {
                        s12 = s11;
                        z11 = true;
                        t2 = Vd.h.d(c6925g, j13, InterfaceC10030h.a.b());
                    }
                }
                if (Pd.b.f22217D.d(i12).booleanValue()) {
                    c6925g.C0(null, new C6518C(k12, proto, c6925g));
                }
                InterfaceC9845k e13 = c6537p.e();
                interfaceC9839e = !(e13 instanceof InterfaceC9839e) ? (InterfaceC9839e) e13 : null;
                if ((interfaceC9839e == null ? interfaceC9839e.getKind() : null) == EnumC9840f.ANNOTATION_CLASS) {
                    c6925g.C0(null, new C6519D(k12, proto, c6925g));
                }
                c6925g.L0(s12, t2, new C10536w(k12.k(proto, false), c6925g), new C10536w(k12.k(proto, z11), c6925g));
                return c6925g;
            }
        }
        k11 = this;
        b11 = InterfaceC10030h.a.b();
        je.N k142 = a11.i().k(Pd.f.d(proto, c6537p3.j()));
        List<i0> f72 = a11.i().f();
        InterfaceC9845k e122 = c6537p3.e();
        if (!(e122 instanceof InterfaceC9839e)) {
        }
        if (interfaceC9839e2 == null) {
        }
        Pd.g typeTable3 = c6537p3.j();
        Intrinsics.checkNotNullParameter(proto, "<this>");
        Intrinsics.checkNotNullParameter(typeTable3, "typeTable");
        if (!proto.j0()) {
        }
        if (Y11 != null) {
        }
        Pd.g typeTable22 = c6537p3.j();
        Intrinsics.checkNotNullParameter(proto, "<this>");
        Intrinsics.checkNotNullParameter(typeTable22, "typeTable");
        S11 = proto.S();
        if (S11.isEmpty()) {
        }
        if (S11 != null) {
        }
        List<Nd.p> list22 = S11;
        ArrayList arrayList22 = new ArrayList(C7714v.z(list22, 10));
        int i132 = 0;
        while (it.hasNext()) {
        }
        c6925g2.P0(k142, f72, W11, h11, arrayList22);
        Boolean d182 = Pd.b.f22230c.d(i12);
        Intrinsics.checkNotNullExpressionValue(d182, "get(...)");
        boolean booleanValue72 = d182.booleanValue();
        b.c<Nd.w> cVar32 = Pd.b.f22231d;
        Nd.w c122 = cVar32.c(i12);
        b.c<Nd.j> cVar42 = Pd.b.f22232e;
        int b142 = Pd.b.b(booleanValue72, c122, cVar42.c(i12));
        d0 d0Var2 = d0.f99392a;
        if (booleanValue6) {
        }
        if (Pd.b.f22214A.d(i12).booleanValue()) {
        }
        if (Pd.b.f22217D.d(i12).booleanValue()) {
        }
        InterfaceC9845k e132 = c6537p.e();
        if (!(e132 instanceof InterfaceC9839e)) {
        }
        if ((interfaceC9839e == null ? interfaceC9839e.getKind() : null) == EnumC9840f.ANNOTATION_CLASS) {
        }
        c6925g.L0(s12, t2, new C10536w(k12.k(proto, false), c6925g), new C10536w(k12.k(proto, z11), c6925g));
        return c6925g;
    }

    @NotNull
    public final C6927I o(@NotNull Nd.q proto) {
        C6537p c6537p;
        C6537p a11;
        Nd.p a12;
        Nd.p a13;
        Intrinsics.checkNotNullParameter(proto, "proto");
        List<Nd.a> L11 = proto.L();
        Intrinsics.checkNotNullExpressionValue(L11, "getAnnotationList(...)");
        List<Nd.a> list = L11;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c6537p = this.f63161a;
            if (!hasNext) {
                break;
            }
            Nd.a aVar = (Nd.a) it.next();
            Intrinsics.f(aVar);
            arrayList.add(this.f63162b.a(aVar, c6537p.g()));
        }
        C6927I c6927i = new C6927I(c6537p.h(), c6537p.e(), InterfaceC10030h.a.a(arrayList), L.b(c6537p.g(), proto.Q()), P.a(Pd.b.f22231d.c(proto.P())), proto, c6537p.g(), c6537p.j(), c6537p.k(), c6537p.d());
        List<Nd.r> R11 = proto.R();
        Intrinsics.checkNotNullExpressionValue(R11, "getTypeParameterList(...)");
        a11 = c6537p.a(c6927i, R11, c6537p.f63245b, c6537p.f63247d, c6537p.f63248e, c6537p.f63249f);
        List<i0> f7 = a11.i().f();
        X i11 = a11.i();
        Pd.g typeTable = c6537p.j();
        Intrinsics.checkNotNullParameter(proto, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (proto.Y()) {
            a12 = proto.S();
            Intrinsics.checkNotNullExpressionValue(a12, "getUnderlyingType(...)");
        } else {
            if (!proto.Z()) {
                throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
            }
            a12 = typeTable.a(proto.T());
        }
        je.Y h11 = i11.h(a12, false);
        X i12 = a11.i();
        Pd.g typeTable2 = c6537p.j();
        Intrinsics.checkNotNullParameter(proto, "<this>");
        Intrinsics.checkNotNullParameter(typeTable2, "typeTable");
        if (proto.U()) {
            a13 = proto.N();
            Intrinsics.checkNotNullExpressionValue(a13, "getExpandedType(...)");
        } else {
            if (!proto.V()) {
                throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
            }
            a13 = typeTable2.a(proto.O());
        }
        c6927i.I0(f7, h11, i12.h(a13, false));
        return c6927i;
    }
}
