package ru.ozon.app.android.ugc.widgets.reviewsPreview.core;

import Sc.o;
import Tc.b;
import e10.AbstractC6252b;
import j20.C7244b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewBottomTextVO;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewDTO;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewImageDTO;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewItemDTO;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewMediaItemDTO;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewVideoDTO;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00182\u00060\u0001j\u0002`\u0002:\u0001\u0018B\u0015\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/core/ReviewsPreviewConfig;", "Le10/b;", "Lru/ozon/app/android/composer/widgets/base/config/list/ListConfig;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewItemDTO;", "item", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewDTO;", "dto", "", "index", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewBottomTextVO;", "createBottomText", "(Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewItemDTO;Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewDTO;I)Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewBottomTextVO;", "Lj20/b;", "state", "", "", "parse", "(Lj20/b;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReviewsPreviewConfig extends AbstractC6252b {

    @NotNull
    private final JsonParser jsonDeserializer;
    public static final int $stable = 8;

    public ReviewsPreviewConfig(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    private final ReviewsPreviewBottomTextVO createBottomText(ReviewsPreviewItemDTO item, ReviewsPreviewDTO dto, int index) {
        long hashCode = Integer.hashCode(index);
        TextDTO bottomText = item.getBottomText();
        String backgroundColor = dto.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.LAYER_FLOOR_0.getToken();
        }
        return new ReviewsPreviewBottomTextVO(hashCode, dto.getHorizontalPadding(), dto.getItemSpacing(), backgroundColor, bottomText);
    }

    private static final Object parse$parseReviewsPreview(ReviewsPreviewDTO reviewsPreviewDTO, int i11, ReviewsPreviewItemDTO reviewsPreviewItemDTO) {
        ReviewsPreviewMediaItemDTO mediaItem = reviewsPreviewItemDTO.getMediaItem();
        if (mediaItem instanceof ReviewsPreviewMediaItemDTO.Image) {
            ReviewsPreviewMediaItemDTO.Image image = (ReviewsPreviewMediaItemDTO.Image) mediaItem;
            return new ReviewsPreviewImageDTO(i11, image.getImage(), image.getPlayIcon(), reviewsPreviewItemDTO.getClickAction(), reviewsPreviewItemDTO.getViewedItemAction(), reviewsPreviewItemDTO.getTile(), image.getFullVideoInfo(), reviewsPreviewItemDTO.getTrackingInfo(), i11 == 0 ? reviewsPreviewDTO.getTrackingInfo() : null, reviewsPreviewItemDTO.getImage(), reviewsPreviewItemDTO.getCornerRadius(), reviewsPreviewDTO.getHorizontalPadding(), reviewsPreviewDTO.getItemSpacing(), reviewsPreviewDTO.getBackgroundColor());
        }
        if (!(mediaItem instanceof ReviewsPreviewMediaItemDTO.Video)) {
            throw new o();
        }
        ReviewsPreviewMediaItemDTO.Video video = (ReviewsPreviewMediaItemDTO.Video) mediaItem;
        ImageDTO preview = video.getPreview();
        PreloadVideoInfo videoInfo = video.getVideoInfo();
        PreloadVideoInfo fullVideoInfo = video.getFullVideoInfo();
        String paranjaColor = video.getParanjaColor();
        if (paranjaColor == null) {
            paranjaColor = UniColors.LAYER_OVERLAY_PARANJA.getToken();
        }
        return new ReviewsPreviewVideoDTO(i11, preview, videoInfo, fullVideoInfo, paranjaColor, reviewsPreviewItemDTO.getClickAction(), reviewsPreviewItemDTO.getViewedItemAction(), reviewsPreviewItemDTO.getTile(), video.getVideoStartTrackingInfo(), video.getVideoEndTrackingInfo(), reviewsPreviewItemDTO.getTrackingInfo(), i11 == 0 ? reviewsPreviewDTO.getTrackingInfo() : null, reviewsPreviewItemDTO.getImage(), reviewsPreviewItemDTO.getCornerRadius(), reviewsPreviewDTO.getHorizontalPadding(), reviewsPreviewDTO.getItemSpacing(), reviewsPreviewDTO.getBackgroundColor(), reviewsPreviewDTO.getPlaybackType());
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public List<? extends Object> parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        JsonParser jsonParser = this.jsonDeserializer;
        String b11 = state.b();
        if (b11 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ReviewsPreviewDTO reviewsPreviewDTO = (ReviewsPreviewDTO) jsonParser.fromJson(b11, ReviewsPreviewDTO.class);
        List<ReviewsPreviewItemDTO> items = reviewsPreviewDTO.getItems();
        ReviewsPreviewItemDTO reviewsPreviewItemDTO = items.get(0);
        ReviewsPreviewItemDTO reviewsPreviewItemDTO2 = items.get(1);
        b builder = C7714v.B();
        builder.add(parse$parseReviewsPreview(reviewsPreviewDTO, 0, reviewsPreviewItemDTO));
        builder.add(parse$parseReviewsPreview(reviewsPreviewDTO, 1, reviewsPreviewItemDTO2));
        if (reviewsPreviewItemDTO.getBottomText() != null || reviewsPreviewItemDTO2.getBottomText() != null) {
            builder.add(createBottomText(reviewsPreviewItemDTO, reviewsPreviewDTO, 0));
            builder.add(createBottomText(reviewsPreviewItemDTO2, reviewsPreviewDTO, 1));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}
