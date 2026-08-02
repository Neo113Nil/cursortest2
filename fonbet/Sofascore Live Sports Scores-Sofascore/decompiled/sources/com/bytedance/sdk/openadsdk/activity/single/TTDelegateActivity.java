package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.atb;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.oo.qf;
import com.bytedance.sdk.openadsdk.core.ork;
import com.bytedance.sdk.openadsdk.core.ye;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class TTDelegateActivity extends TTBaseActivity {
    private static final Map<String, qf.pcc> oo = Collections.synchronizedMap(new HashMap());
    private ye gm;
    of pcc = null;
    private Intent sf;

    private void gm() {
        int intExtra = this.sf.getIntExtra("type", 0);
        if (intExtra != 1) {
            if (intExtra != 6) {
                finish();
                return;
            }
            of ofVar = this.pcc;
            if (ofVar == null) {
                ofVar = atb.pcc().pcc(atb.pcc(this.sf));
                this.pcc = ofVar;
            }
            if (ofVar == null) {
                finish();
            } else {
                pcc(ofVar.hl(), com.bytedance.sdk.openadsdk.tool.pcc.pcc(this.pcc.ywc()), this.sf.getStringExtra("closed_listener_key"), this.pcc);
            }
        }
    }

    public static void pcc(of ofVar, String str, qf.pcc pccVar) {
        if (ofVar == null) {
            return;
        }
        Intent intent = new Intent(lu.pcc(), (Class<?>) TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 6);
        intent.putExtra("closed_listener_key", str);
        intent.putExtra("meta_index", atb.pcc().pcc(ofVar));
        if (pccVar != null) {
            oo.put(str, pccVar);
        }
        com.bytedance.sdk.component.utils.sf.pcc(lu.pcc(), intent, null);
    }

    private void sf() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        window.setAttributes(attributes);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!jr.vj()) {
            finish();
            return;
        }
        sf();
        this.sf = getIntent();
        if (lu.pcc() == null) {
            lu.sf(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ye yeVar = this.gm;
        if (yeVar != null) {
            yeVar.sf();
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (lu.pcc() == null) {
            lu.sf(this);
        }
        setIntent(intent);
        this.sf = intent;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ye yeVar = this.gm;
        if ((yeVar == null || ((com.bytedance.sdk.openadsdk.gm.gm) yeVar).pcc == null || !((com.bytedance.sdk.openadsdk.gm.gm) yeVar).pcc.isShowing()) && this.sf != null) {
            gm();
        }
    }

    public static void pcc(of ofVar, String str) {
        pcc(ofVar, str, null);
    }

    private void pcc(String str, String str2, final String str3, of ofVar) {
        if (str2 != null && str != null && this.gm == null) {
            com.bytedance.sdk.openadsdk.gm.gm gmVar = new com.bytedance.sdk.openadsdk.gm.gm(this, str, com.bytedance.sdk.openadsdk.tool.pcc.pcc(str2), ofVar);
            this.gm = gmVar;
            gmVar.pcc(new ye.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.ye.pcc
                public void pcc(int i, String str4) {
                    qf.pcc vj;
                    if (TTDelegateActivity.oo != null && TTDelegateActivity.oo.size() > 0 && !TextUtils.isEmpty(str3)) {
                        qf.pcc pccVar = (qf.pcc) TTDelegateActivity.oo.get(str3);
                        if (pccVar != null) {
                            pccVar.pcc();
                        }
                    } else if (!TextUtils.isEmpty(str3) && (vj = ork.sf().vj(str3)) != null) {
                        vj.pcc();
                        ork.sf().wh(str3);
                    }
                    TTDelegateActivity.this.pcc(str3);
                    TTDelegateActivity.this.finish();
                }

                @Override // com.bytedance.sdk.openadsdk.core.ye.pcc
                public void pcc() {
                    if (!((com.bytedance.sdk.openadsdk.gm.gm) TTDelegateActivity.this.gm).gm()) {
                        TTDelegateActivity.this.pcc(str3);
                        TTDelegateActivity.this.finish();
                    }
                    ((com.bytedance.sdk.openadsdk.gm.gm) TTDelegateActivity.this.gm).pcc(false);
                }
            });
        }
        ye yeVar = this.gm;
        if (yeVar != null) {
            yeVar.pcc();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(String str) {
        Map<String, qf.pcc> map = oo;
        if (map == null || TextUtils.isEmpty(str)) {
            return;
        }
        map.remove(str);
        if (com.bytedance.sdk.component.utils.jr.gm()) {
            map.size();
        }
    }
}
