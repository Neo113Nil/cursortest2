package ru.ozon.app.android.travel.feature.general.common.widgets.disclaimer.v2.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.disclaimer.v2.data.DisclaimerV2DTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.disclaimer.v2.presentation.DisclaimerV2VO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVO", "Lru/ozon/app/android/travel/feature/general/common/widgets/disclaimer/v2/presentation/DisclaimerV2VO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/disclaimer/v2/data/DisclaimerV2DTO;", "widgetId", "", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DisclaimerV2MapperKt {
    @NotNull
    public static final DisclaimerV2VO toVO(@NotNull DisclaimerV2DTO disclaimerV2DTO, @NotNull String widgetId) {
        Paddings paddings;
        Paddings paddings2;
        Paddings paddings3;
        Paddings paddings4;
        Intrinsics.checkNotNullParameter(disclaimerV2DTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        long hashCode = widgetId.hashCode();
        DisclaimerDTO disclaimerContent = disclaimerV2DTO.getDisclaimerContent();
        DisclaimerV2DTO.Settings settings = disclaimerV2DTO.getSettings();
        if (settings == null || (paddings = settings.getTopPadding()) == null) {
            paddings = Paddings.NONE;
        }
        Paddings paddings5 = paddings;
        DisclaimerV2DTO.Settings settings2 = disclaimerV2DTO.getSettings();
        if (settings2 == null || (paddings2 = settings2.getBottomPadding()) == null) {
            paddings2 = Paddings.NONE;
        }
        Paddings paddings6 = paddings2;
        DisclaimerV2DTO.Settings settings3 = disclaimerV2DTO.getSettings();
        if (settings3 == null || (paddings3 = settings3.getLeftPadding()) == null) {
            paddings3 = Paddings.PADDING_300;
        }
        Paddings paddings7 = paddings3;
        DisclaimerV2DTO.Settings settings4 = disclaimerV2DTO.getSettings();
        if (settings4 == null || (paddings4 = settings4.getRightPadding()) == null) {
            paddings4 = Paddings.PADDING_300;
        }
        Paddings paddings8 = paddings4;
        DisclaimerV2DTO.Settings settings5 = disclaimerV2DTO.getSettings();
        return new DisclaimerV2VO(hashCode, disclaimerContent, paddings5, paddings6, paddings7, paddings8, settings5 != null ? settings5.getBackgroundColor() : null);
    }
}
