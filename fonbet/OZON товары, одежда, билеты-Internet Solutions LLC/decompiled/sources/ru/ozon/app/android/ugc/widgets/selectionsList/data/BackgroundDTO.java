package ru.ozon.app.android.ugc.widgets.selectionsList.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/BackgroundDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "color", "", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/String;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BackgroundDTO {
    public static final int $stable = 0;
    private final String color;
    private final ImageDTO image;

    public BackgroundDTO(ImageDTO imageDTO, String str) {
        this.image = imageDTO;
        this.color = str;
    }

    public static /* synthetic */ BackgroundDTO copy$default(BackgroundDTO backgroundDTO, ImageDTO imageDTO, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = backgroundDTO.image;
        }
        if ((i11 & 2) != 0) {
            str = backgroundDTO.color;
        }
        return backgroundDTO.copy(imageDTO, str);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final BackgroundDTO copy(ImageDTO image, String color) {
        return new BackgroundDTO(image, color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackgroundDTO)) {
            return false;
        }
        BackgroundDTO backgroundDTO = (BackgroundDTO) other;
        return Intrinsics.d(this.image, backgroundDTO.image) && Intrinsics.d(this.color, backgroundDTO.color);
    }

    public final String getColor() {
        return this.color;
    }

    public final ImageDTO getImage() {
        return this.image;
    }

    public int hashCode() {
        ImageDTO imageDTO = this.image;
        int hashCode = (imageDTO == null ? 0 : imageDTO.hashCode()) * 31;
        String str = this.color;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BackgroundDTO(image=" + this.image + ", color=" + this.color + ")";
    }
}
