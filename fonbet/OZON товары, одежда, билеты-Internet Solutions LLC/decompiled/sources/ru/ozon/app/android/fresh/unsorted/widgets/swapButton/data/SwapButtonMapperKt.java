package ru.ozon.app.android.fresh.unsorted.widgets.swapButton.data;

import WZ.t;
import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.unsorted.widgets.swapButton.presentation.SwapButtonVO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/data/SwapButtonDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonVO;", "toVO", "(Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/data/SwapButtonDTO;Ll20/d;)Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonVO;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SwapButtonMapperKt {
    @NotNull
    public static final SwapButtonVO toVO(@NotNull SwapButtonDTO swapButtonDTO, @NotNull d info) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(swapButtonDTO, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        ButtonV3DTO firstButton = swapButtonDTO.getFirstButton();
        ButtonV3DTO secondButton = swapButtonDTO.getSecondButton();
        Map<String, TokenizedTrackingInfo> trackingInfo2 = swapButtonDTO.getFirstButton().getTrackingInfo();
        t tVar = null;
        t d11 = trackingInfo2 != null ? x.d(trackingInfo2, info) : null;
        ButtonV3DTO secondButton2 = swapButtonDTO.getSecondButton();
        if (secondButton2 != null && (trackingInfo = secondButton2.getTrackingInfo()) != null) {
            tVar = x.d(trackingInfo, info);
        }
        return new SwapButtonVO(hashCode, firstButton, secondButton, d11, tVar);
    }
}
