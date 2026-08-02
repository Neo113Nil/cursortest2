package ru.ozon.app.android.bank.widgets.adBanner.data;

import B0.C2454a;
import G.g;
import Tz.C4055a;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\b\u0012\b\b\u0003\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/bank/widgets/adBanner/data/AdBannerDTO;", "", "banners", "", "Lru/ozon/app/android/bank/widgets/adBanner/data/AdBannerItemDTO;", "adTraceID", "", "autoScrollDelay", "", "backgroundColor", "<init>", "(Ljava/util/List;Ljava/lang/String;ILjava/lang/String;)V", "getBanners", "()Ljava/util/List;", "getAdTraceID", "()Ljava/lang/String;", "getAutoScrollDelay", "()I", "getBackgroundColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AdBannerDTO {

    @NotNull
    private final String adTraceID;
    private final int autoScrollDelay;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final List<AdBannerItemDTO> banners;

    public AdBannerDTO(@i(name = "banners") @NotNull List<AdBannerItemDTO> banners, @i(name = "adTraceID") @NotNull String adTraceID, @i(name = "autoScrollDelayValue") int i11, @i(name = "backgroundColor") @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(banners, "banners");
        Intrinsics.checkNotNullParameter(adTraceID, "adTraceID");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.banners = banners;
        this.adTraceID = adTraceID;
        this.autoScrollDelay = i11;
        this.backgroundColor = backgroundColor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdBannerDTO copy$default(AdBannerDTO adBannerDTO, List list, String str, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = adBannerDTO.banners;
        }
        if ((i12 & 2) != 0) {
            str = adBannerDTO.adTraceID;
        }
        if ((i12 & 4) != 0) {
            i11 = adBannerDTO.autoScrollDelay;
        }
        if ((i12 & 8) != 0) {
            str2 = adBannerDTO.backgroundColor;
        }
        return adBannerDTO.copy(list, str, i11, str2);
    }

    @NotNull
    public final List<AdBannerItemDTO> component1() {
        return this.banners;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAdTraceID() {
        return this.adTraceID;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAutoScrollDelay() {
        return this.autoScrollDelay;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final AdBannerDTO copy(@i(name = "banners") @NotNull List<AdBannerItemDTO> banners, @i(name = "adTraceID") @NotNull String adTraceID, @i(name = "autoScrollDelayValue") int autoScrollDelay, @i(name = "backgroundColor") @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(banners, "banners");
        Intrinsics.checkNotNullParameter(adTraceID, "adTraceID");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new AdBannerDTO(banners, adTraceID, autoScrollDelay, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdBannerDTO)) {
            return false;
        }
        AdBannerDTO adBannerDTO = (AdBannerDTO) other;
        return Intrinsics.d(this.banners, adBannerDTO.banners) && Intrinsics.d(this.adTraceID, adBannerDTO.adTraceID) && this.autoScrollDelay == adBannerDTO.autoScrollDelay && Intrinsics.d(this.backgroundColor, adBannerDTO.backgroundColor);
    }

    @NotNull
    public final String getAdTraceID() {
        return this.adTraceID;
    }

    public final int getAutoScrollDelay() {
        return this.autoScrollDelay;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<AdBannerItemDTO> getBanners() {
        return this.banners;
    }

    public int hashCode() {
        return this.backgroundColor.hashCode() + C2454a.a(this.autoScrollDelay, g.a(this.banners.hashCode() * 31, 31, this.adTraceID), 31);
    }

    @NotNull
    public String toString() {
        List<AdBannerItemDTO> list = this.banners;
        String str = this.adTraceID;
        int i11 = this.autoScrollDelay;
        String str2 = this.backgroundColor;
        StringBuilder a11 = C4055a.a("AdBannerDTO(banners=", ", adTraceID=", str, ", autoScrollDelay=", list);
        a11.append(i11);
        a11.append(", backgroundColor=");
        a11.append(str2);
        a11.append(")");
        return a11.toString();
    }

    public /* synthetic */ AdBannerDTO(List list, String str, int i11, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i12 & 4) != 0 ? 5 : i11, (i12 & 8) != 0 ? "clearLightKey0" : str2);
    }
}
