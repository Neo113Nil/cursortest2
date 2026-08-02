package com.vk.clips.design.view.nps.internal.stars;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FeedbackResult.kt */
/* loaded from: classes16.dex */
public final class FeedbackResult {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FeedbackResult[] $VALUES;
    public static final FeedbackResult STAR_1;
    public static final FeedbackResult STAR_2;
    public static final FeedbackResult STAR_3;
    public static final FeedbackResult STAR_4;
    public static final FeedbackResult STAR_5;

    static {
        FeedbackResult feedbackResult = new FeedbackResult("STAR_1", 0);
        STAR_1 = feedbackResult;
        FeedbackResult feedbackResult2 = new FeedbackResult("STAR_2", 1);
        STAR_2 = feedbackResult2;
        FeedbackResult feedbackResult3 = new FeedbackResult("STAR_3", 2);
        STAR_3 = feedbackResult3;
        FeedbackResult feedbackResult4 = new FeedbackResult("STAR_4", 3);
        STAR_4 = feedbackResult4;
        FeedbackResult feedbackResult5 = new FeedbackResult("STAR_5", 4);
        STAR_5 = feedbackResult5;
        FeedbackResult[] feedbackResultArr = {feedbackResult, feedbackResult2, feedbackResult3, feedbackResult4, feedbackResult5};
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
