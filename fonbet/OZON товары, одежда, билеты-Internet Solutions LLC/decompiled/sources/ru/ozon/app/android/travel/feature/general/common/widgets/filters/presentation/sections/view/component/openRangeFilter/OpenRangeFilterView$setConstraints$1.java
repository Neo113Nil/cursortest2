package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter;

import androidx.constraintlayout.widget.d;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.seekbar.FilterSeekbar;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class OpenRangeFilterView$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ OpenRangeFilterView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenRangeFilterView$setConstraints$1(OpenRangeFilterView openRangeFilterView) {
        super(1);
        this.this$0 = openRangeFilterView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        TextInputLayout textInputLayout;
        TextInputLayout textInputLayout2;
        TextInputLayout textInputLayout3;
        TextInputLayout textInputLayout4;
        int i11;
        TextInputLayout textInputLayout5;
        TextInputLayout textInputLayout6;
        TextInputLayout textInputLayout7;
        TextInputLayout textInputLayout8;
        FilterSeekbar filterSeekbar;
        TextInputLayout textInputLayout9;
        int i12;
        FilterSeekbar filterSeekbar2;
        FilterSeekbar filterSeekbar3;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        textInputLayout = this.this$0.rangeFromTIL;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, textInputLayout);
        textInputLayout2 = this.this$0.rangeFromTIL;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textInputLayout2);
        textInputLayout3 = this.this$0.rangeFromTIL;
        textInputLayout4 = this.this$0.rangeToTIL;
        i11 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, textInputLayout3, textInputLayout4, i11);
        textInputLayout5 = this.this$0.rangeToTIL;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, textInputLayout5);
        textInputLayout6 = this.this$0.rangeToTIL;
        textInputLayout7 = this.this$0.rangeFromTIL;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, textInputLayout6, textInputLayout7);
        textInputLayout8 = this.this$0.rangeToTIL;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, textInputLayout8);
        filterSeekbar = this.this$0.rangeSeekbar;
        textInputLayout9 = this.this$0.rangeToTIL;
        i12 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, filterSeekbar, textInputLayout9, i12);
        filterSeekbar2 = this.this$0.rangeSeekbar;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, filterSeekbar2);
        filterSeekbar3 = this.this$0.rangeSeekbar;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, filterSeekbar3);
    }
}
