package ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose;

import D1.InterfaceC2801g;
import I0.C3173b;
import J0.u3;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import ru.ozon.app.android.messenger.R$string;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.repository.UniTheme;
import u0.E;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f90821b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Function0<Unit> function0) {
        super(2);
        this.f90821b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e c11 = androidx.compose.foundation.i.c(aVar, false, null, null, this.f90821b, 7);
            UniTheme uniTheme = UniTheme.INSTANCE;
            androidx.compose.ui.e e11 = T.e(c11, T.b(uniTheme.getPaddings().getPadding500(), 0.0f, 0.0f, 0.0f, 14));
            Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.i(), interfaceC3967k2, 48);
            int I11 = interfaceC3967k2.I();
            A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(interfaceC3967k2, e11);
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
            Function2 f11 = C3173b.f(interfaceC3967k2, b11, interfaceC3967k2, d11);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(f11, I11, interfaceC3967k2, I11);
            }
            F1.b(interfaceC3967k2, f7, InterfaceC2801g.a.f());
            u3.b(G1.i.a(interfaceC3967k2, R$string.messenger_copy_text), null, uniTheme.getColors(interfaceC3967k2, UniTheme.$stable).getTextPrimary(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, uniTheme.getTypography().getBody500Medium(), interfaceC3967k2, 0, 0, 65530);
            E.a(interfaceC3967k2, a0.r(aVar, b.b()));
            DsIconAtomKt.DsIconAtom(b.a(), null, interfaceC3967k2, IconDTO.$stable, 2);
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
