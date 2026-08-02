package ru.ozon.app.android.videomoleculecompose;

import B1.InterfaceC2547p;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import T7.E;
import android.content.res.Configuration;
import androidx.compose.animation.b;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import fd.p;
import i1.C6988h;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import l0.G;
import m0.C8004n;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.BasePlayerComposableController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.ComposableStatesProvider;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.fromMedia3.PlayerTimelineState;
import ru.ozon.app.android.videomoleculecompose.intent.VideoMoleculeIntent;
import ru.ozon.app.android.videomoleculecompose.interaction.VideoMoleculeInteractionState;
import ru.ozon.app.android.videomoleculecompose.interaction.VideoMoleculeMediaResetKt;
import ru.ozon.app.android.videomoleculecompose.slots.centeraction.VideoMoleculeCenterAction;
import ru.ozon.app.android.videomoleculecompose.slots.centeraction.VideoMoleculeCenterActionState;
import ru.ozon.app.android.videomoleculecompose.slots.controlpanel.VideoMoleculeControlPanelState;
import ru.ozon.app.android.videomoleculecompose.slots.controlpanel.VideoMoleculePlayPauseState;
import ru.ozon.app.android.videomoleculecompose.slots.scrubbing.VideoMoleculeScrubbingOverlayKt;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarState;
import ru.ozon.app.android.videomoleculecompose.util.VideoMoleculeTimeFormatter;
import z4.C10981b;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u001aÿ\u0002\u0010&\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u00022\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u00132\u001c\b\u0002\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u00152.\b\u0002\u0010\u001b\u001a(\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0019\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017j\u0004\u0018\u0001`\u001a28\b\u0002\u0010\u001e\u001a2\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\n\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017j\u0004\u0018\u0001`\u001d2\"\b\u0002\u0010!\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001fj\u0004\u0018\u0001` 2\"\b\u0002\u0010#\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001fj\u0004\u0018\u0001`\"2\u001c\b\u0002\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`$H\u0007¢\u0006\u0004\b&\u0010'\u001aG\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00052\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00072\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0003¢\u0006\u0004\b+\u0010,\u001a\u001f\u0010.\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(2\u0006\u0010-\u001a\u00020\u0007H\u0003¢\u0006\u0004\b.\u0010/\u001ae\u00107\u001a\u00020\u00042\u0006\u00101\u001a\u0002002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u00103\u001a\u0004\u0018\u0001022\u0006\u00104\u001a\u00020\u00072 \u0010!\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001fj\u0004\u0018\u0001` 2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b5\u00106\u001ao\u0010:\u001a\u00020\u00042,\u0010\u001b\u001a(\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0019\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017j\u0004\u0018\u0001`\u001a2\u0006\u00109\u001a\u0002082\u0006\u0010)\u001a\u00020(2\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00052\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b:\u0010;\u001aÉ\u0001\u0010?\u001a\u00020\u000426\u0010\u001e\u001a2\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\n\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017j\u0004\u0018\u0001`\u001d2\u0006\u00109\u001a\u0002082\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00100\u00192\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00100\u00192\u0006\u0010-\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u00022\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00052\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b?\u0010@\u001a\u001d\u0010B\u001a\u00020\u00042\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019H\u0003¢\u0006\u0004\bB\u0010C¨\u0006F²\u0006\u001c\u0010D\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010E\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;", "playerController", "Lkotlin/Function1;", "Lru/ozon/app/android/videomoleculecompose/intent/VideoMoleculeIntent;", "", "Lru/ozon/app/android/videomoleculecompose/intent/VideoMoleculeIntentHandler;", "onIntent", "", "isFullscreen", "isCompactControls", "Landroidx/compose/ui/e;", "modifier", "LB1/p;", "contentScale", "", "surfaceType", "", "", "timeFormatter", "Lru/ozon/app/android/videomoleculecompose/slots/VideoMoleculeGradientOverlaySlot;", "gradientOverlay", "Lru/ozon/app/android/videomoleculecompose/slots/VideoMoleculeOverlaySlot;", "overlay", "Lkotlin/Function3;", "Lru/ozon/app/android/videomoleculecompose/slots/centeraction/VideoMoleculeCenterActionState;", "Lkotlin/Function0;", "Lru/ozon/app/android/videomoleculecompose/slots/VideoMoleculeCenterActionOverlaySlot;", "centerActionOverlay", "Lru/ozon/app/android/videomoleculecompose/slots/controlpanel/VideoMoleculeControlPanelState;", "Lru/ozon/app/android/videomoleculecompose/slots/VideoMoleculeControlPanelSlot;", "controlPanel", "Lkotlin/Function2;", "Lru/ozon/app/android/videomoleculecompose/slots/VideoMoleculePreviewSlot;", "preview", "Lru/ozon/app/android/videomoleculecompose/slots/VideoMoleculeBufferingSlot;", "buffering", "Lru/ozon/app/android/videomoleculecompose/slots/VideoMoleculeLifecyclePlaybackSlot;", "lifecyclePlaybackEffect", "VideoMolecule", "(Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/ui/e;LB1/p;ILkotlin/jvm/functions/Function1;Lfd/n;Lfd/n;Lfd/p;Lfd/p;Lfd/o;Lfd/o;Lfd/n;LS0/k;III)V", "Lru/ozon/app/android/videomoleculecompose/interaction/VideoMoleculeInteractionState;", "interactionState", "isPlaying", "rememberVideoMoleculeScrubIntentInterceptor", "(Lru/ozon/app/android/videomoleculecompose/interaction/VideoMoleculeInteractionState;ZLkotlin/jvm/functions/Function1;LS0/k;I)Lkotlin/jvm/functions/Function1;", "showPlay", "VideoMoleculeEffects", "(Lru/ozon/app/android/videomoleculecompose/interaction/VideoMoleculeInteractionState;ZLS0/k;I)V", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/BasePlayerComposableController;", "playerComposableController", "Lk1/j;", "sourceSizeDp", "isPreviewVisible", "PlayerSurfaceLayer-vrY8-oc", "(Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/BasePlayerComposableController;LB1/p;ILk1/j;ZLfd/o;Landroidx/compose/ui/e;LS0/k;II)V", "PlayerSurfaceLayer", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/fromMedia3/PlayerTimelineState;", "timelineState", "VideoMoleculeCenterActionOverlayLayer", "(Lfd/p;Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/fromMedia3/PlayerTimelineState;Lru/ozon/app/android/videomoleculecompose/interaction/VideoMoleculeInteractionState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)V", "positionMsProvider", "bufferedPositionMsProvider", "playPauseEnabled", "VideoMoleculeControlsLayer", "(Lfd/p;Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/fromMedia3/PlayerTimelineState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZLru/ozon/app/android/videomoleculecompose/interaction/VideoMoleculeInteractionState;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;III)V", "onClick", "TouchArea", "(Lkotlin/jvm/functions/Function0;LS0/k;I)V", "currentOnIntent", "currentIsPlaying", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculeKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0094  */
    /* renamed from: PlayerSurfaceLayer-vrY8-oc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1548PlayerSurfaceLayervrY8oc(BasePlayerComposableController basePlayerComposableController, InterfaceC2547p interfaceC2547p, int i11, C7464j c7464j, boolean z11, InterfaceC6512o<? super Boolean, ? super e, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6512o, e eVar, InterfaceC3967k interfaceC3967k, int i12, int i13) {
        int i14;
        boolean z12;
        int i15;
        e eVar2;
        e eVar3;
        int I11;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-2126588454);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i14 = (u11.F(basePlayerComposableController) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i12 & 48) == 0) {
            i14 |= u11.n(interfaceC2547p) ? 32 : 16;
        }
        if ((i13 & 4) != 0) {
            i14 |= 384;
        } else if ((i12 & 384) == 0) {
            i14 |= u11.r(i11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 8) != 0) {
            i14 |= 3072;
        } else if ((i12 & 3072) == 0) {
            i14 |= u11.n(c7464j) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 16) != 0) {
            i14 |= 24576;
        } else if ((i12 & 24576) == 0) {
            z12 = z11;
            i14 |= u11.p(z12) ? 16384 : 8192;
            if ((i13 & 32) == 0) {
                i14 |= 196608;
            } else if ((i12 & 196608) == 0) {
                i14 |= u11.F(interfaceC6512o) ? 131072 : 65536;
            }
            i15 = i13 & 64;
            if (i15 == 0) {
                i14 |= 1572864;
            } else if ((1572864 & i12) == 0) {
                eVar2 = eVar;
                i14 |= u11.n(eVar2) ? 1048576 : 524288;
                if ((599187 & i14) == 599186 || !u11.b()) {
                    eVar3 = i15 != 0 ? e.f40358c0 : eVar2;
                    e b11 = C6988h.b(a0.d(eVar3));
                    V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                    I11 = u11.I();
                    A0 d11 = u11.d();
                    e f11 = c.f(u11, b11);
                    Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a11);
                    } else {
                        u11.e();
                    }
                    Function2 f12 = E.f(u11, f7, u11, d11);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        a.d(I11, u11, I11, f12);
                    }
                    F1.b(u11, f11, InterfaceC2801g.a.f());
                    e.a aVar = e.f40358c0;
                    int i16 = i14 >> 3;
                    basePlayerComposableController.PlayerSurfaceComposable(C10981b.a(aVar, interfaceC2547p, c7464j, u11, (i14 & 112) | 6 | (i16 & 896)), i11, u11, (i16 & 112) | ((i14 << 6) & 896));
                    u11.o(349521292);
                    if (interfaceC6512o != null) {
                        interfaceC6512o.invoke(Boolean.valueOf(z12), a0.d(aVar), u11, Integer.valueOf(((i14 >> 9) & 896) | ((i14 >> 12) & 14) | 48));
                    }
                    u11.k();
                    u11.f();
                } else {
                    u11.j();
                    eVar3 = eVar2;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new VideoMoleculeKt$PlayerSurfaceLayer$2(basePlayerComposableController, interfaceC2547p, i11, c7464j, z12, interfaceC6512o, eVar3, i12, i13));
                    return;
                }
                return;
            }
            eVar2 = eVar;
            if ((599187 & i14) == 599186) {
            }
            if (i15 != 0) {
            }
            e b112 = C6988h.b(a0.d(eVar3));
            V f72 = C5185h.f(InterfaceC6250b.a.o(), false);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f112 = c.f(u11, b112);
            Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f122 = E.f(u11, f72, u11, d112);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f122);
            F1.b(u11, f112, InterfaceC2801g.a.f());
            e.a aVar2 = e.f40358c0;
            int i162 = i14 >> 3;
            basePlayerComposableController.PlayerSurfaceComposable(C10981b.a(aVar2, interfaceC2547p, c7464j, u11, (i14 & 112) | 6 | (i162 & 896)), i11, u11, (i162 & 112) | ((i14 << 6) & 896));
            u11.o(349521292);
            if (interfaceC6512o != null) {
            }
            u11.k();
            u11.f();
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        z12 = z11;
        if ((i13 & 32) == 0) {
        }
        i15 = i13 & 64;
        if (i15 == 0) {
        }
        eVar2 = eVar;
        if ((599187 & i14) == 599186) {
        }
        if (i15 != 0) {
        }
        e b1122 = C6988h.b(a0.d(eVar3));
        V f722 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d1122 = u11.d();
        e f1122 = c.f(u11, b1122);
        Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f1222 = E.f(u11, f722, u11, d1122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f1222);
        F1.b(u11, f1122, InterfaceC2801g.a.f());
        e.a aVar22 = e.f40358c0;
        int i1622 = i14 >> 3;
        basePlayerComposableController.PlayerSurfaceComposable(C10981b.a(aVar22, interfaceC2547p, c7464j, u11, (i14 & 112) | 6 | (i1622 & 896)), i11, u11, (i1622 & 112) | ((i14 << 6) & 896));
        u11.o(349521292);
        if (interfaceC6512o != null) {
        }
        u11.k();
        u11.f();
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TouchArea(Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function0<Unit> function02;
        C3969l u11 = interfaceC3967k.u(1088782783);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(function0) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
            function02 = function0;
        } else {
            function02 = function0;
            C5185h.a(i.b(a0.d(e.f40358c0), null, null, false, null, null, function02, 28), u11, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new VideoMoleculeKt$TouchArea$1(function02, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VideoMolecule(@NotNull BasePlayerController playerController, @NotNull Function1<? super VideoMoleculeIntent, Unit> onIntent, boolean z11, boolean z12, e eVar, InterfaceC2547p interfaceC2547p, int i11, Function1<? super Long, String> function1, InterfaceC6511n<? super e, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, InterfaceC6511n<? super e, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n2, p<? super VideoMoleculeCenterActionState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar, p<? super VideoMoleculeControlPanelState, ? super e, ? super Function1<? super VideoMoleculeIntent, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar2, InterfaceC6512o<? super Boolean, ? super e, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6512o, InterfaceC6512o<? super Boolean, ? super e, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6512o2, InterfaceC6511n<? super BasePlayerController, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n3, InterfaceC3967k interfaceC3967k, int i12, int i13, int i14) {
        int i15;
        int i16;
        boolean z13;
        int i17;
        int i18;
        int i19;
        e eVar2;
        int i21;
        int i22;
        Function1<? super Long, String> function12;
        int i23;
        InterfaceC6511n<? super e, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n4;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        InterfaceC2547p d11;
        int i33;
        int i34;
        Function1<? super Long, String> function13;
        InterfaceC6511n<? super e, ? super InterfaceC3967k, ? super Integer, Unit> m1542getLambda1$videomoleculecompose_prodGoogleAllVendorsRelease;
        InterfaceC6511n<? super e, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n5;
        p<? super VideoMoleculeCenterActionState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> m1543getLambda2$videomoleculecompose_prodGoogleAllVendorsRelease;
        InterfaceC6512o<? super Boolean, ? super e, ? super InterfaceC3967k, ? super Integer, Unit> m1545getLambda4$videomoleculecompose_prodGoogleAllVendorsRelease;
        InterfaceC6511n<? super BasePlayerController, ? super InterfaceC3967k, ? super Integer, Unit> m1547getLambda6$videomoleculecompose_prodGoogleAllVendorsRelease;
        Function1<? super Long, String> function14;
        p<? super VideoMoleculeControlPanelState, ? super e, ? super Function1<? super VideoMoleculeIntent, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar3;
        InterfaceC6512o<? super Boolean, ? super e, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6512o3;
        PlayerTimelineState rememberTimelineState;
        boolean n11;
        Object C11;
        boolean n12;
        Object C12;
        boolean n13;
        Object C13;
        int I11;
        C3969l c3969l;
        boolean n14;
        Object C14;
        InterfaceC6512o<? super Boolean, ? super e, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6512o4;
        InterfaceC2547p interfaceC2547p2;
        InterfaceC6511n<? super e, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n6;
        p<? super VideoMoleculeCenterActionState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar4;
        e eVar3;
        int i35;
        InterfaceC6512o<? super Boolean, ? super e, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6512o5;
        p<? super VideoMoleculeControlPanelState, ? super e, ? super Function1<? super VideoMoleculeIntent, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar5;
        J0 m02;
        int i36;
        int i37;
        Intrinsics.checkNotNullParameter(playerController, "playerController");
        Intrinsics.checkNotNullParameter(onIntent, "onIntent");
        C3969l u11 = interfaceC3967k.u(-187169079);
        if ((i14 & 1) != 0) {
            i15 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i15 = i12 | (u11.F(playerController) ? 4 : 2);
        } else {
            i15 = i12;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i12 & 48) == 0) {
            i15 |= u11.F(onIntent) ? 32 : 16;
        }
        int i38 = i15;
        if ((i14 & 4) != 0) {
            i38 |= 384;
            z13 = z11;
            i16 = 32;
        } else {
            i16 = 32;
            if ((i12 & 384) == 0) {
                z13 = z11;
                i38 |= u11.p(z13) ? 256 : 128;
            } else {
                z13 = z11;
            }
        }
        if ((i14 & 8) != 0) {
            i38 |= 3072;
            i17 = 1;
        } else {
            i17 = 1;
            if ((i12 & 3072) == 0) {
                i38 |= u11.p(z12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                i18 = i14 & 16;
                if (i18 == 0) {
                    i38 |= 24576;
                    i19 = 6;
                } else {
                    i19 = 6;
                    if ((i12 & 24576) == 0) {
                        eVar2 = eVar;
                        i38 |= u11.n(eVar2) ? 16384 : 8192;
                        i21 = i14 & 32;
                        if (i21 != 0) {
                            i38 |= 196608;
                        } else if ((i12 & 196608) == 0) {
                            i38 |= u11.n(interfaceC2547p) ? 131072 : 65536;
                        }
                        i22 = i14 & 64;
                        if (i22 != 0) {
                            i38 |= 1572864;
                        } else if ((i12 & 1572864) == 0) {
                            i38 |= u11.r(i11) ? 1048576 : 524288;
                        }
                        if ((i12 & 12582912) == 0) {
                            if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                                function12 = function1;
                                if (u11.F(function12)) {
                                    i37 = 8388608;
                                    i38 |= i37;
                                }
                            } else {
                                function12 = function1;
                            }
                            i37 = 4194304;
                            i38 |= i37;
                        } else {
                            function12 = function1;
                        }
                        i23 = i14 & 256;
                        if (i23 != 0) {
                            i38 |= 100663296;
                            interfaceC6511n4 = interfaceC6511n;
                        } else {
                            interfaceC6511n4 = interfaceC6511n;
                            if ((i12 & 100663296) == 0) {
                                i38 |= u11.F(interfaceC6511n4) ? 67108864 : 33554432;
                            }
                        }
                        i24 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
                        if (i24 == 0) {
                            i36 = (i12 & 805306368) == 0 ? u11.F(interfaceC6511n2) ? 536870912 : 268435456 : 805306368;
                            i25 = i14 & UserVerificationMethods.USER_VERIFY_ALL;
                            if (i25 == 0) {
                                i26 = i13 | 6;
                            } else if ((i13 & 6) == 0) {
                                i26 = i13 | (u11.F(pVar) ? 4 : 2);
                            } else {
                                i26 = i13;
                            }
                            i27 = i14 & 2048;
                            if (i27 == 0) {
                                i26 |= 48;
                            } else if ((i13 & 48) == 0) {
                                if (!u11.F(pVar2)) {
                                    i16 = 16;
                                }
                                i26 |= i16;
                            }
                            int i39 = i26;
                            i28 = i14 & 4096;
                            if (i28 == 0) {
                                i29 = i39 | 384;
                            } else {
                                int i41 = i39;
                                if ((i13 & 384) == 0) {
                                    i41 |= u11.F(interfaceC6512o) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                                }
                                i29 = i41;
                            }
                            i31 = i14 & 8192;
                            if (i31 == 0) {
                                i29 |= 3072;
                            } else if ((i13 & 3072) == 0) {
                                i29 |= u11.F(interfaceC6512o2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                            }
                            i32 = i14 & 16384;
                            if (i32 == 0) {
                                i29 |= 24576;
                            } else if ((i13 & 24576) == 0) {
                                i29 |= u11.F(interfaceC6511n3) ? 16384 : 8192;
                                if ((i38 & 306783379) != 306783378 && (i29 & 9363) == 9362 && u11.b()) {
                                    u11.j();
                                    interfaceC2547p2 = interfaceC2547p;
                                    i35 = i11;
                                    interfaceC6511n6 = interfaceC6511n2;
                                    pVar4 = pVar;
                                    pVar5 = pVar2;
                                    eVar3 = eVar2;
                                    c3969l = u11;
                                    interfaceC6512o5 = interfaceC6512o;
                                    interfaceC6512o4 = interfaceC6512o2;
                                } else {
                                    u11.Q0();
                                    if ((i12 & 1) != 0 || u11.w0()) {
                                        if (i18 != 0) {
                                            eVar2 = e.f40358c0;
                                        }
                                        d11 = i21 != 0 ? InterfaceC2547p.a.d() : interfaceC2547p;
                                        i33 = i22 != 0 ? i17 : i11;
                                        if ((128 & i14) != 0) {
                                            VideoMoleculeTimeFormatter videoMoleculeTimeFormatter = VideoMoleculeTimeFormatter.INSTANCE;
                                            u11.o(-1805540949);
                                            Object C15 = u11.C();
                                            i34 = i29;
                                            if (C15 == InterfaceC3967k.a.a()) {
                                                C15 = new VideoMoleculeKt$VideoMolecule$1$1(videoMoleculeTimeFormatter);
                                                u11.x(C15);
                                            }
                                            u11.k();
                                            function13 = (Function1) ((h) C15);
                                            i38 &= -29360129;
                                        } else {
                                            i34 = i29;
                                            function13 = function12;
                                        }
                                        m1542getLambda1$videomoleculecompose_prodGoogleAllVendorsRelease = i23 != 0 ? ComposableSingletons$VideoMoleculeKt.INSTANCE.m1542getLambda1$videomoleculecompose_prodGoogleAllVendorsRelease() : interfaceC6511n4;
                                        interfaceC6511n5 = i24 != 0 ? null : interfaceC6511n2;
                                        m1543getLambda2$videomoleculecompose_prodGoogleAllVendorsRelease = i25 != 0 ? ComposableSingletons$VideoMoleculeKt.INSTANCE.m1543getLambda2$videomoleculecompose_prodGoogleAllVendorsRelease() : pVar;
                                        p<? super VideoMoleculeControlPanelState, ? super e, ? super Function1<? super VideoMoleculeIntent, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> m1544getLambda3$videomoleculecompose_prodGoogleAllVendorsRelease = i27 != 0 ? ComposableSingletons$VideoMoleculeKt.INSTANCE.m1544getLambda3$videomoleculecompose_prodGoogleAllVendorsRelease() : pVar2;
                                        m1545getLambda4$videomoleculecompose_prodGoogleAllVendorsRelease = i28 != 0 ? ComposableSingletons$VideoMoleculeKt.INSTANCE.m1545getLambda4$videomoleculecompose_prodGoogleAllVendorsRelease() : interfaceC6512o;
                                        InterfaceC6512o<? super Boolean, ? super e, ? super InterfaceC3967k, ? super Integer, Unit> m1546getLambda5$videomoleculecompose_prodGoogleAllVendorsRelease = i31 != 0 ? ComposableSingletons$VideoMoleculeKt.INSTANCE.m1546getLambda5$videomoleculecompose_prodGoogleAllVendorsRelease() : interfaceC6512o2;
                                        m1547getLambda6$videomoleculecompose_prodGoogleAllVendorsRelease = i32 != 0 ? ComposableSingletons$VideoMoleculeKt.INSTANCE.m1547getLambda6$videomoleculecompose_prodGoogleAllVendorsRelease() : interfaceC6511n3;
                                        function14 = function13;
                                        pVar3 = m1544getLambda3$videomoleculecompose_prodGoogleAllVendorsRelease;
                                        interfaceC6512o3 = m1546getLambda5$videomoleculecompose_prodGoogleAllVendorsRelease;
                                    } else {
                                        u11.j();
                                        if ((128 & i14) != 0) {
                                            i38 &= -29360129;
                                        }
                                        d11 = interfaceC2547p;
                                        i33 = i11;
                                        interfaceC6511n5 = interfaceC6511n2;
                                        pVar3 = pVar2;
                                        m1545getLambda4$videomoleculecompose_prodGoogleAllVendorsRelease = interfaceC6512o;
                                        m1547getLambda6$videomoleculecompose_prodGoogleAllVendorsRelease = interfaceC6511n3;
                                        i34 = i29;
                                        function14 = function12;
                                        m1542getLambda1$videomoleculecompose_prodGoogleAllVendorsRelease = interfaceC6511n4;
                                        m1543getLambda2$videomoleculecompose_prodGoogleAllVendorsRelease = pVar;
                                        interfaceC6512o3 = interfaceC6512o2;
                                    }
                                    u11.j0();
                                    u11.o(-1805498687);
                                    if (m1547getLambda6$videomoleculecompose_prodGoogleAllVendorsRelease != null) {
                                        m1547getLambda6$videomoleculecompose_prodGoogleAllVendorsRelease.invoke(playerController, u11, Integer.valueOf((i38 & 14) | ((i34 >> 9) & 112)));
                                        Unit unit = Unit.f71690a;
                                    }
                                    u11.k();
                                    BasePlayerComposableController playerComposableController = playerController.playerComposableController();
                                    InterfaceC2547p interfaceC2547p3 = d11;
                                    ComposableStatesProvider statesProvider = playerComposableController.statesProvider();
                                    A4.c rememberPlayPauseButtonState = statesProvider.rememberPlayPauseButtonState(u11, 0);
                                    interfaceC6511n3 = m1547getLambda6$videomoleculecompose_prodGoogleAllVendorsRelease;
                                    p<? super VideoMoleculeCenterActionState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar6 = m1543getLambda2$videomoleculecompose_prodGoogleAllVendorsRelease;
                                    A4.h rememberPresentationState = statesProvider.rememberPresentationState(null, u11, i19);
                                    rememberTimelineState = statesProvider.rememberTimelineState(u11, 0);
                                    int rememberVideoMoleculeMediaResetVersion = VideoMoleculeMediaResetKt.rememberVideoMoleculeMediaResetVersion(playerController, u11, i38 & 14);
                                    u11.o(-1805481978);
                                    n11 = u11.n(playerController) | u11.r(rememberVideoMoleculeMediaResetVersion);
                                    C11 = u11.C();
                                    if (!n11 || C11 == InterfaceC3967k.a.a()) {
                                        C11 = new VideoMoleculeInteractionState();
                                        u11.x(C11);
                                    }
                                    VideoMoleculeInteractionState videoMoleculeInteractionState = (VideoMoleculeInteractionState) C11;
                                    u11.k();
                                    u11.o(-1805478079);
                                    n12 = u11.n(rememberTimelineState);
                                    C12 = u11.C();
                                    if (!n12 || C12 == InterfaceC3967k.a.a()) {
                                        C12 = new VideoMoleculeKt$VideoMolecule$positionMsProvider$1$1(rememberTimelineState);
                                        u11.x(C12);
                                    }
                                    Function0 function0 = (Function0) C12;
                                    u11.k();
                                    u11.o(-1805475063);
                                    n13 = u11.n(rememberTimelineState);
                                    C13 = u11.C();
                                    if (!n13 || C13 == InterfaceC3967k.a.a()) {
                                        C13 = new VideoMoleculeKt$VideoMolecule$bufferedPositionMsProvider$1$1(rememberTimelineState);
                                        u11.x(C13);
                                    }
                                    Function0 function02 = (Function0) C13;
                                    u11.k();
                                    boolean b11 = rememberPlayPauseButtonState.b();
                                    boolean c11 = rememberPlayPauseButtonState.c();
                                    Function1<VideoMoleculeIntent, Unit> rememberVideoMoleculeScrubIntentInterceptor = rememberVideoMoleculeScrubIntentInterceptor(videoMoleculeInteractionState, rememberTimelineState.isPlaying(), onIntent, u11, (i38 << 3) & 896);
                                    VideoMoleculeEffects(videoMoleculeInteractionState, b11, u11, 0);
                                    int i42 = i38 >> 12;
                                    V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                                    I11 = u11.I();
                                    A0 d12 = u11.d();
                                    e f11 = c.f(u11, eVar2);
                                    Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                                    if (u11.t()) {
                                        u11.H(a11);
                                    } else {
                                        u11.e();
                                    }
                                    Function2 f12 = E.f(u11, f7, u11, d12);
                                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                        a.d(I11, u11, I11, f12);
                                    }
                                    F1.b(u11, f11, InterfaceC2801g.a.f());
                                    int i43 = i33;
                                    m1548PlayerSurfaceLayervrY8oc(playerComposableController, interfaceC2547p3, i43, rememberPresentationState.c(), rememberPresentationState.b(), m1545getLambda4$videomoleculecompose_prodGoogleAllVendorsRelease, null, u11, (i42 & 1008) | ((i34 << 9) & 458752), 64);
                                    c3969l = u11;
                                    c3969l.o(454920902);
                                    if (m1542getLambda1$videomoleculecompose_prodGoogleAllVendorsRelease != null) {
                                        m1542getLambda1$videomoleculecompose_prodGoogleAllVendorsRelease.invoke(a0.d(e.f40358c0), c3969l, Integer.valueOf(((i38 >> 21) & 112) | 6));
                                        Unit unit2 = Unit.f71690a;
                                    }
                                    c3969l.k();
                                    c3969l.o(454923257);
                                    n14 = c3969l.n(rememberVideoMoleculeScrubIntentInterceptor);
                                    C14 = c3969l.C();
                                    if (!n14 || C14 == InterfaceC3967k.a.a()) {
                                        C14 = new VideoMoleculeKt$VideoMolecule$2$1$1(rememberVideoMoleculeScrubIntentInterceptor);
                                        c3969l.x(C14);
                                    }
                                    c3969l.k();
                                    TouchArea((Function0) C14, c3969l, 0);
                                    c3969l.o(454926726);
                                    if (interfaceC6511n5 != null) {
                                        interfaceC6511n5.invoke(a0.d(e.f40358c0), c3969l, Integer.valueOf(((i38 >> 24) & 112) | 6));
                                        Unit unit3 = Unit.f71690a;
                                    }
                                    c3969l.k();
                                    e.a aVar = e.f40358c0;
                                    VideoMoleculeCenterActionOverlayLayer(pVar6, rememberTimelineState, videoMoleculeInteractionState, rememberVideoMoleculeScrubIntentInterceptor, a0.d(aVar), c3969l, (i34 & 14) | 24576, 0);
                                    int i44 = i34 >> 3;
                                    VideoMoleculeControlsLayer(pVar3, rememberTimelineState, function0, function02, b11, c11, videoMoleculeInteractionState, z12, z13, function14, rememberVideoMoleculeScrubIntentInterceptor, a0.d(aVar), c3969l, (i44 & 14) | ((i38 << 12) & 29360128) | ((i38 << 18) & 234881024) | ((i38 << 6) & 1879048192), 48, 0);
                                    c3969l.o(454957060);
                                    if (interfaceC6512o3 != null) {
                                        interfaceC6512o3.invoke(Boolean.valueOf(rememberTimelineState.isBuffering()), a0.d(aVar), c3969l, Integer.valueOf((i44 & 896) | 48));
                                        Unit unit4 = Unit.f71690a;
                                    }
                                    c3969l.k();
                                    c3969l.f();
                                    interfaceC6512o4 = interfaceC6512o3;
                                    interfaceC2547p2 = interfaceC2547p3;
                                    interfaceC6511n4 = m1542getLambda1$videomoleculecompose_prodGoogleAllVendorsRelease;
                                    interfaceC6511n6 = interfaceC6511n5;
                                    pVar4 = pVar6;
                                    eVar3 = eVar2;
                                    function12 = function14;
                                    i35 = i43;
                                    interfaceC6512o5 = m1545getLambda4$videomoleculecompose_prodGoogleAllVendorsRelease;
                                    pVar5 = pVar3;
                                }
                                InterfaceC6511n<? super BasePlayerController, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n7 = interfaceC6511n3;
                                m02 = c3969l.m0();
                                if (m02 != null) {
                                    m02.G(new VideoMoleculeKt$VideoMolecule$3(playerController, onIntent, z11, z12, eVar3, interfaceC2547p2, i35, function12, interfaceC6511n4, interfaceC6511n6, pVar4, pVar5, interfaceC6512o5, interfaceC6512o4, interfaceC6511n7, i12, i13, i14));
                                    return;
                                }
                                return;
                            }
                            if ((i38 & 306783379) != 306783378) {
                            }
                            u11.Q0();
                            if ((i12 & 1) != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i21 != 0) {
                            }
                            if (i22 != 0) {
                            }
                            if ((128 & i14) != 0) {
                            }
                            if (i23 != 0) {
                            }
                            if (i24 != 0) {
                            }
                            if (i25 != 0) {
                            }
                            if (i27 != 0) {
                            }
                            if (i28 != 0) {
                            }
                            if (i31 != 0) {
                            }
                            if (i32 != 0) {
                            }
                            function14 = function13;
                            pVar3 = m1544getLambda3$videomoleculecompose_prodGoogleAllVendorsRelease;
                            interfaceC6512o3 = m1546getLambda5$videomoleculecompose_prodGoogleAllVendorsRelease;
                            u11.j0();
                            u11.o(-1805498687);
                            if (m1547getLambda6$videomoleculecompose_prodGoogleAllVendorsRelease != null) {
                            }
                            u11.k();
                            BasePlayerComposableController playerComposableController2 = playerController.playerComposableController();
                            InterfaceC2547p interfaceC2547p32 = d11;
                            ComposableStatesProvider statesProvider2 = playerComposableController2.statesProvider();
                            A4.c rememberPlayPauseButtonState2 = statesProvider2.rememberPlayPauseButtonState(u11, 0);
                            interfaceC6511n3 = m1547getLambda6$videomoleculecompose_prodGoogleAllVendorsRelease;
                            p<? super VideoMoleculeCenterActionState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar62 = m1543getLambda2$videomoleculecompose_prodGoogleAllVendorsRelease;
                            A4.h rememberPresentationState2 = statesProvider2.rememberPresentationState(null, u11, i19);
                            rememberTimelineState = statesProvider2.rememberTimelineState(u11, 0);
                            int rememberVideoMoleculeMediaResetVersion2 = VideoMoleculeMediaResetKt.rememberVideoMoleculeMediaResetVersion(playerController, u11, i38 & 14);
                            u11.o(-1805481978);
                            n11 = u11.n(playerController) | u11.r(rememberVideoMoleculeMediaResetVersion2);
                            C11 = u11.C();
                            if (!n11) {
                            }
                            C11 = new VideoMoleculeInteractionState();
                            u11.x(C11);
                            VideoMoleculeInteractionState videoMoleculeInteractionState2 = (VideoMoleculeInteractionState) C11;
                            u11.k();
                            u11.o(-1805478079);
                            n12 = u11.n(rememberTimelineState);
                            C12 = u11.C();
                            if (!n12) {
                            }
                            C12 = new VideoMoleculeKt$VideoMolecule$positionMsProvider$1$1(rememberTimelineState);
                            u11.x(C12);
                            Function0 function03 = (Function0) C12;
                            u11.k();
                            u11.o(-1805475063);
                            n13 = u11.n(rememberTimelineState);
                            C13 = u11.C();
                            if (!n13) {
                            }
                            C13 = new VideoMoleculeKt$VideoMolecule$bufferedPositionMsProvider$1$1(rememberTimelineState);
                            u11.x(C13);
                            Function0 function022 = (Function0) C13;
                            u11.k();
                            boolean b112 = rememberPlayPauseButtonState2.b();
                            boolean c112 = rememberPlayPauseButtonState2.c();
                            Function1<VideoMoleculeIntent, Unit> rememberVideoMoleculeScrubIntentInterceptor2 = rememberVideoMoleculeScrubIntentInterceptor(videoMoleculeInteractionState2, rememberTimelineState.isPlaying(), onIntent, u11, (i38 << 3) & 896);
                            VideoMoleculeEffects(videoMoleculeInteractionState2, b112, u11, 0);
                            int i422 = i38 >> 12;
                            V f72 = C5185h.f(InterfaceC6250b.a.o(), false);
                            I11 = u11.I();
                            A0 d122 = u11.d();
                            e f112 = c.f(u11, eVar2);
                            Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
                            if (u11.t()) {
                            }
                            Function2 f122 = E.f(u11, f72, u11, d122);
                            if (!u11.t()) {
                            }
                            a.d(I11, u11, I11, f122);
                            F1.b(u11, f112, InterfaceC2801g.a.f());
                            int i432 = i33;
                            m1548PlayerSurfaceLayervrY8oc(playerComposableController2, interfaceC2547p32, i432, rememberPresentationState2.c(), rememberPresentationState2.b(), m1545getLambda4$videomoleculecompose_prodGoogleAllVendorsRelease, null, u11, (i422 & 1008) | ((i34 << 9) & 458752), 64);
                            c3969l = u11;
                            c3969l.o(454920902);
                            if (m1542getLambda1$videomoleculecompose_prodGoogleAllVendorsRelease != null) {
                            }
                            c3969l.k();
                            c3969l.o(454923257);
                            n14 = c3969l.n(rememberVideoMoleculeScrubIntentInterceptor2);
                            C14 = c3969l.C();
                            if (!n14) {
                            }
                            C14 = new VideoMoleculeKt$VideoMolecule$2$1$1(rememberVideoMoleculeScrubIntentInterceptor2);
                            c3969l.x(C14);
                            c3969l.k();
                            TouchArea((Function0) C14, c3969l, 0);
                            c3969l.o(454926726);
                            if (interfaceC6511n5 != null) {
                            }
                            c3969l.k();
                            e.a aVar2 = e.f40358c0;
                            VideoMoleculeCenterActionOverlayLayer(pVar62, rememberTimelineState, videoMoleculeInteractionState2, rememberVideoMoleculeScrubIntentInterceptor2, a0.d(aVar2), c3969l, (i34 & 14) | 24576, 0);
                            int i442 = i34 >> 3;
                            VideoMoleculeControlsLayer(pVar3, rememberTimelineState, function03, function022, b112, c112, videoMoleculeInteractionState2, z12, z13, function14, rememberVideoMoleculeScrubIntentInterceptor2, a0.d(aVar2), c3969l, (i442 & 14) | ((i38 << 12) & 29360128) | ((i38 << 18) & 234881024) | ((i38 << 6) & 1879048192), 48, 0);
                            c3969l.o(454957060);
                            if (interfaceC6512o3 != null) {
                            }
                            c3969l.k();
                            c3969l.f();
                            interfaceC6512o4 = interfaceC6512o3;
                            interfaceC2547p2 = interfaceC2547p32;
                            interfaceC6511n4 = m1542getLambda1$videomoleculecompose_prodGoogleAllVendorsRelease;
                            interfaceC6511n6 = interfaceC6511n5;
                            pVar4 = pVar62;
                            eVar3 = eVar2;
                            function12 = function14;
                            i35 = i432;
                            interfaceC6512o5 = m1545getLambda4$videomoleculecompose_prodGoogleAllVendorsRelease;
                            pVar5 = pVar3;
                            InterfaceC6511n<? super BasePlayerController, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n72 = interfaceC6511n3;
                            m02 = c3969l.m0();
                            if (m02 != null) {
                            }
                        }
                        i38 |= i36;
                        i25 = i14 & UserVerificationMethods.USER_VERIFY_ALL;
                        if (i25 == 0) {
                        }
                        i27 = i14 & 2048;
                        if (i27 == 0) {
                        }
                        int i392 = i26;
                        i28 = i14 & 4096;
                        if (i28 == 0) {
                        }
                        i31 = i14 & 8192;
                        if (i31 == 0) {
                        }
                        i32 = i14 & 16384;
                        if (i32 == 0) {
                        }
                        if ((i38 & 306783379) != 306783378) {
                        }
                        u11.Q0();
                        if ((i12 & 1) != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i21 != 0) {
                        }
                        if (i22 != 0) {
                        }
                        if ((128 & i14) != 0) {
                        }
                        if (i23 != 0) {
                        }
                        if (i24 != 0) {
                        }
                        if (i25 != 0) {
                        }
                        if (i27 != 0) {
                        }
                        if (i28 != 0) {
                        }
                        if (i31 != 0) {
                        }
                        if (i32 != 0) {
                        }
                        function14 = function13;
                        pVar3 = m1544getLambda3$videomoleculecompose_prodGoogleAllVendorsRelease;
                        interfaceC6512o3 = m1546getLambda5$videomoleculecompose_prodGoogleAllVendorsRelease;
                        u11.j0();
                        u11.o(-1805498687);
                        if (m1547getLambda6$videomoleculecompose_prodGoogleAllVendorsRelease != null) {
                        }
                        u11.k();
                        BasePlayerComposableController playerComposableController22 = playerController.playerComposableController();
                        InterfaceC2547p interfaceC2547p322 = d11;
                        ComposableStatesProvider statesProvider22 = playerComposableController22.statesProvider();
                        A4.c rememberPlayPauseButtonState22 = statesProvider22.rememberPlayPauseButtonState(u11, 0);
                        interfaceC6511n3 = m1547getLambda6$videomoleculecompose_prodGoogleAllVendorsRelease;
                        p<? super VideoMoleculeCenterActionState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar622 = m1543getLambda2$videomoleculecompose_prodGoogleAllVendorsRelease;
                        A4.h rememberPresentationState22 = statesProvider22.rememberPresentationState(null, u11, i19);
                        rememberTimelineState = statesProvider22.rememberTimelineState(u11, 0);
                        int rememberVideoMoleculeMediaResetVersion22 = VideoMoleculeMediaResetKt.rememberVideoMoleculeMediaResetVersion(playerController, u11, i38 & 14);
                        u11.o(-1805481978);
                        n11 = u11.n(playerController) | u11.r(rememberVideoMoleculeMediaResetVersion22);
                        C11 = u11.C();
                        if (!n11) {
                        }
                        C11 = new VideoMoleculeInteractionState();
                        u11.x(C11);
                        VideoMoleculeInteractionState videoMoleculeInteractionState22 = (VideoMoleculeInteractionState) C11;
                        u11.k();
                        u11.o(-1805478079);
                        n12 = u11.n(rememberTimelineState);
                        C12 = u11.C();
                        if (!n12) {
                        }
                        C12 = new VideoMoleculeKt$VideoMolecule$positionMsProvider$1$1(rememberTimelineState);
                        u11.x(C12);
                        Function0 function032 = (Function0) C12;
                        u11.k();
                        u11.o(-1805475063);
                        n13 = u11.n(rememberTimelineState);
                        C13 = u11.C();
                        if (!n13) {
                        }
                        C13 = new VideoMoleculeKt$VideoMolecule$bufferedPositionMsProvider$1$1(rememberTimelineState);
                        u11.x(C13);
                        Function0 function0222 = (Function0) C13;
                        u11.k();
                        boolean b1122 = rememberPlayPauseButtonState22.b();
                        boolean c1122 = rememberPlayPauseButtonState22.c();
                        Function1<VideoMoleculeIntent, Unit> rememberVideoMoleculeScrubIntentInterceptor22 = rememberVideoMoleculeScrubIntentInterceptor(videoMoleculeInteractionState22, rememberTimelineState.isPlaying(), onIntent, u11, (i38 << 3) & 896);
                        VideoMoleculeEffects(videoMoleculeInteractionState22, b1122, u11, 0);
                        int i4222 = i38 >> 12;
                        V f722 = C5185h.f(InterfaceC6250b.a.o(), false);
                        I11 = u11.I();
                        A0 d1222 = u11.d();
                        e f1122 = c.f(u11, eVar2);
                        Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                        }
                        Function2 f1222 = E.f(u11, f722, u11, d1222);
                        if (!u11.t()) {
                        }
                        a.d(I11, u11, I11, f1222);
                        F1.b(u11, f1122, InterfaceC2801g.a.f());
                        int i4322 = i33;
                        m1548PlayerSurfaceLayervrY8oc(playerComposableController22, interfaceC2547p322, i4322, rememberPresentationState22.c(), rememberPresentationState22.b(), m1545getLambda4$videomoleculecompose_prodGoogleAllVendorsRelease, null, u11, (i4222 & 1008) | ((i34 << 9) & 458752), 64);
                        c3969l = u11;
                        c3969l.o(454920902);
                        if (m1542getLambda1$videomoleculecompose_prodGoogleAllVendorsRelease != null) {
                        }
                        c3969l.k();
                        c3969l.o(454923257);
                        n14 = c3969l.n(rememberVideoMoleculeScrubIntentInterceptor22);
                        C14 = c3969l.C();
                        if (!n14) {
                        }
                        C14 = new VideoMoleculeKt$VideoMolecule$2$1$1(rememberVideoMoleculeScrubIntentInterceptor22);
                        c3969l.x(C14);
                        c3969l.k();
                        TouchArea((Function0) C14, c3969l, 0);
                        c3969l.o(454926726);
                        if (interfaceC6511n5 != null) {
                        }
                        c3969l.k();
                        e.a aVar22 = e.f40358c0;
                        VideoMoleculeCenterActionOverlayLayer(pVar622, rememberTimelineState, videoMoleculeInteractionState22, rememberVideoMoleculeScrubIntentInterceptor22, a0.d(aVar22), c3969l, (i34 & 14) | 24576, 0);
                        int i4422 = i34 >> 3;
                        VideoMoleculeControlsLayer(pVar3, rememberTimelineState, function032, function0222, b1122, c1122, videoMoleculeInteractionState22, z12, z13, function14, rememberVideoMoleculeScrubIntentInterceptor22, a0.d(aVar22), c3969l, (i4422 & 14) | ((i38 << 12) & 29360128) | ((i38 << 18) & 234881024) | ((i38 << 6) & 1879048192), 48, 0);
                        c3969l.o(454957060);
                        if (interfaceC6512o3 != null) {
                        }
                        c3969l.k();
                        c3969l.f();
                        interfaceC6512o4 = interfaceC6512o3;
                        interfaceC2547p2 = interfaceC2547p322;
                        interfaceC6511n4 = m1542getLambda1$videomoleculecompose_prodGoogleAllVendorsRelease;
                        interfaceC6511n6 = interfaceC6511n5;
                        pVar4 = pVar622;
                        eVar3 = eVar2;
                        function12 = function14;
                        i35 = i4322;
                        interfaceC6512o5 = m1545getLambda4$videomoleculecompose_prodGoogleAllVendorsRelease;
                        pVar5 = pVar3;
                        InterfaceC6511n<? super BasePlayerController, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n722 = interfaceC6511n3;
                        m02 = c3969l.m0();
                        if (m02 != null) {
                        }
                    }
                }
                eVar2 = eVar;
                i21 = i14 & 32;
                if (i21 != 0) {
                }
                i22 = i14 & 64;
                if (i22 != 0) {
                }
                if ((i12 & 12582912) == 0) {
                }
                i23 = i14 & 256;
                if (i23 != 0) {
                }
                i24 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i24 == 0) {
                }
                i38 |= i36;
                i25 = i14 & UserVerificationMethods.USER_VERIFY_ALL;
                if (i25 == 0) {
                }
                i27 = i14 & 2048;
                if (i27 == 0) {
                }
                int i3922 = i26;
                i28 = i14 & 4096;
                if (i28 == 0) {
                }
                i31 = i14 & 8192;
                if (i31 == 0) {
                }
                i32 = i14 & 16384;
                if (i32 == 0) {
                }
                if ((i38 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i12 & 1) != 0) {
                }
                if (i18 != 0) {
                }
                if (i21 != 0) {
                }
                if (i22 != 0) {
                }
                if ((128 & i14) != 0) {
                }
                if (i23 != 0) {
                }
                if (i24 != 0) {
                }
                if (i25 != 0) {
                }
                if (i27 != 0) {
                }
                if (i28 != 0) {
                }
                if (i31 != 0) {
                }
                if (i32 != 0) {
                }
                function14 = function13;
                pVar3 = m1544getLambda3$videomoleculecompose_prodGoogleAllVendorsRelease;
                interfaceC6512o3 = m1546getLambda5$videomoleculecompose_prodGoogleAllVendorsRelease;
                u11.j0();
                u11.o(-1805498687);
                if (m1547getLambda6$videomoleculecompose_prodGoogleAllVendorsRelease != null) {
                }
                u11.k();
                BasePlayerComposableController playerComposableController222 = playerController.playerComposableController();
                InterfaceC2547p interfaceC2547p3222 = d11;
                ComposableStatesProvider statesProvider222 = playerComposableController222.statesProvider();
                A4.c rememberPlayPauseButtonState222 = statesProvider222.rememberPlayPauseButtonState(u11, 0);
                interfaceC6511n3 = m1547getLambda6$videomoleculecompose_prodGoogleAllVendorsRelease;
                p<? super VideoMoleculeCenterActionState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar6222 = m1543getLambda2$videomoleculecompose_prodGoogleAllVendorsRelease;
                A4.h rememberPresentationState222 = statesProvider222.rememberPresentationState(null, u11, i19);
                rememberTimelineState = statesProvider222.rememberTimelineState(u11, 0);
                int rememberVideoMoleculeMediaResetVersion222 = VideoMoleculeMediaResetKt.rememberVideoMoleculeMediaResetVersion(playerController, u11, i38 & 14);
                u11.o(-1805481978);
                n11 = u11.n(playerController) | u11.r(rememberVideoMoleculeMediaResetVersion222);
                C11 = u11.C();
                if (!n11) {
                }
                C11 = new VideoMoleculeInteractionState();
                u11.x(C11);
                VideoMoleculeInteractionState videoMoleculeInteractionState222 = (VideoMoleculeInteractionState) C11;
                u11.k();
                u11.o(-1805478079);
                n12 = u11.n(rememberTimelineState);
                C12 = u11.C();
                if (!n12) {
                }
                C12 = new VideoMoleculeKt$VideoMolecule$positionMsProvider$1$1(rememberTimelineState);
                u11.x(C12);
                Function0 function0322 = (Function0) C12;
                u11.k();
                u11.o(-1805475063);
                n13 = u11.n(rememberTimelineState);
                C13 = u11.C();
                if (!n13) {
                }
                C13 = new VideoMoleculeKt$VideoMolecule$bufferedPositionMsProvider$1$1(rememberTimelineState);
                u11.x(C13);
                Function0 function02222 = (Function0) C13;
                u11.k();
                boolean b11222 = rememberPlayPauseButtonState222.b();
                boolean c11222 = rememberPlayPauseButtonState222.c();
                Function1<VideoMoleculeIntent, Unit> rememberVideoMoleculeScrubIntentInterceptor222 = rememberVideoMoleculeScrubIntentInterceptor(videoMoleculeInteractionState222, rememberTimelineState.isPlaying(), onIntent, u11, (i38 << 3) & 896);
                VideoMoleculeEffects(videoMoleculeInteractionState222, b11222, u11, 0);
                int i42222 = i38 >> 12;
                V f7222 = C5185h.f(InterfaceC6250b.a.o(), false);
                I11 = u11.I();
                A0 d12222 = u11.d();
                e f11222 = c.f(u11, eVar2);
                Function0 a11222 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 f12222 = E.f(u11, f7222, u11, d12222);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, f12222);
                F1.b(u11, f11222, InterfaceC2801g.a.f());
                int i43222 = i33;
                m1548PlayerSurfaceLayervrY8oc(playerComposableController222, interfaceC2547p3222, i43222, rememberPresentationState222.c(), rememberPresentationState222.b(), m1545getLambda4$videomoleculecompose_prodGoogleAllVendorsRelease, null, u11, (i42222 & 1008) | ((i34 << 9) & 458752), 64);
                c3969l = u11;
                c3969l.o(454920902);
                if (m1542getLambda1$videomoleculecompose_prodGoogleAllVendorsRelease != null) {
                }
                c3969l.k();
                c3969l.o(454923257);
                n14 = c3969l.n(rememberVideoMoleculeScrubIntentInterceptor222);
                C14 = c3969l.C();
                if (!n14) {
                }
                C14 = new VideoMoleculeKt$VideoMolecule$2$1$1(rememberVideoMoleculeScrubIntentInterceptor222);
                c3969l.x(C14);
                c3969l.k();
                TouchArea((Function0) C14, c3969l, 0);
                c3969l.o(454926726);
                if (interfaceC6511n5 != null) {
                }
                c3969l.k();
                e.a aVar222 = e.f40358c0;
                VideoMoleculeCenterActionOverlayLayer(pVar6222, rememberTimelineState, videoMoleculeInteractionState222, rememberVideoMoleculeScrubIntentInterceptor222, a0.d(aVar222), c3969l, (i34 & 14) | 24576, 0);
                int i44222 = i34 >> 3;
                VideoMoleculeControlsLayer(pVar3, rememberTimelineState, function0322, function02222, b11222, c11222, videoMoleculeInteractionState222, z12, z13, function14, rememberVideoMoleculeScrubIntentInterceptor222, a0.d(aVar222), c3969l, (i44222 & 14) | ((i38 << 12) & 29360128) | ((i38 << 18) & 234881024) | ((i38 << 6) & 1879048192), 48, 0);
                c3969l.o(454957060);
                if (interfaceC6512o3 != null) {
                }
                c3969l.k();
                c3969l.f();
                interfaceC6512o4 = interfaceC6512o3;
                interfaceC2547p2 = interfaceC2547p3222;
                interfaceC6511n4 = m1542getLambda1$videomoleculecompose_prodGoogleAllVendorsRelease;
                interfaceC6511n6 = interfaceC6511n5;
                pVar4 = pVar6222;
                eVar3 = eVar2;
                function12 = function14;
                i35 = i43222;
                interfaceC6512o5 = m1545getLambda4$videomoleculecompose_prodGoogleAllVendorsRelease;
                pVar5 = pVar3;
                InterfaceC6511n<? super BasePlayerController, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n7222 = interfaceC6511n3;
                m02 = c3969l.m0();
                if (m02 != null) {
                }
            }
        }
        i18 = i14 & 16;
        if (i18 == 0) {
        }
        eVar2 = eVar;
        i21 = i14 & 32;
        if (i21 != 0) {
        }
        i22 = i14 & 64;
        if (i22 != 0) {
        }
        if ((i12 & 12582912) == 0) {
        }
        i23 = i14 & 256;
        if (i23 != 0) {
        }
        i24 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i24 == 0) {
        }
        i38 |= i36;
        i25 = i14 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i25 == 0) {
        }
        i27 = i14 & 2048;
        if (i27 == 0) {
        }
        int i39222 = i26;
        i28 = i14 & 4096;
        if (i28 == 0) {
        }
        i31 = i14 & 8192;
        if (i31 == 0) {
        }
        i32 = i14 & 16384;
        if (i32 == 0) {
        }
        if ((i38 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i12 & 1) != 0) {
        }
        if (i18 != 0) {
        }
        if (i21 != 0) {
        }
        if (i22 != 0) {
        }
        if ((128 & i14) != 0) {
        }
        if (i23 != 0) {
        }
        if (i24 != 0) {
        }
        if (i25 != 0) {
        }
        if (i27 != 0) {
        }
        if (i28 != 0) {
        }
        if (i31 != 0) {
        }
        if (i32 != 0) {
        }
        function14 = function13;
        pVar3 = m1544getLambda3$videomoleculecompose_prodGoogleAllVendorsRelease;
        interfaceC6512o3 = m1546getLambda5$videomoleculecompose_prodGoogleAllVendorsRelease;
        u11.j0();
        u11.o(-1805498687);
        if (m1547getLambda6$videomoleculecompose_prodGoogleAllVendorsRelease != null) {
        }
        u11.k();
        BasePlayerComposableController playerComposableController2222 = playerController.playerComposableController();
        InterfaceC2547p interfaceC2547p32222 = d11;
        ComposableStatesProvider statesProvider2222 = playerComposableController2222.statesProvider();
        A4.c rememberPlayPauseButtonState2222 = statesProvider2222.rememberPlayPauseButtonState(u11, 0);
        interfaceC6511n3 = m1547getLambda6$videomoleculecompose_prodGoogleAllVendorsRelease;
        p<? super VideoMoleculeCenterActionState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar62222 = m1543getLambda2$videomoleculecompose_prodGoogleAllVendorsRelease;
        A4.h rememberPresentationState2222 = statesProvider2222.rememberPresentationState(null, u11, i19);
        rememberTimelineState = statesProvider2222.rememberTimelineState(u11, 0);
        int rememberVideoMoleculeMediaResetVersion2222 = VideoMoleculeMediaResetKt.rememberVideoMoleculeMediaResetVersion(playerController, u11, i38 & 14);
        u11.o(-1805481978);
        n11 = u11.n(playerController) | u11.r(rememberVideoMoleculeMediaResetVersion2222);
        C11 = u11.C();
        if (!n11) {
        }
        C11 = new VideoMoleculeInteractionState();
        u11.x(C11);
        VideoMoleculeInteractionState videoMoleculeInteractionState2222 = (VideoMoleculeInteractionState) C11;
        u11.k();
        u11.o(-1805478079);
        n12 = u11.n(rememberTimelineState);
        C12 = u11.C();
        if (!n12) {
        }
        C12 = new VideoMoleculeKt$VideoMolecule$positionMsProvider$1$1(rememberTimelineState);
        u11.x(C12);
        Function0 function03222 = (Function0) C12;
        u11.k();
        u11.o(-1805475063);
        n13 = u11.n(rememberTimelineState);
        C13 = u11.C();
        if (!n13) {
        }
        C13 = new VideoMoleculeKt$VideoMolecule$bufferedPositionMsProvider$1$1(rememberTimelineState);
        u11.x(C13);
        Function0 function022222 = (Function0) C13;
        u11.k();
        boolean b112222 = rememberPlayPauseButtonState2222.b();
        boolean c112222 = rememberPlayPauseButtonState2222.c();
        Function1<VideoMoleculeIntent, Unit> rememberVideoMoleculeScrubIntentInterceptor2222 = rememberVideoMoleculeScrubIntentInterceptor(videoMoleculeInteractionState2222, rememberTimelineState.isPlaying(), onIntent, u11, (i38 << 3) & 896);
        VideoMoleculeEffects(videoMoleculeInteractionState2222, b112222, u11, 0);
        int i422222 = i38 >> 12;
        V f72222 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d122222 = u11.d();
        e f112222 = c.f(u11, eVar2);
        Function0 a112222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f122222 = E.f(u11, f72222, u11, d122222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f122222);
        F1.b(u11, f112222, InterfaceC2801g.a.f());
        int i432222 = i33;
        m1548PlayerSurfaceLayervrY8oc(playerComposableController2222, interfaceC2547p32222, i432222, rememberPresentationState2222.c(), rememberPresentationState2222.b(), m1545getLambda4$videomoleculecompose_prodGoogleAllVendorsRelease, null, u11, (i422222 & 1008) | ((i34 << 9) & 458752), 64);
        c3969l = u11;
        c3969l.o(454920902);
        if (m1542getLambda1$videomoleculecompose_prodGoogleAllVendorsRelease != null) {
        }
        c3969l.k();
        c3969l.o(454923257);
        n14 = c3969l.n(rememberVideoMoleculeScrubIntentInterceptor2222);
        C14 = c3969l.C();
        if (!n14) {
        }
        C14 = new VideoMoleculeKt$VideoMolecule$2$1$1(rememberVideoMoleculeScrubIntentInterceptor2222);
        c3969l.x(C14);
        c3969l.k();
        TouchArea((Function0) C14, c3969l, 0);
        c3969l.o(454926726);
        if (interfaceC6511n5 != null) {
        }
        c3969l.k();
        e.a aVar2222 = e.f40358c0;
        VideoMoleculeCenterActionOverlayLayer(pVar62222, rememberTimelineState, videoMoleculeInteractionState2222, rememberVideoMoleculeScrubIntentInterceptor2222, a0.d(aVar2222), c3969l, (i34 & 14) | 24576, 0);
        int i442222 = i34 >> 3;
        VideoMoleculeControlsLayer(pVar3, rememberTimelineState, function03222, function022222, b112222, c112222, videoMoleculeInteractionState2222, z12, z13, function14, rememberVideoMoleculeScrubIntentInterceptor2222, a0.d(aVar2222), c3969l, (i442222 & 14) | ((i38 << 12) & 29360128) | ((i38 << 18) & 234881024) | ((i38 << 6) & 1879048192), 48, 0);
        c3969l.o(454957060);
        if (interfaceC6512o3 != null) {
        }
        c3969l.k();
        c3969l.f();
        interfaceC6512o4 = interfaceC6512o3;
        interfaceC2547p2 = interfaceC2547p32222;
        interfaceC6511n4 = m1542getLambda1$videomoleculecompose_prodGoogleAllVendorsRelease;
        interfaceC6511n6 = interfaceC6511n5;
        pVar4 = pVar62222;
        eVar3 = eVar2;
        function12 = function14;
        i35 = i432222;
        interfaceC6512o5 = m1545getLambda4$videomoleculecompose_prodGoogleAllVendorsRelease;
        pVar5 = pVar3;
        InterfaceC6511n<? super BasePlayerController, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n72222 = interfaceC6511n3;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VideoMoleculeCenterActionOverlayLayer(p<? super VideoMoleculeCenterActionState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar, PlayerTimelineState playerTimelineState, VideoMoleculeInteractionState videoMoleculeInteractionState, Function1<? super VideoMoleculeIntent, Unit> function1, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        VideoMoleculeInteractionState videoMoleculeInteractionState2;
        e eVar2;
        Function1<? super VideoMoleculeIntent, Unit> function12;
        e eVar3;
        C3969l u11 = interfaceC3967k.u(-324083093);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(pVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(playerTimelineState) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
            videoMoleculeInteractionState2 = videoMoleculeInteractionState;
        } else {
            videoMoleculeInteractionState2 = videoMoleculeInteractionState;
            if ((i11 & 384) == 0) {
                i13 |= u11.n(videoMoleculeInteractionState) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.F(function1) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i14 = i12 & 16;
        if (i14 != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 16384 : 8192;
            if ((i13 & 9363) == 9362 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                if (pVar != null) {
                    J0 m02 = u11.m0();
                    if (m02 != null) {
                        m02.G(new VideoMoleculeKt$VideoMoleculeCenterActionOverlayLayer$slot$1(pVar, playerTimelineState, videoMoleculeInteractionState2, function1, eVar4, i11, i12));
                        return;
                    }
                    return;
                }
                function12 = function1;
                VideoMoleculeCenterAction videoMoleculeCenterAction = playerTimelineState.isFinished() ? VideoMoleculeCenterAction.Replay : VideoMoleculeCenterAction.Play;
                e eVar5 = eVar4;
                VideoMoleculeCenterActionState videoMoleculeCenterActionState = new VideoMoleculeCenterActionState(videoMoleculeCenterAction);
                u11.o(-342554266);
                boolean n11 = ((i13 & 7168) == 2048) | u11.n(videoMoleculeCenterAction);
                Object C11 = u11.C();
                if (n11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new VideoMoleculeKt$VideoMoleculeCenterActionOverlayLayer$onClick$1$1(function12, videoMoleculeCenterAction);
                    u11.x(C11);
                }
                Function0 function0 = (Function0) C11;
                u11.k();
                if (!playerTimelineState.isFinished() || videoMoleculeInteractionState.isScrubbing()) {
                    eVar3 = eVar5;
                    u11.o(-2029054863);
                    G.c(videoMoleculeInteractionState.isCenterPlayVisible() && !videoMoleculeInteractionState.isScrubbing(), eVar3, b.h(C8004n.d(150, 0, null, 6), 2), b.i(C8004n.d(150, 0, null, 6), 2), null, a1.c.c(-557645201, new VideoMoleculeKt$VideoMoleculeCenterActionOverlayLayer$1(pVar, videoMoleculeCenterActionState, function0), u11), u11, ((i13 >> 9) & 112) | 200064, 16);
                    u11 = u11;
                    u11.k();
                } else {
                    u11.o(-2029130317);
                    pVar.invoke(videoMoleculeCenterActionState, eVar5, function0, u11, Integer.valueOf((i13 >> 9) & 112));
                    eVar3 = eVar5;
                    u11.k();
                }
                eVar2 = eVar3;
            } else {
                u11.j();
                function12 = function1;
            }
            J0 m03 = u11.m0();
            if (m03 != null) {
                m03.G(new VideoMoleculeKt$VideoMoleculeCenterActionOverlayLayer$2(pVar, playerTimelineState, videoMoleculeInteractionState, function12, eVar2, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 9363) == 9362) {
        }
        if (i14 == 0) {
        }
        if (pVar != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VideoMoleculeControlsLayer(p<? super VideoMoleculeControlPanelState, ? super e, ? super Function1<? super VideoMoleculeIntent, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar, PlayerTimelineState playerTimelineState, Function0<Long> function0, Function0<Long> function02, boolean z11, boolean z12, VideoMoleculeInteractionState videoMoleculeInteractionState, boolean z13, boolean z14, Function1<? super Long, String> function1, Function1<? super VideoMoleculeIntent, Unit> function12, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        PlayerTimelineState playerTimelineState2;
        Function0<Long> function03;
        boolean z15;
        int i15;
        Object obj;
        int i16;
        int i17;
        int I11;
        boolean z16;
        Function1<? super Long, String> function13;
        e eVar2;
        int i18;
        e eVar3;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(1204729613);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = (u11.F(pVar) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i11 & 48) == 0) {
            playerTimelineState2 = playerTimelineState;
            i14 |= u11.n(playerTimelineState2) ? 32 : 16;
            if ((i13 & 4) == 0) {
                i14 |= 384;
            } else if ((i11 & 384) == 0) {
                function03 = function0;
                i14 |= u11.F(function03) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                if ((i13 & 8) != 0) {
                    i14 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    i14 |= u11.F(function02) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    if ((i13 & 16) == 0) {
                        i14 |= 24576;
                    } else if ((i11 & 24576) == 0) {
                        i14 |= u11.p(z11) ? 16384 : 8192;
                    }
                    if ((i13 & 32) == 0) {
                        i14 |= 196608;
                    } else if ((i11 & 196608) == 0) {
                        i14 |= u11.p(z12) ? 131072 : 65536;
                    }
                    if ((i13 & 64) == 0) {
                        i14 |= 1572864;
                    } else if ((i11 & 1572864) == 0) {
                        i14 |= u11.n(videoMoleculeInteractionState) ? 1048576 : 524288;
                        if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                            i14 |= 12582912;
                        } else if ((i11 & 12582912) == 0) {
                            z15 = z13;
                            i14 |= u11.p(z15) ? 8388608 : 4194304;
                            if ((i13 & 256) == 0) {
                                i14 |= 100663296;
                            } else if ((i11 & 100663296) == 0) {
                                i14 |= u11.p(z14) ? 67108864 : 33554432;
                                if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                                    i14 |= 805306368;
                                } else if ((i11 & 805306368) == 0) {
                                    i14 |= u11.F(function1) ? 536870912 : 268435456;
                                }
                                i15 = i14;
                                if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                    i16 = i12 | 6;
                                    obj = function12;
                                } else if ((i12 & 6) == 0) {
                                    obj = function12;
                                    i16 = i12 | (u11.F(obj) ? 4 : 2);
                                } else {
                                    obj = function12;
                                    i16 = i12;
                                }
                                i17 = i13 & 2048;
                                if (i17 != 0) {
                                    i16 |= 48;
                                } else if ((i12 & 48) == 0) {
                                    i16 |= u11.n(eVar) ? 32 : 16;
                                }
                                int i19 = i16;
                                if ((i15 & 306783379) != 306783378 && (i19 & 19) == 18 && u11.b()) {
                                    u11.j();
                                    eVar3 = eVar;
                                    function13 = function1;
                                } else {
                                    e eVar4 = i17 != 0 ? e.f40358c0 : eVar;
                                    V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                                    I11 = u11.I();
                                    A0 d11 = u11.d();
                                    e f11 = c.f(u11, eVar4);
                                    e eVar5 = eVar4;
                                    Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                                    if (u11.t()) {
                                        u11.H(a11);
                                    } else {
                                        u11.e();
                                    }
                                    Function2 f12 = E.f(u11, f7, u11, d11);
                                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                        a.d(I11, u11, I11, f12);
                                    }
                                    F1.b(u11, f11, InterfaceC2801g.a.f());
                                    C5187j c5187j = C5187j.f39515a;
                                    u11.o(868826547);
                                    if (pVar == null) {
                                        eVar2 = eVar5;
                                        function13 = function1;
                                        i18 = 2;
                                        z16 = false;
                                    } else {
                                        boolean isFinished = playerTimelineState2.isFinished();
                                        z16 = false;
                                        function13 = function1;
                                        eVar2 = eVar5;
                                        i18 = 2;
                                        pVar.invoke(new VideoMoleculeControlPanelState(new SlimTimeBarState(playerTimelineState2.getDurationMs(), function03, function02, playerTimelineState2.isSeekEnabled()), new VideoMoleculePlayPauseState(isFinished || z11, z12), function1, z15, z14, isFinished, videoMoleculeInteractionState.isScrubbing()), c5187j.a(e.f40358c0, InterfaceC6250b.a.b()), obj, u11, Integer.valueOf((i19 << 6) & 896));
                                    }
                                    u11.k();
                                    u11.o(868857133);
                                    if (videoMoleculeInteractionState.isScrubbingOverlayVisible$videomoleculecompose_prodGoogleAllVendorsRelease()) {
                                        VideoMoleculeScrubbingOverlayKt.VideoMoleculeScrubbingOverlay(function13.invoke(Long.valueOf(videoMoleculeInteractionState.getCurrentScrubPositionMs$videomoleculecompose_prodGoogleAllVendorsRelease())), function13.invoke(Long.valueOf(playerTimelineState.getDurationMs())), z13, ((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())).orientation == i18 ? true : z16, u11, (i15 >> 15) & 896);
                                    }
                                    u11.k();
                                    u11.f();
                                    eVar3 = eVar2;
                                }
                                m02 = u11.m0();
                                if (m02 != null) {
                                    m02.G(new VideoMoleculeKt$VideoMoleculeControlsLayer$2(pVar, playerTimelineState, function0, function02, z11, z12, videoMoleculeInteractionState, z13, z14, function13, function12, eVar3, i11, i12, i13));
                                    return;
                                }
                                return;
                            }
                            if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                            }
                            i15 = i14;
                            if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                            }
                            i17 = i13 & 2048;
                            if (i17 != 0) {
                            }
                            int i192 = i16;
                            if ((i15 & 306783379) != 306783378) {
                            }
                            if (i17 != 0) {
                            }
                            V f72 = C5185h.f(InterfaceC6250b.a.o(), false);
                            I11 = u11.I();
                            A0 d112 = u11.d();
                            e f112 = c.f(u11, eVar4);
                            e eVar52 = eVar4;
                            Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
                            if (u11.t()) {
                            }
                            Function2 f122 = E.f(u11, f72, u11, d112);
                            if (!u11.t()) {
                            }
                            a.d(I11, u11, I11, f122);
                            F1.b(u11, f112, InterfaceC2801g.a.f());
                            C5187j c5187j2 = C5187j.f39515a;
                            u11.o(868826547);
                            if (pVar == null) {
                            }
                            u11.k();
                            u11.o(868857133);
                            if (videoMoleculeInteractionState.isScrubbingOverlayVisible$videomoleculecompose_prodGoogleAllVendorsRelease()) {
                            }
                            u11.k();
                            u11.f();
                            eVar3 = eVar2;
                            m02 = u11.m0();
                            if (m02 != null) {
                            }
                        }
                        z15 = z13;
                        if ((i13 & 256) == 0) {
                        }
                        if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                        }
                        i15 = i14;
                        if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                        }
                        i17 = i13 & 2048;
                        if (i17 != 0) {
                        }
                        int i1922 = i16;
                        if ((i15 & 306783379) != 306783378) {
                        }
                        if (i17 != 0) {
                        }
                        V f722 = C5185h.f(InterfaceC6250b.a.o(), false);
                        I11 = u11.I();
                        A0 d1122 = u11.d();
                        e f1122 = c.f(u11, eVar4);
                        e eVar522 = eVar4;
                        Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                        }
                        Function2 f1222 = E.f(u11, f722, u11, d1122);
                        if (!u11.t()) {
                        }
                        a.d(I11, u11, I11, f1222);
                        F1.b(u11, f1122, InterfaceC2801g.a.f());
                        C5187j c5187j22 = C5187j.f39515a;
                        u11.o(868826547);
                        if (pVar == null) {
                        }
                        u11.k();
                        u11.o(868857133);
                        if (videoMoleculeInteractionState.isScrubbingOverlayVisible$videomoleculecompose_prodGoogleAllVendorsRelease()) {
                        }
                        u11.k();
                        u11.f();
                        eVar3 = eVar2;
                        m02 = u11.m0();
                        if (m02 != null) {
                        }
                    }
                    if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    }
                    z15 = z13;
                    if ((i13 & 256) == 0) {
                    }
                    if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    }
                    i15 = i14;
                    if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                    }
                    i17 = i13 & 2048;
                    if (i17 != 0) {
                    }
                    int i19222 = i16;
                    if ((i15 & 306783379) != 306783378) {
                    }
                    if (i17 != 0) {
                    }
                    V f7222 = C5185h.f(InterfaceC6250b.a.o(), false);
                    I11 = u11.I();
                    A0 d11222 = u11.d();
                    e f11222 = c.f(u11, eVar4);
                    e eVar5222 = eVar4;
                    Function0 a11222 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 f12222 = E.f(u11, f7222, u11, d11222);
                    if (!u11.t()) {
                    }
                    a.d(I11, u11, I11, f12222);
                    F1.b(u11, f11222, InterfaceC2801g.a.f());
                    C5187j c5187j222 = C5187j.f39515a;
                    u11.o(868826547);
                    if (pVar == null) {
                    }
                    u11.k();
                    u11.o(868857133);
                    if (videoMoleculeInteractionState.isScrubbingOverlayVisible$videomoleculecompose_prodGoogleAllVendorsRelease()) {
                    }
                    u11.k();
                    u11.f();
                    eVar3 = eVar2;
                    m02 = u11.m0();
                    if (m02 != null) {
                    }
                }
                if ((i13 & 16) == 0) {
                }
                if ((i13 & 32) == 0) {
                }
                if ((i13 & 64) == 0) {
                }
                if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                }
                z15 = z13;
                if ((i13 & 256) == 0) {
                }
                if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                }
                i15 = i14;
                if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                }
                i17 = i13 & 2048;
                if (i17 != 0) {
                }
                int i192222 = i16;
                if ((i15 & 306783379) != 306783378) {
                }
                if (i17 != 0) {
                }
                V f72222 = C5185h.f(InterfaceC6250b.a.o(), false);
                I11 = u11.I();
                A0 d112222 = u11.d();
                e f112222 = c.f(u11, eVar4);
                e eVar52222 = eVar4;
                Function0 a112222 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 f122222 = E.f(u11, f72222, u11, d112222);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, f122222);
                F1.b(u11, f112222, InterfaceC2801g.a.f());
                C5187j c5187j2222 = C5187j.f39515a;
                u11.o(868826547);
                if (pVar == null) {
                }
                u11.k();
                u11.o(868857133);
                if (videoMoleculeInteractionState.isScrubbingOverlayVisible$videomoleculecompose_prodGoogleAllVendorsRelease()) {
                }
                u11.k();
                u11.f();
                eVar3 = eVar2;
                m02 = u11.m0();
                if (m02 != null) {
                }
            }
            function03 = function0;
            if ((i13 & 8) != 0) {
            }
            if ((i13 & 16) == 0) {
            }
            if ((i13 & 32) == 0) {
            }
            if ((i13 & 64) == 0) {
            }
            if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            }
            z15 = z13;
            if ((i13 & 256) == 0) {
            }
            if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            }
            i15 = i14;
            if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            }
            i17 = i13 & 2048;
            if (i17 != 0) {
            }
            int i1922222 = i16;
            if ((i15 & 306783379) != 306783378) {
            }
            if (i17 != 0) {
            }
            V f722222 = C5185h.f(InterfaceC6250b.a.o(), false);
            I11 = u11.I();
            A0 d1122222 = u11.d();
            e f1122222 = c.f(u11, eVar4);
            e eVar522222 = eVar4;
            Function0 a1122222 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f1222222 = E.f(u11, f722222, u11, d1122222);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f1222222);
            F1.b(u11, f1122222, InterfaceC2801g.a.f());
            C5187j c5187j22222 = C5187j.f39515a;
            u11.o(868826547);
            if (pVar == null) {
            }
            u11.k();
            u11.o(868857133);
            if (videoMoleculeInteractionState.isScrubbingOverlayVisible$videomoleculecompose_prodGoogleAllVendorsRelease()) {
            }
            u11.k();
            u11.f();
            eVar3 = eVar2;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        playerTimelineState2 = playerTimelineState;
        if ((i13 & 4) == 0) {
        }
        function03 = function0;
        if ((i13 & 8) != 0) {
        }
        if ((i13 & 16) == 0) {
        }
        if ((i13 & 32) == 0) {
        }
        if ((i13 & 64) == 0) {
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
        }
        z15 = z13;
        if ((i13 & 256) == 0) {
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
        }
        i15 = i14;
        if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
        }
        i17 = i13 & 2048;
        if (i17 != 0) {
        }
        int i19222222 = i16;
        if ((i15 & 306783379) != 306783378) {
        }
        if (i17 != 0) {
        }
        V f7222222 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d11222222 = u11.d();
        e f11222222 = c.f(u11, eVar4);
        e eVar5222222 = eVar4;
        Function0 a11222222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f12222222 = E.f(u11, f7222222, u11, d11222222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f12222222);
        F1.b(u11, f11222222, InterfaceC2801g.a.f());
        C5187j c5187j222222 = C5187j.f39515a;
        u11.o(868826547);
        if (pVar == null) {
        }
        u11.k();
        u11.o(868857133);
        if (videoMoleculeInteractionState.isScrubbingOverlayVisible$videomoleculecompose_prodGoogleAllVendorsRelease()) {
        }
        u11.k();
        u11.f();
        eVar3 = eVar2;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VideoMoleculeEffects(VideoMoleculeInteractionState videoMoleculeInteractionState, boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-214348364);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(videoMoleculeInteractionState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            Boolean valueOf = Boolean.valueOf(z11);
            u11.o(-92174105);
            int i13 = i12 & 14;
            boolean z12 = ((i12 & 112) == 32) | (i13 == 4);
            Object C11 = u11.C();
            if (z12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new VideoMoleculeKt$VideoMoleculeEffects$1$1(videoMoleculeInteractionState, z11, null);
                u11.x(C11);
            }
            u11.k();
            Q.g(videoMoleculeInteractionState, valueOf, (Function2) C11, u11);
            u11.o(-92159274);
            boolean z13 = i13 == 4;
            Object C12 = u11.C();
            if (z13 || C12 == InterfaceC3967k.a.a()) {
                C12 = new VideoMoleculeKt$VideoMoleculeEffects$2$1(videoMoleculeInteractionState, null);
                u11.x(C12);
            }
            u11.k();
            Q.e(u11, videoMoleculeInteractionState, (Function2) C12);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new VideoMoleculeKt$VideoMoleculeEffects$3(videoMoleculeInteractionState, z11, i11));
        }
    }

    private static final Function1<VideoMoleculeIntent, Unit> rememberVideoMoleculeScrubIntentInterceptor(VideoMoleculeInteractionState videoMoleculeInteractionState, boolean z11, Function1<? super VideoMoleculeIntent, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(-1704093651);
        InterfaceC3978p0 l11 = n1.l(function1, interfaceC3967k);
        InterfaceC3978p0 l12 = n1.l(Boolean.valueOf(z11), interfaceC3967k);
        interfaceC3967k.o(-1311509417);
        boolean z12 = (((i11 & 14) ^ 6) > 4 && interfaceC3967k.n(videoMoleculeInteractionState)) || (i11 & 6) == 4;
        Object C11 = interfaceC3967k.C();
        if (z12 || C11 == InterfaceC3967k.a.a()) {
            C11 = new VideoMoleculeKt$rememberVideoMoleculeScrubIntentInterceptor$1$1(videoMoleculeInteractionState, l12, l11);
            interfaceC3967k.x(C11);
        }
        Function1<VideoMoleculeIntent, Unit> function12 = (Function1) C11;
        interfaceC3967k.k();
        interfaceC3967k.k();
        return function12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<VideoMoleculeIntent, Unit> rememberVideoMoleculeScrubIntentInterceptor$lambda$6(A1<? extends Function1<? super VideoMoleculeIntent, Unit>> a12) {
        return (Function1) a12.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberVideoMoleculeScrubIntentInterceptor$lambda$7(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }
}
