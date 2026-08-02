package ru.ozon.uni.ozi.components.text;

import B1.m0;
import Z1.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class OziExpandableTextBlockItemImplKt$measureWithExpand$1 extends AbstractC7737t implements Function1<m0.a, Unit> {
    final /* synthetic */ d $density;
    final /* synthetic */ m0 $expandBoxMeasurable;
    final /* synthetic */ m0 $expandTextMeasurable;
    final /* synthetic */ int $expandY;
    final /* synthetic */ InterfaceC9914x $paddingValues;
    final /* synthetic */ m0 $textMeasurable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziExpandableTextBlockItemImplKt$measureWithExpand$1(m0 m0Var, m0 m0Var2, d dVar, m0 m0Var3, int i11, InterfaceC9914x interfaceC9914x) {
        super(1);
        this.$textMeasurable = m0Var;
        this.$expandBoxMeasurable = m0Var2;
        this.$density = dVar;
        this.$expandTextMeasurable = m0Var3;
        this.$expandY = i11;
        this.$paddingValues = interfaceC9914x;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
        invoke2(aVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(m0.a layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        layout.h(this.$textMeasurable, 0, 0, 0.0f);
        m0 m0Var = this.$expandBoxMeasurable;
        if (m0Var != null) {
            layout.h(m0Var, this.$textMeasurable.u0() - this.$expandBoxMeasurable.u0(), (this.$textMeasurable.l0() - this.$expandBoxMeasurable.l0()) - ((int) this.$density.v1(this.$paddingValues.a())), 0.0f);
        }
        m0 m0Var2 = this.$expandTextMeasurable;
        if (m0Var2 != null) {
            layout.h(m0Var2, this.$textMeasurable.u0() - this.$expandTextMeasurable.u0(), this.$expandY, 0.0f);
        }
    }
}
