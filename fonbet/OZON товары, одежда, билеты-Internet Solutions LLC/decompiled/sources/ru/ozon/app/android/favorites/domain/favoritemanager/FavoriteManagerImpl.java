package ru.ozon.app.android.favorites.domain.favoritemanager;

import Ae.InterfaceC2395h;
import Ge.n;
import Nc.C3667a;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.favoritemanager.eventmap.FavoriteEventMap;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteAdd;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteRemove;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u000f0\u000f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManagerImpl;", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "Lru/ozon/app/android/favorites/domain/favoritemanager/eventmap/FavoriteEventMap;", "favoriteEventMap", "<init>", "(Lru/ozon/app/android/favorites/domain/favoritemanager/eventmap/FavoriteEventMap;)V", "", "favoriteId", "", "changeSourceId", "", "addFavorite", "(JLjava/lang/Integer;)V", "removeFromFavorites", "Lio/reactivex/p;", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;", "onFavoriteChange", "()Lio/reactivex/p;", "LAe/h;", "onFavoriteChangeFlow", "()LAe/h;", "(J)Lio/reactivex/p;", "", "getCurrentFavState", "(J)Ljava/lang/Boolean;", "Lru/ozon/app/android/favorites/domain/favoritemanager/eventmap/FavoriteEventMap;", "LNc/a;", "kotlin.jvm.PlatformType", "favoriteChangeEvent", "LNc/a;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoriteManagerImpl implements FavoriteManager {

    @NotNull
    private final C3667a<FavoriteEvent> favoriteChangeEvent;

    @NotNull
    private final FavoriteEventMap favoriteEventMap;

    public FavoriteManagerImpl(@NotNull FavoriteEventMap favoriteEventMap) {
        Intrinsics.checkNotNullParameter(favoriteEventMap, "favoriteEventMap");
        this.favoriteEventMap = favoriteEventMap;
        C3667a<FavoriteEvent> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.favoriteChangeEvent = d11;
    }

    @Override // ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager
    public synchronized void addFavorite(long favoriteId, Integer changeSourceId) {
        FavoriteAdd favoriteAdd = new FavoriteAdd(favoriteId, changeSourceId);
        this.favoriteChangeEvent.onNext(favoriteAdd);
        this.favoriteEventMap.addEvent(favoriteAdd);
    }

    @Override // ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager
    public Boolean getCurrentFavState(long favoriteId) {
        return this.favoriteEventMap.getCurrentFavState(favoriteId);
    }

    @Override // ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager
    @NotNull
    public p<FavoriteEvent> onFavoriteChange() {
        return this.favoriteChangeEvent;
    }

    @Override // ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager
    @NotNull
    public InterfaceC2395h<FavoriteEvent> onFavoriteChangeFlow() {
        return n.a(this.favoriteChangeEvent);
    }

    @Override // ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager
    public synchronized void removeFromFavorites(long favoriteId, Integer changeSourceId) {
        FavoriteRemove favoriteRemove = new FavoriteRemove(favoriteId, changeSourceId);
        this.favoriteChangeEvent.onNext(favoriteRemove);
        this.favoriteEventMap.addEvent(favoriteRemove);
    }

    @Override // ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager
    @NotNull
    public p<FavoriteEvent> onFavoriteChange(long favoriteId) {
        return this.favoriteEventMap.observeEvents(favoriteId);
    }
}
