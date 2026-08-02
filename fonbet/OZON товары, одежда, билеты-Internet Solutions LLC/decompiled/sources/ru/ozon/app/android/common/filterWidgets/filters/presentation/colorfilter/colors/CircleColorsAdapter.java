package ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.colors;

import Ve.C4636t5;
import android.view.ViewGroup;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.color.ColorAtom;
import ru.ozon.app.android.storefront.filterWidgets.R$layout;
import ru.ozon.app.android.storefront.filterWidgets.databinding.WidgetFiltersCircularColorFilterItemColorBinding;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/colors/CircleColorsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/atoms/data/color/ColorAtom;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/colors/CircleColorViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/colors/CircleColorViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/colors/CircleColorViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CircleColorsAdapter extends t<ColorAtom, CircleColorViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CircleColorsAdapter(@NotNull Function1<? super AtomAction, Unit> onAction) {
        super(r0);
        CircleColorsAdapterKt$diffUtil$1 diffUtil;
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        diffUtil = CircleColorsAdapterKt.diffUtil();
        this.onAction = onAction;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public CircleColorViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        WidgetFiltersCircularColorFilterItemColorBinding bind = WidgetFiltersCircularColorFilterItemColorBinding.bind(C4636t5.a(parent, "parent").inflate(R$layout.widget_filters_circular_color_filter_item_color, parent, false));
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new CircleColorViewHolder(bind, this.onAction);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull CircleColorViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ColorAtom item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }
}
