package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wc7 extends hoi implements Function2 {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ boolean s;
    public /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc7(boolean z, gv9 gv9Var, gv9 gv9Var2, yc7 yc7Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = z;
        this.t = gv9Var;
        this.u = gv9Var2;
        this.v = yc7Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.v;
        Object obj3 = this.u;
        switch (i) {
            case 0:
                return new wc7(this.s, (gv9) this.t, (gv9) obj3, (yc7) obj2, rq3Var);
            default:
                wc7 wc7Var = new wc7((lcj) obj3, (qze) obj2, this.s, rq3Var);
                wc7Var.t = obj;
                return wc7Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((wc7) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, lm5] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, lm5] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.LinkedHashMap] */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        ?? linkedHashMap;
        ?? linkedHashMap2;
        List B0;
        List B02;
        int i = this.r;
        boolean z = this.s;
        Object obj2 = this.v;
        Object obj3 = this.u;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                gv9 gv9Var = (gv9) this.t;
                if (z) {
                    if (gv9Var != null && (B02 = CollectionsKt.B0(gv9Var)) != null) {
                        linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : B02) {
                            String str = ((FantasyPlayerFixtureUiModel) obj4).e;
                            Object obj5 = linkedHashMap.get(str);
                            if (obj5 == null) {
                                obj5 = wv8.n(linkedHashMap, str);
                            }
                            ((List) obj5).add(obj4);
                        }
                    }
                    linkedHashMap = 0;
                } else {
                    if (gv9Var != null) {
                        linkedHashMap = new LinkedHashMap();
                        for (Object obj6 : gv9Var) {
                            String str2 = ((FantasyPlayerFixtureUiModel) obj6).e;
                            Object obj7 = linkedHashMap.get(str2);
                            if (obj7 == null) {
                                obj7 = wv8.n(linkedHashMap, str2);
                            }
                            ((List) obj7).add(obj6);
                        }
                    }
                    linkedHashMap = 0;
                }
                if (linkedHashMap == 0) {
                    linkedHashMap = lm5.a;
                    linkedHashMap.getClass();
                }
                gv9 gv9Var2 = (gv9) obj3;
                if (z) {
                    if (gv9Var2 != null && (B0 = CollectionsKt.B0(gv9Var2)) != null) {
                        linkedHashMap2 = new LinkedHashMap();
                        for (Object obj8 : B0) {
                            String str3 = ((FantasyPlayerFixtureUiModel) obj8).e;
                            Object obj9 = linkedHashMap2.get(str3);
                            if (obj9 == null) {
                                obj9 = wv8.n(linkedHashMap2, str3);
                            }
                            ((List) obj9).add(obj8);
                        }
                    }
                    linkedHashMap2 = 0;
                } else {
                    if (gv9Var2 != null) {
                        linkedHashMap2 = new LinkedHashMap();
                        for (Object obj10 : gv9Var2) {
                            String str4 = ((FantasyPlayerFixtureUiModel) obj10).e;
                            Object obj11 = linkedHashMap2.get(str4);
                            if (obj11 == null) {
                                obj11 = wv8.n(linkedHashMap2, str4);
                            }
                            ((List) obj11).add(obj10);
                        }
                    }
                    linkedHashMap2 = 0;
                }
                if (linkedHashMap2 == 0) {
                    linkedHashMap2 = lm5.a;
                    linkedHashMap2.getClass();
                }
                List<String> S0 = CollectionsKt.S0(CollectionsKt.V0(y9h.f(linkedHashMap.keySet(), linkedHashMap2.keySet())));
                yc7 yc7Var = (yc7) obj2;
                xbb b = a.b();
                for (String str5 : S0) {
                    List list = (List) linkedHashMap.get(str5);
                    List list2 = (List) linkedHashMap2.get(str5);
                    int max = Math.max(list != null ? list.size() : 0, list2 != null ? list2.size() : 0);
                    int i2 = 0;
                    while (i2 < max) {
                        ?? r12 = list != null ? (FantasyPlayerFixtureUiModel) CollectionsKt.a0(i2, list) : rq3Var;
                        ?? r13 = list2 != null ? (FantasyPlayerFixtureUiModel) CollectionsKt.a0(i2, list2) : rq3Var;
                        FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel = r12 == 0 ? r13 : r12;
                        b.add(new h73(f5p.C(yc7Var.i(), fantasyPlayerFixtureUiModel != null ? fantasyPlayerFixtureUiModel.f : 0, str5), r12, r13));
                        i2++;
                        rq3Var = null;
                    }
                }
                return a.a(b);
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                ku3 ku3Var = (ku3) this.t;
                nu3 nu3Var = nu3.d;
                lcj lcjVar = (lcj) obj3;
                qze qzeVar = (qze) obj2;
                xw3.L(ku3Var, null, nu3Var, new baj(lcjVar, qzeVar, rq3Var, 4), 1);
                xw3.L(ku3Var, null, nu3Var, new jcj(qzeVar, lcjVar, z, (rq3) null), 1).n(new qo1(lcjVar, 2));
                return xw3.L(ku3Var, null, nu3Var, new jcj(lcjVar, qzeVar, z, (rq3) null), 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc7(lcj lcjVar, qze qzeVar, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = lcjVar;
        this.v = qzeVar;
        this.s = z;
    }
}
