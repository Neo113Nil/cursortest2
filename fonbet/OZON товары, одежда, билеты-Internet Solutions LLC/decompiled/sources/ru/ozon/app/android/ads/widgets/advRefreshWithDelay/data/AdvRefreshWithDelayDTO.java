package ru.ozon.app.android.ads.widgets.advRefreshWithDelay.data;

import Kk.C3532b;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003JR\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\nHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0007\u0010\u0014R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/data/AdvRefreshWithDelayDTO;", "", "delay", "", "refreshFromBackground", "", "refreshFromAnotherPage", "isSilent", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/Double;ZZLjava/lang/Boolean;Ljava/util/Map;)V", "getDelay", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRefreshFromBackground", "()Z", "getRefreshFromAnotherPage", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Double;ZZLjava/lang/Boolean;Ljava/util/Map;)Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/data/AdvRefreshWithDelayDTO;", "equals", "other", "hashCode", "", "toString", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AdvRefreshWithDelayDTO {
    private final Double delay;
    private final Boolean isSilent;
    private final boolean refreshFromAnotherPage;
    private final boolean refreshFromBackground;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public AdvRefreshWithDelayDTO(Double d11, boolean z11, boolean z12, Boolean bool, Map<String, TokenizedTrackingInfo> map) {
        this.delay = d11;
        this.refreshFromBackground = z11;
        this.refreshFromAnotherPage = z12;
        this.isSilent = bool;
        this.trackingInfo = map;
    }

    public static /* synthetic */ AdvRefreshWithDelayDTO copy$default(AdvRefreshWithDelayDTO advRefreshWithDelayDTO, Double d11, boolean z11, boolean z12, Boolean bool, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = advRefreshWithDelayDTO.delay;
        }
        if ((i11 & 2) != 0) {
            z11 = advRefreshWithDelayDTO.refreshFromBackground;
        }
        if ((i11 & 4) != 0) {
            z12 = advRefreshWithDelayDTO.refreshFromAnotherPage;
        }
        if ((i11 & 8) != 0) {
            bool = advRefreshWithDelayDTO.isSilent;
        }
        if ((i11 & 16) != 0) {
            map = advRefreshWithDelayDTO.trackingInfo;
        }
        Map map2 = map;
        boolean z13 = z12;
        return advRefreshWithDelayDTO.copy(d11, z11, z13, bool, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final Double getDelay() {
        return this.delay;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getRefreshFromBackground() {
        return this.refreshFromBackground;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getRefreshFromAnotherPage() {
        return this.refreshFromAnotherPage;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsSilent() {
        return this.isSilent;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final AdvRefreshWithDelayDTO copy(Double delay, boolean refreshFromBackground, boolean refreshFromAnotherPage, Boolean isSilent, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new AdvRefreshWithDelayDTO(delay, refreshFromBackground, refreshFromAnotherPage, isSilent, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvRefreshWithDelayDTO)) {
            return false;
        }
        AdvRefreshWithDelayDTO advRefreshWithDelayDTO = (AdvRefreshWithDelayDTO) other;
        return Intrinsics.d(this.delay, advRefreshWithDelayDTO.delay) && this.refreshFromBackground == advRefreshWithDelayDTO.refreshFromBackground && this.refreshFromAnotherPage == advRefreshWithDelayDTO.refreshFromAnotherPage && Intrinsics.d(this.isSilent, advRefreshWithDelayDTO.isSilent) && Intrinsics.d(this.trackingInfo, advRefreshWithDelayDTO.trackingInfo);
    }

    public final Double getDelay() {
        return this.delay;
    }

    public final boolean getRefreshFromAnotherPage() {
        return this.refreshFromAnotherPage;
    }

    public final boolean getRefreshFromBackground() {
        return this.refreshFromBackground;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        Double d11 = this.delay;
        int a11 = C3532b.a(C3532b.a((d11 == null ? 0 : d11.hashCode()) * 31, 31, this.refreshFromBackground), 31, this.refreshFromAnotherPage);
        Boolean bool = this.isSilent;
        int hashCode = (a11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final Boolean isSilent() {
        return this.isSilent;
    }

    @NotNull
    public String toString() {
        Double d11 = this.delay;
        boolean z11 = this.refreshFromBackground;
        boolean z12 = this.refreshFromAnotherPage;
        Boolean bool = this.isSilent;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("AdvRefreshWithDelayDTO(delay=");
        sb2.append(d11);
        sb2.append(", refreshFromBackground=");
        sb2.append(z11);
        sb2.append(", refreshFromAnotherPage=");
        sb2.append(z12);
        sb2.append(", isSilent=");
        sb2.append(bool);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
