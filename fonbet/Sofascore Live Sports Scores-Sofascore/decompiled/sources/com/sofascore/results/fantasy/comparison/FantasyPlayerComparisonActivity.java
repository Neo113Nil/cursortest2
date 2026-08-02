package com.sofascore.results.fantasy.comparison;

import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.a99;
import defpackage.ad;
import defpackage.duf;
import defpackage.lc7;
import defpackage.mc7;
import defpackage.mqi;
import defpackage.otk;
import defpackage.qo6;
import defpackage.tc3;
import defpackage.yc7;
import defpackage.ypa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/fantasy/comparison/FantasyPlayerComparisonActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "ml4", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyPlayerComparisonActivity extends AbstractActivity {
    public static final /* synthetic */ int L = 0;
    public final mqi J = ypa.b(new qo6(this, 15));
    public final otk K = new otk(duf.a.getOrCreateKotlinClass(yc7.class), new mc7(this, 1), new mc7(this, 0), new mc7(this, 2));

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mqi mqiVar = this.J;
        setContentView(((ad) mqiVar.getValue()).a);
        AbstractActivity.M(this, ((ad) mqiVar.getValue()).c, getString(R.string.player_comparison), null, null, 60);
        ComposeView composeView = ((ad) mqiVar.getValue()).b;
        composeView.setViewCompositionStrategy(a99.i);
        composeView.setContent(new tc3(367031234, new lc7(this, 0), true));
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "FantasyPlayerComparisonScreen";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
