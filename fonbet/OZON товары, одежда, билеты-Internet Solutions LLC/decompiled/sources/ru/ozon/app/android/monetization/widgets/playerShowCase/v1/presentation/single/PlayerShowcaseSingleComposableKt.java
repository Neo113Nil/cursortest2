package ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.single;

import An.b;
import B1.InterfaceC2547p;
import B1.V;
import B90.F;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.I1;
import S0.A0;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import Sc.o;
import T7.E;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.data.PlayerShowcaseDTO;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.di.PlayerShowcaseComponent;
import ru.ozon.app.android.video.manager.ExoManager;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.SingleInstancePlayerController;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.nestedControllers.SingleInstanceMediaPlayController;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.composer.compose.widget.scrollable.f;
import z4.C10981b;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a1\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0012²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/single/PlayerShowcaseSingleVI;", "item", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/di/PlayerShowcaseComponent;", "component", "Landroidx/compose/ui/e;", "modifier", "", "PlayerShowcaseSingleComposable", "(Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/single/PlayerShowcaseSingleVI;Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/di/PlayerShowcaseComponent;Landroidx/compose/ui/e;LS0/k;II)V", "", "shouldResume", "PlayerCell", "(Landroidx/compose/ui/e;Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/single/PlayerShowcaseSingleVI;Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/di/PlayerShowcaseComponent;ZLS0/k;II)V", "Preview", "(LS0/k;I)V", "Loader", "showPreview", "showLoader", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PlayerShowcaseSingleComposableKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayerShowcaseDTO.VideoFormat.values().length];
            try {
                iArr[PlayerShowcaseDTO.VideoFormat.MP4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerShowcaseDTO.VideoFormat.HLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Loader(InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(1761291038);
        if (i11 == 0 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            e d11 = a0.d(aVar);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
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
            I1.a(C5187j.f39515a.a(a0.n(aVar, 64), InterfaceC6250b.a.e()), 0L, 0.0f, 0L, 0, u11, 0, 30);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PlayerShowcaseSingleComposableKt$Loader$2(i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PlayerCell(e eVar, PlayerShowcaseSingleVI playerShowcaseSingleVI, PlayerShowcaseComponent playerShowcaseComponent, boolean z11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        PlayerShowcaseSingleVI playerShowcaseSingleVI2;
        PlayerShowcaseComponent playerShowcaseComponent2;
        e eVar3;
        boolean n11;
        Object C11;
        InterfaceC3978p0 interfaceC3978p0;
        boolean n12;
        Object C12;
        InterfaceC3978p0 interfaceC3978p02;
        boolean n13;
        Object C13;
        PlayerListenersContainer playerListenersContainer;
        boolean n14;
        int i14;
        ExoManager progressiveExoManager;
        int i15;
        Boolean bool;
        PlayerListenersContainer playerListenersContainer2;
        Object obj;
        boolean F11;
        Object C14;
        int I11;
        int i16;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(82993055);
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            playerShowcaseSingleVI2 = playerShowcaseSingleVI;
            i13 |= u11.n(playerShowcaseSingleVI2) ? 32 : 16;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                playerShowcaseComponent2 = playerShowcaseComponent;
                i13 |= u11.F(playerShowcaseComponent2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                if ((i12 & 8) != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    i13 |= u11.p(z11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                }
                if ((i13 & 1171) == 1170 || !u11.b()) {
                    eVar3 = i17 != 0 ? e.f40358c0 : eVar2;
                    Object videoUrl = playerShowcaseSingleVI2.getVideoUrl();
                    u11.o(-1492908681);
                    n11 = u11.n(videoUrl);
                    C11 = u11.C();
                    if (!n11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = n1.f(Boolean.TRUE, D1.f25195a);
                        u11.x(C11);
                    }
                    interfaceC3978p0 = (InterfaceC3978p0) C11;
                    u11.k();
                    Object videoUrl2 = playerShowcaseSingleVI2.getVideoUrl();
                    u11.o(-1492906408);
                    n12 = u11.n(videoUrl2);
                    C12 = u11.C();
                    if (!n12 || C12 == InterfaceC3967k.a.a()) {
                        C12 = n1.f(Boolean.FALSE, D1.f25195a);
                        u11.x(C12);
                    }
                    interfaceC3978p02 = (InterfaceC3978p0) C12;
                    u11.k();
                    Object videoUrl3 = playerShowcaseSingleVI2.getVideoUrl();
                    u11.o(-1492903814);
                    n13 = u11.n(videoUrl3);
                    C13 = u11.C();
                    if (!n13 || C13 == InterfaceC3967k.a.a()) {
                        PlayerListenersContainer.Builder builder = new PlayerListenersContainer.Builder();
                        builder.onRenderedFirstFrame(new b(interfaceC3978p0));
                        int i18 = 1;
                        builder.onBuffer(new B90.E(interfaceC3978p02, i18));
                        builder.onReady(new F(interfaceC3978p02, i18));
                        C13 = builder.build();
                        u11.x(C13);
                    }
                    playerListenersContainer = (PlayerListenersContainer) C13;
                    u11.k();
                    Object videoUrl4 = playerShowcaseSingleVI2.getVideoUrl();
                    u11.o(-1492894542);
                    n14 = u11.n(videoUrl4);
                    Object C15 = u11.C();
                    if (!n14 || C15 == InterfaceC3967k.a.a()) {
                        i14 = WhenMappings.$EnumSwitchMapping$0[playerShowcaseSingleVI2.getVideoFormat().ordinal()];
                        if (i14 == 1) {
                            progressiveExoManager = playerShowcaseComponent2.getProgressiveExoManager();
                        } else {
                            if (i14 != 2) {
                                throw new o();
                            }
                            progressiveExoManager = playerShowcaseComponent2.getExoManagerLive();
                        }
                        ExoManager exoManager = progressiveExoManager;
                        SingleInstancePlayerController singleInstancePlayerController$default = VideoController.DefaultImpls.getSingleInstancePlayerController$default(playerShowcaseComponent2.getVideoController(), null, 1, null);
                        i15 = 1;
                        bool = null;
                        singleInstancePlayerController$default.mediaPlayController().prepareMediaToPlay(playerShowcaseSingleVI2.getVideoUrl(), exoManager, false, true, true, playerListenersContainer, null, null);
                        playerListenersContainer2 = playerListenersContainer;
                        u11.x(singleInstancePlayerController$default);
                        obj = singleInstancePlayerController$default;
                    } else {
                        i15 = 1;
                        bool = null;
                        playerListenersContainer2 = playerListenersContainer;
                        obj = C15;
                    }
                    SingleInstancePlayerController singleInstancePlayerController = (SingleInstancePlayerController) obj;
                    u11.k();
                    String videoUrl5 = playerShowcaseSingleVI2.getVideoUrl();
                    u11.o(-1492864292);
                    F11 = u11.F(singleInstancePlayerController) | u11.F(playerListenersContainer2);
                    C14 = u11.C();
                    if (!F11 || C14 == InterfaceC3967k.a.a()) {
                        C14 = new PlayerShowcaseSingleComposableKt$PlayerCell$1$1(singleInstancePlayerController, playerListenersContainer2);
                        u11.x(C14);
                    }
                    u11.k();
                    Q.c(videoUrl5, (Function1) C14, u11);
                    SingleInstanceMediaPlayController mediaPlayController = singleInstancePlayerController.mediaPlayController();
                    if (z11) {
                        mediaPlayController.resume();
                    } else {
                        mediaPlayController.pause();
                    }
                    e a11 = C10981b.a(e.f40358c0, InterfaceC2547p.a.d(), singleInstancePlayerController.playerComposableController().statesProvider().rememberPresentationState(bool, u11, 6).c(), u11, 54);
                    V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                    I11 = u11.I();
                    A0 d11 = u11.d();
                    e f11 = c.f(u11, eVar3);
                    Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a12);
                    } else {
                        u11.e();
                    }
                    Function2 f12 = E.f(u11, f7, u11, d11);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        a.d(I11, u11, I11, f12);
                    }
                    F1.b(u11, f11, InterfaceC2801g.a.f());
                    singleInstancePlayerController.playerComposableController().PlayerSurfaceComposable(a11, i15, u11, 48);
                    u11.o(-368610056);
                    if (PlayerCell$lambda$5(interfaceC3978p0)) {
                        i16 = 0;
                        Preview(u11, 0);
                    } else {
                        i16 = 0;
                    }
                    u11.k();
                    u11.o(-368608170);
                    if (PlayerCell$lambda$8(interfaceC3978p02)) {
                        Loader(u11, i16);
                    }
                    u11.k();
                    u11.f();
                } else {
                    u11.j();
                    eVar3 = eVar2;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new PlayerShowcaseSingleComposableKt$PlayerCell$4(eVar3, playerShowcaseSingleVI2, playerShowcaseComponent2, z11, i11, i12));
                    return;
                }
                return;
            }
            playerShowcaseComponent2 = playerShowcaseComponent;
            if ((i12 & 8) != 0) {
            }
            if ((i13 & 1171) == 1170) {
            }
            if (i17 != 0) {
            }
            Object videoUrl6 = playerShowcaseSingleVI2.getVideoUrl();
            u11.o(-1492908681);
            n11 = u11.n(videoUrl6);
            C11 = u11.C();
            if (!n11) {
            }
            C11 = n1.f(Boolean.TRUE, D1.f25195a);
            u11.x(C11);
            interfaceC3978p0 = (InterfaceC3978p0) C11;
            u11.k();
            Object videoUrl22 = playerShowcaseSingleVI2.getVideoUrl();
            u11.o(-1492906408);
            n12 = u11.n(videoUrl22);
            C12 = u11.C();
            if (!n12) {
            }
            C12 = n1.f(Boolean.FALSE, D1.f25195a);
            u11.x(C12);
            interfaceC3978p02 = (InterfaceC3978p0) C12;
            u11.k();
            Object videoUrl32 = playerShowcaseSingleVI2.getVideoUrl();
            u11.o(-1492903814);
            n13 = u11.n(videoUrl32);
            C13 = u11.C();
            if (!n13) {
            }
            PlayerListenersContainer.Builder builder2 = new PlayerListenersContainer.Builder();
            builder2.onRenderedFirstFrame(new b(interfaceC3978p0));
            int i182 = 1;
            builder2.onBuffer(new B90.E(interfaceC3978p02, i182));
            builder2.onReady(new F(interfaceC3978p02, i182));
            C13 = builder2.build();
            u11.x(C13);
            playerListenersContainer = (PlayerListenersContainer) C13;
            u11.k();
            Object videoUrl42 = playerShowcaseSingleVI2.getVideoUrl();
            u11.o(-1492894542);
            n14 = u11.n(videoUrl42);
            Object C152 = u11.C();
            if (n14) {
            }
            i14 = WhenMappings.$EnumSwitchMapping$0[playerShowcaseSingleVI2.getVideoFormat().ordinal()];
            if (i14 == 1) {
            }
            ExoManager exoManager2 = progressiveExoManager;
            SingleInstancePlayerController singleInstancePlayerController$default2 = VideoController.DefaultImpls.getSingleInstancePlayerController$default(playerShowcaseComponent2.getVideoController(), null, 1, null);
            i15 = 1;
            bool = null;
            singleInstancePlayerController$default2.mediaPlayController().prepareMediaToPlay(playerShowcaseSingleVI2.getVideoUrl(), exoManager2, false, true, true, playerListenersContainer, null, null);
            playerListenersContainer2 = playerListenersContainer;
            u11.x(singleInstancePlayerController$default2);
            obj = singleInstancePlayerController$default2;
            SingleInstancePlayerController singleInstancePlayerController2 = (SingleInstancePlayerController) obj;
            u11.k();
            String videoUrl52 = playerShowcaseSingleVI2.getVideoUrl();
            u11.o(-1492864292);
            F11 = u11.F(singleInstancePlayerController2) | u11.F(playerListenersContainer2);
            C14 = u11.C();
            if (!F11) {
            }
            C14 = new PlayerShowcaseSingleComposableKt$PlayerCell$1$1(singleInstancePlayerController2, playerListenersContainer2);
            u11.x(C14);
            u11.k();
            Q.c(videoUrl52, (Function1) C14, u11);
            SingleInstanceMediaPlayController mediaPlayController2 = singleInstancePlayerController2.mediaPlayController();
            if (z11) {
            }
            e a112 = C10981b.a(e.f40358c0, InterfaceC2547p.a.d(), singleInstancePlayerController2.playerComposableController().statesProvider().rememberPresentationState(bool, u11, 6).c(), u11, 54);
            V f72 = C5185h.f(InterfaceC6250b.a.o(), false);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f112 = c.f(u11, eVar3);
            Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f122 = E.f(u11, f72, u11, d112);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f122);
            F1.b(u11, f112, InterfaceC2801g.a.f());
            singleInstancePlayerController2.playerComposableController().PlayerSurfaceComposable(a112, i15, u11, 48);
            u11.o(-368610056);
            if (PlayerCell$lambda$5(interfaceC3978p0)) {
            }
            u11.k();
            u11.o(-368608170);
            if (PlayerCell$lambda$8(interfaceC3978p02)) {
            }
            u11.k();
            u11.f();
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        playerShowcaseSingleVI2 = playerShowcaseSingleVI;
        if ((i12 & 4) == 0) {
        }
        playerShowcaseComponent2 = playerShowcaseComponent;
        if ((i12 & 8) != 0) {
        }
        if ((i13 & 1171) == 1170) {
        }
        if (i17 != 0) {
        }
        Object videoUrl62 = playerShowcaseSingleVI2.getVideoUrl();
        u11.o(-1492908681);
        n11 = u11.n(videoUrl62);
        C11 = u11.C();
        if (!n11) {
        }
        C11 = n1.f(Boolean.TRUE, D1.f25195a);
        u11.x(C11);
        interfaceC3978p0 = (InterfaceC3978p0) C11;
        u11.k();
        Object videoUrl222 = playerShowcaseSingleVI2.getVideoUrl();
        u11.o(-1492906408);
        n12 = u11.n(videoUrl222);
        C12 = u11.C();
        if (!n12) {
        }
        C12 = n1.f(Boolean.FALSE, D1.f25195a);
        u11.x(C12);
        interfaceC3978p02 = (InterfaceC3978p0) C12;
        u11.k();
        Object videoUrl322 = playerShowcaseSingleVI2.getVideoUrl();
        u11.o(-1492903814);
        n13 = u11.n(videoUrl322);
        C13 = u11.C();
        if (!n13) {
        }
        PlayerListenersContainer.Builder builder22 = new PlayerListenersContainer.Builder();
        builder22.onRenderedFirstFrame(new b(interfaceC3978p0));
        int i1822 = 1;
        builder22.onBuffer(new B90.E(interfaceC3978p02, i1822));
        builder22.onReady(new F(interfaceC3978p02, i1822));
        C13 = builder22.build();
        u11.x(C13);
        playerListenersContainer = (PlayerListenersContainer) C13;
        u11.k();
        Object videoUrl422 = playerShowcaseSingleVI2.getVideoUrl();
        u11.o(-1492894542);
        n14 = u11.n(videoUrl422);
        Object C1522 = u11.C();
        if (n14) {
        }
        i14 = WhenMappings.$EnumSwitchMapping$0[playerShowcaseSingleVI2.getVideoFormat().ordinal()];
        if (i14 == 1) {
        }
        ExoManager exoManager22 = progressiveExoManager;
        SingleInstancePlayerController singleInstancePlayerController$default22 = VideoController.DefaultImpls.getSingleInstancePlayerController$default(playerShowcaseComponent2.getVideoController(), null, 1, null);
        i15 = 1;
        bool = null;
        singleInstancePlayerController$default22.mediaPlayController().prepareMediaToPlay(playerShowcaseSingleVI2.getVideoUrl(), exoManager22, false, true, true, playerListenersContainer, null, null);
        playerListenersContainer2 = playerListenersContainer;
        u11.x(singleInstancePlayerController$default22);
        obj = singleInstancePlayerController$default22;
        SingleInstancePlayerController singleInstancePlayerController22 = (SingleInstancePlayerController) obj;
        u11.k();
        String videoUrl522 = playerShowcaseSingleVI2.getVideoUrl();
        u11.o(-1492864292);
        F11 = u11.F(singleInstancePlayerController22) | u11.F(playerListenersContainer2);
        C14 = u11.C();
        if (!F11) {
        }
        C14 = new PlayerShowcaseSingleComposableKt$PlayerCell$1$1(singleInstancePlayerController22, playerListenersContainer2);
        u11.x(C14);
        u11.k();
        Q.c(videoUrl522, (Function1) C14, u11);
        SingleInstanceMediaPlayController mediaPlayController22 = singleInstancePlayerController22.mediaPlayController();
        if (z11) {
        }
        e a1122 = C10981b.a(e.f40358c0, InterfaceC2547p.a.d(), singleInstancePlayerController22.playerComposableController().statesProvider().rememberPresentationState(bool, u11, 6).c(), u11, 54);
        V f722 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d1122 = u11.d();
        e f1122 = c.f(u11, eVar3);
        Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f1222 = E.f(u11, f722, u11, d1122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f1222);
        F1.b(u11, f1122, InterfaceC2801g.a.f());
        singleInstancePlayerController22.playerComposableController().PlayerSurfaceComposable(a1122, i15, u11, 48);
        u11.o(-368610056);
        if (PlayerCell$lambda$5(interfaceC3978p0)) {
        }
        u11.k();
        u11.o(-368608170);
        if (PlayerCell$lambda$8(interfaceC3978p02)) {
        }
        u11.k();
        u11.f();
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlayerCell$lambda$14$lambda$13$lambda$12(InterfaceC3978p0 interfaceC3978p0, PlayerState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PlayerCell$lambda$9(interfaceC3978p0, false);
    }

    private static final boolean PlayerCell$lambda$5(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlayerCell$lambda$6(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    private static final boolean PlayerCell$lambda$8(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlayerCell$lambda$9(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    public static final void PlayerShowcaseSingleComposable(@NotNull PlayerShowcaseSingleVI item, @NotNull PlayerShowcaseComponent component, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(component, "component");
        C3969l u11 = interfaceC3967k.u(-1984346331);
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
            eVar2 = eVar;
        } else {
            e eVar3 = i14 != 0 ? e.f40358c0 : eVar;
            u11.o(-638431255);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(Boolean.FALSE, D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            u11.k();
            e f7 = a0.f(a0.x(eVar3, null, 3), 400);
            u11.o(-638426435);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = new PlayerShowcaseSingleComposableKt$PlayerShowcaseSingleComposable$cellModifier$1$1(interfaceC3978p0);
                u11.x(C12);
            }
            u11.k();
            PlayerCell(f.b(f7, (Function1) C12), item, component, PlayerShowcaseSingleComposable$lambda$1(interfaceC3978p0), u11, (i13 << 3) & 1008, 0);
            eVar2 = eVar3;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PlayerShowcaseSingleComposableKt$PlayerShowcaseSingleComposable$1(item, component, eVar2, i11, i12));
        }
    }

    private static final boolean PlayerShowcaseSingleComposable$lambda$1(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlayerShowcaseSingleComposable$lambda$2(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Preview(InterfaceC3967k interfaceC3967k, int i11) {
        long j11;
        e b11;
        C3969l u11 = interfaceC3967k.u(-1329529801);
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
            m02.G(new PlayerShowcaseSingleComposableKt$Preview$1(i11));
        }
    }
}
