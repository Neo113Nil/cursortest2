package ru.ozon.app.android.fresh.cart.widgets.cartControls.data;

import GR.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.common.TooltipDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartControls/data/TooltipData;", "", "key", "", "tooltip", "Lru/ozon/uni/atoms/data/common/TooltipDTO;", "serverTimestamp", "Lorg/joda/time/DateTime;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/common/TooltipDTO;Lorg/joda/time/DateTime;Ljava/util/Map;)V", "getKey", "()Ljava/lang/String;", "getTooltip", "()Lru/ozon/uni/atoms/data/common/TooltipDTO;", "getServerTimestamp", "()Lorg/joda/time/DateTime;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TooltipData {
    public static final int $stable = 8;

    @NotNull
    private final String key;

    @NotNull
    private final DateTime serverTimestamp;

    @NotNull
    private final TooltipDTO tooltip;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public TooltipData(@NotNull String key, @NotNull TooltipDTO tooltip, @NotNull DateTime serverTimestamp, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
        Intrinsics.checkNotNullParameter(serverTimestamp, "serverTimestamp");
        this.key = key;
        this.tooltip = tooltip;
        this.serverTimestamp = serverTimestamp;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TooltipData copy$default(TooltipData tooltipData, String str, TooltipDTO tooltipDTO, DateTime dateTime, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tooltipData.key;
        }
        if ((i11 & 2) != 0) {
            tooltipDTO = tooltipData.tooltip;
        }
        if ((i11 & 4) != 0) {
            dateTime = tooltipData.serverTimestamp;
        }
        if ((i11 & 8) != 0) {
            map = tooltipData.trackingInfo;
        }
        return tooltipData.copy(str, tooltipDTO, dateTime, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TooltipDTO getTooltip() {
        return this.tooltip;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final DateTime getServerTimestamp() {
        return this.serverTimestamp;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final TooltipData copy(@NotNull String key, @NotNull TooltipDTO tooltip, @NotNull DateTime serverTimestamp, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
        Intrinsics.checkNotNullParameter(serverTimestamp, "serverTimestamp");
        return new TooltipData(key, tooltip, serverTimestamp, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TooltipData)) {
            return false;
        }
        TooltipData tooltipData = (TooltipData) other;
        return Intrinsics.d(this.key, tooltipData.key) && Intrinsics.d(this.tooltip, tooltipData.tooltip) && Intrinsics.d(this.serverTimestamp, tooltipData.serverTimestamp) && Intrinsics.d(this.trackingInfo, tooltipData.trackingInfo);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final DateTime getServerTimestamp() {
        return this.serverTimestamp;
    }

    @NotNull
    public final TooltipDTO getTooltip() {
        return this.tooltip;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = b.a(this.serverTimestamp, (this.tooltip.hashCode() + (this.key.hashCode() * 31)) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return "TooltipData(key=" + this.key + ", tooltip=" + this.tooltip + ", serverTimestamp=" + this.serverTimestamp + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
