package com.google.android.gms.internal.measurement;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements Iterable, n, j {

    /* renamed from: a, reason: collision with root package name */
    public final TreeMap f4957a;

    /* renamed from: b, reason: collision with root package name */
    public final TreeMap f4958b;

    public d() {
        this.f4957a = new TreeMap();
        this.f4958b = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n a(String str) {
        n nVar;
        return "length".equals(str) ? new g(Double.valueOf(m())) : (!g(str) || (nVar = (n) this.f4958b.get(str)) == null) ? n.S : nVar;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final void b(String str, n nVar) {
        TreeMap treeMap = this.f4958b;
        if (nVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, nVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean c() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double d() {
        TreeMap treeMap = this.f4957a;
        return treeMap.size() == 1 ? o(0).d() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator e() {
        return new c(this, this.f4957a.keySet().iterator(), this.f4958b.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (m() != dVar.m()) {
            return false;
        }
        TreeMap treeMap = this.f4957a;
        if (treeMap.isEmpty()) {
            return dVar.f4957a.isEmpty();
        }
        for (int intValue = ((Integer) treeMap.firstKey()).intValue(); intValue <= ((Integer) treeMap.lastKey()).intValue(); intValue++) {
            if (!o(intValue).equals(dVar.o(intValue))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02e5, code lost:
    
        if (y4.a.J(r7, r2, (com.google.android.gms.internal.measurement.m) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).m() == r7.m()) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f7  */
    @Override // com.google.android.gms.internal.measurement.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n f(String str, com.google.firebase.messaging.x xVar, ArrayList arrayList) {
        String str2;
        String str3;
        Object obj;
        String str4;
        com.google.firebase.messaging.x xVar2;
        String str5;
        Object obj2;
        d dVar;
        ArrayList arrayList2;
        int hashCode;
        TreeMap treeMap;
        double d10;
        double d11;
        String str6;
        double d12;
        String str7 = "toString";
        String str8 = "splice";
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str)) {
            str3 = "filter";
            str4 = "sort";
            if (str4.equals(str)) {
                str2 = "lastIndexOf";
                obj2 = "reduce";
            } else {
                obj2 = "reduce";
                if (str8.equals(str)) {
                    str2 = "lastIndexOf";
                    str8 = str8;
                } else {
                    str8 = str8;
                    if (str7.equals(str)) {
                        str2 = "lastIndexOf";
                        str7 = str7;
                    } else {
                        str7 = str7;
                        if (!"unshift".equals(str)) {
                            return androidx.appcompat.widget.c1.B(this, new q(str), xVar, arrayList);
                        }
                        str2 = "lastIndexOf";
                        str5 = "forEach";
                        obj = "unshift";
                        dVar = this;
                        xVar2 = xVar;
                    }
                }
            }
            obj = "unshift";
            xVar2 = xVar;
            arrayList2 = arrayList;
            str5 = "forEach";
            dVar = this;
            Double valueOf = Double.valueOf(-1.0d);
            hashCode = str.hashCode();
            TreeMap treeMap2 = dVar.f4957a;
            n nVar = n.S;
            TreeMap treeMap3 = treeMap2;
            h hVar = null;
            switch (hashCode) {
                case -1776922004:
                    String str9 = str7;
                    if (str.equals(str9)) {
                        ci.c.f0(str9, arrayList2, 0);
                        return new q(dVar.t(StringUtils.COMMA));
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -1354795244:
                    if (str.equals("concat")) {
                        d dVar2 = (d) dVar.i();
                        if (!arrayList2.isEmpty()) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                n c2 = ((t) xVar2.f6183b).c(xVar2, (n) it.next());
                                if (c2 instanceof f) {
                                    throw new IllegalStateException("Failed evaluation of arguments");
                                }
                                int m6 = dVar2.m();
                                if (c2 instanceof d) {
                                    d dVar3 = (d) c2;
                                    Iterator l6 = dVar3.l();
                                    while (l6.hasNext()) {
                                        Integer num = (Integer) l6.next();
                                        dVar2.p(num.intValue() + m6, dVar3.o(num.intValue()));
                                    }
                                } else {
                                    dVar2.p(m6, c2);
                                }
                            }
                        }
                        return dVar2;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -1274492040:
                    String str10 = str3;
                    if (str.equals(str10)) {
                        ci.c.f0(str10, arrayList2, 1);
                        n c8 = ((t) xVar2.f6183b).c(xVar2, (n) arrayList2.get(0));
                        if (!(c8 instanceof m)) {
                            throw new IllegalArgumentException("Callback should be a method");
                        }
                        if (treeMap3.size() == 0) {
                            return new d();
                        }
                        d dVar4 = (d) dVar.i();
                        d J = y4.a.J(dVar, xVar2, (m) c8, null, Boolean.TRUE);
                        d dVar5 = new d();
                        Iterator l10 = J.l();
                        while (l10.hasNext()) {
                            dVar5.p(dVar5.m(), dVar4.o(((Integer) l10.next()).intValue()));
                        }
                        return dVar5;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -934873754:
                    if (str.equals(obj2)) {
                        return y4.a.H(dVar, xVar2, arrayList2, true);
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -895859076:
                    if (str.equals(str8)) {
                        if (arrayList2.isEmpty()) {
                            return new d();
                        }
                        n nVar2 = (n) arrayList2.get(0);
                        t tVar = (t) xVar2.f6183b;
                        t tVar2 = (t) xVar2.f6183b;
                        int m02 = (int) ci.c.m0(tVar.c(xVar2, nVar2).d().doubleValue());
                        if (m02 < 0) {
                            m02 = Math.max(0, dVar.m() + m02);
                        } else if (m02 > dVar.m()) {
                            m02 = dVar.m();
                        }
                        int m10 = dVar.m();
                        d dVar6 = new d();
                        if (arrayList2.size() > 1) {
                            int max = Math.max(0, (int) ci.c.m0(tVar2.c(xVar2, (n) arrayList2.get(1)).d().doubleValue()));
                            if (max > 0) {
                                for (int i5 = m02; i5 < Math.min(m10, m02 + max); i5++) {
                                    dVar6.p(dVar6.m(), dVar.o(m02));
                                    dVar.s(m02);
                                }
                            }
                            int i10 = 2;
                            if (arrayList2.size() > 2) {
                                while (i10 < arrayList2.size()) {
                                    n c10 = tVar2.c(xVar2, (n) arrayList2.get(i10));
                                    if (c10 instanceof f) {
                                        throw new IllegalArgumentException("Failed to parse elements to add");
                                    }
                                    int i11 = (m02 + i10) - 2;
                                    if (i11 < 0) {
                                        throw new IllegalArgumentException(r4.k.o(new StringBuilder(String.valueOf(i11).length() + 21), "Invalid value index: ", i11));
                                    }
                                    if (i11 >= dVar.m()) {
                                        dVar.p(i11, c10);
                                        treeMap = treeMap3;
                                    } else {
                                        int intValue = ((Integer) treeMap3.lastKey()).intValue();
                                        while (intValue >= i11) {
                                            Integer valueOf2 = Integer.valueOf(intValue);
                                            TreeMap treeMap4 = treeMap3;
                                            n nVar3 = (n) treeMap4.get(valueOf2);
                                            if (nVar3 != null) {
                                                dVar.p(intValue + 1, nVar3);
                                                treeMap4.remove(valueOf2);
                                            }
                                            intValue--;
                                            treeMap3 = treeMap4;
                                        }
                                        treeMap = treeMap3;
                                        dVar.p(i11, c10);
                                    }
                                    i10++;
                                    treeMap3 = treeMap;
                                }
                            }
                        } else {
                            while (m02 < m10) {
                                dVar6.p(dVar6.m(), dVar.o(m02));
                                dVar.p(m02, null);
                                m02++;
                            }
                        }
                        return dVar6;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -678635926:
                    String str11 = str5;
                    if (str.equals(str11)) {
                        ci.c.f0(str11, arrayList2, 1);
                        n c11 = ((t) xVar2.f6183b).c(xVar2, (n) arrayList2.get(0));
                        if (!(c11 instanceof m)) {
                            throw new IllegalArgumentException("Callback should be a method");
                        }
                        if (treeMap3.size() != 0) {
                            y4.a.J(dVar, xVar2, (m) c11, null, null);
                            return nVar;
                        }
                        return nVar;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -467511597:
                    String str12 = str2;
                    if (str.equals(str12)) {
                        ci.c.h0(2, str12, arrayList2);
                        if (!arrayList2.isEmpty()) {
                            nVar = ((t) xVar2.f6183b).c(xVar2, (n) arrayList2.get(0));
                        }
                        n nVar4 = nVar;
                        int m11 = dVar.m() - 1;
                        if (arrayList2.size() > 1) {
                            n c12 = ((t) xVar2.f6183b).c(xVar2, (n) arrayList2.get(1));
                            d11 = Double.isNaN(c12.d().doubleValue()) ? dVar.m() - 1 : ci.c.m0(c12.d().doubleValue());
                            d10 = 0.0d;
                            if (d11 < 0.0d) {
                                d11 += dVar.m();
                            }
                        } else {
                            d10 = 0.0d;
                            d11 = m11;
                        }
                        if (d11 < d10) {
                            return new g(valueOf);
                        }
                        for (int min = (int) Math.min(dVar.m(), d11); min >= 0; min--) {
                            if (dVar.q(min) && ci.c.k0(dVar.o(min), nVar4)) {
                                return new g(Double.valueOf(min));
                            }
                        }
                        return new g(valueOf);
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -277637751:
                    if (str.equals(obj)) {
                        if (!arrayList2.isEmpty()) {
                            d dVar7 = new d();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                n c13 = ((t) xVar2.f6183b).c(xVar2, (n) it2.next());
                                if (c13 instanceof f) {
                                    throw new IllegalStateException("Argument evaluation failed");
                                }
                                dVar7.p(dVar7.m(), c13);
                            }
                            int m12 = dVar7.m();
                            Iterator l11 = dVar.l();
                            while (l11.hasNext()) {
                                Integer num2 = (Integer) l11.next();
                                dVar7.p(num2.intValue() + m12, dVar.o(num2.intValue()));
                            }
                            treeMap3.clear();
                            Iterator l12 = dVar7.l();
                            while (l12.hasNext()) {
                                Integer num3 = (Integer) l12.next();
                                dVar.p(num3.intValue(), dVar7.o(num3.intValue()));
                            }
                        }
                        return new g(Double.valueOf(dVar.m()));
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 107868:
                    if (str.equals("map")) {
                        ci.c.f0("map", arrayList2, 1);
                        n c14 = ((t) xVar2.f6183b).c(xVar2, (n) arrayList2.get(0));
                        if (c14 instanceof m) {
                            return dVar.m() == 0 ? new d() : y4.a.J(dVar, xVar2, (m) c14, null, null);
                        }
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 111185:
                    if (str.equals("pop")) {
                        ci.c.f0("pop", arrayList2, 0);
                        int m13 = dVar.m();
                        if (m13 != 0) {
                            int i12 = m13 - 1;
                            n o3 = dVar.o(i12);
                            dVar.s(i12);
                            return o3;
                        }
                        return nVar;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 3267882:
                    if (str.equals("join")) {
                        ci.c.h0(1, "join", arrayList2);
                        if (dVar.m() == 0) {
                            return n.f5146c0;
                        }
                        if (arrayList2.isEmpty()) {
                            str6 = StringUtils.COMMA;
                        } else {
                            n c15 = ((t) xVar2.f6183b).c(xVar2, (n) arrayList2.get(0));
                            str6 = ((c15 instanceof l) || (c15 instanceof r)) ? "" : c15.h();
                        }
                        return new q(dVar.t(str6));
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 3452698:
                    if (str.equals("push")) {
                        if (!arrayList2.isEmpty()) {
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                dVar.p(dVar.m(), ((t) xVar2.f6183b).c(xVar2, (n) it3.next()));
                            }
                        }
                        return new g(Double.valueOf(dVar.m()));
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 3536116:
                    if (str.equals("some")) {
                        ci.c.f0("some", arrayList2, 1);
                        n c16 = ((t) xVar2.f6183b).c(xVar2, (n) arrayList2.get(0));
                        if (!(c16 instanceof h)) {
                            throw new IllegalArgumentException("Callback should be a method");
                        }
                        if (dVar.m() != 0) {
                            h hVar2 = (h) c16;
                            Iterator l13 = dVar.l();
                            while (l13.hasNext()) {
                                int intValue2 = ((Integer) l13.next()).intValue();
                                if (dVar.q(intValue2) && hVar2.j(xVar2, Arrays.asList(dVar.o(intValue2), new g(Double.valueOf(intValue2)), dVar)).c().booleanValue()) {
                                    return n.f5144a0;
                                }
                            }
                        }
                        return n.f5145b0;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 3536286:
                    if (str.equals(str4)) {
                        ci.c.h0(1, str4, arrayList2);
                        if (dVar.m() >= 2) {
                            List j = dVar.j();
                            if (!arrayList2.isEmpty()) {
                                n c17 = ((t) xVar2.f6183b).c(xVar2, (n) arrayList2.get(0));
                                if (!(c17 instanceof h)) {
                                    throw new IllegalArgumentException("Comparator should be a method");
                                }
                                hVar = (h) c17;
                            }
                            Collections.sort(j, new u(hVar, xVar2));
                            treeMap3.clear();
                            Iterator it4 = ((ArrayList) j).iterator();
                            int i13 = 0;
                            while (it4.hasNext()) {
                                dVar.p(i13, (n) it4.next());
                                i13++;
                            }
                        }
                        return dVar;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 96891675:
                    if (str.equals("every")) {
                        ci.c.f0("every", arrayList2, 1);
                        n c18 = ((t) xVar2.f6183b).c(xVar2, (n) arrayList2.get(0));
                        if (!(c18 instanceof m)) {
                            throw new IllegalArgumentException("Callback should be a method");
                        }
                        if (dVar.m() != 0) {
                            break;
                        }
                        return n.f5144a0;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 109407362:
                    if (str.equals("shift")) {
                        ci.c.f0("shift", arrayList2, 0);
                        if (dVar.m() != 0) {
                            n o4 = dVar.o(0);
                            dVar.s(0);
                            return o4;
                        }
                        return nVar;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 109526418:
                    if (str.equals("slice")) {
                        ci.c.h0(2, "slice", arrayList2);
                        if (arrayList2.isEmpty()) {
                            return dVar.i();
                        }
                        double m14 = dVar.m();
                        double m03 = ci.c.m0(((t) xVar2.f6183b).c(xVar2, (n) arrayList2.get(0)).d().doubleValue());
                        double max2 = m03 < 0.0d ? Math.max(m03 + m14, 0.0d) : Math.min(m03, m14);
                        if (arrayList2.size() == 2) {
                            double m04 = ci.c.m0(((t) xVar2.f6183b).c(xVar2, (n) arrayList2.get(1)).d().doubleValue());
                            m14 = m04 < 0.0d ? Math.max(m14 + m04, 0.0d) : Math.min(m14, m04);
                        }
                        d dVar8 = new d();
                        for (int i14 = (int) max2; i14 < m14; i14++) {
                            dVar8.p(dVar8.m(), dVar.o(i14));
                        }
                        return dVar8;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 965561430:
                    if (str.equals("reduceRight")) {
                        return y4.a.H(dVar, xVar2, arrayList2, false);
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 1099846370:
                    if (str.equals("reverse")) {
                        ci.c.f0("reverse", arrayList2, 0);
                        int m15 = dVar.m();
                        if (m15 != 0) {
                            for (int i15 = 0; i15 < m15 / 2; i15++) {
                                if (dVar.q(i15)) {
                                    n o7 = dVar.o(i15);
                                    dVar.p(i15, null);
                                    int i16 = (m15 - 1) - i15;
                                    if (dVar.q(i16)) {
                                        dVar.p(i15, dVar.o(i16));
                                    }
                                    dVar.p(i16, o7);
                                }
                            }
                        }
                        return dVar;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 1943291465:
                    if (str.equals("indexOf")) {
                        ci.c.h0(2, "indexOf", arrayList2);
                        if (!arrayList2.isEmpty()) {
                            nVar = ((t) xVar2.f6183b).c(xVar2, (n) arrayList2.get(0));
                        }
                        n nVar5 = nVar;
                        if (arrayList2.size() > 1) {
                            double m05 = ci.c.m0(((t) xVar2.f6183b).c(xVar2, (n) arrayList2.get(1)).d().doubleValue());
                            if (m05 >= dVar.m()) {
                                return new g(valueOf);
                            }
                            d12 = m05 < 0.0d ? dVar.m() + m05 : m05;
                        } else {
                            d12 = 0.0d;
                        }
                        Iterator l14 = dVar.l();
                        while (l14.hasNext()) {
                            int intValue3 = ((Integer) l14.next()).intValue();
                            double d13 = intValue3;
                            if (d13 >= d12 && ci.c.k0(dVar.o(intValue3), nVar5)) {
                                return new g(Double.valueOf(d13));
                            }
                        }
                        return new g(valueOf);
                    }
                    throw new IllegalArgumentException("Command not supported");
                default:
                    throw new IllegalArgumentException("Command not supported");
            }
        }
        str2 = "lastIndexOf";
        str3 = "filter";
        obj = "unshift";
        str4 = "sort";
        xVar2 = xVar;
        str5 = "forEach";
        obj2 = "reduce";
        dVar = this;
        arrayList2 = arrayList;
        Double valueOf3 = Double.valueOf(-1.0d);
        hashCode = str.hashCode();
        TreeMap treeMap22 = dVar.f4957a;
        n nVar6 = n.S;
        TreeMap treeMap32 = treeMap22;
        h hVar3 = null;
        switch (hashCode) {
            case -1776922004:
                break;
            case -1354795244:
                break;
            case -1274492040:
                break;
            case -934873754:
                break;
            case -895859076:
                break;
            case -678635926:
                break;
            case -467511597:
                break;
            case -277637751:
                break;
            case 107868:
                break;
            case 111185:
                break;
            case 3267882:
                break;
            case 3452698:
                break;
            case 3536116:
                break;
            case 3536286:
                break;
            case 96891675:
                break;
            case 109407362:
                break;
            case 109526418:
                break;
            case 965561430:
                break;
            case 1099846370:
                break;
            case 1943291465:
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final boolean g(String str) {
        return "length".equals(str) || this.f4958b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String h() {
        return t(StringUtils.COMMA);
    }

    public final int hashCode() {
        return this.f4957a.hashCode() * 31;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n i() {
        d dVar = new d();
        for (Map.Entry entry : this.f4957a.entrySet()) {
            boolean z5 = entry.getValue() instanceof j;
            TreeMap treeMap = dVar.f4957a;
            if (z5) {
                treeMap.put((Integer) entry.getKey(), (n) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((n) entry.getValue()).i());
            }
        }
        return dVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p(2, this);
    }

    public final List j() {
        ArrayList arrayList = new ArrayList(m());
        for (int i5 = 0; i5 < m(); i5++) {
            arrayList.add(o(i5));
        }
        return arrayList;
    }

    public final Iterator l() {
        return this.f4957a.keySet().iterator();
    }

    public final int m() {
        TreeMap treeMap = this.f4957a;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final n o(int i5) {
        n nVar;
        if (i5 < m()) {
            return (!q(i5) || (nVar = (n) this.f4957a.get(Integer.valueOf(i5))) == null) ? n.S : nVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void p(int i5, n nVar) {
        if (i5 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i5 < 0) {
            throw new IndexOutOfBoundsException(r4.k.o(new StringBuilder(String.valueOf(i5).length() + 21), "Out of bounds index: ", i5));
        }
        TreeMap treeMap = this.f4957a;
        if (nVar == null) {
            treeMap.remove(Integer.valueOf(i5));
        } else {
            treeMap.put(Integer.valueOf(i5), nVar);
        }
    }

    public final boolean q(int i5) {
        if (i5 >= 0) {
            TreeMap treeMap = this.f4957a;
            if (i5 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i5));
            }
        }
        throw new IndexOutOfBoundsException(r4.k.o(new StringBuilder(String.valueOf(i5).length() + 21), "Out of bounds index: ", i5));
    }

    public final void s(int i5) {
        TreeMap treeMap = this.f4957a;
        int intValue = ((Integer) treeMap.lastKey()).intValue();
        if (i5 > intValue || i5 < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i5));
        if (i5 == intValue) {
            int i10 = i5 - 1;
            Integer valueOf = Integer.valueOf(i10);
            if (treeMap.containsKey(valueOf) || i10 < 0) {
                return;
            }
            treeMap.put(valueOf, n.S);
            return;
        }
        while (true) {
            i5++;
            if (i5 > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer valueOf2 = Integer.valueOf(i5);
            n nVar = (n) treeMap.get(valueOf2);
            if (nVar != null) {
                treeMap.put(Integer.valueOf(i5 - 1), nVar);
                treeMap.remove(valueOf2);
            }
        }
    }

    public final String t(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.f4957a.isEmpty()) {
            int i5 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i5 >= m()) {
                    break;
                }
                n o3 = o(i5);
                sb2.append(str2);
                if (!(o3 instanceof r) && !(o3 instanceof l)) {
                    sb2.append(o3.h());
                }
                i5++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    public final String toString() {
        return t(StringUtils.COMMA);
    }

    public d(List list) {
        this();
        if (list != null) {
            for (int i5 = 0; i5 < list.size(); i5++) {
                p(i5, (n) list.get(i5));
            }
        }
    }
}
