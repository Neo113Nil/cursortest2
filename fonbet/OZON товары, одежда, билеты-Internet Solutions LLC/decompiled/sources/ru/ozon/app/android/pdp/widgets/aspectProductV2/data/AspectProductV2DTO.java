package ru.ozon.app.android.pdp.widgets.aspectProductV2.data;

import B90.C2619v;
import C.o0;
import Fm.C3051a;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJD\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b%\u0010\r¨\u0006&"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectProductV2/data/AspectProductV2DTO;", "", "", "image", "deeplink", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "component4", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;)Lru/ozon/app/android/pdp/widgets/aspectProductV2/data/AspectProductV2DTO;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "getDeeplink", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "getStatus", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AspectProductV2DTO {
    public static final int $stable = TextAtom.$stable | PriceDTO.$stable;
    private final String deeplink;

    @NotNull
    private final String image;

    @NotNull
    private final PriceDTO price;

    @NotNull
    private final String status;

    @NotNull
    private final TextAtom title;

    public AspectProductV2DTO(@NotNull String image, String str, @NotNull PriceDTO price, @NotNull TextAtom title, @NotNull String status) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(status, "status");
        this.image = image;
        this.deeplink = str;
        this.price = price;
        this.title = title;
        this.status = status;
    }

    public static /* synthetic */ AspectProductV2DTO copy$default(AspectProductV2DTO aspectProductV2DTO, String str, String str2, PriceDTO priceDTO, TextAtom textAtom, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aspectProductV2DTO.image;
        }
        if ((i11 & 2) != 0) {
            str2 = aspectProductV2DTO.deeplink;
        }
        if ((i11 & 4) != 0) {
            priceDTO = aspectProductV2DTO.price;
        }
        if ((i11 & 8) != 0) {
            textAtom = aspectProductV2DTO.title;
        }
        if ((i11 & 16) != 0) {
            str3 = aspectProductV2DTO.status;
        }
        String str4 = str3;
        PriceDTO priceDTO2 = priceDTO;
        return aspectProductV2DTO.copy(str, str2, priceDTO2, textAtom, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PriceDTO getPrice() {
        return this.price;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final AspectProductV2DTO copy(@NotNull String image, String deeplink, @NotNull PriceDTO price, @NotNull TextAtom title, @NotNull String status) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(status, "status");
        return new AspectProductV2DTO(image, deeplink, price, title, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AspectProductV2DTO)) {
            return false;
        }
        AspectProductV2DTO aspectProductV2DTO = (AspectProductV2DTO) other;
        return Intrinsics.d(this.image, aspectProductV2DTO.image) && Intrinsics.d(this.deeplink, aspectProductV2DTO.deeplink) && Intrinsics.d(this.price, aspectProductV2DTO.price) && Intrinsics.d(this.title, aspectProductV2DTO.title) && Intrinsics.d(this.status, aspectProductV2DTO.status);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final PriceDTO getPrice() {
        return this.price;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        String str = this.deeplink;
        return this.status.hashCode() + C2619v.b(C3051a.b(this.price, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.title);
    }

    @NotNull
    public String toString() {
        String str = this.image;
        String str2 = this.deeplink;
        PriceDTO priceDTO = this.price;
        TextAtom textAtom = this.title;
        String str3 = this.status;
        StringBuilder d11 = C3660k.d("AspectProductV2DTO(image=", str, ", deeplink=", str2, ", price=");
        d11.append(priceDTO);
        d11.append(", title=");
        d11.append(textAtom);
        d11.append(", status=");
        return o0.c(d11, str3, ")");
    }
}
