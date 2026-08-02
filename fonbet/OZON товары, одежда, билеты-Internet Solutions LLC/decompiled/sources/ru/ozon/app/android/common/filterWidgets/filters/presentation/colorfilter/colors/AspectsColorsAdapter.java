package ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.colors;

import Ve.C4636t5;
import android.view.ViewGroup;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filters.data.FiltersDTO;
import ru.ozon.app.android.storefront.filterWidgets.R$layout;
import ru.ozon.app.android.storefront.filterWidgets.databinding.WidgetFiltersAspectsColorFilterItemColorBinding;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/colors/AspectsColorsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$ColorAspect;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/colors/AspectsColorViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/colors/AspectsColorViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/colors/AspectsColorViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AspectsColorsAdapter extends t<FiltersDTO.ColorAspect, AspectsColorViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AspectsColorsAdapter(@NotNull Function1<? super AtomAction, Unit> onAction) {
        super(r0);
        AspectsColorsAdapterKt$diffUtil$1 diffUtil;
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        diffUtil = AspectsColorsAdapterKt.diffUtil();
        this.onAction = onAction;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public AspectsColorViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        WidgetFiltersAspectsColorFilterItemColorBinding bind = WidgetFiltersAspectsColorFilterItemColorBinding.bind(C4636t5.a(parent, "parent").inflate(R$layout.widget_filters_aspects_color_filter_item_color, parent, false));
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new AspectsColorViewHolder(bind, this.onAction);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull AspectsColorViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        FiltersDTO.ColorAspect item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }
}
