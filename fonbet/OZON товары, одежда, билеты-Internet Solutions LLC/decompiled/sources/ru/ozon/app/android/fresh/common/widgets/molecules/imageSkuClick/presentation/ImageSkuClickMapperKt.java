package ru.ozon.app.android.fresh.common.widgets.molecules.imageSkuClick.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.common.widgets.molecules.imageSkuClick.data.ImageSkuClickDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.imageSkuClick.presentation.ImageSkuClickVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.image.CornerRadius;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\n\u0010\u0004\u001a\u00020\t*\u00020\n\u001a\f\u0010\u0004\u001a\u00020\u000b*\u0004\u0018\u00010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"defaultCorners", "", "defaultContainerPadding", "", "toVO", "Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/data/ImageSkuClickDTO;", "widgetId", "", "Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO$LabelVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/data/ImageSkuClickDTO$LabelDTO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO$SpacersVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/data/ImageSkuClickDTO$Spacers;", "widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImageSkuClickMapperKt {
    private static final float defaultCorners = ResourceExtKt.toPxF(20);
    private static final int defaultContainerPadding = ResourceExtKt.toPx(4);

    @NotNull
    public static final ImageSkuClickVO toVO(@NotNull ImageSkuClickDTO imageSkuClickDTO, long j11) {
        Intrinsics.checkNotNullParameter(imageSkuClickDTO, "<this>");
        ImageDTO image = imageSkuClickDTO.getImage();
        ImageSkuClickVO.LabelVO vo = toVO(imageSkuClickDTO.getText());
        String overlayColor = imageSkuClickDTO.getOverlayColor();
        CornerRadius cornerRadius = imageSkuClickDTO.getImage().getCornerRadius();
        float pxF = cornerRadius != null ? ResourceExtKt.toPxF(cornerRadius.getPx()) : defaultCorners;
        ImageSkuClickVO.SpacersVO vo2 = toVO(imageSkuClickDTO.getSpacers());
        AtomActionDTO action = imageSkuClickDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = imageSkuClickDTO.getTrackingInfo();
        return new ImageSkuClickVO(image, vo, overlayColor, pxF, vo2, atomAction, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @NotNull
    public static final ImageSkuClickVO.LabelVO toVO(@NotNull ImageSkuClickDTO.LabelDTO labelDTO) {
        Intrinsics.checkNotNullParameter(labelDTO, "<this>");
        return new ImageSkuClickVO.LabelVO(labelDTO.getQuantity(), labelDTO.getSubtitle());
    }

    @NotNull
    public static final ImageSkuClickVO.SpacersVO toVO(ImageSkuClickDTO.Spacers spacers) {
        Paddings left;
        Paddings right;
        Paddings bottom;
        Paddings top;
        return new ImageSkuClickVO.SpacersVO((spacers == null || (top = spacers.getTop()) == null) ? defaultContainerPadding : ResourceExtKt.toPx(top.getPx()), (spacers == null || (bottom = spacers.getBottom()) == null) ? defaultContainerPadding : ResourceExtKt.toPx(bottom.getPx()), (spacers == null || (right = spacers.getRight()) == null) ? defaultContainerPadding : ResourceExtKt.toPx(right.getPx()), (spacers == null || (left = spacers.getLeft()) == null) ? defaultContainerPadding : ResourceExtKt.toPx(left.getPx()));
    }
}
