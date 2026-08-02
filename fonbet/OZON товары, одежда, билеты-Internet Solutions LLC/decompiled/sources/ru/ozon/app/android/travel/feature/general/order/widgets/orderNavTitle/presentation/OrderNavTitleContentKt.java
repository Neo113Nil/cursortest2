package ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation;

import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.compose.CustomColorTextAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/presentation/OrderNavTitleVO;", "item", "Ll1/Z;", "titleColor", "subtitleColor", "", "OrderNavTitleContent-htJMNJ8", "(Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/presentation/OrderNavTitleVO;Ll1/Z;Ll1/Z;LS0/k;I)V", "OrderNavTitleContent", "order_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderNavTitleContentKt {
    /* renamed from: OrderNavTitleContent-htJMNJ8, reason: not valid java name */
    public static final void m1309OrderNavTitleContenthtJMNJ8(@NotNull OrderNavTitleVO item, C7807Z c7807z, C7807Z c7807z2, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        long j11;
        e b11;
        C7807Z c7807z3;
        C7807Z c7807z4;
        Intrinsics.checkNotNullParameter(item, "item");
        C3969l u11 = interfaceC3967k.u(1297037079);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(c7807z) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(c7807z2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i13 = i12;
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            c7807z3 = c7807z;
            c7807z4 = c7807z2;
        } else {
            e.a aVar = e.f40358c0;
            e e11 = a0.e(aVar, 1.0f);
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            e u12 = a0.u(a0.h(e11, dsSpacings.m1858getDp56D9Ej5fM(), 0.0f, 2), 3);
            j11 = C7807Z.f72258l;
            b11 = androidx.compose.foundation.e.b(u12, j11, y0.a());
            e j12 = T.j(b11, 0.0f, dsSpacings.m1847getDp2D9Ej5fM(), 0.0f, 0.0f, 13);
            C5194q a11 = C5193p.a(C5179b.b(), InterfaceC6250b.a.g(), u11, 54);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, j12);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            CustomColorTextAtomKt.m1447CustomColorTextAtomgKt5lHk(item.getTitle(), a0.e(aVar, 1.0f).l0(new HorizontalAlignElement(InterfaceC6250b.a.g())), c7807z, u11, (i13 << 3) & 896, 0);
            c7807z3 = c7807z;
            TextDTO subtitle = item.getSubtitle();
            u11.o(819048527);
            if (subtitle == null) {
                c7807z4 = c7807z2;
            } else {
                c7807z4 = c7807z2;
                CustomColorTextAtomKt.m1447CustomColorTextAtomgKt5lHk(subtitle, a0.e(aVar, 1.0f).l0(new HorizontalAlignElement(InterfaceC6250b.a.g())), c7807z4, u11, i13 & 896, 0);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new OrderNavTitleContentKt$OrderNavTitleContent$2(item, c7807z3, c7807z4, i11));
        }
    }
}
