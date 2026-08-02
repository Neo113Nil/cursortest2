package com.vk.feed.design.view.newsfeed.ads_mytarget.bls;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import xsna.ai0;
import xsna.izs;
import xsna.qj8;
import xsna.r4;
import xsna.s3q0;

/* compiled from: MyTargetAdSurveyButtonsView.kt */
/* loaded from: classes18.dex */
public final class MyTargetAdSurveyButtonsView extends FrameLayout {
    public final VkButton b;
    public final VkButton c;
    public final VkButton d;
    public izs<? super View, s3q0> e;
    public izs<? super View, s3q0> f;
    public izs<? super View, s3q0> g;

    public MyTargetAdSurveyButtonsView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final void a(izs<? super View, s3q0> izsVar, izs<? super View, s3q0> izsVar2, izs<? super View, s3q0> izsVar3) {
        this.e = izsVar;
        this.f = izsVar2;
        this.g = izsVar3;
        this.b.setOnClickListener(new qj8(this, 7));
        this.c.setOnClickListener(new ai0(this, 6));
        this.d.setOnClickListener(new r4(this, 7));
    }

    public final void setFinishButtonEnabled(boolean z) {
        this.d.setEnabled(z);
    }

    public final void setNextButtonEnabled(boolean z) {
        this.c.setEnabled(z);
    }

    public MyTargetAdSurveyButtonsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public MyTargetAdSurveyButtonsView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ MyTargetAdSurveyButtonsView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public MyTargetAdSurveyButtonsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.my_target_ad_survey_buttons_view, (ViewGroup) this, true);
        this.b = (VkButton) findViewById(R.id.survey_button_previous);
        this.c = (VkButton) findViewById(R.id.survey_button_next);
        this.d = (VkButton) findViewById(R.id.survey_button_finish);
    }
}
