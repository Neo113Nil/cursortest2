package com.sofascore.results.fantasy.competition.managerprofile;

import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.a99;
import defpackage.d77;
import defpackage.duf;
import defpackage.e77;
import defpackage.fuf;
import defpackage.g9a;
import defpackage.joa;
import defpackage.otk;
import defpackage.py0;
import defpackage.q77;
import defpackage.qo6;
import defpackage.r77;
import defpackage.tc3;
import defpackage.un0;
import defpackage.unb;
import defpackage.xw3;
import defpackage.yd3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/competition/managerprofile/FantasyManagerProfileActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyManagerProfileActivity extends Hilt_FantasyManagerProfileActivity {
    public static final /* synthetic */ int N = 0;
    public final joa K = ypa.a(ysa.c, new qo6(this, 10));
    public final otk L;
    public final otk M;

    public FantasyManagerProfileActivity() {
        e77 e77Var = new e77(this, 1);
        fuf fufVar = duf.a;
        this.L = new otk(fufVar.getOrCreateKotlinClass(r77.class), new e77(this, 2), e77Var, new e77(this, 3));
        this.M = new otk(fufVar.getOrCreateKotlinClass(g9a.class), new e77(this, 5), new e77(this, 4), new e77(this, 6));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
        if (R().l() instanceof unb) {
            return;
        }
        r77 R = R();
        xw3.L(un0.z(R), null, null, new q77(R, null), 3);
    }

    public final yd3 Q() {
        return (yd3) this.K.getValue();
    }

    public final r77 R() {
        return (r77) this.L.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Q().a);
        AbstractActivity.M(this, Q().d, R().n.b, R().n.g, null, 56);
        ((UnderlinedToolbar) Q().d.c).setBackground(null);
        Q().b.setBackground(new py0(R().n.c.f));
        ComposeView composeView = Q().c;
        composeView.setViewCompositionStrategy(a99.i);
        composeView.setContent(new tc3(386491200, new d77(this, 0), true));
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "FantasyManagerScreen";
    }
}
