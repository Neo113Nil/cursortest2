package ru.ozon.app.android.checkoutgeo.address.addressUiInfoService;

import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/ActionAddressBookBarGeoResponse;", "", "tooltip", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/CheckoutTooltip;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/CheckoutTooltip;Ljava/util/Map;)V", "getTooltip", "()Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/CheckoutTooltip;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ActionAddressBookBarGeoResponse {
    private final CheckoutTooltip tooltip;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ActionAddressBookBarGeoResponse(CheckoutTooltip checkoutTooltip, Map<String, TokenizedTrackingInfo> map) {
        this.tooltip = checkoutTooltip;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionAddressBookBarGeoResponse copy$default(ActionAddressBookBarGeoResponse actionAddressBookBarGeoResponse, CheckoutTooltip checkoutTooltip, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            checkoutTooltip = actionAddressBookBarGeoResponse.tooltip;
        }
        if ((i11 & 2) != 0) {
            map = actionAddressBookBarGeoResponse.trackingInfo;
        }
        return actionAddressBookBarGeoResponse.copy(checkoutTooltip, map);
    }

    /* renamed from: component1, reason: from getter */
    public final CheckoutTooltip getTooltip() {
        return this.tooltip;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final ActionAddressBookBarGeoResponse copy(CheckoutTooltip tooltip, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new ActionAddressBookBarGeoResponse(tooltip, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionAddressBookBarGeoResponse)) {
            return false;
        }
        ActionAddressBookBarGeoResponse actionAddressBookBarGeoResponse = (ActionAddressBookBarGeoResponse) other;
        return Intrinsics.d(this.tooltip, actionAddressBookBarGeoResponse.tooltip) && Intrinsics.d(this.trackingInfo, actionAddressBookBarGeoResponse.trackingInfo);
    }

    public final CheckoutTooltip getTooltip() {
        return this.tooltip;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        CheckoutTooltip checkoutTooltip = this.tooltip;
        int hashCode = (checkoutTooltip == null ? 0 : checkoutTooltip.hashCode()) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ActionAddressBookBarGeoResponse(tooltip=" + this.tooltip + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
