package com.vk.id.group.subscription.compose.util;

import A0.g;
import A0.h;
import Bl0.C2652m;
import G1.b;
import Hj0.T;
import P0.C3720b;
import P0.C3723c;
import P0.C3753m;
import P0.p2;
import P1.F;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import a1.c;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.compose.R$color;
import fd.InterfaceC6511n;
import ka.C7623a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import u0.InterfaceC9890C;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", "style", "", "testTag", "text", "Lkotlin/Function0;", "", "onClick", "SecondaryButton", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "group-subscription-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SecondaryButtonKt {
    public static final void SecondaryButton(@NotNull final GroupSubscriptionStyle style, @NotNull String testTag, @NotNull final String text, @NotNull Function0<Unit> onClick, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3720b c11;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(1583742968);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(style) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(testTag) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(text) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(onClick) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            e f7 = a0.f(a0.e(Q1.a(e.f40358c0, testTag), 1.0f), style.getButtonsSizeStyle().getHeightDp());
            g b11 = h.b(style.getButtonsCornersStyle().getRadiusDp());
            c11 = r2.c(StylingUtilKt.textSecondaryButtonBackgroundColor(style, u11, i12 & 14), r2.f20974b, r2.f20975c, C3723c.a(u11).f20976d);
            C3753m.b(onClick, f7, false, b11, c11, null, null, c.c(660799562, new InterfaceC6511n<InterfaceC9890C, InterfaceC3967k, Integer, Unit>() { // from class: com.vk.id.group.subscription.compose.util.SecondaryButtonKt$SecondaryButton$1
                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC9890C interfaceC9890C, InterfaceC3967k interfaceC3967k2, Integer num) {
                    invoke(interfaceC9890C, interfaceC3967k2, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(InterfaceC9890C FilledTonalButton, InterfaceC3967k interfaceC3967k2, int i13) {
                    long j11;
                    F f11;
                    Intrinsics.checkNotNullParameter(FilledTonalButton, "$this$FilledTonalButton");
                    if ((i13 & 17) == 16 && interfaceC3967k2.b()) {
                        interfaceC3967k2.j();
                        return;
                    }
                    String str = text;
                    e.a aVar = e.f40358c0;
                    GroupSubscriptionStyle groupSubscriptionStyle = style;
                    interfaceC3967k2.o(-1489233681);
                    if (groupSubscriptionStyle instanceof GroupSubscriptionStyle.Light) {
                        j11 = b.a(interfaceC3967k2, R$color.vkid_azure_300);
                    } else {
                        if (!(groupSubscriptionStyle instanceof GroupSubscriptionStyle.Dark)) {
                            throw new o();
                        }
                        j11 = C7807Z.f72251e;
                    }
                    long j12 = j11;
                    interfaceC3967k2.k();
                    long d11 = T.d(style.getButtonsSizeStyle().getTextSizeSp());
                    long d12 = T.d(20);
                    f11 = F.f21510h;
                    p2.b(str, aVar, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, new K1.T(j12, d11, f11, null, 0L, 3, d12, null, 0, 16613368), interfaceC3967k2, 48, 0, 65532);
                }
            }, u11), u11, ((i12 >> 9) & 14) | 805306368);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C7623a(style, testTag, text, onClick, i11, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecondaryButton$lambda$0(GroupSubscriptionStyle groupSubscriptionStyle, String str, String str2, Function0 function0, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        SecondaryButton(groupSubscriptionStyle, str, str2, function0, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }
}
