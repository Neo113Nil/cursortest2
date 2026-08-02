package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.PlayerTeamInfo;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamDetailsHeadFlags;
import com.sofascore.model.newNetwork.StatisticsSeasonsResponse;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mui extends hoi implements Function2 {
    public int A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ nui J;
    public Team r;
    public Object s;
    public zu4 t;
    public zu4 u;
    public zu4 v;
    public zu4 w;
    public yzc x;
    public Team y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mui(nui nuiVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.J = nuiVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        mui muiVar = new mui(this.J, rq3Var);
        muiVar.I = obj;
        return muiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mui) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0182, code lost:
    
        if (r6 == r4) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0136, code lost:
    
        if (r5 == r4) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x026f, code lost:
    
        if (kotlin.text.StringsKt.J(r11.getName(), "/", false) != false) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0244  */
    /* JADX WARN: Type inference failed for: r10v10, types: [zu4] */
    /* JADX WARN: Type inference failed for: r10v13, types: [zu4] */
    /* JADX WARN: Type inference failed for: r10v17, types: [zu4] */
    /* JADX WARN: Type inference failed for: r11v6, types: [zu4] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r5v54, types: [zu4] */
    /* JADX WARN: Type inference failed for: r9v10, types: [zu4] */
    /* JADX WARN: Type inference failed for: r9v13, types: [zu4] */
    /* JADX WARN: Type inference failed for: r9v5, types: [zu4] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Team team;
        Object w;
        zzc zzcVar;
        Object c;
        Team team2;
        Sport sport;
        String str;
        zu4 p;
        Sport sport2;
        av4 p2;
        av4 p3;
        av4 t;
        zu4 t2;
        Object w2;
        av4 av4Var;
        String slug;
        av4 av4Var2;
        Map<Integer, Map<Integer, List<String>>> map;
        zu4 zu4Var;
        Team team3;
        int i;
        int i2;
        Object T;
        zu4 zu4Var2;
        int i3;
        StatisticsSeasonsResponse statisticsSeasonsResponse;
        Map<Integer, Map<Integer, List<String>>> map2;
        av4 av4Var3;
        j0j j0jVar;
        zu4 zu4Var3;
        av4 av4Var4;
        zu4 zu4Var4;
        int i4;
        int i5;
        StatisticsSeasonsResponse statisticsSeasonsResponse2;
        zu4 zu4Var5;
        zu4 zu4Var6;
        Team team4;
        Boolean bool;
        Object T2;
        boolean c2;
        int i6;
        zu4 zu4Var7;
        Boolean bool2;
        Object T3;
        yzc yzcVar;
        boolean z;
        zu4 zu4Var8;
        zu4 zu4Var9;
        int i7;
        int i8;
        int i9;
        Object T4;
        int i10;
        Team team5;
        yzc yzcVar2;
        int i11;
        boolean z2;
        boolean z3;
        int i12;
        int i13;
        Object T5;
        boolean z4;
        int i14;
        yzc yzcVar3;
        int i15;
        nui nuiVar = this.J;
        yzc yzcVar4 = nuiVar.l;
        ku3 ku3Var = (ku3) this.I;
        lu3 lu3Var = lu3.a;
        int i16 = 4;
        int i17 = 5;
        int i18 = 3;
        int i19 = 2;
        rq3 rq3Var = null;
        switch (this.H) {
            case 0:
                y6a.M(obj);
                av4 t3 = xw3.t(ku3Var, null, new cce(nuiVar, rq3Var, 22), 3);
                if (nuiVar.t && !nuiVar.u) {
                    nuiVar.t = false;
                    team = (Team) nuiVar.k.d();
                    if (team == null) {
                        this.I = ku3Var;
                        this.H = 1;
                        w = t3.w(this);
                        break;
                    }
                    if (team == null) {
                        if (!nuiVar.s) {
                            PlayerTeamInfo playerTeamInfo = team.getPlayerTeamInfo();
                            if (!(playerTeamInfo != null ? Intrinsics.c(playerTeamInfo.getRetired(), Boolean.TRUE) : false)) {
                                PlayerTeamInfo playerTeamInfo2 = team.getPlayerTeamInfo();
                                if (!(playerTeamInfo2 != null ? Intrinsics.c(playerTeamInfo2.getDeceased(), Boolean.TRUE) : false)) {
                                    nuiVar.s = true;
                                    zzcVar = nuiVar.o;
                                    sef sefVar = nuiVar.g;
                                    int i20 = nuiVar.i;
                                    qef qefVar = qef.TEAM;
                                    this.I = ku3Var;
                                    this.r = team;
                                    this.s = zzcVar;
                                    this.H = 2;
                                    c = sefVar.c(i20, qefVar, this);
                                    break;
                                }
                            }
                        }
                        team2 = team;
                        Set set = wyh.a;
                        sport = team2.getSport();
                        str = "";
                        if (sport != null || (r5 = sport.getSlug()) == null) {
                            String str2 = "";
                        }
                        p = yaa.p(ku3Var, wyh.g.contains(str2), new lui(nuiVar, rq3Var, i17));
                        Set set2 = u0j.a;
                        sport2 = team2.getSport();
                        if (sport2 != null && (slug = sport2.getSlug()) != null) {
                            str = slug;
                        }
                        p2 = yaa.p(ku3Var, u0j.a.contains(str), new lui(nuiVar, rq3Var, i16));
                        Sport sport3 = team2.getSport();
                        p3 = yaa.p(ku3Var, sport3 == null && !Intrinsics.c(sport3.getSlug(), Sports.TENNIS), new lui(nuiVar, rq3Var, 1));
                        Sport sport4 = team2.getSport();
                        av4 p4 = yaa.p(ku3Var, CollectionsKt.R(wyh.w, sport4 == null ? sport4.getSlug() : null), new lui(nuiVar, rq3Var, i18));
                        t = xw3.t(ku3Var, null, new lui(nuiVar, rq3Var, i19), 3);
                        t2 = xw3.t(ku3Var, null, new vki(nuiVar, rq3Var, 8), 3);
                        if (p2 != null) {
                            this.I = null;
                            this.r = team2;
                            this.s = p;
                            this.t = p3;
                            this.u = p4;
                            this.v = t;
                            this.w = t2;
                            this.H = 3;
                            w2 = p2.w(this);
                            if (w2 != lu3Var) {
                                av4Var = p4;
                                statisticsSeasonsResponse = (StatisticsSeasonsResponse) w2;
                                if (statisticsSeasonsResponse == null) {
                                    map = statisticsSeasonsResponse.getTypesMap();
                                    av4Var2 = av4Var;
                                    zu4Var = t;
                                    team3 = team2;
                                    if (map != null || map.isEmpty()) {
                                        i = 0;
                                    } else {
                                        Sport sport5 = team3.getSport();
                                        if (Intrinsics.c(sport5 != null ? sport5.getSlug() : null, Sports.TENNIS)) {
                                            i = 0;
                                            break;
                                        } else {
                                            i = 0;
                                        }
                                        i2 = 1;
                                        if (p != null) {
                                            this.I = null;
                                            this.r = team3;
                                            this.s = null;
                                            this.t = p3;
                                            this.u = av4Var2;
                                            this.v = zu4Var;
                                            this.w = t2;
                                            this.z = i2;
                                            this.H = 4;
                                            T = p.T(this);
                                            if (T != lu3Var) {
                                                int i21 = i2;
                                                zu4Var2 = t2;
                                                i3 = i21;
                                                av4Var2 = av4Var2;
                                                statisticsSeasonsResponse2 = (StatisticsSeasonsResponse) T;
                                                if (statisticsSeasonsResponse2 == null) {
                                                    map2 = statisticsSeasonsResponse2.getTypesMap();
                                                    av4Var3 = av4Var2;
                                                    int i22 = ((map2 != null || map2.isEmpty()) ? 1 : i) ^ 1;
                                                    nuiVar.u = true;
                                                    j0jVar = nuiVar.e;
                                                    this.I = null;
                                                    this.r = team3;
                                                    this.s = null;
                                                    this.t = p3;
                                                    this.u = av4Var3;
                                                    this.v = zu4Var;
                                                    this.w = zu4Var2;
                                                    this.z = i3;
                                                    this.A = i22;
                                                    this.H = 5;
                                                    if (j0jVar.J(team3, this) != lu3Var) {
                                                        av4 av4Var5 = av4Var3;
                                                        zu4Var3 = zu4Var;
                                                        av4Var4 = av4Var5;
                                                        zu4Var4 = zu4Var2;
                                                        i4 = i3;
                                                        i5 = i22;
                                                        if (p3 == null) {
                                                            this.I = null;
                                                            this.r = team3;
                                                            this.s = null;
                                                            this.t = null;
                                                            this.u = av4Var4;
                                                            this.v = zu4Var3;
                                                            this.w = zu4Var4;
                                                            this.x = yzcVar4;
                                                            this.y = team3;
                                                            this.z = i4;
                                                            this.A = i5;
                                                            this.H = 6;
                                                            T2 = p3.T(this);
                                                            if (T2 != lu3Var) {
                                                                team4 = team3;
                                                                bool = (Boolean) T2;
                                                                zu4 zu4Var10 = zu4Var3;
                                                                zu4Var5 = zu4Var4;
                                                                zu4Var6 = zu4Var10;
                                                                c2 = Intrinsics.c(bool, Boolean.TRUE);
                                                                if (av4Var4 != null) {
                                                                    this.I = null;
                                                                    this.r = team4;
                                                                    this.s = null;
                                                                    this.t = null;
                                                                    this.u = null;
                                                                    this.v = zu4Var6;
                                                                    this.w = zu4Var5;
                                                                    this.x = yzcVar4;
                                                                    this.y = team3;
                                                                    this.z = i4;
                                                                    this.A = i5;
                                                                    this.E = c2;
                                                                    this.H = 7;
                                                                    T3 = av4Var4.T(this);
                                                                    if (T3 != lu3Var) {
                                                                        zu4 zu4Var11 = zu4Var6;
                                                                        yzcVar = yzcVar4;
                                                                        z = c2;
                                                                        zu4Var8 = zu4Var11;
                                                                        bool2 = (Boolean) T3;
                                                                        zu4 zu4Var12 = zu4Var8;
                                                                        c2 = z;
                                                                        yzcVar4 = yzcVar;
                                                                        i6 = i5;
                                                                        zu4Var7 = zu4Var12;
                                                                        zu4Var9 = zu4Var5;
                                                                        i7 = i4;
                                                                        boolean c3 = Intrinsics.c(bool2, Boolean.TRUE);
                                                                        if (i6 != 0) {
                                                                            Set set3 = wyh.a;
                                                                            if (!Intrinsics.c(team4.getSportSlug(), Sports.AMERICAN_FOOTBALL)) {
                                                                                i8 = 1;
                                                                                if (i6 != 0) {
                                                                                    Set set4 = wyh.a;
                                                                                    if (Intrinsics.c(team4.getSportSlug(), Sports.AMERICAN_FOOTBALL)) {
                                                                                        i9 = 1;
                                                                                        this.I = null;
                                                                                        this.r = null;
                                                                                        this.s = null;
                                                                                        this.t = null;
                                                                                        this.u = null;
                                                                                        this.v = null;
                                                                                        this.w = zu4Var9;
                                                                                        this.x = yzcVar4;
                                                                                        this.y = team3;
                                                                                        this.z = i7;
                                                                                        this.A = i6;
                                                                                        this.E = c2;
                                                                                        this.F = c3;
                                                                                        this.B = i8;
                                                                                        this.C = i7;
                                                                                        this.D = i9;
                                                                                        this.H = 8;
                                                                                        T4 = zu4Var7.T(this);
                                                                                        if (T4 != lu3Var) {
                                                                                            Team team6 = team3;
                                                                                            i10 = i6;
                                                                                            team5 = team6;
                                                                                            yzcVar2 = yzcVar4;
                                                                                            i11 = i9;
                                                                                            z2 = c2;
                                                                                            z3 = c3;
                                                                                            i12 = i8;
                                                                                            i13 = i7;
                                                                                            boolean booleanValue = ((Boolean) T4).booleanValue();
                                                                                            this.I = null;
                                                                                            this.r = null;
                                                                                            this.s = null;
                                                                                            this.t = null;
                                                                                            this.u = null;
                                                                                            this.v = null;
                                                                                            this.w = null;
                                                                                            this.x = yzcVar2;
                                                                                            this.y = team5;
                                                                                            this.z = i13;
                                                                                            this.A = i10;
                                                                                            this.E = z2;
                                                                                            this.F = z3;
                                                                                            this.B = i12;
                                                                                            this.C = i7;
                                                                                            this.D = i11;
                                                                                            this.G = booleanValue;
                                                                                            this.H = 9;
                                                                                            T5 = zu4Var9.T(this);
                                                                                            if (T5 != lu3Var) {
                                                                                                z4 = booleanValue;
                                                                                                i14 = i7;
                                                                                                yzcVar3 = yzcVar2;
                                                                                                i15 = i11;
                                                                                                yzcVar3.k(new TeamDetailsHeadFlags(team5, z2, z3, i12 == 0 ? 1 : i, i14 == 0 ? 1 : i, i15 == 0 ? 1 : i, z4, ((Boolean) T5).booleanValue()));
                                                                                                nuiVar.t = true;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                i9 = i;
                                                                                this.I = null;
                                                                                this.r = null;
                                                                                this.s = null;
                                                                                this.t = null;
                                                                                this.u = null;
                                                                                this.v = null;
                                                                                this.w = zu4Var9;
                                                                                this.x = yzcVar4;
                                                                                this.y = team3;
                                                                                this.z = i7;
                                                                                this.A = i6;
                                                                                this.E = c2;
                                                                                this.F = c3;
                                                                                this.B = i8;
                                                                                this.C = i7;
                                                                                this.D = i9;
                                                                                this.H = 8;
                                                                                T4 = zu4Var7.T(this);
                                                                                if (T4 != lu3Var) {
                                                                                }
                                                                            }
                                                                        }
                                                                        i8 = i;
                                                                        if (i6 != 0) {
                                                                        }
                                                                        i9 = i;
                                                                        this.I = null;
                                                                        this.r = null;
                                                                        this.s = null;
                                                                        this.t = null;
                                                                        this.u = null;
                                                                        this.v = null;
                                                                        this.w = zu4Var9;
                                                                        this.x = yzcVar4;
                                                                        this.y = team3;
                                                                        this.z = i7;
                                                                        this.A = i6;
                                                                        this.E = c2;
                                                                        this.F = c3;
                                                                        this.B = i8;
                                                                        this.C = i7;
                                                                        this.D = i9;
                                                                        this.H = 8;
                                                                        T4 = zu4Var7.T(this);
                                                                        if (T4 != lu3Var) {
                                                                        }
                                                                    }
                                                                } else {
                                                                    zu4 zu4Var13 = zu4Var6;
                                                                    i6 = i5;
                                                                    zu4Var7 = zu4Var13;
                                                                    bool2 = null;
                                                                    zu4Var9 = zu4Var5;
                                                                    i7 = i4;
                                                                    boolean c32 = Intrinsics.c(bool2, Boolean.TRUE);
                                                                    if (i6 != 0) {
                                                                    }
                                                                    i8 = i;
                                                                    if (i6 != 0) {
                                                                    }
                                                                    i9 = i;
                                                                    this.I = null;
                                                                    this.r = null;
                                                                    this.s = null;
                                                                    this.t = null;
                                                                    this.u = null;
                                                                    this.v = null;
                                                                    this.w = zu4Var9;
                                                                    this.x = yzcVar4;
                                                                    this.y = team3;
                                                                    this.z = i7;
                                                                    this.A = i6;
                                                                    this.E = c2;
                                                                    this.F = c32;
                                                                    this.B = i8;
                                                                    this.C = i7;
                                                                    this.D = i9;
                                                                    this.H = 8;
                                                                    T4 = zu4Var7.T(this);
                                                                    if (T4 != lu3Var) {
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            zu4 zu4Var14 = zu4Var3;
                                                            zu4Var5 = zu4Var4;
                                                            zu4Var6 = zu4Var14;
                                                            team4 = team3;
                                                            bool = null;
                                                            c2 = Intrinsics.c(bool, Boolean.TRUE);
                                                            if (av4Var4 != null) {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    zu4 zu4Var15 = zu4Var2;
                                                    i2 = i3;
                                                    t2 = zu4Var15;
                                                }
                                            }
                                        }
                                        int i23 = i2;
                                        zu4Var2 = t2;
                                        i3 = i23;
                                        map2 = null;
                                        av4Var3 = av4Var2;
                                        int i222 = ((map2 != null || map2.isEmpty()) ? 1 : i) ^ 1;
                                        nuiVar.u = true;
                                        j0jVar = nuiVar.e;
                                        this.I = null;
                                        this.r = team3;
                                        this.s = null;
                                        this.t = p3;
                                        this.u = av4Var3;
                                        this.v = zu4Var;
                                        this.w = zu4Var2;
                                        this.z = i3;
                                        this.A = i222;
                                        this.H = 5;
                                        if (j0jVar.J(team3, this) != lu3Var) {
                                        }
                                    }
                                    i2 = i;
                                    if (p != null) {
                                    }
                                    int i232 = i2;
                                    zu4Var2 = t2;
                                    i3 = i232;
                                    map2 = null;
                                    av4Var3 = av4Var2;
                                    int i2222 = ((map2 != null || map2.isEmpty()) ? 1 : i) ^ 1;
                                    nuiVar.u = true;
                                    j0jVar = nuiVar.e;
                                    this.I = null;
                                    this.r = team3;
                                    this.s = null;
                                    this.t = p3;
                                    this.u = av4Var3;
                                    this.v = zu4Var;
                                    this.w = zu4Var2;
                                    this.z = i3;
                                    this.A = i2222;
                                    this.H = 5;
                                    if (j0jVar.J(team3, this) != lu3Var) {
                                    }
                                } else {
                                    p4 = av4Var;
                                }
                            }
                            return lu3Var;
                        }
                        av4Var2 = p4;
                        map = null;
                        zu4Var = t;
                        team3 = team2;
                        if (map != null) {
                        }
                        i = 0;
                        i2 = i;
                        if (p != null) {
                        }
                        int i2322 = i2;
                        zu4Var2 = t2;
                        i3 = i2322;
                        map2 = null;
                        av4Var3 = av4Var2;
                        int i22222 = ((map2 != null || map2.isEmpty()) ? 1 : i) ^ 1;
                        nuiVar.u = true;
                        j0jVar = nuiVar.e;
                        this.I = null;
                        this.r = team3;
                        this.s = null;
                        this.t = p3;
                        this.u = av4Var3;
                        this.v = zu4Var;
                        this.w = zu4Var2;
                        this.z = i3;
                        this.A = i22222;
                        this.H = 5;
                        if (j0jVar.J(team3, this) != lu3Var) {
                        }
                        return lu3Var;
                    }
                    yzcVar4.k(null);
                    nuiVar.t = true;
                }
                return Unit.a;
            case 1:
                y6a.M(obj);
                w = obj;
                team = (Team) w;
                if (team == null) {
                }
                break;
            case 2:
                zzcVar = (zzc) this.s;
                team = this.r;
                y6a.M(obj);
                c = obj;
                zzcVar.a.k(new z46(c));
                team2 = team;
                Set set5 = wyh.a;
                sport = team2.getSport();
                str = "";
                if (sport != null) {
                    break;
                }
                String str22 = "";
                p = yaa.p(ku3Var, wyh.g.contains(str22), new lui(nuiVar, rq3Var, i17));
                Set set22 = u0j.a;
                sport2 = team2.getSport();
                if (sport2 != null) {
                    str = slug;
                    break;
                }
                p2 = yaa.p(ku3Var, u0j.a.contains(str), new lui(nuiVar, rq3Var, i16));
                Sport sport32 = team2.getSport();
                if (sport32 == null) {
                    break;
                }
                p3 = yaa.p(ku3Var, sport32 == null && !Intrinsics.c(sport32.getSlug(), Sports.TENNIS), new lui(nuiVar, rq3Var, 1));
                Sport sport42 = team2.getSport();
                av4 p42 = yaa.p(ku3Var, CollectionsKt.R(wyh.w, sport42 == null ? sport42.getSlug() : null), new lui(nuiVar, rq3Var, i18));
                t = xw3.t(ku3Var, null, new lui(nuiVar, rq3Var, i19), 3);
                t2 = xw3.t(ku3Var, null, new vki(nuiVar, rq3Var, 8), 3);
                if (p2 != null) {
                }
                av4Var2 = p42;
                map = null;
                zu4Var = t;
                team3 = team2;
                if (map != null) {
                }
                i = 0;
                i2 = i;
                if (p != null) {
                }
                int i23222 = i2;
                zu4Var2 = t2;
                i3 = i23222;
                map2 = null;
                av4Var3 = av4Var2;
                int i222222 = ((map2 != null || map2.isEmpty()) ? 1 : i) ^ 1;
                nuiVar.u = true;
                j0jVar = nuiVar.e;
                this.I = null;
                this.r = team3;
                this.s = null;
                this.t = p3;
                this.u = av4Var3;
                this.v = zu4Var;
                this.w = zu4Var2;
                this.z = i3;
                this.A = i222222;
                this.H = 5;
                if (j0jVar.J(team3, this) != lu3Var) {
                }
                return lu3Var;
            case 3:
                t2 = this.w;
                ?? r5 = this.v;
                ?? r9 = this.u;
                ?? r11 = this.t;
                p = (zu4) this.s;
                team2 = this.r;
                y6a.M(obj);
                p3 = r11;
                t = r5;
                w2 = obj;
                av4Var = r9;
                statisticsSeasonsResponse = (StatisticsSeasonsResponse) w2;
                if (statisticsSeasonsResponse == null) {
                }
                break;
            case 4:
                i3 = this.z;
                zu4Var2 = this.w;
                zu4Var = this.v;
                ?? r92 = this.u;
                ?? r10 = this.t;
                team3 = this.r;
                y6a.M(obj);
                T = obj;
                p3 = r10;
                i = 0;
                av4Var2 = r92;
                statisticsSeasonsResponse2 = (StatisticsSeasonsResponse) T;
                if (statisticsSeasonsResponse2 == null) {
                }
                break;
            case 5:
                i5 = this.A;
                i4 = this.z;
                zu4 zu4Var16 = this.w;
                zu4 zu4Var17 = this.v;
                ?? r93 = this.u;
                ?? r102 = this.t;
                team3 = this.r;
                y6a.M(obj);
                zu4Var4 = zu4Var16;
                av4Var4 = r93;
                zu4Var3 = zu4Var17;
                p3 = r102;
                i = 0;
                if (p3 == null) {
                }
                break;
            case 6:
                int i24 = this.A;
                int i25 = this.z;
                Team team7 = this.y;
                yzc yzcVar5 = this.x;
                zu4Var4 = this.w;
                zu4Var3 = this.v;
                ?? r103 = this.u;
                Team team8 = this.r;
                y6a.M(obj);
                i5 = i24;
                yzcVar4 = yzcVar5;
                av4Var4 = r103;
                i = 0;
                team4 = team8;
                team3 = team7;
                i4 = i25;
                T2 = obj;
                bool = (Boolean) T2;
                zu4 zu4Var102 = zu4Var3;
                zu4Var5 = zu4Var4;
                zu4Var6 = zu4Var102;
                c2 = Intrinsics.c(bool, Boolean.TRUE);
                if (av4Var4 != null) {
                }
                break;
            case 7:
                z = this.E;
                i5 = this.A;
                i4 = this.z;
                Team team9 = this.y;
                yzcVar = this.x;
                zu4Var5 = this.w;
                zu4 zu4Var18 = this.v;
                Team team10 = this.r;
                y6a.M(obj);
                zu4Var8 = zu4Var18;
                i = 0;
                team4 = team10;
                team3 = team9;
                T3 = obj;
                bool2 = (Boolean) T3;
                zu4 zu4Var122 = zu4Var8;
                c2 = z;
                yzcVar4 = yzcVar;
                i6 = i5;
                zu4Var7 = zu4Var122;
                zu4Var9 = zu4Var5;
                i7 = i4;
                boolean c322 = Intrinsics.c(bool2, Boolean.TRUE);
                if (i6 != 0) {
                }
                i8 = i;
                if (i6 != 0) {
                }
                i9 = i;
                this.I = null;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = null;
                this.w = zu4Var9;
                this.x = yzcVar4;
                this.y = team3;
                this.z = i7;
                this.A = i6;
                this.E = c2;
                this.F = c322;
                this.B = i8;
                this.C = i7;
                this.D = i9;
                this.H = 8;
                T4 = zu4Var7.T(this);
                if (T4 != lu3Var) {
                }
                return lu3Var;
            case 8:
                i11 = this.D;
                int i26 = this.C;
                i12 = this.B;
                z3 = this.F;
                z2 = this.E;
                int i27 = this.A;
                int i28 = this.z;
                Team team11 = this.y;
                yzc yzcVar6 = this.x;
                zu4Var9 = this.w;
                y6a.M(obj);
                i10 = i27;
                team5 = team11;
                i = 0;
                yzcVar2 = yzcVar6;
                i13 = i28;
                i7 = i26;
                T4 = obj;
                boolean booleanValue2 = ((Boolean) T4).booleanValue();
                this.I = null;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = null;
                this.w = null;
                this.x = yzcVar2;
                this.y = team5;
                this.z = i13;
                this.A = i10;
                this.E = z2;
                this.F = z3;
                this.B = i12;
                this.C = i7;
                this.D = i11;
                this.G = booleanValue2;
                this.H = 9;
                T5 = zu4Var9.T(this);
                if (T5 != lu3Var) {
                }
                return lu3Var;
            case 9:
                boolean z5 = this.G;
                i15 = this.D;
                i14 = this.C;
                i12 = this.B;
                z3 = this.F;
                z2 = this.E;
                team5 = this.y;
                yzcVar3 = this.x;
                y6a.M(obj);
                T5 = obj;
                z4 = z5;
                i = 0;
                yzcVar3.k(new TeamDetailsHeadFlags(team5, z2, z3, i12 == 0 ? 1 : i, i14 == 0 ? 1 : i, i15 == 0 ? 1 : i, z4, ((Boolean) T5).booleanValue()));
                nuiVar.t = true;
                return Unit.a;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
