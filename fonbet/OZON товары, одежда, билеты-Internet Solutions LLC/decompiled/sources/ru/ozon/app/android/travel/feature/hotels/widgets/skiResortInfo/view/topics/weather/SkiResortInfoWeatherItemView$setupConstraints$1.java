package ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.view.topics.weather;

import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class SkiResortInfoWeatherItemView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ SkiResortInfoWeatherItemView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SkiResortInfoWeatherItemView$setupConstraints$1(SkiResortInfoWeatherItemView skiResortInfoWeatherItemView) {
        super(1);
        this.this$0 = skiResortInfoWeatherItemView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        Image image;
        Image image2;
        Image image3;
        TextAtomV2View textAtomV2View;
        TextAtomV2View textAtomV2View2;
        Image image4;
        int i11;
        TextAtomV2View textAtomV2View3;
        Guideline guideline;
        TextAtomV2View textAtomV2View4;
        TextAtomV2View textAtomV2View5;
        TextAtomV2View textAtomV2View6;
        Guideline guideline2;
        int i12;
        TextAtomV2View textAtomV2View7;
        Guideline guideline3;
        TextAtomV2View textAtomV2View8;
        TextAtomV2View textAtomV2View9;
        TextAtomV2View textAtomV2View10;
        TextAtomV2View textAtomV2View11;
        int i13;
        TextAtomV2View textAtomV2View12;
        TextAtomV2View textAtomV2View13;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        image = this.this$0.imageI;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, image);
        image2 = this.this$0.imageI;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, image2);
        image3 = this.this$0.imageI;
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, image3);
        textAtomV2View = this.this$0.monthTAV;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, textAtomV2View);
        textAtomV2View2 = this.this$0.monthTAV;
        image4 = this.this$0.imageI;
        i11 = this.this$0.dp6;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, textAtomV2View2, image4, i11);
        textAtomV2View3 = this.this$0.monthTAV;
        guideline = this.this$0.monthGuidelineG;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, textAtomV2View3, guideline);
        textAtomV2View4 = this.this$0.monthTAV;
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, textAtomV2View4);
        textAtomV2View5 = this.this$0.tempTAV;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, textAtomV2View5);
        textAtomV2View6 = this.this$0.tempTAV;
        guideline2 = this.this$0.monthGuidelineG;
        i12 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, textAtomV2View6, guideline2, i12);
        textAtomV2View7 = this.this$0.tempTAV;
        guideline3 = this.this$0.tempGuidelineG;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, textAtomV2View7, guideline3);
        textAtomV2View8 = this.this$0.tempTAV;
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, textAtomV2View8);
        textAtomV2View9 = this.this$0.snowDepthTAV;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, textAtomV2View9);
        textAtomV2View10 = this.this$0.snowDepthTAV;
        textAtomV2View11 = this.this$0.tempTAV;
        i13 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, textAtomV2View10, textAtomV2View11, i13);
        textAtomV2View12 = this.this$0.snowDepthTAV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, textAtomV2View12);
        textAtomV2View13 = this.this$0.snowDepthTAV;
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, textAtomV2View13);
    }
}
