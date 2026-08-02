package com.vk.id.onetap.compose.button.auth.style;

import G1.b;
import S0.InterfaceC3967k;
import U7.l;
import com.vk.id.onetap.common.auth.style.InternalVKIDButtonTextStyle;
import com.vk.id.onetap.compose.R$color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonTextStyle;", "Ll1/Z;", "asColorResource", "(Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonTextStyle;LS0/k;I)J", "onetap-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VKIDButtonTextStyleKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InternalVKIDButtonTextStyle.values().length];
            try {
                iArr[InternalVKIDButtonTextStyle.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InternalVKIDButtonTextStyle.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long asColorResource(@NotNull InternalVKIDButtonTextStyle internalVKIDButtonTextStyle, InterfaceC3967k interfaceC3967k, int i11) {
        long a11;
        Intrinsics.checkNotNullParameter(internalVKIDButtonTextStyle, "<this>");
        interfaceC3967k.o(871920206);
        int i12 = WhenMappings.$EnumSwitchMapping$0[internalVKIDButtonTextStyle.ordinal()];
        if (i12 == 1) {
            interfaceC3967k.o(96847800);
            a11 = b.a(interfaceC3967k, R$color.vkid_black);
            interfaceC3967k.k();
        } else {
            if (i12 != 2) {
                throw l.c(interfaceC3967k, 96846208);
            }
            interfaceC3967k.o(96850360);
            a11 = b.a(interfaceC3967k, R$color.vkid_white);
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        return a11;
    }
}
