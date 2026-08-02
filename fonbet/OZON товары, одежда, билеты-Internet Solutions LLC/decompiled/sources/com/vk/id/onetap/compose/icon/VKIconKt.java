package com.vk.id.onetap.compose.icon;

import B1.InterfaceC2547p;
import Bl0.C2652m;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.ui.e;
import com.vk.id.onetap.common.icon.style.InternalVKIconStyle;
import com.vk.id.onetap.compose.icon.VKIconKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lcom/vk/id/onetap/common/icon/style/InternalVKIconStyle;", "style", "", "VKIcon", "(Landroidx/compose/ui/e;Lcom/vk/id/onetap/common/icon/style/InternalVKIconStyle;LS0/k;II)V", "onetap-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VKIconKt {
    public static final void VKIcon(final e eVar, @NotNull final InternalVKIconStyle style, InterfaceC3967k interfaceC3967k, final int i11, final int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(style, "style");
        C3969l u11 = interfaceC3967k.u(55797192);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(style) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            C8366G.a(G1.e.a(VKIconColorStyleKt.asPainterResource(style.getColorStyle(), u11, 0), u11, 0), null, VKIconSizeStyleKt.size(eVar, style.getSizeStyle()), null, InterfaceC2547p.a.d(), 0.0f, null, u11, 24624, 104);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: ya.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit VKIcon$lambda$0;
                    int intValue = ((Integer) obj2).intValue();
                    int i15 = i11;
                    int i16 = i12;
                    VKIcon$lambda$0 = VKIconKt.VKIcon$lambda$0(e.this, style, i15, i16, (InterfaceC3967k) obj, intValue);
                    return VKIcon$lambda$0;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VKIcon$lambda$0(e eVar, InternalVKIconStyle internalVKIconStyle, int i11, int i12, InterfaceC3967k interfaceC3967k, int i13) {
        VKIcon(eVar, internalVKIconStyle, interfaceC3967k, C2652m.e(i11 | 1), i12);
        return Unit.f71690a;
    }
}
