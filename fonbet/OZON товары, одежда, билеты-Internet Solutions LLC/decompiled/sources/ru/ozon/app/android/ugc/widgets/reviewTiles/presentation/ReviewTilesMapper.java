package ru.ozon.app.android.ugc.widgets.reviewTiles.presentation;

import WZ.t;
import WZ.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.reviewTiles.data.AuthorAvatar;
import ru.ozon.app.android.ugc.widgets.reviewTiles.data.ReviewDescription;
import ru.ozon.app.android.ugc.widgets.reviewTiles.data.ReviewTileItemDTO;
import ru.ozon.app.android.ugc.widgets.reviewTiles.data.ReviewTilesVO;
import ru.ozon.app.android.ugc.widgets.reviewTiles.data.ReviewsTileMediaContent;
import ru.ozon.app.android.ugc.widgets.reviewTiles.data.ReviewsTilesDTO;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniGradients;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \"2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\"B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/presentation/ReviewTilesMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewsTilesDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "", "getHeight", "(Lru/ozon/uni/atoms/data/image/ImageDTO;)I", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTileItemDTO;", "item", "", "voId", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content;", "mapReviewTileItem", "(Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTileItemDTO;J)Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content;", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewDescription;", "content", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$Media;", "mapReviewDescription", "(Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTileItemDTO;Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewDescription;J)Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$Media;", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/AuthorAvatar;", "mapAuthorAvatar", "(Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTileItemDTO;Lru/ozon/app/android/ugc/widgets/reviewTiles/data/AuthorAvatar;J)Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$Media;", "mapEmptyContent", "(Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTileItemDTO;J)Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$Media;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewsTilesDTO;Ll20/d;)Ljava/util/List;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewTilesMapper implements Function2<ReviewsTilesDTO, d, List<? extends ReviewTilesVO>> {
    private static final int AUTHOR_TILE_WIDTH = ResourceExtKt.toPx(108);
    private static final int AUTHOR_TILE_HEIGTH = ResourceExtKt.toPx(162);
    private static final int REVIEW_DESCRIPTION_TILE_WIDTH = ResourceExtKt.toPx(152);
    private static final int REVIEW_DESCRIPTION_TILE_HEIGTH = ResourceExtKt.toPx(228);

    private final int getHeight(ImageDTO imageDTO) {
        Integer imageWidth;
        return (imageDTO == null || (imageWidth = imageDTO.getImageWidth()) == null || ResourceExtKt.toPx(imageWidth.intValue()) != AUTHOR_TILE_WIDTH) ? REVIEW_DESCRIPTION_TILE_HEIGTH : AUTHOR_TILE_HEIGTH;
    }

    private final ReviewTilesVO.Content.Media mapAuthorAvatar(ReviewTileItemDTO item, AuthorAvatar content, long voId) {
        if (item.getMediaContent().getVideoInfo() == null) {
            Pair pair = new Pair(Integer.valueOf(AUTHOR_TILE_WIDTH), Integer.valueOf(AUTHOR_TILE_HEIGTH));
            ImageDTO image = item.getMediaContent().getImage();
            ReviewTilesVO.ReviewDescription empty = ReviewTilesVO.ReviewDescription.INSTANCE.empty();
            ReviewTilesVO.AuthorAvatar authorAvatar = new ReviewTilesVO.AuthorAvatar(content.getIcon(), content.getBadge());
            AtomActionDTO action = item.getAction();
            AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, item.getTrackingInfo()) : null;
            IconDTO playIcon = item.getMediaContent().getPlayIcon();
            Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
            return new ReviewTilesVO.Content.Media.Image(pair, image, atomAction, authorAvatar, empty, playIcon, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(voId), null) : null);
        }
        Pair pair2 = new Pair(Integer.valueOf(AUTHOR_TILE_WIDTH), Integer.valueOf(AUTHOR_TILE_HEIGTH));
        ImageDTO image2 = item.getMediaContent().getImage();
        ReviewTilesVO.ReviewDescription empty2 = ReviewTilesVO.ReviewDescription.INSTANCE.empty();
        ReviewTilesVO.AuthorAvatar authorAvatar2 = new ReviewTilesVO.AuthorAvatar(content.getIcon(), content.getBadge());
        AtomActionDTO action2 = item.getAction();
        AtomAction atomAction2 = action2 != null ? AtomActionMapperKt.toAtomAction(action2, item.getTrackingInfo()) : null;
        PreloadVideoInfo videoInfo = item.getMediaContent().getVideoInfo();
        IconDTO playIcon2 = item.getMediaContent().getPlayIcon();
        PreloadVideoInfo fullVideoInfo = item.getMediaContent().getFullVideoInfo();
        Map<String, TokenizedTrackingInfo> trackingInfo2 = item.getTrackingInfo();
        return new ReviewTilesVO.Content.Media.Video(pair2, image2, atomAction2, authorAvatar2, empty2, playIcon2, videoInfo, fullVideoInfo, trackingInfo2 != null ? x.b(trackingInfo2, Long.valueOf(voId), null) : null);
    }

    private final ReviewTilesVO.Content.Media mapEmptyContent(ReviewTileItemDTO item, long voId) {
        Integer imageWidth = item.getMediaContent().getImage().getImageWidth();
        int px = imageWidth != null ? ResourceExtKt.toPx(imageWidth.intValue()) : REVIEW_DESCRIPTION_TILE_WIDTH;
        int height = getHeight(item.getMediaContent().getImage());
        if (item.getMediaContent().getVideoInfo() == null) {
            Pair pair = new Pair(Integer.valueOf(px), Integer.valueOf(height));
            ImageDTO image = item.getMediaContent().getImage();
            ReviewTilesVO.ReviewDescription empty = ReviewTilesVO.ReviewDescription.INSTANCE.empty();
            ReviewTilesVO.AuthorAvatar empty2 = ReviewTilesVO.AuthorAvatar.INSTANCE.empty();
            AtomActionDTO action = item.getAction();
            AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, item.getTrackingInfo()) : null;
            IconDTO playIcon = item.getMediaContent().getPlayIcon();
            Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
            return new ReviewTilesVO.Content.Media.Image(pair, image, atomAction, empty2, empty, playIcon, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(voId), null) : null);
        }
        Pair pair2 = new Pair(Integer.valueOf(px), Integer.valueOf(height));
        ImageDTO image2 = item.getMediaContent().getImage();
        ReviewTilesVO.ReviewDescription empty3 = ReviewTilesVO.ReviewDescription.INSTANCE.empty();
        ReviewTilesVO.AuthorAvatar empty4 = ReviewTilesVO.AuthorAvatar.INSTANCE.empty();
        AtomActionDTO action2 = item.getAction();
        AtomAction atomAction2 = action2 != null ? AtomActionMapperKt.toAtomAction(action2, item.getTrackingInfo()) : null;
        PreloadVideoInfo videoInfo = item.getMediaContent().getVideoInfo();
        IconDTO playIcon2 = item.getMediaContent().getPlayIcon();
        PreloadVideoInfo fullVideoInfo = item.getMediaContent().getFullVideoInfo();
        Map<String, TokenizedTrackingInfo> trackingInfo2 = item.getTrackingInfo();
        return new ReviewTilesVO.Content.Media.Video(pair2, image2, atomAction2, empty4, empty3, playIcon2, videoInfo, fullVideoInfo, trackingInfo2 != null ? x.b(trackingInfo2, Long.valueOf(voId), null) : null);
    }

    private final ReviewTilesVO.Content.Media mapReviewDescription(ReviewTileItemDTO item, ReviewDescription content, long voId) {
        if (item.getMediaContent().getVideoInfo() == null) {
            Pair pair = new Pair(Integer.valueOf(REVIEW_DESCRIPTION_TILE_WIDTH), Integer.valueOf(REVIEW_DESCRIPTION_TILE_HEIGTH));
            ImageDTO image = item.getMediaContent().getImage();
            PriceDTO price = content.getPrice();
            TextDTO text = content.getText();
            String gradientColor = content.getGradientColor();
            if (gradientColor == null) {
                gradientColor = UniGradients.GR_OVERLAY_PRIMARY.getToken();
            }
            ReviewTilesVO.ReviewDescription reviewDescription = new ReviewTilesVO.ReviewDescription(price, text, gradientColor);
            ReviewTilesVO.AuthorAvatar empty = ReviewTilesVO.AuthorAvatar.INSTANCE.empty();
            AtomActionDTO action = item.getAction();
            AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, item.getTrackingInfo()) : null;
            IconDTO playIcon = item.getMediaContent().getPlayIcon();
            Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
            return new ReviewTilesVO.Content.Media.Image(pair, image, atomAction, empty, reviewDescription, playIcon, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(voId), null) : null);
        }
        Pair pair2 = new Pair(Integer.valueOf(REVIEW_DESCRIPTION_TILE_WIDTH), Integer.valueOf(REVIEW_DESCRIPTION_TILE_HEIGTH));
        ImageDTO image2 = item.getMediaContent().getImage();
        PriceDTO price2 = content.getPrice();
        TextDTO text2 = content.getText();
        String gradientColor2 = content.getGradientColor();
        if (gradientColor2 == null) {
            gradientColor2 = UniGradients.GR_OVERLAY_PRIMARY.getToken();
        }
        ReviewTilesVO.ReviewDescription reviewDescription2 = new ReviewTilesVO.ReviewDescription(price2, text2, gradientColor2);
        ReviewTilesVO.AuthorAvatar empty2 = ReviewTilesVO.AuthorAvatar.INSTANCE.empty();
        AtomActionDTO action2 = item.getAction();
        AtomAction atomAction2 = action2 != null ? AtomActionMapperKt.toAtomAction(action2, item.getTrackingInfo()) : null;
        PreloadVideoInfo videoInfo = item.getMediaContent().getVideoInfo();
        IconDTO playIcon2 = item.getMediaContent().getPlayIcon();
        PreloadVideoInfo fullVideoInfo = item.getMediaContent().getFullVideoInfo();
        Map<String, TokenizedTrackingInfo> trackingInfo2 = item.getTrackingInfo();
        return new ReviewTilesVO.Content.Media.Video(pair2, image2, atomAction2, empty2, reviewDescription2, playIcon2, videoInfo, fullVideoInfo, trackingInfo2 != null ? x.b(trackingInfo2, Long.valueOf(voId), null) : null);
    }

    private final ReviewTilesVO.Content mapReviewTileItem(ReviewTileItemDTO item, long voId) {
        Object content = item.getContent();
        return content instanceof ReviewDescription ? mapReviewDescription(item, (ReviewDescription) content, voId) : content instanceof AuthorAvatar ? mapAuthorAvatar(item, (AuthorAvatar) content, voId) : mapEmptyContent(item, voId);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ReviewTilesVO> invoke(@NotNull ReviewsTilesDTO state, @NotNull d widgetInfo) {
        ReviewsTileMediaContent mediaContent;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<ReviewTileItemDTO> items = state.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(mapReviewTileItem((ReviewTileItemDTO) it.next(), hashCode));
        }
        ArrayList W02 = C7714v.W0(arrayList);
        AtomActionDTO openFullViewAction = state.getOpenFullViewAction();
        if (openFullViewAction != null) {
            W02.add(new ReviewTilesVO.Content.More(AtomActionMapperKt.toAtomAction(openFullViewAction, state.getTrackingInfo())));
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        ImageDTO imageDTO = null;
        t b11 = trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null;
        ReviewTileItemDTO reviewTileItemDTO = (ReviewTileItemDTO) C7714v.M(state.getItems());
        if (reviewTileItemDTO != null && (mediaContent = reviewTileItemDTO.getMediaContent()) != null) {
            imageDTO = mediaContent.getImage();
        }
        return C7714v.a0(new ReviewTilesVO(hashCode, W02, state.getHorizontalPadding(), state.getBackgroundColor(), b11, getHeight(imageDTO)));
    }
}
