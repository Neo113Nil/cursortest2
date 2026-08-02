package com.sofascore.results.fantasy.userteam;

import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import defpackage.a99;
import defpackage.duf;
import defpackage.io7;
import defpackage.jo7;
import defpackage.mqi;
import defpackage.otk;
import defpackage.qa7;
import defpackage.qo6;
import defpackage.rq3;
import defpackage.tc3;
import defpackage.un0;
import defpackage.uo7;
import defpackage.vo7;
import defpackage.xw3;
import defpackage.yd3;
import defpackage.ypa;
import defpackage.z8e;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/fantasy/userteam/FantasyUserSquadActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "p4h", "Lro7;", "uiState", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyUserSquadActivity extends Hilt_FantasyUserSquadActivity {
    public static final /* synthetic */ int N = 0;
    public final mqi K = ypa.b(new qo6(this, 20));
    public final otk L = new otk(duf.a.getOrCreateKotlinClass(vo7.class), new jo7(this, 1), new jo7(this, 0), new jo7(this, 2));
    public boolean M = true;

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
        vo7 Q = Q();
        xw3.L(un0.z(Q), null, null, new uo7(null, Q, null), 3);
    }

    public final vo7 Q() {
        return (vo7) this.L.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mqi mqiVar = this.K;
        setContentView(((yd3) mqiVar.getValue()).a);
        this.x.a = Integer.valueOf(Q().i);
        ((UnderlinedToolbar) ((yd3) mqiVar.getValue()).d.c).setBackground(null);
        z8e.x(this, Q().l, new qa7(this, (rq3) null, 10));
        ComposeView composeView = ((yd3) mqiVar.getValue()).c;
        composeView.setViewCompositionStrategy(a99.i);
        composeView.setContent(new tc3(-508097877, new io7(this, 0), true));
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "FantasyCompetitorTeamScreen";
    }
}
