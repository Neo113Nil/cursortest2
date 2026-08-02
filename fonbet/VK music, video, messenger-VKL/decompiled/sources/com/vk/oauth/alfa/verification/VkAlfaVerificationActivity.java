package com.vk.oauth.alfa.verification;

import android.content.Context;
import android.os.Bundle;
import com.vk.oauth.alfa.base.VkAlfaBaseActivity;
import xsna.bbo0;
import xsna.gnj;
import xsna.o2l;
import xsna.r55;
import xsna.sxc0;
import xsna.tmr0;
import xsna.umu0;
import xsna.w0m;
import xsna.y7u0;

/* compiled from: VkAlfaVerificationActivity.kt */
/* loaded from: classes4.dex */
public final class VkAlfaVerificationActivity extends VkAlfaBaseActivity {
    public static final /* synthetic */ int n = 0;

    @Override // com.vk.auth.oauth.VkBaseOAuthActivity
    public final w0m O1() {
        Context applicationContext = getApplicationContext();
        Bundle a = gnj.a(applicationContext);
        r55 r55Var = r55.a;
        umu0 umu0Var = r55.g;
        if (umu0Var == null) {
            umu0Var = null;
        }
        umu0Var.s.getClass();
        o2l.a.getClass();
        return new y7u0(o2l.b("__dbg_use_alfa_id_test_domain", false) ? new bbo0(applicationContext, sxc0.c(a, "com.vk.oauth.alfa.TEST_CLIENT_ID"), sxc0.c(a, "com.vk.oauth.alfa.TEST_HOST"), sxc0.c(a, "com.vk.oauth.alfa.VERIFICATION_DEEPLINK_SCHEME")) : new tmr0(applicationContext, sxc0.c(a, "com.vk.oauth.alfa.VERIFICATION_CLIENT_ID"), "id.alfabank.ru", sxc0.c(a, "com.vk.oauth.alfa.VERIFICATION_DEEPLINK_SCHEME")));
    }
}
