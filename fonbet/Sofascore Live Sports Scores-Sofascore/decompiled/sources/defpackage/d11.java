package defpackage;

import android.os.Build;
import android.util.Log;
import com.moloco.sdk.internal.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.f0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.fantasy.FantasyLeagueParticipant;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.playerOfTheSeason.POTSMostAwardsNetworkPlayer;
import com.unity3d.services.UnityAdsConstants;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d11 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d11(int i, rq3 rq3Var, int i2) {
        super(i, rq3Var);
        this.r = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                d11 d11Var = new d11(2, rq3Var, 0);
                d11Var.s = obj;
                return d11Var;
            case 1:
                d11 d11Var2 = new d11(2, rq3Var, 1);
                d11Var2.s = obj;
                return d11Var2;
            case 2:
                d11 d11Var3 = new d11(2, rq3Var, 2);
                d11Var3.s = obj;
                return d11Var3;
            case 3:
                d11 d11Var4 = new d11(2, rq3Var, 3);
                d11Var4.s = obj;
                return d11Var4;
            case 4:
                d11 d11Var5 = new d11(2, rq3Var, 4);
                d11Var5.s = obj;
                return d11Var5;
            case 5:
                d11 d11Var6 = new d11(2, rq3Var, 5);
                d11Var6.s = obj;
                return d11Var6;
            case 6:
                d11 d11Var7 = new d11(2, rq3Var, 6);
                d11Var7.s = obj;
                return d11Var7;
            case 7:
                d11 d11Var8 = new d11(2, rq3Var, 7);
                d11Var8.s = obj;
                return d11Var8;
            case 8:
                d11 d11Var9 = new d11(2, rq3Var, 8);
                d11Var9.s = obj;
                return d11Var9;
            case 9:
                d11 d11Var10 = new d11(2, rq3Var, 9);
                d11Var10.s = obj;
                return d11Var10;
            case 10:
                d11 d11Var11 = new d11(2, rq3Var, 10);
                d11Var11.s = obj;
                return d11Var11;
            case 11:
                d11 d11Var12 = new d11(2, rq3Var, 11);
                d11Var12.s = obj;
                return d11Var12;
            case 12:
                d11 d11Var13 = new d11(2, rq3Var, 12);
                d11Var13.s = obj;
                return d11Var13;
            case 13:
                d11 d11Var14 = new d11(2, rq3Var, 13);
                d11Var14.s = obj;
                return d11Var14;
            case 14:
                d11 d11Var15 = new d11(2, rq3Var, 14);
                d11Var15.s = obj;
                return d11Var15;
            case 15:
                d11 d11Var16 = new d11(2, rq3Var, 15);
                d11Var16.s = obj;
                return d11Var16;
            case 16:
                d11 d11Var17 = new d11(2, rq3Var, 16);
                d11Var17.s = obj;
                return d11Var17;
            case 17:
                d11 d11Var18 = new d11(2, rq3Var, 17);
                d11Var18.s = obj;
                return d11Var18;
            case 18:
                d11 d11Var19 = new d11(2, rq3Var, 18);
                d11Var19.s = obj;
                return d11Var19;
            case 19:
                d11 d11Var20 = new d11(2, rq3Var, 19);
                d11Var20.s = obj;
                return d11Var20;
            case 20:
                d11 d11Var21 = new d11(2, rq3Var, 20);
                d11Var21.s = obj;
                return d11Var21;
            case 21:
                d11 d11Var22 = new d11(2, rq3Var, 21);
                d11Var22.s = obj;
                return d11Var22;
            case 22:
                d11 d11Var23 = new d11(2, rq3Var, 22);
                d11Var23.s = obj;
                return d11Var23;
            case 23:
                d11 d11Var24 = new d11(2, rq3Var, 23);
                d11Var24.s = obj;
                return d11Var24;
            case 24:
                d11 d11Var25 = new d11(2, rq3Var, 24);
                d11Var25.s = obj;
                return d11Var25;
            case 25:
                d11 d11Var26 = new d11(2, rq3Var, 25);
                d11Var26.s = obj;
                return d11Var26;
            case 26:
                d11 d11Var27 = new d11(2, rq3Var, 26);
                d11Var27.s = obj;
                return d11Var27;
            case 27:
                d11 d11Var28 = new d11(2, rq3Var, 27);
                d11Var28.s = obj;
                return d11Var28;
            case 28:
                d11 d11Var29 = new d11(2, rq3Var, 28);
                d11Var29.s = obj;
                return d11Var29;
            default:
                d11 d11Var30 = new d11(2, rq3Var, 29);
                d11Var30.s = obj;
                return d11Var30;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((d11) create((Boolean) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((d11) create((e6b) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((d11) create((Boolean) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((d11) create((Boolean) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 4:
                ((d11) create((aq4) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                return null;
            case 5:
                return ((d11) create((IndexedValue) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((d11) create((w83) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((d11) create((adi) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((d11) create((FantasyLeagueParticipant) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((d11) create(obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((d11) create((POTSMostAwardsNetworkPlayer) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((d11) create((e4e) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((d11) create((iqf) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((d11) create((p0d) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((d11) create((p0d) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((d11) create((String) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((d11) create((cg0) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((d11) create((veh) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((d11) create((UserAccount) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((d11) create((h) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((d11) create((g) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((d11) create((g) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((d11) create((d) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((d11) create((Pair) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((d11) create((Pair) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((d11) create((f0) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((d11) create((Pair) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((d11) create((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.d) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 28:
                return ((d11) create((x) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((d11) create((g) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar = null;
        switch (this.r) {
            case 0:
                Boolean bool = (Boolean) this.s;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                return Boolean.valueOf(bool == null);
            case 1:
                e6b e6bVar = (e6b) this.s;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                return Boolean.valueOf(e6bVar.a(e6b.e));
            case 2:
                Boolean bool2 = (Boolean) this.s;
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                return Boolean.valueOf(!Intrinsics.c(bool2, Boolean.FALSE));
            case 3:
                Boolean bool3 = (Boolean) this.s;
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                return Boolean.valueOf(!Intrinsics.c(bool3, Boolean.TRUE));
            case 4:
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                if (((aq4) this.s).b().c().getAttributes().d(az1.b) != null) {
                    pvd.j();
                }
                return null;
            case 5:
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                return Boolean.valueOf(((IndexedValue) this.s) != null);
            case 6:
                w83 w83Var = (w83) this.s;
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                return Boolean.valueOf(!(w83Var instanceof v83));
            case 7:
                lu3 lu3Var8 = lu3.a;
                y6a.M(obj);
                return Boolean.valueOf(!(((adi) this.s) instanceof e38));
            case 8:
                FantasyLeagueParticipant fantasyLeagueParticipant = (FantasyLeagueParticipant) this.s;
                lu3 lu3Var9 = lu3.a;
                y6a.M(obj);
                return new f57(fantasyLeagueParticipant.getUserId(), fantasyLeagueParticipant.getTeamName(), fantasyLeagueParticipant.getUserNickname(), fantasyLeagueParticipant.getUserImageUrl());
            case 9:
                Object obj2 = this.s;
                lu3 lu3Var10 = lu3.a;
                y6a.M(obj);
                return Boolean.valueOf((obj2 instanceof Team) || (obj2 instanceof Player) || (obj2 instanceof UniqueTournament) || (obj2 instanceof ksd));
            case 10:
                POTSMostAwardsNetworkPlayer pOTSMostAwardsNetworkPlayer = (POTSMostAwardsNetworkPlayer) this.s;
                lu3 lu3Var11 = lu3.a;
                y6a.M(obj);
                pOTSMostAwardsNetworkPlayer.getClass();
                return new d2e(pOTSMostAwardsNetworkPlayer.getPlayer().getId(), tba.t(pOTSMostAwardsNetworkPlayer.getPlayer()), tba.C(pOTSMostAwardsNetworkPlayer.getPlayer()), pOTSMostAwardsNetworkPlayer.getTotalAwards());
            case 11:
                lu3 lu3Var12 = lu3.a;
                y6a.M(obj);
                e4e e4eVar = (e4e) this.s;
                if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                    r3 = true;
                }
                if (r3) {
                    Objects.toString(e4eVar);
                }
                return Unit.a;
            case 12:
                lu3 lu3Var13 = lu3.a;
                y6a.M(obj);
                return Boolean.valueOf(((iqf) this.s) == iqf.a);
            case 13:
                p0d p0dVar = (p0d) this.s;
                lu3 lu3Var14 = lu3.a;
                y6a.M(obj);
                p0d g = p0dVar.g();
                n6l n6lVar = n6l.a;
                g.e(n6l.e, Boolean.TRUE);
                return g;
            case 14:
                p0d p0dVar2 = (p0d) this.s;
                lu3 lu3Var15 = lu3.a;
                y6a.M(obj);
                p0d g2 = p0dVar2.g();
                n6l n6lVar2 = n6l.a;
                g2.e(n6l.e, Boolean.FALSE);
                return g2;
            case 15:
                lu3 lu3Var16 = lu3.a;
                y6a.M(obj);
                return Unit.a;
            case 16:
                cg0 cg0Var = (cg0) this.s;
                lu3 lu3Var17 = lu3.a;
                y6a.M(obj);
                return Boolean.valueOf(cg0Var != cg0.a);
            case 17:
                veh vehVar = (veh) this.s;
                lu3 lu3Var18 = lu3.a;
                y6a.M(obj);
                return Boolean.valueOf(vehVar != veh.a);
            case 18:
                UserAccount userAccount = (UserAccount) this.s;
                lu3 lu3Var19 = lu3.a;
                y6a.M(obj);
                return UserAccount.copy$default(dfk.a, null, null, null, null, null, false, false, null, null, false, userAccount.getDevMod(), false, false, 0L, null, null, null, false, 0, 0, 0, 0L, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, null, 0L, null, null, null, null, null, -1025, 3, null);
            case 19:
                lu3 lu3Var20 = lu3.a;
                y6a.M(obj);
                return Boolean.valueOf(((h) this.s) != null);
            case 20:
                lu3 lu3Var21 = lu3.a;
                y6a.M(obj);
                return Boolean.valueOf(((g) this.s) != null);
            case 21:
                lu3 lu3Var22 = lu3.a;
                y6a.M(obj);
                return Boolean.valueOf(((g) this.s) != null);
            case 22:
                lu3 lu3Var23 = lu3.a;
                y6a.M(obj);
                return Boolean.valueOf(((d) this.s) != null);
            case 23:
                lu3 lu3Var24 = lu3.a;
                y6a.M(obj);
                Pair pair = (Pair) this.s;
                return Boolean.valueOf(((Boolean) pair.a).booleanValue() || ((d) pair.b) != null);
            case 24:
                lu3 lu3Var25 = lu3.a;
                y6a.M(obj);
                Pair pair2 = (Pair) this.s;
                return Boolean.valueOf(((Boolean) pair2.a).booleanValue() || ((g) pair2.b) != null);
            case 25:
                lu3 lu3Var26 = lu3.a;
                y6a.M(obj);
                return Boolean.valueOf(((f0) this.s) != null);
            case 26:
                lu3 lu3Var27 = lu3.a;
                y6a.M(obj);
                Pair pair3 = (Pair) this.s;
                return Boolean.valueOf(((Boolean) pair3.a).booleanValue() || ((f0) pair3.b) != null);
            case 27:
                lu3 lu3Var28 = lu3.a;
                y6a.M(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.d) this.s;
                aeh aehVar = VastActivity.e;
                return Boolean.valueOf((dVar instanceof c) || Intrinsics.c(dVar, b.d));
            case 28:
                lu3 lu3Var29 = lu3.a;
                y6a.M(obj);
                x xVar = (x) this.s;
                if (xVar instanceof t) {
                    hVar = ((t) xVar).a;
                } else if (xVar instanceof u) {
                    hVar = ((u) xVar).a;
                }
                if (hVar == null) {
                    return Unit.a;
                }
                hVar.reset();
                return Unit.a;
            default:
                lu3 lu3Var30 = lu3.a;
                y6a.M(obj);
                return Boolean.valueOf(((g) this.s) != null);
        }
    }
}
