package ru.ozon.app.android.favorites.data.favoriteReserveButton.model;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/favorites/data/favoriteReserveButton/model/FavoriteReserveWishlistItemResponse;", "", "reserveButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getReserveButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FavoriteReserveWishlistItemResponse {
    private final AtomActionDTO action;

    @NotNull
    private final ButtonV3DTO reserveButton;

    public FavoriteReserveWishlistItemResponse(@NotNull ButtonV3DTO reserveButton, AtomActionDTO atomActionDTO) {
        Intrinsics.checkNotNullParameter(reserveButton, "reserveButton");
        this.reserveButton = reserveButton;
        this.action = atomActionDTO;
    }

    public static /* synthetic */ FavoriteReserveWishlistItemResponse copy$default(FavoriteReserveWishlistItemResponse favoriteReserveWishlistItemResponse, ButtonV3DTO buttonV3DTO, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            buttonV3DTO = favoriteReserveWishlistItemResponse.reserveButton;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = favoriteReserveWishlistItemResponse.action;
        }
        return favoriteReserveWishlistItemResponse.copy(buttonV3DTO, atomActionDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3DTO getReserveButton() {
        return this.reserveButton;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final FavoriteReserveWishlistItemResponse copy(@NotNull ButtonV3DTO reserveButton, AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(reserveButton, "reserveButton");
        return new FavoriteReserveWishlistItemResponse(reserveButton, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteReserveWishlistItemResponse)) {
            return false;
        }
        FavoriteReserveWishlistItemResponse favoriteReserveWishlistItemResponse = (FavoriteReserveWishlistItemResponse) other;
        return Intrinsics.d(this.reserveButton, favoriteReserveWishlistItemResponse.reserveButton) && Intrinsics.d(this.action, favoriteReserveWishlistItemResponse.action);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final ButtonV3DTO getReserveButton() {
        return this.reserveButton;
    }

    public int hashCode() {
        int hashCode = this.reserveButton.hashCode() * 31;
        AtomActionDTO atomActionDTO = this.action;
        return hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "FavoriteReserveWishlistItemResponse(reserveButton=" + this.reserveButton + ", action=" + this.action + ")";
    }
}
