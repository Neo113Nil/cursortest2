package ru.ozon.app.android.account.orders.commonBarcodeV2.data;

import T00.a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.commonBarcodeV2.PageExtensionKt;
import ru.ozon.app.android.account.orders.commonBarcodeV2.presentation.BarcodeShareButton;
import ru.ozon.app.android.account.orders.commonBarcodeV2.presentation.CommonBarcodeV2VO;
import ru.ozon.app.android.barcodecache.R$string;
import ru.ozon.app.android.csma.flags.ShareBarcodeIconButtonEnabledFlag;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 22\u00020\u0001:\u00012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b%\u0010\u001eJ!\u0010'\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b)\u0010\u001eJ!\u0010*\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b*\u0010(J\u0017\u0010+\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b+\u0010$J\u001d\u0010.\u001a\u00020-2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010,\u001a\u00020\n¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2Mapper;", "", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2DTO;", "state", "Ll20/d;", "widgetInfo", "Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/BarcodeShareButton;", "createShareButton", "(Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2DTO;Ll20/d;)Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/BarcodeShareButton;", "Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/BarcodeShareButton$Button;", "createButton", "(Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2DTO;)Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/BarcodeShareButton$Button;", "Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/BarcodeShareButton$IconButton;", "createIconButton", "(Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2DTO;)Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/BarcodeShareButton$IconButton;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "createShareAction", "(Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2DTO;)Lru/ozon/uni/atoms/data/AtomActionDTO;", "", "shareIconButtonEnabled", "()Z", "isBarcode", "Lru/ozon/uni/atoms/data/common/Paddings;", "getContainerHorizontalPaddingDefault", "(Z)Lru/ozon/uni/atoms/data/common/Paddings;", "", "getContainerBackdropColorPaddingDefault", "(Z)Ljava/lang/String;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getContainerCornerRadiusDefault", "(Z)Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBarcodeTopLightPaddingDefault", "lightServerPadding", "getBarcodeTopDarkPaddingDefault", "(ZLru/ozon/uni/atoms/data/common/Paddings;)Lru/ozon/uni/atoms/data/common/Paddings;", "getBarcodeBottomLightPaddingDefault", "getBarcodeBottomDarkPaddingDefault", "getBarcodeCornerRadiusDefault", "info", "Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2VO;", "map", "(Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2DTO;Ll20/d;)Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2VO;", "Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CommonBarcodeV2Mapper {

    @NotNull
    private final AppType appType;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2Mapper$Companion;", "", "<init>", "()V", "SHARE_ICON_NAME", "", "OBJECT_TYPE_BARCODE", "OBJECT_TYPE_DETAILS", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CommonBarcodeV2Mapper(@NotNull AppType appType, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.appType = appType;
        this.featureChecker = featureChecker;
    }

    private final BarcodeShareButton.Button createButton(CommonBarcodeV2DTO state) {
        return new BarcodeShareButton.Button(new ButtonV3DTO(ButtonV3DTO.StyleTypes.ACTION_SECONDARY, null, StringProvider.getString(R$string.share_code), null, "ic_m_share_universal_filled", null, null, null, null, null, null, null, null, new CommonControlSettings(createShareAction(state), null, null, 6, null), null, null, null, null, 253930, null));
    }

    private final BarcodeShareButton.IconButton createIconButton(AppType appType, CommonBarcodeV2DTO state) {
        UniTheme uniTheme = UniTheme.INSTANCE;
        String id2 = uniTheme.getColorTokens().getGraphicKey().getId();
        String id3 = uniTheme.getColorTokens().getBgSecondary().getId();
        IconButtonV3DTO.Sizes sizes = IconButtonV3DTO.Sizes.SIZE_500;
        AppType appType2 = AppType.SELECT;
        return new BarcodeShareButton.IconButton(new IconButtonV3DTO(sizes, ButtonV3DTO.StyleTypes.CUSTOM, appType == appType2 ? IconButtonV3DTO.IconButtonShape.SHAPE_CIRCLE : IconButtonV3DTO.IconButtonShape.SHAPE_SQUARE, "ic_m_share_universal_filled", null, id2, id3, new CommonControlSettings(createShareAction(state), null, null, 6, null), Boolean.TRUE, null, null, null, null, null, 15888, null), appType == appType2 ? 8 : 12, appType == appType2 ? 28 : 20, appType == appType2 ? 16 : 20, null);
    }

    private final AtomActionDTO createShareAction(CommonBarcodeV2DTO state) {
        return new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, "shareBarcode", U.j(new Pair("code", state.getCode()), new Pair("text", StringProvider.getString(R$string.barcode_sharing_message)), new Pair("visibleCode", state.getVisibleCode().getText().toString()), new Pair("propertiesTitle", StringProvider.getString(R$string.share_code))), 2, null);
    }

    private final BarcodeShareButton createShareButton(AppType appType, CommonBarcodeV2DTO state, d widgetInfo) {
        a b11 = widgetInfo.b();
        boolean isBarcodePage = PageExtensionKt.isBarcodePage(b11 != null ? b11.c() : null);
        if (isBarcodePage && shareIconButtonEnabled()) {
            return createIconButton(appType, state);
        }
        if (isBarcodePage) {
            return createButton(state);
        }
        return null;
    }

    private final Paddings getBarcodeBottomDarkPaddingDefault(boolean isBarcode, Paddings lightServerPadding) {
        return lightServerPadding != null ? lightServerPadding : getBarcodeBottomLightPaddingDefault(isBarcode);
    }

    private final Paddings getBarcodeBottomLightPaddingDefault(boolean isBarcode) {
        return !isBarcode ? Paddings.PADDING_300 : this.appType == AppType.SELECT ? Paddings.PADDING_500 : Paddings.PADDING_400;
    }

    private final CornerRadius getBarcodeCornerRadiusDefault(boolean isBarcode) {
        return isBarcode ? CornerRadius.RADIUS_400 : CornerRadius.RADIUS_300;
    }

    private final Paddings getBarcodeTopDarkPaddingDefault(boolean isBarcode, Paddings lightServerPadding) {
        return lightServerPadding != null ? lightServerPadding : isBarcode ? Paddings.PADDING_700 : Paddings.PADDING_500;
    }

    private final Paddings getBarcodeTopLightPaddingDefault(boolean isBarcode) {
        return !isBarcode ? Paddings.PADDING_500 : this.appType == AppType.SELECT ? Paddings.PADDING_700 : Paddings.NONE;
    }

    private final String getContainerBackdropColorPaddingDefault(boolean isBarcode) {
        return (!isBarcode || this.appType == AppType.SELECT) ? UniColors.LAYER_FLOOR_0.getToken() : UniColors.LAYER_FLOOR_1.getToken();
    }

    private final CornerRadius getContainerCornerRadiusDefault(boolean isBarcode) {
        return isBarcode ? CornerRadius.RADIUS_600 : this.appType == AppType.SELECT ? CornerRadius.RADIUS_550 : CornerRadius.RADIUS_500;
    }

    private final Paddings getContainerHorizontalPaddingDefault(boolean isBarcode) {
        return (isBarcode || this.appType == AppType.SELECT) ? Paddings.NONE : Paddings.PADDING_500;
    }

    private final boolean shareIconButtonEnabled() {
        return this.featureChecker.isEnabled(ShareBarcodeIconButtonEnabledFlag.INSTANCE);
    }

    @NotNull
    public final CommonBarcodeV2VO map(@NotNull CommonBarcodeV2DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        a b11 = info.b();
        boolean isBarcodePage = PageExtensionKt.isBarcodePage(b11 != null ? b11.c() : null);
        Paddings barcodeTopLightPadding = state.getBarcodeTopLightPadding();
        if (barcodeTopLightPadding == null) {
            barcodeTopLightPadding = getBarcodeTopLightPaddingDefault(isBarcodePage);
        }
        Paddings paddings = barcodeTopLightPadding;
        Paddings barcodeBottomLightPadding = state.getBarcodeBottomLightPadding();
        if (barcodeBottomLightPadding == null) {
            barcodeBottomLightPadding = getBarcodeBottomLightPaddingDefault(isBarcodePage);
        }
        Paddings paddings2 = barcodeBottomLightPadding;
        long hashCode = info.d().hashCode();
        String code = state.getCode();
        TextDTO visibleCode = state.getVisibleCode();
        TextDTO subtitle = state.getSubtitle();
        CommonControlSettings common = state.getCommon();
        BarcodeShareButton createShareButton = createShareButton(this.appType, state, info);
        String str = isBarcodePage ? "barcode_share_button" : "barcode_share_button_on_orderdetails";
        boolean isOfflineMode = state.isOfflineMode();
        Paddings containerTopPadding = state.getContainerTopPadding();
        if (containerTopPadding == null) {
            containerTopPadding = Paddings.NONE;
        }
        Paddings paddings3 = containerTopPadding;
        Paddings containerHorizontalPadding = state.getContainerHorizontalPadding();
        if (containerHorizontalPadding == null) {
            containerHorizontalPadding = getContainerHorizontalPaddingDefault(isBarcodePage);
        }
        Paddings paddings4 = containerHorizontalPadding;
        String containerBackdropColor = state.getContainerBackdropColor();
        if (containerBackdropColor == null) {
            containerBackdropColor = getContainerBackdropColorPaddingDefault(isBarcodePage);
        }
        String str2 = containerBackdropColor;
        CornerRadius containerCornerRadius = state.getContainerCornerRadius();
        if (containerCornerRadius == null) {
            containerCornerRadius = getContainerCornerRadiusDefault(isBarcodePage);
        }
        CornerRadius cornerRadius = containerCornerRadius;
        Integer barcodeHeight = state.getBarcodeHeight();
        int intValue = barcodeHeight != null ? barcodeHeight.intValue() : 64;
        Integer horizontalPadding = state.getHorizontalPadding();
        int intValue2 = horizontalPadding != null ? horizontalPadding.intValue() : 16;
        Paddings barcodeTopDarkPadding = state.getBarcodeTopDarkPadding();
        if (barcodeTopDarkPadding == null) {
            barcodeTopDarkPadding = getBarcodeTopDarkPaddingDefault(isBarcodePage, state.getBarcodeTopLightPadding());
        }
        Paddings paddings5 = barcodeTopDarkPadding;
        Paddings barcodeBottomDarkPadding = state.getBarcodeBottomDarkPadding();
        if (barcodeBottomDarkPadding == null) {
            barcodeBottomDarkPadding = getBarcodeBottomDarkPaddingDefault(isBarcodePage, state.getBarcodeBottomLightPadding());
        }
        Paddings paddings6 = barcodeBottomDarkPadding;
        CornerRadius barcodeCornerRadius = state.getBarcodeCornerRadius();
        if (barcodeCornerRadius == null) {
            barcodeCornerRadius = getBarcodeCornerRadiusDefault(isBarcodePage);
        }
        return new CommonBarcodeV2VO(hashCode, code, visibleCode, subtitle, common, createShareButton, str, isOfflineMode, paddings3, paddings4, str2, cornerRadius, intValue, intValue2, paddings, paddings5, paddings2, paddings6, barcodeCornerRadius);
    }
}
