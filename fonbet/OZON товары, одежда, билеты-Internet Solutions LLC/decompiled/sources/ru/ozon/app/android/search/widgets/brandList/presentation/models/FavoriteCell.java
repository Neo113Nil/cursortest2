package ru.ozon.app.android.search.widgets.brandList.presentation.models;

import Bi.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.data.SisBrandFavoriteButton;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/search/widgets/brandList/presentation/models/FavoriteCell;", "", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "favoriteButton", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "getFavoriteButton", "()Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FavoriteCell {

    @NotNull
    private final CellDTO cell;
    private final SisBrandFavoriteButton favoriteButton;

    @NotNull
    private final String id;

    public FavoriteCell(@NotNull String id2, @NotNull CellDTO cell, SisBrandFavoriteButton sisBrandFavoriteButton) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.id = id2;
        this.cell = cell;
        this.favoriteButton = sisBrandFavoriteButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteCell)) {
            return false;
        }
        FavoriteCell favoriteCell = (FavoriteCell) other;
        return Intrinsics.d(this.id, favoriteCell.id) && Intrinsics.d(this.cell, favoriteCell.cell) && Intrinsics.d(this.favoriteButton, favoriteCell.favoriteButton);
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final SisBrandFavoriteButton getFavoriteButton() {
        return this.favoriteButton;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int c11 = b.c(this.cell, this.id.hashCode() * 31, 31);
        SisBrandFavoriteButton sisBrandFavoriteButton = this.favoriteButton;
        return c11 + (sisBrandFavoriteButton == null ? 0 : sisBrandFavoriteButton.hashCode());
    }

    @NotNull
    public String toString() {
        return "FavoriteCell(id=" + this.id + ", cell=" + this.cell + ", favoriteButton=" + this.favoriteButton + ")";
    }
}
