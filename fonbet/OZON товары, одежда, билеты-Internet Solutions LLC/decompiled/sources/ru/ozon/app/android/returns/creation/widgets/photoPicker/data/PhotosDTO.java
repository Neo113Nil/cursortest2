package ru.ozon.app.android.returns.creation.widgets.photoPicker.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@j(generateAdapter = false)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/PhotosDTO;", "", "emptyStateImage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "existingImages", "", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/SignedLinkDTO;", "minimalLimit", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/MinimalLimit;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/util/List;Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/MinimalLimit;)V", "getEmptyStateImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getExistingImages", "()Ljava/util/List;", "getMinimalLimit", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/MinimalLimit;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PhotosDTO {
    public static final int $stable = 8;

    @NotNull
    private final ImageDTO emptyStateImage;
    private final List<SignedLinkDTO> existingImages;
    private final MinimalLimit minimalLimit;

    public PhotosDTO(@NotNull ImageDTO emptyStateImage, List<SignedLinkDTO> list, MinimalLimit minimalLimit) {
        Intrinsics.checkNotNullParameter(emptyStateImage, "emptyStateImage");
        this.emptyStateImage = emptyStateImage;
        this.existingImages = list;
        this.minimalLimit = minimalLimit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhotosDTO copy$default(PhotosDTO photosDTO, ImageDTO imageDTO, List list, MinimalLimit minimalLimit, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = photosDTO.emptyStateImage;
        }
        if ((i11 & 2) != 0) {
            list = photosDTO.existingImages;
        }
        if ((i11 & 4) != 0) {
            minimalLimit = photosDTO.minimalLimit;
        }
        return photosDTO.copy(imageDTO, list, minimalLimit);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ImageDTO getEmptyStateImage() {
        return this.emptyStateImage;
    }

    public final List<SignedLinkDTO> component2() {
        return this.existingImages;
    }

    /* renamed from: component3, reason: from getter */
    public final MinimalLimit getMinimalLimit() {
        return this.minimalLimit;
    }

    @NotNull
    public final PhotosDTO copy(@NotNull ImageDTO emptyStateImage, List<SignedLinkDTO> existingImages, MinimalLimit minimalLimit) {
        Intrinsics.checkNotNullParameter(emptyStateImage, "emptyStateImage");
        return new PhotosDTO(emptyStateImage, existingImages, minimalLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhotosDTO)) {
            return false;
        }
        PhotosDTO photosDTO = (PhotosDTO) other;
        return Intrinsics.d(this.emptyStateImage, photosDTO.emptyStateImage) && Intrinsics.d(this.existingImages, photosDTO.existingImages) && Intrinsics.d(this.minimalLimit, photosDTO.minimalLimit);
    }

    @NotNull
    public final ImageDTO getEmptyStateImage() {
        return this.emptyStateImage;
    }

    public final List<SignedLinkDTO> getExistingImages() {
        return this.existingImages;
    }

    public final MinimalLimit getMinimalLimit() {
        return this.minimalLimit;
    }

    public int hashCode() {
        int hashCode = this.emptyStateImage.hashCode() * 31;
        List<SignedLinkDTO> list = this.existingImages;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        MinimalLimit minimalLimit = this.minimalLimit;
        return hashCode2 + (minimalLimit != null ? minimalLimit.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PhotosDTO(emptyStateImage=" + this.emptyStateImage + ", existingImages=" + this.existingImages + ", minimalLimit=" + this.minimalLimit + ")";
    }
}
