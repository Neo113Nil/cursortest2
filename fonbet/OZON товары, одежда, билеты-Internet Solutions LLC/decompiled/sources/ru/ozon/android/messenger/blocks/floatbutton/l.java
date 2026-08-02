package ru.ozon.android.messenger.blocks.floatbutton;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.common.screen.compose.t;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class l {
    public static final void a(e.a aVar, IconDTO iconDTO, String str, Integer num, TextDTO textDTO, @NotNull Function0 onClickListener, @NotNull Function0 onView, InterfaceC3967k interfaceC3967k, int i11) {
        e.a aVar2;
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        Intrinsics.checkNotNullParameter(onView, "onView");
        C3969l u11 = interfaceC3967k.u(1303938380);
        int i12 = i11 | 6;
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(iconDTO) : u11.F(iconDTO) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(str) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(num) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.n(textDTO) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(onClickListener) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.F(onView) ? 1048576 : 524288;
        }
        if ((599187 & i12) == 599186 && u11.b()) {
            u11.j();
            aVar2 = aVar;
        } else {
            e.a aVar3 = androidx.compose.ui.e.f40358c0;
            AbstractC5434v.a aVar4 = AbstractC5434v.a.ON_RESUME;
            u11.o(759711894);
            boolean z11 = (i12 & 3670016) == 1048576;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new g(onView);
                u11.x(C11);
            }
            u11.k();
            e3.i.a(aVar4, null, (Function0) C11, u11, 6);
            t.a(null, a1.c.c(1063809744, new j(str, num, textDTO, aVar3, onClickListener, iconDTO), u11), u11, 48);
            aVar2 = aVar3;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new k(aVar2, iconDTO, str, num, textDTO, onClickListener, onView, i11));
        }
    }
}
