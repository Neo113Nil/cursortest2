package com.vk.id.onetap.compose.progress;

import G1.b;
import S0.InterfaceC3967k;
import Sc.o;
import com.vk.id.onetap.common.progress.style.InternalCircleProgressStyle;
import com.vk.id.onetap.compose.R$color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7795M;
import l1.C7809a0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/id/onetap/common/progress/style/InternalCircleProgressStyle;", "Ll1/a0;", "asColorFilter", "(Lcom/vk/id/onetap/common/progress/style/InternalCircleProgressStyle;LS0/k;I)Ll1/a0;", "onetap-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CircleProgressStyleKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InternalCircleProgressStyle.values().length];
            try {
                iArr[InternalCircleProgressStyle.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InternalCircleProgressStyle.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final C7809a0 asColorFilter(@NotNull InternalCircleProgressStyle internalCircleProgressStyle, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(internalCircleProgressStyle, "<this>");
        interfaceC3967k.o(2032458110);
        int i13 = WhenMappings.$EnumSwitchMapping$0[internalCircleProgressStyle.ordinal()];
        if (i13 == 1) {
            i12 = R$color.vkid_white;
        } else {
            if (i13 != 2) {
                throw new o();
            }
            i12 = R$color.vkid_black;
        }
        C7795M a11 = C7809a0.a.a(5, b.a(interfaceC3967k, i12));
        interfaceC3967k.k();
        return a11;
    }
}
