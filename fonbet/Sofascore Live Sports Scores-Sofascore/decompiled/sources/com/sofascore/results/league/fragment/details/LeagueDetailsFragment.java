package com.sofascore.results.league.fragment.details;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.Sports;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.branding.BrandType;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.event.details.view.odds.GambleRegulationFooterView;
import com.sofascore.results.event.details.view.promotion.PromotionBannerView;
import com.sofascore.results.featuredtournament.view.PromotionalOffersBannerView;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.view.FeaturedMatchView;
import com.sofascore.results.view.branding.BrandingLayout;
import defpackage.ao2;
import defpackage.as9;
import defpackage.bva;
import defpackage.ccd;
import defpackage.cue;
import defpackage.dd;
import defpackage.dsi;
import defpackage.duf;
import defpackage.dyi;
import defpackage.f32;
import defpackage.fuf;
import defpackage.g7;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.hza;
import defpackage.ib9;
import defpackage.ii5;
import defpackage.iuh;
import defpackage.iz2;
import defpackage.joa;
import defpackage.jva;
import defpackage.ka9;
import defpackage.krk;
import defpackage.kva;
import defpackage.lva;
import defpackage.lxa;
import defpackage.n9e;
import defpackage.nb9;
import defpackage.nue;
import defpackage.o3a;
import defpackage.oo8;
import defpackage.otk;
import defpackage.oxe;
import defpackage.qa7;
import defpackage.qrj;
import defpackage.r6j;
import defpackage.rq3;
import defpackage.tba;
import defpackage.tua;
import defpackage.un0;
import defpackage.uua;
import defpackage.v6j;
import defpackage.vua;
import defpackage.wua;
import defpackage.xw3;
import defpackage.y1f;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yta;
import defpackage.yua;
import defpackage.z1;
import defpackage.z45;
import defpackage.z82;
import defpackage.z8e;
import defpackage.zsk;
import defpackage.zzl;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/league/fragment/details/LeagueDetailsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "Leva;", "data", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LeagueDetailsFragment extends Hilt_LeagueDetailsFragment<oo8> {
    public final joa A;
    public final joa B;
    public final joa C;
    public final joa D;
    public final joa E;
    public PromotionBannerView F;
    public final joa G;
    public final joa H;
    public final joa I;
    public final joa J;
    public final joa K;
    public final joa L;
    public final joa M;
    public final joa N;
    public final joa O;
    public final joa P;
    public final joa Q;
    public final joa R;
    public final joa S;
    public f32 T;
    public final joa U;
    public final joa V;
    public final joa W;
    public zsk X;
    public final otk r;
    public final otk s;
    public final otk t;
    public final joa u;
    public final joa v;
    public boolean w;
    public boolean x;
    public String y;
    public final joa z;

    public LeagueDetailsFragment() {
        fuf fufVar = duf.a;
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        this.r = new otk(fufVar.getOrCreateKotlinClass(kva.class), new yua(this, i), new yua(this, i3), new yua(this, i2));
        int i4 = 3;
        int i5 = 4;
        int i6 = 5;
        this.s = new otk(fufVar.getOrCreateKotlinClass(yta.class), new yua(this, i4), new yua(this, i6), new yua(this, i5));
        int i7 = 6;
        int i8 = 7;
        int i9 = 8;
        this.t = new otk(fufVar.getOrCreateKotlinClass(dsi.class), new yua(this, i7), new yua(this, i9), new yua(this, i8));
        uua uuaVar = new uua(this, i);
        ysa ysaVar = ysa.c;
        this.u = ypa.a(ysaVar, uuaVar);
        this.v = n9e.M(new uua(this, i3), new uua(this, 14));
        this.z = ypa.a(ysaVar, new uua(this, 20));
        this.A = n9e.M(new uua(this, 21), new uua(this, 23));
        this.B = n9e.M(new uua(this, 24), new uua(this, 25));
        this.C = ypa.a(ysaVar, new uua(this, 26));
        this.D = ypa.a(ysaVar, new uua(this, 27));
        this.E = ypa.a(ysaVar, new uua(this, 11));
        this.G = ypa.a(ysaVar, new uua(this, 22));
        this.H = ypa.a(ysaVar, new uua(this, 28));
        this.I = ypa.a(ysaVar, new wua(this, i4));
        this.J = n9e.M(new wua(this, i6), new wua(this, i7));
        this.K = n9e.M(new wua(this, i8), new wua(this, i9));
        int i10 = 9;
        this.L = n9e.M(new wua(this, i10), new uua(this, i2));
        this.M = n9e.M(new uua(this, i4), new uua(this, i5));
        this.N = ypa.a(ysaVar, new uua(this, i6));
        this.O = n9e.M(new uua(this, i7), new uua(this, i8));
        this.P = ypa.a(ysaVar, new uua(this, i9));
        this.Q = ypa.a(ysaVar, new uua(this, i10));
        this.R = ypa.a(ysaVar, new uua(this, 10));
        this.S = ypa.a(ysaVar, new uua(this, 12));
        this.U = n9e.M(new uua(this, 13), new uua(this, 15));
        this.V = n9e.M(new uua(this, 16), new uua(this, 17));
        this.W = n9e.M(new uua(this, 18), new uua(this, 19));
    }

    public final yta C() {
        return (yta) this.s.getValue();
    }

    public final ka9 D() {
        return (ka9) this.u.getValue();
    }

    public final ii5 E() {
        return (ii5) this.z.getValue();
    }

    public final dyi F() {
        return (dyi) this.S.getValue();
    }

    public final Tournament G() {
        return C().o();
    }

    public final kva H() {
        return (kva) this.r.getValue();
    }

    public final void I(List list, boolean z) {
        View E;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lva lvaVar = (lva) it.next();
            ka9 D = D();
            switch (lvaVar.ordinal()) {
                case 0:
                    E = E();
                    break;
                case 1:
                    E = (bva) this.D.getValue();
                    break;
                case 2:
                    E = (nue) this.O.getValue();
                    break;
                case 3:
                    E = (cue) this.P.getValue();
                    break;
                case 4:
                    E = (lxa) this.W.getValue();
                    break;
                case 5:
                    E = F();
                    break;
                case 6:
                    E = (hza) this.G.getValue();
                    break;
                case 7:
                    E = (oxe) this.H.getValue();
                    break;
                case 8:
                    Integer F = o3a.F(G());
                    if (F == null || F.intValue() != 16) {
                        E = (ib9) this.R.getValue();
                        break;
                    } else {
                        E = (nb9) this.Q.getValue();
                        break;
                    }
                    break;
                case 9:
                    E = (PromotionBannerView) this.E.getValue();
                    break;
                case 10:
                    E = (FeaturedMatchView) this.I.getValue();
                    break;
                case 11:
                    E = (y1f) this.V.getValue();
                    break;
                case 12:
                    E = (ComposeView) this.N.getValue();
                    break;
                case 13:
                    E = (AdBannerView) this.v.getValue();
                    break;
                case 14:
                    E = (PromotionBannerView) this.B.getValue();
                    break;
                case 15:
                    E = (tua) this.J.getValue();
                    break;
                case 16:
                    E = (qrj) this.K.getValue();
                    break;
                case 17:
                    E = (v6j) this.L.getValue();
                    break;
                case 18:
                    E = (r6j) this.M.getValue();
                    break;
                case 19:
                    E = this.T;
                    break;
                case 20:
                    E = this.F;
                    break;
                case 21:
                    E = (PromotionalOffersBannerView) this.A.getValue();
                    break;
                case 22:
                    E = (GambleRegulationFooterView) this.U.getValue();
                    break;
                case 23:
                    E = (iuh) this.C.getValue();
                    break;
                default:
                    zzl.b();
                    return;
            }
            if (E != null) {
                if (z) {
                    D.p(D.g.size(), E);
                } else {
                    g7.o(D, E, 6);
                }
            }
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return oo8.b(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.T = null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        String m = C().m();
        return (Intrinsics.c(m, Sports.BASKETBALL) || Intrinsics.c(m, Sports.FOOTBALL)) ? "OverviewTab" : "DetailsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((oo8) krkVar).e;
        swipeRefreshLayout.getClass();
        rq3 rq3Var = null;
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((oo8) krkVar2).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((oo8) krkVar3).d.setAdapter(D());
        krk krkVar4 = this.l;
        krkVar4.getClass();
        RecyclerView recyclerView2 = ((oo8) krkVar4).d;
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        int i = 4;
        recyclerView2.setPaddingRelative(recyclerView2.getPaddingStart(), ao2.s(4, requireContext2), recyclerView2.getPaddingEnd(), recyclerView2.getPaddingBottom());
        bva bvaVar = (bva) this.D.getValue();
        Tournament G = G();
        bvaVar.getClass();
        dd ddVar = bvaVar.d;
        BrandingLayout brandingLayout = (BrandingLayout) ddVar.b;
        brandingLayout.getClass();
        Integer F = o3a.F(G);
        Context context = bvaVar.getContext();
        context.getClass();
        brandingLayout.a(ccd.B(context, o3a.F(G), BrandLocation.Header), BrandLocation.LeagueScreen, BrandType.STRIPE, F, true);
        z82 z82Var = (z82) ddVar.c;
        TextView textView = (TextView) z82Var.c;
        UniqueTournament uniqueTournament = G.getUniqueTournament();
        String x = uniqueTournament != null ? tba.x(uniqueTournament) : null;
        if (bvaVar.getChildCount() == 0) {
            x = null;
        }
        if (x == null) {
            x = tba.w(G);
        }
        textView.setText(x);
        as9.b((ImageView) z82Var.e, Integer.valueOf(G.getCategory().getId()), null);
        TextView textView2 = (TextView) z82Var.d;
        Context context2 = bvaVar.getContext();
        context2.getClass();
        textView2.setText(o3a.u(context2, G));
        ImageView imageView = (ImageView) z82Var.g;
        UniqueTournament uniqueTournament2 = G.getUniqueTournament();
        int i2 = 0;
        as9.q(imageView, Integer.valueOf(uniqueTournament2 != null ? uniqueTournament2.getId() : 0), G.getId(), null);
        Bundle arguments = getArguments();
        Boolean valueOf = arguments != null ? Boolean.valueOf(arguments.getBoolean("POSITION_ON_TEAM_OF_THE_WEEK")) : null;
        Boolean bool = Boolean.TRUE;
        this.x = Intrinsics.c(valueOf, bool);
        Bundle arguments2 = getArguments();
        this.w = Intrinsics.c(arguments2 != null ? Boolean.valueOf(arguments2.getBoolean("POSITION_ON_MEDIA")) : null, bool);
        Bundle arguments3 = getArguments();
        this.y = arguments3 != null ? arguments3.getString("CAMPAIGN") : null;
        H().o.e(getViewLifecycleOwner(), new z1(16, new vua(this, i2)));
        z8e.y(this, H().u, new qa7(this, rq3Var, 19));
        H().m.e(getViewLifecycleOwner(), new z1(16, new vua(this, 1)));
        H().q.e(getViewLifecycleOwner(), new z1(16, new vua(this, 2)));
        C().B.e(getViewLifecycleOwner(), new z1(16, new vua(this, 3)));
        C().x.e(getViewLifecycleOwner(), new z1(16, new vua(this, i)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        UniqueTournament uniqueTournament = G().getUniqueTournament();
        if (uniqueTournament != null) {
            int id = uniqueTournament.getId();
            kva H = H();
            Season l = C().l();
            boolean z = false;
            int id2 = l != null ? l.getId() : 0;
            if (C().l && !Intrinsics.c(C().p, Boolean.FALSE)) {
                z = true;
            }
            iz2 z2 = un0.z(H);
            hs4 hs4Var = z45.a;
            xw3.L(z2, hq4.c, null, new jva(H, id, z, id2, null), 2);
        }
    }
}
