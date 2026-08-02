package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.header;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class FiltersHeaderView$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ FiltersHeaderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FiltersHeaderView$setConstraints$1(FiltersHeaderView filtersHeaderView) {
        super(1);
        this.this$0 = filtersHeaderView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        ButtonV3View buttonV3View;
        ButtonV3View buttonV3View2;
        int i11;
        ButtonV3View buttonV3View3;
        int i12;
        TextAtomV2View textAtomV2View;
        TextAtomV2View textAtomV2View2;
        int i13;
        TextAtomV2View textAtomV2View3;
        int i14;
        TextAtomV2View textAtomV2View4;
        int i15;
        IconButtonV3View iconButtonV3View;
        IconButtonV3View iconButtonV3View2;
        int i16;
        IconButtonV3View iconButtonV3View3;
        int i17;
        FiltersProgressBarView filtersProgressBarView;
        FiltersProgressBarView filtersProgressBarView2;
        FiltersProgressBarView filtersProgressBarView3;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        buttonV3View = this.this$0.leftButtonBV;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, buttonV3View);
        buttonV3View2 = this.this$0.leftButtonBV;
        i11 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, buttonV3View2, i11);
        buttonV3View3 = this.this$0.leftButtonBV;
        i12 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, buttonV3View3, i12);
        textAtomV2View = this.this$0.titleTAV;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, textAtomV2View);
        textAtomV2View2 = this.this$0.titleTAV;
        i13 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomV2View2, i13);
        textAtomV2View3 = this.this$0.titleTAV;
        i14 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, textAtomV2View3, i14);
        textAtomV2View4 = this.this$0.titleTAV;
        i15 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, textAtomV2View4, i15);
        iconButtonV3View = this.this$0.rightButtonBV;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, iconButtonV3View);
        iconButtonV3View2 = this.this$0.rightButtonBV;
        i16 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, iconButtonV3View2, i16);
        iconButtonV3View3 = this.this$0.rightButtonBV;
        i17 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, iconButtonV3View3, i17);
        filtersProgressBarView = this.this$0.progressBarView;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, filtersProgressBarView);
        filtersProgressBarView2 = this.this$0.progressBarView;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, filtersProgressBarView2);
        filtersProgressBarView3 = this.this$0.progressBarView;
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, filtersProgressBarView3);
    }
}
