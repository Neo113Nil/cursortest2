package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data;

import Bi.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data.EntryBannerWidgetDTO;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerSubWidget;", "", "Single", "Multi", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface EntryBannerSubWidget {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerSubWidget$Multi;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerSubWidget;", "", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerWidgetDTO$Banner;", "banners", "", "backgroundColor", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBanners", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Multi implements EntryBannerSubWidget {
        private final String backgroundColor;

        @NotNull
        private final List<EntryBannerWidgetDTO.Banner> banners;

        public Multi(@NotNull List<EntryBannerWidgetDTO.Banner> banners, String str) {
            Intrinsics.checkNotNullParameter(banners, "banners");
            this.banners = banners;
            this.backgroundColor = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Multi)) {
                return false;
            }
            Multi multi = (Multi) other;
            return Intrinsics.d(this.banners, multi.banners) && Intrinsics.d(this.backgroundColor, multi.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final List<EntryBannerWidgetDTO.Banner> getBanners() {
            return this.banners;
        }

        public int hashCode() {
            int hashCode = this.banners.hashCode() * 31;
            String str = this.backgroundColor;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return b.e("Multi(banners=", ", backgroundColor=", this.backgroundColor, ")", this.banners);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerSubWidget$Single;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerSubWidget;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerWidgetDTO$Banner;", "banner", "", "backgroundColor", "<init>", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerWidgetDTO$Banner;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerWidgetDTO$Banner;", "getBanner", "()Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerWidgetDTO$Banner;", "Ljava/lang/String;", "getBackgroundColor", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Single implements EntryBannerSubWidget {
        private final String backgroundColor;

        @NotNull
        private final EntryBannerWidgetDTO.Banner banner;

        public Single(@NotNull EntryBannerWidgetDTO.Banner banner, String str) {
            Intrinsics.checkNotNullParameter(banner, "banner");
            this.banner = banner;
            this.backgroundColor = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Single)) {
                return false;
            }
            Single single = (Single) other;
            return Intrinsics.d(this.banner, single.banner) && Intrinsics.d(this.backgroundColor, single.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final EntryBannerWidgetDTO.Banner getBanner() {
            return this.banner;
        }

        public int hashCode() {
            int hashCode = this.banner.hashCode() * 31;
            String str = this.backgroundColor;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "Single(banner=" + this.banner + ", backgroundColor=" + this.backgroundColor + ")";
        }
    }
}
