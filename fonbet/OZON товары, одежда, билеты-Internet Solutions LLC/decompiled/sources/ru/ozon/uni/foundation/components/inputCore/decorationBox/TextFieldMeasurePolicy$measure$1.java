package ru.ozon.uni.foundation.components.inputCore.decorationBox;

import B1.Y;
import B1.m0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes8.dex */
final class TextFieldMeasurePolicy$measure$1 extends AbstractC7737t implements Function1<m0.a, Unit> {
    final /* synthetic */ int $height;
    final /* synthetic */ int $labelHeight;
    final /* synthetic */ m0 $labelPlaceable;
    final /* synthetic */ m0 $placeholderPlaceable;
    final /* synthetic */ m0 $textFieldPlaceable;
    final /* synthetic */ Y $this_measure;
    final /* synthetic */ int $topPadding;
    final /* synthetic */ int $topPaddingValue;
    final /* synthetic */ TextFieldMeasurePolicy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldMeasurePolicy$measure$1(m0 m0Var, int i11, int i12, m0 m0Var2, m0 m0Var3, TextFieldMeasurePolicy textFieldMeasurePolicy, int i13, Y y11, int i14) {
        super(1);
        this.$labelPlaceable = m0Var;
        this.$topPaddingValue = i11;
        this.$labelHeight = i12;
        this.$textFieldPlaceable = m0Var2;
        this.$placeholderPlaceable = m0Var3;
        this.this$0 = textFieldMeasurePolicy;
        this.$topPadding = i13;
        this.$this_measure = y11;
        this.$height = i14;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
        invoke2(aVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(m0.a layout) {
        boolean z11;
        InterfaceC9914x interfaceC9914x;
        boolean z12;
        float f7;
        float f11;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        m0 m0Var = this.$labelPlaceable;
        if (m0Var == null) {
            int i11 = this.$height;
            m0 m0Var2 = this.$textFieldPlaceable;
            m0 m0Var3 = this.$placeholderPlaceable;
            z11 = this.this$0.singleLine;
            float g10 = this.$this_measure.g();
            interfaceC9914x = this.this$0.paddingValues;
            TextFieldMeasurePolicyKt.placeWithoutLabel(layout, i11, m0Var2, m0Var3, z11, g10, interfaceC9914x);
            return;
        }
        int i12 = this.$topPaddingValue - this.$labelHeight;
        if (i12 < 0) {
            i12 = 0;
        }
        int i13 = i12;
        m0 m0Var4 = this.$textFieldPlaceable;
        m0 m0Var5 = this.$placeholderPlaceable;
        z12 = this.this$0.singleLine;
        int i14 = this.$topPadding + this.$labelHeight;
        f7 = this.this$0.animationProgress;
        float g11 = this.$this_measure.g();
        f11 = this.this$0.labelTopPadding;
        TextFieldMeasurePolicyKt.m3024placeWithLabelpPrIpRY(layout, m0Var4, m0Var, m0Var5, z12, i13, i14, f7, g11, f11);
    }
}
