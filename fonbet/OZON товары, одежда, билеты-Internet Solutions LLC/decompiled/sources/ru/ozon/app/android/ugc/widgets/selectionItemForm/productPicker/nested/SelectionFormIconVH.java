package ru.ozon.app.android.ugc.widgets.selectionItemForm.productPicker.nested;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.productPicker.SelectionFormProductPickerVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.productPicker.nested.views.SelectionFormIconWrapper;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/nested/SelectionFormIconVH;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/nested/BaseProductPickerViewHolder;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/SelectionFormProductPickerVO$AddProductVO;", "iconViewWrapper", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/nested/views/SelectionFormIconWrapper;", "<init>", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/nested/views/SelectionFormIconWrapper;)V", "bind", "", "item", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionFormIconVH extends BaseProductPickerViewHolder<SelectionFormProductPickerVO.AddProductVO> {

    @NotNull
    private final SelectionFormIconWrapper iconViewWrapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionFormIconVH(@NotNull SelectionFormIconWrapper iconViewWrapper) {
        super(iconViewWrapper);
        Intrinsics.checkNotNullParameter(iconViewWrapper, "iconViewWrapper");
        this.iconViewWrapper = iconViewWrapper;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.ugc.widgets.selectionItemForm.productPicker.nested.BaseProductPickerViewHolder
    public void bind(@NotNull SelectionFormProductPickerVO.AddProductVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.iconViewWrapper.bind(item);
    }
}
