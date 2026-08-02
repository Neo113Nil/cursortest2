package ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.horizontal;

import B1.V;
import D1.InterfaceC2801g;
import J0.I1;
import Pk0.f;
import Pk0.h;
import S0.A0;
import S0.A1;
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
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.data.PlayerShowcaseDTO;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.di.PlayerShowcaseComponent;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.BasePlayerComposableController;
import ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerController;
import v0.C10164d;
import v0.I;
import v0.InterfaceC10174n;
import xe.M;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0013\u0010\u0012\u001a!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001d\u001a\u00020\u0015*\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006&²\u0006\u0012\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\nX\u008a\u0084\u0002²\u0006\u0010\u0010!\u001a\u0004\u0018\u00010 8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010#\u001a\u0004\u0018\u00010\"8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010$\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010%\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/horizontal/PlayerShowcaseHorizontalVI;", "item", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/di/PlayerShowcaseComponent;", "component", "Landroidx/compose/ui/e;", "modifier", "", "PlayerShowcaseHorizontalComposable", "(Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/horizontal/PlayerShowcaseHorizontalVI;Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/di/PlayerShowcaseComponent;Landroidx/compose/ui/e;LS0/k;II)V", "", ImagesContract.URL, "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO$VideoFormat;", "videoFormat", "", "isVisible", "PlayerCell", "(Ljava/lang/String;Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO$VideoFormat;ZLru/ozon/app/android/monetization/widgets/playerShowCase/v1/di/PlayerShowcaseComponent;LS0/k;I)V", "ShowPreview", "(LS0/k;I)V", "ShowLoader", "Lv0/I;", "", "visibilityThreshold", "", "", "getVisibleIndices", "(Lv0/I;F)Ljava/util/Set;", "Lv0/n;", "info", "visibilityPercent", "(Lv0/I;Lv0/n;)F", "visibleIndices", "Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerController;", "playerController", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "currentListener", "showLoader", "showPreview", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PlayerShowcaseHorizontalComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlayerCell(String str, PlayerShowcaseDTO.VideoFormat videoFormat, boolean z11, PlayerShowcaseComponent playerShowcaseComponent, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        PlayerShowcaseDTO.VideoFormat videoFormat2;
        InterfaceC3978p0 interfaceC3978p0;
        Object playerShowcaseHorizontalComposableKt$PlayerCell$startPlaying$1$1;
        InterfaceC3978p0 interfaceC3978p02;
        String str2;
        InterfaceC3978p0 interfaceC3978p03;
        Object playerShowcaseHorizontalComposableKt$PlayerCell$stopPlaying$1$1;
        InterfaceC3978p0 interfaceC3978p04;
        InterfaceC3978p0 interfaceC3978p05;
        InterfaceC3978p0 interfaceC3978p06;
        Boolean bool;
        C3969l u11 = interfaceC3967k.u(-424249216);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            videoFormat2 = videoFormat;
            i12 |= u11.n(videoFormat2) ? 32 : 16;
        } else {
            videoFormat2 = videoFormat;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(playerShowcaseComponent) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i13 = i12;
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
            str2 = str;
        } else {
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = f.b(Q.j(g.f71771a, u11), u11);
            }
            M a11 = ((D) C11).a();
            u11.o(-1589295069);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = n1.f(null, D1.f25195a);
                u11.x(C12);
            }
            InterfaceC3978p0 interfaceC3978p07 = (InterfaceC3978p0) C12;
            Object b11 = h.b(u11, -1589292377);
            if (b11 == InterfaceC3967k.a.a()) {
                b11 = n1.f(null, D1.f25195a);
                u11.x(b11);
            }
            InterfaceC3978p0 interfaceC3978p08 = (InterfaceC3978p0) b11;
            Object b12 = h.b(u11, -1589289715);
            if (b12 == InterfaceC3967k.a.a()) {
                b12 = n1.f(Boolean.FALSE, D1.f25195a);
                u11.x(b12);
            }
            InterfaceC3978p0 interfaceC3978p09 = (InterfaceC3978p0) b12;
            Object b13 = h.b(u11, -1589287860);
            if (b13 == InterfaceC3967k.a.a()) {
                b13 = n1.f(Boolean.TRUE, D1.f25195a);
                u11.x(b13);
            }
            InterfaceC3978p0 interfaceC3978p010 = (InterfaceC3978p0) b13;
            u11.k();
            u11.o(-1589285118);
            boolean F11 = ((i13 & 14) == 4) | ((i13 & 112) == 32) | u11.F(playerShowcaseComponent);
            Object C13 = u11.C();
            if (F11 || C13 == InterfaceC3967k.a.a()) {
                interfaceC3978p0 = interfaceC3978p09;
                PlayerShowcaseDTO.VideoFormat videoFormat3 = videoFormat2;
                interfaceC3978p02 = interfaceC3978p010;
                playerShowcaseHorizontalComposableKt$PlayerCell$startPlaying$1$1 = new PlayerShowcaseHorizontalComposableKt$PlayerCell$startPlaying$1$1(videoFormat3, playerShowcaseComponent, str, interfaceC3978p02, interfaceC3978p0, interfaceC3978p08);
                str2 = str;
                interfaceC3978p03 = interfaceC3978p08;
                u11.x(playerShowcaseHorizontalComposableKt$PlayerCell$startPlaying$1$1);
            } else {
                interfaceC3978p0 = interfaceC3978p09;
                playerShowcaseHorizontalComposableKt$PlayerCell$startPlaying$1$1 = C13;
                str2 = str;
                interfaceC3978p03 = interfaceC3978p08;
                interfaceC3978p02 = interfaceC3978p010;
            }
            Function1 function1 = (Function1) playerShowcaseHorizontalComposableKt$PlayerCell$startPlaying$1$1;
            u11.k();
            u11.o(-1589255371);
            boolean F12 = u11.F(playerShowcaseComponent);
            Object C14 = u11.C();
            if (F12 || C14 == InterfaceC3967k.a.a()) {
                interfaceC3978p04 = interfaceC3978p07;
                playerShowcaseHorizontalComposableKt$PlayerCell$stopPlaying$1$1 = new PlayerShowcaseHorizontalComposableKt$PlayerCell$stopPlaying$1$1(interfaceC3978p04, playerShowcaseComponent, interfaceC3978p03, interfaceC3978p02, interfaceC3978p0);
                interfaceC3978p05 = interfaceC3978p02;
                interfaceC3978p06 = interfaceC3978p0;
                u11.x(playerShowcaseHorizontalComposableKt$PlayerCell$stopPlaying$1$1);
            } else {
                playerShowcaseHorizontalComposableKt$PlayerCell$stopPlaying$1$1 = C14;
                interfaceC3978p05 = interfaceC3978p02;
                interfaceC3978p04 = interfaceC3978p07;
                interfaceC3978p06 = interfaceC3978p0;
            }
            Function0 function0 = (Function0) playerShowcaseHorizontalComposableKt$PlayerCell$stopPlaying$1$1;
            u11.k();
            Boolean valueOf = Boolean.valueOf(z11);
            u11.o(-1589235646);
            boolean F13 = u11.F(a11) | u11.F(playerShowcaseComponent) | ((i13 & 896) == 256) | u11.n(function1) | u11.n(function0);
            Object C15 = u11.C();
            if (F13 || C15 == InterfaceC3967k.a.a()) {
                bool = valueOf;
                InterfaceC3978p0 interfaceC3978p011 = interfaceC3978p04;
                Object playerShowcaseHorizontalComposableKt$PlayerCell$1$1 = new PlayerShowcaseHorizontalComposableKt$PlayerCell$1$1(a11, playerShowcaseComponent, z11, function1, interfaceC3978p011, function0);
                interfaceC3978p04 = interfaceC3978p011;
                u11.x(playerShowcaseHorizontalComposableKt$PlayerCell$1$1);
                C15 = playerShowcaseHorizontalComposableKt$PlayerCell$1$1;
            } else {
                bool = valueOf;
            }
            u11.k();
            Q.b(bool, str2, (Function1) C15, u11);
            e eVar = e.f40358c0;
            e r11 = a0.r(a0.c(eVar), 100);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = androidx.compose.ui.c.f(u11, r11);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            PoolPlayerController PlayerCell$lambda$4 = PlayerCell$lambda$4(interfaceC3978p04);
            BasePlayerComposableController playerComposableController = PlayerCell$lambda$4 != null ? PlayerCell$lambda$4.playerComposableController() : null;
            u11.o(775702542);
            if (playerComposableController != null) {
                playerComposableController.PlayerSurfaceComposable(eVar, 1, u11, 54);
            }
            u11.k();
            u11.o(775706976);
            if (PlayerCell$lambda$13(interfaceC3978p05)) {
                ShowPreview(u11, 0);
            }
            u11.k();
            u11.o(775708990);
            if (PlayerCell$lambda$10(interfaceC3978p06)) {
                ShowLoader(u11, 0);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PlayerShowcaseHorizontalComposableKt$PlayerCell$3(str2, videoFormat, z11, playerShowcaseComponent, i11));
        }
    }

    private static final boolean PlayerCell$lambda$10(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlayerCell$lambda$11(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    private static final boolean PlayerCell$lambda$13(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlayerCell$lambda$14(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PoolPlayerController PlayerCell$lambda$4(InterfaceC3978p0<PoolPlayerController> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerListenersContainer PlayerCell$lambda$7(InterfaceC3978p0<PlayerListenersContainer> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PlayerShowcaseHorizontalComposable(@NotNull PlayerShowcaseHorizontalVI item, @NotNull PlayerShowcaseComponent component, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        Object C11;
        boolean F11;
        Object C12;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(component, "component");
        C3969l u11 = interfaceC3967k.u(151040621);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(item) ? 4 : 2) | i11;
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
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i13 & 147) == 146 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                I c11 = v0.M.c(0, 0, u11, 3);
                u11.o(1980729757);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = n1.e(new PlayerShowcaseHorizontalComposableKt$PlayerShowcaseHorizontalComposable$visibleIndices$2$1(c11));
                    u11.x(C11);
                }
                A1 a12 = (A1) C11;
                u11.k();
                e f7 = a0.f(eVar4, 220);
                C5179b.i n11 = C5179b.n(8);
                u11.o(1980738946);
                F11 = u11.F(item) | u11.F(component);
                C12 = u11.C();
                if (!F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new PlayerShowcaseHorizontalComposableKt$PlayerShowcaseHorizontalComposable$1$1(item, component, a12);
                    u11.x(C12);
                }
                u11.k();
                C10164d.b(f7, c11, null, n11, null, null, false, (Function1) C12, u11, 24576, 236);
                eVar3 = eVar4;
            } else {
                u11.j();
                eVar3 = eVar2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new PlayerShowcaseHorizontalComposableKt$PlayerShowcaseHorizontalComposable$2(item, component, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 147) == 146) {
        }
        if (i14 == 0) {
        }
        I c112 = v0.M.c(0, 0, u11, 3);
        u11.o(1980729757);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        A1 a122 = (A1) C11;
        u11.k();
        e f72 = a0.f(eVar4, 220);
        C5179b.i n112 = C5179b.n(8);
        u11.o(1980738946);
        F11 = u11.F(item) | u11.F(component);
        C12 = u11.C();
        if (!F11) {
        }
        C12 = new PlayerShowcaseHorizontalComposableKt$PlayerShowcaseHorizontalComposable$1$1(item, component, a122);
        u11.x(C12);
        u11.k();
        C10164d.b(f72, c112, null, n112, null, null, false, (Function1) C12, u11, 24576, 236);
        eVar3 = eVar4;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set<Integer> PlayerShowcaseHorizontalComposable$lambda$1(A1<? extends Set<Integer>> a12) {
        return a12.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ShowLoader(InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(1099618499);
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
            m02.G(new PlayerShowcaseHorizontalComposableKt$ShowLoader$2(i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ShowPreview(InterfaceC3967k interfaceC3967k, int i11) {
        long j11;
        e b11;
        C3969l u11 = interfaceC3967k.u(155552194);
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
            m02.G(new PlayerShowcaseHorizontalComposableKt$ShowPreview$1(i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set<Integer> getVisibleIndices(I i11, float f7) {
        List<InterfaceC10174n> g10 = i11.t().g();
        ArrayList arrayList = new ArrayList();
        for (Object obj : g10) {
            if (visibilityPercent(i11, (InterfaceC10174n) obj) >= f7) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((InterfaceC10174n) it.next()).getIndex()));
        }
        return C7714v.Y0(arrayList2);
    }

    private static final float visibilityPercent(I i11, InterfaceC10174n interfaceC10174n) {
        return Math.max(0.0f, 100.0f - (((Math.max(0, (interfaceC10174n.getSize() + interfaceC10174n.getOffset()) - i11.t().h()) + Math.max(0, i11.t().f() - interfaceC10174n.getOffset())) * 100.0f) / interfaceC10174n.getSize()));
    }
}
