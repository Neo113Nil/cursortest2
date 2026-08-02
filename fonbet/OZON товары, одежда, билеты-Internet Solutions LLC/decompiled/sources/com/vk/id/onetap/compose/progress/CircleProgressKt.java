package com.vk.id.onetap.compose.progress;

import Aa.C2374a;
import Aa.C2375b;
import Bl0.C2652m;
import I1.A;
import I1.D;
import I1.o;
import S0.A1;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.platform.Q1;
import com.vk.id.onetap.common.progress.style.InternalCircleProgressStyle;
import com.vk.id.onetap.compose.R$drawable;
import com.vk.id.onetap.compose.progress.CircleProgressKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7825i0;
import m0.C8004n;
import m0.EnumC7987e0;
import m0.G;
import m0.O;
import m0.T;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vk/id/onetap/common/progress/style/InternalCircleProgressStyle;", "style", "", "CircleProgress", "(Lcom/vk/id/onetap/common/progress/style/InternalCircleProgressStyle;LS0/k;I)V", "", "angle", "onetap-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CircleProgressKt {
    public static final void CircleProgress(@NotNull final InternalCircleProgressStyle style, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(style, "style");
        C3969l u11 = interfaceC3967k.u(2079882370);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(style) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            O.a a11 = T.a(T.c("vkid_spinner", u11, 0), 0.0f, 360.0f, C8004n.a(C8004n.d(1000, 0, G.b(), 2), EnumC7987e0.Restart, 4), "vkid_spinner", u11, 29112, 0);
            e.a aVar = e.f40358c0;
            u11.o(1828822699);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new C2374a(0);
                u11.x(C11);
            }
            u11.k();
            e a12 = Q1.a(o.c(aVar, false, (Function1) C11), "circle_progress");
            u11.o(1828828489);
            boolean n11 = u11.n(a11);
            Object C12 = u11.C();
            if (n11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new C2375b(a11, 0);
                u11.x(C12);
            }
            u11.k();
            C8366G.a(G1.e.a(R$drawable.vkid_spinner, u11, 0), null, a.a(a12, (Function1) C12), null, null, 0.0f, CircleProgressStyleKt.asColorFilter(style, u11, i12 & 14), u11, 48, 56);
            u11 = u11;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: Aa.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CircleProgress$lambda$5;
                    int intValue = ((Integer) obj2).intValue();
                    CircleProgress$lambda$5 = CircleProgressKt.CircleProgress$lambda$5(InternalCircleProgressStyle.this, i11, (InterfaceC3967k) obj, intValue);
                    return CircleProgress$lambda$5;
                }
            });
        }
    }

    private static final float CircleProgress$lambda$0(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircleProgress$lambda$2$lambda$1(D semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        A.a(semantics, true);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircleProgress$lambda$4$lambda$3(A1 a12, InterfaceC7825i0 graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.h(CircleProgress$lambda$0(a12));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircleProgress$lambda$5(InternalCircleProgressStyle internalCircleProgressStyle, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        CircleProgress(internalCircleProgressStyle, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }
}
