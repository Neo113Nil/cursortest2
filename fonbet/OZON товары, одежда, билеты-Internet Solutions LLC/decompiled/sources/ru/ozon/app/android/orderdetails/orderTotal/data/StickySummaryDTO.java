package ru.ozon.app.android.orderdetails.orderTotal.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/data/StickySummaryDTO;", "", "price", "Lru/ozon/uni/atoms/data/price/Price;", "subtitle", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "<init>", "(Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getSubtitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class StickySummaryDTO {
    public static final int $stable = TextAtom.$stable | Price.$stable;

    @NotNull
    private final Price price;
    private final TextAtom subtitle;

    public StickySummaryDTO(@NotNull Price price, TextAtom textAtom) {
        Intrinsics.checkNotNullParameter(price, "price");
        this.price = price;
        this.subtitle = textAtom;
    }

    public static /* synthetic */ StickySummaryDTO copy$default(StickySummaryDTO stickySummaryDTO, Price price, TextAtom textAtom, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            price = stickySummaryDTO.price;
        }
        if ((i11 & 2) != 0) {
            textAtom = stickySummaryDTO.subtitle;
        }
        return stickySummaryDTO.copy(price, textAtom);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Price getPrice() {
        return this.price;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final StickySummaryDTO copy(@NotNull Price price, TextAtom subtitle) {
        Intrinsics.checkNotNullParameter(price, "price");
        return new StickySummaryDTO(price, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickySummaryDTO)) {
            return false;
        }
        StickySummaryDTO stickySummaryDTO = (StickySummaryDTO) other;
        return Intrinsics.d(this.price, stickySummaryDTO.price) && Intrinsics.d(this.subtitle, stickySummaryDTO.subtitle);
    }

    @NotNull
    public final Price getPrice() {
        return this.price;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        int hashCode = this.price.hashCode() * 31;
        TextAtom textAtom = this.subtitle;
        return hashCode + (textAtom == null ? 0 : textAtom.hashCode());
    }

    @NotNull
    public String toString() {
        return "StickySummaryDTO(price=" + this.price + ", subtitle=" + this.subtitle + ")";
    }
}
