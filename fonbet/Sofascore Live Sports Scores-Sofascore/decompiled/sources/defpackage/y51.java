package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.newNetwork.MmaPostMatchVotingOptions;
import com.sofascore.model.newNetwork.PlayerPenaltyHistoryResponse;
import com.sofascore.model.newNetwork.TrendingGridTile;
import com.sofascore.model.newNetwork.TrendingGridTileSize;
import com.sofascore.results.base.BaseActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class y51 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y51(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [t8g] */
    /* JADX WARN: Type inference failed for: r6v8, types: [w8g] */
    /* JADX WARN: Type inference failed for: r6v9, types: [u8g] */
    /* JADX WARN: Type inference failed for: r8v26, types: [w8g] */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v28, types: [s8g] */
    /* JADX WARN: Type inference failed for: r8v29, types: [s8g] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        lg3 lg3Var;
        int i;
        int i2;
        lg3 lg3Var2;
        int i3;
        int i4;
        yyj xyjVar;
        w8g u8gVar;
        uyj tyjVar;
        int i5 = this.a;
        int i6 = 8;
        int i7 = 1;
        int i8 = 0;
        int i9 = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i5) {
            case 0:
                Map map = (Map) obj3;
                n29 n29Var = (n29) obj2;
                ((o55) obj).getClass();
                map.put(Integer.valueOf(i9), n29Var);
                return new h61(map, i9, n29Var);
            case 1:
                long longValue = ((Long) obj).longValue();
                gv9 gv9Var = ((z39) obj2).m;
                int i10 = this.b;
                nv.B((Context) obj3, (w31) gv9Var.get(i10), longValue, i10, true);
                return Unit.a;
            case 2:
                pw7 pw7Var = (pw7) obj;
                pw7Var.getClass();
                ((ct8) obj3).invoke(pw7Var, Integer.valueOf(i9), Integer.valueOf(((w31) obj2).getG()));
                return Unit.a;
            case 3:
                long longValue2 = ((Long) obj).longValue();
                gv9 gv9Var2 = ((v39) obj2).n;
                int i11 = this.b;
                nv.B((Context) obj3, (w31) gv9Var2.get(i11), longValue2, i11, true);
                return Unit.a;
            case 4:
                pw7 pw7Var2 = (pw7) obj;
                pw7Var2.getClass();
                ((ct8) obj3).invoke(pw7Var2, Integer.valueOf(i9), Integer.valueOf(((w31) ((v39) obj2).n.get(i9)).getG()));
                return Unit.a;
            case 5:
                long longValue3 = ((Long) obj).longValue();
                gv9 gv9Var3 = ((b49) obj2).n;
                int i12 = this.b;
                nv.B((Context) obj3, (w31) gv9Var3.get(i12), longValue3, i12, true);
                return Unit.a;
            case 6:
                String str = (String) obj3;
                List list = (List) obj2;
                l9j l9jVar = (l9j) obj;
                pej pejVar = l9jVar.f;
                if (pejVar != null) {
                    long j = pejVar.a;
                    int i13 = (int) (j >> 32);
                    yqo.F(l9jVar, i13, (int) (j & 4294967295L), str);
                    if (str.length() > 0) {
                        l9jVar.d(i13, str.length() + i13, list);
                    }
                } else {
                    int g = pej.g(l9jVar.e);
                    yqo.F(l9jVar, g, pej.f(l9jVar.e), str);
                    if (str.length() > 0) {
                        l9jVar.d(g, str.length() + g, list);
                    }
                }
                int c = llf.c(i9 > 0 ? (r1 + i9) - 1 : (pej.g(l9jVar.e) + i9) - str.length(), 0, l9jVar.c.length());
                l9jVar.f(t6a.g(c, c));
                return Unit.a;
            case 7:
                MmaPostMatchVotingOptions mmaPostMatchVotingOptions = (MmaPostMatchVotingOptions) obj;
                mmaPostMatchVotingOptions.getClass();
                ((hlc) obj3).l.invoke((MmaEvent) obj2, mmaPostMatchVotingOptions, Integer.valueOf(i9));
                return Unit.a;
            case 8:
                return tue.q((tue) obj3, i9, (PlayerPenaltyHistoryResponse) obj2, ((Integer) obj).intValue());
            case 9:
                eqf eqfVar = (eqf) obj3;
                h0d h0dVar = (h0d) obj2;
                lg3 lg3Var3 = (lg3) obj;
                if (eqfVar.e == i9 && Intrinsics.c(h0dVar, eqfVar.f) && (lg3Var3 instanceof sg3)) {
                    long[] jArr = h0dVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j2 = jArr[i14];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i15 = 8 - ((~(i14 - length)) >>> 31);
                                int i16 = i8;
                                while (i16 < i15) {
                                    if ((255 & j2) < 128) {
                                        int i17 = (i14 << 3) + i16;
                                        Object obj4 = h0dVar.b[i17];
                                        i4 = i7;
                                        int i18 = h0dVar.c[i17] != i9 ? i4 : i8;
                                        if (i18 != 0) {
                                            sg3 sg3Var = (sg3) lg3Var3;
                                            i3 = i6;
                                            x0d x0dVar = sg3Var.g;
                                            t6a.H(x0dVar, obj4, eqfVar);
                                            lg3Var2 = lg3Var3;
                                            if (obj4 instanceof ay4) {
                                                ay4 ay4Var = (ay4) obj4;
                                                if (!x0dVar.c(ay4Var)) {
                                                    t6a.I(sg3Var.j, ay4Var);
                                                }
                                                x0d x0dVar2 = eqfVar.g;
                                                if (x0dVar2 != null) {
                                                    x0dVar2.k(obj4);
                                                }
                                            }
                                        } else {
                                            lg3Var2 = lg3Var3;
                                            i3 = i6;
                                        }
                                        if (i18 != 0) {
                                            h0dVar.f(i17);
                                        }
                                    } else {
                                        lg3Var2 = lg3Var3;
                                        i3 = i6;
                                        i4 = i7;
                                    }
                                    j2 >>= i3;
                                    i16++;
                                    lg3Var3 = lg3Var2;
                                    i7 = i4;
                                    i6 = i3;
                                    i8 = 0;
                                }
                                lg3Var = lg3Var3;
                                i = i6;
                                i2 = i7;
                                if (i15 != i) {
                                }
                            } else {
                                lg3Var = lg3Var3;
                                i = i6;
                                i2 = i7;
                            }
                            if (i14 != length) {
                                i14++;
                                i6 = i;
                                i7 = i2;
                                i8 = 0;
                                lg3Var3 = lg3Var;
                            }
                        }
                    }
                }
                return Unit.a;
            case 10:
                long longValue4 = ((Long) obj).longValue();
                gv9 gv9Var4 = ((e49) obj2).n;
                int i19 = this.b;
                nv.B((Context) obj3, (w31) gv9Var4.get(i19), longValue4, i19, true);
                return Unit.a;
            case 11:
                pw7 pw7Var3 = (pw7) obj;
                pw7Var3.getClass();
                ((ct8) obj3).invoke(pw7Var3, Integer.valueOf(i9), Integer.valueOf(((w31) ((e49) obj2).n.get(i9)).getG()));
                return Unit.a;
            case 12:
                mug mugVar = (mug) obj3;
                qhe qheVar = (qhe) obj2;
                phe pheVar = (phe) obj;
                int h = mugVar.o.a.h();
                if (h < 0) {
                    h = 0;
                }
                if (h <= i9) {
                    i9 = h;
                }
                int i20 = -i9;
                boolean z = mugVar.p;
                int i21 = z ? 0 : i20;
                if (!z) {
                    i20 = 0;
                }
                pheVar.a = true;
                phe.i(pheVar, qheVar, i21, i20);
                Unit unit = Unit.a;
                pheVar.a = false;
                return Unit.a;
            case 13:
                c0k c0kVar = (c0k) obj2;
                tzj tzjVar = (tzj) obj;
                tzjVar.getClass();
                gv9 gv9Var5 = tzjVar.b;
                gv9<??> gv9Var6 = tzjVar.a;
                gv9 gv9Var7 = tzjVar.c;
                int i22 = zzj.a[((TrendingGridTileSize) obj3).ordinal()];
                if (i22 != 1) {
                    if (i22 != 2) {
                        if (i22 == 3) {
                            return tzjVar;
                        }
                        zzl.b();
                        return null;
                    }
                    syj syjVar = (syj) CollectionsKt.firstOrNull(gv9Var7);
                    if (syjVar != null) {
                        TrendingGridTile trendingGridTile = syjVar.b;
                        trendingGridTile.getClass();
                        tyjVar = new syj(i9, trendingGridTile);
                    } else {
                        tyjVar = new tyj(i9);
                    }
                    c0kVar.getClass();
                    ArrayList arrayList = new ArrayList(k13.r(gv9Var6, 10));
                    for (?? r8 : gv9Var6) {
                        if (r8 instanceof s8g) {
                            r8 = (s8g) r8;
                            uyj uyjVar = r8.a;
                            ryj ryjVar = uyjVar instanceof ryj ? (ryj) uyjVar : null;
                            if (ryjVar != null && ryjVar.a == i9) {
                                r8 = new s8g(tyjVar);
                            }
                        }
                        arrayList.add(r8);
                    }
                    return tzj.a(tzjVar, l6g.W(arrayList), null, l6g.W(CollectionsKt.S(gv9Var7, 1)), 2);
                }
                wyj wyjVar = (wyj) CollectionsKt.firstOrNull(gv9Var5);
                if (wyjVar != null) {
                    TrendingGridTile trendingGridTile2 = wyjVar.b;
                    trendingGridTile2.getClass();
                    xyjVar = new wyj(i9, trendingGridTile2);
                } else {
                    xyjVar = new xyj(i9);
                }
                c0kVar.getClass();
                ArrayList arrayList2 = new ArrayList(k13.r(gv9Var6, 10));
                for (?? r6 : gv9Var6) {
                    if (r6 instanceof t8g) {
                        r6 = (t8g) r6;
                        yyj yyjVar = r6.c;
                        vyj vyjVar = yyjVar instanceof vyj ? (vyj) yyjVar : null;
                        if (vyjVar != null && vyjVar.a == i9) {
                            azj azjVar = r6.a;
                            azj azjVar2 = r6.b;
                            azjVar.getClass();
                            azjVar2.getClass();
                            u8gVar = new t8g(xyjVar, azjVar, azjVar2);
                            r6 = u8gVar;
                        }
                        arrayList2.add(r6);
                    } else {
                        if (r6 instanceof u8g) {
                            r6 = (u8g) r6;
                            yyj yyjVar2 = r6.a;
                            vyj vyjVar2 = yyjVar2 instanceof vyj ? (vyj) yyjVar2 : null;
                            if (vyjVar2 != null && vyjVar2.a == i9) {
                                azj azjVar3 = r6.b;
                                azj azjVar4 = r6.c;
                                azjVar3.getClass();
                                azjVar4.getClass();
                                u8gVar = new u8g(xyjVar, azjVar3, azjVar4);
                                r6 = u8gVar;
                            }
                        }
                        arrayList2.add(r6);
                    }
                }
                return tzj.a(tzjVar, l6g.W(arrayList2), l6g.W(CollectionsKt.S(gv9Var5, 1)), null, 4);
            case 14:
                tok tokVar = (tok) obj3;
                qhe qheVar2 = (qhe) obj2;
                phe pheVar2 = (phe) obj;
                int i23 = tokVar.b;
                mbj mbjVar = tokVar.a;
                gwj gwjVar = tokVar.c;
                bej bejVar = (bej) tokVar.d.invoke();
                mbjVar.a(ewd.a, b0a.H(pheVar2, i23, gwjVar, bejVar != null ? bejVar.a : null, false, qheVar2.a), i9, qheVar2.b);
                phe.h(pheVar2, qheVar2, 0, Math.round(-mbjVar.a.h()));
                return Unit.a;
            case 15:
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                glg glgVar = (glg) obj;
                glgVar.getClass();
                nlg V0 = glgVar.V0("UPDATE vote_table SET userChoice =? WHERE id = ? AND voteType = ?");
                try {
                    V0.L(1, str2);
                    V0.q(2, i9);
                    V0.L(3, str3);
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 16:
                koh kohVar = (koh) obj3;
                Context context = (Context) obj2;
                dma dmaVar = (dma) obj;
                dmaVar.getClass();
                Integer valueOf = Integer.valueOf(i9);
                dma K = dmaVar.K();
                int intBitsToFloat = (int) Float.intBitsToFloat((int) ((K != null ? K.l(dmaVar, 0L) : 0L) >> 32));
                dma K2 = dmaVar.K();
                kohVar.put(valueOf, new x6a(intBitsToFloat, 0, ao2.s(8, context) + ((int) Float.intBitsToFloat((int) ((K2 != null ? K2.l(dmaVar, 0L) : 0L) >> 32))) + ((int) (dmaVar.e() >> 32)), 0));
                return Unit.a;
            default:
                ((Boolean) obj).getClass();
                zic.Q((BaseActivity) obj3, i9, ((uv3) obj2).a);
                return Unit.a;
        }
    }

    public /* synthetic */ y51(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
