package ru.ozon.app.android.travel.feature.avia.shared.orderTotal;

import B90.C2619v;
import HY.a;
import Tl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/orderTotal/OrderTotalVO;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "caption", "price", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "submitButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "infoButton", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getCaption", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPrice", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getInfoButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OrderTotalVO {
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

    public OrderTotalVO(@NotNull TextAtom caption, @NotNull TextAtom price, @NotNull ButtonV3Atom.LargeButton submitButton, ButtonV3Atom.SmallIconButton smallIconButton) {
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.caption = caption;
        this.price = price;
        this.submitButton = submitButton;
        this.infoButton = smallIconButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderTotalVO)) {
            return false;
        }
        OrderTotalVO orderTotalVO = (OrderTotalVO) other;
        return Intrinsics.d(this.caption, orderTotalVO.caption) && Intrinsics.d(this.price, orderTotalVO.price) && Intrinsics.d(this.submitButton, orderTotalVO.submitButton) && Intrinsics.d(this.infoButton, orderTotalVO.infoButton);
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
        StringBuilder a11 = a.a("OrderTotalVO(caption=", textAtom, ", price=", textAtom2, ", submitButton=");
        a11.append(largeButton);
        a11.append(", infoButton=");
        a11.append(smallIconButton);
        a11.append(")");
        return a11.toString();
    }
}
