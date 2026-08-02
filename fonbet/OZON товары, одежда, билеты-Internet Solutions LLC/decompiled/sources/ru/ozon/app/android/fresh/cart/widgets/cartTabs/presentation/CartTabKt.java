package ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import I1.i;
import I1.o;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import T7.E;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation.CartTabsVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a£\u0001\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0016\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\b0\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "", "position", "Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO$CartTabItem;", "item", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onClick", "Lkotlin/Function1;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "onView", "LZ1/h;", "spaceBetweenAtoms", "rowHorizontalPadding", "rowVerticalPadding", "", "locator", "tabHeight", "defaultTabRadius", "Ll1/Z;", "transparentLayerColor", "CartTab-PRecIgQ", "(Landroidx/compose/ui/e;ILru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO$CartTabItem;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;FFFLjava/lang/String;FFJLS0/k;III)V", "CartTab", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartTabKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d6  */
    /* renamed from: CartTab-PRecIgQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m699CartTabPRecIgQ(e eVar, int i11, @NotNull CartTabsVO.CartTabItem item, @NotNull Function2<? super Integer, ? super AtomAction, Unit> onClick, @NotNull Function1<? super t, Unit> onView, float f7, float f11, float f12, String str, float f13, float f14, long j11, InterfaceC3967k interfaceC3967k, int i12, int i13, int i14) {
        e eVar2;
        int i15;
        float f15;
        float f16;
        float f17;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        String str2;
        float f18;
        float f19;
        long j12;
        boolean F11;
        Object C11;
        d.a aVar;
        e eVar3;
        boolean z11;
        Object C12;
        int I11;
        Object C13;
        boolean F12;
        Object C14;
        int I12;
        Object C15;
        boolean F13;
        Object C16;
        Object C17;
        boolean F14;
        Object C18;
        e b11;
        boolean F15;
        Object C19;
        float f21;
        long j13;
        String str3;
        float f22;
        float f23;
        float f24;
        long j14;
        J0 m02;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onView, "onView");
        C3969l u11 = interfaceC3967k.u(844879799);
        int i24 = i14 & 1;
        if (i24 != 0) {
            i15 = i12 | 6;
            eVar2 = eVar;
        } else if ((i12 & 6) == 0) {
            eVar2 = eVar;
            i15 = (u11.n(eVar2) ? 4 : 2) | i12;
        } else {
            eVar2 = eVar;
            i15 = i12;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i12 & 48) == 0) {
            i15 |= u11.r(i11) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i12 & 384) == 0) {
            i15 |= u11.F(item) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i12 & 3072) == 0) {
            i15 |= u11.F(onClick) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i14 & 16) != 0) {
            i15 |= 24576;
        } else if ((i12 & 24576) == 0) {
            i15 |= u11.F(onView) ? 16384 : 8192;
        }
        int i25 = i14 & 32;
        if (i25 != 0) {
            i15 |= 196608;
            f15 = f7;
        } else {
            f15 = f7;
            if ((i12 & 196608) == 0) {
                i15 |= u11.q(f15) ? 131072 : 65536;
            }
        }
        int i26 = i14 & 64;
        if (i26 != 0) {
            i15 |= 1572864;
            f16 = f11;
        } else {
            f16 = f11;
            if ((i12 & 1572864) == 0) {
                i15 |= u11.q(f16) ? 1048576 : 524288;
            }
        }
        int i27 = i14 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i27 != 0) {
            i15 |= 12582912;
            f17 = f12;
        } else {
            f17 = f12;
            if ((i12 & 12582912) == 0) {
                i15 |= u11.q(f17) ? 8388608 : 4194304;
            }
        }
        int i28 = i14 & 256;
        if (i28 != 0) {
            i15 |= 100663296;
        } else if ((i12 & 100663296) == 0) {
            i15 |= u11.n(str) ? 67108864 : 33554432;
        }
        int i29 = i14 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i29 != 0) {
            i15 |= 805306368;
        } else if ((i12 & 805306368) == 0) {
            i16 = i29;
            i15 |= u11.q(f13) ? 536870912 : 268435456;
            i17 = i14 & UserVerificationMethods.USER_VERIFY_ALL;
            if (i17 == 0) {
                i19 = i13 | 6;
                i18 = i17;
            } else if ((i13 & 6) == 0) {
                i18 = i17;
                i19 = i13 | (u11.q(f14) ? 4 : 2);
            } else {
                i18 = i17;
                i19 = i13;
            }
            i21 = i14 & 2048;
            if (i21 == 0) {
                i19 |= 48;
                i22 = i21;
            } else {
                i22 = i21;
                if ((i13 & 48) == 0) {
                    i23 = i27;
                    i19 |= u11.s(j11) ? 32 : 16;
                    if ((i15 & 306783379) != 306783378 && (i19 & 19) == 18 && u11.b()) {
                        u11.j();
                        f23 = f13;
                        f21 = f14;
                        eVar3 = eVar2;
                        f22 = f17;
                        f24 = f15;
                        str3 = str;
                        j13 = j11;
                    } else {
                        e eVar4 = i24 != 0 ? e.f40358c0 : eVar2;
                        float f25 = i25 != 0 ? 4 : f15;
                        if (i26 != 0) {
                            f16 = 12;
                        }
                        float f26 = i23 != 0 ? 8 : f17;
                        str2 = i28 != 0 ? "cartTab" : str;
                        float f27 = i16 != 0 ? 32 : f13;
                        float f28 = i18 != 0 ? 12 : f14;
                        if (i22 != 0) {
                            j14 = C7807Z.f72258l;
                            f18 = f28;
                            f19 = f25;
                            j12 = j14;
                        } else {
                            f18 = f28;
                            f19 = f25;
                            j12 = j11;
                        }
                        t tokenizedEvent = item.getTokenizedEvent();
                        u11.o(1632057689);
                        F11 = u11.F(item) | ((i15 & 57344) == 16384);
                        C11 = u11.C();
                        if (!F11 || C11 == InterfaceC3967k.a.a()) {
                            aVar = null;
                            C11 = new CartTabKt$CartTab$1$1(item, onView, null);
                            u11.x(C11);
                        } else {
                            aVar = null;
                        }
                        u11.k();
                        Q.e(u11, tokenizedEvent, (Function2) C11);
                        e x11 = a0.x(a0.f(eVar4, f27), aVar, 3);
                        u11.o(1632063220);
                        int i31 = i15 & 112;
                        eVar3 = eVar4;
                        z11 = (i31 == 32) | ((234881024 & i15) == 67108864);
                        C12 = u11.C();
                        if (!z11 || C12 == InterfaceC3967k.a.a()) {
                            C12 = new CartTabKt$CartTab$2$1(str2, i11);
                            u11.x(C12);
                        }
                        u11.k();
                        e c11 = o.c(x11, false, (Function1) C12);
                        V f29 = C5185h.f(InterfaceC6250b.a.e(), false);
                        I11 = u11.I();
                        A0 d11 = u11.d();
                        e f31 = c.f(u11, c11);
                        String str4 = str2;
                        Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                            u11.H(a11);
                        } else {
                            u11.e();
                        }
                        Function2 f32 = E.f(u11, f29, u11, d11);
                        if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                            a.d(I11, u11, I11, f32);
                        }
                        F1.b(u11, f31, InterfaceC2801g.a.f());
                        C5187j c5187j = C5187j.f39515a;
                        u11.o(642900186);
                        C13 = u11.C();
                        if (C13 == InterfaceC3967k.a.a()) {
                            C13 = CartTabKt$CartTab$3$1$1.INSTANCE;
                            u11.x(C13);
                        }
                        Function1 function1 = (Function1) C13;
                        u11.k();
                        e.a aVar2 = e.f40358c0;
                        e b12 = c5187j.b(aVar2);
                        u11.o(642903143);
                        F12 = u11.F(item);
                        C14 = u11.C();
                        if (!F12 || C14 == InterfaceC3967k.a.a()) {
                            C14 = new CartTabKt$CartTab$3$2$1(item);
                            u11.x(C14);
                        }
                        u11.k();
                        androidx.compose.ui.viewinterop.a.a(function1, b12, (Function1) C14, u11, 6, 0);
                        e g10 = T.g(a0.v(aVar2, null, 3), f16, f26);
                        float f33 = f26;
                        Y b13 = X.b(C5179b.n(f19), InterfaceC6250b.a.i(), u11, 48);
                        I12 = u11.I();
                        A0 d12 = u11.d();
                        e f34 = c.f(u11, g10);
                        float f35 = f27;
                        Function0 a12 = InterfaceC2801g.a.a();
                        u11.i();
                        if (u11.t()) {
                            u11.H(a12);
                        } else {
                            u11.e();
                        }
                        Function2 h11 = Cm.e.h(u11, b13, u11, d12);
                        if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                            a.d(I12, u11, I12, h11);
                        }
                        F1.b(u11, f34, InterfaceC2801g.a.f());
                        u11.o(1988286013);
                        C15 = u11.C();
                        if (C15 == InterfaceC3967k.a.a()) {
                            C15 = CartTabKt$CartTab$3$3$1$1.INSTANCE;
                            u11.x(C15);
                        }
                        Function1 function12 = (Function1) C15;
                        u11.k();
                        e v11 = a0.v(aVar2, null, 3);
                        u11.o(1988289348);
                        F13 = u11.F(item);
                        C16 = u11.C();
                        if (!F13 || C16 == InterfaceC3967k.a.a()) {
                            C16 = new CartTabKt$CartTab$3$3$2$1(item);
                            u11.x(C16);
                        }
                        u11.k();
                        androidx.compose.ui.viewinterop.a.a(function12, v11, (Function1) C16, u11, 54, 0);
                        u11.o(1988292412);
                        C17 = u11.C();
                        if (C17 == InterfaceC3967k.a.a()) {
                            C17 = CartTabKt$CartTab$3$3$3$1.INSTANCE;
                            u11.x(C17);
                        }
                        Function1 function13 = (Function1) C17;
                        u11.k();
                        e v12 = a0.v(aVar2, null, 3);
                        u11.o(1988295720);
                        F14 = u11.F(item);
                        C18 = u11.C();
                        if (!F14 || C18 == InterfaceC3967k.a.a()) {
                            C18 = new CartTabKt$CartTab$3$3$4$1(item);
                            u11.x(C18);
                        }
                        u11.k();
                        androidx.compose.ui.viewinterop.a.a(function13, v12, (Function1) C18, u11, 54, 0);
                        u11.f();
                        e b14 = c5187j.b(aVar2);
                        CornerRadius radius = item.getWrapper().getRadius();
                        b11 = androidx.compose.foundation.e.b(C6988h.a(b14, h.b(radius != null ? radius.m1866getDpD9Ej5fM() : f18)), j12, y0.a());
                        i a13 = i.a(4);
                        u11.o(642937702);
                        F15 = ((i15 & 7168) == 2048) | (i31 == 32) | u11.F(item);
                        C19 = u11.C();
                        if (!F15 || C19 == InterfaceC3967k.a.a()) {
                            C19 = new CartTabKt$CartTab$3$4$1(onClick, i11, item);
                            u11.x(C19);
                        }
                        u11.k();
                        C5185h.a(androidx.compose.foundation.i.c(b11, false, null, a13, (Function0) C19, 3), u11, 0);
                        u11.f();
                        f21 = f18;
                        j13 = j12;
                        str3 = str4;
                        f22 = f33;
                        f23 = f35;
                        f24 = f19;
                    }
                    float f36 = f16;
                    m02 = u11.m0();
                    if (m02 != null) {
                        m02.G(new CartTabKt$CartTab$4(eVar3, i11, item, onClick, onView, f24, f36, f22, str3, f23, f21, j13, i12, i13, i14));
                        return;
                    }
                    return;
                }
            }
            i23 = i27;
            if ((i15 & 306783379) != 306783378) {
            }
            if (i24 != 0) {
            }
            if (i25 != 0) {
            }
            if (i26 != 0) {
            }
            if (i23 != 0) {
            }
            if (i28 != 0) {
            }
            if (i16 != 0) {
            }
            if (i18 != 0) {
            }
            if (i22 != 0) {
            }
            t tokenizedEvent2 = item.getTokenizedEvent();
            u11.o(1632057689);
            F11 = u11.F(item) | ((i15 & 57344) == 16384);
            C11 = u11.C();
            if (F11) {
            }
            aVar = null;
            C11 = new CartTabKt$CartTab$1$1(item, onView, null);
            u11.x(C11);
            u11.k();
            Q.e(u11, tokenizedEvent2, (Function2) C11);
            e x112 = a0.x(a0.f(eVar4, f27), aVar, 3);
            u11.o(1632063220);
            if ((234881024 & i15) == 67108864) {
            }
            int i312 = i15 & 112;
            eVar3 = eVar4;
            z11 = (i312 == 32) | ((234881024 & i15) == 67108864);
            C12 = u11.C();
            if (!z11) {
            }
            C12 = new CartTabKt$CartTab$2$1(str2, i11);
            u11.x(C12);
            u11.k();
            e c112 = o.c(x112, false, (Function1) C12);
            V f292 = C5185h.f(InterfaceC6250b.a.e(), false);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f312 = c.f(u11, c112);
            String str42 = str2;
            Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f322 = E.f(u11, f292, u11, d112);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f322);
            F1.b(u11, f312, InterfaceC2801g.a.f());
            C5187j c5187j2 = C5187j.f39515a;
            u11.o(642900186);
            C13 = u11.C();
            if (C13 == InterfaceC3967k.a.a()) {
            }
            Function1 function14 = (Function1) C13;
            u11.k();
            e.a aVar22 = e.f40358c0;
            e b122 = c5187j2.b(aVar22);
            u11.o(642903143);
            F12 = u11.F(item);
            C14 = u11.C();
            if (!F12) {
            }
            C14 = new CartTabKt$CartTab$3$2$1(item);
            u11.x(C14);
            u11.k();
            androidx.compose.ui.viewinterop.a.a(function14, b122, (Function1) C14, u11, 6, 0);
            e g102 = T.g(a0.v(aVar22, null, 3), f16, f26);
            float f332 = f26;
            Y b132 = X.b(C5179b.n(f19), InterfaceC6250b.a.i(), u11, 48);
            I12 = u11.I();
            A0 d122 = u11.d();
            e f342 = c.f(u11, g102);
            float f352 = f27;
            Function0 a122 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
            }
            Function2 h112 = Cm.e.h(u11, b132, u11, d122);
            if (!u11.t()) {
            }
            a.d(I12, u11, I12, h112);
            F1.b(u11, f342, InterfaceC2801g.a.f());
            u11.o(1988286013);
            C15 = u11.C();
            if (C15 == InterfaceC3967k.a.a()) {
            }
            Function1 function122 = (Function1) C15;
            u11.k();
            e v112 = a0.v(aVar22, null, 3);
            u11.o(1988289348);
            F13 = u11.F(item);
            C16 = u11.C();
            if (!F13) {
            }
            C16 = new CartTabKt$CartTab$3$3$2$1(item);
            u11.x(C16);
            u11.k();
            androidx.compose.ui.viewinterop.a.a(function122, v112, (Function1) C16, u11, 54, 0);
            u11.o(1988292412);
            C17 = u11.C();
            if (C17 == InterfaceC3967k.a.a()) {
            }
            Function1 function132 = (Function1) C17;
            u11.k();
            e v122 = a0.v(aVar22, null, 3);
            u11.o(1988295720);
            F14 = u11.F(item);
            C18 = u11.C();
            if (!F14) {
            }
            C18 = new CartTabKt$CartTab$3$3$4$1(item);
            u11.x(C18);
            u11.k();
            androidx.compose.ui.viewinterop.a.a(function132, v122, (Function1) C18, u11, 54, 0);
            u11.f();
            e b142 = c5187j2.b(aVar22);
            CornerRadius radius2 = item.getWrapper().getRadius();
            b11 = androidx.compose.foundation.e.b(C6988h.a(b142, h.b(radius2 != null ? radius2.m1866getDpD9Ej5fM() : f18)), j12, y0.a());
            i a132 = i.a(4);
            u11.o(642937702);
            F15 = ((i15 & 7168) == 2048) | (i312 == 32) | u11.F(item);
            C19 = u11.C();
            if (!F15) {
            }
            C19 = new CartTabKt$CartTab$3$4$1(onClick, i11, item);
            u11.x(C19);
            u11.k();
            C5185h.a(androidx.compose.foundation.i.c(b11, false, null, a132, (Function0) C19, 3), u11, 0);
            u11.f();
            f21 = f18;
            j13 = j12;
            str3 = str42;
            f22 = f332;
            f23 = f352;
            f24 = f19;
            float f362 = f16;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        i16 = i29;
        i17 = i14 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i17 == 0) {
        }
        i21 = i14 & 2048;
        if (i21 == 0) {
        }
        i23 = i27;
        if ((i15 & 306783379) != 306783378) {
        }
        if (i24 != 0) {
        }
        if (i25 != 0) {
        }
        if (i26 != 0) {
        }
        if (i23 != 0) {
        }
        if (i28 != 0) {
        }
        if (i16 != 0) {
        }
        if (i18 != 0) {
        }
        if (i22 != 0) {
        }
        t tokenizedEvent22 = item.getTokenizedEvent();
        u11.o(1632057689);
        F11 = u11.F(item) | ((i15 & 57344) == 16384);
        C11 = u11.C();
        if (F11) {
        }
        aVar = null;
        C11 = new CartTabKt$CartTab$1$1(item, onView, null);
        u11.x(C11);
        u11.k();
        Q.e(u11, tokenizedEvent22, (Function2) C11);
        e x1122 = a0.x(a0.f(eVar4, f27), aVar, 3);
        u11.o(1632063220);
        if ((234881024 & i15) == 67108864) {
        }
        int i3122 = i15 & 112;
        eVar3 = eVar4;
        z11 = (i3122 == 32) | ((234881024 & i15) == 67108864);
        C12 = u11.C();
        if (!z11) {
        }
        C12 = new CartTabKt$CartTab$2$1(str2, i11);
        u11.x(C12);
        u11.k();
        e c1122 = o.c(x1122, false, (Function1) C12);
        V f2922 = C5185h.f(InterfaceC6250b.a.e(), false);
        I11 = u11.I();
        A0 d1122 = u11.d();
        e f3122 = c.f(u11, c1122);
        String str422 = str2;
        Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f3222 = E.f(u11, f2922, u11, d1122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f3222);
        F1.b(u11, f3122, InterfaceC2801g.a.f());
        C5187j c5187j22 = C5187j.f39515a;
        u11.o(642900186);
        C13 = u11.C();
        if (C13 == InterfaceC3967k.a.a()) {
        }
        Function1 function142 = (Function1) C13;
        u11.k();
        e.a aVar222 = e.f40358c0;
        e b1222 = c5187j22.b(aVar222);
        u11.o(642903143);
        F12 = u11.F(item);
        C14 = u11.C();
        if (!F12) {
        }
        C14 = new CartTabKt$CartTab$3$2$1(item);
        u11.x(C14);
        u11.k();
        androidx.compose.ui.viewinterop.a.a(function142, b1222, (Function1) C14, u11, 6, 0);
        e g1022 = T.g(a0.v(aVar222, null, 3), f16, f26);
        float f3322 = f26;
        Y b1322 = X.b(C5179b.n(f19), InterfaceC6250b.a.i(), u11, 48);
        I12 = u11.I();
        A0 d1222 = u11.d();
        e f3422 = c.f(u11, g1022);
        float f3522 = f27;
        Function0 a1222 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 h1122 = Cm.e.h(u11, b1322, u11, d1222);
        if (!u11.t()) {
        }
        a.d(I12, u11, I12, h1122);
        F1.b(u11, f3422, InterfaceC2801g.a.f());
        u11.o(1988286013);
        C15 = u11.C();
        if (C15 == InterfaceC3967k.a.a()) {
        }
        Function1 function1222 = (Function1) C15;
        u11.k();
        e v1122 = a0.v(aVar222, null, 3);
        u11.o(1988289348);
        F13 = u11.F(item);
        C16 = u11.C();
        if (!F13) {
        }
        C16 = new CartTabKt$CartTab$3$3$2$1(item);
        u11.x(C16);
        u11.k();
        androidx.compose.ui.viewinterop.a.a(function1222, v1122, (Function1) C16, u11, 54, 0);
        u11.o(1988292412);
        C17 = u11.C();
        if (C17 == InterfaceC3967k.a.a()) {
        }
        Function1 function1322 = (Function1) C17;
        u11.k();
        e v1222 = a0.v(aVar222, null, 3);
        u11.o(1988295720);
        F14 = u11.F(item);
        C18 = u11.C();
        if (!F14) {
        }
        C18 = new CartTabKt$CartTab$3$3$4$1(item);
        u11.x(C18);
        u11.k();
        androidx.compose.ui.viewinterop.a.a(function1322, v1222, (Function1) C18, u11, 54, 0);
        u11.f();
        e b1422 = c5187j22.b(aVar222);
        CornerRadius radius22 = item.getWrapper().getRadius();
        b11 = androidx.compose.foundation.e.b(C6988h.a(b1422, h.b(radius22 != null ? radius22.m1866getDpD9Ej5fM() : f18)), j12, y0.a());
        i a1322 = i.a(4);
        u11.o(642937702);
        F15 = ((i15 & 7168) == 2048) | (i3122 == 32) | u11.F(item);
        C19 = u11.C();
        if (!F15) {
        }
        C19 = new CartTabKt$CartTab$3$4$1(onClick, i11, item);
        u11.x(C19);
        u11.k();
        C5185h.a(androidx.compose.foundation.i.c(b11, false, null, a1322, (Function0) C19, 3), u11, 0);
        u11.f();
        f21 = f18;
        j13 = j12;
        str3 = str422;
        f22 = f3322;
        f23 = f3522;
        f24 = f19;
        float f3622 = f16;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }
}
