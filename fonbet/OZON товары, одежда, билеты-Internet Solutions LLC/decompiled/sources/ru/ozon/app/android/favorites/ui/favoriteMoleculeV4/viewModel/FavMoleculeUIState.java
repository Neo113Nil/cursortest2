package ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.viewModel;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0013\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/viewModel/FavMoleculeUIState;", "", "molecule", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "<init>", "(Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;)V", "getMolecule", "()Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "Success", "Error", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/viewModel/FavMoleculeUIState$Error;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/viewModel/FavMoleculeUIState$Success;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class FavMoleculeUIState {
    private final FavoriteProductModel molecule;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/viewModel/FavMoleculeUIState$Error;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/viewModel/FavMoleculeUIState;", "molecule", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "<init>", "(Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;)V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends FavMoleculeUIState {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull FavoriteProductModel molecule) {
            super(molecule, null);
            Intrinsics.checkNotNullParameter(molecule, "molecule");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/viewModel/FavMoleculeUIState$Success;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/viewModel/FavMoleculeUIState;", "molecule", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "<init>", "(Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;)V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Success extends FavMoleculeUIState {
        public Success(FavoriteProductModel favoriteProductModel) {
            super(favoriteProductModel, null);
        }
    }

    public /* synthetic */ FavMoleculeUIState(FavoriteProductModel favoriteProductModel, DefaultConstructorMarker defaultConstructorMarker) {
        this(favoriteProductModel);
    }

    public final FavoriteProductModel getMolecule() {
        return this.molecule;
    }

    private FavMoleculeUIState(FavoriteProductModel favoriteProductModel) {
        this.molecule = favoriteProductModel;
    }
}
