package ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.view.topics.trails;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.d;
import com.google.android.flexbox.FlexboxLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class SkiResortInfoTrailsView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ SkiResortInfoTrailsView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SkiResortInfoTrailsView$setupConstraints$1(SkiResortInfoTrailsView skiResortInfoTrailsView) {
        super(1);
        this.this$0 = skiResortInfoTrailsView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        FrameLayout frameLayout;
        LinearLayout linearLayout4;
        int i11;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        TextAtomV2View textAtomV2View;
        FrameLayout frameLayout4;
        int i12;
        TextAtomV2View textAtomV2View2;
        TextAtomV2View textAtomV2View3;
        TextAtomV2View textAtomV2View4;
        FlexboxLayout flexboxLayout;
        TextAtomV2View textAtomV2View5;
        int i13;
        FlexboxLayout flexboxLayout2;
        FlexboxLayout flexboxLayout3;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        linearLayout = this.this$0.itemsLL;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, linearLayout);
        linearLayout2 = this.this$0.itemsLL;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, linearLayout2);
        linearLayout3 = this.this$0.itemsLL;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, linearLayout3);
        frameLayout = this.this$0.mapFL;
        linearLayout4 = this.this$0.itemsLL;
        i11 = this.this$0.dp20;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, frameLayout, linearLayout4, i11);
        frameLayout2 = this.this$0.mapFL;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, frameLayout2);
        frameLayout3 = this.this$0.mapFL;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, frameLayout3);
        textAtomV2View = this.this$0.headerTAV;
        frameLayout4 = this.this$0.mapFL;
        i12 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, textAtomV2View, frameLayout4, i12);
        textAtomV2View2 = this.this$0.headerTAV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomV2View2);
        textAtomV2View3 = this.this$0.headerTAV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, textAtomV2View3);
        textAtomV2View4 = this.this$0.headerTAV;
        applyConstraint.c0(0.0f, textAtomV2View4.getId());
        flexboxLayout = this.this$0.liftTypeDetailItemsFL;
        textAtomV2View5 = this.this$0.headerTAV;
        i13 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, flexboxLayout, textAtomV2View5, i13);
        flexboxLayout2 = this.this$0.liftTypeDetailItemsFL;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, flexboxLayout2);
        flexboxLayout3 = this.this$0.liftTypeDetailItemsFL;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, flexboxLayout3);
    }
}
