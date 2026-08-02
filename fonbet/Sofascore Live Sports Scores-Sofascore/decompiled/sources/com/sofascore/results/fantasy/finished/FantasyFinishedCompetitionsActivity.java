package com.sofascore.results.fantasy.finished;

import android.os.Bundle;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.ad;
import defpackage.ay6;
import defpackage.duf;
import defpackage.jo6;
import defpackage.joa;
import defpackage.otk;
import defpackage.q3;
import defpackage.qo6;
import defpackage.tc3;
import defpackage.un0;
import defpackage.xw3;
import defpackage.xx6;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/finished/FantasyFinishedCompetitionsActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyFinishedCompetitionsActivity extends Hilt_FantasyFinishedCompetitionsActivity {
    public static final /* synthetic */ int M = 0;
    public final joa K = ypa.a(ysa.c, new qo6(this, 5));
    public final otk L = new otk(duf.a.getOrCreateKotlinClass(ay6.class), new xx6(this, 1), new xx6(this, 0), new xx6(this, 2));

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
        ay6 ay6Var = (ay6) this.L.getValue();
        xw3.L(un0.z(ay6Var), null, null, new q3(ay6Var, null, 28), 3);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        joa joaVar = this.K;
        AbstractActivity.M(this, ((ad) joaVar.getValue()).c, getString(R.string.finished_competitions), null, null, 44);
        ((ad) joaVar.getValue()).b.setContent(new tc3(1669604737, new jo6(this, 10), true));
        setContentView(((ad) joaVar.getValue()).a);
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "FinishedCompetitionsScreen";
    }

    @Override // com.sofascore.results.base.BaseActivity
    /* renamed from: v */
    public final boolean getL() {
        return false;
    }
}
