package ru.ozon.app.android.account.orders.commonBarcodeV2.presentation;

import A0.h;
import B1.InterfaceC2547p;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import S1.p;
import T7.E;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.P;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.InterfaceC7829k0;
import l1.y0;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.commonBarcodeV2.presentation.BarcodeShareButton;
import ru.ozon.app.android.util.theme.ThemeWrapperKt;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aC\u0010\f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0001¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a;\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001aU\u0010!\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0003¢\u0006\u0004\b\u001f\u0010 ¨\u0006#²\u0006\u000e\u0010\"\u001a\u0004\u0018\u00010\u00108\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2VO;", "item", "Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2ViewModel;", "viewModel", "Lru/ozon/app/android/utils/AppType;", "appType", "", "miniAppName", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "CommonBarcodeV2Composable", "(Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2VO;Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2ViewModel;Lru/ozon/app/android/utils/AppType;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "code", "LS0/A1;", "Ll1/k0;", "generateBarcode", "(Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2ViewModel;Ljava/lang/String;LS0/k;I)LS0/A1;", "Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/BarcodeShareButton$Button;", "shareButton", "ShareButton", "(Lru/ozon/app/android/utils/AppType;Ljava/lang/String;Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/BarcodeShareButton$Button;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Landroidx/compose/ui/e;", "modifier", "Ll1/Z;", "backgroundColor", "Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/BarcodeShareButton$IconButton;", "iconShareButton", "LZ1/h;", "shareIconButtonClickablePadding", "IconShareButton-zkFDczg", "(Landroidx/compose/ui/e;Lru/ozon/app/android/utils/AppType;Ljava/lang/String;JLru/ozon/app/android/account/orders/commonBarcodeV2/presentation/BarcodeShareButton$IconButton;FLkotlin/jvm/functions/Function1;LS0/k;II)V", "IconShareButton", "barcodeBitmap", "cs-orders_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CommonBarcodeV2ComposableKt {
    public static final void CommonBarcodeV2Composable(@NotNull CommonBarcodeV2VO item, @NotNull CommonBarcodeV2ViewModel viewModel, @NotNull AppType appType, @NotNull String miniAppName, @NotNull Function1<? super AtomAction, Unit> onAction, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        long j11;
        float f7;
        float f11;
        e.a aVar;
        int i13;
        int i14;
        int i15;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        C3969l u11 = interfaceC3967k.u(2006873604);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(item) : u11.F(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(viewModel) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(appType) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(miniAppName) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(onAction) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            float f12 = 8;
            e.a aVar2 = e.f40358c0;
            e u12 = a0.u(a0.e(aVar2, 1.0f), 3);
            C7807Z c7807z = TokenParserKt.tokenToColor(item.getContainerBackdropColor(), u11, 0);
            b11 = androidx.compose.foundation.e.b(u12, c7807z != null ? c7807z.w() : C7807Z.f72258l, y0.a());
            e j12 = T.j(T.h(b11, item.getContainerHorizontalPadding().m1867getDpD9Ej5fM(), 0.0f, 2), 0.0f, item.getContainerTopPadding().m1867getDpD9Ej5fM(), 0.0f, 0.0f, 13);
            V f13 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f14 = c.f(u11, j12);
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
            int i16 = i12;
            j11 = C7807Z.f72251e;
            e b12 = androidx.compose.foundation.e.b(a0.u(a0.e(aVar2, 1.0f), 3), j11, h.b(item.getContainerCornerRadius().m1866getDpD9Ej5fM()));
            u11.o(-1385067877);
            boolean z11 = ((57344 & i16) == 16384) | ((i16 & 14) == 4 || ((i16 & 8) != 0 && u11.F(item)));
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new CommonBarcodeV2ComposableKt$CommonBarcodeV2Composable$1$1$1(item, onAction);
                u11.x(C11);
            }
            u11.k();
            e j13 = T.j(i.b(b12, null, null, false, null, null, (Function0) C11, 28), 0.0f, item.getBarcodeTopPadding(p.a(u11)).m1867getDpD9Ej5fM(), 0.0f, item.getBarcodeBottomPadding(p.a(u11)).m1867getDpD9Ej5fM(), 5);
            C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f16 = c.f(u11, j13);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, g10);
            }
            F1.b(u11, f16, InterfaceC2801g.a.f());
            float f17 = 7;
            e j14 = T.j(a0.e(a0.f(aVar2, item.getBarcodeHeight()), 1.0f), item.getBarcodeHorizontalPadding(), 0.0f, ((Z1.h) kotlin.ranges.h.b(Z1.h.a(item.getBarcodeHorizontalPadding() - f12), Z1.h.a(0))).d(), 0.0f, 10);
            V f18 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I13 = u11.I();
            A0 d13 = u11.d();
            e f19 = c.f(u11, j14);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 f21 = E.f(u11, f18, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                a.d(I13, u11, I13, f21);
            }
            F1.b(u11, f19, InterfaceC2801g.a.f());
            C5187j c5187j = C5187j.f39515a;
            int i17 = i16 >> 3;
            InterfaceC7829k0 CommonBarcodeV2Composable$lambda$9$lambda$8$lambda$5$lambda$1 = CommonBarcodeV2Composable$lambda$9$lambda$8$lambda$5$lambda$1(generateBarcode(viewModel, item.getCode(), u11, i17 & 14));
            u11.o(-1470617414);
            if (CommonBarcodeV2Composable$lambda$9$lambda$8$lambda$5$lambda$1 == null) {
                f7 = f12;
                f11 = 0.0f;
            } else {
                f7 = f12;
                f11 = 0.0f;
                C8366G.b(CommonBarcodeV2Composable$lambda$9$lambda$8$lambda$5$lambda$1, C6988h.a(T.j(a0.c(a0.e(aVar2, 1.0f)), 0.0f, 0.0f, f12, 0.0f, 11), h.b(item.getBarcodeCornerRadius().m1866getDpD9Ej5fM())), InterfaceC2547p.a.b(), u11, 24624, 232);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            e a15 = c5187j.a(P.c(aVar2, f11, f17, 1), InterfaceC6250b.a.b());
            float f22 = 12;
            e h11 = T.h(androidx.compose.foundation.e.b(a15, j11, h.d(f22, f22, f11, f11, 12)), f7, f11, 2);
            V f23 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I14 = u11.I();
            A0 d14 = u11.d();
            e f24 = c.f(u11, h11);
            Function0 a16 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a16);
            } else {
                u11.e();
            }
            Function2 f25 = E.f(u11, f23, u11, d14);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I14))) {
                a.d(I14, u11, I14, f25);
            }
            F1.b(u11, f24, InterfaceC2801g.a.f());
            DsTextAtomKt.DsTextAtom(item.getVisibleCode(), null, u11, 0, 2);
            u11.f();
            BarcodeShareButton shareButton = item.getShareButton();
            BarcodeShareButton.IconButton iconButton = shareButton instanceof BarcodeShareButton.IconButton ? (BarcodeShareButton.IconButton) shareButton : null;
            u11.o(-1470581165);
            if (iconButton == null) {
                i14 = i16;
                i13 = 2;
                aVar = aVar2;
                i15 = 16;
            } else {
                e a17 = c5187j.a(aVar2, InterfaceC6250b.a.n());
                int i18 = (i17 & 896) | (i17 & 112) | 199680 | (IconButtonV3DTO.$stable << 12) | ((i16 << 6) & 3670016);
                aVar = aVar2;
                BarcodeShareButton.IconButton iconButton2 = iconButton;
                i13 = 2;
                i14 = i16;
                i15 = 16;
                m460IconShareButtonzkFDczg(a17, appType, miniAppName, j11, iconButton2, f7, onAction, u11, i18, 0);
                Unit unit2 = Unit.f71690a;
            }
            u11.k();
            u11.f();
            TextDTO subtitle = item.getSubtitle();
            u11.o(-2022521279);
            if (subtitle != null) {
                u0.E.a(u11, a0.f(aVar, f17 + 1));
                DsTextAtomKt.DsTextAtom(subtitle, T.h(a0.e(aVar, 1.0f), i15, 0.0f, i13), u11, 48, 0);
                Unit unit3 = Unit.f71690a;
            }
            u11.k();
            BarcodeShareButton shareButton2 = item.getShareButton();
            BarcodeShareButton.Button button = shareButton2 instanceof BarcodeShareButton.Button ? (BarcodeShareButton.Button) shareButton2 : null;
            u11.o(-2022509273);
            if (button != null) {
                ShareButton(appType, miniAppName, button, onAction, u11, ((i14 >> 6) & 126) | (i17 & 7168));
                Unit unit4 = Unit.f71690a;
            }
            u11.k();
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CommonBarcodeV2ComposableKt$CommonBarcodeV2Composable$2(item, viewModel, appType, miniAppName, onAction, i11));
        }
    }

    private static final InterfaceC7829k0 CommonBarcodeV2Composable$lambda$9$lambda$8$lambda$5$lambda$1(A1<? extends InterfaceC7829k0> a12) {
        return a12.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0085  */
    /* renamed from: IconShareButton-zkFDczg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m460IconShareButtonzkFDczg(e eVar, AppType appType, String str, long j11, BarcodeShareButton.IconButton iconButton, float f7, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        AppType appType2;
        String str2;
        Function1<? super AtomAction, Unit> function12;
        int i14;
        Object C11;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(1661291412);
        int i15 = i12 & 1;
        if (i15 != 0) {
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
            appType2 = appType;
        } else {
            appType2 = appType;
            if ((i11 & 48) == 0) {
                i13 |= u11.n(appType2) ? 32 : 16;
            }
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
            str2 = str;
        } else {
            str2 = str;
            if ((i11 & 384) == 0) {
                i13 |= u11.n(str2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.s(j11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            if ((i12 & 16) == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                i13 |= (32768 & i11) == 0 ? u11.n(iconButton) : u11.F(iconButton) ? 16384 : 8192;
            }
            if ((i12 & 32) == 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                i13 |= u11.q(f7) ? 131072 : 65536;
            }
            if ((i12 & 64) == 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                function12 = function1;
                i13 |= u11.F(function12) ? 1048576 : 524288;
                i14 = i13;
                if ((599187 & i14) == 599186 || !u11.b()) {
                    if (i15 != 0) {
                        eVar2 = e.f40358c0;
                    }
                    u11.o(628531542);
                    C11 = u11.C();
                    if (C11 == InterfaceC3967k.a.a()) {
                        C11 = new CornerCutoutPieceShape(iconButton.getCutoutCornerRadius(), iconButton.getCutoutFilletRadius(), f7, null);
                        u11.x(C11);
                    }
                    u11.k();
                    ThemeWrapperKt.ThemeWrapper(false, appType2, str2, a1.c.c(1630820986, new CommonBarcodeV2ComposableKt$IconShareButton$1(eVar2, j11, (CornerCutoutPieceShape) C11, iconButton, function12), u11), u11, (i14 & 112) | 3078 | (i14 & 896), 0);
                } else {
                    u11.j();
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new CommonBarcodeV2ComposableKt$IconShareButton$2(eVar2, appType, str, j11, iconButton, f7, function1, i11, i12));
                    return;
                }
                return;
            }
            function12 = function1;
            i14 = i13;
            if ((599187 & i14) == 599186) {
            }
            if (i15 != 0) {
            }
            u11.o(628531542);
            C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
            }
            u11.k();
            ThemeWrapperKt.ThemeWrapper(false, appType2, str2, a1.c.c(1630820986, new CommonBarcodeV2ComposableKt$IconShareButton$1(eVar2, j11, (CornerCutoutPieceShape) C11, iconButton, function12), u11), u11, (i14 & 112) | 3078 | (i14 & 896), 0);
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        if ((i12 & 16) == 0) {
        }
        if ((i12 & 32) == 0) {
        }
        if ((i12 & 64) == 0) {
        }
        function12 = function1;
        i14 = i13;
        if ((599187 & i14) == 599186) {
        }
        if (i15 != 0) {
        }
        u11.o(628531542);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        u11.k();
        ThemeWrapperKt.ThemeWrapper(false, appType2, str2, a1.c.c(1630820986, new CommonBarcodeV2ComposableKt$IconShareButton$1(eVar2, j11, (CornerCutoutPieceShape) C11, iconButton, function12), u11), u11, (i14 & 112) | 3078 | (i14 & 896), 0);
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ShareButton(AppType appType, String str, BarcodeShareButton.Button button, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        String str2;
        AppType appType2;
        C3969l u11 = interfaceC3967k.u(-1799019602);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(appType) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(button) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(function1) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
            str2 = str;
            appType2 = appType;
        } else {
            int i13 = i12 << 3;
            str2 = str;
            ThemeWrapperKt.ThemeWrapper(false, appType, str2, a1.c.c(-639760876, new CommonBarcodeV2ComposableKt$ShareButton$1(button, function1), u11), u11, (i13 & 112) | 3078 | (i13 & 896), 0);
            appType2 = appType;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CommonBarcodeV2ComposableKt$ShareButton$2(appType2, str2, button, function1, i11));
        }
    }

    private static final A1<InterfaceC7829k0> generateBarcode(CommonBarcodeV2ViewModel commonBarcodeV2ViewModel, String str, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(1673708168);
        interfaceC3967k.o(-167529018);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = n1.f(null, D1.f25195a);
            interfaceC3967k.x(C11);
        }
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(-167526637);
        boolean F11 = ((((i11 & 112) ^ 48) > 32 && interfaceC3967k.n(str)) || (i11 & 48) == 32) | interfaceC3967k.F(commonBarcodeV2ViewModel);
        Object C12 = interfaceC3967k.C();
        if (F11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new CommonBarcodeV2ComposableKt$generateBarcode$1$1(interfaceC3978p0, commonBarcodeV2ViewModel, str, null);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        Q.e(interfaceC3967k, str, (Function2) C12);
        interfaceC3967k.k();
        return interfaceC3978p0;
    }
}
