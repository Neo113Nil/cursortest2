package ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.presentation;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class TopTravelModalView$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ TopTravelModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TopTravelModalView$setConstraints$1(TopTravelModalView topTravelModalView) {
        super(1);
        this.this$0 = topTravelModalView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        AppCompatImageView appCompatImageView4;
        Image image;
        int i11;
        Image image2;
        int i12;
        IconButtonV3View iconButtonV3View;
        int i13;
        IconButtonV3View iconButtonV3View2;
        int i14;
        RecyclerView recyclerView;
        int i15;
        RecyclerView recyclerView2;
        int i16;
        RecyclerView recyclerView3;
        int i17;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        appCompatImageView = this.this$0.backgroundImageIV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, appCompatImageView);
        appCompatImageView2 = this.this$0.backgroundImageIV;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, appCompatImageView2);
        appCompatImageView3 = this.this$0.backgroundImageIV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, appCompatImageView3);
        appCompatImageView4 = this.this$0.backgroundImageIV;
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, appCompatImageView4);
        image = this.this$0.topImageIV;
        i11 = this.this$0.dp52;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, image, i11);
        image2 = this.this$0.topImageIV;
        i12 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, image2, i12);
        iconButtonV3View = this.this$0.closeButtonIB;
        i13 = this.this$0.dp68;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, iconButtonV3View, i13);
        iconButtonV3View2 = this.this$0.closeButtonIB;
        i14 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, iconButtonV3View2, i14);
        recyclerView = this.this$0.itemsRV;
        i15 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, recyclerView, i15);
        recyclerView2 = this.this$0.itemsRV;
        i16 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, recyclerView2, i16);
        recyclerView3 = this.this$0.itemsRV;
        i17 = this.this$0.dp36;
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, recyclerView3, i17);
    }
}
