package defpackage;

import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.crowdsourcing.TeamSide;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class u44 extends hoi implements gt8 {
    public /* synthetic */ CrowdsourcingIncidentType r;
    public /* synthetic */ Pair s;
    public /* synthetic */ c0a t;
    public /* synthetic */ EventSuggest.IncidentSuggest u;
    public /* synthetic */ TeamSide v;
    public final /* synthetic */ q54 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u44(q54 q54Var, rq3 rq3Var) {
        super(6, rq3Var);
        this.w = q54Var;
    }

    @Override // defpackage.gt8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        u44 u44Var = new u44(this.w, (rq3) obj6);
        u44Var.r = (CrowdsourcingIncidentType) obj;
        u44Var.s = (Pair) obj2;
        u44Var.t = (c0a) obj3;
        u44Var.u = (EventSuggest.IncidentSuggest) obj4;
        u44Var.v = (TeamSide) obj5;
        return u44Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (defpackage.q54.w(r11, r3.getPlayer(), r3.getPlayerName()) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        if (defpackage.q54.w(r1, r3.getAssist(), r3.getAssistName()) == false) goto L41;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CrowdsourcingIncidentType crowdsourcingIncidentType = this.r;
        Pair pair = this.s;
        c0a c0aVar = this.t;
        EventSuggest.IncidentSuggest incidentSuggest = this.u;
        TeamSide teamSide = this.v;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        kxe kxeVar = (kxe) pair.a;
        kxe kxeVar2 = (kxe) pair.b;
        boolean z = false;
        if (teamSide != null) {
            boolean z2 = teamSide != incidentSuggest.getSide();
            int i = c0aVar.b;
            boolean z3 = c0aVar.a;
            Integer valueOf = Integer.valueOf(i);
            if (!z3) {
                valueOf = null;
            }
            boolean c = Intrinsics.c(valueOf, incidentSuggest.getTime());
            Integer num = c0aVar.c;
            if (!z3) {
                num = null;
            }
            boolean c2 = Intrinsics.c(num, incidentSuggest.getAddedTime());
            if (!z2 && c && c2) {
                if (incidentSuggest instanceof EventSuggest.IncidentSuggest.CardSuggest) {
                    if (kxeVar != null) {
                        EventSuggest.IncidentSuggest.CardSuggest cardSuggest = (EventSuggest.IncidentSuggest.CardSuggest) incidentSuggest;
                        if (crowdsourcingIncidentType == cardSuggest.getType()) {
                        }
                    }
                } else {
                    if (!(incidentSuggest instanceof EventSuggest.IncidentSuggest.GoalSuggest)) {
                        zzl.b();
                        return null;
                    }
                    EventSuggest.IncidentSuggest.GoalSuggest goalSuggest = (EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest;
                    if (crowdsourcingIncidentType == goalSuggest.getType()) {
                        if (!q54.w(kxeVar, goalSuggest.getPlayer(), goalSuggest.getPlayerName())) {
                        }
                    }
                }
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
