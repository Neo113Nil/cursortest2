package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.n;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Status;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.model.network.response.EventStatisticsGroup;
import com.sofascore.model.network.response.EventStatisticsItem;
import com.sofascore.model.network.response.EventStatisticsPeriod;
import com.sofascore.model.newNetwork.TeamEventShotmapWrapper;
import com.sofascore.results.event.statistics.EventStatisticsFragment;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class qb6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventStatisticsFragment b;

    public /* synthetic */ qb6(EventStatisticsFragment eventStatisticsFragment, int i) {
        this.a = i;
        this.b = eventStatisticsFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        be9 be9Var;
        ml8 E;
        List list2;
        EventStatisticsPeriod eventStatisticsPeriod;
        Object obj2;
        List<EventStatisticsItem> statisticsItems;
        b56 b56Var;
        int i = this.a;
        EventStatisticsFragment eventStatisticsFragment = this.b;
        switch (i) {
            case 0:
                joa joaVar = eventStatisticsFragment.x;
                joa joaVar2 = eventStatisticsFragment.y;
                joa joaVar3 = eventStatisticsFragment.w;
                qei qeiVar = (qei) obj;
                if (eventStatisticsFragment.u) {
                    String s = ok3.s(eventStatisticsFragment.D());
                    int hashCode = s.hashCode();
                    if (hashCode == -2002238939) {
                        s.equals(Sports.ICE_HOCKEY);
                    } else if (hashCode != 394668909) {
                        if (hashCode == 727149765 && s.equals(Sports.BASKETBALL)) {
                            ns1 ns1Var = (ns1) joaVar3.getValue();
                            if (ns1Var != null) {
                                g7.o(eventStatisticsFragment.C(), ns1Var, 6);
                            }
                            ns1 ns1Var2 = (ns1) joaVar3.getValue();
                            if (ns1Var2 != null) {
                                int id = Event.getHomeTeam$default(eventStatisticsFragment.D(), null, 1, null).getId();
                                int id2 = Event.getAwayTeam$default(eventStatisticsFragment.D(), null, 1, null).getId();
                                nr1 nr1Var = ns1Var2.j;
                                ImageView imageView = (ImageView) nr1Var.e;
                                ImageView imageView2 = (ImageView) nr1Var.f;
                                imageView.setVisibility(0);
                                imageView2.setVisibility(0);
                                as9.o((ImageView) nr1Var.e, id);
                                as9.o(imageView2, id2);
                            }
                        }
                    } else if (s.equals(Sports.FOOTBALL) && (b56Var = (b56) joaVar2.getValue()) != null) {
                        b56Var.l(Event.getHomeTeam$default(eventStatisticsFragment.D(), null, 1, null).getId(), Event.getAwayTeam$default(eventStatisticsFragment.D(), null, 1, null).getId());
                    }
                    qei qeiVar2 = (qei) eventStatisticsFragment.F().h.d();
                    if (qeiVar2 != null && (list2 = qeiVar2.a) != null && (eventStatisticsPeriod = (EventStatisticsPeriod) CollectionsKt.firstOrNull(list2)) != null) {
                        if (!Intrinsics.c(ok3.s(eventStatisticsFragment.D()), Sports.FOOTBALL)) {
                            eventStatisticsPeriod = null;
                        }
                        if (eventStatisticsPeriod != null) {
                            Iterator<T> it = eventStatisticsPeriod.getGroups().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (Intrinsics.c(((EventStatisticsGroup) obj2).getGroupName(), "Match overview")) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            EventStatisticsGroup eventStatisticsGroup = (EventStatisticsGroup) obj2;
                            if (((eventStatisticsGroup == null || (statisticsItems = eventStatisticsGroup.getStatisticsItems()) == null) ? 0 : statisticsItems.size()) > 2) {
                                FragmentActivity requireActivity = eventStatisticsFragment.requireActivity();
                                k0 k0Var = new k0(eventStatisticsFragment, 5);
                                u6b viewLifecycleOwner = eventStatisticsFragment.getViewLifecycleOwner();
                                viewLifecycleOwner.getClass();
                                requireActivity.addMenuProvider(k0Var, viewLifecycleOwner, e6b.e);
                            }
                        }
                    }
                }
                if (eventStatisticsFragment.u || eventStatisticsFragment.F().j) {
                    String s2 = ok3.s(eventStatisticsFragment.D());
                    int hashCode2 = s2.hashCode();
                    if (hashCode2 != -2002238939) {
                        if (hashCode2 != 394668909) {
                            if (hashCode2 == 727149765 && s2.equals(Sports.BASKETBALL)) {
                                TeamEventShotmapWrapper teamEventShotmapWrapper = qeiVar.d;
                                ns1 ns1Var3 = (ns1) joaVar3.getValue();
                                if (ns1Var3 != null) {
                                    ns1Var3.setShotMapData(teamEventShotmapWrapper);
                                }
                            }
                        } else if (s2.equals(Sports.FOOTBALL)) {
                            gc6 gc6Var = qeiVar.b;
                            b56 b56Var2 = (b56) joaVar2.getValue();
                            if (b56Var2 != null) {
                                Status status = eventStatisticsFragment.D().getStatus();
                                Time time = eventStatisticsFragment.D().getTime();
                                int i2 = b56.j;
                                b56Var2.j(gc6Var, status, time, true);
                            }
                            List list3 = qeiVar.c;
                            if (list3 != null) {
                                if (list3.isEmpty()) {
                                    list3 = null;
                                }
                                if (list3 != null && (E = eventStatisticsFragment.E()) != null) {
                                    E.l(list3);
                                }
                            }
                        }
                    } else if (s2.equals(Sports.ICE_HOCKEY) && (list = qeiVar.e) != null) {
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list != null && (be9Var = (be9) joaVar.getValue()) != null) {
                            be9Var.t(list);
                        }
                    }
                }
                krk krkVar = eventStatisticsFragment.l;
                krkVar.getClass();
                SegmentedButtonsView segmentedButtonsView = ((fo8) krkVar).b;
                List<EventStatisticsPeriod> list4 = qeiVar.a;
                ArrayList arrayList = new ArrayList(k13.r(list4, 10));
                for (EventStatisticsPeriod eventStatisticsPeriod2 : list4) {
                    String period = eventStatisticsPeriod2.getPeriod();
                    Set set = f5k.a;
                    Context requireContext = eventStatisticsFragment.requireContext();
                    requireContext.getClass();
                    arrayList.add(new s1h(period, f5k.a(requireContext, eventStatisticsPeriod2.getPeriod(), ok3.s(eventStatisticsFragment.D())), true));
                }
                SegmentedButtonsView.t(segmentedButtonsView, arrayList, null, 6);
                gc6 gc6Var2 = qeiVar.b;
                int i3 = b56.j;
                gc6 gc6Var3 = tgj.N(eventStatisticsFragment.D().getStatus(), eventStatisticsFragment.D().getTime()) ? gc6Var2 : null;
                nb6 C = eventStatisticsFragment.C();
                List list5 = qeiVar.a;
                ml8 E2 = eventStatisticsFragment.E();
                be9 be9Var2 = (be9) joaVar.getValue();
                b56 b56Var3 = (b56) joaVar2.getValue();
                C.getClass();
                list5.getClass();
                C.q = gc6Var3;
                C.r = E2;
                C.s = be9Var2;
                C.t = b56Var3;
                C.n = list5;
                C.A();
                eventStatisticsFragment.u = false;
                break;
            case 1:
                ((View) obj).getClass();
                krk krkVar2 = eventStatisticsFragment.l;
                krkVar2.getClass();
                n layoutManager = ((fo8) krkVar2).c.getLayoutManager();
                layoutManager.getClass();
                ((LinearLayoutManager) layoutManager).startSmoothScroll((sb6) eventStatisticsFragment.C.getValue());
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                eventStatisticsFragment.F().j = booleanValue;
                if (booleanValue) {
                    eventStatisticsFragment.F().m(eventStatisticsFragment.D());
                }
                break;
        }
        return Unit.a;
    }
}
