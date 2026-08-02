package ru.ozon.app.android.favorites.shoppinglistv2.presentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.shoppinglistv2.data.ShoppingListV2DTO;
import ru.ozon.app.android.favorites.shoppinglistv2.data.ShoppingListsV2DTO;
import ru.ozon.app.android.favorites.shoppinglistv2.presentation.item.ShoppingListsV2ItemVO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0011B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\u0003j\u0002`\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/favorites/shoppinglistv2/presentation/ShoppingListsV2ItemsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/favorites/shoppinglistv2/data/ShoppingListsV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/favorites/shoppinglistv2/presentation/item/ShoppingListsV2ItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/favorites/shoppinglistv2/data/ShoppingListV2DTO;", "toVo", "(Lru/ozon/app/android/favorites/shoppinglistv2/data/ShoppingListV2DTO;)Lru/ozon/app/android/favorites/shoppinglistv2/presentation/item/ShoppingListsV2ItemVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/favorites/shoppinglistv2/data/ShoppingListsV2DTO;Ll20/d;)Ljava/util/List;", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ShoppingListsV2ItemsMapper implements Function2<ShoppingListsV2DTO, d, List<? extends ShoppingListsV2ItemVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/favorites/shoppinglistv2/presentation/ShoppingListsV2ItemsMapper$Companion;", "", "<init>", "()V", "TAG_ALL", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final ShoppingListsV2ItemVO toVo(ShoppingListV2DTO shoppingListV2DTO) {
        String id2 = shoppingListV2DTO.getId();
        if (id2.length() <= 0 || Intrinsics.d(id2, "all")) {
            id2 = null;
        }
        return new ShoppingListsV2ItemVO(id2 != null ? Long.parseLong(id2) : shoppingListV2DTO.getTitle().hashCode(), shoppingListV2DTO.getTitle(), shoppingListV2DTO.getSubtitle(), shoppingListV2DTO.getIcon(), AtomActionMapperKt.toAtomAction(shoppingListV2DTO.getAction(), shoppingListV2DTO.getTrackingInfo()), shoppingListV2DTO.getOptionsButton(), Intrinsics.d(shoppingListV2DTO.isPinned(), Boolean.TRUE));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ShoppingListsV2ItemVO> invoke(@NotNull ShoppingListsV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<ShoppingListV2DTO> lists = state.getLists();
        if (lists == null) {
            return K.f71697a;
        }
        List<ShoppingListV2DTO> list = lists;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toVo((ShoppingListV2DTO) it.next()));
        }
        return arrayList;
    }
}
