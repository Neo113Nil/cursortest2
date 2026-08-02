package ru.ozon.app.android.orderdetails.orderactions.v2.presentation;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import I1.o;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import WZ.l;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
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
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.orderdetails.orderactions.v2.presentation.OrderActionsV2VO;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a3\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018\"\u0014\u0010\u001a\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018\"\u0014\u0010\u001c\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018\"\u0014\u0010\u001d\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018\"\u0014\u0010\u001e\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/orderdetails/orderactions/v2/presentation/OrderActionsV2VO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/utils/AppType;", "appType", "OrderActionsV2Composable", "(Lru/ozon/app/android/orderdetails/orderactions/v2/presentation/OrderActionsV2VO;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/utils/AppType;LS0/k;I)V", "Lru/ozon/app/android/orderdetails/orderactions/v2/presentation/OrderActionsV2VO$OrderActionV2VO;", "action", "Landroidx/compose/ui/e;", "modifier", "OrderAction", "(Lru/ozon/app/android/orderdetails/orderactions/v2/presentation/OrderActionsV2VO$OrderActionV2VO;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/utils/AppType;LS0/k;I)V", "", "isRow", "Lkotlin/Function0;", "content", "ColumnOrRow", "(ZLandroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LS0/k;II)V", "LZ1/h;", "HORIZONTAL_PADDING", "F", "BOTTOM_PADDING", "ACTION_HEIGHT", "ICON_SIZE", "ARRANGEMENT_INNER_SPACING", "ACTIONS_SPACING", "ACTION_INNER_HORIZONTAL_PADDING", "orderdetails_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderActionsV2ComposableKt {
    private static final float ACTION_INNER_HORIZONTAL_PADDING;
    private static final float BOTTOM_PADDING;
    private static final float HORIZONTAL_PADDING = 16;
    private static final float ACTION_HEIGHT = 60;
    private static final float ICON_SIZE = 24;
    private static final float ARRANGEMENT_INNER_SPACING = 4;
    private static final float ACTIONS_SPACING = 5;

    static {
        float f7 = 8;
        BOTTOM_PADDING = f7;
        ACTION_INNER_HORIZONTAL_PADDING = f7;
    }

    public static final void ColumnOrRow(boolean z11, e eVar, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(-453752755);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.p(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = 2 & i12;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        if ((4 & i12) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(content) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            if (z11) {
                u11.o(385222287);
                int i15 = C5179b.f39454h;
                Y b11 = X.b(C5179b.n(ARRANGEMENT_INNER_SPACING), InterfaceC6250b.a.i(), u11, 54);
                int I11 = u11.I();
                A0 d11 = u11.d();
                e f7 = c.f(u11, eVar);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.H(a11);
                } else {
                    u11.e();
                }
                Function2 h11 = Cm.e.h(u11, b11, u11, d11);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, h11);
                }
                F1.b(u11, f7, InterfaceC2801g.a.f());
                content.invoke(u11, Integer.valueOf((i13 >> 6) & 14));
                u11.f();
                u11.k();
            } else {
                u11.o(385448618);
                int i16 = C5179b.f39454h;
                C5194q a12 = C5193p.a(C5179b.n(ARRANGEMENT_INNER_SPACING), InterfaceC6250b.a.g(), u11, 54);
                int I12 = u11.I();
                A0 d12 = u11.d();
                e f11 = c.f(u11, eVar);
                Function0 a13 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.H(a13);
                } else {
                    u11.e();
                }
                Function2 g10 = b.g(u11, a12, u11, d12);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    a.d(I12, u11, I12, g10);
                }
                F1.b(u11, f11, InterfaceC2801g.a.f());
                content.invoke(u11, Integer.valueOf((i13 >> 6) & 14));
                u11.f();
                u11.k();
            }
        }
        e eVar2 = eVar;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new OrderActionsV2ComposableKt$ColumnOrRow$3(z11, eVar2, content, i11, i12));
        }
    }

    public static final void OrderAction(@NotNull OrderActionsV2VO.OrderActionV2VO action, @NotNull e modifier, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull AppType appType, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(appType, "appType");
        C3969l u11 = interfaceC3967k.u(-812457386);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(action) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(modifier) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(appType) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            A0.g b11 = h.b(AppTokensProvider.CornerRadius.INSTANCE.small(appType).m1866getDpD9Ej5fM());
            e a11 = C6988h.a(a0.o(modifier, 0, ACTION_HEIGHT), b11);
            C7807Z c7807z = TokenParserKt.tokenToColor(action.getBackgroundColor(), u11, 0);
            u11.o(-1895813507);
            long layerSurface = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerSurface() : c7807z.w();
            u11.k();
            e a12 = Q1.a(androidx.compose.foundation.e.b(a11, layerSurface, b11), action.getTestInfo().getAutomatizationId());
            u11.o(-1895806943);
            boolean F11 = ((i12 & 896) == 256) | u11.F(action);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new OrderActionsV2ComposableKt$OrderAction$1$1(action, actionHandler);
                u11.x(C11);
            }
            u11.k();
            e c11 = i.c(a12, false, null, null, (Function0) C11, 7);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, c11);
            Function0 a13 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            ColumnOrRow(!action.getIsVertical(), T.h(C5187j.f39515a.a(e.f40358c0, InterfaceC6250b.a.e()), ACTION_INNER_HORIZONTAL_PADDING, 0.0f, 2), a1.c.c(2128246844, new OrderActionsV2ComposableKt$OrderAction$2$1(action), u11), u11, 384, 0);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new OrderActionsV2ComposableKt$OrderAction$3(action, modifier, actionHandler, appType, i11));
        }
    }

    public static final void OrderActionsV2Composable(@NotNull OrderActionsV2VO item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull AppType appType, InterfaceC3967k interfaceC3967k, int i11) {
        e b11;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(appType, "appType");
        C3969l u11 = interfaceC3967k.u(1904492960);
        int i12 = (i11 & 6) == 0 ? (u11.F(item) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(appType) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i13 = i12;
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            l lVar = (l) u11.m(f.e());
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(-687626516);
            boolean F11 = u11.F(item) | u11.F(lVar);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new OrderActionsV2ComposableKt$OrderActionsV2Composable$1$1(item, lVar);
                u11.x(C11);
            }
            u11.k();
            e3.i.a(aVar, null, (Function0) C11, u11, 6);
            b11 = androidx.compose.foundation.e.b(a0.e(e.f40358c0, 1.0f), UniCompositionLocalKt.getThemedColor(AppTokensProvider.Colors.INSTANCE.layerOverlay(appType), u11, UniColorToken.$stable), y0.a());
            e j11 = T.j(T.h(b11, HORIZONTAL_PADDING, 0.0f, 2), 0.0f, 0.0f, 0.0f, BOTTOM_PADDING, 7);
            u11.o(-687613501);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = OrderActionsV2ComposableKt$OrderActionsV2Composable$2$1.INSTANCE;
                u11.x(C12);
            }
            u11.k();
            e a11 = Q1.a(o.c(j11, false, (Function1) C12), "orderActionsContainer");
            int i14 = C5179b.f39454h;
            Y b12 = X.b(C5179b.n(ACTIONS_SPACING), InterfaceC6250b.a.l(), u11, 6);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, a11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            u11.o(712740074);
            for (OrderActionsV2VO.OrderActionV2VO orderActionV2VO : item.getActions()) {
                e.a aVar2 = e.f40358c0;
                if (1.0f <= 0.0d) {
                    throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
                }
                float f11 = Float.MAX_VALUE;
                if (1.0f <= Float.MAX_VALUE) {
                    f11 = 1.0f;
                }
                OrderAction(orderActionV2VO, new LayoutWeightElement(f11, true), actionHandler, appType, u11, (i13 << 3) & 8064);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new OrderActionsV2ComposableKt$OrderActionsV2Composable$4(item, actionHandler, appType, i11));
        }
    }
}
