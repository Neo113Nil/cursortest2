package ru.ozon.uni.foundation.components.cell;

import B1.m0;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes8.dex */
final class FoundationCellKt$FoundationCell$3$measure$2 extends AbstractC7737t implements Function1<m0.a, Unit> {
    final /* synthetic */ int $bottomPaddingPx;
    final /* synthetic */ InterfaceC6250b.c $centerAlignment;
    final /* synthetic */ m0 $centerPlaceable;
    final /* synthetic */ InterfaceC6250b.c $endAlignment;
    final /* synthetic */ m0 $endClickHandlerPlaceable;
    final /* synthetic */ m0 $endPlaceable;
    final /* synthetic */ int $height;
    final /* synthetic */ m0 $separatorPlaceable;
    final /* synthetic */ InterfaceC6250b.c $startAlignment;
    final /* synthetic */ m0 $startClickHandlerPlaceable;
    final /* synthetic */ m0 $startPlaceable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FoundationCellKt$FoundationCell$3$measure$2(m0 m0Var, m0 m0Var2, InterfaceC6250b.c cVar, int i11, m0 m0Var3, m0 m0Var4, m0 m0Var5, InterfaceC6250b.c cVar2, InterfaceC6250b.c cVar3, m0 m0Var6, int i12) {
        super(1);
        this.$startClickHandlerPlaceable = m0Var;
        this.$startPlaceable = m0Var2;
        this.$startAlignment = cVar;
        this.$height = i11;
        this.$endClickHandlerPlaceable = m0Var3;
        this.$centerPlaceable = m0Var4;
        this.$endPlaceable = m0Var5;
        this.$endAlignment = cVar2;
        this.$centerAlignment = cVar3;
        this.$separatorPlaceable = m0Var6;
        this.$bottomPaddingPx = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
        invoke2(aVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(m0.a layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        m0 m0Var = this.$startClickHandlerPlaceable;
        if (m0Var != null) {
            layout.h(m0Var, 0, 0, 0.0f);
        }
        m0 m0Var2 = this.$startPlaceable;
        if (m0Var2 != null) {
            layout.h(m0Var2, 0, this.$startAlignment.a(m0Var2.l0(), this.$height), 0.0f);
        }
        m0 m0Var3 = this.$endClickHandlerPlaceable;
        if (m0Var3 != null) {
            m0 m0Var4 = this.$startPlaceable;
            layout.h(m0Var3, this.$centerPlaceable.u0() + (m0Var4 != null ? m0Var4.u0() : 0), 0, 0.0f);
        }
        m0 m0Var5 = this.$endPlaceable;
        if (m0Var5 != null) {
            m0 m0Var6 = this.$startPlaceable;
            layout.h(m0Var5, this.$centerPlaceable.u0() + (m0Var6 != null ? m0Var6.u0() : 0), this.$endAlignment.a(this.$endPlaceable.l0(), this.$height), 0.0f);
        }
        m0 m0Var7 = this.$centerPlaceable;
        m0 m0Var8 = this.$startPlaceable;
        layout.h(m0Var7, m0Var8 != null ? m0Var8.u0() : 0, this.$centerAlignment.a(this.$centerPlaceable.l0(), this.$height), 0.0f);
        m0 m0Var9 = this.$separatorPlaceable;
        if (m0Var9 != null) {
            m0 m0Var10 = this.$startPlaceable;
            layout.h(m0Var9, m0Var10 != null ? m0Var10.u0() : 0, (this.$height - this.$separatorPlaceable.l0()) + this.$bottomPaddingPx, 0.0f);
        }
    }
}
