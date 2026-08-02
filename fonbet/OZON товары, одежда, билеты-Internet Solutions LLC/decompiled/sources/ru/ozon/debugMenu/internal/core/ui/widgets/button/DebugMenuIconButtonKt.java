package ru.ozon.debugMenu.internal.core.ui.widgets.button;

import A20.c;
import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import Nk.a;
import S0.A0;
import S0.A1;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import m0.D0;
import m3.C8060b;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.debugMenu.internal.core.ui.utils.b;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.presets.DebugMenuIconButtonShape;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.presets.size.DebugMenuIconButtonSize;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.presets.style.DebugMenuIconButtonStyle;
import ru.ozon.debugMenu.internal.core.ui.widgets.icon.DebugMenuIconKt;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aa\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lq1/b;", "icon", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/e;", "modifier", "", "enabled", "Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/DebugMenuIconButtonShape;", "shape", "Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/DebugMenuIconButtonStyle;", "style", "Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/size/DebugMenuIconButtonSize;", "size", "Lt0/q;", "interactionSource", "DebugMenuIconButton", "(Lq1/b;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/e;ZLru/ozon/debugMenu/internal/core/ui/widgets/button/presets/DebugMenuIconButtonShape;Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/DebugMenuIconButtonStyle;Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/size/DebugMenuIconButtonSize;Lt0/q;LS0/k;II)V", "ozon-debug-menu_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugMenuIconButtonKt {
    public static final void DebugMenuIconButton(@NotNull AbstractC8972b icon, @NotNull Function0<Unit> onClick, e eVar, boolean z11, DebugMenuIconButtonShape debugMenuIconButtonShape, DebugMenuIconButtonStyle debugMenuIconButtonStyle, DebugMenuIconButtonSize debugMenuIconButtonSize, q qVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        q qVar2;
        e b11;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        interfaceC3967k.o(-1138965567);
        e eVar2 = (i12 & 4) != 0 ? e.f40358c0 : eVar;
        boolean z12 = (i12 & 8) != 0 ? true : z11;
        DebugMenuIconButtonShape debugMenuIconButtonShape2 = (i12 & 16) != 0 ? DebugMenuIconButtonShape.Square : debugMenuIconButtonShape;
        DebugMenuIconButtonStyle debugMenuIconButtonStyle2 = (i12 & 32) != 0 ? DebugMenuIconButtonStyle.ActionPrimary.INSTANCE : debugMenuIconButtonStyle;
        DebugMenuIconButtonSize debugMenuIconButtonSize2 = (i12 & 64) != 0 ? DebugMenuIconButtonSize.Size500 : debugMenuIconButtonSize;
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            interfaceC3967k.o(-1427932946);
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            qVar2 = (q) C11;
        } else {
            qVar2 = qVar;
        }
        D0<Boolean> a11 = c.a(qVar2, interfaceC3967k, (i11 >> 21) & 14);
        int i13 = ((i11 >> 9) & 14) | ((i11 >> 12) & 112);
        long m1605getBackgroundColorXeAY9LY = debugMenuIconButtonStyle2.m1605getBackgroundColorXeAY9LY(z12, interfaceC3967k, i13);
        long m1606getIconColorXeAY9LY = debugMenuIconButtonStyle2.m1606getIconColorXeAY9LY(z12, interfaceC3967k, i13);
        boolean z13 = z12;
        A1<Float> animateButtonIconColor = ButtonAnimationUtilsKt.animateButtonIconColor(a11, z13, C7807Z.q(m1606getIconColorXeAY9LY), 0.4f, 0.4f, interfaceC3967k, ((i11 >> 6) & 112) | 27648);
        b11 = androidx.compose.foundation.e.b(C6988h.a(a0.n(b.a(eVar2, DebugMenuIconButtonTestTags.Container), debugMenuIconButtonSize2.getSize()), debugMenuIconButtonShape2.getShape(debugMenuIconButtonSize2)), m1605getBackgroundColorXeAY9LY, y0.a());
        DebugMenuIconButtonSize debugMenuIconButtonSize3 = debugMenuIconButtonSize2;
        e b12 = i.b(b11, qVar2, null, z13, null, I1.i.a(0), onClick, 8);
        V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f11 = androidx.compose.ui.c.f(interfaceC3967k, b12);
        InterfaceC2801g.f5440U.getClass();
        Function0 a12 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a12);
        } else {
            interfaceC3967k.e();
        }
        Function2 d12 = C2454a.d(interfaceC3967k, f7, interfaceC3967k, d11);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            a.d(d12, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f11, InterfaceC2801g.a.f());
        DebugMenuIconKt.m1619DebugMenuIconFNF3uiM(icon, a0.n(b.a(e.f40358c0, DebugMenuIconButtonTestTags.Icon), debugMenuIconButtonSize3.getIconSize()), C7807Z.o(animateButtonIconColor.getValue().floatValue(), m1606getIconColorXeAY9LY), interfaceC3967k, i11 & 14, 0);
        interfaceC3967k.f();
        interfaceC3967k.k();
    }
}
