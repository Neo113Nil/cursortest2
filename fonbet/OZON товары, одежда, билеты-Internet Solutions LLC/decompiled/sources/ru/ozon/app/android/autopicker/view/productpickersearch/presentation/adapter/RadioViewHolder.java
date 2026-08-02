package ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.autopicker.databinding.ItemProductPickerSearchRadioBinding;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/adapter/RadioViewHolder;", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/adapter/BaseViewHolder;", "binding", "Lru/ozon/app/android/autopicker/databinding/ItemProductPickerSearchRadioBinding;", "<init>", "(Lru/ozon/app/android/autopicker/databinding/ItemProductPickerSearchRadioBinding;)V", "getBinding", "()Lru/ozon/app/android/autopicker/databinding/ItemProductPickerSearchRadioBinding;", "bind", "", "item", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RadioViewHolder extends BaseViewHolder {

    @NotNull
    private final ItemProductPickerSearchRadioBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioViewHolder(@NotNull ItemProductPickerSearchRadioBinding binding) {
        super(binding);
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter.BaseViewHolder
    public void bind(@NotNull ProductPickerSearchVO.ProductPickerSearchItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ItemProductPickerSearchRadioBinding binding = getBinding();
        TextView textView = binding.titleTv;
        textView.setText(item.getTitle());
        updateMargin(textView, item.getOffset());
        binding.radioRb.setChecked(item.getIsSelected());
    }

    @NotNull
    public ItemProductPickerSearchRadioBinding getBinding() {
        return this.binding;
    }
}
