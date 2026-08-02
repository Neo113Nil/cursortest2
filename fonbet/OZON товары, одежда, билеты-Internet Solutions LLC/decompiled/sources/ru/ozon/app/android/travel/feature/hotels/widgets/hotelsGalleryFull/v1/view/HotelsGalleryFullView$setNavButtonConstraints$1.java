package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.view;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.HotelsGalleryFullVI;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class HotelsGalleryFullView$setNavButtonConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ HotelsGalleryFullVI.ButtonPosition $position;
    final /* synthetic */ HotelsGalleryFullView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryFullView$setNavButtonConstraints$1(HotelsGalleryFullView hotelsGalleryFullView, HotelsGalleryFullVI.ButtonPosition buttonPosition) {
        super(1);
        this.this$0 = hotelsGalleryFullView;
        this.$position = buttonPosition;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        IconButtonV3View navButton;
        IconButtonV3View navButton2;
        int i11;
        IconButtonV3View navButton3;
        int i12;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        navButton = this.this$0.getNavButton();
        ConstraintSetExtKt.clearHorizontals(updateConstraints, navButton.getId());
        if (this.$position == HotelsGalleryFullVI.ButtonPosition.LEFT) {
            navButton3 = this.this$0.getNavButton();
            i12 = this.this$0.dp4;
            ConstraintLayoutExtensionsKt.startToParent(updateConstraints, navButton3, i12);
        } else {
            navButton2 = this.this$0.getNavButton();
            i11 = this.this$0.dp6;
            ConstraintLayoutExtensionsKt.endToParent(updateConstraints, navButton2, i11);
        }
    }
}
