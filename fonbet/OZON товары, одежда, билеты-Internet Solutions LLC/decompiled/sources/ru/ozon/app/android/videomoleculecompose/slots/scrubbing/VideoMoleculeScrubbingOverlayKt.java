package ru.ozon.app.android.videomoleculecompose.slots.scrubbing;

import A0.h;
import B0.C2510t;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import P1.F;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.C7811b0;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0003\u0010\u0002\u001a/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LK1/T;", "currentTimeStyle", "(LS0/k;I)LK1/T;", "durationTimeStyle", "", "currentTimeText", "durationText", "", "isCompact", "isLandscape", "", "VideoMoleculeScrubbingOverlay", "(Ljava/lang/String;Ljava/lang/String;ZZLS0/k;I)V", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculeScrubbingOverlayKt {
    public static final void VideoMoleculeScrubbingOverlay(@NotNull String currentTimeText, @NotNull String durationText, boolean z11, boolean z12, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        Intrinsics.checkNotNullParameter(currentTimeText, "currentTimeText");
        Intrinsics.checkNotNullParameter(durationText, "durationText");
        C3969l u11 = interfaceC3967k.u(-322591896);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(currentTimeText) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(durationText) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.p(z12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            float f7 = z11 ? 36 : z12 ? 83 : 88;
            e.a aVar = e.f40358c0;
            e d11 = a0.d(aVar);
            C7807Z c7807z = TokenParserKt.tokenToColor(UniColors.LAYER_OVERLAY_DIMMING.getToken(), u11, 0);
            b11 = androidx.compose.foundation.e.b(d11, c7807z != null ? c7807z.w() : C7807Z.f72259m, y0.a());
            V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d12 = u11.d();
            e f12 = c.f(u11, b11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f13 = E.f(u11, f11, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f13);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            e j11 = T.j(C5187j.f39515a.a(aVar, InterfaceC6250b.a.b()), 0.0f, 0.0f, 0.0f, f7, 7);
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I12 = u11.I();
            A0 d13 = u11.d();
            e f14 = c.f(u11, j11);
            Function0 a12 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b12, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, h11);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            int i13 = i12;
            C2510t.b(currentTimeText, null, currentTimeStyle(u11, 0), null, 0, false, 1, 0, null, u11, (i12 & 14) | 1572864, 442);
            e n11 = a0.n(T.h(aVar, 12, 0.0f, 2), 8);
            C7807Z c7807z2 = TokenParserKt.tokenToColor(UniColors.TEXT_LIGHT_KEY.getToken(), u11, 0);
            C5185h.a(androidx.compose.foundation.e.b(n11, c7807z2 != null ? c7807z2.w() : C7807Z.f72251e, h.e()), u11, 0);
            C2510t.b(durationText, null, durationTimeStyle(u11, 0), null, 0, false, 1, 0, null, u11, ((i13 >> 3) & 14) | 1572864, 442);
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new VideoMoleculeScrubbingOverlayKt$VideoMoleculeScrubbingOverlay$2(currentTimeText, durationText, z11, z12, i11));
        }
    }

    private static final K1.T currentTimeStyle(InterfaceC3967k interfaceC3967k, int i11) {
        F f7;
        interfaceC3967k.o(1342512987);
        C7807Z c7807z = TokenParserKt.tokenToColor(UniColors.TEXT_LIGHT_KEY.getToken(), interfaceC3967k, 0);
        long w11 = c7807z != null ? c7807z.w() : C7807Z.f72251e;
        long d11 = Hj0.T.d(38);
        f7 = F.f21512j;
        K1.T t2 = new K1.T(w11, d11, f7, null, Hj0.T.c(0.01d), 0, 0L, null, 0, 16777080);
        interfaceC3967k.k();
        return t2;
    }

    private static final K1.T durationTimeStyle(InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(-107001212);
        K1.T c11 = K1.T.c(currentTimeStyle(interfaceC3967k, 0), C7811b0.b(Integer.MAX_VALUE), 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214);
        interfaceC3967k.k();
        return c11;
    }
}
