package ru.ozon.app.android.fresh.main.widgets.product.common.product;

import D3.h;
import Lh.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0012\b\u0001\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u0013\u00101\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005HÆ\u0003J¶\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0012\b\u0003\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\t\u0010\u001cR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u000b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001b\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001a¨\u00069"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductDTO;", "", "skuId", "", "images", "", "", "imageBadges", "Lru/ozon/app/android/fresh/main/widgets/product/common/product/ImageBadge;", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "isFavorite", "link", "state", "Lru/ozon/uni/atoms/data/AtomDTO;", "button", "secondaryButton", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "topRightButtons", "<init>", "(JLjava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/util/Map;Ljava/util/List;)V", "getSkuId", "()J", "getImages", "()Ljava/util/List;", "getImageBadges", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLink", "()Ljava/lang/String;", "getState", "getButton", "()Lru/ozon/uni/atoms/data/AtomDTO;", "getSecondaryButton", "getTrackingInfo", "()Ljava/util/Map;", "getTopRightButtons", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(JLjava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/util/Map;Ljava/util/List;)Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductDTO;", "equals", "other", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProductDTO {
    private final AtomDTO button;
    private final List<ImageBadge> imageBadges;
    private final List<String> images;
    private final Boolean isAdult;
    private final Boolean isFavorite;
    private final String link;
    private final AtomDTO secondaryButton;
    private final long skuId;
    private final List<AtomDTO> state;
    private final List<Object> topRightButtons;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductDTO(long j11, List<String> list, List<ImageBadge> list2, Boolean bool, Boolean bool2, String str, List<? extends AtomDTO> list3, AtomDTO atomDTO, AtomDTO atomDTO2, Map<String, TokenizedTrackingInfo> map, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "favoriteProductMolecule", type = FavoriteProductMolecule.class), @ProtoOneOfSignature(name = "favoriteProductMoleculeV2", type = FavoriteProductMoleculeV2.class), @ProtoOneOfSignature(name = "smallIconButton", type = ButtonV3Atom.SmallIconButton.class)}) @ProtoOneOf(label = "type") List<? extends Object> list4) {
        this.skuId = j11;
        this.images = list;
        this.imageBadges = list2;
        this.isAdult = bool;
        this.isFavorite = bool2;
        this.link = str;
        this.state = list3;
        this.button = atomDTO;
        this.secondaryButton = atomDTO2;
        this.trackingInfo = map;
        this.topRightButtons = list4;
    }

    public static /* synthetic */ ProductDTO copy$default(ProductDTO productDTO, long j11, List list, List list2, Boolean bool, Boolean bool2, String str, List list3, AtomDTO atomDTO, AtomDTO atomDTO2, Map map, List list4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = productDTO.skuId;
        }
        return productDTO.copy(j11, (i11 & 2) != 0 ? productDTO.images : list, (i11 & 4) != 0 ? productDTO.imageBadges : list2, (i11 & 8) != 0 ? productDTO.isAdult : bool, (i11 & 16) != 0 ? productDTO.isFavorite : bool2, (i11 & 32) != 0 ? productDTO.link : str, (i11 & 64) != 0 ? productDTO.state : list3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productDTO.button : atomDTO, (i11 & 256) != 0 ? productDTO.secondaryButton : atomDTO2, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productDTO.trackingInfo : map, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productDTO.topRightButtons : list4);
    }

    /* renamed from: component1, reason: from getter */
    public final long getSkuId() {
        return this.skuId;
    }

    public final Map<String, TokenizedTrackingInfo> component10() {
        return this.trackingInfo;
    }

    public final List<Object> component11() {
        return this.topRightButtons;
    }

    public final List<String> component2() {
        return this.images;
    }

    public final List<ImageBadge> component3() {
        return this.imageBadges;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsAdult() {
        return this.isAdult;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsFavorite() {
        return this.isFavorite;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    public final List<AtomDTO> component7() {
        return this.state;
    }

    /* renamed from: component8, reason: from getter */
    public final AtomDTO getButton() {
        return this.button;
    }

    /* renamed from: component9, reason: from getter */
    public final AtomDTO getSecondaryButton() {
        return this.secondaryButton;
    }

    @NotNull
    public final ProductDTO copy(long skuId, List<String> images, List<ImageBadge> imageBadges, Boolean isAdult, Boolean isFavorite, String link, List<? extends AtomDTO> state, AtomDTO button, AtomDTO secondaryButton, Map<String, TokenizedTrackingInfo> trackingInfo, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "favoriteProductMolecule", type = FavoriteProductMolecule.class), @ProtoOneOfSignature(name = "favoriteProductMoleculeV2", type = FavoriteProductMoleculeV2.class), @ProtoOneOfSignature(name = "smallIconButton", type = ButtonV3Atom.SmallIconButton.class)}) @ProtoOneOf(label = "type") List<? extends Object> topRightButtons) {
        return new ProductDTO(skuId, images, imageBadges, isAdult, isFavorite, link, state, button, secondaryButton, trackingInfo, topRightButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductDTO)) {
            return false;
        }
        ProductDTO productDTO = (ProductDTO) other;
        return this.skuId == productDTO.skuId && Intrinsics.d(this.images, productDTO.images) && Intrinsics.d(this.imageBadges, productDTO.imageBadges) && Intrinsics.d(this.isAdult, productDTO.isAdult) && Intrinsics.d(this.isFavorite, productDTO.isFavorite) && Intrinsics.d(this.link, productDTO.link) && Intrinsics.d(this.state, productDTO.state) && Intrinsics.d(this.button, productDTO.button) && Intrinsics.d(this.secondaryButton, productDTO.secondaryButton) && Intrinsics.d(this.trackingInfo, productDTO.trackingInfo) && Intrinsics.d(this.topRightButtons, productDTO.topRightButtons);
    }

    public final AtomDTO getButton() {
        return this.button;
    }

    public final List<ImageBadge> getImageBadges() {
        return this.imageBadges;
    }

    public final List<String> getImages() {
        return this.images;
    }

    public final String getLink() {
        return this.link;
    }

    public final AtomDTO getSecondaryButton() {
        return this.secondaryButton;
    }

    public final long getSkuId() {
        return this.skuId;
    }

    public final List<AtomDTO> getState() {
        return this.state;
    }

    public final List<Object> getTopRightButtons() {
        return this.topRightButtons;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.skuId) * 31;
        List<String> list = this.images;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<ImageBadge> list2 = this.imageBadges;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.isAdult;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isFavorite;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.link;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        List<AtomDTO> list3 = this.state;
        int hashCode7 = (hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        AtomDTO atomDTO = this.button;
        int hashCode8 = (hashCode7 + (atomDTO == null ? 0 : atomDTO.hashCode())) * 31;
        AtomDTO atomDTO2 = this.secondaryButton;
        int hashCode9 = (hashCode8 + (atomDTO2 == null ? 0 : atomDTO2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        List<Object> list4 = this.topRightButtons;
        return hashCode10 + (list4 != null ? list4.hashCode() : 0);
    }

    public final Boolean isAdult() {
        return this.isAdult;
    }

    public final Boolean isFavorite() {
        return this.isFavorite;
    }

    @NotNull
    public String toString() {
        long j11 = this.skuId;
        List<String> list = this.images;
        List<ImageBadge> list2 = this.imageBadges;
        Boolean bool = this.isAdult;
        Boolean bool2 = this.isFavorite;
        String str = this.link;
        List<AtomDTO> list3 = this.state;
        AtomDTO atomDTO = this.button;
        AtomDTO atomDTO2 = this.secondaryButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        List<Object> list4 = this.topRightButtons;
        StringBuilder b11 = b.b(j11, "ProductDTO(skuId=", ", images=", list);
        b11.append(", imageBadges=");
        b11.append(list2);
        b11.append(", isAdult=");
        b11.append(bool);
        b11.append(", isFavorite=");
        b11.append(bool2);
        b11.append(", link=");
        b11.append(str);
        b11.append(", state=");
        b11.append(list3);
        b11.append(", button=");
        b11.append(atomDTO);
        b11.append(", secondaryButton=");
        b11.append(atomDTO2);
        b11.append(", trackingInfo=");
        b11.append(map);
        return h.c(b11, ", topRightButtons=", list4, ")");
    }
}
