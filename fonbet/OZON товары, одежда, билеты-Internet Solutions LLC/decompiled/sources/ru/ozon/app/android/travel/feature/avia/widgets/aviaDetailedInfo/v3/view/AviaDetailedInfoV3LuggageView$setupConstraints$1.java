package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.view;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class AviaDetailedInfoV3LuggageView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ AviaDetailedInfoV3LuggageView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaDetailedInfoV3LuggageView$setupConstraints$1(AviaDetailedInfoV3LuggageView aviaDetailedInfoV3LuggageView) {
        super(1);
        this.this$0 = aviaDetailedInfoV3LuggageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        IconView iconView;
        IconView iconView2;
        int i11;
        IconView iconView3;
        IconView iconView4;
        int i12;
        IconView iconView5;
        IconView iconView6;
        int i13;
        TextAtomV2View textAtomV2View;
        IconView iconView7;
        TextAtomV2View textAtomV2View2;
        int i14;
        TextAtomV2View textAtomV2View3;
        IconView iconView8;
        int i15;
        TextAtomV2View textAtomV2View4;
        IconView iconView9;
        VerticalAtomsLayout verticalAtomsLayout;
        TextAtomV2View textAtomV2View5;
        int i16;
        VerticalAtomsLayout verticalAtomsLayout2;
        VerticalAtomsLayout verticalAtomsLayout3;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        iconView = this.this$0.airlineLogoIconViewIV;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, iconView);
        iconView2 = this.this$0.airlineLogoIconViewIV;
        i11 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, iconView2, i11);
        iconView3 = this.this$0.subAirlineLogoIconViewIV;
        iconView4 = this.this$0.airlineLogoIconViewIV;
        i12 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.endToEnd(updateConstraints, iconView3, iconView4, i12);
        iconView5 = this.this$0.subAirlineLogoIconViewIV;
        iconView6 = this.this$0.airlineLogoIconViewIV;
        i13 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, iconView5, iconView6, i13);
        textAtomV2View = this.this$0.routeTAV;
        iconView7 = this.this$0.airlineLogoIconViewIV;
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, textAtomV2View, iconView7);
        textAtomV2View2 = this.this$0.routeTAV;
        i14 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, textAtomV2View2, i14);
        textAtomV2View3 = this.this$0.routeTAV;
        iconView8 = this.this$0.airlineLogoIconViewIV;
        i15 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, textAtomV2View3, iconView8, i15);
        textAtomV2View4 = this.this$0.routeTAV;
        iconView9 = this.this$0.airlineLogoIconViewIV;
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, textAtomV2View4, iconView9);
        verticalAtomsLayout = this.this$0.cellsVAL;
        textAtomV2View5 = this.this$0.routeTAV;
        i16 = this.this$0.dp10;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, verticalAtomsLayout, textAtomV2View5, i16);
        verticalAtomsLayout2 = this.this$0.cellsVAL;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, verticalAtomsLayout2);
        verticalAtomsLayout3 = this.this$0.cellsVAL;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, verticalAtomsLayout3);
    }
}
