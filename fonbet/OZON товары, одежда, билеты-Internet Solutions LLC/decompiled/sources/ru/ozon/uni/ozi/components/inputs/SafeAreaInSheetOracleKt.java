package ru.ozon.uni.ozi.components.inputs;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import Z1.d;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.c;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.platform.K0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.components.sheet.BasicSheetKt;
import ru.ozon.uni.ozi.components.sheet.OziBottomSheetInfo;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\n\u001a\u00020\t*\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/ozi/components/inputs/SafeAreaInSheetOracleState;", "rememberSafeAreaInSheetOracleState", "(LS0/k;I)Lru/ozon/uni/ozi/components/inputs/SafeAreaInSheetOracleState;", "state", "", "isFocused", "", "SafeAreaInSheetOracle", "(Lru/ozon/uni/ozi/components/inputs/SafeAreaInSheetOracleState;ZLS0/k;I)V", "Landroidx/compose/ui/e;", "safeAreaInSheetOracle", "(Landroidx/compose/ui/e;Lru/ozon/uni/ozi/components/inputs/SafeAreaInSheetOracleState;)Landroidx/compose/ui/e;", "LZ1/h;", "BottomPadding", "F", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SafeAreaInSheetOracleKt {
    private static final float BottomPadding = 10;

    public static final void SafeAreaInSheetOracle(SafeAreaInSheetOracleState safeAreaInSheetOracleState, boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(1152670411);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(safeAreaInSheetOracleState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (safeAreaInSheetOracleState == null) {
                J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new SafeAreaInSheetOracleKt$SafeAreaInSheetOracle$1(safeAreaInSheetOracleState, z11, i11));
                    return;
                }
                return;
            }
            float v12 = ((d) u11.m(K0.e())).v1(BottomPadding);
            OziBottomSheetInfo oziBottomSheetInfo = (OziBottomSheetInfo) u11.m(BasicSheetKt.getLocalOziBottomSheetInfo());
            boolean z12 = oziBottomSheetInfo != null && oziBottomSheetInfo.isKeyboardOpened$uni_release() && z11;
            Boolean valueOf = Boolean.valueOf(z12);
            u11.o(-154066198);
            boolean p11 = u11.p(z12) | ((i12 & 14) == 4) | u11.q(v12);
            Object C11 = u11.C();
            if (p11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new SafeAreaInSheetOracleKt$SafeAreaInSheetOracle$2$1(z12, safeAreaInSheetOracleState, v12, null);
                u11.x(C11);
            }
            u11.k();
            Q.e(u11, valueOf, (Function2) C11);
        }
        J0 m03 = u11.m0();
        if (m03 != null) {
            m03.G(new SafeAreaInSheetOracleKt$SafeAreaInSheetOracle$3(safeAreaInSheetOracleState, z11, i11));
        }
    }

    public static final SafeAreaInSheetOracleState rememberSafeAreaInSheetOracleState(InterfaceC3967k interfaceC3967k, int i11) {
        SafeAreaInSheetOracleState safeAreaInSheetOracleState;
        interfaceC3967k.o(2084127655);
        if (((OziBottomSheetInfo) interfaceC3967k.m(BasicSheetKt.getLocalOziBottomSheetInfo())) != null) {
            interfaceC3967k.o(-1363109827);
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new SafeAreaInSheetOracleState();
                interfaceC3967k.x(C11);
            }
            safeAreaInSheetOracleState = (SafeAreaInSheetOracleState) C11;
            interfaceC3967k.k();
        } else {
            safeAreaInSheetOracleState = null;
        }
        interfaceC3967k.k();
        return safeAreaInSheetOracleState;
    }

    @NotNull
    public static final e safeAreaInSheetOracle(@NotNull e eVar, SafeAreaInSheetOracleState safeAreaInSheetOracleState) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return safeAreaInSheetOracleState != null ? c.a(g.a(androidx.compose.foundation.relocation.c.b(eVar, safeAreaInSheetOracleState.getRequester()), new SafeAreaInSheetOracleKt$safeAreaInSheetOracle$4(safeAreaInSheetOracleState)), new SafeAreaInSheetOracleKt$safeAreaInSheetOracle$5(safeAreaInSheetOracleState)) : eVar;
    }
}
