package ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.data;

import G.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.data.NavLikezoneCaruselDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselSubWidget;", "", "Single", "Multi", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface NavLikezoneCaruselSubWidget {

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselSubWidget$Multi;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselSubWidget;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "topBadge", "", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$Item;", "items", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$PageControls;", "pageControls", "", "scrollTime", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$PageControls;Ljava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTopBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$PageControls;", "getPageControls", "()Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$PageControls;", "Ljava/lang/Long;", "getScrollTime", "()Ljava/lang/Long;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Multi implements NavLikezoneCaruselSubWidget {

        @NotNull
        private final List<NavLikezoneCaruselDTO.Item> items;

        @NotNull
        private final NavLikezoneCaruselDTO.PageControls pageControls;
        private final Long scrollTime;
        private final BadgeDTO topBadge;

        public Multi(BadgeDTO badgeDTO, @NotNull List<NavLikezoneCaruselDTO.Item> items, @NotNull NavLikezoneCaruselDTO.PageControls pageControls, Long l11) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(pageControls, "pageControls");
            this.topBadge = badgeDTO;
            this.items = items;
            this.pageControls = pageControls;
            this.scrollTime = l11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Multi)) {
                return false;
            }
            Multi multi = (Multi) other;
            return Intrinsics.d(this.topBadge, multi.topBadge) && Intrinsics.d(this.items, multi.items) && Intrinsics.d(this.pageControls, multi.pageControls) && Intrinsics.d(this.scrollTime, multi.scrollTime);
        }

        @NotNull
        public final List<NavLikezoneCaruselDTO.Item> getItems() {
            return this.items;
        }

        @NotNull
        public final NavLikezoneCaruselDTO.PageControls getPageControls() {
            return this.pageControls;
        }

        public final Long getScrollTime() {
            return this.scrollTime;
        }

        public final BadgeDTO getTopBadge() {
            return this.topBadge;
        }

        public int hashCode() {
            BadgeDTO badgeDTO = this.topBadge;
            int hashCode = (this.pageControls.hashCode() + g.b((badgeDTO == null ? 0 : badgeDTO.hashCode()) * 31, 31, this.items)) * 31;
            Long l11 = this.scrollTime;
            return hashCode + (l11 != null ? l11.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Multi(topBadge=" + this.topBadge + ", items=" + this.items + ", pageControls=" + this.pageControls + ", scrollTime=" + this.scrollTime + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselSubWidget$Single;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselSubWidget;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "topBadge", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$Item;", "item", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$Item;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTopBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$Item;", "getItem", "()Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$Item;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Single implements NavLikezoneCaruselSubWidget {

        @NotNull
        private final NavLikezoneCaruselDTO.Item item;
        private final BadgeDTO topBadge;

        public Single(BadgeDTO badgeDTO, @NotNull NavLikezoneCaruselDTO.Item item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.topBadge = badgeDTO;
            this.item = item;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Single)) {
                return false;
            }
            Single single = (Single) other;
            return Intrinsics.d(this.topBadge, single.topBadge) && Intrinsics.d(this.item, single.item);
        }

        @NotNull
        public final NavLikezoneCaruselDTO.Item getItem() {
            return this.item;
        }

        public final BadgeDTO getTopBadge() {
            return this.topBadge;
        }

        public int hashCode() {
            BadgeDTO badgeDTO = this.topBadge;
            return this.item.hashCode() + ((badgeDTO == null ? 0 : badgeDTO.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "Single(topBadge=" + this.topBadge + ", item=" + this.item + ")";
        }
    }
}
