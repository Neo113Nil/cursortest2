package defpackage;

import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.model.crowdsourcing.CrowdsourcingSuggestRequest;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.crowdsourcing.EventSuggestRequest;
import com.sofascore.model.crowdsourcing.SuggestStatus;
import com.sofascore.model.crowdsourcing.TeamSide;
import com.sofascore.model.mvvm.model.Player;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o54 extends hoi implements Function2 {
    public int r;
    public int s;
    public int t;
    public k24 u;
    public EventSuggest.IncidentSuggest v;
    public EventSuggestRequest w;
    public x2g x;
    public int y;
    public final /* synthetic */ q54 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o54(q54 q54Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.z = q54Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new o54(this.z, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o54) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x02db, code lost:
    
        if (r3.emit(r7, r29) == r1) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x041a, code lost:
    
        if (r2.emit(r6, r29) == r1) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x00c9, code lost:
    
        if (r7 == r1) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x00a8, code lost:
    
        if (r2 == r1) goto L192;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0172  */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v33, types: [com.sofascore.model.crowdsourcing.EventSuggest$IncidentSuggest, com.sofascore.model.crowdsourcing.EventSuggestRequest, k24] */
    /* JADX WARN: Type inference failed for: r11v36, types: [com.sofascore.model.crowdsourcing.EventSuggest$IncidentSuggest, com.sofascore.model.crowdsourcing.EventSuggestRequest, java.lang.Object, k24] */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v46 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object y;
        int i;
        Object y2;
        Object t;
        int i2;
        int i3;
        k24 k24Var;
        kxe kxeVar;
        Object obj2;
        Integer num;
        Integer num2;
        TeamSide teamSide;
        List list;
        w34 w34Var;
        Object obj3;
        Object obj4;
        EventSuggest.IncidentSuggest goalSuggest;
        EventSuggest.IncidentSuggest incidentSuggest;
        EventSuggestRequest a;
        Object u;
        int i4;
        Object u2;
        k24 k24Var2;
        EventSuggest.IncidentSuggest incidentSuggest2;
        EventSuggestRequest eventSuggestRequest;
        int i5;
        Object obj5;
        int i6;
        int i7;
        EventSuggest.IncidentSuggest incidentSuggest3;
        EventSuggestRequest eventSuggestRequest2;
        int i8;
        ?? r11;
        x2g x2gVar;
        Object P;
        EventSuggest.IncidentSuggest incidentSuggest4;
        int i9;
        int i10;
        Object P2;
        int i11;
        int i12;
        boolean z;
        ?? r112;
        lu3 lu3Var = lu3.a;
        int i13 = this.y;
        q54 q54Var = this.z;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        switch (i13) {
            case 0:
                y6a.M(obj);
                fdi fdiVar = q54Var.y;
                Boolean bool = Boolean.TRUE;
                fdiVar.getClass();
                fdiVar.m(null, bool);
                aeh aehVar = q54Var.h;
                this.y = 1;
                y = rd0.y(aehVar, this);
                break;
            case 1:
                y6a.M(obj);
                y = obj;
                EventSuggest.IncidentSuggest incidentSuggest5 = ((k24) y).b.b;
                if (incidentSuggest5 != null) {
                    i = incidentSuggest5.getId();
                } else {
                    i = i9a.d - 1;
                    i9a.d = i;
                }
                aeh aehVar2 = q54Var.h;
                this.r = i;
                this.y = 2;
                y2 = rd0.y(aehVar2, this);
                break;
            case 2:
                i = this.r;
                y6a.M(obj);
                y2 = obj;
                k24 k24Var3 = (k24) y2;
                int i14 = k24Var3.a.a;
                this.u = k24Var3;
                this.r = i;
                this.s = i14;
                this.y = 3;
                t = q54Var.t(this);
                if (t != lu3Var) {
                    i2 = i;
                    i3 = i14;
                    k24Var = k24Var3;
                    Pair pair = (Pair) t;
                    Integer num3 = (Integer) pair.a;
                    Integer num4 = (Integer) pair.b;
                    fdi fdiVar2 = q54Var.p;
                    fdi fdiVar3 = q54Var.i;
                    fdi fdiVar4 = q54Var.q;
                    fdi fdiVar5 = q54Var.r;
                    kxeVar = (kxe) fdiVar2.getValue();
                    if (kxeVar == null) {
                        obj2 = null;
                        num = new Integer(kxeVar.a);
                    } else {
                        obj2 = null;
                        num = null;
                    }
                    if (num != null && num.intValue() == -1) {
                        num = null;
                    }
                    kxe kxeVar2 = (kxe) q54Var.p.getValue();
                    String str = num != null ? kxeVar2 == null ? kxeVar2.b : null : null;
                    kxe kxeVar3 = (kxe) fdiVar4.getValue();
                    num2 = kxeVar3 == null ? new Integer(kxeVar3.a) : null;
                    if (num2 != null && num2.intValue() == -1) {
                        num2 = null;
                    }
                    kxe kxeVar4 = (kxe) fdiVar4.getValue();
                    String str2 = num2 != null ? kxeVar4 == null ? kxeVar4.b : null : null;
                    CrowdsourcingIncidentType crowdsourcingIncidentType = (CrowdsourcingIncidentType) q54Var.o.getValue();
                    teamSide = (TeamSide) q54Var.n.getValue();
                    if (teamSide != null) {
                        return Unit.a;
                    }
                    Integer num5 = ((c0a) fdiVar5.getValue()).a ? new Integer(((c0a) fdiVar5.getValue()).b) : null;
                    Integer num6 = ((c0a) fdiVar5.getValue()).a ? ((c0a) fdiVar5.getValue()).c : null;
                    if (crowdsourcingIncidentType == CrowdsourcingIncidentType.Goal.OWN_GOAL) {
                        list = (List) (teamSide == TeamSide.HOME ? ((Pair) fdiVar3.getValue()).b : ((Pair) fdiVar3.getValue()).a);
                    } else {
                        list = (List) (teamSide == TeamSide.HOME ? ((Pair) fdiVar3.getValue()).a : ((Pair) fdiVar3.getValue()).b);
                    }
                    w34 w34Var2 = k24Var.b;
                    if (w34Var2 instanceof u34) {
                        SuggestStatus suggestStatus = Boolean.valueOf(w34Var2.a).equals(Boolean.TRUE) ? SuggestStatus.PENDING : SuggestStatus.SUBMITTED;
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj5 = it.next();
                                int id = ((Player) obj5).getId();
                                if (num != null && id == num.intValue()) {
                                }
                            } else {
                                obj5 = null;
                            }
                        }
                        crowdsourcingIncidentType.getClass();
                        w34Var = w34Var2;
                        goalSuggest = new EventSuggest.IncidentSuggest.CardSuggest(i2, suggestStatus, false, (Player) obj5, str, (CrowdsourcingIncidentType.Card) crowdsourcingIncidentType, teamSide, num5, num6, Boolean.FALSE);
                    } else {
                        w34Var = w34Var2;
                        if (!(w34Var instanceof v34)) {
                            zzl.b();
                            return obj2;
                        }
                        SuggestStatus suggestStatus2 = Boolean.valueOf(w34Var.a).equals(Boolean.TRUE) ? SuggestStatus.PENDING : SuggestStatus.SUBMITTED;
                        int m = yid.m(num3);
                        int m2 = yid.m(num4);
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj3 = it2.next();
                                int id2 = ((Player) obj3).getId();
                                Integer num7 = num;
                                if (num == null || id2 != num7.intValue()) {
                                    num = num7;
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        Player player = (Player) obj3;
                        Iterator it3 = list.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj4 = it3.next();
                                int id3 = ((Player) obj4).getId();
                                if (num2 != null && id3 == num2.intValue()) {
                                }
                            } else {
                                obj4 = null;
                            }
                        }
                        crowdsourcingIncidentType.getClass();
                        goalSuggest = new EventSuggest.IncidentSuggest.GoalSuggest(i2, suggestStatus2, false, m, m2, player, (Player) obj4, str, str2, (CrowdsourcingIncidentType.Goal) crowdsourcingIncidentType, teamSide, num5, num6, Boolean.FALSE);
                    }
                    incidentSuggest = goalSuggest;
                    if (Boolean.valueOf(w34Var.a).equals(Boolean.TRUE)) {
                        aeh aehVar3 = q54Var.l;
                        this.u = null;
                        this.v = null;
                        this.r = i2;
                        this.s = i3;
                        this.y = 4;
                        break;
                    } else {
                        a = t34.a(incidentSuggest);
                        if (w34Var instanceof u34) {
                            this.u = k24Var;
                            this.v = incidentSuggest;
                            this.w = a;
                            this.r = i2;
                            this.s = i3;
                            this.y = 5;
                            u2 = q54Var.u(this);
                            if (u2 != lu3Var) {
                                k24Var2 = k24Var;
                                incidentSuggest2 = incidentSuggest;
                                eventSuggestRequest = a;
                                i5 = i2;
                                if (((Boolean) u2).booleanValue() || k24Var2.b.a) {
                                    i6 = 0;
                                    k24 k24Var4 = k24Var2;
                                    i7 = i3;
                                    incidentSuggest3 = incidentSuggest2;
                                    k24Var = k24Var4;
                                    eventSuggestRequest2 = eventSuggestRequest;
                                } else {
                                    k24 k24Var5 = k24Var2;
                                    i7 = i3;
                                    incidentSuggest3 = incidentSuggest2;
                                    k24Var = k24Var5;
                                    eventSuggestRequest2 = eventSuggestRequest;
                                    i6 = 1;
                                }
                                if (i6 == 0) {
                                    e64 e64Var = q54Var.f;
                                    CrowdsourcingSuggestRequest crowdsourcingSuggestRequest = new CrowdsourcingSuggestRequest(a.c(eventSuggestRequest2));
                                    z2 = false;
                                    this.u = null;
                                    this.v = incidentSuggest3;
                                    this.w = null;
                                    this.r = i5;
                                    this.s = i7;
                                    this.t = i6;
                                    this.y = 7;
                                    e64Var.getClass();
                                    int i15 = i7;
                                    P2 = yaa.P(new c64(e64Var, i7, crowdsourcingSuggestRequest, (rq3) null, 6), this);
                                    if (P2 != lu3Var) {
                                        incidentSuggest4 = incidentSuggest3;
                                        i9 = i6;
                                        i10 = i15;
                                        x2gVar = (x2g) P2;
                                        z = z2;
                                        int i16 = i10;
                                        i6 = i9;
                                        incidentSuggest3 = incidentSuggest4;
                                        i8 = i16;
                                        r11 = z;
                                        if (x2gVar != null) {
                                            r112 = r11;
                                            if (!(x2gVar instanceof t2g)) {
                                                if (!(x2gVar instanceof v2g)) {
                                                    zzl.b();
                                                    return obj2;
                                                }
                                                aeh aehVar4 = q54Var.l;
                                                this.u = r11;
                                                this.v = r11;
                                                this.w = r11;
                                                this.x = x2gVar;
                                                this.r = i5;
                                                this.s = i8;
                                                this.t = i6;
                                                this.y = 9;
                                                if (aehVar4.emit(incidentSuggest3, this) != lu3Var) {
                                                    i11 = i6;
                                                    i12 = i8;
                                                    z3 = r11;
                                                    i8 = i12;
                                                    i6 = i11;
                                                    r112 = z3;
                                                }
                                            }
                                            if (x2gVar != null) {
                                                if (x2gVar instanceof t2g) {
                                                    fdi fdiVar6 = q54Var.y;
                                                    Boolean bool2 = Boolean.FALSE;
                                                    fdiVar6.getClass();
                                                    fdiVar6.m(r112, bool2);
                                                    aeh aehVar5 = q54Var.j;
                                                    Unit unit = Unit.a;
                                                    this.u = r112;
                                                    this.v = r112;
                                                    this.w = r112;
                                                    this.x = x2gVar;
                                                    this.r = i5;
                                                    this.s = i8;
                                                    this.t = i6;
                                                    this.y = 10;
                                                    break;
                                                } else if (!(x2gVar instanceof v2g)) {
                                                    zzl.b();
                                                    return obj2;
                                                }
                                            }
                                        }
                                        return Unit.a;
                                    }
                                } else {
                                    i8 = i7;
                                    EventSuggestRequest eventSuggestRequest3 = eventSuggestRequest2;
                                    r11 = 0;
                                    z4 = false;
                                    EventSuggest.IncidentSuggest incidentSuggest6 = k24Var.b.b;
                                    if (incidentSuggest6 == null) {
                                        x2gVar = null;
                                        if (x2gVar != null) {
                                        }
                                        return Unit.a;
                                    }
                                    int id4 = incidentSuggest6.getId();
                                    e64 e64Var2 = q54Var.f;
                                    this.u = null;
                                    this.v = incidentSuggest3;
                                    this.w = null;
                                    this.r = i5;
                                    this.s = i8;
                                    this.t = i6;
                                    this.y = 8;
                                    e64Var2.getClass();
                                    P = yaa.P(new c64(e64Var2, id4, eventSuggestRequest3, (rq3) null, 7), this);
                                    if (P != lu3Var) {
                                        incidentSuggest4 = incidentSuggest3;
                                        i9 = i6;
                                        i10 = i8;
                                        x2gVar = (x2g) P;
                                        z = z4;
                                        int i162 = i10;
                                        i6 = i9;
                                        incidentSuggest3 = incidentSuggest4;
                                        i8 = i162;
                                        r11 = z;
                                        if (x2gVar != null) {
                                        }
                                        return Unit.a;
                                    }
                                }
                            }
                        } else {
                            if (!(w34Var instanceof v34)) {
                                zzl.b();
                                return obj2;
                            }
                            this.u = k24Var;
                            this.v = incidentSuggest;
                            this.w = a;
                            this.r = i2;
                            this.s = i3;
                            this.y = 6;
                            u = q54Var.u(this);
                            if (u != lu3Var) {
                                i4 = i2;
                                i7 = i3;
                                eventSuggestRequest2 = a;
                                incidentSuggest3 = incidentSuggest;
                                i5 = i4;
                                i6 = ((Boolean) u).booleanValue() ? 1 : 0;
                                if (i6 == 0) {
                                }
                            }
                        }
                    }
                }
                return lu3Var;
            case 3:
                i3 = this.s;
                int i17 = this.r;
                k24Var = this.u;
                y6a.M(obj);
                t = obj;
                i2 = i17;
                Pair pair2 = (Pair) t;
                Integer num32 = (Integer) pair2.a;
                Integer num42 = (Integer) pair2.b;
                fdi fdiVar22 = q54Var.p;
                fdi fdiVar32 = q54Var.i;
                fdi fdiVar42 = q54Var.q;
                fdi fdiVar52 = q54Var.r;
                kxeVar = (kxe) fdiVar22.getValue();
                if (kxeVar == null) {
                }
                if (num != null) {
                    num = null;
                    break;
                }
                kxe kxeVar22 = (kxe) q54Var.p.getValue();
                if (num != null) {
                }
                kxe kxeVar32 = (kxe) fdiVar42.getValue();
                if (kxeVar32 == null) {
                }
                if (num2 != null) {
                    num2 = null;
                    break;
                }
                kxe kxeVar42 = (kxe) fdiVar42.getValue();
                if (num2 != null) {
                }
                CrowdsourcingIncidentType crowdsourcingIncidentType2 = (CrowdsourcingIncidentType) q54Var.o.getValue();
                teamSide = (TeamSide) q54Var.n.getValue();
                if (teamSide != null) {
                }
                break;
            case 4:
                y6a.M(obj);
                Unit unit2 = Unit.a;
                return Unit.a;
            case 5:
                i3 = this.s;
                i5 = this.r;
                eventSuggestRequest = this.w;
                incidentSuggest2 = this.v;
                k24Var2 = this.u;
                y6a.M(obj);
                obj2 = null;
                u2 = obj;
                if (((Boolean) u2).booleanValue()) {
                    break;
                }
                i6 = 0;
                k24 k24Var42 = k24Var2;
                i7 = i3;
                incidentSuggest3 = incidentSuggest2;
                k24Var = k24Var42;
                eventSuggestRequest2 = eventSuggestRequest;
                if (i6 == 0) {
                }
                return lu3Var;
            case 6:
                i3 = this.s;
                i4 = this.r;
                a = this.w;
                incidentSuggest = this.v;
                k24Var = this.u;
                y6a.M(obj);
                obj2 = null;
                u = obj;
                i7 = i3;
                eventSuggestRequest2 = a;
                incidentSuggest3 = incidentSuggest;
                i5 = i4;
                i6 = ((Boolean) u).booleanValue() ? 1 : 0;
                if (i6 == 0) {
                }
                return lu3Var;
            case 7:
                i9 = this.t;
                i10 = this.s;
                i5 = this.r;
                EventSuggest.IncidentSuggest incidentSuggest7 = this.v;
                y6a.M(obj);
                obj2 = null;
                incidentSuggest4 = incidentSuggest7;
                P2 = obj;
                x2gVar = (x2g) P2;
                z = z2;
                int i1622 = i10;
                i6 = i9;
                incidentSuggest3 = incidentSuggest4;
                i8 = i1622;
                r11 = z;
                if (x2gVar != null) {
                }
                return Unit.a;
            case 8:
                i9 = this.t;
                i10 = this.s;
                i5 = this.r;
                EventSuggest.IncidentSuggest incidentSuggest8 = this.v;
                y6a.M(obj);
                obj2 = null;
                incidentSuggest4 = incidentSuggest8;
                P = obj;
                x2gVar = (x2g) P;
                z = z4;
                int i16222 = i10;
                i6 = i9;
                incidentSuggest3 = incidentSuggest4;
                i8 = i16222;
                r11 = z;
                if (x2gVar != null) {
                }
                return Unit.a;
            case 9:
                i11 = this.t;
                i12 = this.s;
                i5 = this.r;
                x2gVar = this.x;
                y6a.M(obj);
                obj2 = null;
                i8 = i12;
                i6 = i11;
                r112 = z3;
                if (x2gVar != null) {
                }
                return Unit.a;
            case 10:
                y6a.M(obj);
                return Unit.a;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
