package ru.ozon.android.messenger.framework.presentation.common.screen.compose;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import a1.C4912a;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.compose.theme.SelectThemeKt;
import ru.ozon.uni.core.repository.UniThemeKt;

/* loaded from: classes10.dex */
public final class t {
    public static final void a(Context context, @NotNull C4912a content, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(-120945424);
        if (((i11 | 2) & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            } else {
                u11.j();
            }
            u11.j0();
            if (ru.ozon.android.messenger.utils.h.b(context)) {
                u11.o(1622234979);
                SelectThemeKt.SelectTheme(false, a1.c.c(-1015062420, new q(content), u11), u11, 48, 1);
                u11.k();
            } else {
                u11.o(1622301350);
                UniThemeKt.UniTheme(false, a1.c.c(1696714715, new r(content), u11), u11, 48, 1);
                u11.k();
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new s(context, content, i11));
        }
    }
}
