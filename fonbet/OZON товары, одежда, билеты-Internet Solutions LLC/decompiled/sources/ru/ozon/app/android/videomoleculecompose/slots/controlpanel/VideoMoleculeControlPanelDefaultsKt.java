package ru.ozon.app.android.videomoleculecompose.slots.controlpanel;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.T0;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.G0;
import S0.InterfaceC3967k;
import S0.J0;
import S0.O;
import T7.E;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.material.Q;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a=\u0010\u0014\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0015\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\" \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/videomoleculecompose/slots/controlpanel/VideoMoleculePlayPauseState;", "state", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function0;", "", "onClick", "VideoMoleculeControlPanelPlayPauseButton", "(Lru/ozon/app/android/videomoleculecompose/slots/controlpanel/VideoMoleculePlayPauseState;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function0;LS0/k;II)V", "", "isFullscreen", "VideoMoleculeControlPanelModeButton", "(ZLandroidx/compose/ui/e;Lkotlin/jvm/functions/Function0;LS0/k;II)V", "enabled", "", "iconRes", "LZ1/h;", "iconSize", "ControlButton-942rkJo", "(ZIFLandroidx/compose/ui/e;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "ControlButton", "ControlButtonSize", "F", "getControlButtonSize", "()F", "LS0/G0;", "LocalControlPanelLandscape", "LS0/G0;", "getLocalControlPanelLandscape", "()LS0/G0;", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculeControlPanelDefaultsKt {
    private static final float ControlButtonSize = 16;

    @NotNull
    private static final G0<Boolean> LocalControlPanelLandscape = new O(VideoMoleculeControlPanelDefaultsKt$LocalControlPanelLandscape$1.INSTANCE);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ControlButton-942rkJo, reason: not valid java name */
    public static final void m1553ControlButton942rkJo(boolean z11, int i11, float f7, e eVar, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i12) {
        int i13;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(-1431374439);
        if ((i12 & 6) == 0) {
            i13 = (u11.p(z11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= u11.r(i11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= u11.q(f7) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 3072) == 0) {
            i13 |= u11.n(eVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 24576) == 0) {
            i13 |= u11.F(function0) ? 16384 : 8192;
        }
        int i14 = i13;
        if ((i14 & 9363) == 9362 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            float f11 = ControlButtonSize;
            e n11 = a0.n(eVar, f11);
            u11.o(1478254976);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                u11.x(C11);
            }
            q qVar = (q) C11;
            u11.k();
            float f12 = f11 / 2;
            UniColors uniColors = UniColors.BG_LIGHT_KEY;
            C7807Z c7807z = TokenParserKt.tokenToColor(uniColors.getToken(), u11, 0);
            e b11 = i.b(n11, qVar, Q.e(false, f12, c7807z != null ? c7807z.w() : C7807Z.f72259m), z11, null, null, function0, 24);
            V f13 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f14 = c.f(u11, b11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f15 = E.f(u11, f13, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f15);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            AbstractC8972b a12 = G1.e.a(i11, u11, (i14 >> 3) & 14);
            e n12 = a0.n(e.f40358c0, f7);
            C7807Z c7807z2 = TokenParserKt.tokenToColor(uniColors.getToken(), u11, 0);
            c3969l = u11;
            T0.a(a12, null, n12, C7807Z.o(z11 ? 1.0f : 0.5f, c7807z2 != null ? c7807z2.w() : C7807Z.f72259m), c3969l, 48);
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new VideoMoleculeControlPanelDefaultsKt$ControlButton$3(z11, i11, f7, eVar, function0, i12));
        }
    }

    public static final void VideoMoleculeControlPanelModeButton(boolean z11, e eVar, @NotNull Function0<Unit> onClick, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function0<Unit> function0;
        e eVar2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(-1943201612);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.p(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(onClick) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            function0 = onClick;
            eVar2 = eVar;
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            e eVar3 = eVar;
            int i15 = i13 << 6;
            m1553ControlButton942rkJo(true, z11 ? R$drawable.ic_s_full_screen_exit : R$drawable.ic_s_full_screen, ControlButtonSize, eVar3, onClick, u11, (i15 & 7168) | 390 | (i15 & 57344));
            function0 = onClick;
            eVar2 = eVar3;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new VideoMoleculeControlPanelDefaultsKt$VideoMoleculeControlPanelModeButton$1(z11, eVar2, function0, i11, i12));
        }
    }

    public static final void VideoMoleculeControlPanelPlayPauseButton(@NotNull VideoMoleculePlayPauseState state, e eVar, @NotNull Function0<Unit> onClick, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function0<Unit> function0;
        e eVar2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(-1780198617);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(onClick) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            function0 = onClick;
            eVar2 = eVar;
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            e eVar3 = eVar;
            int i15 = i13 << 6;
            m1553ControlButton942rkJo(state.getIsEnabled(), state.getShowPlay() ? R$drawable.ic_s_circle_play : R$drawable.ic_s_circle_pause, ControlButtonSize, eVar3, onClick, u11, (i15 & 7168) | 384 | (i15 & 57344));
            function0 = onClick;
            eVar2 = eVar3;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new VideoMoleculeControlPanelDefaultsKt$VideoMoleculeControlPanelPlayPauseButton$1(state, eVar2, function0, i11, i12));
        }
    }

    public static final float getControlButtonSize() {
        return ControlButtonSize;
    }

    @NotNull
    public static final G0<Boolean> getLocalControlPanelLandscape() {
        return LocalControlPanelLandscape;
    }
}
