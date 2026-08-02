package com.sofascore.results.stagesport.fragments.category;

import android.os.Bundle;
import android.view.View;
import com.sofascore.results.stagesport.fragments.details.StageDetailsRankingFragment;
import defpackage.duf;
import defpackage.eqb;
import defpackage.g1i;
import defpackage.otk;
import defpackage.qfg;
import defpackage.z1i;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/stagesport/fragments/category/StageCategoryRankingFragment;", "Lcom/sofascore/results/stagesport/fragments/details/StageDetailsRankingFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StageCategoryRankingFragment extends StageDetailsRankingFragment {
    public final otk y = new otk(duf.a.getOrCreateKotlinClass(g1i.class), new z1i(this, 0), new z1i(this, 2), new z1i(this, 1));

    @Override // com.sofascore.results.stagesport.fragments.details.StageDetailsRankingFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        ((g1i) this.y.getValue()).k.e(getViewLifecycleOwner(), new eqb(24, new qfg(this, 28)));
    }
}
