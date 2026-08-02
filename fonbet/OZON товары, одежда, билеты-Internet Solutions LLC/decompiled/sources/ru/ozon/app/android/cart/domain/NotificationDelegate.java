package ru.ozon.app.android.cart.domain;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.L;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.BaseActionHandler;
import ru.ozon.app.android.action.analytics.ActionUsageAnalyticsTracking;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
import ru.ozon.app.android.cart.domain.utils.CartNotificationDelegateAnalyticUtils;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/cart/domain/NotificationDelegate;", "", "Lru/ozon/app/android/composer/ConfiguratorReferences;", "references", "LPc/a;", "Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;", "addToCartProvider", "<init>", "(Lru/ozon/app/android/composer/ConfiguratorReferences;LPc/a;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "widgetId", "", "userToken", "", "processActionAddToCart", "(Lru/ozon/uni/atoms/af/AtomAction;JLjava/lang/String;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notificationDTO", "", "show", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "Lru/ozon/app/android/composer/ConfiguratorReferences;", "LPc/a;", "addToCartViewModel$delegate", "LSc/j;", "getAddToCartViewModel", "()Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;", "addToCartViewModel", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NotificationDelegate {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final a<AddToCartViewModel> addToCartProvider;

    /* renamed from: addToCartViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j addToCartViewModel;

    @NotNull
    private final ConfiguratorReferences references;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cart/domain/NotificationDelegate$Companion;", "", "<init>", "()V", "ADD_TO_CART_ACTION_ID", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public NotificationDelegate(@NotNull ConfiguratorReferences references, @NotNull a<AddToCartViewModel> addToCartProvider) {
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(addToCartProvider, "addToCartProvider");
        this.references = references;
        this.addToCartProvider = addToCartProvider;
        this.addToCartViewModel = k.b(new NotificationDelegate$addToCartViewModel$2(this));
    }

    private final AddToCartViewModel getAddToCartViewModel() {
        Object value = this.addToCartViewModel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AddToCartViewModel) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean processActionAddToCart(AtomAction action, long widgetId, String userToken) {
        if (!(action instanceof AtomAction.ComposerAction)) {
            return false;
        }
        AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
        if (!Intrinsics.d(composerAction.getId(), "addToCart")) {
            return false;
        }
        l tokenizedAnalytics = this.references.getTokenizedAnalytics();
        CartNotificationDelegateAnalyticUtils.INSTANCE.prepareAnalyticsToWidgetId(tokenizedAnalytics, widgetId, userToken);
        getAddToCartViewModel().attach(tokenizedAnalytics);
        getAddToCartViewModel().addToCart(composerAction.getParams(), Long.valueOf(widgetId));
        return true;
    }

    public final void show(@NotNull NotificationDTO notificationDTO) {
        NotificationLayoutManager asNotificationLayoutManager;
        Intrinsics.checkNotNullParameter(notificationDTO, "notificationDTO");
        ComponentCallbacksC5392m c11 = this.references.getOwnerContainer().c();
        View view = c11 != null ? c11.getView() : null;
        CoordinatorLayout coordinatorLayout = view instanceof CoordinatorLayout ? (CoordinatorLayout) view : null;
        if (coordinatorLayout == null || (asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(coordinatorLayout, 0)) == null) {
            return;
        }
        Rg.a a11 = this.references.getAnalyticsScreenStorage().a();
        String l11 = a11 != null ? a11.l() : null;
        if (l11 == null) {
            l11 = "";
        }
        String str = l11;
        L l12 = new L();
        CartNotificationDelegateAnalyticUtils cartNotificationDelegateAnalyticUtils = CartNotificationDelegateAnalyticUtils.INSTANCE;
        NotificationBar.Companion companion = NotificationBar.INSTANCE;
        r a12 = this.references.getOwnerContainer().a();
        if (a12 == null) {
            return;
        }
        NotificationBar make = companion.make(asNotificationLayoutManager, notificationDTO, a12, BaseActionHandler.Builder.INSTANCE.invoke(this.references.getNavigator(), new ActionUsageAnalyticsTracking.ByComponentStorage(this.references.getComposerWidgetComponentStorage())).onPreProcess(new NotificationDelegate$show$1(l12, this, str)).buildHandler());
        l12.f71786a = make.hashCode();
        l tokenizedAnalytics = this.references.getTokenizedAnalytics();
        long j11 = l12.f71786a;
        CommonControlSettings common = notificationDTO.getCommon();
        cartNotificationDelegateAnalyticUtils.setTrackingViewEvent(make, tokenizedAnalytics, j11, str, common != null ? common.getTrackingInfo() : null).show();
    }
}
