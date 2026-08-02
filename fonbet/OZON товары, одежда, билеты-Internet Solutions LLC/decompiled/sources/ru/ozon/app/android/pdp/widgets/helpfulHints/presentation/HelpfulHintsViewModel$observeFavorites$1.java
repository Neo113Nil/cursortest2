package ru.ozon.app.android.pdp.widgets.helpfulHints.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteAdd;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class HelpfulHintsViewModel$observeFavorites$1 extends AbstractC7737t implements Function1<FavoriteEvent, Boolean> {
    public static final HelpfulHintsViewModel$observeFavorites$1 INSTANCE = new HelpfulHintsViewModel$observeFavorites$1();

    HelpfulHintsViewModel$observeFavorites$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(FavoriteEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it instanceof FavoriteAdd);
    }
}
