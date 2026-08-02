package ru.ozon.app.android.cart.familyGroup.presentation.compose;

import A0.h;
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
import T7.E;
import Tg.b;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.familyGroup.data.FamilyGroupDTO;
import ru.ozon.app.android.cart.familyGroup.presentation.FamilyGroupVO;
import ru.ozon.app.android.cart.familyGroup.presentation.compose.iconStack.FamilyGroupIconStackComposableKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;
import u0.C9891D;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cart/familyGroup/presentation/FamilyGroupVO;", "item", "Lkotlin/Function2;", "LWZ/t;", "", "onView", "Lkotlin/Function1;", "LTg/b;", "actionHandler", "FamilyGroupComposable", "(Lru/ozon/app/android/cart/familyGroup/presentation/FamilyGroupVO;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FamilyGroupComposableKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FamilyGroupComposable(@NotNull FamilyGroupVO item, Function2<? super FamilyGroupVO, ? super t, Unit> function2, @NotNull Function1<? super b, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function2<? super FamilyGroupVO, ? super t, Unit> function22;
        t tokenizedEvent;
        e b11;
        Object C11;
        int I11;
        e b12;
        boolean F11;
        Object C12;
        TestInfo testInfo;
        int I12;
        int I13;
        TextDTO subtitle;
        FamilyGroupVO.RightBlock rightBlock;
        Paddings paddingBottom;
        Paddings paddingRight;
        Paddings paddingTop;
        Paddings paddingLeft;
        CornerRadius cornerRadius;
        Paddings horizontalMargin;
        J0 m02;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(634363527);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(item) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            function22 = function2;
            i13 |= u11.F(function22) ? 32 : 16;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                i13 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i13 & 147) == 146 || !u11.b()) {
                if (i14 != 0) {
                    u11.o(-1184243873);
                    Object C13 = u11.C();
                    if (C13 == InterfaceC3967k.a.a()) {
                        C13 = FamilyGroupComposableKt$FamilyGroupComposable$1$1.INSTANCE;
                        u11.x(C13);
                    }
                    u11.k();
                    function22 = (Function2) C13;
                }
                tokenizedEvent = item.getTokenizedEvent();
                u11.o(-1184240220);
                if (tokenizedEvent != null) {
                    AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                    u11.o(-1184237560);
                    boolean F12 = ((i13 & 112) == 32) | u11.F(item) | u11.F(tokenizedEvent);
                    Object C14 = u11.C();
                    if (F12 || C14 == InterfaceC3967k.a.a()) {
                        C14 = new FamilyGroupComposableKt$FamilyGroupComposable$2$1(function22, item, tokenizedEvent);
                        u11.x(C14);
                    }
                    u11.k();
                    i.a(aVar, null, (Function0) C14, u11, 6);
                }
                u11.k();
                FamilyGroupDTO.FamilyGroupSettingsDTO settings = item.getSettings();
                e.a aVar2 = e.f40358c0;
                int i15 = i13;
                b11 = androidx.compose.foundation.e.b(a0.e(aVar2, 1.0f), G1.b.a(u11, UniColors.LAYER_FLOOR_0.getResId()), y0.a());
                e h11 = T.h(b11, (settings != null || (horizontalMargin = settings.getHorizontalMargin()) == null) ? 0 : horizontalMargin.m1867getDpD9Ej5fM(), 0.0f, 2);
                u11.o(-1184227149);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = FamilyGroupComposableKt$FamilyGroupComposable$3$1.INSTANCE;
                    u11.x(C11);
                }
                u11.k();
                e c11 = o.c(h11, false, (Function1) C11);
                V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f11 = c.f(u11, c11);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a11);
                }
                Function2 f12 = E.f(u11, f7, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, f12);
                }
                b12 = androidx.compose.foundation.e.b(C6988h.a(GZ.e.c(u11, f11, aVar2, 1.0f), h.b((settings != null || (cornerRadius = settings.getCornerRadius()) == null) ? 0 : cornerRadius.m1866getDpD9Ej5fM())), G1.b.a(u11, UniColors.LAYER_FLOOR_1.getResId()), y0.a());
                u11.o(-1857218558);
                F11 = u11.F(item) | ((i15 & 896) != 256);
                C12 = u11.C();
                if (!F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new FamilyGroupComposableKt$FamilyGroupComposable$4$1$1(item, actionHandler);
                    u11.x(C12);
                }
                u11.k();
                e b13 = androidx.compose.foundation.i.b(b12, null, null, false, null, null, (Function0) C12, 28);
                testInfo = item.getTestInfo();
                if (testInfo != null || (r7 = testInfo.getAutomatizationId()) == null) {
                    String str = "familyGroup";
                }
                e i16 = T.i(Q1.a(b13, str), (settings != null || (paddingLeft = settings.getPaddingLeft()) == null) ? 0 : paddingLeft.m1867getDpD9Ej5fM(), (settings != null || (paddingTop = settings.getPaddingTop()) == null) ? 0 : paddingTop.m1867getDpD9Ej5fM(), (settings != null || (paddingRight = settings.getPaddingRight()) == null) ? 0 : paddingRight.m1867getDpD9Ej5fM(), (settings != null || (paddingBottom = settings.getPaddingBottom()) == null) ? 0 : paddingBottom.m1867getDpD9Ej5fM());
                Y b14 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
                I12 = u11.I();
                A0 d12 = u11.d();
                e f13 = c.f(u11, i16);
                Function0 a12 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a12);
                }
                Function2 h12 = Cm.e.h(u11, b14, u11, d12);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    a.d(I12, u11, I12, h12);
                }
                F1.b(u11, f13, InterfaceC2801g.a.f());
                C9891D c9891d = C9891D.f99599a;
                e a13 = Q1.a(c9891d.a(c9891d.b(aVar2, InterfaceC6250b.a.i()), 1.0f, true), "familyGroupTitleSubtitleContainer");
                C5194q a14 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                I13 = u11.I();
                A0 d13 = u11.d();
                e f14 = c.f(u11, a13);
                Function0 a15 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a15);
                }
                Function2 g10 = K00.b.g(u11, a14, u11, d13);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                    a.d(I13, u11, I13, g10);
                }
                F1.b(u11, f14, InterfaceC2801g.a.f());
                DsTextAtomKt.DsTextAtom(item.getTitle(), null, u11, 0, 2);
                subtitle = item.getSubtitle();
                u11.o(1364047474);
                if (subtitle != null) {
                    DsTextAtomKt.DsTextAtom(subtitle, null, u11, 0, 2);
                    Unit unit = Unit.f71690a;
                }
                u11.k();
                u11.f();
                rightBlock = item.getRightBlock();
                u11.o(145184290);
                if (rightBlock != null) {
                    u0.E.a(u11, a0.r(aVar2, 8));
                    FamilyGroupIconStackComposableKt.FamilyGroupIconStackComposable(Q1.a(c9891d.b(aVar2, InterfaceC6250b.a.i()), "familyGroupIconStackContainer"), rightBlock, u11, 0, 0);
                    Unit unit2 = Unit.f71690a;
                }
                u11.k();
                u11.f();
                u11.f();
            } else {
                u11.j();
            }
            Function2<? super FamilyGroupVO, ? super t, Unit> function23 = function22;
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new FamilyGroupComposableKt$FamilyGroupComposable$5(item, function23, actionHandler, i11, i12));
                return;
            }
            return;
        }
        function22 = function2;
        if ((i12 & 4) == 0) {
        }
        if ((i13 & 147) == 146) {
        }
        if (i14 != 0) {
        }
        tokenizedEvent = item.getTokenizedEvent();
        u11.o(-1184240220);
        if (tokenizedEvent != null) {
        }
        u11.k();
        FamilyGroupDTO.FamilyGroupSettingsDTO settings2 = item.getSettings();
        e.a aVar22 = e.f40358c0;
        int i152 = i13;
        b11 = androidx.compose.foundation.e.b(a0.e(aVar22, 1.0f), G1.b.a(u11, UniColors.LAYER_FLOOR_0.getResId()), y0.a());
        e h112 = T.h(b11, (settings2 != null || (horizontalMargin = settings2.getHorizontalMargin()) == null) ? 0 : horizontalMargin.m1867getDpD9Ej5fM(), 0.0f, 2);
        u11.o(-1184227149);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        u11.k();
        e c112 = o.c(h112, false, (Function1) C11);
        V f72 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f112 = c.f(u11, c112);
        Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f122 = E.f(u11, f72, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f122);
        b12 = androidx.compose.foundation.e.b(C6988h.a(GZ.e.c(u11, f112, aVar22, 1.0f), h.b((settings2 != null || (cornerRadius = settings2.getCornerRadius()) == null) ? 0 : cornerRadius.m1866getDpD9Ej5fM())), G1.b.a(u11, UniColors.LAYER_FLOOR_1.getResId()), y0.a());
        u11.o(-1857218558);
        F11 = u11.F(item) | ((i152 & 896) != 256);
        C12 = u11.C();
        if (!F11) {
        }
        C12 = new FamilyGroupComposableKt$FamilyGroupComposable$4$1$1(item, actionHandler);
        u11.x(C12);
        u11.k();
        e b132 = androidx.compose.foundation.i.b(b12, null, null, false, null, null, (Function0) C12, 28);
        testInfo = item.getTestInfo();
        if (testInfo != null) {
        }
        String str2 = "familyGroup";
        e i162 = T.i(Q1.a(b132, str2), (settings2 != null || (paddingLeft = settings2.getPaddingLeft()) == null) ? 0 : paddingLeft.m1867getDpD9Ej5fM(), (settings2 != null || (paddingTop = settings2.getPaddingTop()) == null) ? 0 : paddingTop.m1867getDpD9Ej5fM(), (settings2 != null || (paddingRight = settings2.getPaddingRight()) == null) ? 0 : paddingRight.m1867getDpD9Ej5fM(), (settings2 != null || (paddingBottom = settings2.getPaddingBottom()) == null) ? 0 : paddingBottom.m1867getDpD9Ej5fM());
        Y b142 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
        I12 = u11.I();
        A0 d122 = u11.d();
        e f132 = c.f(u11, i162);
        Function0 a122 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 h122 = Cm.e.h(u11, b142, u11, d122);
        if (!u11.t()) {
        }
        a.d(I12, u11, I12, h122);
        F1.b(u11, f132, InterfaceC2801g.a.f());
        C9891D c9891d2 = C9891D.f99599a;
        e a132 = Q1.a(c9891d2.a(c9891d2.b(aVar22, InterfaceC6250b.a.i()), 1.0f, true), "familyGroupTitleSubtitleContainer");
        C5194q a142 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
        I13 = u11.I();
        A0 d132 = u11.d();
        e f142 = c.f(u11, a132);
        Function0 a152 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 g102 = K00.b.g(u11, a142, u11, d132);
        if (!u11.t()) {
        }
        a.d(I13, u11, I13, g102);
        F1.b(u11, f142, InterfaceC2801g.a.f());
        DsTextAtomKt.DsTextAtom(item.getTitle(), null, u11, 0, 2);
        subtitle = item.getSubtitle();
        u11.o(1364047474);
        if (subtitle != null) {
        }
        u11.k();
        u11.f();
        rightBlock = item.getRightBlock();
        u11.o(145184290);
        if (rightBlock != null) {
        }
        u11.k();
        u11.f();
        u11.f();
        Function2<? super FamilyGroupVO, ? super t, Unit> function232 = function22;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}
