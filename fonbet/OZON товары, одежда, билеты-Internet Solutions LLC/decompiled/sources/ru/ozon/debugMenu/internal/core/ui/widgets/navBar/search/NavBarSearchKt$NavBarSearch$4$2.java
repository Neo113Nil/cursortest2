package ru.ozon.debugMenu.internal.core.ui.widgets.navBar.search;

import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import I0.C3173b;
import Nk.a;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import e1.d;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import q1.AbstractC8972b;
import ru.ozon.app.android.R;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.DebugMenuIconButtonKt;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.presets.size.DebugMenuIconButtonSize;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.presets.style.DebugMenuIconButtonStyle;
import ru.ozon.debugMenu.internal.core.ui.widgets.icon.DebugMenuIconKt;
import ru.ozon.debugMenu.internal.core.ui.widgets.text.SingleLineTextKt;
import u0.C9891D;
import y20.C10833a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "innerTextField", "invoke", "(Lkotlin/jvm/functions/Function2;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class NavBarSearchKt$NavBarSearch$4$2 extends AbstractC7737t implements InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit>, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1<String, Unit> $onValueChange;
    final /* synthetic */ String $placeholder;
    final /* synthetic */ String $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NavBarSearchKt$NavBarSearch$4$2(String str, Function1<? super String, Unit> function1, String str2) {
        super(3);
        this.$value = str;
        this.$onValueChange = function1;
        this.$placeholder = str2;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit> function2, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke((Function2<? super InterfaceC3967k, ? super Integer, Unit>) function2, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(Function2<? super InterfaceC3967k, ? super Integer, Unit> innerTextField, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        int i13;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        if ((i11 & 6) == 0) {
            i12 = i11 | (interfaceC3967k2.F(innerTextField) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i12 & 19) == 18 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
            return;
        }
        d.b i14 = InterfaceC6250b.a.i();
        e.a aVar = e.f40358c0;
        e d11 = a0.d(aVar);
        String str = this.$value;
        Function1<String, Unit> function1 = this.$onValueChange;
        String str2 = this.$placeholder;
        Y b11 = X.b(C5179b.f(), i14, interfaceC3967k2, 48);
        int I11 = interfaceC3967k2.I();
        A0 d12 = interfaceC3967k2.d();
        e f7 = c.f(interfaceC3967k2, d11);
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
        Function2 f11 = C3173b.f(interfaceC3967k2, b11, interfaceC3967k2, d12);
        if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
            a.d(f11, I11, interfaceC3967k2, I11);
        }
        F1.b(interfaceC3967k2, f7, InterfaceC2801g.a.f());
        C9891D c9891d = C9891D.f99599a;
        float f12 = 10;
        NavBarSearchKt.m1638SpacerWidthziNgDLE(c9891d, f12, interfaceC3967k2, 54);
        int i15 = C10833a.f105964b;
        interfaceC3967k2.o(-1736708122);
        AbstractC8972b a12 = G1.e.a(R.drawable.ozon_debug_menu_ic_m_search_filled, interfaceC3967k2, 0);
        interfaceC3967k2.k();
        int i16 = i12;
        DebugMenuIconKt.m1619DebugMenuIconFNF3uiM(a12, a0.n(aVar, 20), C10833a.a(interfaceC3967k2).n(), interfaceC3967k2, 48, 0);
        NavBarSearchKt.m1638SpacerWidthziNgDLE(c9891d, f12, interfaceC3967k2, 54);
        e a13 = c9891d.a(aVar, 1.0f, true);
        V f13 = C5185h.f(InterfaceC6250b.a.o(), false);
        int I12 = interfaceC3967k2.I();
        A0 d13 = interfaceC3967k2.d();
        e f14 = c.f(interfaceC3967k2, a13);
        Function0 a14 = InterfaceC2801g.a.a();
        if (interfaceC3967k2.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k2.i();
        if (interfaceC3967k2.t()) {
            interfaceC3967k2.H(a14);
        } else {
            interfaceC3967k2.e();
        }
        Function2 d14 = C2454a.d(interfaceC3967k2, f13, interfaceC3967k2, d13);
        if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I12))) {
            a.d(d14, I12, interfaceC3967k2, I12);
        }
        Ek.a.g(f14, interfaceC3967k2, 967669172);
        if (str2 != null && str.length() == 0) {
            SingleLineTextKt.m1642SingleLineTextsW7UJKQ(str2, C10833a.a(interfaceC3967k2).n(), C10833a.b().d(), null, interfaceC3967k, 384, 8);
            interfaceC3967k2 = interfaceC3967k;
        }
        interfaceC3967k2.k();
        innerTextField.invoke(interfaceC3967k2, Integer.valueOf(i16 & 14));
        interfaceC3967k2.f();
        if (str.length() > 0) {
            interfaceC3967k2.o(-178261632);
            interfaceC3967k2.o(-1745112686);
            AbstractC8972b a15 = G1.e.a(R.drawable.ozon_debug_menu_ic_m_cross_filled, interfaceC3967k2, 0);
            interfaceC3967k2.k();
            DebugMenuIconButtonStyle.NeutralTransparent neutralTransparent = DebugMenuIconButtonStyle.NeutralTransparent.INSTANCE;
            DebugMenuIconButtonSize debugMenuIconButtonSize = DebugMenuIconButtonSize.Size400;
            interfaceC3967k2.o(1379731864);
            boolean n11 = interfaceC3967k2.n(function1);
            Object C11 = interfaceC3967k2.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new NavBarSearchKt$NavBarSearch$4$2$1$2$1(function1);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            i13 = 54;
            DebugMenuIconButtonKt.DebugMenuIconButton(a15, (Function0) C11, null, false, null, neutralTransparent, debugMenuIconButtonSize, null, interfaceC3967k, 1769472, 156);
            interfaceC3967k2 = interfaceC3967k;
            interfaceC3967k2.k();
        } else {
            i13 = 54;
            interfaceC3967k2.o(-177916602);
            NavBarSearchKt.m1638SpacerWidthziNgDLE(c9891d, 6, interfaceC3967k2, 54);
            interfaceC3967k2.k();
        }
        NavBarSearchKt.m1638SpacerWidthziNgDLE(c9891d, 4, interfaceC3967k2, i13);
        interfaceC3967k2.f();
    }
}
