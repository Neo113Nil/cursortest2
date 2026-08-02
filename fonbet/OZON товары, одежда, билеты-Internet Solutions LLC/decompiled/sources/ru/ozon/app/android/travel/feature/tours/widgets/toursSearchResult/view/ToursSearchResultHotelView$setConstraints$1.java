package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.view;

import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ToursSearchResultHotelView$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ ToursSearchResultHotelView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursSearchResultHotelView$setConstraints$1(ToursSearchResultHotelView toursSearchResultHotelView) {
        super(1);
        this.this$0 = toursSearchResultHotelView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        ScrollingPagerIndicator scrollingPagerIndicator;
        RecyclerView recyclerView4;
        int i11;
        ScrollingPagerIndicator scrollingPagerIndicator2;
        int i12;
        ScrollingPagerIndicator scrollingPagerIndicator3;
        int i13;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout;
        ScrollingPagerIndicator scrollingPagerIndicator4;
        int i14;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout2;
        int i15;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout3;
        int i16;
        TextAtomView textAtomView;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout4;
        int i17;
        TextAtomView textAtomView2;
        int i18;
        TextAtomView textAtomView3;
        int i19;
        TextAtomView textAtomView4;
        TextAtomView textAtomView5;
        int i21;
        TextAtomView textAtomView6;
        int i22;
        TextAtomView textAtomView7;
        int i23;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout5;
        TextAtomView textAtomView8;
        int i24;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout6;
        int i25;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout7;
        int i26;
        ToursSearchResultOptionsListView toursSearchResultOptionsListView;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout8;
        int i27;
        ToursSearchResultOptionsListView toursSearchResultOptionsListView2;
        int i28;
        ToursSearchResultOptionsListView toursSearchResultOptionsListView3;
        int i29;
        TextAtomView textAtomView9;
        ToursSearchResultOptionsListView toursSearchResultOptionsListView4;
        int i31;
        TextAtomView textAtomView10;
        int i32;
        TextAtomView textAtomView11;
        TextAtomView textAtomView12;
        TextAtomView textAtomView13;
        TextAtomView textAtomView14;
        TextAtomView textAtomView15;
        TextAtomView textAtomView16;
        int i33;
        TextAtomView textAtomView17;
        int i34;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        recyclerView = this.this$0.galleryRV;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, recyclerView);
        recyclerView2 = this.this$0.galleryRV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, recyclerView2);
        recyclerView3 = this.this$0.galleryRV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, recyclerView3);
        scrollingPagerIndicator = this.this$0.dotsSPI;
        recyclerView4 = this.this$0.galleryRV;
        i11 = this.this$0.dp6;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, scrollingPagerIndicator, recyclerView4, i11);
        scrollingPagerIndicator2 = this.this$0.dotsSPI;
        i12 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, scrollingPagerIndicator2, i12);
        scrollingPagerIndicator3 = this.this$0.dotsSPI;
        i13 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, scrollingPagerIndicator3, i13);
        horizontalFlexAtomsLayout = this.this$0.badgesHFAL;
        scrollingPagerIndicator4 = this.this$0.dotsSPI;
        i14 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, horizontalFlexAtomsLayout, scrollingPagerIndicator4, i14);
        horizontalFlexAtomsLayout2 = this.this$0.badgesHFAL;
        i15 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, horizontalFlexAtomsLayout2, i15);
        horizontalFlexAtomsLayout3 = this.this$0.badgesHFAL;
        i16 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, horizontalFlexAtomsLayout3, i16);
        textAtomView = this.this$0.titleTAV;
        horizontalFlexAtomsLayout4 = this.this$0.badgesHFAL;
        i17 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, textAtomView, horizontalFlexAtomsLayout4, i17);
        textAtomView2 = this.this$0.titleTAV;
        i18 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomView2, i18);
        textAtomView3 = this.this$0.titleTAV;
        i19 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, textAtomView3, i19);
        textAtomView4 = this.this$0.descriptionTAV;
        textAtomView5 = this.this$0.titleTAV;
        i21 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, textAtomView4, textAtomView5, i21);
        textAtomView6 = this.this$0.descriptionTAV;
        i22 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomView6, i22);
        textAtomView7 = this.this$0.descriptionTAV;
        i23 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, textAtomView7, i23);
        horizontalFlexAtomsLayout5 = this.this$0.hotelFeaturesHFAL;
        textAtomView8 = this.this$0.descriptionTAV;
        i24 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, horizontalFlexAtomsLayout5, textAtomView8, i24);
        horizontalFlexAtomsLayout6 = this.this$0.hotelFeaturesHFAL;
        i25 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, horizontalFlexAtomsLayout6, i25);
        horizontalFlexAtomsLayout7 = this.this$0.hotelFeaturesHFAL;
        i26 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, horizontalFlexAtomsLayout7, i26);
        toursSearchResultOptionsListView = this.this$0.variantsLV;
        horizontalFlexAtomsLayout8 = this.this$0.hotelFeaturesHFAL;
        i27 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, toursSearchResultOptionsListView, horizontalFlexAtomsLayout8, i27);
        toursSearchResultOptionsListView2 = this.this$0.variantsLV;
        i28 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, toursSearchResultOptionsListView2, i28);
        toursSearchResultOptionsListView3 = this.this$0.variantsLV;
        i29 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, toursSearchResultOptionsListView3, i29);
        textAtomView9 = this.this$0.priceTAV;
        toursSearchResultOptionsListView4 = this.this$0.variantsLV;
        i31 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, textAtomView9, toursSearchResultOptionsListView4, i31);
        textAtomView10 = this.this$0.priceTAV;
        i32 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomView10, i32);
        textAtomView11 = this.this$0.datesTAV;
        textAtomView12 = this.this$0.priceTAV;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, textAtomView11, textAtomView12);
        textAtomView13 = this.this$0.datesTAV;
        textAtomView14 = this.this$0.priceTAV;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, textAtomView13, textAtomView14);
        textAtomView15 = this.this$0.datesTAV;
        textAtomView16 = this.this$0.priceTAV;
        i33 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, textAtomView15, textAtomView16, i33);
        textAtomView17 = this.this$0.datesTAV;
        i34 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, textAtomView17, i34);
    }
}
