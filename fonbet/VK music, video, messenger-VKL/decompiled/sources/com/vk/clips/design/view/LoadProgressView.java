package com.vk.clips.design.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.CircularProgressView;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import java.util.Arrays;
import xsna.e3m;
import xsna.gzs;
import xsna.jjc;
import xsna.mk5;
import xsna.s3q0;
import xsna.zmp0;
import xsna.zqh;

/* compiled from: LoadProgressView.kt */
/* loaded from: classes16.dex */
public final class LoadProgressView extends FrameLayout {
    public final CircularProgressView b;
    public final VkText c;
    public gzs<s3q0> d;

    public LoadProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.layout_load_progress, (ViewGroup) this, true);
        setBackgroundResource(R.drawable.bg_dark_transparent_rounded16);
        this.b = (CircularProgressView) findViewById(R.id.load_progress_circular);
        this.c = (VkText) findViewById(R.id.load_progress_text);
        jjc.g(this, new zqh(this, 24));
    }

    public final gzs<s3q0> getOnCancelClick() {
        return this.d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.max(View.resolveSize(0, i), e3m.a(R.dimen.load_progress_view_width, getContext())), 1073741824), i2);
    }

    public final void setOnCancelClick(gzs<s3q0> gzsVar) {
        this.d = gzsVar;
    }

    public final void setProgress(float f) {
        CircularProgressView circularProgressView = this.b;
        if (circularProgressView.getProgress() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            zmp0.b(this);
            zmp0.a(this, new mk5().addTarget(this));
        }
        circularProgressView.setProgress(f);
        this.c.setText(f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? getContext().getString(R.string.clip_load_preparing) : String.format(getContext().getString(R.string.clip_load_progress), Arrays.copyOf(new Object[]{Integer.valueOf((int) (f * 100))}, 1)));
    }
}
