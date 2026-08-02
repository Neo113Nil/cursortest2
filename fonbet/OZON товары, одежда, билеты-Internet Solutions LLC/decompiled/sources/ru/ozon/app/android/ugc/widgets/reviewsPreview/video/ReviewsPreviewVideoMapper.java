package ru.ozon.app.android.ugc.widgets.reviewsPreview.video;

import WZ.t;
import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.common.ReviewsPreviewTileVO;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewTileDTO;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewVO;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewVideoDTO;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.image.ReviewsPreviewImageMapperKt;
import ru.ozon.app.android.video.manager.ProgressiveWithCacheExoManager;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u00102*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0010B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/ReviewsPreviewVideoMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVideoDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO$ReviewsPreviewVideoVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/video/manager/ProgressiveWithCacheExoManager;", "progressiveWithCacheExoManager", "<init>", "(Lru/ozon/app/android/video/manager/ProgressiveWithCacheExoManager;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVideoDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/video/manager/ProgressiveWithCacheExoManager;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsPreviewVideoMapper implements Function2<ReviewsPreviewVideoDTO, d, List<? extends ReviewsPreviewVO.ReviewsPreviewVideoVO>> {

    @NotNull
    private final ProgressiveWithCacheExoManager progressiveWithCacheExoManager;
    public static final int $stable = 8;

    public ReviewsPreviewVideoMapper(@NotNull ProgressiveWithCacheExoManager progressiveWithCacheExoManager) {
        Intrinsics.checkNotNullParameter(progressiveWithCacheExoManager, "progressiveWithCacheExoManager");
        this.progressiveWithCacheExoManager = progressiveWithCacheExoManager;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ReviewsPreviewVO.ReviewsPreviewVideoVO> invoke(@NotNull ReviewsPreviewVideoDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = (widgetInfo.d() + state.getIndex()).hashCode();
        this.progressiveWithCacheExoManager.startVideoCaching(state.getVideoInfo().getVideoUrl(), 5242880L);
        ImageDTO preview = state.getPreview();
        PreloadVideoInfo videoInfo = state.getVideoInfo();
        PreloadVideoInfo fullVideoInfo = state.getFullVideoInfo();
        String paranjaColor = state.getParanjaColor();
        AtomActionDTO clickAction = state.getClickAction();
        AtomAction atomAction = clickAction != null ? AtomActionMapperKt.toAtomAction(clickAction, state.getItemTrackingInfo()) : null;
        AtomActionDTO viewedItemAction = state.getViewedItemAction();
        AtomAction atomAction2 = viewedItemAction != null ? AtomActionMapperKt.toAtomAction(viewedItemAction, null) : null;
        ReviewsPreviewTileDTO tile = state.getTile();
        ReviewsPreviewTileVO vo = tile != null ? ReviewsPreviewImageMapperKt.toVO(tile) : null;
        Map<String, TokenizedTrackingInfo> videoStartTrackingInfo = state.getVideoStartTrackingInfo();
        t b11 = videoStartTrackingInfo != null ? x.b(videoStartTrackingInfo, Long.valueOf(hashCode), null) : null;
        Map<String, TokenizedTrackingInfo> videoEndTrackingInfo = state.getVideoEndTrackingInfo();
        t b12 = videoEndTrackingInfo != null ? x.b(videoEndTrackingInfo, Long.valueOf(hashCode), null) : null;
        Map<String, TokenizedTrackingInfo> itemTrackingInfo = state.getItemTrackingInfo();
        t b13 = itemTrackingInfo != null ? x.b(itemTrackingInfo, Long.valueOf(hashCode), null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        t b14 = trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null;
        AtomAction atomAction3 = atomAction;
        AtomAction atomAction4 = atomAction2;
        t tVar = b13;
        ImageDTO cornerImage = state.getCornerImage();
        CornerRadius cornerRadius = state.getCornerRadius();
        Paddings horizontalPadding = state.getHorizontalPadding();
        Paddings itemSpacing = state.getItemSpacing();
        String widgetBackgroundColor = state.getWidgetBackgroundColor();
        if (widgetBackgroundColor == null) {
            widgetBackgroundColor = UniColors.LAYER_FLOOR_0.getToken();
        }
        return C7714v.a0(new ReviewsPreviewVO.ReviewsPreviewVideoVO(hashCode, atomAction3, atomAction4, vo, fullVideoInfo, tVar, b14, cornerImage, cornerRadius, horizontalPadding, itemSpacing, widgetBackgroundColor, preview, videoInfo, paranjaColor, b11, b12, state.getPlaybackType(), state.getIndex() % 2, widgetInfo.d().hashCode()));
    }
}
