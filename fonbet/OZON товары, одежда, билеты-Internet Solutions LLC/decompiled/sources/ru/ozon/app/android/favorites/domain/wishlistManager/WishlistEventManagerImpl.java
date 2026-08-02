package ru.ozon.app.android.favorites.domain.wishlistManager;

import Ae.B0;
import Ae.C0;
import Ae.E0;
import Ae.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEventManagerImpl;", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEventManager;", "<init>", "()V", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent;", "event", "", "onWishlistChanged", "(Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEvent;)V", "LAe/w0;", "_wishlistEvents", "LAe/w0;", "LAe/B0;", "wishlistEvents", "LAe/B0;", "getWishlistEvents", "()LAe/B0;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WishlistEventManagerImpl implements WishlistEventManager {

    @NotNull
    private final w0<WishlistEvent> _wishlistEvents;

    @NotNull
    private final B0<WishlistEvent> wishlistEvents;

    public WishlistEventManagerImpl() {
        C0 a11 = E0.a(0, 1, EnumC11113a.DROP_OLDEST);
        this._wishlistEvents = a11;
        this.wishlistEvents = a11;
    }

    @Override // ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEventManager
    @NotNull
    public B0<WishlistEvent> getWishlistEvents() {
        return this.wishlistEvents;
    }

    @Override // ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEventManager
    public void onWishlistChanged(@NotNull WishlistEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this._wishlistEvents.tryEmit(event);
    }
}
