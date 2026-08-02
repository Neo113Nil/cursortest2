package ru.ozon.uni.android.ds.compose.component.input.inputCore;

import B1.m0;
import e1.InterfaceC6250b;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.ds.compose.component.input.DsInputLabelPosition;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class TextFieldMeasurePolicy$measure$1 extends AbstractC7737t implements Function1<m0.a, Unit> {
    final /* synthetic */ int $height;
    final /* synthetic */ int $labelHeight;
    final /* synthetic */ m0 $labelPlaceable;
    final /* synthetic */ int $labelPositionLeftEndPadding;
    final /* synthetic */ m0 $placeholderPlaceable;
    final /* synthetic */ m0 $textFieldPlaceable;
    final /* synthetic */ int $topPadding;
    final /* synthetic */ int $topPaddingValue;
    final /* synthetic */ TextFieldMeasurePolicy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldMeasurePolicy$measure$1(m0 m0Var, TextFieldMeasurePolicy textFieldMeasurePolicy, m0 m0Var2, int i11, m0 m0Var3, int i12, int i13, int i14, int i15) {
        super(1);
        this.$labelPlaceable = m0Var;
        this.this$0 = textFieldMeasurePolicy;
        this.$textFieldPlaceable = m0Var2;
        this.$height = i11;
        this.$placeholderPlaceable = m0Var3;
        this.$labelPositionLeftEndPadding = i12;
        this.$topPaddingValue = i13;
        this.$labelHeight = i14;
        this.$topPadding = i15;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
        invoke2(aVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(m0.a layout) {
        DsInputLabelPosition dsInputLabelPosition;
        DsInputLabelPosition dsInputLabelPosition2;
        float f7;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        if (this.$labelPlaceable != null) {
            dsInputLabelPosition = this.this$0.labelPosition;
            if (dsInputLabelPosition != DsInputLabelPosition.OUTSIDE) {
                dsInputLabelPosition2 = this.this$0.labelPosition;
                if (dsInputLabelPosition2 == DsInputLabelPosition.INSIDE_LEFT) {
                    int a11 = InterfaceC6250b.a.i().a(this.$labelPlaceable.l0(), this.$height);
                    int a12 = InterfaceC6250b.a.i().a(this.$textFieldPlaceable.l0(), this.$height);
                    int u02 = this.$labelPlaceable.u0() + this.$labelPositionLeftEndPadding;
                    layout.h(this.$labelPlaceable, 0, a11, 0.0f);
                    layout.h(this.$textFieldPlaceable, u02, a12, 0.0f);
                    m0 m0Var = this.$placeholderPlaceable;
                    if (m0Var != null) {
                        layout.h(m0Var, u02, InterfaceC6250b.a.i().a(m0Var.l0(), this.$height), 0.0f);
                        return;
                    }
                    return;
                }
                int i11 = this.$topPaddingValue - this.$labelHeight;
                if (i11 < 0) {
                    i11 = 0;
                }
                int a13 = InterfaceC6250b.a.i().a(this.$labelPlaceable.l0(), this.$height);
                f7 = this.this$0.animationProgress;
                layout.h(this.$labelPlaceable, 0, a13 - C6915b.c(f7 * (a13 - i11)), 0.0f);
                layout.h(this.$textFieldPlaceable, 0, this.$labelHeight + this.$topPadding, 0.0f);
                m0 m0Var2 = this.$placeholderPlaceable;
                if (m0Var2 != null) {
                    layout.h(m0Var2, 0, this.$labelHeight + this.$topPadding, 0.0f);
                    return;
                }
                return;
            }
        }
        layout.h(this.$textFieldPlaceable, 0, InterfaceC6250b.a.i().a(this.$textFieldPlaceable.l0(), this.$height), 0.0f);
        m0 m0Var3 = this.$placeholderPlaceable;
        if (m0Var3 != null) {
            layout.h(m0Var3, 0, InterfaceC6250b.a.i().a(m0Var3.l0(), this.$height), 0.0f);
        }
    }
}
