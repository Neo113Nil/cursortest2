package ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.DynamicElementDTOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.DynamicElementVOV2;
import ru.ozon.app.android.common.progressivemolecula.core.ExtentionsKt;
import ru.ozon.app.android.common.progressivemolecula.data.ProgressiveTextWidgetDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a,\u0010\b\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¨\u0006\f"}, d2 = {"mapDynamicElements", "", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2;", "", "", "widgetId", "", "wrapVerticalSpacer", "mapToDynamicElementVOV2Internal", "aboveSpace", "", "belowSpace", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DynamicElementMapperV2Kt {
    @NotNull
    public static final List<DynamicElementVOV2> mapDynamicElements(Collection<? extends Object> collection, long j11) {
        return (collection == null || collection.isEmpty()) ? K.f71697a : wrapVerticalSpacer(collection, j11);
    }

    private static final DynamicElementVOV2 mapToDynamicElementVOV2Internal(Object obj, long j11, int i11, int i12) {
        if (obj instanceof ProgressiveTextWidgetDTO.ProgressiveTextDTO) {
            return new DynamicElementVOV2.ProgressiveText(ExtentionsKt.toVO((ProgressiveTextWidgetDTO.ProgressiveTextDTO) obj, j11), i11, i12);
        }
        if (obj instanceof AtomDTO) {
            return new DynamicElementVOV2.Atom((AtomDTO) obj, i11, i12);
        }
        if (obj instanceof DynamicElementDTOV2.VerticalSpacer) {
            return new DynamicElementVOV2.VerticalSpacer(((DynamicElementDTOV2.VerticalSpacer) obj).getSpacing());
        }
        if (obj instanceof DynamicElementDTOV2.Badges) {
            return new DynamicElementVOV2.Badges(((DynamicElementDTOV2.Badges) obj).getElements(), i11, i12);
        }
        if (!(obj instanceof DynamicElementDTOV2.PriceList)) {
            return null;
        }
        DynamicElementDTOV2.PriceList priceList = (DynamicElementDTOV2.PriceList) obj;
        List<PriceDTO> list = priceList.getList();
        Boolean isFlexModeEnabled = priceList.isFlexModeEnabled();
        return new DynamicElementVOV2.PriceList(list, isFlexModeEnabled != null ? isFlexModeEnabled.booleanValue() : false, i11, i12);
    }

    private static final List<DynamicElementVOV2> wrapVerticalSpacer(Collection<? extends Object> collection, long j11) {
        DynamicElementVOV2 mapToDynamicElementVOV2Internal;
        ArrayList arrayList = new ArrayList(collection.size());
        Object obj = null;
        int i11 = 0;
        int i12 = 0;
        for (Object obj2 : collection) {
            if (obj2 instanceof DynamicElementDTOV2.VerticalSpacer) {
                if (obj == null) {
                    i11 += ((DynamicElementDTOV2.VerticalSpacer) obj2).getSpacing();
                } else {
                    i12 += ((DynamicElementDTOV2.VerticalSpacer) obj2).getSpacing();
                }
            } else if (obj2 != null) {
                DynamicElementVOV2 mapToDynamicElementVOV2Internal2 = mapToDynamicElementVOV2Internal(obj, j11, i11, i12);
                if (mapToDynamicElementVOV2Internal2 != null) {
                    arrayList.add(mapToDynamicElementVOV2Internal2);
                    i11 = 0;
                    i12 = 0;
                }
                obj = obj2;
            }
        }
        if (obj == null || (mapToDynamicElementVOV2Internal = mapToDynamicElementVOV2Internal(obj, j11, i11, i12)) == null) {
            arrayList.add(new DynamicElementVOV2.VerticalSpacer(i11));
            return arrayList;
        }
        arrayList.add(mapToDynamicElementVOV2Internal);
        return arrayList;
    }
}
