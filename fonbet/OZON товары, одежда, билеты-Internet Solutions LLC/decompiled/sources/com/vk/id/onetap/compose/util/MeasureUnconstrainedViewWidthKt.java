package com.vk.id.onetap.compose.util;

import B1.U;
import B1.W;
import B1.m0;
import B1.v0;
import B1.z0;
import Ba.d;
import Bl0.C2652m;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Z1.b;
import Z1.c;
import Z1.h;
import a1.C4912a;
import com.vk.id.onetap.compose.util.MeasureUnconstrainedViewWidthKt;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/Function0;", "", "viewToMeasure", "Lkotlin/Function1;", "LZ1/h;", "content", "MeasureUnconstrainedViewWidth", "(Lkotlin/jvm/functions/Function2;Lfd/n;LS0/k;I)V", "onetap-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MeasureUnconstrainedViewWidthKt {
    public static final void MeasureUnconstrainedViewWidth(@NotNull final Function2<? super InterfaceC3967k, ? super Integer, Unit> viewToMeasure, @NotNull final InterfaceC6511n<? super h, ? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(viewToMeasure, "viewToMeasure");
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(-1713395483);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(viewToMeasure) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(content) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            u11.o(-1738132685);
            boolean z11 = ((i12 & 112) == 32) | ((i12 & 14) == 4);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new Function2() { // from class: Ba.a
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        W MeasureUnconstrainedViewWidth$lambda$3$lambda$2;
                        MeasureUnconstrainedViewWidth$lambda$3$lambda$2 = MeasureUnconstrainedViewWidthKt.MeasureUnconstrainedViewWidth$lambda$3$lambda$2(Function2.this, content, (z0) obj, (Z1.b) obj2);
                        return MeasureUnconstrainedViewWidth$lambda$3$lambda$2;
                    }
                };
                u11.x(C11);
            }
            u11.k();
            v0.b(null, (Function2) C11, u11, 0, 1);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: Ba.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MeasureUnconstrainedViewWidth$lambda$4;
                    int intValue = ((Integer) obj2).intValue();
                    InterfaceC6511n interfaceC6511n = content;
                    int i13 = i11;
                    MeasureUnconstrainedViewWidth$lambda$4 = MeasureUnconstrainedViewWidthKt.MeasureUnconstrainedViewWidth$lambda$4(Function2.this, interfaceC6511n, i13, (InterfaceC3967k) obj, intValue);
                    return MeasureUnconstrainedViewWidth$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W MeasureUnconstrainedViewWidth$lambda$3$lambda$2(Function2 function2, final InterfaceC6511n interfaceC6511n, z0 SubcomposeLayout, b bVar) {
        W z02;
        W z03;
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        final float B11 = SubcomposeLayout.B(SubcomposeLayout.L0("viewToMeasure", function2).get(0).a0(c.b(0, 0, 15)).u0());
        List<U> L02 = SubcomposeLayout.L0("content", new C4912a(true, 1560160232, new Function2<InterfaceC3967k, Integer, Unit>() { // from class: com.vk.id.onetap.compose.util.MeasureUnconstrainedViewWidthKt$MeasureUnconstrainedViewWidth$1$1$measurable$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                invoke(interfaceC3967k, num.intValue());
                return Unit.f71690a;
            }

            public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
                if ((i11 & 3) == 2 && interfaceC3967k.b()) {
                    interfaceC3967k.j();
                } else {
                    interfaceC6511n.invoke(h.a(B11), interfaceC3967k, 0);
                }
            }
        }));
        if (L02.isEmpty()) {
            z02 = SubcomposeLayout.z0(0, 0, kotlin.collections.U.c(), new d(0));
            return z02;
        }
        m0 a02 = L02.get(0).a0(bVar.p());
        z03 = SubcomposeLayout.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new Ba.c(a02, 0));
        return z03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MeasureUnconstrainedViewWidth$lambda$3$lambda$2$lambda$0(m0 m0Var, m0.a layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        layout.d(m0Var, 0, 0, 0.0f);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MeasureUnconstrainedViewWidth$lambda$3$lambda$2$lambda$1(m0.a layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MeasureUnconstrainedViewWidth$lambda$4(Function2 function2, InterfaceC6511n interfaceC6511n, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        MeasureUnconstrainedViewWidth(function2, interfaceC6511n, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }
}
