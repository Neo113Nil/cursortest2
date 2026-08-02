package ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.vertical;

import B1.V;
import D1.InterfaceC2801g;
import J0.I1;
import Pk0.f;
import Pk0.h;
import S0.A0;
import S0.C3969l;
import S0.D;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import T7.E;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.di.PlayerShowcaseComponent;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.BasePlayerComposableController;
import ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerController;
import xe.M;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0016²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00108\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/vertical/PlayerShowcaseVerticalVI;", "item", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/di/PlayerShowcaseComponent;", "component", "Landroidx/compose/ui/e;", "modifier", "", "PlayerShowcaseVerticalComposable", "(Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/vertical/PlayerShowcaseVerticalVI;Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/di/PlayerShowcaseComponent;Landroidx/compose/ui/e;LS0/k;II)V", "", "isVisible", "PlayerCell", "(Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/vertical/PlayerShowcaseVerticalVI;ZLru/ozon/app/android/monetization/widgets/playerShowCase/v1/di/PlayerShowcaseComponent;LS0/k;I)V", "ShowPreview", "(LS0/k;I)V", "ShowLoader", "Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerController;", "playerController", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "currentListener", "showLoader", "showPreview", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PlayerShowcaseVerticalComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlayerCell(PlayerShowcaseVerticalVI playerShowcaseVerticalVI, boolean z11, PlayerShowcaseComponent playerShowcaseComponent, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Object playerShowcaseVerticalComposableKt$PlayerCell$startPlaying$1$1;
        PlayerShowcaseVerticalVI playerShowcaseVerticalVI2;
        InterfaceC3978p0 interfaceC3978p0;
        InterfaceC3978p0 interfaceC3978p02;
        Object playerShowcaseVerticalComposableKt$PlayerCell$stopPlaying$1$1;
        InterfaceC3978p0 interfaceC3978p03;
        Function1 function1;
        InterfaceC3978p0 interfaceC3978p04;
        InterfaceC3978p0 interfaceC3978p05;
        Object playerShowcaseVerticalComposableKt$PlayerCell$1$1;
        Boolean bool;
        String str;
        boolean z12;
        C3969l u11 = interfaceC3967k.u(-466199364);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(playerShowcaseVerticalVI) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(playerShowcaseComponent) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i13 = i12;
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            playerShowcaseVerticalVI2 = playerShowcaseVerticalVI;
            z12 = z11;
        } else {
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = f.b(Q.j(g.f71771a, u11), u11);
            }
            M a11 = ((D) C11).a();
            u11.o(760555569);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = n1.f(null, D1.f25195a);
                u11.x(C12);
            }
            InterfaceC3978p0 interfaceC3978p06 = (InterfaceC3978p0) C12;
            Object b11 = h.b(u11, 760558261);
            if (b11 == InterfaceC3967k.a.a()) {
                b11 = n1.f(null, D1.f25195a);
                u11.x(b11);
            }
            InterfaceC3978p0 interfaceC3978p07 = (InterfaceC3978p0) b11;
            Object b12 = h.b(u11, 760560923);
            if (b12 == InterfaceC3967k.a.a()) {
                b12 = n1.f(Boolean.FALSE, D1.f25195a);
                u11.x(b12);
            }
            InterfaceC3978p0 interfaceC3978p08 = (InterfaceC3978p0) b12;
            Object b13 = h.b(u11, 760562778);
            if (b13 == InterfaceC3967k.a.a()) {
                b13 = n1.f(Boolean.TRUE, D1.f25195a);
                u11.x(b13);
            }
            InterfaceC3978p0 interfaceC3978p09 = (InterfaceC3978p0) b13;
            u11.k();
            u11.o(760565535);
            boolean F11 = ((i13 & 14) == 4) | u11.F(playerShowcaseComponent);
            Object C13 = u11.C();
            if (F11 || C13 == InterfaceC3967k.a.a()) {
                playerShowcaseVerticalComposableKt$PlayerCell$startPlaying$1$1 = new PlayerShowcaseVerticalComposableKt$PlayerCell$startPlaying$1$1(playerShowcaseVerticalVI, playerShowcaseComponent, interfaceC3978p09, interfaceC3978p08, interfaceC3978p07);
                playerShowcaseVerticalVI2 = playerShowcaseVerticalVI;
                interfaceC3978p0 = interfaceC3978p09;
                interfaceC3978p02 = interfaceC3978p07;
                u11.x(playerShowcaseVerticalComposableKt$PlayerCell$startPlaying$1$1);
            } else {
                interfaceC3978p0 = interfaceC3978p09;
                playerShowcaseVerticalComposableKt$PlayerCell$startPlaying$1$1 = C13;
                playerShowcaseVerticalVI2 = playerShowcaseVerticalVI;
                interfaceC3978p02 = interfaceC3978p07;
            }
            Function1 function12 = (Function1) playerShowcaseVerticalComposableKt$PlayerCell$startPlaying$1$1;
            u11.k();
            u11.o(760595747);
            boolean F12 = u11.F(playerShowcaseComponent);
            Object C14 = u11.C();
            if (F12 || C14 == InterfaceC3967k.a.a()) {
                InterfaceC3978p0 interfaceC3978p010 = interfaceC3978p0;
                interfaceC3978p03 = interfaceC3978p06;
                function1 = function12;
                playerShowcaseVerticalComposableKt$PlayerCell$stopPlaying$1$1 = new PlayerShowcaseVerticalComposableKt$PlayerCell$stopPlaying$1$1(interfaceC3978p03, playerShowcaseComponent, interfaceC3978p02, interfaceC3978p010, interfaceC3978p08);
                interfaceC3978p04 = interfaceC3978p010;
                interfaceC3978p05 = interfaceC3978p08;
                u11.x(playerShowcaseVerticalComposableKt$PlayerCell$stopPlaying$1$1);
            } else {
                interfaceC3978p04 = interfaceC3978p0;
                interfaceC3978p03 = interfaceC3978p06;
                function1 = function12;
                playerShowcaseVerticalComposableKt$PlayerCell$stopPlaying$1$1 = C14;
                interfaceC3978p05 = interfaceC3978p08;
            }
            Function0 function0 = (Function0) playerShowcaseVerticalComposableKt$PlayerCell$stopPlaying$1$1;
            u11.k();
            Boolean valueOf = Boolean.valueOf(z11);
            String videoUrl = playerShowcaseVerticalVI2.getVideoUrl();
            u11.o(760615792);
            boolean F13 = u11.F(a11) | u11.F(playerShowcaseComponent) | ((i13 & 112) == 32) | u11.n(function1) | u11.n(function0);
            Object C15 = u11.C();
            if (F13 || C15 == InterfaceC3967k.a.a()) {
                InterfaceC3978p0 interfaceC3978p011 = interfaceC3978p03;
                bool = valueOf;
                str = videoUrl;
                z12 = z11;
                playerShowcaseVerticalComposableKt$PlayerCell$1$1 = new PlayerShowcaseVerticalComposableKt$PlayerCell$1$1(a11, playerShowcaseComponent, z12, function1, interfaceC3978p011, function0);
                interfaceC3978p03 = interfaceC3978p011;
                u11.x(playerShowcaseVerticalComposableKt$PlayerCell$1$1);
            } else {
                str = videoUrl;
                playerShowcaseVerticalComposableKt$PlayerCell$1$1 = C15;
                bool = valueOf;
                z12 = z11;
            }
            u11.k();
            Q.b(bool, str, (Function1) playerShowcaseVerticalComposableKt$PlayerCell$1$1, u11);
            e eVar = e.f40358c0;
            e d11 = a0.d(eVar);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d12 = u11.d();
            e f11 = androidx.compose.ui.c.f(u11, d11);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            PoolPlayerController PlayerCell$lambda$6 = PlayerCell$lambda$6(interfaceC3978p03);
            BasePlayerComposableController playerComposableController = PlayerCell$lambda$6 != null ? PlayerCell$lambda$6.playerComposableController() : null;
            u11.o(-1700564324);
            if (playerComposableController != null) {
                playerComposableController.PlayerSurfaceComposable(eVar, 1, u11, 54);
            }
            u11.k();
            u11.o(-1700559890);
            if (PlayerCell$lambda$15(interfaceC3978p04)) {
                ShowPreview(u11, 0);
            }
            u11.k();
            u11.o(-1700557876);
            if (PlayerCell$lambda$12(interfaceC3978p05)) {
                ShowLoader(u11, 0);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PlayerShowcaseVerticalComposableKt$PlayerCell$3(playerShowcaseVerticalVI2, z12, playerShowcaseComponent, i11));
        }
    }

    private static final boolean PlayerCell$lambda$12(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlayerCell$lambda$13(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    private static final boolean PlayerCell$lambda$15(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlayerCell$lambda$16(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PoolPlayerController PlayerCell$lambda$6(InterfaceC3978p0<PoolPlayerController> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerListenersContainer PlayerCell$lambda$9(InterfaceC3978p0<PlayerListenersContainer> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    public static final void PlayerShowcaseVerticalComposable(@NotNull PlayerShowcaseVerticalVI item, @NotNull PlayerShowcaseComponent component, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(component, "component");
        C3969l u11 = interfaceC3967k.u(1362749257);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(item) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(component) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            u11.o(-1512082871);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(Boolean.FALSE, D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            u11.k();
            float f7 = 100;
            e g10 = T.g(a0.f(a0.e(eVar, 1.0f), f7), f7, 12);
            u11.o(-1512075710);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = new PlayerShowcaseVerticalComposableKt$PlayerShowcaseVerticalComposable$1$1(interfaceC3978p0);
                u11.x(C12);
            }
            u11.k();
            e b11 = ru.ozon.composer.compose.widget.scrollable.f.b(g10, (Function1) C12);
            V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = androidx.compose.ui.c.f(u11, b11);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f13 = E.f(u11, f11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f13);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            PlayerCell(item, PlayerShowcaseVerticalComposable$lambda$1(interfaceC3978p0), component, u11, ((i13 << 3) & 896) | (i13 & 14));
            u11.f();
        }
        e eVar2 = eVar;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PlayerShowcaseVerticalComposableKt$PlayerShowcaseVerticalComposable$3(item, component, eVar2, i11, i12));
        }
    }

    private static final boolean PlayerShowcaseVerticalComposable$lambda$1(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlayerShowcaseVerticalComposable$lambda$2(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ShowLoader(InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(-493871329);
        if (i11 == 0 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            e d11 = a0.d(aVar);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d12 = u11.d();
            e f11 = androidx.compose.ui.c.f(u11, d11);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            I1.a(C5187j.f39515a.a(a0.n(aVar, 60), InterfaceC6250b.a.e()), 0L, 0.0f, 0L, 0, u11, 0, 30);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PlayerShowcaseVerticalComposableKt$ShowLoader$2(i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ShowPreview(InterfaceC3967k interfaceC3967k, int i11) {
        long j11;
        e b11;
        C3969l u11 = interfaceC3967k.u(1527850910);
        if (i11 == 0 && u11.b()) {
            u11.j();
        } else {
            e d11 = a0.d(e.f40358c0);
            j11 = C7807Z.f72254h;
            b11 = androidx.compose.foundation.e.b(d11, j11, y0.a());
            C5185h.a(b11, u11, 6);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PlayerShowcaseVerticalComposableKt$ShowPreview$1(i11));
        }
    }
}
