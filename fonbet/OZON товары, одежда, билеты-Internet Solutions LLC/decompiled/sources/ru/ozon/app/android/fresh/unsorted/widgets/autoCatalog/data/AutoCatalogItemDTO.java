package ru.ozon.app.android.fresh.unsorted.widgets.autoCatalog.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.data.FreshTileGridDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/autoCatalog/data/AutoCatalogItemDTO;", "", "type", "", "tileGridMedium", "Lru/ozon/app/android/fresh/unsorted/widgets/freshTileGrid/data/FreshTileGridDTO;", "tileGridMini", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/fresh/unsorted/widgets/freshTileGrid/data/FreshTileGridDTO;Lru/ozon/app/android/fresh/unsorted/widgets/freshTileGrid/data/FreshTileGridDTO;)V", "getType", "()Ljava/lang/String;", "getTileGridMedium", "()Lru/ozon/app/android/fresh/unsorted/widgets/freshTileGrid/data/FreshTileGridDTO;", "getTileGridMini", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AutoCatalogItemDTO {
    public static final int $stable = 8;
    private final FreshTileGridDTO tileGridMedium;
    private final FreshTileGridDTO tileGridMini;

    @NotNull
    private final String type;

    public AutoCatalogItemDTO(@NotNull String type, FreshTileGridDTO freshTileGridDTO, FreshTileGridDTO freshTileGridDTO2) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.tileGridMedium = freshTileGridDTO;
        this.tileGridMini = freshTileGridDTO2;
    }

    public static /* synthetic */ AutoCatalogItemDTO copy$default(AutoCatalogItemDTO autoCatalogItemDTO, String str, FreshTileGridDTO freshTileGridDTO, FreshTileGridDTO freshTileGridDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = autoCatalogItemDTO.type;
        }
        if ((i11 & 2) != 0) {
            freshTileGridDTO = autoCatalogItemDTO.tileGridMedium;
        }
        if ((i11 & 4) != 0) {
            freshTileGridDTO2 = autoCatalogItemDTO.tileGridMini;
        }
        return autoCatalogItemDTO.copy(str, freshTileGridDTO, freshTileGridDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final FreshTileGridDTO getTileGridMedium() {
        return this.tileGridMedium;
    }

    /* renamed from: component3, reason: from getter */
    public final FreshTileGridDTO getTileGridMini() {
        return this.tileGridMini;
    }

    @NotNull
    public final AutoCatalogItemDTO copy(@NotNull String type, FreshTileGridDTO tileGridMedium, FreshTileGridDTO tileGridMini) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new AutoCatalogItemDTO(type, tileGridMedium, tileGridMini);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoCatalogItemDTO)) {
            return false;
        }
        AutoCatalogItemDTO autoCatalogItemDTO = (AutoCatalogItemDTO) other;
        return Intrinsics.d(this.type, autoCatalogItemDTO.type) && Intrinsics.d(this.tileGridMedium, autoCatalogItemDTO.tileGridMedium) && Intrinsics.d(this.tileGridMini, autoCatalogItemDTO.tileGridMini);
    }

    public final FreshTileGridDTO getTileGridMedium() {
        return this.tileGridMedium;
    }

    public final FreshTileGridDTO getTileGridMini() {
        return this.tileGridMini;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        FreshTileGridDTO freshTileGridDTO = this.tileGridMedium;
        int hashCode2 = (hashCode + (freshTileGridDTO == null ? 0 : freshTileGridDTO.hashCode())) * 31;
        FreshTileGridDTO freshTileGridDTO2 = this.tileGridMini;
        return hashCode2 + (freshTileGridDTO2 != null ? freshTileGridDTO2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AutoCatalogItemDTO(type=" + this.type + ", tileGridMedium=" + this.tileGridMedium + ", tileGridMini=" + this.tileGridMini + ")";
    }

    public /* synthetic */ AutoCatalogItemDTO(String str, FreshTileGridDTO freshTileGridDTO, FreshTileGridDTO freshTileGridDTO2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : freshTileGridDTO, (i11 & 4) != 0 ? null : freshTileGridDTO2);
    }
}
