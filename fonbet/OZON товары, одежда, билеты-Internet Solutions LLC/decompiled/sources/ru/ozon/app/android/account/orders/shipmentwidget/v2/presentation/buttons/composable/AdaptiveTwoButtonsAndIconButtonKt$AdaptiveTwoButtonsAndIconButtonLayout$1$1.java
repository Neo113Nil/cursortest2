package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.buttons.composable;

import B1.U;
import B1.W;
import B1.m0;
import B1.z0;
import J0.C3354v2;
import S0.InterfaceC3967k;
import Z1.b;
import Z1.c;
import Z1.l;
import a1.C4912a;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LB1/z0;", "LZ1/b;", "constraints", "LB1/W;", "invoke-0kLqBqw", "(LB1/z0;J)LB1/W;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class AdaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1 extends AbstractC7737t implements Function2<z0, b, W> {
    final /* synthetic */ InterfaceC6511n<e, InterfaceC3967k, Integer, Unit> $firstButton;
    final /* synthetic */ float $horizontalSpacing;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $iconButton;
    final /* synthetic */ InterfaceC6511n<e, InterfaceC3967k, Integer, Unit> $secondButton;
    final /* synthetic */ float $verticalSpacing;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.buttons.composable.AdaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
        final /* synthetic */ m0 $firstPlaceable;
        final /* synthetic */ int $height;
        final /* synthetic */ int $horizontalSpacingPx;
        final /* synthetic */ m0 $iconButtonPlaceable;
        final /* synthetic */ int $rowButtonWidth;
        final /* synthetic */ m0 $secondPlaceable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(m0 m0Var, int i11, m0 m0Var2, int i12, int i13, m0 m0Var3) {
            super(1);
            this.$firstPlaceable = m0Var;
            this.$height = i11;
            this.$secondPlaceable = m0Var2;
            this.$rowButtonWidth = i12;
            this.$horizontalSpacingPx = i13;
            this.$iconButtonPlaceable = m0Var3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
            invoke2(aVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            m0 m0Var = this.$firstPlaceable;
            layout.h(m0Var, 0, C3354v2.d(this.$height, 2, m0Var), 0.0f);
            m0 m0Var2 = this.$secondPlaceable;
            layout.h(m0Var2, this.$rowButtonWidth + this.$horizontalSpacingPx, C3354v2.d(this.$height, 2, m0Var2), 0.0f);
            m0 m0Var3 = this.$iconButtonPlaceable;
            if (m0Var3 != null) {
                layout.h(m0Var3, (this.$rowButtonWidth + this.$horizontalSpacingPx) * 2, C3354v2.d(this.$height, 2, m0Var3), 0.0f);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.buttons.composable.AdaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<m0.a, Unit> {
        final /* synthetic */ m0 $firstPlaceable;
        final /* synthetic */ int $horizontalSpacingPx;
        final /* synthetic */ m0 $iconButtonPlaceable;
        final /* synthetic */ m0 $secondPlaceable;
        final /* synthetic */ int $secondRowHeight;
        final /* synthetic */ int $verticalSpacingPx;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(m0 m0Var, m0 m0Var2, int i11, int i12, m0 m0Var3, int i13) {
            super(1);
            this.$firstPlaceable = m0Var;
            this.$secondPlaceable = m0Var2;
            this.$secondRowHeight = i11;
            this.$verticalSpacingPx = i12;
            this.$iconButtonPlaceable = m0Var3;
            this.$horizontalSpacingPx = i13;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
            invoke2(aVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            layout.h(this.$firstPlaceable, 0, 0, 0.0f);
            layout.h(this.$secondPlaceable, 0, ((this.$secondRowHeight - this.$secondPlaceable.l0()) / 2) + this.$firstPlaceable.l0() + this.$verticalSpacingPx, 0.0f);
            m0 m0Var = this.$iconButtonPlaceable;
            if (m0Var != null) {
                layout.h(m0Var, this.$secondPlaceable.u0() + this.$horizontalSpacingPx, ((this.$secondRowHeight - this.$iconButtonPlaceable.l0()) / 2) + this.$firstPlaceable.l0() + this.$verticalSpacingPx, 0.0f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AdaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1(float f7, float f11, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, InterfaceC6511n<? super e, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, InterfaceC6511n<? super e, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n2) {
        super(2);
        this.$horizontalSpacing = f7;
        this.$verticalSpacing = f11;
        this.$iconButton = function2;
        this.$firstButton = interfaceC6511n;
        this.$secondButton = interfaceC6511n2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ W invoke(z0 z0Var, b bVar) {
        return m466invoke0kLqBqw(z0Var, bVar.p());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final W m466invoke0kLqBqw(z0 SubcomposeLayout, long j11) {
        Throwable th2;
        m0 m0Var;
        W z02;
        W z03;
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        int Y02 = SubcomposeLayout.Y0(this.$horizontalSpacing);
        int Y03 = SubcomposeLayout.Y0(this.$verticalSpacing);
        int k11 = b.k(j11);
        long a11 = c.a(0, Integer.MAX_VALUE, 0, b.j(j11));
        int u02 = ((U) C7714v.B0(SubcomposeLayout.L0(AdaptiveButtonsSlot.FirstMeasure, new C4912a(true, -821915774, new AdaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1$firstNaturalWidth$1(this.$firstButton))))).a0(a11).u0();
        int u03 = ((U) C7714v.B0(SubcomposeLayout.L0(AdaptiveButtonsSlot.SecondMeasure, new C4912a(true, 1071223290, new AdaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1$secondNaturalWidth$1(this.$secondButton))))).a0(a11).u0();
        Function2<InterfaceC3967k, Integer, Unit> function2 = this.$iconButton;
        if (function2 != null) {
            th2 = null;
            m0Var = ((U) C7714v.B0(SubcomposeLayout.L0(AdaptiveButtonsSlot.IconButton, new C4912a(true, -336014356, new AdaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1$iconButtonPlaceable$1$1(function2))))).a0(a11);
        } else {
            th2 = null;
            m0Var = null;
        }
        int u04 = ((k11 - (((this.$iconButton != null ? 1 : 0) + 1) * Y02)) - (m0Var != null ? m0Var.u0() : 0)) / 2;
        if (Math.max(u02, u03) > u04) {
            long a12 = b.a.a(k11);
            m0 a02 = ((U) C7714v.B0(SubcomposeLayout.L0(AdaptiveButtonsSlot.FirstContent, new C4912a(true, 1953022554, new AdaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1$firstPlaceable$2(this.$firstButton))))).a0(a12);
            e e11 = m0Var == null ? a0.e(e.f40358c0, 1.0f) : a0.r(e.f40358c0, (SubcomposeLayout.B(k11) - this.$horizontalSpacing) - SubcomposeLayout.B(m0Var.u0()));
            if (m0Var != null) {
                a12 = b.a.a((k11 - Y02) - m0Var.u0());
            }
            m0 a03 = ((U) C7714v.B0(SubcomposeLayout.L0(AdaptiveButtonsSlot.SecondContent, new C4912a(true, 1054381994, new AdaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1$secondPlaceable$2(this.$secondButton, e11))))).a0(a12);
            int max = Math.max(a03.l0(), m0Var != null ? m0Var.l0() : 0);
            z02 = SubcomposeLayout.z0(k11, a02.l0() + Y03 + max, kotlin.collections.U.c(), new AnonymousClass2(a02, a03, max, Y03, m0Var, Y02));
            return z02;
        }
        if (u04 < 0) {
            l.a("width(" + u04 + ") must be >= 0");
            throw th2;
        }
        long i11 = c.i(u04, u04, 0, Integer.MAX_VALUE);
        m0 a04 = ((U) C7714v.B0(SubcomposeLayout.L0(AdaptiveButtonsSlot.FirstContent, new C4912a(true, -880381359, new AdaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1$firstPlaceable$1(this.$firstButton, SubcomposeLayout, u04))))).a0(i11);
        m0 a05 = ((U) C7714v.B0(SubcomposeLayout.L0(AdaptiveButtonsSlot.SecondContent, new C4912a(true, -1185533023, new AdaptiveTwoButtonsAndIconButtonKt$AdaptiveTwoButtonsAndIconButtonLayout$1$1$secondPlaceable$1(this.$secondButton, SubcomposeLayout, u04))))).a0(i11);
        int intValue = ((Number) C7714v.g0(C7714v.b0(Integer.valueOf(a04.l0()), Integer.valueOf(a05.l0()), Integer.valueOf(m0Var != null ? m0Var.l0() : 0)))).intValue();
        z03 = SubcomposeLayout.z0(k11, intValue, kotlin.collections.U.c(), new AnonymousClass1(a04, intValue, a05, u04, Y02, m0Var));
        return z03;
    }
}
