package ru.ozon.app.android.account.orders.emptyscreen;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.deeplink.BarcodeFullScreenDeeplinkHandler;
import ru.ozon.app.android.barcodecache.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/CommonBarcodeV2DefaultDataFactory;", "", "<init>", "()V", "createVisibleCode", "Lru/ozon/uni/atoms/data/text/TextDTO;", "visibleCode", "", "createSubtitle", "isTeensModeEnabled", "", "createCommon", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CommonBarcodeV2DefaultDataFactory {

    @NotNull
    public static final CommonBarcodeV2DefaultDataFactory INSTANCE = new CommonBarcodeV2DefaultDataFactory();

    private CommonBarcodeV2DefaultDataFactory() {
    }

    @NotNull
    public final CommonControlSettings createCommon() {
        return new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.REDIRECT, BarcodeFullScreenDeeplinkHandler.INSTANCE.deeplink(), null, null, 12, null), null, null, 6, null);
    }

    @NotNull
    public final TextDTO createSubtitle(boolean isTeensModeEnabled) {
        return new TextDTO(OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(isTeensModeEnabled ? R$string.teens_common_barcode_subtitle : R$string.common_barcode_subtitle)), TextDTO.TextAlignment.CENTER, null, null, null, null, TextPreset.PRESET_CUSTOM, UniTextStyles.BODY_300_X_SMALL.getToken(), UniColors.TEXT_SECONDARY_ON_LIGHT.getToken(), null, null, null, null, false, null, null, null, null, null, 523836, null);
    }

    @NotNull
    public final TextDTO createVisibleCode(@NotNull String visibleCode) {
        Intrinsics.checkNotNullParameter(visibleCode, "visibleCode");
        return new TextDTO(OzonSpannableStringKt.toOzonSpannableString(visibleCode), null, null, null, null, null, TextPreset.PRESET_CUSTOM, UniTextStyles.HEADLINE_600_LARGE.getToken(), UniColors.TEXT_PRIMARY_ON_LIGHT.getToken(), null, null, null, null, false, null, null, null, null, null, 523838, null);
    }
}
