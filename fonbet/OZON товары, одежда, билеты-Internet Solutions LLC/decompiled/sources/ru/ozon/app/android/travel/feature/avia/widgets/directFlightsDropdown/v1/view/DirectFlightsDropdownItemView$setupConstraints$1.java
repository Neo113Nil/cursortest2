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
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class DirectFlightsDropdownItemView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ DirectFlightsDropdownItemView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectFlightsDropdownItemView$setupConstraints$1(DirectFlightsDropdownItemView directFlightsDropdownItemView) {
        super(1);
        this.this$0 = directFlightsDropdownItemView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        Image image;
        TextAtomV2View textAtomV2View;
        Image image2;
        TextAtomV2View textAtomV2View2;
        Image image3;
        TextAtomV2View textAtomV2View3;
        int i11;
        TextAtomV2View textAtomV2View4;
        Image image4;
        int i12;
        TextAtomV2View textAtomV2View5;
        TextAtomV2View textAtomV2View6;
        int i13;
        TextAtomV2View textAtomV2View7;
        TextAtomV2View textAtomV2View8;
        TextAtomV2View textAtomV2View9;
        TextAtomV2View textAtomV2View10;
        TextAtomV2View textAtomV2View11;
        IconView iconView;
        int i14;
        IconView iconView2;
        TextAtomV2View textAtomV2View12;
        IconView iconView3;
        TextAtomV2View textAtomV2View13;
        IconView iconView4;
        RecyclerView recyclerView;
        TextAtomV2View textAtomV2View14;
        int i15;
        RecyclerView recyclerView2;
        TextAtomV2View textAtomV2View15;
        RecyclerView recyclerView3;
        View view;
        RecyclerView recyclerView4;
        View view2;
        RecyclerView recyclerView5;
        View view3;
        RecyclerView recyclerView6;
        View view4;
        View view5;
        View view6;
        View view7;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        image = this.this$0.aviaIcon;
        textAtomV2View = this.this$0.aviaTitle;
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, image, textAtomV2View);
        image2 = this.this$0.aviaIcon;
        textAtomV2View2 = this.this$0.aviaTitle;
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, image2, textAtomV2View2);
        image3 = this.this$0.aviaIcon;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, image3);
        textAtomV2View3 = this.this$0.aviaTitle;
        i11 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, textAtomV2View3, i11);
        textAtomV2View4 = this.this$0.aviaTitle;
        image4 = this.this$0.aviaIcon;
        i12 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, textAtomV2View4, image4, i12);
        textAtomV2View5 = this.this$0.aviaTitle;
        textAtomV2View6 = this.this$0.priceLabel;
        i13 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, textAtomV2View5, textAtomV2View6, i13);
        textAtomV2View7 = this.this$0.priceLabel;
        textAtomV2View8 = this.this$0.aviaTitle;
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, textAtomV2View7, textAtomV2View8);
        textAtomV2View9 = this.this$0.priceLabel;
        textAtomV2View10 = this.this$0.aviaTitle;
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, textAtomV2View9, textAtomV2View10);
        textAtomV2View11 = this.this$0.priceLabel;
        iconView = this.this$0.priceIcon;
        i14 = this.this$0.dp6;
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, textAtomV2View11, iconView, i14);
        iconView2 = this.this$0.priceIcon;
        textAtomV2View12 = this.this$0.priceLabel;
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, iconView2, textAtomV2View12);
        iconView3 = this.this$0.priceIcon;
        textAtomV2View13 = this.this$0.priceLabel;
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, iconView3, textAtomV2View13);
        iconView4 = this.this$0.priceIcon;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, iconView4);
        recyclerView = this.this$0.textsList;
        textAtomV2View14 = this.this$0.aviaTitle;
        i15 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, recyclerView, textAtomV2View14, i15);
        recyclerView2 = this.this$0.textsList;
        textAtomV2View15 = this.this$0.aviaTitle;
        ConstraintLayoutExtensionsKt.startToStart(updateConstraints, recyclerView2, textAtomV2View15);
        recyclerView3 = this.this$0.textsList;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, recyclerView3);
        view = this.this$0.gradientView;
        recyclerView4 = this.this$0.textsList;
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, view, recyclerView4);
        view2 = this.this$0.gradientView;
        recyclerView5 = this.this$0.textsList;
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, view2, recyclerView5);
        view3 = this.this$0.gradientView;
        recyclerView6 = this.this$0.textsList;
        ConstraintLayoutExtensionsKt.endToEnd(updateConstraints, view3, recyclerView6);
        view4 = this.this$0.clickOverlay;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, view4);
        view5 = this.this$0.clickOverlay;
        ConstraintLayoutExtensionsKt.bottomToParent(updateConstraints, view5);
        view6 = this.this$0.clickOverlay;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, view6);
        view7 = this.this$0.clickOverlay;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, view7);
    }
}
