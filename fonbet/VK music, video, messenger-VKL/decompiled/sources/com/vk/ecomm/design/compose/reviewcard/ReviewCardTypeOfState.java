package com.vk.ecomm.design.compose.reviewcard;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReviewCardModel.kt */
/* loaded from: classes18.dex */
public final class ReviewCardTypeOfState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReviewCardTypeOfState[] $VALUES;
    public static final ReviewCardTypeOfState EMPTY;
    public static final ReviewCardTypeOfState FILLED;
    public static final ReviewCardTypeOfState SENT_SUCCESSFULLY;

    static {
        ReviewCardTypeOfState reviewCardTypeOfState = new ReviewCardTypeOfState("EMPTY", 0);
        EMPTY = reviewCardTypeOfState;
        ReviewCardTypeOfState reviewCardTypeOfState2 = new ReviewCardTypeOfState("FILLED", 1);
        FILLED = reviewCardTypeOfState2;
        ReviewCardTypeOfState reviewCardTypeOfState3 = new ReviewCardTypeOfState("SENT_SUCCESSFULLY", 2);
        SENT_SUCCESSFULLY = reviewCardTypeOfState3;
        ReviewCardTypeOfState[] reviewCardTypeOfStateArr = {reviewCardTypeOfState, reviewCardTypeOfState2, reviewCardTypeOfState3};
        $VALUES = reviewCardTypeOfStateArr;
        $ENTRIES = new asp(reviewCardTypeOfStateArr);
    }

    public ReviewCardTypeOfState() {
        throw null;
    }

    public static zrp<ReviewCardTypeOfState> h() {
        return $ENTRIES;
    }

    public static ReviewCardTypeOfState valueOf(String str) {
        return (ReviewCardTypeOfState) Enum.valueOf(ReviewCardTypeOfState.class, str);
    }

    public static ReviewCardTypeOfState[] values() {
        return (ReviewCardTypeOfState[]) $VALUES.clone();
    }
}
