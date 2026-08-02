package ru.ozon.app.android.returns.creation.widgets.methods.data;

import H3.c;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/methods/data/ImagesDTO;", "", "images", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "<init>", "(Ljava/util/List;)V", "getImages", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ImagesDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<IconDTO> images;

    public ImagesDTO(@NotNull List<IconDTO> images) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.images = images;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImagesDTO copy$default(ImagesDTO imagesDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = imagesDTO.images;
        }
        return imagesDTO.copy(list);
    }

    @NotNull
    public final List<IconDTO> component1() {
        return this.images;
    }

    @NotNull
    public final ImagesDTO copy(@NotNull List<IconDTO> images) {
        Intrinsics.checkNotNullParameter(images, "images");
        return new ImagesDTO(images);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ImagesDTO) && Intrinsics.d(this.images, ((ImagesDTO) other).images);
    }

    @NotNull
    public final List<IconDTO> getImages() {
        return this.images;
    }

    public int hashCode() {
        return this.images.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("ImagesDTO(images=", ")", this.images);
    }
}
