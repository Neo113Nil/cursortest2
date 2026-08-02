package ru.ozon.app.android.ugc.widgets.selectionItemForm.productPicker.nested;

import Xc.a;
import Xc.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.productPicker.SelectionFormProductPickerVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.productPicker.nested.views.SelectionFormCellWrapper;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.productPicker.nested.views.SelectionFormIconWrapper;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00030\u0001:\u0001\u001bB\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\u00062\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/nested/SelectionFormProductPickerAdapter;", "Landroidx/recyclerview/widget/t;", "", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/nested/BaseProductPickerViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/nested/BaseProductPickerViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/nested/BaseProductPickerViewHolder;I)V", "getItemViewType", "(I)I", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/SelectionFormProductPickerVO;", "item", "submitList", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/SelectionFormProductPickerVO;)V", "Lkotlin/jvm/functions/Function1;", "SelectionFormProductViewType", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionFormProductPickerAdapter extends t<Object, BaseProductPickerViewHolder<? extends Object>> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/nested/SelectionFormProductPickerAdapter$SelectionFormProductViewType;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_ICON", "TYPE_CELL", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SelectionFormProductViewType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ SelectionFormProductViewType[] $VALUES;
        public static final SelectionFormProductViewType TYPE_ICON = new SelectionFormProductViewType("TYPE_ICON", 0);
        public static final SelectionFormProductViewType TYPE_CELL = new SelectionFormProductViewType("TYPE_CELL", 1);

        private static final /* synthetic */ SelectionFormProductViewType[] $values() {
            return new SelectionFormProductViewType[]{TYPE_ICON, TYPE_CELL};
        }

        static {
            SelectionFormProductViewType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private SelectionFormProductViewType(String str, int i11) {
        }

        public static SelectionFormProductViewType valueOf(String str) {
            return (SelectionFormProductViewType) Enum.valueOf(SelectionFormProductViewType.class, str);
        }

        public static SelectionFormProductViewType[] values() {
            return (SelectionFormProductViewType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectionFormProductPickerAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new i.d<Object>() { // from class: ru.ozon.app.android.ugc.widgets.selectionItemForm.productPicker.nested.SelectionFormProductPickerAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            @SuppressLint({"DiffUtilEquals"})
            public boolean areContentsTheSame(Object oldItem, Object newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(Object oldItem, Object newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getClass().getSimpleName().equals(newItem.getClass().getSimpleName());
            }
        });
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        Object obj = getCurrentList().get(position);
        if (obj instanceof CellDTO) {
            return SelectionFormProductViewType.TYPE_CELL.ordinal();
        }
        if (obj instanceof SelectionFormProductPickerVO.AddProductVO) {
            return SelectionFormProductViewType.TYPE_ICON.ordinal();
        }
        throw new IllegalStateException(("Unknown view type: " + this).toString());
    }

    public final void submitList(@NotNull SelectionFormProductPickerVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Tc.b builder = C7714v.B();
        builder.add(item.getAddProduct());
        builder.addAll(item.getProducts());
        Intrinsics.checkNotNullParameter(builder, "builder");
        submitList(builder.B());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BaseProductPickerViewHolder<? extends Object> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object item = getItem(position);
        Intrinsics.f(item);
        holder.bindItem(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BaseProductPickerViewHolder<? extends Object> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == SelectionFormProductViewType.TYPE_ICON.ordinal()) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new SelectionFormIconVH(new SelectionFormIconWrapper(context, this.actionHandler));
        }
        if (viewType == SelectionFormProductViewType.TYPE_CELL.ordinal()) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            return new SelectionFormCellVH(new SelectionFormCellWrapper(context2, this.actionHandler));
        }
        throw new IllegalStateException(("Unknown view type: " + viewType).toString());
    }
}
