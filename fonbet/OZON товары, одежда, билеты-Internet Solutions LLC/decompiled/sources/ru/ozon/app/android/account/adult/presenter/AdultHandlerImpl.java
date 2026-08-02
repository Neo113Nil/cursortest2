package ru.ozon.app.android.account.adult.presenter;

import Sc.InterfaceC4008j;
import Sc.k;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import io.reactivex.p;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.ui.AdultDialog;
import ru.ozon.app.android.account.adult.ui.AdultListener;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.storage.adult.AdultState;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0017J/\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u00198VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u001b¨\u0006#"}, d2 = {"Lru/ozon/app/android/account/adult/presenter/AdultHandlerImpl;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/storage/adult/AdultState;", "adultState", "<init>", "(Lru/ozon/app/android/storage/adult/AdultState;)V", "Landroidx/fragment/app/G;", "fm", "Lru/ozon/app/android/account/adult/ui/AdultDialog;", "findAdultDialog", "(Landroidx/fragment/app/G;)Lru/ozon/app/android/account/adult/ui/AdultDialog;", "Lru/ozon/app/android/account/adult/ui/AdultListener;", "adultListener", "Lru/ozon/app/android/account/adult/ui/AdultDialog$Customisation;", "customisation", "", "showDialog", "(Landroidx/fragment/app/G;Lru/ozon/app/android/account/adult/ui/AdultListener;Lru/ozon/app/android/account/adult/ui/AdultDialog$Customisation;)V", "", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "oldFlow", "showAdultDialog", "(ZLandroidx/fragment/app/G;Lru/ozon/app/android/account/adult/ui/AdultListener;Lru/ozon/app/android/account/adult/ui/AdultDialog$Customisation;Z)V", "(Landroidx/fragment/app/G;Lru/ozon/app/android/account/adult/ui/AdultListener;Lru/ozon/app/android/account/adult/ui/AdultDialog$Customisation;Z)V", "forceShowAdultDialog", "Lio/reactivex/p;", "observeUserAdultState", "()Lio/reactivex/p;", "isUserAnAdult", "()Z", "Lru/ozon/app/android/storage/adult/AdultState;", "isUserAdultChangedObservable$delegate", "LSc/j;", "isUserAdultChangedObservable", "Companion", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdultHandlerImpl implements AdultHandler {

    @NotNull
    private final AdultState adultState;

    /* renamed from: isUserAdultChangedObservable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isUserAdultChangedObservable;

    public AdultHandlerImpl(@NotNull AdultState adultState) {
        Intrinsics.checkNotNullParameter(adultState, "adultState");
        this.adultState = adultState;
        this.isUserAdultChangedObservable = k.b(new AdultHandlerImpl$isUserAdultChangedObservable$2(this));
    }

    private final AdultDialog findAdultDialog(G fm) {
        Object obj;
        List<ComponentCallbacksC5392m> r02 = fm.r0();
        Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
        Iterator<T> it = r02.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((ComponentCallbacksC5392m) obj).getTag(), "adult")) {
                break;
            }
        }
        if (obj instanceof AdultDialog) {
            return (AdultDialog) obj;
        }
        return null;
    }

    private final void showDialog(G fm, AdultListener adultListener, AdultDialog.Customisation customisation) {
        AdultDialog findAdultDialog = findAdultDialog(fm);
        if (findAdultDialog != null) {
            findAdultDialog.setCustomisation(customisation);
            findAdultDialog.setListener(showDialog$createListener(adultListener));
        } else {
            AdultDialog companion = AdultDialog.INSTANCE.getInstance();
            companion.setListener(showDialog$createListener(adultListener));
            companion.setCustomisation(customisation);
            companion.show(fm, "adult");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.account.adult.presenter.AdultHandlerImpl$showDialog$createListener$1] */
    private static final AdultHandlerImpl$showDialog$createListener$1 showDialog$createListener(final AdultListener adultListener) {
        return new AdultListener() { // from class: ru.ozon.app.android.account.adult.presenter.AdultHandlerImpl$showDialog$createListener$1
            @Override // ru.ozon.app.android.account.adult.ui.AdultListener
            public void onAdultAccept() {
                AdultListener.this.onAdultAccept();
            }

            @Override // ru.ozon.app.android.account.adult.ui.AdultListener
            public void onAdultReject() {
                AdultListener.this.onAdultReject();
            }
        };
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultHandler
    public void forceShowAdultDialog(@NotNull G fm, @NotNull AdultListener adultListener, @NotNull AdultDialog.Customisation customisation, boolean oldFlow) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(adultListener, "adultListener");
        Intrinsics.checkNotNullParameter(customisation, "customisation");
        if (oldFlow) {
            showDialog(fm, adultListener, customisation);
        } else {
            adultListener.onAdultAccept();
        }
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultHandler
    @NotNull
    public p<Boolean> isUserAdultChangedObservable() {
        Object value = this.isUserAdultChangedObservable.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (p) value;
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultHandler
    public boolean isUserAnAdult() {
        return this.adultState.isUserAnAdult();
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultHandler
    @NotNull
    public p<Boolean> observeUserAdultState() {
        return this.adultState.observeUserAdultState();
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultHandler
    public void showAdultDialog(boolean isAdult, @NotNull G fm, @NotNull AdultListener adultListener, @NotNull AdultDialog.Customisation customisation, boolean oldFlow) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(adultListener, "adultListener");
        Intrinsics.checkNotNullParameter(customisation, "customisation");
        if (!oldFlow) {
            adultListener.onAdultAccept();
        } else if (!isAdult || this.adultState.isUserAnAdult()) {
            adultListener.onAdultAccept();
        } else {
            showDialog(fm, adultListener, customisation);
        }
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultHandler
    public void showAdultDialog(@NotNull G fm, @NotNull AdultListener adultListener, @NotNull AdultDialog.Customisation customisation, boolean oldFlow) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(adultListener, "adultListener");
        Intrinsics.checkNotNullParameter(customisation, "customisation");
        if (!oldFlow) {
            adultListener.onAdultAccept();
        } else if (!this.adultState.isUserAnAdult()) {
            showDialog(fm, adultListener, customisation);
        } else {
            adultListener.onAdultAccept();
        }
    }
}
