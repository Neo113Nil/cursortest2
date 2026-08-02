package ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.data;

import Bi.b;
import HY.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/data/HammersV3PlaceholderDTO;", "", "discountPlaceholder", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "pricePlaceholder", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getDiscountPlaceholder", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "getPricePlaceholder", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HammersV3PlaceholderDTO {
    public static final int $stable = TextAtom.$stable;
    private final TextAtom discountPlaceholder;
    private final TextAtom pricePlaceholder;
    private final TextAtom text;

    public HammersV3PlaceholderDTO(TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3) {
        this.discountPlaceholder = textAtom;
        this.text = textAtom2;
        this.pricePlaceholder = textAtom3;
    }

    public static /* synthetic */ HammersV3PlaceholderDTO copy$default(HammersV3PlaceholderDTO hammersV3PlaceholderDTO, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = hammersV3PlaceholderDTO.discountPlaceholder;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = hammersV3PlaceholderDTO.text;
        }
        if ((i11 & 4) != 0) {
            textAtom3 = hammersV3PlaceholderDTO.pricePlaceholder;
        }
        return hammersV3PlaceholderDTO.copy(textAtom, textAtom2, textAtom3);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getDiscountPlaceholder() {
        return this.discountPlaceholder;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final TextAtom getPricePlaceholder() {
        return this.pricePlaceholder;
    }

    @NotNull
    public final HammersV3PlaceholderDTO copy(TextAtom discountPlaceholder, TextAtom text, TextAtom pricePlaceholder) {
        return new HammersV3PlaceholderDTO(discountPlaceholder, text, pricePlaceholder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HammersV3PlaceholderDTO)) {
            return false;
        }
        HammersV3PlaceholderDTO hammersV3PlaceholderDTO = (HammersV3PlaceholderDTO) other;
        return Intrinsics.d(this.discountPlaceholder, hammersV3PlaceholderDTO.discountPlaceholder) && Intrinsics.d(this.text, hammersV3PlaceholderDTO.text) && Intrinsics.d(this.pricePlaceholder, hammersV3PlaceholderDTO.pricePlaceholder);
    }

    public final TextAtom getDiscountPlaceholder() {
        return this.discountPlaceholder;
    }

    public final TextAtom getPricePlaceholder() {
        return this.pricePlaceholder;
    }

    public final TextAtom getText() {
        return this.text;
    }

    public int hashCode() {
        TextAtom textAtom = this.discountPlaceholder;
        int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
        TextAtom textAtom2 = this.text;
        int hashCode2 = (hashCode + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        TextAtom textAtom3 = this.pricePlaceholder;
        return hashCode2 + (textAtom3 != null ? textAtom3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.discountPlaceholder;
        TextAtom textAtom2 = this.text;
        return b.g(a.a("HammersV3PlaceholderDTO(discountPlaceholder=", textAtom, ", text=", textAtom2, ", pricePlaceholder="), this.pricePlaceholder, ")");
    }
}
