package ru.ozon.app.android.ugc.core.widgets.iconWidget.presentation;

import B1.V;
import D1.InterfaceC2801g;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import T7.E;
import Tg.b;
import WZ.t;
import a00.C4911f;
import android.view.View;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.recyclerview.widget.RecyclerView;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u001aA\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/iconWidget/presentation/IconWidgetVO;", "state", "Lkotlin/Function1;", "LWZ/t;", "", "onView", "LTg/b;", "actionHandler", "IconComposeWidget", "(Lru/ozon/app/android/ugc/core/widgets/iconWidget/presentation/IconWidgetVO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "", "isScrolledPastStatusBar", "IconComposeWidgetContent", "(Lru/ozon/app/android/ugc/core/widgets/iconWidget/presentation/IconWidgetVO;ZLkotlin/jvm/functions/Function1;LS0/k;II)V", "rememberIsScrolledPastStatusBar", "(Lru/ozon/app/android/ugc/core/widgets/iconWidget/presentation/IconWidgetVO;LS0/k;I)Z", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IconComposeWidgetKt {
    public static final void IconComposeWidget(@NotNull IconWidgetVO state, Function1<? super t, Unit> function1, @NotNull Function1<? super b, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(108671271);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                u11.o(-1744968048);
                Object C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = IconComposeWidgetKt$IconComposeWidget$1$1.INSTANCE;
                    u11.x(C11);
                }
                function1 = (Function1) C11;
                u11.k();
            }
            t tokenizedEvent = state.getTokenizedEvent();
            u11.o(-1744965548);
            if (tokenizedEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(372049103);
                boolean F11 = ((i13 & 112) == 32) | u11.F(tokenizedEvent);
                Object C12 = u11.C();
                if (F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new IconComposeWidgetKt$IconComposeWidget$2$1$1(function1, tokenizedEvent);
                    u11.x(C12);
                }
                u11.k();
                i.a(aVar, null, (Function0) C12, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            IconComposeWidgetContent(state, rememberIsScrolledPastStatusBar(state, u11, i13 & 14), actionHandler, u11, i13 & 910, 0);
        }
        Function1<? super t, Unit> function12 = function1;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new IconComposeWidgetKt$IconComposeWidget$3(state, function12, actionHandler, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IconComposeWidgetContent(IconWidgetVO iconWidgetVO, boolean z11, Function1<? super b, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        boolean z12;
        C7807Z c7807z;
        e b11;
        int I11;
        boolean F11;
        Object C11;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-710738373);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(iconWidgetVO) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            z12 = z11;
            i13 |= u11.p(z12) ? 32 : 16;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                i13 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i13 & 147) == 146 || !u11.b()) {
                if (i14 != 0) {
                    z12 = false;
                }
                if (z12 || iconWidgetVO.getScrollColor() == null) {
                    u11.o(138416347);
                    c7807z = TokenParserKt.tokenToColor(iconWidgetVO.getBackgroundColor(), u11, 0);
                    u11.k();
                } else {
                    u11.o(138354719);
                    c7807z = TokenParserKt.tokenToColor(iconWidgetVO.getScrollColor(), u11, 0);
                    u11.k();
                }
                long w11 = c7807z == null ? c7807z.w() : C7807Z.f72258l;
                float f7 = 44;
                e.a aVar = e.f40358c0;
                b11 = androidx.compose.foundation.e.b(a0.a(aVar, f7, f7), w11, y0.a());
                V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f12 = c.f(u11, b11);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a11);
                }
                Function2 f13 = E.f(u11, f11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    Ep.a.d(I11, u11, I11, f13);
                }
                F1.b(u11, f12, InterfaceC2801g.a.f());
                C5187j c5187j = C5187j.f39515a;
                u11.o(546033255);
                IconDTO icon = iconWidgetVO.getIcon();
                e a12 = c5187j.a(T.i(aVar, iconWidgetVO.getLeftPadding().m1867getDpD9Ej5fM(), iconWidgetVO.getTopPadding().m1867getDpD9Ej5fM(), iconWidgetVO.getRightPadding().m1867getDpD9Ej5fM(), iconWidgetVO.getBottomPadding().m1867getDpD9Ej5fM()), iconWidgetVO.getComposeAlignment());
                u11.o(818706875);
                F11 = ((i13 & 896) != 256) | u11.F(iconWidgetVO);
                C11 = u11.C();
                if (!F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new IconComposeWidgetKt$IconComposeWidgetContent$1$1$1$1(iconWidgetVO, function1);
                    u11.x(C11);
                }
                u11.k();
                DsIconAtomKt.DsIconAtom(icon, androidx.compose.foundation.i.b(a12, null, null, false, null, null, (Function0) C11, 28), u11, IconDTO.$stable, 0);
                u11.k();
                u11.f();
            } else {
                u11.j();
            }
            boolean z13 = z12;
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new IconComposeWidgetKt$IconComposeWidgetContent$2(iconWidgetVO, z13, function1, i11, i12));
                return;
            }
            return;
        }
        z12 = z11;
        if ((i12 & 4) == 0) {
        }
        if ((i13 & 147) == 146) {
        }
        if (i14 != 0) {
        }
        if (z12) {
        }
        u11.o(138416347);
        c7807z = TokenParserKt.tokenToColor(iconWidgetVO.getBackgroundColor(), u11, 0);
        u11.k();
        if (c7807z == null) {
        }
        float f72 = 44;
        e.a aVar2 = e.f40358c0;
        b11 = androidx.compose.foundation.e.b(a0.a(aVar2, f72, f72), w11, y0.a());
        V f112 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f122 = c.f(u11, b11);
        Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f132 = E.f(u11, f112, u11, d112);
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, f132);
        F1.b(u11, f122, InterfaceC2801g.a.f());
        C5187j c5187j2 = C5187j.f39515a;
        u11.o(546033255);
        IconDTO icon2 = iconWidgetVO.getIcon();
        e a122 = c5187j2.a(T.i(aVar2, iconWidgetVO.getLeftPadding().m1867getDpD9Ej5fM(), iconWidgetVO.getTopPadding().m1867getDpD9Ej5fM(), iconWidgetVO.getRightPadding().m1867getDpD9Ej5fM(), iconWidgetVO.getBottomPadding().m1867getDpD9Ej5fM()), iconWidgetVO.getComposeAlignment());
        u11.o(818706875);
        F11 = ((i13 & 896) != 256) | u11.F(iconWidgetVO);
        C11 = u11.C();
        if (!F11) {
        }
        C11 = new IconComposeWidgetKt$IconComposeWidgetContent$1$1$1$1(iconWidgetVO, function1);
        u11.x(C11);
        u11.k();
        DsIconAtomKt.DsIconAtom(icon2, androidx.compose.foundation.i.b(a122, null, null, false, null, null, (Function0) C11, 28), u11, IconDTO.$stable, 0);
        u11.k();
        u11.f();
        boolean z132 = z12;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean rememberIsScrolledPastStatusBar(IconWidgetVO iconWidgetVO, InterfaceC3967k interfaceC3967k, int i11) {
        View view;
        interfaceC3967k.o(1552919084);
        if (!Intrinsics.d(iconWidgetVO.getIsSticky(), Boolean.TRUE) || iconWidgetVO.getScrollColor() == null) {
            interfaceC3967k.k();
            return false;
        }
        C4911f c4911f = (C4911f) interfaceC3967k.m(f.d());
        interfaceC3967k.o(-1791779297);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            ComponentCallbacksC5392m c11 = c4911f.c();
            C11 = (c11 == null || (view = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerView(view);
            interfaceC3967k.x(C11);
        }
        RecyclerView recyclerView = (RecyclerView) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(-1791776321);
        Object C12 = interfaceC3967k.C();
        if (C12 == InterfaceC3967k.a.a()) {
            C12 = Integer.valueOf(ResourceExtKt.getStatusBarHeight(c4911f.i()));
            interfaceC3967k.x(C12);
        }
        int intValue = ((Number) C12).intValue();
        interfaceC3967k.k();
        interfaceC3967k.o(-1791773441);
        Object C13 = interfaceC3967k.C();
        if (C13 == InterfaceC3967k.a.a()) {
            C13 = n1.f(Boolean.FALSE, D1.f25195a);
            interfaceC3967k.x(C13);
        }
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C13;
        interfaceC3967k.k();
        interfaceC3967k.o(-1791771387);
        Object C14 = interfaceC3967k.C();
        if (C14 == InterfaceC3967k.a.a()) {
            C14 = new StatusBarScrollListener(intValue, new IconComposeWidgetKt$rememberIsScrolledPastStatusBar$scrollListener$1$1(interfaceC3978p0));
            interfaceC3967k.x(C14);
        }
        StatusBarScrollListener statusBarScrollListener = (StatusBarScrollListener) C14;
        interfaceC3967k.k();
        Unit unit = Unit.f71690a;
        interfaceC3967k.o(-1791764771);
        boolean F11 = interfaceC3967k.F(recyclerView) | interfaceC3967k.F(statusBarScrollListener);
        Object C15 = interfaceC3967k.C();
        if (F11 || C15 == InterfaceC3967k.a.a()) {
            C15 = new IconComposeWidgetKt$rememberIsScrolledPastStatusBar$1$1(recyclerView, interfaceC3978p0, intValue, statusBarScrollListener);
            interfaceC3967k.x(C15);
        }
        interfaceC3967k.k();
        Q.c(unit, (Function1) C15, interfaceC3967k);
        boolean booleanValue = ((Boolean) interfaceC3978p0.getValue()).booleanValue();
        interfaceC3967k.k();
        return booleanValue;
    }
}
