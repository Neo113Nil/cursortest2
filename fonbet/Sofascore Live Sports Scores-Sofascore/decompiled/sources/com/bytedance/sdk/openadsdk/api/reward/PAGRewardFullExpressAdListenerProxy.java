package com.bytedance.sdk.openadsdk.api.reward;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class PAGRewardFullExpressAdListenerProxy implements PAGExpressAdWrapperListener {
    private final PAGExpressAdWrapperListener pcc;
    private boolean sf = false;
    private final Handler gm = new Handler(Looper.getMainLooper());

    public PAGRewardFullExpressAdListenerProxy(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        this.pcc = pAGExpressAdWrapperListener;
    }

    private void pcc(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.gm.post(runnable);
        }
    }

    private void sf(final Runnable runnable) {
        pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy.1
            @Override // java.lang.Runnable
            public void run() {
                if (PAGRewardFullExpressAdListenerProxy.this.sf || PAGRewardFullExpressAdListenerProxy.this.pcc == null) {
                    boolean unused = PAGRewardFullExpressAdListenerProxy.this.sf;
                } else {
                    PAGRewardFullExpressAdListenerProxy.this.sf = true;
                    runnable.run();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.pcc;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdDismissed() {
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.pcc;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdShow(View view, int i) {
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.pcc;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onAdShow(view, i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderFail(final View view, final String str, final int i) {
        sf(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy.2
            @Override // java.lang.Runnable
            public void run() {
                PAGRewardFullExpressAdListenerProxy.this.pcc.onRenderFail(view, str, i);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderSuccess(final View view, final float f, final float f2) {
        sf(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy.3
            @Override // java.lang.Runnable
            public void run() {
                PAGRewardFullExpressAdListenerProxy.this.pcc.onRenderSuccess(view, f, f2);
            }
        });
    }

    public void triggerUnfinishedFail(final View view) {
        sf(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy.4
            @Override // java.lang.Runnable
            public void run() {
                PAGRewardFullExpressAdListenerProxy.this.pcc.onRenderFail(view, BackupConstant.UNFINISHED_FAIL_MSG, BackupConstant.UNFINISHED_FAIL_CODE);
            }
        });
    }
}
