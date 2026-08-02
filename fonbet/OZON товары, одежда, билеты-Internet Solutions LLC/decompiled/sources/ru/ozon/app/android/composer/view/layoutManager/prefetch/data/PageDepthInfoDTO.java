package ru.ozon.app.android.composer.view.layoutManager.prefetch.data;

import Pk0.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/composer/view/layoutManager/prefetch/data/PageDepthInfoDTO;", "", "pageType", "", "low", "", "normal", "high", "<init>", "(Ljava/lang/String;FFF)V", "getPageType", "()Ljava/lang/String;", "getLow", "()F", "getNormal", "getHigh", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PageDepthInfoDTO {
    public static final int $stable = 0;
    private final float high;
    private final float low;
    private final float normal;

    @NotNull
    private final String pageType;

    public PageDepthInfoDTO(@NotNull String pageType, float f7, float f11, float f12) {
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        this.pageType = pageType;
        this.low = f7;
        this.normal = f11;
        this.high = f12;
    }

    public static /* synthetic */ PageDepthInfoDTO copy$default(PageDepthInfoDTO pageDepthInfoDTO, String str, float f7, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pageDepthInfoDTO.pageType;
        }
        if ((i11 & 2) != 0) {
            f7 = pageDepthInfoDTO.low;
        }
        if ((i11 & 4) != 0) {
            f11 = pageDepthInfoDTO.normal;
        }
        if ((i11 & 8) != 0) {
            f12 = pageDepthInfoDTO.high;
        }
        return pageDepthInfoDTO.copy(str, f7, f11, f12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPageType() {
        return this.pageType;
    }

    /* renamed from: component2, reason: from getter */
    public final float getLow() {
        return this.low;
    }

    /* renamed from: component3, reason: from getter */
    public final float getNormal() {
        return this.normal;
    }

    /* renamed from: component4, reason: from getter */
    public final float getHigh() {
        return this.high;
    }

    @NotNull
    public final PageDepthInfoDTO copy(@NotNull String pageType, float low, float normal, float high) {
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        return new PageDepthInfoDTO(pageType, low, normal, high);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageDepthInfoDTO)) {
            return false;
        }
        PageDepthInfoDTO pageDepthInfoDTO = (PageDepthInfoDTO) other;
        return Intrinsics.d(this.pageType, pageDepthInfoDTO.pageType) && Float.compare(this.low, pageDepthInfoDTO.low) == 0 && Float.compare(this.normal, pageDepthInfoDTO.normal) == 0 && Float.compare(this.high, pageDepthInfoDTO.high) == 0;
    }

    public final float getHigh() {
        return this.high;
    }

    public final float getLow() {
        return this.low;
    }

    public final float getNormal() {
        return this.normal;
    }

    @NotNull
    public final String getPageType() {
        return this.pageType;
    }

    public int hashCode() {
        return Float.hashCode(this.high) + b.a(this.normal, b.a(this.low, this.pageType.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "PageDepthInfoDTO(pageType=" + this.pageType + ", low=" + this.low + ", normal=" + this.normal + ", high=" + this.high + ")";
    }
}
