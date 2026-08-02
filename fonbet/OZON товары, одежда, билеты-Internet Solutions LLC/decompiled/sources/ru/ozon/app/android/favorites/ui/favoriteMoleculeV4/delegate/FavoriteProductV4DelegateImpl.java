package ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.o;
import Sc.s;
import Ve.C4598rp;
import WZ.l;
import Wc.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesComposerActionHandler;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteButtonV4ViewHolder;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.viewModel.FavMoleculeNotification;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.viewModel.FavMoleculeUIState;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.viewModel.FavProductButtonV4ViewModel;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B5\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fB)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001e\u001a\u00020\u0015*\u00020\u001a2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010\u0019J)\u0010%\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0015H\u0016¢\u0006\u0004\b)\u0010\u0019J\u0017\u0010,\u001a\u00020\u00152\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00152\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b.\u0010-J\u0017\u0010/\u001a\u00020\u00152\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b/\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00103R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00104R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R$\u0010=\u001a\u0010\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u0015\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4DelegateImpl;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/viewModel/FavProductButtonV4ViewModel;", "viewModel", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;", "favoritesComposerActionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/viewModel/FavProductButtonV4ViewModel;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;LWZ/l;)V", "Ll10/i;", "container", "(Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/viewModel/FavProductButtonV4ViewModel;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Ll10/i;Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;)V", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "", "initNotificationActionHandler", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "showError", "()V", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "", "", "trackingPayloads", "showAddToFavSuccess", "(Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;Ljava/util/Map;)V", "observeSwipeRefresh", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "view", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "molecule", "bindFavoriteProductButton", "(Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "attachFavButtonView", "(Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;)V", "detachFavButtonView", "Landroidx/lifecycle/J;", "owner", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "onDestroy", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/viewModel/FavProductButtonV4ViewModel;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;", "LWZ/l;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteButtonV4ViewHolder;", "favButtonViewHolder$delegate", "LSc/j;", "getFavButtonViewHolder", "()Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteButtonV4ViewHolder;", "favButtonViewHolder", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "notificationActionHandler", "Lkotlin/jvm/functions/Function1;", "", "needLocalFavStateUpdate", "Z", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoriteProductV4DelegateImpl implements FavoriteProductV4Delegate, DefaultLifecycleObserver {

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final ComposerReferences composerReferences;

    /* renamed from: favButtonViewHolder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j favButtonViewHolder;

    @NotNull
    private final FavoritesComposerActionHandler favoritesComposerActionHandler;
    private boolean needLocalFavStateUpdate;
    private Function1<? super AtomAction, Unit> notificationActionHandler;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final FavProductButtonV4ViewModel viewModel;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4DelegateImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<FavoriteProductModel, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FavoriteProductModel favoriteProductModel) {
            invoke2(favoriteProductModel);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FavoriteProductModel it) {
            Intrinsics.checkNotNullParameter(it, "it");
            FavoriteProductV4DelegateImpl.this.viewModel.onFavoriteClick(it);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/viewModel/FavMoleculeUIState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4DelegateImpl$2", f = "FavoriteProductV4DelegateImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4DelegateImpl$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<FavMoleculeUIState, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = FavoriteProductV4DelegateImpl.this.new AnonymousClass2(dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            FavMoleculeUIState favMoleculeUIState = (FavMoleculeUIState) this.L$0;
            FavoriteProductV4DelegateImpl.this.getFavButtonViewHolder().rebindData(favMoleculeUIState.getMolecule(), favMoleculeUIState instanceof FavMoleculeUIState.Error);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FavMoleculeUIState favMoleculeUIState, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(favMoleculeUIState, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/viewModel/FavMoleculeNotification;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4DelegateImpl$3", f = "FavoriteProductV4DelegateImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4DelegateImpl$3, reason: invalid class name */
    static final class AnonymousClass3 extends j implements Function2<FavMoleculeNotification, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(d<? super AnonymousClass3> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass3 anonymousClass3 = FavoriteProductV4DelegateImpl.this.new AnonymousClass3(dVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            FavMoleculeNotification favMoleculeNotification = (FavMoleculeNotification) this.L$0;
            if (favMoleculeNotification instanceof FavMoleculeNotification.Success) {
                FavMoleculeNotification.Success success = (FavMoleculeNotification.Success) favMoleculeNotification;
                NotificationModelWrapper notification = success.getNotification();
                if (notification != null) {
                    FavoriteProductV4DelegateImpl.this.showAddToFavSuccess(notification, success.getNotificationPayloads());
                }
            } else {
                if (!(favMoleculeNotification instanceof FavMoleculeNotification.Error)) {
                    throw new o();
                }
                FavoriteProductV4DelegateImpl.this.showError();
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FavMoleculeNotification favMoleculeNotification, d<? super Unit> dVar) {
            return ((AnonymousClass3) create(favMoleculeNotification, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    public FavoriteProductV4DelegateImpl(@NotNull FavProductButtonV4ViewModel viewModel, @NotNull AdultHandler adultHandler, @NotNull ComposerReferences composerReferences, @NotNull FavoritesComposerActionHandler favoritesComposerActionHandler, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(favoritesComposerActionHandler, "favoritesComposerActionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.viewModel = viewModel;
        this.adultHandler = adultHandler;
        this.composerReferences = composerReferences;
        this.favoritesComposerActionHandler = favoritesComposerActionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.favButtonViewHolder = k.a(n.NONE, new FavoriteProductV4DelegateImpl$favButtonViewHolder$2(this));
        getFavButtonViewHolder().setOnClick(new AnonymousClass1());
        C2399j.C(new C2408n0(viewModel.getFavState(), new AnonymousClass2(null)), K.a(composerReferences.getContainer().g()));
        C4598rp.f(composerReferences, new C2408n0(viewModel.getNotificationEvent(), new AnonymousClass3(null)));
        observeSwipeRefresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductFavoriteButtonV4ViewHolder getFavButtonViewHolder() {
        return (ProductFavoriteButtonV4ViewHolder) this.favButtonViewHolder.getValue();
    }

    private final void initNotificationActionHandler(AnalyticData analyticData) {
        this.favoritesComposerActionHandler.setTrackingData(analyticData.getTrackingData());
        this.notificationActionHandler = new ActionHandler.Builder(this.composerReferences, FavoriteProductV4DelegateImpl$initNotificationActionHandler$1.INSTANCE, new FavoriteProductV4DelegateImpl$initNotificationActionHandler$2(analyticData), new FavoriteProductV4DelegateImpl$initNotificationActionHandler$3(analyticData)).onComposerAction(new FavoriteProductV4DelegateImpl$initNotificationActionHandler$4(this.favoritesComposerActionHandler)).buildHandler();
    }

    private final void observeSwipeRefresh() {
        C4598rp.f(this.composerReferences, new C2408n0(this.composerReferences.getController().getEventsFlow(), new FavoriteProductV4DelegateImpl$observeSwipeRefresh$1(this, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAddToFavSuccess(NotificationModelWrapper notificationModelWrapper, Map<String, String> map) {
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
        View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(viewGroup, NotificationBarKt.isAboveBottomWidgets(notificationModelWrapper));
        NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(viewGroup, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
        if (asNotificationLayoutManager == null) {
            return;
        }
        if (map != null) {
            AtomAction.AppendPayloads appendPayloads = new AtomAction.AppendPayloads(map, null, 2, null);
            Function1<? super AtomAction, Unit> function1 = this.notificationActionHandler;
            if (function1 != null) {
                function1.invoke(appendPayloads);
            }
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager, notificationModelWrapper, this.composerReferences.getContainer().g(), this.notificationActionHandler).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError() {
        ViewGroup rootView;
        ComponentCallbacksC5392m c11 = this.composerReferences.getContainer().c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, this.composerReferences.getContainer().g(), 62, null).show();
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate
    public void attachFavButtonView(@NotNull ProductFavoriteMoleculeV4ButtonView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.composerReferences.getContainer().g().getLifecycle().a(this);
        getFavButtonViewHolder().attachButton(view);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate
    public void bindFavoriteProductButton(@NotNull ProductFavoriteMoleculeV4ButtonView view, FavoriteProductModel molecule, @NotNull AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        initNotificationActionHandler(analyticData);
        this.viewModel.init(molecule, analyticData, this.tokenizedAnalytics, this.needLocalFavStateUpdate);
        this.needLocalFavStateUpdate = false;
        getFavButtonViewHolder().bindButton(view, molecule, analyticData.getViewItem());
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate
    public void detachFavButtonView() {
        this.composerReferences.getContainer().g().getLifecycle().e(this);
        getFavButtonViewHolder().detachButton();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.composerReferences.getContainer().g().getLifecycle().e(this);
        this.viewModel.onDestroy();
        this.notificationActionHandler = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.viewModel.onStart();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.viewModel.onStop();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FavoriteProductV4DelegateImpl(@NotNull FavProductButtonV4ViewModel viewModel, @NotNull AdultHandler adultHandler, @NotNull i container, @NotNull FavoritesComposerActionHandler favoritesComposerActionHandler) {
        this(viewModel, adultHandler, (ComposerReferences) r0, favoritesComposerActionHandler, container.X());
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(favoritesComposerActionHandler, "favoritesComposerActionHandler");
        l10.e V11 = container.V();
        Intrinsics.g(V11, "null cannot be cast to non-null type ru.ozon.app.android.composer.ComposerReferences");
    }
}
