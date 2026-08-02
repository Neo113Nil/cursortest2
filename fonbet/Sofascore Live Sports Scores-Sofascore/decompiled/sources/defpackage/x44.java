package defpackage;

import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.model.crowdsourcing.TeamSide;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class x44 extends hoi implements et8 {
    public /* synthetic */ Pair r;
    public /* synthetic */ TeamSide s;
    public /* synthetic */ CrowdsourcingIncidentType t;

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        x44 x44Var = new x44(4, (rq3) obj4);
        x44Var.r = (Pair) obj;
        x44Var.s = (TeamSide) obj2;
        x44Var.t = (CrowdsourcingIncidentType) obj3;
        return x44Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[RETURN] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Pair pair = this.r;
        TeamSide teamSide = this.s;
        CrowdsourcingIncidentType crowdsourcingIncidentType = this.t;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        List list = (List) pair.a;
        List list2 = (List) pair.b;
        int i = teamSide == null ? -1 : w44.a[teamSide.ordinal()];
        if (i == -1) {
            return km5.a;
        }
        if (i != 1) {
            if (i == 2) {
                return crowdsourcingIncidentType == CrowdsourcingIncidentType.Goal.OWN_GOAL ? list : list2;
            }
            zzl.b();
            return null;
        }
        if (crowdsourcingIncidentType == CrowdsourcingIncidentType.Goal.OWN_GOAL) {
        }
    }
}
