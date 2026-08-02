package com.sofascore.results.player.details;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerHeadFlags;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.player.details.view.PlayerCompareView;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ao2;
import defpackage.doe;
import defpackage.dsi;
import defpackage.duf;
import defpackage.eoe;
import defpackage.fl8;
import defpackage.fuf;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.ioe;
import defpackage.iz2;
import defpackage.joa;
import defpackage.joe;
import defpackage.krk;
import defpackage.loe;
import defpackage.moe;
import defpackage.n9e;
import defpackage.oo8;
import defpackage.ooe;
import defpackage.otk;
import defpackage.p1;
import defpackage.ple;
import defpackage.qoe;
import defpackage.roe;
import defpackage.ujg;
import defpackage.un0;
import defpackage.v9b;
import defpackage.vce;
import defpackage.wya;
import defpackage.x2e;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z45;
import defpackage.z8e;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/player/details/PlayerDetailsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlayerDetailsFragment extends Hilt_PlayerDetailsFragment<oo8> {
    public final joa A;
    public final joa B;
    public final joa C;
    public final joa D;
    public final joa E;
    public final joa F;
    public final joa G;
    public final joa H;
    public final joa I;
    public final joa J;
    public final joa K;
    public final joa L;
    public boolean M;
    public final joa r;
    public final joa s;
    public final otk t;
    public final otk u;
    public final otk v;
    public final joa w;
    public final joa x;
    public final joa y;
    public final joa z;

    public PlayerDetailsFragment() {
        eoe eoeVar = new eoe(this, 19);
        ysa ysaVar = ysa.c;
        this.r = ypa.a(ysaVar, eoeVar);
        int i = 4;
        this.s = ypa.a(ysaVar, new eoe(this, i));
        int i2 = 6;
        int i3 = 1;
        joa a = ypa.a(ysaVar, new vce(new joe(this, i2), i3));
        fuf fufVar = duf.a;
        int i4 = 3;
        this.t = new otk(fufVar.getOrCreateKotlinClass(roe.class), new x2e(a, 3), new wya(26, this, a), new x2e(a, 4));
        int i5 = 0;
        int i6 = 2;
        this.u = new otk(fufVar.getOrCreateKotlinClass(ple.class), new joe(this, i5), new joe(this, i6), new joe(this, i3));
        int i7 = 5;
        this.v = new otk(fufVar.getOrCreateKotlinClass(dsi.class), new joe(this, i4), new joe(this, i7), new joe(this, i));
        this.w = ypa.a(ysaVar, new eoe(this, 9));
        this.x = ypa.a(ysaVar, new eoe(this, 10));
        this.y = ypa.a(ysaVar, new eoe(this, 11));
        this.z = ypa.a(ysaVar, new eoe(this, 12));
        this.A = ypa.a(ysaVar, new eoe(this, 13));
        this.B = ypa.a(ysaVar, new eoe(this, 14));
        this.C = ypa.a(ysaVar, new eoe(this, 15));
        this.D = ypa.a(ysaVar, new eoe(this, 16));
        this.E = n9e.M(new eoe(this, 20), new eoe(this, 21));
        this.F = ypa.a(ysaVar, new eoe(this, 22));
        this.G = n9e.M(new eoe(this, 23), new eoe(this, 24));
        this.H = n9e.M(new eoe(this, 25), new eoe(this, i5));
        this.I = ypa.a(ysaVar, new eoe(this, i3));
        this.J = n9e.M(new eoe(this, i6), new eoe(this, i4));
        this.K = n9e.M(new eoe(this, i7), new eoe(this, i2));
        this.L = n9e.M(new eoe(this, 7), new eoe(this, 8));
        this.M = true;
    }

    public static void G(View view) {
        view.setEnabled(false);
        view.setActivated(true);
        view.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final ooe C() {
        return (ooe) this.x.getValue();
    }

    public final loe D() {
        return (loe) this.z.getValue();
    }

    public final Player E() {
        return (Player) this.r.getValue();
    }

    public final roe F() {
        return (roe) this.t.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return oo8.b(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "DetailsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((oo8) krkVar).e;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 4);
        l();
        roe F = F();
        PlayerHeadFlags playerHeadFlags = (PlayerHeadFlags) ((ple) this.u.getValue()).q.d();
        F.o = playerHeadFlags != null ? playerHeadFlags.getPlayerStatisticsSeasons() : null;
        moe moeVar = (moe) this.A.getValue();
        Class<roe> cls = roe.class;
        v9b v9bVar = new v9b(1, F(), cls, "getPlayerAttributeOverview", "getPlayerAttributeOverview(I)V", 0, 28);
        int i = 0;
        p1 p1Var = new p1(2, F(), cls, "getPlayers", "getPlayers(Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;)V", i, 12);
        fl8 fl8Var = new fl8(0, F(), cls, "cancelPlayersJob", "cancelPlayersJob()V", i, 13);
        moeVar.getClass();
        ((PlayerCompareView) moeVar.d.c).setCallback(new ujg(16, moeVar, fl8Var, p1Var, v9bVar, false));
        F().j.e(getViewLifecycleOwner(), new ioe(0, new doe(this, 0)));
        F().l.e(getViewLifecycleOwner(), new ioe(0, new doe(this, 1)));
        F().n.e(getViewLifecycleOwner(), new ioe(0, new doe(this, 2)));
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((oo8) krkVar2).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        recyclerView.setAdapter(C());
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), ao2.s(4, requireContext2), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        String str;
        Sport sport;
        roe F = F();
        int id = E().getId();
        Team team = E().getTeam();
        if (team == null || (sport = team.getSport()) == null || (str = sport.getSlug()) == null) {
            str = "";
        }
        String str2 = str;
        iz2 z = un0.z(F);
        hs4 hs4Var = z45.a;
        xw3.L(z, hq4.c, null, new qoe(str2, F, id, null, 0), 2);
    }
}
