package ru.ozon.app.android.checkoutcomposer.couriersteps.data;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.couriersteps.data.CourierStepsDTO;
import ru.ozon.app.android.checkoutcomposer.couriersteps.presentation.vo.CourierStepsVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO;", "toVO", "(Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO;Ll20/d;)Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO;", "Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$SettingsDTO;", "settingsDTO", "Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO$SettingsVO;", "mapSettings", "(Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$SettingsDTO;)Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO$SettingsVO;", "Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$StepsDTO;", "stepsDTO", "Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO$StepsVO;", "mapSteps", "(Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$StepsDTO;)Lru/ozon/app/android/checkoutcomposer/couriersteps/presentation/vo/CourierStepsVO$StepsVO;", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CourierStepsMapperKt {
    public static final CourierStepsVO.SettingsVO mapSettings(CourierStepsDTO.SettingsDTO settingsDTO) {
        if (settingsDTO != null) {
            return new CourierStepsVO.SettingsVO(settingsDTO.getBgColor(), settingsDTO.getPadding(), settingsDTO.getOuterBgColor(), settingsDTO.getOuterPadding(), settingsDTO.getTopCornerRadius(), settingsDTO.getTopBorderColor());
        }
        return null;
    }

    public static final CourierStepsVO.StepsVO mapSteps(CourierStepsDTO.StepsDTO stepsDTO) {
        if (stepsDTO == null) {
            return null;
        }
        return new CourierStepsVO.StepsVO(new CourierStepsVO.StepsVO.StepsGroupVO(stepsDTO.getTotal().getCount(), stepsDTO.getTotal().getBgColor()), new CourierStepsVO.StepsVO.StepsGroupVO(stepsDTO.getActive().getCount(), stepsDTO.getActive().getBgColor()));
    }

    @NotNull
    public static final CourierStepsVO toVO(@NotNull CourierStepsDTO courierStepsDTO, @NotNull d info) {
        Intrinsics.checkNotNullParameter(courierStepsDTO, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        TextDTO title = courierStepsDTO.getTitle();
        IconButtonV3DTO titleIcon = courierStepsDTO.getTitleIcon();
        CourierStepsVO.StepsVO mapSteps = mapSteps(courierStepsDTO.getSteps());
        CourierStepsVO.SettingsVO mapSettings = mapSettings(courierStepsDTO.getSettings());
        Map<String, TokenizedTrackingInfo> trackingInfo = courierStepsDTO.getTrackingInfo();
        return new CourierStepsVO(hashCode, title, titleIcon, mapSteps, mapSettings, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }
}
