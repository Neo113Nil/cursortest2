package com.vk.auth.captcha.impl;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import xsna.e370;
import xsna.gfx0;
import xsna.myd0;
import xsna.tgn0;
import xsna.vzg0;

/* compiled from: SakCaptchaActivity.kt */
/* loaded from: classes15.dex */
public final class SakCaptchaActivity extends AppCompatActivity {
    public static final /* synthetic */ int f = 0;

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        tgn0 tgn0Var = e370.x;
        if (tgn0Var == null) {
            tgn0Var = null;
        }
        gfx0 gfx0Var = e370.b;
        setTheme(tgn0Var.c(gfx0Var != null ? gfx0Var : null));
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("url");
        int intExtra = getIntent().getIntExtra("height", -1);
        int intExtra2 = getIntent().getIntExtra("width", -1);
        double doubleExtra = getIntent().getDoubleExtra("ratio", -1.0d);
        boolean booleanExtra = getIntent().getBooleanExtra("is_refresh_enabled", false);
        String stringExtra2 = getIntent().getStringExtra("captcha_sid");
        boolean booleanExtra2 = getIntent().getBooleanExtra("is_sound_captcha_available", false);
        String stringExtra3 = getIntent().getStringExtra("captcha_track");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        String str = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("captcha_token");
        String str2 = stringExtra4 != null ? stringExtra4 : "";
        vzg0 vzg0Var = new vzg0();
        Bundle bundle2 = new Bundle(3);
        bundle2.putString("url", stringExtra);
        bundle2.putInt("height", intExtra);
        bundle2.putInt("width", intExtra2);
        bundle2.putDouble("ratio", doubleExtra);
        bundle2.putBoolean("is_refresh_enabled", booleanExtra);
        bundle2.putString("captcha_sid", stringExtra2);
        bundle2.putBoolean("is_sound_captcha_available", booleanExtra2);
        bundle2.putString("captcha_track", str);
        bundle2.putString("captcha_token", str2);
        vzg0Var.setArguments(bundle2);
        vzg0Var.Vn(new myd0(this, 6));
        vzg0Var.Td(getSupportFragmentManager(), "SAK_CAPTCHA");
    }
}
