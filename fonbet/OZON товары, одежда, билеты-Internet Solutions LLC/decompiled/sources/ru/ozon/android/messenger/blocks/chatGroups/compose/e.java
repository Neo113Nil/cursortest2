package ru.ozon.android.messenger.blocks.chatGroups.compose;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.z;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.common.screen.compose.t;

/* loaded from: classes10.dex */
public final class e {
    public static final void a(e.a aVar, @NotNull ArrayList chatGroups, boolean z11, @NotNull Function1 onGroupClickListener, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(chatGroups, "chatGroups");
        Intrinsics.checkNotNullParameter(onGroupClickListener, "onGroupClickListener");
        C3969l u11 = interfaceC3967k.u(-111672437);
        if ((((u11.n(chatGroups) ? 32 : 16) | i11 | (u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.F(onGroupClickListener) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL)) & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            t.a(null, a1.c.c(737815431, new c(aVar, z.b(u11), chatGroups, onGroupClickListener, z11, z11 ? 0 : 8), u11), u11, 48);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new d(aVar, chatGroups, z11, onGroupClickListener, i11));
        }
    }
}
