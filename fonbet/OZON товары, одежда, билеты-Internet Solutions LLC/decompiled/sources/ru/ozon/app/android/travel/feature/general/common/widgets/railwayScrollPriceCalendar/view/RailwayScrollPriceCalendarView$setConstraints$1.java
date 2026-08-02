package ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.view;

import android.content.Context;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class RailwayScrollPriceCalendarView$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ RailwayScrollPriceCalendarView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RailwayScrollPriceCalendarView$setConstraints$1(RailwayScrollPriceCalendarView railwayScrollPriceCalendarView) {
        super(1);
        this.this$0 = railwayScrollPriceCalendarView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        AspectView aspectView;
        AspectView aspectView2;
        AspectView aspectView3;
        AspectView aspectView4;
        AspectView aspectView5;
        AspectView aspectView6;
        TextAtomV2View textAtomV2View;
        int i11;
        TextAtomV2View textAtomV2View2;
        int i12;
        TextAtomV2View textAtomV2View3;
        int i13;
        IconView iconView;
        int i14;
        IconView iconView2;
        int i15;
        IconView iconView3;
        int i16;
        TextAtomV2View textAtomV2View4;
        Barrier barrier;
        int i17;
        TextAtomV2View textAtomV2View5;
        int i18;
        TextAtomV2View textAtomV2View6;
        int i19;
        TextAtomV2View textAtomV2View7;
        int i21;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        aspectView = this.this$0.aspectAV;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, aspectView);
        aspectView2 = this.this$0.aspectAV;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, aspectView2);
        aspectView3 = this.this$0.aspectAV;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, aspectView3);
        aspectView4 = this.this$0.aspectAV;
        ConstraintLayoutExtensionsKt.bottomToParent(updateConstraints, aspectView4);
        aspectView5 = this.this$0.aspectAV;
        int id2 = aspectView5.getId();
        Context context = this.this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        updateConstraints.y(id2, ResourceExtKt.toPx(100, context));
        aspectView6 = this.this$0.aspectAV;
        int id3 = aspectView6.getId();
        Context context2 = this.this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        updateConstraints.x(id3, ResourceExtKt.toPx(56, context2));
        textAtomV2View = this.this$0.priceTAV;
        i11 = this.this$0.dp10;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, textAtomV2View, i11);
        textAtomV2View2 = this.this$0.priceTAV;
        i12 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, textAtomV2View2, i12);
        textAtomV2View3 = this.this$0.priceTAV;
        i13 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, textAtomV2View3, i13);
        iconView = this.this$0.priceIconIV;
        i14 = this.this$0.dp10;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, iconView, i14);
        iconView2 = this.this$0.priceIconIV;
        i15 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, iconView2, i15);
        iconView3 = this.this$0.priceIconIV;
        i16 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, iconView3, i16);
        textAtomV2View4 = this.this$0.dateTAV;
        barrier = this.this$0.barrierB;
        i17 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, textAtomV2View4, barrier, i17);
        textAtomV2View5 = this.this$0.dateTAV;
        i18 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, textAtomV2View5, i18);
        textAtomV2View6 = this.this$0.dateTAV;
        i19 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, textAtomV2View6, i19);
        textAtomV2View7 = this.this$0.dateTAV;
        i21 = this.this$0.dp10;
        ConstraintLayoutExtensionsKt.bottomToParent(updateConstraints, textAtomV2View7, i21);
    }
}
