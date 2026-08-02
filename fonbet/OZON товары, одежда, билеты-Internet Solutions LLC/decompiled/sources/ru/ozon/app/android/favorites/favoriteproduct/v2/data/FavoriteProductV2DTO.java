package ru.ozon.app.android.favorites.favoriteproduct.v2.data;

import Kk.c;
import T7.Z;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV4;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/favorites/favoriteproduct/v2/data/FavoriteProductV2DTO;", "", "button", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV4;", "margins", "Lru/ozon/app/android/favorites/favoriteproduct/v2/data/FavoriteProductV2DTO$Margins;", "<init>", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV4;Lru/ozon/app/android/favorites/favoriteproduct/v2/data/FavoriteProductV2DTO$Margins;)V", "getButton", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV4;", "getMargins", "()Lru/ozon/app/android/favorites/favoriteproduct/v2/data/FavoriteProductV2DTO$Margins;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Margins", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FavoriteProductV2DTO {

    @NotNull
    private final FavoriteProductMoleculeV4 button;
    private final Margins margins;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/favorites/favoriteproduct/v2/data/FavoriteProductV2DTO$Margins;", "", "top", "", "left", "right", "bottom", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getTop", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLeft", "getRight", "getBottom", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/favorites/favoriteproduct/v2/data/FavoriteProductV2DTO$Margins;", "equals", "", "other", "hashCode", "toString", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Margins {
        private final Integer bottom;
        private final Integer left;
        private final Integer right;
        private final Integer top;

        public Margins(Integer num, Integer num2, Integer num3, Integer num4) {
            this.top = num;
            this.left = num2;
            this.right = num3;
            this.bottom = num4;
        }

        public static /* synthetic */ Margins copy$default(Margins margins, Integer num, Integer num2, Integer num3, Integer num4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = margins.top;
            }
            if ((i11 & 2) != 0) {
                num2 = margins.left;
            }
            if ((i11 & 4) != 0) {
                num3 = margins.right;
            }
            if ((i11 & 8) != 0) {
                num4 = margins.bottom;
            }
            return margins.copy(num, num2, num3, num4);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getTop() {
            return this.top;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getLeft() {
            return this.left;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getRight() {
            return this.right;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getBottom() {
            return this.bottom;
        }

        @NotNull
        public final Margins copy(Integer top, Integer left, Integer right, Integer bottom) {
            return new Margins(top, left, right, bottom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Margins)) {
                return false;
            }
            Margins margins = (Margins) other;
            return Intrinsics.d(this.top, margins.top) && Intrinsics.d(this.left, margins.left) && Intrinsics.d(this.right, margins.right) && Intrinsics.d(this.bottom, margins.bottom);
        }

        public final Integer getBottom() {
            return this.bottom;
        }

        public final Integer getLeft() {
            return this.left;
        }

        public final Integer getRight() {
            return this.right;
        }

        public final Integer getTop() {
            return this.top;
        }

        public int hashCode() {
            Integer num = this.top;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.left;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.right;
            int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.bottom;
            return hashCode3 + (num4 != null ? num4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Integer num = this.top;
            Integer num2 = this.left;
            return Z.c(c.f("Margins(top=", ", left=", num, num2, ", right="), this.right, ", bottom=", this.bottom, ")");
        }
    }

    public FavoriteProductV2DTO(@NotNull FavoriteProductMoleculeV4 button, Margins margins) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.button = button;
        this.margins = margins;
    }

    public static /* synthetic */ FavoriteProductV2DTO copy$default(FavoriteProductV2DTO favoriteProductV2DTO, FavoriteProductMoleculeV4 favoriteProductMoleculeV4, Margins margins, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            favoriteProductMoleculeV4 = favoriteProductV2DTO.button;
        }
        if ((i11 & 2) != 0) {
            margins = favoriteProductV2DTO.margins;
        }
        return favoriteProductV2DTO.copy(favoriteProductMoleculeV4, margins);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final FavoriteProductMoleculeV4 getButton() {
        return this.button;
    }

    /* renamed from: component2, reason: from getter */
    public final Margins getMargins() {
        return this.margins;
    }

    @NotNull
    public final FavoriteProductV2DTO copy(@NotNull FavoriteProductMoleculeV4 button, Margins margins) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new FavoriteProductV2DTO(button, margins);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteProductV2DTO)) {
            return false;
        }
        FavoriteProductV2DTO favoriteProductV2DTO = (FavoriteProductV2DTO) other;
        return Intrinsics.d(this.button, favoriteProductV2DTO.button) && Intrinsics.d(this.margins, favoriteProductV2DTO.margins);
    }

    @NotNull
    public final FavoriteProductMoleculeV4 getButton() {
        return this.button;
    }

    public final Margins getMargins() {
        return this.margins;
    }

    public int hashCode() {
        int hashCode = this.button.hashCode() * 31;
        Margins margins = this.margins;
        return hashCode + (margins == null ? 0 : margins.hashCode());
    }

    @NotNull
    public String toString() {
        return "FavoriteProductV2DTO(button=" + this.button + ", margins=" + this.margins + ")";
    }
}
