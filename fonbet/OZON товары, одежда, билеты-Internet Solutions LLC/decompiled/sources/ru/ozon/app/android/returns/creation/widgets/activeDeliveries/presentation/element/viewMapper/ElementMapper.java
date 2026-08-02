package ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.element.viewMapper;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesVOKt;
import ru.ozon.app.android.returns.creation.widgets.activeDeliveries.data.ElementDTO;
import ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.element.viewItem.ElementVI;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/presentation/element/viewMapper/ElementMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/data/ElementDTO;", "Ll20/d;", "", "Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/presentation/element/viewItem/ElementVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVo", "(Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/data/ElementDTO;Ljava/lang/String;)Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/presentation/element/viewItem/ElementVI;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/data/ElementDTO;Ll20/d;)Ljava/util/List;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ElementMapper implements Function2<ElementDTO, d, List<? extends ElementVI>> {
    private final ElementVI toVo(ElementDTO elementDTO, String str) {
        CellDTO.Settings copy$default;
        long hashCode = str.hashCode();
        CellDTO cell = elementDTO.getCell();
        CellDTO.Settings settings = elementDTO.getCell().getSettings();
        CellDTO copy$default2 = CellDTO.copy$default(cell, null, (settings == null || (copy$default = CellDTO.Settings.copy$default(settings, null, null, null, null, null, null, null, null, null, Boolean.TRUE, null, 1535, null)) == null) ? new CellDTO.Settings(null, null, null, null, null, null, null, null, null, Boolean.TRUE, null, 1535, null) : copy$default, null, null, null, 29, null);
        Boolean isActive = elementDTO.isActive();
        boolean booleanValue = isActive != null ? isActive.booleanValue() : false;
        BadgeDTO badge = elementDTO.getBadge();
        String backgroundColor = elementDTO.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.LAYER_FLOOR_1.getToken();
        }
        return new ElementVI(hashCode, copy$default2, booleanValue, badge, backgroundColor, ImagesVOKt.toVo(elementDTO.getItemImages()));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ElementVI> invoke(@NotNull ElementDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d()));
    }
}
