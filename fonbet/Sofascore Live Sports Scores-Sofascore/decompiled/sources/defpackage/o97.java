package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyFootballPlayerPlaceholder;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class o97 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb7 b;

    public /* synthetic */ o97(wb7 wb7Var, int i) {
        this.a = i;
        this.b = wb7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        pb7 pb7Var;
        gv9 W;
        int i;
        double o;
        double d;
        Float f;
        Object value2;
        pb7 pb7Var2;
        gv9 W2;
        int i2;
        double o2;
        double d2;
        Float f2;
        oz6 oz6Var;
        ArrayList arrayList;
        int i3 = this.a;
        wb7 wb7Var = this.b;
        switch (i3) {
            case 0:
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) obj;
                fantasyRoundPlayerUiModel.getClass();
                wb7Var.getClass();
                fdi fdiVar = wb7Var.j;
                gv9<oz6> gv9Var = ((pb7) fdiVar.getValue()).j;
                ArrayList arrayList2 = new ArrayList(k13.r(gv9Var, 10));
                for (oz6 oz6Var2 : gv9Var) {
                    if (oz6Var2.getE() == fantasyRoundPlayerUiModel.a) {
                        oz6Var2 = new FantasyFootballPlayerPlaceholder(fantasyRoundPlayerUiModel.b, fantasyRoundPlayerUiModel.d);
                    }
                    arrayList2.add(oz6Var2);
                }
                do {
                    value = fdiVar.getValue();
                    pb7Var = (pb7) value;
                    W = l6g.W(arrayList2);
                    if (arrayList2.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it = arrayList2.iterator();
                        int i4 = 0;
                        while (it.hasNext()) {
                            if ((((oz6) it.next()) instanceof FantasyRoundPlayerUiModel) && (i4 = i4 + 1) < 0) {
                                b.p();
                                throw null;
                            }
                        }
                        i = i4;
                    }
                    o = wb7.o(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    d = 0.0d;
                    while (it2.hasNext()) {
                        oz6 oz6Var3 = (oz6) it2.next();
                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = oz6Var3 instanceof FantasyRoundPlayerUiModel ? (FantasyRoundPlayerUiModel) oz6Var3 : null;
                        d += (fantasyRoundPlayerUiModel2 == null || (f = fantasyRoundPlayerUiModel2.q) == null) ? 0.0d : f.floatValue();
                    }
                } while (!fdiVar.k(value, pb7.a(pb7Var, null, null, 0, 0, null, null, null, null, null, W, i, o, d, false, null, false, null, false, null, false, null, null, 8380927)));
                wb7Var.w();
                return Unit.a;
            default:
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel3 = (FantasyRoundPlayerUiModel) obj;
                fantasyRoundPlayerUiModel3.getClass();
                fdi fdiVar2 = wb7Var.j;
                oz6 oz6Var4 = ((pb7) fdiVar2.getValue()).i;
                if (oz6Var4 != null) {
                    gv9<oz6> gv9Var2 = ((pb7) fdiVar2.getValue()).j;
                    ArrayList arrayList3 = new ArrayList(k13.r(gv9Var2, 10));
                    for (oz6 oz6Var5 : gv9Var2) {
                        if (oz6Var5.getE() == oz6Var4.getE()) {
                            oz6Var = oz6Var4;
                            arrayList = arrayList3;
                            oz6Var5 = FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel3, null, oz6Var4.getC(), false, false, false, null, null, 536870903);
                        } else {
                            oz6Var = oz6Var4;
                            arrayList = arrayList3;
                            if (oz6Var5 instanceof FantasyRoundPlayerUiModel) {
                                oz6Var5 = FantasyRoundPlayerUiModel.b((FantasyRoundPlayerUiModel) oz6Var5, null, 0, false, false, false, null, null, 536870891);
                            } else if (oz6Var5 instanceof FantasyFootballPlayerPlaceholder) {
                                oz6Var5 = FantasyFootballPlayerPlaceholder.b((FantasyFootballPlayerPlaceholder) oz6Var5, null, false, 21);
                            }
                        }
                        arrayList.add(oz6Var5);
                        arrayList3 = arrayList;
                        oz6Var4 = oz6Var;
                    }
                    ArrayList arrayList4 = arrayList3;
                    do {
                        value2 = fdiVar2.getValue();
                        pb7Var2 = (pb7) value2;
                        W2 = l6g.W(arrayList4);
                        if (arrayList4.isEmpty()) {
                            i2 = 0;
                        } else {
                            Iterator it3 = arrayList4.iterator();
                            int i5 = 0;
                            while (it3.hasNext()) {
                                if ((((oz6) it3.next()) instanceof FantasyRoundPlayerUiModel) && (i5 = i5 + 1) < 0) {
                                    b.p();
                                    throw null;
                                }
                            }
                            i2 = i5;
                        }
                        o2 = wb7.o(arrayList4);
                        Iterator it4 = arrayList4.iterator();
                        d2 = 0.0d;
                        while (it4.hasNext()) {
                            oz6 oz6Var6 = (oz6) it4.next();
                            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel4 = oz6Var6 instanceof FantasyRoundPlayerUiModel ? (FantasyRoundPlayerUiModel) oz6Var6 : null;
                            d2 += (fantasyRoundPlayerUiModel4 == null || (f2 = fantasyRoundPlayerUiModel4.q) == null) ? 0.0d : f2.floatValue();
                        }
                    } while (!fdiVar2.k(value2, pb7.a(pb7Var2, null, null, 0, 0, null, null, null, null, null, W2, i2, o2, d2, false, null, false, null, false, null, false, null, null, 8380671)));
                    wb7Var.w();
                }
                return Unit.a;
        }
    }
}
