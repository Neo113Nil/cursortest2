package ru.ozon.uni.android.uikit.view.atoms.badge;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeGradientPaint;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class BadgeView$gradientBgPaint$2 extends AbstractC7737t implements Function0<BadgeGradientPaint> {
    public static final BadgeView$gradientBgPaint$2 INSTANCE = new BadgeView$gradientBgPaint$2();

    BadgeView$gradientBgPaint$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final BadgeGradientPaint invoke() {
        BadgeGradientPaint badgeGradientPaint = new BadgeGradientPaint();
        badgeGradientPaint.setAntiAlias(true);
        return badgeGradientPaint;
    }
}
