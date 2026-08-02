package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends com.bytedance.sdk.openadsdk.core.wh.gm {
    private com.bytedance.sdk.openadsdk.core.wh.gm gm;
    private float oo;
    private final boolean pcc;
    private boolean qf;
    private final boolean sf;
    private float vj;
    private com.bytedance.sdk.openadsdk.activity.single.kj wh;

    public sf(@NonNull Context context, boolean z, boolean z2, final int i) {
        super(context);
        this.pcc = z;
        this.sf = z2;
        if (z) {
            setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.sf.2
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i);
                }
            });
            setClipToOutline(true);
            return;
        }
        this.gm = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.gm, layoutParams);
        this.gm.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.sf.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i);
            }
        });
        this.gm.setClipToOutline(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.bytedance.sdk.openadsdk.activity.single.kj kjVar;
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf yt;
        super.onAttachedToWindow();
        if (this.qf || (kjVar = this.wh) == null || (yt = kjVar.yt()) == null) {
            return;
        }
        yt.jsj.sf(true);
        this.qf = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.bytedance.sdk.openadsdk.activity.single.kj kjVar;
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf yt;
        super.onDetachedFromWindow();
        if (!this.qf || (kjVar = this.wh) == null || (yt = kjVar.yt()) == null) {
            return;
        }
        yt.jsj.sf(false);
        this.qf = false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.wh.gm, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.sf) {
            float f = this.oo;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int max = Math.max(0, (size - ((int) (size2 * f))) / 2);
                setPadding(max, 0, max, 0);
            } else {
                float f2 = this.vj;
                if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    int max2 = Math.max(0, (size - ((int) (size * f2))) / 2);
                    setPadding(max2, 0, max2, 0);
                }
            }
        } else {
            boolean z = this.pcc;
            float f3 = this.oo;
            if (z) {
                if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (size / f3), 1073741824);
                } else {
                    float f4 = this.vj;
                    if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        i2 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f4), 1073741824);
                    }
                }
            } else if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int max3 = Math.max(0, (size - ((int) (size2 * f3))) / 2);
                setPadding(max3, 0, max3, 0);
            } else {
                float f5 = this.vj;
                if (f5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    int max4 = Math.max(0, (size - ((int) (size * f5))) / 2);
                    setPadding(max4, 0, max4, 0);
                }
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        com.bytedance.sdk.openadsdk.activity.single.kj kjVar;
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf yt;
        super.onWindowFocusChanged(z);
        if (this.qf == z || (kjVar = this.wh) == null || (yt = kjVar.yt()) == null) {
            return;
        }
        yt.jsj.sf(z);
    }

    public void pcc(kj kjVar, FrameLayout.LayoutParams layoutParams) {
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = this.gm;
        if (gmVar != null) {
            gmVar.addView(kjVar, layoutParams);
        } else {
            addView(kjVar, layoutParams);
        }
    }

    public void setScene(com.bytedance.sdk.openadsdk.activity.single.kj kjVar) {
        this.wh = kjVar;
    }

    public void setWidthAndHeightRatio(float f) {
        this.oo = f;
    }

    public void setWidthOrHeightInParentRatio(float f) {
        this.vj = f;
    }

    public void pcc() {
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = this.gm;
        if (gmVar != null) {
            gmVar.removeAllViews();
        } else {
            removeAllViews();
        }
    }
}
