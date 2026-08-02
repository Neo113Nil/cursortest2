package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000bj\u0002`\rH\u0016¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/rv/vh/FilterValuesEmptyViewHolder;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/rv/vh/FilterValuesCellViewHolder;", "containerView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "bind", "", "model", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterValuesEmptyViewHolder extends FilterValuesCellViewHolder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterValuesEmptyViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh.FilterValuesCellViewHolder
    public void bind(@NotNull FilterValuesCell model, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
    }
}
