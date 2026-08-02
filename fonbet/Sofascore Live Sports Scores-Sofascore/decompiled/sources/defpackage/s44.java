package defpackage;

import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.model.crowdsourcing.TeamSide;
import kotlin.Pair;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class s44 extends hoi implements gt8 {
    public int r;
    public /* synthetic */ CrowdsourcingIncidentType s;
    public /* synthetic */ TeamSide t;
    public /* synthetic */ c0a u;
    public /* synthetic */ Pair v;
    public /* synthetic */ k24 w;
    public final /* synthetic */ q54 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s44(q54 q54Var, rq3 rq3Var) {
        super(6, rq3Var);
        this.x = q54Var;
    }

    @Override // defpackage.gt8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        s44 s44Var = new s44(this.x, (rq3) obj6);
        s44Var.s = (CrowdsourcingIncidentType) obj;
        s44Var.t = (TeamSide) obj2;
        s44Var.u = (c0a) obj3;
        s44Var.v = (Pair) obj4;
        s44Var.w = (k24) obj5;
        return s44Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        CrowdsourcingIncidentType crowdsourcingIncidentType = this.s;
        TeamSide teamSide = this.t;
        c0a c0aVar = this.u;
        Pair pair = this.v;
        k24 k24Var = this.w;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        kxe kxeVar = (kxe) pair.a;
        kxe kxeVar2 = (kxe) pair.b;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.r = 1;
        Object x = this.x.x(k24Var, crowdsourcingIncidentType, teamSide, c0aVar, kxeVar, kxeVar2, this);
        return x == lu3Var ? lu3Var : x;
    }
}
