package defpackage;

import com.sofascore.model.mvvm.model.Season;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class eoj extends hoi implements Function2 {
    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new eoj(2, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((eoj) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        jp5 entries = Season.SubSeasonType.getEntries();
        ArrayList arrayList = new ArrayList(k13.r(entries, 10));
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(((Season.SubSeasonType) it.next()).getLabel());
        }
        return arrayList;
    }
}
