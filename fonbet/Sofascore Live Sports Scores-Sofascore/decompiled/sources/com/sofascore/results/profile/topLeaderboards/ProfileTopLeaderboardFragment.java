package com.sofascore.results.profile.topLeaderboards;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import defpackage.ate;
import defpackage.bte;
import defpackage.duf;
import defpackage.e6b;
import defpackage.gta;
import defpackage.h10;
import defpackage.joa;
import defpackage.k0;
import defpackage.mqi;
import defpackage.otk;
import defpackage.rq3;
import defpackage.sbf;
import defpackage.t1d;
import defpackage.tc3;
import defpackage.u6b;
import defpackage.un0;
import defpackage.vce;
import defpackage.x2e;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.zzl;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/profile/topLeaderboards/ProfileTopLeaderboardFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileTopLeaderboardFragment extends Hilt_ProfileTopLeaderboardFragment {
    public final otk r;
    public final mqi s;
    public final tc3 t;

    public ProfileTopLeaderboardFragment() {
        joa a = ypa.a(ysa.c, new vce(new vce(this, 18), 19));
        this.r = new otk(duf.a.getOrCreateKotlinClass(sbf.class), new x2e(a, 23), new bte(this, a, 4), new x2e(a, 24));
        this.s = ypa.b(new ate(this, 17));
        this.t = new tc3(908376963, new t1d(this, 19), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A, reason: from getter */
    public final tc3 getT() {
        return this.t;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        int ordinal = ((gta) this.s.getValue()).ordinal();
        if (ordinal == 0) {
            return "TopPredictorsTab";
        }
        if (ordinal == 1) {
            return "TopContributorsTab";
        }
        if (ordinal == 2) {
            return "TopEditorsTab";
        }
        zzl.b();
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        FragmentActivity requireActivity = requireActivity();
        k0 k0Var = new k0(this, 14);
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        requireActivity.addMenuProvider(k0Var, viewLifecycleOwner, e6b.e);
        super.s(view, bundle);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        sbf sbfVar = (sbf) this.r.getValue();
        gta gtaVar = (gta) this.s.getValue();
        gtaVar.getClass();
        xw3.L(un0.z(sbfVar), null, null, new h10(gtaVar, sbfVar, (rq3) null, 18), 3);
    }
}
