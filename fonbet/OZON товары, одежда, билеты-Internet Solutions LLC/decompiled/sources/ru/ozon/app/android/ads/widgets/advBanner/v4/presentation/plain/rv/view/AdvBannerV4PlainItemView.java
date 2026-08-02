package ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.rv.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.a;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.R$id;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/rv/view/AdvBannerV4PlainItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "advBadgeHeight", "advBadgeMargin", "advBannerImageView", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/rv/view/AdvBannerV4ImageView;", "getAdvBannerImageView", "()Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/rv/view/AdvBannerV4ImageView;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvBannerV4PlainItemView extends FrameLayout {
    private final int advBadgeHeight;
    private final int advBadgeMargin;

    @NotNull
    private final AdvBannerV4ImageView advBannerImageView;

    @NotNull
    private final BadgeView badgeView;

    public /* synthetic */ AdvBannerV4PlainItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final AdvBannerV4ImageView getAdvBannerImageView() {
        return this.advBannerImageView;
    }

    @NotNull
    public final BadgeView getBadgeView() {
        return this.badgeView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvBannerV4PlainItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(20);
        this.advBadgeHeight = px;
        int px2 = ResourceExtKt.toPx(8);
        this.advBadgeMargin = px2;
        AdvBannerV4ImageView advBannerV4ImageView = new AdvBannerV4ImageView(context, attributeSet, i11);
        advBannerV4ImageView.setId(R$id.advBannerPlainView);
        advBannerV4ImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        advBannerV4ImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ImageViewExtKt.setOverlayColor(advBannerV4ImageView, true, a.getColor(context, R$color.layer_overlay_paranja));
        this.advBannerImageView = advBannerV4ImageView;
        BadgeView badgeView = (BadgeView) q.f64554a.i(N.b(BadgeView.class), context);
        if (badgeView == null) {
            badgeView = new BadgeView(context, null, 0, 0, 14, null);
        }
        badgeView.setId(R$id.advBannerText);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, px);
        layoutParams.gravity = 5;
        layoutParams.topMargin = px2;
        layoutParams.setMarginEnd(px2);
        badgeView.setLayoutParams(layoutParams);
        this.badgeView = badgeView;
        addView(advBannerV4ImageView);
        addView(badgeView);
    }
}
