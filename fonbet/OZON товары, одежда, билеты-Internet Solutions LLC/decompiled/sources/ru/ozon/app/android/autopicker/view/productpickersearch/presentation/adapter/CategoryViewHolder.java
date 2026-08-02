package ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.autopicker.databinding.ItemProductPickerSearchCategoryBinding;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/adapter/CategoryViewHolder;", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/adapter/BaseViewHolder;", "binding", "Lru/ozon/app/android/autopicker/databinding/ItemProductPickerSearchCategoryBinding;", "<init>", "(Lru/ozon/app/android/autopicker/databinding/ItemProductPickerSearchCategoryBinding;)V", "getBinding", "()Lru/ozon/app/android/autopicker/databinding/ItemProductPickerSearchCategoryBinding;", "bind", "", "item", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;", "Companion", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CategoryViewHolder extends BaseViewHolder {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ItemProductPickerSearchCategoryBinding binding;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/adapter/CategoryViewHolder$Companion;", "", "<init>", "()V", "COLLAPSED_ANGLE", "", "EXPANDED_ANGLE", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryViewHolder(@NotNull ItemProductPickerSearchCategoryBinding binding) {
        super(binding);
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter.BaseViewHolder
    public void bind(@NotNull ProductPickerSearchVO.ProductPickerSearchItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ItemProductPickerSearchCategoryBinding binding = getBinding();
        TextView textView = binding.titleTv;
        textView.setText(item.getTitle());
        updateMargin(textView, item.getOffset());
        binding.arrowIv.setRotation(item.getIsCollapsed() ? 90.0f : 270.0f);
    }

    @NotNull
    public ItemProductPickerSearchCategoryBinding getBinding() {
        return this.binding;
    }
}
