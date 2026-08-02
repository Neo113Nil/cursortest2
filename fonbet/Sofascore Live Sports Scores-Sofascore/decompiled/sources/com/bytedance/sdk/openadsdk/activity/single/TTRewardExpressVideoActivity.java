package com.bytedance.sdk.openadsdk.activity.single;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean jsj() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mk();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void pcc(long j, long j2) {
        int quq = this.sf.sf.quq();
        boolean z = this.sf.yt.vy() && quq >= 0;
        int i = (int) (j / 1000);
        gm(j, j2);
        com.bytedance.sdk.openadsdk.component.reward.view.vy vyVar = this.sf.yt;
        if (vyVar != null && vyVar.pcc() != null) {
            this.sf.yt.pcc().setTime(String.valueOf(this.vj), i, 0, false);
            this.sf.yt.pcc().pcc(j, j2);
        }
        int i2 = this.vj;
        if (i2 > 0) {
            if (!z) {
                this.sf.zti.pcc(String.valueOf(i2), null);
                return;
            }
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
            if (i < quq) {
                sfVar.zti.pcc(String.valueOf(i2), null);
                return;
            }
            if (sfVar.sf.bg() == 5 || this.sf.sf.bg() == 33) {
                this.sf.zti.pcc(String.valueOf(this.vj), null);
                return;
            }
            this.sf.pcc(true);
            this.sf.zti.pcc(String.valueOf(this.vj), TTAdDislikeToast.getSkipText());
            this.sf.zti.vj(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public Map<String, Object> tsx() {
        return this.sf.vy();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean tsz() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout zti() {
        return this.sf.yt.sf();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void hc() {
    }
}
