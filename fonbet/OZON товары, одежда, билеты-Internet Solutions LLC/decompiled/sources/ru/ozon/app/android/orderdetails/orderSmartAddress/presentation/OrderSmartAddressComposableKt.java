package ru.ozon.app.android.orderdetails.orderSmartAddress.presentation;

import B1.V;
import D1.InterfaceC2801g;
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
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.orderSmartAddress.viewObject.OrderSmartAddressVO;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/orderdetails/orderSmartAddress/viewObject/OrderSmartAddressVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "OrderSmartAddressComposable", "(Lru/ozon/app/android/orderdetails/orderSmartAddress/viewObject/OrderSmartAddressVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "orderdetails_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderSmartAddressComposableKt {
    public static final void OrderSmartAddressComposable(@NotNull OrderSmartAddressVO item, @NotNull Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        Function1<? super AtomAction, Unit> actionHandler = function1;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-672089883);
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
            e.a aVar = e.f40358c0;
            b11 = androidx.compose.foundation.e.b(aVar, UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1(), y0.a());
            u11.o(1272925979);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = OrderSmartAddressComposableKt$OrderSmartAddressComposable$1$1.INSTANCE;
                u11.x(C11);
            }
            u11.k();
            e a11 = Q1.a(o.c(b11, false, (Function1) C11), "OrderSmartAddressWidgetView");
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, a11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            e b12 = C5187j.f39515a.b(aVar);
            u11.o(491818265);
            boolean z11 = ((i13 & 14) == 4 || ((i13 & 8) != 0 && u11.F(item))) | ((i13 & 112) == 32);
            Object C12 = u11.C();
            if (z11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new OrderSmartAddressComposableKt$OrderSmartAddressComposable$2$1$1(item, actionHandler);
                u11.x(C12);
            }
            u11.k();
            C5185h.a(i.b(b12, null, null, false, null, null, (Function0) C12, 28), u11, 0);
            C5194q a13 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f13 = c.f(u11, aVar);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a13, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, g10);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            DsTextAtomKt.DsTextAtom(item.getTitle(), null, u11, 0, 2);
            DsTextAtomKt.DsTextAtom(item.getAddress(), null, u11, 0, 2);
            CellDTO deliveryPlaceCell = item.getDeliveryPlaceCell();
            u11.o(-1487225529);
            if (deliveryPlaceCell != null) {
                DsCellAtomKt.DsCellAtom(deliveryPlaceCell, null, actionHandler, u11, ((i13 << 3) & 896) | CellDTO.$stable, 2);
            }
            u11.k();
            BadgeDTO deliveryInfoBadge = item.getDeliveryInfoBadge();
            u11.o(-1487219645);
            if (deliveryInfoBadge == null) {
                actionHandler = function1;
            } else {
                float f14 = 16;
                actionHandler = function1;
                DsBadgeAtomKt.DsBadgeAtom(deliveryInfoBadge, T.j(aVar, f14, 6, 0.0f, f14, 4), actionHandler, u11, (i13 << 3) & 896, 0);
            }
            u11.k();
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new OrderSmartAddressComposableKt$OrderSmartAddressComposable$3(item, actionHandler, i11));
        }
    }
}
