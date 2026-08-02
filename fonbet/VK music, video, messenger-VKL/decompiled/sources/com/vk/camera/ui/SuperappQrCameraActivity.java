package com.vk.camera.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.registration.funnels.b;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.core.ui.component.VkSdkActivity;
import com.vkontakte.android.R;
import xsna.e370;
import xsna.frf0;
import xsna.gfx0;
import xsna.nhn0;
import xsna.pne0;
import xsna.tgn0;
import xsna.x52;

/* compiled from: SuperappQrCameraActivity.kt */
/* loaded from: classes16.dex */
public final class SuperappQrCameraActivity extends VkSdkActivity implements pne0 {
    public static final /* synthetic */ int g = 0;
    public View f;

    /* compiled from: SuperappQrCameraActivity.kt */
    public static final class a {
        public static Intent a(int i, Context context, boolean z) {
            int i2 = SuperappQrCameraActivity.g;
            SuperappQrCameraUiConfig superappQrCameraUiConfig = new SuperappQrCameraUiConfig(false, 1, null);
            boolean z2 = (i & 4) == 0;
            if ((i & 8) != 0) {
                z = false;
            }
            Intent intent = new Intent(context, (Class<?>) SuperappQrCameraActivity.class);
            intent.putExtra("qr_ui_config", superappQrCameraUiConfig);
            intent.putExtra("ignore_sak_theme", z2);
            intent.putExtra("portrait_orientation", z);
            return intent;
        }
    }

    @Override // xsna.pne0
    public final void M0() {
        setResult(0, null);
        finish();
    }

    @Override // com.vk.superapp.core.ui.component.VkSdkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("portrait_orientation", false)) {
            setRequestedOrientation(1);
        }
        setContentView(R.layout.vk_superapp_qr_activity);
        if (bundle != null && !bundle.getBoolean("ignore_sak_theme")) {
            tgn0 tgn0Var = e370.x;
            if (tgn0Var == null) {
                tgn0Var = null;
            }
            gfx0 gfx0Var = e370.b;
            if (gfx0Var == null) {
                gfx0Var = null;
            }
            setTheme(tgn0Var.c(gfx0Var));
        }
        this.f = findViewById(R.id.fr_container);
        if (getSupportFragmentManager().H("qr_fragment") == null) {
            Intent intent2 = getIntent();
            SuperappQrCameraUiConfig superappQrCameraUiConfig = intent2 != null ? (SuperappQrCameraUiConfig) intent2.getParcelableExtra("qr_ui_config") : null;
            if (superappQrCameraUiConfig == null) {
                superappQrCameraUiConfig = null;
            }
            if (superappQrCameraUiConfig == null) {
                superappQrCameraUiConfig = new SuperappQrCameraUiConfig(false, 1, null);
            }
            nhn0 nhn0Var = new nhn0();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("qr_ui_config", superappQrCameraUiConfig);
            nhn0Var.setArguments(bundle2);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.f(R.id.fr_container, nhn0Var, "qr_fragment", 1);
            aVar.l();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            b.a.getClass();
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.g(SchemeStatSak$EventScreen.QR_SCANNER, SchemeStatSak$EventScreen.START_WITH_PHONE, null, null, 12);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        View view = this.f;
        if (view == null) {
            view = null;
        }
        view.postDelayed(new x52(this, 13), 500L);
    }

    @Override // xsna.pne0
    public final void q1(String str) {
        Intent intent = new Intent();
        intent.putExtra("CODE_READER_RESULT", str);
        setResult(-1, intent);
        finish();
    }
}
