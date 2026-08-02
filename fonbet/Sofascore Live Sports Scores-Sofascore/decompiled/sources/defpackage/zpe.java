package defpackage;

import com.sofascore.model.newNetwork.statistics.BaseballPitch;
import com.sofascore.model.newNetwork.statistics.BaseballPitchesResponse;
import com.sofascore.model.newNetwork.statistics.BaseballSeasonPitchesPerspective;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zpe extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ fqe t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ mpe w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zpe(fqe fqeVar, int i, int i2, mpe mpeVar, rq3 rq3Var, int i3) {
        super(2, rq3Var);
        this.r = i3;
        this.t = fqeVar;
        this.u = i;
        this.v = i2;
        this.w = mpeVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new zpe(this.t, this.u, this.v, this.w, rq3Var, 0);
            default:
                return new zpe(this.t, this.u, this.v, this.w, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((zpe) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        List<BaseballPitch> pitches;
        List<BaseballPitch> pitches2;
        int i = this.r;
        mpe mpeVar = this.w;
        int i2 = this.v;
        int i3 = this.u;
        fqe fqeVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    g39 g39Var = fqeVar.f;
                    BaseballSeasonPitchesPerspective baseballSeasonPitchesPerspective = BaseballSeasonPitchesPerspective.Pitching;
                    this.s = 1;
                    obj = g39Var.d(i3, i2, baseballSeasonPitchesPerspective, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                BaseballPitchesResponse baseballPitchesResponse = (BaseballPitchesResponse) obj;
                if (baseballPitchesResponse == null || (pitches = baseballPitchesResponse.getPitches()) == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(k13.r(pitches, 10));
                Iterator<T> it = pitches.iterator();
                while (it.hasNext()) {
                    arrayList.add(j72.J((BaseballPitch) it.next()));
                }
                mpeVar.b = arrayList;
                return pitches;
            default:
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    g39 g39Var2 = fqeVar.f;
                    BaseballSeasonPitchesPerspective baseballSeasonPitchesPerspective2 = BaseballSeasonPitchesPerspective.Batting;
                    this.s = 1;
                    obj = g39Var2.d(i3, i2, baseballSeasonPitchesPerspective2, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                BaseballPitchesResponse baseballPitchesResponse2 = (BaseballPitchesResponse) obj;
                if (baseballPitchesResponse2 == null || (pitches2 = baseballPitchesResponse2.getPitches()) == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList(k13.r(pitches2, 10));
                Iterator<T> it2 = pitches2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(j72.J((BaseballPitch) it2.next()));
                }
                mpeVar.c = arrayList2.isEmpty() ? null : arrayList2;
                return pitches2;
        }
    }
}
