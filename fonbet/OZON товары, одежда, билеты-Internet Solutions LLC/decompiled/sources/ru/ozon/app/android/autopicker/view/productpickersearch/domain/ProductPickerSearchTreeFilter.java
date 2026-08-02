package ru.ozon.app.android.autopicker.view.productpickersearch.domain;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter.Type;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0012\u0010\u0010\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J&\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0017\u001a\u00020\nH\u0002J.\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/domain/ProductPickerSearchTreeFilter;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "filter", "", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;", "text", "", "items", "collapseCategory", "itemPosition", "", "expandCategory", "toInitialState", "", "isMatch", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "expandNearestChildren", "i", "normalizedSearchText", "restoreBranch", "normalizedTitle", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductPickerSearchTreeFilter {

    @NotNull
    private final Context context;

    public ProductPickerSearchTreeFilter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final void expandNearestChildren(int i11, List<ProductPickerSearchVO.ProductPickerSearchItem> items, String normalizedSearchText) {
        items.set(i11, ProductPickerSearchVO.ProductPickerSearchItem.copy$default(items.get(i11), 0, null, null, null, 0, false, false, false, true, 0, null, 1695, null));
        int size = items.size();
        for (int i12 = i11 + 1; i12 < size && items.get(i12).getOffset() != items.get(i11).getOffset(); i12++) {
            items.set(i12, ProductPickerSearchVO.ProductPickerSearchItem.copy$default(items.get(i12), 0, ProductPickerSearchListHelperKt.highlightText(this.context, normalizedSearchText, ProductPickerSearchListHelperKt.normalize(items.get(i12).getTitle()), items.get(i12).getTitle()), null, null, 0, false, items.get(i12).getOffset() != items.get(i11).getOffset() + 1, false, true, 0, null, 1725, null));
        }
    }

    private final boolean isMatch(String title, String text) {
        return h.t(title, text, true);
    }

    private final void restoreBranch(int i11, List<ProductPickerSearchVO.ProductPickerSearchItem> items, String normalizedSearchText, String normalizedTitle) {
        items.set(i11, ProductPickerSearchVO.ProductPickerSearchItem.copy$default(items.get(i11), 0, ProductPickerSearchListHelperKt.highlightText(this.context, normalizedSearchText, normalizedTitle, items.get(i11).getTitle()), null, null, 0, false, false, false, true, 0, null, 1725, null));
        int offset = items.get(i11).getOffset();
        for (int i12 = i11 - 1; -1 < i12; i12--) {
            if (items.get(i12).getType() == Type.CATEGORY && items.get(i12).getOffset() == offset - 1) {
                items.set(i12, ProductPickerSearchVO.ProductPickerSearchItem.copy$default(items.get(i12), 0, null, null, null, 0, false, false, false, true, 0, null, 1695, null));
                offset--;
                if (offset == 1) {
                    return;
                }
            }
        }
    }

    private final void toInitialState(List<ProductPickerSearchVO.ProductPickerSearchItem> list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            list.set(i11, ProductPickerSearchVO.ProductPickerSearchItem.copy$default(list.get(i11), 0, list.get(i11).getTitle().toString(), null, null, 0, true, true, false, false, 0, null, 1693, null));
        }
    }

    @NotNull
    public final List<ProductPickerSearchVO.ProductPickerSearchItem> collapseCategory(int itemPosition, @NotNull List<ProductPickerSearchVO.ProductPickerSearchItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        int size = items.size();
        for (int i11 = itemPosition + 1; i11 < size; i11++) {
            if (items.get(i11).getOffset() < items.get(itemPosition).getOffset() + 1) {
                if (items.get(i11).getOffset() == items.get(itemPosition).getOffset()) {
                    break;
                }
            } else {
                items.set(i11, ProductPickerSearchVO.ProductPickerSearchItem.copy$default(items.get(i11), 0, null, null, null, 0, true, true, false, false, 0, null, 1951, null));
            }
        }
        items.set(itemPosition, ProductPickerSearchVO.ProductPickerSearchItem.copy$default(items.get(itemPosition), 0, null, null, null, 0, true, false, false, false, 0, null, 2015, null));
        return items;
    }

    @NotNull
    public final List<ProductPickerSearchVO.ProductPickerSearchItem> expandCategory(int itemPosition, @NotNull List<ProductPickerSearchVO.ProductPickerSearchItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ProductPickerSearchVO.ProductPickerSearchItem productPickerSearchItem = items.get(itemPosition);
        int size = items.size();
        for (int i11 = itemPosition + 1; i11 < size; i11++) {
            if (items.get(i11).getOffset() != productPickerSearchItem.getOffset() + 1 || !items.get(i11).getIsFound()) {
                if (items.get(i11).getOffset() == productPickerSearchItem.getOffset()) {
                    break;
                }
            } else {
                items.set(i11, ProductPickerSearchVO.ProductPickerSearchItem.copy$default(items.get(i11), 0, null, null, null, 0, true, false, false, false, 0, null, 1951, null));
            }
        }
        items.set(itemPosition, ProductPickerSearchVO.ProductPickerSearchItem.copy$default(productPickerSearchItem, 0, null, null, null, 0, false, false, false, false, 0, null, 2015, null));
        return items;
    }

    @NotNull
    public final List<ProductPickerSearchVO.ProductPickerSearchItem> filter(@NotNull String text, @NotNull List<ProductPickerSearchVO.ProductPickerSearchItem> items) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(items, "items");
        String normalize = ProductPickerSearchListHelperKt.normalize(text);
        toInitialState(items);
        int size = items.size();
        for (int i11 = 0; i11 < size; i11++) {
            String normalize2 = ProductPickerSearchListHelperKt.normalize(items.get(i11).getTitle());
            if (isMatch(normalize2, normalize)) {
                if (items.get(i11).getType() == Type.CATEGORY) {
                    expandNearestChildren(i11, items, normalize);
                }
                restoreBranch(i11, items, normalize, normalize2);
            }
        }
        return items;
    }
}
