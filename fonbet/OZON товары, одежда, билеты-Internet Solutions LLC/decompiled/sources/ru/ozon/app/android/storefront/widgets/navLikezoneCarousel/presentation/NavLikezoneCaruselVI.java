package ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation;

import G.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.data.NavLikezoneCaruselDTO;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi.view.NavLikezoneCaruselBannerMulti;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.single.view.NavLikezoneCaruselBannerSingle;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.BannerItem;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/NavLikezoneCaruselVI;", "V", "Ll20/c;", "Single", "Multi", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface NavLikezoneCaruselVI<V> extends c {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <V> Integer getScrollWidgetKey(@NotNull NavLikezoneCaruselVI<V> navLikezoneCaruselVI) {
            return null;
        }

        public static <V> int getViewItemKey(@NotNull NavLikezoneCaruselVI<V> navLikezoneCaruselVI) {
            return navLikezoneCaruselVI.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/NavLikezoneCaruselVI$Single;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/NavLikezoneCaruselVI;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/single/view/NavLikezoneCaruselBannerSingle;", "", "id", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "topBadge", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/BannerItem;", "banner", "<init>", "(JLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/BannerItem;)V", "view", "", "applyState", "(Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/single/view/NavLikezoneCaruselBannerSingle;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTopBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/BannerItem;", "getBanner", "()Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/BannerItem;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Single implements NavLikezoneCaruselVI<NavLikezoneCaruselBannerSingle> {

        @NotNull
        private final BannerItem banner;
        private final long id;
        private final BadgeDTO topBadge;

        public Single(long j11, BadgeDTO badgeDTO, @NotNull BannerItem banner) {
            Intrinsics.checkNotNullParameter(banner, "banner");
            this.id = j11;
            this.topBadge = badgeDTO;
            this.banner = banner;
        }

        public void applyState(@NotNull NavLikezoneCaruselBannerSingle view) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.updateTopBadge(this.topBadge);
            this.banner.applyState(view);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Single)) {
                return false;
            }
            Single single = (Single) other;
            return this.id == single.id && Intrinsics.d(this.topBadge, single.topBadge) && Intrinsics.d(this.banner, single.banner);
        }

        @NotNull
        public final BannerItem getBanner() {
            return this.banner;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            BadgeDTO badgeDTO = this.topBadge;
            return this.banner.hashCode() + ((hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "Single(id=" + this.id + ", topBadge=" + this.topBadge + ", banner=" + this.banner + ")";
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/NavLikezoneCaruselVI$Multi;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/NavLikezoneCaruselVI;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/multi/view/NavLikezoneCaruselBannerMulti;", "", "id", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "topBadge", "", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/BannerItem;", "banners", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$PageControls;", "pageControls", "scrollTime", "", "restoredPage", "<init>", "(JLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$PageControls;Ljava/lang/Long;I)V", "view", "", "applyState", "(Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/multi/view/NavLikezoneCaruselBannerMulti;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTopBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Ljava/util/List;", "getBanners", "()Ljava/util/List;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$PageControls;", "getPageControls", "()Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$PageControls;", "Ljava/lang/Long;", "getScrollTime", "()Ljava/lang/Long;", "I", "getRestoredPage", "setRestoredPage", "(I)V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Multi implements NavLikezoneCaruselVI<NavLikezoneCaruselBannerMulti> {

        @NotNull
        private final List<BannerItem> banners;
        private final long id;

        @NotNull
        private final NavLikezoneCaruselDTO.PageControls pageControls;
        private int restoredPage;
        private final Long scrollTime;
        private final BadgeDTO topBadge;

        /* JADX WARN: Multi-variable type inference failed */
        public Multi(long j11, BadgeDTO badgeDTO, @NotNull List<? extends BannerItem> banners, @NotNull NavLikezoneCaruselDTO.PageControls pageControls, Long l11, int i11) {
            Intrinsics.checkNotNullParameter(banners, "banners");
            Intrinsics.checkNotNullParameter(pageControls, "pageControls");
            this.id = j11;
            this.topBadge = badgeDTO;
            this.banners = banners;
            this.pageControls = pageControls;
            this.scrollTime = l11;
            this.restoredPage = i11;
        }

        public void applyState(@NotNull NavLikezoneCaruselBannerMulti view) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.updateTopBadge(this.topBadge);
            view.updateBanners(this.banners);
            view.updatePageControls(this.pageControls);
            view.startAutoScroll(this.scrollTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Multi)) {
                return false;
            }
            Multi multi = (Multi) other;
            return this.id == multi.id && Intrinsics.d(this.topBadge, multi.topBadge) && Intrinsics.d(this.banners, multi.banners) && Intrinsics.d(this.pageControls, multi.pageControls) && Intrinsics.d(this.scrollTime, multi.scrollTime) && this.restoredPage == multi.restoredPage;
        }

        @NotNull
        public final List<BannerItem> getBanners() {
            return this.banners;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        public final int getRestoredPage() {
            return this.restoredPage;
        }

        public final Long getScrollTime() {
            return this.scrollTime;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            BadgeDTO badgeDTO = this.topBadge;
            int hashCode2 = (this.pageControls.hashCode() + g.b((hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31, this.banners)) * 31;
            Long l11 = this.scrollTime;
            return Integer.hashCode(this.restoredPage) + ((hashCode2 + (l11 != null ? l11.hashCode() : 0)) * 31);
        }

        public final void setRestoredPage(int i11) {
            this.restoredPage = i11;
        }

        @NotNull
        public String toString() {
            return "Multi(id=" + this.id + ", topBadge=" + this.topBadge + ", banners=" + this.banners + ", pageControls=" + this.pageControls + ", scrollTime=" + this.scrollTime + ", restoredPage=" + this.restoredPage + ")";
        }

        public /* synthetic */ Multi(long j11, BadgeDTO badgeDTO, List list, NavLikezoneCaruselDTO.PageControls pageControls, Long l11, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, badgeDTO, list, pageControls, l11, (i12 & 32) != 0 ? 0 : i11);
        }
    }
}
