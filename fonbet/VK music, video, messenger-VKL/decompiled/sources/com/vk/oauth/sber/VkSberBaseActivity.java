package com.vk.oauth.sber;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vk.auth.oauth.VkBaseOAuthActivity;
import com.vk.auth.oauth.parcelable.AuthCodeResult;
import com.vk.oauth.sber.verification.VkSberVerificationActivity;
import com.vk.toggle.anonymous.SakFeatures;
import xsna.eo70;
import xsna.epx;
import xsna.ihv0;
import xsna.jhv0;
import xsna.m2h0;
import xsna.o19;
import xsna.w0m;

/* compiled from: VkSberBaseActivity.kt */
/* loaded from: classes4.dex */
public abstract class VkSberBaseActivity extends VkBaseOAuthActivity {
    public static String n;
    public jhv0 l;
    public m2h0 m;

    /* compiled from: VkSberBaseActivity.kt */
    public static final class a {
        public static Intent a(Context context, String str) {
            VkSberBaseActivity.n = o19.c();
            Intent intent = new Intent(context, (Class<?>) VkSberVerificationActivity.class);
            intent.putExtra("vk_base_oauth_activity.key_start_auth", true);
            intent.putExtra("KEY_NONCE", str);
            intent.putExtra("KEY_ACTIVITY_VERIFICATION_CODE", VkSberBaseActivity.n);
            return intent;
        }
    }

    @Override // com.vk.auth.oauth.VkBaseOAuthActivity
    public final void T1() {
        String stringExtra = getIntent().getStringExtra("KEY_ACTIVITY_VERIFICATION_CODE");
        String str = n;
        n = null;
        if (str == null || !epx.f(stringExtra, str)) {
            Q1("Invalid verification code.");
            return;
        }
        String stringExtra2 = getIntent().getStringExtra("KEY_NONCE");
        if (stringExtra2 == null) {
            Q1("Nonce is null.");
        } else {
            jhv0 jhv0Var = this.l;
            (jhv0Var != null ? jhv0Var : null).c(this, stringExtra2);
        }
    }

    @Override // com.vk.auth.oauth.VkBaseOAuthActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        w0m w0mVar = this.f;
        if (w0mVar == null) {
            w0mVar = null;
        }
        ihv0 ihv0Var = (ihv0) w0mVar;
        this.l = ihv0Var.a();
        this.m = ihv0Var.x();
        if (bundle == null || getIntent().getStringExtra("KEY_NONCE") == null) {
            return;
        }
        jhv0 jhv0Var = this.l;
        (jhv0Var != null ? jhv0Var : null).getClass();
    }

    @Override // com.vk.auth.oauth.VkBaseOAuthActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        jhv0 jhv0Var = this.l;
        if (jhv0Var == null) {
            jhv0Var = null;
        }
        eo70 a2 = jhv0Var.a(intent);
        if (!(a2 instanceof eo70.e)) {
            Q1(null);
            return;
        }
        String str = ((eo70.e) a2).a;
        jhv0 jhv0Var2 = this.l;
        if (jhv0Var2 == null) {
            jhv0Var2 = null;
        }
        String b = jhv0Var2.b();
        m2h0 m2h0Var = this.m;
        if (m2h0Var == null) {
            m2h0Var = null;
        }
        m2h0Var.getClass();
        String c = SakFeatures.Type.SAK_SBER_ID_CLOUD.h() ? m2h0Var.c() : m2h0Var.b();
        m2h0 m2h0Var2 = this.m;
        R1(new Intent().putExtra("SBER_AUTH_CODE_RESULT", new AuthCodeResult(str, b, c, (m2h0Var2 != null ? m2h0Var2 : null).a())));
    }
}
