package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.view;

import android.view.View;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class HotelsBookTotalV2View$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ HotelsBookTotalV2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsBookTotalV2View$setConstraints$1(HotelsBookTotalV2View hotelsBookTotalV2View) {
        super(1);
        this.this$0 = hotelsBookTotalV2View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        TextAtomV2View textAtomV2View;
        TextAtomV2View textAtomV2View2;
        TextAtomV2View textAtomV2View3;
        RecyclerView recyclerView;
        TextAtomV2View textAtomV2View4;
        int i11;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        View view;
        RecyclerView recyclerView4;
        int i12;
        View view2;
        View view3;
        RecyclerView recyclerView5;
        View view4;
        int i13;
        RecyclerView recyclerView6;
        RecyclerView recyclerView7;
        RecyclerView recyclerView8;
        int i14;
        TextAtomV2View textAtomV2View5;
        int i15;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        textAtomV2View = this.this$0.titleTextView;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, textAtomV2View);
        textAtomV2View2 = this.this$0.titleTextView;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomV2View2);
        textAtomV2View3 = this.this$0.titleTextView;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, textAtomV2View3);
        recyclerView = this.this$0.priceDetailsRecyclerView;
        textAtomV2View4 = this.this$0.titleTextView;
        i11 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, recyclerView, textAtomV2View4, i11);
        recyclerView2 = this.this$0.priceDetailsRecyclerView;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, recyclerView2);
        recyclerView3 = this.this$0.priceDetailsRecyclerView;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, recyclerView3);
        view = this.this$0.dividerView;
        recyclerView4 = this.this$0.priceDetailsRecyclerView;
        i12 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, view, recyclerView4, i12);
        view2 = this.this$0.dividerView;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, view2);
        view3 = this.this$0.dividerView;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, view3);
        recyclerView5 = this.this$0.totalPriceDetailsRecyclerView;
        view4 = this.this$0.dividerView;
        i13 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, recyclerView5, view4, i13);
        recyclerView6 = this.this$0.totalPriceDetailsRecyclerView;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, recyclerView6);
        recyclerView7 = this.this$0.totalPriceDetailsRecyclerView;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, recyclerView7);
        ButtonV3View buttonView = this.this$0.getButtonView();
        recyclerView8 = this.this$0.totalPriceDetailsRecyclerView;
        i14 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, buttonView, recyclerView8, i14);
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, this.this$0.getButtonView());
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, this.this$0.getButtonView());
        ConstraintLayoutExtensionsKt.startToStart(applyConstraint, this.this$0.getButtonLoaderView(), this.this$0.getButtonView());
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, this.this$0.getButtonLoaderView(), this.this$0.getButtonView());
        ConstraintLayoutExtensionsKt.endToEnd(applyConstraint, this.this$0.getButtonLoaderView(), this.this$0.getButtonView());
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, this.this$0.getButtonLoaderView(), this.this$0.getButtonView());
        textAtomV2View5 = this.this$0.agreementTextView;
        ButtonV3View buttonView2 = this.this$0.getButtonView();
        i15 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, textAtomV2View5, buttonView2, i15);
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, this.this$0.getButtonView());
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, this.this$0.getButtonView());
    }
}
