package ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\b\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/KeyFavoriteEntityModel;", "", "kotlin.jvm.PlatformType", "it", "", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/util/Map;)Ljava/util/Map;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FavoriteStateStore$subscribeOnFavoriteUpdate$1 extends AbstractC7737t implements Function1<Map<KeyFavoriteEntityModel, Boolean>, Map<KeyFavoriteEntityModel, ? extends Boolean>> {
    public static final FavoriteStateStore$subscribeOnFavoriteUpdate$1 INSTANCE = new FavoriteStateStore$subscribeOnFavoriteUpdate$1();

    FavoriteStateStore$subscribeOnFavoriteUpdate$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Map<KeyFavoriteEntityModel, Boolean> invoke(Map<KeyFavoriteEntityModel, Boolean> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }
}
