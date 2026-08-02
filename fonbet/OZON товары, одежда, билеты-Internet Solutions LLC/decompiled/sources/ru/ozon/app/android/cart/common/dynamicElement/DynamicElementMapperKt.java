package ru.ozon.app.android.cart.common.dynamicElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementVO;
import ru.ozon.app.android.common.progressivemolecula.core.ExtentionsKt;
import ru.ozon.app.android.common.progressivemolecula.data.ProgressiveTextWidgetDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.v3.mappers.BadgeMapperKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"mapToDynamicElementVO", "Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementVO;", "dto", "", "widgetId", "", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DynamicElementMapperKt {
    public static final DynamicElementVO mapToDynamicElementVO(Object obj, long j11) {
        if (obj instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon) {
            return new DynamicElementVO.CellWithSubtitle24Icon((CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon) obj);
        }
        if (obj instanceof ProgressiveTextWidgetDTO.ProgressiveTextDTO) {
            return new DynamicElementVO.ProgressiveText(ExtentionsKt.toVO((ProgressiveTextWidgetDTO.ProgressiveTextDTO) obj, j11));
        }
        if (obj instanceof AtomDTO) {
            return new DynamicElementVO.Atom((AtomDTO) obj);
        }
        if (obj instanceof DynamicElementDTO.VerticalSpacer) {
            return new DynamicElementVO.VerticalSpacer(((DynamicElementDTO.VerticalSpacer) obj).getSpacing());
        }
        if (!(obj instanceof DynamicElementDTO.Badges)) {
            if (obj instanceof DynamicElementDTO.PriceList) {
                return new DynamicElementVO.PriceList(((DynamicElementDTO.PriceList) obj).getList());
            }
            return null;
        }
        List<Badge> elements = ((DynamicElementDTO.Badges) obj).getElements();
        ArrayList arrayList = new ArrayList(C7714v.z(elements, 10));
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            arrayList.add(BadgeMapperKt.mapToDsBadge((Badge) it.next()));
        }
        return new DynamicElementVO.Badges(arrayList);
    }
}
