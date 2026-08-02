package ru.ozon.app.android.favorites.ui.favoriteToggleProductButton.delegate;

import Ae.C2399j;
import Ae.C2408n0;
import Pc.a;
import Sc.InterfaceC4008j;
import Vg.c;
import Vg.d;
import a00.C4911f;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteToggleProductButton.model.FavoriteToggleProductButtonMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesComposerActionHandler;
import ru.ozon.app.android.favorites.ui.favoriteToggleProductButton.viewmodel.FavoriteToggleProductButtonViewModel;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import xe.B0;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010*\u001a\n )*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010.\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0014\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoriteToggleProductButton/delegate/FavoriteToggleProductButtonDelegateImpl;", "Lru/ozon/app/android/favorites/ui/favoriteToggleProductButton/delegate/FavoriteToggleProductButtonDelegate;", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LPc/a;", "Lru/ozon/app/android/favorites/ui/favoriteToggleProductButton/viewmodel/FavoriteToggleProductButtonViewModel;", "viewModelProvider", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;", "favoritesComposerActionHandler", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;LVg/d;LPc/a;Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;)V", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "view", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteToggleProductButton/model/FavoriteToggleProductButtonMolecule;", "molecule", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "", "bindFavoriteToggleProductButton", "(Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteToggleProductButton/model/FavoriteToggleProductButtonMolecule;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "initNotificationActionHandler", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notification", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;)V", "showError", "()V", "bindFavoriteToggleProductButtonOrGone", "Lru/ozon/app/android/composer/ComposerReferences;", "LVg/d;", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;", "LVg/c;", "customActionHandlersStore$delegate", "LSc/j;", "getCustomActionHandlersStore", "()LVg/c;", "customActionHandlersStore", "kotlin.jvm.PlatformType", "viewModel", "Lru/ozon/app/android/favorites/ui/favoriteToggleProductButton/viewmodel/FavoriteToggleProductButtonViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "notificationActionHandler", "Lkotlin/jvm/functions/Function1;", "Lxe/B0;", "notificationJob", "Lxe/B0;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoriteToggleProductButtonDelegateImpl implements FavoriteToggleProductButtonDelegate {

    @NotNull
    private final ComposerReferences composerReferences;

    /* renamed from: customActionHandlersStore$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j customActionHandlersStore;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final FavoritesComposerActionHandler favoritesComposerActionHandler;
    private Function1<? super AtomAction, Unit> notificationActionHandler;
    private B0 notificationJob;
    private final FavoriteToggleProductButtonViewModel viewModel;

    public FavoriteToggleProductButtonDelegateImpl(@NotNull ComposerReferences composerReferences, @NotNull d customActionHandlersStoreFactory, @NotNull final a<FavoriteToggleProductButtonViewModel> viewModelProvider, @NotNull FavoritesComposerActionHandler favoritesComposerActionHandler) {
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(favoritesComposerActionHandler, "favoritesComposerActionHandler");
        this.composerReferences = composerReferences;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.favoritesComposerActionHandler = favoritesComposerActionHandler;
        this.customActionHandlersStore = LazyUtilsKt.unsafeLazy(new FavoriteToggleProductButtonDelegateImpl$customActionHandlersStore$2(this));
        this.viewModel = (FavoriteToggleProductButtonViewModel) new z0(composerReferences.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.favorites.ui.favoriteToggleProductButton.delegate.FavoriteToggleProductButtonDelegateImpl$special$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                FavoriteToggleProductButtonViewModel favoriteToggleProductButtonViewModel = (FavoriteToggleProductButtonViewModel) a.this.get();
                Intrinsics.g(favoriteToggleProductButtonViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return favoriteToggleProductButtonViewModel;
            }
        }).a(FavoriteToggleProductButtonViewModel.class);
    }

    private final void bindFavoriteToggleProductButton(IconButtonV3View view, FavoriteToggleProductButtonMolecule molecule, AnalyticData analyticData) {
        AtomActionDTO action;
        Map<String, String> params;
        String str;
        AtomActionDTO action2;
        Map<String, String> params2;
        String str2;
        initNotificationActionHandler(analyticData);
        CommonControlSettings common = molecule.getActionButton().getCommon();
        Long y02 = (common == null || (action2 = common.getAction()) == null || (params2 = action2.getParams()) == null || (str2 = params2.get("sku")) == null) ? null : h.y0(str2);
        CommonControlSettings common2 = molecule.getActionButton().getCommon();
        Long y03 = (common2 == null || (action = common2.getAction()) == null || (params = action.getParams()) == null || (str = params.get("giftId")) == null) ? null : h.y0(str);
        if (y02 == null) {
            y02 = y03;
        }
        IconButtonV3HolderKt.bind(view, molecule.getActionButton(), new ActionHandler.Builder(this.composerReferences, FavoriteToggleProductButtonDelegateImpl$bindFavoriteToggleProductButton$actionHandler$1.INSTANCE, new FavoriteToggleProductButtonDelegateImpl$bindFavoriteToggleProductButton$actionHandler$2(analyticData), new FavoriteToggleProductButtonDelegateImpl$bindFavoriteToggleProductButton$actionHandler$3(analyticData)).customActionHandlers(new FavoriteToggleProductButtonDelegateImpl$bindFavoriteToggleProductButton$actionHandler$4(this)).onPreProcess(new FavoriteToggleProductButtonDelegateImpl$bindFavoriteToggleProductButton$actionHandler$5(this, y02)).buildHandler());
        view.setContentDescription(molecule.getActionButton().getIcon());
        B0 b02 = this.notificationJob;
        if (b02 != null) {
            b02.j(null);
        }
        if (y02 == null) {
            return;
        }
        this.notificationJob = C2399j.C(new C2408n0(this.viewModel.observeNotificationEvents(y02.longValue()), new FavoriteToggleProductButtonDelegateImpl$bindFavoriteToggleProductButton$1(this, null)), K.a(this.composerReferences.getContainer().f()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c getCustomActionHandlersStore() {
        return (c) this.customActionHandlersStore.getValue();
    }

    private final void initNotificationActionHandler(AnalyticData analyticData) {
        this.favoritesComposerActionHandler.setTrackingData(analyticData.getTrackingData());
        this.notificationActionHandler = new ActionHandler.Builder(this.composerReferences, FavoriteToggleProductButtonDelegateImpl$initNotificationActionHandler$1.INSTANCE, new FavoriteToggleProductButtonDelegateImpl$initNotificationActionHandler$2(analyticData), new FavoriteToggleProductButtonDelegateImpl$initNotificationActionHandler$3(analyticData)).onComposerAction(new FavoriteToggleProductButtonDelegateImpl$initNotificationActionHandler$4(this.favoritesComposerActionHandler)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError() {
        C4911f container = this.composerReferences.getContainer();
        ViewGroup rootView = ContextExtKt.getRootView(container.c());
        if (rootView == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, container.g(), 62, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(NotificationModelWrapper notification) {
        if (notification == null) {
            return;
        }
        ComponentCallbacksC5392m c11 = this.composerReferences.getContainer().c();
        View view = c11 != null ? c11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            r a11 = this.composerReferences.getContainer().a();
            viewGroup = a11 != null ? ContextExtKt.getRootView(a11) : null;
            if (viewGroup == null) {
                return;
            }
        }
        View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(viewGroup, NotificationBarKt.isAboveBottomWidgets(notification));
        NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(viewGroup, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
        if (asNotificationLayoutManager == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager, notification, this.composerReferences.getContainer().g(), this.notificationActionHandler).show();
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteToggleProductButton.delegate.FavoriteToggleProductButtonDelegate
    public void bindFavoriteToggleProductButtonOrGone(@NotNull IconButtonV3View view, FavoriteToggleProductButtonMolecule molecule, @NotNull AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        if (molecule != null) {
            bindFavoriteToggleProductButton(view, molecule, analyticData);
        } else {
            ViewExtKt.gone(view);
        }
    }
}
