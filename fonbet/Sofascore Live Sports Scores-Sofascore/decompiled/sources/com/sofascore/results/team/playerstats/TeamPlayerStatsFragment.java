package com.sofascore.results.team.playerstats;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.ironsource.W3;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.SeasonKt;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.team.playerstats.TeamPlayerStatsFragment;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import com.unity3d.services.UnityAdsConstants;
import defpackage.aba;
import defpackage.bte;
import defpackage.bxi;
import defpackage.chf;
import defpackage.ck;
import defpackage.duf;
import defpackage.e1d;
import defpackage.eoh;
import defpackage.f89;
import defpackage.fuf;
import defpackage.fwi;
import defpackage.fyi;
import defpackage.gz6;
import defpackage.hkg;
import defpackage.ioe;
import defpackage.joa;
import defpackage.km5;
import defpackage.krk;
import defpackage.l8;
import defpackage.lk2;
import defpackage.mqi;
import defpackage.myi;
import defpackage.n9e;
import defpackage.nk2;
import defpackage.o1i;
import defpackage.otk;
import defpackage.oyi;
import defpackage.ple;
import defpackage.r9k;
import defpackage.rq3;
import defpackage.syi;
import defpackage.ta0;
import defpackage.tc3;
import defpackage.tug;
import defpackage.tyi;
import defpackage.un0;
import defpackage.w9g;
import defpackage.wxc;
import defpackage.xq8;
import defpackage.xw3;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/team/playerstats/TeamPlayerStatsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lxq8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TeamPlayerStatsFragment extends Hilt_TeamPlayerStatsFragment<xq8> {
    public final e1d A;
    public final e1d B;
    public final joa C;
    public final otk r;
    public final otk s;
    public final joa t;
    public final joa u;
    public final joa v;
    public final mqi w;
    public final joa x;
    public final e1d y;
    public final e1d z;

    public TeamPlayerStatsFragment() {
        final int i = 3;
        oyi oyiVar = new oyi(this, 3);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new o1i(oyiVar, 23));
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(tyi.class), new fwi(a, 7), new bte(this, a, 24), new fwi(a, 8));
        final int i2 = 0;
        final int i3 = 1;
        final int i4 = 2;
        this.s = new otk(fufVar.getOrCreateKotlinClass(ple.class), new oyi(this, 0), new oyi(this, 2), new oyi(this, 1));
        this.t = ypa.a(ysaVar, new Function0(this) { // from class: kyi
            public final /* synthetic */ TeamPlayerStatsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                TeamPlayerStatsFragment teamPlayerStatsFragment = this.b;
                switch (i5) {
                    case 0:
                        LayoutInflater layoutInflater = teamPlayerStatsFragment.getLayoutInflater();
                        krk krkVar = teamPlayerStatsFragment.l;
                        krkVar.getClass();
                        wxc a2 = wxc.a(layoutInflater, ((xq8) krkVar).c);
                        a2.e.setVisibility(8);
                        return a2;
                    case 1:
                        return Boolean.valueOf(teamPlayerStatsFragment.F().d.equals(Sports.AMERICAN_FOOTBALL));
                    case 2:
                        Context requireContext = teamPlayerStatsFragment.requireContext();
                        requireContext.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.m = new ur1(teamPlayerStatsFragment, 22);
                        g5kVar.b();
                        return typeHeaderView;
                    case 3:
                        LayoutInflater layoutInflater2 = teamPlayerStatsFragment.getLayoutInflater();
                        krk krkVar2 = teamPlayerStatsFragment.l;
                        krkVar2.getClass();
                        View inflate = layoutInflater2.inflate(R.layout.header_team_player_category_names, (ViewGroup) ((xq8) krkVar2).a, false);
                        int i6 = R.id.container;
                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.container, inflate);
                        if (linearLayout != null) {
                            i6 = R.id.left_button;
                            ImageView imageView = (ImageView) nq8.B(R.id.left_button, inflate);
                            if (imageView != null) {
                                i6 = R.id.legend_button;
                                TextView textView = (TextView) nq8.B(R.id.legend_button, inflate);
                                if (textView != null) {
                                    i6 = R.id.right_button;
                                    ImageView imageView2 = (ImageView) nq8.B(R.id.right_button, inflate);
                                    if (imageView2 != null) {
                                        i6 = R.id.scroller;
                                        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) nq8.B(R.id.scroller, inflate);
                                        if (scrollInterceptorHorizontalScrollView != null) {
                                            f89 f89Var = new f89(imageView, imageView2, linearLayout, textView, (ConstraintLayout) inflate, scrollInterceptorHorizontalScrollView);
                                            textView.setOnClickListener(new myi(teamPlayerStatsFragment, 0));
                                            return f89Var;
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                        return null;
                    case 4:
                        Context requireContext2 = teamPlayerStatsFragment.requireContext();
                        requireContext2.getClass();
                        GraphicLarge graphicLarge = new GraphicLarge(requireContext2, null, 6);
                        graphicLarge.setLargeDrawableResource(teamPlayerStatsFragment.requireContext().getDrawable(R.drawable.no_data));
                        String string = teamPlayerStatsFragment.requireContext().getString(R.string.empty_search_title);
                        string.getClass();
                        graphicLarge.setTitleResource(string);
                        String string2 = teamPlayerStatsFragment.requireContext().getString(R.string.empty_filters_text);
                        string2.getClass();
                        graphicLarge.setSubtitleResource(string2);
                        aba.G(graphicLarge);
                        return graphicLarge;
                    default:
                        Context requireContext3 = teamPlayerStatsFragment.requireContext();
                        requireContext3.getClass();
                        fyi fyiVar = new fyi(requireContext3, (tug) teamPlayerStatsFragment.C.getValue(), teamPlayerStatsFragment.F().d);
                        fyiVar.a.d = new uri(teamPlayerStatsFragment, 3);
                        return fyiVar;
                }
            }
        });
        this.u = n9e.M(new Function0(this) { // from class: kyi
            public final /* synthetic */ TeamPlayerStatsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                TeamPlayerStatsFragment teamPlayerStatsFragment = this.b;
                switch (i5) {
                    case 0:
                        LayoutInflater layoutInflater = teamPlayerStatsFragment.getLayoutInflater();
                        krk krkVar = teamPlayerStatsFragment.l;
                        krkVar.getClass();
                        wxc a2 = wxc.a(layoutInflater, ((xq8) krkVar).c);
                        a2.e.setVisibility(8);
                        return a2;
                    case 1:
                        return Boolean.valueOf(teamPlayerStatsFragment.F().d.equals(Sports.AMERICAN_FOOTBALL));
                    case 2:
                        Context requireContext = teamPlayerStatsFragment.requireContext();
                        requireContext.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.m = new ur1(teamPlayerStatsFragment, 22);
                        g5kVar.b();
                        return typeHeaderView;
                    case 3:
                        LayoutInflater layoutInflater2 = teamPlayerStatsFragment.getLayoutInflater();
                        krk krkVar2 = teamPlayerStatsFragment.l;
                        krkVar2.getClass();
                        View inflate = layoutInflater2.inflate(R.layout.header_team_player_category_names, (ViewGroup) ((xq8) krkVar2).a, false);
                        int i6 = R.id.container;
                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.container, inflate);
                        if (linearLayout != null) {
                            i6 = R.id.left_button;
                            ImageView imageView = (ImageView) nq8.B(R.id.left_button, inflate);
                            if (imageView != null) {
                                i6 = R.id.legend_button;
                                TextView textView = (TextView) nq8.B(R.id.legend_button, inflate);
                                if (textView != null) {
                                    i6 = R.id.right_button;
                                    ImageView imageView2 = (ImageView) nq8.B(R.id.right_button, inflate);
                                    if (imageView2 != null) {
                                        i6 = R.id.scroller;
                                        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) nq8.B(R.id.scroller, inflate);
                                        if (scrollInterceptorHorizontalScrollView != null) {
                                            f89 f89Var = new f89(imageView, imageView2, linearLayout, textView, (ConstraintLayout) inflate, scrollInterceptorHorizontalScrollView);
                                            textView.setOnClickListener(new myi(teamPlayerStatsFragment, 0));
                                            return f89Var;
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                        return null;
                    case 4:
                        Context requireContext2 = teamPlayerStatsFragment.requireContext();
                        requireContext2.getClass();
                        GraphicLarge graphicLarge = new GraphicLarge(requireContext2, null, 6);
                        graphicLarge.setLargeDrawableResource(teamPlayerStatsFragment.requireContext().getDrawable(R.drawable.no_data));
                        String string = teamPlayerStatsFragment.requireContext().getString(R.string.empty_search_title);
                        string.getClass();
                        graphicLarge.setTitleResource(string);
                        String string2 = teamPlayerStatsFragment.requireContext().getString(R.string.empty_filters_text);
                        string2.getClass();
                        graphicLarge.setSubtitleResource(string2);
                        aba.G(graphicLarge);
                        return graphicLarge;
                    default:
                        Context requireContext3 = teamPlayerStatsFragment.requireContext();
                        requireContext3.getClass();
                        fyi fyiVar = new fyi(requireContext3, (tug) teamPlayerStatsFragment.C.getValue(), teamPlayerStatsFragment.F().d);
                        fyiVar.a.d = new uri(teamPlayerStatsFragment, 3);
                        return fyiVar;
                }
            }
        }, new Function0(this) { // from class: kyi
            public final /* synthetic */ TeamPlayerStatsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i4;
                TeamPlayerStatsFragment teamPlayerStatsFragment = this.b;
                switch (i5) {
                    case 0:
                        LayoutInflater layoutInflater = teamPlayerStatsFragment.getLayoutInflater();
                        krk krkVar = teamPlayerStatsFragment.l;
                        krkVar.getClass();
                        wxc a2 = wxc.a(layoutInflater, ((xq8) krkVar).c);
                        a2.e.setVisibility(8);
                        return a2;
                    case 1:
                        return Boolean.valueOf(teamPlayerStatsFragment.F().d.equals(Sports.AMERICAN_FOOTBALL));
                    case 2:
                        Context requireContext = teamPlayerStatsFragment.requireContext();
                        requireContext.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.m = new ur1(teamPlayerStatsFragment, 22);
                        g5kVar.b();
                        return typeHeaderView;
                    case 3:
                        LayoutInflater layoutInflater2 = teamPlayerStatsFragment.getLayoutInflater();
                        krk krkVar2 = teamPlayerStatsFragment.l;
                        krkVar2.getClass();
                        View inflate = layoutInflater2.inflate(R.layout.header_team_player_category_names, (ViewGroup) ((xq8) krkVar2).a, false);
                        int i6 = R.id.container;
                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.container, inflate);
                        if (linearLayout != null) {
                            i6 = R.id.left_button;
                            ImageView imageView = (ImageView) nq8.B(R.id.left_button, inflate);
                            if (imageView != null) {
                                i6 = R.id.legend_button;
                                TextView textView = (TextView) nq8.B(R.id.legend_button, inflate);
                                if (textView != null) {
                                    i6 = R.id.right_button;
                                    ImageView imageView2 = (ImageView) nq8.B(R.id.right_button, inflate);
                                    if (imageView2 != null) {
                                        i6 = R.id.scroller;
                                        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) nq8.B(R.id.scroller, inflate);
                                        if (scrollInterceptorHorizontalScrollView != null) {
                                            f89 f89Var = new f89(imageView, imageView2, linearLayout, textView, (ConstraintLayout) inflate, scrollInterceptorHorizontalScrollView);
                                            textView.setOnClickListener(new myi(teamPlayerStatsFragment, 0));
                                            return f89Var;
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                        return null;
                    case 4:
                        Context requireContext2 = teamPlayerStatsFragment.requireContext();
                        requireContext2.getClass();
                        GraphicLarge graphicLarge = new GraphicLarge(requireContext2, null, 6);
                        graphicLarge.setLargeDrawableResource(teamPlayerStatsFragment.requireContext().getDrawable(R.drawable.no_data));
                        String string = teamPlayerStatsFragment.requireContext().getString(R.string.empty_search_title);
                        string.getClass();
                        graphicLarge.setTitleResource(string);
                        String string2 = teamPlayerStatsFragment.requireContext().getString(R.string.empty_filters_text);
                        string2.getClass();
                        graphicLarge.setSubtitleResource(string2);
                        aba.G(graphicLarge);
                        return graphicLarge;
                    default:
                        Context requireContext3 = teamPlayerStatsFragment.requireContext();
                        requireContext3.getClass();
                        fyi fyiVar = new fyi(requireContext3, (tug) teamPlayerStatsFragment.C.getValue(), teamPlayerStatsFragment.F().d);
                        fyiVar.a.d = new uri(teamPlayerStatsFragment, 3);
                        return fyiVar;
                }
            }
        });
        this.v = ypa.a(ysaVar, new Function0(this) { // from class: kyi
            public final /* synthetic */ TeamPlayerStatsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                TeamPlayerStatsFragment teamPlayerStatsFragment = this.b;
                switch (i5) {
                    case 0:
                        LayoutInflater layoutInflater = teamPlayerStatsFragment.getLayoutInflater();
                        krk krkVar = teamPlayerStatsFragment.l;
                        krkVar.getClass();
                        wxc a2 = wxc.a(layoutInflater, ((xq8) krkVar).c);
                        a2.e.setVisibility(8);
                        return a2;
                    case 1:
                        return Boolean.valueOf(teamPlayerStatsFragment.F().d.equals(Sports.AMERICAN_FOOTBALL));
                    case 2:
                        Context requireContext = teamPlayerStatsFragment.requireContext();
                        requireContext.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.m = new ur1(teamPlayerStatsFragment, 22);
                        g5kVar.b();
                        return typeHeaderView;
                    case 3:
                        LayoutInflater layoutInflater2 = teamPlayerStatsFragment.getLayoutInflater();
                        krk krkVar2 = teamPlayerStatsFragment.l;
                        krkVar2.getClass();
                        View inflate = layoutInflater2.inflate(R.layout.header_team_player_category_names, (ViewGroup) ((xq8) krkVar2).a, false);
                        int i6 = R.id.container;
                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.container, inflate);
                        if (linearLayout != null) {
                            i6 = R.id.left_button;
                            ImageView imageView = (ImageView) nq8.B(R.id.left_button, inflate);
                            if (imageView != null) {
                                i6 = R.id.legend_button;
                                TextView textView = (TextView) nq8.B(R.id.legend_button, inflate);
                                if (textView != null) {
                                    i6 = R.id.right_button;
                                    ImageView imageView2 = (ImageView) nq8.B(R.id.right_button, inflate);
                                    if (imageView2 != null) {
                                        i6 = R.id.scroller;
                                        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) nq8.B(R.id.scroller, inflate);
                                        if (scrollInterceptorHorizontalScrollView != null) {
                                            f89 f89Var = new f89(imageView, imageView2, linearLayout, textView, (ConstraintLayout) inflate, scrollInterceptorHorizontalScrollView);
                                            textView.setOnClickListener(new myi(teamPlayerStatsFragment, 0));
                                            return f89Var;
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                        return null;
                    case 4:
                        Context requireContext2 = teamPlayerStatsFragment.requireContext();
                        requireContext2.getClass();
                        GraphicLarge graphicLarge = new GraphicLarge(requireContext2, null, 6);
                        graphicLarge.setLargeDrawableResource(teamPlayerStatsFragment.requireContext().getDrawable(R.drawable.no_data));
                        String string = teamPlayerStatsFragment.requireContext().getString(R.string.empty_search_title);
                        string.getClass();
                        graphicLarge.setTitleResource(string);
                        String string2 = teamPlayerStatsFragment.requireContext().getString(R.string.empty_filters_text);
                        string2.getClass();
                        graphicLarge.setSubtitleResource(string2);
                        aba.G(graphicLarge);
                        return graphicLarge;
                    default:
                        Context requireContext3 = teamPlayerStatsFragment.requireContext();
                        requireContext3.getClass();
                        fyi fyiVar = new fyi(requireContext3, (tug) teamPlayerStatsFragment.C.getValue(), teamPlayerStatsFragment.F().d);
                        fyiVar.a.d = new uri(teamPlayerStatsFragment, 3);
                        return fyiVar;
                }
            }
        });
        final int i5 = 4;
        this.w = ypa.b(new Function0(this) { // from class: kyi
            public final /* synthetic */ TeamPlayerStatsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i52 = i5;
                TeamPlayerStatsFragment teamPlayerStatsFragment = this.b;
                switch (i52) {
                    case 0:
                        LayoutInflater layoutInflater = teamPlayerStatsFragment.getLayoutInflater();
                        krk krkVar = teamPlayerStatsFragment.l;
                        krkVar.getClass();
                        wxc a2 = wxc.a(layoutInflater, ((xq8) krkVar).c);
                        a2.e.setVisibility(8);
                        return a2;
                    case 1:
                        return Boolean.valueOf(teamPlayerStatsFragment.F().d.equals(Sports.AMERICAN_FOOTBALL));
                    case 2:
                        Context requireContext = teamPlayerStatsFragment.requireContext();
                        requireContext.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.m = new ur1(teamPlayerStatsFragment, 22);
                        g5kVar.b();
                        return typeHeaderView;
                    case 3:
                        LayoutInflater layoutInflater2 = teamPlayerStatsFragment.getLayoutInflater();
                        krk krkVar2 = teamPlayerStatsFragment.l;
                        krkVar2.getClass();
                        View inflate = layoutInflater2.inflate(R.layout.header_team_player_category_names, (ViewGroup) ((xq8) krkVar2).a, false);
                        int i6 = R.id.container;
                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.container, inflate);
                        if (linearLayout != null) {
                            i6 = R.id.left_button;
                            ImageView imageView = (ImageView) nq8.B(R.id.left_button, inflate);
                            if (imageView != null) {
                                i6 = R.id.legend_button;
                                TextView textView = (TextView) nq8.B(R.id.legend_button, inflate);
                                if (textView != null) {
                                    i6 = R.id.right_button;
                                    ImageView imageView2 = (ImageView) nq8.B(R.id.right_button, inflate);
                                    if (imageView2 != null) {
                                        i6 = R.id.scroller;
                                        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) nq8.B(R.id.scroller, inflate);
                                        if (scrollInterceptorHorizontalScrollView != null) {
                                            f89 f89Var = new f89(imageView, imageView2, linearLayout, textView, (ConstraintLayout) inflate, scrollInterceptorHorizontalScrollView);
                                            textView.setOnClickListener(new myi(teamPlayerStatsFragment, 0));
                                            return f89Var;
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                        return null;
                    case 4:
                        Context requireContext2 = teamPlayerStatsFragment.requireContext();
                        requireContext2.getClass();
                        GraphicLarge graphicLarge = new GraphicLarge(requireContext2, null, 6);
                        graphicLarge.setLargeDrawableResource(teamPlayerStatsFragment.requireContext().getDrawable(R.drawable.no_data));
                        String string = teamPlayerStatsFragment.requireContext().getString(R.string.empty_search_title);
                        string.getClass();
                        graphicLarge.setTitleResource(string);
                        String string2 = teamPlayerStatsFragment.requireContext().getString(R.string.empty_filters_text);
                        string2.getClass();
                        graphicLarge.setSubtitleResource(string2);
                        aba.G(graphicLarge);
                        return graphicLarge;
                    default:
                        Context requireContext3 = teamPlayerStatsFragment.requireContext();
                        requireContext3.getClass();
                        fyi fyiVar = new fyi(requireContext3, (tug) teamPlayerStatsFragment.C.getValue(), teamPlayerStatsFragment.F().d);
                        fyiVar.a.d = new uri(teamPlayerStatsFragment, 3);
                        return fyiVar;
                }
            }
        });
        final int i6 = 5;
        this.x = ypa.a(ysaVar, new Function0(this) { // from class: kyi
            public final /* synthetic */ TeamPlayerStatsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i52 = i6;
                TeamPlayerStatsFragment teamPlayerStatsFragment = this.b;
                switch (i52) {
                    case 0:
                        LayoutInflater layoutInflater = teamPlayerStatsFragment.getLayoutInflater();
                        krk krkVar = teamPlayerStatsFragment.l;
                        krkVar.getClass();
                        wxc a2 = wxc.a(layoutInflater, ((xq8) krkVar).c);
                        a2.e.setVisibility(8);
                        return a2;
                    case 1:
                        return Boolean.valueOf(teamPlayerStatsFragment.F().d.equals(Sports.AMERICAN_FOOTBALL));
                    case 2:
                        Context requireContext = teamPlayerStatsFragment.requireContext();
                        requireContext.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.m = new ur1(teamPlayerStatsFragment, 22);
                        g5kVar.b();
                        return typeHeaderView;
                    case 3:
                        LayoutInflater layoutInflater2 = teamPlayerStatsFragment.getLayoutInflater();
                        krk krkVar2 = teamPlayerStatsFragment.l;
                        krkVar2.getClass();
                        View inflate = layoutInflater2.inflate(R.layout.header_team_player_category_names, (ViewGroup) ((xq8) krkVar2).a, false);
                        int i62 = R.id.container;
                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.container, inflate);
                        if (linearLayout != null) {
                            i62 = R.id.left_button;
                            ImageView imageView = (ImageView) nq8.B(R.id.left_button, inflate);
                            if (imageView != null) {
                                i62 = R.id.legend_button;
                                TextView textView = (TextView) nq8.B(R.id.legend_button, inflate);
                                if (textView != null) {
                                    i62 = R.id.right_button;
                                    ImageView imageView2 = (ImageView) nq8.B(R.id.right_button, inflate);
                                    if (imageView2 != null) {
                                        i62 = R.id.scroller;
                                        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) nq8.B(R.id.scroller, inflate);
                                        if (scrollInterceptorHorizontalScrollView != null) {
                                            f89 f89Var = new f89(imageView, imageView2, linearLayout, textView, (ConstraintLayout) inflate, scrollInterceptorHorizontalScrollView);
                                            textView.setOnClickListener(new myi(teamPlayerStatsFragment, 0));
                                            return f89Var;
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i62)));
                        return null;
                    case 4:
                        Context requireContext2 = teamPlayerStatsFragment.requireContext();
                        requireContext2.getClass();
                        GraphicLarge graphicLarge = new GraphicLarge(requireContext2, null, 6);
                        graphicLarge.setLargeDrawableResource(teamPlayerStatsFragment.requireContext().getDrawable(R.drawable.no_data));
                        String string = teamPlayerStatsFragment.requireContext().getString(R.string.empty_search_title);
                        string.getClass();
                        graphicLarge.setTitleResource(string);
                        String string2 = teamPlayerStatsFragment.requireContext().getString(R.string.empty_filters_text);
                        string2.getClass();
                        graphicLarge.setSubtitleResource(string2);
                        aba.G(graphicLarge);
                        return graphicLarge;
                    default:
                        Context requireContext3 = teamPlayerStatsFragment.requireContext();
                        requireContext3.getClass();
                        fyi fyiVar = new fyi(requireContext3, (tug) teamPlayerStatsFragment.C.getValue(), teamPlayerStatsFragment.F().d);
                        fyiVar.a.d = new uri(teamPlayerStatsFragment, 3);
                        return fyiVar;
                }
            }
        });
        km5 km5Var = km5.a;
        this.y = e.f(km5Var);
        this.z = e.f(km5Var);
        this.A = e.f(null);
        this.B = e.f(null);
        this.C = ypa.a(ysaVar, new bxi(9));
    }

    public static void C(AppBarLayout appBarLayout, ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        ta0 ta0Var = layoutParams != null ? new ta0(layoutParams) : new ta0(-2);
        ta0Var.a = 0;
        Unit unit = Unit.a;
        appBarLayout.addView(viewGroup, ta0Var);
    }

    public final f89 D() {
        return (f89) this.v.getValue();
    }

    public final Gender E() {
        Player player = ((ple) this.s.getValue()).l;
        if (player != null) {
            return player.getGender();
        }
        return null;
    }

    public final tyi F() {
        return (tyi) this.r.getValue();
    }

    public final void G(nk2 nk2Var, tug tugVar, int i, boolean z) {
        TextView textView;
        f89 D = D();
        int i2 = 0;
        for (Object obj : nk2Var.g()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            lk2 lk2Var = (lk2) obj;
            LinearLayout linearLayout = D.b;
            if (i2 < linearLayout.getChildCount()) {
                View childAt = linearLayout.getChildAt(i2);
                if (childAt == null) {
                    yhk.s("null cannot be cast to non-null type android.widget.TextView");
                    return;
                } else {
                    textView = (TextView) childAt;
                    textView.setVisibility(0);
                }
            } else {
                View inflate = LayoutInflater.from(D.a.getContext()).inflate(R.layout.header_team_player_category_item, (ViewGroup) linearLayout, false);
                if (inflate == null) {
                    yhk.s("rootView");
                    return;
                } else {
                    textView = (TextView) inflate;
                    linearLayout.addView(textView);
                }
            }
            r9k r9kVar = (r9k) lk2Var.j().invoke(E());
            Context context = textView.getContext();
            context.getClass();
            textView.setText(r9kVar.b(context));
            textView.setSelected(i2 == i);
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, textView.isSelected() ? R.drawable.ic_arrow_drop_down_16 : 0);
            textView.setCompoundDrawableTintList(ColorStateList.valueOf(textView.getContext().getColor(R.color.primary_default)));
            if (i2 < b.i(nk2Var.g())) {
                textView.setBackgroundResource(R.drawable.bg_end_divider);
            } else {
                textView.setBackground(null);
            }
            textView.setOnClickListener(new l8(this, i2, 13));
            z8e.J(linearLayout, b.i(nk2Var.g()));
            i2 = i3;
        }
        tugVar.a(D.e, new chf(1, this, TeamPlayerStatsFragment.class, "updateScrollIndicators", "updateScrollIndicators(I)V", 0, 23));
        ConstraintLayout constraintLayout = D.a;
        constraintLayout.getClass();
        t(constraintLayout, new ck(this, i, z, tugVar, D));
    }

    public final void H(int i) {
        f89 D = D();
        int width = D.b.getWidth() - D.e.getWidth();
        Context requireContext = requireContext();
        requireContext.getClass();
        boolean c0 = hkg.c0(requireContext);
        int i2 = 4;
        D.c.setVisibility((!c0 ? i == 0 : i == width) ? 0 : 4);
        ImageView imageView = D.d;
        if (!c0 ? i != width : i != 0) {
            i2 = 0;
        }
        imageView.setVisibility(i2);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return xq8.a(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "PlayerStatsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        l();
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((xq8) krkVar).d;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((xq8) krkVar2).c;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((xq8) krkVar3).c.setAdapter((fyi) this.x.getValue());
        krk krkVar4 = this.l;
        krkVar4.getClass();
        aba.G(((xq8) krkVar4).c);
        krk krkVar5 = this.l;
        krkVar5.getClass();
        AppBarLayout appBarLayout = ((xq8) krkVar5).b;
        joa joaVar = this.t;
        ConstraintLayout constraintLayout = ((wxc) joaVar.getValue()).a;
        constraintLayout.getClass();
        C(appBarLayout, constraintLayout);
        TypeHeaderView typeHeaderView = (TypeHeaderView) this.u.getValue();
        if (typeHeaderView != null) {
            C(appBarLayout, typeHeaderView);
        }
        ConstraintLayout constraintLayout2 = D().a;
        constraintLayout2.getClass();
        C(appBarLayout, constraintLayout2);
        wxc wxcVar = (wxc) joaVar.getValue();
        ComposeView composeView = wxcVar.c;
        ImageView imageView = wxcVar.b;
        final int i = 0;
        final int i2 = 1;
        composeView.setContent(new tc3(2140288305, new Function2(this) { // from class: nyi
            public final /* synthetic */ TeamPlayerStatsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i3 = i;
                a99 a99Var = nf3.a;
                Object obj3 = null;
                final TeamPlayerStatsFragment teamPlayerStatsFragment = this.b;
                final int i4 = 0;
                final int i5 = 1;
                switch (i3) {
                    case 0:
                        of3 of3Var = (of3) obj;
                        int intValue = ((Integer) obj2).intValue();
                        av8 av8Var = (av8) of3Var;
                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                            av8Var.d0(-472271719);
                            List<syi> list = (List) ((eoh) teamPlayerStatsFragment.y).getValue();
                            ArrayList arrayList = new ArrayList(k13.r(list, 10));
                            for (syi syiVar : list) {
                                arrayList.add(new oxh(syiVar, syiVar.b.getYear(), yqo.H(931770838, av8Var, new uri(syiVar, 4)), null, null, false, 248));
                            }
                            av8Var.s(false);
                            gv9 W = l6g.W(arrayList);
                            Iterator<E> it = W.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (Intrinsics.c(((oxh) next).a, (syi) ((eoh) teamPlayerStatsFragment.A).getValue())) {
                                        obj3 = next;
                                    }
                                }
                            }
                            oxh oxhVar = (oxh) obj3;
                            boolean i6 = av8Var.i(teamPlayerStatsFragment);
                            Object O = av8Var.O();
                            if (i6 || O == a99Var) {
                                O = new Function1() { // from class: lyi
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        int i7 = i5;
                                        TeamPlayerStatsFragment teamPlayerStatsFragment2 = teamPlayerStatsFragment;
                                        switch (i7) {
                                            case 0:
                                                Season.SubSeasonType subSeasonType = (Season.SubSeasonType) obj4;
                                                subSeasonType.getClass();
                                                ((eoh) teamPlayerStatsFragment2.B).setValue(subSeasonType);
                                                teamPlayerStatsFragment2.u();
                                                break;
                                            default:
                                                syi syiVar2 = (syi) obj4;
                                                syiVar2.getClass();
                                                ((eoh) teamPlayerStatsFragment2.A).setValue(syiVar2);
                                                List<Season.SubSeasonType> mapToSubSeasonType = SeasonKt.mapToSubSeasonType(syiVar2.c);
                                                e1d e1dVar = teamPlayerStatsFragment2.z;
                                                ((eoh) e1dVar).setValue(mapToSubSeasonType);
                                                ((eoh) teamPlayerStatsFragment2.B).setValue((Season.SubSeasonType) CollectionsKt.firstOrNull((List) ((eoh) e1dVar).getValue()));
                                                teamPlayerStatsFragment2.u();
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                };
                                av8Var.n0(O);
                            }
                            r4a.j(W, oxhVar, (Function1) O, null, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, W3.l);
                        } else {
                            av8Var.W();
                        }
                        break;
                    default:
                        of3 of3Var2 = (of3) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        av8 av8Var2 = (av8) of3Var2;
                        if (av8Var2.T(1 & intValue2, (intValue2 & 3) != 2)) {
                            List<Season.SubSeasonType> list2 = (List) ((eoh) teamPlayerStatsFragment.z).getValue();
                            ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                            for (Season.SubSeasonType subSeasonType : list2) {
                                Set set = f5k.a;
                                Context requireContext2 = teamPlayerStatsFragment.requireContext();
                                requireContext2.getClass();
                                arrayList2.add(new oxh(subSeasonType, f5k.b(requireContext2, subSeasonType.getLabel(), teamPlayerStatsFragment.F().d), null, null, null, false, 252));
                            }
                            gv9 W2 = l6g.W(arrayList2);
                            Iterator<E> it2 = W2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    if (((oxh) next2).a == ((Season.SubSeasonType) ((eoh) teamPlayerStatsFragment.B).getValue())) {
                                        obj3 = next2;
                                    }
                                }
                            }
                            oxh oxhVar2 = (oxh) obj3;
                            boolean i7 = av8Var2.i(teamPlayerStatsFragment);
                            Object O2 = av8Var2.O();
                            if (i7 || O2 == a99Var) {
                                O2 = new Function1() { // from class: lyi
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        int i72 = i4;
                                        TeamPlayerStatsFragment teamPlayerStatsFragment2 = teamPlayerStatsFragment;
                                        switch (i72) {
                                            case 0:
                                                Season.SubSeasonType subSeasonType2 = (Season.SubSeasonType) obj4;
                                                subSeasonType2.getClass();
                                                ((eoh) teamPlayerStatsFragment2.B).setValue(subSeasonType2);
                                                teamPlayerStatsFragment2.u();
                                                break;
                                            default:
                                                syi syiVar2 = (syi) obj4;
                                                syiVar2.getClass();
                                                ((eoh) teamPlayerStatsFragment2.A).setValue(syiVar2);
                                                List<Season.SubSeasonType> mapToSubSeasonType = SeasonKt.mapToSubSeasonType(syiVar2.c);
                                                e1d e1dVar = teamPlayerStatsFragment2.z;
                                                ((eoh) e1dVar).setValue(mapToSubSeasonType);
                                                ((eoh) teamPlayerStatsFragment2.B).setValue((Season.SubSeasonType) CollectionsKt.firstOrNull((List) ((eoh) e1dVar).getValue()));
                                                teamPlayerStatsFragment2.u();
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                };
                                av8Var2.n0(O2);
                            }
                            r4a.j(W2, oxhVar2, (Function1) O2, null, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 0, W3.l);
                        } else {
                            av8Var2.W();
                        }
                        break;
                }
                return Unit.a;
            }
        }, true));
        wxcVar.d.setContent(new tc3(-129157272, new Function2(this) { // from class: nyi
            public final /* synthetic */ TeamPlayerStatsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i3 = i2;
                a99 a99Var = nf3.a;
                Object obj3 = null;
                final TeamPlayerStatsFragment teamPlayerStatsFragment = this.b;
                final int i4 = 0;
                final int i5 = 1;
                switch (i3) {
                    case 0:
                        of3 of3Var = (of3) obj;
                        int intValue = ((Integer) obj2).intValue();
                        av8 av8Var = (av8) of3Var;
                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                            av8Var.d0(-472271719);
                            List<syi> list = (List) ((eoh) teamPlayerStatsFragment.y).getValue();
                            ArrayList arrayList = new ArrayList(k13.r(list, 10));
                            for (syi syiVar : list) {
                                arrayList.add(new oxh(syiVar, syiVar.b.getYear(), yqo.H(931770838, av8Var, new uri(syiVar, 4)), null, null, false, 248));
                            }
                            av8Var.s(false);
                            gv9 W = l6g.W(arrayList);
                            Iterator<E> it = W.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (Intrinsics.c(((oxh) next).a, (syi) ((eoh) teamPlayerStatsFragment.A).getValue())) {
                                        obj3 = next;
                                    }
                                }
                            }
                            oxh oxhVar = (oxh) obj3;
                            boolean i6 = av8Var.i(teamPlayerStatsFragment);
                            Object O = av8Var.O();
                            if (i6 || O == a99Var) {
                                O = new Function1() { // from class: lyi
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        int i72 = i5;
                                        TeamPlayerStatsFragment teamPlayerStatsFragment2 = teamPlayerStatsFragment;
                                        switch (i72) {
                                            case 0:
                                                Season.SubSeasonType subSeasonType2 = (Season.SubSeasonType) obj4;
                                                subSeasonType2.getClass();
                                                ((eoh) teamPlayerStatsFragment2.B).setValue(subSeasonType2);
                                                teamPlayerStatsFragment2.u();
                                                break;
                                            default:
                                                syi syiVar2 = (syi) obj4;
                                                syiVar2.getClass();
                                                ((eoh) teamPlayerStatsFragment2.A).setValue(syiVar2);
                                                List<Season.SubSeasonType> mapToSubSeasonType = SeasonKt.mapToSubSeasonType(syiVar2.c);
                                                e1d e1dVar = teamPlayerStatsFragment2.z;
                                                ((eoh) e1dVar).setValue(mapToSubSeasonType);
                                                ((eoh) teamPlayerStatsFragment2.B).setValue((Season.SubSeasonType) CollectionsKt.firstOrNull((List) ((eoh) e1dVar).getValue()));
                                                teamPlayerStatsFragment2.u();
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                };
                                av8Var.n0(O);
                            }
                            r4a.j(W, oxhVar, (Function1) O, null, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, W3.l);
                        } else {
                            av8Var.W();
                        }
                        break;
                    default:
                        of3 of3Var2 = (of3) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        av8 av8Var2 = (av8) of3Var2;
                        if (av8Var2.T(1 & intValue2, (intValue2 & 3) != 2)) {
                            List<Season.SubSeasonType> list2 = (List) ((eoh) teamPlayerStatsFragment.z).getValue();
                            ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                            for (Season.SubSeasonType subSeasonType : list2) {
                                Set set = f5k.a;
                                Context requireContext2 = teamPlayerStatsFragment.requireContext();
                                requireContext2.getClass();
                                arrayList2.add(new oxh(subSeasonType, f5k.b(requireContext2, subSeasonType.getLabel(), teamPlayerStatsFragment.F().d), null, null, null, false, 252));
                            }
                            gv9 W2 = l6g.W(arrayList2);
                            Iterator<E> it2 = W2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    if (((oxh) next2).a == ((Season.SubSeasonType) ((eoh) teamPlayerStatsFragment.B).getValue())) {
                                        obj3 = next2;
                                    }
                                }
                            }
                            oxh oxhVar2 = (oxh) obj3;
                            boolean i7 = av8Var2.i(teamPlayerStatsFragment);
                            Object O2 = av8Var2.O();
                            if (i7 || O2 == a99Var) {
                                O2 = new Function1() { // from class: lyi
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        int i72 = i4;
                                        TeamPlayerStatsFragment teamPlayerStatsFragment2 = teamPlayerStatsFragment;
                                        switch (i72) {
                                            case 0:
                                                Season.SubSeasonType subSeasonType2 = (Season.SubSeasonType) obj4;
                                                subSeasonType2.getClass();
                                                ((eoh) teamPlayerStatsFragment2.B).setValue(subSeasonType2);
                                                teamPlayerStatsFragment2.u();
                                                break;
                                            default:
                                                syi syiVar2 = (syi) obj4;
                                                syiVar2.getClass();
                                                ((eoh) teamPlayerStatsFragment2.A).setValue(syiVar2);
                                                List<Season.SubSeasonType> mapToSubSeasonType = SeasonKt.mapToSubSeasonType(syiVar2.c);
                                                e1d e1dVar = teamPlayerStatsFragment2.z;
                                                ((eoh) e1dVar).setValue(mapToSubSeasonType);
                                                ((eoh) teamPlayerStatsFragment2.B).setValue((Season.SubSeasonType) CollectionsKt.firstOrNull((List) ((eoh) e1dVar).getValue()));
                                                teamPlayerStatsFragment2.u();
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                };
                                av8Var2.n0(O2);
                            }
                            r4a.j(W2, oxhVar2, (Function1) O2, null, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 0, W3.l);
                        } else {
                            av8Var2.W();
                        }
                        break;
                }
                return Unit.a;
            }
        }, true));
        aba.y(imageView, 0, 3);
        imageView.setOnClickListener(new myi(this, i2));
        int i3 = 0;
        Class<TeamPlayerStatsFragment> cls = TeamPlayerStatsFragment.class;
        F().f.e(getViewLifecycleOwner(), new ioe(23, new chf(1, this, cls, "onTeamSeasonsUpdated", "onTeamSeasonsUpdated(Ljava/util/List;)V", i3, 20)));
        F().h.e(getViewLifecycleOwner(), new ioe(23, new chf(1, this, cls, "onAvailableCategoriesUpdated", "onAvailableCategoriesUpdated(Ljava/util/List;)V", i3, 21)));
        F().j.e(getViewLifecycleOwner(), new ioe(23, new chf(1, this, cls, "onPlayerStatsUpdated", "onPlayerStatsUpdated(Ljava/util/List;)V", i3, 22)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        rq3 rq3Var = null;
        if (F().f.d() == null) {
            tyi F = F();
            xw3.L(un0.z(F), null, null, new w9g(F, rq3Var, 24), 3);
            return;
        }
        syi syiVar = (syi) ((eoh) this.A).getValue();
        Season.SubSeasonType subSeasonType = (Season.SubSeasonType) ((eoh) this.B).getValue();
        if (syiVar == null || subSeasonType == null) {
            return;
        }
        tyi F2 = F();
        int i = syiVar.a;
        int id = syiVar.b.getId();
        String label = subSeasonType.getLabel();
        label.getClass();
        xw3.L(un0.z(F2), null, null, new gz6(F2, i, id, label, (rq3) null, 9), 3);
    }
}
