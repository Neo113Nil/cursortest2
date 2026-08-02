package ru.ozon.app.android.fresh.main.widgets.promoCarousel.adapter;

import WZ.l;
import WZ.t;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation.PromoCarouselBannerView;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation.PromoCarouselVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/promoCarousel/adapter/PromoCarouselBannerCustomViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselBannerView;", "containerView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselBannerView;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "onViewInVisibleBounds", "()V", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO$PromoCarouselBannerVO;", "item", "bind", "(Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO$PromoCarouselBannerVO;)V", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselBannerView;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO$PromoCarouselBannerVO;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PromoCarouselBannerCustomViewHolder extends j {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final PromoCarouselBannerView containerView;
    private PromoCarouselVO.PromoCarouselBannerVO item;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PromoCarouselBannerCustomViewHolder(@NotNull PromoCarouselBannerView containerView, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    public final void bind(@NotNull PromoCarouselVO.PromoCarouselBannerVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        this.containerView.updateLayoutSize(ResourceExtKt.toPx(item.getBannerType().getWidth()), ResourceExtKt.toPx(item.getBannerType().getHeight()));
        this.containerView.setClipToOutline(true);
        ImageViewExtKt.load$default(this.containerView.getImageView(), item.getImage(), null, null, null, null, false, null, 126, null);
        this.containerView.getImageView().setContentDescription(item.getImage());
        ViewExtKt.setOnClickListenerThrottle$default(this.containerView, 0L, new PromoCarouselBannerCustomViewHolder$bind$1(this, item), 1, null);
        BadgeHolderKt.bindOrGone(this.containerView.getAdvBadgeV2(), item.getAdvBadgeV2(), this.actionHandler);
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t tokenizedEvent;
        super.onViewInVisibleBounds();
        PromoCarouselVO.PromoCarouselBannerVO promoCarouselBannerVO = this.item;
        if (promoCarouselBannerVO == null || (tokenizedEvent = promoCarouselBannerVO.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
    }
}
