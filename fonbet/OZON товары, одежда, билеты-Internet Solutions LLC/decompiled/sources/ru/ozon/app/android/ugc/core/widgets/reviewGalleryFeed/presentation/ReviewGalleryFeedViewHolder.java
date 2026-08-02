package ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.presentation;

import W10.c;
import WZ.t;
import XU.a;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.ugc.core.databinding.WidgetReviewGalleryFeedBinding;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/presentation/ReviewGalleryFeedViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/presentation/ReviewGalleryFeedVO;", "Lru/ozon/app/android/ugc/core/databinding/WidgetReviewGalleryFeedBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "<init>", "(Lru/ozon/app/android/ugc/core/databinding/WidgetReviewGalleryFeedBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/video/preload/PlayerPreloader;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/presentation/ReviewGalleryFeedVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/presentation/ReviewGalleryFeedVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/ugc/core/databinding/WidgetReviewGalleryFeedBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryFeedViewHolder extends k<ReviewGalleryFeedVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetReviewGalleryFeedBinding binding;

    @NotNull
    private final PlayerPreloader playerPreloader;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ReviewGalleryFeedViewHolder(@NotNull WidgetReviewGalleryFeedBinding binding, @NotNull ComposerReferences refs, @NotNull PlayerPreloader playerPreloader) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.playerPreloader = playerPreloader;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$1(ReviewGalleryFeedVO reviewGalleryFeedVO, ReviewGalleryFeedViewHolder reviewGalleryFeedViewHolder, View view) {
        AtomAction atomAction;
        AtomActionDTO action = reviewGalleryFeedVO.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, reviewGalleryFeedVO.getTrackingInfo())) == null) {
            return;
        }
        if ((atomAction instanceof AtomAction.Move) && reviewGalleryFeedVO.getVideoInfo() != null) {
            PlayerPreloader.DefaultImpls.preCreatePlayer$default(reviewGalleryFeedViewHolder.playerPreloader, reviewGalleryFeedVO.getVideoInfo(), null, 2, null);
        }
        reviewGalleryFeedViewHolder.actionHandler.invoke(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReviewGalleryFeedVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetReviewGalleryFeedBinding widgetReviewGalleryFeedBinding = this.binding;
        Image reviewFeedImage = widgetReviewGalleryFeedBinding.reviewFeedImage;
        Intrinsics.checkNotNullExpressionValue(reviewFeedImage, "reviewFeedImage");
        ImageHolderKt.bind$default(reviewFeedImage, item.getImage(), null, 2, null);
        IconView reviewFeedIcon = widgetReviewGalleryFeedBinding.reviewFeedIcon;
        Intrinsics.checkNotNullExpressionValue(reviewFeedIcon, "reviewFeedIcon");
        IconHolderKt.bindOrGone$default(reviewFeedIcon, item.getIcon(), null, 2, null);
        BadgeView reviewFeedBadge = widgetReviewGalleryFeedBinding.reviewFeedBadge;
        Intrinsics.checkNotNullExpressionValue(reviewFeedBadge, "reviewFeedBadge");
        BadgeHolderKt.bindOrGone$default(reviewFeedBadge, item.getBadge(), (Function1) null, 2, (Object) null);
        widgetReviewGalleryFeedBinding.getConstraintLayout().setOnClickListener(new a(0, item, this));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ReviewGalleryFeedVO item, @NotNull c trackingData, f viewedPond) {
        t tokenizedEvent$default;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
        if (trackingInfo == null || (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(item.getId()), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent$default, null, 2, null);
    }
}
