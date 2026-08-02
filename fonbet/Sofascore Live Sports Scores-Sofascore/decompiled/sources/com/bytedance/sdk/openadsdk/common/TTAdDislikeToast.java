package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class TTAdDislikeToast extends com.bytedance.sdk.openadsdk.core.wh.gm {
    private static String sDislikeSendTip;
    private static String sDislikeTip;
    private static String sSkipText;
    private final Handler mHandler;
    private TextView mTextView;

    public TTAdDislikeToast(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHandler = new Handler(Looper.getMainLooper());
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        initToast(context);
    }

    public static String getDislikeSendTip() {
        String str = sDislikeSendTip;
        if (str != null) {
            return str;
        }
        Context pcc = com.bytedance.sdk.openadsdk.core.lu.pcc();
        String str2 = com.bytedance.sdk.component.utils.tz.pcc(pcc, "tt_feedback_thank_text") + "\n" + com.bytedance.sdk.component.utils.tz.pcc(pcc, "tt_feedback_experience_text");
        sDislikeSendTip = str2;
        return str2;
    }

    public static String getDislikeTip() {
        String str = sDislikeTip;
        if (str != null) {
            return str;
        }
        String pcc = com.bytedance.sdk.component.utils.tz.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc(), "tt_feedback_submit_text");
        sDislikeTip = pcc;
        return pcc;
    }

    public static String getSkipText() {
        String str = sSkipText;
        if (str != null) {
            return str;
        }
        String pcc = com.bytedance.sdk.component.utils.tz.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc(), "tt_reward_screen_skip_tx");
        sSkipText = pcc;
        return pcc;
    }

    private void initToast(Context context) {
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.mTextView = kjVar;
        kjVar.setClickable(false);
        this.mTextView.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = rj.sf(getContext(), 75.0f);
        int sf = rj.sf(com.bytedance.sdk.openadsdk.core.lu.pcc(), 16.0f);
        int sf2 = rj.sf(com.bytedance.sdk.openadsdk.core.lu.pcc(), 12.0f);
        this.mTextView.setPadding(sf, sf2, sf, sf2);
        this.mTextView.setLayoutParams(layoutParams);
        this.mTextView.setTextColor(-1);
        this.mTextView.setTextSize(16.0f);
        this.mTextView.setGravity(8388611);
        Drawable gm = com.bytedance.sdk.component.utils.tz.gm(getContext(), "tt_dislike_toast");
        int sf3 = rj.sf(getContext(), 16.0f);
        gm.setBounds(0, 0, sf3, sf3);
        this.mTextView.setCompoundDrawablePadding(sf3 / 2);
        this.mTextView.setCompoundDrawables(gm, null, null, null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.argb(Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 37, 37, 37));
        gradientDrawable.setCornerRadius(rj.sf(com.bytedance.sdk.openadsdk.core.lu.pcc(), 12.0f));
        this.mTextView.setBackground(gradientDrawable);
        addView(this.mTextView);
    }

    public static void onResourceUpdated() {
        Context pcc = com.bytedance.sdk.openadsdk.core.lu.pcc();
        sSkipText = com.bytedance.sdk.component.utils.tz.pcc(pcc, "tt_reward_screen_skip_tx");
        sDislikeTip = com.bytedance.sdk.component.utils.tz.pcc(pcc, "tt_feedback_submit_text");
        sDislikeSendTip = com.bytedance.sdk.component.utils.tz.pcc(pcc, "tt_feedback_thank_text") + "\n" + com.bytedance.sdk.component.utils.tz.pcc(pcc, "tt_feedback_experience_text");
    }

    public void hide() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void onDestroy() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void show(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.1
            @Override // java.lang.Runnable
            public void run() {
                if (TTAdDislikeToast.this.mTextView != null) {
                    TTAdDislikeToast.this.mTextView.setText(String.valueOf(str));
                }
                TTAdDislikeToast.this.setVisibility(0);
            }
        });
        this.mHandler.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.2
            @Override // java.lang.Runnable
            public void run() {
                TTAdDislikeToast.this.setVisibility(8);
            }
        }, 2000L);
    }

    public TTAdDislikeToast(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeToast(Context context) {
        this(context, null);
    }
}
