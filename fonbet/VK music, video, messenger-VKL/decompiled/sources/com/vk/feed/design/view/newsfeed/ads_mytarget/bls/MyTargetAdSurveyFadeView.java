package com.vk.feed.design.view.newsfeed.ads_mytarget.bls;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import xsna.bd0;
import xsna.izs;
import xsna.s3q0;

/* compiled from: MyTargetAdSurveyFadeView.kt */
/* loaded from: classes18.dex */
public final class MyTargetAdSurveyFadeView extends FrameLayout {
    public final VkButton b;
    public izs<? super View, s3q0> c;

    public MyTargetAdSurveyFadeView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final void setUpButtonClickListener(izs<? super View, s3q0> izsVar) {
        this.c = izsVar;
    }

    public final void setUpButtonText(String str) {
        this.b.setText(str);
    }

    public MyTargetAdSurveyFadeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public MyTargetAdSurveyFadeView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ MyTargetAdSurveyFadeView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public MyTargetAdSurveyFadeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.my_target_ad_survey_fade_view, (ViewGroup) this, true);
        VkButton vkButton = (VkButton) findViewById(R.id.open_button);
        this.b = vkButton;
        vkButton.setOnClickListener(new bd0(this, 12));
    }
}
