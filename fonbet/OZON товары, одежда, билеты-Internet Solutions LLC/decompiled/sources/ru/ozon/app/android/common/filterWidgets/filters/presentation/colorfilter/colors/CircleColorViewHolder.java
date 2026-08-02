package ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.colors;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.color.ColorAtom;
import ru.ozon.app.android.atoms.v3.holders.color.ColorHolderKt;
import ru.ozon.app.android.storefront.filterWidgets.databinding.WidgetFiltersCircularColorFilterItemColorBinding;
import ru.ozon.app.android.uikit.view.atoms.color.ColorView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/colors/CircleColorViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersCircularColorFilterItemColorBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersCircularColorFilterItemColorBinding;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/atoms/data/color/ColorAtom;", "item", "bind", "(Lru/ozon/app/android/atoms/data/color/ColorAtom;)V", "Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersCircularColorFilterItemColorBinding;", "Lkotlin/jvm/functions/Function1;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CircleColorViewHolder extends RecyclerView.C {

    @NotNull
    private final WidgetFiltersCircularColorFilterItemColorBinding binding;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CircleColorViewHolder(@NotNull WidgetFiltersCircularColorFilterItemColorBinding binding, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.binding = binding;
        this.onAction = onAction;
    }

    public final void bind(@NotNull ColorAtom item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ColorView color = this.binding.color;
        Intrinsics.checkNotNullExpressionValue(color, "color");
        ColorHolderKt.bind(color, item, this.onAction);
    }
}
