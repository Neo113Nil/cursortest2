package ru.ozon.debugMenu.internal.core.ui.widgets.button;

import A0.h;
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
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import m0.D0;
import m3.C8060b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.debugMenu.internal.core.ui.utils.b;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.presets.size.DebugMenuButtonSize;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.presets.style.DebugMenuButtonStyle;
import ru.ozon.debugMenu.internal.core.ui.widgets.text.TextKt;
import t0.p;
import t0.q;
import y20.C10833a;

@Metadata(d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aW\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/e;", "modifier", "", "enabled", "Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/DebugMenuButtonStyle;", "style", "Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/size/DebugMenuButtonSize;", "size", "Lt0/q;", "interactionSource", "DebugMenuButton", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/e;ZLru/ozon/debugMenu/internal/core/ui/widgets/button/presets/style/DebugMenuButtonStyle;Lru/ozon/debugMenu/internal/core/ui/widgets/button/presets/size/DebugMenuButtonSize;Lt0/q;LS0/k;II)V", "ozon-debug-menu_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugMenuButtonKt {
    public static final void DebugMenuButton(@NotNull String title, @NotNull Function0<Unit> onClick, e eVar, boolean z11, DebugMenuButtonStyle debugMenuButtonStyle, DebugMenuButtonSize debugMenuButtonSize, q qVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        q qVar2;
        e b11;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        interfaceC3967k.o(-1695564359);
        e eVar2 = (i12 & 4) != 0 ? e.f40358c0 : eVar;
        boolean z12 = (i12 & 8) != 0 ? true : z11;
        DebugMenuButtonStyle debugMenuButtonStyle2 = (i12 & 16) != 0 ? DebugMenuButtonStyle.ActionPrimary.INSTANCE : debugMenuButtonStyle;
        DebugMenuButtonSize debugMenuButtonSize2 = (i12 & 32) != 0 ? DebugMenuButtonSize.Size500 : debugMenuButtonSize;
        if ((i12 & 64) != 0) {
            interfaceC3967k.o(1947750645);
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
        D0<Boolean> a11 = c.a(qVar2, interfaceC3967k, (i11 >> 18) & 14);
        int i13 = (i11 >> 9) & 126;
        long m1603getBackgroundColorXeAY9LY = debugMenuButtonStyle2.m1603getBackgroundColorXeAY9LY(z12, interfaceC3967k, i13);
        long m1604getTitleColorXeAY9LY = debugMenuButtonStyle2.m1604getTitleColorXeAY9LY(z12, interfaceC3967k, i13);
        A1<Float> animateButtonTitleAlpha = ButtonAnimationUtilsKt.animateButtonTitleAlpha(a11, z12, C7807Z.q(m1604getTitleColorXeAY9LY), 0.4f, 0.4f, interfaceC3967k, ((i11 >> 6) & 112) | 27648);
        b11 = androidx.compose.foundation.e.b(C6988h.a(a0.f(b.a(eVar2, DebugMenuButtonTestTags.Container), debugMenuButtonSize2.getHeight()), h.b(debugMenuButtonSize2.getCornerRadius())), m1603getBackgroundColorXeAY9LY, y0.a());
        e h11 = T.h(i.b(b11, qVar2, null, z12, null, I1.i.a(0), onClick, 8), debugMenuButtonSize2.getContentHorizontalPadding(), 0.0f, 2);
        V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f11 = androidx.compose.ui.c.f(interfaceC3967k, h11);
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
        e h12 = T.h(b.a(e.f40358c0, DebugMenuButtonTestTags.Title), debugMenuButtonSize2.getLabelHorizontalPadding(), 0.0f, 2);
        interfaceC3967k.o(-1583879383);
        boolean n11 = interfaceC3967k.n(animateButtonTitleAlpha);
        Object C12 = interfaceC3967k.C();
        if (n11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new DebugMenuButtonKt$DebugMenuButton$2$1$1(animateButtonTitleAlpha);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        TextKt.m1643Text4IGK_g(title, androidx.compose.ui.graphics.a.a(h12, (Function1) C12), m1604getTitleColorXeAY9LY, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, C10833a.b().e(), interfaceC3967k, i11 & 14, 1575984, 55288);
        interfaceC3967k.f();
        interfaceC3967k.k();
    }
}
