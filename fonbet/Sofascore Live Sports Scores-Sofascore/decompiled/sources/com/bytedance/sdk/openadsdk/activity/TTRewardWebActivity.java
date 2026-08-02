package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.openadsdk.component.reward.gm.qf;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.wh.gm;
import com.bytedance.sdk.openadsdk.wh.sf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class TTRewardWebActivity extends TTUnifyWebActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTUnifyWebActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.oo != null) {
            sf.pcc().pcc("videoForceBreak", this.vj);
        }
        com.bytedance.sdk.openadsdk.component.reward.gm.sf sfVar = this.oo;
        if (sfVar instanceof qf) {
            sfVar.nac();
        }
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTUnifyWebActivity
    public com.bytedance.sdk.openadsdk.component.reward.gm.sf pcc(Activity activity, Context context, of ofVar, String str, gm gmVar, String str2) {
        return new qf(activity, context, ofVar, str, gmVar, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTUnifyWebActivity
    public void sf() {
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTUnifyWebActivity
    public boolean pcc() {
        return true;
    }
}
