package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view;

import android.content.Context;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review.ReviewBodyView;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\rX\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/PinnedReviewBodyView;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/review/ReviewBodyView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mediaPreviewsInLineCount", "", "getMediaPreviewsInLineCount", "()I", "mediaPreviewsGap", "getMediaPreviewsGap", "showContextReviewsBackground", "", "getShowContextReviewsBackground", "()Z", "moreFadeColor", "getMoreFadeColor", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PinnedReviewBodyView extends ReviewBodyView {
    private final int mediaPreviewsGap;
    private final int mediaPreviewsInLineCount;
    private final int moreFadeColor;
    private final boolean showContextReviewsBackground;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinnedReviewBodyView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mediaPreviewsInLineCount = 5;
        this.mediaPreviewsGap = Dimens.INSTANCE.getDP_4();
        this.moreFadeColor = a.getColor(context, R$color.bg_primary);
    }

    @Override // ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review.ReviewBodyView
    protected int getMediaPreviewsGap() {
        return this.mediaPreviewsGap;
    }

    @Override // ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review.ReviewBodyView
    protected int getMediaPreviewsInLineCount() {
        return this.mediaPreviewsInLineCount;
    }

    @Override // ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review.ReviewBodyView
    protected int getMoreFadeColor() {
        return this.moreFadeColor;
    }

    @Override // ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review.ReviewBodyView
    protected boolean getShowContextReviewsBackground() {
        return this.showContextReviewsBackground;
    }
}
