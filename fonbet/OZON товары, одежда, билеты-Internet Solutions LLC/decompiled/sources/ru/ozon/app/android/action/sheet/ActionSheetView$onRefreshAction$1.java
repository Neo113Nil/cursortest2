package ru.ozon.app.android.action.sheet;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.databinding.FragmentActionSheetBinding;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ActionSheetView$onRefreshAction$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ActionSheetView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionSheetView$onRefreshAction$1(ActionSheetView actionSheetView) {
        super(0);
        this.this$0 = actionSheetView;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FragmentActionSheetBinding fragmentActionSheetBinding;
        FragmentActionSheetBinding fragmentActionSheetBinding2;
        fragmentActionSheetBinding = this.this$0.binding;
        FrameLayout progressContainer = fragmentActionSheetBinding.progressContainer;
        Intrinsics.checkNotNullExpressionValue(progressContainer, "progressContainer");
        ActionSheetView actionSheetView = this.this$0;
        ViewGroup.LayoutParams layoutParams = progressContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        fragmentActionSheetBinding2 = actionSheetView.binding;
        layoutParams.height = fragmentActionSheetBinding2.emptyStateContainer.getMeasuredHeight();
        progressContainer.setLayoutParams(layoutParams);
        this.this$0.getOnRefreshClick().invoke();
    }
}
