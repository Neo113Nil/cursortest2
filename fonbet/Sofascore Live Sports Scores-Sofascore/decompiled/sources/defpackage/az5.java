package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.BasketballPlayerEventStatistics;
import com.sofascore.model.newNetwork.AttributeOverviewResponse;
import com.sofascore.model.newNetwork.FeaturedPlayer;
import com.sofascore.model.newNetwork.TeamFeaturedPlayersResponse;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class az5 extends hoi implements Function2 {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ dz5 C;
    public final /* synthetic */ Event D;
    public Event r;
    public dz5 s;
    public Object t;
    public FeaturedPlayer u;
    public Object v;
    public av4 w;
    public AttributeOverviewResponse x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az5(rq3 rq3Var, dz5 dz5Var, Event event) {
        super(2, rq3Var);
        this.C = dz5Var;
        this.D = event;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        az5 az5Var = new az5(rq3Var, this.C, this.D);
        az5Var.B = obj;
        return az5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((az5) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0175, code lost:
    
        if (r4 == r2) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015e  */
    /* JADX WARN: Type inference failed for: r9v19, types: [zu4] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        dz5 dz5Var;
        Event event;
        int i;
        av4 t;
        int i2;
        Object w;
        Event event2;
        av4 av4Var;
        int i3;
        ky5 ky5Var;
        ku3 ku3Var;
        int i4;
        int i5;
        Event event3;
        FeaturedPlayer featuredPlayer;
        Object T;
        Map<Integer, FeaturedPlayer> featuredPlayers;
        FeaturedPlayer featuredPlayer2;
        String sportSlug;
        BasketballPlayerEventStatistics basketballStatistics;
        BasketballPlayerEventStatistics basketballStatistics2;
        Object w2;
        av4 av4Var2;
        int i6;
        FeaturedPlayer featuredPlayer3;
        Map<Integer, FeaturedPlayer> featuredPlayers2;
        Object T2;
        FeaturedPlayer featuredPlayer4;
        AttributeOverviewResponse attributeOverviewResponse;
        AttributeOverviewResponse attributeOverviewResponse2;
        ku3 ku3Var2 = (ku3) this.B;
        lu3 lu3Var = lu3.a;
        int i7 = this.A;
        if (i7 == 0) {
            y6a.M(obj);
            dz5Var = this.C;
            iy5 iy5Var = (iy5) dz5Var.w.d();
            if (iy5Var != null && (ky5Var = iy5Var.k) != null) {
                return ky5Var;
            }
            Set a0 = ph0.a0(new String[]{Sports.FOOTBALL, Sports.BASKETBALL});
            event = this.D;
            i = (a0.contains(event.getSportSlug()) && ok3.E(event)) ? 1 : 0;
            Integer num = new Integer(Event.getHomeTeam$default(event, null, 1, null).getId());
            if (i == 0) {
                num = null;
            }
            av4 t2 = num != null ? xw3.t(ku3Var2, null, new vy5(dz5Var, num.intValue(), null, 9), 3) : null;
            Integer num2 = new Integer(Event.getAwayTeam$default(event, null, 1, null).getId());
            if (i == 0) {
                num2 = null;
            }
            t = num2 != null ? xw3.t(ku3Var2, null, new vy5(dz5Var, num2.intValue(), null, 8), 3) : null;
            if (t2 != null) {
                this.B = null;
                this.r = event;
                this.s = dz5Var;
                this.t = ku3Var2;
                this.u = null;
                this.v = t;
                this.y = 0;
                this.z = i;
                this.A = 1;
                w = t2.w(this);
                if (w != lu3Var) {
                    event2 = event;
                    av4Var = t;
                    i3 = 0;
                }
                return lu3Var;
            }
            i2 = 0;
            ku3Var = ku3Var2;
            i4 = i;
            i5 = i2;
            event3 = event;
            featuredPlayer = null;
            if (t != null) {
                this.B = null;
                this.r = event3;
                this.s = dz5Var;
                this.t = ku3Var;
                this.u = null;
                this.v = featuredPlayer;
                this.y = i5;
                this.z = i4;
                this.A = 2;
                T = t.T(this);
            }
            featuredPlayer2 = null;
            sportSlug = event3.getSportSlug();
            if (Intrinsics.c(sportSlug, Sports.FOOTBALL)) {
            }
            return null;
        }
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    attributeOverviewResponse = this.x;
                    featuredPlayer4 = this.u;
                    featuredPlayer3 = (FeaturedPlayer) this.t;
                    y6a.M(obj);
                    T2 = obj;
                    attributeOverviewResponse2 = (AttributeOverviewResponse) yaa.x((x2g) T2);
                    if (attributeOverviewResponse != null && attributeOverviewResponse2 != null) {
                        featuredPlayer3.setAttributeOverview(attributeOverviewResponse.getCurrentAttributes());
                        featuredPlayer4.setAttributeOverview(attributeOverviewResponse2.getCurrentAttributes());
                        return new ky5(featuredPlayer3, featuredPlayer4);
                    }
                    return null;
                }
                i4 = this.z;
                int i8 = this.y;
                av4 av4Var3 = this.w;
                FeaturedPlayer featuredPlayer5 = this.u;
                FeaturedPlayer featuredPlayer6 = (FeaturedPlayer) this.t;
                y6a.M(obj);
                i6 = i8;
                featuredPlayer3 = featuredPlayer6;
                av4Var2 = av4Var3;
                featuredPlayer2 = featuredPlayer5;
                w2 = obj;
                AttributeOverviewResponse attributeOverviewResponse3 = (AttributeOverviewResponse) yaa.x((x2g) w2);
                this.B = null;
                this.r = null;
                this.s = null;
                this.t = featuredPlayer3;
                this.u = featuredPlayer2;
                this.v = null;
                this.w = null;
                this.x = attributeOverviewResponse3;
                this.y = i6;
                this.z = i4;
                this.A = 4;
                T2 = av4Var2.T(this);
                if (T2 != lu3Var) {
                    featuredPlayer4 = featuredPlayer2;
                    attributeOverviewResponse = attributeOverviewResponse3;
                    attributeOverviewResponse2 = (AttributeOverviewResponse) yaa.x((x2g) T2);
                    if (attributeOverviewResponse != null) {
                        featuredPlayer3.setAttributeOverview(attributeOverviewResponse.getCurrentAttributes());
                        featuredPlayer4.setAttributeOverview(attributeOverviewResponse2.getCurrentAttributes());
                        return new ky5(featuredPlayer3, featuredPlayer4);
                    }
                    return null;
                }
                return lu3Var;
            }
            i4 = this.z;
            i5 = this.y;
            featuredPlayer = (FeaturedPlayer) this.v;
            ku3Var = (ku3) this.t;
            dz5Var = this.s;
            event3 = this.r;
            y6a.M(obj);
            T = obj;
            TeamFeaturedPlayersResponse teamFeaturedPlayersResponse = (TeamFeaturedPlayersResponse) T;
            if (teamFeaturedPlayersResponse != null && (featuredPlayers2 = teamFeaturedPlayersResponse.getFeaturedPlayers()) != null) {
                featuredPlayer2 = (FeaturedPlayer) me4.f(event3.getId(), featuredPlayers2);
                sportSlug = event3.getSportSlug();
                if (Intrinsics.c(sportSlug, Sports.FOOTBALL)) {
                    if (featuredPlayer != null && featuredPlayer2 != null) {
                        av4 t3 = xw3.t(ku3Var, null, new zy5(dz5Var, featuredPlayer, null, 1), 3);
                        av4 t4 = xw3.t(ku3Var, null, new zy5(dz5Var, featuredPlayer2, null, 0), 3);
                        this.B = null;
                        this.r = null;
                        this.s = null;
                        this.t = featuredPlayer;
                        this.u = featuredPlayer2;
                        this.v = null;
                        this.w = t4;
                        this.y = i5;
                        this.z = i4;
                        this.A = 3;
                        w2 = t3.w(this);
                        if (w2 != lu3Var) {
                            av4Var2 = t4;
                            i6 = i5;
                            featuredPlayer3 = featuredPlayer;
                            AttributeOverviewResponse attributeOverviewResponse32 = (AttributeOverviewResponse) yaa.x((x2g) w2);
                            this.B = null;
                            this.r = null;
                            this.s = null;
                            this.t = featuredPlayer3;
                            this.u = featuredPlayer2;
                            this.v = null;
                            this.w = null;
                            this.x = attributeOverviewResponse32;
                            this.y = i6;
                            this.z = i4;
                            this.A = 4;
                            T2 = av4Var2.T(this);
                            if (T2 != lu3Var) {
                            }
                        }
                        return lu3Var;
                    }
                } else if (Intrinsics.c(sportSlug, Sports.BASKETBALL)) {
                    Boolean winningTeam = (featuredPlayer == null || (basketballStatistics2 = featuredPlayer.getBasketballStatistics()) == null) ? null : basketballStatistics2.getWinningTeam();
                    Boolean winningTeam2 = (featuredPlayer2 == null || (basketballStatistics = featuredPlayer2.getBasketballStatistics()) == null) ? null : basketballStatistics.getWinningTeam();
                    Boolean bool = Boolean.TRUE;
                    if (Intrinsics.c(winningTeam2, bool) && !Intrinsics.c(winningTeam, bool)) {
                        featuredPlayer = null;
                    }
                    if (Intrinsics.c(winningTeam, bool) && !Intrinsics.c(winningTeam2, bool)) {
                        featuredPlayer2 = null;
                    }
                    if (featuredPlayer != null || featuredPlayer2 != null) {
                        if (featuredPlayer == null || featuredPlayer2 == null) {
                            return new ky5(featuredPlayer, featuredPlayer2);
                        }
                        FeaturedPlayer featuredPlayer7 = (FeaturedPlayer) CollectionsKt.firstOrNull(CollectionsKt.H0(b.j(featuredPlayer, featuredPlayer2), new cp(new cp(new cp(new y73(26), 7), 8), 9)));
                        if (!featuredPlayer.equals(featuredPlayer7)) {
                            featuredPlayer = null;
                        }
                        return new ky5(featuredPlayer, featuredPlayer2.equals(featuredPlayer7) ? featuredPlayer2 : null);
                    }
                }
                return null;
            }
            featuredPlayer2 = null;
            sportSlug = event3.getSportSlug();
            if (Intrinsics.c(sportSlug, Sports.FOOTBALL)) {
            }
            return null;
        }
        int i9 = this.z;
        int i10 = this.y;
        ?? r9 = (zu4) this.v;
        ku3 ku3Var3 = (ku3) this.t;
        dz5Var = this.s;
        Event event4 = this.r;
        y6a.M(obj);
        i3 = i10;
        i = i9;
        ku3Var2 = ku3Var3;
        event2 = event4;
        av4Var = r9;
        w = obj;
        TeamFeaturedPlayersResponse teamFeaturedPlayersResponse2 = (TeamFeaturedPlayersResponse) w;
        if (teamFeaturedPlayersResponse2 != null && (featuredPlayers = teamFeaturedPlayersResponse2.getFeaturedPlayers()) != null) {
            FeaturedPlayer featuredPlayer8 = (FeaturedPlayer) me4.f(event2.getId(), featuredPlayers);
            event3 = event2;
            ku3Var = ku3Var2;
            i4 = i;
            i5 = i3;
            t = av4Var;
            featuredPlayer = featuredPlayer8;
            if (t != null) {
            }
            featuredPlayer2 = null;
            sportSlug = event3.getSportSlug();
            if (Intrinsics.c(sportSlug, Sports.FOOTBALL)) {
            }
            return null;
        }
        i2 = i3;
        t = av4Var;
        event = event2;
        ku3Var = ku3Var2;
        i4 = i;
        i5 = i2;
        event3 = event;
        featuredPlayer = null;
        if (t != null) {
        }
        featuredPlayer2 = null;
        sportSlug = event3.getSportSlug();
        if (Intrinsics.c(sportSlug, Sports.FOOTBALL)) {
        }
        return null;
    }
}
