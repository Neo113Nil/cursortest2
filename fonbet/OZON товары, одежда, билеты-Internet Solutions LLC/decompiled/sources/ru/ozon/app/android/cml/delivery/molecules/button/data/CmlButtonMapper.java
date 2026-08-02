package ru.ozon.app.android.cml.delivery.molecules.button.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.molecules.button.presentation.CmlButtonVO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/button/data/CmlButtonMapper;", "", "<init>", "()V", "map", "Lru/ozon/app/android/cml/delivery/molecules/button/presentation/CmlButtonVO;", "dto", "Lru/ozon/app/android/cml/delivery/molecules/button/data/CmlButtonDTO;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CmlButtonMapper {
    @NotNull
    public final CmlButtonVO map(@NotNull CmlButtonDTO dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        ButtonV3DTO button = dto.getButton();
        String topBorderColor = dto.getTopBorderColor();
        String backgroundColor = dto.getBackgroundColor();
        CornerRadius topCornerRadius = dto.getTopCornerRadius();
        if (topCornerRadius == null) {
            topCornerRadius = CornerRadius.NO_RADIUS;
        }
        CornerRadius cornerRadius = topCornerRadius;
        Paddings topPadding = dto.getTopPadding();
        if (topPadding == null) {
            topPadding = Paddings.PADDING_500;
        }
        Paddings paddings = topPadding;
        Paddings rightPadding = dto.getRightPadding();
        if (rightPadding == null) {
            rightPadding = Paddings.PADDING_500;
        }
        Paddings paddings2 = rightPadding;
        Paddings bottomPadding = dto.getBottomPadding();
        if (bottomPadding == null) {
            bottomPadding = Paddings.PADDING_500;
        }
        Paddings paddings3 = bottomPadding;
        Paddings leftPadding = dto.getLeftPadding();
        if (leftPadding == null) {
            leftPadding = Paddings.PADDING_500;
        }
        return new CmlButtonVO(button, topBorderColor, backgroundColor, cornerRadius, paddings, paddings2, paddings3, leftPadding);
    }
}
