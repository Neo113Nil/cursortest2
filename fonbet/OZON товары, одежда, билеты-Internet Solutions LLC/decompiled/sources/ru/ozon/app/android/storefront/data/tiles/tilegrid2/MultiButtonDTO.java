package ru.ozon.app.android.storefront.data.tiles.tilegrid2;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoriteReserveButton.FavoriteReserveButtonMolecule;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.app.android.storefront.data.tiles.addtocart.likezone.AddToCartContainerDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/MultiButtonDTO;", "", "ozonButton", "expressButton", "ozonButtonRecShelfAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "expressButtonRecShelfAction", "relatedProductsCurtain", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/RelatedProductsCurtain;", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/storefront/data/tiles/tilegrid2/RelatedProductsCurtain;)V", "getOzonButton", "()Ljava/lang/Object;", "getExpressButton", "getOzonButtonRecShelfAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getExpressButtonRecShelfAction", "getRelatedProductsCurtain", "()Lru/ozon/app/android/storefront/data/tiles/tilegrid2/RelatedProductsCurtain;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MultiButtonDTO {
    private final Object expressButton;
    private final AtomActionDTO expressButtonRecShelfAction;
    private final Object ozonButton;
    private final AtomActionDTO ozonButtonRecShelfAction;
    private final RelatedProductsCurtain relatedProductsCurtain;

    public MultiButtonDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "addToCart", type = AddToCartButtonDTO.class), @ProtoOneOfSignature(name = "favoriteReserveButtonMolecule", type = FavoriteReserveButtonMolecule.class), @ProtoOneOfSignature(name = "addToCartContainer", type = AddToCartContainerDTO.class)}) @ProtoOneOf(label = "type") Object obj, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "addToCart", type = AddToCartButtonDTO.class), @ProtoOneOfSignature(name = "favoriteReserveButtonMolecule", type = FavoriteReserveButtonMolecule.class), @ProtoOneOfSignature(name = "addToCartContainer", type = AddToCartContainerDTO.class)}) @ProtoOneOf(label = "type") Object obj2, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, RelatedProductsCurtain relatedProductsCurtain) {
        this.ozonButton = obj;
        this.expressButton = obj2;
        this.ozonButtonRecShelfAction = atomActionDTO;
        this.expressButtonRecShelfAction = atomActionDTO2;
        this.relatedProductsCurtain = relatedProductsCurtain;
    }

    public static /* synthetic */ MultiButtonDTO copy$default(MultiButtonDTO multiButtonDTO, Object obj, Object obj2, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, RelatedProductsCurtain relatedProductsCurtain, int i11, Object obj3) {
        if ((i11 & 1) != 0) {
            obj = multiButtonDTO.ozonButton;
        }
        if ((i11 & 2) != 0) {
            obj2 = multiButtonDTO.expressButton;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = multiButtonDTO.ozonButtonRecShelfAction;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO2 = multiButtonDTO.expressButtonRecShelfAction;
        }
        if ((i11 & 16) != 0) {
            relatedProductsCurtain = multiButtonDTO.relatedProductsCurtain;
        }
        RelatedProductsCurtain relatedProductsCurtain2 = relatedProductsCurtain;
        AtomActionDTO atomActionDTO3 = atomActionDTO;
        return multiButtonDTO.copy(obj, obj2, atomActionDTO3, atomActionDTO2, relatedProductsCurtain2);
    }

    /* renamed from: component1, reason: from getter */
    public final Object getOzonButton() {
        return this.ozonButton;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getExpressButton() {
        return this.expressButton;
    }

    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getOzonButtonRecShelfAction() {
        return this.ozonButtonRecShelfAction;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getExpressButtonRecShelfAction() {
        return this.expressButtonRecShelfAction;
    }

    /* renamed from: component5, reason: from getter */
    public final RelatedProductsCurtain getRelatedProductsCurtain() {
        return this.relatedProductsCurtain;
    }

    @NotNull
    public final MultiButtonDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "addToCart", type = AddToCartButtonDTO.class), @ProtoOneOfSignature(name = "favoriteReserveButtonMolecule", type = FavoriteReserveButtonMolecule.class), @ProtoOneOfSignature(name = "addToCartContainer", type = AddToCartContainerDTO.class)}) @ProtoOneOf(label = "type") Object ozonButton, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "addToCart", type = AddToCartButtonDTO.class), @ProtoOneOfSignature(name = "favoriteReserveButtonMolecule", type = FavoriteReserveButtonMolecule.class), @ProtoOneOfSignature(name = "addToCartContainer", type = AddToCartContainerDTO.class)}) @ProtoOneOf(label = "type") Object expressButton, AtomActionDTO ozonButtonRecShelfAction, AtomActionDTO expressButtonRecShelfAction, RelatedProductsCurtain relatedProductsCurtain) {
        return new MultiButtonDTO(ozonButton, expressButton, ozonButtonRecShelfAction, expressButtonRecShelfAction, relatedProductsCurtain);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiButtonDTO)) {
            return false;
        }
        MultiButtonDTO multiButtonDTO = (MultiButtonDTO) other;
        return Intrinsics.d(this.ozonButton, multiButtonDTO.ozonButton) && Intrinsics.d(this.expressButton, multiButtonDTO.expressButton) && Intrinsics.d(this.ozonButtonRecShelfAction, multiButtonDTO.ozonButtonRecShelfAction) && Intrinsics.d(this.expressButtonRecShelfAction, multiButtonDTO.expressButtonRecShelfAction) && Intrinsics.d(this.relatedProductsCurtain, multiButtonDTO.relatedProductsCurtain);
    }

    public final Object getExpressButton() {
        return this.expressButton;
    }

    public final AtomActionDTO getExpressButtonRecShelfAction() {
        return this.expressButtonRecShelfAction;
    }

    public final Object getOzonButton() {
        return this.ozonButton;
    }

    public final AtomActionDTO getOzonButtonRecShelfAction() {
        return this.ozonButtonRecShelfAction;
    }

    public final RelatedProductsCurtain getRelatedProductsCurtain() {
        return this.relatedProductsCurtain;
    }

    public int hashCode() {
        Object obj = this.ozonButton;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.expressButton;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.ozonButtonRecShelfAction;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO2 = this.expressButtonRecShelfAction;
        int hashCode4 = (hashCode3 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31;
        RelatedProductsCurtain relatedProductsCurtain = this.relatedProductsCurtain;
        return hashCode4 + (relatedProductsCurtain != null ? relatedProductsCurtain.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MultiButtonDTO(ozonButton=" + this.ozonButton + ", expressButton=" + this.expressButton + ", ozonButtonRecShelfAction=" + this.ozonButtonRecShelfAction + ", expressButtonRecShelfAction=" + this.expressButtonRecShelfAction + ", relatedProductsCurtain=" + this.relatedProductsCurtain + ")";
    }
}
