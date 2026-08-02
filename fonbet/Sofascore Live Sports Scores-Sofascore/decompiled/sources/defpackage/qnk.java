package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.newNetwork.VenueSport;
import com.sofascore.model.newNetwork.VenueSportsResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qnk extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ unk t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qnk(unk unkVar, int i, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = unkVar;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        unk unkVar = this.t;
        switch (i) {
            case 0:
                return new qnk(unkVar, i2, rq3Var, 0);
            case 1:
                return new qnk(unkVar, i2, rq3Var, 1);
            default:
                return new qnk(unkVar, i2, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((qnk) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        unk unkVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI = unkVar.a;
                this.s = 1;
                Object venue = networkCoroutineAPI.venue(i2, this);
                return venue == lu3Var ? lu3Var : venue;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI2 = unkVar.a;
                this.s = 1;
                Object venueNearEvents = networkCoroutineAPI2.venueNearEvents(i2, this);
                return venueNearEvents == lu3Var2 ? lu3Var2 : venueNearEvents;
            default:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI3 = unkVar.a;
                    this.s = 1;
                    obj = networkCoroutineAPI3.venueSports(i2, this);
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
                List<VenueSport> sports = ((VenueSportsResponse) obj).getSports();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : sports) {
                    if (Sports.INSTANCE.getEntries().contains(((VenueSport) obj2).getSport().getSportSlug())) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
        }
    }
}
