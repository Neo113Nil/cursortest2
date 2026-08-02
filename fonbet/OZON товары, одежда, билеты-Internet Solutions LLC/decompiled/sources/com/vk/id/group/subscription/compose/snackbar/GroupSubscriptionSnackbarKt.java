package com.vk.id.group.subscription.compose.snackbar;

import Bl0.C2652m;
import D1.InterfaceC2801g;
import G1.b;
import I0.C3173b;
import Nk.a;
import P0.C3758n1;
import P0.E;
import P0.b2;
import P0.p2;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import a1.c;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.compose.R$color;
import com.vk.id.group.subscription.compose.R$drawable;
import com.vk.id.group.subscription.compose.snackbar.GroupSubscriptionSnackbarKt;
import com.vk.id.group.subscription.compose.util.StylingUtilKt;
import e1.InterfaceC6250b;
import e1.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", "style", "", "message", "", "GroupSubscriptionSnackbar", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;Ljava/lang/String;LS0/k;I)V", "group-subscription-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GroupSubscriptionSnackbarKt {
    public static final void GroupSubscriptionSnackbar(@NotNull final GroupSubscriptionStyle style, @NotNull final String message, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(message, "message");
        C3969l u11 = interfaceC3967k.u(-1779598434);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(style) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(message) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            c3969l = u11;
            b2.a(Q1.a(e.f40358c0, "group_subscription_snackbar"), ComposableSingletons$GroupSubscriptionSnackbarKt.INSTANCE.m50getLambda1$group_subscription_compose_release(), null, C3758n1.e(), StylingUtilKt.backgroundColor(style, u11, i12 & 14), 0L, 0L, 0L, c.c(656028067, new Function2<InterfaceC3967k, Integer, Unit>() { // from class: com.vk.id.group.subscription.compose.snackbar.GroupSubscriptionSnackbarKt$GroupSubscriptionSnackbar$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k2, Integer num) {
                    invoke(interfaceC3967k2, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(InterfaceC3967k interfaceC3967k2, int i13) {
                    if ((i13 & 3) == 2 && interfaceC3967k2.b()) {
                        interfaceC3967k2.j();
                        return;
                    }
                    d.b i14 = InterfaceC6250b.a.i();
                    GroupSubscriptionStyle groupSubscriptionStyle = GroupSubscriptionStyle.this;
                    String str = message;
                    e.a aVar = e.f40358c0;
                    Y b11 = X.b(C5179b.f(), i14, interfaceC3967k2, 48);
                    int I11 = interfaceC3967k2.I();
                    A0 d11 = interfaceC3967k2.d();
                    e f7 = androidx.compose.ui.c.f(interfaceC3967k2, aVar);
                    InterfaceC2801g.f5440U.getClass();
                    Function0 a11 = InterfaceC2801g.a.a();
                    if (interfaceC3967k2.v() == null) {
                        C8060b.c();
                        throw null;
                    }
                    interfaceC3967k2.i();
                    if (interfaceC3967k2.t()) {
                        interfaceC3967k2.H(a11);
                    } else {
                        interfaceC3967k2.e();
                    }
                    Function2 f11 = C3173b.f(interfaceC3967k2, b11, interfaceC3967k2, d11);
                    if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                        a.d(f11, I11, interfaceC3967k2, I11);
                    }
                    F1.b(interfaceC3967k2, f7, InterfaceC2801g.a.f());
                    E.a(G1.e.a(R$drawable.vkid_check_circle_outline, interfaceC3967k2, 0), null, aVar, b.a(interfaceC3967k2, R$color.vkid_green), interfaceC3967k2, 432);
                    p2.b(str, T.h(aVar, 12, 0.0f, 2), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, new K1.T(StylingUtilKt.textPrimaryColor(groupSubscriptionStyle, interfaceC3967k2, 0), 0L, null, null, 0L, 0, 0L, null, 0, 16777214), interfaceC3967k2, 48, 0, 65532);
                    interfaceC3967k2.f();
                }
            }, u11), c3969l, 805306422, 460);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: ia.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit GroupSubscriptionSnackbar$lambda$0;
                    int intValue = ((Integer) obj2).intValue();
                    String str = message;
                    int i13 = i11;
                    GroupSubscriptionSnackbar$lambda$0 = GroupSubscriptionSnackbarKt.GroupSubscriptionSnackbar$lambda$0(GroupSubscriptionStyle.this, str, i13, (InterfaceC3967k) obj, intValue);
                    return GroupSubscriptionSnackbar$lambda$0;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupSubscriptionSnackbar$lambda$0(GroupSubscriptionStyle groupSubscriptionStyle, String str, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        GroupSubscriptionSnackbar(groupSubscriptionStyle, str, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }
}
