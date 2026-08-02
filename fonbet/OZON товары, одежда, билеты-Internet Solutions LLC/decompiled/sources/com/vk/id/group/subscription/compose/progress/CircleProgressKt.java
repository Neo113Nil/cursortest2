package com.vk.id.group.subscription.compose.progress;

import Bl0.C2652m;
import S0.A1;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.a;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.compose.R$drawable;
import com.vk.id.group.subscription.compose.progress.CircleProgressKt;
import ha.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7825i0;
import m0.C8004n;
import m0.EnumC7987e0;
import m0.G;
import m0.O;
import m0.T;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\b\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\f¨\u0006\u000f²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", "style", "", "label", "", "CircleProgress", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;Ljava/lang/String;LS0/k;I)V", "CircleProgressWhite", "(Ljava/lang/String;LS0/k;I)V", "CircleProgressBlue", "", "progressRes", "(ILjava/lang/String;LS0/k;I)V", "", "angle", "group-subscription-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CircleProgressKt {
    public static final void CircleProgress(@NotNull final GroupSubscriptionStyle style, @NotNull final String label, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(label, "label");
        C3969l u11 = interfaceC3967k.u(362521346);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(style) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(label) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else if (style instanceof GroupSubscriptionStyle.Light) {
            u11.o(-969958999);
            CircleProgressWhite(label, u11, (i12 >> 3) & 14);
            u11.k();
        } else {
            if (!(style instanceof GroupSubscriptionStyle.Dark)) {
                u11.o(-969960715);
                u11.k();
                throw new o();
            }
            u11.o(-969956536);
            CircleProgressBlue(label, u11, (i12 >> 3) & 14);
            u11.k();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: ha.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CircleProgress$lambda$0;
                    int intValue = ((Integer) obj2).intValue();
                    String str = label;
                    int i13 = i11;
                    CircleProgress$lambda$0 = CircleProgressKt.CircleProgress$lambda$0(GroupSubscriptionStyle.this, str, i13, (InterfaceC3967k) obj, intValue);
                    return CircleProgress$lambda$0;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircleProgress$lambda$0(GroupSubscriptionStyle groupSubscriptionStyle, String str, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        CircleProgress(groupSubscriptionStyle, str, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    private static final float CircleProgress$lambda$3(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircleProgress$lambda$5$lambda$4(A1 a12, InterfaceC7825i0 graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.h(CircleProgress$lambda$3(a12));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircleProgress$lambda$6(int i11, String str, int i12, InterfaceC3967k interfaceC3967k, int i13) {
        CircleProgress(i11, str, interfaceC3967k, C2652m.e(i12 | 1));
        return Unit.f71690a;
    }

    private static final void CircleProgressBlue(final String str, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-2028856053);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            CircleProgress(R$drawable.vkid_sheet_spinner, str, u11, (i12 << 3) & 112);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: ha.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CircleProgressBlue$lambda$2;
                    int intValue = ((Integer) obj2).intValue();
                    CircleProgressBlue$lambda$2 = CircleProgressKt.CircleProgressBlue$lambda$2(str, i11, (InterfaceC3967k) obj, intValue);
                    return CircleProgressBlue$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircleProgressBlue$lambda$2(String str, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        CircleProgressBlue(str, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    private static final void CircleProgressWhite(final String str, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(944364882);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            CircleProgress(R$drawable.vkid_sheet_spinner_white, str, u11, (i12 << 3) & 112);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: ha.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CircleProgressWhite$lambda$1;
                    int intValue = ((Integer) obj2).intValue();
                    CircleProgressWhite$lambda$1 = CircleProgressKt.CircleProgressWhite$lambda$1(str, i11, (InterfaceC3967k) obj, intValue);
                    return CircleProgressWhite$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircleProgressWhite$lambda$1(String str, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        CircleProgressWhite(str, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    private static final void CircleProgress(final int i11, String str, InterfaceC3967k interfaceC3967k, final int i12) {
        int i13;
        final String str2;
        C3969l u11 = interfaceC3967k.u(1481056002);
        if ((i12 & 6) == 0) {
            i13 = (u11.r(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= u11.n(str) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
            str2 = str;
        } else {
            O.a a11 = T.a(T.c("vkid_auth_in_progress_spinner", u11, 0), 0.0f, 360.0f, C8004n.a(C8004n.d(1000, 0, G.b(), 2), EnumC7987e0.Restart, 4), str, u11, 4536 | ((i13 << 9) & 57344), 0);
            str2 = str;
            e.a aVar = e.f40358c0;
            u11.o(-969926128);
            boolean n11 = u11.n(a11);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new d(a11, 0);
                u11.x(C11);
            }
            u11.k();
            C8366G.a(G1.e.a(i11, u11, i13 & 14), null, a.a(aVar, (Function1) C11), null, null, 0.0f, null, u11, 48, 120);
            u11 = u11;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: ha.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CircleProgress$lambda$6;
                    int intValue = ((Integer) obj2).intValue();
                    String str3 = str2;
                    int i14 = i12;
                    CircleProgress$lambda$6 = CircleProgressKt.CircleProgress$lambda$6(i11, str3, i14, (InterfaceC3967k) obj, intValue);
                    return CircleProgress$lambda$6;
                }
            });
        }
    }
}
