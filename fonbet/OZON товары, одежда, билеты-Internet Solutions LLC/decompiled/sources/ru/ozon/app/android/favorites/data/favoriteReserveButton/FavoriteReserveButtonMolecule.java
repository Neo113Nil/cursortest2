package ru.ozon.app.android.favorites.data.favoriteReserveButton;

import F3.G;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\r\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\f\u001a\u0004\u0018\u00010\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/favorites/data/favoriteReserveButton/FavoriteReserveButtonMolecule;", "", "reserveButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getReserveButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "extractSku", "", "()Ljava/lang/Long;", "extractWishlistId", "extractUniqId", "", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FavoriteReserveButtonMolecule {

    @NotNull
    private final ButtonV3DTO reserveButton;

    public FavoriteReserveButtonMolecule(@NotNull ButtonV3DTO reserveButton) {
        Intrinsics.checkNotNullParameter(reserveButton, "reserveButton");
        this.reserveButton = reserveButton;
    }

    public static /* synthetic */ FavoriteReserveButtonMolecule copy$default(FavoriteReserveButtonMolecule favoriteReserveButtonMolecule, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            buttonV3DTO = favoriteReserveButtonMolecule.reserveButton;
        }
        return favoriteReserveButtonMolecule.copy(buttonV3DTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3DTO getReserveButton() {
        return this.reserveButton;
    }

    @NotNull
    public final FavoriteReserveButtonMolecule copy(@NotNull ButtonV3DTO reserveButton) {
        Intrinsics.checkNotNullParameter(reserveButton, "reserveButton");
        return new FavoriteReserveButtonMolecule(reserveButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FavoriteReserveButtonMolecule) && Intrinsics.d(this.reserveButton, ((FavoriteReserveButtonMolecule) other).reserveButton);
    }

    public final Long extractSku() {
        AtomActionDTO action;
        Map<String, String> params;
        String str;
        CommonControlSettings common = this.reserveButton.getCommon();
        if (common == null || (action = common.getAction()) == null || (params = action.getParams()) == null || (str = params.get("sku")) == null) {
            return null;
        }
        return h.y0(str);
    }

    public final String extractUniqId() {
        AtomActionDTO action;
        Map<String, String> params;
        CommonControlSettings common = this.reserveButton.getCommon();
        if (common == null || (action = common.getAction()) == null || (params = action.getParams()) == null) {
            return null;
        }
        return params.get("uniqId");
    }

    public final Long extractWishlistId() {
        AtomActionDTO action;
        Map<String, String> params;
        String str;
        CommonControlSettings common = this.reserveButton.getCommon();
        if (common == null || (action = common.getAction()) == null || (params = action.getParams()) == null || (str = params.get("id")) == null) {
            return null;
        }
        return h.y0(str);
    }

    @NotNull
    public final ButtonV3DTO getReserveButton() {
        return this.reserveButton;
    }

    public int hashCode() {
        return this.reserveButton.hashCode();
    }

    @NotNull
    public String toString() {
        return G.b(this.reserveButton, "FavoriteReserveButtonMolecule(reserveButton=", ")");
    }
}
