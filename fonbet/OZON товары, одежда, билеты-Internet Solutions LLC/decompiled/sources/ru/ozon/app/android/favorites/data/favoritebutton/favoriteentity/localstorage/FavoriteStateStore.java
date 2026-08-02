package ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage;

import Bt.C2673b;
import Nc.C3667a;
import io.reactivex.p;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\f0\u000b¢\u0006\u0004\b\r\u0010\u000eR:\u0010\u0012\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006 \u0011*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00100\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/FavoriteStateStore;", "", "<init>", "()V", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/KeyFavoriteEntityModel;", "keyModel", "", "favState", "", "favoriteIsUpdated", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/KeyFavoriteEntityModel;Z)V", "Lio/reactivex/p;", "", "subscribeOnFavoriteUpdate", "()Lio/reactivex/p;", "LNc/a;", "", "kotlin.jvm.PlatformType", "favoriteStorage", "LNc/a;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoriteStateStore {

    @NotNull
    private final C3667a<Map<KeyFavoriteEntityModel, Boolean>> favoriteStorage;

    public FavoriteStateStore() {
        C3667a<Map<KeyFavoriteEntityModel, Boolean>> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.favoriteStorage = d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map subscribeOnFavoriteUpdate$lambda$2(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Map) function1.invoke(p02);
    }

    public final void favoriteIsUpdated(@NotNull KeyFavoriteEntityModel keyModel, boolean favState) {
        Intrinsics.checkNotNullParameter(keyModel, "keyModel");
        Map<KeyFavoriteEntityModel, Boolean> f7 = this.favoriteStorage.f();
        if (f7 == null) {
            this.favoriteStorage.onNext(U.l(new Pair(keyModel, Boolean.valueOf(favState))));
        } else {
            f7.put(keyModel, Boolean.valueOf(favState));
            this.favoriteStorage.onNext(f7);
        }
    }

    @NotNull
    public final p<Map<KeyFavoriteEntityModel, Boolean>> subscribeOnFavoriteUpdate() {
        p map = this.favoriteStorage.map(new C2673b(FavoriteStateStore$subscribeOnFavoriteUpdate$1.INSTANCE, 4));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
