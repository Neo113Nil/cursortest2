package com.bytedance.sdk.openadsdk.activity.single;

import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.model.of;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean jsj() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void nn() {
        if (of.vj(this.sf.sf)) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.vy vyVar = this.sf.yt;
        if (vyVar == null || vyVar.pcc() == null) {
            return;
        }
        this.sf.yt.pcc().setTime("0", 0, 0, false);
        if (this.sf.yt.vy()) {
            this.sf.zti.pcc("0", "X");
            this.sf.zti.vj(true);
            this.sf.zti.gm();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        mk();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void pcc(long j, long j2) {
        int i = (int) (j / 1000);
        com.bytedance.sdk.openadsdk.component.reward.view.vy vyVar = this.sf.yt;
        if (vyVar != null && vyVar.pcc() != null) {
            this.sf.yt.pcc().setTime(String.valueOf(this.vj), i, 0, false);
            this.sf.yt.pcc().pcc(j, j2);
        }
        com.bytedance.sdk.openadsdk.component.reward.view.vy vyVar2 = this.sf.yt;
        if ((vyVar2 == null || !vyVar2.vy()) && !this.sf.sf.nmd()) {
            return;
        }
        pcc(i);
        if (this.vj >= 0) {
            this.sf.zti.oo(true);
            this.sf.zti.pcc(String.valueOf(this.vj), null);
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

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout zti() {
        return this.sf.yt.sf();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void hc() {
    }
}
