package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import De.s;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import WZ.l;
import Wc.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.domain.eventBus.RemoveFromFavoritesEventBus;
import ru.ozon.app.android.favorites.domain.notification.NotificationDelegate;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.FavProductButtonPresenter;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavProductButtonView;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.MessengerProductFavoriteButtonViewHolder;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import xe.B0;
import xe.C10720e0;
import xe.E0;
import xe.H0;
import xe.J;
import xe.L;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 X2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001XBO\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u0016J\u000f\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u0010H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010\u001dJ)\u0010*\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020'2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u0010H\u0016¢\u0006\u0004\b-\u0010\u0016J\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u0010H\u0016¢\u0006\u0004\b.\u0010\u0016J\u001f\u00102\u001a\u00020\u000e2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u001fH\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\n\u0018\u000104j\u0004\u0018\u0001`5H\u0016¢\u0006\u0004\b6\u00107J\u0011\u00108\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b8\u0010\u0019J\u0017\u0010;\u001a\u00020\u000e2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u000e2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b=\u0010<J\u0017\u0010>\u001a\u00020\u000e2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b>\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010AR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010BR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010CR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR0\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bS\u0010C\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/MessengerFavoriteDelegateImpl;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavProductButtonView;", "Landroidx/fragment/app/m;", "containerFragment", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/FavProductButtonPresenter;", "favoriteProductButtonPresenter", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/utils/AppType;", "appType", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "processEvents", "<init>", "(Landroidx/fragment/app/m;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/FavProductButtonPresenter;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/utils/AppType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "molecule", "trackAnalyticsViewEventIfNeed", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;)V", "Lru/ozon/app/android/favorites/domain/notification/NotificationDelegate;", "createNotificationDelegate", "()Lru/ozon/app/android/favorites/domain/notification/NotificationDelegate;", "model", "updateLocalFavStateIfNeeded", "showError", "()V", "subscribeToRemoveFromFavoritesEvent", "", "hasSelectionAction", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;)Z", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "button", "attachFavButtonView", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;)V", "detachFavButtonView", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "bindFavoriteProductButton", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "favoriteProductMolecule", "bindFavButtonOnError", "favStateSuccefullyChanged", "", "sku", "favState", "handleMoleculeStateUpdate", "(JZ)V", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "getNotificationDelegate", "Landroidx/lifecycle/J;", "owner", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "onDestroy", "Landroidx/fragment/app/m;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/FavProductButtonPresenter;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/utils/AppType;", "Lkotlin/jvm/functions/Function1;", "moleculeLink", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/MessengerProductFavoriteButtonViewHolder;", "favButtonViewHolder$delegate", "LSc/j;", "getFavButtonViewHolder", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/MessengerProductFavoriteButtonViewHolder;", "favButtonViewHolder", "notificationDelegate", "Lru/ozon/app/android/favorites/domain/notification/NotificationDelegate;", "Lxe/M;", "scope", "Lxe/M;", "needLocalFavStateUpdate", "Z", "onFavoriteClick", "getOnFavoriteClick", "()Lkotlin/jvm/functions/Function1;", "setOnFavoriteClick", "(Lkotlin/jvm/functions/Function1;)V", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MessengerFavoriteDelegateImpl implements FavoriteProductDelegate, DefaultLifecycleObserver, FavProductButtonView {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final AppType appType;

    @NotNull
    private final ComponentCallbacksC5392m containerFragment;

    /* renamed from: favButtonViewHolder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j favButtonViewHolder;

    @NotNull
    private final FavProductButtonPresenter favoriteProductButtonPresenter;
    private FavoriteProductMolecule moleculeLink;
    private boolean needLocalFavStateUpdate;
    private NotificationDelegate notificationDelegate;
    private Function1<? super Boolean, Unit> onFavoriteClick;

    @NotNull
    private final Function1<FavoriteProductMolecule, Unit> processEvents;

    @NotNull
    private final M scope;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "molecule", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.MessengerFavoriteDelegateImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<FavoriteProductMolecule, Unit> {

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.MessengerFavoriteDelegateImpl$1$1, reason: invalid class name and collision with other inner class name */
        static final class C17691 extends AbstractC7737t implements Function1<Map<String, ? extends TokenizedTrackingInfo>, Unit> {
            final /* synthetic */ FavoriteProductMolecule $molecule;
            final /* synthetic */ MessengerFavoriteDelegateImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17691(MessengerFavoriteDelegateImpl messengerFavoriteDelegateImpl, FavoriteProductMolecule favoriteProductMolecule) {
                super(1);
                this.this$0 = messengerFavoriteDelegateImpl;
                this.$molecule = favoriteProductMolecule;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends TokenizedTrackingInfo> map) {
                invoke2((Map<String, TokenizedTrackingInfo>) map);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Map<String, TokenizedTrackingInfo> map) {
                this.this$0.processEvents.invoke(this.$molecule);
            }
        }

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FavoriteProductMolecule favoriteProductMolecule) {
            invoke2(favoriteProductMolecule);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FavoriteProductMolecule molecule) {
            Intrinsics.checkNotNullParameter(molecule, "molecule");
            MessengerFavoriteDelegateImpl.this.favoriteProductButtonPresenter.onFavoriteChanged(molecule, new C17691(MessengerFavoriteDelegateImpl.this, molecule));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/MessengerFavoriteDelegateImpl$Companion;", "", "<init>", "()V", "SAVED_SELECTION_ID", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessengerFavoriteDelegateImpl(@NotNull ComponentCallbacksC5392m containerFragment, @NotNull FavProductButtonPresenter favoriteProductButtonPresenter, @NotNull AdultHandler adultHandler, @NotNull AppType appType, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super FavoriteProductMolecule, Unit> processEvents) {
        Intrinsics.checkNotNullParameter(containerFragment, "containerFragment");
        Intrinsics.checkNotNullParameter(favoriteProductButtonPresenter, "favoriteProductButtonPresenter");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(processEvents, "processEvents");
        this.containerFragment = containerFragment;
        this.favoriteProductButtonPresenter = favoriteProductButtonPresenter;
        this.adultHandler = adultHandler;
        this.appType = appType;
        this.actionHandler = actionHandler;
        this.processEvents = processEvents;
        this.favButtonViewHolder = k.a(n.NONE, new MessengerFavoriteDelegateImpl$favButtonViewHolder$2(this));
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        CoroutineContext d11 = CoroutineContext.Element.a.d(s.f6650a.x(), (H0) b11);
        Intrinsics.checkNotNullExpressionValue("MessengerFavoriteDelegateImpl", "getSimpleName(...)");
        this.scope = N.a(d11.plus(new L("MessengerFavoriteDelegateImpl")).plus(new MessengerFavoriteDelegateImpl$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
        favoriteProductButtonPresenter.attachView(this);
        getFavButtonViewHolder().setOnButtonChanged(new AnonymousClass1());
    }

    private final NotificationDelegate createNotificationDelegate() {
        View view = this.containerFragment.getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return null;
        }
        androidx.lifecycle.J viewLifecycleOwner = this.containerFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return new NotificationDelegate(viewGroup, viewLifecycleOwner, this.actionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MessengerProductFavoriteButtonViewHolder getFavButtonViewHolder() {
        return (MessengerProductFavoriteButtonViewHolder) this.favButtonViewHolder.getValue();
    }

    private final boolean hasSelectionAction(FavoriteProductMolecule favoriteProductMolecule) {
        AtomActionDTO action = FavoriteProductMoleculeKt.getButton(favoriteProductMolecule).getAction();
        return Intrinsics.d(action != null ? action.getLink() : null, "addOrDeleteSavedSelection");
    }

    private final void showError() {
        ViewGroup rootView = ContextExtKt.getRootView(this.containerFragment);
        if (rootView != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            androidx.lifecycle.J viewLifecycleOwner = this.containerFragment.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            FlashbarFactory.createDefaultError$default(flashbarFactory, rootView, null, null, null, null, null, viewLifecycleOwner, 62, null).show();
        }
    }

    private final void subscribeToRemoveFromFavoritesEvent() {
        final Ae.B0<Long> flow = RemoveFromFavoritesEventBus.INSTANCE.getFlow();
        C2399j.C(new C2408n0(new InterfaceC2395h<Long>() { // from class: ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.MessengerFavoriteDelegateImpl$subscribeToRemoveFromFavoritesEvent$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.MessengerFavoriteDelegateImpl$subscribeToRemoveFromFavoritesEvent$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ MessengerFavoriteDelegateImpl this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.MessengerFavoriteDelegateImpl$subscribeToRemoveFromFavoritesEvent$$inlined$filter$1$2", f = "MessengerFavoriteDelegateImpl.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.MessengerFavoriteDelegateImpl$subscribeToRemoveFromFavoritesEvent$$inlined$filter$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, MessengerFavoriteDelegateImpl messengerFavoriteDelegateImpl) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = messengerFavoriteDelegateImpl;
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
                    FavoriteProductMolecule favoriteProductMolecule;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                Sc.s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                long longValue = ((Number) obj).longValue();
                                favoriteProductMolecule = this.this$0.moleculeLink;
                                if (favoriteProductMolecule != null && longValue == favoriteProductMolecule.getSku()) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Sc.s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super Long> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new MessengerFavoriteDelegateImpl$subscribeToRemoveFromFavoritesEvent$2(this, null)), this.scope);
    }

    private final void trackAnalyticsViewEventIfNeed(FavoriteProductMolecule molecule) {
        if (molecule != null && hasSelectionAction(molecule)) {
            this.processEvents.invoke(molecule);
        }
    }

    private final void updateLocalFavStateIfNeeded(FavoriteProductMolecule model) {
        FavoriteProductMolecule currentFavState;
        if (!this.needLocalFavStateUpdate || model == null || (currentFavState = this.favoriteProductButtonPresenter.getCurrentFavState(model)) == null || currentFavState.isFavorite() == model.isFavorite()) {
            return;
        }
        this.favoriteProductButtonPresenter.shareMoleculeUpdateState(model);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void attachFavButtonView(@NotNull ProductFavoriteMoleculeButtonView button) {
        Intrinsics.checkNotNullParameter(button, "button");
        getFavButtonViewHolder().attachButton(button);
        subscribeToRemoveFromFavoritesEvent();
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavProductButtonView
    public void bindFavButtonOnError(@NotNull FavoriteProductMolecule favoriteProductMolecule) {
        Intrinsics.checkNotNullParameter(favoriteProductMolecule, "favoriteProductMolecule");
        getFavButtonViewHolder().rebindData(favoriteProductMolecule, true);
        showError();
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void bindFavoriteProductButton(@NotNull FavoriteButton button, FavoriteProductMolecule molecule, @NotNull AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        updateLocalFavStateIfNeeded(molecule);
        FavoriteProductMolecule currentFavState = this.favoriteProductButtonPresenter.getCurrentFavState(molecule);
        this.notificationDelegate = createNotificationDelegate();
        this.moleculeLink = currentFavState;
        getFavButtonViewHolder().bindButton(button, currentFavState, analyticData.getViewItem());
        this.favoriteProductButtonPresenter.resubscribe(currentFavState);
        trackAnalyticsViewEventIfNeed(currentFavState);
        this.needLocalFavStateUpdate = false;
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void detachFavButtonView() {
        getFavButtonViewHolder().detachButton();
        E0.d(this.scope.getCoroutineContext());
        this.notificationDelegate = null;
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavProductButtonView
    public void favStateSuccefullyChanged(@NotNull FavoriteProductMolecule favoriteProductMolecule) {
        Intrinsics.checkNotNullParameter(favoriteProductMolecule, "favoriteProductMolecule");
        FavoriteProductMolecule favoriteProductMolecule2 = this.moleculeLink;
        if (favoriteProductMolecule2 != null) {
            favoriteProductMolecule2.setFavorite(favoriteProductMolecule.isFavorite());
        }
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavProductButtonView
    public NotificationDelegate getNotificationDelegate() {
        return this.notificationDelegate;
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavProductButtonView
    public l getTokenizedAnalytics() {
        return null;
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavProductButtonView
    public void handleMoleculeStateUpdate(long sku, boolean favState) {
        FavoriteProductMolecule favoriteProductMolecule;
        FavoriteProductMolecule favoriteProductMolecule2 = this.moleculeLink;
        if ((favoriteProductMolecule2 == null || favoriteProductMolecule2.isFavorite() != favState) && (favoriteProductMolecule = this.moleculeLink) != null && favoriteProductMolecule.getSku() == sku) {
            FavoriteProductMolecule favoriteProductMolecule3 = this.moleculeLink;
            if (favoriteProductMolecule3 != null) {
                favoriteProductMolecule3.setFavorite(favState);
            }
            MessengerProductFavoriteButtonViewHolder.rebindData$default(getFavButtonViewHolder(), this.moleculeLink, false, 2, null);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull androidx.lifecycle.J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.favoriteProductButtonPresenter.dispose();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull androidx.lifecycle.J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.favoriteProductButtonPresenter.resubscribe(this.moleculeLink);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull androidx.lifecycle.J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.favoriteProductButtonPresenter.clearDisposables();
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void setOnFavoriteClick(Function1<? super Boolean, Unit> function1) {
        this.onFavoriteClick = function1;
    }
}
