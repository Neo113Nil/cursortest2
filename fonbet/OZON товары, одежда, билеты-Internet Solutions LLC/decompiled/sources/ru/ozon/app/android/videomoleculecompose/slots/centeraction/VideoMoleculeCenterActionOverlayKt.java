package ru.ozon.app.android.videomoleculecompose.slots.centeraction;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.T0;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import T7.E;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
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
import l1.C7811b0;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import x1.L;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a/\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lru/ozon/app/android/videomoleculecompose/slots/centeraction/VideoMoleculeCenterActionState;", "state", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function0;", "", "onClick", "VideoMoleculeCenterActionOverlay", "(Lru/ozon/app/android/videomoleculecompose/slots/centeraction/VideoMoleculeCenterActionState;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function0;LS0/k;II)V", "ReplayAction", "(Lru/ozon/app/android/videomoleculecompose/slots/centeraction/VideoMoleculeCenterActionState;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "CenterActionButton", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculeCenterActionOverlayKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoMoleculeCenterAction.values().length];
            try {
                iArr[VideoMoleculeCenterAction.Play.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoMoleculeCenterAction.Replay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CenterActionButton(VideoMoleculeCenterActionState videoMoleculeCenterActionState, e eVar, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        int i13;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(-2058874747);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(videoMoleculeCenterActionState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function0) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            e b11 = i.b(androidx.compose.foundation.e.b(a0.n(eVar, videoMoleculeCenterActionState.getAction() == VideoMoleculeCenterAction.Replay ? 80 : 72), C7811b0.c(2147483648L), h.e()), null, null, false, null, null, function0, 28);
            V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, b11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            int i14 = WhenMappings.$EnumSwitchMapping$0[videoMoleculeCenterActionState.getAction().ordinal()];
            if (i14 == 1) {
                i13 = R$drawable.ic_m_play_sign_filled;
            } else {
                if (i14 != 2) {
                    throw new o();
                }
                i13 = R$drawable.ic_m_rotate_left_filled;
            }
            AbstractC8972b a12 = G1.e.a(i13, u11, 0);
            e n11 = a0.n(e.f40358c0, 24);
            C7807Z c7807z = TokenParserKt.tokenToColor(UniColors.BG_LIGHT_KEY.getToken(), u11, 0);
            c3969l = u11;
            T0.a(a12, null, n11, c7807z != null ? c7807z.w() : C7807Z.f72259m, c3969l, 432);
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new VideoMoleculeCenterActionOverlayKt$CenterActionButton$2(videoMoleculeCenterActionState, eVar, function0, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ReplayAction(VideoMoleculeCenterActionState videoMoleculeCenterActionState, e eVar, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        C3969l u11 = interfaceC3967k.u(-2119198203);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(videoMoleculeCenterActionState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function0) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            e d11 = a0.d(eVar);
            C7807Z c7807z = TokenParserKt.tokenToColor(UniColors.LAYER_OVERLAY_DIMMING.getToken(), u11, 0);
            b11 = androidx.compose.foundation.e.b(d11, c7807z != null ? c7807z.w() : C7807Z.f72259m, y0.a());
            Unit unit = Unit.f71690a;
            u11.o(1270022057);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new VideoMoleculeCenterActionOverlayKt$ReplayAction$1$1(null);
                u11.x(C11);
            }
            u11.k();
            e b12 = L.b(b11, unit, (Function2) C11);
            V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = u11.I();
            A0 d12 = u11.d();
            e f11 = c.f(u11, b12);
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
            CenterActionButton(videoMoleculeCenterActionState, e.f40358c0, function0, u11, (i12 & 896) | (i12 & 14) | 48);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new VideoMoleculeCenterActionOverlayKt$ReplayAction$3(videoMoleculeCenterActionState, eVar, function0, i11));
        }
    }

    public static final void VideoMoleculeCenterActionOverlay(@NotNull VideoMoleculeCenterActionState state, e eVar, @NotNull Function0<Unit> onClick, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(1592594188);
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
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            int i15 = WhenMappings.$EnumSwitchMapping$0[state.getAction().ordinal()];
            if (i15 == 1) {
                u11.o(456868873);
                e d11 = a0.d(eVar);
                V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
                int I11 = u11.I();
                A0 d12 = u11.d();
                e f11 = c.f(u11, d11);
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
                CenterActionButton(state, e.f40358c0, onClick, u11, (i13 & 896) | (i13 & 14) | 48);
                u11.f();
                u11.k();
            } else {
                if (i15 != 2) {
                    u11.o(456866711);
                    u11.k();
                    throw new o();
                }
                u11.o(456880376);
                ReplayAction(state, eVar, onClick, u11, i13 & 1022);
                u11.k();
            }
        }
        e eVar2 = eVar;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new VideoMoleculeCenterActionOverlayKt$VideoMoleculeCenterActionOverlay$2(state, eVar2, onClick, i11, i12));
        }
    }
}
