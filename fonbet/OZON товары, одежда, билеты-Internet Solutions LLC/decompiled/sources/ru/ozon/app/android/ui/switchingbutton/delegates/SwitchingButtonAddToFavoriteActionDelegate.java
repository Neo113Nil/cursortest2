package ru.ozon.app.android.ui.switchingbutton.delegates;

import Fn.C3056e;
import HC.a;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import nc.C8488c;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.ui.AdultListener;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.utils.AnalyticRefs;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesCustomActionHandlerInteractor;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.domain.utils.ActionHandlersUtilsKt;
import ru.ozon.app.android.ui.switchingbutton.SwitchingButtonAction;
import ru.ozon.app.android.utils.CustomComposerActionLifecycleDisposable;
import ru.ozon.uni.atoms.af.AtomAction;
import sc.C9653a;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/ui/switchingbutton/delegates/SwitchingButtonAddToFavoriteActionDelegate;", "Lru/ozon/app/android/ui/switchingbutton/delegates/SwitchingButtonActionDelegate;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesCustomActionHandlerInteractor;", "interactor", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesCustomActionHandlerInteractor;Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "Lru/ozon/app/android/ui/switchingbutton/SwitchingButtonAction;", "switchingButtonAction", "", "executeActionIfNeedIt", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Lru/ozon/app/android/ui/switchingbutton/SwitchingButtonAction;)V", "executeAction", "", "canHandle", "(Lru/ozon/app/android/ui/switchingbutton/SwitchingButtonAction;)Z", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesCustomActionHandlerInteractor;", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "", "", "actionIds", "Ljava/util/List;", "getActionIds", "()Ljava/util/List;", "Lnc/b;", "disposable", "Lnc/b;", "switchingbutton_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SwitchingButtonAddToFavoriteActionDelegate extends SwitchingButtonActionDelegate {

    @NotNull
    private final List<String> actionIds;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private InterfaceC8487b disposable;

    @NotNull
    private final FavoriteManager favoriteManager;

    @NotNull
    private final FavoritesCustomActionHandlerInteractor interactor;

    public SwitchingButtonAddToFavoriteActionDelegate(@NotNull AdultHandler adultHandler, @NotNull FavoritesCustomActionHandlerInteractor interactor, @NotNull FavoriteManager favoriteManager) {
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        this.adultHandler = adultHandler;
        this.interactor = interactor;
        this.favoriteManager = favoriteManager;
        this.actionIds = C7714v.a0("addToFavorites");
        InterfaceC8487b a11 = C8488c.a(C9653a.f98522b);
        Intrinsics.checkNotNullExpressionValue(a11, "empty(...)");
        this.disposable = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeAction(AtomAction.ComposerAction action, SwitchingButtonAction switchingButtonAction) {
        InterfaceC8487b h11 = this.interactor.addToFavorite(action, new AnalyticRefs(getRefs().getTokenizedAnalytics(), Long.valueOf(switchingButtonAction.getVoId()))).h(new C3056e(SwitchingButtonAddToFavoriteActionDelegate$executeAction$actionDisposable$1.INSTANCE, 11), new a(new SwitchingButtonAddToFavoriteActionDelegate$executeAction$actionDisposable$2(Lm0.a.f17149a), 8));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        CustomComposerActionLifecycleDisposable customComposerActionLifecycleDisposable = new CustomComposerActionLifecycleDisposable(getRefs().getContainer().g(), h11);
        getRefs().getContainer().g().getLifecycle().a(customComposerActionLifecycleDisposable);
        this.disposable = customComposerActionLifecycleDisposable;
    }

    private final void executeActionIfNeedIt(final AtomAction.ComposerAction action, final SwitchingButtonAction switchingButtonAction) {
        G supportFragmentManager;
        String str;
        Map<String, String> params = action.getParams();
        boolean parseBoolean = (params == null || (str = params.get(FavoriteProductMolecule.IS_ADULT_PARAMS_NAME)) == null) ? false : Boolean.parseBoolean(str);
        final Long extractSkuFromFavoriteAction = ActionHandlersUtilsKt.extractSkuFromFavoriteAction(action);
        AdultHandler adultHandler = this.adultHandler;
        r a11 = getRefs().getContainer().a();
        if (a11 == null || (supportFragmentManager = a11.getSupportFragmentManager()) == null) {
            return;
        }
        AdultHandler.DefaultImpls.showAdultDialog$default(adultHandler, parseBoolean, supportFragmentManager, new AdultListener() { // from class: ru.ozon.app.android.ui.switchingbutton.delegates.SwitchingButtonAddToFavoriteActionDelegate$executeActionIfNeedIt$1
            @Override // ru.ozon.app.android.account.adult.ui.AdultListener
            public void onAdultAccept() {
                SwitchingButtonAddToFavoriteActionDelegate.this.executeAction(action, switchingButtonAction);
            }

            @Override // ru.ozon.app.android.account.adult.ui.AdultListener
            public void onAdultReject() {
                FavoriteManager favoriteManager;
                favoriteManager = SwitchingButtonAddToFavoriteActionDelegate.this.favoriteManager;
                Long l11 = extractSkuFromFavoriteAction;
                if (l11 != null) {
                    FavoriteManager.DefaultImpls.removeFromFavorites$default(favoriteManager, l11.longValue(), null, 2, null);
                }
            }
        }, null, false, 24, null);
    }

    @Override // ru.ozon.app.android.ui.switchingbutton.delegates.SwitchingButtonActionDelegate
    public boolean canHandle(@NotNull SwitchingButtonAction switchingButtonAction) {
        Intrinsics.checkNotNullParameter(switchingButtonAction, "switchingButtonAction");
        if (!(switchingButtonAction.getAction() instanceof AtomAction.ComposerAction) || !C7714v.A(getActionIds(), ((AtomAction.ComposerAction) switchingButtonAction.getAction()).getId())) {
            return false;
        }
        this.disposable.dispose();
        executeActionIfNeedIt((AtomAction.ComposerAction) switchingButtonAction.getAction(), switchingButtonAction);
        return true;
    }

    @NotNull
    protected List<String> getActionIds() {
        return this.actionIds;
    }
}
