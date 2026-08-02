package ru.ozon.uni.foundation.utils;

import B1.U;
import B1.W;
import B1.Y;
import B1.m0;
import Z1.b;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LB1/Y;", "LB1/U;", "measurable", "LZ1/b;", "constraints", "LB1/W;", "invoke-3p2s80s", "(LB1/Y;LB1/U;J)LB1/W;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes8.dex */
final class ModifierUtilsKt$maxIntrinsicWidthIfInLazyRow$1 extends AbstractC7737t implements InterfaceC6511n<Y, U, b, W> {
    public static final ModifierUtilsKt$maxIntrinsicWidthIfInLazyRow$1 INSTANCE = new ModifierUtilsKt$maxIntrinsicWidthIfInLazyRow$1();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.uni.foundation.utils.ModifierUtilsKt$maxIntrinsicWidthIfInLazyRow$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
        final /* synthetic */ m0 $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(m0 m0Var) {
            super(1);
            this.$placeable = m0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
            invoke2(aVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            layout.h(this.$placeable, 0, 0, 0.0f);
        }
    }

    ModifierUtilsKt$maxIntrinsicWidthIfInLazyRow$1() {
        super(3);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ W invoke(Y y11, U u11, b bVar) {
        return m3042invoke3p2s80s(y11, u11, bVar.p());
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final W m3042invoke3p2s80s(Y layout, U measurable, long j11) {
        W z02;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (!b.g(j11)) {
            j11 = b.c(measurable.Y(b.j(j11)), 0, 0, 0, 14, j11);
        }
        m0 a02 = measurable.a0(j11);
        z02 = layout.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new AnonymousClass1(a02));
        return z02;
    }
}
