package defpackage;

import android.view.View;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.newNetwork.BaseHockeyShotmapItem;
import com.sofascore.model.newNetwork.HockeyShotmapItem;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncident;
import com.sofascore.results.event.hockeyplaybyplay.EventHockeyPlayByPlayFragment;
import com.sofascore.results.event.statistics.view.hockey.HockeyEventMapView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class g16 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventHockeyPlayByPlayFragment b;

    public /* synthetic */ g16(EventHockeyPlayByPlayFragment eventHockeyPlayByPlayFragment, int i) {
        this.a = i;
        this.b = eventHockeyPlayByPlayFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        int i = this.a;
        EventHockeyPlayByPlayFragment eventHockeyPlayByPlayFragment = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                ((Integer) obj2).getClass();
                str.getClass();
                eventHockeyPlayByPlayFragment.F().s();
                joa joaVar = eventHockeyPlayByPlayFragment.w;
                eventHockeyPlayByPlayFragment.D(((vd9) joaVar.getValue()).e);
                krk krkVar = eventHockeyPlayByPlayFragment.l;
                krkVar.getClass();
                boolean canScrollVertically = ((yq8) krkVar).c.canScrollVertically(-1);
                Map map = (Map) ((n16) eventHockeyPlayByPlayFragment.r.getValue()).g.d();
                List list = map != null ? (List) map.getOrDefault(str, km5.a) : null;
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        HockeyShotmapItem eventMapItem = ((HockeyIncident) it.next()).getEventMapItem();
                        if (eventMapItem != null) {
                            arrayList.add(eventMapItem);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (((HockeyShotmapItem) next).getType() != BaseHockeyShotmapItem.ShotmapItemType.FACEOFF.getId()) {
                            arrayList2.add(next);
                        }
                    }
                    eventHockeyPlayByPlayFragment.F().F(list);
                    vd9 vd9Var = (vd9) joaVar.getValue();
                    vd9Var.getClass();
                    ((HockeyEventMapView) vd9Var.j.c).d(arrayList2, null);
                }
                if (!canScrollVertically) {
                    krk krkVar2 = eventHockeyPlayByPlayFragment.l;
                    krkVar2.getClass();
                    ((yq8) krkVar2).c.smoothScrollToPosition(0);
                }
                break;
            default:
                View view = (View) obj;
                List<ge9> list2 = (List) obj2;
                view.getClass();
                list2.getClass();
                if (list2.isEmpty()) {
                    break;
                } else {
                    ArrayList arrayList3 = new ArrayList(k13.r(list2, 10));
                    for (ge9 ge9Var : list2) {
                        arrayList3.add(new Pair(ge9Var.a, ge9Var.b));
                    }
                    xbb b = a.b();
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        Pair pair = (Pair) it3.next();
                        Object obj4 = pair.a;
                        if (obj4 != null && (obj3 = pair.b) != null) {
                            b.add(new Pair(obj4, obj3));
                        }
                    }
                    Pair[] pairArr = (Pair[]) a.a(b).toArray(new Pair[0]);
                    LinkedHashMap g = tub.g((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                    Set keySet = g.keySet();
                    keySet.getClass();
                    List S0 = CollectionsKt.S0(keySet);
                    if (S0.size() > 1) {
                        List j = b.j(CollectionsKt.a0(0, S0), CollectionsKt.a0(1, S0), CollectionsKt.a0(2, S0));
                        ((pse) eventHockeyPlayByPlayFragment.u.getValue()).e(view, (Player) j.get(0), (Player) j.get(1), (Player) j.get(2), new xw5(6, eventHockeyPlayByPlayFragment, g));
                    } else {
                        Object Y = CollectionsKt.Y(S0);
                        Y.getClass();
                        Player player = (Player) Y;
                        Object orDefault = g.getOrDefault(player, Boolean.TRUE);
                        orDefault.getClass();
                        eventHockeyPlayByPlayFragment.E(player, ((Boolean) orDefault).booleanValue());
                    }
                    break;
                }
        }
        return Unit.a;
    }
}
