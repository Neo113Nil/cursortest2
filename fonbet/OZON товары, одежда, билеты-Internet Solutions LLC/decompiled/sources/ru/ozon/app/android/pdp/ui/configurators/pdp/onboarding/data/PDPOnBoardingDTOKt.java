package ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.ImageTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.Style;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"toCommonOnboardingDTO", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingDTO;", "aspectRatio", "Lru/ozon/uni/atoms/data/image/ImageAspectRatio;", "imageWidth", "", "fitType", "Lru/ozon/uni/atoms/data/image/ImageDTO$FitType;", "configurators_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PDPOnBoardingDTOKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final OnBoardingDTO toCommonOnboardingDTO(@NotNull PDPOnBoardingDTO pDPOnBoardingDTO, @NotNull ImageAspectRatio aspectRatio, int i11, ImageDTO.FitType fitType) {
        Intrinsics.checkNotNullParameter(pDPOnBoardingDTO, "<this>");
        Intrinsics.checkNotNullParameter(aspectRatio, "aspectRatio");
        ImageTitleSubtitleCellDTO.ImageTitleSubtitleCellPreset imageTitleSubtitleCellPreset = ImageTitleSubtitleCellDTO.ImageTitleSubtitleCellPreset.CENTER_END_500_CONTENT_CONTROL_500;
        int i12 = 510;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z11 = false;
        TestInfo testInfo = null;
        CommonAtomLabelDTO commonAtomLabelDTO = new CommonAtomLabelDTO(new OzonSpannableString(pDPOnBoardingDTO.getTitle()), null, null, null, null, null, null, z11, testInfo, i12, defaultConstructorMarker);
        CommonAtomLabelDTO commonAtomLabelDTO2 = new CommonAtomLabelDTO(new OzonSpannableString(pDPOnBoardingDTO.getSubtitle()), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z11, testInfo, i12, defaultConstructorMarker);
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        return new OnBoardingDTO(new ImageTitleSubtitleCellDTO(new CommonCellSettings(CommonCellSettings.LayoutPadding.PADDING_500, null, null, null, null, null, null, 14, null), imageTitleSubtitleCellPreset, commonAtomLabelDTO, commonAtomLabelDTO2, null, new ImageDTO(pDPOnBoardingDTO.getImage(), null, aspectRatio, false, null, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, null, Integer.valueOf(i11), null, fitType, null, 45050, null)), new IconButtonDTO(IconButtonDTO.Preset.SIZE_HEADER_400, Style.NEUTRAL_SECONDARY, null, "ic_s_cross_filled", null, 4, 0 == true ? 1 : 0), pDPOnBoardingDTO.getTrackingInfo(), null, null, null, 32, null);
    }

    public static /* synthetic */ OnBoardingDTO toCommonOnboardingDTO$default(PDPOnBoardingDTO pDPOnBoardingDTO, ImageAspectRatio imageAspectRatio, int i11, ImageDTO.FitType fitType, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            imageAspectRatio = ImageAspectRatio.RATIO_1_1;
        }
        if ((i12 & 2) != 0) {
            i11 = 110;
        }
        if ((i12 & 4) != 0) {
            fitType = null;
        }
        return toCommonOnboardingDTO(pDPOnBoardingDTO, imageAspectRatio, i11, fitType);
    }
}
