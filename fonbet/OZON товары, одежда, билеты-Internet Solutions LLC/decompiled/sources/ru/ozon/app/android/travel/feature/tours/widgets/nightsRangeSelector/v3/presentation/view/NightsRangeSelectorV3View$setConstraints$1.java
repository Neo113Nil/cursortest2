package ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.presentation.view;

import android.view.View;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.tag.TagButtonView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class NightsRangeSelectorV3View$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ NightsRangeSelectorV3View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NightsRangeSelectorV3View$setConstraints$1(NightsRangeSelectorV3View nightsRangeSelectorV3View) {
        super(1);
        this.this$0 = nightsRangeSelectorV3View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        TextAtomV2View text;
        TextAtomV2View text2;
        TextAtomV2View text3;
        TagButtonView tagButton;
        int i11;
        TextAtomV2View text4;
        TextAtomV2View subtitle;
        TextAtomV2View text5;
        int i12;
        TextAtomV2View subtitle2;
        TextAtomV2View subtitle3;
        TagButtonView tagButton2;
        TextAtomV2View text6;
        TagButtonView tagButton3;
        TagButtonView tagButton4;
        TextAtomV2View text7;
        View sliderWithLabels;
        TextAtomV2View subtitle4;
        int i13;
        View sliderWithLabels2;
        View sliderWithLabels3;
        ButtonV3View applyButton;
        View sliderWithLabels4;
        int i14;
        ButtonV3View applyButton2;
        ButtonV3View applyButton3;
        ButtonV3View applyButton4;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        text = this.this$0.getText();
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, text);
        text2 = this.this$0.getText();
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, text2);
        text3 = this.this$0.getText();
        tagButton = this.this$0.getTagButton();
        i11 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, text3, tagButton, i11);
        text4 = this.this$0.getText();
        updateConstraints.c0(0.0f, text4.getId());
        subtitle = this.this$0.getSubtitle();
        text5 = this.this$0.getText();
        i12 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, subtitle, text5, i12);
        subtitle2 = this.this$0.getSubtitle();
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, subtitle2);
        subtitle3 = this.this$0.getSubtitle();
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, subtitle3);
        tagButton2 = this.this$0.getTagButton();
        text6 = this.this$0.getText();
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, tagButton2, text6);
        tagButton3 = this.this$0.getTagButton();
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, tagButton3);
        tagButton4 = this.this$0.getTagButton();
        text7 = this.this$0.getText();
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, tagButton4, text7);
        sliderWithLabels = this.this$0.getSliderWithLabels();
        subtitle4 = this.this$0.getSubtitle();
        i13 = this.this$0.dp20;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, sliderWithLabels, subtitle4, i13);
        sliderWithLabels2 = this.this$0.getSliderWithLabels();
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, sliderWithLabels2);
        sliderWithLabels3 = this.this$0.getSliderWithLabels();
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, sliderWithLabels3);
        applyButton = this.this$0.getApplyButton();
        sliderWithLabels4 = this.this$0.getSliderWithLabels();
        i14 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, applyButton, sliderWithLabels4, i14);
        applyButton2 = this.this$0.getApplyButton();
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, applyButton2);
        applyButton3 = this.this$0.getApplyButton();
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, applyButton3);
        applyButton4 = this.this$0.getApplyButton();
        ConstraintLayoutExtensionsKt.bottomToParent(updateConstraints, applyButton4);
    }
}
