package ru.ozon.app.android.favorites.domain.favoritemanager.eventmap;

import Kr.d;
import Nc.C3667a;
import Nl.a;
import io.reactivex.p;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteAdd;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R:\u0010\u0017\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004 \u0016*\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00150\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoritemanager/eventmap/FavoriteEventMapImpl;", "Lru/ozon/app/android/favorites/domain/favoritemanager/eventmap/FavoriteEventMap;", "<init>", "()V", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;", "event", "", "addEvent", "(Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;)V", "", "favoriteId", "Lio/reactivex/p;", "observeEvents", "(J)Lio/reactivex/p;", "", "getCurrentFavState", "(J)Ljava/lang/Boolean;", "", "eventsMap", "Ljava/util/Map;", "LNc/a;", "", "kotlin.jvm.PlatformType", "eventsSubject", "LNc/a;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoriteEventMapImpl implements FavoriteEventMap {

    @NotNull
    private final Map<Long, FavoriteEvent> eventsMap = new LinkedHashMap();

    @NotNull
    private final C3667a<Map<Long, FavoriteEvent>> eventsSubject;

    public FavoriteEventMapImpl() {
        C3667a<Map<Long, FavoriteEvent>> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.eventsSubject = d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean observeEvents$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FavoriteEvent observeEvents$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (FavoriteEvent) function1.invoke(p02);
    }

    @Override // ru.ozon.app.android.favorites.domain.favoritemanager.eventmap.FavoriteEventMap
    public synchronized void addEvent(@NotNull FavoriteEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.eventsMap.put(Long.valueOf(event.getSku()), event);
        this.eventsSubject.onNext(new HashMap(this.eventsMap));
    }

    @Override // ru.ozon.app.android.favorites.domain.favoritemanager.eventmap.FavoriteEventMap
    public Boolean getCurrentFavState(long favoriteId) {
        FavoriteEvent favoriteEvent = this.eventsMap.get(Long.valueOf(favoriteId));
        if (favoriteEvent != null) {
            return Boolean.valueOf(favoriteEvent instanceof FavoriteAdd);
        }
        return null;
    }

    @Override // ru.ozon.app.android.favorites.domain.favoritemanager.eventmap.FavoriteEventMap
    @NotNull
    public p<FavoriteEvent> observeEvents(long favoriteId) {
        p map = this.eventsSubject.filter(new a(new FavoriteEventMapImpl$observeEvents$1(favoriteId), 2)).map(new d(new FavoriteEventMapImpl$observeEvents$2(favoriteId), 3));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
