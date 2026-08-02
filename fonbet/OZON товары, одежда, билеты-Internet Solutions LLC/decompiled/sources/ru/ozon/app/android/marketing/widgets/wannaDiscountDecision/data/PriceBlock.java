package ru.ozon.app.android.marketing.widgets.wannaDiscountDecision.data;

import C.o0;
import Fm.C3051a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/PriceBlock;", "", "description", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "price", "Lru/ozon/uni/atoms/data/price/Price;", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/price/Price;Ljava/lang/String;)V", "getDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PriceBlock {
    public static final int $stable = Price.$stable | TextAtom.$stable;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final TextAtom description;

    @NotNull
    private final Price price;

    public PriceBlock(@NotNull TextAtom description, @NotNull Price price, @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.description = description;
        this.price = price;
        this.backgroundColor = backgroundColor;
    }

    public static /* synthetic */ PriceBlock copy$default(PriceBlock priceBlock, TextAtom textAtom, Price price, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = priceBlock.description;
        }
        if ((i11 & 2) != 0) {
            price = priceBlock.price;
        }
        if ((i11 & 4) != 0) {
            str = priceBlock.backgroundColor;
        }
        return priceBlock.copy(textAtom, price, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Price getPrice() {
        return this.price;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final PriceBlock copy(@NotNull TextAtom description, @NotNull Price price, @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new PriceBlock(description, price, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceBlock)) {
            return false;
        }
        PriceBlock priceBlock = (PriceBlock) other;
        return Intrinsics.d(this.description, priceBlock.description) && Intrinsics.d(this.price, priceBlock.price) && Intrinsics.d(this.backgroundColor, priceBlock.backgroundColor);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final TextAtom getDescription() {
        return this.description;
    }

    @NotNull
    public final Price getPrice() {
        return this.price;
    }

    public int hashCode() {
        return this.backgroundColor.hashCode() + C3051a.a(this.price, this.description.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.description;
        Price price = this.price;
        String str = this.backgroundColor;
        StringBuilder sb2 = new StringBuilder("PriceBlock(description=");
        sb2.append(textAtom);
        sb2.append(", price=");
        sb2.append(price);
        sb2.append(", backgroundColor=");
        return o0.c(sb2, str, ")");
    }
}
