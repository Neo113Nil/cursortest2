package com.vk.id.multibranding;

import S0.InterfaceC3967k;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5236c1;
import com.vk.id.multibranding.common.style.OAuthListWidgetStyle;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/e;", "Lcom/vk/id/multibranding/common/style/OAuthListWidgetStyle;", "style", "background", "(Landroidx/compose/ui/e;Lcom/vk/id/multibranding/common/style/OAuthListWidgetStyle;)Landroidx/compose/ui/e;", "multibranding-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OAuthListWidgetBackgroundStyleKt {
    @NotNull
    public static final e background(@NotNull e eVar, @NotNull final OAuthListWidgetStyle style) {
        e b11;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        b11 = c.b(eVar, C5236c1.a(), new InterfaceC6511n<e, InterfaceC3967k, Integer, e>() { // from class: com.vk.id.multibranding.OAuthListWidgetBackgroundStyleKt$background$1
            @Override // fd.InterfaceC6511n
            public /* bridge */ /* synthetic */ e invoke(e eVar2, InterfaceC3967k interfaceC3967k, Integer num) {
                return invoke(eVar2, interfaceC3967k, num.intValue());
            }

            public final e invoke(e composed, InterfaceC3967k interfaceC3967k, int i11) {
                e b12;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                interfaceC3967k.o(-1988635233);
                b12 = androidx.compose.foundation.e.b(composed, G1.b.a(interfaceC3967k, OAuthListWidgetStyle.this instanceof OAuthListWidgetStyle.Light ? R$color.vkid_white : R$color.vkid_transparent), y0.a());
                interfaceC3967k.k();
                return b12;
            }
        });
        return b11;
    }
}
