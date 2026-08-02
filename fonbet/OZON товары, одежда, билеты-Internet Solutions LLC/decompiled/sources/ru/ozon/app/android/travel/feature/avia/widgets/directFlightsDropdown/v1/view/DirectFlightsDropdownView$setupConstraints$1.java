package ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view;

import android.view.View;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class DirectFlightsDropdownView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ DirectFlightsDropdownView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectFlightsDropdownView$setupConstraints$1(DirectFlightsDropdownView directFlightsDropdownView) {
        super(1);
        this.this$0 = directFlightsDropdownView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        TextAtomV2View textAtomV2View;
        TextAtomV2View textAtomV2View2;
        TextAtomV2View textAtomV2View3;
        TextAtomV2View textAtomV2View4;
        int i11;
        IconView iconView;
        TextAtomV2View textAtomV2View5;
        IconView iconView2;
        TextAtomV2View textAtomV2View6;
        IconView iconView3;
        TextAtomV2View textAtomV2View7;
        TextAtomV2View textAtomV2View8;
        TextAtomV2View textAtomV2View9;
        TextAtomV2View textAtomV2View10;
        TextAtomV2View textAtomV2View11;
        IconView iconView4;
        int i12;
        View view;
        TextAtomV2View textAtomV2View12;
        View view2;
        IconView iconView5;
        View view3;
        TextAtomV2View textAtomV2View13;
        View view4;
        TextAtomV2View textAtomV2View14;
        RecyclerView recyclerView;
        TextAtomV2View textAtomV2View15;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        textAtomV2View = this.this$0.title;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, textAtomV2View);
        textAtomV2View2 = this.this$0.title;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, textAtomV2View2);
        textAtomV2View3 = this.this$0.title;
        textAtomV2View4 = this.this$0.expandButtonTitle;
        i11 = this.this$0.dp6;
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, textAtomV2View3, textAtomV2View4, i11);
        iconView = this.this$0.expandButtonIcon;
        textAtomV2View5 = this.this$0.title;
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, iconView, textAtomV2View5);
        iconView2 = this.this$0.expandButtonIcon;
        textAtomV2View6 = this.this$0.title;
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, iconView2, textAtomV2View6);
        iconView3 = this.this$0.expandButtonIcon;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, iconView3);
        textAtomV2View7 = this.this$0.expandButtonTitle;
        textAtomV2View8 = this.this$0.title;
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, textAtomV2View7, textAtomV2View8);
        textAtomV2View9 = this.this$0.expandButtonTitle;
        textAtomV2View10 = this.this$0.title;
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, textAtomV2View9, textAtomV2View10);
        textAtomV2View11 = this.this$0.expandButtonTitle;
        iconView4 = this.this$0.expandButtonIcon;
        i12 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, textAtomV2View11, iconView4, i12);
        view = this.this$0.expandButtonOverlay;
        textAtomV2View12 = this.this$0.expandButtonTitle;
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, view, textAtomV2View12);
        view2 = this.this$0.expandButtonOverlay;
        iconView5 = this.this$0.expandButtonIcon;
        ConstraintLayoutExtensionsKt.endToEnd(updateConstraints, view2, iconView5);
        view3 = this.this$0.expandButtonOverlay;
        textAtomV2View13 = this.this$0.expandButtonTitle;
        ConstraintLayoutExtensionsKt.startToStart(updateConstraints, view3, textAtomV2View13);
        view4 = this.this$0.expandButtonOverlay;
        textAtomV2View14 = this.this$0.expandButtonTitle;
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, view4, textAtomV2View14);
        recyclerView = this.this$0.itemsList;
        textAtomV2View15 = this.this$0.title;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, recyclerView, textAtomV2View15);
        recyclerView2 = this.this$0.itemsList;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, recyclerView2);
        recyclerView3 = this.this$0.itemsList;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, recyclerView3);
    }
}
