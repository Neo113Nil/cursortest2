package ru.ozon.app.android.autopicker.view.productpickersearch.domain;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter.Type;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/domain/ProductPickerSearchListFilter;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "filter", "", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;", "text", "", "items", "", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductPickerSearchListFilter {

    @NotNull
    private final Context context;

    public ProductPickerSearchListFilter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @NotNull
    public final List<ProductPickerSearchVO.ProductPickerSearchItem> filter(@NotNull String text, @NotNull List<ProductPickerSearchVO.ProductPickerSearchItem> items) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(items, "items");
        String normalize = ProductPickerSearchListHelperKt.normalize(text);
        int size = items.size();
        for (int i11 = 0; i11 < size; i11++) {
            String normalize2 = ProductPickerSearchListHelperKt.normalize(items.get(i11).getTitle());
            if ((items.get(i11).getType() == Type.RADIO || items.get(i11).getType() == Type.CHECKBOX) && h.t(normalize2, normalize, true)) {
                items.set(i11, ProductPickerSearchVO.ProductPickerSearchItem.copy$default(items.get(i11), 0, ProductPickerSearchListHelperKt.highlightText(this.context, normalize, normalize2, items.get(i11).getTitle()), null, null, 0, false, false, false, false, 0, null, 1981, null));
                int i12 = i11;
                while (true) {
                    if (-1 >= i12) {
                        break;
                    }
                    if (items.get(i12).getType() == Type.CAPTION) {
                        items.set(i12, ProductPickerSearchVO.ProductPickerSearchItem.copy$default(items.get(i12), 0, null, null, null, 0, false, false, false, false, 0, null, 1983, null));
                        break;
                    }
                    i12--;
                }
            } else {
                items.set(i11, ProductPickerSearchVO.ProductPickerSearchItem.copy$default(items.get(i11), 0, null, null, null, 0, false, true, false, false, 0, null, 1983, null));
            }
        }
        return items;
    }
}
