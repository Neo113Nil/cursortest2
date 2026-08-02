package com.vk.auth.personalaccount;

import android.os.Bundle;
import com.vk.superapp.browser.ui.VkBrowserActivity;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.a0a;
import xsna.bpn0;
import xsna.brm0;
import xsna.e43;
import xsna.ia90;

/* compiled from: VkPersonalAccountActivity.kt */
/* loaded from: classes15.dex */
public final class VkPersonalAccountActivity extends VkBrowserActivity {
    public static final /* synthetic */ int n = 0;
    public final bpn0 m = new bpn0(new ia90(19));

    @Override // com.vk.superapp.browser.ui.VkBrowserActivity, com.vk.superapp.core.ui.component.VkSdkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        if (((Boolean) this.m.getValue()).booleanValue() && (stringExtra = getIntent().getStringExtra("directUrl")) != null) {
            ArrayList a = e43.a("vk.com", "vk.ru");
            if (!a.contains(a0a.d)) {
                a.add(a0a.d);
            }
            if (!a.isEmpty()) {
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    if (brm0.B(stringExtra, "https://id." + ((String) it.next()) + "/account/", false)) {
                        break;
                    }
                }
            }
            finish();
        }
        R1();
        super.onCreate(bundle);
    }
}
