package ru.ozon.app.android.travel.feature.entry.pushOnboarding.data;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.entry.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/pushOnboarding/data/PushOnboardingDataRepositoryImpl;", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/data/PushOnboardingDataRepository;", "<init>", "()V", "getPageData", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/data/PushOnboardingPageData;", "generateCells", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "generateCell", "titleRes", "", "iconRes", "", "Companion", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushOnboardingDataRepositoryImpl implements PushOnboardingDataRepository {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/pushOnboarding/data/PushOnboardingDataRepositoryImpl$Companion;", "", "<init>", "()V", "CLOSE_BUTTON_TEST_TAG", "", "ALLOW_BUTTON_TEST_TAG", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final CellDTO generateCell(int titleRes, String iconRes) {
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_400;
        CommonCellSettings.LayoutPadding layoutPadding2 = CommonCellSettings.LayoutPadding.PADDING_500;
        CellDTO.Settings settings = new CellDTO.Settings(layoutPadding, layoutPadding, layoutPadding2, layoutPadding2, null, null, null, CornerRadius.RADIUS_500, null, null, null, 1904, null);
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        CellDTO.CellText cellText = null;
        CommonCellSettings.LayoutPadding layoutPadding3 = null;
        CommonAtomIconDTO commonAtomIconDTO = null;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        CellDTO.CenterBlock centerBlock = new CellDTO.CenterBlock(new CellDTO.CellText(new OzonSpannableString(StringProvider.getString(titleRes)), UniColors.TEXT_LIGHT_KEY.getToken(), objArr, false, null, objArr2, 60, 0 == true ? 1 : 0), cellText, layoutPadding3, objArr3, commonAtomIconDTO, objArr4, 62, null);
        CommonAtomIconDTO commonAtomIconDTO2 = new CommonAtomIconDTO(iconRes, UniColors.GRAPHIC_LIGHT_KEY.getToken());
        IconDTO.IconSize iconSize = null;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Integer num = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str6 = null;
        TestInfo testInfo = null;
        Map map = null;
        CommonControlSettings commonControlSettings = null;
        CellDTO.BlockAlignment blockAlignment = null;
        CommonCellSettings.LayoutPadding layoutPadding4 = null;
        AtomDTO atomDTO = null;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        CommonControlSettings commonControlSettings2 = null;
        return new CellDTO(centerBlock, settings, new CellDTO.LeftBlock(commonControlSettings, blockAlignment, layoutPadding4, layoutPadding, layoutPadding, new IconDTO(iconSize, bool, IconDTO.IconShape.SQUIRCLE, str, commonAtomIconDTO2, str2, UniColors.GRAPHIC_NEUTRAL_ON_DARK.getToken(), str3, str4, str5, num, bool2, bool3, str6, testInfo, map, 65451, null), objArr6, atomDTO, 199, objArr5), 0 == true ? 1 : 0, commonControlSettings2, 24, null);
    }

    private final List<CellDTO> generateCells() {
        return C7714v.b0(generateCell(R$string.travel_notifications_onboarding_cell_1, "ic_m_bell_filled"), generateCell(R$string.travel_notifications_onboarding_cell_2, "ic_m_ticket_filled"), generateCell(R$string.travel_notifications_onboarding_cell_3, "ic_m_hot_filled"));
    }

    @Override // ru.ozon.app.android.travel.feature.entry.pushOnboarding.data.PushOnboardingDataRepository
    @NotNull
    public PushOnboardingPageData getPageData() {
        AtomActionDTO.Behavior behavior = AtomActionDTO.Behavior.DISMISS;
        CommonControlSettings commonControlSettings = new CommonControlSettings(new AtomActionDTO(behavior, "", null, null, 12, null), null, new TestInfo("PushNotificationOnboarding.closeButton"), 2, null);
        CommonControlSettings commonControlSettings2 = new CommonControlSettings(new AtomActionDTO(behavior, "", null, null, 12, null), null, new TestInfo("PushNotificationOnboarding.allowButton"), 2, null);
        ImageDTO.ImageType imageType = ImageDTO.ImageType.FIX;
        ImageDTO.FitType fitType = ImageDTO.FitType.FIT_CENTER;
        String str = "https://cdn1.ozone.ru/s3/travel-avia-data/top-subscription/logo.png";
        String str2 = null;
        ImageAspectRatio imageAspectRatio = null;
        boolean z11 = false;
        CommonCellSettings.LayoutPadding layoutPadding = null;
        CommonCellSettings.LayoutPadding layoutPadding2 = null;
        ru.ozon.uni.atoms.data.image.CornerRadius cornerRadius = null;
        String str3 = null;
        ImageDTO imageDTO = new ImageDTO(str, str2, imageAspectRatio, z11, null, layoutPadding, layoutPadding2, null, cornerRadius, str3, null, null, 125, imageType, fitType, null, 36862, null);
        ImageDTO imageDTO2 = new ImageDTO("https://cdn1.ozone.ru/s3/travel-avia-data/general/push-onboarding.webp", null, null, false, null, null, null, null, null, null, null, null, null, null, fitType, null, 49150, null);
        IconButtonV3DTO.Sizes sizes = IconButtonV3DTO.Sizes.SIZE_400;
        ButtonV3DTO.StyleTypes styleTypes = ButtonV3DTO.StyleTypes.CUSTOM;
        IconButtonV3DTO iconButtonV3DTO = new IconButtonV3DTO(sizes, styleTypes, IconButtonV3DTO.IconButtonShape.SHAPE_CIRCLE, "ic_s_cross_filled", null, UniColors.BG_PRIMARY.getToken(), UniColors.GRAPHIC_NEUTRAL_ON_DARK.getToken(), commonControlSettings, null, null, null, null, null, null, 16144, null);
        OzonSpannableString ozonSpannableString = new OzonSpannableString(StringProvider.getString(R$string.travel_notifications_onboarding_title));
        CommonCellSettings.LayoutPadding layoutPadding3 = CommonCellSettings.LayoutPadding.PADDING_200;
        CommonCellSettings.LayoutPadding layoutPadding4 = CommonCellSettings.LayoutPadding.PADDING_500;
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        String token = UniTextStyles.HEADLINE_700_X_LARGE.getToken();
        TextDTO.TextAlignment textAlignment = TextDTO.TextAlignment.LEADING;
        UniColors uniColors = UniColors.TEXT_LIGHT_KEY;
        CommonCellSettings.LayoutPadding layoutPadding5 = null;
        Integer num = null;
        TestInfo testInfo = null;
        String str4 = null;
        Map map = null;
        boolean z12 = false;
        CommonAtomLabelDTO.TruncatingMode truncatingMode = null;
        String str5 = null;
        TextDTO textDTO = new TextDTO(ozonSpannableString, textAlignment, layoutPadding4, layoutPadding3, layoutPadding5, layoutPadding3, textPreset, token, uniColors.getToken(), num, testInfo, str4, map, z12, truncatingMode, str5, null, null, 2, 261648, null);
        List<CellDTO> generateCells = generateCells();
        String string = StringProvider.getString(R$string.travel_notifications_onboarding_confirm_btn);
        return new PushOnboardingPageData(imageDTO, imageDTO2, iconButtonV3DTO, textDTO, generateCells, new ButtonV3DTO(styleTypes, ButtonV3DTO.Sizes.SIZE_600, string, null, null, null, null, UniColors.TEXT_DARK_KEY.getToken(), null, null, null, null, uniColors.getToken(), commonControlSettings2, null, null, null, null, 249720, null));
    }
}
