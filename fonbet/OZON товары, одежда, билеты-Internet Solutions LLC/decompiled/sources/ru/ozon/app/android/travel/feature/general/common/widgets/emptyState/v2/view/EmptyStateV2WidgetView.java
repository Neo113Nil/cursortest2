package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.view;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.presentation.EmptyStateV2WidgetVO;
import ru.ozon.app.android.travel.molecules.view.emptyState.v2.BaseEmptyStateV2View;
import ru.ozon.app.android.travel.molecules.view.quickFiltersRowList.QuickFiltersRowListView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/view/EmptyStateV2WidgetView;", "Lru/ozon/app/android/travel/molecules/view/emptyState/v2/BaseEmptyStateV2View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "addViews", "()V", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/presentation/EmptyStateV2WidgetVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Landroidx/lifecycle/J;", "lifecycleOwner", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/presentation/EmptyStateV2WidgetVO;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/travel/molecules/view/quickFiltersRowList/QuickFiltersRowListView;", "filtersView", "Lru/ozon/app/android/travel/molecules/view/quickFiltersRowList/QuickFiltersRowListView;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmptyStateV2WidgetView extends BaseEmptyStateV2View {
    public static final int $stable = QuickFiltersRowListView.$stable;

    @NotNull
    private final QuickFiltersRowListView filtersView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyStateV2WidgetView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        QuickFiltersRowListView quickFiltersRowListView = new QuickFiltersRowListView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = ResourceExtKt.toPx(24, context);
        quickFiltersRowListView.setLayoutParams(layoutParams);
        this.filtersView = quickFiltersRowListView;
        addViews();
    }

    @Override // ru.ozon.app.android.travel.molecules.view.emptyState.v2.BaseEmptyStateV2View
    protected void addViews() {
        super.addViews();
        addView(this.filtersView);
    }

    public final void bind(@NotNull EmptyStateV2WidgetVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        bind(item.getEmptyState(), actionHandler);
        this.filtersView.bindOrGone(item.getFiltersBlock(), actionHandler, lifecycleOwner);
    }
}
