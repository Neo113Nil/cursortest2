package ru.ozon.app.android.seller.molecule.sisbrandfavorite.v2;

import Ae.C2399j;
import Ae.C2408n0;
import Tg.b;
import Vg.e;
import a00.C4911f;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.I;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.SisBrandFavoriteInteractor;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.data.SisBrandFavoriteButton;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation.SisBrandFavoriteButtonDelegate;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation.SisBrandFavoriteButtonView;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001c\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\"R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/seller/molecule/sisbrandfavorite/v2/ComposeSisBrandFavoriteButtonDelegateImpl;", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonDelegate;", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonView;", "view", "Landroidx/lifecycle/J;", "lifecycleOwner", "La00/f;", "ownerContainer", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/SisBrandFavoriteInteractor;", "sisBrandFavoriteInteractor", "Lru/ozon/app/android/action/WidgetActionHandlerBuilder;", "actionHandlerBuilder", "<init>", "(Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonView;Landroidx/lifecycle/J;La00/f;Lru/ozon/app/android/seller/molecule/sisbrandfavorite/SisBrandFavoriteInteractor;LVg/e$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "button", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bindButton", "(Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notification", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;)V", "Lkotlin/Function0;", "updateColorsOnScroll", "bind", "(Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonView;", "Landroidx/lifecycle/J;", "La00/f;", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/SisBrandFavoriteInteractor;", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "LTg/b;", "Lkotlin/jvm/functions/Function1;", "Landroidx/lifecycle/I;", "subscriberLifecycleObserver", "Landroidx/lifecycle/I;", "seller_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposeSisBrandFavoriteButtonDelegateImpl implements SisBrandFavoriteButtonDelegate {

    @NotNull
    private final Function1<b, Unit> actionHandler;
    private SisBrandFavoriteButton button;

    @NotNull
    private final J lifecycleOwner;

    @NotNull
    private final C4911f ownerContainer;

    @NotNull
    private final SisBrandFavoriteInteractor sisBrandFavoriteInteractor;
    private I subscriberLifecycleObserver;

    @NotNull
    private final SisBrandFavoriteButtonView view;

    public /* synthetic */ ComposeSisBrandFavoriteButtonDelegateImpl(SisBrandFavoriteButtonView sisBrandFavoriteButtonView, J j11, C4911f c4911f, SisBrandFavoriteInteractor sisBrandFavoriteInteractor, e.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(sisBrandFavoriteButtonView, j11, c4911f, sisBrandFavoriteInteractor, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindButton(SisBrandFavoriteButton button, Function1<? super AtomAction, Unit> actionHandler) {
        this.view.bind(button.isFavorite() ? button.getUnfavoriteButton() : button.getFavoriteButton(), button.isFavorite(), actionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(NotificationModelWrapper notification) {
        NotificationLayoutManager asNotificationLayoutManager$default;
        ComponentCallbacksC5392m c11 = this.ownerContainer.c();
        View view = c11 != null ? c11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(viewGroup, null, 1, null)) == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, notification, this.ownerContainer.g(), this.actionHandler).show();
    }

    @Override // ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation.SisBrandFavoriteButtonDelegate
    public void bind(final SisBrandFavoriteButton button, final Function0<Unit> updateColorsOnScroll) {
        this.button = button;
        I i11 = this.subscriberLifecycleObserver;
        if (i11 != null) {
            this.lifecycleOwner.getLifecycle().e(i11);
        }
        if (button == null) {
            ViewExtKt.gone(this.view);
            this.subscriberLifecycleObserver = null;
            return;
        }
        ViewExtKt.show(this.view);
        bindButton(button, this.actionHandler);
        DefaultLifecycleObserver defaultLifecycleObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.seller.molecule.sisbrandfavorite.v2.ComposeSisBrandFavoriteButtonDelegateImpl$bind$2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onCreate(J owner) {
                SisBrandFavoriteInteractor sisBrandFavoriteInteractor;
                Intrinsics.checkNotNullParameter(owner, "owner");
                sisBrandFavoriteInteractor = ComposeSisBrandFavoriteButtonDelegateImpl.this.sisBrandFavoriteInteractor;
                C2399j.C(new C2408n0(sisBrandFavoriteInteractor.observeState(button.getId(), button.getMoleculeType()), new ComposeSisBrandFavoriteButtonDelegateImpl$bind$2$onCreate$1(button, ComposeSisBrandFavoriteButtonDelegateImpl.this, updateColorsOnScroll, null)), K.a(owner));
            }
        };
        this.lifecycleOwner.getLifecycle().a(defaultLifecycleObserver);
        this.subscriberLifecycleObserver = defaultLifecycleObserver;
    }

    private ComposeSisBrandFavoriteButtonDelegateImpl(SisBrandFavoriteButtonView view, J lifecycleOwner, C4911f ownerContainer, SisBrandFavoriteInteractor sisBrandFavoriteInteractor, e.a actionHandlerBuilder) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(ownerContainer, "ownerContainer");
        Intrinsics.checkNotNullParameter(sisBrandFavoriteInteractor, "sisBrandFavoriteInteractor");
        Intrinsics.checkNotNullParameter(actionHandlerBuilder, "actionHandlerBuilder");
        this.view = view;
        this.lifecycleOwner = lifecycleOwner;
        this.ownerContainer = ownerContainer;
        this.sisBrandFavoriteInteractor = sisBrandFavoriteInteractor;
        this.actionHandler = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m476onPreProcessDnHbjWo(actionHandlerBuilder, new ComposeSisBrandFavoriteButtonDelegateImpl$actionHandler$1(this)));
    }
}
