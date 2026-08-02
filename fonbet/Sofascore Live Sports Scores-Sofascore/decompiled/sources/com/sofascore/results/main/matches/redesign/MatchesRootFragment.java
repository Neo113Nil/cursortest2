package com.sofascore.results.main.matches.redesign;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.sofascore.model.Sports;
import com.sofascore.results.R;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.view.InfoBubbleText;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import defpackage.a99;
import defpackage.ad2;
import defpackage.b1d;
import defpackage.be5;
import defpackage.beh;
import defpackage.duf;
import defpackage.e52;
import defpackage.e6b;
import defpackage.eyb;
import defpackage.fc6;
import defpackage.joa;
import defpackage.ke0;
import defpackage.krk;
import defpackage.nq8;
import defpackage.o02;
import defpackage.ogb;
import defpackage.ph0;
import defpackage.pn3;
import defpackage.ppa;
import defpackage.qv5;
import defpackage.rlh;
import defpackage.rq3;
import defpackage.s2a;
import defpackage.tc3;
import defpackage.to8;
import defpackage.u6b;
import defpackage.v1h;
import defpackage.va8;
import defpackage.wca;
import defpackage.wd5;
import defpackage.wkn;
import defpackage.xd5;
import defpackage.xw3;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z1h;
import defpackage.zqb;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/main/matches/redesign/MatchesRootFragment;", "Lcom/sofascore/results/main/AbstractFadingFragment;", "Lto8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MatchesRootFragment extends Hilt_MatchesRootFragment<to8> {
    public final Set t = ph0.a0(new String[]{Sports.TRENDING, Sports.MMA, Sports.CYCLING, Sports.MOTORSPORT});
    public final Set u = ph0.a0(new String[]{Sports.TRENDING, Sports.MMA, Sports.CYCLING, Sports.MOTORSPORT});
    public final Calendar v;
    public Long w;
    public final joa x;

    public MatchesRootFragment() {
        Calendar calendar = ke0.a;
        this.v = ke0.a;
        this.x = ypa.a(ysa.c, new ogb(24));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_main_matches_redesign_root, (ViewGroup) null, false);
        int i = R.id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) nq8.B(R.id.app_bar, inflate);
        if (appBarLayout != null) {
            i = R.id.collapsing_toolbar;
            if (((CollapsingToolbarLayout) nq8.B(R.id.collapsing_toolbar, inflate)) != null) {
                i = R.id.compose_sport_picker;
                ComposeView composeView = (ComposeView) nq8.B(R.id.compose_sport_picker, inflate);
                if (composeView != null) {
                    i = R.id.fragment_container;
                    FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.fragment_container, inflate);
                    if (frameLayout != null) {
                        i = R.id.guideline;
                        if (((Guideline) nq8.B(R.id.guideline, inflate)) != null) {
                            i = R.id.leagues_tooltip;
                            InfoBubbleText infoBubbleText = (InfoBubbleText) nq8.B(R.id.leagues_tooltip, inflate);
                            if (infoBubbleText != null) {
                                i = R.id.page_selector;
                                SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) nq8.B(R.id.page_selector, inflate);
                                if (segmentedButtonsView != null) {
                                    return new to8((CoordinatorLayout) inflate, appBarLayout, composeView, frameLayout, infoBubbleText, segmentedButtonsView);
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

    @Override // com.sofascore.results.main.AbstractFadingFragment, com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        this.w = Long.valueOf(System.currentTimeMillis());
        super.onPause();
    }

    @Override // com.sofascore.results.main.AbstractFadingFragment, com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Long l = this.w;
        if (l != null) {
            long longValue = l.longValue();
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - longValue;
            wd5 wd5Var = xd5.b;
            if (j > xd5.e(wkn.R(6, be5.HOURS))) {
                LocalDate t = fc6.t(Instant.ofEpochSecond(this.v.getTimeInMillis() / 1000));
                LocalDate localDate = Instant.ofEpochSecond(currentTimeMillis / 1000).atZone(ZoneId.systemDefault()).toLocalDate();
                localDate.getClass();
                if (t.isEqual(localDate)) {
                    return;
                }
                Calendar calendar = ke0.a;
                Calendar calendar2 = Calendar.getInstance();
                calendar2.getClass();
                ke0.a = calendar2;
                FragmentActivity requireActivity = requireActivity();
                MainActivity mainActivity = requireActivity instanceof MainActivity ? (MainActivity) requireActivity : null;
                if (mainActivity != null) {
                    mainActivity.V().v.j(Boolean.FALSE);
                    zqb V = mainActivity.V();
                    Calendar calendar3 = ke0.a;
                    calendar3.getClass();
                    V.j0.j(new pn3(calendar3));
                    V.o(calendar3);
                }
            }
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "MainTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        e6b e6bVar = e6b.a;
        ad2 ad2Var = qv5.a;
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        LinkedHashMap linkedHashMap = qv5.b;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(e52.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        rq3 rq3Var = null;
        int i = 0;
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new va8(viewLifecycleOwner, (b1d) obj, this, (rq3) null, this), 3);
        krk krkVar = this.l;
        krkVar.getClass();
        InfoBubbleText infoBubbleText = ((to8) krkVar).e;
        Context requireContext = requireContext();
        requireContext.getClass();
        infoBubbleText.setVisibility((!o02.w0(requireContext) || CollectionsKt.R(this.u, (String) A().o.d())) ? 8 : 0);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((to8) krkVar2).e.setArrowBias(0.75f);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((to8) krkVar3).e.l(s2a.b, 0);
        krk krkVar4 = this.l;
        krkVar4.getClass();
        SegmentedButtonsView segmentedButtonsView = ((to8) krkVar4).f;
        Boolean bool = Boolean.FALSE;
        Pair pair = new Pair(bool, bool);
        segmentedButtonsView.k = new eyb(this, i);
        segmentedButtonsView.g = false;
        segmentedButtonsView.h = pair;
        segmentedButtonsView.j = v1h.f;
        segmentedButtonsView.i = new z1h(0);
        rlh rlhVar = rlh.b;
        if (!rlhVar.isEmpty()) {
            SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
        }
        krk krkVar5 = this.l;
        krkVar5.getClass();
        ComposeView composeView = ((to8) krkVar5).c;
        composeView.setViewCompositionStrategy(a99.i);
        composeView.setContent(new tc3(-69035399, new eyb(this, 1), true));
        u6b viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        xw3.L(wca.x(viewLifecycleOwner2.getLifecycle()), null, null, new ppa(this, rq3Var, 11), 3);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
    }
}
