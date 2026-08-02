package ru.ozon.app.android.cart.ui.thermometer.presentation.mapper;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.ui.thermometer.data.ThermometerMoleculeDTO;
import ru.ozon.app.android.cart.ui.thermometer.presentation.vo.ThermometerMoleculeVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\f\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"toVO", "Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO;", "Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO;", "widgetId", "", "Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO$ThermometerVO;", "Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO$ThermometerDTO;", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ThermometerMoleculeMapperKt {
    @NotNull
    public static final ThermometerMoleculeVO toVO(@NotNull ThermometerMoleculeDTO thermometerMoleculeDTO, long j11) {
        Intrinsics.checkNotNullParameter(thermometerMoleculeDTO, "<this>");
        ThermometerMoleculeVO.ThermometerVO vo = toVO(thermometerMoleculeDTO.getThermometer());
        CellDTO cell = thermometerMoleculeDTO.getCell();
        AtomActionDTO action = thermometerMoleculeDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, thermometerMoleculeDTO.getTrackingInfo()) : null;
        String backgroundColor = thermometerMoleculeDTO.getBackgroundColor();
        TestInfo testInfo = thermometerMoleculeDTO.getTestInfo();
        Map<String, TokenizedTrackingInfo> trackingInfo = thermometerMoleculeDTO.getTrackingInfo();
        return new ThermometerMoleculeVO(testInfo, vo, cell, atomAction, backgroundColor, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    private static final ThermometerMoleculeVO.ThermometerVO toVO(ThermometerMoleculeDTO.ThermometerDTO thermometerDTO) {
        Float progress = thermometerDTO.getProgress().getProgress();
        ThermometerMoleculeVO.ProgressVO progressVO = new ThermometerMoleculeVO.ProgressVO(progress != null ? progress.floatValue() * 100 : 0.0f, thermometerDTO.getProgress().getRingProgressColor(), thermometerDTO.getProgress().getRingBackgroundColor());
        ThermometerMoleculeDTO.StatusDTO status = thermometerDTO.getStatus();
        ThermometerMoleculeVO.StatusVO statusVO = status != null ? new ThermometerMoleculeVO.StatusVO(status.getIcon(), status.getIconColor(), status.getCircleColor()) : null;
        Integer verticalPadding = thermometerDTO.getVerticalPadding();
        int intValue = verticalPadding != null ? verticalPadding.intValue() : 0;
        Integer horizontalPadding = thermometerDTO.getHorizontalPadding();
        return new ThermometerMoleculeVO.ThermometerVO(progressVO, statusVO, intValue, horizontalPadding != null ? horizontalPadding.intValue() : 0);
    }
}
