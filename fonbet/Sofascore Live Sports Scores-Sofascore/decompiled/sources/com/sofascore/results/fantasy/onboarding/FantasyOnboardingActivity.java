package com.sofascore.results.fantasy.onboarding;

import android.os.Bundle;
import defpackage.bfk;
import defpackage.og5;
import defpackage.p87;
import defpackage.rgh;
import defpackage.tc3;
import defpackage.zb3;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/fantasy/onboarding/FantasyOnboardingActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "uic", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyOnboardingActivity extends Hilt_FantasyOnboardingActivity {
    public static final /* synthetic */ int M = 0;
    public bfk K;
    public final rgh L = new rgh(this);

    @Override // com.sofascore.results.base.BaseActivity
    /* renamed from: B */
    public final boolean getM() {
        return false;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        og5.b(this, null, null, 3);
        zb3.a(this, new tc3(1990226241, new p87(this, 0), true));
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "FantasyOnboardingScreen";
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
