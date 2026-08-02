package com.vk.clips.tool.view.nps.internal.moreless;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.iah0;
import xsna.izs;
import xsna.s3q0;
import xsna.xz5;
import xsna.zrp;

/* compiled from: MoreLessFeedbackView.kt */
/* loaded from: classes17.dex */
public final class MoreLessFeedbackView extends LinearLayout {
    public final ImageView b;
    public final ImageView c;
    public izs<? super FeedbackResult, s3q0> d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MoreLessFeedbackView.kt */
    public static final class FeedbackResult {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FeedbackResult[] $VALUES;
        public static final FeedbackResult LESS;
        public static final FeedbackResult MORE;

        static {
            FeedbackResult feedbackResult = new FeedbackResult("MORE", 0);
            MORE = feedbackResult;
            FeedbackResult feedbackResult2 = new FeedbackResult("LESS", 1);
            LESS = feedbackResult2;
            FeedbackResult[] feedbackResultArr = {feedbackResult, feedbackResult2};
            $VALUES = feedbackResultArr;
            $ENTRIES = new asp(feedbackResultArr);
        }

        public FeedbackResult() {
            throw null;
        }

        public static FeedbackResult valueOf(String str) {
            return (FeedbackResult) Enum.valueOf(FeedbackResult.class, str);
        }

        public static FeedbackResult[] values() {
            return (FeedbackResult[]) $VALUES.clone();
        }
    }

    public MoreLessFeedbackView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.internal_nps_moreless_feedback, (ViewGroup) this, true);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(17);
        float f = 12;
        setPadding(iah0.a(f), iah0.a(f), iah0.a(f), iah0.a(f));
        ImageView imageView = (ImageView) findViewById(R.id.feedback_less);
        this.b = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.feedback_more);
        this.c = imageView2;
        xz5 xz5Var = new xz5(this, 5);
        imageView.setOnClickListener(xz5Var);
        imageView2.setOnClickListener(xz5Var);
    }

    public final void setFeedbackListener(izs<? super FeedbackResult, s3q0> izsVar) {
        this.d = izsVar;
    }
}
