package ru.ozon.ozonSentryHelper.internal.ui.debugActivity;

import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5185h;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import l1.y0;
import m3.C8060b;
import ru.ozon.uni.ozi.theme.OziTheme;
import u0.T;
import wg0.C10557d;
import wg0.g;
import wg0.m;

/* loaded from: classes3.dex */
final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f97616b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ SentryHelperDebugActivity f97617c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(g gVar, SentryHelperDebugActivity sentryHelperDebugActivity) {
        super(2);
        this.f97616b = gVar;
        this.f97617c = sentryHelperDebugActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        androidx.compose.ui.e b11;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            b11 = androidx.compose.foundation.e.b(androidx.compose.ui.e.f40358c0, OziTheme.INSTANCE.getColors(interfaceC3967k2, OziTheme.$stable).getLayerFloor1(), y0.a());
            androidx.compose.ui.e a11 = T.a(b11);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = interfaceC3967k2.I();
            A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k2, a11);
            InterfaceC2801g.f5440U.getClass();
            Function0 a12 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a12);
            } else {
                interfaceC3967k2.e();
            }
            Function2 d12 = C2454a.d(interfaceC3967k2, f7, interfaceC3967k2, d11);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(d12, I11, interfaceC3967k2, I11);
            }
            F1.b(interfaceC3967k2, f11, InterfaceC2801g.a.f());
            m K11 = SentryHelperDebugActivity.K(this.f97617c);
            interfaceC3967k2.o(-91617185);
            boolean F11 = interfaceC3967k2.F(K11);
            Object C11 = interfaceC3967k2.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                a aVar = new a(1, K11, m.class, "onAction", "onAction(Lru/ozon/ozonSentryHelper/internal/ui/debugActivity/SentryHelperDebugAction;)V", 0);
                interfaceC3967k2.x(aVar);
                C11 = aVar;
            }
            interfaceC3967k2.k();
            C10557d.a(this.f97616b, (Function1) ((h) C11), interfaceC3967k2, 0);
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
