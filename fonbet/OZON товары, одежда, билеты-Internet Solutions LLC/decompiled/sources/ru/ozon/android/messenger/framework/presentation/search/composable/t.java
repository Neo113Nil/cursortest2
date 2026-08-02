package ru.ozon.android.messenger.framework.presentation.search.composable;

import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import e1.InterfaceC6250b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import ru.ozon.android.messenger.framework.presentation.search.C9525e;
import ru.ozon.android.messenger.framework.presentation.search.J;
import ru.ozon.android.messenger.framework.presentation.search.L;
import ru.ozon.uni.core.repository.UniTheme;

/* loaded from: classes10.dex */
final class t extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f91697b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C9525e f91698c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f91699d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ L f91700e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<ru.ozon.android.messenger.blocks.chat.search.i, Unit> f91701f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(androidx.compose.ui.e eVar, C9525e c9525e, ru.ozon.android.messenger.framework.core.d dVar, L l11, Function1 function1) {
        super(2);
        this.f91697b = eVar;
        this.f91698c = c9525e;
        this.f91699d = dVar;
        this.f91700e = l11;
        this.f91701f = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            float f7 = 24;
            androidx.compose.ui.e b11 = androidx.compose.foundation.e.b(this.f91697b, UniTheme.INSTANCE.getColors(interfaceC3967k2, UniTheme.$stable).getLayerFloor1(), A0.h.d(f7, f7, 0.0f, 0.0f, 12));
            V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = interfaceC3967k2.I();
            A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f12 = androidx.compose.ui.c.f(interfaceC3967k2, b11);
            InterfaceC2801g.f5440U.getClass();
            Function0 a11 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a11);
            } else {
                interfaceC3967k2.e();
            }
            Function2 d12 = C2454a.d(interfaceC3967k2, f11, interfaceC3967k2, d11);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(d12, I11, interfaceC3967k2, I11);
            }
            F1.b(interfaceC3967k2, f12, InterfaceC2801g.a.f());
            androidx.compose.ui.e j11 = T.j(a0.d(androidx.compose.ui.e.f40358c0), 0.0f, 4, 0.0f, 0.0f, 13);
            List<J> d13 = this.f91698c.d();
            interfaceC3967k2.o(-1554812821);
            ru.ozon.android.messenger.framework.core.d dVar = this.f91699d;
            boolean F11 = interfaceC3967k2.F(dVar);
            Object C11 = interfaceC3967k2.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new s(dVar);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            r.a(j11, d13, dVar, this.f91700e, this.f91701f, (Function1) C11, interfaceC3967k2, 6);
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
