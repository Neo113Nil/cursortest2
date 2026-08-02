package defpackage;

import com.sofascore.model.newNetwork.HistoricalSeasonComparisonResponse;
import com.sofascore.model.newNetwork.SeasonHighlightedComparison;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fya extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ gya t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fya(gya gyaVar, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = gyaVar;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        gya gyaVar = this.t;
        switch (i) {
            case 0:
                return new fya(gyaVar, i2, rq3Var, 0);
            default:
                return new fya(gyaVar, i2, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((fya) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        List<SeasonHighlightedComparison> comparisons;
        int i = this.r;
        int i2 = this.u;
        gya gyaVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    w3b w3bVar = gyaVar.e;
                    this.s = 1;
                    obj = w3bVar.e(i2, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                HistoricalSeasonComparisonResponse historicalSeasonComparisonResponse = (HistoricalSeasonComparisonResponse) obj;
                if (historicalSeasonComparisonResponse == null || (comparisons = historicalSeasonComparisonResponse.getComparisons()) == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(k13.r(comparisons, 10));
                Iterator<T> it = comparisons.iterator();
                while (it.hasNext()) {
                    arrayList.add(((SeasonHighlightedComparison) it.next()).getSeason());
                }
                return CollectionsKt.B0(arrayList);
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar2 = gyaVar.e;
                this.s = 1;
                Object q0 = w3bVar2.q0(i2, this);
                return q0 == lu3Var2 ? lu3Var2 : q0;
        }
    }
}
