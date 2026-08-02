package ru.ozon.uni.android.controls.buttonV3;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.controls.common.ButtonImageView;
import ru.ozon.uni.android.controls.common.ButtonTextView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class ButtonV3View$layoutSubtitle$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ int $subtitleViewId;
    final /* synthetic */ ButtonV3View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonV3View$layoutSubtitle$1(ButtonV3View buttonV3View, int i11) {
        super(1);
        this.this$0 = buttonV3View;
        this.$subtitleViewId = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        r4 = r5.this$0.iconView;
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2(d updateConstraints) {
        ButtonImageView buttonImageView;
        ButtonTextView buttonTextView;
        ButtonImageView buttonImageView2;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        int px = UiExtKt.toPx(this.this$0.getSize().getHorizontalMargin());
        buttonImageView = this.this$0.iconView;
        Integer valueOf = buttonImageView != null ? Integer.valueOf(buttonImageView.getId()) : null;
        if (valueOf == null || buttonImageView2 == null || buttonImageView2.getVisibility() != 0) {
            updateConstraints.e0(this.$subtitleViewId, 6, px);
            updateConstraints.l(this.$subtitleViewId);
        } else {
            updateConstraints.E(new int[]{valueOf.intValue(), this.$subtitleViewId}, null, 2);
            updateConstraints.e0(this.$subtitleViewId, 6, UiExtKt.toPx(8));
        }
        updateConstraints.e0(this.$subtitleViewId, 7, px);
        updateConstraints.C(this.$subtitleViewId, true);
        buttonTextView = this.this$0.titleView;
        updateConstraints.F(0, 0, new int[]{buttonTextView.getId(), this.$subtitleViewId}, null);
        updateConstraints.e0(this.$subtitleViewId, 4, UiExtKt.toPx(4));
    }
}
