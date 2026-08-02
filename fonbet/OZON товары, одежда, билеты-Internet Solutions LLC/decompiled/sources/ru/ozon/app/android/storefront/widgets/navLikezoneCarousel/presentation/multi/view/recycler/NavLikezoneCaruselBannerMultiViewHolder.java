package ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi.view.recycler;

import WZ.l;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.BannerItem;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.NavLikezoneCaruselBanner;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/multi/view/recycler/NavLikezoneCaruselBannerMultiViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/NavLikezoneCaruselBanner$View;", "navLikezoneCaruselBanner", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lkotlin/Function0;", "onLongTapUp", "onLongTapDown", "<init>", "(Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/NavLikezoneCaruselBanner$View;LWZ/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "onViewInVisibleBounds", "()V", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/BannerItem;", "banner", "bind", "(Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/BannerItem;)V", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/NavLikezoneCaruselBanner$View;", "LWZ/l;", "boundData", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/BannerItem;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavLikezoneCaruselBannerMultiViewHolder extends j {
    private BannerItem boundData;

    @NotNull
    private final NavLikezoneCaruselBanner.View navLikezoneCaruselBanner;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi.view.recycler.NavLikezoneCaruselBannerMultiViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super AtomAction, Unit> function1) {
            super(0);
            this.$actionHandler = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            BannerItem bannerItem = NavLikezoneCaruselBannerMultiViewHolder.this.boundData;
            if (bannerItem != null) {
                bannerItem.onClick(this.$actionHandler);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavLikezoneCaruselBannerMultiViewHolder(@NotNull NavLikezoneCaruselBanner.View navLikezoneCaruselBanner, @NotNull l tokenizedAnalytics, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function0<Unit> onLongTapUp, @NotNull Function0<Unit> onLongTapDown) {
        super(navLikezoneCaruselBanner);
        Intrinsics.checkNotNullParameter(navLikezoneCaruselBanner, "navLikezoneCaruselBanner");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onLongTapUp, "onLongTapUp");
        Intrinsics.checkNotNullParameter(onLongTapDown, "onLongTapDown");
        this.navLikezoneCaruselBanner = navLikezoneCaruselBanner;
        this.tokenizedAnalytics = tokenizedAnalytics;
        navLikezoneCaruselBanner.onClickListener(new AnonymousClass1(actionHandler));
        navLikezoneCaruselBanner.onLongTap(onLongTapUp, onLongTapDown);
    }

    public final void bind(@NotNull BannerItem banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        this.boundData = banner;
        banner.applyState(this.navLikezoneCaruselBanner);
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        BannerItem bannerItem = this.boundData;
        if (bannerItem != null) {
            bannerItem.trackView(this.tokenizedAnalytics);
        }
    }
}
