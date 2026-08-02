package com.vk.id.onetap.common.mutlibranding.style;

import Sc.o;
import com.vk.id.multibranding.common.style.OAuthListWidgetCornersStyle;
import com.vk.id.onetap.common.button.style.OneTapButtonCornersStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toOAuthListWidgetStyle", "Lcom/vk/id/multibranding/common/style/OAuthListWidgetCornersStyle;", "Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;", "onetap-common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CornersStyleExtKt {
    @NotNull
    public static final OAuthListWidgetCornersStyle toOAuthListWidgetStyle(@NotNull OneTapButtonCornersStyle oneTapButtonCornersStyle) {
        Intrinsics.checkNotNullParameter(oneTapButtonCornersStyle, "<this>");
        if (oneTapButtonCornersStyle instanceof OneTapButtonCornersStyle.Custom) {
            return new OAuthListWidgetCornersStyle.Custom(oneTapButtonCornersStyle.getRadiusDp());
        }
        if (oneTapButtonCornersStyle instanceof OneTapButtonCornersStyle.Default) {
            return OAuthListWidgetCornersStyle.Default.INSTANCE;
        }
        throw new o();
    }
}
