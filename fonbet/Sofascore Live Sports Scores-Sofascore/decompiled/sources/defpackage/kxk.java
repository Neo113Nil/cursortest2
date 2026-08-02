package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.newNetwork.EventGraphPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kxk extends a3 {
    public final e1d k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxk(Context context) {
        super(context, null, 0);
        context.getClass();
        this.k = e.f(null);
    }

    private final jxk getData() {
        return (jxk) ((eoh) this.k).getValue();
    }

    private final void setData(jxk jxkVar) {
        ((eoh) this.k).setValue(jxkVar);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-691832404);
        int i2 = (av8Var.g(this) ? 4 : 2) | i;
        int i3 = 1;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            jxk data = getData();
            if (data == null) {
                av8Var.d0(1168942955);
                av8Var.s(false);
            } else {
                av8Var.d0(1168942956);
                haa.f(yqo.H(-1259117265, av8Var, new exk(data, i3)), av8Var, 6);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lqj(this, i, 12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(Event event, List list) {
        TeamSides teamSides = null;
        int i = 1;
        int id = Event.getHomeTeam$default(event, null, 1, null).getId();
        int id2 = Event.getAwayTeam$default(event, null, 1, null).getId();
        String type = event.getStatus().getType();
        String statusDescription = event.getStatusDescription();
        int m = yid.m(Event.getHomeScore$default(event, null, 1, null).getDisplay());
        int m2 = yid.m(Event.getAwayScore$default(event, null, 1, null).getDisplay());
        Integer winnerCode$default = Event.getWinnerCode$default(event, null, 1, null);
        ixk ixkVar = new ixk(type, statusDescription, m, m2, winnerCode$default != null ? Boolean.valueOf(winnerCode$default.intValue() == 1) : null, event.getLastPeriod());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String period = ((EventGraphPoint) obj).getPeriod();
            Object obj2 = linkedHashMap.get(period);
            if (obj2 == null) {
                obj2 = wv8.n(linkedHashMap, period);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            int m3 = yid.m(Event.getHomeScore$default(event, teamSides, i, teamSides).getScoreByPeriodName(str));
            int m4 = yid.m(Event.getAwayScore$default(event, teamSides, i, teamSides).getScoreByPeriodName(str));
            gv9 W = l6g.W(list2);
            boolean z = (ok3.D(event) && Intrinsics.c(str, event.getLastPeriod())) ? i : 0;
            Iterator it = list2.iterator();
            if (!it.hasNext()) {
                yhk.d();
                return;
            }
            int abs = Math.abs(((EventGraphPoint) it.next()).getValue());
            while (it.hasNext()) {
                int abs2 = Math.abs(((EventGraphPoint) it.next()).getValue());
                if (abs < abs2) {
                    abs = abs2;
                }
            }
            int i2 = abs * 3;
            int i3 = i2 < 30 ? 30 : i2;
            EventGraphPoint eventGraphPoint = (EventGraphPoint) CollectionsKt.j0(list2);
            int m5 = yid.m(eventGraphPoint != null ? Integer.valueOf(eventGraphPoint.getSequence()) : null);
            int i4 = m3 + m4;
            if (m5 < i4) {
                m5 = i4;
            }
            int abs3 = (eventGraphPoint == null || m5 != eventGraphPoint.getSequence()) ? Math.abs(m3 - m4) : Math.abs(eventGraphPoint.getValue());
            List list3 = ywk.a;
            int max = Math.max(m3, m4);
            int i5 = CollectionsKt.c0(ywk.a, str) >= ywk.b ? 15 : 25;
            arrayList.add(new dze(W, m3, m4, z, i3, m5 + ((max < 0 || max >= i5 + (-1)) ? (max < i5 || abs3 < 2) ? abs3 != 0 ? 1 : 2 : 0 : i5 - max), ywk.a(str)));
            teamSides = null;
            i = 1;
        }
        setData(new jxk(id, id2, ixkVar, l6g.W(arrayList)));
    }
}
