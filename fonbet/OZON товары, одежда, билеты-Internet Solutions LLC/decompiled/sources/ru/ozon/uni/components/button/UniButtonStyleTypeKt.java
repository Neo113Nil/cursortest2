package ru.ozon.uni.components.button;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.components.button.UniButtonStyleType;
import ru.ozon.uni.utils.DeferredColor;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/uni/components/button/UniButtonStyleType;", "", "isMultiColorIcon", "adjustedColors", "(Lru/ozon/uni/components/button/UniButtonStyleType;Z)Lru/ozon/uni/components/button/UniButtonStyleType;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniButtonStyleTypeKt {
    @NotNull
    public static final UniButtonStyleType adjustedColors(@NotNull UniButtonStyleType uniButtonStyleType, boolean z11) {
        Object iconColor;
        long j11;
        Intrinsics.checkNotNullParameter(uniButtonStyleType, "<this>");
        Object backgroundColor = uniButtonStyleType.getBackgroundColor();
        Object backgroundColorActive = uniButtonStyleType.getBackgroundColorActive();
        Object titleTextColor = uniButtonStyleType.getTitleTextColor();
        Object subtitleTextColor = uniButtonStyleType.getSubtitleTextColor();
        if (z11) {
            int i11 = C7807Z.f72260n;
            j11 = C7807Z.f72259m;
            iconColor = DeferredColor.m3260constructorimpl(j11);
        } else {
            iconColor = uniButtonStyleType.getIconColor();
        }
        return new UniButtonStyleType.Custom(backgroundColor, titleTextColor, subtitleTextColor, uniButtonStyleType.getDataTextColor(), backgroundColorActive, iconColor, uniButtonStyleType.getDataBackgroundColor(), z11 ? null : uniButtonStyleType.getGradientIconColor(), (DefaultConstructorMarker) null);
    }
}
