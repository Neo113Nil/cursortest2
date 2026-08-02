package ru.ozon.app.android.autopicker.view.productpickersearch.data;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.ProductPickerSearchDTO;
import ru.ozon.app.android.autopicker.view.productpickersearch.domain.ProductPickerSearchListTransformerKt;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter.Type;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.data.ProductPickerDetailsDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchMapperImpl;", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchMapper;", "<init>", "()V", "mapDTOtoVO", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO;", "dto", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO;", "mapItems", "", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;", "mapValue", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO$Value;", "hasMultiselection", "", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductPickerSearchMapperImpl implements ProductPickerSearchMapper {
    private final List<ProductPickerSearchVO.ProductPickerSearchItem> mapItems(ProductPickerSearchDTO dto) {
        List list;
        List<ProductPickerSearchDTO.Value> values = dto.getValues();
        ArrayList arrayList = new ArrayList(C7714v.z(values, 10));
        for (ProductPickerSearchDTO.Value value : values) {
            Type type = value.getValues() == null ? dto.getHasMultiselection() ? Type.CHECKBOX : Type.RADIO : Type.CATEGORY;
            String value2 = value.getValue();
            String title = value.getTitle();
            boolean isSelected = value.isSelected();
            List<ProductPickerSearchDTO.Value> values2 = value.getValues();
            if (values2 != null) {
                List<ProductPickerSearchDTO.Value> list2 = values2;
                list = new ArrayList(C7714v.z(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    list.add(mapValue((ProductPickerSearchDTO.Value) it.next(), dto.getHasMultiselection()));
                }
            } else {
                list = K.f71697a;
            }
            arrayList.add(new ProductPickerSearchVO.ProductPickerSearchItem(0, title, type, value2, 0, false, false, isSelected, false, 0, list, 881, null));
        }
        return dto.getHasSectionTitles() ? ProductPickerSearchListTransformerKt.toListWithCaptions(arrayList) : ProductPickerSearchListTransformerKt.toPlainList$default(arrayList, dto.getHasMultiselection(), false, 4, null);
    }

    private final ProductPickerSearchVO.ProductPickerSearchItem mapValue(ProductPickerSearchDTO.Value value, boolean hasMultiselection) {
        List list;
        Type type = value.getValues() == null ? hasMultiselection ? Type.CHECKBOX : Type.RADIO : Type.CATEGORY;
        String title = value.getTitle();
        String value2 = value.getValue();
        boolean isSelected = value.isSelected();
        List<ProductPickerSearchDTO.Value> values = value.getValues();
        if (values != null) {
            List<ProductPickerSearchDTO.Value> list2 = values;
            list = new ArrayList(C7714v.z(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                list.add(mapValue((ProductPickerSearchDTO.Value) it.next(), hasMultiselection));
            }
        } else {
            list = K.f71697a;
        }
        return new ProductPickerSearchVO.ProductPickerSearchItem(0, title, type, value2, 0, false, false, isSelected, false, 0, list, 881, null);
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.data.ProductPickerSearchMapper
    @NotNull
    public ProductPickerSearchVO mapDTOtoVO(@NotNull ProductPickerSearchDTO dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        List<ProductPickerSearchVO.ProductPickerSearchItem> mapItems = mapItems(dto);
        List<ProductPickerSearchVO.ProductPickerSearchItem> list = mapItems;
        boolean z11 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((ProductPickerSearchVO.ProductPickerSearchItem) it.next()).getChildrenCount() != 0) {
                    z11 = true;
                    break;
                }
            }
        }
        boolean z12 = z11;
        boolean hasSectionTitles = dto.getHasSectionTitles();
        boolean hasMultiselection = dto.getHasMultiselection();
        String title = dto.getHeader().getTitle();
        ProductPickerSearchDTO.Header.Search search = dto.getHeader().getSearch();
        String placeholder = search != null ? search.getPlaceholder() : null;
        String title2 = dto.getButton().getTitle();
        String subtitle = dto.getButton().getSubtitle();
        String keyName = dto.getButton().getKeyName();
        ProductPickerDetailsDTO.CurrentState currentState = dto.getCurrentState();
        ProductPickerSearchDTO.TrackingInfo trackingInfo = dto.getTrackingInfo();
        return new ProductPickerSearchVO(z12, hasSectionTitles, hasMultiselection, title, placeholder, false, title2, subtitle, mapItems, keyName, currentState, trackingInfo != null ? trackingInfo.getId() : null, 32, null);
    }
}
