package ru.ozon.app.android.search.widgets.curtainHeader.presentation;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import T7.E;
import Tg.b;
import Z1.q;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.K0;
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
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/search/widgets/curtainHeader/presentation/CurtainHeaderVO;", "item", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "CurtainHeaderWidget", "(Lru/ozon/app/android/search/widgets/curtainHeader/presentation/CurtainHeaderVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "LZ1/h;", "minHeaderHeight", "F", "titlePadding", "LZ1/q;", "leftButtonSize", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CurtainHeaderWidgetKt {
    private static final float minHeaderHeight = 44;
    private static final float titlePadding = UniTheme.INSTANCE.getPaddings().getPadding300();

    public static final void CurtainHeaderWidget(@NotNull CurtainHeaderVO item, @NotNull Function1<? super b, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        Function1<? super b, Unit> actionHandler = function1;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(1374984010);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(item) : u11.F(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        int i13 = i12;
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            C7807Z c7807z = TokenParserKt.tokenToColor(item.getBackgroundColor(), u11, 0);
            u11.o(-1392185856);
            long layerFloor1 = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : c7807z.w();
            u11.k();
            d h11 = InterfaceC6250b.a.h();
            e.a aVar = e.f40358c0;
            b11 = androidx.compose.foundation.e.b(a0.e(aVar, 1.0f), layerFloor1, y0.a());
            e h12 = a0.h(T.j(b11, 0.0f, item.getPaddings().getTop().m1867getDpD9Ej5fM(), 0.0f, item.getPaddings().getBottom().m1867getDpD9Ej5fM(), 5), minHeaderHeight, 0.0f, 2);
            V f7 = C5185h.f(h11, false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, h12);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C5187j c5187j = C5187j.f39515a;
            Z1.d dVar = (Z1.d) u11.m(K0.e());
            float f13 = ((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())).screenWidthDp;
            float m1867getDpD9Ej5fM = item.getPaddings().getRight().m1867getDpD9Ej5fM();
            float m1867getDpD9Ej5fM2 = item.getPaddings().getLeft().m1867getDpD9Ej5fM();
            u11.o(-2117773754);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(q.a(0L), D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            u11.k();
            float B11 = dVar.B((int) (CurtainHeaderWidget$lambda$9$lambda$1(interfaceC3978p0) >> 32));
            float f14 = 2;
            float f15 = (f13 - (titlePadding * f14)) / 3;
            float f16 = f13 - ((B11 + m1867getDpD9Ej5fM2) * f14);
            ButtonV3DTO leftButton = item.getLeftButton();
            u11.o(-2117762086);
            if (leftButton != null) {
                e a12 = c5187j.a(aVar, InterfaceC6250b.a.h());
                u11.o(126562461);
                Object C12 = u11.C();
                if (C12 == InterfaceC3967k.a.a()) {
                    C12 = new CurtainHeaderWidgetKt$CurtainHeaderWidget$1$1$1$1(interfaceC3978p0);
                    u11.x(C12);
                }
                u11.k();
                e j11 = T.j(a0.t(androidx.compose.ui.layout.g.a(a12, (Function1) C12), 0.0f, f15, 1), m1867getDpD9Ej5fM2, 0.0f, 0.0f, 0.0f, 14);
                V f17 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I12 = u11.I();
                A0 d12 = u11.d();
                e f18 = c.f(u11, j11);
                Function0 a13 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a13);
                } else {
                    u11.e();
                }
                Function2 f19 = E.f(u11, f17, u11, d12);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    a.d(I12, u11, I12, f19);
                }
                F1.b(u11, f18, InterfaceC2801g.a.f());
                DsButtonAtomKt.DsButtonAtom(leftButton, null, false, actionHandler, u11, (i13 << 6) & 7168, 6);
                u11.f();
                Unit unit = Unit.f71690a;
            }
            u11.k();
            DsTextAtomKt.DsTextAtom(item.getTitle(), a0.t(c5187j.a(aVar, InterfaceC6250b.a.e()), 0.0f, f16, 1), u11, 0, 0);
            IconButtonV3DTO rightButton = item.getRightButton();
            u11.o(-2117737173);
            if (rightButton == null) {
                actionHandler = function1;
            } else {
                e j12 = T.j(c5187j.a(aVar, InterfaceC6250b.a.f()), 0.0f, 0.0f, m1867getDpD9Ej5fM, 0.0f, 11);
                V f21 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I13 = u11.I();
                A0 d13 = u11.d();
                e f22 = c.f(u11, j12);
                Function0 a14 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a14);
                } else {
                    u11.e();
                }
                Function2 f23 = E.f(u11, f21, u11, d13);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                    a.d(I13, u11, I13, f23);
                }
                F1.b(u11, f22, InterfaceC2801g.a.f());
                actionHandler = function1;
                DsIconButtonAtomKt.DsIconButtonAtom(item.getRightButton(), null, false, actionHandler, u11, IconButtonV3DTO.$stable | ((i13 << 6) & 7168), 6);
                u11.f();
                Unit unit2 = Unit.f71690a;
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CurtainHeaderWidgetKt$CurtainHeaderWidget$2(item, actionHandler, i11));
        }
    }

    private static final long CurtainHeaderWidget$lambda$9$lambda$1(InterfaceC3978p0<q> interfaceC3978p0) {
        return interfaceC3978p0.getValue().e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CurtainHeaderWidget$lambda$9$lambda$2(InterfaceC3978p0<q> interfaceC3978p0, long j11) {
        interfaceC3978p0.setValue(q.a(j11));
    }
}
