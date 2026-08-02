package ru.ozon.app.android.favorites.createshoppinglist.presentation.spacer;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.createshoppinglist.data.CreateShoppingListDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u000eB\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/presentation/spacer/CreateShoppingListSpacerMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/favorites/createshoppinglist/data/CreateShoppingListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/spacer/CreateShoppingListSpacerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/favorites/createshoppinglist/data/CreateShoppingListDTO;Ll20/d;)Ljava/util/List;", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CreateShoppingListSpacerMapper implements Function2<CreateShoppingListDTO, d, List<? extends CreateShoppingListSpacerVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CreateShoppingListSpacerVO> invoke(@NotNull CreateShoppingListDTO state, @NotNull d widgetInfo) {
        Map<String, String> params;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        CreateShoppingListSpacerVO createShoppingListSpacerVO = new CreateShoppingListSpacerVO(widgetInfo.d().hashCode());
        AtomActionDTO action = state.getSaveButton().getAction();
        if (!Boolean.parseBoolean((action == null || (params = action.getParams()) == null) ? null : params.get("isModal"))) {
            createShoppingListSpacerVO = null;
        }
        return C7714v.c0(createShoppingListSpacerVO);
    }
}
