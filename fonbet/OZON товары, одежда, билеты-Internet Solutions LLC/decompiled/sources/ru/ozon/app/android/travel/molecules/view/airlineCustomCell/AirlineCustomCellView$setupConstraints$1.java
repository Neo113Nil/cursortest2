package ru.ozon.app.android.travel.molecules.view.airlineCustomCell;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class AirlineCustomCellView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ AirlineCustomCellView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AirlineCustomCellView$setupConstraints$1(AirlineCustomCellView airlineCustomCellView) {
        super(1);
        this.this$0 = airlineCustomCellView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        Image mainCarrier;
        Image mainCarrier2;
        Image mainCarrier3;
        Image operatingCarrier;
        Image mainCarrier4;
        Image operatingCarrier2;
        Image mainCarrier5;
        BadgeView badge;
        BadgeView badge2;
        BadgeView badge3;
        TextAtomV2View title;
        TextAtomV2View title2;
        Image mainCarrier6;
        TextAtomV2View title3;
        BadgeView badge4;
        TextAtomV2View title4;
        TextAtomV2View subtitle;
        TextAtomV2View subtitle2;
        TextAtomV2View title5;
        TextAtomV2View subtitle3;
        TextAtomV2View title6;
        TextAtomV2View subtitle4;
        TextAtomV2View title7;
        TextAtomV2View subtitle5;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        mainCarrier = this.this$0.getMainCarrier();
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, mainCarrier);
        mainCarrier2 = this.this$0.getMainCarrier();
        ConstraintLayoutExtensionsKt.bottomToParent(updateConstraints, mainCarrier2);
        mainCarrier3 = this.this$0.getMainCarrier();
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, mainCarrier3);
        operatingCarrier = this.this$0.getOperatingCarrier();
        mainCarrier4 = this.this$0.getMainCarrier();
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, operatingCarrier, mainCarrier4);
        operatingCarrier2 = this.this$0.getOperatingCarrier();
        mainCarrier5 = this.this$0.getMainCarrier();
        ConstraintLayoutExtensionsKt.endToEnd(updateConstraints, operatingCarrier2, mainCarrier5);
        badge = this.this$0.getBadge();
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, badge);
        badge2 = this.this$0.getBadge();
        ConstraintLayoutExtensionsKt.bottomToParent(updateConstraints, badge2);
        badge3 = this.this$0.getBadge();
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, badge3);
        title = this.this$0.getTitle();
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, title);
        title2 = this.this$0.getTitle();
        mainCarrier6 = this.this$0.getMainCarrier();
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, title2, mainCarrier6);
        title3 = this.this$0.getTitle();
        badge4 = this.this$0.getBadge();
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, title3, badge4);
        title4 = this.this$0.getTitle();
        subtitle = this.this$0.getSubtitle();
        ConstraintLayoutExtensionsKt.bottomToTop(updateConstraints, title4, subtitle);
        subtitle2 = this.this$0.getSubtitle();
        title5 = this.this$0.getTitle();
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, subtitle2, title5);
        subtitle3 = this.this$0.getSubtitle();
        title6 = this.this$0.getTitle();
        ConstraintLayoutExtensionsKt.startToStart(updateConstraints, subtitle3, title6);
        subtitle4 = this.this$0.getSubtitle();
        title7 = this.this$0.getTitle();
        ConstraintLayoutExtensionsKt.endToEnd(updateConstraints, subtitle4, title7);
        subtitle5 = this.this$0.getSubtitle();
        ConstraintLayoutExtensionsKt.bottomToParent(updateConstraints, subtitle5);
    }
}
