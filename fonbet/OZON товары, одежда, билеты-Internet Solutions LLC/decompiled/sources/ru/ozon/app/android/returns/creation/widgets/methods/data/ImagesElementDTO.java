package ru.ozon.app.android.returns.creation.widgets.methods.data;

import G.g;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/methods/data/ImagesElementDTO;", "Lru/ozon/app/android/returns/creation/widgets/methods/data/ElementDTO;", "paddings", "Lru/ozon/app/android/returns/creation/widgets/methods/data/PaddingsDTO;", "backgroundColor", "", "images", "Lru/ozon/app/android/returns/creation/widgets/methods/data/ImagesDTO;", "<init>", "(Lru/ozon/app/android/returns/creation/widgets/methods/data/PaddingsDTO;Ljava/lang/String;Lru/ozon/app/android/returns/creation/widgets/methods/data/ImagesDTO;)V", "getPaddings", "()Lru/ozon/app/android/returns/creation/widgets/methods/data/PaddingsDTO;", "setPaddings", "(Lru/ozon/app/android/returns/creation/widgets/methods/data/PaddingsDTO;)V", "getBackgroundColor", "()Ljava/lang/String;", "getImages", "()Lru/ozon/app/android/returns/creation/widgets/methods/data/ImagesDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ImagesElementDTO implements ElementDTO {
    public static final int $stable = 8;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final ImagesDTO images;

    @NotNull
    private PaddingsDTO paddings;

    public ImagesElementDTO(@NotNull PaddingsDTO paddings, @NotNull String backgroundColor, @NotNull ImagesDTO images) {
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(images, "images");
        this.paddings = paddings;
        this.backgroundColor = backgroundColor;
        this.images = images;
    }

    public static /* synthetic */ ImagesElementDTO copy$default(ImagesElementDTO imagesElementDTO, PaddingsDTO paddingsDTO, String str, ImagesDTO imagesDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paddingsDTO = imagesElementDTO.paddings;
        }
        if ((i11 & 2) != 0) {
            str = imagesElementDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            imagesDTO = imagesElementDTO.images;
        }
        return imagesElementDTO.copy(paddingsDTO, str, imagesDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final PaddingsDTO getPaddings() {
        return this.paddings;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ImagesDTO getImages() {
        return this.images;
    }

    @NotNull
    public final ImagesElementDTO copy(@NotNull PaddingsDTO paddings, @NotNull String backgroundColor, @NotNull ImagesDTO images) {
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(images, "images");
        return new ImagesElementDTO(paddings, backgroundColor, images);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImagesElementDTO)) {
            return false;
        }
        ImagesElementDTO imagesElementDTO = (ImagesElementDTO) other;
        return Intrinsics.d(this.paddings, imagesElementDTO.paddings) && Intrinsics.d(this.backgroundColor, imagesElementDTO.backgroundColor) && Intrinsics.d(this.images, imagesElementDTO.images);
    }

    @NotNull
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final ImagesDTO getImages() {
        return this.images;
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.methods.data.ElementDTO
    @NotNull
    public PaddingsDTO getPaddings() {
        return this.paddings;
    }

    public int hashCode() {
        return this.images.hashCode() + g.a(this.paddings.hashCode() * 31, 31, this.backgroundColor);
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.methods.data.ElementDTO
    public void setPaddings(@NotNull PaddingsDTO paddingsDTO) {
        Intrinsics.checkNotNullParameter(paddingsDTO, "<set-?>");
        this.paddings = paddingsDTO;
    }

    @NotNull
    public String toString() {
        return "ImagesElementDTO(paddings=" + this.paddings + ", backgroundColor=" + this.backgroundColor + ", images=" + this.images + ")";
    }
}
