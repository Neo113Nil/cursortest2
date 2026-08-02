package com.sofascore.results.fantasy.walkthrough.createteam;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.fantasy.walkthrough.createteam.selectreplacement.FantasyWalkthroughSelectReplacementDialogFragment;
import defpackage.a99;
import defpackage.cp7;
import defpackage.duf;
import defpackage.e6b;
import defpackage.fp7;
import defpackage.fuf;
import defpackage.fz8;
import defpackage.g9a;
import defpackage.joa;
import defpackage.k0;
import defpackage.krk;
import defpackage.l84;
import defpackage.otk;
import defpackage.px0;
import defpackage.qo6;
import defpackage.rq3;
import defpackage.tc3;
import defpackage.u6b;
import defpackage.vp7;
import defpackage.wrh;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/fantasy/walkthrough/createteam/FantasyWalkthroughCreateTeamFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lwrh;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyWalkthroughCreateTeamFragment extends Hilt_FantasyWalkthroughCreateTeamFragment<wrh> {
    public final otk r;
    public final otk s;
    public final joa t;
    public MenuItem u;

    public FantasyWalkthroughCreateTeamFragment() {
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(vp7.class), new fp7(this, 0), new fp7(this, 2), new fp7(this, 1));
        this.s = new otk(fufVar.getOrCreateKotlinClass(g9a.class), new fp7(this, 3), new fp7(this, 5), new fp7(this, 4));
        this.t = ypa.a(ysa.c, new qo6(this, 21));
    }

    public final vp7 C() {
        return (vp7) this.r.getValue();
    }

    public final void D(String str) {
        int i = C().k().a.c;
        int i2 = C().k().b;
        FantasyWalkthroughSelectReplacementDialogFragment fantasyWalkthroughSelectReplacementDialogFragment = new FantasyWalkthroughSelectReplacementDialogFragment();
        fantasyWalkthroughSelectReplacementDialogFragment.setArguments(fz8.C(fz8.D(i, "competitionId"), fz8.D(i2, "roundId"), fz8.H("position", str), fz8.F(SearchResponseKt.PLAYER_ENTITY, null)));
        fantasyWalkthroughSelectReplacementDialogFragment.p(requireActivity().k(), "");
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return wrh.b(getLayoutInflater(), null, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getOnBackPressedDispatcher().a(this, new px0(5, this, false));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "CreateTeamTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        FragmentActivity requireActivity = requireActivity();
        k0 k0Var = new k0(this, 11);
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        requireActivity.addMenuProvider(k0Var, viewLifecycleOwner, e6b.e);
        z8e.v(this, C().n, new l84(this, view, (rq3) null));
        krk krkVar = this.l;
        krkVar.getClass();
        ComposeView composeView = ((wrh) krkVar).b;
        composeView.setViewCompositionStrategy(a99.i);
        composeView.setContent(new tc3(-62550614, new cp7(this, composeView, 0), true));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
    }
}
