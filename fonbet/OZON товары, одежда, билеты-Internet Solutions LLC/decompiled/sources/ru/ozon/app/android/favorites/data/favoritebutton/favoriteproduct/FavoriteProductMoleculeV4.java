package ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct;

import GR.b;
import Kk.C3532b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV4;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteMoleculeModel;", "sku", "", "isFavorite", "", "favoriteButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "unfavoriteButton", "addToListAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(JZLru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getSku", "()J", "()Z", "getFavoriteButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getUnfavoriteButton", "getAddToListAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FavoriteProductMoleculeV4 implements FavoriteMoleculeModel {
    private final AtomActionDTO addToListAction;

    @NotNull
    private final IconButtonV3DTO favoriteButton;
    private final boolean isFavorite;
    private final long sku;

    @NotNull
    private final IconButtonV3DTO unfavoriteButton;

    public FavoriteProductMoleculeV4(long j11, boolean z11, @NotNull IconButtonV3DTO favoriteButton, @NotNull IconButtonV3DTO unfavoriteButton, AtomActionDTO atomActionDTO) {
        Intrinsics.checkNotNullParameter(favoriteButton, "favoriteButton");
        Intrinsics.checkNotNullParameter(unfavoriteButton, "unfavoriteButton");
        this.sku = j11;
        this.isFavorite = z11;
        this.favoriteButton = favoriteButton;
        this.unfavoriteButton = unfavoriteButton;
        this.addToListAction = atomActionDTO;
    }

    public static /* synthetic */ FavoriteProductMoleculeV4 copy$default(FavoriteProductMoleculeV4 favoriteProductMoleculeV4, long j11, boolean z11, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = favoriteProductMoleculeV4.sku;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            z11 = favoriteProductMoleculeV4.isFavorite;
        }
        boolean z12 = z11;
        if ((i11 & 4) != 0) {
            iconButtonV3DTO = favoriteProductMoleculeV4.favoriteButton;
        }
        IconButtonV3DTO iconButtonV3DTO3 = iconButtonV3DTO;
        if ((i11 & 8) != 0) {
            iconButtonV3DTO2 = favoriteProductMoleculeV4.unfavoriteButton;
        }
        IconButtonV3DTO iconButtonV3DTO4 = iconButtonV3DTO2;
        if ((i11 & 16) != 0) {
            atomActionDTO = favoriteProductMoleculeV4.addToListAction;
        }
        return favoriteProductMoleculeV4.copy(j12, z12, iconButtonV3DTO3, iconButtonV3DTO4, atomActionDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final long getSku() {
        return this.sku;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final IconButtonV3DTO getFavoriteButton() {
        return this.favoriteButton;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final IconButtonV3DTO getUnfavoriteButton() {
        return this.unfavoriteButton;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAddToListAction() {
        return this.addToListAction;
    }

    @NotNull
    public final FavoriteProductMoleculeV4 copy(long sku, boolean isFavorite, @NotNull IconButtonV3DTO favoriteButton, @NotNull IconButtonV3DTO unfavoriteButton, AtomActionDTO addToListAction) {
        Intrinsics.checkNotNullParameter(favoriteButton, "favoriteButton");
        Intrinsics.checkNotNullParameter(unfavoriteButton, "unfavoriteButton");
        return new FavoriteProductMoleculeV4(sku, isFavorite, favoriteButton, unfavoriteButton, addToListAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteProductMoleculeV4)) {
            return false;
        }
        FavoriteProductMoleculeV4 favoriteProductMoleculeV4 = (FavoriteProductMoleculeV4) other;
        return this.sku == favoriteProductMoleculeV4.sku && this.isFavorite == favoriteProductMoleculeV4.isFavorite && Intrinsics.d(this.favoriteButton, favoriteProductMoleculeV4.favoriteButton) && Intrinsics.d(this.unfavoriteButton, favoriteProductMoleculeV4.unfavoriteButton) && Intrinsics.d(this.addToListAction, favoriteProductMoleculeV4.addToListAction);
    }

    public final AtomActionDTO getAddToListAction() {
        return this.addToListAction;
    }

    @NotNull
    public final IconButtonV3DTO getFavoriteButton() {
        return this.favoriteButton;
    }

    public final long getSku() {
        return this.sku;
    }

    @NotNull
    public final IconButtonV3DTO getUnfavoriteButton() {
        return this.unfavoriteButton;
    }

    public int hashCode() {
        int c11 = b.c(this.unfavoriteButton, b.c(this.favoriteButton, C3532b.a(Long.hashCode(this.sku) * 31, 31, this.isFavorite), 31), 31);
        AtomActionDTO atomActionDTO = this.addToListAction;
        return c11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode());
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    @NotNull
    public String toString() {
        long j11 = this.sku;
        boolean z11 = this.isFavorite;
        IconButtonV3DTO iconButtonV3DTO = this.favoriteButton;
        IconButtonV3DTO iconButtonV3DTO2 = this.unfavoriteButton;
        AtomActionDTO atomActionDTO = this.addToListAction;
        StringBuilder c11 = Bl.b.c(j11, "FavoriteProductMoleculeV4(sku=", ", isFavorite=", z11);
        c11.append(", favoriteButton=");
        c11.append(iconButtonV3DTO);
        c11.append(", unfavoriteButton=");
        c11.append(iconButtonV3DTO2);
        c11.append(", addToListAction=");
        c11.append(atomActionDTO);
        c11.append(")");
        return c11.toString();
    }
}
