package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.wishlist;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.InterfaceC4008j;
import Sc.o;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEvent;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEvent$Result$ActionResult;
import ru.ozon.app.android.product.tiles.tilegrid2.domain.wishlist.WishlistTileKey;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.domain.wishlist.WishlistService;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.domain.wishlist.WishlistUpdate;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/wishlist/WishlistSubscriber;", "", "LSc/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/domain/wishlist/WishlistService;", "wishlistServiceLazy", "Lkotlin/Function1;", "", "", "onEvent", "<init>", "(LSc/j;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/domain/wishlist/WishlistUpdate;", "event", "shouldShowOverlay", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/domain/wishlist/WishlistUpdate;)Z", "Landroidx/lifecycle/B;", "viewHolderScope", "Landroidx/lifecycle/J;", "viewLifecycleOwner", "Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;", "wishlistKey", "subscribeIfNeed", "(Landroidx/lifecycle/B;Landroidx/lifecycle/J;Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;)V", "Lkotlin/jvm/functions/Function1;", "wishlistService$delegate", "LSc/j;", "getWishlistService", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/domain/wishlist/WishlistService;", "wishlistService", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WishlistSubscriber {

    @NotNull
    private final Function1<Boolean, Unit> onEvent;

    /* renamed from: wishlistService$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j wishlistService;

    /* JADX WARN: Multi-variable type inference failed */
    public WishlistSubscriber(@NotNull InterfaceC4008j<? extends WishlistService> wishlistServiceLazy, @NotNull Function1<? super Boolean, Unit> onEvent) {
        Intrinsics.checkNotNullParameter(wishlistServiceLazy, "wishlistServiceLazy");
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        this.onEvent = onEvent;
        this.wishlistService = wishlistServiceLazy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WishlistService getWishlistService() {
        return (WishlistService) this.wishlistService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldShowOverlay(WishlistUpdate event) {
        if (!(event instanceof WishlistUpdate.Event)) {
            if (Intrinsics.d(event, WishlistUpdate.EventsCleared.INSTANCE)) {
                return false;
            }
            throw new o();
        }
        WishlistUpdate.Event event2 = (WishlistUpdate.Event) event;
        WishlistEvent event3 = event2.getEvent();
        if (event3 instanceof WishlistEvent.ProductRemovalStarted) {
            return true;
        }
        if (event3 instanceof WishlistEvent.ProductRemoved) {
            return ((WishlistEvent.ProductRemoved) event2.getEvent()).getResult() == WishlistEvent$Result$ActionResult.SUCCEED;
        }
        if (event3 instanceof WishlistEvent.ProductAdditionStarted) {
            return false;
        }
        if (event3 instanceof WishlistEvent.ProductAdded) {
            return ((WishlistEvent.ProductAdded) event2.getEvent()).getResult() != WishlistEvent$Result$ActionResult.SUCCEED;
        }
        throw new o();
    }

    public final void subscribeIfNeed(@NotNull B viewHolderScope, @NotNull J viewLifecycleOwner, WishlistTileKey wishlistKey) {
        Intrinsics.checkNotNullParameter(viewHolderScope, "viewHolderScope");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        if (wishlistKey == null) {
            return;
        }
        C2399j.C(new C2408n0(getWishlistService().subscribeToEvents(wishlistKey), new WishlistSubscriber$subscribeIfNeed$1(this, null)), viewHolderScope);
        final AbstractC5434v lifecycle = viewLifecycleOwner.getLifecycle();
        if (lifecycle.b().a(AbstractC5434v.b.CREATED)) {
            getWishlistService().start();
        } else {
            lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.wishlist.WishlistSubscriber$subscribeIfNeed$$inlined$whenCreated$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onCreate(J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    this.getWishlistService().start();
                    AbstractC5434v.this.e(this);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    AbstractC5434v.this.e(this);
                }
            });
        }
        final AbstractC5434v lifecycle2 = viewLifecycleOwner.getLifecycle();
        if (lifecycle2.b() == AbstractC5434v.b.DESTROYED) {
            getWishlistService().stop();
        } else {
            lifecycle2.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.wishlist.WishlistSubscriber$subscribeIfNeed$$inlined$whenDestroyed$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    this.getWishlistService().stop();
                    AbstractC5434v.this.e(this);
                }
            });
        }
    }
}
