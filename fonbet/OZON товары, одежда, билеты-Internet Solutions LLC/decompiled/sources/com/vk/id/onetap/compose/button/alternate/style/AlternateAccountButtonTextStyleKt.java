package com.vk.id.onetap.compose.button.alternate.style;

import G1.b;
import S0.InterfaceC3967k;
import U7.l;
import com.vk.id.onetap.common.alternate.style.InternalVKIDAlternateAccountButtonTextStyle;
import com.vk.id.onetap.compose.R$color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/id/onetap/common/alternate/style/InternalVKIDAlternateAccountButtonTextStyle;", "Ll1/Z;", "asColorResource", "(Lcom/vk/id/onetap/common/alternate/style/InternalVKIDAlternateAccountButtonTextStyle;LS0/k;I)J", "onetap-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AlternateAccountButtonTextStyleKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InternalVKIDAlternateAccountButtonTextStyle.values().length];
            try {
                iArr[InternalVKIDAlternateAccountButtonTextStyle.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InternalVKIDAlternateAccountButtonTextStyle.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InternalVKIDAlternateAccountButtonTextStyle.TRANSPARENT_DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long asColorResource(@NotNull InternalVKIDAlternateAccountButtonTextStyle internalVKIDAlternateAccountButtonTextStyle, InterfaceC3967k interfaceC3967k, int i11) {
        long a11;
        Intrinsics.checkNotNullParameter(internalVKIDAlternateAccountButtonTextStyle, "<this>");
        interfaceC3967k.o(-737216866);
        int i12 = WhenMappings.$EnumSwitchMapping$0[internalVKIDAlternateAccountButtonTextStyle.ordinal()];
        if (i12 == 1) {
            interfaceC3967k.o(-1935491326);
            a11 = b.a(interfaceC3967k, R$color.vkid_azure_300);
            interfaceC3967k.k();
        } else if (i12 == 2) {
            interfaceC3967k.o(-1935488162);
            a11 = b.a(interfaceC3967k, R$color.vkid_white);
            interfaceC3967k.k();
        } else {
            if (i12 != 3) {
                throw l.c(interfaceC3967k, -1935493323);
            }
            interfaceC3967k.o(-1935484738);
            a11 = b.a(interfaceC3967k, R$color.vkid_black);
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        return a11;
    }
}
