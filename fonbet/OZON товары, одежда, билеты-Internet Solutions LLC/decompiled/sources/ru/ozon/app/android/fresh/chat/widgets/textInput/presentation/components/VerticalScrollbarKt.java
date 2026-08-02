package ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.components;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S1.p;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.draw.c;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import n0.d0;
import org.jetbrains.annotations.NotNull;
import u0.E;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/VerticalScrollbarStyle;", "scrollbarStyle", "Ln0/d0;", "scrollState", "", "VerticalScrollbar", "(Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/VerticalScrollbarStyle;Ln0/d0;LS0/k;I)V", "chat_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VerticalScrollbarKt {
    public static final void VerticalScrollbar(@NotNull VerticalScrollbarStyle scrollbarStyle, @NotNull d0 scrollState, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(scrollbarStyle, "scrollbarStyle");
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        C3969l u11 = interfaceC3967k.u(-505848940);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(scrollbarStyle) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(scrollState) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            boolean a11 = p.a(u11);
            u11.o(2131073019);
            int i13 = i12 & 14;
            boolean p11 = u11.p(a11) | (i13 == 4);
            Object C11 = u11.C();
            if (p11 || C11 == InterfaceC3967k.a.a()) {
                C11 = C7807Z.m(a11 ? scrollbarStyle.getScrollbarDarkColor() : scrollbarStyle.getScrollbarLightColor());
                u11.x(C11);
            }
            long w11 = ((C7807Z) C11).w();
            u11.k();
            e r11 = a0.r(a0.c(T.j(e.f40358c0, scrollbarStyle.getScrollbarHorizontalPadding(), 0.0f, 0.0f, 0.0f, 14)), scrollbarStyle.getScrollbarWidth());
            u11.o(2131085609);
            boolean s11 = (i13 == 4) | ((i12 & 112) == 32) | u11.s(w11);
            Object C12 = u11.C();
            if (s11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new VerticalScrollbarKt$VerticalScrollbar$1$1(scrollbarStyle, scrollState, w11);
                u11.x(C12);
            }
            u11.k();
            E.a(u11, c.d(r11, (Function1) C12));
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new VerticalScrollbarKt$VerticalScrollbar$2(scrollbarStyle, scrollState, i11));
        }
    }
}
