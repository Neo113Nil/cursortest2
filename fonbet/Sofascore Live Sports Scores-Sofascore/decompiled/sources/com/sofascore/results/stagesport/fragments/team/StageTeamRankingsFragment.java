package com.sofascore.results.stagesport.fragments.team;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.e;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.results.stagesport.fragments.details.StageDetailsRankingFragment;
import defpackage.duf;
import defpackage.e1d;
import defpackage.h8i;
import defpackage.ioe;
import defpackage.joa;
import defpackage.km5;
import defpackage.otk;
import defpackage.p8i;
import defpackage.q8i;
import defpackage.r8i;
import defpackage.tc3;
import defpackage.w1i;
import defpackage.xhh;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/stagesport/fragments/team/StageTeamRankingsFragment;", "Lcom/sofascore/results/stagesport/fragments/details/StageDetailsRankingFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StageTeamRankingsFragment extends StageDetailsRankingFragment {
    public final otk y = new otk(duf.a.getOrCreateKotlinClass(h8i.class), new r8i(this, 0), new r8i(this, 2), new r8i(this, 1));
    public final joa z = ypa.a(ysa.c, new w1i(this, 4));
    public final e1d A = e.f(km5.a);
    public final e1d B = e.f(null);

    public final void E(StageSeason stageSeason) {
        C().l = stageSeason.getUniqueStage();
        D().g = Integer.valueOf(stageSeason.getId());
        D().h = stageSeason.getUniqueStage();
        D().k();
    }

    @Override // com.sofascore.results.stagesport.fragments.details.StageDetailsRankingFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        int i = 0;
        ((xhh) this.z.getValue()).c.setContent(new tc3(-1115576904, new q8i(this, i), true));
        ((h8i) this.y.getValue()).k.e(getViewLifecycleOwner(), new ioe(17, new p8i(this, i)));
        D().p.e(getViewLifecycleOwner(), new ioe(17, new p8i(this, 1)));
    }
}
