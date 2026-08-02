package defpackage;

import com.sofascore.results.league.historical.topperformance.HistoricalDataTopPerformanceModal;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class xb9 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ HistoricalDataTopPerformanceModal b;

    public /* synthetic */ xb9(HistoricalDataTopPerformanceModal historicalDataTopPerformanceModal, int i) {
        this.a = i;
        this.b = historicalDataTopPerformanceModal;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List f0;
        int i = this.a;
        HistoricalDataTopPerformanceModal historicalDataTopPerformanceModal = this.b;
        switch (i) {
            case 0:
                e1d e1dVar = historicalDataTopPerformanceModal.H;
                List list = (List) obj;
                list.getClass();
                e1d e1dVar2 = historicalDataTopPerformanceModal.G;
                ((eoh) e1dVar2).setValue(list);
                Object obj2 = null;
                if (historicalDataTopPerformanceModal.J) {
                    historicalDataTopPerformanceModal.J = false;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (Intrinsics.c(((rlj) next).g0(), (String) historicalDataTopPerformanceModal.E.getValue())) {
                                obj2 = next;
                            }
                        }
                    }
                    rlj rljVar = (rlj) obj2;
                    if (rljVar == null) {
                        rljVar = (rlj) CollectionsKt.firstOrNull(list);
                    }
                    ((eoh) e1dVar).setValue(rljVar);
                } else {
                    rlj rljVar2 = (rlj) ((eoh) e1dVar).getValue();
                    String g0 = rljVar2 != null ? rljVar2.g0() : null;
                    Iterator it2 = ((List) ((eoh) e1dVar2).getValue()).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next2 = it2.next();
                            if (Intrinsics.c(((rlj) next2).g0(), g0)) {
                                obj2 = next2;
                            }
                        }
                    }
                    ((eoh) e1dVar).setValue((rlj) obj2);
                }
                rlj rljVar3 = (rlj) ((eoh) e1dVar).getValue();
                if (rljVar3 != null && (f0 = rljVar3.f0()) != null) {
                    ((tlj) historicalDataTopPerformanceModal.I.getValue()).F(f0);
                }
                break;
            default:
                rlj rljVar4 = (rlj) obj;
                rljVar4.getClass();
                ((eoh) historicalDataTopPerformanceModal.H).setValue(rljVar4);
                ((tlj) historicalDataTopPerformanceModal.I.getValue()).F(rljVar4.f0());
                break;
        }
        return Unit.a;
    }
}
