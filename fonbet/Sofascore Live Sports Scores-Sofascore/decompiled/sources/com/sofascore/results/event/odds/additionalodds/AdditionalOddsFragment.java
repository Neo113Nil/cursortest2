package com.sofascore.results.event.odds.additionalodds;

import defpackage.dsi;
import defpackage.duf;
import defpackage.fk;
import defpackage.fuf;
import defpackage.jj;
import defpackage.joa;
import defpackage.kk;
import defpackage.mr5;
import defpackage.otk;
import defpackage.ou4;
import defpackage.pi;
import defpackage.t21;
import defpackage.tc3;
import defpackage.un0;
import defpackage.w1;
import defpackage.x1;
import defpackage.xw3;
import defpackage.y1;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/event/odds/additionalodds/AdditionalOddsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "Lvnb;", "Lek;", "state", "", "isPullRefreshing", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdditionalOddsFragment extends Hilt_AdditionalOddsFragment {
    public final otk r;
    public final otk s;
    public final otk t;
    public ou4 u;
    public final tc3 v;

    public AdditionalOddsFragment() {
        fuf fufVar = duf.a;
        int i = 1;
        this.r = new otk(fufVar.getOrCreateKotlinClass(mr5.class), new jj(this, 0), new jj(this, 2), new jj(this, i));
        int i2 = 5;
        this.s = new otk(fufVar.getOrCreateKotlinClass(dsi.class), new jj(this, 3), new jj(this, i2), new jj(this, 4));
        pi piVar = new pi(i, this, this);
        joa a = ypa.a(ysa.c, new w1(new w1(this, 7), 8));
        int i3 = 6;
        this.t = new otk(fufVar.getOrCreateKotlinClass(kk.class), new x1(a, 4), new y1(i3, this, a), new y1(i2, piVar, a));
        this.v = new tc3(-1830900462, new t21(this, i3), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A, reason: from getter */
    public final tc3 getU() {
        return this.v;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ou4 ou4Var = this.u;
        if (ou4Var != null) {
            ou4Var.b();
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ou4 ou4Var = this.u;
        if (ou4Var != null) {
            ou4Var.f();
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "AdditionalOddsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        kk kkVar = (kk) this.t.getValue();
        xw3.L(un0.z(kkVar), null, null, new fk(kkVar, null, 0), 3);
    }
}
