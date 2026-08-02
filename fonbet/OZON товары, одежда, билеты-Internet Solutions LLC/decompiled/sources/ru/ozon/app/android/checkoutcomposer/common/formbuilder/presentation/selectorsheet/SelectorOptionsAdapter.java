package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.selectorsheet;

import Hv.a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.map.databinding.ItemSelectorSheetOptionBinding;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/selectorsheet/SelectorOptionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/selectorsheet/SelectorOptionsAdapter$SelectorOptionVH;", "Lkotlin/Function1;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions$Option;", "", "onSelected", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/selectorsheet/SelectorOptionsAdapter$SelectorOptionVH;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/selectorsheet/SelectorOptionsAdapter$SelectorOptionVH;I)V", "", "items", "", "selectedValue", "submitList", "(Ljava/util/List;Ljava/lang/String;)V", "Lkotlin/jvm/functions/Function1;", "", "Ljava/util/List;", "Ljava/lang/String;", "SelectorOptionVH", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SelectorOptionsAdapter extends RecyclerView.g<SelectorOptionVH> {

    @NotNull
    private final List<FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option> items;

    @NotNull
    private final Function1<FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option, Unit> onSelected;
    private String selectedValue;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/selectorsheet/SelectorOptionsAdapter$SelectorOptionVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/map/databinding/ItemSelectorSheetOptionBinding;", "binding", "<init>", "(Lru/ozon/app/android/map/databinding/ItemSelectorSheetOptionBinding;)V", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions$Option;", "item", "", "selectedValue", "", "bind", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions$Option;Ljava/lang/String;)V", "Lru/ozon/app/android/map/databinding/ItemSelectorSheetOptionBinding;", "getBinding", "()Lru/ozon/app/android/map/databinding/ItemSelectorSheetOptionBinding;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SelectorOptionVH extends RecyclerView.C {

        @NotNull
        private final ItemSelectorSheetOptionBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectorOptionVH(@NotNull ItemSelectorSheetOptionBinding binding) {
            super(binding.getConstraintLayout());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
            binding.getConstraintLayout();
            binding.checkboxV.setSelected(true);
        }

        public final void bind(@NotNull FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option item, String selectedValue) {
            Intrinsics.checkNotNullParameter(item, "item");
            ItemSelectorSheetOptionBinding itemSelectorSheetOptionBinding = this.binding;
            itemSelectorSheetOptionBinding.titleTv.setText(item.getText());
            TextView textView = itemSelectorSheetOptionBinding.subTitleTv;
            Intrinsics.f(textView);
            TextViewExtKt.setTextOrGone(textView, item.getSubText());
            String subTextColor = item.getSubTextColor();
            if (subTextColor != null) {
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Integer parseColor = styleParser.parseColor(context, subTextColor);
                if (parseColor != null) {
                    textView.setTextColor(parseColor.intValue());
                }
            }
            View checkboxV = itemSelectorSheetOptionBinding.checkboxV;
            Intrinsics.checkNotNullExpressionValue(checkboxV, "checkboxV");
            ViewExtKt.showOrGone(checkboxV, Boolean.valueOf(Intrinsics.d(item.getValue(), selectedValue)));
        }

        @NotNull
        public final ItemSelectorSheetOptionBinding getBinding() {
            return this.binding;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectorOptionsAdapter(@NotNull Function1<? super FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option, Unit> onSelected) {
        Intrinsics.checkNotNullParameter(onSelected, "onSelected");
        this.onSelected = onSelected;
        this.items = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$3$lambda$2(SelectorOptionVH selectorOptionVH, SelectorOptionsAdapter selectorOptionsAdapter, View view) {
        Integer valueOf = Integer.valueOf(selectorOptionVH.getAdapterPosition());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option option = selectorOptionsAdapter.items.get(valueOf.intValue());
            if (option != null) {
                selectorOptionsAdapter.onSelected.invoke(option);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.items.size();
    }

    public final void submitList(@NotNull List<FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option> items, @NotNull String selectedValue) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(selectedValue, "selectedValue");
        this.selectedValue = selectedValue;
        List<FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option> list = this.items;
        list.clear();
        list.addAll(items);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull SelectorOptionVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position), this.selectedValue);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public SelectorOptionVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemSelectorSheetOptionBinding inflate = ItemSelectorSheetOptionBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        SelectorOptionVH selectorOptionVH = new SelectorOptionVH(inflate);
        selectorOptionVH.getBinding().getConstraintLayout().setOnClickListener(new a(6, selectorOptionVH, this));
        return selectorOptionVH;
    }
}
