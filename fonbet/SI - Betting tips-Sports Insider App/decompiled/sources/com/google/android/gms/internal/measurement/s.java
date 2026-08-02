package com.google.android.gms.internal.measurement;

import bet.prediction.response.Prediction;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.C0122e9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5233a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5234b;

    public s(int i5) {
        this.f5234b = i5;
    }

    public static m c(com.google.firebase.messaging.x xVar, List list) {
        w wVar = w.ADD;
        ci.c.g0("FN", list, 2);
        n c2 = ((t) xVar.f6183b).c(xVar, (n) list.get(0));
        n c8 = ((t) xVar.f6183b).c(xVar, (n) list.get(1));
        if (!(c8 instanceof d)) {
            throw new IllegalArgumentException(androidx.appcompat.widget.c1.m("FN requires an ArrayValue of parameter names found ", c8.getClass().getCanonicalName()));
        }
        List j = ((d) c8).j();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new m(c2.h(), (ArrayList) j, arrayList, xVar);
    }

    public static boolean d(n nVar, n nVar2) {
        if (nVar instanceof j) {
            nVar = new q(nVar.h());
        }
        if (nVar2 instanceof j) {
            nVar2 = new q(nVar2.h());
        }
        if ((nVar instanceof q) && (nVar2 instanceof q)) {
            return ((q) nVar).f5186a.compareTo(((q) nVar2).f5186a) < 0;
        }
        double doubleValue = nVar.d().doubleValue();
        double doubleValue2 = nVar2.d().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == 0.0d) || ((doubleValue == 0.0d && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    public static n e(v vVar, n nVar, n nVar2) {
        if (nVar instanceof Iterable) {
            return g(vVar, ((Iterable) nVar).iterator(), nVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static boolean f(n nVar, n nVar2) {
        if (nVar.getClass().equals(nVar2.getClass())) {
            if ((nVar instanceof r) || (nVar instanceof l)) {
                return true;
            }
            return nVar instanceof g ? (Double.isNaN(nVar.d().doubleValue()) || Double.isNaN(nVar2.d().doubleValue()) || nVar.d().doubleValue() != nVar2.d().doubleValue()) ? false : true : nVar instanceof q ? nVar.h().equals(nVar2.h()) : nVar instanceof e ? nVar.c().equals(nVar2.c()) : nVar == nVar2;
        }
        if (((nVar instanceof r) || (nVar instanceof l)) && ((nVar2 instanceof r) || (nVar2 instanceof l))) {
            return true;
        }
        boolean z5 = nVar instanceof g;
        if (z5 && (nVar2 instanceof q)) {
            return f(nVar, new g(nVar2.d()));
        }
        boolean z7 = nVar instanceof q;
        if (z7 && (nVar2 instanceof g)) {
            return f(new g(nVar.d()), nVar2);
        }
        if (nVar instanceof e) {
            return f(new g(nVar.d()), nVar2);
        }
        if (nVar2 instanceof e) {
            return f(nVar, new g(nVar2.d()));
        }
        if ((z7 || z5) && (nVar2 instanceof j)) {
            return f(nVar, new q(nVar2.h()));
        }
        if ((nVar instanceof j) && ((nVar2 instanceof q) || (nVar2 instanceof g))) {
            return f(new q(nVar.h()), nVar2);
        }
        return false;
    }

    public static n g(v vVar, Iterator it, n nVar) {
        com.google.firebase.messaging.x W;
        if (it != null) {
            while (it.hasNext()) {
                n nVar2 = (n) it.next();
                switch (vVar.f5279a) {
                    case 0:
                        W = vVar.f5280b.W();
                        String str = vVar.f5281c;
                        W.Z(str, nVar2);
                        ((HashMap) W.f6185d).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        W = vVar.f5280b.W();
                        W.Z(vVar.f5281c, nVar2);
                        break;
                    default:
                        W = vVar.f5280b;
                        W.Z(vVar.f5281c, nVar2);
                        break;
                }
                n U = W.U((d) nVar);
                if (U instanceof f) {
                    f fVar = (f) U;
                    String str2 = fVar.f5037b;
                    if ("break".equals(str2)) {
                        return n.S;
                    }
                    if (Prediction.RETURN.equals(str2)) {
                        return fVar;
                    }
                }
            }
        }
        return n.S;
    }

    public static boolean h(n nVar, n nVar2) {
        if (nVar instanceof j) {
            nVar = new q(nVar.h());
        }
        if (nVar2 instanceof j) {
            nVar2 = new q(nVar2.h());
        }
        return (((nVar instanceof q) && (nVar2 instanceof q)) || !(Double.isNaN(nVar.d().doubleValue()) || Double.isNaN(nVar2.d().doubleValue()))) && !d(nVar2, nVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:361:0x090d, code lost:
    
        if (bet.prediction.response.Prediction.RETURN.equals(r4) != false) goto L303;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n a(String str, com.google.firebase.messaging.x xVar, ArrayList arrayList) {
        boolean f6;
        boolean f10;
        f fVar;
        n qVar;
        n c2;
        n c8;
        String str2;
        int i5 = 0;
        switch (this.f5234b) {
            case 0:
                w wVar = w.ADD;
                switch (ci.c.j0(str).ordinal()) {
                    case 4:
                        ci.c.f0("BITWISE_AND", arrayList, 2);
                        return new g(Double.valueOf(ci.c.l0(((t) xVar.f6183b).c(xVar, (n) arrayList.get(0)).d().doubleValue()) & ci.c.l0(((t) xVar.f6183b).c(xVar, (n) arrayList.get(1)).d().doubleValue())));
                    case 5:
                        ci.c.f0("BITWISE_LEFT_SHIFT", arrayList, 2);
                        return new g(Double.valueOf(ci.c.l0(((t) xVar.f6183b).c(xVar, (n) arrayList.get(0)).d().doubleValue()) << ((int) (ci.c.l0(((t) xVar.f6183b).c(xVar, (n) arrayList.get(1)).d().doubleValue()) & 31))));
                    case 6:
                        ci.c.f0("BITWISE_NOT", arrayList, 1);
                        return new g(Double.valueOf(~ci.c.l0(((t) xVar.f6183b).c(xVar, (n) arrayList.get(0)).d().doubleValue())));
                    case 7:
                        ci.c.f0("BITWISE_OR", arrayList, 2);
                        return new g(Double.valueOf(ci.c.l0(((t) xVar.f6183b).c(xVar, (n) arrayList.get(0)).d().doubleValue()) | ci.c.l0(((t) xVar.f6183b).c(xVar, (n) arrayList.get(1)).d().doubleValue())));
                    case 8:
                        ci.c.f0("BITWISE_RIGHT_SHIFT", arrayList, 2);
                        return new g(Double.valueOf(ci.c.l0(((t) xVar.f6183b).c(xVar, (n) arrayList.get(0)).d().doubleValue()) >> ((int) (ci.c.l0(((t) xVar.f6183b).c(xVar, (n) arrayList.get(1)).d().doubleValue()) & 31))));
                    case 9:
                        ci.c.f0("BITWISE_UNSIGNED_RIGHT_SHIFT", arrayList, 2);
                        return new g(Double.valueOf((ci.c.l0(((t) xVar.f6183b).c(xVar, (n) arrayList.get(0)).d().doubleValue()) & 4294967295L) >>> ((int) (ci.c.l0(((t) xVar.f6183b).c(xVar, (n) arrayList.get(1)).d().doubleValue()) & 31))));
                    case 10:
                        ci.c.f0("BITWISE_XOR", arrayList, 2);
                        return new g(Double.valueOf(ci.c.l0(((t) xVar.f6183b).c(xVar, (n) arrayList.get(0)).d().doubleValue()) ^ ci.c.l0(((t) xVar.f6183b).c(xVar, (n) arrayList.get(1)).d().doubleValue())));
                    default:
                        b(str);
                        throw null;
                }
            case 1:
                ci.c.f0(ci.c.j0(str).name(), arrayList, 2);
                n c10 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(0));
                n c11 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(1));
                int ordinal = ci.c.j0(str).ordinal();
                if (ordinal != 23) {
                    if (ordinal == 48) {
                        f10 = f(c10, c11);
                    } else if (ordinal == 42) {
                        f6 = d(c10, c11);
                    } else if (ordinal != 43) {
                        switch (ordinal) {
                            case 37:
                                f6 = d(c11, c10);
                                break;
                            case C0122e9.K /* 38 */:
                                f6 = h(c11, c10);
                                break;
                            case 39:
                                f6 = ci.c.k0(c10, c11);
                                break;
                            case 40:
                                f10 = ci.c.k0(c10, c11);
                                break;
                            default:
                                b(str);
                                throw null;
                        }
                    } else {
                        f6 = h(c10, c11);
                    }
                    f6 = !f10;
                } else {
                    f6 = f(c10, c11);
                }
                return f6 ? n.f5144a0 : n.f5145b0;
            case 2:
                w wVar2 = w.ADD;
                int ordinal2 = ci.c.j0(str).ordinal();
                if (ordinal2 == 2) {
                    ci.c.f0("APPLY", arrayList, 3);
                    n nVar = (n) arrayList.get(0);
                    t tVar = (t) xVar.f6183b;
                    t tVar2 = (t) xVar.f6183b;
                    n c12 = tVar.c(xVar, nVar);
                    String h10 = tVar2.c(xVar, (n) arrayList.get(1)).h();
                    n c13 = tVar2.c(xVar, (n) arrayList.get(2));
                    if (!(c13 instanceof d)) {
                        throw new IllegalArgumentException(androidx.appcompat.widget.c1.m("Function arguments for Apply are not a list found ", c13.getClass().getCanonicalName()));
                    }
                    if (h10.isEmpty()) {
                        throw new IllegalArgumentException("Function name for apply is undefined");
                    }
                    return c12.f(h10, xVar, (ArrayList) ((d) c13).j());
                }
                if (ordinal2 == 15) {
                    ci.c.f0("BREAK", arrayList, 0);
                    return n.U;
                }
                if (ordinal2 == 25) {
                    return c(xVar, arrayList);
                }
                if (ordinal2 == 41) {
                    ci.c.g0("IF", arrayList, 2);
                    n nVar2 = (n) arrayList.get(0);
                    t tVar3 = (t) xVar.f6183b;
                    t tVar4 = (t) xVar.f6183b;
                    n c14 = tVar3.c(xVar, nVar2);
                    n c15 = tVar4.c(xVar, (n) arrayList.get(1));
                    n c16 = arrayList.size() > 2 ? tVar4.c(xVar, (n) arrayList.get(2)) : null;
                    n nVar3 = n.S;
                    n U = c14.c().booleanValue() ? xVar.U((d) c15) : c16 != null ? xVar.U((d) c16) : nVar3;
                    return true != (U instanceof f) ? nVar3 : U;
                }
                if (ordinal2 == 54) {
                    return new d(arrayList);
                }
                if (ordinal2 == 57) {
                    if (arrayList.isEmpty()) {
                        return n.W;
                    }
                    ci.c.f0("RETURN", arrayList, 1);
                    return new f(Prediction.RETURN, ((t) xVar.f6183b).c(xVar, (n) arrayList.get(0)));
                }
                if (ordinal2 != 19) {
                    if (ordinal2 == 20) {
                        ci.c.g0("DEFINE_FUNCTION", arrayList, 2);
                        m c17 = c(xVar, arrayList);
                        String str3 = c17.f5067a;
                        if (str3 == null) {
                            xVar.Y("", c17);
                            return c17;
                        }
                        xVar.Y(str3, c17);
                        return c17;
                    }
                    if (ordinal2 == 60) {
                        ci.c.f0("SWITCH", arrayList, 3);
                        n nVar4 = (n) arrayList.get(0);
                        t tVar5 = (t) xVar.f6183b;
                        t tVar6 = (t) xVar.f6183b;
                        n c18 = tVar5.c(xVar, nVar4);
                        n c19 = tVar6.c(xVar, (n) arrayList.get(1));
                        n c20 = tVar6.c(xVar, (n) arrayList.get(2));
                        if (!(c19 instanceof d)) {
                            throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                        }
                        if (!(c20 instanceof d)) {
                            throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                        }
                        d dVar = (d) c19;
                        d dVar2 = (d) c20;
                        boolean z5 = false;
                        for (int i10 = 0; i10 < dVar.m(); i10++) {
                            if (z5 || c18.equals(tVar6.c(xVar, dVar.o(i10)))) {
                                n c21 = tVar6.c(xVar, dVar2.o(i10));
                                if (c21 instanceof f) {
                                    return ((f) c21).f5037b.equals("break") ? n.S : c21;
                                }
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                        }
                        if (dVar.m() + 1 == dVar2.m()) {
                            n c22 = tVar6.c(xVar, dVar2.o(dVar.m()));
                            if (c22 instanceof f) {
                                String str4 = ((f) c22).f5037b;
                                if (str4.equals(Prediction.RETURN) || str4.equals("continue")) {
                                    return c22;
                                }
                            }
                        }
                        return n.S;
                    }
                    if (ordinal2 == 61) {
                        ci.c.f0("TERNARY", arrayList, 3);
                        n nVar5 = (n) arrayList.get(0);
                        t tVar7 = (t) xVar.f6183b;
                        t tVar8 = (t) xVar.f6183b;
                        return tVar7.c(xVar, nVar5).c().booleanValue() ? tVar8.c(xVar, (n) arrayList.get(1)) : tVar8.c(xVar, (n) arrayList.get(2));
                    }
                    switch (ordinal2) {
                        case 11:
                            return xVar.W().U(new d(arrayList));
                        case 12:
                            ci.c.f0("BREAK", arrayList, 0);
                            return n.V;
                        case 13:
                            break;
                        default:
                            b(str);
                            throw null;
                    }
                }
                if (arrayList.isEmpty()) {
                    return n.S;
                }
                n c23 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(0));
                return c23 instanceof d ? xVar.U((d) c23) : n.S;
            case 3:
                w wVar3 = w.ADD;
                int ordinal3 = ci.c.j0(str).ordinal();
                if (ordinal3 == 1) {
                    ci.c.f0("AND", arrayList, 2);
                    n c24 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(0));
                    return c24.c().booleanValue() ? ((t) xVar.f6183b).c(xVar, (n) arrayList.get(1)) : c24;
                }
                if (ordinal3 == 47) {
                    ci.c.f0("NOT", arrayList, 1);
                    return new e(Boolean.valueOf(!((t) xVar.f6183b).c(xVar, (n) arrayList.get(0)).c().booleanValue()));
                }
                if (ordinal3 != 50) {
                    b(str);
                    throw null;
                }
                ci.c.f0("OR", arrayList, 2);
                n c25 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(0));
                return !c25.c().booleanValue() ? ((t) xVar.f6183b).c(xVar, (n) arrayList.get(1)) : c25;
            case 4:
                w wVar4 = w.ADD;
                int ordinal4 = ci.c.j0(str).ordinal();
                if (ordinal4 == 65) {
                    ci.c.f0("WHILE", arrayList, 4);
                    n nVar6 = (n) arrayList.get(0);
                    n nVar7 = (n) arrayList.get(1);
                    n nVar8 = (n) arrayList.get(2);
                    n nVar9 = (n) arrayList.get(3);
                    t tVar9 = (t) xVar.f6183b;
                    t tVar10 = (t) xVar.f6183b;
                    n c26 = tVar9.c(xVar, nVar9);
                    if (tVar10.c(xVar, nVar8).c().booleanValue()) {
                        n U2 = xVar.U((d) c26);
                        if (U2 instanceof f) {
                            fVar = (f) U2;
                            String str5 = fVar.f5037b;
                            if ("break".equals(str5)) {
                                return n.S;
                            }
                            break;
                        }
                    }
                    while (tVar10.c(xVar, nVar6).c().booleanValue()) {
                        n U3 = xVar.U((d) c26);
                        if (U3 instanceof f) {
                            fVar = (f) U3;
                            String str6 = fVar.f5037b;
                            if ("break".equals(str6)) {
                                return n.S;
                            }
                            if (Prediction.RETURN.equals(str6)) {
                            }
                        }
                        xVar.S(nVar7);
                    }
                    return n.S;
                }
                switch (ordinal4) {
                    case C0122e9.G /* 26 */:
                        ci.c.f0("FOR_IN", arrayList, 3);
                        if (!(arrayList.get(0) instanceof q)) {
                            throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                        }
                        String h11 = ((n) arrayList.get(0)).h();
                        n c27 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(1));
                        n c28 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(2));
                        Iterator e7 = c27.e();
                        if (e7 != null) {
                            while (e7.hasNext()) {
                                xVar.Z(h11, (n) e7.next());
                                n U4 = xVar.U((d) c28);
                                if (U4 instanceof f) {
                                    fVar = (f) U4;
                                    String str7 = fVar.f5037b;
                                    if ("break".equals(str7)) {
                                        return n.S;
                                    }
                                    if (Prediction.RETURN.equals(str7)) {
                                        break;
                                    }
                                }
                            }
                        }
                        return n.S;
                    case C0122e9.H /* 27 */:
                        ci.c.f0("FOR_IN_CONST", arrayList, 3);
                        if (arrayList.get(0) instanceof q) {
                            return g(new v(xVar, ((n) arrayList.get(0)).h(), 0), ((t) xVar.f6183b).c(xVar, (n) arrayList.get(1)).e(), ((t) xVar.f6183b).c(xVar, (n) arrayList.get(2)));
                        }
                        throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                    case 28:
                        ci.c.f0("FOR_IN_LET", arrayList, 3);
                        if (!(arrayList.get(0) instanceof q)) {
                            throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                        }
                        String h12 = ((n) arrayList.get(0)).h();
                        n c29 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(1));
                        n c30 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(2));
                        Iterator e9 = c29.e();
                        if (e9 != null) {
                            while (e9.hasNext()) {
                                n nVar10 = (n) e9.next();
                                com.google.firebase.messaging.x W = xVar.W();
                                W.Z(h12, nVar10);
                                n U5 = W.U((d) c30);
                                if (U5 instanceof f) {
                                    fVar = (f) U5;
                                    String str8 = fVar.f5037b;
                                    if ("break".equals(str8)) {
                                        return n.S;
                                    }
                                    if (Prediction.RETURN.equals(str8)) {
                                        break;
                                    }
                                }
                            }
                        }
                        return n.S;
                    case C0122e9.I /* 29 */:
                        ci.c.f0("FOR_LET", arrayList, 4);
                        n nVar11 = (n) arrayList.get(0);
                        t tVar11 = (t) xVar.f6183b;
                        t tVar12 = (t) xVar.f6183b;
                        n c31 = tVar11.c(xVar, nVar11);
                        if (!(c31 instanceof d)) {
                            throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                        }
                        d dVar3 = (d) c31;
                        n nVar12 = (n) arrayList.get(1);
                        n nVar13 = (n) arrayList.get(2);
                        n c32 = tVar12.c(xVar, (n) arrayList.get(3));
                        com.google.firebase.messaging.x W2 = xVar.W();
                        for (int i11 = 0; i11 < dVar3.m(); i11++) {
                            String h13 = dVar3.o(i11).h();
                            W2.Y(h13, xVar.a0(h13));
                        }
                        while (tVar12.c(xVar, nVar12).c().booleanValue()) {
                            n U6 = xVar.U((d) c32);
                            if (U6 instanceof f) {
                                f fVar2 = (f) U6;
                                String str9 = fVar2.f5037b;
                                if ("break".equals(str9)) {
                                    return n.S;
                                }
                                if (Prediction.RETURN.equals(str9)) {
                                    return fVar2;
                                }
                            }
                            com.google.firebase.messaging.x W3 = xVar.W();
                            for (int i12 = 0; i12 < dVar3.m(); i12++) {
                                String h14 = dVar3.o(i12).h();
                                W3.Y(h14, W2.a0(h14));
                            }
                            W3.S(nVar13);
                            W2 = W3;
                        }
                        return n.S;
                    case 30:
                        ci.c.f0("FOR_OF", arrayList, 3);
                        if (arrayList.get(0) instanceof q) {
                            return e(new v(xVar, ((n) arrayList.get(0)).h(), 2), ((t) xVar.f6183b).c(xVar, (n) arrayList.get(1)), ((t) xVar.f6183b).c(xVar, (n) arrayList.get(2)));
                        }
                        throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                    case 31:
                        ci.c.f0("FOR_OF_CONST", arrayList, 3);
                        if (arrayList.get(0) instanceof q) {
                            return e(new v(xVar, ((n) arrayList.get(0)).h(), 0), ((t) xVar.f6183b).c(xVar, (n) arrayList.get(1)), ((t) xVar.f6183b).c(xVar, (n) arrayList.get(2)));
                        }
                        throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                    case 32:
                        ci.c.f0("FOR_OF_LET", arrayList, 3);
                        if (arrayList.get(0) instanceof q) {
                            return e(new v(xVar, ((n) arrayList.get(0)).h(), 1), ((t) xVar.f6183b).c(xVar, (n) arrayList.get(1)), ((t) xVar.f6183b).c(xVar, (n) arrayList.get(2)));
                        }
                        throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                    default:
                        b(str);
                        throw null;
                }
                return fVar;
            case 5:
                w wVar5 = w.ADD;
                int ordinal5 = ci.c.j0(str).ordinal();
                if (ordinal5 == 0) {
                    ci.c.f0("ADD", arrayList, 2);
                    n c33 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(0));
                    n c34 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(1));
                    qVar = ((c33 instanceof j) || (c33 instanceof q) || (c34 instanceof j) || (c34 instanceof q)) ? new q(String.valueOf(c33.h()).concat(String.valueOf(c34.h()))) : new g(Double.valueOf(c34.d().doubleValue() + c33.d().doubleValue()));
                } else {
                    if (ordinal5 == 21) {
                        ci.c.f0("DIVIDE", arrayList, 2);
                        return new g(Double.valueOf(((t) xVar.f6183b).c(xVar, (n) arrayList.get(0)).d().doubleValue() / ((t) xVar.f6183b).c(xVar, (n) arrayList.get(1)).d().doubleValue()));
                    }
                    if (ordinal5 == 59) {
                        ci.c.f0("SUBTRACT", arrayList, 2);
                        return new g(Double.valueOf(((t) xVar.f6183b).c(xVar, (n) arrayList.get(0)).d().doubleValue() + (-((t) xVar.f6183b).c(xVar, (n) arrayList.get(1)).d().doubleValue())));
                    }
                    if (ordinal5 == 52 || ordinal5 == 53) {
                        ci.c.f0(str, arrayList, 2);
                        n c35 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(0));
                        xVar.S((n) arrayList.get(1));
                        return c35;
                    }
                    if (ordinal5 == 55 || ordinal5 == 56) {
                        ci.c.f0(str, arrayList, 1);
                        return ((t) xVar.f6183b).c(xVar, (n) arrayList.get(0));
                    }
                    switch (ordinal5) {
                        case 44:
                            ci.c.f0("MODULUS", arrayList, 2);
                            return new g(Double.valueOf(((t) xVar.f6183b).c(xVar, (n) arrayList.get(0)).d().doubleValue() % ((t) xVar.f6183b).c(xVar, (n) arrayList.get(1)).d().doubleValue()));
                        case 45:
                            ci.c.f0("MULTIPLY", arrayList, 2);
                            qVar = new g(Double.valueOf(((t) xVar.f6183b).c(xVar, (n) arrayList.get(1)).d().doubleValue() * ((t) xVar.f6183b).c(xVar, (n) arrayList.get(0)).d().doubleValue()));
                            break;
                        case 46:
                            ci.c.f0("NEGATE", arrayList, 1);
                            return new g(Double.valueOf(-((t) xVar.f6183b).c(xVar, (n) arrayList.get(0)).d().doubleValue()));
                        default:
                            b(str);
                            throw null;
                    }
                }
                return qVar;
            case 6:
                if (str == null || str.isEmpty() || !xVar.X(str)) {
                    throw new IllegalArgumentException(androidx.appcompat.widget.c1.m("Command not found: ", str));
                }
                n a02 = xVar.a0(str);
                if (a02 instanceof h) {
                    return ((h) a02).j(xVar, arrayList);
                }
                throw new IllegalArgumentException(androidx.appcompat.widget.c1.n("Function ", str, " is not defined"));
            default:
                w wVar6 = w.ADD;
                int ordinal6 = ci.c.j0(str).ordinal();
                if (ordinal6 != 3) {
                    if (ordinal6 == 14) {
                        ci.c.g0("CONST", arrayList, 2);
                        if (arrayList.size() % 2 != 0) {
                            throw new IllegalArgumentException(androidx.appcompat.widget.c1.i(arrayList.size(), "CONST requires an even number of arguments, found "));
                        }
                        while (i5 < arrayList.size() - 1) {
                            n c36 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(i5));
                            if (!(c36 instanceof q)) {
                                throw new IllegalArgumentException(androidx.appcompat.widget.c1.m("Expected string for const name. got ", c36.getClass().getCanonicalName()));
                            }
                            String str10 = ((q) c36).f5186a;
                            xVar.Z(str10, ((t) xVar.f6183b).c(xVar, (n) arrayList.get(i5 + 1)));
                            ((HashMap) xVar.f6185d).put(str10, Boolean.TRUE);
                            i5 += 2;
                        }
                        return n.S;
                    }
                    if (ordinal6 == 24) {
                        ci.c.g0("EXPRESSION_LIST", arrayList, 1);
                        n nVar14 = n.S;
                        while (i5 < arrayList.size()) {
                            nVar14 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(i5));
                            if (nVar14 instanceof f) {
                                throw new IllegalStateException("ControlValue cannot be in an expression list");
                            }
                            i5++;
                        }
                        return nVar14;
                    }
                    if (ordinal6 == 33) {
                        ci.c.f0("GET", arrayList, 1);
                        n c37 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(0));
                        if (c37 instanceof q) {
                            return xVar.a0(((q) c37).f5186a);
                        }
                        throw new IllegalArgumentException(androidx.appcompat.widget.c1.m("Expected string for get var. got ", c37.getClass().getCanonicalName()));
                    }
                    if (ordinal6 == 49) {
                        ci.c.f0("NULL", arrayList, 0);
                        return n.T;
                    }
                    if (ordinal6 == 58) {
                        ci.c.f0("SET_PROPERTY", arrayList, 3);
                        n nVar15 = (n) arrayList.get(0);
                        t tVar13 = (t) xVar.f6183b;
                        t tVar14 = (t) xVar.f6183b;
                        n c38 = tVar13.c(xVar, nVar15);
                        n c39 = tVar14.c(xVar, (n) arrayList.get(1));
                        c8 = tVar14.c(xVar, (n) arrayList.get(2));
                        if (c38 == n.S || c38 == n.T) {
                            throw new IllegalStateException(androidx.appcompat.widget.c1.o("Can't set property ", c39.h(), " of ", c38.h()));
                        }
                        if ((c38 instanceof d) && (c39 instanceof g)) {
                            ((d) c38).p(((g) c39).f5049a.intValue(), c8);
                        } else if (c38 instanceof j) {
                            ((j) c38).b(c39.h(), c8);
                        }
                    } else {
                        if (ordinal6 == 17) {
                            if (arrayList.isEmpty()) {
                                return new d();
                            }
                            d dVar4 = new d();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                n c40 = ((t) xVar.f6183b).c(xVar, (n) it.next());
                                if (c40 instanceof f) {
                                    throw new IllegalStateException("Failed to evaluate array element");
                                }
                                dVar4.p(i5, c40);
                                i5++;
                            }
                            return dVar4;
                        }
                        if (ordinal6 == 18) {
                            if (arrayList.isEmpty()) {
                                return new k();
                            }
                            if (arrayList.size() % 2 != 0) {
                                throw new IllegalArgumentException(androidx.appcompat.widget.c1.i(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                            }
                            k kVar = new k();
                            while (i5 < arrayList.size() - 1) {
                                n c41 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(i5));
                                n c42 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(i5 + 1));
                                if ((c41 instanceof f) || (c42 instanceof f)) {
                                    throw new IllegalStateException("Failed to evaluate map entry");
                                }
                                kVar.b(c41.h(), c42);
                                i5 += 2;
                            }
                            return kVar;
                        }
                        if (ordinal6 == 35 || ordinal6 == 36) {
                            ci.c.f0("GET_PROPERTY", arrayList, 2);
                            n c43 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(0));
                            n c44 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(1));
                            if ((c43 instanceof d) && ci.c.i0(c44)) {
                                return ((d) c43).o(c44.d().intValue());
                            }
                            if (c43 instanceof j) {
                                return ((j) c43).a(c44.h());
                            }
                            if (c43 instanceof q) {
                                if ("length".equals(c44.h())) {
                                    c8 = new g(Double.valueOf(((q) c43).f5186a.length()));
                                } else if (ci.c.i0(c44)) {
                                    double doubleValue = c44.d().doubleValue();
                                    String str11 = ((q) c43).f5186a;
                                    if (doubleValue < str11.length()) {
                                        c2 = new q(String.valueOf(str11.charAt(c44.d().intValue())));
                                    }
                                }
                            }
                            return n.S;
                        }
                        switch (ordinal6) {
                            case 62:
                                ci.c.f0("TYPEOF", arrayList, 1);
                                n c45 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(0));
                                if (c45 instanceof r) {
                                    str2 = StringUtils.UNDEFINED;
                                } else if (c45 instanceof e) {
                                    str2 = "boolean";
                                } else if (c45 instanceof g) {
                                    str2 = "number";
                                } else if (c45 instanceof q) {
                                    str2 = "string";
                                } else if (c45 instanceof m) {
                                    str2 = "function";
                                } else {
                                    if ((c45 instanceof o) || (c45 instanceof f)) {
                                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", c45));
                                    }
                                    str2 = "object";
                                }
                                c8 = new q(str2);
                                break;
                            case 63:
                                ci.c.f0("UNDEFINED", arrayList, 0);
                                return n.S;
                            case 64:
                                ci.c.g0("VAR", arrayList, 1);
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    n c46 = ((t) xVar.f6183b).c(xVar, (n) it2.next());
                                    if (!(c46 instanceof q)) {
                                        throw new IllegalArgumentException(androidx.appcompat.widget.c1.m("Expected string for var name. got ", c46.getClass().getCanonicalName()));
                                    }
                                    xVar.Z(((q) c46).f5186a, n.S);
                                }
                                return n.S;
                            default:
                                b(str);
                                throw null;
                        }
                    }
                    return c8;
                }
                ci.c.f0("ASSIGN", arrayList, 2);
                n c47 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(0));
                if (!(c47 instanceof q)) {
                    throw new IllegalArgumentException(androidx.appcompat.widget.c1.m("Expected string for assign var. got ", c47.getClass().getCanonicalName()));
                }
                String str12 = ((q) c47).f5186a;
                if (!xVar.X(str12)) {
                    throw new IllegalArgumentException(androidx.appcompat.widget.c1.m("Attempting to assign undefined value ", str12));
                }
                c2 = ((t) xVar.f6183b).c(xVar, (n) arrayList.get(1));
                xVar.Y(str12, c2);
                return c2;
        }
    }

    public final void b(String str) {
        if (!this.f5233a.contains(ci.c.j0(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
