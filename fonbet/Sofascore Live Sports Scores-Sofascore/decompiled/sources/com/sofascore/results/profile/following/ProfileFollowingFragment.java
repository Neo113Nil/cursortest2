package com.sofascore.results.profile.following;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractFragment;
import defpackage.bte;
import defpackage.duf;
import defpackage.eqb;
import defpackage.ff8;
import defpackage.gf8;
import defpackage.hf8;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.if8;
import defpackage.iz2;
import defpackage.joa;
import defpackage.krk;
import defpackage.mf8;
import defpackage.oo8;
import defpackage.ord;
import defpackage.otk;
import defpackage.rq3;
import defpackage.t9f;
import defpackage.un0;
import defpackage.v1f;
import defpackage.vce;
import defpackage.x2e;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z45;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/profile/following/ProfileFollowingFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileFollowingFragment extends Hilt_ProfileFollowingFragment<oo8> {
    public final otk r;

    public ProfileFollowingFragment() {
        joa a = ypa.a(ysa.c, new vce(new vce(this, 12), 13));
        this.r = new otk(duf.a.getOrCreateKotlinClass(t9f.class), new x2e(a, 15), new bte(this, a, 2), new x2e(a, 16));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return oo8.b(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        u();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "FollowingTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((oo8) krkVar).e;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        this.i.b = "other_profile";
        Context requireContext = requireContext();
        requireContext.getClass();
        mf8 mf8Var = new mf8(requireContext);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((oo8) krkVar2).d;
        recyclerView.setClipChildren(false);
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        z8e.b0(recyclerView, requireContext2, false, false, null, 30);
        recyclerView.setAdapter(mf8Var);
        recyclerView.setBackgroundColor(recyclerView.getContext().getColor(R.color.surface_2));
        String string = getString(R.string.competitions);
        string.getClass();
        if8 if8Var = new if8(string);
        String string2 = getString(R.string.teams);
        string2.getClass();
        if8 if8Var2 = new if8(string2);
        String string3 = getString(R.string.athletes);
        string3.getClass();
        mf8Var.F(b.j(if8Var, ff8.a, if8Var2, hf8.a, new if8(string3), gf8.a));
        ((t9f) this.r.getValue()).g.e(getViewLifecycleOwner(), new eqb(16, new ord(29, this, mf8Var)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        t9f t9fVar = (t9f) this.r.getValue();
        String str = t9fVar.h;
        if (str == null) {
            return;
        }
        iz2 z = un0.z(t9fVar);
        hs4 hs4Var = z45.a;
        xw3.L(z, hq4.c, null, new v1f(t9fVar, str, (rq3) null, 1), 2);
    }
}
