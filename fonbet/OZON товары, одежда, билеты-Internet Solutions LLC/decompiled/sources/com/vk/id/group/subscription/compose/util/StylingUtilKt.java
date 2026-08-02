package com.vk.id.group.subscription.compose.util;

import G1.b;
import S0.InterfaceC3967k;
import Sc.o;
import U7.l;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.compose.R$color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\b\u0010\u0004\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\t\u0010\u0004\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", "style", "Ll1/Z;", "textPrimaryColor", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;LS0/k;I)J", "textSecondaryColor", "textPrimaryButtonColor", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;)J", "textPrimaryButtonBackgroundColor", "textSecondaryButtonBackgroundColor", "backgroundColor", "group-subscription-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StylingUtilKt {
    public static final long backgroundColor(@NotNull GroupSubscriptionStyle style, InterfaceC3967k interfaceC3967k, int i11) {
        long a11;
        Intrinsics.checkNotNullParameter(style, "style");
        interfaceC3967k.o(-1180487326);
        if (style instanceof GroupSubscriptionStyle.Light) {
            interfaceC3967k.o(2142912673);
            a11 = b.a(interfaceC3967k, R$color.vkid_white);
            interfaceC3967k.k();
        } else {
            if (!(style instanceof GroupSubscriptionStyle.Dark)) {
                throw l.c(interfaceC3967k, 2142910967);
            }
            interfaceC3967k.o(2142915115);
            a11 = b.a(interfaceC3967k, R$color.vkid_background_dark);
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        return a11;
    }

    public static final long textPrimaryButtonBackgroundColor(@NotNull GroupSubscriptionStyle style, InterfaceC3967k interfaceC3967k, int i11) {
        long a11;
        Intrinsics.checkNotNullParameter(style, "style");
        interfaceC3967k.o(1212274317);
        if (style instanceof GroupSubscriptionStyle.Light) {
            interfaceC3967k.o(-378742776);
            a11 = b.a(interfaceC3967k, R$color.vkid_azure_300);
            interfaceC3967k.k();
        } else {
            if (!(style instanceof GroupSubscriptionStyle.Dark)) {
                throw l.c(interfaceC3967k, -378744492);
            }
            interfaceC3967k.o(-378740220);
            a11 = b.a(interfaceC3967k, R$color.vkid_white);
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        return a11;
    }

    public static final long textPrimaryButtonColor(@NotNull GroupSubscriptionStyle style) {
        long j11;
        long j12;
        Intrinsics.checkNotNullParameter(style, "style");
        if (style instanceof GroupSubscriptionStyle.Light) {
            int i11 = C7807Z.f72260n;
            j12 = C7807Z.f72251e;
            return j12;
        }
        if (!(style instanceof GroupSubscriptionStyle.Dark)) {
            throw new o();
        }
        int i12 = C7807Z.f72260n;
        j11 = C7807Z.f72248b;
        return j11;
    }

    public static final long textPrimaryColor(@NotNull GroupSubscriptionStyle style, InterfaceC3967k interfaceC3967k, int i11) {
        long a11;
        Intrinsics.checkNotNullParameter(style, "style");
        interfaceC3967k.o(1121586797);
        if (style instanceof GroupSubscriptionStyle.Light) {
            a11 = C7807Z.f72248b;
        } else {
            if (!(style instanceof GroupSubscriptionStyle.Dark)) {
                throw new o();
            }
            a11 = b.a(interfaceC3967k, R$color.vkid_text_dark_primary);
        }
        interfaceC3967k.k();
        return a11;
    }

    public static final long textSecondaryButtonBackgroundColor(@NotNull GroupSubscriptionStyle style, InterfaceC3967k interfaceC3967k, int i11) {
        long a11;
        Intrinsics.checkNotNullParameter(style, "style");
        interfaceC3967k.o(1629861823);
        if (style instanceof GroupSubscriptionStyle.Light) {
            interfaceC3967k.o(63744110);
            a11 = b.a(interfaceC3967k, R$color.vkid_background_secondary_button_light);
            interfaceC3967k.k();
        } else {
            if (!(style instanceof GroupSubscriptionStyle.Dark)) {
                throw l.c(interfaceC3967k, 63742421);
            }
            interfaceC3967k.o(63747437);
            a11 = b.a(interfaceC3967k, R$color.vkid_background_secondary_button_dark);
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        return a11;
    }

    public static final long textSecondaryColor(@NotNull GroupSubscriptionStyle style, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(style, "style");
        interfaceC3967k.o(440046495);
        if (style instanceof GroupSubscriptionStyle.Light) {
            i12 = R$color.vkid_text_light_subhead;
        } else {
            if (!(style instanceof GroupSubscriptionStyle.Dark)) {
                throw new o();
            }
            i12 = R$color.vkid_text_dark_subhead;
        }
        long a11 = b.a(interfaceC3967k, i12);
        interfaceC3967k.k();
        return a11;
    }
}
