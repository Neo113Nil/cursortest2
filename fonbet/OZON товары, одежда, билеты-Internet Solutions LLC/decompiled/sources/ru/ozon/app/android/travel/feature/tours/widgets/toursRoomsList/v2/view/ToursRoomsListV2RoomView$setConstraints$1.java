package ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.view;

import android.view.View;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.platform.rv.looped.LoopedRecyclerView;
import ru.ozon.app.android.travel.molecules.view.indicator.DottedIndicatorView;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ToursRoomsListV2RoomView$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ ToursRoomsListV2RoomView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursRoomsListV2RoomView$setConstraints$1(ToursRoomsListV2RoomView toursRoomsListV2RoomView) {
        super(1);
        this.this$0 = toursRoomsListV2RoomView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        LoopedRecyclerView loopedRecyclerView;
        LoopedRecyclerView loopedRecyclerView2;
        LoopedRecyclerView loopedRecyclerView3;
        DottedIndicatorView dottedIndicatorView;
        LoopedRecyclerView loopedRecyclerView4;
        int i11;
        DottedIndicatorView dottedIndicatorView2;
        DottedIndicatorView dottedIndicatorView3;
        TextAtomV2View textAtomV2View;
        LoopedRecyclerView loopedRecyclerView5;
        int i12;
        TextAtomV2View textAtomV2View2;
        int i13;
        TextAtomV2View textAtomV2View3;
        BadgeView badgeView;
        BadgeView badgeView2;
        int i14;
        BadgeView badgeView3;
        LoopedRecyclerView loopedRecyclerView6;
        int i15;
        VerticalAtomsLayout verticalAtomsLayout;
        TextAtomV2View textAtomV2View4;
        int i16;
        VerticalAtomsLayout verticalAtomsLayout2;
        int i17;
        VerticalAtomsLayout verticalAtomsLayout3;
        int i18;
        View view;
        VerticalAtomsLayout verticalAtomsLayout4;
        View view2;
        VerticalAtomsLayout verticalAtomsLayout5;
        View view3;
        VerticalAtomsLayout verticalAtomsLayout6;
        View view4;
        VerticalAtomsLayout verticalAtomsLayout7;
        PriceAtomView priceAtomView;
        VerticalAtomsLayout verticalAtomsLayout8;
        int i19;
        PriceAtomView priceAtomView2;
        int i21;
        PriceAtomView priceAtomView3;
        ButtonV3View buttonV3View;
        int i22;
        PriceAtomView priceAtomView4;
        PriceAtomView priceAtomView5;
        TextAtomV2View textAtomV2View5;
        int i23;
        TextAtomV2View textAtomV2View6;
        PriceAtomView priceAtomView6;
        TextAtomV2View textAtomV2View7;
        ButtonV3View buttonV3View2;
        int i24;
        TextAtomV2View textAtomV2View8;
        TextAtomV2View textAtomV2View9;
        ButtonV3View buttonV3View3;
        int i25;
        ButtonV3View buttonV3View4;
        VerticalAtomsLayout verticalAtomsLayout9;
        int i26;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        loopedRecyclerView = this.this$0.imagesRV;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, loopedRecyclerView);
        loopedRecyclerView2 = this.this$0.imagesRV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, loopedRecyclerView2);
        loopedRecyclerView3 = this.this$0.imagesRV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, loopedRecyclerView3);
        dottedIndicatorView = this.this$0.indicatorDIV;
        loopedRecyclerView4 = this.this$0.imagesRV;
        i11 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, dottedIndicatorView, loopedRecyclerView4, i11);
        dottedIndicatorView2 = this.this$0.indicatorDIV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, dottedIndicatorView2);
        dottedIndicatorView3 = this.this$0.indicatorDIV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, dottedIndicatorView3);
        textAtomV2View = this.this$0.titleTAV;
        loopedRecyclerView5 = this.this$0.imagesRV;
        i12 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, textAtomV2View, loopedRecyclerView5, i12);
        textAtomV2View2 = this.this$0.titleTAV;
        i13 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomV2View2, i13);
        textAtomV2View3 = this.this$0.titleTAV;
        badgeView = this.this$0.detailBadgeBV;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, textAtomV2View3, badgeView);
        badgeView2 = this.this$0.detailBadgeBV;
        i14 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, badgeView2, i14);
        badgeView3 = this.this$0.detailBadgeBV;
        loopedRecyclerView6 = this.this$0.imagesRV;
        i15 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, badgeView3, loopedRecyclerView6, i15);
        verticalAtomsLayout = this.this$0.detailsVAL;
        textAtomV2View4 = this.this$0.titleTAV;
        i16 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, verticalAtomsLayout, textAtomV2View4, i16);
        verticalAtomsLayout2 = this.this$0.detailsVAL;
        i17 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, verticalAtomsLayout2, i17);
        verticalAtomsLayout3 = this.this$0.detailsVAL;
        i18 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, verticalAtomsLayout3, i18);
        view = this.this$0.detailsClickV;
        verticalAtomsLayout4 = this.this$0.detailsVAL;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, view, verticalAtomsLayout4);
        view2 = this.this$0.detailsClickV;
        verticalAtomsLayout5 = this.this$0.detailsVAL;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, view2, verticalAtomsLayout5);
        view3 = this.this$0.detailsClickV;
        verticalAtomsLayout6 = this.this$0.detailsVAL;
        ConstraintLayoutExtensionsKt.endToEnd(applyConstraint, view3, verticalAtomsLayout6);
        view4 = this.this$0.detailsClickV;
        verticalAtomsLayout7 = this.this$0.detailsVAL;
        ConstraintLayoutExtensionsKt.startToStart(applyConstraint, view4, verticalAtomsLayout7);
        priceAtomView = this.this$0.pricePV;
        verticalAtomsLayout8 = this.this$0.detailsVAL;
        i19 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, priceAtomView, verticalAtomsLayout8, i19);
        priceAtomView2 = this.this$0.pricePV;
        i21 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, priceAtomView2, i21);
        priceAtomView3 = this.this$0.pricePV;
        buttonV3View = this.this$0.selectButtonBV;
        i22 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, priceAtomView3, buttonV3View, i22);
        priceAtomView4 = this.this$0.pricePV;
        applyConstraint.c0(0.0f, priceAtomView4.getId());
        priceAtomView5 = this.this$0.pricePV;
        applyConstraint.C(priceAtomView5.getId(), true);
        textAtomV2View5 = this.this$0.priceDescriptionTAV;
        i23 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomV2View5, i23);
        textAtomV2View6 = this.this$0.priceDescriptionTAV;
        priceAtomView6 = this.this$0.pricePV;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, textAtomV2View6, priceAtomView6);
        textAtomV2View7 = this.this$0.priceDescriptionTAV;
        buttonV3View2 = this.this$0.selectButtonBV;
        i24 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, textAtomV2View7, buttonV3View2, i24);
        textAtomV2View8 = this.this$0.priceDescriptionTAV;
        applyConstraint.c0(0.0f, textAtomV2View8.getId());
        textAtomV2View9 = this.this$0.priceDescriptionTAV;
        applyConstraint.C(textAtomV2View9.getId(), true);
        buttonV3View3 = this.this$0.selectButtonBV;
        i25 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, buttonV3View3, i25);
        buttonV3View4 = this.this$0.selectButtonBV;
        verticalAtomsLayout9 = this.this$0.detailsVAL;
        i26 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, buttonV3View4, verticalAtomsLayout9, i26);
    }
}
