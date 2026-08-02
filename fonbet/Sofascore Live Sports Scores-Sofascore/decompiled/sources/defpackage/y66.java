package defpackage;

import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.model.crowdsourcing.TeamSide;
import com.sofascore.model.favorites.FavoritesEventsData;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class y66 extends hoi implements et8 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public /* synthetic */ Object t;
    public /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y66(int i, rq3 rq3Var, int i2) {
        super(i, rq3Var);
        this.r = i2;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 4;
        switch (this.r) {
            case 0:
                y66 y66Var = new y66(i, (rq3) obj4, 0);
                y66Var.s = (List) obj;
                y66Var.t = (List) obj2;
                y66Var.u = (List) obj3;
                return y66Var.invokeSuspend(Unit.a);
            case 1:
                y66 y66Var2 = new y66(i, (rq3) obj4, 1);
                y66Var2.s = (List) obj;
                y66Var2.t = (List) obj2;
                y66Var2.u = (List) obj3;
                return y66Var2.invokeSuspend(Unit.a);
            default:
                y66 y66Var3 = new y66(i, (rq3) obj4, 2);
                y66Var3.s = (CrowdsourcingIncidentType) obj;
                y66Var3.t = (Pair) obj2;
                y66Var3.u = (TeamSide) obj3;
                return y66Var3.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r4 != null) goto L12;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        switch (this.r) {
            case 0:
                List list = (List) this.s;
                List list2 = (List) this.t;
                List list3 = (List) this.u;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                return new FavoritesEventsData(list2, list, list3);
            case 1:
                List list4 = (List) this.s;
                List list5 = (List) this.t;
                List list6 = (List) this.u;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                return new FavoritesEventsData(list5, list4, list6);
            default:
                CrowdsourcingIncidentType crowdsourcingIncidentType = (CrowdsourcingIncidentType) this.s;
                Pair pair = (Pair) this.t;
                TeamSide teamSide = (TeamSide) this.u;
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                kxe kxeVar = (kxe) pair.a;
                if (teamSide != null) {
                    if (!(crowdsourcingIncidentType instanceof CrowdsourcingIncidentType.Card)) {
                        if (!(crowdsourcingIncidentType instanceof CrowdsourcingIncidentType.Goal)) {
                            zzl.b();
                            return null;
                        }
                    }
                    z = true;
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
        }
    }
}
