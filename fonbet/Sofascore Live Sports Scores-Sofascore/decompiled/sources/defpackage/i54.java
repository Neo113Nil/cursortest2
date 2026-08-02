package defpackage;

import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.crowdsourcing.TeamSide;
import com.sofascore.model.mvvm.model.Player;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class i54 extends hoi implements Function2 {
    public q54 A;
    public Object B;
    public f1d C;
    public Integer D;
    public int E;
    public final /* synthetic */ q54 F;
    public final /* synthetic */ k24 G;
    public int r;
    public int s;
    public int t;
    public int u;
    public w34 v;
    public Integer w;
    public TeamSide x;
    public Object y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i54(q54 q54Var, k24 k24Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.F = q54Var;
        this.G = k24Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new i54(this.F, this.G, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i54) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x00b1, code lost:
    
        if (r4.emit(r1, r26) == r3) goto L134;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        Pair pair;
        Pair pair2;
        int intValue;
        Integer num;
        TeamSide side;
        int i2;
        kxe kxeVar;
        int i3;
        w34 w34Var;
        String playerName;
        Object n;
        w34 w34Var2;
        String str;
        q54 q54Var;
        TeamSide teamSide;
        int i4;
        Player player;
        Object n2;
        int i5;
        Player player2;
        TeamSide teamSide2;
        w34 w34Var3;
        int i6;
        Integer num2;
        int i7;
        EventSuggest.IncidentSuggest incidentSuggest;
        w34 w34Var4;
        q54 q54Var2;
        EventSuggest.IncidentSuggest incidentSuggest2;
        Integer num3;
        int i8;
        kxe kxeVar2;
        CrowdsourcingIncidentType crowdsourcingIncidentType;
        Object v;
        w34 w34Var5;
        int i9;
        f1d f1dVar;
        int i10;
        int i11;
        Iterable m;
        Object k;
        w34 w34Var6;
        Integer num4;
        int i12;
        k24 k24Var = this.G;
        w34 w34Var7 = k24Var.b;
        lu3 lu3Var = lu3.a;
        int i13 = this.E;
        q54 q54Var3 = this.F;
        if (i13 == 0) {
            y6a.M(obj);
            aeh aehVar = q54Var3.h;
            this.E = 1;
        } else {
            if (i13 != 1) {
                if (i13 == 2) {
                    i6 = this.t;
                    int i14 = this.s;
                    i5 = this.r;
                    Player player3 = (Player) this.y;
                    teamSide2 = this.x;
                    num = this.w;
                    w34Var3 = this.v;
                    y6a.M(obj);
                    intValue = i14;
                    player2 = player3;
                    n2 = obj;
                    kxe Q = lz.Q(6, player2, null, false, i6 == 0, ((Boolean) n2).booleanValue());
                    i3 = i5;
                    i2 = intValue;
                    w34Var = w34Var3;
                    kxeVar = Q;
                    side = teamSide2;
                    incidentSuggest = w34Var.b;
                    if (incidentSuggest instanceof EventSuggest.IncidentSuggest.GoalSuggest) {
                    }
                    w34Var4 = w34Var;
                    q54Var2 = q54Var3;
                    incidentSuggest2 = incidentSuggest;
                    num3 = num;
                    i8 = 1;
                    kxeVar2 = null;
                    if (incidentSuggest2 != null) {
                    }
                    if (!(w34Var4 instanceof u34)) {
                    }
                    q54Var2.o.l(crowdsourcingIncidentType);
                    q54Var2.n.l(side);
                    q54Var2.p.l(kxeVar);
                    q54Var2.q.l(kxeVar2);
                    fdi fdiVar = q54Var2.r;
                    this.v = w34Var4;
                    this.w = num3;
                    this.x = null;
                    this.y = kxeVar;
                    this.z = null;
                    this.A = null;
                    this.B = fdiVar;
                    this.r = i3;
                    this.s = i2;
                    this.E = 4;
                    v = q54Var2.v(this);
                    if (v != lu3Var) {
                    }
                    return lu3Var;
                }
                if (i13 != 3) {
                    if (i13 != 4) {
                        if (i13 != 5) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i10 = this.u;
                        i12 = this.t;
                        num4 = this.D;
                        f1dVar = this.C;
                        w34Var6 = (w34) this.B;
                        y6a.M(obj);
                        k = obj;
                        i8 = 1;
                        m = (List) k;
                        i11 = i12;
                        num3 = num4;
                        if (m == null) {
                            w34Var7 = w34Var6;
                            m = q54.m(w34Var7);
                        }
                        c0a c0aVar = new c0a(i11 == 0 ? i8 : 0, i10, num3, l6g.W(m));
                        fdi fdiVar2 = (fdi) f1dVar;
                        fdiVar2.getClass();
                        fdiVar2.m(null, c0aVar);
                        return Unit.a;
                    }
                    i10 = this.s;
                    int i15 = this.r;
                    f1d f1dVar2 = (f1d) this.B;
                    kxeVar = (kxe) this.y;
                    Integer num5 = this.w;
                    w34Var5 = this.v;
                    y6a.M(obj);
                    i9 = i15;
                    f1dVar = f1dVar2;
                    num3 = num5;
                    i8 = 1;
                    q54Var2 = q54Var3;
                    v = obj;
                    i11 = (((Boolean) v).booleanValue() && i9 == 0 && w34Var5.b.getTime() == null) ? 0 : i8;
                    if (w34Var7 instanceof u34) {
                        if (!(w34Var7 instanceof v34)) {
                            zzl.b();
                            return null;
                        }
                        m = q54.m(w34Var7);
                        c0a c0aVar2 = new c0a(i11 == 0 ? i8 : 0, i10, num3, l6g.W(m));
                        fdi fdiVar22 = (fdi) f1dVar;
                        fdiVar22.getClass();
                        fdiVar22.m(null, c0aVar2);
                        return Unit.a;
                    }
                    if (kxeVar != null) {
                        this.v = null;
                        this.w = null;
                        this.x = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = w34Var7;
                        this.C = f1dVar;
                        this.D = num3;
                        this.r = i9;
                        this.s = i10;
                        this.t = i11;
                        this.u = i10;
                        this.E = 5;
                        k = q54Var2.k(kxeVar, w34Var7, this);
                        if (k != lu3Var) {
                            w34Var6 = w34Var7;
                            num4 = num3;
                            i12 = i11;
                            m = (List) k;
                            i11 = i12;
                            num3 = num4;
                            if (m == null) {
                            }
                            c0a c0aVar22 = new c0a(i11 == 0 ? i8 : 0, i10, num3, l6g.W(m));
                            fdi fdiVar222 = (fdi) f1dVar;
                            fdiVar222.getClass();
                            fdiVar222.m(null, c0aVar22);
                            return Unit.a;
                        }
                        return lu3Var;
                    }
                    m = q54.m(w34Var7);
                    c0a c0aVar222 = new c0a(i11 == 0 ? i8 : 0, i10, num3, l6g.W(m));
                    fdi fdiVar2222 = (fdi) f1dVar;
                    fdiVar2222.getClass();
                    fdiVar2222.m(null, c0aVar222);
                    return Unit.a;
                }
                i4 = this.s;
                int i16 = this.r;
                q54Var = this.A;
                String str2 = this.z;
                TeamSide teamSide3 = this.x;
                num = this.w;
                w34Var2 = this.v;
                y6a.M(obj);
                str = str2;
                teamSide = teamSide3;
                i = i16;
                n = obj;
                boolean booleanValue = ((Boolean) n).booleanValue();
                q54Var.getClass();
                TeamSide teamSide4 = teamSide;
                i2 = i4;
                side = teamSide4;
                i3 = i;
                w34Var = w34Var2;
                kxeVar = new kxe(-1, str, "", "", false, null, booleanValue);
                incidentSuggest = w34Var.b;
                if (incidentSuggest instanceof EventSuggest.IncidentSuggest.GoalSuggest) {
                    Player assist = ((EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest).getAssist();
                    if (assist != null) {
                        w34Var4 = w34Var;
                        q54Var2 = q54Var3;
                        incidentSuggest2 = incidentSuggest;
                        num3 = num;
                        kxeVar2 = lz.Q(14, assist, null, false, false, false);
                        i8 = 1;
                    } else {
                        String assistName = ((EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest).getAssistName();
                        if (assistName != null) {
                            incidentSuggest2 = incidentSuggest;
                            num3 = num;
                            q54Var2 = q54Var3;
                            w34Var4 = w34Var;
                            i8 = 1;
                            kxeVar2 = new kxe(-1, assistName, "", "", false, null, true);
                        }
                    }
                    if (incidentSuggest2 != null || (crowdsourcingIncidentType = incidentSuggest2.getType()) == null) {
                        if (!(w34Var4 instanceof u34)) {
                            crowdsourcingIncidentType = ((u34) w34Var4).g;
                        } else {
                            if (!(w34Var4 instanceof v34)) {
                                zzl.b();
                                return null;
                            }
                            crowdsourcingIncidentType = CrowdsourcingIncidentType.Goal.REGULAR;
                        }
                    }
                    q54Var2.o.l(crowdsourcingIncidentType);
                    q54Var2.n.l(side);
                    q54Var2.p.l(kxeVar);
                    q54Var2.q.l(kxeVar2);
                    fdi fdiVar3 = q54Var2.r;
                    this.v = w34Var4;
                    this.w = num3;
                    this.x = null;
                    this.y = kxeVar;
                    this.z = null;
                    this.A = null;
                    this.B = fdiVar3;
                    this.r = i3;
                    this.s = i2;
                    this.E = 4;
                    v = q54Var2.v(this);
                    if (v != lu3Var) {
                        w34Var5 = w34Var4;
                        i9 = i3;
                        f1dVar = fdiVar3;
                        i10 = i2;
                        if (((Boolean) v).booleanValue()) {
                        }
                        if (w34Var7 instanceof u34) {
                        }
                    }
                    return lu3Var;
                }
                w34Var4 = w34Var;
                q54Var2 = q54Var3;
                incidentSuggest2 = incidentSuggest;
                num3 = num;
                i8 = 1;
                kxeVar2 = null;
                if (incidentSuggest2 != null) {
                }
                if (!(w34Var4 instanceof u34)) {
                }
                q54Var2.o.l(crowdsourcingIncidentType);
                q54Var2.n.l(side);
                q54Var2.p.l(kxeVar);
                q54Var2.q.l(kxeVar2);
                fdi fdiVar32 = q54Var2.r;
                this.v = w34Var4;
                this.w = num3;
                this.x = null;
                this.y = kxeVar;
                this.z = null;
                this.A = null;
                this.B = fdiVar32;
                this.r = i3;
                this.s = i2;
                this.E = 4;
                v = q54Var2.v(this);
                if (v != lu3Var) {
                }
                return lu3Var;
            }
            y6a.M(obj);
        }
        EventSuggest.IncidentSuggest incidentSuggest3 = w34Var7.b;
        i = incidentSuggest3 == null ? 1 : 0;
        if (w34Var7.a) {
            if (incidentSuggest3 == null || (num2 = incidentSuggest3.getTime()) == null) {
                if (!(w34Var7 instanceof u34)) {
                    if (!(w34Var7 instanceof v34)) {
                        zzl.b();
                        return null;
                    }
                    s54 s54Var = ((v34) w34Var7).h;
                    if (s54Var != null) {
                        num2 = s54Var.a;
                        if (num2 == null) {
                            i7 = 1;
                            pair2 = new Pair(new Integer(i7), incidentSuggest3 == null ? incidentSuggest3.getAddedTime() : null);
                        }
                    }
                }
                num2 = null;
                if (num2 == null) {
                }
            }
            i7 = num2.intValue();
            pair2 = new Pair(new Integer(i7), incidentSuggest3 == null ? incidentSuggest3.getAddedTime() : null);
        } else if (i != 0 || incidentSuggest3.getTime() == null) {
            int w = (int) ((yaa.w() - k24Var.a.b) / 60);
            int i17 = w + 1;
            if (i17 >= 0 && i17 < 46) {
                pair = new Pair(Integer.valueOf(i17), null);
            } else if (45 <= i17 && i17 < 61) {
                pair = new Pair(45, Integer.valueOf(w - 44));
            } else if (60 > i17 || i17 >= 106) {
                int i18 = w - 89;
                if (i18 > 15) {
                    i18 = 15;
                }
                pair = new Pair(90, Integer.valueOf(i18));
            } else {
                pair2 = new Pair(Integer.valueOf(w - 14), null);
            }
            pair2 = pair;
        } else {
            Integer time = incidentSuggest3.getTime();
            pair2 = new Pair(new Integer(time != null ? time.intValue() : 1), incidentSuggest3.getAddedTime());
        }
        intValue = ((Number) pair2.a).intValue();
        num = (Integer) pair2.b;
        side = incidentSuggest3 != null ? incidentSuggest3.getSide() : null;
        if (incidentSuggest3 != null && (player = incidentSuggest3.getPlayer()) != null) {
            this.v = w34Var7;
            this.w = num;
            this.x = side;
            this.y = player;
            this.r = i;
            this.s = intValue;
            this.t = 0;
            this.E = 2;
            n2 = q54Var3.n(this);
            if (n2 != lu3Var) {
                i5 = i;
                player2 = player;
                teamSide2 = side;
                w34Var3 = w34Var7;
                i6 = 0;
                kxe Q2 = lz.Q(6, player2, null, false, i6 == 0, ((Boolean) n2).booleanValue());
                i3 = i5;
                i2 = intValue;
                w34Var = w34Var3;
                kxeVar = Q2;
                side = teamSide2;
                incidentSuggest = w34Var.b;
                if (incidentSuggest instanceof EventSuggest.IncidentSuggest.GoalSuggest) {
                }
                w34Var4 = w34Var;
                q54Var2 = q54Var3;
                incidentSuggest2 = incidentSuggest;
                num3 = num;
                i8 = 1;
                kxeVar2 = null;
                if (incidentSuggest2 != null) {
                }
                if (!(w34Var4 instanceof u34)) {
                }
                q54Var2.o.l(crowdsourcingIncidentType);
                q54Var2.n.l(side);
                q54Var2.p.l(kxeVar);
                q54Var2.q.l(kxeVar2);
                fdi fdiVar322 = q54Var2.r;
                this.v = w34Var4;
                this.w = num3;
                this.x = null;
                this.y = kxeVar;
                this.z = null;
                this.A = null;
                this.B = fdiVar322;
                this.r = i3;
                this.s = i2;
                this.E = 4;
                v = q54Var2.v(this);
                if (v != lu3Var) {
                }
            }
        } else if (incidentSuggest3 == null || (playerName = incidentSuggest3.getPlayerName()) == null) {
            i2 = intValue;
            kxeVar = null;
            i3 = i;
            w34Var = w34Var7;
            incidentSuggest = w34Var.b;
            if (incidentSuggest instanceof EventSuggest.IncidentSuggest.GoalSuggest) {
            }
            w34Var4 = w34Var;
            q54Var2 = q54Var3;
            incidentSuggest2 = incidentSuggest;
            num3 = num;
            i8 = 1;
            kxeVar2 = null;
            if (incidentSuggest2 != null) {
            }
            if (!(w34Var4 instanceof u34)) {
            }
            q54Var2.o.l(crowdsourcingIncidentType);
            q54Var2.n.l(side);
            q54Var2.p.l(kxeVar);
            q54Var2.q.l(kxeVar2);
            fdi fdiVar3222 = q54Var2.r;
            this.v = w34Var4;
            this.w = num3;
            this.x = null;
            this.y = kxeVar;
            this.z = null;
            this.A = null;
            this.B = fdiVar3222;
            this.r = i3;
            this.s = i2;
            this.E = 4;
            v = q54Var2.v(this);
            if (v != lu3Var) {
            }
        } else {
            this.v = w34Var7;
            this.w = num;
            this.x = side;
            this.y = null;
            this.z = playerName;
            this.A = q54Var3;
            this.r = i;
            this.s = intValue;
            this.E = 3;
            n = q54Var3.n(this);
            if (n != lu3Var) {
                w34Var2 = w34Var7;
                str = playerName;
                q54Var = q54Var3;
                teamSide = side;
                i4 = intValue;
                boolean booleanValue2 = ((Boolean) n).booleanValue();
                q54Var.getClass();
                TeamSide teamSide42 = teamSide;
                i2 = i4;
                side = teamSide42;
                i3 = i;
                w34Var = w34Var2;
                kxeVar = new kxe(-1, str, "", "", false, null, booleanValue2);
                incidentSuggest = w34Var.b;
                if (incidentSuggest instanceof EventSuggest.IncidentSuggest.GoalSuggest) {
                }
                w34Var4 = w34Var;
                q54Var2 = q54Var3;
                incidentSuggest2 = incidentSuggest;
                num3 = num;
                i8 = 1;
                kxeVar2 = null;
                if (incidentSuggest2 != null) {
                }
                if (!(w34Var4 instanceof u34)) {
                }
                q54Var2.o.l(crowdsourcingIncidentType);
                q54Var2.n.l(side);
                q54Var2.p.l(kxeVar);
                q54Var2.q.l(kxeVar2);
                fdi fdiVar32222 = q54Var2.r;
                this.v = w34Var4;
                this.w = num3;
                this.x = null;
                this.y = kxeVar;
                this.z = null;
                this.A = null;
                this.B = fdiVar32222;
                this.r = i3;
                this.s = i2;
                this.E = 4;
                v = q54Var2.v(this);
                if (v != lu3Var) {
                }
            }
        }
        return lu3Var;
    }
}
