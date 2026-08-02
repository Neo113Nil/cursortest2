package com.vk.id.multibranding;

import S0.InterfaceC3967k;
import Sc.o;
import com.vk.id.multibranding.common.style.InternalVKIDOAuthListWidgetTextStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/id/multibranding/common/style/InternalVKIDOAuthListWidgetTextStyle;", "Ll1/Z;", "asColorResource", "(Lcom/vk/id/multibranding/common/style/InternalVKIDOAuthListWidgetTextStyle;LS0/k;I)J", "multibranding-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OAuthListWidgetTextStyleKt {
    public static final long asColorResource(@NotNull InternalVKIDOAuthListWidgetTextStyle internalVKIDOAuthListWidgetTextStyle, InterfaceC3967k interfaceC3967k, int i11) {
        long a11;
        Intrinsics.checkNotNullParameter(internalVKIDOAuthListWidgetTextStyle, "<this>");
        interfaceC3967k.o(-1257799198);
        if (internalVKIDOAuthListWidgetTextStyle == InternalVKIDOAuthListWidgetTextStyle.DARK) {
            a11 = C7807Z.f72248b;
        } else {
            if (internalVKIDOAuthListWidgetTextStyle != InternalVKIDOAuthListWidgetTextStyle.LIGHT) {
                throw new o();
            }
            a11 = G1.b.a(interfaceC3967k, R$color.vkid_text_dark_primary);
        }
        interfaceC3967k.k();
        return a11;
    }
}
