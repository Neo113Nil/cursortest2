package ru.ozon.app.android.favorites.shoppinglistv2.presentation;

import Lh.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.shoppinglistv2.data.CreateListDTO;
import ru.ozon.app.android.favorites.shoppinglistv2.data.ShoppingListsV2DTO;
import ru.ozon.app.android.favorites.shoppinglistv2.presentation.createlist.ShoppingListsV2CreateListVO;
import ru.ozon.app.android.favorites.shoppinglistv2.presentation.title.ShoppingListsV2TitleVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002¨\u0006\u0005"}, d2 = {"toTitleItemVO", "Lru/ozon/app/android/favorites/shoppinglistv2/presentation/title/ShoppingListsV2TitleVO;", "Lru/ozon/app/android/favorites/shoppinglistv2/data/ShoppingListsV2DTO;", "toCreateListItemVO", "Lru/ozon/app/android/favorites/shoppinglistv2/presentation/createlist/ShoppingListsV2CreateListVO;", "favorites_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MappersKt {
    public static final ShoppingListsV2CreateListVO toCreateListItemVO(@NotNull ShoppingListsV2DTO shoppingListsV2DTO) {
        Intrinsics.checkNotNullParameter(shoppingListsV2DTO, "<this>");
        CreateListDTO createList = shoppingListsV2DTO.getCreateList();
        if (createList == null) {
            return null;
        }
        long hashCode = createList.hashCode();
        String title = createList.getTitle();
        String icon = createList.getIcon();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(createList.getAction(), null);
        Map<String, TokenizedTrackingInfo> trackingInfo = createList.getTrackingInfo();
        return new ShoppingListsV2CreateListVO(hashCode, title, icon, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }

    public static final ShoppingListsV2TitleVO toTitleItemVO(@NotNull ShoppingListsV2DTO shoppingListsV2DTO) {
        Intrinsics.checkNotNullParameter(shoppingListsV2DTO, "<this>");
        String title = shoppingListsV2DTO.getTitle();
        if (title == null) {
            return null;
        }
        return new ShoppingListsV2TitleVO(b.a(shoppingListsV2DTO.hashCode(), shoppingListsV2DTO.getTitle(), "."), title);
    }
}
