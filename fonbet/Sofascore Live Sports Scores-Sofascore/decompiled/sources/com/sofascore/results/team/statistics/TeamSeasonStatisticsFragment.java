package com.sofascore.results.team.statistics;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.local_persistance.BrandingTeam;
import com.sofascore.model.SeasonSpinnerData;
import com.sofascore.model.Sports;
import com.sofascore.model.UniqueTournamentSeasonsSpinnerData;
import com.sofascore.model.UniqueTournamentSpinnerData;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatisticsResponse;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.team.statistics.TeamSeasonStatisticsFragment;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.aee;
import defpackage.av8;
import defpackage.bkh;
import defpackage.bte;
import defpackage.duf;
import defpackage.e12;
import defpackage.e1d;
import defpackage.eoh;
import defpackage.eq8;
import defpackage.eqf;
import defpackage.f5k;
import defpackage.fqj;
import defpackage.fuf;
import defpackage.fwi;
import defpackage.g5k;
import defpackage.hc9;
import defpackage.hei;
import defpackage.hf3;
import defpackage.if3;
import defpackage.ioe;
import defpackage.joa;
import defpackage.k13;
import defpackage.k1c;
import defpackage.kda;
import defpackage.km5;
import defpackage.krk;
import defpackage.lz;
import defpackage.mqi;
import defpackage.n12;
import defpackage.n50;
import defpackage.n61;
import defpackage.n9e;
import defpackage.nq8;
import defpackage.nui;
import defpackage.o1i;
import defpackage.o7g;
import defpackage.oei;
import defpackage.of3;
import defpackage.otk;
import defpackage.p0j;
import defpackage.q8i;
import defpackage.r13;
import defpackage.rfi;
import defpackage.rlh;
import defpackage.rq3;
import defpackage.s0j;
import defpackage.s1h;
import defpackage.tc3;
import defpackage.tz9;
import defpackage.udj;
import defpackage.un0;
import defpackage.ur1;
import defpackage.utc;
import defpackage.uxf;
import defpackage.v0j;
import defpackage.v1h;
import defpackage.vxc;
import defpackage.waa;
import defpackage.wca;
import defpackage.wrf;
import defpackage.wv8;
import defpackage.x0j;
import defpackage.xbb;
import defpackage.xtc;
import defpackage.xth;
import defpackage.xw3;
import defpackage.y0j;
import defpackage.yf8;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z23;
import defpackage.z8e;
import defpackage.zg3;
import defpackage.zni;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/team/statistics/TeamSeasonStatisticsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Leq8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TeamSeasonStatisticsFragment extends Hilt_TeamSeasonStatisticsFragment<eq8> {
    public final e1d A;
    public final e1d B;
    public Map C;
    public final mqi D;
    public final joa E;
    public final mqi F;
    public final mqi G;
    public final mqi r;
    public final otk s;
    public final otk t;
    public final mqi u;
    public final e1d v;
    public final e1d w;
    public final joa x;
    public final mqi y;
    public final e1d z;

    public TeamSeasonStatisticsFragment() {
        final int i = 0;
        this.r = ypa.b(new Function0(this) { // from class: o0j
            public final /* synthetic */ TeamSeasonStatisticsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TeamSeasonStatisticsFragment teamSeasonStatisticsFragment = this.b;
                switch (i2) {
                    case 0:
                        Bundle requireArguments = teamSeasonStatisticsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "TEAM", Team.class);
                        if (M != null) {
                            return (Team) M;
                        }
                        a70.p("Serializable TEAM not found");
                        return null;
                    case 1:
                        Context requireContext = teamSeasonStatisticsFragment.requireContext();
                        requireContext.getClass();
                        return new v0j(requireContext, teamSeasonStatisticsFragment.H());
                    case 2:
                        kp5 kp5Var = oei.f;
                        return (Intrinsics.c(teamSeasonStatisticsFragment.H(), Sports.RUGBY) || Intrinsics.c(teamSeasonStatisticsFragment.H(), Sports.BASKETBALL)) ? CollectionsKt.S(kp5Var, 1) : kp5Var;
                    case 3:
                        return Integer.valueOf(teamSeasonStatisticsFragment.requireArguments().getInt("STATISTICS_TOURNAMENT_ID"));
                    case 4:
                        Context requireContext2 = teamSeasonStatisticsFragment.requireContext();
                        requireContext2.getClass();
                        return new SegmentedButtonsView(requireContext2, null, 6);
                    case 5:
                        Context requireContext3 = teamSeasonStatisticsFragment.requireContext();
                        requireContext3.getClass();
                        return ccd.A(teamSeasonStatisticsFragment.I().getId(), requireContext3);
                    case 6:
                        LayoutInflater from = LayoutInflater.from(teamSeasonStatisticsFragment.requireActivity());
                        krk krkVar = teamSeasonStatisticsFragment.l;
                        krkVar.getClass();
                        hei a = hei.a(from.inflate(R.layout.statistic_avg_rating, (ViewGroup) ((eq8) krkVar).c, false));
                        ConstraintLayout constraintLayout = a.a;
                        constraintLayout.getClass();
                        sea.v(constraintLayout, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        a.b.setVisibility(8);
                        return a;
                    default:
                        Context requireContext4 = teamSeasonStatisticsFragment.requireContext();
                        requireContext4.getClass();
                        GraphicLarge graphicLarge = new GraphicLarge(requireContext4, null, 6);
                        graphicLarge.setLargeDrawableResource(teamSeasonStatisticsFragment.requireContext().getDrawable(R.drawable.no_statistics));
                        String string = teamSeasonStatisticsFragment.requireContext().getString(R.string.no_statistics);
                        string.getClass();
                        graphicLarge.setTitleResource(string);
                        String string2 = teamSeasonStatisticsFragment.requireContext().getString(R.string.no_statistics_text);
                        string2.getClass();
                        graphicLarge.setSubtitleResource(string2);
                        return graphicLarge;
                }
            }
        });
        final int i2 = 3;
        s0j s0jVar = new s0j(this, i2);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new o1i(s0jVar, 24));
        fuf fufVar = duf.a;
        this.s = new otk(fufVar.getOrCreateKotlinClass(y0j.class), new fwi(a, 9), new bte(this, a, 25), new fwi(a, 10));
        final int i3 = 1;
        final int i4 = 2;
        this.t = new otk(fufVar.getOrCreateKotlinClass(nui.class), new s0j(this, i), new s0j(this, i4), new s0j(this, i3));
        this.u = ypa.b(new Function0(this) { // from class: o0j
            public final /* synthetic */ TeamSeasonStatisticsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TeamSeasonStatisticsFragment teamSeasonStatisticsFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = teamSeasonStatisticsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "TEAM", Team.class);
                        if (M != null) {
                            return (Team) M;
                        }
                        a70.p("Serializable TEAM not found");
                        return null;
                    case 1:
                        Context requireContext = teamSeasonStatisticsFragment.requireContext();
                        requireContext.getClass();
                        return new v0j(requireContext, teamSeasonStatisticsFragment.H());
                    case 2:
                        kp5 kp5Var = oei.f;
                        return (Intrinsics.c(teamSeasonStatisticsFragment.H(), Sports.RUGBY) || Intrinsics.c(teamSeasonStatisticsFragment.H(), Sports.BASKETBALL)) ? CollectionsKt.S(kp5Var, 1) : kp5Var;
                    case 3:
                        return Integer.valueOf(teamSeasonStatisticsFragment.requireArguments().getInt("STATISTICS_TOURNAMENT_ID"));
                    case 4:
                        Context requireContext2 = teamSeasonStatisticsFragment.requireContext();
                        requireContext2.getClass();
                        return new SegmentedButtonsView(requireContext2, null, 6);
                    case 5:
                        Context requireContext3 = teamSeasonStatisticsFragment.requireContext();
                        requireContext3.getClass();
                        return ccd.A(teamSeasonStatisticsFragment.I().getId(), requireContext3);
                    case 6:
                        LayoutInflater from = LayoutInflater.from(teamSeasonStatisticsFragment.requireActivity());
                        krk krkVar = teamSeasonStatisticsFragment.l;
                        krkVar.getClass();
                        hei a2 = hei.a(from.inflate(R.layout.statistic_avg_rating, (ViewGroup) ((eq8) krkVar).c, false));
                        ConstraintLayout constraintLayout = a2.a;
                        constraintLayout.getClass();
                        sea.v(constraintLayout, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        a2.b.setVisibility(8);
                        return a2;
                    default:
                        Context requireContext4 = teamSeasonStatisticsFragment.requireContext();
                        requireContext4.getClass();
                        GraphicLarge graphicLarge = new GraphicLarge(requireContext4, null, 6);
                        graphicLarge.setLargeDrawableResource(teamSeasonStatisticsFragment.requireContext().getDrawable(R.drawable.no_statistics));
                        String string = teamSeasonStatisticsFragment.requireContext().getString(R.string.no_statistics);
                        string.getClass();
                        graphicLarge.setTitleResource(string);
                        String string2 = teamSeasonStatisticsFragment.requireContext().getString(R.string.no_statistics_text);
                        string2.getClass();
                        graphicLarge.setSubtitleResource(string2);
                        return graphicLarge;
                }
            }
        });
        km5 km5Var = km5.a;
        this.v = e.f(km5Var);
        this.w = e.f(km5Var);
        this.x = ypa.a(ysaVar, new Function0(this) { // from class: o0j
            public final /* synthetic */ TeamSeasonStatisticsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                TeamSeasonStatisticsFragment teamSeasonStatisticsFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = teamSeasonStatisticsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "TEAM", Team.class);
                        if (M != null) {
                            return (Team) M;
                        }
                        a70.p("Serializable TEAM not found");
                        return null;
                    case 1:
                        Context requireContext = teamSeasonStatisticsFragment.requireContext();
                        requireContext.getClass();
                        return new v0j(requireContext, teamSeasonStatisticsFragment.H());
                    case 2:
                        kp5 kp5Var = oei.f;
                        return (Intrinsics.c(teamSeasonStatisticsFragment.H(), Sports.RUGBY) || Intrinsics.c(teamSeasonStatisticsFragment.H(), Sports.BASKETBALL)) ? CollectionsKt.S(kp5Var, 1) : kp5Var;
                    case 3:
                        return Integer.valueOf(teamSeasonStatisticsFragment.requireArguments().getInt("STATISTICS_TOURNAMENT_ID"));
                    case 4:
                        Context requireContext2 = teamSeasonStatisticsFragment.requireContext();
                        requireContext2.getClass();
                        return new SegmentedButtonsView(requireContext2, null, 6);
                    case 5:
                        Context requireContext3 = teamSeasonStatisticsFragment.requireContext();
                        requireContext3.getClass();
                        return ccd.A(teamSeasonStatisticsFragment.I().getId(), requireContext3);
                    case 6:
                        LayoutInflater from = LayoutInflater.from(teamSeasonStatisticsFragment.requireActivity());
                        krk krkVar = teamSeasonStatisticsFragment.l;
                        krkVar.getClass();
                        hei a2 = hei.a(from.inflate(R.layout.statistic_avg_rating, (ViewGroup) ((eq8) krkVar).c, false));
                        ConstraintLayout constraintLayout = a2.a;
                        constraintLayout.getClass();
                        sea.v(constraintLayout, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        a2.b.setVisibility(8);
                        return a2;
                    default:
                        Context requireContext4 = teamSeasonStatisticsFragment.requireContext();
                        requireContext4.getClass();
                        GraphicLarge graphicLarge = new GraphicLarge(requireContext4, null, 6);
                        graphicLarge.setLargeDrawableResource(teamSeasonStatisticsFragment.requireContext().getDrawable(R.drawable.no_statistics));
                        String string = teamSeasonStatisticsFragment.requireContext().getString(R.string.no_statistics);
                        string.getClass();
                        graphicLarge.setTitleResource(string);
                        String string2 = teamSeasonStatisticsFragment.requireContext().getString(R.string.no_statistics_text);
                        string2.getClass();
                        graphicLarge.setSubtitleResource(string2);
                        return graphicLarge;
                }
            }
        });
        this.y = ypa.b(new Function0(this) { // from class: o0j
            public final /* synthetic */ TeamSeasonStatisticsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TeamSeasonStatisticsFragment teamSeasonStatisticsFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = teamSeasonStatisticsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "TEAM", Team.class);
                        if (M != null) {
                            return (Team) M;
                        }
                        a70.p("Serializable TEAM not found");
                        return null;
                    case 1:
                        Context requireContext = teamSeasonStatisticsFragment.requireContext();
                        requireContext.getClass();
                        return new v0j(requireContext, teamSeasonStatisticsFragment.H());
                    case 2:
                        kp5 kp5Var = oei.f;
                        return (Intrinsics.c(teamSeasonStatisticsFragment.H(), Sports.RUGBY) || Intrinsics.c(teamSeasonStatisticsFragment.H(), Sports.BASKETBALL)) ? CollectionsKt.S(kp5Var, 1) : kp5Var;
                    case 3:
                        return Integer.valueOf(teamSeasonStatisticsFragment.requireArguments().getInt("STATISTICS_TOURNAMENT_ID"));
                    case 4:
                        Context requireContext2 = teamSeasonStatisticsFragment.requireContext();
                        requireContext2.getClass();
                        return new SegmentedButtonsView(requireContext2, null, 6);
                    case 5:
                        Context requireContext3 = teamSeasonStatisticsFragment.requireContext();
                        requireContext3.getClass();
                        return ccd.A(teamSeasonStatisticsFragment.I().getId(), requireContext3);
                    case 6:
                        LayoutInflater from = LayoutInflater.from(teamSeasonStatisticsFragment.requireActivity());
                        krk krkVar = teamSeasonStatisticsFragment.l;
                        krkVar.getClass();
                        hei a2 = hei.a(from.inflate(R.layout.statistic_avg_rating, (ViewGroup) ((eq8) krkVar).c, false));
                        ConstraintLayout constraintLayout = a2.a;
                        constraintLayout.getClass();
                        sea.v(constraintLayout, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        a2.b.setVisibility(8);
                        return a2;
                    default:
                        Context requireContext4 = teamSeasonStatisticsFragment.requireContext();
                        requireContext4.getClass();
                        GraphicLarge graphicLarge = new GraphicLarge(requireContext4, null, 6);
                        graphicLarge.setLargeDrawableResource(teamSeasonStatisticsFragment.requireContext().getDrawable(R.drawable.no_statistics));
                        String string = teamSeasonStatisticsFragment.requireContext().getString(R.string.no_statistics);
                        string.getClass();
                        graphicLarge.setTitleResource(string);
                        String string2 = teamSeasonStatisticsFragment.requireContext().getString(R.string.no_statistics_text);
                        string2.getClass();
                        graphicLarge.setSubtitleResource(string2);
                        return graphicLarge;
                }
            }
        });
        this.z = e.f(null);
        this.A = e.f(null);
        this.B = e.f(null);
        final int i5 = 4;
        this.D = ypa.b(new Function0(this) { // from class: o0j
            public final /* synthetic */ TeamSeasonStatisticsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                TeamSeasonStatisticsFragment teamSeasonStatisticsFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = teamSeasonStatisticsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "TEAM", Team.class);
                        if (M != null) {
                            return (Team) M;
                        }
                        a70.p("Serializable TEAM not found");
                        return null;
                    case 1:
                        Context requireContext = teamSeasonStatisticsFragment.requireContext();
                        requireContext.getClass();
                        return new v0j(requireContext, teamSeasonStatisticsFragment.H());
                    case 2:
                        kp5 kp5Var = oei.f;
                        return (Intrinsics.c(teamSeasonStatisticsFragment.H(), Sports.RUGBY) || Intrinsics.c(teamSeasonStatisticsFragment.H(), Sports.BASKETBALL)) ? CollectionsKt.S(kp5Var, 1) : kp5Var;
                    case 3:
                        return Integer.valueOf(teamSeasonStatisticsFragment.requireArguments().getInt("STATISTICS_TOURNAMENT_ID"));
                    case 4:
                        Context requireContext2 = teamSeasonStatisticsFragment.requireContext();
                        requireContext2.getClass();
                        return new SegmentedButtonsView(requireContext2, null, 6);
                    case 5:
                        Context requireContext3 = teamSeasonStatisticsFragment.requireContext();
                        requireContext3.getClass();
                        return ccd.A(teamSeasonStatisticsFragment.I().getId(), requireContext3);
                    case 6:
                        LayoutInflater from = LayoutInflater.from(teamSeasonStatisticsFragment.requireActivity());
                        krk krkVar = teamSeasonStatisticsFragment.l;
                        krkVar.getClass();
                        hei a2 = hei.a(from.inflate(R.layout.statistic_avg_rating, (ViewGroup) ((eq8) krkVar).c, false));
                        ConstraintLayout constraintLayout = a2.a;
                        constraintLayout.getClass();
                        sea.v(constraintLayout, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        a2.b.setVisibility(8);
                        return a2;
                    default:
                        Context requireContext4 = teamSeasonStatisticsFragment.requireContext();
                        requireContext4.getClass();
                        GraphicLarge graphicLarge = new GraphicLarge(requireContext4, null, 6);
                        graphicLarge.setLargeDrawableResource(teamSeasonStatisticsFragment.requireContext().getDrawable(R.drawable.no_statistics));
                        String string = teamSeasonStatisticsFragment.requireContext().getString(R.string.no_statistics);
                        string.getClass();
                        graphicLarge.setTitleResource(string);
                        String string2 = teamSeasonStatisticsFragment.requireContext().getString(R.string.no_statistics_text);
                        string2.getClass();
                        graphicLarge.setSubtitleResource(string2);
                        return graphicLarge;
                }
            }
        });
        final int i6 = 5;
        this.E = ypa.a(ysaVar, new Function0(this) { // from class: o0j
            public final /* synthetic */ TeamSeasonStatisticsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                TeamSeasonStatisticsFragment teamSeasonStatisticsFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = teamSeasonStatisticsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "TEAM", Team.class);
                        if (M != null) {
                            return (Team) M;
                        }
                        a70.p("Serializable TEAM not found");
                        return null;
                    case 1:
                        Context requireContext = teamSeasonStatisticsFragment.requireContext();
                        requireContext.getClass();
                        return new v0j(requireContext, teamSeasonStatisticsFragment.H());
                    case 2:
                        kp5 kp5Var = oei.f;
                        return (Intrinsics.c(teamSeasonStatisticsFragment.H(), Sports.RUGBY) || Intrinsics.c(teamSeasonStatisticsFragment.H(), Sports.BASKETBALL)) ? CollectionsKt.S(kp5Var, 1) : kp5Var;
                    case 3:
                        return Integer.valueOf(teamSeasonStatisticsFragment.requireArguments().getInt("STATISTICS_TOURNAMENT_ID"));
                    case 4:
                        Context requireContext2 = teamSeasonStatisticsFragment.requireContext();
                        requireContext2.getClass();
                        return new SegmentedButtonsView(requireContext2, null, 6);
                    case 5:
                        Context requireContext3 = teamSeasonStatisticsFragment.requireContext();
                        requireContext3.getClass();
                        return ccd.A(teamSeasonStatisticsFragment.I().getId(), requireContext3);
                    case 6:
                        LayoutInflater from = LayoutInflater.from(teamSeasonStatisticsFragment.requireActivity());
                        krk krkVar = teamSeasonStatisticsFragment.l;
                        krkVar.getClass();
                        hei a2 = hei.a(from.inflate(R.layout.statistic_avg_rating, (ViewGroup) ((eq8) krkVar).c, false));
                        ConstraintLayout constraintLayout = a2.a;
                        constraintLayout.getClass();
                        sea.v(constraintLayout, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        a2.b.setVisibility(8);
                        return a2;
                    default:
                        Context requireContext4 = teamSeasonStatisticsFragment.requireContext();
                        requireContext4.getClass();
                        GraphicLarge graphicLarge = new GraphicLarge(requireContext4, null, 6);
                        graphicLarge.setLargeDrawableResource(teamSeasonStatisticsFragment.requireContext().getDrawable(R.drawable.no_statistics));
                        String string = teamSeasonStatisticsFragment.requireContext().getString(R.string.no_statistics);
                        string.getClass();
                        graphicLarge.setTitleResource(string);
                        String string2 = teamSeasonStatisticsFragment.requireContext().getString(R.string.no_statistics_text);
                        string2.getClass();
                        graphicLarge.setSubtitleResource(string2);
                        return graphicLarge;
                }
            }
        });
        final int i7 = 6;
        this.F = ypa.b(new Function0(this) { // from class: o0j
            public final /* synthetic */ TeamSeasonStatisticsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i7;
                TeamSeasonStatisticsFragment teamSeasonStatisticsFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = teamSeasonStatisticsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "TEAM", Team.class);
                        if (M != null) {
                            return (Team) M;
                        }
                        a70.p("Serializable TEAM not found");
                        return null;
                    case 1:
                        Context requireContext = teamSeasonStatisticsFragment.requireContext();
                        requireContext.getClass();
                        return new v0j(requireContext, teamSeasonStatisticsFragment.H());
                    case 2:
                        kp5 kp5Var = oei.f;
                        return (Intrinsics.c(teamSeasonStatisticsFragment.H(), Sports.RUGBY) || Intrinsics.c(teamSeasonStatisticsFragment.H(), Sports.BASKETBALL)) ? CollectionsKt.S(kp5Var, 1) : kp5Var;
                    case 3:
                        return Integer.valueOf(teamSeasonStatisticsFragment.requireArguments().getInt("STATISTICS_TOURNAMENT_ID"));
                    case 4:
                        Context requireContext2 = teamSeasonStatisticsFragment.requireContext();
                        requireContext2.getClass();
                        return new SegmentedButtonsView(requireContext2, null, 6);
                    case 5:
                        Context requireContext3 = teamSeasonStatisticsFragment.requireContext();
                        requireContext3.getClass();
                        return ccd.A(teamSeasonStatisticsFragment.I().getId(), requireContext3);
                    case 6:
                        LayoutInflater from = LayoutInflater.from(teamSeasonStatisticsFragment.requireActivity());
                        krk krkVar = teamSeasonStatisticsFragment.l;
                        krkVar.getClass();
                        hei a2 = hei.a(from.inflate(R.layout.statistic_avg_rating, (ViewGroup) ((eq8) krkVar).c, false));
                        ConstraintLayout constraintLayout = a2.a;
                        constraintLayout.getClass();
                        sea.v(constraintLayout, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        a2.b.setVisibility(8);
                        return a2;
                    default:
                        Context requireContext4 = teamSeasonStatisticsFragment.requireContext();
                        requireContext4.getClass();
                        GraphicLarge graphicLarge = new GraphicLarge(requireContext4, null, 6);
                        graphicLarge.setLargeDrawableResource(teamSeasonStatisticsFragment.requireContext().getDrawable(R.drawable.no_statistics));
                        String string = teamSeasonStatisticsFragment.requireContext().getString(R.string.no_statistics);
                        string.getClass();
                        graphicLarge.setTitleResource(string);
                        String string2 = teamSeasonStatisticsFragment.requireContext().getString(R.string.no_statistics_text);
                        string2.getClass();
                        graphicLarge.setSubtitleResource(string2);
                        return graphicLarge;
                }
            }
        });
        final int i8 = 7;
        this.G = ypa.b(new Function0(this) { // from class: o0j
            public final /* synthetic */ TeamSeasonStatisticsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i8;
                TeamSeasonStatisticsFragment teamSeasonStatisticsFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = teamSeasonStatisticsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "TEAM", Team.class);
                        if (M != null) {
                            return (Team) M;
                        }
                        a70.p("Serializable TEAM not found");
                        return null;
                    case 1:
                        Context requireContext = teamSeasonStatisticsFragment.requireContext();
                        requireContext.getClass();
                        return new v0j(requireContext, teamSeasonStatisticsFragment.H());
                    case 2:
                        kp5 kp5Var = oei.f;
                        return (Intrinsics.c(teamSeasonStatisticsFragment.H(), Sports.RUGBY) || Intrinsics.c(teamSeasonStatisticsFragment.H(), Sports.BASKETBALL)) ? CollectionsKt.S(kp5Var, 1) : kp5Var;
                    case 3:
                        return Integer.valueOf(teamSeasonStatisticsFragment.requireArguments().getInt("STATISTICS_TOURNAMENT_ID"));
                    case 4:
                        Context requireContext2 = teamSeasonStatisticsFragment.requireContext();
                        requireContext2.getClass();
                        return new SegmentedButtonsView(requireContext2, null, 6);
                    case 5:
                        Context requireContext3 = teamSeasonStatisticsFragment.requireContext();
                        requireContext3.getClass();
                        return ccd.A(teamSeasonStatisticsFragment.I().getId(), requireContext3);
                    case 6:
                        LayoutInflater from = LayoutInflater.from(teamSeasonStatisticsFragment.requireActivity());
                        krk krkVar = teamSeasonStatisticsFragment.l;
                        krkVar.getClass();
                        hei a2 = hei.a(from.inflate(R.layout.statistic_avg_rating, (ViewGroup) ((eq8) krkVar).c, false));
                        ConstraintLayout constraintLayout = a2.a;
                        constraintLayout.getClass();
                        sea.v(constraintLayout, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        a2.b.setVisibility(8);
                        return a2;
                    default:
                        Context requireContext4 = teamSeasonStatisticsFragment.requireContext();
                        requireContext4.getClass();
                        GraphicLarge graphicLarge = new GraphicLarge(requireContext4, null, 6);
                        graphicLarge.setLargeDrawableResource(teamSeasonStatisticsFragment.requireContext().getDrawable(R.drawable.no_statistics));
                        String string = teamSeasonStatisticsFragment.requireContext().getString(R.string.no_statistics);
                        string.getClass();
                        graphicLarge.setTitleResource(string);
                        String string2 = teamSeasonStatisticsFragment.requireContext().getString(R.string.no_statistics_text);
                        string2.getClass();
                        graphicLarge.setSubtitleResource(string2);
                        return graphicLarge;
                }
            }
        });
    }

    public final void C(int i, int i2, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(196805003);
        int i3 = (av8Var.e(i) ? 4 : 2) | i2 | (av8Var.i(this) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            r13 r13Var = null;
            Integer valueOf = i != 250 ? i != 500 ? i != 1000 ? i != 2000 ? null : Integer.valueOf(R.color.atp_finals) : Integer.valueOf(R.color.atp_1000) : Integer.valueOf(R.color.atp_500) : Integer.valueOf(R.color.atp_250);
            if (valueOf == null) {
                av8Var.d0(273432231);
                av8Var.s(false);
            } else {
                r13Var = new r13(wv8.b(av8Var, 273432232, valueOf, av8Var, false));
            }
            if (r13Var == null) {
                av8Var.d0(387596810);
                av8Var.s(false);
            } else {
                av8Var.d0(387596811);
                long j = r13Var.a;
                utc utcVar = utc.a;
                nq8.h(av8Var, bkh.p(utcVar, 16.0f));
                xtc q = n9e.q(bkh.o(utcVar, 44.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), j, o7g.a(12.0f));
                k1c c = e12.c(uxf.c, false);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, q);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c, hf3.g);
                waa.K(av8Var, m, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                xtc a = n12.a.a(utcVar, uxf.g);
                String valueOf2 = String.valueOf(i);
                yf8 yf8Var = xth.a;
                udj.c(valueOf2, a, lz.D(R.color.surface_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131064);
                av8Var = av8Var;
                av8Var.s(true);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new n61(this, i, i2, 14);
        }
    }

    public final nui D() {
        return (nui) this.t.getValue();
    }

    public final v0j E() {
        return (v0j) this.u.getValue();
    }

    public final SeasonSpinnerData F() {
        return (SeasonSpinnerData) ((eoh) this.A).getValue();
    }

    public final UniqueTournamentSeasonsSpinnerData G() {
        return (UniqueTournamentSeasonsSpinnerData) ((eoh) this.z).getValue();
    }

    public final String H() {
        Sport sport;
        String slug;
        Sport sport2 = I().getSport();
        if (sport2 != null && (slug = sport2.getSlug()) != null) {
            return slug;
        }
        Category category = I().getCategory();
        return (category == null || (sport = category.getSport()) == null) ? "" : sport.getSlug();
    }

    public final Team I() {
        return (Team) this.r.getValue();
    }

    public final hei K() {
        return (hei) this.F.getValue();
    }

    public final y0j L() {
        return (y0j) this.s.getValue();
    }

    public final void M(TeamSeasonStatisticsResponse teamSeasonStatisticsResponse) {
        E().s();
        if (teamSeasonStatisticsResponse == null) {
            r5.p(E().g.size(), (GraphicLarge) this.G.getValue());
        } else {
            kda.p(wca.x(getLifecycle()), new n50(this, teamSeasonStatisticsResponse, null, 14), new p0j(this, 3));
        }
    }

    public final void N() {
        UniqueTournamentSpinnerData uniqueTournament;
        String year;
        UniqueTournamentSpinnerData uniqueTournament2;
        UniqueTournamentSpinnerData uniqueTournament3;
        UniqueTournamentSpinnerData uniqueTournament4;
        E().s();
        v0j E = E();
        ConstraintLayout constraintLayout = K().a;
        constraintLayout.getClass();
        E.C(constraintLayout);
        nui D = D();
        UniqueTournamentSeasonsSpinnerData G = G();
        rq3 rq3Var = null;
        D.v = (G == null || (uniqueTournament4 = G.getUniqueTournament()) == null) ? null : Integer.valueOf(uniqueTournament4.getId());
        nui D2 = D();
        SeasonSpinnerData F = F();
        D2.w = F != null ? Integer.valueOf(F.getId()) : null;
        nui D3 = D();
        Season.SubSeasonType subSeasonType = Season.SubSeasonType.OVERALL;
        D3.x = subSeasonType.getLabel();
        if (!Intrinsics.c(H(), Sports.BASKETBALL)) {
            UniqueTournamentSeasonsSpinnerData G2 = G();
            boolean z = (G2 == null || (uniqueTournament2 = G2.getUniqueTournament()) == null || uniqueTournament2.getId() != -1000) ? false : true;
            if (Intrinsics.c(H(), Sports.TENNIS) && z) {
                SeasonSpinnerData F2 = F();
                if (F2 == null || (year = F2.getYear()) == null) {
                    return;
                }
                y0j L = L();
                xw3.L(un0.z(L), null, null, new z23(L, I().getId(), year, rq3Var, 20), 3);
                return;
            }
            UniqueTournamentSeasonsSpinnerData G3 = G();
            Integer valueOf = (G3 == null || (uniqueTournament = G3.getUniqueTournament()) == null) ? null : Integer.valueOf(uniqueTournament.getId());
            SeasonSpinnerData F3 = F();
            Integer valueOf2 = F3 != null ? Integer.valueOf(F3.getId()) : null;
            if (valueOf == null || valueOf2 == null) {
                return;
            }
            int intValue = valueOf2.intValue();
            int intValue2 = valueOf.intValue();
            y0j L2 = L();
            String H = H();
            int id = I().getId();
            String label = subSeasonType.getLabel();
            SeasonSpinnerData F4 = F();
            String year2 = F4 != null ? F4.getYear() : null;
            H.getClass();
            label.getClass();
            L2.k.j(km5.a);
            xw3.L(un0.z(L2), null, null, new x0j(year2, L2, intValue2, intValue, H, id, label, null), 3);
            return;
        }
        xbb b = a.b();
        Map map = this.C;
        if (map == null) {
            Intrinsics.i("seasonSubSeasonMap");
            throw null;
        }
        UniqueTournamentSeasonsSpinnerData G4 = G();
        Map map2 = (Map) map.get((G4 == null || (uniqueTournament3 = G4.getUniqueTournament()) == null) ? null : Integer.valueOf(uniqueTournament3.getId()));
        if (map2 != null) {
            SeasonSpinnerData F5 = F();
            List list = (List) map2.get(F5 != null ? Integer.valueOf(F5.getId()) : null);
            if (list != null) {
                b.addAll(list);
            }
        }
        xbb a = a.a(b);
        mqi mqiVar = this.D;
        ((SegmentedButtonsView) mqiVar.getValue()).setFallbackToLabel(Boolean.FALSE);
        SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) mqiVar.getValue();
        ArrayList arrayList = new ArrayList(k13.r(a, 10));
        ListIterator listIterator = a.listIterator(0);
        while (true) {
            hc9 hc9Var = (hc9) listIterator;
            if (!hc9Var.hasNext()) {
                SegmentedButtonsView.t(segmentedButtonsView, arrayList, null, 2);
                return;
            }
            String str = (String) hc9Var.next();
            Set set = f5k.a;
            Context requireContext = requireContext();
            requireContext.getClass();
            arrayList.add(new s1h(str, f5k.b(requireContext, str, H()), true));
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_team_statistics, (ViewGroup) null, false);
        int i = R.id.headers_container;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.headers_container, inflate);
        if (linearLayout != null) {
            i = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
            if (recyclerView != null) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
                i = R.id.spinner_row;
                View B = nq8.B(R.id.spinner_row, inflate);
                if (B != null) {
                    vxc a = vxc.a(B);
                    i = R.id.tennis_surface_chips;
                    TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.tennis_surface_chips, inflate);
                    if (typeHeaderView != null) {
                        return new eq8(swipeRefreshLayout, linearLayout, recyclerView, swipeRefreshLayout, a, typeHeaderView);
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "StatisticsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((eq8) krkVar).d;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        l();
        oei oeiVar = (oei) CollectionsKt.firstOrNull((List) this.x.getValue());
        if (oeiVar == null) {
            oeiVar = oei.b;
        }
        ((eoh) this.B).setValue(oeiVar);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((eq8) krkVar2).c;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((eq8) krkVar3).c.setAdapter(E());
        krk krkVar4 = this.l;
        krkVar4.getClass();
        wrf.a(((eq8) krkVar4).c, new p0j(this, 7));
        final boolean G = tz9.G((BrandingTeam) this.E.getValue());
        if (G) {
            krk krkVar5 = this.l;
            krkVar5.getClass();
            ((eq8) krkVar5).e.a.setBackground(null);
        }
        krk krkVar6 = this.l;
        krkVar6.getClass();
        vxc vxcVar = ((eq8) krkVar6).e;
        ComposeView composeView = vxcVar.c;
        ComposeView composeView2 = vxcVar.e;
        final int i = 0;
        final int i2 = 1;
        composeView.setContent(new tc3(1735890164, new Function2(this) { // from class: q0j
            public final /* synthetic */ TeamSeasonStatisticsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object obj3;
                pxh pxhVar;
                int i3 = i;
                a99 a99Var = nf3.a;
                boolean z = G;
                TeamSeasonStatisticsFragment teamSeasonStatisticsFragment = this.b;
                switch (i3) {
                    case 0:
                        of3 of3Var = (of3) obj;
                        int intValue = ((Integer) obj2).intValue();
                        av8 av8Var = (av8) of3Var;
                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                            av8Var.d0(1743140080);
                            List list = (List) ((eoh) teamSeasonStatisticsFragment.v).getValue();
                            ArrayList arrayList = new ArrayList(k13.r(list, 10));
                            Iterator it = list.iterator();
                            while (true) {
                                int i4 = 5;
                                if (it.hasNext()) {
                                    UniqueTournamentSeasonsSpinnerData uniqueTournamentSeasonsSpinnerData = (UniqueTournamentSeasonsSpinnerData) it.next();
                                    String name = uniqueTournamentSeasonsSpinnerData.getUniqueTournament().getName();
                                    tc3 H = yqo.H(1187268681, av8Var, new r0j(uniqueTournamentSeasonsSpinnerData, 0));
                                    Integer tennisPoints = uniqueTournamentSeasonsSpinnerData.getUniqueTournament().getTennisPoints();
                                    if (tennisPoints == null) {
                                        av8Var.d0(1726921165);
                                        av8Var.s(false);
                                        pxhVar = null;
                                    } else {
                                        av8Var.d0(1726921166);
                                        pxh pxhVar2 = new pxh(yqo.H(-2122888150, av8Var, new sj(teamSeasonStatisticsFragment, tennisPoints.intValue(), i4)), true);
                                        av8Var.s(false);
                                        pxhVar = pxhVar2;
                                    }
                                    arrayList.add(new oxh(uniqueTournamentSeasonsSpinnerData, name, H, null, pxhVar, false, 232));
                                } else {
                                    av8Var.s(false);
                                    gv9 W = l6g.W(arrayList);
                                    uxh uxhVar = z ? rxh.i : sxh.i;
                                    Iterator<E> it2 = W.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            obj3 = it2.next();
                                            if (Intrinsics.c(((oxh) obj3).a, teamSeasonStatisticsFragment.G())) {
                                            }
                                        } else {
                                            obj3 = null;
                                        }
                                    }
                                    oxh oxhVar = (oxh) obj3;
                                    oxh a = oxhVar != null ? oxh.a(oxhVar, null, null, null, 239) : null;
                                    boolean i5 = av8Var.i(teamSeasonStatisticsFragment);
                                    Object O = av8Var.O();
                                    if (i5 || O == a99Var) {
                                        O = new p0j(teamSeasonStatisticsFragment, i4);
                                        av8Var.n0(O);
                                    }
                                    r4a.j(W, a, (Function1) O, null, uxhVar, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, 1000);
                                }
                            }
                        } else {
                            av8Var.W();
                        }
                        break;
                    case 1:
                        of3 of3Var2 = (of3) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        av8 av8Var2 = (av8) of3Var2;
                        if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                            List<SeasonSpinnerData> list2 = (List) ((eoh) teamSeasonStatisticsFragment.w).getValue();
                            ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                            for (SeasonSpinnerData seasonSpinnerData : list2) {
                                arrayList2.add(new oxh(seasonSpinnerData, seasonSpinnerData.getYear(), null, null, null, false, 252));
                            }
                            gv9 W2 = l6g.W(arrayList2);
                            uxh uxhVar2 = z ? rxh.i : sxh.i;
                            Iterator<E> it3 = W2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    Object next = it3.next();
                                    if (Intrinsics.c(((oxh) next).a, teamSeasonStatisticsFragment.F())) {
                                        r3 = next;
                                    }
                                }
                            }
                            oxh oxhVar2 = r3;
                            boolean i6 = av8Var2.i(teamSeasonStatisticsFragment);
                            Object O2 = av8Var2.O();
                            if (i6 || O2 == a99Var) {
                                O2 = new p0j(teamSeasonStatisticsFragment, 6);
                                av8Var2.n0(O2);
                            }
                            r4a.j(W2, oxhVar2, (Function1) O2, null, uxhVar2, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 0, 1000);
                        } else {
                            av8Var2.W();
                        }
                        break;
                    default:
                        of3 of3Var3 = (of3) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        av8 av8Var3 = (av8) of3Var3;
                        if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                            List<oei> list3 = (List) teamSeasonStatisticsFragment.x.getValue();
                            ArrayList arrayList3 = new ArrayList(k13.r(list3, 10));
                            for (oei oeiVar2 : list3) {
                                arrayList3.add(new oxh(oeiVar2, teamSeasonStatisticsFragment.getString(oeiVar2.a), null, null, null, false, 252));
                            }
                            gv9 W3 = l6g.W(arrayList3);
                            uxh uxhVar3 = z ? rxh.i : sxh.i;
                            Iterator<E> it4 = W3.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    Object next2 = it4.next();
                                    if (((oxh) next2).a == ((oei) ((eoh) teamSeasonStatisticsFragment.B).getValue())) {
                                        r3 = next2;
                                    }
                                }
                            }
                            oxh oxhVar3 = r3;
                            boolean i7 = av8Var3.i(teamSeasonStatisticsFragment);
                            Object O3 = av8Var3.O();
                            if (i7 || O3 == a99Var) {
                                O3 = new p0j(teamSeasonStatisticsFragment, 4);
                                av8Var3.n0(O3);
                            }
                            r4a.j(W3, oxhVar3, (Function1) O3, null, uxhVar3, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var3, 0, 1000);
                        } else {
                            av8Var3.W();
                        }
                        break;
                }
                return Unit.a;
            }
        }, true));
        vxcVar.d.setContent(new tc3(703112107, new Function2(this) { // from class: q0j
            public final /* synthetic */ TeamSeasonStatisticsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object obj3;
                pxh pxhVar;
                int i3 = i2;
                a99 a99Var = nf3.a;
                boolean z = G;
                TeamSeasonStatisticsFragment teamSeasonStatisticsFragment = this.b;
                switch (i3) {
                    case 0:
                        of3 of3Var = (of3) obj;
                        int intValue = ((Integer) obj2).intValue();
                        av8 av8Var = (av8) of3Var;
                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                            av8Var.d0(1743140080);
                            List list = (List) ((eoh) teamSeasonStatisticsFragment.v).getValue();
                            ArrayList arrayList = new ArrayList(k13.r(list, 10));
                            Iterator it = list.iterator();
                            while (true) {
                                int i4 = 5;
                                if (it.hasNext()) {
                                    UniqueTournamentSeasonsSpinnerData uniqueTournamentSeasonsSpinnerData = (UniqueTournamentSeasonsSpinnerData) it.next();
                                    String name = uniqueTournamentSeasonsSpinnerData.getUniqueTournament().getName();
                                    tc3 H = yqo.H(1187268681, av8Var, new r0j(uniqueTournamentSeasonsSpinnerData, 0));
                                    Integer tennisPoints = uniqueTournamentSeasonsSpinnerData.getUniqueTournament().getTennisPoints();
                                    if (tennisPoints == null) {
                                        av8Var.d0(1726921165);
                                        av8Var.s(false);
                                        pxhVar = null;
                                    } else {
                                        av8Var.d0(1726921166);
                                        pxh pxhVar2 = new pxh(yqo.H(-2122888150, av8Var, new sj(teamSeasonStatisticsFragment, tennisPoints.intValue(), i4)), true);
                                        av8Var.s(false);
                                        pxhVar = pxhVar2;
                                    }
                                    arrayList.add(new oxh(uniqueTournamentSeasonsSpinnerData, name, H, null, pxhVar, false, 232));
                                } else {
                                    av8Var.s(false);
                                    gv9 W = l6g.W(arrayList);
                                    uxh uxhVar = z ? rxh.i : sxh.i;
                                    Iterator<E> it2 = W.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            obj3 = it2.next();
                                            if (Intrinsics.c(((oxh) obj3).a, teamSeasonStatisticsFragment.G())) {
                                            }
                                        } else {
                                            obj3 = null;
                                        }
                                    }
                                    oxh oxhVar = (oxh) obj3;
                                    oxh a = oxhVar != null ? oxh.a(oxhVar, null, null, null, 239) : null;
                                    boolean i5 = av8Var.i(teamSeasonStatisticsFragment);
                                    Object O = av8Var.O();
                                    if (i5 || O == a99Var) {
                                        O = new p0j(teamSeasonStatisticsFragment, i4);
                                        av8Var.n0(O);
                                    }
                                    r4a.j(W, a, (Function1) O, null, uxhVar, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, 1000);
                                }
                            }
                        } else {
                            av8Var.W();
                        }
                        break;
                    case 1:
                        of3 of3Var2 = (of3) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        av8 av8Var2 = (av8) of3Var2;
                        if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                            List<SeasonSpinnerData> list2 = (List) ((eoh) teamSeasonStatisticsFragment.w).getValue();
                            ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                            for (SeasonSpinnerData seasonSpinnerData : list2) {
                                arrayList2.add(new oxh(seasonSpinnerData, seasonSpinnerData.getYear(), null, null, null, false, 252));
                            }
                            gv9 W2 = l6g.W(arrayList2);
                            uxh uxhVar2 = z ? rxh.i : sxh.i;
                            Iterator<E> it3 = W2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    Object next = it3.next();
                                    if (Intrinsics.c(((oxh) next).a, teamSeasonStatisticsFragment.F())) {
                                        r3 = next;
                                    }
                                }
                            }
                            oxh oxhVar2 = r3;
                            boolean i6 = av8Var2.i(teamSeasonStatisticsFragment);
                            Object O2 = av8Var2.O();
                            if (i6 || O2 == a99Var) {
                                O2 = new p0j(teamSeasonStatisticsFragment, 6);
                                av8Var2.n0(O2);
                            }
                            r4a.j(W2, oxhVar2, (Function1) O2, null, uxhVar2, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 0, 1000);
                        } else {
                            av8Var2.W();
                        }
                        break;
                    default:
                        of3 of3Var3 = (of3) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        av8 av8Var3 = (av8) of3Var3;
                        if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                            List<oei> list3 = (List) teamSeasonStatisticsFragment.x.getValue();
                            ArrayList arrayList3 = new ArrayList(k13.r(list3, 10));
                            for (oei oeiVar2 : list3) {
                                arrayList3.add(new oxh(oeiVar2, teamSeasonStatisticsFragment.getString(oeiVar2.a), null, null, null, false, 252));
                            }
                            gv9 W3 = l6g.W(arrayList3);
                            uxh uxhVar3 = z ? rxh.i : sxh.i;
                            Iterator<E> it4 = W3.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    Object next2 = it4.next();
                                    if (((oxh) next2).a == ((oei) ((eoh) teamSeasonStatisticsFragment.B).getValue())) {
                                        r3 = next2;
                                    }
                                }
                            }
                            oxh oxhVar3 = r3;
                            boolean i7 = av8Var3.i(teamSeasonStatisticsFragment);
                            Object O3 = av8Var3.O();
                            if (i7 || O3 == a99Var) {
                                O3 = new p0j(teamSeasonStatisticsFragment, 4);
                                av8Var3.n0(O3);
                            }
                            r4a.j(W3, oxhVar3, (Function1) O3, null, uxhVar3, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var3, 0, 1000);
                        } else {
                            av8Var3.W();
                        }
                        break;
                }
                return Unit.a;
            }
        }, true));
        final int i3 = 2;
        if (Intrinsics.c(H(), Sports.BASKETBALL) || Intrinsics.c(H(), Sports.RUGBY)) {
            composeView2.setVisibility(0);
            composeView2.setContent(new tc3(-1675298353, new Function2(this) { // from class: q0j
                public final /* synthetic */ TeamSeasonStatisticsFragment b;

                {
                    this.b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Object obj3;
                    pxh pxhVar;
                    int i32 = i3;
                    a99 a99Var = nf3.a;
                    boolean z = G;
                    TeamSeasonStatisticsFragment teamSeasonStatisticsFragment = this.b;
                    switch (i32) {
                        case 0:
                            of3 of3Var = (of3) obj;
                            int intValue = ((Integer) obj2).intValue();
                            av8 av8Var = (av8) of3Var;
                            if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                av8Var.d0(1743140080);
                                List list = (List) ((eoh) teamSeasonStatisticsFragment.v).getValue();
                                ArrayList arrayList = new ArrayList(k13.r(list, 10));
                                Iterator it = list.iterator();
                                while (true) {
                                    int i4 = 5;
                                    if (it.hasNext()) {
                                        UniqueTournamentSeasonsSpinnerData uniqueTournamentSeasonsSpinnerData = (UniqueTournamentSeasonsSpinnerData) it.next();
                                        String name = uniqueTournamentSeasonsSpinnerData.getUniqueTournament().getName();
                                        tc3 H = yqo.H(1187268681, av8Var, new r0j(uniqueTournamentSeasonsSpinnerData, 0));
                                        Integer tennisPoints = uniqueTournamentSeasonsSpinnerData.getUniqueTournament().getTennisPoints();
                                        if (tennisPoints == null) {
                                            av8Var.d0(1726921165);
                                            av8Var.s(false);
                                            pxhVar = null;
                                        } else {
                                            av8Var.d0(1726921166);
                                            pxh pxhVar2 = new pxh(yqo.H(-2122888150, av8Var, new sj(teamSeasonStatisticsFragment, tennisPoints.intValue(), i4)), true);
                                            av8Var.s(false);
                                            pxhVar = pxhVar2;
                                        }
                                        arrayList.add(new oxh(uniqueTournamentSeasonsSpinnerData, name, H, null, pxhVar, false, 232));
                                    } else {
                                        av8Var.s(false);
                                        gv9 W = l6g.W(arrayList);
                                        uxh uxhVar = z ? rxh.i : sxh.i;
                                        Iterator<E> it2 = W.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                obj3 = it2.next();
                                                if (Intrinsics.c(((oxh) obj3).a, teamSeasonStatisticsFragment.G())) {
                                                }
                                            } else {
                                                obj3 = null;
                                            }
                                        }
                                        oxh oxhVar = (oxh) obj3;
                                        oxh a = oxhVar != null ? oxh.a(oxhVar, null, null, null, 239) : null;
                                        boolean i5 = av8Var.i(teamSeasonStatisticsFragment);
                                        Object O = av8Var.O();
                                        if (i5 || O == a99Var) {
                                            O = new p0j(teamSeasonStatisticsFragment, i4);
                                            av8Var.n0(O);
                                        }
                                        r4a.j(W, a, (Function1) O, null, uxhVar, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, 1000);
                                    }
                                }
                            } else {
                                av8Var.W();
                            }
                            break;
                        case 1:
                            of3 of3Var2 = (of3) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            av8 av8Var2 = (av8) of3Var2;
                            if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                                List<SeasonSpinnerData> list2 = (List) ((eoh) teamSeasonStatisticsFragment.w).getValue();
                                ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                                for (SeasonSpinnerData seasonSpinnerData : list2) {
                                    arrayList2.add(new oxh(seasonSpinnerData, seasonSpinnerData.getYear(), null, null, null, false, 252));
                                }
                                gv9 W2 = l6g.W(arrayList2);
                                uxh uxhVar2 = z ? rxh.i : sxh.i;
                                Iterator<E> it3 = W2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        Object next = it3.next();
                                        if (Intrinsics.c(((oxh) next).a, teamSeasonStatisticsFragment.F())) {
                                            r3 = next;
                                        }
                                    }
                                }
                                oxh oxhVar2 = r3;
                                boolean i6 = av8Var2.i(teamSeasonStatisticsFragment);
                                Object O2 = av8Var2.O();
                                if (i6 || O2 == a99Var) {
                                    O2 = new p0j(teamSeasonStatisticsFragment, 6);
                                    av8Var2.n0(O2);
                                }
                                r4a.j(W2, oxhVar2, (Function1) O2, null, uxhVar2, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 0, 1000);
                            } else {
                                av8Var2.W();
                            }
                            break;
                        default:
                            of3 of3Var3 = (of3) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            av8 av8Var3 = (av8) of3Var3;
                            if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                                List<oei> list3 = (List) teamSeasonStatisticsFragment.x.getValue();
                                ArrayList arrayList3 = new ArrayList(k13.r(list3, 10));
                                for (oei oeiVar2 : list3) {
                                    arrayList3.add(new oxh(oeiVar2, teamSeasonStatisticsFragment.getString(oeiVar2.a), null, null, null, false, 252));
                                }
                                gv9 W3 = l6g.W(arrayList3);
                                uxh uxhVar3 = z ? rxh.i : sxh.i;
                                Iterator<E> it4 = W3.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        Object next2 = it4.next();
                                        if (((oxh) next2).a == ((oei) ((eoh) teamSeasonStatisticsFragment.B).getValue())) {
                                            r3 = next2;
                                        }
                                    }
                                }
                                oxh oxhVar3 = r3;
                                boolean i7 = av8Var3.i(teamSeasonStatisticsFragment);
                                Object O3 = av8Var3.O();
                                if (i7 || O3 == a99Var) {
                                    O3 = new p0j(teamSeasonStatisticsFragment, 4);
                                    av8Var3.n0(O3);
                                }
                                r4a.j(W3, oxhVar3, (Function1) O3, null, uxhVar3, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var3, 0, 1000);
                            } else {
                                av8Var3.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            }, true));
        } else {
            composeView2.setVisibility(8);
        }
        if (Intrinsics.c(H(), Sports.BASKETBALL)) {
            mqi mqiVar = this.D;
            SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) mqiVar.getValue();
            segmentedButtonsView.getClass();
            Boolean bool = Boolean.FALSE;
            Pair pair = new Pair(bool, bool);
            rfi rfiVar = new rfi(29);
            segmentedButtonsView.k = new q8i(this, 14);
            segmentedButtonsView.g = false;
            segmentedButtonsView.h = pair;
            segmentedButtonsView.j = v1h.f;
            segmentedButtonsView.i = rfiVar;
            rlh rlhVar = rlh.b;
            if (!rlhVar.isEmpty()) {
                SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
            }
            krk krkVar7 = this.l;
            krkVar7.getClass();
            ((eq8) krkVar7).b.addView((SegmentedButtonsView) mqiVar.getValue());
        }
        L().h.e(getViewLifecycleOwner(), new ioe(24, new p0j(this, i)));
        L().j.e(getViewLifecycleOwner(), new ioe(24, new p0j(this, i2)));
        if (Intrinsics.c(H(), Sports.TENNIS)) {
            krk krkVar8 = this.l;
            krkVar8.getClass();
            g5k g5kVar = new g5k(((eq8) krkVar8).f);
            g5kVar.m = new ur1(this, 23);
            g5kVar.b();
            L().l.e(getViewLifecycleOwner(), new ioe(24, new p0j(this, i3)));
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        if (L().h.d() != null) {
            n();
            return;
        }
        y0j L = L();
        xw3.L(un0.z(L), null, null, new zni(L, I().getId(), null, 1), 3);
    }
}
