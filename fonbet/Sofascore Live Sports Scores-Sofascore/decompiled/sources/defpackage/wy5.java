package defpackage;

import com.sofascore.model.TvType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.CricketRunsPerOverGraphResponse;
import com.sofascore.model.newNetwork.PregameFormResponse;
import com.sofascore.model.newNetwork.RunsPerOverInning;
import com.sofascore.model.newNetwork.RunsPerOverInningsData;
import com.sofascore.model.newNetwork.TennisPowerResponse;
import com.sofascore.model.newNetwork.TvCountryChannelsResponse;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wy5 extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ dz5 t;
    public final /* synthetic */ Event u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wy5(dz5 dz5Var, Event event, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = dz5Var;
        this.u = event;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        Event event = this.u;
        dz5 dz5Var = this.t;
        switch (i) {
            case 0:
                return new wy5(dz5Var, event, rq3Var, 0);
            case 1:
                return new wy5(dz5Var, event, rq3Var, 1);
            case 2:
                return new wy5(dz5Var, event, rq3Var, 2);
            default:
                return new wy5(dz5Var, event, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((wy5) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Integer valueOf;
        Integer valueOf2;
        PregameFormResponse pregameFormResponse;
        TvCountryChannelsResponse tvCountryChannelsResponse;
        int i = this.r;
        Event event = this.u;
        dz5 dz5Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    s96 s96Var = dz5Var.i;
                    int id = event.getId();
                    this.s = 1;
                    obj = s96Var.a.cricketRunsPerOverGraph(id, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                RunsPerOverInningsData graphPoints = ((CricketRunsPerOverGraphResponse) obj).getGraphPoints();
                boolean shouldReverseTeams = event.shouldReverseTeams();
                graphPoints.getClass();
                Iterator<T> it = graphPoints.getHomeInnings().iterator();
                if (it.hasNext()) {
                    valueOf = Integer.valueOf(((RunsPerOverInning) it.next()).getInning());
                    while (it.hasNext()) {
                        Integer valueOf3 = Integer.valueOf(((RunsPerOverInning) it.next()).getInning());
                        if (valueOf.compareTo(valueOf3) < 0) {
                            valueOf = valueOf3;
                        }
                    }
                } else {
                    valueOf = null;
                }
                int intValue = valueOf != null ? valueOf.intValue() : 0;
                Iterator<T> it2 = graphPoints.getAwayInnings().iterator();
                if (it2.hasNext()) {
                    valueOf2 = Integer.valueOf(((RunsPerOverInning) it2.next()).getInning());
                    while (it2.hasNext()) {
                        Integer valueOf4 = Integer.valueOf(((RunsPerOverInning) it2.next()).getInning());
                        if (valueOf2.compareTo(valueOf4) < 0) {
                            valueOf2 = valueOf4;
                        }
                    }
                } else {
                    valueOf2 = null;
                }
                int ceil = (int) Math.ceil(Math.max(intValue, valueOf2 != null ? valueOf2.intValue() : 0) / 2.0f);
                xbb b = a.b();
                for (int i3 = 0; i3 < ceil; i3++) {
                    RunsPerOverInning runsPerOverInning = (RunsPerOverInning) CollectionsKt.a0(i3, graphPoints.getHomeInnings());
                    RunsPerOverInning runsPerOverInning2 = (RunsPerOverInning) CollectionsKt.a0(i3, graphPoints.getAwayInnings());
                    RunsPerOverInning runsPerOverInning3 = !shouldReverseTeams ? runsPerOverInning : runsPerOverInning2;
                    if (!shouldReverseTeams) {
                        runsPerOverInning = runsPerOverInning2;
                    }
                    if (runsPerOverInning3 != null || runsPerOverInning != null) {
                        b.add(new Pair(runsPerOverInning3 != null ? runsPerOverInning3.getRuns() : null, runsPerOverInning != null ? runsPerOverInning.getRuns() : null));
                    }
                }
                return new v04(a.a(b));
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    iy5 iy5Var = (iy5) dz5Var.w.d();
                    if (iy5Var != null && (pregameFormResponse = iy5Var.m) != null) {
                        return pregameFormResponse;
                    }
                    s96 s96Var2 = dz5Var.i;
                    int id2 = event.getId();
                    this.s = 1;
                    obj = s96Var2.a.pregameForm(id2, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return (PregameFormResponse) obj;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    s96 s96Var3 = dz5Var.i;
                    int id3 = event.getId();
                    this.s = 1;
                    obj = s96Var3.a.tennisPower(id3, this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return aba.z((TennisPowerResponse) obj, event);
            default:
                lu3 lu3Var4 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    iy5 iy5Var2 = (iy5) dz5Var.w.d();
                    if (iy5Var2 != null && (tvCountryChannelsResponse = iy5Var2.j) != null) {
                        return tvCountryChannelsResponse;
                    }
                    t9c t9cVar = dz5Var.j;
                    TvType tvType = TvType.EVENT;
                    int id4 = event.getId();
                    this.s = 1;
                    obj = t9cVar.a.getTvCountryChannels(tvType, id4, this);
                    if (obj == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return (TvCountryChannelsResponse) obj;
        }
    }
}
