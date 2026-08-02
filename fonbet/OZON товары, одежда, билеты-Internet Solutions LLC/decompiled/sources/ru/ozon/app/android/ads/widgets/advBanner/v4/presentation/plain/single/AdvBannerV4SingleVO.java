package ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.single;

import B0.C2454a;
import Kk.C3532b;
import Pk0.g;
import android.os.Parcelable;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.widgets.advBanner.v4.data.AdvBannerV4DTO;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.model.AdvBannerV4ItemVO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b\b\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010\u0018R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b3\u0010\u0016¨\u00064"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/single/AdvBannerV4SingleVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO;", "banner", "", "isPagerVisible", "", "aspectRatio", "", "textColor", "Landroid/os/Parcelable;", "layoutManagerState", "Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$DesignOptionsDTO;", "designOptions", "", "backgroundColor", "<init>", "(JLru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO;ZDILandroid/os/Parcelable;Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$DesignOptionsDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO;", "getBanner", "()Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO;", "Z", "()Z", "D", "getAspectRatio", "()D", "I", "getTextColor", "Landroid/os/Parcelable;", "getLayoutManagerState", "()Landroid/os/Parcelable;", "setLayoutManagerState", "(Landroid/os/Parcelable;)V", "Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$DesignOptionsDTO;", "getDesignOptions", "()Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$DesignOptionsDTO;", "Ljava/lang/String;", "getBackgroundColor", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AdvBannerV4SingleVO implements c {
    private final double aspectRatio;
    private final String backgroundColor;

    @NotNull
    private final AdvBannerV4ItemVO banner;
    private final AdvBannerV4DTO.DesignOptionsDTO designOptions;
    private final long id;
    private final boolean isPagerVisible;
    private Parcelable layoutManagerState;
    private final int textColor;

    public AdvBannerV4SingleVO(long j11, @NotNull AdvBannerV4ItemVO banner, boolean z11, double d11, int i11, Parcelable parcelable, AdvBannerV4DTO.DesignOptionsDTO designOptionsDTO, String str) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        this.id = j11;
        this.banner = banner;
        this.isPagerVisible = z11;
        this.aspectRatio = d11;
        this.textColor = i11;
        this.layoutManagerState = parcelable;
        this.designOptions = designOptionsDTO;
        this.backgroundColor = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvBannerV4SingleVO)) {
            return false;
        }
        AdvBannerV4SingleVO advBannerV4SingleVO = (AdvBannerV4SingleVO) other;
        return this.id == advBannerV4SingleVO.id && Intrinsics.d(this.banner, advBannerV4SingleVO.banner) && this.isPagerVisible == advBannerV4SingleVO.isPagerVisible && Double.compare(this.aspectRatio, advBannerV4SingleVO.aspectRatio) == 0 && this.textColor == advBannerV4SingleVO.textColor && Intrinsics.d(this.layoutManagerState, advBannerV4SingleVO.layoutManagerState) && Intrinsics.d(this.designOptions, advBannerV4SingleVO.designOptions) && Intrinsics.d(this.backgroundColor, advBannerV4SingleVO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final AdvBannerV4ItemVO getBanner() {
        return this.banner;
    }

    public final AdvBannerV4DTO.DesignOptionsDTO getDesignOptions() {
        return this.designOptions;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C2454a.a(this.textColor, g.a(C3532b.a((this.banner.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.isPagerVisible), 31, this.aspectRatio), 31);
        Parcelable parcelable = this.layoutManagerState;
        int hashCode = (a11 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        AdvBannerV4DTO.DesignOptionsDTO designOptionsDTO = this.designOptions;
        int hashCode2 = (hashCode + (designOptionsDTO == null ? 0 : designOptionsDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        AdvBannerV4ItemVO advBannerV4ItemVO = this.banner;
        boolean z11 = this.isPagerVisible;
        double d11 = this.aspectRatio;
        int i11 = this.textColor;
        Parcelable parcelable = this.layoutManagerState;
        AdvBannerV4DTO.DesignOptionsDTO designOptionsDTO = this.designOptions;
        String str = this.backgroundColor;
        StringBuilder sb2 = new StringBuilder("AdvBannerV4SingleVO(id=");
        sb2.append(j11);
        sb2.append(", banner=");
        sb2.append(advBannerV4ItemVO);
        sb2.append(", isPagerVisible=");
        sb2.append(z11);
        sb2.append(", aspectRatio=");
        sb2.append(d11);
        sb2.append(", textColor=");
        sb2.append(i11);
        sb2.append(", layoutManagerState=");
        sb2.append(parcelable);
        sb2.append(", designOptions=");
        sb2.append(designOptionsDTO);
        return C6594f.a(", backgroundColor=", str, ")", sb2);
    }

    public /* synthetic */ AdvBannerV4SingleVO(long j11, AdvBannerV4ItemVO advBannerV4ItemVO, boolean z11, double d11, int i11, Parcelable parcelable, AdvBannerV4DTO.DesignOptionsDTO designOptionsDTO, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, advBannerV4ItemVO, z11, d11, i11, (i12 & 32) != 0 ? null : parcelable, designOptionsDTO, str);
    }
}
