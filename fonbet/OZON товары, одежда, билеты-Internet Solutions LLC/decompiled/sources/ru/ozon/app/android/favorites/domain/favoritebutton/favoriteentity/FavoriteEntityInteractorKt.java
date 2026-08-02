package ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity;

import java.util.Map;
import kotlin.Metadata;
import kotlin.text.h;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.KeyFavoriteEntityModel;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.ShortFavEntity;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"createShortFavEntity", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/ShortFavEntity;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "isFavorite", "", "favorites_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoriteEntityInteractorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ShortFavEntity createShortFavEntity(AtomAction.ComposerAction composerAction, boolean z11) {
        String str;
        Long y02;
        String str2;
        Map<String, String> params = composerAction.getParams();
        if (params != null && (str = params.get("id")) != null && (y02 = h.y0(str)) != null) {
            long longValue = y02.longValue();
            Map<String, String> params2 = composerAction.getParams();
            if (params2 != null && (str2 = params2.get("type")) != null) {
                return new ShortFavEntity(new KeyFavoriteEntityModel(longValue, str2), new AtomActionDTO(AtomActionDTO.Behavior.COMPOSER_ACTION, composerAction.getActionName(), null, composerAction.getParams(), 4, null), z11);
            }
        }
        return null;
    }
}
