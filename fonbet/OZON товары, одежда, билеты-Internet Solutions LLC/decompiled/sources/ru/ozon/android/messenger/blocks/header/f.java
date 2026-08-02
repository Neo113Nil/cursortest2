package ru.ozon.android.messenger.blocks.header;

import B1.InterfaceC2547p;
import B1.V;
import D1.InterfaceC2801g;
import K1.T;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconKt;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconStyle;
import ru.ozon.uni.android.ds.compose.component.image.DsImageKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.core.repository.UniThemeKt;

/* loaded from: classes10.dex */
public final class f {
    public static final void a(@NotNull IconDTO iconDTO, e.a aVar, Icon icon, String str, float f7, float f11, float f12, float f13, long j11, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        String str2;
        e.a aVar2;
        float f14;
        float f15;
        float f16;
        float f17;
        long layerOverlayParanja;
        C3969l c3969l;
        float f18;
        long j12;
        float f19;
        float f21;
        float f22;
        e.a aVar3;
        Intrinsics.checkNotNullParameter(iconDTO, "iconDTO");
        C3969l u11 = interfaceC3967k.u(534403190);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(iconDTO) : u11.F(iconDTO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i13 = i12 | 48;
        if ((i11 & 384) == 0) {
            i13 |= (i11 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? u11.n(icon) : u11.F(icon) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            str2 = str;
            i13 |= u11.n(str2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            str2 = str;
        }
        int i14 = 14376960 | i13;
        if ((100663296 & i11) == 0) {
            i14 = 47931392 | i13;
        }
        if ((38347923 & i14) == 38347922 && u11.b()) {
            u11.j();
            aVar3 = aVar;
            f19 = f7;
            f18 = f11;
            f21 = f12;
            f22 = f13;
            j12 = j11;
            c3969l = u11;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                aVar2 = androidx.compose.ui.e.f40358c0;
                f14 = 2;
                f15 = 44;
                f16 = 14;
                f17 = 6;
                layerOverlayParanja = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerOverlayParanja();
            } else {
                u11.j();
                aVar2 = aVar;
                f15 = f7;
                f16 = f11;
                f17 = f12;
                f14 = f13;
                layerOverlayParanja = j11;
            }
            u11.j0();
            Z1.d dVar = (Z1.d) u11.m(K0.e());
            IconDTO.IconSize size = iconDTO.getSize();
            if (size == null) {
                size = IconDTO.IconSize.SIZE_500;
            }
            float cornerRadius = iconDTO.getShape() == IconDTO.IconShape.SQUIRCLE ? size.getCornerRadius() : 0;
            c3969l = u11;
            UniThemeKt.UniTheme(false, a1.c.c(-1928249347, new c(aVar2, f15, dVar.v1(cornerRadius), dVar.v1(f16), dVar.v1(f17), layerOverlayParanja, cornerRadius, iconDTO, f16, f17, f14, icon, str2), c3969l), c3969l, 48, 1);
            long j13 = layerOverlayParanja;
            f18 = f16;
            j12 = j13;
            f19 = f15;
            f21 = f17;
            f22 = f14;
            aVar3 = aVar2;
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new d(iconDTO, aVar3, icon, str, f19, f18, f21, f22, j12, i11));
        }
    }

    public static final void b(float f7, float f11, float f12, Icon icon, String str, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        long j11;
        long j12;
        long j13;
        T t2;
        C5187j c5187j = C5187j.f39515a;
        C3969l u11 = interfaceC3967k.u(-705872428);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(c5187j) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.q(f7) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.q(f11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.q(f12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= (32768 & i11) == 0 ? u11.n(icon) : u11.F(icon) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.n(str) ? 131072 : 65536;
        }
        if ((74899 & i12) == 74898 && u11.b()) {
            u11.j();
        } else {
            float f13 = f7 - f12;
            androidx.compose.ui.e a11 = c5187j.a(C6988h.a(a0.n(androidx.compose.ui.e.f40358c0, f13), A0.h.b(f11 - f12)), InterfaceC6250b.a.c());
            V f14 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f15 = androidx.compose.ui.c.f(u11, a11);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f16 = E.f(u11, f14, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f16);
            }
            F1.b(u11, f15, InterfaceC2801g.a.f());
            if (str != null) {
                u11.o(-2139936401);
                DsImageKt.m1720DsImageA8mMYrQ(ru.ozon.pikazon.compose.painter.f.a(str, null, null, null, u11, (i12 >> 15) & 14, 14), null, false, 0.0f, 0L, InterfaceC2547p.a.d(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, u11, 196608, 0, 2014);
                u11 = u11;
                u11.k();
            } else if (icon != null) {
                u11.o(-2139695903);
                AbstractC8972b abstractC8972b = TokenParserKt.tokenToIcon(icon.getImage(), u11, 0);
                InterfaceC2547p.a.d d12 = InterfaceC2547p.a.d();
                C7807Z c7807z = TokenParserKt.tokenToColor(icon.getTintColor(), u11, 0);
                j11 = C7807Z.f72259m;
                j12 = C7807Z.f72259m;
                j13 = C7807Z.f72259m;
                l1.K0 k02 = new l1.K0(j13);
                t2 = T.f15012d;
                DsIconKt.DsIcon(new DsIconStyle(d12, c7807z, j11, C7807Z.m(j12), k02, t2, 0, f13, f13, Float.NaN, (AbstractC7799Q) null, (DefaultConstructorMarker) null), null, null, abstractC8972b, null, false, false, null, u11, DsIconStyle.$stable, 246);
                u11 = u11;
                u11.k();
            } else {
                u11.o(-2138909495);
                u11.k();
            }
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new e(f7, f11, f12, icon, str, i11));
        }
    }
}
