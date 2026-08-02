package ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.FavoriteActionSelectionResponse;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.FavoriteChangeResponse;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteChangeResponse;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteActionSelectionResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteChangeResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FavoriteProductMoleculeInteractor$processFavoriteDefaultChange$2 extends AbstractC7737t implements Function1<ActionV2Response<FavoriteActionSelectionResponse>, FavoriteChangeResponse> {
    final /* synthetic */ FavoriteProductMolecule $molecule;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteProductMoleculeInteractor$processFavoriteDefaultChange$2(FavoriteProductMolecule favoriteProductMolecule) {
        super(1);
        this.$molecule = favoriteProductMolecule;
    }

    @Override // kotlin.jvm.functions.Function1
    public final FavoriteChangeResponse invoke(ActionV2Response<FavoriteActionSelectionResponse> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String error = it.getError();
        if (error != null) {
            throw new IllegalStateException(error);
        }
        FavoriteProductMolecule copy$default = FavoriteProductMolecule.copy$default(this.$molecule, null, 0L, !r1.isFavorite(), null, null, null, null, 123, null);
        FavoriteActionSelectionResponse data = it.getData();
        return new FavoriteChangeResponse(copy$default, data != null ? data.getNotificationBar() : null, it.getTrackingPayloads());
    }
}
