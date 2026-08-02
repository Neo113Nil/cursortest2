package ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.common;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/common/CarriageAppearanceParam;", "", "<init>", "()V", "CARD_ELEVATION", "", "getCARD_ELEVATION", "()F", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CarriageAppearanceParam {

    @NotNull
    public static final CarriageAppearanceParam INSTANCE = new CarriageAppearanceParam();
    private static final float CARD_ELEVATION = UiExtKt.toPxF(4.0f);

    private CarriageAppearanceParam() {
    }

    public final float getCARD_ELEVATION() {
        return CARD_ELEVATION;
    }
}
