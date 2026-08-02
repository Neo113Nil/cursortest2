package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.delegate;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntity;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.FavoriteButtonView;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\r\u001a\u000e\u0012\u0002\b\u00030\u000bj\u0006\u0012\u0002\b\u0003`\fH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/delegate/FavoriteEntityDelegate;", "", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/FavoriteButtonView;", "button", "", "attachFavButtonView", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/FavoriteButtonView;)V", "detachFavButtonView", "()V", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;", "entity", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holder", "bindFavoriteEntityButton", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/FavoriteButtonView;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;Lru/ozon/composer/ui/widget/k;)V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface FavoriteEntityDelegate {
    void attachFavButtonView(@NotNull FavoriteButtonView button);

    void bindFavoriteEntityButton(@NotNull FavoriteButtonView button, FavoriteEntity entity, @NotNull k<?> holder);

    void detachFavButtonView();
}
