package ru.ozon.app.android.storefront.widgets.naviBlocksV3.data;

import V.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV3/data/BlockIconV3DTO;", "", "image", "", "tintColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "getTintColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlockIconV3DTO {
    public static final int $stable = 0;

    @NotNull
    private final String image;

    @NotNull
    private final String tintColor;

    public BlockIconV3DTO(@NotNull String image, @NotNull String tintColor) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(tintColor, "tintColor");
        this.image = image;
        this.tintColor = tintColor;
    }

    public static /* synthetic */ BlockIconV3DTO copy$default(BlockIconV3DTO blockIconV3DTO, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = blockIconV3DTO.image;
        }
        if ((i11 & 2) != 0) {
            str2 = blockIconV3DTO.tintColor;
        }
        return blockIconV3DTO.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTintColor() {
        return this.tintColor;
    }

    @NotNull
    public final BlockIconV3DTO copy(@NotNull String image, @NotNull String tintColor) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(tintColor, "tintColor");
        return new BlockIconV3DTO(image, tintColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockIconV3DTO)) {
            return false;
        }
        BlockIconV3DTO blockIconV3DTO = (BlockIconV3DTO) other;
        return Intrinsics.d(this.image, blockIconV3DTO.image) && Intrinsics.d(this.tintColor, blockIconV3DTO.tintColor);
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getTintColor() {
        return this.tintColor;
    }

    public int hashCode() {
        return this.tintColor.hashCode() + (this.image.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return e.a("BlockIconV3DTO(image=", this.image, ", tintColor=", this.tintColor, ")");
    }
}
