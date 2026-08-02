package ru.ozon.app.android.ugc.widgets.reviewTiles.data;

import C.o0;
import Ns.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewDescription;", "", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "gradientColor", "", "<init>", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getGradientColor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewDescription {
    public static final int $stable = PriceDTO.$stable;
    private final String gradientColor;

    @NotNull
    private final PriceDTO price;

    @NotNull
    private final TextDTO text;

    public ReviewDescription(@NotNull PriceDTO price, @NotNull TextDTO text, String str) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(text, "text");
        this.price = price;
        this.text = text;
        this.gradientColor = str;
    }

    public static /* synthetic */ ReviewDescription copy$default(ReviewDescription reviewDescription, PriceDTO priceDTO, TextDTO textDTO, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            priceDTO = reviewDescription.price;
        }
        if ((i11 & 2) != 0) {
            textDTO = reviewDescription.text;
        }
        if ((i11 & 4) != 0) {
            str = reviewDescription.gradientColor;
        }
        return reviewDescription.copy(priceDTO, textDTO, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final PriceDTO getPrice() {
        return this.price;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final String getGradientColor() {
        return this.gradientColor;
    }

    @NotNull
    public final ReviewDescription copy(@NotNull PriceDTO price, @NotNull TextDTO text, String gradientColor) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(text, "text");
        return new ReviewDescription(price, text, gradientColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewDescription)) {
            return false;
        }
        ReviewDescription reviewDescription = (ReviewDescription) other;
        return Intrinsics.d(this.price, reviewDescription.price) && Intrinsics.d(this.text, reviewDescription.text) && Intrinsics.d(this.gradientColor, reviewDescription.gradientColor);
    }

    public final String getGradientColor() {
        return this.gradientColor;
    }

    @NotNull
    public final PriceDTO getPrice() {
        return this.price;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public int hashCode() {
        int a11 = b.a(this.text, this.price.hashCode() * 31, 31);
        String str = this.gradientColor;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        PriceDTO priceDTO = this.price;
        TextDTO textDTO = this.text;
        String str = this.gradientColor;
        StringBuilder sb2 = new StringBuilder("ReviewDescription(price=");
        sb2.append(priceDTO);
        sb2.append(", text=");
        sb2.append(textDTO);
        sb2.append(", gradientColor=");
        return o0.c(sb2, str, ")");
    }
}
