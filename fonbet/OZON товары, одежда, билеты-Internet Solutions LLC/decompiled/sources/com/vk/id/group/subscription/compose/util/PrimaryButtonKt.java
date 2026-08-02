package com.vk.id.group.subscription.compose.util;

import A0.g;
import A0.h;
import Bl0.C2652m;
import P0.C3723c;
import P0.C3753m;
import P0.C3756n;
import P0.C3759o;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import a1.c;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import fd.InterfaceC6511n;
import ja.C7325e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import u0.InterfaceC9890C;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a;\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", "style", "", "testTag", "Lkotlin/Function0;", "", "onClick", "content", "PrimaryButton", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;LS0/k;I)V", "group-subscription-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PrimaryButtonKt {
    public static final void PrimaryButton(@NotNull GroupSubscriptionStyle style, @NotNull String testTag, @NotNull Function0<Unit> onClick, @NotNull final Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        long j11;
        long j12;
        long j13;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(2122988682);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(style) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(testTag) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(onClick) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(content) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            e f7 = a0.f(a0.e(Q1.a(e.f40358c0, testTag), 1.0f), style.getButtonsSizeStyle().getHeightDp());
            g b11 = h.b(style.getButtonsCornersStyle().getRadiusDp());
            int i13 = C3723c.f20990e;
            long textPrimaryButtonBackgroundColor = StylingUtilKt.textPrimaryButtonBackgroundColor(style, u11, i12 & 14);
            j11 = C7807Z.f72259m;
            j12 = C7807Z.f72259m;
            j13 = C7807Z.f72259m;
            C3753m.a(onClick, f7, false, b11, C3723c.c((C3756n) u11.m(C3759o.d())).c(textPrimaryButtonBackgroundColor, j11, j12, j13), null, null, c.c(404994714, new InterfaceC6511n<InterfaceC9890C, InterfaceC3967k, Integer, Unit>() { // from class: com.vk.id.group.subscription.compose.util.PrimaryButtonKt$PrimaryButton$1
                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC9890C interfaceC9890C, InterfaceC3967k interfaceC3967k2, Integer num) {
                    invoke(interfaceC9890C, interfaceC3967k2, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(InterfaceC9890C Button, InterfaceC3967k interfaceC3967k2, int i14) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i14 & 17) == 16 && interfaceC3967k2.b()) {
                        interfaceC3967k2.j();
                    } else {
                        content.invoke(interfaceC3967k2, 0);
                    }
                }
            }, u11), u11, ((i12 >> 6) & 14) | 805306368, 484);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C7325e(style, testTag, onClick, content, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryButton$lambda$0(GroupSubscriptionStyle groupSubscriptionStyle, String str, Function0 function0, Function2 function2, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        PrimaryButton(groupSubscriptionStyle, str, function0, function2, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }
}
