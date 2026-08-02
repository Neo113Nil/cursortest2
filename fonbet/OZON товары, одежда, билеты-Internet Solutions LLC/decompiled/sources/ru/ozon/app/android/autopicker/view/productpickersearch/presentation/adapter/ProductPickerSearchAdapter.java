package ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter;

import Dy.ViewOnClickListenerC2883a;
import En.ViewOnClickListenerC2972a;
import IW.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.autopicker.databinding.ItemProductPickerSearchCaptionBinding;
import ru.ozon.app.android.autopicker.databinding.ItemProductPickerSearchCategoryBinding;
import ru.ozon.app.android.autopicker.databinding.ItemProductPickerSearchCheckboxBinding;
import ru.ozon.app.android.autopicker.databinding.ItemProductPickerSearchRadioBinding;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R6\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/adapter/ProductPickerSearchAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/adapter/BaseViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/adapter/BaseViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/adapter/BaseViewHolder;I)V", "getItemViewType", "(I)I", "Lkotlin/Function1;", "onLeafClicked", "Lkotlin/jvm/functions/Function1;", "getOnLeafClicked", "()Lkotlin/jvm/functions/Function1;", "setOnLeafClicked", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "onNodeClicked", "Lkotlin/jvm/functions/Function2;", "getOnNodeClicked", "()Lkotlin/jvm/functions/Function2;", "setOnNodeClicked", "(Lkotlin/jvm/functions/Function2;)V", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductPickerSearchAdapter extends t<ProductPickerSearchVO.ProductPickerSearchItem, BaseViewHolder> {
    private Function1<? super ProductPickerSearchVO.ProductPickerSearchItem, Unit> onLeafClicked;
    private Function2<? super ProductPickerSearchVO.ProductPickerSearchItem, ? super Integer, Unit> onNodeClicked;

    public ProductPickerSearchAdapter() {
        super(new i.d<ProductPickerSearchVO.ProductPickerSearchItem>() { // from class: ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter.ProductPickerSearchAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(ProductPickerSearchVO.ProductPickerSearchItem oldItem, ProductPickerSearchVO.ProductPickerSearchItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(ProductPickerSearchVO.ProductPickerSearchItem oldItem, ProductPickerSearchVO.ProductPickerSearchItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getTreeIndex() == newItem.getTreeIndex() && Intrinsics.d(oldItem.getTitle(), newItem.getTitle());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$1$lambda$0(ProductPickerSearchAdapter productPickerSearchAdapter, CategoryViewHolder categoryViewHolder, View view) {
        Function2<? super ProductPickerSearchVO.ProductPickerSearchItem, ? super Integer, Unit> function2 = productPickerSearchAdapter.onNodeClicked;
        if (function2 != null) {
            ProductPickerSearchVO.ProductPickerSearchItem item = productPickerSearchAdapter.getItem(categoryViewHolder.getAdapterPosition());
            Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
            function2.invoke(item, Integer.valueOf(categoryViewHolder.getAdapterPosition()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$4$lambda$3$lambda$2(ProductPickerSearchAdapter productPickerSearchAdapter, RadioViewHolder radioViewHolder, View view) {
        Function1<? super ProductPickerSearchVO.ProductPickerSearchItem, Unit> function1 = productPickerSearchAdapter.onLeafClicked;
        if (function1 != null) {
            ProductPickerSearchVO.ProductPickerSearchItem item = productPickerSearchAdapter.getItem(radioViewHolder.getAdapterPosition());
            Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
            function1.invoke(item);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$7$lambda$6$lambda$5(ProductPickerSearchAdapter productPickerSearchAdapter, CheckboxViewHolder checkboxViewHolder, View view) {
        Function1<? super ProductPickerSearchVO.ProductPickerSearchItem, Unit> function1 = productPickerSearchAdapter.onLeafClicked;
        if (function1 != null) {
            ProductPickerSearchVO.ProductPickerSearchItem item = productPickerSearchAdapter.getItem(checkboxViewHolder.getAdapterPosition());
            Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
            function1.invoke(item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return getItem(position).getType().ordinal();
    }

    public final void setOnLeafClicked(Function1<? super ProductPickerSearchVO.ProductPickerSearchItem, Unit> function1) {
        this.onLeafClicked = function1;
    }

    public final void setOnNodeClicked(Function2<? super ProductPickerSearchVO.ProductPickerSearchItem, ? super Integer, Unit> function2) {
        this.onNodeClicked = function2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BaseViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ProductPickerSearchVO.ProductPickerSearchItem item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BaseViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        int i11 = 2;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == Type.CAPTION.ordinal()) {
            ItemProductPickerSearchCaptionBinding inflate = ItemProductPickerSearchCaptionBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new CaptionViewHolder(inflate);
        }
        if (viewType == Type.CATEGORY.ordinal()) {
            ItemProductPickerSearchCategoryBinding inflate2 = ItemProductPickerSearchCategoryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
            CategoryViewHolder categoryViewHolder = new CategoryViewHolder(inflate2);
            categoryViewHolder.itemView.setOnClickListener(new a(7, this, categoryViewHolder));
            return categoryViewHolder;
        }
        if (viewType == Type.RADIO.ordinal()) {
            ItemProductPickerSearchRadioBinding inflate3 = ItemProductPickerSearchRadioBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(...)");
            RadioViewHolder radioViewHolder = new RadioViewHolder(inflate3);
            Iterator it = C7714v.b0(radioViewHolder.itemView, inflate3.radioRb).iterator();
            while (it.hasNext()) {
                ((View) it.next()).setOnClickListener(new ViewOnClickListenerC2883a(9, this, radioViewHolder));
            }
            return radioViewHolder;
        }
        if (viewType != Type.CHECKBOX.ordinal()) {
            throw new Exception("Unknown ViewHolder!");
        }
        ItemProductPickerSearchCheckboxBinding inflate4 = ItemProductPickerSearchCheckboxBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate4, "inflate(...)");
        CheckboxViewHolder checkboxViewHolder = new CheckboxViewHolder(inflate4);
        Iterator it2 = C7714v.b0(checkboxViewHolder.itemView, inflate4.checkboxCb).iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setOnClickListener(new ViewOnClickListenerC2972a(i11, this, checkboxViewHolder));
        }
        return checkboxViewHolder;
    }
}
