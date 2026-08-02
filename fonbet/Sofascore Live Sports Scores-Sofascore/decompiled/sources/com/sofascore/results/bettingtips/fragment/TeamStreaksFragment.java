package com.sofascore.results.bettingtips.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.mvvm.model.bettingtips.TeamStreak;
import com.sofascore.model.network.response.bettingtips.TeamStreaksResponse;
import com.sofascore.results.R;
import com.sofascore.results.bettingtips.fragment.TeamStreaksFragment;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.bte;
import defpackage.cce;
import defpackage.duf;
import defpackage.e1d;
import defpackage.eo8;
import defpackage.eoh;
import defpackage.fwi;
import defpackage.joa;
import defpackage.k13;
import defpackage.km5;
import defpackage.krk;
import defpackage.m2j;
import defpackage.o1i;
import defpackage.o2j;
import defpackage.otk;
import defpackage.p2j;
import defpackage.q2j;
import defpackage.q8i;
import defpackage.rq3;
import defpackage.s2j;
import defpackage.tc3;
import defpackage.un0;
import defpackage.uri;
import defpackage.xw3;
import defpackage.y2j;
import defpackage.ygi;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import defpackage.zu1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/bettingtips/fragment/TeamStreaksFragment;", "Lcom/sofascore/results/bettingtips/fragment/AbstractBettingTipsFragment;", "Lcom/sofascore/model/network/response/bettingtips/TeamStreaksResponse;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TeamStreaksFragment extends Hilt_TeamStreaksFragment<TeamStreaksResponse> {
    public final e1d A;
    public final otk v;
    public String w;
    public final joa x;
    public final joa y;
    public final e1d z;

    public TeamStreaksFragment() {
        o1i o1iVar = new o1i(this, 29);
        ysa ysaVar = ysa.c;
        final int i = 0;
        joa a = ypa.a(ysaVar, new s2j(o1iVar, 0));
        this.v = new otk(duf.a.getOrCreateKotlinClass(y2j.class), new fwi(a, 15), new bte(this, a, 28), new fwi(a, 16));
        this.x = ypa.a(ysaVar, new Function0(this) { // from class: r2j
            public final /* synthetic */ TeamStreaksFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TeamStreaksFragment teamStreaksFragment = this.b;
                switch (i2) {
                    case 0:
                        Context requireContext = teamStreaksFragment.requireContext();
                        requireContext.getClass();
                        return new p2j(requireContext);
                    default:
                        LayoutInflater layoutInflater = teamStreaksFragment.getLayoutInflater();
                        krk krkVar = teamStreaksFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.view_top_team_streaks_header, (ViewGroup) ((eo8) krkVar).d, false);
                        if (inflate == null) {
                            yhk.s("rootView");
                            return null;
                        }
                        TextView textView = (TextView) inflate;
                        textView.setText(teamStreaksFragment.getString(R.string.next_match_within_x_hours, 48));
                        sea.v(textView, true, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        return textView;
                }
            }
        });
        final int i2 = 1;
        this.y = ypa.a(ysaVar, new Function0(this) { // from class: r2j
            public final /* synthetic */ TeamStreaksFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TeamStreaksFragment teamStreaksFragment = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = teamStreaksFragment.requireContext();
                        requireContext.getClass();
                        return new p2j(requireContext);
                    default:
                        LayoutInflater layoutInflater = teamStreaksFragment.getLayoutInflater();
                        krk krkVar = teamStreaksFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.view_top_team_streaks_header, (ViewGroup) ((eo8) krkVar).d, false);
                        if (inflate == null) {
                            yhk.s("rootView");
                            return null;
                        }
                        TextView textView = (TextView) inflate;
                        textView.setText(teamStreaksFragment.getString(R.string.next_match_within_x_hours, 48));
                        sea.v(textView, true, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        return textView;
                }
            }
        });
        this.z = e.f(km5.a);
        this.A = e.f(null);
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment
    public final void D() {
        krk krkVar = this.l;
        krkVar.getClass();
        RecyclerView recyclerView = ((eo8) krkVar).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        joa joaVar = this.x;
        p2j p2jVar = (p2j) joaVar.getValue();
        uri uriVar = new uri(this, 6);
        p2jVar.getClass();
        p2jVar.a.d = uriVar;
        r1.p(((p2j) joaVar.getValue()).g.size(), (TextView) this.y.getValue());
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((eo8) krkVar2).d.setAdapter((p2j) joaVar.getValue());
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment
    /* renamed from: E */
    public final boolean getN() {
        if (!this.n) {
            return false;
        }
        String str = this.w;
        m2j m2jVar = (m2j) ((eoh) this.A).getValue();
        return Intrinsics.c(str, m2jVar != null ? m2jVar.a : null);
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment
    public final void G() {
        ((p2j) this.x.getValue()).s();
        ((TextView) this.y.getValue()).setVisibility(8);
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment
    public final void H(Object obj) {
        TeamStreaksResponse teamStreaksResponse = (TeamStreaksResponse) obj;
        teamStreaksResponse.getClass();
        List<TeamStreak> topTeamStreaks = teamStreaksResponse.getTopTeamStreaks();
        ArrayList arrayList = new ArrayList(k13.r(topTeamStreaks, 10));
        Iterator<T> it = topTeamStreaks.iterator();
        while (it.hasNext()) {
            arrayList.add(new o2j((TeamStreak) it.next(), A().k()));
        }
        ((p2j) this.x.getValue()).F(arrayList);
        ((TextView) this.y.getValue()).setVisibility(!arrayList.isEmpty() ? 0 : 8);
        if (!getN()) {
            krk krkVar = this.l;
            krkVar.getClass();
            ((eo8) krkVar).d.scrollToPosition(0);
        }
        TeamStreak teamStreak = (TeamStreak) CollectionsKt.a0(0, teamStreaksResponse.getTopTeamStreaks());
        this.w = teamStreak != null ? teamStreak.getStreakName() : null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "TeamStreaksTab";
    }

    @Override // com.sofascore.results.bettingtips.fragment.AbstractBettingTipsFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        krk krkVar = this.l;
        krkVar.getClass();
        ((eo8) krkVar).f.setVisibility(0);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((eo8) krkVar2).f.setContent(new tc3(2122012474, new q8i(this, 17), true));
        ((y2j) this.v.getValue()).g.e(getViewLifecycleOwner(), this);
        A().g.e(getViewLifecycleOwner(), new ygi(3, new q2j(this, 0)));
        krk krkVar3 = this.l;
        krkVar3.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((eo8) krkVar3).e;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        m2j m2jVar;
        zu1 zu1Var = (zu1) A().g.d();
        if (zu1Var == null || (m2jVar = (m2j) ((eoh) this.A).getValue()) == null) {
            return;
        }
        y2j y2jVar = (y2j) this.v.getValue();
        xw3.L(un0.z(y2jVar), null, null, new cce(y2jVar, m2jVar.a, zu1Var.a, (rq3) null, 26), 3);
    }
}
