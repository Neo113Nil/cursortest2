package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.tsx;
import com.bytedance.sdk.openadsdk.oo.ork;
import com.bytedance.sdk.openadsdk.utils.dax;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class TTAdActivity extends TTBaseActivity {
    private int gm = -1;
    private final AtomicBoolean oo = new AtomicBoolean(false);
    private sf pcc;
    private boolean sf;

    private void gm() {
        sf sfVar = this.pcc;
        if (sfVar == null) {
            super.onBackPressed();
        } else {
            sfVar.vy();
        }
    }

    private void sf() {
        if (!this.sf) {
            atb.pcc().pcc((com.bytedance.sdk.openadsdk.pcc.vj.pcc) null);
            atb.pcc().pcc((com.bytedance.sdk.openadsdk.pcc.gm.sf) null);
        } else if (!TextUtils.isEmpty(this.mu)) {
            atb.pcc().pcc(this.mu, isFinishing(), isChangingConfigurations());
        }
        dax.pcc();
        tsx.pcc().pcc(String.valueOf(hashCode()));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public void gbb() {
        gm();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sf sfVar = this.pcc;
        if (sfVar != null) {
            sfVar.pcc((Activity) this);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        gm();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0056  */
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) {
        String str;
        long longExtra;
        String str2;
        of pcc;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (bundle != null) {
            this.mu = bundle.getString("single_process_listener_key");
            this.sf = bundle.getBoolean("enable_new_arch", false);
            str = this.mu;
        } else {
            if (intent != null) {
                this.mu = intent.getStringExtra("single_process_listener_key");
                this.sf = intent.getBooleanExtra("enable_new_arch", false);
                longExtra = intent.getLongExtra("start_show_time", SystemClock.elapsedRealtime());
                str2 = this.mu;
                com.bytedance.sdk.openadsdk.pcc.vj.pcc pcc2 = pcc(str2);
                com.bytedance.sdk.openadsdk.pcc.gm.sf sf = sf(this.mu);
                pcc = com.bytedance.sdk.openadsdk.component.reward.pcc.gm.pcc(getIntent(), bundle, (com.bytedance.sdk.openadsdk.core.jr.oo.sf) null);
                if (pcc != null) {
                    finish();
                    return;
                }
                try {
                    pcc.pcc(longExtra);
                    this.pcc = new sf(this, pcc, this.sf);
                    if (bundle != null && pcc.rj()) {
                        this.pcc.lu();
                    }
                    this.pcc.pcc(this, bundle, pcc2, sf);
                    if (bundle != null) {
                        ork.pcc(pcc, "activity_recreate", pcc.vj(), "activity_recreate", null);
                    }
                    com.bytedance.sdk.openadsdk.utils.sf.pcc(pcc);
                    return;
                } catch (Throwable th) {
                    lo.pcc("BVA", "onCreate: ", th);
                    ork.pcc(pcc, "show_ad_fail", pcc.vj(), "init_view_crash");
                    finish();
                    return;
                }
            }
            str = this.mu;
        }
        str2 = str;
        longExtra = 0;
        com.bytedance.sdk.openadsdk.pcc.vj.pcc pcc22 = pcc(str2);
        com.bytedance.sdk.openadsdk.pcc.gm.sf sf2 = sf(this.mu);
        pcc = com.bytedance.sdk.openadsdk.component.reward.pcc.gm.pcc(getIntent(), bundle, (com.bytedance.sdk.openadsdk.core.jr.oo.sf) null);
        if (pcc != null) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        pcc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        sf sfVar = this.pcc;
        if (sfVar != null) {
            sfVar.gm(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        sf sfVar = this.pcc;
        if (sfVar != null) {
            sfVar.sf(this);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.mu)) {
            bundle.putString("single_process_listener_key", this.mu);
        }
        bundle.putBoolean("enable_new_arch", this.sf);
        sf sfVar = this.pcc;
        if (sfVar != null) {
            int pcc = atb.pcc().pcc(sfVar.pcc());
            this.gm = pcc;
            this.pcc.pcc(this, bundle, pcc);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.gm >= 0) {
            atb.pcc().gm(this.gm);
            this.gm = -1;
        }
        sf sfVar = this.pcc;
        if (sfVar != null) {
            sfVar.pcc(this);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        sf sfVar = this.pcc;
        if (sfVar != null) {
            sfVar.oo(this);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        sf sfVar = this.pcc;
        if (sfVar != null) {
            sfVar.pcc(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public boolean oo() {
        return true;
    }

    public com.bytedance.sdk.openadsdk.pcc.vj.pcc pcc(String str) {
        if (!this.sf) {
            return atb.pcc().sf();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (com.bytedance.sdk.openadsdk.pcc.vj.pcc) atb.pcc().pcc(str, com.bytedance.sdk.openadsdk.pcc.vj.pcc.class);
    }

    private void pcc() {
        if (this.oo.compareAndSet(false, true)) {
            sf sfVar = this.pcc;
            if (sfVar != null) {
                sfVar.vj(this);
            }
            sf();
        }
    }

    public com.bytedance.sdk.openadsdk.pcc.gm.sf sf(String str) {
        if (this.sf) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (com.bytedance.sdk.openadsdk.pcc.gm.sf) atb.pcc().pcc(str, com.bytedance.sdk.openadsdk.pcc.gm.sf.class);
        }
        return atb.pcc().gm();
    }
}
