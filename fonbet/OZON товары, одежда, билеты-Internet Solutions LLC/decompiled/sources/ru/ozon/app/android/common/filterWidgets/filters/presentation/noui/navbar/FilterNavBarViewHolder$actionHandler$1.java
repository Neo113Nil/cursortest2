package ru.ozon.app.android.common.filterWidgets.filters.presentation.noui.navbar;

import Tl.b;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesViewModel;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "atomAction", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FilterNavBarViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ FilterValuesViewModel $viewModel;
    final /* synthetic */ FilterNavBarViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FilterNavBarViewHolder$actionHandler$1(FilterNavBarViewHolder filterNavBarViewHolder, FilterValuesViewModel filterValuesViewModel) {
        super(1);
        this.this$0 = filterNavBarViewHolder;
        this.$viewModel = filterValuesViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click click) {
        i iVar;
        i iVar2;
        View view;
        View findFocus;
        if (b.i(click, "atomAction", "deselectAllValues") || Intrinsics.d(click.getId(), "selectAllValues")) {
            iVar = this.this$0.screenContainer;
            iVar.M().update(UpdateSelectionButtonState.INSTANCE);
            iVar2 = this.this$0.screenContainer;
            ComponentCallbacksC5392m c11 = iVar2.Q().c();
            if (c11 != null && (view = c11.getView()) != null && (findFocus = view.findFocus()) != null) {
                findFocus.clearFocus();
            }
            ConstraintLayout constraintLayout = this.this$0.getBinding().getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            KeyboardUtilsKt.hideKeyboard(constraintLayout);
        }
        this.$viewModel.processClickAction(click);
    }
}
