package com.vk.id.onetap.compose.onetap.style;

import A0.h;
import S8.b;
import androidx.compose.ui.e;
import com.vk.id.onetap.common.auth.style.InternalVKIDButtonStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/e;", "Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle;", "style", "shadow", "(Landroidx/compose/ui/e;Lcom/vk/id/onetap/common/auth/style/InternalVKIDButtonStyle;)Landroidx/compose/ui/e;", "onetap-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OneTapButtonElevationStyleKt {
    @NotNull
    public static final e shadow(@NotNull e eVar, @NotNull InternalVKIDButtonStyle style) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        return b.c(eVar, ((style instanceof InternalVKIDButtonStyle.TransparentLight) || (style instanceof InternalVKIDButtonStyle.TransparentDark)) ? 0.0f : style.getElevationStyle().getElevationDp(), h.b(style.getCornersStyle().getRadiusDp()), 28);
    }
}
