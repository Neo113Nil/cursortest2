package ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import I1.o;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import T7.E;
import WZ.l;
import WZ.t;
import Z1.h;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import i1.C6988h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation.CartTabsVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.repository.UniTheme;
import v0.C10164d;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001aq\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "LWZ/l;", "tokenizedAnalytics", "Ll1/Z;", "backgroundColor", "listBackgroundColor", "LZ1/h;", "roundedCornersSize", "", "locator", "CartTabsWidgetHolder-8L-wENs", "(Landroidx/compose/ui/e;Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO;Lkotlin/jvm/functions/Function1;Ll10/b;LWZ/l;JJFLjava/lang/String;LS0/k;II)V", "CartTabsWidgetHolder", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartTabsWidgetHolderKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0204  */
    /* renamed from: CartTabsWidgetHolder-8L-wENs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m707CartTabsWidgetHolder8LwENs(e eVar, @NotNull CartTabsVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull InterfaceC7851b controller, @NotNull l tokenizedAnalytics, long j11, long j12, float f7, String str, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        long j13;
        long j14;
        float f11;
        e eVar2;
        int i14;
        long j15;
        long j16;
        String str2;
        float f12;
        boolean F11;
        Object C11;
        boolean n11;
        Object C12;
        e b11;
        boolean z11;
        Object C13;
        int I11;
        e b12;
        boolean F12;
        Object C14;
        float f13;
        C3969l c3969l;
        long j17;
        e eVar3;
        String str3;
        long j18;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        C3969l u11 = interfaceC3967k.u(-1872403711);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(item) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.F(controller) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i13 |= u11.F(tokenizedAnalytics) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            j13 = j11;
            i13 |= ((i12 & 32) == 0 && u11.s(j13)) ? 131072 : 65536;
        } else {
            j13 = j11;
        }
        if ((1572864 & i11) == 0) {
            j14 = j12;
            i13 |= ((i12 & 64) == 0 && u11.s(j14)) ? 1048576 : 524288;
        } else {
            j14 = j12;
        }
        int i16 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i16 != 0) {
            i13 |= 12582912;
            f11 = f7;
        } else {
            f11 = f7;
            if ((i11 & 12582912) == 0) {
                i13 |= u11.q(f11) ? 8388608 : 4194304;
            }
        }
        int i17 = i12 & 256;
        if (i17 != 0) {
            i13 |= 100663296;
        } else if ((i11 & 100663296) == 0) {
            i13 |= u11.n(str) ? 67108864 : 33554432;
        }
        if ((i13 & 38347923) == 38347922 && u11.b()) {
            u11.j();
            eVar3 = eVar;
            c3969l = u11;
            j17 = j13;
            str3 = str;
            f13 = f11;
            j18 = j14;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                eVar2 = i15 != 0 ? e.f40358c0 : eVar;
                if ((i12 & 32) != 0) {
                    j13 = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgDarkKey();
                    i13 &= -458753;
                }
                if ((i12 & 64) != 0) {
                    j14 = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1();
                    i13 = (-3670017) & i13;
                }
                if (i16 != 0) {
                    f11 = 24;
                }
                if (i17 != 0) {
                    float f14 = f11;
                    str2 = "cartTabsWidget";
                    f12 = f14;
                    long j19 = j13;
                    i14 = i13;
                    j15 = j14;
                    j16 = j19;
                    u11.j0();
                    t tokenizedEvent = item.getTokenizedEvent();
                    u11.o(-1631645623);
                    F11 = u11.F(item) | u11.F(tokenizedAnalytics);
                    C11 = u11.C();
                    if (!F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new CartTabsWidgetHolderKt$CartTabsWidgetHolder$1$1(item, tokenizedAnalytics, null);
                        u11.x(C11);
                    }
                    u11.k();
                    Q.e(u11, tokenizedEvent, (Function2) C11);
                    List<CartTabsVO.CartTabItem> items = item.getItems();
                    u11.o(-1631642303);
                    n11 = u11.n(items);
                    C12 = u11.C();
                    if (!n11 || C12 == InterfaceC3967k.a.a()) {
                        CartTabsVO.CartTabItem cartTabItem = (CartTabsVO.CartTabItem) C7714v.Q(0, item.getItems());
                        C12 = h.a(cartTabItem == null ? cartTabItem.getAspectPadding() : 0);
                        u11.x(C12);
                    }
                    float d11 = ((h) C12).d();
                    u11.k();
                    List<CartTabsVO.CartTabItem> items2 = item.getItems();
                    CartTabsVO.Spacers spacers = item.getSpacers();
                    e eVar4 = eVar2;
                    b11 = androidx.compose.foundation.e.b(a0.u(a0.e(eVar2, 1.0f), 3), j16, y0.a());
                    u11.o(-1631632842);
                    z11 = (234881024 & i14) != 67108864;
                    C13 = u11.C();
                    if (!z11 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new CartTabsWidgetHolderKt$CartTabsWidgetHolder$2$1(str2);
                        u11.x(C13);
                    }
                    u11.k();
                    e c11 = o.c(b11, false, (Function1) C13);
                    V f15 = C5185h.f(InterfaceC6250b.a.h(), false);
                    I11 = u11.I();
                    String str4 = str2;
                    A0 d12 = u11.d();
                    e f16 = c.f(u11, c11);
                    Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.e();
                    } else {
                        u11.H(a11);
                    }
                    Function2 f17 = E.f(u11, f15, u11, d12);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        a.d(I11, u11, I11, f17);
                    }
                    F1.b(u11, f16, InterfaceC2801g.a.f());
                    b12 = androidx.compose.foundation.e.b(C6988h.a(a0.d(e.f40358c0), A0.h.d(f12, f12, 0.0f, 0.0f, 12)), j15, y0.a());
                    e i18 = T.i(b12, spacers.getLeft(), spacers.getTop(), spacers.getRight(), spacers.getBottom());
                    C5179b.i n12 = C5179b.n(d11);
                    d.b i19 = InterfaceC6250b.a.i();
                    u11.o(1321748106);
                    F12 = u11.F(items2) | u11.F(item) | u11.F(controller) | ((i14 & 896) == 256) | u11.F(tokenizedAnalytics);
                    C14 = u11.C();
                    if (!F12 || C14 == InterfaceC3967k.a.a()) {
                        C14 = new CartTabsWidgetHolderKt$CartTabsWidgetHolder$3$1$1(items2, item, controller, actionHandler, tokenizedAnalytics);
                        u11.x(C14);
                    }
                    u11.k();
                    long j21 = j15;
                    C10164d.b(i18, null, null, n12, i19, null, false, (Function1) C14, u11, 196608, 206);
                    u11.f();
                    f13 = f12;
                    c3969l = u11;
                    j17 = j16;
                    eVar3 = eVar4;
                    str3 = str4;
                    j18 = j21;
                } else {
                    long j22 = j13;
                    i14 = i13;
                    j15 = j14;
                    j16 = j22;
                }
            } else {
                u11.j();
                if ((i12 & 32) != 0) {
                    i13 &= -458753;
                }
                if ((i12 & 64) != 0) {
                    i13 &= -3670017;
                }
                long j23 = j13;
                i14 = i13;
                j15 = j14;
                j16 = j23;
                eVar2 = eVar;
            }
            f12 = f11;
            str2 = str;
            u11.j0();
            t tokenizedEvent2 = item.getTokenizedEvent();
            u11.o(-1631645623);
            F11 = u11.F(item) | u11.F(tokenizedAnalytics);
            C11 = u11.C();
            if (!F11) {
            }
            C11 = new CartTabsWidgetHolderKt$CartTabsWidgetHolder$1$1(item, tokenizedAnalytics, null);
            u11.x(C11);
            u11.k();
            Q.e(u11, tokenizedEvent2, (Function2) C11);
            List<CartTabsVO.CartTabItem> items3 = item.getItems();
            u11.o(-1631642303);
            n11 = u11.n(items3);
            C12 = u11.C();
            if (!n11) {
            }
            CartTabsVO.CartTabItem cartTabItem2 = (CartTabsVO.CartTabItem) C7714v.Q(0, item.getItems());
            C12 = h.a(cartTabItem2 == null ? cartTabItem2.getAspectPadding() : 0);
            u11.x(C12);
            float d112 = ((h) C12).d();
            u11.k();
            List<CartTabsVO.CartTabItem> items22 = item.getItems();
            CartTabsVO.Spacers spacers2 = item.getSpacers();
            e eVar42 = eVar2;
            b11 = androidx.compose.foundation.e.b(a0.u(a0.e(eVar2, 1.0f), 3), j16, y0.a());
            u11.o(-1631632842);
            if ((234881024 & i14) != 67108864) {
            }
            C13 = u11.C();
            if (!z11) {
            }
            C13 = new CartTabsWidgetHolderKt$CartTabsWidgetHolder$2$1(str2);
            u11.x(C13);
            u11.k();
            e c112 = o.c(b11, false, (Function1) C13);
            V f152 = C5185h.f(InterfaceC6250b.a.h(), false);
            I11 = u11.I();
            String str42 = str2;
            A0 d122 = u11.d();
            e f162 = c.f(u11, c112);
            Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f172 = E.f(u11, f152, u11, d122);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f172);
            F1.b(u11, f162, InterfaceC2801g.a.f());
            b12 = androidx.compose.foundation.e.b(C6988h.a(a0.d(e.f40358c0), A0.h.d(f12, f12, 0.0f, 0.0f, 12)), j15, y0.a());
            e i182 = T.i(b12, spacers2.getLeft(), spacers2.getTop(), spacers2.getRight(), spacers2.getBottom());
            C5179b.i n122 = C5179b.n(d112);
            d.b i192 = InterfaceC6250b.a.i();
            u11.o(1321748106);
            F12 = u11.F(items22) | u11.F(item) | u11.F(controller) | ((i14 & 896) == 256) | u11.F(tokenizedAnalytics);
            C14 = u11.C();
            if (!F12) {
            }
            C14 = new CartTabsWidgetHolderKt$CartTabsWidgetHolder$3$1$1(items22, item, controller, actionHandler, tokenizedAnalytics);
            u11.x(C14);
            u11.k();
            long j212 = j15;
            C10164d.b(i182, null, null, n122, i192, null, false, (Function1) C14, u11, 196608, 206);
            u11.f();
            f13 = f12;
            c3969l = u11;
            j17 = j16;
            eVar3 = eVar42;
            str3 = str42;
            j18 = j212;
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new CartTabsWidgetHolderKt$CartTabsWidgetHolder$4(eVar3, item, actionHandler, controller, tokenizedAnalytics, j17, j18, f13, str3, i11, i12));
        }
    }
}
