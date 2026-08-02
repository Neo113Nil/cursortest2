package defpackage;

import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.player.statistics.career.model.PickerItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class el2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ el2(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (Intrinsics.c(((UniqueTournament) obj).getCompetitionType(), wk2.j.a)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new PickerItem.Tournament(wk2.j, (UniqueTournament) it.next(), Boolean.FALSE));
                }
                arrayList.addAll(arrayList3);
                if (arrayList.size() > 1) {
                    arrayList.add(0, new PickerItem.Tournament(wk2.j, null, Boolean.FALSE));
                }
                return arrayList;
            case 1:
                Object obj2 = list.get(2);
                obj2.getClass();
                return (Integer) obj2;
            case 2:
                return list;
            case 3:
                ljd ljdVar = ljd.a;
                return list.size() + " track events";
            case 4:
                ljd ljdVar2 = ljd.a;
                return list.size() + " do-not-track events";
            case 5:
                return ((KType) list.get(0)).getClassifier();
            case 6:
                return ((KType) list.get(0)).getClassifier();
            case 7:
                return Integer.valueOf(list.size());
            default:
                return zmm.a(list);
        }
    }
}
