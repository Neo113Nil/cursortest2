package com.sofascore.results.fantasy.competition.articles;

import android.os.Bundle;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.duf;
import defpackage.h87;
import defpackage.i87;
import defpackage.joa;
import defpackage.k87;
import defpackage.n87;
import defpackage.otk;
import defpackage.tc3;
import defpackage.ty0;
import defpackage.yd3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/fantasy/competition/articles/FantasyNewsArticlesActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "Lm87;", "state", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyNewsArticlesActivity extends Hilt_FantasyNewsArticlesActivity {
    public static final /* synthetic */ int M = 0;
    public final joa K = ypa.a(ysa.c, new i87(this, 0));
    public final otk L = new otk(duf.a.getOrCreateKotlinClass(n87.class), new k87(this, 1), new k87(this, 0), new k87(this, 2));

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        joa joaVar = this.K;
        AbstractActivity.M(this, ((yd3) joaVar.getValue()).d, getString(R.string.fantasy_latest_articles), null, null, 44);
        ((UnderlinedToolbar) ((yd3) joaVar.getValue()).d.c).setBackground(null);
        ((yd3) joaVar.getValue()).b.setBackground(new ty0(((n87) this.L.getValue()).f.a));
        ((yd3) joaVar.getValue()).c.setContent(new tc3(-526665081, new h87(this, 0), true));
        setContentView(((yd3) joaVar.getValue()).a);
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "FantasyNewsScreen";
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
