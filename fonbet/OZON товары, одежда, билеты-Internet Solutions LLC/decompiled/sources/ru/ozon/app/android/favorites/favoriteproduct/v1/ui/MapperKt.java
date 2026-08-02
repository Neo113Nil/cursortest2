package ru.ozon.app.android.favorites.favoriteproduct.v1.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.favoriteproduct.v1.data.FavoriteProductDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toVO", "Lru/ozon/app/android/favorites/favoriteproduct/v1/ui/FavoriteProductVO;", "Lru/ozon/app/android/favorites/favoriteproduct/v1/data/FavoriteProductDTO;", "favorites_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapperKt {
    @NotNull
    public static final FavoriteProductVO toVO(@NotNull FavoriteProductDTO favoriteProductDTO) {
        Intrinsics.checkNotNullParameter(favoriteProductDTO, "<this>");
        return new FavoriteProductVO(favoriteProductDTO.getButton().hashCode(), favoriteProductDTO.getButton());
    }
}
