package ru.ozon.app.android.checkoutgeo.address.addressUiInfoService;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/CheckoutTooltip;", "", "closeButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "message", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getMessage", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CheckoutTooltip {

    @NotNull
    private final IconButtonV3DTO closeButton;

    @NotNull
    private final TextDTO message;

    public CheckoutTooltip(@NotNull IconButtonV3DTO closeButton, @NotNull TextDTO message) {
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        Intrinsics.checkNotNullParameter(message, "message");
        this.closeButton = closeButton;
        this.message = message;
    }

    public static /* synthetic */ CheckoutTooltip copy$default(CheckoutTooltip checkoutTooltip, IconButtonV3DTO iconButtonV3DTO, TextDTO textDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconButtonV3DTO = checkoutTooltip.closeButton;
        }
        if ((i11 & 2) != 0) {
            textDTO = checkoutTooltip.message;
        }
        return checkoutTooltip.copy(iconButtonV3DTO, textDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getMessage() {
        return this.message;
    }

    @NotNull
    public final CheckoutTooltip copy(@NotNull IconButtonV3DTO closeButton, @NotNull TextDTO message) {
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        Intrinsics.checkNotNullParameter(message, "message");
        return new CheckoutTooltip(closeButton, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutTooltip)) {
            return false;
        }
        CheckoutTooltip checkoutTooltip = (CheckoutTooltip) other;
        return Intrinsics.d(this.closeButton, checkoutTooltip.closeButton) && Intrinsics.d(this.message, checkoutTooltip.message);
    }

    @NotNull
    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    @NotNull
    public final TextDTO getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode() + (this.closeButton.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CheckoutTooltip(closeButton=" + this.closeButton + ", message=" + this.message + ")";
    }
}
