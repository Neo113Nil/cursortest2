package ru.ozon.app.android.ordertracking.v4.presentation.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/model/ImageVO;", "", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "", "isOpacity", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/Boolean;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ImageVO {

    @NotNull
    private final ImageDTO image;
    private final Boolean isOpacity;

    public ImageVO(@NotNull ImageDTO image, Boolean bool) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.image = image;
        this.isOpacity = bool;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageVO)) {
            return false;
        }
        ImageVO imageVO = (ImageVO) other;
        return Intrinsics.d(this.image, imageVO.image) && Intrinsics.d(this.isOpacity, imageVO.isOpacity);
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    public int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        Boolean bool = this.isOpacity;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    /* renamed from: isOpacity, reason: from getter */
    public final Boolean getIsOpacity() {
        return this.isOpacity;
    }

    @NotNull
    public String toString() {
        return "ImageVO(image=" + this.image + ", isOpacity=" + this.isOpacity + ")";
    }
}
