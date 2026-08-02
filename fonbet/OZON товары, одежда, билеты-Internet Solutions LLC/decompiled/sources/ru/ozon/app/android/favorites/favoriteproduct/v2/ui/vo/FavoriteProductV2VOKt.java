package ru.ozon.app.android.favorites.favoriteproduct.v2.ui.vo;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModelKt;
import ru.ozon.app.android.favorites.favoriteproduct.v2.data.FavoriteProductV2DTO;
import ru.ozon.app.android.favorites.favoriteproduct.v2.ui.vo.FavoriteProductV2VO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVO", "Lru/ozon/app/android/favorites/favoriteproduct/v2/ui/vo/FavoriteProductV2VO;", "Lru/ozon/app/android/favorites/favoriteproduct/v2/data/FavoriteProductV2DTO;", "id", "", "favorites_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoriteProductV2VOKt {
    @NotNull
    public static final FavoriteProductV2VO toVO(@NotNull FavoriteProductV2DTO favoriteProductV2DTO, long j11) {
        Integer bottom;
        Integer right;
        Integer left;
        Integer top;
        Intrinsics.checkNotNullParameter(favoriteProductV2DTO, "<this>");
        FavoriteProductModel model = FavoriteProductModelKt.toModel(favoriteProductV2DTO.getButton());
        FavoriteProductV2DTO.Margins margins = favoriteProductV2DTO.getMargins();
        int i11 = 0;
        int px = (margins == null || (top = margins.getTop()) == null) ? 0 : ResourceExtKt.toPx(top.intValue());
        FavoriteProductV2DTO.Margins margins2 = favoriteProductV2DTO.getMargins();
        int px2 = (margins2 == null || (left = margins2.getLeft()) == null) ? 0 : ResourceExtKt.toPx(left.intValue());
        FavoriteProductV2DTO.Margins margins3 = favoriteProductV2DTO.getMargins();
        int px3 = (margins3 == null || (right = margins3.getRight()) == null) ? 0 : ResourceExtKt.toPx(right.intValue());
        FavoriteProductV2DTO.Margins margins4 = favoriteProductV2DTO.getMargins();
        if (margins4 != null && (bottom = margins4.getBottom()) != null) {
            i11 = ResourceExtKt.toPx(bottom.intValue());
        }
        return new FavoriteProductV2VO(j11, model, new FavoriteProductV2VO.Margins(px, px2, px3, i11));
    }
}
