package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class npg implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ npg(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        u80 u80Var;
        Object a;
        switch (this.a) {
            case 0:
                ppg ppgVar = (ppg) obj2;
                Map map = ppgVar.a;
                x0d x0dVar = ppgVar.b;
                Object[] objArr = x0dVar.b;
                Object[] objArr2 = x0dVar.c;
                long[] jArr = x0dVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj3 = objArr[i4];
                                    Map e = ((spg) objArr2[i4]).e();
                                    if (e.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, e);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                            }
                        }
                        if (i != length) {
                            i++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 1:
                return obj2;
            case 2:
                q80 q80Var = (q80) obj2;
                return b.e(q80Var.b, yqg.a(q80Var.a, yqg.b, (lpg) obj));
            case 3:
                return Integer.valueOf(((v8j) obj2).a);
            case 4:
                zcj zcjVar = (zcj) obj2;
                return b.e(Float.valueOf(zcjVar.a), Float.valueOf(zcjVar.b));
            case 5:
                lpg lpgVar = (lpg) obj;
                bdj bdjVar = (bdj) obj2;
                lfj lfjVar = new lfj(bdjVar.a);
                xqg xqgVar = yqg.x;
                return b.e(yqg.a(lfjVar, xqgVar, lpgVar), yqg.a(new lfj(bdjVar.b), xqgVar, lpgVar));
            case 6:
                return Integer.valueOf(((wg8) obj2).a);
            case 7:
                fbb fbbVar = (fbb) obj2;
                return b.e(fbbVar.a, yqg.a(fbbVar.b, yqg.j, (lpg) obj));
            case 8:
                return Float.valueOf(((sn1) obj2).a);
            case 9:
                lpg lpgVar2 = (lpg) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(yqg.a((p80) list.get(i5), yqg.c, lpgVar2));
                }
                return arrayList;
            case 10:
                pej pejVar = (pej) obj2;
                return b.e(Integer.valueOf((int) (pejVar.a >> 32)), Integer.valueOf((int) (pejVar.a & 4294967295L)));
            case 11:
                lpg lpgVar3 = (lpg) obj;
                qah qahVar = (qah) obj2;
                return b.e(yqg.a(new r13(qahVar.a), yqg.r, lpgVar3), yqg.a(new dnd(qahVar.b), yqg.z, lpgVar3), Float.valueOf(qahVar.c));
            case 12:
                return Integer.valueOf(((p7j) obj2).a);
            case 13:
                return Integer.valueOf(((z8j) obj2).a);
            case 14:
                return Integer.valueOf(((ql9) obj2).a);
            case 15:
                return Integer.valueOf(((rg8) obj2).a);
            case 16:
                return Integer.valueOf(((sg8) obj2).a);
            case 17:
                lfj lfjVar2 = (lfj) obj2;
                return lfjVar2 != null ? lfj.a(lfjVar2.a, lfj.c) : false ? Boolean.FALSE : b.e(Float.valueOf(lfj.c(lfjVar2.a)), yqg.a(new mfj(lfj.b(lfjVar2.a)), yqg.y, (lpg) obj));
            case 18:
                ebb ebbVar = (ebb) obj2;
                return b.e(ebbVar.a, yqg.a(ebbVar.b, yqg.j, (lpg) obj));
            case 19:
                long j2 = ((mfj) obj2).a;
                if (mfj.a(j2, 8589934592L)) {
                    return 0;
                }
                if (mfj.a(j2, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 20:
                dnd dndVar = (dnd) obj2;
                return dndVar != null ? dnd.c(dndVar.a, 9205357640488583168L) : false ? Boolean.FALSE : b.e(Float.valueOf(Float.intBitsToFloat((int) (dndVar.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (dndVar.a & 4294967295L))));
            case 21:
                lpg lpgVar4 = (lpg) obj;
                p80 p80Var = (p80) obj2;
                Object obj4 = p80Var.a;
                if (obj4 instanceof g8e) {
                    u80Var = u80.a;
                } else if (obj4 instanceof pwh) {
                    u80Var = u80.b;
                } else if (obj4 instanceof eok) {
                    u80Var = u80.c;
                } else if (obj4 instanceof mek) {
                    u80Var = u80.d;
                } else if (obj4 instanceof fbb) {
                    u80Var = u80.e;
                } else if (obj4 instanceof ebb) {
                    u80Var = u80.f;
                } else {
                    if (!(obj4 instanceof ohi)) {
                        a70.i();
                        return null;
                    }
                    u80Var = u80.g;
                }
                switch (u80Var.ordinal()) {
                    case 0:
                        obj4.getClass();
                        a = yqg.a((g8e) obj4, yqg.h, lpgVar4);
                        break;
                    case 1:
                        obj4.getClass();
                        a = yqg.a((pwh) obj4, yqg.i, lpgVar4);
                        break;
                    case 2:
                        obj4.getClass();
                        a = yqg.a((eok) obj4, yqg.d, lpgVar4);
                        break;
                    case 3:
                        obj4.getClass();
                        a = yqg.a((mek) obj4, yqg.e, lpgVar4);
                        break;
                    case 4:
                        obj4.getClass();
                        a = yqg.a((fbb) obj4, yqg.f, lpgVar4);
                        break;
                    case 5:
                        obj4.getClass();
                        a = yqg.a((ebb) obj4, yqg.g, lpgVar4);
                        break;
                    case 6:
                        obj4.getClass();
                        a = ((ohi) obj4).a;
                        break;
                    default:
                        zzl.b();
                        return null;
                }
                return b.e(u80Var, a, Integer.valueOf(p80Var.b), Integer.valueOf(p80Var.c), p80Var.d);
            case 22:
                lpg lpgVar5 = (lpg) obj;
                List list2 = ((eib) obj2).a;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    arrayList2.add(yqg.a((dib) list2.get(i6), yqg.B, lpgVar5));
                }
                return arrayList2;
            case 23:
                return ((dib) obj2).a.toLanguageTag();
            case 24:
                lpg lpgVar6 = (lpg) obj;
                r7b r7bVar = (r7b) obj2;
                return b.e(yqg.a(new o7b(r7bVar.a), yqg.D, lpgVar6), yqg.a(new q7b(r7bVar.b), yqg.E, lpgVar6), yqg.a(new p7b(r7bVar.c), yqg.F, lpgVar6));
            case 25:
                return Float.valueOf(((o7b) obj2).a);
            case 26:
                return Integer.valueOf(((q7b) obj2).a);
            case 27:
                return Integer.valueOf(((p7b) obj2).a);
            case 28:
                return ((eok) obj2).a;
            default:
                lpg lpgVar7 = (lpg) obj;
                g8e g8eVar = (g8e) obj2;
                Object a2 = yqg.a(new p7j(g8eVar.a), yqg.s, lpgVar7);
                Object a3 = yqg.a(new z8j(g8eVar.b), yqg.t, lpgVar7);
                Object a4 = yqg.a(new lfj(g8eVar.c), yqg.x, lpgVar7);
                bdj bdjVar2 = g8eVar.d;
                bdj bdjVar3 = bdj.c;
                Object a5 = yqg.a(bdjVar2, yqg.m, lpgVar7);
                Object a6 = yqg.a(g8eVar.e, fcp.e, lpgVar7);
                r7b r7bVar2 = g8eVar.f;
                r7b r7bVar3 = r7b.d;
                return b.e(a2, a3, a4, a5, a6, yqg.a(r7bVar2, yqg.C, lpgVar7), yqg.a(new l7b(g8eVar.g), fcp.g, lpgVar7), yqg.a(new ql9(g8eVar.h), yqg.u, lpgVar7), yqg.a(g8eVar.i, fcp.h, lpgVar7));
        }
    }
}
