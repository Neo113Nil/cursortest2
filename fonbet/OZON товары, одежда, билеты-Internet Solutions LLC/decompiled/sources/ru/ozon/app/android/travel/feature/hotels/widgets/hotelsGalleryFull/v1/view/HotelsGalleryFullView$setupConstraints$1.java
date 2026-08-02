package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.view;

import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class HotelsGalleryFullView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ HotelsGalleryFullView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryFullView$setupConstraints$1(HotelsGalleryFullView hotelsGalleryFullView) {
        super(1);
        this.this$0 = hotelsGalleryFullView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        ViewPager2 viewPager2;
        IconButtonV3View navButton;
        ViewPager2 viewPager22;
        ViewPager2 viewPager23;
        ViewPager2 viewPager24;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        TextAtomV2View pageCounterTav;
        TextAtomV2View pageCounterTav2;
        Guideline guideline;
        TextAtomV2View pageCounterTav3;
        TextAtomV2View pageCounterTav4;
        IconButtonV3View navButton2;
        IconButtonV3View navButton3;
        Guideline guideline2;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        viewPager2 = this.this$0.fullViewVp;
        navButton = this.this$0.getNavButton();
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, viewPager2, navButton);
        viewPager22 = this.this$0.fullViewVp;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, viewPager22);
        viewPager23 = this.this$0.fullViewVp;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, viewPager23);
        viewPager24 = this.this$0.fullViewVp;
        recyclerView = this.this$0.previewRv;
        ConstraintLayoutExtensionsKt.bottomToTop(updateConstraints, viewPager24, recyclerView);
        recyclerView2 = this.this$0.previewRv;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, recyclerView2);
        recyclerView3 = this.this$0.previewRv;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, recyclerView3);
        recyclerView4 = this.this$0.previewRv;
        ConstraintLayoutExtensionsKt.bottomToParent(updateConstraints, recyclerView4);
        pageCounterTav = this.this$0.getPageCounterTav();
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, pageCounterTav);
        pageCounterTav2 = this.this$0.getPageCounterTav();
        guideline = this.this$0.guideline;
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, pageCounterTav2, guideline);
        pageCounterTav3 = this.this$0.getPageCounterTav();
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, pageCounterTav3);
        pageCounterTav4 = this.this$0.getPageCounterTav();
        navButton2 = this.this$0.getNavButton();
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, pageCounterTav4, navButton2);
        navButton3 = this.this$0.getNavButton();
        guideline2 = this.this$0.guideline;
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, navButton3, guideline2);
    }
}
