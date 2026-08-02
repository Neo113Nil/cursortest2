package ru.ozon.app.android.travel.feature.avia.shared.orderTotal;

import B90.C2619v;
import HY.a;
import Tl.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/orderTotal/OrderTotalDTO;", "", "caption", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "price", "submitButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "infoButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "getCaption", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPrice", "getSubmitButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getInfoButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OrderTotalDTO {
    public static final int $stable;

    @NotNull
    private final TextAtom caption;
    private final ButtonV3Atom.SmallIconButton infoButton;

    @NotNull
    private final TextAtom price;

    @NotNull
    private final ButtonV3Atom.LargeButton submitButton;

    static {
        int i11 = ButtonV3Atom.SmallIconButton.$stable | ButtonV3Atom.LargeButton.$stable;
        int i12 = TextAtom.$stable;
        $stable = i11 | i12 | i12;
    }

    public OrderTotalDTO(@NotNull TextAtom caption, @NotNull TextAtom price, @NotNull ButtonV3Atom.LargeButton submitButton, ButtonV3Atom.SmallIconButton smallIconButton) {
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.caption = caption;
        this.price = price;
        this.submitButton = submitButton;
        this.infoButton = smallIconButton;
    }

    public static /* synthetic */ OrderTotalDTO copy$default(OrderTotalDTO orderTotalDTO, TextAtom textAtom, TextAtom textAtom2, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.SmallIconButton smallIconButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = orderTotalDTO.caption;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = orderTotalDTO.price;
        }
        if ((i11 & 4) != 0) {
            largeButton = orderTotalDTO.submitButton;
        }
        if ((i11 & 8) != 0) {
            smallIconButton = orderTotalDTO.infoButton;
        }
        return orderTotalDTO.copy(textAtom, textAtom2, largeButton, smallIconButton);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getCaption() {
        return this.caption;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getPrice() {
        return this.price;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.LargeButton getSubmitButton() {
        return this.submitButton;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getInfoButton() {
        return this.infoButton;
    }

    @NotNull
    public final OrderTotalDTO copy(@NotNull TextAtom caption, @NotNull TextAtom price, @NotNull ButtonV3Atom.LargeButton submitButton, ButtonV3Atom.SmallIconButton infoButton) {
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        return new OrderTotalDTO(caption, price, submitButton, infoButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderTotalDTO)) {
            return false;
        }
        OrderTotalDTO orderTotalDTO = (OrderTotalDTO) other;
        return Intrinsics.d(this.caption, orderTotalDTO.caption) && Intrinsics.d(this.price, orderTotalDTO.price) && Intrinsics.d(this.submitButton, orderTotalDTO.submitButton) && Intrinsics.d(this.infoButton, orderTotalDTO.infoButton);
    }

    @NotNull
    public final TextAtom getCaption() {
        return this.caption;
    }

    public final ButtonV3Atom.SmallIconButton getInfoButton() {
        return this.infoButton;
    }

    @NotNull
    public final TextAtom getPrice() {
        return this.price;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getSubmitButton() {
        return this.submitButton;
    }

    public int hashCode() {
        int a11 = b.a(this.submitButton, C2619v.b(this.caption.hashCode() * 31, 31, this.price), 31);
        ButtonV3Atom.SmallIconButton smallIconButton = this.infoButton;
        return a11 + (smallIconButton == null ? 0 : smallIconButton.hashCode());
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.caption;
        TextAtom textAtom2 = this.price;
        ButtonV3Atom.LargeButton largeButton = this.submitButton;
        ButtonV3Atom.SmallIconButton smallIconButton = this.infoButton;
        StringBuilder a11 = a.a("OrderTotalDTO(caption=", textAtom, ", price=", textAtom2, ", submitButton=");
        a11.append(largeButton);
        a11.append(", infoButton=");
        a11.append(smallIconButton);
        a11.append(")");
        return a11.toString();
    }
}
