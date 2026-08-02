package com.sofascore.results.league.fragment.events;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.view.InformationView;
import com.sofascore.results.view.SofaTextInputLayout;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import defpackage.a52;
import defpackage.ad2;
import defpackage.ao2;
import defpackage.as9;
import defpackage.b1d;
import defpackage.beh;
import defpackage.duf;
import defpackage.e6b;
import defpackage.faa;
import defpackage.frh;
import defpackage.fuf;
import defpackage.g5k;
import defpackage.hrh;
import defpackage.hv7;
import defpackage.ij8;
import defpackage.ix7;
import defpackage.joa;
import defpackage.k6b;
import defpackage.krk;
import defpackage.kwa;
import defpackage.lrh;
import defpackage.lwa;
import defpackage.mqi;
import defpackage.mwa;
import defpackage.mz5;
import defpackage.nq8;
import defpackage.nwa;
import defpackage.otk;
import defpackage.po8;
import defpackage.qv5;
import defpackage.qwa;
import defpackage.rq3;
import defpackage.tba;
import defpackage.tc3;
import defpackage.twa;
import defpackage.u6b;
import defpackage.u6e;
import defpackage.un0;
import defpackage.ur1;
import defpackage.va8;
import defpackage.vwa;
import defpackage.wca;
import defpackage.xw3;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yta;
import defpackage.z07;
import defpackage.z1;
import defpackage.z8e;
import defpackage.zk2;
import defpackage.zwa;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n²\u0006\u001c\u0010\b\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00060\u00058\nX\u008a\u0084\u0002²\u0006\u0012\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/league/fragment/events/LeagueEventsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lpo8;", "<init>", "()V", "Lgv9;", "Loxh;", "Lkya;", "spinnerItems", "selectedSpinnerItem", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LeagueEventsFragment extends Hilt_LeagueEventsFragment<po8> {
    public final otk r;
    public final otk s;
    public final joa t;
    public final mqi u;
    public boolean v;
    public boolean w;
    public final joa x;
    public final joa y;

    public LeagueEventsFragment() {
        int i = 3;
        qwa qwaVar = new qwa(this, i);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new hv7(qwaVar, 15));
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(zwa.class), new ix7(a, 11), new z07(29, this, a), new ix7(a, 12));
        int i2 = 0;
        int i3 = 2;
        this.s = new otk(fufVar.getOrCreateKotlinClass(yta.class), new qwa(this, i2), new qwa(this, i3), new qwa(this, 1));
        this.t = ypa.a(ysaVar, new lwa(this, i2));
        this.u = ypa.b(new lwa(this, i3));
        this.v = true;
        this.w = true;
        this.x = ypa.a(ysaVar, new lwa(this, i));
        this.y = ypa.a(ysaVar, new lwa(this, 4));
    }

    public final yta C() {
        return (yta) this.s.getValue();
    }

    public final kwa D() {
        return (kwa) this.t.getValue();
    }

    public final u6e E() {
        return (u6e) this.x.getValue();
    }

    public final String F() {
        return C().o().getCategory().getSport().getSlug();
    }

    public final zwa G() {
        return (zwa) this.r.getValue();
    }

    public final void H(Team team) {
        u6e.b(E());
        D().s();
        this.v = true;
        zwa G = G();
        G.q.put(G.p, team);
        G.m();
        krk krkVar = this.l;
        krkVar.getClass();
        as9.o(((po8) krkVar).m, team.getId());
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((po8) krkVar2).m.setImageTintList(null);
        twa twaVar = (twa) this.y.getValue();
        twaVar.getClass();
        zk2 zk2Var = new zk2(twaVar, 5);
        Context requireContext = requireContext();
        requireContext.getClass();
        zk2Var.filter(tba.p(requireContext, team));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_league_matches, (ViewGroup) null, false);
        int i = R.id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) nq8.B(R.id.app_bar, inflate);
        if (appBarLayout != null) {
            i = R.id.app_bar_bottom_divider;
            View B = nq8.B(R.id.app_bar_bottom_divider, inflate);
            if (B != null) {
                i = R.id.court_disclaimer;
                InformationView informationView = (InformationView) nq8.B(R.id.court_disclaimer, inflate);
                if (informationView != null) {
                    i = R.id.filter_spinner;
                    ComposeView composeView = (ComposeView) nq8.B(R.id.filter_spinner, inflate);
                    if (composeView != null) {
                        i = R.id.filter_type_header;
                        TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.filter_type_header, inflate);
                        if (typeHeaderView != null) {
                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
                            i = R.id.recycler_view;
                            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                            if (recyclerView != null) {
                                i = R.id.spinner_container;
                                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.spinner_container, inflate);
                                if (linearLayout != null) {
                                    i = R.id.team_filter_autocomplete;
                                    MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) nq8.B(R.id.team_filter_autocomplete, inflate);
                                    if (materialAutoCompleteTextView != null) {
                                        i = R.id.team_filter_container;
                                        LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.team_filter_container, inflate);
                                        if (linearLayout2 != null) {
                                            i = R.id.team_filter_input;
                                            SofaTextInputLayout sofaTextInputLayout = (SofaTextInputLayout) nq8.B(R.id.team_filter_input, inflate);
                                            if (sofaTextInputLayout != null) {
                                                i = R.id.team_filter_logo;
                                                ImageView imageView = (ImageView) nq8.B(R.id.team_filter_logo, inflate);
                                                if (imageView != null) {
                                                    return new po8(swipeRefreshLayout, appBarLayout, B, informationView, composeView, typeHeaderView, swipeRefreshLayout, recyclerView, linearLayout, materialAutoCompleteTextView, linearLayout2, sofaTextInputLayout, imageView);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "MatchesTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((po8) krkVar).g;
        swipeRefreshLayout.getClass();
        rq3 rq3Var = null;
        AbstractFragment.v(this, swipeRefreshLayout, C().n, null, 4);
        e6b e6bVar = e6b.a;
        ad2 ad2Var = qv5.a;
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        LinkedHashMap linkedHashMap = qv5.b;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(a52.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        int i = 7;
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        k6b x = wca.x(viewLifecycleOwner.getLifecycle());
        va8 va8Var = new va8(viewLifecycleOwner, (b1d) obj, this, (rq3) null, this);
        int i2 = 3;
        xw3.L(x, null, null, va8Var, 3);
        mqi mqiVar = this.u;
        if (((Boolean) mqiVar.getValue()).booleanValue()) {
            krk krkVar2 = this.l;
            krkVar2.getClass();
            ((po8) krkVar2).b.setBackgroundColor(0);
            krk krkVar3 = this.l;
            krkVar3.getClass();
            ((po8) krkVar3).b.setStateListAnimator(null);
            int color = requireContext().getColor(R.color.on_color_primary);
            krk krkVar4 = this.l;
            krkVar4.getClass();
            SofaTextInputLayout sofaTextInputLayout = ((po8) krkVar4).l;
            ColorStateList colorStateList = sofaTextInputLayout.getContext().getColorStateList(R.color.text_input_stroke_branding_color);
            colorStateList.getClass();
            sofaTextInputLayout.setBoxStrokeColorStateList(colorStateList);
            sofaTextInputLayout.setHintTextColor(ColorStateList.valueOf(color));
            sofaTextInputLayout.setDefaultHintTextColor(ColorStateList.valueOf(sofaTextInputLayout.getContext().getColor(R.color.on_color_secondary)));
            sofaTextInputLayout.setBoxBackgroundColor(sofaTextInputLayout.getContext().getColor(R.color.on_color_highlight_2));
            sofaTextInputLayout.setEndIconTintList(ColorStateList.valueOf(sofaTextInputLayout.getContext().getColor(R.color.on_color_primary)));
            krk krkVar5 = this.l;
            krkVar5.getClass();
            ((po8) krkVar5).j.setTextColor(color);
            krk krkVar6 = this.l;
            krkVar6.getClass();
            ((po8) krkVar6).c.setBackgroundColor(requireContext().getColor(R.color.on_color_highlight_2));
        }
        krk krkVar7 = this.l;
        krkVar7.getClass();
        int i3 = 1;
        ((po8) krkVar7).e.setContent(new tc3(641386869, new faa(this, i), true));
        krk krkVar8 = this.l;
        krkVar8.getClass();
        g5k g5kVar = new g5k(((po8) krkVar8).f);
        lrh lrhVar = ((Boolean) mqiVar.getValue()).booleanValue() ? frh.m : hrh.m;
        lrhVar.getClass();
        g5kVar.e = lrhVar;
        g5kVar.k = true;
        g5kVar.d = new nwa(this, i3);
        g5kVar.m = new ur1(this, 12);
        g5kVar.b();
        krk krkVar9 = this.l;
        krkVar9.getClass();
        RecyclerView recyclerView = ((po8) krkVar9).h;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        krk krkVar10 = this.l;
        krkVar10.getClass();
        RecyclerView recyclerView2 = ((po8) krkVar10).h;
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        recyclerView2.setPaddingRelative(recyclerView2.getPaddingStart(), ao2.s(4, requireContext2), recyclerView2.getPaddingEnd(), recyclerView2.getPaddingBottom());
        krk krkVar11 = this.l;
        krkVar11.getClass();
        ((po8) krkVar11).h.addOnScrollListener(E());
        krk krkVar12 = this.l;
        krkVar12.getClass();
        ((po8) krkVar12).h.setAdapter(D());
        kwa D = D();
        mwa mwaVar = new mwa(this, i3);
        D.getClass();
        D.a.d = mwaVar;
        krk krkVar13 = this.l;
        krkVar13.getClass();
        InformationView informationView = ((po8) krkVar13).d;
        informationView.setVisibility(8);
        InformationView.o(informationView, requireContext().getString(R.string.tennis_disclaimer_not_before_times));
        ConstraintLayout constraintLayout = (ConstraintLayout) informationView.d.c;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
        constraintLayout.setLayoutParams(marginLayoutParams);
        InformationView.l(informationView, new ij8(29, informationView, this));
        zwa G = G();
        Tournament o = C().o();
        Season l = C().l();
        G.j = o;
        G.k = l;
        G.m();
        Season season = G.k;
        if (season != null) {
            if (G.x() <= 0) {
                season = null;
            }
            if (season != null) {
                xw3.L(un0.z(G), null, null, new mz5(G, season, rq3Var, i3), 3);
                G.w();
                G().i.e(getViewLifecycleOwner(), new z1(17, new nwa(this, 2)));
                G().g.e(getViewLifecycleOwner(), new z1(17, new nwa(this, i2)));
                zwa G2 = G();
                u6b viewLifecycleOwner2 = getViewLifecycleOwner();
                viewLifecycleOwner2.getClass();
                G2.g(viewLifecycleOwner2, new lwa(this, i3));
            }
        }
        G.h.j(new vwa(null, null, null, null));
        Unit unit = Unit.a;
        G.w();
        G().i.e(getViewLifecycleOwner(), new z1(17, new nwa(this, 2)));
        G().g.e(getViewLifecycleOwner(), new z1(17, new nwa(this, i2)));
        zwa G22 = G();
        u6b viewLifecycleOwner22 = getViewLifecycleOwner();
        viewLifecycleOwner22.getClass();
        G22.g(viewLifecycleOwner22, new lwa(this, i3));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        G().m();
    }
}
