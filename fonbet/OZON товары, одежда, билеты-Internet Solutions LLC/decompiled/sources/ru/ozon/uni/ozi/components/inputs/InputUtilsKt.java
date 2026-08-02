package ru.ozon.uni.ozi.components.inputs;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.i;
import j1.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "removeFocusAndroid8", "(LS0/k;I)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InputUtilsKt {
    public static final void removeFocusAndroid8(InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(-1960657456);
        if (i11 == 0 && u11.b()) {
            u11.j();
        } else {
            u11.o(1232681798);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new r();
                u11.x(C11);
            }
            r rVar = (r) C11;
            u11.k();
            Unit unit = Unit.f71690a;
            u11.o(1232683606);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = new InputUtilsKt$removeFocusAndroid8$1$1(rVar, null);
                u11.x(C12);
            }
            u11.k();
            Q.e(u11, unit, (Function2) C12);
            C5185h.a(FocusableKt.a(i.a(e.f40358c0, rVar), true, null), u11, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new InputUtilsKt$removeFocusAndroid8$2(i11));
        }
    }
}
