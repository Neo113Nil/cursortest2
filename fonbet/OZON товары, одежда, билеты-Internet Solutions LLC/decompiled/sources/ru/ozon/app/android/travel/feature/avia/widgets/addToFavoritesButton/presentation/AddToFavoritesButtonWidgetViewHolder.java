package ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.presentation;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2397i;
import Sc.o;
import Sc.s;
import Wc.a;
import androidx.core.app.n;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateForOverlayWidgetsImpl;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteAdd;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteRemove;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView;
import ru.ozon.app.android.travel.feature.avia.shared.favorites.AddToFavoritesViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.presentation.AddToFavoritesButtonVI;
import ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.view.AddToFavoritesButtonView;
import ru.ozon.app.android.travel.utils.extensions.OnboardingExtensionsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004BC\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020$H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b'\u0010(J*\u0010-\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020$2\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010,\u001a\u00020+H\u0096\u0001¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00101R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00170=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/presentation/AddToFavoritesButtonWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/presentation/AddToFavoritesButtonVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/view/AddToFavoritesButtonView;", "view", "Lru/ozon/app/android/travel/feature/avia/shared/favorites/AddToFavoritesViewModel;", "viewModel", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onBoardingViewModel", "favProductMoleculeDelegate", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ll10/i;", "container", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/view/AddToFavoritesButtonView;Lru/ozon/app/android/travel/feature/avia/shared/favorites/AddToFavoritesViewModel;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;LVg/d;Ll10/i;)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "vo", "", "bindOnBoarding", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "onBoarding", "initDelegate", "", "isScreenVisible", "()Z", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/presentation/AddToFavoritesButtonVI;Ll20/d;)V", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "attachFavButtonView", "(Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;)V", "detachFavButtonView", "()V", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "molecule", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "bindFavoriteProductButton", "(Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/view/AddToFavoritesButtonView;", "Lru/ozon/app/android/travel/feature/avia/shared/favorites/AddToFavoritesViewModel;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "Ll10/i;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegateForOverlayWidgetsImpl;", "onBoardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegateForOverlayWidgetsImpl;", "Lxe/B0;", "onboardingJob", "Lxe/B0;", "", "onboardingCornerRadius", "F", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AddToFavoritesButtonWidgetViewHolder extends k<AddToFavoritesButtonVI> implements FavoriteProductV4Delegate {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final FavoriteProductV4Delegate favProductMoleculeDelegate;
    private OnBoardingDelegateForOverlayWidgetsImpl onBoardingDelegate;

    @NotNull
    private final BaseOnBoardingViewModel onBoardingViewModel;
    private final float onboardingCornerRadius;
    private B0 onboardingJob;

    @NotNull
    private final AddToFavoritesButtonView view;

    @NotNull
    private final AddToFavoritesViewModel viewModel;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.presentation.AddToFavoritesButtonWidgetViewHolder$1", f = "AddToFavoritesButtonWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.presentation.AddToFavoritesButtonWidgetViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<FavoriteEvent, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = AddToFavoritesButtonWidgetViewHolder.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z11;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            FavoriteEvent favoriteEvent = (FavoriteEvent) this.L$0;
            AddToFavoritesButtonVI boundData = AddToFavoritesButtonWidgetViewHolder.this.getBoundData();
            if ((boundData != null ? boundData.getButton() : null) instanceof AddToFavoritesButtonVI.ButtonType.FavoriteButton) {
                long sku = favoriteEvent.getSku();
                AddToFavoritesButtonVI boundData2 = AddToFavoritesButtonWidgetViewHolder.this.getBoundData();
                AddToFavoritesButtonVI.ButtonType button = boundData2 != null ? boundData2.getButton() : null;
                Intrinsics.g(button, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.presentation.AddToFavoritesButtonVI.ButtonType.FavoriteButton");
                if (sku == ((AddToFavoritesButtonVI.ButtonType.FavoriteButton) button).getFavoriteButton().getSku()) {
                    if (favoriteEvent instanceof FavoriteAdd) {
                        z11 = true;
                    } else {
                        if (!(favoriteEvent instanceof FavoriteRemove)) {
                            throw new o();
                        }
                        z11 = false;
                    }
                    AddToFavoritesButtonVI boundData3 = AddToFavoritesButtonWidgetViewHolder.this.getBoundData();
                    AtomAction modalAction = boundData3 != null ? boundData3.getModalAction() : null;
                    if (z11 && modalAction != null && !n.e(AddToFavoritesButtonWidgetViewHolder.this.getContext()).a() && !AddToFavoritesButtonWidgetViewHolder.this.viewModel.getNotificationDialogShownInSession()) {
                        AddToFavoritesButtonWidgetViewHolder.this.actionHandler.invoke(modalAction);
                        AddToFavoritesButtonWidgetViewHolder.this.viewModel.changeNotificationDialogShownInSession();
                    }
                }
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FavoriteEvent favoriteEvent, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(favoriteEvent, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;", "", "it", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.presentation.AddToFavoritesButtonWidgetViewHolder$2", f = "AddToFavoritesButtonWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.presentation.AddToFavoritesButtonWidgetViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements InterfaceC6511n<InterfaceC2397i<? super FavoriteEvent>, Throwable, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super FavoriteEvent> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
            anonymousClass2.L$0 = th2;
            return anonymousClass2.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Lm0.a.f17149a.e((Throwable) this.L$0);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToFavoritesButtonWidgetViewHolder(@NotNull AddToFavoritesButtonView view, @NotNull AddToFavoritesViewModel viewModel, @NotNull BaseOnBoardingViewModel onBoardingViewModel, @NotNull FavoriteProductV4Delegate favProductMoleculeDelegate, @NotNull FavoriteManager favoriteManager, @NotNull Vg.d customActionHandlersStoreFactory, @NotNull i container) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onBoardingViewModel, "onBoardingViewModel");
        Intrinsics.checkNotNullParameter(favProductMoleculeDelegate, "favProductMoleculeDelegate");
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        this.view = view;
        this.viewModel = viewModel;
        this.onBoardingViewModel = onBoardingViewModel;
        this.favProductMoleculeDelegate = favProductMoleculeDelegate;
        this.container = container;
        this.onboardingCornerRadius = ResourceExtKt.toPxF(12, getContext());
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new AddToFavoritesButtonWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        favProductMoleculeDelegate.attachFavButtonView(view.getFavoriteButtonView());
        C2399j.C(new C(new C2408n0(favoriteManager.onFavoriteChangeFlow(), new AnonymousClass1(null)), new AnonymousClass2(null)), K.a(this));
        getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.presentation.AddToFavoritesButtonWidgetViewHolder.3
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                AddToFavoritesButtonWidgetViewHolder.this.favProductMoleculeDelegate.detachFavButtonView();
                ComposerExtKt.withPageTag(AddToFavoritesButtonWidgetViewHolder.this.container, new AddToFavoritesButtonWidgetViewHolder$3$onDestroy$1(AddToFavoritesButtonWidgetViewHolder.this));
                OnBoardingDelegateForOverlayWidgetsImpl onBoardingDelegateForOverlayWidgetsImpl = AddToFavoritesButtonWidgetViewHolder.this.onBoardingDelegate;
                if (onBoardingDelegateForOverlayWidgetsImpl != null) {
                    onBoardingDelegateForOverlayWidgetsImpl.unbind();
                }
                B0 b02 = AddToFavoritesButtonWidgetViewHolder.this.onboardingJob;
                if (b02 != null) {
                    b02.j(null);
                }
                AddToFavoritesButtonWidgetViewHolder.this.onboardingJob = null;
                AddToFavoritesButtonWidgetViewHolder.this.onBoardingDelegate = null;
                AddToFavoritesButtonWidgetViewHolder.this.getLifecycle().e(this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindOnBoarding(OnBoardingDTO vo) {
        if (isScreenVisible()) {
            ComposerExtKt.withPageTag(this.container, new AddToFavoritesButtonWidgetViewHolder$bindOnBoarding$1(this, vo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDelegate(OnBoardingDTO onBoarding) {
        i iVar = this.container;
        String onboardingKey = onBoarding.getOnboardingKey();
        if (onboardingKey == null) {
            onboardingKey = "add_to_favorites_onboarding_key";
        }
        String str = onboardingKey;
        AddToFavoritesButtonVI boundData = getBoundData();
        OnBoardingDelegateForOverlayWidgetsImpl onBoardingDelegateForOverlayWidgetsImpl = new OnBoardingDelegateForOverlayWidgetsImpl(iVar, this, boundData != null ? Long.valueOf(boundData.getId()) : null, str, onBoarding, this.onBoardingViewModel);
        onBoardingDelegateForOverlayWidgetsImpl.setOnShownListener(new AddToFavoritesButtonWidgetViewHolder$initDelegate$1$1(this));
        this.onBoardingDelegate = onBoardingDelegateForOverlayWidgetsImpl;
    }

    private final boolean isScreenVisible() {
        List<ComponentCallbacksC5392m> r02;
        G d11 = this.container.Q().d();
        ComponentCallbacksC5392m componentCallbacksC5392m = (d11 == null || (r02 = d11.r0()) == null) ? null : (ComponentCallbacksC5392m) C7714v.Z(r02);
        return (componentCallbacksC5392m instanceof ComposerFragment) && ((ComposerFragment) componentCallbacksC5392m).getConfig().getBottomSheetConfig() == null;
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate
    public void attachFavButtonView(@NotNull ProductFavoriteMoleculeV4ButtonView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.favProductMoleculeDelegate.attachFavButtonView(view);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate
    public void bindFavoriteProductButton(@NotNull ProductFavoriteMoleculeV4ButtonView view, FavoriteProductModel molecule, @NotNull AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        this.favProductMoleculeDelegate.bindFavoriteProductButton(view, molecule, analyticData);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate
    public void detachFavButtonView() {
        this.favProductMoleculeDelegate.detachFavButtonView();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AddToFavoritesButtonVI item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.bind(item.getButton(), this.actionHandler, new AddToFavoritesButtonWidgetViewHolder$bind$1(this));
        OnBoardingDTO onboarding = item.getOnboarding();
        this.onboardingJob = onboarding != null ? OnboardingExtensionsKt.showOnboardingWithDelay(onboarding, this.container.Q().g().getLifecycle(), K.a(this), new AddToFavoritesButtonWidgetViewHolder$bind$2(this)) : null;
    }
}
