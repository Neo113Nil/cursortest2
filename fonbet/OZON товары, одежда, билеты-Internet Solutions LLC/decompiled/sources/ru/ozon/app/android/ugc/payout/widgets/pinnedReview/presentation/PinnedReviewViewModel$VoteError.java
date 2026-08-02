package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import spay.sdk.domain.model.FraudMonInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewViewModel$VoteError", "", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewViewModel$VoteError;", "<init>", "(Ljava/lang/String;I)V", "NETWORK", FraudMonInfo.UNKNOWN, "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PinnedReviewViewModel$VoteError {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PinnedReviewViewModel$VoteError[] $VALUES;
    public static final PinnedReviewViewModel$VoteError NETWORK = new PinnedReviewViewModel$VoteError("NETWORK", 0);
    public static final PinnedReviewViewModel$VoteError UNKNOWN = new PinnedReviewViewModel$VoteError(FraudMonInfo.UNKNOWN, 1);

    private static final /* synthetic */ PinnedReviewViewModel$VoteError[] $values() {
        return new PinnedReviewViewModel$VoteError[]{NETWORK, UNKNOWN};
    }

    static {
        PinnedReviewViewModel$VoteError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private PinnedReviewViewModel$VoteError(String str, int i11) {
    }

    public static PinnedReviewViewModel$VoteError valueOf(String str) {
        return (PinnedReviewViewModel$VoteError) Enum.valueOf(PinnedReviewViewModel$VoteError.class, str);
    }

    public static PinnedReviewViewModel$VoteError[] values() {
        return (PinnedReviewViewModel$VoteError[]) $VALUES.clone();
    }
}
