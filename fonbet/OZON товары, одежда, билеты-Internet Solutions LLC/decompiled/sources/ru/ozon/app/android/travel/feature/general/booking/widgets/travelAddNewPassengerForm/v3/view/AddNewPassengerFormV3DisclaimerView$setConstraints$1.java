package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.view;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class AddNewPassengerFormV3DisclaimerView$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ AddNewPassengerFormV3DisclaimerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddNewPassengerFormV3DisclaimerView$setConstraints$1(AddNewPassengerFormV3DisclaimerView addNewPassengerFormV3DisclaimerView) {
        super(1);
        this.this$0 = addNewPassengerFormV3DisclaimerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        AppCompatImageView appCompatImageView;
        int i11;
        AppCompatImageView appCompatImageView2;
        int i12;
        TextAtomV2View titleTAV;
        AppCompatImageView appCompatImageView3;
        int i13;
        TextAtomV2View titleTAV2;
        IconButtonV3View iconButtonIBV;
        int i14;
        TextAtomV2View titleTAV3;
        int i15;
        TextAtomV2View subtitleTAV;
        TextAtomV2View titleTAV4;
        int i16;
        TextAtomV2View subtitleTAV2;
        TextAtomV2View titleTAV5;
        TextAtomV2View subtitleTAV3;
        IconButtonV3View iconButtonIBV2;
        int i17;
        IconButtonV3View iconButtonIBV3;
        int i18;
        IconButtonV3View iconButtonIBV4;
        int i19;
        ButtonV3View yesButtonButtonBV;
        TextAtomV2View subtitleTAV4;
        int i21;
        ButtonV3View yesButtonButtonBV2;
        TextAtomV2View titleTAV6;
        ButtonV3View yesButtonButtonBV3;
        ButtonV3View noButtonButtonBV;
        ButtonV3View yesButtonButtonBV4;
        int i22;
        ButtonV3View noButtonButtonBV2;
        TextAtomV2View subtitleTAV5;
        int i23;
        ButtonV3View yesButtonButtonBV5;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        appCompatImageView = this.this$0.iconV;
        i11 = this.this$0.dp10;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, appCompatImageView, i11);
        appCompatImageView2 = this.this$0.iconV;
        i12 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, appCompatImageView2, i12);
        titleTAV = this.this$0.getTitleTAV();
        appCompatImageView3 = this.this$0.iconV;
        i13 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, titleTAV, appCompatImageView3, i13);
        titleTAV2 = this.this$0.getTitleTAV();
        iconButtonIBV = this.this$0.getIconButtonIBV();
        i14 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, titleTAV2, iconButtonIBV, i14);
        titleTAV3 = this.this$0.getTitleTAV();
        i15 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, titleTAV3, i15);
        subtitleTAV = this.this$0.getSubtitleTAV();
        titleTAV4 = this.this$0.getTitleTAV();
        i16 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, subtitleTAV, titleTAV4, i16);
        subtitleTAV2 = this.this$0.getSubtitleTAV();
        titleTAV5 = this.this$0.getTitleTAV();
        ConstraintLayoutExtensionsKt.startToStart(applyConstraint, subtitleTAV2, titleTAV5);
        subtitleTAV3 = this.this$0.getSubtitleTAV();
        iconButtonIBV2 = this.this$0.getIconButtonIBV();
        i17 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, subtitleTAV3, iconButtonIBV2, i17);
        iconButtonIBV3 = this.this$0.getIconButtonIBV();
        i18 = this.this$0.dp6;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, iconButtonIBV3, i18);
        iconButtonIBV4 = this.this$0.getIconButtonIBV();
        i19 = this.this$0.dp6;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, iconButtonIBV4, i19);
        yesButtonButtonBV = this.this$0.getYesButtonButtonBV();
        subtitleTAV4 = this.this$0.getSubtitleTAV();
        i21 = this.this$0.dp6;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, yesButtonButtonBV, subtitleTAV4, i21);
        yesButtonButtonBV2 = this.this$0.getYesButtonButtonBV();
        titleTAV6 = this.this$0.getTitleTAV();
        ConstraintLayoutExtensionsKt.startToStart(applyConstraint, yesButtonButtonBV2, titleTAV6);
        yesButtonButtonBV3 = this.this$0.getYesButtonButtonBV();
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, yesButtonButtonBV3);
        noButtonButtonBV = this.this$0.getNoButtonButtonBV();
        yesButtonButtonBV4 = this.this$0.getYesButtonButtonBV();
        i22 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, noButtonButtonBV, yesButtonButtonBV4, i22);
        noButtonButtonBV2 = this.this$0.getNoButtonButtonBV();
        subtitleTAV5 = this.this$0.getSubtitleTAV();
        i23 = this.this$0.dp6;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, noButtonButtonBV2, subtitleTAV5, i23);
        yesButtonButtonBV5 = this.this$0.getYesButtonButtonBV();
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, yesButtonButtonBV5);
    }
}
