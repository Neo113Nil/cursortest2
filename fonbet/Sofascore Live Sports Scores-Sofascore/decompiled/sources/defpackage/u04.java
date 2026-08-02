package defpackage;

import com.sofascore.model.TeamSelection;
import com.sofascore.model.mvvm.model.CricketEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.HockeyShotmapItem;
import com.sofascore.results.event.details.view.cricket.runsperover.CricketRunsPerOverGraphView;
import com.sofascore.results.event.statistics.view.hockey.HockeyEventMapView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class u04 implements d5k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u04(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.d5k
    public final void a(int i, String str) {
        int i2 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                v04 v04Var = (v04) obj;
                str.getClass();
                ((CricketRunsPerOverGraphView) ((w04) obj3).d.f).f((CricketEvent) ((Event) obj2), (Pair) v04Var.a.get(i), b.i(v04Var.a) == i, true);
                break;
            default:
                fe9 fe9Var = (fe9) obj2;
                TeamSelection teamSelection = (TeamSelection) obj;
                str.getClass();
                he9.f.getClass();
                he9 s = p4h.s(str);
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) obj3).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    HockeyShotmapItem hockeyShotmapItem = (HockeyShotmapItem) next;
                    if (s == he9.g || hockeyShotmapItem.getType() == s.a) {
                        arrayList.add(next);
                    }
                }
                ((HockeyEventMapView) fe9Var.k.e).d(arrayList, teamSelection);
                break;
        }
    }
}
