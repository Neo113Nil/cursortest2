package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.n;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.event.details.view.odds.GambleRegulationFooterView;
import com.sofascore.results.fantasy.competition.fixtures.FantasyCompetitionFixturesFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class up6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyCompetitionFixturesFragment b;

    public /* synthetic */ up6(FantasyCompetitionFixturesFragment fantasyCompetitionFixturesFragment, int i) {
        this.a = i;
        this.b = fantasyCompetitionFixturesFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        zsk zskVar;
        Boolean bool;
        boolean z;
        int i = this.a;
        int i2 = 4;
        int i3 = 0;
        FantasyCompetitionFixturesFragment fantasyCompetitionFixturesFragment = this.b;
        switch (i) {
            case 0:
                ((View) obj).getClass();
                krk krkVar = fantasyCompetitionFixturesFragment.l;
                krkVar.getClass();
                ((r68) krkVar).e.scrollToPosition(0);
                break;
            case 1:
                gy6 gy6Var = (gy6) obj;
                gy6Var.getClass();
                fdi fdiVar = fantasyCompetitionFixturesFragment.D().p;
                fdiVar.getClass();
                fdiVar.m(null, gy6Var);
                break;
            case 2:
                fo1 fo1Var = (fo1) obj;
                fo1Var.getClass();
                FantasyCompetitionFixturesFragment fantasyCompetitionFixturesFragment2 = this.b;
                fdi fdiVar2 = fantasyCompetitionFixturesFragment2.D().o;
                fdiVar2.getClass();
                fdiVar2.m(null, fo1Var);
                fantasyCompetitionFixturesFragment2.y = false;
                fantasyCompetitionFixturesFragment2.C().s();
                sp6 C = fantasyCompetitionFixturesFragment2.C();
                C.t();
                C.e.clear();
                C.f.clear();
                C.g.clear();
                C.h.clear();
                C.notifyDataSetChanged();
                fantasyCompetitionFixturesFragment2.D().m();
                fdi fdiVar3 = fantasyCompetitionFixturesFragment2.D().q;
                Boolean bool2 = Boolean.TRUE;
                fdiVar3.getClass();
                fdiVar3.m(null, bool2);
                sp6 C2 = fantasyCompetitionFixturesFragment2.C();
                LinkedHashMap linkedHashMap = fantasyCompetitionFixturesFragment2.t;
                String str = fo1Var.b;
                Object obj2 = linkedHashMap.get(str);
                if (obj2 == null) {
                    g6b lifecycle = fantasyCompetitionFixturesFragment2.getLifecycle();
                    lifecycle.getClass();
                    obj2 = new zsk(lifecycle, 45);
                    linkedHashMap.put(str, obj2);
                }
                zsk zskVar2 = (zsk) obj2;
                if (zskVar2.e > 0) {
                    zskVar2.e = (int) (System.currentTimeMillis() / 1000);
                }
                zskVar2.c(new ny(0, fantasyCompetitionFixturesFragment2, FantasyCompetitionFixturesFragment.class, "oddsImpression", "oddsImpression()V", 0, 27), null);
                if (!Intrinsics.c(C2.v, zskVar2) && (zskVar = C2.v) != null) {
                    zskVar.a();
                }
                C2.v = zskVar2;
                break;
            case 3:
                kda.p(wca.x(fantasyCompetitionFixturesFragment.getLifecycle()), new n50((List) obj, fantasyCompetitionFixturesFragment, null, 5), new up6(fantasyCompetitionFixturesFragment, i2));
                break;
            default:
                joa joaVar = fantasyCompetitionFixturesFragment.w;
                joa joaVar2 = fantasyCompetitionFixturesFragment.v;
                List list = (List) obj;
                list.getClass();
                fantasyCompetitionFixturesFragment.C().F(list);
                joa joaVar3 = fantasyCompetitionFixturesFragment.u;
                GambleRegulationFooterView gambleRegulationFooterView = (GambleRegulationFooterView) joaVar3.getValue();
                List list2 = (List) fantasyCompetitionFixturesFragment.D().j.d();
                if (list2 != null) {
                    if (!list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (((dy6) it.next()) instanceof cy6) {
                                z = true;
                                bool = Boolean.valueOf(z);
                            }
                        }
                    }
                    z = false;
                    bool = Boolean.valueOf(z);
                } else {
                    bool = null;
                }
                gambleRegulationFooterView.setVisibility(Intrinsics.c(bool, Boolean.TRUE) ? 0 : 8);
                g7.o(fantasyCompetitionFixturesFragment.C(), (GambleRegulationFooterView) joaVar3.getValue(), 6);
                krk krkVar2 = fantasyCompetitionFixturesFragment.l;
                krkVar2.getClass();
                fantasyCompetitionFixturesFragment.t(((r68) krkVar2).e, new up6(fantasyCompetitionFixturesFragment, i3));
                cq6 D = fantasyCompetitionFixturesFragment.D();
                u6b viewLifecycleOwner = fantasyCompetitionFixturesFragment.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                D.g(viewLifecycleOwner, new tp6(fantasyCompetitionFixturesFragment, 1));
                if (!fantasyCompetitionFixturesFragment.y) {
                    fantasyCompetitionFixturesFragment.y = true;
                    ia0 ia0Var = ia0.q;
                    if (mz1.C()) {
                        r15.p(fantasyCompetitionFixturesFragment.C().g.size(), (AdBannerView) joaVar2.getValue());
                        g7.o(fantasyCompetitionFixturesFragment.C(), (AdBannerView) joaVar.getValue(), 6);
                        ((AdBannerView) joaVar2.getValue()).c(AdType.Banner.FantasySmall);
                        ((AdBannerView) joaVar.getValue()).c(AdType.Banner.FantasyBig);
                    }
                    krk krkVar3 = fantasyCompetitionFixturesFragment.l;
                    krkVar3.getClass();
                    n layoutManager = ((r68) krkVar3).e.getLayoutManager();
                    layoutManager.getClass();
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    ArrayList arrayList = fantasyCompetitionFixturesFragment.C().i;
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    Iterator it2 = arrayList.iterator();
                    int i4 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            Event d = next instanceof y21 ? ((y21) next).d() : next instanceof fy6 ? ((fy6) next).a.d() : null;
                            if (!Intrinsics.c(d != null ? d.getStatusType() : null, StatusKt.STATUS_IN_PROGRESS)) {
                                if (!Intrinsics.c(d != null ? d.getStatusType() : null, StatusKt.STATUS_NOT_STARTED) || d.getStartTimestamp() < currentTimeMillis) {
                                    i4++;
                                }
                            }
                        } else {
                            i4 = -1;
                        }
                    }
                    if (i4 > 4) {
                        i3 = i4 - 3;
                    } else if (i4 < 0) {
                        i3 = arrayList.size() - 1;
                    }
                    linearLayoutManager.scrollToPosition(i3);
                }
                break;
        }
        return Unit.a;
    }
}
