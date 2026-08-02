package defpackage;

import android.content.Context;
import com.sofascore.results.main.fantasy.center.reorder.FantasyReorderUserCompetitionsBottomSheet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ag7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyReorderUserCompetitionsBottomSheet b;

    public /* synthetic */ ag7(FantasyReorderUserCompetitionsBottomSheet fantasyReorderUserCompetitionsBottomSheet, int i) {
        this.a = i;
        this.b = fantasyReorderUserCompetitionsBottomSheet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [g7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [km5] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        gv9 gv9Var;
        int i = this.a;
        FantasyReorderUserCompetitionsBottomSheet fantasyReorderUserCompetitionsBottomSheet = this.b;
        ?? r2 = 0;
        r2 = 0;
        switch (i) {
            case 0:
                Object value = ((ypb) fantasyReorderUserCompetitionsBottomSheet.B.getValue()).j.a.getValue();
                ppb ppbVar = value instanceof ppb ? (ppb) value : null;
                if (ppbVar != null && (gv9Var = ppbVar.a) != null) {
                    r2 = new ArrayList(k13.r(gv9Var, 10));
                    Iterator it = gv9Var.iterator();
                    while (it.hasNext()) {
                        r2.add(((do7) it.next()).c);
                    }
                }
                if (r2 == 0) {
                    r2 = km5.a;
                }
                Context requireContext = fantasyReorderUserCompetitionsBottomSheet.requireContext();
                requireContext.getClass();
                ?? gv6Var = new gv6(requireContext);
                gv6Var.F(r2);
                return gv6Var;
            default:
                ypb ypbVar = (ypb) fantasyReorderUserCompetitionsBottomSheet.B.getValue();
                ArrayList arrayList = ((gv6) fantasyReorderUserCompetitionsBottomSheet.D.getValue()).i;
                ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(((ev6) it2.next()).c));
                }
                nh0 X0 = CollectionsKt.X0(arrayList2);
                int c = sub.c(k13.r(X0, 10));
                if (c < 16) {
                    c = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                Iterator it3 = X0.iterator();
                while (true) {
                    sc5 sc5Var = (sc5) it3;
                    if (!sc5Var.b.hasNext()) {
                        ypb.m(ypbVar, new uf8(29, linkedHashMap, arrayList2));
                        xw3.L(un0.z(ypbVar), null, null, new gjb(ypbVar, arrayList2, null, 3), 3);
                        fantasyReorderUserCompetitionsBottomSheet.j();
                        return Unit.a;
                    }
                    IndexedValue indexedValue = (IndexedValue) sc5Var.next();
                    linkedHashMap.put(Integer.valueOf(((Number) indexedValue.b).intValue()), Integer.valueOf(indexedValue.a));
                }
        }
    }
}
