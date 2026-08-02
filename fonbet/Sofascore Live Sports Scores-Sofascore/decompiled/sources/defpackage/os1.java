package defpackage;

import android.content.Context;
import com.sofascore.results.view.graph.BasketballShotmapPlayAreasGraph;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class os1 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ss1 b;

    public /* synthetic */ os1(ss1 ss1Var, int i) {
        this.a = i;
        this.b = ss1Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        a99 a99Var = nf3.a;
        utc utcVar = utc.a;
        final ss1 ss1Var = this.b;
        final int i2 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    String str = ss1Var.l;
                    bx7 bx7Var = ss1Var.k;
                    l98.r(str, bx7Var.c, bx7Var.b, bx7Var.d, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                fy7 fy7Var = ss1Var.m;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    bx7 bx7Var2 = ss1Var.k;
                    int i3 = fy7Var.a;
                    String str2 = fy7Var.c;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = str2;
                    fy7 fy7Var2 = bx7Var2.g;
                    Integer valueOf = fy7Var2 != null ? Integer.valueOf(fy7Var2.a) : null;
                    fy7 fy7Var3 = bx7Var2.h;
                    Integer valueOf2 = fy7Var3 != null ? Integer.valueOf(fy7Var3.a) : null;
                    Integer num = bx7Var2.m;
                    Integer num2 = bx7Var2.n;
                    Integer num3 = bx7Var2.q;
                    l98.v(i3, str3, valueOf, valueOf2, num, num2, num3 != null ? num3.intValue() : 0, fy7Var.h, av8Var2, 0, 0);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    xtc d = bkh.d(utcVar, 1.0f);
                    boolean i4 = av8Var3.i(ss1Var);
                    Object O = av8Var3.O();
                    if (i4 || O == a99Var) {
                        final int i5 = r6 ? 1 : 0;
                        O = new Function1() { // from class: rs1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i6 = i5;
                                ss1 ss1Var2 = ss1Var;
                                Context context = (Context) obj4;
                                switch (i6) {
                                    case 0:
                                        context.getClass();
                                        BasketballShotmapPlayAreasGraph basketballShotmapPlayAreasGraph = new BasketballShotmapPlayAreasGraph(context, null, 6, 0);
                                        zve zveVar = ss1Var2.n;
                                        se5 se5Var = ss1Var2.o;
                                        basketballShotmapPlayAreasGraph.b(zveVar, se5Var, false);
                                        basketballShotmapPlayAreasGraph.c(zveVar, se5Var, 3, false);
                                        return basketballShotmapPlayAreasGraph;
                                    default:
                                        context.getClass();
                                        BasketballShotmapPlayAreasGraph basketballShotmapPlayAreasGraph2 = new BasketballShotmapPlayAreasGraph(context, null, 6, 0);
                                        zve zveVar2 = ss1Var2.n;
                                        se5 se5Var2 = ss1Var2.o;
                                        basketballShotmapPlayAreasGraph2.b(zveVar2, se5Var2, false);
                                        basketballShotmapPlayAreasGraph2.c(zveVar2, se5Var2, 3, false);
                                        return basketballShotmapPlayAreasGraph2;
                                }
                            }
                        };
                        av8Var3.n0(O);
                    }
                    td4.a((Function1) O, d, null, av8Var3, 48, 4);
                } else {
                    av8Var3.W();
                }
                break;
            default:
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    boolean i6 = av8Var4.i(ss1Var);
                    Object O2 = av8Var4.O();
                    if (i6 || O2 == a99Var) {
                        O2 = new Function1() { // from class: rs1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i62 = i2;
                                ss1 ss1Var2 = ss1Var;
                                Context context = (Context) obj4;
                                switch (i62) {
                                    case 0:
                                        context.getClass();
                                        BasketballShotmapPlayAreasGraph basketballShotmapPlayAreasGraph = new BasketballShotmapPlayAreasGraph(context, null, 6, 0);
                                        zve zveVar = ss1Var2.n;
                                        se5 se5Var = ss1Var2.o;
                                        basketballShotmapPlayAreasGraph.b(zveVar, se5Var, false);
                                        basketballShotmapPlayAreasGraph.c(zveVar, se5Var, 3, false);
                                        return basketballShotmapPlayAreasGraph;
                                    default:
                                        context.getClass();
                                        BasketballShotmapPlayAreasGraph basketballShotmapPlayAreasGraph2 = new BasketballShotmapPlayAreasGraph(context, null, 6, 0);
                                        zve zveVar2 = ss1Var2.n;
                                        se5 se5Var2 = ss1Var2.o;
                                        basketballShotmapPlayAreasGraph2.b(zveVar2, se5Var2, false);
                                        basketballShotmapPlayAreasGraph2.c(zveVar2, se5Var2, 3, false);
                                        return basketballShotmapPlayAreasGraph2;
                                }
                            }
                        };
                        av8Var4.n0(O2);
                    }
                    td4.a((Function1) O2, f0, null, av8Var4, 48, 4);
                } else {
                    av8Var4.W();
                }
                break;
        }
        return Unit.a;
    }
}
