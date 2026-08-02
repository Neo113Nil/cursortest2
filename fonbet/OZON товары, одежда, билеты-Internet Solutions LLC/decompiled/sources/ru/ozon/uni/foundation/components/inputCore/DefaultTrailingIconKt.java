package ru.ozon.uni.foundation.components.inputCore;

import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import J0.T0;
import Nk.a;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u001a3\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\"\u001a\u0010\f\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lq1/b;", "icon", "Ll1/Z;", "iconColor", "Landroidx/compose/ui/e;", "modifier", "LZ1/h;", "iconSize", "", "DefaultTrailingIcon-N8B1yIo", "(Lq1/b;JLandroidx/compose/ui/e;FLS0/k;II)V", "DefaultTrailingIcon", "DefaultTrailingIconSize", "F", "getDefaultTrailingIconSize", "()F", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DefaultTrailingIconKt {
    private static final float DefaultTrailingIconSize = 44;

    /* renamed from: DefaultTrailingIcon-N8B1yIo, reason: not valid java name */
    public static final void m3010DefaultTrailingIconN8B1yIo(@NotNull AbstractC8972b icon, long j11, e eVar, float f7, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        interfaceC3967k.o(1917577534);
        if ((i12 & 4) != 0) {
            eVar = e.f40358c0;
        }
        if ((i12 & 8) != 0) {
            f7 = DefaultTrailingIconSize;
        }
        e n11 = a0.n(eVar, f7);
        V f11 = C5185h.f(InterfaceC6250b.a.e(), false);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f12 = c.f(interfaceC3967k, n11);
        InterfaceC2801g.f5440U.getClass();
        Function0 a11 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a11);
        } else {
            interfaceC3967k.e();
        }
        Function2 d12 = C2454a.d(interfaceC3967k, f11, interfaceC3967k, d11);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            a.d(d12, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f12, InterfaceC2801g.a.f());
        T0.a(icon, null, C5187j.f39515a.a(a0.n(e.f40358c0, 24), InterfaceC6250b.a.e()), j11, interfaceC3967k, (i11 & 14) | 48 | ((i11 << 6) & 7168));
        interfaceC3967k.f();
        interfaceC3967k.k();
    }

    public static final float getDefaultTrailingIconSize() {
        return DefaultTrailingIconSize;
    }
}
