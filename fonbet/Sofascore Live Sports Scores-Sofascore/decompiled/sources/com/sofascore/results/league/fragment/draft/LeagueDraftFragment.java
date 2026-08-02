package com.sofascore.results.league.fragment.draft;

import android.os.Bundle;
import android.view.View;
import com.sofascore.model.mvvm.model.Season;
import defpackage.awa;
import defpackage.duf;
import defpackage.faa;
import defpackage.fuf;
import defpackage.fwa;
import defpackage.hv7;
import defpackage.ix7;
import defpackage.joa;
import defpackage.o3a;
import defpackage.otk;
import defpackage.sva;
import defpackage.tc3;
import defpackage.un0;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yta;
import defpackage.z07;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/league/fragment/draft/LeagueDraftFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LeagueDraftFragment extends Hilt_LeagueDraftFragment {
    public final otk r;
    public final otk s;

    public LeagueDraftFragment() {
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(yta.class), new sva(this, 0), new sva(this, 2), new sva(this, 1));
        joa a = ypa.a(ysa.c, new hv7(new sva(this, 3), 14));
        this.s = new otk(fufVar.getOrCreateKotlinClass(fwa.class), new ix7(a, 9), new z07(28, this, a), new ix7(a, 10));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getS() {
        return new tc3(297093091, new faa(this, 6), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "DraftTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        this.i.a = o3a.F(((yta) this.r.getValue()).o());
        l();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        fwa fwaVar = (fwa) this.s.getValue();
        otk otkVar = this.r;
        Integer F = o3a.F(((yta) otkVar.getValue()).o());
        int intValue = F != null ? F.intValue() : -1;
        Season l = ((yta) otkVar.getValue()).l();
        int id = l != null ? l.getId() : -1;
        boolean z = ((yta) otkVar.getValue()).l;
        String sportSlug = ((yta) otkVar.getValue()).o().getSportSlug();
        sportSlug.getClass();
        xw3.L(un0.z(fwaVar), null, null, new awa(fwaVar, intValue, id, z, sportSlug, null), 3);
    }
}
