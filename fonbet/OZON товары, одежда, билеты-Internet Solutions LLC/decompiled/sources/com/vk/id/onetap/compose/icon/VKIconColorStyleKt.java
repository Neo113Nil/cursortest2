package com.vk.id.onetap.compose.icon;

import S0.InterfaceC3967k;
import Sc.o;
import com.vk.id.onetap.common.icon.style.InternalVKIconColorStyle;
import com.vk.id.onetap.compose.R$drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/id/onetap/common/icon/style/InternalVKIconColorStyle;", "", "asPainterResource", "(Lcom/vk/id/onetap/common/icon/style/InternalVKIconColorStyle;LS0/k;I)I", "onetap-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VKIconColorStyleKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InternalVKIconColorStyle.values().length];
            try {
                iArr[InternalVKIconColorStyle.WHITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InternalVKIconColorStyle.BLUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int asPainterResource(@NotNull InternalVKIconColorStyle internalVKIconColorStyle, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(internalVKIconColorStyle, "<this>");
        interfaceC3967k.o(-549135140);
        int i13 = WhenMappings.$EnumSwitchMapping$0[internalVKIconColorStyle.ordinal()];
        if (i13 == 1) {
            i12 = R$drawable.vkid_icon_white;
        } else {
            if (i13 != 2) {
                throw new o();
            }
            i12 = R$drawable.vkid_icon_blue;
        }
        interfaceC3967k.k();
        return i12;
    }
}
