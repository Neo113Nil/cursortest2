package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProductTile;

import B90.C2619v;
import D40.a;
import Fm.C3051a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003JW\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProductTile/ReviewProductTileDTO;", "", "image", "", "price", "Lru/ozon/uni/atoms/data/price/Price;", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "addToCartButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonImage;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonImage;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getImage", "()Ljava/lang/String;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAddToCartButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonImage;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ReviewProductTileDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final ButtonV3Atom.AddToCartAtom.AddToCartButtonImage addToCartButton;

    @NotNull
    private final String image;

    @NotNull
    private final Price price;

    @NotNull
    private final TextAtom text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ReviewProductTileDTO(@NotNull String image, @NotNull Price price, @NotNull TextAtom text, ButtonV3Atom.AddToCartAtom.AddToCartButtonImage addToCartButtonImage, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(text, "text");
        this.image = image;
        this.price = price;
        this.text = text;
        this.addToCartButton = addToCartButtonImage;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ReviewProductTileDTO copy$default(ReviewProductTileDTO reviewProductTileDTO, String str, Price price, TextAtom textAtom, ButtonV3Atom.AddToCartAtom.AddToCartButtonImage addToCartButtonImage, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = reviewProductTileDTO.image;
        }
        if ((i11 & 2) != 0) {
            price = reviewProductTileDTO.price;
        }
        if ((i11 & 4) != 0) {
            textAtom = reviewProductTileDTO.text;
        }
        if ((i11 & 8) != 0) {
            addToCartButtonImage = reviewProductTileDTO.addToCartButton;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = reviewProductTileDTO.action;
        }
        if ((i11 & 32) != 0) {
            map = reviewProductTileDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        return reviewProductTileDTO.copy(str, price, textAtom, addToCartButtonImage, atomActionDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Price getPrice() {
        return this.price;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextAtom getText() {
        return this.text;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.AddToCartAtom.AddToCartButtonImage getAddToCartButton() {
        return this.addToCartButton;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final ReviewProductTileDTO copy(@NotNull String image, @NotNull Price price, @NotNull TextAtom text, ButtonV3Atom.AddToCartAtom.AddToCartButtonImage addToCartButton, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(text, "text");
        return new ReviewProductTileDTO(image, price, text, addToCartButton, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewProductTileDTO)) {
            return false;
        }
        ReviewProductTileDTO reviewProductTileDTO = (ReviewProductTileDTO) other;
        return Intrinsics.d(this.image, reviewProductTileDTO.image) && Intrinsics.d(this.price, reviewProductTileDTO.price) && Intrinsics.d(this.text, reviewProductTileDTO.text) && Intrinsics.d(this.addToCartButton, reviewProductTileDTO.addToCartButton) && Intrinsics.d(this.action, reviewProductTileDTO.action) && Intrinsics.d(this.trackingInfo, reviewProductTileDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final ButtonV3Atom.AddToCartAtom.AddToCartButtonImage getAddToCartButton() {
        return this.addToCartButton;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final Price getPrice() {
        return this.price;
    }

    @NotNull
    public final TextAtom getText() {
        return this.text;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = C2619v.b(C3051a.a(this.price, this.image.hashCode() * 31, 31), 31, this.text);
        ButtonV3Atom.AddToCartAtom.AddToCartButtonImage addToCartButtonImage = this.addToCartButton;
        int hashCode = (b11 + (addToCartButtonImage == null ? 0 : addToCartButtonImage.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.image;
        Price price = this.price;
        TextAtom textAtom = this.text;
        ButtonV3Atom.AddToCartAtom.AddToCartButtonImage addToCartButtonImage = this.addToCartButton;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ReviewProductTileDTO(image=");
        sb2.append(str);
        sb2.append(", price=");
        sb2.append(price);
        sb2.append(", text=");
        sb2.append(textAtom);
        sb2.append(", addToCartButton=");
        sb2.append(addToCartButtonImage);
        sb2.append(", action=");
        return a.d(sb2, atomActionDTO, ", trackingInfo=", map, ")");
    }
}
