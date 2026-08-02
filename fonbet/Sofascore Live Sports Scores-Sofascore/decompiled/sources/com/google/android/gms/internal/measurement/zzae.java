package com.google.android.gms.internal.measurement;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import defpackage.a70;
import defpackage.a8n;
import defpackage.gd2;
import defpackage.i31;
import defpackage.me4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzae implements Iterable, zzao, zzak {
    public final TreeMap a;
    public final TreeMap b;

    public zzae(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                o(i, (zzao) list.get(i));
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void a(String str, zzao zzaoVar) {
        TreeMap treeMap = this.b;
        if (zzaoVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, zzaoVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02d2, code lost:
    
        if (com.google.android.gms.internal.measurement.zzba.b(r7, r2, (com.google.android.gms.internal.measurement.zzan) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).m() == r7.m()) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ee  */
    @Override // com.google.android.gms.internal.measurement.zzao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzao c(String str, zzg zzgVar, ArrayList arrayList) {
        String str2;
        String str3;
        Object obj;
        String str4;
        zzg zzgVar2;
        String str5;
        Object obj2;
        zzae zzaeVar;
        ArrayList arrayList2;
        int hashCode;
        TreeMap treeMap;
        double d;
        String str6;
        zzai zzaiVar;
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
                            return zzak.b(this, new zzas(str), zzgVar, arrayList);
                        }
                        str2 = "lastIndexOf";
                        str5 = "forEach";
                        obj = "unshift";
                        zzaeVar = this;
                        zzgVar2 = zzgVar;
                    }
                }
            }
            obj = "unshift";
            zzgVar2 = zzgVar;
            arrayList2 = arrayList;
            str5 = "forEach";
            zzaeVar = this;
            Double valueOf = Double.valueOf(-1.0d);
            hashCode = str.hashCode();
            TreeMap treeMap2 = zzaeVar.a;
            zzao zzaoVar = zzao.I7;
            TreeMap treeMap3 = treeMap2;
            double d2 = 0.0d;
            switch (hashCode) {
                case -1776922004:
                    String str9 = str7;
                    if (str.equals(str9)) {
                        zzh.a(0, str9, arrayList2);
                        return new zzas(zzaeVar.r(BlazeDataSourcePersonalizedType.STRING_SEPARATOR));
                    }
                    a70.p("Command not supported");
                    return null;
                case -1354795244:
                    if (str.equals("concat")) {
                        zzae zzaeVar2 = (zzae) zzaeVar.zzt();
                        if (!arrayList2.isEmpty()) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                zzao b = zzgVar2.b.b(zzgVar2, (zzao) it.next());
                                if (b instanceof zzag) {
                                    a70.r("Failed evaluation of arguments");
                                    return null;
                                }
                                int m = zzaeVar2.m();
                                if (b instanceof zzae) {
                                    zzae zzaeVar3 = (zzae) b;
                                    Iterator e = zzaeVar3.e();
                                    while (e.hasNext()) {
                                        Integer num = (Integer) e.next();
                                        zzaeVar2.o(num.intValue() + m, zzaeVar3.n(num.intValue()));
                                    }
                                } else {
                                    zzaeVar2.o(m, b);
                                }
                            }
                        }
                        return zzaeVar2;
                    }
                    a70.p("Command not supported");
                    return null;
                case -1274492040:
                    String str10 = str3;
                    if (str.equals(str10)) {
                        zzh.a(1, str10, arrayList2);
                        zzao b2 = zzgVar2.b.b(zzgVar2, (zzao) arrayList2.get(0));
                        if (!(b2 instanceof zzan)) {
                            a70.p("Callback should be a method");
                            return null;
                        }
                        if (treeMap3.size() == 0) {
                            return new zzae();
                        }
                        zzae zzaeVar4 = (zzae) zzaeVar.zzt();
                        zzae b3 = zzba.b(zzaeVar, zzgVar2, (zzan) b2, null, Boolean.TRUE);
                        zzae zzaeVar5 = new zzae();
                        Iterator e2 = b3.e();
                        while (e2.hasNext()) {
                            zzaeVar5.o(zzaeVar5.m(), zzaeVar4.n(((Integer) e2.next()).intValue()));
                        }
                        return zzaeVar5;
                    }
                    a70.p("Command not supported");
                    return null;
                case -934873754:
                    if (str.equals(obj2)) {
                        return zzba.a(zzaeVar, zzgVar2, arrayList2, true);
                    }
                    a70.p("Command not supported");
                    return null;
                case -895859076:
                    if (str.equals(str8)) {
                        if (arrayList2.isEmpty()) {
                            return new zzae();
                        }
                        zzao zzaoVar2 = (zzao) arrayList2.get(0);
                        zzaw zzawVar = zzgVar2.b;
                        zzaw zzawVar2 = zzgVar2.b;
                        int h = (int) zzh.h(zzawVar.b(zzgVar2, zzaoVar2).zzd().doubleValue());
                        if (h < 0) {
                            h = Math.max(0, zzaeVar.m() + h);
                        } else if (h > zzaeVar.m()) {
                            h = zzaeVar.m();
                        }
                        int m2 = zzaeVar.m();
                        zzae zzaeVar6 = new zzae();
                        if (arrayList2.size() > 1) {
                            int max = Math.max(0, (int) zzh.h(zzawVar2.b(zzgVar2, (zzao) arrayList2.get(1)).zzd().doubleValue()));
                            if (max > 0) {
                                for (int i = h; i < Math.min(m2, h + max); i++) {
                                    zzaeVar6.o(zzaeVar6.m(), zzaeVar.n(h));
                                    zzaeVar.q(h);
                                }
                            }
                            int i2 = 2;
                            if (arrayList2.size() > 2) {
                                while (i2 < arrayList2.size()) {
                                    zzao b4 = zzawVar2.b(zzgVar2, (zzao) arrayList2.get(i2));
                                    if (b4 instanceof zzag) {
                                        a70.p("Failed to parse elements to add");
                                        return null;
                                    }
                                    int i3 = (h + i2) - 2;
                                    if (i3 < 0) {
                                        a70.p(me4.g(i3, "Invalid value index: ", new StringBuilder(String.valueOf(i3).length() + 21)));
                                        return null;
                                    }
                                    if (i3 >= zzaeVar.m()) {
                                        zzaeVar.o(i3, b4);
                                        treeMap = treeMap3;
                                    } else {
                                        int intValue = ((Integer) treeMap3.lastKey()).intValue();
                                        while (intValue >= i3) {
                                            Integer valueOf2 = Integer.valueOf(intValue);
                                            TreeMap treeMap4 = treeMap3;
                                            zzao zzaoVar3 = (zzao) treeMap4.get(valueOf2);
                                            if (zzaoVar3 != null) {
                                                zzaeVar.o(intValue + 1, zzaoVar3);
                                                treeMap4.remove(valueOf2);
                                            }
                                            intValue--;
                                            treeMap3 = treeMap4;
                                        }
                                        treeMap = treeMap3;
                                        zzaeVar.o(i3, b4);
                                    }
                                    i2++;
                                    treeMap3 = treeMap;
                                }
                            }
                        } else {
                            while (h < m2) {
                                zzaeVar6.o(zzaeVar6.m(), zzaeVar.n(h));
                                zzaeVar.o(h, null);
                                h++;
                            }
                        }
                        return zzaeVar6;
                    }
                    a70.p("Command not supported");
                    return null;
                case -678635926:
                    String str11 = str5;
                    if (str.equals(str11)) {
                        zzh.a(1, str11, arrayList2);
                        zzao b5 = zzgVar2.b.b(zzgVar2, (zzao) arrayList2.get(0));
                        if (!(b5 instanceof zzan)) {
                            a70.p("Callback should be a method");
                            return null;
                        }
                        if (treeMap3.size() != 0) {
                            zzba.b(zzaeVar, zzgVar2, (zzan) b5, null, null);
                            return zzaoVar;
                        }
                        return zzaoVar;
                    }
                    a70.p("Command not supported");
                    return null;
                case -467511597:
                    String str12 = str2;
                    if (str.equals(str12)) {
                        zzh.c(2, str12, arrayList2);
                        if (!arrayList2.isEmpty()) {
                            zzaoVar = zzgVar2.b.b(zzgVar2, (zzao) arrayList2.get(0));
                        }
                        zzao zzaoVar4 = zzaoVar;
                        int m3 = zzaeVar.m() - 1;
                        if (arrayList2.size() > 1) {
                            zzao b6 = zzgVar2.b.b(zzgVar2, (zzao) arrayList2.get(1));
                            d = Double.isNaN(b6.zzd().doubleValue()) ? zzaeVar.m() - 1 : zzh.h(b6.zzd().doubleValue());
                            if (d < 0.0d) {
                                d += zzaeVar.m();
                            }
                        } else {
                            d = m3;
                        }
                        if (d < 0.0d) {
                            return new zzah(valueOf);
                        }
                        for (int min = (int) Math.min(zzaeVar.m(), d); min >= 0; min--) {
                            if (zzaeVar.p(min) && zzh.f(zzaeVar.n(min), zzaoVar4)) {
                                return new zzah(Double.valueOf(min));
                            }
                        }
                        return new zzah(valueOf);
                    }
                    a70.p("Command not supported");
                    return null;
                case -277637751:
                    if (str.equals(obj)) {
                        if (!arrayList2.isEmpty()) {
                            zzae zzaeVar7 = new zzae();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                zzao b7 = zzgVar2.b.b(zzgVar2, (zzao) it2.next());
                                if (b7 instanceof zzag) {
                                    a70.r("Argument evaluation failed");
                                    return null;
                                }
                                zzaeVar7.o(zzaeVar7.m(), b7);
                            }
                            int m4 = zzaeVar7.m();
                            Iterator e3 = zzaeVar.e();
                            while (e3.hasNext()) {
                                Integer num2 = (Integer) e3.next();
                                zzaeVar7.o(num2.intValue() + m4, zzaeVar.n(num2.intValue()));
                            }
                            treeMap3.clear();
                            Iterator e4 = zzaeVar7.e();
                            while (e4.hasNext()) {
                                Integer num3 = (Integer) e4.next();
                                zzaeVar.o(num3.intValue(), zzaeVar7.n(num3.intValue()));
                            }
                        }
                        return new zzah(Double.valueOf(zzaeVar.m()));
                    }
                    a70.p("Command not supported");
                    return null;
                case 107868:
                    if (str.equals("map")) {
                        zzh.a(1, "map", arrayList2);
                        zzao b8 = zzgVar2.b.b(zzgVar2, (zzao) arrayList2.get(0));
                        if (b8 instanceof zzan) {
                            return zzaeVar.m() == 0 ? new zzae() : zzba.b(zzaeVar, zzgVar2, (zzan) b8, null, null);
                        }
                        a70.p("Callback should be a method");
                        return null;
                    }
                    a70.p("Command not supported");
                    return null;
                case 111185:
                    if (str.equals("pop")) {
                        zzh.a(0, "pop", arrayList2);
                        int m5 = zzaeVar.m();
                        if (m5 != 0) {
                            int i4 = m5 - 1;
                            zzao n = zzaeVar.n(i4);
                            zzaeVar.q(i4);
                            return n;
                        }
                        return zzaoVar;
                    }
                    a70.p("Command not supported");
                    return null;
                case 3267882:
                    if (str.equals("join")) {
                        zzh.c(1, "join", arrayList2);
                        if (zzaeVar.m() == 0) {
                            return zzao.P7;
                        }
                        if (arrayList2.isEmpty()) {
                            str6 = BlazeDataSourcePersonalizedType.STRING_SEPARATOR;
                        } else {
                            zzao b9 = zzgVar2.b.b(zzgVar2, (zzao) arrayList2.get(0));
                            str6 = ((b9 instanceof zzam) || (b9 instanceof zzat)) ? "" : b9.zzc();
                        }
                        return new zzas(zzaeVar.r(str6));
                    }
                    a70.p("Command not supported");
                    return null;
                case 3452698:
                    if (str.equals("push")) {
                        if (!arrayList2.isEmpty()) {
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                zzaeVar.o(zzaeVar.m(), zzgVar2.b.b(zzgVar2, (zzao) it3.next()));
                            }
                        }
                        return new zzah(Double.valueOf(zzaeVar.m()));
                    }
                    a70.p("Command not supported");
                    return null;
                case 3536116:
                    if (str.equals("some")) {
                        zzh.a(1, "some", arrayList2);
                        zzao b10 = zzgVar2.b.b(zzgVar2, (zzao) arrayList2.get(0));
                        if (!(b10 instanceof zzai)) {
                            a70.p("Callback should be a method");
                            return null;
                        }
                        if (zzaeVar.m() != 0) {
                            zzai zzaiVar2 = (zzai) b10;
                            Iterator e5 = zzaeVar.e();
                            while (e5.hasNext()) {
                                int intValue2 = ((Integer) e5.next()).intValue();
                                if (zzaeVar.p(intValue2) && zzaiVar2.d(zzgVar2, Arrays.asList(zzaeVar.n(intValue2), new zzah(Double.valueOf(intValue2)), zzaeVar)).zze().booleanValue()) {
                                    return zzao.N7;
                                }
                            }
                        }
                        return zzao.O7;
                    }
                    a70.p("Command not supported");
                    return null;
                case 3536286:
                    if (str.equals(str4)) {
                        zzh.c(1, str4, arrayList2);
                        if (zzaeVar.m() >= 2) {
                            List d3 = zzaeVar.d();
                            if (arrayList2.isEmpty()) {
                                zzaiVar = null;
                            } else {
                                zzao b11 = zzgVar2.b.b(zzgVar2, (zzao) arrayList2.get(0));
                                if (!(b11 instanceof zzai)) {
                                    a70.p("Comparator should be a method");
                                    return null;
                                }
                                zzaiVar = (zzai) b11;
                            }
                            Collections.sort(d3, new i31(9, zzaiVar, zzgVar2));
                            treeMap3.clear();
                            Iterator it4 = ((ArrayList) d3).iterator();
                            int i5 = 0;
                            while (it4.hasNext()) {
                                zzaeVar.o(i5, (zzao) it4.next());
                                i5++;
                            }
                        }
                        return zzaeVar;
                    }
                    a70.p("Command not supported");
                    return null;
                case 96891675:
                    if (str.equals("every")) {
                        zzh.a(1, "every", arrayList2);
                        zzao b12 = zzgVar2.b.b(zzgVar2, (zzao) arrayList2.get(0));
                        if (!(b12 instanceof zzan)) {
                            a70.p("Callback should be a method");
                            return null;
                        }
                        if (zzaeVar.m() != 0) {
                            break;
                        }
                        return zzao.N7;
                    }
                    a70.p("Command not supported");
                    return null;
                case 109407362:
                    if (str.equals("shift")) {
                        zzh.a(0, "shift", arrayList2);
                        if (zzaeVar.m() != 0) {
                            zzao n2 = zzaeVar.n(0);
                            zzaeVar.q(0);
                            return n2;
                        }
                        return zzaoVar;
                    }
                    a70.p("Command not supported");
                    return null;
                case 109526418:
                    if (str.equals("slice")) {
                        zzh.c(2, "slice", arrayList2);
                        if (arrayList2.isEmpty()) {
                            return zzaeVar.zzt();
                        }
                        double m6 = zzaeVar.m();
                        double h2 = zzh.h(zzgVar2.b.b(zzgVar2, (zzao) arrayList2.get(0)).zzd().doubleValue());
                        double max2 = h2 < 0.0d ? Math.max(h2 + m6, 0.0d) : Math.min(h2, m6);
                        if (arrayList2.size() == 2) {
                            double h3 = zzh.h(zzgVar2.b.b(zzgVar2, (zzao) arrayList2.get(1)).zzd().doubleValue());
                            m6 = h3 < 0.0d ? Math.max(m6 + h3, 0.0d) : Math.min(m6, h3);
                        }
                        zzae zzaeVar8 = new zzae();
                        for (int i6 = (int) max2; i6 < m6; i6++) {
                            zzaeVar8.o(zzaeVar8.m(), zzaeVar.n(i6));
                        }
                        return zzaeVar8;
                    }
                    a70.p("Command not supported");
                    return null;
                case 965561430:
                    if (str.equals("reduceRight")) {
                        return zzba.a(zzaeVar, zzgVar2, arrayList2, false);
                    }
                    a70.p("Command not supported");
                    return null;
                case 1099846370:
                    if (str.equals("reverse")) {
                        zzh.a(0, "reverse", arrayList2);
                        int m7 = zzaeVar.m();
                        if (m7 != 0) {
                            for (int i7 = 0; i7 < m7 / 2; i7++) {
                                if (zzaeVar.p(i7)) {
                                    zzao n3 = zzaeVar.n(i7);
                                    zzaeVar.o(i7, null);
                                    int i8 = (m7 - 1) - i7;
                                    if (zzaeVar.p(i8)) {
                                        zzaeVar.o(i7, zzaeVar.n(i8));
                                    }
                                    zzaeVar.o(i8, n3);
                                }
                            }
                        }
                        return zzaeVar;
                    }
                    a70.p("Command not supported");
                    return null;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        zzh.c(2, "indexOf", arrayList2);
                        if (!arrayList2.isEmpty()) {
                            zzaoVar = zzgVar2.b.b(zzgVar2, (zzao) arrayList2.get(0));
                        }
                        zzao zzaoVar5 = zzaoVar;
                        if (arrayList2.size() > 1) {
                            double h4 = zzh.h(zzgVar2.b.b(zzgVar2, (zzao) arrayList2.get(1)).zzd().doubleValue());
                            if (h4 >= zzaeVar.m()) {
                                return new zzah(valueOf);
                            }
                            d2 = h4 < 0.0d ? zzaeVar.m() + h4 : h4;
                        }
                        Iterator e6 = zzaeVar.e();
                        while (e6.hasNext()) {
                            int intValue3 = ((Integer) e6.next()).intValue();
                            double d4 = intValue3;
                            if (d4 >= d2 && zzh.f(zzaeVar.n(intValue3), zzaoVar5)) {
                                return new zzah(Double.valueOf(d4));
                            }
                        }
                        return new zzah(valueOf);
                    }
                    a70.p("Command not supported");
                    return null;
                default:
                    a70.p("Command not supported");
                    return null;
            }
        }
        str2 = "lastIndexOf";
        str3 = "filter";
        obj = "unshift";
        str4 = "sort";
        zzgVar2 = zzgVar;
        str5 = "forEach";
        obj2 = "reduce";
        zzaeVar = this;
        arrayList2 = arrayList;
        Double valueOf3 = Double.valueOf(-1.0d);
        hashCode = str.hashCode();
        TreeMap treeMap22 = zzaeVar.a;
        zzao zzaoVar6 = zzao.I7;
        TreeMap treeMap32 = treeMap22;
        double d22 = 0.0d;
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

    public final List d() {
        ArrayList arrayList = new ArrayList(m());
        for (int i = 0; i < m(); i++) {
            arrayList.add(n(i));
        }
        return arrayList;
    }

    public final Iterator e() {
        return this.a.keySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzae)) {
            return false;
        }
        zzae zzaeVar = (zzae) obj;
        if (m() != zzaeVar.m()) {
            return false;
        }
        TreeMap treeMap = this.a;
        if (treeMap.isEmpty()) {
            return zzaeVar.a.isEmpty();
        }
        for (int intValue = ((Integer) treeMap.firstKey()).intValue(); intValue <= ((Integer) treeMap.lastKey()).intValue(); intValue++) {
            if (!n(intValue).equals(zzaeVar.n(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new gd2(this);
    }

    public final int m() {
        TreeMap treeMap = this.a;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final zzao n(int i) {
        zzao zzaoVar;
        if (i < m()) {
            return (!p(i) || (zzaoVar = (zzao) this.a.get(Integer.valueOf(i))) == null) ? zzao.I7 : zzaoVar;
        }
        defpackage.zzl.r("Attempting to get element outside of current array");
        return null;
    }

    public final void o(int i, zzao zzaoVar) {
        if (i > 32468) {
            a70.r("Array too large");
            return;
        }
        if (i < 0) {
            defpackage.zzl.r(me4.g(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
            return;
        }
        TreeMap treeMap = this.a;
        if (zzaoVar == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), zzaoVar);
        }
    }

    public final boolean p(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.a;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        defpackage.zzl.r(me4.g(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
        return false;
    }

    public final void q(int i) {
        TreeMap treeMap = this.a;
        int intValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > intValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == intValue) {
            int i2 = i - 1;
            Integer valueOf = Integer.valueOf(i2);
            if (treeMap.containsKey(valueOf) || i2 < 0) {
                return;
            }
            treeMap.put(valueOf, zzao.I7);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer valueOf2 = Integer.valueOf(i);
            zzao zzaoVar = (zzao) treeMap.get(valueOf2);
            if (zzaoVar != null) {
                treeMap.put(Integer.valueOf(i - 1), zzaoVar);
                treeMap.remove(valueOf2);
            }
        }
    }

    public final String r(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= m()) {
                    break;
                }
                zzao n = n(i);
                sb.append(str2);
                if (!(n instanceof zzat) && !(n instanceof zzam)) {
                    sb.append(n.zzc());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final String toString() {
        return r(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return r(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        TreeMap treeMap = this.a;
        return treeMap.size() == 1 ? n(0).zzd() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return new a8n(this, this.a.keySet().iterator(), this.b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean zzj(String str) {
        return "length".equals(str) || this.b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final zzao zzk(String str) {
        zzao zzaoVar;
        return "length".equals(str) ? new zzah(Double.valueOf(m())) : (!zzj(str) || (zzaoVar = (zzao) this.b.get(str)) == null) ? zzao.I7 : zzaoVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        zzae zzaeVar = new zzae();
        for (Map.Entry entry : this.a.entrySet()) {
            boolean z = entry.getValue() instanceof zzak;
            TreeMap treeMap = zzaeVar.a;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (zzao) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((zzao) entry.getValue()).zzt());
            }
        }
        return zzaeVar;
    }

    public zzae() {
        this.a = new TreeMap();
        this.b = new TreeMap();
    }
}
