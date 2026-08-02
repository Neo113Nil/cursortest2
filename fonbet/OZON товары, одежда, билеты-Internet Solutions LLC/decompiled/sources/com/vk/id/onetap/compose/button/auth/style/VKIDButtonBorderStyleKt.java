package com.vk.id.onetap.compose.button.auth.style;

import A0.h;
import G1.b;
import S0.InterfaceC3967k;
import U7.l;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5236c1;
import com.vk.id.onetap.common.auth.style.InternalVKIDButtonBorderStyle;
import com.vk.id.onetap.common.button.style.OneTapButtonCornersStyle;
import com.vk.id.onetap.compose.R$color;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n0.C8385f;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/e;", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonBorderStyle;", "style", "Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;", "cornersStyle", "border", "(Landroidx/compose/ui/e;Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonBorderStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;)Landroidx/compose/ui/e;", "onetap-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VKIDButtonBorderStyleKt {
    @NotNull
    public static final e border(@NotNull final e eVar, @NotNull final InternalVKIDButtonBorderStyle style, @NotNull final OneTapButtonCornersStyle cornersStyle) {
        e b11;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(cornersStyle, "cornersStyle");
        b11 = c.b(eVar, C5236c1.a(), new InterfaceC6511n<e, InterfaceC3967k, Integer, e>() { // from class: com.vk.id.onetap.compose.button.auth.style.VKIDButtonBorderStyleKt$border$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[InternalVKIDButtonBorderStyle.values().length];
                    try {
                        iArr[InternalVKIDButtonBorderStyle.NONE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[InternalVKIDButtonBorderStyle.DARK.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[InternalVKIDButtonBorderStyle.LIGHT.ordinal()] = 3;
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
                e eVar2;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                interfaceC3967k.o(-2103869014);
                int i12 = WhenMappings.$EnumSwitchMapping$0[InternalVKIDButtonBorderStyle.this.ordinal()];
                if (i12 == 1) {
                    interfaceC3967k.o(1223520451);
                    interfaceC3967k.k();
                    eVar2 = eVar;
                } else if (i12 == 2) {
                    interfaceC3967k.o(1223522479);
                    eVar2 = C8385f.c(1, b.a(interfaceC3967k, R$color.vkid_black_alpha12), composed, h.b(cornersStyle.getRadiusDp()));
                    interfaceC3967k.k();
                } else {
                    if (i12 != 3) {
                        throw l.c(interfaceC3967k, 1223519027);
                    }
                    interfaceC3967k.o(1223529871);
                    eVar2 = C8385f.c(1, b.a(interfaceC3967k, R$color.vkid_white_alpha12), composed, h.b(cornersStyle.getRadiusDp()));
                    interfaceC3967k.k();
                }
                interfaceC3967k.k();
                return eVar2;
            }
        });
        return b11;
    }
}
