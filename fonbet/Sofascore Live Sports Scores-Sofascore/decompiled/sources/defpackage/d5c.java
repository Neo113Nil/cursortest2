package defpackage;

import com.sofascore.model.newNetwork.StageDriverPerformance;
import com.sofascore.model.newNetwork.StageDriverPerformanceRaceStage;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d5c implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ d5c(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Object obj3;
        Integer position;
        Integer position2;
        int i = this.a;
        Object obj4 = null;
        int i2 = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(((r5c) obj2).a.getId() == i2).compareTo(Boolean.valueOf(((r5c) obj).a.getId() == i2));
            case 1:
                return Boolean.valueOf(((r5c) obj2).a.getId() == i2).compareTo(Boolean.valueOf(((r5c) obj).a.getId() == i2));
            case 2:
                Iterator<T> it = ((StageDriverPerformance) obj).getStages().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj3 = it.next();
                        if (((StageDriverPerformanceRaceStage) obj3).getStage() == i2) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                StageDriverPerformanceRaceStage stageDriverPerformanceRaceStage = (StageDriverPerformanceRaceStage) obj3;
                int i3 = Integer.MAX_VALUE;
                Integer valueOf = Integer.valueOf((stageDriverPerformanceRaceStage == null || (position2 = stageDriverPerformanceRaceStage.getPosition()) == null) ? Integer.MAX_VALUE : position2.intValue());
                Iterator<T> it2 = ((StageDriverPerformance) obj2).getStages().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (((StageDriverPerformanceRaceStage) next).getStage() == i2) {
                            obj4 = next;
                        }
                    }
                }
                StageDriverPerformanceRaceStage stageDriverPerformanceRaceStage2 = (StageDriverPerformanceRaceStage) obj4;
                if (stageDriverPerformanceRaceStage2 != null && (position = stageDriverPerformanceRaceStage2.getPosition()) != null) {
                    i3 = position.intValue();
                }
                return valueOf.compareTo(Integer.valueOf(i3));
            case 3:
                Pair pair = (Pair) CollectionsKt.a0(i2, ((qyi) obj2).c);
                Double d = pair != null ? (Double) pair.b : null;
                Pair pair2 = (Pair) CollectionsKt.a0(i2, ((qyi) obj).c);
                return o93.b(d, pair2 != null ? (Double) pair2.b : null);
            default:
                Pair pair3 = (Pair) CollectionsKt.a0(i2, ((qyi) obj2).c);
                Double d2 = pair3 != null ? (Double) pair3.b : null;
                Pair pair4 = (Pair) CollectionsKt.a0(i2, ((qyi) obj).c);
                return o93.b(d2, pair4 != null ? (Double) pair4.b : null);
        }
    }
}
