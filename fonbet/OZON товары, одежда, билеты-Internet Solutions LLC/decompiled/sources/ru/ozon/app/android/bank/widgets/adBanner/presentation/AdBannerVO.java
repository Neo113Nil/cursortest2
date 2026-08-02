package ru.ozon.app.android.bank.widgets.adBanner.presentation;

import B0.C2454a;
import G.g;
import Lh.b;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\u0012R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b)\u0010\u0012¨\u0006*"}, d2 = {"Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemVO;", "banners", "", "adTraceID", "Landroid/os/Parcelable;", "layoutManagerState", "", "autoScrollDelay", "backgroundColor", "<init>", "(JLjava/util/List;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getBanners", "()Ljava/util/List;", "Ljava/lang/String;", "getAdTraceID", "Landroid/os/Parcelable;", "getLayoutManagerState", "()Landroid/os/Parcelable;", "setLayoutManagerState", "(Landroid/os/Parcelable;)V", "I", "getAutoScrollDelay", "getBackgroundColor", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AdBannerVO implements c {

    @NotNull
    private final String adTraceID;
    private final int autoScrollDelay;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final List<AdBannerItemVO> banners;
    private final long id;
    private Parcelable layoutManagerState;

    public AdBannerVO(long j11, @NotNull List<AdBannerItemVO> banners, @NotNull String adTraceID, Parcelable parcelable, int i11, @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(banners, "banners");
        Intrinsics.checkNotNullParameter(adTraceID, "adTraceID");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.id = j11;
        this.banners = banners;
        this.adTraceID = adTraceID;
        this.layoutManagerState = parcelable;
        this.autoScrollDelay = i11;
        this.backgroundColor = backgroundColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdBannerVO)) {
            return false;
        }
        AdBannerVO adBannerVO = (AdBannerVO) other;
        return this.id == adBannerVO.id && Intrinsics.d(this.banners, adBannerVO.banners) && Intrinsics.d(this.adTraceID, adBannerVO.adTraceID) && Intrinsics.d(this.layoutManagerState, adBannerVO.layoutManagerState) && this.autoScrollDelay == adBannerVO.autoScrollDelay && Intrinsics.d(this.backgroundColor, adBannerVO.backgroundColor);
    }

    public final int getAutoScrollDelay() {
        return this.autoScrollDelay;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<AdBannerItemVO> getBanners() {
        return this.banners;
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

    public int hashCode() {
        int a11 = g.a(g.b(Long.hashCode(this.id) * 31, 31, this.banners), 31, this.adTraceID);
        Parcelable parcelable = this.layoutManagerState;
        return this.backgroundColor.hashCode() + C2454a.a(this.autoScrollDelay, (a11 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
    }

    public final void setLayoutManagerState(Parcelable parcelable) {
        this.layoutManagerState = parcelable;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<AdBannerItemVO> list = this.banners;
        String str = this.adTraceID;
        Parcelable parcelable = this.layoutManagerState;
        int i11 = this.autoScrollDelay;
        String str2 = this.backgroundColor;
        StringBuilder b11 = b.b(j11, "AdBannerVO(id=", ", banners=", list);
        b11.append(", adTraceID=");
        b11.append(str);
        b11.append(", layoutManagerState=");
        b11.append(parcelable);
        b11.append(", autoScrollDelay=");
        b11.append(i11);
        b11.append(", backgroundColor=");
        b11.append(str2);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ AdBannerVO(long j11, List list, String str, Parcelable parcelable, int i11, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, str, (i12 & 8) != 0 ? null : parcelable, (i12 & 16) != 0 ? 5 : i11, str2);
    }
}
