package ru.ozon.android.messenger.framework.presentation.ai;

import J0.C3326o1;
import S0.C3969l;
import S0.InterfaceC3967k;
import a1.C4912a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.AiMessageActionsDTO;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.core.repository.UniTheme;

/* loaded from: classes10.dex */
public final class P0 {
    public static final void a(androidx.compose.ui.e eVar, @NotNull C3326o1 bottomSheetState, @NotNull AiMessageActionsDTO.SourcesBadge.MenuInfo menuInfo, @NotNull Function2 onMenuItemClick, @NotNull Function1 onMenuItemViewEvent, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(menuInfo, "menuInfo");
        Intrinsics.checkNotNullParameter(onMenuItemClick, "onMenuItemClick");
        Intrinsics.checkNotNullParameter(onMenuItemViewEvent, "onMenuItemViewEvent");
        C3969l u11 = interfaceC3967k.u(329523972);
        int i12 = i11 | (u11.n(eVar) ? 4 : 2) | (u11.F(bottomSheetState) ? 32 : 16) | (u11.n(menuInfo) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.F(onMenuItemClick) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL) | (u11.F(onMenuItemViewEvent) ? 16384 : 8192);
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = Pk0.f.b(S0.Q.j(kotlin.coroutines.g.f71771a, u11), u11);
            }
            xe.M a11 = ((S0.D) C11).a();
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            A0.g d11 = A0.h.d(dsSpacings.m1850getDp24D9Ej5fM(), dsSpacings.m1850getDp24D9Ej5fM(), 0.0f, 0.0f, 12);
            long layerOverlayDimming = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerOverlayDimming();
            C4912a c11 = a1.c.c(1165614614, new N0(eVar, menuInfo, onMenuItemClick, onMenuItemViewEvent, a11, bottomSheetState), u11);
            C4912a c4912a = R0.f89339a;
            androidx.compose.material.I.a(c11, null, bottomSheetState, false, d11, 0.0f, 0L, 0L, layerOverlayDimming, u11, 805306886 | ((i12 << 3) & 896));
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new O0(eVar, bottomSheetState, menuInfo, onMenuItemClick, onMenuItemViewEvent, i11));
        }
    }
}
