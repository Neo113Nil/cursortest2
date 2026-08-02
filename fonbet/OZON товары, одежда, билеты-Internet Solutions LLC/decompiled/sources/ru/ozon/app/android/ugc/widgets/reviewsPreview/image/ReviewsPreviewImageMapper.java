package ru.ozon.app.android.ugc.widgets.reviewsPreview.image;

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
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewImageDTO;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewTileDTO;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewVO;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/image/ReviewsPreviewImageMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewImageDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO$ReviewsPreviewImageVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewImageDTO;Ll20/d;)Ljava/util/List;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsPreviewImageMapper implements Function2<ReviewsPreviewImageDTO, d, List<? extends ReviewsPreviewVO.ReviewsPreviewImageVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ReviewsPreviewVO.ReviewsPreviewImageVO> invoke(@NotNull ReviewsPreviewImageDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = (widgetInfo.d() + state.getIndex()).hashCode();
        ImageDTO image = state.getImage();
        IconDTO playIcon = state.getPlayIcon();
        AtomActionDTO clickAction = state.getClickAction();
        AtomAction atomAction = clickAction != null ? AtomActionMapperKt.toAtomAction(clickAction, state.getItemTrackingInfo()) : null;
        AtomActionDTO viewedItemAction = state.getViewedItemAction();
        AtomAction atomAction2 = viewedItemAction != null ? AtomActionMapperKt.toAtomAction(viewedItemAction, null) : null;
        ReviewsPreviewTileDTO tile = state.getTile();
        ReviewsPreviewTileVO vo = tile != null ? ReviewsPreviewImageMapperKt.toVO(tile) : null;
        PreloadVideoInfo fullVideoInfo = state.getFullVideoInfo();
        Map<String, TokenizedTrackingInfo> itemTrackingInfo = state.getItemTrackingInfo();
        t b11 = itemTrackingInfo != null ? x.b(itemTrackingInfo, Long.valueOf(hashCode), null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        t b12 = trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null;
        ImageDTO cornerImage = state.getCornerImage();
        CornerRadius cornerRadius = state.getCornerRadius();
        Paddings horizontalPadding = state.getHorizontalPadding();
        Paddings itemSpacing = state.getItemSpacing();
        String widgetBackgroundColor = state.getWidgetBackgroundColor();
        if (widgetBackgroundColor == null) {
            widgetBackgroundColor = UniColors.LAYER_FLOOR_0.getToken();
        }
        return C7714v.a0(new ReviewsPreviewVO.ReviewsPreviewImageVO(hashCode, atomAction, atomAction2, fullVideoInfo, vo, b11, b12, cornerImage, cornerRadius, horizontalPadding, itemSpacing, widgetBackgroundColor, image, playIcon));
    }
}
