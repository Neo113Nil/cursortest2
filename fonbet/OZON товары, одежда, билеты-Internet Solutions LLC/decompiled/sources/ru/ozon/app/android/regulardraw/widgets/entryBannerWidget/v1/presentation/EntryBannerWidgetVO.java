package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation;

import G.g;
import Lh.b;
import android.os.Parcelable;
import g.C6594f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/EntryBannerWidgetVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Single", "Multi", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface EntryBannerWidgetVO extends c {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Integer getScrollWidgetKey(@NotNull EntryBannerWidgetVO entryBannerWidgetVO) {
            return null;
        }

        public static int getViewItemKey(@NotNull EntryBannerWidgetVO entryBannerWidgetVO) {
            return entryBannerWidgetVO.hashCode();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/EntryBannerWidgetVO$Single;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/EntryBannerWidgetVO;", "", "id", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner;", "banner", "", "backgroundColor", "<init>", "(JLru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner;", "getBanner", "()Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner;", "Ljava/lang/String;", "getBackgroundColor", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Single implements EntryBannerWidgetVO {
        private final String backgroundColor;

        @NotNull
        private final Banner banner;
        private final long id;

        public Single(long j11, @NotNull Banner banner, String str) {
            Intrinsics.checkNotNullParameter(banner, "banner");
            this.id = j11;
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
            return this.id == single.id && Intrinsics.d(this.banner, single.banner) && Intrinsics.d(this.backgroundColor, single.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final Banner getBanner() {
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
            int hashCode = (this.banner.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
            String str = this.backgroundColor;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            Banner banner = this.banner;
            String str = this.backgroundColor;
            StringBuilder sb2 = new StringBuilder("Single(id=");
            sb2.append(j11);
            sb2.append(", banner=");
            sb2.append(banner);
            return C6594f.a(", backgroundColor=", str, ")", sb2);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJB\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/EntryBannerWidgetVO$Multi;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/EntryBannerWidgetVO;", "", "id", "", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner;", "banners", "", "backgroundColor", "Landroid/os/Parcelable;", "scrollState", "<init>", "(JLjava/util/List;Ljava/lang/String;Landroid/os/Parcelable;)V", "copy", "(JLjava/util/List;Ljava/lang/String;Landroid/os/Parcelable;)Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/EntryBannerWidgetVO$Multi;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getBanners", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "Landroid/os/Parcelable;", "getScrollState", "()Landroid/os/Parcelable;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Multi implements EntryBannerWidgetVO {
        private final String backgroundColor;

        @NotNull
        private final List<Banner> banners;
        private final long id;
        private final Parcelable scrollState;

        public Multi(long j11, @NotNull List<Banner> banners, String str, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(banners, "banners");
            this.id = j11;
            this.banners = banners;
            this.backgroundColor = str;
            this.scrollState = parcelable;
        }

        public static /* synthetic */ Multi copy$default(Multi multi, long j11, List list, String str, Parcelable parcelable, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = multi.id;
            }
            long j12 = j11;
            if ((i11 & 2) != 0) {
                list = multi.banners;
            }
            List list2 = list;
            if ((i11 & 4) != 0) {
                str = multi.backgroundColor;
            }
            String str2 = str;
            if ((i11 & 8) != 0) {
                parcelable = multi.scrollState;
            }
            return multi.copy(j12, list2, str2, parcelable);
        }

        @NotNull
        public final Multi copy(long id2, @NotNull List<Banner> banners, String backgroundColor, Parcelable scrollState) {
            Intrinsics.checkNotNullParameter(banners, "banners");
            return new Multi(id2, banners, backgroundColor, scrollState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Multi)) {
                return false;
            }
            Multi multi = (Multi) other;
            return this.id == multi.id && Intrinsics.d(this.banners, multi.banners) && Intrinsics.d(this.backgroundColor, multi.backgroundColor) && Intrinsics.d(this.scrollState, multi.scrollState);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final List<Banner> getBanners() {
            return this.banners;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        public final Parcelable getScrollState() {
            return this.scrollState;
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
            int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.banners);
            String str = this.backgroundColor;
            int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
            Parcelable parcelable = this.scrollState;
            return hashCode + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            List<Banner> list = this.banners;
            String str = this.backgroundColor;
            Parcelable parcelable = this.scrollState;
            StringBuilder b11 = b.b(j11, "Multi(id=", ", banners=", list);
            b11.append(", backgroundColor=");
            b11.append(str);
            b11.append(", scrollState=");
            b11.append(parcelable);
            b11.append(")");
            return b11.toString();
        }

        public /* synthetic */ Multi(long j11, List list, String str, Parcelable parcelable, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, list, str, (i11 & 8) != 0 ? null : parcelable);
        }
    }
}
