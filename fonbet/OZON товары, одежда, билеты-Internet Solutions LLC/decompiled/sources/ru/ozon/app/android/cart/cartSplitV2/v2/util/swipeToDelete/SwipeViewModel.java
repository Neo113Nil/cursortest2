package ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.coordinator.GroupSwipeCoordinator;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ze.EnumC11113a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/SwipeViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/coordinator/GroupSwipeCoordinator;", "swipeGroupCoordinator", "<init>", "(Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/coordinator/GroupSwipeCoordinator;)V", "", "groupId", "", "triggerFavoriteClick", "(Ljava/lang/String;)V", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/coordinator/GroupSwipeCoordinator;", "getSwipeGroupCoordinator", "()Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/coordinator/GroupSwipeCoordinator;", "LAe/w0;", "_swipeFavoriteClick", "LAe/w0;", "LAe/B0;", "swipeFavoriteClick", "LAe/B0;", "getSwipeFavoriteClick", "()LAe/B0;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SwipeViewModel extends w0 {

    @NotNull
    private final Ae.w0<String> _swipeFavoriteClick;

    @NotNull
    private final HandlersInhibitor handlersInhibitor;

    @NotNull
    private final B0<String> swipeFavoriteClick;

    @NotNull
    private final GroupSwipeCoordinator swipeGroupCoordinator;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/SwipeViewModel$Companion;", "", "<init>", "()V", "THROTTLE_TIME", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SwipeViewModel(@NotNull HandlersInhibitor handlersInhibitor, @NotNull GroupSwipeCoordinator swipeGroupCoordinator) {
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(swipeGroupCoordinator, "swipeGroupCoordinator");
        this.handlersInhibitor = handlersInhibitor;
        this.swipeGroupCoordinator = swipeGroupCoordinator;
        C0 a11 = E0.a(0, 1, EnumC11113a.DROP_OLDEST);
        this._swipeFavoriteClick = a11;
        this.swipeFavoriteClick = C2399j.a(a11);
    }

    @NotNull
    public final B0<String> getSwipeFavoriteClick() {
        return this.swipeFavoriteClick;
    }

    @NotNull
    public final GroupSwipeCoordinator getSwipeGroupCoordinator() {
        return this.swipeGroupCoordinator;
    }

    public final void triggerFavoriteClick(@NotNull String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.handlersInhibitor.run(300L, new SwipeViewModel$triggerFavoriteClick$1(this, groupId));
    }
}
