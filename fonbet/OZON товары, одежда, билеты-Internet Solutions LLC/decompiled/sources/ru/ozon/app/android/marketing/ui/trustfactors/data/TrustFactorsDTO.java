package ru.ozon.app.android.marketing.ui.trustfactors.data;

import G.g;
import T7.P;
import Tl.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/marketing/ui/trustfactors/data/TrustFactorsDTO;", "", "backgroundColor", "", "trustFactors", "", "Lru/ozon/app/android/marketing/ui/trustfactors/data/TrustFactorItem;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "getBackgroundColor", "()Ljava/lang/String;", "getTrustFactors", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "trust-factors_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TrustFactorsDTO {
    private final String backgroundColor;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final List<TrustFactorItem> trustFactors;

    public TrustFactorsDTO(String str, @NotNull List<TrustFactorItem> trustFactors, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(trustFactors, "trustFactors");
        this.backgroundColor = str;
        this.trustFactors = trustFactors;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrustFactorsDTO copy$default(TrustFactorsDTO trustFactorsDTO, String str, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = trustFactorsDTO.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            list = trustFactorsDTO.trustFactors;
        }
        if ((i11 & 4) != 0) {
            map = trustFactorsDTO.trackingInfo;
        }
        return trustFactorsDTO.copy(str, list, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<TrustFactorItem> component2() {
        return this.trustFactors;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final TrustFactorsDTO copy(String backgroundColor, @NotNull List<TrustFactorItem> trustFactors, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(trustFactors, "trustFactors");
        return new TrustFactorsDTO(backgroundColor, trustFactors, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrustFactorsDTO)) {
            return false;
        }
        TrustFactorsDTO trustFactorsDTO = (TrustFactorsDTO) other;
        return Intrinsics.d(this.backgroundColor, trustFactorsDTO.backgroundColor) && Intrinsics.d(this.trustFactors, trustFactorsDTO.trustFactors) && Intrinsics.d(this.trackingInfo, trustFactorsDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final List<TrustFactorItem> getTrustFactors() {
        return this.trustFactors;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int b11 = g.b((str == null ? 0 : str.hashCode()) * 31, 31, this.trustFactors);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        List<TrustFactorItem> list = this.trustFactors;
        return P.f(b.f("TrustFactorsDTO(backgroundColor=", str, ", trustFactors=", ", trackingInfo=", list), this.trackingInfo, ")");
    }
}
