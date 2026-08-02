package ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.view;

import D40.a;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithIsolatedBorder;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u00020!H\u0004R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\rX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\rX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\rX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\rX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\rX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u0014\u0010\u001a\u001a\u00020\rX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000fR\u0014\u0010\u001c\u001a\u00020\u001dX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/view/AbstractCardView;", "Lru/ozon/app/android/travel/utils/view/constraintLayoutWithBorder/ConstraintLayoutWithIsolatedBorder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "borderRadius", "", "backgroundRadius", "spaceBetween", "badgeGuideline", "Landroidx/constraintlayout/widget/Guideline;", "cardWidth", "", "getCardWidth", "()I", "cardHeight", "getCardHeight", "dp6", "getDp6", "dp8", "getDp8", "dp12", "getDp12", "dp14", "getDp14", "dp24", "getDp24", "badge", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadge", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "setBorderColor", "", "borderColor", "", "placeBadge", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class AbstractCardView extends ConstraintLayoutWithIsolatedBorder {
    private final float backgroundRadius;

    @NotNull
    private final BadgeView badge;

    @NotNull
    private final Guideline badgeGuideline;
    private final float borderRadius;
    private final int cardHeight;
    private final int cardWidth;
    private final int dp12;
    private final int dp14;
    private final int dp24;
    private final int dp6;
    private final int dp8;
    private final float spaceBetween;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractCardView(@NotNull Context context) {
        super(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
        float pxF = ResourceExtKt.toPxF(16, context);
        this.borderRadius = pxF;
        float pxF2 = ResourceExtKt.toPxF(12, context);
        this.backgroundRadius = pxF2;
        float pxF3 = ResourceExtKt.toPxF(6, context);
        this.spaceBetween = pxF3;
        Guideline guideline = new Guideline(context);
        ConstraintLayout.b a11 = a.a(guideline, R$id.travelPaymentV4BadgeGuideline, -2, -2);
        a11.f41615V = 0;
        a11.f41620a = UiExtKt.toPx(14, context);
        guideline.setLayoutParams(a11);
        this.badgeGuideline = guideline;
        int px = UiExtKt.toPx(116, context);
        this.cardWidth = px;
        int px2 = UiExtKt.toPx(74, context);
        this.cardHeight = px2;
        this.dp6 = UiExtKt.toPx(6, context);
        this.dp8 = UiExtKt.toPx(8, context);
        this.dp12 = UiExtKt.toPx(12, context);
        this.dp14 = UiExtKt.toPx(14, context);
        this.dp24 = UiExtKt.toPx(24, context);
        BadgeView badgeView = (BadgeView) q.f64554a.g(N.b(BadgeView.class), context);
        badgeView.setId(R$id.travelPaymentV4Badge);
        this.badge = badgeView;
        setLayoutParams(new ConstraintLayout.b(px, px2));
        setCorners(pxF, pxF2, pxF3);
        setClipToPadding(false);
    }

    @NotNull
    protected final BadgeView getBadge() {
        return this.badge;
    }

    protected final int getCardHeight() {
        return this.cardHeight;
    }

    protected final int getCardWidth() {
        return this.cardWidth;
    }

    protected final int getDp12() {
        return this.dp12;
    }

    protected final int getDp14() {
        return this.dp14;
    }

    protected final int getDp24() {
        return this.dp24;
    }

    protected final int getDp6() {
        return this.dp6;
    }

    protected final int getDp8() {
        return this.dp8;
    }

    protected final void placeBadge() {
        addView(this.badge);
        addView(this.badgeGuideline);
        ConstraintLayoutExtKt.updateConstraints(this, new AbstractCardView$placeBadge$1(this));
    }

    public final void setBorderColor(@NotNull String borderColor) {
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBorderColor(Integer.valueOf(styleParser.parseColor(context, borderColor, UniColors.GRAPHIC_NEUTRAL.getResId())));
    }
}
