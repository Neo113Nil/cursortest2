package ru.ozon.app.android.common.tabs.core;

import kotlin.Metadata;
import ru.ozon.app.android.common.tabs.data.TabsV2DTO;
import ru.ozon.app.android.common.tabs.presentation.TabsV2VO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.ImageTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.Style;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.tabs.Tabs;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0007*\u00020\bH\u0002\u001a\f\u0010\u0000\u001a\u00020\u0007*\u00020\tH\u0002\u001a\f\u0010\n\u001a\u00020\u000b*\u00020\tH\u0002¨\u0006\f"}, d2 = {"toVo", "Lru/ozon/app/android/common/tabs/presentation/TabsV2VO;", "Lru/ozon/app/android/common/tabs/data/TabsV2DTO;", "id", "", "appType", "Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/common/tabs/presentation/TabsV2VO$OnBoardingVO;", "Lru/ozon/app/android/common/tabs/data/TabsV2DTO$CommonOnBoarding;", "Lru/ozon/app/android/common/tabs/data/TabsV2DTO$OnBoarding;", "toCommonOnboardingDTO", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "tabs_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TabsV2MapperKt {
    private static final OnBoardingDTO toCommonOnboardingDTO(TabsV2DTO.OnBoarding onBoarding) {
        return new OnBoardingDTO(new ImageTitleSubtitleCellDTO(new CommonCellSettings(CommonCellSettings.LayoutPadding.PADDING_500, CommonCellSettings.LayoutPadding.PADDING_700, null, null, null, null, null, 12, null), ImageTitleSubtitleCellDTO.ImageTitleSubtitleCellPreset.CENTER_END_500_CONTENT_CONTROL_500, new CommonAtomLabelDTO(new OzonSpannableString(onBoarding.getTitle()), null, null, null, null, null, null, false, null, 510, null), new CommonAtomLabelDTO(new OzonSpannableString(onBoarding.getSubtitle()), null, null, null, null, null, null, false, null, 510, null), null, new ImageDTO(onBoarding.getImage(), null, null, false, null, null, null, null, null, null, null, null, 95, null, null, null, 61438, null)), new IconButtonDTO(IconButtonDTO.Preset.SIZE_HEADER_400, Style.NEUTRAL_SECONDARY, null, "ic_s_cross_filled", null, 4, null), null, null, null, null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabsV2VO toVo(TabsV2DTO tabsV2DTO, long j11, AppType appType) {
        TabsV2VO.OnBoardingVO vo;
        Tabs tabs = tabsV2DTO.getTabs();
        TabsDTO dsTabs = tabsV2DTO.getDsTabs();
        TabsV2DTO.CommonOnBoarding commonOnboarding = tabsV2DTO.getCommonOnboarding();
        if (commonOnboarding == null || (vo = toVo(commonOnboarding)) == null) {
            TabsV2DTO.OnBoarding onboarding = tabsV2DTO.getOnboarding();
            vo = onboarding != null ? toVo(onboarding) : null;
        }
        TabsV2VO.OnBoardingVO onBoardingVO = vo;
        String backgroundColor = tabsV2DTO.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = (appType == AppType.SELECT ? UniColors.BG_DARK_KEY : UniColors.LAYER_FLOOR_1).getToken();
        }
        return new TabsV2VO(j11, 70791509, tabs, dsTabs, onBoardingVO, backgroundColor);
    }

    private static final TabsV2VO.OnBoardingVO toVo(TabsV2DTO.CommonOnBoarding commonOnBoarding) {
        return new TabsV2VO.OnBoardingVO(commonOnBoarding.getOnboarding(), commonOnBoarding.getTabPosition());
    }

    private static final TabsV2VO.OnBoardingVO toVo(TabsV2DTO.OnBoarding onBoarding) {
        return new TabsV2VO.OnBoardingVO(toCommonOnboardingDTO(onBoarding), onBoarding.getTabPosition());
    }
}
