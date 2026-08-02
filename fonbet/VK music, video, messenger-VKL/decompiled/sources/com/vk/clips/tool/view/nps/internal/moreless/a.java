package com.vk.clips.tool.view.nps.internal.moreless;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.clips.tool.view.nps.internal.moreless.MoreLessFeedbackView;
import com.vk.core.view.components.text.VkText;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.izs;
import xsna.s3q0;

/* compiled from: MoreLessQuestionnaireView.kt */
/* loaded from: classes17.dex */
public final class a extends ConstraintLayout {
    public final VKImageView t;
    public final MoreLessFeedbackView u;
    public final VkText v;

    public a(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.internal_nps_moreless_questionnaire, (ViewGroup) this, true);
        this.t = (VKImageView) findViewById(R.id.internal_nps_preview_image);
        this.u = (MoreLessFeedbackView) findViewById(R.id.internal_nps_more_less_feedback);
        this.v = (VkText) findViewById(R.id.internal_nps_questionnaire_text);
    }

    public final void setFeedbackObserver(izs<? super MoreLessFeedbackView.FeedbackResult, s3q0> izsVar) {
        this.u.setFeedbackListener(izsVar);
    }
}
