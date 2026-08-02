package ru.ozon.android.messenger.blocks.header;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import a1.C4912a;
import android.content.Context;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.K0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.header.ChatHeaderDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.compose.theme.SelectThemeKt;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.core.repository.UniThemeKt;

/* loaded from: classes10.dex */
public final class l {
    public static final void a(e.a aVar, @NotNull IconDTO iconDTO, ChatHeaderDTO.a aVar2, float f7, float f11, long j11, long j12, InterfaceC3967k interfaceC3967k, int i11) {
        ChatHeaderDTO.a aVar3;
        e.a aVar4;
        float f12;
        long layerOverlayParanja;
        float f13;
        long graphicPositivePrimary;
        e.a aVar5;
        C3969l c3969l;
        long j13;
        float f14;
        long j14;
        float f15;
        Intrinsics.checkNotNullParameter(iconDTO, "iconDTO");
        C3969l u11 = interfaceC3967k.u(-1052880214);
        int i12 = i11 | 6;
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(iconDTO) : u11.F(iconDTO) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            aVar3 = aVar2;
            i12 |= u11.n(aVar3) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            aVar3 = aVar2;
        }
        int i13 = i12 | 27648;
        if ((196608 & i11) == 0) {
            i13 = 93184 | i12;
        }
        if ((1572864 & i11) == 0) {
            i13 |= 524288;
        }
        if ((599187 & i13) == 599186 && u11.b()) {
            u11.j();
            f15 = f7;
            f14 = f11;
            j13 = j11;
            j14 = j12;
            c3969l = u11;
            aVar5 = aVar;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                aVar4 = androidx.compose.ui.e.f40358c0;
                f12 = 44;
                UniTheme uniTheme = UniTheme.INSTANCE;
                int i14 = UniTheme.$stable;
                layerOverlayParanja = uniTheme.getColors(u11, i14).getLayerOverlayParanja();
                f13 = 8;
                graphicPositivePrimary = uniTheme.getColors(u11, i14).getGraphicPositivePrimary();
            } else {
                u11.j();
                aVar4 = aVar;
                f12 = f7;
                f13 = f11;
                layerOverlayParanja = j11;
                graphicPositivePrimary = j12;
            }
            u11.j0();
            Z1.d dVar = (Z1.d) u11.m(K0.e());
            Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            IconDTO.IconSize size = iconDTO.getSize();
            if (size == null) {
                size = IconDTO.IconSize.SIZE_500;
            }
            float cornerRadius = size.getCornerRadius();
            float f16 = 4;
            float f17 = f13 / f16;
            long j15 = layerOverlayParanja;
            float v12 = dVar.v1(f17);
            float v13 = dVar.v1(f16);
            float v14 = dVar.v1(f13) / 2.0f;
            aVar5 = aVar4;
            float f18 = f12;
            b(ru.ozon.android.messenger.utils.h.b(context), a1.c.c(447058419, new i(aVar5, f18, aVar3, j15, dVar.v1(cornerRadius), dVar.v1(f17) + v14, v14, v12, v13, cornerRadius, iconDTO, f13, f17, f16, graphicPositivePrimary), u11), u11, 48);
            c3969l = u11;
            j13 = j15;
            f14 = f13;
            j14 = graphicPositivePrimary;
            f15 = f18;
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new j(aVar5, iconDTO, aVar2, f15, f14, j13, j14, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(boolean z11, C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-1845800442);
        if ((i11 & 6) == 0) {
            i12 = (u11.p(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(c4912a) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else if (z11) {
            u11.o(2100455997);
            SelectThemeKt.SelectTheme(false, c4912a, u11, i12 & 112, 1);
            u11.k();
        } else {
            u11.o(2100507488);
            UniThemeKt.UniTheme(false, c4912a, u11, i12 & 112, 1);
            u11.k();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new k(z11, c4912a, i11));
        }
    }
}
