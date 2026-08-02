package ru.ozon.app.android.storefront.widgets.navbarv2.core;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.widgets.navbarv2.data.DynamicOnScrollColors;
import ru.ozon.app.android.storefront.widgets.navbarv2.data.ShellNavBarDTO;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarBackButtonVO;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarHorizontalPaddings;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarSpacings;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarTeethVO;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarVO;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 #2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001#B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u0003j\u0002`\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010 \u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!¨\u0006$"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/core/ShellNavBarMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/navbarv2/data/ShellNavBarDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/utils/AppType;)V", "toVO", "(Lru/ozon/app/android/storefront/widgets/navbarv2/data/ShellNavBarDTO;)Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarSpacings;", "mapSpacings", "(Lru/ozon/app/android/storefront/widgets/navbarv2/data/ShellNavBarDTO;)Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarSpacings;", "", "backButtonColor", "Lru/ozon/app/android/storefront/widgets/navbarv2/data/DynamicOnScrollColors;", "dynamicOnScrollColors", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarBackButtonVO;", "createBackIconDTO", "(Ljava/lang/String;Lru/ozon/app/android/storefront/widgets/navbarv2/data/DynamicOnScrollColors;Ljava/util/Map;)Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarBackButtonVO;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/navbarv2/data/ShellNavBarDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/utils/AppType;", "defaultBgColor", "Ljava/lang/String;", "defaultBackButtonColor", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShellNavBarMapper implements Function2<ShellNavBarDTO, d, List<? extends ShellNavBarVO>> {

    @NotNull
    private final AppType appType;

    @NotNull
    private final String defaultBackButtonColor;

    @NotNull
    private final String defaultBgColor;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int teethHeight = ResourceExtKt.toPx(24);
    private static final int teethTopSpacerHeight = ResourceExtKt.toPx(0);

    @NotNull
    private static final String backButtonBgColor = UniColors.CLEAR_LIGHT_KEY_0.getToken();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/core/ShellNavBarMapper$Companion;", "", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ShellNavBarMapper(@NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.appType = appType;
        AppType appType2 = AppType.SELECT;
        this.defaultBgColor = appType == appType2 ? UniColors.BG_DARK_KEY.getToken() : UniColors.LAYER_FLOOR_1.getToken();
        this.defaultBackButtonColor = appType == appType2 ? UniColors.GRAPHIC_TERTIARY_ON_DARK.getToken() : UniColors.GRAPHIC_TERTIARY.getToken();
    }

    private final ShellNavBarBackButtonVO createBackIconDTO(String backButtonColor, DynamicOnScrollColors dynamicOnScrollColors, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new ShellNavBarBackButtonVO(new IconButtonV3DTO(IconButtonV3DTO.Sizes.SIZE_500, ButtonV3DTO.StyleTypes.CUSTOM, IconButtonV3DTO.IconButtonShape.SHAPE_SQUARE, "ic_m_disclosure_back_filled", null, backButtonColor, backButtonBgColor, new CommonControlSettings(null, trackingInfo, null, 5, null), Boolean.TRUE, null, null, null, null, null, 15888, null), C7714v.b0("top", "second"), dynamicOnScrollColors);
    }

    private final ShellNavBarSpacings mapSpacings(ShellNavBarDTO shellNavBarDTO) {
        Integer statusBarBottomSpacing = shellNavBarDTO.getStatusBarBottomSpacing();
        int px = ResourceExtKt.toPx(statusBarBottomSpacing != null ? statusBarBottomSpacing.intValue() : 4);
        Integer level0BottomSpacing = shellNavBarDTO.getLevel0BottomSpacing();
        int px2 = ResourceExtKt.toPx(level0BottomSpacing != null ? level0BottomSpacing.intValue() : 4);
        Integer level1BottomSpacing = shellNavBarDTO.getLevel1BottomSpacing();
        int px3 = ResourceExtKt.toPx(level1BottomSpacing != null ? level1BottomSpacing.intValue() : 4);
        ShellNavBarHorizontalPaddings shellNavBarHorizontalPaddings = new ShellNavBarHorizontalPaddings(shellNavBarDTO.getLevel1LeftPaddingApps(), shellNavBarDTO.getLevel1RightPaddingApps());
        Integer level2BottomSpacing = shellNavBarDTO.getLevel2BottomSpacing();
        return new ShellNavBarSpacings(px, px2, px3, ResourceExtKt.toPx(level2BottomSpacing != null ? level2BottomSpacing.intValue() : 8), shellNavBarHorizontalPaddings, new ShellNavBarHorizontalPaddings(shellNavBarDTO.getLevel2LeftPaddingApps(), shellNavBarDTO.getLevel2RightPaddingApps()), new ShellNavBarHorizontalPaddings(shellNavBarDTO.getLevel3LeftPadding(), shellNavBarDTO.getLevel3RightPadding()));
    }

    private final ShellNavBarVO toVO(ShellNavBarDTO shellNavBarDTO) {
        Boolean isRounded;
        boolean booleanValue;
        Boolean hasTeeth = shellNavBarDTO.getHasTeeth();
        Boolean bool = Boolean.TRUE;
        boolean z11 = Intrinsics.d(hasTeeth, bool) || Intrinsics.d(shellNavBarDTO.getHasScrollLevel(), bool);
        boolean booleanValue2 = (z11 || (isRounded = shellNavBarDTO.isRounded()) == null) ? false : isRounded.booleanValue();
        if (z11) {
            booleanValue = true;
        } else {
            Boolean disableRounding = shellNavBarDTO.getDisableRounding();
            booleanValue = disableRounding != null ? disableRounding.booleanValue() : false;
        }
        long hashCode = shellNavBarDTO.hashCode();
        String backgroundImage = shellNavBarDTO.getBackgroundImage();
        String darkBackgroundImage = shellNavBarDTO.getDarkBackgroundImage();
        String backgroundColor = shellNavBarDTO.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = this.defaultBgColor;
        }
        String str = backgroundColor;
        String overlayColor = shellNavBarDTO.getOverlayColor();
        Boolean forceWhiteStatusBar = shellNavBarDTO.getForceWhiteStatusBar();
        boolean booleanValue3 = forceWhiteStatusBar != null ? forceWhiteStatusBar.booleanValue() : false;
        String backButtonColor = shellNavBarDTO.getBackButtonColor();
        if (backButtonColor == null) {
            backButtonColor = this.defaultBackButtonColor;
        }
        ShellNavBarBackButtonVO createBackIconDTO = createBackIconDTO(backButtonColor, shellNavBarDTO.getDynamicOnScrollColors(), shellNavBarDTO.getTrackingInfo());
        Boolean isStickyThirdLevel = shellNavBarDTO.isStickyThirdLevel();
        return new ShellNavBarVO(hashCode, str, overlayColor, booleanValue3, backgroundImage, darkBackgroundImage, createBackIconDTO, booleanValue2, booleanValue, isStickyThirdLevel != null ? isStickyThirdLevel.booleanValue() : false, mapSpacings(shellNavBarDTO), shellNavBarDTO.getShowFullNavbarMode(), z11 ? new ShellNavBarTeethVO(teethHeight, teethTopSpacerHeight) : null, this.appType == AppType.SELECT);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ShellNavBarVO> invoke(@NotNull ShellNavBarDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(dto));
    }
}
