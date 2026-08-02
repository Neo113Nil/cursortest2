package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.CheckBox;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.CheckBoxWithIcon;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.DescriptionCell;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.HeaderCell;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.MegaCellCheckboxFilter;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.RoundedCell;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.TitleCell;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh.FilterValuesCellViewHolder;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh.FilterValuesCheckboxViewHolder;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh.FilterValuesCheckboxWithIconViewHolder;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh.FilterValuesDescriptionViewHolder;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh.FilterValuesEmptyViewHolder;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh.FilterValuesHeaderViewHolder;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh.FilterValuesMegaCellCheckboxViewHolder;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh.FilterValuesRoundedCellViewHolder;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh.FilterValuesTitleViewHolder;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/rv/FilterValuesRvHelper;", "", "<init>", "()V", "createViewHolder", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/rv/vh/FilterValuesCellViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "isSelect", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterValuesRvHelper {

    @NotNull
    public static final FilterValuesRvHelper INSTANCE = new FilterValuesRvHelper();

    private FilterValuesRvHelper() {
    }

    @NotNull
    public final FilterValuesCellViewHolder createViewHolder(@NotNull ViewGroup parent, int viewType, @NotNull Function1<? super AtomAction, Unit> actionHandler, boolean isSelect) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        return viewType == CheckBoxWithIcon.INSTANCE.getViewType() ? new FilterValuesCheckboxWithIconViewHolder(ViewGroupExtKt.inflate(parent, viewType)) : viewType == CheckBox.INSTANCE.getViewType() ? new FilterValuesCheckboxViewHolder(ViewGroupExtKt.inflate(parent, viewType)) : viewType == RoundedCell.INSTANCE.getViewType() ? new FilterValuesRoundedCellViewHolder(ViewGroupExtKt.inflate(parent, viewType)) : viewType == TitleCell.INSTANCE.getViewType() ? new FilterValuesTitleViewHolder(ViewGroupExtKt.inflate(parent, viewType)) : viewType == HeaderCell.INSTANCE.getViewType() ? new FilterValuesHeaderViewHolder(isSelect, ViewGroupExtKt.inflate(parent, viewType)) : viewType == DescriptionCell.INSTANCE.getViewType() ? new FilterValuesDescriptionViewHolder(ViewGroupExtKt.inflate(parent, viewType)) : viewType == MegaCellCheckboxFilter.INSTANCE.getViewType() ? new FilterValuesMegaCellCheckboxViewHolder(actionHandler, ViewGroupExtKt.inflate(parent, viewType)) : new FilterValuesEmptyViewHolder(new View(parent.getContext()));
    }
}
