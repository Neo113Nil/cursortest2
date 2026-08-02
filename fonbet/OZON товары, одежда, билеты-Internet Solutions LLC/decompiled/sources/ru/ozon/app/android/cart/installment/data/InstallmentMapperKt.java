package ru.ozon.app.android.cart.installment.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.installment.data.InstallmentDTO;
import ru.ozon.app.android.cart.installment.presentation.InstallmentVO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cart/installment/data/InstallmentDTO;", "Ll20/d;", "widgetInfo", "Lru/ozon/app/android/cart/installment/presentation/InstallmentVO;", "toVo", "(Lru/ozon/app/android/cart/installment/data/InstallmentDTO;Ll20/d;)Lru/ozon/app/android/cart/installment/presentation/InstallmentVO;", "Lru/ozon/app/android/cart/installment/data/InstallmentDTO$ContainerSettings;", "Lru/ozon/app/android/cart/installment/presentation/InstallmentVO$ContainerSettingsVO;", "toVO", "(Lru/ozon/app/android/cart/installment/data/InstallmentDTO$ContainerSettings;)Lru/ozon/app/android/cart/installment/presentation/InstallmentVO$ContainerSettingsVO;", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InstallmentMapperKt {
    private static final InstallmentVO.ContainerSettingsVO toVO(InstallmentDTO.ContainerSettings containerSettings) {
        CornerRadius cornerRadius = containerSettings.getCornerRadius();
        Integer valueOf = cornerRadius != null ? Integer.valueOf(cornerRadius.getPx()) : null;
        Paddings horizontalMargin = containerSettings.getHorizontalMargin();
        return new InstallmentVO.ContainerSettingsVO(valueOf, horizontalMargin != null ? Integer.valueOf(horizontalMargin.getPx()) : null, containerSettings.getBackgroundColor());
    }

    @NotNull
    public static final InstallmentVO toVo(@NotNull InstallmentDTO installmentDTO, @NotNull d widgetInfo) {
        Paddings right;
        Paddings left;
        Paddings bottom;
        Paddings top;
        Intrinsics.checkNotNullParameter(installmentDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        CellDTO cell = installmentDTO.getCell();
        InstallmentDTO.WidgetMargins margins = installmentDTO.getMargins();
        int px = (margins == null || (top = margins.getTop()) == null) ? 12 : top.getPx();
        InstallmentDTO.WidgetMargins margins2 = installmentDTO.getMargins();
        int px2 = (margins2 == null || (bottom = margins2.getBottom()) == null) ? 4 : bottom.getPx();
        InstallmentDTO.WidgetMargins margins3 = installmentDTO.getMargins();
        int i11 = 16;
        int px3 = (margins3 == null || (left = margins3.getLeft()) == null) ? 16 : left.getPx();
        InstallmentDTO.WidgetMargins margins4 = installmentDTO.getMargins();
        if (margins4 != null && (right = margins4.getRight()) != null) {
            i11 = right.getPx();
        }
        InstallmentVO.WidgetMarginsVO widgetMarginsVO = new InstallmentVO.WidgetMarginsVO(px, px2, px3, i11);
        InstallmentDTO.ContainerSettings widgetContainerSettings = installmentDTO.getWidgetContainerSettings();
        return new InstallmentVO(hashCode, cell, widgetMarginsVO, widgetContainerSettings != null ? toVO(widgetContainerSettings) : null);
    }
}
