package ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.colors;

import Sc.InterfaceC4008j;
import Ve.C4636t5;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filters.data.FiltersDTO;
import ru.ozon.app.android.storefront.filterWidgets.R$layout;
import ru.ozon.app.android.storefront.filterWidgets.databinding.WidgetFiltersSquareColorFilterItemColorBinding;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001a\u001a\u00020\u00062\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u001b\u0010!\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/colors/SquareColorsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$ColorIcon;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/colors/SquareColorViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Landroid/content/Context;", "context", "<init>", "(Lkotlin/jvm/functions/Function1;Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/colors/SquareColorViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/colors/SquareColorViewHolder;I)V", "", "list", "", "scrollEnabled", "submitList", "(Ljava/util/List;Z)V", "Lkotlin/jvm/functions/Function1;", "itemsCountLimit$delegate", "LSc/j;", "getItemsCountLimit", "()I", "itemsCountLimit", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SquareColorsAdapter extends t<FiltersDTO.ColorIcon, SquareColorViewHolder> {

    /* renamed from: itemsCountLimit$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j itemsCountLimit;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SquareColorsAdapter(@NotNull Function1<? super AtomAction, Unit> onAction, @NotNull Context context) {
        super(r0);
        SquareColorsAdapterKt$diffUtil$1 diffUtil;
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(context, "context");
        diffUtil = SquareColorsAdapterKt.diffUtil();
        this.onAction = onAction;
        this.itemsCountLimit = LazyUtilsKt.unsafeLazy(new SquareColorsAdapter$itemsCountLimit$2(context));
    }

    private final int getItemsCountLimit() {
        return ((Number) this.itemsCountLimit.getValue()).intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public SquareColorViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        WidgetFiltersSquareColorFilterItemColorBinding bind = WidgetFiltersSquareColorFilterItemColorBinding.bind(C4636t5.a(parent, "parent").inflate(R$layout.widget_filters_square_color_filter_item_color, parent, false));
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new SquareColorViewHolder(bind, this.onAction);
    }

    public final void submitList(List<FiltersDTO.ColorIcon> list, boolean scrollEnabled) {
        if (scrollEnabled) {
            submitList(list);
        } else {
            submitList(list != null ? C7714v.K0(list, getItemsCountLimit()) : null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull SquareColorViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        FiltersDTO.ColorIcon item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }
}
