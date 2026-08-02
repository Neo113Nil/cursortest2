package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.common.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toVO", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/models/MediaImageStickerVO;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaImageStickerDTO;", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaImageStickerVOKt {
    @NotNull
    public static final MediaImageStickerVO toVO(@NotNull SingleReviewDTO.MediaImageStickerDTO mediaImageStickerDTO) {
        Intrinsics.checkNotNullParameter(mediaImageStickerDTO, "<this>");
        ImageDTO image = mediaImageStickerDTO.getImage();
        AtomActionDTO clickAction = mediaImageStickerDTO.getClickAction();
        return new MediaImageStickerVO(image, clickAction != null ? AtomActionMapperKt.toAtomAction(clickAction, mediaImageStickerDTO.getClickTracking()) : null);
    }
}
