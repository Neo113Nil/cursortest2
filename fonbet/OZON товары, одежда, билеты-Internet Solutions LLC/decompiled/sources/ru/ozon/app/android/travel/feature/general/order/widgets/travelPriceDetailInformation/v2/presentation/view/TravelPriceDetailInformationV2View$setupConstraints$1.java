package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.view;

import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class TravelPriceDetailInformationV2View$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ TravelPriceDetailInformationV2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPriceDetailInformationV2View$setupConstraints$1(TravelPriceDetailInformationV2View travelPriceDetailInformationV2View) {
        super(1);
        this.this$0 = travelPriceDetailInformationV2View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        View view;
        View view2;
        View view3;
        int i11;
        View view4;
        int i12;
        int i13;
        View view5;
        int i14;
        Barrier barrier;
        int i15;
        int i16;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, this.this$0.getTitle(), this.this$0.getSubtitle());
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, this.this$0.getTitle());
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, this.this$0.getTitle());
        applyConstraint.s(this.this$0.getTitle().getId(), 5, this.this$0.getSubtitle().getId(), 5);
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, this.this$0.getSubtitle());
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, this.this$0.getSubtitle(), this.this$0.getTitle());
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, this.this$0.getPriceRows());
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, this.this$0.getPriceRows());
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, this.this$0.getPriceRows(), this.this$0.getTitle());
        view = this.this$0.separatorView;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, view);
        view2 = this.this$0.separatorView;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, view2);
        view3 = this.this$0.separatorView;
        RecyclerView priceRows = this.this$0.getPriceRows();
        i11 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, view3, priceRows, i11);
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, this.this$0.getPriceDetailTotal());
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, this.this$0.getPriceDetailTotal());
        PriceRowView priceDetailTotal = this.this$0.getPriceDetailTotal();
        view4 = this.this$0.separatorView;
        i12 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, priceDetailTotal, view4, i12);
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, this.this$0.getUnderTotal());
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, this.this$0.getUnderTotal());
        PriceRowView underTotal = this.this$0.getUnderTotal();
        PriceRowView priceDetailTotal2 = this.this$0.getPriceDetailTotal();
        i13 = this.this$0.dp6;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, underTotal, priceDetailTotal2, i13);
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, this.this$0.getBonusTotal());
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, this.this$0.getBonusTotal());
        TravelPriceDetailInformationV2BonusView bonusTotal = this.this$0.getBonusTotal();
        view5 = this.this$0.separatorView;
        i14 = this.this$0.dp14;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, bonusTotal, view5, i14);
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, this.this$0.getButton());
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, this.this$0.getButton());
        SingleAtom button = this.this$0.getButton();
        barrier = this.this$0.barrier;
        i15 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, button, barrier, i15);
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, this.this$0.getAdditionalInfo());
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, this.this$0.getAdditionalInfo());
        TextAtomView additionalInfo = this.this$0.getAdditionalInfo();
        SingleAtom button2 = this.this$0.getButton();
        i16 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, additionalInfo, button2, i16);
    }
}
