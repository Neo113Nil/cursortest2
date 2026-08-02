package ru.ozon.app.android.pdp.widgets.selectSeller.presentation;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class SelectSellerBaseView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ SelectSellerBaseView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectSellerBaseView$setupConstraints$1(SelectSellerBaseView selectSellerBaseView) {
        super(1);
        this.this$0 = selectSellerBaseView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        IconView iconView;
        IconView iconView2;
        IconView iconView3;
        TextAtomV2View textAtomV2View;
        TextAtomV2View textAtomV2View2;
        TextAtomV2View textAtomV2View3;
        IconView iconView4;
        TextAtomV2View textAtomV2View4;
        TextAtomV2View textAtomV2View5;
        TextAtomV2View textAtomV2View6;
        TextAtomV2View textAtomV2View7;
        TextAtomV2View textAtomV2View8;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        iconView = this.this$0.iconView;
        ConstraintSetExtKt.startToStart$default(updateConstraints, iconView.getId(), 0, 0, 4, null);
        iconView2 = this.this$0.iconView;
        ConstraintSetExtKt.topToTop$default(updateConstraints, iconView2.getId(), 0, 0, 4, null);
        iconView3 = this.this$0.iconView;
        ConstraintSetExtKt.bottomToBottom$default(updateConstraints, iconView3.getId(), 0, 0, 4, null);
        textAtomV2View = this.this$0.titleTAV;
        ConstraintSetExtKt.topToTop$default(updateConstraints, textAtomV2View.getId(), 0, 0, 4, null);
        textAtomV2View2 = this.this$0.titleTAV;
        ConstraintSetExtKt.bottomToTop$default(updateConstraints, textAtomV2View2.getId(), this.this$0.getSubtitleContainer().getId(), 0, 4, null);
        textAtomV2View3 = this.this$0.titleTAV;
        int id2 = textAtomV2View3.getId();
        iconView4 = this.this$0.iconView;
        int id3 = iconView4.getId();
        Dimens dimens = Dimens.INSTANCE;
        ConstraintSetExtKt.startToEnd(updateConstraints, id2, id3, dimens.getDP_12());
        textAtomV2View4 = this.this$0.titleTAV;
        ConstraintSetExtKt.endToStart(updateConstraints, textAtomV2View4.getId(), this.this$0.getFavoriteBtn().getId(), dimens.getDP_6());
        textAtomV2View5 = this.this$0.titleTAV;
        updateConstraints.g0(textAtomV2View5.getId(), 2);
        int id4 = this.this$0.getSubtitleContainer().getId();
        textAtomV2View6 = this.this$0.titleTAV;
        ConstraintSetExtKt.startToStart$default(updateConstraints, id4, textAtomV2View6.getId(), 0, 4, null);
        int id5 = this.this$0.getSubtitleContainer().getId();
        textAtomV2View7 = this.this$0.titleTAV;
        ConstraintSetExtKt.endToEnd$default(updateConstraints, id5, textAtomV2View7.getId(), 0, 4, null);
        int id6 = this.this$0.getSubtitleContainer().getId();
        textAtomV2View8 = this.this$0.titleTAV;
        ConstraintSetExtKt.topToBottom(updateConstraints, id6, textAtomV2View8.getId(), dimens.getDP_2());
        ConstraintSetExtKt.bottomToBottom$default(updateConstraints, this.this$0.getSubtitleContainer().getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(updateConstraints, this.this$0.getFavoriteBtn().getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToTop$default(updateConstraints, this.this$0.getFavoriteBtn().getId(), 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(updateConstraints, this.this$0.getFavoriteBtn().getId(), 0, 0, 4, null);
        this.this$0.additionalConstraints(updateConstraints);
    }
}
