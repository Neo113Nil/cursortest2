package com.vk.onboarding.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.cn70;
import xsna.t0w0;
import xsna.xus;

/* compiled from: ButtonWithProgressView.kt */
/* loaded from: classes4.dex */
public final class ButtonWithProgressView extends FrameLayout {
    public final TextView b;
    public final ProgressWheel c;

    public ButtonWithProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.im_button_with_progress, (ViewGroup) this, true);
        this.b = (TextView) findViewById(R.id.text_view);
        this.c = (ProgressWheel) findViewById(R.id.progress_view);
        setOutlineProvider(new t0w0(6, cn70.b(8), false, false));
        setClipToOutline(true);
        setClickable(true);
    }

    public final void setBgColor(int i) {
        setBackgroundDrawable(xus.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, 0, 254));
    }

    public final void setShowProgress(boolean z) {
        bwt0.p0(this.c, z);
        bwt0.d0(this.b, z);
    }

    public final void setText(int i) {
        this.b.setText(i);
    }
}
