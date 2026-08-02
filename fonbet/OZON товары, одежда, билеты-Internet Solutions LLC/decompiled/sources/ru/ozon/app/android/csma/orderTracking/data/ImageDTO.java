package ru.ozon.app.android.csma.orderTracking.data;

import D3.g;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0004\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/csma/orderTracking/data/ImageDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "isOpacity", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lru/ozon/app/android/csma/orderTracking/data/ImageDTO;", "equals", "other", "hashCode", "", "toString", "", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ImageDTO {

    @NotNull
    private final ru.ozon.uni.atoms.data.image.ImageDTO image;
    private final Boolean isAdult;
    private final Boolean isOpacity;

    public ImageDTO(@i(name = "newImage") @NotNull ru.ozon.uni.atoms.data.image.ImageDTO image, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.image = image;
        this.isAdult = bool;
        this.isOpacity = bool2;
    }

    public static /* synthetic */ ImageDTO copy$default(ImageDTO imageDTO, ru.ozon.uni.atoms.data.image.ImageDTO imageDTO2, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO2 = imageDTO.image;
        }
        if ((i11 & 2) != 0) {
            bool = imageDTO.isAdult;
        }
        if ((i11 & 4) != 0) {
            bool2 = imageDTO.isOpacity;
        }
        return imageDTO.copy(imageDTO2, bool, bool2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ru.ozon.uni.atoms.data.image.ImageDTO getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsAdult() {
        return this.isAdult;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsOpacity() {
        return this.isOpacity;
    }

    @NotNull
    public final ImageDTO copy(@i(name = "newImage") @NotNull ru.ozon.uni.atoms.data.image.ImageDTO image, Boolean isAdult, Boolean isOpacity) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new ImageDTO(image, isAdult, isOpacity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageDTO)) {
            return false;
        }
        ImageDTO imageDTO = (ImageDTO) other;
        return Intrinsics.d(this.image, imageDTO.image) && Intrinsics.d(this.isAdult, imageDTO.isAdult) && Intrinsics.d(this.isOpacity, imageDTO.isOpacity);
    }

    @NotNull
    public final ru.ozon.uni.atoms.data.image.ImageDTO getImage() {
        return this.image;
    }

    public int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        Boolean bool = this.isAdult;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isOpacity;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final Boolean isAdult() {
        return this.isAdult;
    }

    public final Boolean isOpacity() {
        return this.isOpacity;
    }

    @NotNull
    public String toString() {
        ru.ozon.uni.atoms.data.image.ImageDTO imageDTO = this.image;
        Boolean bool = this.isAdult;
        Boolean bool2 = this.isOpacity;
        StringBuilder sb2 = new StringBuilder("ImageDTO(image=");
        sb2.append(imageDTO);
        sb2.append(", isAdult=");
        sb2.append(bool);
        sb2.append(", isOpacity=");
        return g.d(sb2, bool2, ")");
    }
}
