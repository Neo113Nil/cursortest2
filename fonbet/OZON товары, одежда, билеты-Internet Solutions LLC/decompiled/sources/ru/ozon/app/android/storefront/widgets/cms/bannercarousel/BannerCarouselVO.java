package ru.ozon.app.android.storefront.widgets.cms.bannercarousel;

import B0.C2454a;
import G.g;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001e\u0010\u0013R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "width", "height", "", "Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselItem;", "banners", "Landroid/os/Parcelable;", "layoutManagerState", "<init>", "(JIILjava/util/List;Landroid/os/Parcelable;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getWidth", "getHeight", "Ljava/util/List;", "getBanners", "()Ljava/util/List;", "Landroid/os/Parcelable;", "getLayoutManagerState", "()Landroid/os/Parcelable;", "setLayoutManagerState", "(Landroid/os/Parcelable;)V", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BannerCarouselVO implements c {

    @NotNull
    private final List<BannerCarouselItem> banners;
    private final int height;
    private final long id;
    private Parcelable layoutManagerState;
    private final int width;

    public BannerCarouselVO(long j11, int i11, int i12, @NotNull List<BannerCarouselItem> banners, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(banners, "banners");
        this.id = j11;
        this.width = i11;
        this.height = i12;
        this.banners = banners;
        this.layoutManagerState = parcelable;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerCarouselVO)) {
            return false;
        }
        BannerCarouselVO bannerCarouselVO = (BannerCarouselVO) other;
        return this.id == bannerCarouselVO.id && this.width == bannerCarouselVO.width && this.height == bannerCarouselVO.height && Intrinsics.d(this.banners, bannerCarouselVO.banners) && Intrinsics.d(this.layoutManagerState, bannerCarouselVO.layoutManagerState);
    }

    @NotNull
    public final List<BannerCarouselItem> getBanners() {
        return this.banners;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Parcelable getLayoutManagerState() {
        return this.layoutManagerState;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int b11 = g.b(C2454a.a(this.height, C2454a.a(this.width, Long.hashCode(this.id) * 31, 31), 31), 31, this.banners);
        Parcelable parcelable = this.layoutManagerState;
        return b11 + (parcelable == null ? 0 : parcelable.hashCode());
    }

    public final void setLayoutManagerState(Parcelable parcelable) {
        this.layoutManagerState = parcelable;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        int i11 = this.width;
        int i12 = this.height;
        List<BannerCarouselItem> list = this.banners;
        Parcelable parcelable = this.layoutManagerState;
        StringBuilder b11 = Ql.c.b(j11, "BannerCarouselVO(id=", i11, ", width=");
        b11.append(", height=");
        b11.append(i12);
        b11.append(", banners=");
        b11.append(list);
        b11.append(", layoutManagerState=");
        b11.append(parcelable);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ BannerCarouselVO(long j11, int i11, int i12, List list, Parcelable parcelable, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, i11, i12, list, (i13 & 16) != 0 ? null : parcelable);
    }
}
