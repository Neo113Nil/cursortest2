package com.vk.id.group.subscription.compose.close;

import B1.InterfaceC2547p;
import B1.V;
import Bl0.C2652m;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import com.vk.id.group.subscription.compose.R$drawable;
import com.vk.id.group.subscription.compose.close.CloseIconKt;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "", "onClick", "CloseIcon", "(Lkotlin/jvm/functions/Function0;LS0/k;I)V", "group-subscription-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CloseIconKt {
    public static final void CloseIcon(@NotNull final Function0<Unit> onClick, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(-909803553);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(onClick) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            e a11 = Q1.a(e.f40358c0, "group_subscription_close");
            u11.o(1550028971);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                u11.x(C11);
            }
            u11.k();
            e b11 = i.b(a11, (q) C11, null, false, null, null, onClick, 28);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, b11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            c3969l = u11;
            C8366G.a(G1.e.a(R$drawable.vkid_group_subscription_close, u11, 0), null, null, null, InterfaceC2547p.a.d(), 0.0f, null, c3969l, 24624, 108);
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: ga.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CloseIcon$lambda$2;
                    int intValue = ((Integer) obj2).intValue();
                    CloseIcon$lambda$2 = CloseIconKt.CloseIcon$lambda$2(Function0.this, i11, (InterfaceC3967k) obj, intValue);
                    return CloseIcon$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CloseIcon$lambda$2(Function0 function0, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        CloseIcon(function0, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }
}
