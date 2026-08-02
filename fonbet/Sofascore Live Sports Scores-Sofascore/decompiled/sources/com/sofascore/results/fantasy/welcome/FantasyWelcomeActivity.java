package com.sofascore.results.fantasy.welcome;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.a5f;
import defpackage.bq7;
import defpackage.ce;
import defpackage.cq7;
import defpackage.de;
import defpackage.g7a;
import defpackage.gl7;
import defpackage.joa;
import defpackage.kt4;
import defpackage.og5;
import defpackage.qqi;
import defpackage.tc3;
import defpackage.uic;
import defpackage.ypa;
import defpackage.yrh;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/welcome/FantasyWelcomeActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyWelcomeActivity extends AbstractActivity {
    public static final /* synthetic */ int M = 0;
    public final joa J;
    public final joa K;
    public final de L;

    public FantasyWelcomeActivity() {
        cq7 cq7Var = new cq7(this, 0);
        ysa ysaVar = ysa.c;
        this.J = ypa.a(ysaVar, cq7Var);
        this.K = ypa.a(ysaVar, new cq7(this, 1));
        this.L = registerForActivityResult(new ce(4), new kt4(this, 17));
    }

    @Override // com.sofascore.results.base.BaseActivity
    /* renamed from: B */
    public final boolean getM() {
        return false;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 0;
        og5.b(this, new qqi(0, 0, 0, new gl7(5)), null, 2);
        Intent intent = getIntent();
        intent.getClass();
        Integer num = (Integer) g7a.y(intent, "competitionId", Integer.class);
        int intValue = num != null ? num.intValue() : 0;
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        boolean z = sharedPreferences.getBoolean("PREF_HAS_FANTASY_MIN_VERSION", false);
        boolean z2 = !z;
        if (z && intValue != 0) {
            uic.x(this, Integer.valueOf(intValue), 4);
            getIntent().removeExtra("competitionId");
        }
        setContentView(((yrh) this.J.getValue()).a);
        Unit unit = Unit.a;
        ((yrh) this.J.getValue()).b.setContent(new tc3(-1692316863, new bq7(this, z2, i), true));
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "FantasyWelcomeScreen";
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
