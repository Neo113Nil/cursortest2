package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwaySchemeView;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.tabs.TabAtomView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class TravelRailwaySeatSelectWithSchemeView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ TravelRailwaySeatSelectWithSchemeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelRailwaySeatSelectWithSchemeView$setupConstraints$1(TravelRailwaySeatSelectWithSchemeView travelRailwaySeatSelectWithSchemeView) {
        super(1);
        this.this$0 = travelRailwaySeatSelectWithSchemeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        TabAtomView tabAtomView;
        int i11;
        TabAtomView tabAtomView2;
        int i12;
        TabAtomView tabAtomView3;
        int i13;
        TravelRailwaySchemeView travelRailwaySchemeView;
        TabAtomView tabAtomView4;
        int i14;
        TravelRailwaySchemeView travelRailwaySchemeView2;
        TravelRailwaySchemeView travelRailwaySchemeView3;
        TextAtomView scrollDescriptionTav;
        TravelRailwaySchemeView travelRailwaySchemeView4;
        int i15;
        TextAtomView scrollDescriptionTav2;
        TextAtomView scrollDescriptionTav3;
        int i16;
        TextAtomV2View trainDirectionTav;
        TravelRailwaySchemeView travelRailwaySchemeView5;
        int i17;
        TextAtomV2View trainDirectionTav2;
        int i18;
        TextAtomV2View trainDirectionTav3;
        IconView trainDirectionIconIV;
        TextAtomV2View trainDirectionTav4;
        TextAtomV2View trainDirectionTav5;
        IconView trainDirectionIconIV2;
        TextAtomV2View trainDirectionTav6;
        IconView trainDirectionIconIV3;
        TextAtomV2View trainDirectionTav7;
        IconView trainDirectionIconIV4;
        TextAtomV2View trainDirectionTav8;
        int i19;
        IconView trainDirectionIconIV5;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        tabAtomView = this.this$0.storeyTabSelector;
        i11 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, tabAtomView, i11);
        tabAtomView2 = this.this$0.storeyTabSelector;
        i12 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, tabAtomView2, i12);
        tabAtomView3 = this.this$0.storeyTabSelector;
        i13 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, tabAtomView3, i13);
        travelRailwaySchemeView = this.this$0.schemeView;
        tabAtomView4 = this.this$0.storeyTabSelector;
        i14 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, travelRailwaySchemeView, tabAtomView4, i14);
        travelRailwaySchemeView2 = this.this$0.schemeView;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, travelRailwaySchemeView2);
        travelRailwaySchemeView3 = this.this$0.schemeView;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, travelRailwaySchemeView3);
        scrollDescriptionTav = this.this$0.getScrollDescriptionTav();
        travelRailwaySchemeView4 = this.this$0.schemeView;
        i15 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, scrollDescriptionTav, travelRailwaySchemeView4, i15);
        scrollDescriptionTav2 = this.this$0.getScrollDescriptionTav();
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, scrollDescriptionTav2);
        scrollDescriptionTav3 = this.this$0.getScrollDescriptionTav();
        i16 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, scrollDescriptionTav3, i16);
        trainDirectionTav = this.this$0.getTrainDirectionTav();
        travelRailwaySchemeView5 = this.this$0.schemeView;
        i17 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, trainDirectionTav, travelRailwaySchemeView5, i17);
        trainDirectionTav2 = this.this$0.getTrainDirectionTav();
        i18 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, trainDirectionTav2, i18);
        trainDirectionTav3 = this.this$0.getTrainDirectionTav();
        trainDirectionIconIV = this.this$0.getTrainDirectionIconIV();
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, trainDirectionTav3, trainDirectionIconIV);
        trainDirectionTav4 = this.this$0.getTrainDirectionTav();
        updateConstraints.c0(0.0f, trainDirectionTav4.getId());
        trainDirectionTav5 = this.this$0.getTrainDirectionTav();
        updateConstraints.d0(trainDirectionTav5.getId(), 2);
        trainDirectionIconIV2 = this.this$0.getTrainDirectionIconIV();
        trainDirectionTav6 = this.this$0.getTrainDirectionTav();
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, trainDirectionIconIV2, trainDirectionTav6);
        trainDirectionIconIV3 = this.this$0.getTrainDirectionIconIV();
        trainDirectionTav7 = this.this$0.getTrainDirectionTav();
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, trainDirectionIconIV3, trainDirectionTav7);
        trainDirectionIconIV4 = this.this$0.getTrainDirectionIconIV();
        trainDirectionTav8 = this.this$0.getTrainDirectionTav();
        i19 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, trainDirectionIconIV4, trainDirectionTav8, i19);
        trainDirectionIconIV5 = this.this$0.getTrainDirectionIconIV();
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, trainDirectionIconIV5);
    }
}
