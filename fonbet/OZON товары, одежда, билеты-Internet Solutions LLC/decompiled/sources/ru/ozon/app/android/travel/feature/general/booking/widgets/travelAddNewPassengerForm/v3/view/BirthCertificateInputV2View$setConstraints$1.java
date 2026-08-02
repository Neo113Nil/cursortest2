package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.view;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.view.commonInput.v2.view.CommonSelectorInputV2View;
import ru.ozon.app.android.travel.molecules.view.commonInput.v2.view.CommonTextInputV2View;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class BirthCertificateInputV2View$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ BirthCertificateInputV2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BirthCertificateInputV2View$setConstraints$1(BirthCertificateInputV2View birthCertificateInputV2View) {
        super(1);
        this.this$0 = birthCertificateInputV2View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        CommonSelectorInputV2View commonSelectorInputV2View;
        CommonSelectorInputV2View commonSelectorInputV2View2;
        CommonSelectorInputV2View commonSelectorInputV2View3;
        AppCompatTextView appCompatTextView;
        int i11;
        AppCompatTextView appCompatTextView2;
        CommonSelectorInputV2View commonSelectorInputV2View4;
        AppCompatTextView appCompatTextView3;
        CommonSelectorInputV2View commonSelectorInputV2View5;
        AppCompatTextView appCompatTextView4;
        Guideline guideline;
        AppCompatTextView appCompatTextView5;
        Guideline guideline2;
        AppCompatTextView appCompatTextView6;
        int i12;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        commonSelectorInputV2View = this.this$0.seriesSelectorInputV2View;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, commonSelectorInputV2View);
        commonSelectorInputV2View2 = this.this$0.seriesSelectorInputV2View;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, commonSelectorInputV2View2);
        commonSelectorInputV2View3 = this.this$0.seriesSelectorInputV2View;
        appCompatTextView = this.this$0.dashSeparatorInputV2View;
        i11 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, commonSelectorInputV2View3, appCompatTextView, i11);
        appCompatTextView2 = this.this$0.dashSeparatorInputV2View;
        commonSelectorInputV2View4 = this.this$0.seriesSelectorInputV2View;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, appCompatTextView2, commonSelectorInputV2View4);
        appCompatTextView3 = this.this$0.dashSeparatorInputV2View;
        commonSelectorInputV2View5 = this.this$0.seriesSelectorInputV2View;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, appCompatTextView3, commonSelectorInputV2View5);
        appCompatTextView4 = this.this$0.dashSeparatorInputV2View;
        guideline = this.this$0.guidelineG;
        ConstraintLayoutExtensionsKt.startToStart(applyConstraint, appCompatTextView4, guideline);
        appCompatTextView5 = this.this$0.dashSeparatorInputV2View;
        guideline2 = this.this$0.guidelineG;
        ConstraintLayoutExtensionsKt.endToEnd(applyConstraint, appCompatTextView5, guideline2);
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, this.this$0.seriesTextInputV2View);
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, this.this$0.seriesTextInputV2View);
        CommonTextInputV2View commonTextInputV2View = this.this$0.seriesTextInputV2View;
        appCompatTextView6 = this.this$0.dashSeparatorInputV2View;
        i12 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, commonTextInputV2View, appCompatTextView6, i12);
    }
}
