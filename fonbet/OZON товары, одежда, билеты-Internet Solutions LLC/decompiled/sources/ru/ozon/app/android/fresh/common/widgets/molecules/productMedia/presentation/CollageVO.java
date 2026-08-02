package ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/CollageVO;", "", "", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ImageVO;", "images", "", "collageItemRadius", "<init>", "(Ljava/util/List;Ljava/lang/Float;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "Ljava/lang/Float;", "getCollageItemRadius", "()Ljava/lang/Float;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CollageVO {
    private final Float collageItemRadius;

    @NotNull
    private final List<ImageVO> images;

    public CollageVO(@NotNull List<ImageVO> images, Float f7) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.images = images;
        this.collageItemRadius = f7;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollageVO)) {
            return false;
        }
        CollageVO collageVO = (CollageVO) other;
        return Intrinsics.d(this.images, collageVO.images) && Intrinsics.d(this.collageItemRadius, collageVO.collageItemRadius);
    }

    public final Float getCollageItemRadius() {
        return this.collageItemRadius;
    }

    @NotNull
    public final List<ImageVO> getImages() {
        return this.images;
    }

    public int hashCode() {
        int hashCode = this.images.hashCode() * 31;
        Float f7 = this.collageItemRadius;
        return hashCode + (f7 == null ? 0 : f7.hashCode());
    }

    @NotNull
    public String toString() {
        return "CollageVO(images=" + this.images + ", collageItemRadius=" + this.collageItemRadius + ")";
    }
}
