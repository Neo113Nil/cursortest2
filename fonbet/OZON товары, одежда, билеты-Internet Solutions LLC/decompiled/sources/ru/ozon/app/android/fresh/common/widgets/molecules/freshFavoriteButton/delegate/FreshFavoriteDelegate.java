package ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2408n0;
import Ae.I;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import BZ.e;
import Ge.n;
import Sc.s;
import Sg.a;
import WZ.l;
import WZ.t;
import a00.C4911f;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteAdd;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;
import xe.B0;
import xe.C10727i;
import xe.M;
import ze.EnumC11113a;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 R2\u00020\u0001:\u0001RB;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ%\u0010#\u001a\u0004\u0018\u00010\u00142\b\u0010 \u001a\u0004\u0018\u00010\u00142\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010%\u001a\u00020!H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J#\u0010,\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b,\u0010-JA\u00104\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001a0.2\f\u00101\u001a\b\u0012\u0004\u0012\u0002000.2\u000e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020.¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0011¢\u0006\u0004\b6\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010:R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010;R\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010<R\u001c\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001e\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010@R\u001e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010@R\u001e\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010CR\u0018\u0010F\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010K\u001a\u0004\u0018\u0001008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0016\u0010N\u001a\u0004\u0018\u0001028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0016\u0010Q\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006S"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteDelegate;", "", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "LSg/a;", "analyticsScreenStorage", "LBZ/e;", "miniAppConfigHolder", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/action/v2/ActionV2Repository;LSg/a;LBZ/e;LWZ/l;)V", "", "onClick", "()V", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteState;", "newState", "innerBind", "(Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteState;)V", "Landroidx/lifecycle/v;", "lifecycle", "Lxe/M;", "scope", "initFavoriteStateObserver", "(Landroidx/lifecycle/v;Lxe/M;)V", "initNotificationsObservers", "initAdultStateObserver", "state", "", "forceFavoriteState", "hydrateState", "(Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteState;Ljava/lang/Boolean;)Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteState;", "targetFavoriteState", "requestFavoriteStateChange", "(Z)V", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notification", "handleNotifications", "(Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;)V", "setState", "(Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteState;Ljava/lang/Boolean;)V", "Lkotlin/Function0;", "coroutineScopeProvider", "La00/f;", "ownerProvider", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteProxy;", "viewProvider", "onAttach", "(Landroidx/lifecycle/v;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "onDetach", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LSg/a;", "LBZ/e;", "LWZ/l;", "Lze/h;", "notificationEventsFlow", "Lze/h;", "Lkotlin/jvm/functions/Function0;", "Lxe/B0;", "favoriteStateObserverJob", "Lxe/B0;", "adultStateObserverJob", "notificationsObserverJob", "changeFavoriteStateJob", "currentState", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteState;", "getOwner", "()La00/f;", "owner", "getView", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteProxy;", "view", "getCoroutineScope", "()Lxe/M;", "coroutineScope", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshFavoriteDelegate {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final NotificationDTO defaultErrorNotification = new NotificationDTO(StringProvider.getString(R$string.common_universal_network_error), null, null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 478, null);

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final AdultHandler adultHandler;
    private B0 adultStateObserverJob;

    @NotNull
    private final a analyticsScreenStorage;
    private B0 changeFavoriteStateJob;

    @NotNull
    private Function0<? extends M> coroutineScopeProvider;
    private FreshFavoriteState currentState;

    @NotNull
    private final FavoriteManager favoriteManager;
    private B0 favoriteStateObserverJob;

    @NotNull
    private final e miniAppConfigHolder;

    @NotNull
    private final h<NotificationModelWrapper> notificationEventsFlow;
    private B0 notificationsObserverJob;

    @NotNull
    private Function0<C4911f> ownerProvider;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private Function0<? extends FreshFavoriteProxy> viewProvider;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteDelegate$Companion;", "", "<init>", "()V", "defaultErrorNotification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getDefaultErrorNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NotificationDTO getDefaultErrorNotification() {
            return FreshFavoriteDelegate.defaultErrorNotification;
        }

        private Companion() {
        }
    }

    public FreshFavoriteDelegate(@NotNull FavoriteManager favoriteManager, @NotNull AdultHandler adultHandler, @NotNull ActionV2Repository actionV2Repository, @NotNull a analyticsScreenStorage, @NotNull e miniAppConfigHolder, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.favoriteManager = favoriteManager;
        this.adultHandler = adultHandler;
        this.actionV2Repository = actionV2Repository;
        this.analyticsScreenStorage = analyticsScreenStorage;
        this.miniAppConfigHolder = miniAppConfigHolder;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.notificationEventsFlow = k.a(1, 4, EnumC11113a.DROP_OLDEST);
        this.ownerProvider = FreshFavoriteDelegate$ownerProvider$1.INSTANCE;
        this.viewProvider = FreshFavoriteDelegate$viewProvider$1.INSTANCE;
        this.coroutineScopeProvider = FreshFavoriteDelegate$coroutineScopeProvider$1.INSTANCE;
    }

    private final M getCoroutineScope() {
        return this.coroutineScopeProvider.invoke();
    }

    private final C4911f getOwner() {
        return this.ownerProvider.invoke();
    }

    private final FreshFavoriteProxy getView() {
        return this.viewProvider.invoke();
    }

    private final void handleNotifications(NotificationModelWrapper notification) {
        View rootView;
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        r a11;
        C4911f owner = getOwner();
        if (owner == null) {
            return;
        }
        ComponentCallbacksC5392m c11 = owner.c();
        if (c11 == null || (rootView = c11.getView()) == null) {
            rootView = ContextExtKt.getRootView(owner.a());
        }
        if (rootView == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null || (a11 = owner.a()) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, notification, a11, null, 8, null).show();
    }

    private final FreshFavoriteState hydrateState(FreshFavoriteState state, Boolean forceFavoriteState) {
        if (state == null || state.getSku() == null) {
            return null;
        }
        boolean isUserAnAdult = this.adultHandler.isUserAnAdult();
        if (state.getIsAdultProduct() && !isUserAnAdult) {
            return state;
        }
        Boolean currentFavState = this.favoriteManager.getCurrentFavState(state.getSku().longValue());
        return FreshFavoriteState.copy$default(state, null, forceFavoriteState != null ? forceFavoriteState.booleanValue() : currentFavState != null ? currentFavState.booleanValue() : state.getIsFavorite(), false, null, null, null, null, 121, null);
    }

    private final void initAdultStateObserver(AbstractC5434v lifecycle, M scope) {
        B0 b02 = this.adultStateObserverJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.adultStateObserverJob = C2399j.C(new C2408n0(C5427n.a(n.a(this.adultHandler.observeUserAdultState()), lifecycle, AbstractC5434v.b.STARTED), new FreshFavoriteDelegate$initAdultStateObserver$1(this, null)), scope);
    }

    private final void initFavoriteStateObserver(AbstractC5434v lifecycle, M scope) {
        B0 b02 = this.favoriteStateObserverJob;
        if (b02 != null) {
            b02.j(null);
        }
        final I i11 = new I(C5427n.a(this.favoriteManager.onFavoriteChangeFlow(), lifecycle, AbstractC5434v.b.STARTED));
        final InterfaceC2395h<FavoriteEvent> interfaceC2395h = new InterfaceC2395h<FavoriteEvent>() { // from class: ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteDelegate$initFavoriteStateObserver$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteDelegate$initFavoriteStateObserver$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ FreshFavoriteDelegate this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteDelegate$initFavoriteStateObserver$$inlined$filter$1$2", f = "FreshFavoriteDelegate.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteDelegate$initFavoriteStateObserver$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, FreshFavoriteDelegate freshFavoriteDelegate) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = freshFavoriteDelegate;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    FreshFavoriteState freshFavoriteState;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                FavoriteEvent favoriteEvent = (FavoriteEvent) obj;
                                freshFavoriteState = this.this$0.currentState;
                                if (freshFavoriteState != null) {
                                    long sku = favoriteEvent.getSku();
                                    Long sku2 = freshFavoriteState.getSku();
                                    if (sku2 != null && sku == sku2.longValue()) {
                                        anonymousClass1.label = 1;
                                        if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                            return aVar;
                                        }
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super FavoriteEvent> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        };
        this.favoriteStateObserverJob = C2399j.C(new C2408n0(new InterfaceC2395h<Boolean>() { // from class: ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteDelegate$initFavoriteStateObserver$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteDelegate$initFavoriteStateObserver$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteDelegate$initFavoriteStateObserver$$inlined$map$1$2", f = "FreshFavoriteDelegate.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteDelegate$initFavoriteStateObserver$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                Boolean valueOf = Boolean.valueOf(((FavoriteEvent) obj) instanceof FavoriteAdd);
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(valueOf, anonymousClass1) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super Boolean> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new FreshFavoriteDelegate$initFavoriteStateObserver$3(this, null)), scope);
    }

    private final void initNotificationsObservers(AbstractC5434v lifecycle, M scope) {
        B0 b02 = this.notificationsObserverJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.notificationsObserverJob = C2399j.C(new C2408n0(new C2406m0(C5427n.a(C2399j.H(this.notificationEventsFlow), lifecycle, AbstractC5434v.b.STARTED)), new FreshFavoriteDelegate$initNotificationsObservers$1(this)), scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object initNotificationsObservers$handleNotifications(FreshFavoriteDelegate freshFavoriteDelegate, NotificationModelWrapper notificationModelWrapper, d dVar) {
        freshFavoriteDelegate.handleNotifications(notificationModelWrapper);
        return Unit.f71690a;
    }

    private final void innerBind(FreshFavoriteState newState) {
        FreshFavoriteProxy view = getView();
        if (view != null) {
            view.bindOrGoneFavorite((newState == null || !newState.getIsAdultProduct()) ? newState : null, new FreshFavoriteDelegate$innerBind$1(this));
        }
        this.currentState = newState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClick() {
        FreshFavoriteState freshFavoriteState = this.currentState;
        if (freshFavoriteState == null) {
            return;
        }
        t favoriteTokenizedEvent = freshFavoriteState.getIsFavorite() ? freshFavoriteState.getFavoriteTokenizedEvent() : freshFavoriteState.getUnfavoriteTokenizedEvent();
        if (favoriteTokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.tokenizedAnalytics, favoriteTokenizedEvent, null, 2, null);
        }
        boolean z11 = !freshFavoriteState.getIsFavorite();
        innerBind(FreshFavoriteState.copy$default(freshFavoriteState, null, z11, false, null, null, null, null, 125, null));
        requestFavoriteStateChange(z11);
    }

    private final void requestFavoriteStateChange(boolean targetFavoriteState) {
        B0 b02 = this.changeFavoriteStateJob;
        if (b02 != null) {
            b02.j(null);
        }
        M coroutineScope = getCoroutineScope();
        this.changeFavoriteStateJob = coroutineScope != null ? C10727i.c(coroutineScope, null, null, new FreshFavoriteDelegate$requestFavoriteStateChange$1(this, targetFavoriteState, null), 3) : null;
    }

    public static /* synthetic */ void setState$default(FreshFavoriteDelegate freshFavoriteDelegate, FreshFavoriteState freshFavoriteState, Boolean bool, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bool = null;
        }
        freshFavoriteDelegate.setState(freshFavoriteState, bool);
    }

    public final void onAttach(@NotNull AbstractC5434v lifecycle, @NotNull Function0<? extends M> coroutineScopeProvider, @NotNull Function0<C4911f> ownerProvider, @NotNull Function0<? extends FreshFavoriteProxy> viewProvider) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(ownerProvider, "ownerProvider");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        this.ownerProvider = ownerProvider;
        this.viewProvider = viewProvider;
        this.coroutineScopeProvider = coroutineScopeProvider;
        initFavoriteStateObserver(lifecycle, coroutineScopeProvider.invoke());
        initNotificationsObservers(lifecycle, coroutineScopeProvider.invoke());
        initAdultStateObserver(lifecycle, coroutineScopeProvider.invoke());
    }

    public final void onDetach() {
        this.currentState = null;
        B0 b02 = this.favoriteStateObserverJob;
        if (b02 != null) {
            b02.j(null);
        }
        B0 b03 = this.adultStateObserverJob;
        if (b03 != null) {
            b03.j(null);
        }
        B0 b04 = this.notificationsObserverJob;
        if (b04 != null) {
            b04.j(null);
        }
        B0 b05 = this.changeFavoriteStateJob;
        if (b05 != null) {
            b05.j(null);
        }
        this.favoriteStateObserverJob = null;
        this.adultStateObserverJob = null;
        this.notificationsObserverJob = null;
        this.changeFavoriteStateJob = null;
    }

    public final void setState(FreshFavoriteState state, Boolean forceFavoriteState) {
        FreshFavoriteState hydrateState = hydrateState(state, forceFavoriteState);
        if (Intrinsics.d(hydrateState, this.currentState)) {
            return;
        }
        innerBind(hydrateState);
    }
}
