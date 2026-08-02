package ru.ozon.app.android.marketing.widgets.cartButton.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/cartButton/data/CartButtonDTO;", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartButtonDTO {
    public static final int $stable = ButtonV3Atom.LargeButton.$stable;
    private final ButtonV3Atom.LargeButton button;

    public CartButtonDTO(ButtonV3Atom.LargeButton largeButton) {
        this.button = largeButton;
    }

    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }
}
