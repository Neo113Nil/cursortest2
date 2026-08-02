package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerHeadFlags;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.StatisticsSeasonsResponse;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerCareerStatisticsResponse;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ole extends hoi implements Function2 {
    public Object A;
    public PlayerCareerStatisticsResponse B;
    public StatisticsSeasonsResponse C;
    public Player D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public /* synthetic */ Object N;
    public final /* synthetic */ ple O;
    public zu4 r;
    public zu4 s;
    public zu4 t;
    public zu4 u;
    public av4 v;
    public Player w;
    public fsf x;
    public Object y;
    public yzc z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ole(ple pleVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.O = pleVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        ole oleVar = new ole(this.O, rq3Var);
        oleVar.N = obj;
        return oleVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ole) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0308, code lost:
    
        if (r10 != r3) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x03df, code lost:
    
        if (r12.equals(com.sofascore.model.Sports.CRICKET) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0445, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x03eb, code lost:
    
        if (r12.equals(com.sofascore.model.Sports.MINI_FOOTBALL) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x03f6, code lost:
    
        if (r12.equals(com.sofascore.model.Sports.BASKETBALL) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0401, code lost:
    
        if (r12.equals(com.sofascore.model.Sports.FOOTBALL) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x040c, code lost:
    
        if (r12.equals(com.sofascore.model.Sports.RUGBY) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0417, code lost:
    
        if (r12.equals(com.sofascore.model.Sports.HANDBALL) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0422, code lost:
    
        if (r12.equals(com.sofascore.model.Sports.AMERICAN_FOOTBALL) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x042d, code lost:
    
        if (r12.equals(com.sofascore.model.Sports.VOLLEYBALL) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0438, code lost:
    
        if (r12.equals(com.sofascore.model.Sports.BASEBALL) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0443, code lost:
    
        if (r12.equals(com.sofascore.model.Sports.ICE_HOCKEY) != false) goto L142;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x03d0. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x044d  */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [av4, com.sofascore.model.mvvm.model.Player, yzc, zu4] */
    /* JADX WARN: Type inference failed for: r14v7 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        zu4 t;
        Object w;
        zu4 zu4Var;
        zu4 zu4Var2;
        zu4 zu4Var3;
        av4 av4Var;
        SharedPreferences d;
        Player player;
        fsf fsfVar;
        Object T;
        zu4 zu4Var4;
        fsf fsfVar2;
        Player player2;
        ple pleVar;
        zu4 zu4Var5;
        int i;
        zu4 zu4Var6;
        zu4 zu4Var7;
        ple pleVar2;
        Object c;
        fsf fsfVar3;
        zu4 zu4Var8;
        ple pleVar3;
        zu4 zu4Var9;
        zzc zzcVar;
        int i2;
        int i3;
        Object U;
        zu4 zu4Var10;
        int i4;
        zu4 zu4Var11;
        zu4 zu4Var12;
        ?? r14;
        Object T2;
        Object T3;
        int i5;
        ple pleVar4;
        x2g x2gVar;
        zu4 zu4Var13;
        fsf fsfVar4;
        PlayerCareerStatisticsResponse playerCareerStatisticsResponse;
        StatisticsSeasonsResponse statisticsSeasonsResponse;
        Team team;
        String str;
        int i6;
        Boolean valueOf;
        Boolean bool;
        int i7;
        String sportSlug;
        ple pleVar5;
        Boolean bool2;
        boolean c2;
        Player player3;
        PlayerCareerStatisticsResponse playerCareerStatisticsResponse2;
        zu4 zu4Var14;
        boolean z2;
        yzc yzcVar;
        int i8;
        int i9;
        StatisticsSeasonsResponse statisticsSeasonsResponse2;
        Boolean bool3;
        Object T4;
        boolean z3;
        int i10;
        yzc yzcVar2;
        boolean z4;
        Map<Integer, List<String>> typesMap;
        Map<Integer, Map<Integer, List<String>>> typesMap2;
        Sport sport;
        Object T5;
        boolean z5;
        int i11;
        int i12;
        Player player4;
        ple pleVar6 = this.O;
        ku3 ku3Var = (ku3) this.N;
        lu3 lu3Var = lu3.a;
        int i13 = 2;
        int i14 = 4;
        int i15 = 3;
        switch (this.M) {
            case 0:
                y6a.M(obj);
                rq3 rq3Var = null;
                av4 t2 = xw3.t(ku3Var, null, new nle(pleVar6, rq3Var, i14), 3);
                av4 t3 = xw3.t(ku3Var, null, new nle(pleVar6, rq3Var, 0), 3);
                if (c5n.O(pleVar6.i())) {
                    Context i16 = pleVar6.i();
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = i16.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    if (sharedPreferences.getBoolean("PREF_HAS_FANTASY_MIN_VERSION", false) && pleVar6.i.b().getFantasyUser()) {
                        z = true;
                        int i17 = 1;
                        rq3 rq3Var2 = null;
                        av4 p = yaa.p(ku3Var, z, new nle(pleVar6, rq3Var2, i17));
                        t = xw3.t(ku3Var, null, new gje(pleVar6, rq3Var2, i17), 3);
                        av4 t4 = xw3.t(ku3Var, null, new nle(pleVar6, rq3Var2, i13), 3);
                        av4 t5 = xw3.t(ku3Var, null, new nle(pleVar6, rq3Var2, i15), 3);
                        this.N = ku3Var;
                        this.r = t2;
                        this.s = t3;
                        this.t = p;
                        this.u = t;
                        this.v = t5;
                        this.M = 1;
                        w = t4.w(this);
                        if (w != lu3Var) {
                            zu4Var = t2;
                            zu4Var2 = t3;
                            zu4Var3 = p;
                            av4Var = t5;
                            player = (Player) w;
                            fsfVar = new fsf();
                            this.N = ku3Var;
                            this.r = zu4Var;
                            this.s = zu4Var2;
                            this.t = zu4Var3;
                            this.u = t;
                            this.v = null;
                            this.w = player;
                            this.x = fsfVar;
                            this.y = fsfVar;
                            this.M = 2;
                            T = av4Var.T(this);
                            if (T != lu3Var) {
                                zu4Var4 = t;
                                fsfVar2 = fsfVar;
                                fsfVar.a = T;
                                if (fsfVar2.a != null && player != null && player.getUserCount() > ((Player) fsfVar2.a).getUserCount()) {
                                    fsfVar2.a = Player.copy$default((Player) fsfVar2.a, 0, null, null, null, null, null, null, player.getUserCount(), null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, -129, 31, null);
                                }
                                player2 = (Player) fsfVar2.a;
                                if (player2 != null) {
                                    pleVar = pleVar6;
                                    pleVar.p.j(null);
                                    pleVar.u = true;
                                    return Unit.a;
                                }
                                if (pleVar6.t || player2.getRetired() || ((Player) fsfVar2.a).getDeceased()) {
                                    zu4Var5 = zu4Var2;
                                    i = 0;
                                    zu4Var6 = zu4Var3;
                                    zu4Var7 = zu4Var4;
                                    pleVar2 = pleVar6;
                                    Player player5 = (Player) fsfVar2.a;
                                    pleVar2.l = player5;
                                    wve wveVar = pleVar2.e;
                                    this.N = ku3Var;
                                    this.r = zu4Var;
                                    this.s = zu4Var5;
                                    this.t = zu4Var6;
                                    this.u = zu4Var7;
                                    this.v = null;
                                    this.w = null;
                                    this.x = fsfVar2;
                                    this.y = pleVar2;
                                    this.z = null;
                                    this.A = null;
                                    this.E = i;
                                    this.M = 4;
                                    aoe aoeVar = wveVar.a;
                                    k6g k6gVar = aoeVar.a;
                                    xne xneVar = new xne(aoeVar, player5, 1);
                                    i3 = 0;
                                    U = gz8.U(this, k6gVar, false, true, xneVar);
                                    if (U != lu3Var) {
                                        U = Unit.a;
                                    }
                                    if (U != lu3Var) {
                                        int i18 = i;
                                        zu4Var10 = zu4Var5;
                                        i4 = i18;
                                        zu4Var11 = zu4Var7;
                                        zu4Var12 = zu4Var;
                                        this.N = ku3Var;
                                        r14 = 0;
                                        this.r = null;
                                        this.s = zu4Var10;
                                        this.t = zu4Var6;
                                        this.u = zu4Var11;
                                        this.v = null;
                                        this.w = null;
                                        this.x = fsfVar2;
                                        this.y = pleVar2;
                                        this.z = null;
                                        this.E = i4;
                                        this.M = 5;
                                        T2 = zu4Var12.T(this);
                                        break;
                                    }
                                } else {
                                    pleVar6.t = true;
                                    zzc zzcVar2 = pleVar6.r;
                                    sef sefVar = pleVar6.h;
                                    int i19 = pleVar6.j;
                                    qef qefVar = qef.PLAYER;
                                    this.N = ku3Var;
                                    this.r = zu4Var;
                                    this.s = zu4Var2;
                                    this.t = zu4Var3;
                                    this.u = zu4Var4;
                                    this.v = null;
                                    this.w = null;
                                    this.x = fsfVar2;
                                    this.y = pleVar6;
                                    this.z = null;
                                    this.A = zzcVar2;
                                    this.E = 0;
                                    this.M = 3;
                                    c = sefVar.c(i19, qefVar, this);
                                    if (c != lu3Var) {
                                        fsfVar3 = fsfVar2;
                                        zu4Var8 = zu4Var;
                                        pleVar3 = pleVar6;
                                        zu4Var9 = zu4Var2;
                                        zu4Var6 = zu4Var3;
                                        zu4Var7 = zu4Var4;
                                        zzcVar = zzcVar2;
                                        i2 = 0;
                                        zzcVar.a(c);
                                        pleVar2 = pleVar3;
                                        fsfVar2 = fsfVar3;
                                        i = i2;
                                        zu4Var5 = zu4Var9;
                                        zu4Var = zu4Var8;
                                        Player player52 = (Player) fsfVar2.a;
                                        pleVar2.l = player52;
                                        wve wveVar2 = pleVar2.e;
                                        this.N = ku3Var;
                                        this.r = zu4Var;
                                        this.s = zu4Var5;
                                        this.t = zu4Var6;
                                        this.u = zu4Var7;
                                        this.v = null;
                                        this.w = null;
                                        this.x = fsfVar2;
                                        this.y = pleVar2;
                                        this.z = null;
                                        this.A = null;
                                        this.E = i;
                                        this.M = 4;
                                        aoe aoeVar2 = wveVar2.a;
                                        k6g k6gVar2 = aoeVar2.a;
                                        xne xneVar2 = new xne(aoeVar2, player52, 1);
                                        i3 = 0;
                                        U = gz8.U(this, k6gVar2, false, true, xneVar2);
                                        if (U != lu3Var) {
                                        }
                                        if (U != lu3Var) {
                                        }
                                    }
                                }
                            }
                        }
                        return lu3Var;
                    }
                }
                z = false;
                int i172 = 1;
                rq3 rq3Var22 = null;
                av4 p2 = yaa.p(ku3Var, z, new nle(pleVar6, rq3Var22, i172));
                t = xw3.t(ku3Var, null, new gje(pleVar6, rq3Var22, i172), 3);
                av4 t42 = xw3.t(ku3Var, null, new nle(pleVar6, rq3Var22, i13), 3);
                av4 t52 = xw3.t(ku3Var, null, new nle(pleVar6, rq3Var22, i15), 3);
                this.N = ku3Var;
                this.r = t2;
                this.s = t3;
                this.t = p2;
                this.u = t;
                this.v = t52;
                this.M = 1;
                w = t42.w(this);
                if (w != lu3Var) {
                }
                return lu3Var;
            case 1:
                av4Var = this.v;
                t = this.u;
                zu4 zu4Var15 = this.t;
                zu4 zu4Var16 = this.s;
                zu4 zu4Var17 = this.r;
                y6a.M(obj);
                zu4Var = zu4Var17;
                zu4Var2 = zu4Var16;
                zu4Var3 = zu4Var15;
                w = obj;
                player = (Player) w;
                fsfVar = new fsf();
                this.N = ku3Var;
                this.r = zu4Var;
                this.s = zu4Var2;
                this.t = zu4Var3;
                this.u = t;
                this.v = null;
                this.w = player;
                this.x = fsfVar;
                this.y = fsfVar;
                this.M = 2;
                T = av4Var.T(this);
                if (T != lu3Var) {
                }
                return lu3Var;
            case 2:
                fsf fsfVar5 = (fsf) this.y;
                fsf fsfVar6 = this.x;
                Player player6 = this.w;
                zu4 zu4Var18 = this.u;
                zu4Var3 = this.t;
                zu4Var2 = this.s;
                zu4Var = this.r;
                y6a.M(obj);
                fsfVar2 = fsfVar6;
                zu4Var4 = zu4Var18;
                player = player6;
                fsfVar = fsfVar5;
                T = obj;
                fsfVar.a = T;
                if (fsfVar2.a != null) {
                    fsfVar2.a = Player.copy$default((Player) fsfVar2.a, 0, null, null, null, null, null, null, player.getUserCount(), null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, -129, 31, null);
                    break;
                }
                player2 = (Player) fsfVar2.a;
                if (player2 != null) {
                }
                break;
            case 3:
                i2 = this.E;
                zzcVar = (zzc) this.A;
                ple pleVar7 = (ple) this.y;
                fsf fsfVar7 = this.x;
                zu4 zu4Var19 = this.u;
                zu4 zu4Var20 = this.t;
                zu4 zu4Var21 = this.s;
                zu4 zu4Var22 = this.r;
                y6a.M(obj);
                zu4Var8 = zu4Var22;
                zu4Var9 = zu4Var21;
                zu4Var6 = zu4Var20;
                zu4Var7 = zu4Var19;
                fsfVar3 = fsfVar7;
                pleVar3 = pleVar7;
                c = obj;
                zzcVar.a(c);
                pleVar2 = pleVar3;
                fsfVar2 = fsfVar3;
                i = i2;
                zu4Var5 = zu4Var9;
                zu4Var = zu4Var8;
                Player player522 = (Player) fsfVar2.a;
                pleVar2.l = player522;
                wve wveVar22 = pleVar2.e;
                this.N = ku3Var;
                this.r = zu4Var;
                this.s = zu4Var5;
                this.t = zu4Var6;
                this.u = zu4Var7;
                this.v = null;
                this.w = null;
                this.x = fsfVar2;
                this.y = pleVar2;
                this.z = null;
                this.A = null;
                this.E = i;
                this.M = 4;
                aoe aoeVar22 = wveVar22.a;
                k6g k6gVar22 = aoeVar22.a;
                xne xneVar22 = new xne(aoeVar22, player522, 1);
                i3 = 0;
                U = gz8.U(this, k6gVar22, false, true, xneVar22);
                if (U != lu3Var) {
                }
                if (U != lu3Var) {
                }
                return lu3Var;
            case 4:
                i4 = this.E;
                pleVar2 = (ple) this.y;
                fsf fsfVar8 = this.x;
                zu4Var11 = this.u;
                zu4 zu4Var23 = this.t;
                zu4Var10 = this.s;
                zu4Var12 = this.r;
                y6a.M(obj);
                zu4Var6 = zu4Var23;
                fsfVar2 = fsfVar8;
                i3 = 0;
                this.N = ku3Var;
                r14 = 0;
                this.r = null;
                this.s = zu4Var10;
                this.t = zu4Var6;
                this.u = zu4Var11;
                this.v = null;
                this.w = null;
                this.x = fsfVar2;
                this.y = pleVar2;
                this.z = null;
                this.E = i4;
                this.M = 5;
                T2 = zu4Var12.T(this);
                break;
            case 5:
                i4 = this.E;
                pleVar2 = (ple) this.y;
                fsf fsfVar9 = this.x;
                zu4Var11 = this.u;
                zu4 zu4Var24 = this.t;
                zu4Var10 = this.s;
                y6a.M(obj);
                T2 = obj;
                zu4Var6 = zu4Var24;
                r14 = 0;
                fsfVar2 = fsfVar9;
                i3 = 0;
                x2g x2gVar2 = (x2g) T2;
                this.N = ku3Var;
                this.r = r14;
                this.s = r14;
                this.t = zu4Var6;
                this.u = zu4Var11;
                this.v = r14;
                this.w = r14;
                this.x = fsfVar2;
                this.y = pleVar2;
                this.z = r14;
                this.A = x2gVar2;
                this.E = i4;
                this.M = 6;
                T3 = zu4Var10.T(this);
                if (T3 != lu3Var) {
                    i5 = i4;
                    pleVar4 = pleVar2;
                    x2gVar = x2gVar2;
                    zu4Var13 = zu4Var11;
                    fsfVar4 = fsfVar2;
                    playerCareerStatisticsResponse = (PlayerCareerStatisticsResponse) T3;
                    statisticsSeasonsResponse = (StatisticsSeasonsResponse) yaa.x(x2gVar);
                    Set set = jwe.a;
                    team = ((Player) fsfVar4.a).getTeam();
                    if (team != null || (sport = team.getSport()) == null || (str = sport.getSlug()) == null) {
                        str = "";
                    }
                    if (jwe.a.contains(str)) {
                        if (Intrinsics.c((statisticsSeasonsResponse == null || (typesMap2 = statisticsSeasonsResponse.getTypesMap()) == null) ? null : Boolean.valueOf(!typesMap2.isEmpty()), Boolean.TRUE)) {
                            i6 = 1;
                            valueOf = (playerCareerStatisticsResponse != null || (typesMap = playerCareerStatisticsResponse.getTypesMap()) == null) ? null : Boolean.valueOf(!typesMap.isEmpty());
                            bool = Boolean.TRUE;
                            if (Intrinsics.c(valueOf, bool)) {
                                String sportSlug2 = ((Player) fsfVar4.a).getSportSlug();
                                if (Intrinsics.c(sportSlug2 != null ? Boolean.valueOf(wyh.m.contains(sportSlug2)) : null, bool)) {
                                    i7 = 1;
                                    Player player7 = (Player) fsfVar4.a;
                                    player7.getClass();
                                    sportSlug = player7.getSportSlug();
                                    if (sportSlug == null) {
                                        switch (sportSlug.hashCode()) {
                                            case -2002238939:
                                                pleVar5 = pleVar6;
                                                break;
                                            case -1721090992:
                                                pleVar5 = pleVar6;
                                                break;
                                            case -1160328212:
                                                pleVar5 = pleVar6;
                                                break;
                                            case -83759494:
                                                pleVar5 = pleVar6;
                                                break;
                                            case 1767150:
                                                pleVar5 = pleVar6;
                                                break;
                                            case 108869083:
                                                pleVar5 = pleVar6;
                                                break;
                                            case 394668909:
                                                pleVar5 = pleVar6;
                                                break;
                                            case 727149765:
                                                pleVar5 = pleVar6;
                                                break;
                                            case 932645060:
                                                pleVar5 = pleVar6;
                                                break;
                                            case 1032299505:
                                                pleVar5 = pleVar6;
                                                break;
                                            default:
                                                pleVar5 = pleVar6;
                                                z4 = false;
                                                break;
                                        }
                                        bool2 = Boolean.valueOf(z4);
                                    } else {
                                        pleVar5 = pleVar6;
                                        bool2 = null;
                                    }
                                    c2 = Intrinsics.c(bool2, bool);
                                    pleVar4.v = x2gVar instanceof v2g;
                                    yzc yzcVar3 = pleVar4.p;
                                    player3 = (Player) fsfVar4.a;
                                    if (zu4Var6 == null) {
                                        this.N = ku3Var;
                                        this.r = null;
                                        this.s = null;
                                        this.t = null;
                                        this.u = zu4Var13;
                                        this.v = null;
                                        this.w = null;
                                        this.x = null;
                                        this.y = null;
                                        this.z = yzcVar3;
                                        this.A = null;
                                        this.B = playerCareerStatisticsResponse;
                                        this.C = statisticsSeasonsResponse;
                                        this.D = player3;
                                        this.E = i5;
                                        this.F = i7;
                                        this.J = c2;
                                        this.G = i6;
                                        this.K = c2;
                                        this.H = i7;
                                        this.I = i6;
                                        this.M = 7;
                                        T4 = zu4Var6.T(this);
                                        if (T4 != lu3Var) {
                                            z3 = c2;
                                            i8 = i7;
                                            i10 = i6;
                                            yzcVar2 = yzcVar3;
                                            i9 = i10;
                                            Boolean bool4 = (Boolean) T4;
                                            z2 = c2;
                                            c2 = z3;
                                            yzcVar = yzcVar2;
                                            i6 = i10;
                                            statisticsSeasonsResponse2 = statisticsSeasonsResponse;
                                            bool3 = bool4;
                                            zu4 zu4Var25 = zu4Var13;
                                            playerCareerStatisticsResponse2 = playerCareerStatisticsResponse;
                                            zu4Var14 = zu4Var25;
                                            boolean c3 = Intrinsics.c(bool3, Boolean.TRUE);
                                            this.N = ku3Var;
                                            this.r = null;
                                            this.s = null;
                                            this.t = null;
                                            this.u = null;
                                            this.v = null;
                                            this.w = null;
                                            this.x = null;
                                            this.y = null;
                                            this.z = yzcVar;
                                            this.A = null;
                                            this.B = playerCareerStatisticsResponse2;
                                            this.C = statisticsSeasonsResponse2;
                                            this.D = player3;
                                            this.E = i5;
                                            this.F = i8;
                                            this.J = c2;
                                            this.G = i6;
                                            this.K = z2;
                                            this.H = i7;
                                            this.I = i9;
                                            this.L = c3;
                                            this.M = 8;
                                            T5 = zu4Var14.T(this);
                                            if (T5 == lu3Var) {
                                                return lu3Var;
                                            }
                                            z5 = c3;
                                            i11 = i9;
                                            i12 = i7;
                                            player4 = player3;
                                            yzcVar.j(new PlayerHeadFlags(player4, statisticsSeasonsResponse2, playerCareerStatisticsResponse2, i11 == 0, i12 == 0, z2, z5, ((Boolean) T5).booleanValue()));
                                            pleVar = pleVar5;
                                            pleVar.u = true;
                                            return Unit.a;
                                        }
                                    } else {
                                        zu4 zu4Var26 = zu4Var13;
                                        playerCareerStatisticsResponse2 = playerCareerStatisticsResponse;
                                        zu4Var14 = zu4Var26;
                                        z2 = c2;
                                        yzcVar = yzcVar3;
                                        i8 = i7;
                                        i9 = i6;
                                        statisticsSeasonsResponse2 = statisticsSeasonsResponse;
                                        bool3 = null;
                                        boolean c32 = Intrinsics.c(bool3, Boolean.TRUE);
                                        this.N = ku3Var;
                                        this.r = null;
                                        this.s = null;
                                        this.t = null;
                                        this.u = null;
                                        this.v = null;
                                        this.w = null;
                                        this.x = null;
                                        this.y = null;
                                        this.z = yzcVar;
                                        this.A = null;
                                        this.B = playerCareerStatisticsResponse2;
                                        this.C = statisticsSeasonsResponse2;
                                        this.D = player3;
                                        this.E = i5;
                                        this.F = i8;
                                        this.J = c2;
                                        this.G = i6;
                                        this.K = z2;
                                        this.H = i7;
                                        this.I = i9;
                                        this.L = c32;
                                        this.M = 8;
                                        T5 = zu4Var14.T(this);
                                        if (T5 == lu3Var) {
                                        }
                                    }
                                }
                            }
                            i7 = 0;
                            Player player72 = (Player) fsfVar4.a;
                            player72.getClass();
                            sportSlug = player72.getSportSlug();
                            if (sportSlug == null) {
                            }
                            c2 = Intrinsics.c(bool2, bool);
                            pleVar4.v = x2gVar instanceof v2g;
                            yzc yzcVar32 = pleVar4.p;
                            player3 = (Player) fsfVar4.a;
                            if (zu4Var6 == null) {
                            }
                        }
                    }
                    i6 = i3;
                    if (playerCareerStatisticsResponse != null) {
                    }
                    bool = Boolean.TRUE;
                    if (Intrinsics.c(valueOf, bool)) {
                    }
                    i7 = 0;
                    Player player722 = (Player) fsfVar4.a;
                    player722.getClass();
                    sportSlug = player722.getSportSlug();
                    if (sportSlug == null) {
                    }
                    c2 = Intrinsics.c(bool2, bool);
                    pleVar4.v = x2gVar instanceof v2g;
                    yzc yzcVar322 = pleVar4.p;
                    player3 = (Player) fsfVar4.a;
                    if (zu4Var6 == null) {
                    }
                }
                return lu3Var;
            case 6:
                int i20 = this.E;
                x2gVar = (x2g) this.A;
                ple pleVar8 = (ple) this.y;
                fsfVar4 = this.x;
                zu4 zu4Var27 = this.u;
                zu4 zu4Var28 = this.t;
                y6a.M(obj);
                i5 = i20;
                pleVar4 = pleVar8;
                zu4Var13 = zu4Var27;
                zu4Var6 = zu4Var28;
                i3 = 0;
                T3 = obj;
                playerCareerStatisticsResponse = (PlayerCareerStatisticsResponse) T3;
                statisticsSeasonsResponse = (StatisticsSeasonsResponse) yaa.x(x2gVar);
                Set set2 = jwe.a;
                team = ((Player) fsfVar4.a).getTeam();
                if (team != null) {
                    break;
                }
                str = "";
                if (jwe.a.contains(str)) {
                }
                i6 = i3;
                if (playerCareerStatisticsResponse != null) {
                }
                bool = Boolean.TRUE;
                if (Intrinsics.c(valueOf, bool)) {
                }
                i7 = 0;
                Player player7222 = (Player) fsfVar4.a;
                player7222.getClass();
                sportSlug = player7222.getSportSlug();
                if (sportSlug == null) {
                }
                c2 = Intrinsics.c(bool2, bool);
                pleVar4.v = x2gVar instanceof v2g;
                yzc yzcVar3222 = pleVar4.p;
                player3 = (Player) fsfVar4.a;
                if (zu4Var6 == null) {
                }
                break;
            case 7:
                i9 = this.I;
                int i21 = this.H;
                boolean z6 = this.K;
                i10 = this.G;
                z3 = this.J;
                i8 = this.F;
                i5 = this.E;
                player3 = this.D;
                statisticsSeasonsResponse = this.C;
                playerCareerStatisticsResponse = this.B;
                yzcVar2 = this.z;
                zu4Var13 = this.u;
                y6a.M(obj);
                pleVar5 = pleVar6;
                c2 = z6;
                i7 = i21;
                T4 = obj;
                Boolean bool42 = (Boolean) T4;
                z2 = c2;
                c2 = z3;
                yzcVar = yzcVar2;
                i6 = i10;
                statisticsSeasonsResponse2 = statisticsSeasonsResponse;
                bool3 = bool42;
                zu4 zu4Var252 = zu4Var13;
                playerCareerStatisticsResponse2 = playerCareerStatisticsResponse;
                zu4Var14 = zu4Var252;
                boolean c322 = Intrinsics.c(bool3, Boolean.TRUE);
                this.N = ku3Var;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = null;
                this.w = null;
                this.x = null;
                this.y = null;
                this.z = yzcVar;
                this.A = null;
                this.B = playerCareerStatisticsResponse2;
                this.C = statisticsSeasonsResponse2;
                this.D = player3;
                this.E = i5;
                this.F = i8;
                this.J = c2;
                this.G = i6;
                this.K = z2;
                this.H = i7;
                this.I = i9;
                this.L = c322;
                this.M = 8;
                T5 = zu4Var14.T(this);
                if (T5 == lu3Var) {
                }
                break;
            case 8:
                boolean z7 = this.L;
                i11 = this.I;
                i12 = this.H;
                z2 = this.K;
                Player player8 = this.D;
                statisticsSeasonsResponse2 = this.C;
                playerCareerStatisticsResponse2 = this.B;
                yzcVar = this.z;
                y6a.M(obj);
                T5 = obj;
                pleVar5 = pleVar6;
                z5 = z7;
                player4 = player8;
                yzcVar.j(new PlayerHeadFlags(player4, statisticsSeasonsResponse2, playerCareerStatisticsResponse2, i11 == 0, i12 == 0, z2, z5, ((Boolean) T5).booleanValue()));
                pleVar = pleVar5;
                pleVar.u = true;
                return Unit.a;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
