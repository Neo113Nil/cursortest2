package com.sofascore.results.main.matches.redesign.datematches;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.sofascore.model.database.DisplayType;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.main.matches.redesign.datematches.view.MatchesFilterBarView;
import defpackage.aqb;
import defpackage.bqb;
import defpackage.byb;
import defpackage.cd5;
import defpackage.cqb;
import defpackage.duf;
import defpackage.fc6;
import defpackage.g9i;
import defpackage.hkg;
import defpackage.joa;
import defpackage.ke0;
import defpackage.krk;
import defpackage.lrf;
import defpackage.mrf;
import defpackage.nq8;
import defpackage.otk;
import defpackage.p15;
import defpackage.so8;
import defpackage.sub;
import defpackage.u6b;
import defpackage.vc4;
import defpackage.wrf;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z1;
import defpackage.zpb;
import defpackage.zqb;
import defpackage.zzc;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/main/matches/redesign/datematches/MainMatchesFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lso8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MainMatchesFragment extends Hilt_MainMatchesFragment<so8> {
    public final joa r;
    public final otk s;
    public int t;
    public g9i u;
    public final joa v;

    public MainMatchesFragment() {
        aqb aqbVar = new aqb(this, 3);
        ysa ysaVar = ysa.c;
        this.r = ypa.a(ysaVar, aqbVar);
        this.s = new otk(duf.a.getOrCreateKotlinClass(zqb.class), new cqb(this, 0), new cqb(this, 2), new cqb(this, 1));
        this.v = ypa.a(ysaVar, new aqb(this, 4));
    }

    public final zqb C() {
        return (zqb) this.s.getValue();
    }

    public final vc4 D() {
        return (vc4) this.v.getValue();
    }

    public final void E(long j) {
        if (!fc6.B(fc6.t(Instant.ofEpochSecond(j)))) {
            byb bybVar = C().c0;
            if ((bybVar != null ? bybVar.a : null) != DisplayType.CHRONOLOGICAL) {
                krk krkVar = this.l;
                krkVar.getClass();
                ((so8) krkVar).c.y(0);
                ZoneId systemDefault = ZoneId.systemDefault();
                boolean isAfter = Instant.ofEpochSecond(j).atZone(systemDefault).toLocalDate().isAfter(LocalDate.now(systemDefault));
                Drawable drawable = requireContext().getDrawable(!isAfter ? R.drawable.ic_chevron_right_large_16 : R.drawable.ic_chevron_left_large_16);
                krk krkVar2 = this.l;
                krkVar2.getClass();
                ExtendedFloatingActionButton extendedFloatingActionButton = ((so8) krkVar2).c;
                Drawable drawable2 = !isAfter ? null : drawable;
                if (isAfter) {
                    drawable = null;
                }
                extendedFloatingActionButton.setCompoundDrawablesWithIntrinsicBounds(drawable2, (Drawable) null, drawable, (Drawable) null);
                extendedFloatingActionButton.setOnClickListener(new cd5(this, 16));
                return;
            }
        }
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((so8) krkVar3).c.y(1);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_main_matches_redesign, (ViewGroup) null, false);
        int i = R.id.ad_banner_view;
        AdBannerView adBannerView = (AdBannerView) nq8.B(R.id.ad_banner_view, inflate);
        if (adBannerView != null) {
            i = R.id.back_to_today_button;
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) nq8.B(R.id.back_to_today_button, inflate);
            if (extendedFloatingActionButton != null) {
                i = R.id.daily_pager;
                ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.daily_pager, inflate);
                if (viewPager2 != null) {
                    i = R.id.filter_card;
                    MatchesFilterBarView matchesFilterBarView = (MatchesFilterBarView) nq8.B(R.id.filter_card, inflate);
                    if (matchesFilterBarView != null) {
                        i = R.id.live_fragment_container;
                        FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.live_fragment_container, inflate);
                        if (frameLayout != null) {
                            return new so8((ConstraintLayout) inflate, adBannerView, extendedFloatingActionButton, viewPager2, matchesFilterBarView, frameLayout);
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
        return "MatchesNestedTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        mrf recycledViewPool;
        krk krkVar = this.l;
        krkVar.getClass();
        ((so8) krkVar).d.setAdapter(D());
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView c = wrf.c(((so8) krkVar2).d);
        int i = 1;
        int i2 = 0;
        if (c != null && (recycledViewPool = c.getRecycledViewPool()) != null) {
            lrf a = recycledViewPool.a(0);
            a.b = 0;
            ArrayList arrayList = a.a;
            while (arrayList.size() > 0) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        View findViewById = requireActivity().findViewById(R.id.bottom_tabs_view);
        if (findViewById != null) {
            t(findViewById, new zpb(this, i2));
        } else {
            krk krkVar3 = this.l;
            krkVar3.getClass();
            hkg.s(24, ((so8) krkVar3).c);
        }
        D().j.c(1073741823, false);
        int color = requireContext().getColor(R.color.surface_0);
        krk krkVar4 = this.l;
        krkVar4.getClass();
        ((so8) krkVar4).e.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{color, color, color, 0}));
        joa joaVar = this.r;
        this.i.b = (String) joaVar.getValue();
        long timeInMillis = ke0.a.getTimeInMillis() / 1000;
        krk krkVar5 = this.l;
        krkVar5.getClass();
        ((so8) krkVar5).e.setSelectedTimestamp(timeInMillis);
        E(timeInMillis);
        krk krkVar6 = this.l;
        krkVar6.getClass();
        AdBannerView adBannerView = ((so8) krkVar6).b;
        adBannerView.setVisibility(0);
        AdType.Banner banner = AdType.Banner.MainScreenSmall;
        adBannerView.setBackground(null);
        adBannerView.setCustomTargeting(sub.d(new Pair(SearchResponseKt.SPORT_ENTITY, (String) joaVar.getValue())));
        adBannerView.c(banner);
        krk krkVar7 = this.l;
        krkVar7.getClass();
        ((so8) krkVar7).d.a(new bqb(this));
        C().k0.e(getViewLifecycleOwner(), new z1(22, new zpb(this, i)));
        zzc zzcVar = C().L;
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        p15 p15Var = new p15(new zpb(this, 2), i);
        zzcVar.getClass();
        zzcVar.a.e(viewLifecycleOwner, p15Var);
        zzc zzcVar2 = C().N;
        u6b viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        p15 p15Var2 = new p15(new zpb(this, 3), i);
        zzcVar2.getClass();
        zzcVar2.a.e(viewLifecycleOwner2, p15Var2);
        zzc zzcVar3 = C().P;
        u6b viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        p15 p15Var3 = new p15(new zpb(this, 4), i);
        zzcVar3.getClass();
        zzcVar3.a.e(viewLifecycleOwner3, p15Var3);
        C().m.e(getViewLifecycleOwner(), new z1(22, new zpb(this, 5)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
    }
}
