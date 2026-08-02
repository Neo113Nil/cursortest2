package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.data;

import Fm.C3051a;
import Ih.a;
import Ns.b;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.labelList.LabelListAtom;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2;
import ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.data.AddToCartButtonDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010.\u001a\u00020\u000eHÆ\u0003J\t\u0010/\u001a\u00020\u0010HÆ\u0003J\u0017\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012HÆ\u0003Jw\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00068"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseOldTileDTO;", "", "image", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "favoriteButton", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV2;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "priceWithDiscount", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "labels", "Lru/ozon/app/android/atoms/data/labelList/LabelListAtom;", "addToCartButton", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV2;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/atoms/data/labelList/LabelListAtom;Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getImage", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "getFavoriteButton", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV2;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPriceWithDiscount", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getLabels", "()Lru/ozon/app/android/atoms/data/labelList/LabelListAtom;", "getAddToCartButton", "()Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WiseOldTileDTO {

    @NotNull
    private final AtomActionDTO action;

    @NotNull
    private final AddToCartButtonDTO addToCartButton;
    private final FavoriteProductMoleculeV2 favoriteButton;

    @NotNull
    private final ProductMediaDTO image;
    private final LabelListAtom labels;

    @NotNull
    private final PriceDTO price;
    private final PriceDTO priceWithDiscount;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public WiseOldTileDTO(@NotNull ProductMediaDTO image, FavoriteProductMoleculeV2 favoriteProductMoleculeV2, @NotNull PriceDTO price, PriceDTO priceDTO, @NotNull TextDTO title, LabelListAtom labelListAtom, @NotNull AddToCartButtonDTO addToCartButton, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(addToCartButton, "addToCartButton");
        Intrinsics.checkNotNullParameter(action, "action");
        this.image = image;
        this.favoriteButton = favoriteProductMoleculeV2;
        this.price = price;
        this.priceWithDiscount = priceDTO;
        this.title = title;
        this.labels = labelListAtom;
        this.addToCartButton = addToCartButton;
        this.action = action;
        this.trackingInfo = map;
    }

    public static /* synthetic */ WiseOldTileDTO copy$default(WiseOldTileDTO wiseOldTileDTO, ProductMediaDTO productMediaDTO, FavoriteProductMoleculeV2 favoriteProductMoleculeV2, PriceDTO priceDTO, PriceDTO priceDTO2, TextDTO textDTO, LabelListAtom labelListAtom, AddToCartButtonDTO addToCartButtonDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            productMediaDTO = wiseOldTileDTO.image;
        }
        if ((i11 & 2) != 0) {
            favoriteProductMoleculeV2 = wiseOldTileDTO.favoriteButton;
        }
        if ((i11 & 4) != 0) {
            priceDTO = wiseOldTileDTO.price;
        }
        if ((i11 & 8) != 0) {
            priceDTO2 = wiseOldTileDTO.priceWithDiscount;
        }
        if ((i11 & 16) != 0) {
            textDTO = wiseOldTileDTO.title;
        }
        if ((i11 & 32) != 0) {
            labelListAtom = wiseOldTileDTO.labels;
        }
        if ((i11 & 64) != 0) {
            addToCartButtonDTO = wiseOldTileDTO.addToCartButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            atomActionDTO = wiseOldTileDTO.action;
        }
        if ((i11 & 256) != 0) {
            map = wiseOldTileDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        LabelListAtom labelListAtom2 = labelListAtom;
        AddToCartButtonDTO addToCartButtonDTO2 = addToCartButtonDTO;
        TextDTO textDTO2 = textDTO;
        PriceDTO priceDTO3 = priceDTO;
        return wiseOldTileDTO.copy(productMediaDTO, favoriteProductMoleculeV2, priceDTO3, priceDTO2, textDTO2, labelListAtom2, addToCartButtonDTO2, atomActionDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ProductMediaDTO getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final FavoriteProductMoleculeV2 getFavoriteButton() {
        return this.favoriteButton;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PriceDTO getPrice() {
        return this.price;
    }

    /* renamed from: component4, reason: from getter */
    public final PriceDTO getPriceWithDiscount() {
        return this.priceWithDiscount;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component6, reason: from getter */
    public final LabelListAtom getLabels() {
        return this.labels;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final AddToCartButtonDTO getAddToCartButton() {
        return this.addToCartButton;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.trackingInfo;
    }

    @NotNull
    public final WiseOldTileDTO copy(@NotNull ProductMediaDTO image, FavoriteProductMoleculeV2 favoriteButton, @NotNull PriceDTO price, PriceDTO priceWithDiscount, @NotNull TextDTO title, LabelListAtom labels, @NotNull AddToCartButtonDTO addToCartButton, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(addToCartButton, "addToCartButton");
        Intrinsics.checkNotNullParameter(action, "action");
        return new WiseOldTileDTO(image, favoriteButton, price, priceWithDiscount, title, labels, addToCartButton, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WiseOldTileDTO)) {
            return false;
        }
        WiseOldTileDTO wiseOldTileDTO = (WiseOldTileDTO) other;
        return Intrinsics.d(this.image, wiseOldTileDTO.image) && Intrinsics.d(this.favoriteButton, wiseOldTileDTO.favoriteButton) && Intrinsics.d(this.price, wiseOldTileDTO.price) && Intrinsics.d(this.priceWithDiscount, wiseOldTileDTO.priceWithDiscount) && Intrinsics.d(this.title, wiseOldTileDTO.title) && Intrinsics.d(this.labels, wiseOldTileDTO.labels) && Intrinsics.d(this.addToCartButton, wiseOldTileDTO.addToCartButton) && Intrinsics.d(this.action, wiseOldTileDTO.action) && Intrinsics.d(this.trackingInfo, wiseOldTileDTO.trackingInfo);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final AddToCartButtonDTO getAddToCartButton() {
        return this.addToCartButton;
    }

    public final FavoriteProductMoleculeV2 getFavoriteButton() {
        return this.favoriteButton;
    }

    @NotNull
    public final ProductMediaDTO getImage() {
        return this.image;
    }

    public final LabelListAtom getLabels() {
        return this.labels;
    }

    @NotNull
    public final PriceDTO getPrice() {
        return this.price;
    }

    public final PriceDTO getPriceWithDiscount() {
        return this.priceWithDiscount;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        FavoriteProductMoleculeV2 favoriteProductMoleculeV2 = this.favoriteButton;
        int b11 = C3051a.b(this.price, (hashCode + (favoriteProductMoleculeV2 == null ? 0 : favoriteProductMoleculeV2.hashCode())) * 31, 31);
        PriceDTO priceDTO = this.priceWithDiscount;
        int a11 = b.a(this.title, (b11 + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31, 31);
        LabelListAtom labelListAtom = this.labels;
        int b12 = a.b(this.action, (this.addToCartButton.hashCode() + ((a11 + (labelListAtom == null ? 0 : labelListAtom.hashCode())) * 31)) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b12 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ProductMediaDTO productMediaDTO = this.image;
        FavoriteProductMoleculeV2 favoriteProductMoleculeV2 = this.favoriteButton;
        PriceDTO priceDTO = this.price;
        PriceDTO priceDTO2 = this.priceWithDiscount;
        TextDTO textDTO = this.title;
        LabelListAtom labelListAtom = this.labels;
        AddToCartButtonDTO addToCartButtonDTO = this.addToCartButton;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("WiseOldTileDTO(image=");
        sb2.append(productMediaDTO);
        sb2.append(", favoriteButton=");
        sb2.append(favoriteProductMoleculeV2);
        sb2.append(", price=");
        sb2.append(priceDTO);
        sb2.append(", priceWithDiscount=");
        sb2.append(priceDTO2);
        sb2.append(", title=");
        sb2.append(textDTO);
        sb2.append(", labels=");
        sb2.append(labelListAtom);
        sb2.append(", addToCartButton=");
        sb2.append(addToCartButtonDTO);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
