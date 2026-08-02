package com.sofascore.results.team.topplayers;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.sofascore.local_persistance.BrandingTeam;
import com.sofascore.results.team.topplayers.TeamTopPlayersFragment;
import defpackage.duf;
import defpackage.e3j;
import defpackage.joa;
import defpackage.n3j;
import defpackage.otk;
import defpackage.q8i;
import defpackage.rq3;
import defpackage.tc3;
import defpackage.un0;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z23;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/team/topplayers/TeamTopPlayersFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TeamTopPlayersFragment extends Hilt_TeamTopPlayersFragment {
    public final otk r = new otk(duf.a.getOrCreateKotlinClass(n3j.class), new e3j(this, 0), new e3j(this, 2), new e3j(this, 1));
    public final joa s;
    public final joa t;
    public final joa u;
    public final joa v;
    public final joa w;

    public TeamTopPlayersFragment() {
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        Function0 function0 = new Function0(this) { // from class: d3j
            public final /* synthetic */ TeamTopPlayersFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i;
                TeamTopPlayersFragment teamTopPlayersFragment = this.b;
                switch (i4) {
                    case 0:
                        return Integer.valueOf(teamTopPlayersFragment.requireArguments().getInt("TEAM_ID", -1));
                    case 1:
                        return teamTopPlayersFragment.requireArguments().getString("SPORT_SLUG", "");
                    case 2:
                        return teamTopPlayersFragment.requireArguments().getString("SCROLL_TO_STATISTIC");
                    case 3:
                        int i5 = teamTopPlayersFragment.requireArguments().getInt("PRESELECTED_TOURNAMENT_ID", 0);
                        Integer valueOf = Integer.valueOf(i5);
                        if (i5 != 0) {
                            return valueOf;
                        }
                        return null;
                    default:
                        Context requireContext = teamTopPlayersFragment.requireContext();
                        requireContext.getClass();
                        BrandingTeam A = ccd.A(((Number) teamTopPlayersFragment.s.getValue()).intValue(), requireContext);
                        if (A == null) {
                            return null;
                        }
                        Context requireContext2 = teamTopPlayersFragment.requireContext();
                        requireContext2.getClass();
                        return tz9.B(requireContext2, A.getBackgroundColor(), A.getBackgroundGradientColor());
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.s = ypa.a(ysaVar, function0);
        this.t = ypa.a(ysaVar, new Function0(this) { // from class: d3j
            public final /* synthetic */ TeamTopPlayersFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i2;
                TeamTopPlayersFragment teamTopPlayersFragment = this.b;
                switch (i4) {
                    case 0:
                        return Integer.valueOf(teamTopPlayersFragment.requireArguments().getInt("TEAM_ID", -1));
                    case 1:
                        return teamTopPlayersFragment.requireArguments().getString("SPORT_SLUG", "");
                    case 2:
                        return teamTopPlayersFragment.requireArguments().getString("SCROLL_TO_STATISTIC");
                    case 3:
                        int i5 = teamTopPlayersFragment.requireArguments().getInt("PRESELECTED_TOURNAMENT_ID", 0);
                        Integer valueOf = Integer.valueOf(i5);
                        if (i5 != 0) {
                            return valueOf;
                        }
                        return null;
                    default:
                        Context requireContext = teamTopPlayersFragment.requireContext();
                        requireContext.getClass();
                        BrandingTeam A = ccd.A(((Number) teamTopPlayersFragment.s.getValue()).intValue(), requireContext);
                        if (A == null) {
                            return null;
                        }
                        Context requireContext2 = teamTopPlayersFragment.requireContext();
                        requireContext2.getClass();
                        return tz9.B(requireContext2, A.getBackgroundColor(), A.getBackgroundGradientColor());
                }
            }
        });
        this.u = ypa.a(ysaVar, new Function0(this) { // from class: d3j
            public final /* synthetic */ TeamTopPlayersFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                TeamTopPlayersFragment teamTopPlayersFragment = this.b;
                switch (i4) {
                    case 0:
                        return Integer.valueOf(teamTopPlayersFragment.requireArguments().getInt("TEAM_ID", -1));
                    case 1:
                        return teamTopPlayersFragment.requireArguments().getString("SPORT_SLUG", "");
                    case 2:
                        return teamTopPlayersFragment.requireArguments().getString("SCROLL_TO_STATISTIC");
                    case 3:
                        int i5 = teamTopPlayersFragment.requireArguments().getInt("PRESELECTED_TOURNAMENT_ID", 0);
                        Integer valueOf = Integer.valueOf(i5);
                        if (i5 != 0) {
                            return valueOf;
                        }
                        return null;
                    default:
                        Context requireContext = teamTopPlayersFragment.requireContext();
                        requireContext.getClass();
                        BrandingTeam A = ccd.A(((Number) teamTopPlayersFragment.s.getValue()).intValue(), requireContext);
                        if (A == null) {
                            return null;
                        }
                        Context requireContext2 = teamTopPlayersFragment.requireContext();
                        requireContext2.getClass();
                        return tz9.B(requireContext2, A.getBackgroundColor(), A.getBackgroundGradientColor());
                }
            }
        });
        final int i4 = 3;
        this.v = ypa.a(ysaVar, new Function0(this) { // from class: d3j
            public final /* synthetic */ TeamTopPlayersFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i42 = i4;
                TeamTopPlayersFragment teamTopPlayersFragment = this.b;
                switch (i42) {
                    case 0:
                        return Integer.valueOf(teamTopPlayersFragment.requireArguments().getInt("TEAM_ID", -1));
                    case 1:
                        return teamTopPlayersFragment.requireArguments().getString("SPORT_SLUG", "");
                    case 2:
                        return teamTopPlayersFragment.requireArguments().getString("SCROLL_TO_STATISTIC");
                    case 3:
                        int i5 = teamTopPlayersFragment.requireArguments().getInt("PRESELECTED_TOURNAMENT_ID", 0);
                        Integer valueOf = Integer.valueOf(i5);
                        if (i5 != 0) {
                            return valueOf;
                        }
                        return null;
                    default:
                        Context requireContext = teamTopPlayersFragment.requireContext();
                        requireContext.getClass();
                        BrandingTeam A = ccd.A(((Number) teamTopPlayersFragment.s.getValue()).intValue(), requireContext);
                        if (A == null) {
                            return null;
                        }
                        Context requireContext2 = teamTopPlayersFragment.requireContext();
                        requireContext2.getClass();
                        return tz9.B(requireContext2, A.getBackgroundColor(), A.getBackgroundGradientColor());
                }
            }
        });
        final int i5 = 4;
        this.w = ypa.a(ysaVar, new Function0(this) { // from class: d3j
            public final /* synthetic */ TeamTopPlayersFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i42 = i5;
                TeamTopPlayersFragment teamTopPlayersFragment = this.b;
                switch (i42) {
                    case 0:
                        return Integer.valueOf(teamTopPlayersFragment.requireArguments().getInt("TEAM_ID", -1));
                    case 1:
                        return teamTopPlayersFragment.requireArguments().getString("SPORT_SLUG", "");
                    case 2:
                        return teamTopPlayersFragment.requireArguments().getString("SCROLL_TO_STATISTIC");
                    case 3:
                        int i52 = teamTopPlayersFragment.requireArguments().getInt("PRESELECTED_TOURNAMENT_ID", 0);
                        Integer valueOf = Integer.valueOf(i52);
                        if (i52 != 0) {
                            return valueOf;
                        }
                        return null;
                    default:
                        Context requireContext = teamTopPlayersFragment.requireContext();
                        requireContext.getClass();
                        BrandingTeam A = ccd.A(((Number) teamTopPlayersFragment.s.getValue()).intValue(), requireContext);
                        if (A == null) {
                            return null;
                        }
                        Context requireContext2 = teamTopPlayersFragment.requireContext();
                        requireContext2.getClass();
                        return tz9.B(requireContext2, A.getBackgroundColor(), A.getBackgroundGradientColor());
                }
            }
        });
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getX() {
        return new tc3(1886662155, new q8i(this, 18), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "TopPlayersTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        l();
        n3j n3jVar = (n3j) this.r.getValue();
        String str = (String) this.t.getValue();
        str.getClass();
        xw3.L(un0.z(n3jVar), null, null, new z23(n3jVar, ((Number) this.s.getValue()).intValue(), str, (Integer) this.v.getValue(), (rq3) null, 21), 3);
    }
}
