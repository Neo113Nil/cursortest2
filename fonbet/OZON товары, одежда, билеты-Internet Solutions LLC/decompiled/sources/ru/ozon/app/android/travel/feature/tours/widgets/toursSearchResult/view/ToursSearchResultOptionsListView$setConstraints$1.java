package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.view;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ToursSearchResultOptionsListView$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ ToursSearchResultOptionsListView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursSearchResultOptionsListView$setConstraints$1(ToursSearchResultOptionsListView toursSearchResultOptionsListView) {
        super(1);
        this.this$0 = toursSearchResultOptionsListView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        Flow flow;
        Flow flow2;
        Flow flow3;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        flow = this.this$0.flowOptions;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, flow);
        flow2 = this.this$0.flowOptions;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, flow2);
        flow3 = this.this$0.flowOptions;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, flow3);
        appCompatImageView = this.this$0.toursSearchResultOptionContinueACIV;
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, appCompatImageView);
        appCompatImageView2 = this.this$0.toursSearchResultOptionContinueACIV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, appCompatImageView2);
        appCompatImageView3 = this.this$0.toursSearchResultOptionContinueACIV;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, appCompatImageView3);
    }
}
