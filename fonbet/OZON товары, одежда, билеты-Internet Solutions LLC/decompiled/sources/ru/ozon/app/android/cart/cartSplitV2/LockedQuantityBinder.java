package ru.ozon.app.android.cart.cartSplitV2;

import A00.a;
import AW.b;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.presentation.throttleNotificationHandler.CartThrottleNotificationHandler;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 )2\u00020\u0001:\u0001)B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010!¨\u0006*"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/LockedQuantityBinder;", "", "Landroidx/constraintlayout/widget/ConstraintLayout;", "root", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/cart/common/presentation/throttleNotificationHandler/CartThrottleNotificationHandler;", "cartThrottleNotificationHandler", "", "inSubWidget", "<init>", "(Landroidx/constraintlayout/widget/ConstraintLayout;Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/cart/common/presentation/throttleNotificationHandler/CartThrottleNotificationHandler;Z)V", "Landroid/view/View;", "getOrCreateView", "()Landroid/view/View;", "observeRefreshEvents", "()V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Lru/ozon/uni/android/notificationbar/NotificationBar;", "createNotificationBar", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)Lru/ozon/uni/android/notificationbar/NotificationBar;", "notification", "bind", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "clear", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cart/common/presentation/throttleNotificationHandler/CartThrottleNotificationHandler;", "Z", "LA00/a;", "composerEventsObserver", "view", "Landroid/view/View;", "model", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "dismissNotificationAfterRefresh", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LockedQuantityBinder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final CartThrottleNotificationHandler cartThrottleNotificationHandler;

    @NotNull
    private final Function1<a, Unit> composerEventsObserver;
    private boolean dismissNotificationAfterRefresh;
    private final boolean inSubWidget;
    private NotificationDTO model;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final ConstraintLayout root;
    private View view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/LockedQuantityBinder$Companion;", "", "<init>", "()V", "DEFAULT_HIDE_DELAY_SECOND", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LockedQuantityBinder(@NotNull ConstraintLayout root, @NotNull ComposerReferences refs, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull CartThrottleNotificationHandler cartThrottleNotificationHandler, boolean z11) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(cartThrottleNotificationHandler, "cartThrottleNotificationHandler");
        this.root = root;
        this.refs = refs;
        this.actionHandler = actionHandler;
        this.cartThrottleNotificationHandler = cartThrottleNotificationHandler;
        this.inSubWidget = z11;
        this.composerEventsObserver = new LockedQuantityBinder$composerEventsObserver$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(LockedQuantityBinder lockedQuantityBinder, NotificationDTO notificationDTO, View view) {
        NotificationBar createNotificationBar = lockedQuantityBinder.createNotificationBar(notificationDTO);
        if (createNotificationBar != null) {
            Integer autoHideDelay = notificationDTO.getAutoHideDelay();
            lockedQuantityBinder.cartThrottleNotificationHandler.show(notificationDTO.hashCode(), createNotificationBar, (autoHideDelay != null ? autoHideDelay.intValue() : 5) * 1000);
        }
    }

    private final NotificationBar createNotificationBar(NotificationDTO notificationDTO) {
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        View view = c11 != null ? c11.getView() : null;
        CoordinatorLayout coordinatorLayout = view instanceof CoordinatorLayout ? (CoordinatorLayout) view : null;
        if (coordinatorLayout != null) {
            View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(coordinatorLayout, NotificationBarKt.isAboveBottomWidgets(notificationDTO));
            NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(coordinatorLayout, Integer.valueOf(composerNotificationBottomAnchor != null ? composerNotificationBottomAnchor.getId() : 0));
            if (asNotificationLayoutManager != null) {
                return NotificationBar.INSTANCE.make(asNotificationLayoutManager, notificationDTO, this.refs.getContainer().g(), this.actionHandler);
            }
        }
        return null;
    }

    private final View getOrCreateView() {
        View view = this.view;
        if (view != null) {
            return view;
        }
        View view2 = new View(this.root.getContext());
        view2.setId(R$id.lockedQuantityFl);
        view2.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        view2.setClickable(true);
        this.view = view2;
        this.root.addView(view2);
        ConstraintLayoutExtKt.updateConstraints(this.root, new LockedQuantityBinder$getOrCreateView$2$1(this, view2));
        return view2;
    }

    private final void observeRefreshEvents() {
        this.refs.getController().getEvents().observe(this.refs.getContainer().g(), new LockedQuantityBinder$sam$androidx_lifecycle_Observer$0(this.composerEventsObserver));
    }

    public final void bind(@NotNull NotificationDTO notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        View orCreateView = getOrCreateView();
        observeRefreshEvents();
        if (Intrinsics.d(this.model, notification)) {
            return;
        }
        orCreateView.setOnClickListener(new b(4, this, notification));
        this.model = notification;
    }

    public final void clear() {
        ViewExtKt.removeSelf(this.view);
        this.view = null;
        this.model = null;
    }

    public /* synthetic */ LockedQuantityBinder(ConstraintLayout constraintLayout, ComposerReferences composerReferences, Function1 function1, CartThrottleNotificationHandler cartThrottleNotificationHandler, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(constraintLayout, composerReferences, function1, cartThrottleNotificationHandler, (i11 & 16) != 0 ? false : z11);
    }
}
