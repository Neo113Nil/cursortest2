package ru.ozon.app.android.favorites.domain.model;

import GR.b;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJP\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u0005\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b#\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "", "", "sku", "", "isFavorite", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "favoriteButton", "unfavoriteButton", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "addToListAction", "", "changeSourceId", "<init>", "(JZLru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;)V", "copy", "(JZLru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;)Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getSku", "()J", "Z", "()Z", "setFavorite", "(Z)V", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getFavoriteButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getUnfavoriteButton", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAddToListAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/lang/Integer;", "getChangeSourceId", "()Ljava/lang/Integer;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FavoriteProductModel {
    private final AtomActionDTO addToListAction;
    private final Integer changeSourceId;

    @NotNull
    private final IconButtonV3DTO favoriteButton;
    private boolean isFavorite;
    private final long sku;

    @NotNull
    private final IconButtonV3DTO unfavoriteButton;

    public FavoriteProductModel(long j11, boolean z11, @NotNull IconButtonV3DTO favoriteButton, @NotNull IconButtonV3DTO unfavoriteButton, AtomActionDTO atomActionDTO, Integer num) {
        Intrinsics.checkNotNullParameter(favoriteButton, "favoriteButton");
        Intrinsics.checkNotNullParameter(unfavoriteButton, "unfavoriteButton");
        this.sku = j11;
        this.isFavorite = z11;
        this.favoriteButton = favoriteButton;
        this.unfavoriteButton = unfavoriteButton;
        this.addToListAction = atomActionDTO;
        this.changeSourceId = num;
    }

    public static /* synthetic */ FavoriteProductModel copy$default(FavoriteProductModel favoriteProductModel, long j11, boolean z11, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, AtomActionDTO atomActionDTO, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = favoriteProductModel.sku;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            z11 = favoriteProductModel.isFavorite;
        }
        boolean z12 = z11;
        if ((i11 & 4) != 0) {
            iconButtonV3DTO = favoriteProductModel.favoriteButton;
        }
        IconButtonV3DTO iconButtonV3DTO3 = iconButtonV3DTO;
        if ((i11 & 8) != 0) {
            iconButtonV3DTO2 = favoriteProductModel.unfavoriteButton;
        }
        IconButtonV3DTO iconButtonV3DTO4 = iconButtonV3DTO2;
        if ((i11 & 16) != 0) {
            atomActionDTO = favoriteProductModel.addToListAction;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        if ((i11 & 32) != 0) {
            num = favoriteProductModel.changeSourceId;
        }
        return favoriteProductModel.copy(j12, z12, iconButtonV3DTO3, iconButtonV3DTO4, atomActionDTO2, num);
    }

    @NotNull
    public final FavoriteProductModel copy(long sku, boolean isFavorite, @NotNull IconButtonV3DTO favoriteButton, @NotNull IconButtonV3DTO unfavoriteButton, AtomActionDTO addToListAction, Integer changeSourceId) {
        Intrinsics.checkNotNullParameter(favoriteButton, "favoriteButton");
        Intrinsics.checkNotNullParameter(unfavoriteButton, "unfavoriteButton");
        return new FavoriteProductModel(sku, isFavorite, favoriteButton, unfavoriteButton, addToListAction, changeSourceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteProductModel)) {
            return false;
        }
        FavoriteProductModel favoriteProductModel = (FavoriteProductModel) other;
        return this.sku == favoriteProductModel.sku && this.isFavorite == favoriteProductModel.isFavorite && Intrinsics.d(this.favoriteButton, favoriteProductModel.favoriteButton) && Intrinsics.d(this.unfavoriteButton, favoriteProductModel.unfavoriteButton) && Intrinsics.d(this.addToListAction, favoriteProductModel.addToListAction) && Intrinsics.d(this.changeSourceId, favoriteProductModel.changeSourceId);
    }

    public final AtomActionDTO getAddToListAction() {
        return this.addToListAction;
    }

    public final Integer getChangeSourceId() {
        return this.changeSourceId;
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
        int hashCode = (c11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Integer num = this.changeSourceId;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    /* renamed from: isFavorite, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    public final void setFavorite(boolean z11) {
        this.isFavorite = z11;
    }

    @NotNull
    public String toString() {
        long j11 = this.sku;
        boolean z11 = this.isFavorite;
        IconButtonV3DTO iconButtonV3DTO = this.favoriteButton;
        IconButtonV3DTO iconButtonV3DTO2 = this.unfavoriteButton;
        AtomActionDTO atomActionDTO = this.addToListAction;
        Integer num = this.changeSourceId;
        StringBuilder c11 = Bl.b.c(j11, "FavoriteProductModel(sku=", ", isFavorite=", z11);
        c11.append(", favoriteButton=");
        c11.append(iconButtonV3DTO);
        c11.append(", unfavoriteButton=");
        c11.append(iconButtonV3DTO2);
        c11.append(", addToListAction=");
        c11.append(atomActionDTO);
        c11.append(", changeSourceId=");
        c11.append(num);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ FavoriteProductModel(long j11, boolean z11, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, AtomActionDTO atomActionDTO, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, z11, iconButtonV3DTO, iconButtonV3DTO2, atomActionDTO, (i11 & 32) != 0 ? null : num);
    }
}
