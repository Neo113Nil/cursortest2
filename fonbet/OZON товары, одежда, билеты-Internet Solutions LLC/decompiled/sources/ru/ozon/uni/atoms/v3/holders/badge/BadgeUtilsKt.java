package ru.ozon.uni.atoms.v3.holders.badge;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.badge.Badge;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/uni/atoms/data/badge/Badge;", "", "getBackgroundColor", "(Lru/ozon/uni/atoms/data/badge/Badge;)Ljava/lang/String;", "", "getDefaultTintColorId", "(Lru/ozon/uni/atoms/data/badge/Badge;)I", "", "isPremiumTheme", "(Lru/ozon/uni/atoms/data/badge/Badge;)Z", "isDiscountTheme", "isLargeTheme", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BadgeUtilsKt {
    public static final String getBackgroundColor(@NotNull Badge badge) {
        Intrinsics.checkNotNullParameter(badge, "<this>");
        if (isPremiumTheme(badge)) {
            String backgroundColor = badge.getBackgroundColor();
            return backgroundColor == null ? StyleParser.OzColor.OZ_SEMANTIC_COLOR_PREMIUM_BLUE.getValue() : backgroundColor;
        }
        if (!isDiscountTheme(badge)) {
            return badge.getBackgroundColor();
        }
        String backgroundColor2 = badge.getBackgroundColor();
        return backgroundColor2 == null ? StyleParser.OzColor.OZ_SEMANTIC_CTRL_SALE.getValue() : backgroundColor2;
    }

    public static final int getDefaultTintColorId(@NotNull Badge badge) {
        Intrinsics.checkNotNullParameter(badge, "<this>");
        return isPremiumTheme(badge) ? R$color.oz_semantic_text_primary_negative : R$color.oz_white_1;
    }

    public static final boolean isDiscountTheme(@NotNull Badge badge) {
        Intrinsics.checkNotNullParameter(badge, "<this>");
        return badge.getTheme() == Badge.StyleType.STYLE_TYPE_DISCOUNT || badge.getTheme() == Badge.StyleType.STYLE_TYPE_DISCOUNT_SMALL || badge.getTheme() == null;
    }

    public static final boolean isLargeTheme(@NotNull Badge badge) {
        Intrinsics.checkNotNullParameter(badge, "<this>");
        return badge.getTheme() == Badge.StyleType.STYLE_TYPE_LARGE;
    }

    public static final boolean isPremiumTheme(@NotNull Badge badge) {
        Intrinsics.checkNotNullParameter(badge, "<this>");
        return badge.getTheme() == Badge.StyleType.STYLE_TYPE_PREMIUM_SMALL || badge.getTheme() == Badge.StyleType.STYLE_TYPE_PREMIUM;
    }
}
