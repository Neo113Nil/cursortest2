package com.vk.voip.ui.assessment;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.vk.core.ui.themes.ThemableActivity;
import com.vk.log.L;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.kotlin.c;
import xsna.a201;
import xsna.asu0;
import xsna.cow0;
import xsna.dhr0;
import xsna.enj;
import xsna.gu9;
import xsna.hy5;
import xsna.oe5;
import xsna.r50;
import xsna.v080;
import xsna.v9b;
import xsna.woe0;
import xsna.xw3;

/* compiled from: VoipAssessmentActivity.kt */
/* loaded from: classes7.dex */
public final class VoipAssessmentActivity extends ThemableActivity implements v080 {
    public static final /* synthetic */ int m = 0;
    public xw3 l = new xw3(0, null);

    @Override // xsna.v080
    public final void S0(BadAssessmentReason badAssessmentReason) {
        this.l = new xw3(this.l.a, badAssessmentReason);
        enj.q(R.string.voip_call_qiality_assessment_send_gratitude, 1, this);
        finish();
    }

    @Override // xsna.v080
    public final void i1(xw3 xw3Var) {
        this.l = xw3Var;
        if (xw3Var.a >= 4) {
            enj.q(R.string.voip_call_qiality_assessment_send_gratitude, 1, this);
            finish();
            return;
        }
        hy5 hy5Var = new hy5();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        a aVar = new a(supportFragmentManager);
        aVar.g(R.id.fragment_container, hy5Var, null);
        aVar.k(true);
    }

    @Override // com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        setTheme(dhr0.M() ? R.style.VoipDialogDarkTheme : R.style.VoipDialogTheme);
        super.onCreate(bundle);
        setContentView(R.layout.voip_assessment_activity);
        findViewById(R.id.root_view).setOnClickListener(new v9b(this, 14));
        ((ViewGroup) findViewById(R.id.fragment_container)).setBackground(gu9.a(this));
        woe0 woe0Var = new woe0();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        a aVar = new a(supportFragmentManager);
        aVar.g(R.id.fragment_container, woe0Var, null);
        aVar.k(true);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        this.l = new xw3(0, null);
        woe0 woe0Var = new woe0();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        a aVar = new a(supportFragmentManager);
        aVar.g(R.id.fragment_container, woe0Var, null);
        aVar.k(true);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        cow0 cow0Var;
        super.onPause();
        if (isFinishing()) {
            Intent intent = getIntent();
            VoipAssessmentActivityArguments voipAssessmentActivityArguments = intent != null ? (VoipAssessmentActivityArguments) intent.getParcelableExtra("VoipAssessmentActivity.Arguments") : null;
            if (voipAssessmentActivityArguments == null || (cow0Var = voipAssessmentActivityArguments.b) == null) {
                return;
            }
            c.d(a201.b().b().a().o(asu0.a.d()), new oe5(26, this, cow0Var), new r50(L.a, 8));
        }
    }

    @Override // xsna.v080
    public final void x() {
        enj.q(R.string.voip_call_qiality_assessment_send_gratitude, 1, this);
        finish();
    }
}
