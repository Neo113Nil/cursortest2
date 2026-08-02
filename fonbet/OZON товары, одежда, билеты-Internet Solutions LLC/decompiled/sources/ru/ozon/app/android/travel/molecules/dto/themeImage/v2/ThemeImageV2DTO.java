package ru.ozon.app.android.travel.molecules.dto.themeImage.v2;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/themeImage/v2/ThemeImageV2DTO;", "", "light", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "dark", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;)V", "getLight", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getDark", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ThemeImageV2DTO {

    @NotNull
    private final ImageDTO dark;

    @NotNull
    private final ImageDTO light;

    public ThemeImageV2DTO(@NotNull ImageDTO light, @NotNull ImageDTO dark) {
        Intrinsics.checkNotNullParameter(light, "light");
        Intrinsics.checkNotNullParameter(dark, "dark");
        this.light = light;
        this.dark = dark;
    }

    public static /* synthetic */ ThemeImageV2DTO copy$default(ThemeImageV2DTO themeImageV2DTO, ImageDTO imageDTO, ImageDTO imageDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = themeImageV2DTO.light;
        }
        if ((i11 & 2) != 0) {
            imageDTO2 = themeImageV2DTO.dark;
        }
        return themeImageV2DTO.copy(imageDTO, imageDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ImageDTO getLight() {
        return this.light;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ImageDTO getDark() {
        return this.dark;
    }

    @NotNull
    public final ThemeImageV2DTO copy(@NotNull ImageDTO light, @NotNull ImageDTO dark) {
        Intrinsics.checkNotNullParameter(light, "light");
        Intrinsics.checkNotNullParameter(dark, "dark");
        return new ThemeImageV2DTO(light, dark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThemeImageV2DTO)) {
            return false;
        }
        ThemeImageV2DTO themeImageV2DTO = (ThemeImageV2DTO) other;
        return Intrinsics.d(this.light, themeImageV2DTO.light) && Intrinsics.d(this.dark, themeImageV2DTO.dark);
    }

    @NotNull
    public final ImageDTO getDark() {
        return this.dark;
    }

    @NotNull
    public final ImageDTO getLight() {
        return this.light;
    }

    public int hashCode() {
        return this.dark.hashCode() + (this.light.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ThemeImageV2DTO(light=" + this.light + ", dark=" + this.dark + ")";
    }
}
