package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.components;

import B1.U;
import B1.W;
import B1.m0;
import B1.z0;
import S0.InterfaceC3967k;
import Z1.b;
import Z1.c;
import Z1.l;
import a1.C4912a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LB1/z0;", "LZ1/b;", "constraints", "LB1/W;", "invoke-0kLqBqw", "(LB1/z0;J)LB1/W;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class CardsKt$CardLayout$1$1 extends AbstractC7737t implements Function2<z0, b, W> {
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $image;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $titleCell;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.components.CardsKt$CardLayout$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
        final /* synthetic */ m0 $cellPlaceable;
        final /* synthetic */ m0 $imagePlaceable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(m0 m0Var, m0 m0Var2) {
            super(1);
            this.$imagePlaceable = m0Var;
            this.$cellPlaceable = m0Var2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
            invoke2(aVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            layout.h(this.$imagePlaceable, 0, 0, 0.0f);
            layout.h(this.$cellPlaceable, 0, this.$imagePlaceable.l0(), 0.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CardsKt$CardLayout$1$1(Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22) {
        super(2);
        this.$titleCell = function2;
        this.$image = function22;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ W invoke(z0 z0Var, b bVar) {
        return m814invoke0kLqBqw(z0Var, bVar.p());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final W m814invoke0kLqBqw(z0 SubcomposeLayout, long j11) {
        W z02;
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        int j12 = b.j(j11) - SubcomposeLayout.L0("cell-height", this.$titleCell).get(0).a0(j11).l0();
        List<U> L02 = SubcomposeLayout.L0("card", new C4912a(true, -1674814921, new CardsKt$CardLayout$1$1$cardMeasurables$1(this.$image, this.$titleCell)));
        m0 a02 = L02.get(0).a0(b.c(0, 0, 0, j12, 7, j11));
        U u11 = L02.get(1);
        int u02 = a02.u0();
        if (u02 >= 0) {
            m0 a03 = u11.a0(c.i(u02, u02, 0, Integer.MAX_VALUE));
            z02 = SubcomposeLayout.z0(a02.u0(), a03.l0() + a02.l0(), kotlin.collections.U.c(), new AnonymousClass1(a02, a03));
            return z02;
        }
        l.a("width(" + u02 + ") must be >= 0");
        throw null;
    }
}
