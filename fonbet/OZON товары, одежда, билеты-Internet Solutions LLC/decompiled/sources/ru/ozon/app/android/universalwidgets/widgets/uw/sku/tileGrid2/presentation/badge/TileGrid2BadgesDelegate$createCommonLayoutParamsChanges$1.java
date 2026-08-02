package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.badge;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.product.R$id;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/ConstraintLayout$b;", "", "invoke", "(Landroidx/constraintlayout/widget/ConstraintLayout$b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class TileGrid2BadgesDelegate$createCommonLayoutParamsChanges$1 extends AbstractC7737t implements Function1<ConstraintLayout.b, Unit> {
    final /* synthetic */ boolean $badgesInCorner;
    final /* synthetic */ boolean $hasCountButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2BadgesDelegate$createCommonLayoutParamsChanges$1(boolean z11, boolean z12) {
        super(1);
        this.$badgesInCorner = z11;
        this.$hasCountButton = z12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstraintLayout.b bVar) {
        invoke2(bVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstraintLayout.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        bVar.setMarginStart(this.$badgesInCorner ? 0 : TileGrid2BadgesDelegate.horizontalBadgePadding);
        if (this.$hasCountButton) {
            bVar.f41658v = -1;
            bVar.f41657u = R$id.countButton;
        } else {
            bVar.f41657u = -1;
            bVar.f41658v = ru.ozon.app.android.universalwidgets.R$id.itemsRv;
        }
    }
}
