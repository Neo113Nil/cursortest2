package ru.ozon.app.android.favorites.ui.favoriteReserveButton;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoriteReserveButton.FavoriteReserveButtonMolecule;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoriteReserveButton/FavoriteReserveButtonUIState;", "", "ProcessAction", "Error", "Success", "Lru/ozon/app/android/favorites/ui/favoriteReserveButton/FavoriteReserveButtonUIState$Error;", "Lru/ozon/app/android/favorites/ui/favoriteReserveButton/FavoriteReserveButtonUIState$ProcessAction;", "Lru/ozon/app/android/favorites/ui/favoriteReserveButton/FavoriteReserveButtonUIState$Success;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface FavoriteReserveButtonUIState {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoriteReserveButton/FavoriteReserveButtonUIState$Error;", "Lru/ozon/app/android/favorites/ui/favoriteReserveButton/FavoriteReserveButtonUIState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error implements FavoriteReserveButtonUIState {

        @NotNull
        public static final Error INSTANCE = new Error();

        private Error() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return -658549729;
        }

        @NotNull
        public String toString() {
            return "Error";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoriteReserveButton/FavoriteReserveButtonUIState$ProcessAction;", "Lru/ozon/app/android/favorites/ui/favoriteReserveButton/FavoriteReserveButtonUIState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProcessAction implements FavoriteReserveButtonUIState {

        @NotNull
        public static final ProcessAction INSTANCE = new ProcessAction();

        private ProcessAction() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ProcessAction);
        }

        public int hashCode() {
            return 2057647260;
        }

        @NotNull
        public String toString() {
            return "ProcessAction";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoriteReserveButton/FavoriteReserveButtonUIState$Success;", "Lru/ozon/app/android/favorites/ui/favoriteReserveButton/FavoriteReserveButtonUIState;", "molecule", "Lru/ozon/app/android/favorites/data/favoriteReserveButton/FavoriteReserveButtonMolecule;", "<init>", "(Lru/ozon/app/android/favorites/data/favoriteReserveButton/FavoriteReserveButtonMolecule;)V", "getMolecule", "()Lru/ozon/app/android/favorites/data/favoriteReserveButton/FavoriteReserveButtonMolecule;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Success implements FavoriteReserveButtonUIState {

        @NotNull
        private final FavoriteReserveButtonMolecule molecule;

        public Success(@NotNull FavoriteReserveButtonMolecule molecule) {
            Intrinsics.checkNotNullParameter(molecule, "molecule");
            this.molecule = molecule;
        }

        @NotNull
        public final FavoriteReserveButtonMolecule getMolecule() {
            return this.molecule;
        }
    }
}
