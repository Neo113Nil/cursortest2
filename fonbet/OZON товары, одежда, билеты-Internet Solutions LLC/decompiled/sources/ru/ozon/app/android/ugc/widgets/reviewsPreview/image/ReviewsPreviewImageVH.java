package ru.ozon.app.android.ugc.widgets.reviewsPreview.image;

import GW.a;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.common.ReviewsPreviewViewModel;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewVO;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00120!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/image/ReviewsPreviewImageVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO$ReviewsPreviewImageVO;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/image/ReviewsPreviewImageView;", "view", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/ugc/widgets/reviewsPreview/image/ReviewsPreviewImageView;LWZ/l;Lru/ozon/app/android/video/preload/PlayerPreloader;Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewViewModel;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO$ReviewsPreviewImageVO;Ll20/d;)V", "onViewInVisibleBounds", "()V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO$ReviewsPreviewImageVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/image/ReviewsPreviewImageView;", "LWZ/l;", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsPreviewImageVH extends k<ReviewsPreviewVO.ReviewsPreviewImageVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final PlayerPreloader playerPreloader;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final ReviewsPreviewImageView view;

    @NotNull
    private final ReviewsPreviewViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewsPreviewImageVH(@NotNull ReviewsPreviewImageView view, @NotNull l tokenizedAnalytics, @NotNull PlayerPreloader playerPreloader, @NotNull ReviewsPreviewViewModel viewModel, @NotNull ComposerReferences refs) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.playerPreloader = playerPreloader;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(refs, this).onComposerAction(new ReviewsPreviewImageVH$actionHandler$1(viewModel)).buildHandler();
        view.setOnClickListener(new a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ReviewsPreviewImageVH reviewsPreviewImageVH, View view) {
        PreloadVideoInfo fullVideoInfo;
        ReviewsPreviewVO.ReviewsPreviewImageVO boundData = reviewsPreviewImageVH.getBoundData();
        if (boundData != null) {
            if ((boundData.getClickAction() instanceof AtomAction.Move) && (fullVideoInfo = boundData.getFullVideoInfo()) != null) {
                PlayerPreloader.DefaultImpls.preCreatePlayer$default(reviewsPreviewImageVH.playerPreloader, fullVideoInfo, null, 2, null);
            }
            AtomAction clickAction = boundData.getClickAction();
            if (clickAction != null) {
                reviewsPreviewImageVH.actionHandler.invoke(clickAction);
            }
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        AtomAction viewedItemAction;
        super.onViewInVisibleBounds();
        ReviewsPreviewVO.ReviewsPreviewImageVO boundData = getBoundData();
        if (boundData == null || (viewedItemAction = boundData.getViewedItemAction()) == null) {
            return;
        }
        this.actionHandler.invoke(viewedItemAction);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReviewsPreviewVO.ReviewsPreviewImageVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.bind(item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ReviewsPreviewVO.ReviewsPreviewImageVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
        t itemTokenizedEvent = item.getItemTokenizedEvent();
        if (itemTokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, itemTokenizedEvent, null);
        }
    }
}
