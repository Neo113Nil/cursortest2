package com.vk.superapp.browser.internal.ui.changeemail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.vk.superapp.browser.ui.VkBrowserActivity;
import java.util.Map;
import xsna.a0a;
import xsna.bqm0;
import xsna.cju0;
import xsna.qr;

/* compiled from: VkChangeEmailActivity.kt */
/* loaded from: classes6.dex */
public final class VkChangeEmailActivity extends VkBrowserActivity {
    public static final /* synthetic */ int m = 0;

    /* compiled from: VkChangeEmailActivity.kt */
    public static final class a {
        public static Intent a(Context context, String str, Map map) {
            Intent putExtra = new Intent(context, (Class<?>) VkChangeEmailActivity.class).putExtra("args", qr.b(CommonConstant.KEY_ACCESS_TOKEN, str, "key_url", bqm0.a("https://id." + a0a.d + "/account/#/email-change", map)));
            if (context.getApplicationContext() == context) {
                putExtra.addFlags(268435456);
            }
            return putExtra;
        }
    }

    @Override // com.vk.superapp.browser.ui.VkBrowserActivity
    public final com.vk.superapp.browser.ui.a Q1() {
        cju0 cju0Var = new cju0();
        Bundle bundleExtra = getIntent().getBundleExtra("args");
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        cju0Var.setArguments(bundleExtra);
        return cju0Var;
    }

    @Override // com.vk.superapp.browser.ui.VkBrowserActivity, com.vk.superapp.core.ui.component.VkSdkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        R1();
        if (isFinishing()) {
            return;
        }
        super.onCreate(bundle);
    }
}
