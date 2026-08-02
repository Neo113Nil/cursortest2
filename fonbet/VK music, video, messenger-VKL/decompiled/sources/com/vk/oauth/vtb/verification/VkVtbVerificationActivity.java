package com.vk.oauth.vtb.verification;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.auth.oauth.VkBaseOAuthActivity;
import com.vk.auth.oauth.parcelable.AuthCodeResult;
import com.vkontakte.android.R;
import xsna.bpn0;
import xsna.drm0;
import xsna.e370;
import xsna.eml;
import xsna.epx;
import xsna.fem0;
import xsna.gnj;
import xsna.qfp;
import xsna.rex0;
import xsna.sxc0;
import xsna.uf7;
import xsna.w0m;

/* compiled from: VkVtbVerificationActivity.kt */
/* loaded from: classes4.dex */
public final class VkVtbVerificationActivity extends VkBaseOAuthActivity {
    public static final /* synthetic */ int p = 0;
    public String l;
    public String m;
    public uf7 n;
    public final bpn0 o = new bpn0(new fem0(this, 15));

    @Override // com.vk.auth.oauth.VkBaseOAuthActivity
    public final w0m O1() {
        return new qfp();
    }

    @Override // com.vk.auth.oauth.VkBaseOAuthActivity
    public final void T1() {
        try {
            this.n = new eml(0).c();
            Uri.Builder appendQueryParameter = Uri.parse(((Boolean) this.o.getValue()).booleanValue() ? "https://ift-id.vtb.ru/authorize" : "https://id.vtb.ru/authorize").buildUpon().appendQueryParameter(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE, "code");
            uf7 uf7Var = this.n;
            if (uf7Var == null) {
                uf7Var = null;
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("state", (String) uf7Var.a);
            String str = this.l;
            if (str == null) {
                str = null;
            }
            Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("client_id", str);
            String str2 = this.m;
            if (str2 == null) {
                str2 = null;
            }
            Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("redirect_uri", str2).appendQueryParameter(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL, "patronymic gender surname name mainMobilePhone userId birthDate email");
            uf7 uf7Var2 = this.n;
            if (uf7Var2 == null) {
                uf7Var2 = null;
            }
            Uri build = appendQueryParameter4.appendQueryParameter("code_challenge", (String) uf7Var2.c).appendQueryParameter("code_challenge_method", "S256").build();
            rex0 rex0Var = e370.j;
            (rex0Var != null ? rex0Var : null).b(this, build);
        } catch (Throwable unused) {
            Q1("Unknown error.");
        }
    }

    @Override // com.vk.auth.oauth.VkBaseOAuthActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle a = gnj.a(getApplicationContext());
        this.l = ((Boolean) this.o.getValue()).booleanValue() ? "vkid0da8-c6f5-4f55-b1c0-80db70208cc0" : sxc0.c(a, "com.vk.oauth.vtb.VERIFICATION_CLIENT_ID");
        this.m = new Uri.Builder().scheme(sxc0.c(a, "com.vk.oauth.vtb.VERIFICATION_DEEPLINK_SCHEME")).authority(getString(R.string.vk_vtb_deeplink_host)).build().toString();
    }

    @Override // com.vk.auth.oauth.VkBaseOAuthActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Uri data = intent.getData();
        if (data == null) {
            Q1("Redirect URI is null");
            return;
        }
        String queryParameter = data.getQueryParameter("state");
        uf7 uf7Var = this.n;
        if (uf7Var == null) {
            uf7Var = null;
        }
        if (!epx.f(queryParameter, (String) uf7Var.a)) {
            Q1("Invalid state");
            return;
        }
        String queryParameter2 = data.getQueryParameter("code");
        if (queryParameter2 == null || drm0.N(queryParameter2)) {
            Q1("Authorization code missing");
            return;
        }
        uf7 uf7Var2 = this.n;
        if (uf7Var2 == null) {
            uf7Var2 = null;
        }
        String str = (String) uf7Var2.b;
        String str2 = this.l;
        if (str2 == null) {
            str2 = null;
        }
        String str3 = this.m;
        R1(new Intent().putExtra("vk_vtb_oauth_activity.auth_code_result", new AuthCodeResult(queryParameter2, str, str2, str3 != null ? str3 : null)));
    }
}
