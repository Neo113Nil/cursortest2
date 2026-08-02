package defpackage;

import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.statistics.BaseballPitch;
import com.sofascore.model.newNetwork.statistics.BaseballPitchesResponse;
import com.sofascore.model.newNetwork.statistics.BaseballSeasonPitchesPerspective;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lk1 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ qk1 s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Season.SubSeasonType v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk1(qk1 qk1Var, int i, int i2, Season.SubSeasonType subSeasonType, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = qk1Var;
        this.t = i;
        this.u = i2;
        this.v = subSeasonType;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new lk1(this.s, this.t, this.u, this.v, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((lk1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        List<BaseballPitch> pitches;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        qk1 qk1Var = this.s;
        if (i == 0) {
            y6a.M(obj);
            wve wveVar = qk1Var.l;
            int i2 = qk1Var.m;
            BaseballSeasonPitchesPerspective baseballSeasonPitchesPerspective = BaseballSeasonPitchesPerspective.Pitching;
            this.r = 1;
            obj = wveVar.b(i2, this.t, this.u, baseballSeasonPitchesPerspective, this.v, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        BaseballPitchesResponse baseballPitchesResponse = (BaseballPitchesResponse) obj;
        if (baseballPitchesResponse != null && (pitches = baseballPitchesResponse.getPitches()) != null) {
            ArrayList arrayList = new ArrayList(k13.r(pitches, 10));
            Iterator<T> it = pitches.iterator();
            while (it.hasNext()) {
                arrayList.add(j72.J((BaseballPitch) it.next()));
            }
            qk1Var.o = arrayList;
        }
        return Unit.a;
    }
}
