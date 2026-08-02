package ru.ozon.android.messenger.blocks.chatlistheader.search;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chatlistheader.f;

/* loaded from: classes10.dex */
public final class G {
    public static final void a(androidx.compose.ui.e eVar, @NotNull f.c.a mainItem, @NotNull List headerMenuItems, boolean z11, boolean z12, @NotNull Function0 onSearchClickListener, @NotNull Function0 onGoBackClickListener, @NotNull Function0 onClearSearchQueryClicked, @NotNull Function1 onSearchQueryChangedListener, @NotNull Function1 onHeaderMenuButtonClickListener, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(mainItem, "mainItem");
        Intrinsics.checkNotNullParameter(headerMenuItems, "headerMenuItems");
        Intrinsics.checkNotNullParameter(onSearchClickListener, "onSearchClickListener");
        Intrinsics.checkNotNullParameter(onGoBackClickListener, "onGoBackClickListener");
        Intrinsics.checkNotNullParameter(onClearSearchQueryClicked, "onClearSearchQueryClicked");
        Intrinsics.checkNotNullParameter(onSearchQueryChangedListener, "onSearchQueryChangedListener");
        Intrinsics.checkNotNullParameter(onHeaderMenuButtonClickListener, "onHeaderMenuButtonClickListener");
        C3969l u11 = interfaceC3967k.u(-1171174253);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(mainItem) : u11.F(mainItem) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? u11.n(headerMenuItems) : u11.F(headerMenuItems) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.p(z11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.p(z12) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(onSearchClickListener) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.F(onGoBackClickListener) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= u11.F(onClearSearchQueryClicked) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= u11.F(onSearchQueryChangedListener) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i12 |= u11.F(onHeaderMenuButtonClickListener) ? 536870912 : 268435456;
        }
        if ((i12 & 306783379) == 306783378 && u11.b()) {
            u11.j();
        } else {
            ru.ozon.android.messenger.framework.presentation.common.screen.compose.t.a(null, a1.c.c(-616143337, new E(eVar, (Context) u11.m(AndroidCompositionLocals_androidKt.d()), z11, z12, mainItem, onSearchQueryChangedListener, onGoBackClickListener, onClearSearchQueryClicked, headerMenuItems, onSearchClickListener, onHeaderMenuButtonClickListener), u11), u11, 48);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new F(eVar, mainItem, headerMenuItems, z11, z12, onSearchClickListener, onGoBackClickListener, onClearSearchQueryClicked, onSearchQueryChangedListener, onHeaderMenuButtonClickListener, i11));
        }
    }
}
