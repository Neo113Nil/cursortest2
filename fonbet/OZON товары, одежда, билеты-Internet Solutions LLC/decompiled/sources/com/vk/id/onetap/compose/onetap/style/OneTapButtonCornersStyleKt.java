package com.vk.id.onetap.compose.onetap.style;

import A0.h;
import androidx.compose.ui.e;
import com.vk.id.onetap.common.button.style.OneTapButtonCornersStyle;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/e;", "Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;", "style", "clip", "(Landroidx/compose/ui/e;Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;)Landroidx/compose/ui/e;", "onetap-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OneTapButtonCornersStyleKt {
    @NotNull
    public static final e clip(@NotNull e eVar, @NotNull OneTapButtonCornersStyle style) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        return C6988h.a(eVar, h.b(style.getRadiusDp()));
    }
}
