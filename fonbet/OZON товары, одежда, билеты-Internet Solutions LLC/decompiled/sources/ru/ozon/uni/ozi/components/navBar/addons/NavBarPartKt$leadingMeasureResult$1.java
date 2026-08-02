package ru.ozon.uni.ozi.components.navBar.addons;

import B1.m0;
import J0.C3354v2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class NavBarPartKt$leadingMeasureResult$1 extends AbstractC7737t implements Function1<m0.a, Unit> {
    final /* synthetic */ m0 $centerContainerPlaceable;
    final /* synthetic */ m0 $endContainerPlaceable;
    final /* synthetic */ int $gap;
    final /* synthetic */ int $layoutHeight;
    final /* synthetic */ int $layoutWidth;
    final /* synthetic */ m0 $startContainerPlaceable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavBarPartKt$leadingMeasureResult$1(m0 m0Var, int i11, m0 m0Var2, int i12, m0 m0Var3, int i13) {
        super(1);
        this.$startContainerPlaceable = m0Var;
        this.$layoutHeight = i11;
        this.$centerContainerPlaceable = m0Var2;
        this.$gap = i12;
        this.$endContainerPlaceable = m0Var3;
        this.$layoutWidth = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
        invoke2(aVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(m0.a layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        m0 m0Var = this.$startContainerPlaceable;
        layout.d(m0Var, 0, C3354v2.d(this.$layoutHeight, 2, m0Var), 0.0f);
        layout.d(this.$centerContainerPlaceable, this.$startContainerPlaceable.u0() + this.$gap, C3354v2.d(this.$layoutHeight, 2, this.$centerContainerPlaceable), 0.0f);
        m0 m0Var2 = this.$endContainerPlaceable;
        layout.d(m0Var2, this.$layoutWidth - m0Var2.u0(), C3354v2.d(this.$layoutHeight, 2, this.$endContainerPlaceable), 0.0f);
    }
}
