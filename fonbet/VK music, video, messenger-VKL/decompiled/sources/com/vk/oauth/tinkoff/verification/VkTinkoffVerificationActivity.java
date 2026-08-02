package com.vk.oauth.tinkoff.verification;

import android.content.Context;
import android.content.Intent;
import com.vk.oauth.tinkoff.VkTinkoffBaseActivity;
import com.vk.superapp.verification.account.VerificationFlow;
import xsna.bpn0;
import xsna.isv0;
import xsna.jsv0;
import xsna.pyr0;
import xsna.w0m;

/* compiled from: VkTinkoffVerificationActivity.kt */
/* loaded from: classes4.dex */
public final class VkTinkoffVerificationActivity extends VkTinkoffBaseActivity {
    public static final /* synthetic */ int q = 0;
    public final bpn0 p = new bpn0(new pyr0(this, 17));

    @Override // com.vk.auth.oauth.VkBaseOAuthActivity
    public final w0m O1() {
        VerificationFlow verificationFlow;
        Context applicationContext = getApplicationContext();
        Intent intent = getIntent();
        if (intent == null || (verificationFlow = (VerificationFlow) intent.getParcelableExtra("verificationFlow")) == null) {
            verificationFlow = VerificationFlow.Web.b;
        }
        return new jsv0(applicationContext, verificationFlow);
    }

    @Override // com.vk.oauth.tinkoff.VkTinkoffBaseActivity
    public final isv0 V1() {
        return (isv0) this.p.getValue();
    }
}
