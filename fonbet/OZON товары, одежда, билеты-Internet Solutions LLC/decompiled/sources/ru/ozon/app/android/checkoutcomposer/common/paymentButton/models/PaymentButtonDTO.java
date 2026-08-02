package ru.ozon.app.android.checkoutcomposer.common.paymentButton.models;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/paymentButton/models/PaymentButtonDTO;", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge;", "isSticky", "", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge;Z)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PaymentButtonDTO {
    public static final int $stable = ButtonV3Atom.PaymentButtonLarge.$stable;

    @NotNull
    private final ButtonV3Atom.PaymentButtonLarge button;
    private final boolean isSticky;

    public PaymentButtonDTO(@NotNull ButtonV3Atom.PaymentButtonLarge button, boolean z11) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.button = button;
        this.isSticky = z11;
    }

    public static /* synthetic */ PaymentButtonDTO copy$default(PaymentButtonDTO paymentButtonDTO, ButtonV3Atom.PaymentButtonLarge paymentButtonLarge, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paymentButtonLarge = paymentButtonDTO.button;
        }
        if ((i11 & 2) != 0) {
            z11 = paymentButtonDTO.isSticky;
        }
        return paymentButtonDTO.copy(paymentButtonLarge, z11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3Atom.PaymentButtonLarge getButton() {
        return this.button;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSticky() {
        return this.isSticky;
    }

    @NotNull
    public final PaymentButtonDTO copy(@NotNull ButtonV3Atom.PaymentButtonLarge button, boolean isSticky) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new PaymentButtonDTO(button, isSticky);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentButtonDTO)) {
            return false;
        }
        PaymentButtonDTO paymentButtonDTO = (PaymentButtonDTO) other;
        return Intrinsics.d(this.button, paymentButtonDTO.button) && this.isSticky == paymentButtonDTO.isSticky;
    }

    @NotNull
    public final ButtonV3Atom.PaymentButtonLarge getButton() {
        return this.button;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSticky) + (this.button.hashCode() * 31);
    }

    public final boolean isSticky() {
        return this.isSticky;
    }

    @NotNull
    public String toString() {
        return "PaymentButtonDTO(button=" + this.button + ", isSticky=" + this.isSticky + ")";
    }
}
