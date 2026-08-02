package ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/data/Collage;", "", "images", "", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/data/Image;", "collageItemRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getImages", "()Ljava/util/List;", "getCollageItemRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Collage {
    private final CornerRadius collageItemRadius;
    private final List<Image> images;

    public Collage(List<Image> list, CornerRadius cornerRadius) {
        this.images = list;
        this.collageItemRadius = cornerRadius;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Collage copy$default(Collage collage, List list, CornerRadius cornerRadius, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = collage.images;
        }
        if ((i11 & 2) != 0) {
            cornerRadius = collage.collageItemRadius;
        }
        return collage.copy(list, cornerRadius);
    }

    public final List<Image> component1() {
        return this.images;
    }

    /* renamed from: component2, reason: from getter */
    public final CornerRadius getCollageItemRadius() {
        return this.collageItemRadius;
    }

    @NotNull
    public final Collage copy(List<Image> images, CornerRadius collageItemRadius) {
        return new Collage(images, collageItemRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Collage)) {
            return false;
        }
        Collage collage = (Collage) other;
        return Intrinsics.d(this.images, collage.images) && this.collageItemRadius == collage.collageItemRadius;
    }

    public final CornerRadius getCollageItemRadius() {
        return this.collageItemRadius;
    }

    public final List<Image> getImages() {
        return this.images;
    }

    public int hashCode() {
        List<Image> list = this.images;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        CornerRadius cornerRadius = this.collageItemRadius;
        return hashCode + (cornerRadius != null ? cornerRadius.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Collage(images=" + this.images + ", collageItemRadius=" + this.collageItemRadius + ")";
    }

    public /* synthetic */ Collage(List list, CornerRadius cornerRadius, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, cornerRadius);
    }
}
