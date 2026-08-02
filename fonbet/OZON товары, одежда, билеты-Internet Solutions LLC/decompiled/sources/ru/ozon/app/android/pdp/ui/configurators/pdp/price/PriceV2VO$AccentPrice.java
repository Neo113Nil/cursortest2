package ru.ozon.app.android.pdp.ui.configurators.pdp.price;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, d2 = {"ru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$AccentPrice", "", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;", "price", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background;", "background", "", "disclosureTintColor", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;", "getPrice", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background;", "getBackground", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background;", "Ljava/lang/String;", "getDisclosureTintColor", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PriceV2VO$AccentPrice {
    private final AtomAction action;
    private final Background background;
    private final String disclosureTintColor;

    @NotNull
    private final ExtendedPrice price;

    public PriceV2VO$AccentPrice(@NotNull ExtendedPrice price, AtomAction atomAction, Background background, String str) {
        Intrinsics.checkNotNullParameter(price, "price");
        this.price = price;
        this.action = atomAction;
        this.background = background;
        this.disclosureTintColor = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceV2VO$AccentPrice)) {
            return false;
        }
        PriceV2VO$AccentPrice priceV2VO$AccentPrice = (PriceV2VO$AccentPrice) other;
        return Intrinsics.d(this.price, priceV2VO$AccentPrice.price) && Intrinsics.d(this.action, priceV2VO$AccentPrice.action) && Intrinsics.d(this.background, priceV2VO$AccentPrice.background) && Intrinsics.d(this.disclosureTintColor, priceV2VO$AccentPrice.disclosureTintColor);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final Background getBackground() {
        return this.background;
    }

    public final String getDisclosureTintColor() {
        return this.disclosureTintColor;
    }

    @NotNull
    public final ExtendedPrice getPrice() {
        return this.price;
    }

    public int hashCode() {
        int hashCode = this.price.hashCode() * 31;
        AtomAction atomAction = this.action;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        Background background = this.background;
        int hashCode3 = (hashCode2 + (background == null ? 0 : background.hashCode())) * 31;
        String str = this.disclosureTintColor;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AccentPrice(price=" + this.price + ", action=" + this.action + ", background=" + this.background + ", disclosureTintColor=" + this.disclosureTintColor + ")";
    }
}
