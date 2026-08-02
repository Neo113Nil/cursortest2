package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.sdk.openadsdk.utils.rj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class TTAppOpenAdTransActivity extends TTAppOpenAdActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.kj || !rj.gm((Activity) this)) {
            return;
        }
        getWindow().getDecorView().setPadding(0, (int) rj.pcc(), 0, 0);
    }
}
