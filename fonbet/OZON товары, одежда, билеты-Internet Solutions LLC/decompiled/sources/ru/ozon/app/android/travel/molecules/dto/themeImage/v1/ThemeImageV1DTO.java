package ru.ozon.app.android.travel.molecules.dto.themeImage.v1;

import V.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;", "", "lightImageUrl", "", "darkImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLightImageUrl", "()Ljava/lang/String;", "getDarkImageUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ThemeImageV1DTO {

    @NotNull
    private final String darkImageUrl;

    @NotNull
    private final String lightImageUrl;

    public ThemeImageV1DTO(@NotNull String lightImageUrl, @NotNull String darkImageUrl) {
        Intrinsics.checkNotNullParameter(lightImageUrl, "lightImageUrl");
        Intrinsics.checkNotNullParameter(darkImageUrl, "darkImageUrl");
        this.lightImageUrl = lightImageUrl;
        this.darkImageUrl = darkImageUrl;
    }

    public static /* synthetic */ ThemeImageV1DTO copy$default(ThemeImageV1DTO themeImageV1DTO, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = themeImageV1DTO.lightImageUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = themeImageV1DTO.darkImageUrl;
        }
        return themeImageV1DTO.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLightImageUrl() {
        return this.lightImageUrl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDarkImageUrl() {
        return this.darkImageUrl;
    }

    @NotNull
    public final ThemeImageV1DTO copy(@NotNull String lightImageUrl, @NotNull String darkImageUrl) {
        Intrinsics.checkNotNullParameter(lightImageUrl, "lightImageUrl");
        Intrinsics.checkNotNullParameter(darkImageUrl, "darkImageUrl");
        return new ThemeImageV1DTO(lightImageUrl, darkImageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThemeImageV1DTO)) {
            return false;
        }
        ThemeImageV1DTO themeImageV1DTO = (ThemeImageV1DTO) other;
        return Intrinsics.d(this.lightImageUrl, themeImageV1DTO.lightImageUrl) && Intrinsics.d(this.darkImageUrl, themeImageV1DTO.darkImageUrl);
    }

    @NotNull
    public final String getDarkImageUrl() {
        return this.darkImageUrl;
    }

    @NotNull
    public final String getLightImageUrl() {
        return this.lightImageUrl;
    }

    public int hashCode() {
        return this.darkImageUrl.hashCode() + (this.lightImageUrl.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return e.a("ThemeImageV1DTO(lightImageUrl=", this.lightImageUrl, ", darkImageUrl=", this.darkImageUrl, ")");
    }
}
