package ru.ozon.app.android.pdp.widgets.cartButtonQuant.button;

import kotlin.Metadata;
import ru.ozon.uni.R$color;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton$LargeButtonStyle;", "", "toColorRes", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton$LargeButtonStyle;)I", "", "isShownPremiumAnimation", "Z", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonQuantKt {
    private static boolean isShownPremiumAnimation;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toColorRes(ButtonV3Atom.LargeButton.LargeButtonStyle largeButtonStyle) {
        Object obj = largeButtonStyle;
        if (largeButtonStyle == null) {
            obj = Integer.valueOf(R$color.bg_action_primary);
        }
        return obj == ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_PRIMARY ? R$color.bg_action_primary : obj == ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_PRIMARY_EXPRESS ? R$color.bg_express_primary : obj == ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_PRIMARY_FRESH ? R$color.bg_fresh_primary : R$color.bg_action_primary;
    }
}
