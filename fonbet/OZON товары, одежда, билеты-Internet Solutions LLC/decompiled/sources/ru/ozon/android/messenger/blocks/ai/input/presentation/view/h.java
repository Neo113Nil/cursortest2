package ru.ozon.android.messenger.blocks.ai.input.presentation.view;

import B0.C2475h;
import K1.T;
import Q1.K;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import android.content.Context;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j1.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ai.input.data.Settings;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.repository.UniTheme;

/* loaded from: classes10.dex */
public final class h {
    public static final void a(@NotNull K textValue, @NotNull TextDTO placeholder, @NotNull String cursorColor, @NotNull String outlineColor, Settings settings, boolean z11, IconButtonV3DTO iconButtonV3DTO, @NotNull r focusRequester, @NotNull Function1 onValueChange, @NotNull Function1 onFocusChanged, @NotNull Function2 onSendClick, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        boolean z12;
        androidx.compose.ui.e eVar;
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(textValue, "textValue");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(cursorColor, "cursorColor");
        Intrinsics.checkNotNullParameter(outlineColor, "outlineColor");
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        Intrinsics.checkNotNullParameter(onSendClick, "onSendClick");
        C3969l u11 = interfaceC3967k.u(676658648);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(textValue) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(placeholder) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(cursorColor) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(outlineColor) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.n(settings) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            z12 = z11;
            i12 |= u11.p(z12) ? 131072 : 65536;
        } else {
            z12 = z11;
        }
        if ((i11 & 1572864) == 0) {
            i12 |= (i11 & 2097152) == 0 ? u11.n(iconButtonV3DTO) : u11.F(iconButtonV3DTO) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i12 |= u11.n(focusRequester) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i12 |= u11.F(onValueChange) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i12 |= u11.F(onFocusChanged) ? 536870912 : 268435456;
        }
        int i13 = i12;
        char c11 = u11.F(onSendClick) ? (char) 4 : (char) 2;
        if ((i13 & 306783379) == 306783378 && (c11 & 3) == 2 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            AbstractC7799Q a11 = ru.ozon.android.messenger.utils.compose.a.a(cursorColor, u11, (i13 >> 6) & 14);
            UniTheme uniTheme = UniTheme.INSTANCE;
            T c12 = T.c(uniTheme.getTypography().getBody500Medium(), uniTheme.getColors(u11, UniTheme.$stable).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214);
            androidx.compose.ui.e a12 = androidx.compose.ui.focus.a.a(androidx.compose.foundation.e.a(a0.h(a0.e(androidx.compose.ui.focus.i.a(androidx.compose.ui.e.f40358c0, focusRequester), 1.0f), 0.0f, a.d(), 1), ThemeExtKt.isDarkThemeActive((Context) u11.m(AndroidCompositionLocals_androidKt.d())) ? a.a() : a.b(), null, 6), onFocusChanged);
            if (settings != null) {
                Paddings topPadding = settings.getTopPadding();
                float m1867getDpD9Ej5fM = topPadding != null ? topPadding.m1867getDpD9Ej5fM() : 0;
                Paddings leftPadding = settings.getLeftPadding();
                float m1867getDpD9Ej5fM2 = leftPadding != null ? leftPadding.m1867getDpD9Ej5fM() : 0;
                Paddings rightPadding = settings.getRightPadding();
                float m1867getDpD9Ej5fM3 = rightPadding != null ? rightPadding.m1867getDpD9Ej5fM() : 0;
                Paddings bottomPadding = settings.getBottomPadding();
                androidx.compose.ui.e i14 = androidx.compose.foundation.layout.T.i(a12, m1867getDpD9Ej5fM2, m1867getDpD9Ej5fM, m1867getDpD9Ej5fM3, bottomPadding != null ? bottomPadding.m1867getDpD9Ej5fM() : 0);
                if (i14 != null) {
                    eVar = i14;
                    c3969l = u11;
                    C2475h.c(textValue, onValueChange, eVar, false, false, c12, null, null, false, Integer.MAX_VALUE, 0, null, null, null, a11, a1.c.c(1724236053, new f(textValue, placeholder, iconButtonV3DTO, outlineColor, z12, onSendClick), u11), c3969l, (i13 & 14) | 805306368 | ((i13 >> 21) & 112), 196608, 15832);
                }
            }
            eVar = a12;
            c3969l = u11;
            C2475h.c(textValue, onValueChange, eVar, false, false, c12, null, null, false, Integer.MAX_VALUE, 0, null, null, null, a11, a1.c.c(1724236053, new f(textValue, placeholder, iconButtonV3DTO, outlineColor, z12, onSendClick), u11), c3969l, (i13 & 14) | 805306368 | ((i13 >> 21) & 112), 196608, 15832);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new g(textValue, placeholder, cursorColor, outlineColor, settings, z11, iconButtonV3DTO, focusRequester, onValueChange, onFocusChanged, onSendClick, i11));
        }
    }
}
