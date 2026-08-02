package com.sofascore.results.fantasy.teammanagement.substitutions;

import android.os.Bundle;
import android.view.MenuItem;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.bl7;
import defpackage.cl7;
import defpackage.duf;
import defpackage.e6b;
import defpackage.f5p;
import defpackage.joa;
import defpackage.k0;
import defpackage.ml7;
import defpackage.otk;
import defpackage.px0;
import defpackage.qa7;
import defpackage.qo6;
import defpackage.rq3;
import defpackage.tc3;
import defpackage.ty0;
import defpackage.yd3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/fantasy/teammanagement/substitutions/FantasySubstitutionsActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "ao2", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasySubstitutionsActivity extends AbstractActivity {
    public static final /* synthetic */ int M = 0;
    public final joa J = ypa.a(ysa.c, new qo6(this, 18));
    public final otk K = new otk(duf.a.getOrCreateKotlinClass(ml7.class), new cl7(this, 1), new cl7(this, 0), new cl7(this, 2));
    public MenuItem L;

    public final ml7 Q() {
        return (ml7) this.K.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getOnBackPressedDispatcher().a(this, new px0(3, this, false));
        addMenuProvider(new k0(this, 9), this, e6b.d);
        joa joaVar = this.J;
        AbstractActivity.M(this, ((yd3) joaVar.getValue()).d, getString(R.string.substitutions), f5p.B(this, Q().g.a.c, Q().g.a.b), null, 40);
        ((UnderlinedToolbar) ((yd3) joaVar.getValue()).d.c).setBackground(null);
        ((yd3) joaVar.getValue()).b.setBackground(new ty0(Q().h.a));
        ((yd3) joaVar.getValue()).c.setContent(new tc3(-746818375, new bl7(this, 0), true));
        setContentView(((yd3) joaVar.getValue()).a);
        z8e.x(this, Q().n, new qa7(this, (rq3) null, 5));
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "FantasySubstitutionsScreen";
    }

    @Override // com.sofascore.results.base.BaseActivity
    /* renamed from: v */
    public final boolean getL() {
        return false;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
