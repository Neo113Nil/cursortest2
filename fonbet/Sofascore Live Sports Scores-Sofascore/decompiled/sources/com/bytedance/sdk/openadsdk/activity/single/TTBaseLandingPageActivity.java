package com.bytedance.sdk.openadsdk.activity.single;

import android.os.SystemClock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class TTBaseLandingPageActivity extends TTBaseActivity {
    private long pcc;
    private long sf;

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        long j = this.pcc;
        if (j > 0) {
            com.bytedance.sdk.openadsdk.utils.vj.pcc(j);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.sf > 0) {
            this.pcc = (SystemClock.elapsedRealtime() - this.sf) + this.pcc;
            this.sf = 0L;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.bytedance.sdk.openadsdk.utils.vj.gm()) {
            this.sf = SystemClock.elapsedRealtime();
        }
    }
}
