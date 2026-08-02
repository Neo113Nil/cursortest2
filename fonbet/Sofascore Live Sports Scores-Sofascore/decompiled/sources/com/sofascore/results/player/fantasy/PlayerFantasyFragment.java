package com.sofascore.results.player.fantasy;

import android.os.Bundle;
import android.view.View;
import defpackage.are;
import defpackage.duf;
import defpackage.joa;
import defpackage.jre;
import defpackage.otk;
import defpackage.ppa;
import defpackage.tc3;
import defpackage.un0;
import defpackage.vce;
import defpackage.wya;
import defpackage.x2e;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/player/fantasy/PlayerFantasyFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PlayerFantasyFragment extends Hilt_PlayerFantasyFragment {
    public final otk r;

    public PlayerFantasyFragment() {
        joa a = ypa.a(ysa.c, new vce(new vce(this, 6), 7));
        this.r = new otk(duf.a.getOrCreateKotlinClass(jre.class), new x2e(a, 9), new wya(29, this, a), new x2e(a, 10));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getX() {
        return new tc3(279300192, new are(this, 0), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "FantasyTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        l();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        jre jreVar = (jre) this.r.getValue();
        xw3.L(un0.z(jreVar), null, null, new ppa(jreVar, null, 24), 3);
    }
}
