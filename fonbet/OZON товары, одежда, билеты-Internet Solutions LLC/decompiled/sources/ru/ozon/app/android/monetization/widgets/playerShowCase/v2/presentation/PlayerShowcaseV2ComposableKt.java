package ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation;

import B1.InterfaceC2547p;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.u3;
import K00.b;
import Pk0.h;
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
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5182e;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.material.e0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v2.data.PlayerShowcaseV2DTO;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v2.di.PlayerShowcaseV2Component;
import ru.ozon.app.android.video.manager.ExoManager;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.SingleInstancePlayerController;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.app.android.videomoleculecompose.VideoMoleculeKt;
import ru.ozon.app.android.videomoleculecompose.intent.VideoMoleculeIntent;
import ru.ozon.app.android.videomoleculecompose.intent.VideoMoleculeIntentHandlerKt;
import u0.C9915y;
import v0.C10164d;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u001d²\u0006\u000e\u0010\u0011\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/monetization/widgets/playerShowCase/v2/presentation/PlayerShowcaseV2VI;", "item", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v2/di/PlayerShowcaseV2Component;", "component", "Landroidx/compose/ui/e;", "modifier", "", "PlayerShowcaseV2Composable", "(Lru/ozon/app/android/monetization/widgets/playerShowCase/v2/presentation/PlayerShowcaseV2VI;Lru/ozon/app/android/monetization/widgets/playerShowCase/v2/di/PlayerShowcaseV2Component;Landroidx/compose/ui/e;LS0/k;II)V", "", "label", "", "checked", "Lkotlin/Function1;", "onCheckedChange", "ToggleRow", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;LS0/k;I)V", "isFullscreenState", "isCompactControlsToggle", "isCropScaleToggle", "customGradient", "customOverlay", "customCenterActionOverlay", "customControlPanel", "customBufferingOverlay", "customPlayPauseInControlPanel", "customTimeBarInControlPanel", "customModeButtonInControlPanel", "customTimeFormatter", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PlayerShowcaseV2ComposableKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayerShowcaseV2DTO.VideoFormat.values().length];
            try {
                iArr[PlayerShowcaseV2DTO.VideoFormat.MP4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerShowcaseV2DTO.VideoFormat.HLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0393  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PlayerShowcaseV2Composable(@NotNull PlayerShowcaseV2VI item, @NotNull PlayerShowcaseV2Component component, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        VideoController videoController;
        boolean s11;
        Object C11;
        SingleInstancePlayerController singleInstancePlayerController;
        boolean n11;
        Object C12;
        int i14;
        Object progressiveExoManager;
        boolean F11;
        Object C13;
        Object C14;
        Object b11;
        Object b12;
        Object b13;
        Object b14;
        Object b15;
        Object b16;
        Object b17;
        Object b18;
        Object b19;
        Object b21;
        Object b22;
        Object b23;
        int I11;
        Object C15;
        InterfaceC3978p0 interfaceC3978p0;
        InterfaceC3978p0 interfaceC3978p02;
        InterfaceC3978p0 interfaceC3978p03;
        InterfaceC3978p0 interfaceC3978p04;
        InterfaceC3978p0 interfaceC3978p05;
        InterfaceC3978p0 interfaceC3978p06;
        InterfaceC3978p0 interfaceC3978p07;
        InterfaceC3978p0 interfaceC3978p08;
        InterfaceC3978p0 interfaceC3978p09;
        InterfaceC3978p0 interfaceC3978p010;
        InterfaceC3978p0 interfaceC3978p011;
        boolean n12;
        Object C16;
        long j11;
        e b24;
        C3969l c3969l;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(component, "component");
        C3969l u11 = interfaceC3967k.u(293380754);
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
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i13 & 147) == 146 || !u11.b()) {
                e eVar4 = i15 == 0 ? e.f40358c0 : eVar2;
                videoController = component.getVideoController();
                long id2 = item.getId();
                u11.o(1621433679);
                s11 = u11.s(id2);
                C11 = u11.C();
                if (!s11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = VideoController.DefaultImpls.getSingleInstancePlayerController$default(videoController, null, 1, null);
                    u11.x(C11);
                }
                singleInstancePlayerController = (SingleInstancePlayerController) C11;
                u11.k();
                Object videoFormat = item.getVideoFormat();
                u11.o(1621437277);
                n11 = u11.n(videoFormat);
                C12 = u11.C();
                if (!n11 || C12 == InterfaceC3967k.a.a()) {
                    i14 = WhenMappings.$EnumSwitchMapping$0[item.getVideoFormat().ordinal()];
                    if (i14 != 1) {
                        progressiveExoManager = videoController.getProgressiveExoManager();
                    } else {
                        if (i14 != 2) {
                            throw new o();
                        }
                        progressiveExoManager = videoController.getExoManagerLive();
                    }
                    C12 = progressiveExoManager;
                    u11.x(C12);
                }
                ExoManager exoManager = (ExoManager) C12;
                u11.k();
                String videoUrl = item.getVideoUrl();
                u11.o(1621447570);
                F11 = ((i13 & 14) != 4) | u11.F(singleInstancePlayerController) | u11.F(exoManager);
                C13 = u11.C();
                if (!F11 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$1$1(singleInstancePlayerController, item, exoManager);
                    u11.x(C13);
                }
                u11.k();
                Q.b(singleInstancePlayerController, videoUrl, (Function1) C13, u11);
                u11.o(1621463228);
                C14 = u11.C();
                if (C14 == InterfaceC3967k.a.a()) {
                    C14 = n1.f(Boolean.FALSE, D1.f25195a);
                    u11.x(C14);
                }
                InterfaceC3978p0 interfaceC3978p012 = (InterfaceC3978p0) C14;
                b11 = h.b(u11, 1621465468);
                if (b11 == InterfaceC3967k.a.a()) {
                    b11 = n1.f(Boolean.FALSE, D1.f25195a);
                    u11.x(b11);
                }
                InterfaceC3978p0 interfaceC3978p013 = (InterfaceC3978p0) b11;
                b12 = h.b(u11, 1621467516);
                if (b12 == InterfaceC3967k.a.a()) {
                    b12 = n1.f(Boolean.FALSE, D1.f25195a);
                    u11.x(b12);
                }
                InterfaceC3978p0 interfaceC3978p014 = (InterfaceC3978p0) b12;
                b13 = h.b(u11, 1621469468);
                if (b13 == InterfaceC3967k.a.a()) {
                    b13 = n1.f(Boolean.FALSE, D1.f25195a);
                    u11.x(b13);
                }
                InterfaceC3978p0 interfaceC3978p015 = (InterfaceC3978p0) b13;
                b14 = h.b(u11, 1621471388);
                if (b14 == InterfaceC3967k.a.a()) {
                    b14 = n1.f(Boolean.FALSE, D1.f25195a);
                    u11.x(b14);
                }
                InterfaceC3978p0 interfaceC3978p016 = (InterfaceC3978p0) b14;
                b15 = h.b(u11, 1621473692);
                if (b15 == InterfaceC3967k.a.a()) {
                    b15 = n1.f(Boolean.FALSE, D1.f25195a);
                    u11.x(b15);
                }
                InterfaceC3978p0 interfaceC3978p017 = (InterfaceC3978p0) b15;
                b16 = h.b(u11, 1621475772);
                if (b16 == InterfaceC3967k.a.a()) {
                    b16 = n1.f(Boolean.FALSE, D1.f25195a);
                    u11.x(b16);
                }
                InterfaceC3978p0 interfaceC3978p018 = (InterfaceC3978p0) b16;
                b17 = h.b(u11, 1621477980);
                if (b17 == InterfaceC3967k.a.a()) {
                    b17 = n1.f(Boolean.FALSE, D1.f25195a);
                    u11.x(b17);
                }
                InterfaceC3978p0 interfaceC3978p019 = (InterfaceC3978p0) b17;
                b18 = h.b(u11, 1621480412);
                if (b18 == InterfaceC3967k.a.a()) {
                    b18 = n1.f(Boolean.FALSE, D1.f25195a);
                    u11.x(b18);
                }
                InterfaceC3978p0 interfaceC3978p020 = (InterfaceC3978p0) b18;
                b19 = h.b(u11, 1621482780);
                if (b19 == InterfaceC3967k.a.a()) {
                    b19 = n1.f(Boolean.FALSE, D1.f25195a);
                    u11.x(b19);
                }
                InterfaceC3978p0 interfaceC3978p021 = (InterfaceC3978p0) b19;
                b21 = h.b(u11, 1621485244);
                if (b21 == InterfaceC3967k.a.a()) {
                    b21 = n1.f(Boolean.FALSE, D1.f25195a);
                    u11.x(b21);
                }
                InterfaceC3978p0 interfaceC3978p022 = (InterfaceC3978p0) b21;
                b22 = h.b(u11, 1621487356);
                if (b22 == InterfaceC3967k.a.a()) {
                    b22 = n1.f(Boolean.FALSE, D1.f25195a);
                    u11.x(b22);
                }
                InterfaceC3978p0 interfaceC3978p023 = (InterfaceC3978p0) b22;
                b23 = h.b(u11, 1621492906);
                if (b23 == InterfaceC3967k.a.a()) {
                    b23 = new PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$onIntent$1$1(interfaceC3978p012);
                    u11.x(b23);
                }
                u11.k();
                Function1<VideoMoleculeIntent, Unit> rememberDefaultVideoMoleculeIntentHandler = VideoMoleculeIntentHandlerKt.rememberDefaultVideoMoleculeIntentHandler(singleInstancePlayerController, (Function1) b23, u11, 48);
                C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f7 = c.f(u11, eVar4);
                Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a12);
                }
                Function2 g10 = b.g(u11, a11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, g10);
                }
                F1.b(u11, f7, InterfaceC2801g.a.f());
                C5179b.i n13 = C5179b.n(12);
                float f11 = 16;
                float f12 = 8;
                C9915y c9915y = new C9915y(f11, f12, f11, f12);
                u11.o(-184276695);
                C15 = u11.C();
                if (C15 != InterfaceC3967k.a.a()) {
                    Object playerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1 = new PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1(interfaceC3978p013, interfaceC3978p014, interfaceC3978p015, interfaceC3978p016, interfaceC3978p017, interfaceC3978p018, interfaceC3978p019, interfaceC3978p020, interfaceC3978p021, interfaceC3978p022, interfaceC3978p023);
                    interfaceC3978p0 = interfaceC3978p023;
                    interfaceC3978p02 = interfaceC3978p022;
                    interfaceC3978p03 = interfaceC3978p021;
                    interfaceC3978p04 = interfaceC3978p020;
                    interfaceC3978p05 = interfaceC3978p019;
                    interfaceC3978p06 = interfaceC3978p018;
                    interfaceC3978p07 = interfaceC3978p017;
                    interfaceC3978p08 = interfaceC3978p016;
                    interfaceC3978p09 = interfaceC3978p015;
                    interfaceC3978p010 = interfaceC3978p014;
                    interfaceC3978p011 = interfaceC3978p013;
                    u11.x(playerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1);
                    C15 = playerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1;
                } else {
                    interfaceC3978p0 = interfaceC3978p023;
                    interfaceC3978p02 = interfaceC3978p022;
                    interfaceC3978p03 = interfaceC3978p021;
                    interfaceC3978p04 = interfaceC3978p020;
                    interfaceC3978p05 = interfaceC3978p019;
                    interfaceC3978p06 = interfaceC3978p018;
                    interfaceC3978p07 = interfaceC3978p017;
                    interfaceC3978p08 = interfaceC3978p016;
                    interfaceC3978p09 = interfaceC3978p015;
                    interfaceC3978p010 = interfaceC3978p014;
                    interfaceC3978p011 = interfaceC3978p013;
                }
                u11.k();
                e eVar5 = eVar4;
                C10164d.b(null, null, c9915y, n13, null, null, false, (Function1) C15, u11, 100688256, 235);
                u11.o(-184236429);
                n12 = u11.n(rememberDefaultVideoMoleculeIntentHandler);
                C16 = u11.C();
                if (!n12 || C16 == InterfaceC3967k.a.a()) {
                    C16 = new PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$customOnIntent$1$1(rememberDefaultVideoMoleculeIntentHandler);
                    u11.x(C16);
                }
                Function1 function1 = (Function1) C16;
                u11.k();
                e.a aVar = e.f40358c0;
                j11 = C7807Z.f72248b;
                b24 = androidx.compose.foundation.e.b(aVar, j11, y0.a());
                e a13 = C5182e.a(a0.e(T.h(b24, 0.0f, 30, 1), 1.0f), PlayerShowcaseV2Composable$lambda$4(interfaceC3978p012) ? 0.7f : 1.0f, false);
                InterfaceC2547p a14 = !PlayerShowcaseV2Composable$lambda$10(interfaceC3978p010) ? InterfaceC2547p.a.a() : InterfaceC2547p.a.d();
                if (!PlayerShowcaseV2Composable$lambda$13(interfaceC3978p09)) {
                    u11.o(-184219076);
                    c3969l = u11;
                    VideoMoleculeKt.VideoMolecule(singleInstancePlayerController, function1, PlayerShowcaseV2Composable$lambda$4(interfaceC3978p012), PlayerShowcaseV2Composable$lambda$7(interfaceC3978p011), a13, a14, 0, null, ComposableSingletons$PlayerShowcaseV2ComposableKt.INSTANCE.m817getLambda1$monetization_prodGoogleAllVendorsRelease(), null, null, null, null, null, null, c3969l, 100663296, 0, 32448);
                    c3969l.k();
                } else if (PlayerShowcaseV2Composable$lambda$16(interfaceC3978p08)) {
                    u11.o(-184204688);
                    c3969l = u11;
                    VideoMoleculeKt.VideoMolecule(singleInstancePlayerController, function1, PlayerShowcaseV2Composable$lambda$4(interfaceC3978p012), PlayerShowcaseV2Composable$lambda$7(interfaceC3978p011), a13, a14, 0, null, null, ComposableSingletons$PlayerShowcaseV2ComposableKt.INSTANCE.m820getLambda2$monetization_prodGoogleAllVendorsRelease(), null, null, null, null, null, c3969l, 805306368, 0, 32192);
                    c3969l.k();
                } else if (PlayerShowcaseV2Composable$lambda$19(interfaceC3978p07)) {
                    u11.o(-184190228);
                    c3969l = u11;
                    VideoMoleculeKt.VideoMolecule(singleInstancePlayerController, function1, PlayerShowcaseV2Composable$lambda$4(interfaceC3978p012), PlayerShowcaseV2Composable$lambda$7(interfaceC3978p011), a13, a14, 0, null, null, null, ComposableSingletons$PlayerShowcaseV2ComposableKt.INSTANCE.m821getLambda3$monetization_prodGoogleAllVendorsRelease(), null, null, null, null, c3969l, 0, 6, 31680);
                    c3969l.k();
                } else if (PlayerShowcaseV2Composable$lambda$22(interfaceC3978p06)) {
                    u11.o(-184174134);
                    c3969l = u11;
                    VideoMoleculeKt.VideoMolecule(singleInstancePlayerController, function1, PlayerShowcaseV2Composable$lambda$4(interfaceC3978p012), PlayerShowcaseV2Composable$lambda$7(interfaceC3978p011), a13, a14, 0, null, null, null, null, ComposableSingletons$PlayerShowcaseV2ComposableKt.INSTANCE.m822getLambda4$monetization_prodGoogleAllVendorsRelease(), null, null, null, c3969l, 0, 48, 30656);
                    c3969l.k();
                } else if (PlayerShowcaseV2Composable$lambda$25(interfaceC3978p05)) {
                    u11.o(-184158006);
                    c3969l = u11;
                    VideoMoleculeKt.VideoMolecule(singleInstancePlayerController, function1, PlayerShowcaseV2Composable$lambda$4(interfaceC3978p012), PlayerShowcaseV2Composable$lambda$7(interfaceC3978p011), a13, a14, 0, null, null, null, null, null, null, ComposableSingletons$PlayerShowcaseV2ComposableKt.INSTANCE.m823getLambda5$monetization_prodGoogleAllVendorsRelease(), null, c3969l, 0, 3072, 24512);
                    c3969l.k();
                } else if (PlayerShowcaseV2Composable$lambda$28(interfaceC3978p04)) {
                    u11.o(-184142036);
                    c3969l = u11;
                    VideoMoleculeKt.VideoMolecule(singleInstancePlayerController, function1, PlayerShowcaseV2Composable$lambda$4(interfaceC3978p012), PlayerShowcaseV2Composable$lambda$7(interfaceC3978p011), a13, a14, 0, null, null, null, null, ComposableSingletons$PlayerShowcaseV2ComposableKt.INSTANCE.m825getLambda7$monetization_prodGoogleAllVendorsRelease(), null, null, null, c3969l, 0, 48, 30656);
                    c3969l.k();
                } else if (PlayerShowcaseV2Composable$lambda$31(interfaceC3978p03)) {
                    u11.o(-184107037);
                    c3969l = u11;
                    VideoMoleculeKt.VideoMolecule(singleInstancePlayerController, function1, PlayerShowcaseV2Composable$lambda$4(interfaceC3978p012), PlayerShowcaseV2Composable$lambda$7(interfaceC3978p011), a13, a14, 0, null, null, null, null, ComposableSingletons$PlayerShowcaseV2ComposableKt.INSTANCE.m827getLambda9$monetization_prodGoogleAllVendorsRelease(), null, null, null, c3969l, 0, 48, 30656);
                    c3969l.k();
                } else if (PlayerShowcaseV2Composable$lambda$34(interfaceC3978p02)) {
                    u11.o(-184066520);
                    c3969l = u11;
                    VideoMoleculeKt.VideoMolecule(singleInstancePlayerController, function1, PlayerShowcaseV2Composable$lambda$4(interfaceC3978p012), PlayerShowcaseV2Composable$lambda$7(interfaceC3978p011), a13, a14, 0, null, null, null, null, ComposableSingletons$PlayerShowcaseV2ComposableKt.INSTANCE.m819getLambda11$monetization_prodGoogleAllVendorsRelease(), null, null, null, c3969l, 0, 48, 30656);
                    c3969l.k();
                } else if (PlayerShowcaseV2Composable$lambda$37(interfaceC3978p0)) {
                    u11.o(-184034693);
                    boolean PlayerShowcaseV2Composable$lambda$4 = PlayerShowcaseV2Composable$lambda$4(interfaceC3978p012);
                    boolean PlayerShowcaseV2Composable$lambda$7 = PlayerShowcaseV2Composable$lambda$7(interfaceC3978p011);
                    u11.o(-184023920);
                    Object C17 = u11.C();
                    if (C17 == InterfaceC3967k.a.a()) {
                        C17 = PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$2$1.INSTANCE;
                        u11.x(C17);
                    }
                    u11.k();
                    c3969l = u11;
                    VideoMoleculeKt.VideoMolecule(singleInstancePlayerController, function1, PlayerShowcaseV2Composable$lambda$4, PlayerShowcaseV2Composable$lambda$7, a13, a14, 0, (Function1) C17, null, null, null, null, null, null, null, c3969l, 12582912, 0, 32576);
                    c3969l.k();
                } else {
                    u11.o(-184020702);
                    c3969l = u11;
                    VideoMoleculeKt.VideoMolecule(singleInstancePlayerController, function1, PlayerShowcaseV2Composable$lambda$4(interfaceC3978p012), PlayerShowcaseV2Composable$lambda$7(interfaceC3978p011), a13, a14, 0, null, null, null, null, null, null, null, null, c3969l, 0, 0, 32704);
                    c3969l.k();
                }
                c3969l.f();
                eVar3 = eVar5;
            } else {
                u11.j();
                eVar3 = eVar2;
                c3969l = u11;
            }
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$3(item, component, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 147) == 146) {
        }
        if (i15 == 0) {
        }
        videoController = component.getVideoController();
        long id22 = item.getId();
        u11.o(1621433679);
        s11 = u11.s(id22);
        C11 = u11.C();
        if (!s11) {
        }
        C11 = VideoController.DefaultImpls.getSingleInstancePlayerController$default(videoController, null, 1, null);
        u11.x(C11);
        singleInstancePlayerController = (SingleInstancePlayerController) C11;
        u11.k();
        Object videoFormat2 = item.getVideoFormat();
        u11.o(1621437277);
        n11 = u11.n(videoFormat2);
        C12 = u11.C();
        if (!n11) {
        }
        i14 = WhenMappings.$EnumSwitchMapping$0[item.getVideoFormat().ordinal()];
        if (i14 != 1) {
        }
        C12 = progressiveExoManager;
        u11.x(C12);
        ExoManager exoManager2 = (ExoManager) C12;
        u11.k();
        String videoUrl2 = item.getVideoUrl();
        u11.o(1621447570);
        F11 = ((i13 & 14) != 4) | u11.F(singleInstancePlayerController) | u11.F(exoManager2);
        C13 = u11.C();
        if (!F11) {
        }
        C13 = new PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$1$1(singleInstancePlayerController, item, exoManager2);
        u11.x(C13);
        u11.k();
        Q.b(singleInstancePlayerController, videoUrl2, (Function1) C13, u11);
        u11.o(1621463228);
        C14 = u11.C();
        if (C14 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p0122 = (InterfaceC3978p0) C14;
        b11 = h.b(u11, 1621465468);
        if (b11 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p0132 = (InterfaceC3978p0) b11;
        b12 = h.b(u11, 1621467516);
        if (b12 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p0142 = (InterfaceC3978p0) b12;
        b13 = h.b(u11, 1621469468);
        if (b13 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p0152 = (InterfaceC3978p0) b13;
        b14 = h.b(u11, 1621471388);
        if (b14 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p0162 = (InterfaceC3978p0) b14;
        b15 = h.b(u11, 1621473692);
        if (b15 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p0172 = (InterfaceC3978p0) b15;
        b16 = h.b(u11, 1621475772);
        if (b16 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p0182 = (InterfaceC3978p0) b16;
        b17 = h.b(u11, 1621477980);
        if (b17 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p0192 = (InterfaceC3978p0) b17;
        b18 = h.b(u11, 1621480412);
        if (b18 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p0202 = (InterfaceC3978p0) b18;
        b19 = h.b(u11, 1621482780);
        if (b19 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p0212 = (InterfaceC3978p0) b19;
        b21 = h.b(u11, 1621485244);
        if (b21 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p0222 = (InterfaceC3978p0) b21;
        b22 = h.b(u11, 1621487356);
        if (b22 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p0232 = (InterfaceC3978p0) b22;
        b23 = h.b(u11, 1621492906);
        if (b23 == InterfaceC3967k.a.a()) {
        }
        u11.k();
        Function1<VideoMoleculeIntent, Unit> rememberDefaultVideoMoleculeIntentHandler2 = VideoMoleculeIntentHandlerKt.rememberDefaultVideoMoleculeIntentHandler(singleInstancePlayerController, (Function1) b23, u11, 48);
        C5194q a112 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f72 = c.f(u11, eVar4);
        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g102 = b.g(u11, a112, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, g102);
        F1.b(u11, f72, InterfaceC2801g.a.f());
        C5179b.i n132 = C5179b.n(12);
        float f112 = 16;
        float f122 = 8;
        C9915y c9915y2 = new C9915y(f112, f122, f112, f122);
        u11.o(-184276695);
        C15 = u11.C();
        if (C15 != InterfaceC3967k.a.a()) {
        }
        u11.k();
        e eVar52 = eVar4;
        C10164d.b(null, null, c9915y2, n132, null, null, false, (Function1) C15, u11, 100688256, 235);
        u11.o(-184236429);
        n12 = u11.n(rememberDefaultVideoMoleculeIntentHandler2);
        C16 = u11.C();
        if (!n12) {
        }
        C16 = new PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$customOnIntent$1$1(rememberDefaultVideoMoleculeIntentHandler2);
        u11.x(C16);
        Function1 function12 = (Function1) C16;
        u11.k();
        e.a aVar2 = e.f40358c0;
        j11 = C7807Z.f72248b;
        b24 = androidx.compose.foundation.e.b(aVar2, j11, y0.a());
        e a132 = C5182e.a(a0.e(T.h(b24, 0.0f, 30, 1), 1.0f), PlayerShowcaseV2Composable$lambda$4(interfaceC3978p0122) ? 0.7f : 1.0f, false);
        InterfaceC2547p a142 = !PlayerShowcaseV2Composable$lambda$10(interfaceC3978p010) ? InterfaceC2547p.a.a() : InterfaceC2547p.a.d();
        if (!PlayerShowcaseV2Composable$lambda$13(interfaceC3978p09)) {
        }
        c3969l.f();
        eVar3 = eVar52;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PlayerShowcaseV2Composable$lambda$10(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlayerShowcaseV2Composable$lambda$11(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PlayerShowcaseV2Composable$lambda$13(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlayerShowcaseV2Composable$lambda$14(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PlayerShowcaseV2Composable$lambda$16(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlayerShowcaseV2Composable$lambda$17(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PlayerShowcaseV2Composable$lambda$19(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlayerShowcaseV2Composable$lambda$20(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PlayerShowcaseV2Composable$lambda$22(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlayerShowcaseV2Composable$lambda$23(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PlayerShowcaseV2Composable$lambda$25(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlayerShowcaseV2Composable$lambda$26(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PlayerShowcaseV2Composable$lambda$28(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlayerShowcaseV2Composable$lambda$29(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PlayerShowcaseV2Composable$lambda$31(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlayerShowcaseV2Composable$lambda$32(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PlayerShowcaseV2Composable$lambda$34(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlayerShowcaseV2Composable$lambda$35(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PlayerShowcaseV2Composable$lambda$37(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlayerShowcaseV2Composable$lambda$38(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    private static final boolean PlayerShowcaseV2Composable$lambda$4(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlayerShowcaseV2Composable$lambda$5(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PlayerShowcaseV2Composable$lambda$7(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlayerShowcaseV2Composable$lambda$8(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ToggleRow(String str, boolean z11, Function1<? super Boolean, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(-1459430496);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i13 = i12;
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            d.b i14 = InterfaceC6250b.a.i();
            C5179b.i n11 = C5179b.n(8);
            e h11 = T.h(e.f40358c0, 4, 0.0f, 2);
            Y b11 = X.b(n11, i14, u11, 54);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, h11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h12);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            e0.a(z11, function1, null, false, null, u11, (i13 >> 3) & 126, 60);
            c3969l = u11;
            u3.b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, c3969l, i13 & 14, 0, 131070);
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new PlayerShowcaseV2ComposableKt$ToggleRow$2(str, z11, function1, i11));
        }
    }
}
