package com.vk.id.onetap.compose.button.auth.style;

import G1.b;
import S0.InterfaceC3967k;
import Sc.o;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5236c1;
import com.vk.id.onetap.common.auth.style.InternalVKIDButtonBackgroundStyle;
import com.vk.id.onetap.compose.R$color;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/e;", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonBackgroundStyle;", "style", "background", "(Landroidx/compose/ui/e;Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonBackgroundStyle;)Landroidx/compose/ui/e;", "onetap-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VKIDButtonBackgroundStyleKt {
    @NotNull
    public static final e background(@NotNull e eVar, @NotNull final InternalVKIDButtonBackgroundStyle style) {
        e b11;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        b11 = c.b(eVar, C5236c1.a(), new InterfaceC6511n<e, InterfaceC3967k, Integer, e>() { // from class: com.vk.id.onetap.compose.button.auth.style.VKIDButtonBackgroundStyleKt$background$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[InternalVKIDButtonBackgroundStyle.values().length];
                    try {
                        iArr[InternalVKIDButtonBackgroundStyle.BLUE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[InternalVKIDButtonBackgroundStyle.WHITE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[InternalVKIDButtonBackgroundStyle.TRANSPARENT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // fd.InterfaceC6511n
            public /* bridge */ /* synthetic */ e invoke(e eVar2, InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(eVar2, interfaceC3967k, num.intValue());
            }

            public final e invoke(e composed, InterfaceC3967k interfaceC3967k, int i11) {
                int i12;
                e b12;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                interfaceC3967k.o(490222836);
                int i13 = WhenMappings.$EnumSwitchMapping$0[InternalVKIDButtonBackgroundStyle.this.ordinal()];
                if (i13 == 1) {
                    i12 = R$color.vkid_azure_A100;
                } else if (i13 == 2) {
                    i12 = R$color.vkid_white;
                } else {
                    if (i13 != 3) {
                        throw new o();
                    }
                    i12 = R$color.vkid_transparent;
                }
                b12 = androidx.compose.foundation.e.b(composed, b.a(interfaceC3967k, i12), y0.a());
                interfaceC3967k.k();
                return b12;
            }
        });
        return b11;
    }
}
