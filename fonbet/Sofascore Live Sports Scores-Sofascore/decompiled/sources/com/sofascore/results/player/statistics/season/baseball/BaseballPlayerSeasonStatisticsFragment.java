package com.sofascore.results.player.statistics.season.baseball;

import android.os.Bundle;
import android.view.View;
import defpackage.duf;
import defpackage.fuf;
import defpackage.ga1;
import defpackage.joa;
import defpackage.otk;
import defpackage.ple;
import defpackage.qk1;
import defpackage.r1;
import defpackage.t21;
import defpackage.tc3;
import defpackage.w1;
import defpackage.x1;
import defpackage.y1;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import defpackage.z91;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/player/statistics/season/baseball/BaseballPlayerSeasonStatisticsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BaseballPlayerSeasonStatisticsFragment extends Hilt_BaseballPlayerSeasonStatisticsFragment {
    public final otk r;
    public final otk s;

    public BaseballPlayerSeasonStatisticsFragment() {
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(ple.class), new ga1(this, 0), new ga1(this, 2), new ga1(this, 1));
        joa a = ypa.a(ysa.c, new w1(new ga1(this, 3), 16));
        this.s = new otk(fufVar.getOrCreateKotlinClass(qk1.class), new x1(a, 11), new y1(10, this, a), new x1(a, 12));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getX() {
        return new tc3(-991504126, new t21(this, 19), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "SeasonTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        z8e.y(this, ((ple) this.r.getValue()).y, new r1(this, null, 4));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        ((qk1) this.s.getValue()).u(new z91(false));
    }
}
