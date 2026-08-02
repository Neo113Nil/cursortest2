package ru.ozon.app.android.favorites.domain.actionhandlers;

import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.utils.AnalyticRefs;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesCustomActionHandlerInteractor;", "", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoriteComposerActionExecutor;", "favoriteActionExecutor", "<init>", "(Lru/ozon/app/android/favorites/domain/actionhandlers/FavoriteComposerActionExecutor;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "Lru/ozon/app/android/favorites/data/utils/AnalyticRefs;", "analyticRefs", "Lio/reactivex/y;", "", "addToFavorite", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Lru/ozon/app/android/favorites/data/utils/AnalyticRefs;)Lio/reactivex/y;", "removeFromFavorite", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoriteComposerActionExecutor;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoritesCustomActionHandlerInteractor {

    @NotNull
    private final FavoriteComposerActionExecutor favoriteActionExecutor;

    public FavoritesCustomActionHandlerInteractor(@NotNull FavoriteComposerActionExecutor favoriteActionExecutor) {
        Intrinsics.checkNotNullParameter(favoriteActionExecutor, "favoriteActionExecutor");
        this.favoriteActionExecutor = favoriteActionExecutor;
    }

    @NotNull
    public final y<Long> addToFavorite(@NotNull AtomAction.ComposerAction action, @NotNull AnalyticRefs analyticRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(analyticRefs, "analyticRefs");
        return this.favoriteActionExecutor.addToFavorite(action, analyticRefs);
    }

    @NotNull
    public final y<Long> removeFromFavorite(@NotNull AtomAction.ComposerAction action, @NotNull AnalyticRefs analyticRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(analyticRefs, "analyticRefs");
        return this.favoriteActionExecutor.removeFromFavorites(action, analyticRefs);
    }
}
