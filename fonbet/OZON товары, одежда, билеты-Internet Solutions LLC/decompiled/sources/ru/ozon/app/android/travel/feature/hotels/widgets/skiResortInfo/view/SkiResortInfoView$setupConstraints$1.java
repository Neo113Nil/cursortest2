package ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.view;

import android.widget.FrameLayout;
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
import ru.ozon.uni.android.uikit.view.atoms.tabs.TabAtomView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class SkiResortInfoView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ SkiResortInfoView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SkiResortInfoView$setupConstraints$1(SkiResortInfoView skiResortInfoView) {
        super(1);
        this.this$0 = skiResortInfoView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        TextAtomV2View textAtomV2View;
        int i11;
        TextAtomV2View textAtomV2View2;
        int i12;
        TextAtomV2View textAtomV2View3;
        Guideline guideline;
        Image image;
        Guideline guideline2;
        int i13;
        Image image2;
        TabAtomView tabAtomView;
        int i14;
        TabAtomView tabAtomView2;
        TextAtomV2View textAtomV2View4;
        int i15;
        TabAtomView tabAtomView3;
        int i16;
        TabAtomView tabAtomView4;
        int i17;
        FrameLayout frameLayout;
        TabAtomView tabAtomView5;
        int i18;
        FrameLayout frameLayout2;
        int i19;
        FrameLayout frameLayout3;
        int i21;
        FrameLayout frameLayout4;
        int i22;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        textAtomV2View = this.this$0.titleTAV;
        i11 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, textAtomV2View, i11);
        textAtomV2View2 = this.this$0.titleTAV;
        i12 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomV2View2, i12);
        textAtomV2View3 = this.this$0.titleTAV;
        guideline = this.this$0.titleGuidelineG;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, textAtomV2View3, guideline);
        image = this.this$0.themeImageI;
        guideline2 = this.this$0.titleGuidelineG;
        i13 = this.this$0.dp13;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, image, guideline2, i13);
        image2 = this.this$0.themeImageI;
        tabAtomView = this.this$0.tabsTAV;
        i14 = this.this$0.dp10;
        ConstraintLayoutExtensionsKt.bottomToTop(applyConstraint, image2, tabAtomView, i14);
        tabAtomView2 = this.this$0.tabsTAV;
        textAtomV2View4 = this.this$0.titleTAV;
        i15 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, tabAtomView2, textAtomV2View4, i15);
        tabAtomView3 = this.this$0.tabsTAV;
        i16 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, tabAtomView3, i16);
        tabAtomView4 = this.this$0.tabsTAV;
        i17 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, tabAtomView4, i17);
        frameLayout = this.this$0.topicsFL;
        tabAtomView5 = this.this$0.tabsTAV;
        i18 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, frameLayout, tabAtomView5, i18);
        frameLayout2 = this.this$0.topicsFL;
        i19 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, frameLayout2, i19);
        frameLayout3 = this.this$0.topicsFL;
        i21 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, frameLayout3, i21);
        frameLayout4 = this.this$0.topicsFL;
        i22 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, frameLayout4, i22);
    }
}
