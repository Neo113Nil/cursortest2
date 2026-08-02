package ru.ozon.android.composerCommonViewKit.compose.widget.commonimage.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonimage.data.CommonImageDTO;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonimage.presentation.CommonImageVO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.core.models.UniPaddingToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonimage/data/CommonImageDTO;", "Ll20/d;", "widgetInfo", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonimage/presentation/CommonImageVO;", "toVo", "(Lru/ozon/android/composerCommonViewKit/compose/widget/commonimage/data/CommonImageDTO;Ll20/d;)Lru/ozon/android/composerCommonViewKit/compose/widget/commonimage/presentation/CommonImageVO;", "common-view-kit_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CommonImageMapperKt {
    @NotNull
    public static final CommonImageVO toVo(@NotNull CommonImageDTO commonImageDTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(commonImageDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        ImageDTO image = commonImageDTO.getImage();
        if (image == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        UniPaddingToken leftMargin = commonImageDTO.getLeftMargin();
        if (leftMargin == null) {
            leftMargin = UniTheme.INSTANCE.getPaddingTokens().getPadding300();
        }
        UniPaddingToken uniPaddingToken = leftMargin;
        UniPaddingToken topMargin = commonImageDTO.getTopMargin();
        if (topMargin == null) {
            topMargin = UniTheme.INSTANCE.getPaddingTokens().getPadding300();
        }
        UniPaddingToken uniPaddingToken2 = topMargin;
        UniPaddingToken rightMargin = commonImageDTO.getRightMargin();
        if (rightMargin == null) {
            rightMargin = UniTheme.INSTANCE.getPaddingTokens().getPadding300();
        }
        UniPaddingToken uniPaddingToken3 = rightMargin;
        UniPaddingToken bottomMargin = commonImageDTO.getBottomMargin();
        if (bottomMargin == null) {
            bottomMargin = UniTheme.INSTANCE.getPaddingTokens().getNone();
        }
        return new CommonImageVO(hashCode, image, uniPaddingToken, uniPaddingToken2, uniPaddingToken3, bottomMargin);
    }
}
