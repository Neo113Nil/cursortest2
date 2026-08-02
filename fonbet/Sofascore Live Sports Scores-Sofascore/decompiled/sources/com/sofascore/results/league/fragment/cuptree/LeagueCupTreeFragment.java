package com.sofascore.results.league.fragment.cuptree;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.results.R;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.league.view.cuptree.CupTreeExtendedView;
import com.sofascore.results.league.view.cuptree.ExpandButton;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import defpackage.co8;
import defpackage.dsi;
import defpackage.duf;
import defpackage.frh;
import defpackage.hz8;
import defpackage.krk;
import defpackage.mqi;
import defpackage.nr1;
import defpackage.otk;
import defpackage.oua;
import defpackage.q8g;
import defpackage.sr8;
import defpackage.tz9;
import defpackage.ypa;
import defpackage.yta;
import defpackage.z8e;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/league/fragment/cuptree/LeagueCupTreeFragment;", "Lcom/sofascore/results/league/fragment/cuptree/BaseCupTreeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LeagueCupTreeFragment extends Hilt_LeagueCupTreeFragment {
    public final otk A = new otk(duf.a.getOrCreateKotlinClass(yta.class), new oua(this, 0), new oua(this, 2), new oua(this, 1));
    public final mqi B = ypa.b(new sr8(this, 18));

    @Override // com.sofascore.results.league.fragment.cuptree.BaseCupTreeFragment
    public final boolean B() {
        return ((yta) this.A.getValue()).r;
    }

    @Override // com.sofascore.results.league.fragment.cuptree.BaseCupTreeFragment
    public final boolean C() {
        return tz9.H(((yta) this.A.getValue()).q);
    }

    @Override // com.sofascore.results.league.fragment.cuptree.BaseCupTreeFragment
    public final Integer E() {
        return (Integer) this.B.getValue();
    }

    @Override // com.sofascore.results.league.fragment.cuptree.BaseCupTreeFragment
    /* renamed from: F */
    public final q8g getN() {
        return ((yta) this.A.getValue()).q != null ? q8g.FLAT : this.n;
    }

    @Override // com.sofascore.results.league.fragment.cuptree.BaseCupTreeFragment
    public final Season G() {
        return ((yta) this.A.getValue()).l();
    }

    @Override // com.sofascore.results.league.fragment.cuptree.BaseCupTreeFragment
    public final Tournament H() {
        return ((yta) this.A.getValue()).o();
    }

    @Override // com.sofascore.results.league.fragment.cuptree.BaseCupTreeFragment
    public final void I(boolean z) {
        FragmentActivity requireActivity = requireActivity();
        LeagueActivity leagueActivity = requireActivity instanceof LeagueActivity ? (LeagueActivity) requireActivity : null;
        if (leagueActivity != null) {
            if (z) {
                hz8.B(leagueActivity.S().e, 200L);
            } else {
                hz8.C(leagueActivity.S().e, 200L, 11);
            }
            if (((dsi) leagueActivity.S.getValue()).d) {
                return;
            }
            leagueActivity.S().l.setUserInputEnabled(!z);
            if (z) {
                hz8.B(leagueActivity.S().i, 200L);
            } else {
                hz8.C(leagueActivity.S().i, 200L, 11);
            }
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        if (C()) {
            int color = requireContext().getColor(R.color.on_color_highlight_2);
            krk krkVar = this.l;
            krkVar.getClass();
            ((co8) krkVar).k.setBackgroundColor(0);
            krk krkVar2 = this.l;
            krkVar2.getClass();
            ((co8) krkVar2).f.setBackgroundColor(color);
            krk krkVar3 = this.l;
            krkVar3.getClass();
            CupTreeExtendedView cupTreeExtendedView = ((co8) krkVar3).e;
            nr1 nr1Var = cupTreeExtendedView.d;
            ((TypeHeaderView) nr1Var.h).setStyle(frh.m);
            ((TypeHeaderView) nr1Var.h).setBackgroundColor(0);
            int color2 = cupTreeExtendedView.getContext().getColor(R.color.on_color_secondary);
            nr1Var.b.setTextColor(color2);
            ((TextView) nr1Var.e).setTextColor(color2);
            krk krkVar4 = this.l;
            krkVar4.getClass();
            ExpandButton expandButton = ((co8) krkVar4).g;
            z8e.V(color, expandButton);
            expandButton.setImageTintList(ColorStateList.valueOf(requireContext().getColor(R.color.on_color_primary)));
        }
    }
}
