package com.sofascore.results.ads;

import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import com.sofascore.results.R;
import defpackage.a99;
import defpackage.duf;
import defpackage.lqj;
import defpackage.mp1;
import defpackage.mqi;
import defpackage.ndk;
import defpackage.otk;
import defpackage.pdk;
import defpackage.qdk;
import defpackage.rq3;
import defpackage.sy0;
import defpackage.tc3;
import defpackage.xdk;
import defpackage.yd3;
import defpackage.ypa;
import defpackage.z8e;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/ads/UpgradeSofascoreActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "e2f", "Ldli;", "skuDetails", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UpgradeSofascoreActivity extends Hilt_UpgradeSofascoreActivity {
    public static final /* synthetic */ int M = 0;
    public final mqi K = ypa.b(new ndk(this, 0));
    public final otk L = new otk(duf.a.getOrCreateKotlinClass(xdk.class), new qdk(this, 1), new qdk(this, 0), new qdk(this, 2));

    public final xdk Q() {
        return (xdk) this.L.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mqi mqiVar = this.K;
        setContentView(((yd3) mqiVar.getValue()).a);
        ((yd3) mqiVar.getValue()).b.setBackground(sy0.a);
        G();
        String string = getString(R.string.upgrade_sofascore);
        string.getClass();
        setTitle(string);
        rq3 rq3Var = null;
        int i = 9;
        z8e.x(this, Q().g.r, new mp1(this, rq3Var, i));
        z8e.x(this, Q().k, new pdk(this, rq3Var, 0));
        ComposeView composeView = ((yd3) mqiVar.getValue()).c;
        composeView.setViewCompositionStrategy(a99.i);
        composeView.setContent(new tc3(937002755, new lqj(this, i), true));
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "SubscriptionScreen";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
