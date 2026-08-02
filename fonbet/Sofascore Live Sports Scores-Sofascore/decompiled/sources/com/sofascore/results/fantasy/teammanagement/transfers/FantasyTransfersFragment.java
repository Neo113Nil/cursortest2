package com.sofascore.results.fantasy.teammanagement.transfers;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.firebase.AdType;
import defpackage.ao7;
import defpackage.duf;
import defpackage.e6b;
import defpackage.fuf;
import defpackage.g9a;
import defpackage.hl7;
import defpackage.in7;
import defpackage.jn7;
import defpackage.k0;
import defpackage.k50;
import defpackage.mqi;
import defpackage.otk;
import defpackage.qa7;
import defpackage.rq3;
import defpackage.tc3;
import defpackage.u6b;
import defpackage.vz6;
import defpackage.ypa;
import defpackage.z8e;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/teammanagement/transfers/FantasyTransfersFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyTransfersFragment extends Hilt_FantasyTransfersFragment {
    public final otk r;
    public final otk s;
    public boolean t;
    public MenuItem u;

    public FantasyTransfersFragment() {
        mqi b = ypa.b(new in7(this, 0));
        vz6 vz6Var = new vz6(b, 3);
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(ao7.class), vz6Var, new jn7(this, b, 0), new vz6(b, 4));
        mqi b2 = ypa.b(new in7(this, 1));
        vz6 vz6Var2 = new vz6(b2, 5);
        this.s = new otk(fufVar.getOrCreateKotlinClass(g9a.class), vz6Var2, new jn7(this, b2, 1), new vz6(b2, 6));
        this.t = true;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getU() {
        return new tc3(929658683, new hl7(this, 3), true);
    }

    public final ao7 D() {
        return (ao7) this.r.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "SelectTransfersTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        g9a g9aVar = (g9a) this.s.getValue();
        FragmentActivity requireActivity = requireActivity();
        requireActivity.getClass();
        g9aVar.l(requireActivity, AdType.Interstitial.Fantasy);
        FragmentActivity requireActivity2 = requireActivity();
        k0 k0Var = new k0(this, 10);
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        requireActivity2.addMenuProvider(k0Var, viewLifecycleOwner, e6b.e);
        z8e.v(this, D().o, new k50(this, view, (rq3) null, 7));
        z8e.v(this, D().m, new qa7(this, (rq3) null, 7));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
    }
}
