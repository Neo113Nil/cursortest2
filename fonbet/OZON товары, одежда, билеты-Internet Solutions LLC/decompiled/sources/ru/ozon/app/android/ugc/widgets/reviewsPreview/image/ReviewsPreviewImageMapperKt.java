package ru.ozon.app.android.ugc.widgets.reviewsPreview.image;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.common.ReviewsPreviewTileVO;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewTileDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniGradients;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toVO", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewTileVO;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewTileDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsPreviewImageMapperKt {
    @NotNull
    public static final ReviewsPreviewTileVO toVO(@NotNull ReviewsPreviewTileDTO reviewsPreviewTileDTO) {
        Intrinsics.checkNotNullParameter(reviewsPreviewTileDTO, "<this>");
        TextDTO title = reviewsPreviewTileDTO.getTitle();
        PriceDTO price = reviewsPreviewTileDTO.getPrice();
        IconDTO ratingIcon = reviewsPreviewTileDTO.getRatingIcon();
        TextDTO ratingValue = reviewsPreviewTileDTO.getRatingValue();
        TextDTO separator = reviewsPreviewTileDTO.getSeparator();
        String backgroundColor = reviewsPreviewTileDTO.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniGradients.GR_OVERLAY_PRIMARY.getToken();
        }
        return new ReviewsPreviewTileVO(title, price, ratingIcon, ratingValue, separator, backgroundColor);
    }
}
