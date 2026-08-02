package ru.ozon.app.android.videomoleculecompose.slots.gradient;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import android.content.res.Configuration;
import androidx.compose.foundation.e;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniGradientToken;
import ru.ozon.uni.core.repository.UniTheme;
import u0.InterfaceC9893b;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\n\u001a\u00020\u0002*\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\f\u001a\u00020\u0002*\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u000b\u0010\t\"\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "", "VideoMoleculeGradientOverlay", "(Landroidx/compose/ui/e;LS0/k;II)V", "Lu0/b;", "LZ1/h;", "height", "TopGradient-rAjV9yQ", "(Lu0/b;FLS0/k;II)V", "TopGradient", "BottomGradient-rAjV9yQ", "BottomGradient", "TopGradientHeight", "F", "PortraitBottomGradientHeight", "LandscapeBottomGradientHeight", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculeGradientOverlayKt {
    private static final float TopGradientHeight = 124;
    private static final float PortraitBottomGradientHeight = 242;
    private static final float LandscapeBottomGradientHeight = 118;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomGradient-rAjV9yQ, reason: not valid java name */
    public static final void m1555BottomGradientrAjV9yQ(InterfaceC9893b interfaceC9893b, float f7, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(-2116601862);
        if ((Integer.MIN_VALUE & i12) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(interfaceC9893b) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.q(f7) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                f7 = PortraitBottomGradientHeight;
            }
            C5185h.a(e.a(a0.f(a0.e(interfaceC9893b.a(androidx.compose.ui.e.f40358c0, InterfaceC6250b.a.b()), 1.0f), f7), TokensExtKt.getGradient(UniTheme.INSTANCE.getGradients().getGrOverlayPrimary(), u11, UniGradientToken.$stable), null, 6), u11, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new VideoMoleculeGradientOverlayKt$BottomGradient$1(interfaceC9893b, f7, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TopGradient-rAjV9yQ, reason: not valid java name */
    public static final void m1556TopGradientrAjV9yQ(InterfaceC9893b interfaceC9893b, float f7, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(-827872034);
        if ((Integer.MIN_VALUE & i12) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(interfaceC9893b) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.q(f7) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                f7 = TopGradientHeight;
            }
            C5185h.a(e.a(a0.f(a0.e(interfaceC9893b.a(androidx.compose.ui.e.f40358c0, InterfaceC6250b.a.m()), 1.0f), f7), TokensExtKt.getGradient(UniTheme.INSTANCE.getGradients().getGrOverlayTertiaryReversed(), u11, UniGradientToken.$stable), null, 6), u11, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new VideoMoleculeGradientOverlayKt$TopGradient$1(interfaceC9893b, f7, i11, i12));
        }
    }

    public static final void VideoMoleculeGradientOverlay(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(1348248394);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i13 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = androidx.compose.ui.e.f40358c0;
            }
            boolean z11 = ((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())).orientation == 2;
            androidx.compose.ui.e d11 = a0.d(eVar);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d12 = u11.d();
            androidx.compose.ui.e f11 = c.f(u11, d11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C5187j c5187j = C5187j.f39515a;
            if (z11) {
                u11.o(-2015777463);
                m1555BottomGradientrAjV9yQ(c5187j, LandscapeBottomGradientHeight, u11, 54, 0);
                u11.k();
            } else {
                u11.o(-2015693360);
                m1556TopGradientrAjV9yQ(c5187j, 0.0f, u11, 6, 1);
                m1555BottomGradientrAjV9yQ(c5187j, PortraitBottomGradientHeight, u11, 54, 0);
                u11.k();
            }
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new VideoMoleculeGradientOverlayKt$VideoMoleculeGradientOverlay$2(eVar, i11, i12));
        }
    }
}
