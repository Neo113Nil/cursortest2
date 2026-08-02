package ru.ozon.app.android.account.adult.presenter;

import androidx.fragment.app.G;
import io.reactivex.p;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.ui.AdultDialog;
import ru.ozon.app.android.account.adult.ui.AdultListener;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J;\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rJ3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u000eJ3\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "", "", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "Landroidx/fragment/app/G;", "fm", "Lru/ozon/app/android/account/adult/ui/AdultListener;", "adultListener", "Lru/ozon/app/android/account/adult/ui/AdultDialog$Customisation;", "customisation", "oldFlow", "", "showAdultDialog", "(ZLandroidx/fragment/app/G;Lru/ozon/app/android/account/adult/ui/AdultListener;Lru/ozon/app/android/account/adult/ui/AdultDialog$Customisation;Z)V", "(Landroidx/fragment/app/G;Lru/ozon/app/android/account/adult/ui/AdultListener;Lru/ozon/app/android/account/adult/ui/AdultDialog$Customisation;Z)V", "forceShowAdultDialog", "Lio/reactivex/p;", "observeUserAdultState", "()Lio/reactivex/p;", "isUserAnAdult", "()Z", "isUserAdultChangedObservable", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AdultHandler {
    void forceShowAdultDialog(@NotNull G fm, @NotNull AdultListener adultListener, @NotNull AdultDialog.Customisation customisation, boolean oldFlow);

    @NotNull
    p<Boolean> isUserAdultChangedObservable();

    boolean isUserAnAdult();

    @NotNull
    p<Boolean> observeUserAdultState();

    void showAdultDialog(@NotNull G fm, @NotNull AdultListener adultListener, @NotNull AdultDialog.Customisation customisation, boolean oldFlow);

    void showAdultDialog(boolean isAdult, @NotNull G fm, @NotNull AdultListener adultListener, @NotNull AdultDialog.Customisation customisation, boolean oldFlow);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void showAdultDialog$default(AdultHandler adultHandler, boolean z11, G g10, AdultListener adultListener, AdultDialog.Customisation customisation, boolean z12, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAdultDialog");
            }
            if ((i11 & 8) != 0) {
                customisation = new AdultDialog.Customisation(null, null, null, null, 15, null);
            }
            if ((i11 & 16) != 0) {
                z12 = false;
            }
            adultHandler.showAdultDialog(z11, g10, adultListener, customisation, z12);
        }

        public static /* synthetic */ void showAdultDialog$default(AdultHandler adultHandler, G g10, AdultListener adultListener, AdultDialog.Customisation customisation, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAdultDialog");
            }
            if ((i11 & 4) != 0) {
                customisation = new AdultDialog.Customisation(null, null, null, null, 15, null);
            }
            if ((i11 & 8) != 0) {
                z11 = false;
            }
            adultHandler.showAdultDialog(g10, adultListener, customisation, z11);
        }
    }
}
