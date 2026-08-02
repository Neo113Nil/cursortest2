package ru.ozon.app.android.favorites.domain.eventmanager;

import Nc.C3669c;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEvent;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00130\u00130\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "", "<init>", "()V", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent$FavoriteStateUpdated;", "event", "", "onFavStateUpdated", "(Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent$FavoriteStateUpdated;)V", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent$FavoriteEntityUpdated;", "onFavEntityStateUpdated", "(Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent$FavoriteEntityUpdated;)V", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent$OnFavoriteListEdited;", "onFavListEdited", "(Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent$OnFavoriteListEdited;)V", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent$OnFavoriteWishlistEdited;", "onFavWishlistEdited", "(Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent$OnFavoriteWishlistEdited;)V", "Lio/reactivex/p;", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent;", "events", "()Lio/reactivex/p;", "LNc/c;", "kotlin.jvm.PlatformType", "LNc/c;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoriteEventManager {

    @NotNull
    private final C3669c<FavoriteEvent> events;

    public FavoriteEventManager() {
        C3669c<FavoriteEvent> d11 = C3669c.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.events = d11;
    }

    @NotNull
    public final p<FavoriteEvent> events() {
        p<FavoriteEvent> hide = this.events.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "hide(...)");
        return hide;
    }

    public final void onFavEntityStateUpdated(@NotNull FavoriteEvent.FavoriteEntityUpdated event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.events.onNext(event);
    }

    public final void onFavListEdited(@NotNull FavoriteEvent.OnFavoriteListEdited event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.events.onNext(event);
    }

    public final void onFavStateUpdated(@NotNull FavoriteEvent.FavoriteStateUpdated event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.events.onNext(event);
    }

    public final void onFavWishlistEdited(@NotNull FavoriteEvent.OnFavoriteWishlistEdited event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.events.onNext(event);
    }
}
