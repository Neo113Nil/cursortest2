package ru.ozon.app.android.uikit.dialog.sort;

import Cw.ViewOnClickListenerC2787a;
import Ve.C4636t5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$layout;
import ru.ozon.app.android.uikit.databinding.FragmentSortsBottomSheetDialogItemBinding;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001eB)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\b2\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/uikit/dialog/sort/SortsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/uikit/dialog/sort/SortsAdapter$SortItemVH;", "", "Lru/ozon/app/android/uikit/dialog/sort/SortItem;", "items", "Lkotlin/Function1;", "Landroid/view/View;", "", "callback", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/uikit/dialog/sort/SortsAdapter$SortItemVH;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/uikit/dialog/sort/SortsAdapter$SortItemVH;I)V", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lkotlin/jvm/functions/Function1;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "SortItemVH", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SortsAdapter extends RecyclerView.g<SortItemVH> {

    @NotNull
    private final Function1<View, Unit> callback;

    @NotNull
    private final List<SortItem> items;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/uikit/dialog/sort/SortsAdapter$SortItemVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "containerView", "<init>", "(Lru/ozon/app/android/uikit/dialog/sort/SortsAdapter;Landroid/view/View;)V", "Lru/ozon/app/android/uikit/dialog/sort/SortItem;", "item", "", "bind", "(Lru/ozon/app/android/uikit/dialog/sort/SortItem;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/uikit/databinding/FragmentSortsBottomSheetDialogItemBinding;", "binding", "Lru/ozon/app/android/uikit/databinding/FragmentSortsBottomSheetDialogItemBinding;", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SortItemVH extends RecyclerView.C {

        @NotNull
        private final FragmentSortsBottomSheetDialogItemBinding binding;

        @NotNull
        private final View containerView;
        final /* synthetic */ SortsAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SortItemVH(@NotNull SortsAdapter sortsAdapter, View containerView) {
            super(containerView);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            this.this$0 = sortsAdapter;
            this.containerView = containerView;
            FragmentSortsBottomSheetDialogItemBinding bind = FragmentSortsBottomSheetDialogItemBinding.bind(containerView);
            Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
            this.binding = bind;
        }

        public final void bind(@NotNull SortItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            CheckedTextView checkedTextView = this.binding.textTv;
            checkedTextView.setText(item.getName());
            checkedTextView.setChecked(item.getIsSelected());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SortsAdapter(@NotNull List<SortItem> items, @NotNull Function1<? super View, Unit> callback) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.items = items;
        this.callback = callback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$1$lambda$0(SortsAdapter sortsAdapter, View view) {
        Function1<View, Unit> function1 = sortsAdapter.callback;
        Intrinsics.f(view);
        function1.invoke(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public SortItemVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        View inflate = C4636t5.a(parent, "parent").inflate(R$layout.fragment_sorts_bottom_sheet_dialog_item, parent, false);
        inflate.setOnClickListener(new ViewOnClickListenerC2787a(this, 14));
        return new SortItemVH(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull SortItemVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }
}
