package com.blaze.blazesdk.ads.ima.models;

import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.ima.BlazeIMAHandlerEventType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/blaze/blazesdk/ads/ima/models/BlazeImaAdEvent;", "", "adInfo", "Lcom/blaze/blazesdk/ads/ima/models/BlazeImaAdInfo;", "type", "Lcom/blaze/blazesdk/ads/ima/BlazeIMAHandlerEventType;", "<init>", "(Lcom/blaze/blazesdk/ads/ima/models/BlazeImaAdInfo;Lcom/blaze/blazesdk/ads/ima/BlazeIMAHandlerEventType;)V", "getAdInfo", "()Lcom/blaze/blazesdk/ads/ima/models/BlazeImaAdInfo;", "getType", "()Lcom/blaze/blazesdk/ads/ima/BlazeIMAHandlerEventType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeImaAdEvent {
    public static final int $stable = 8;

    @Nullable
    private final BlazeImaAdInfo adInfo;

    @NotNull
    private final BlazeIMAHandlerEventType type;

    public BlazeImaAdEvent(@Nullable BlazeImaAdInfo blazeImaAdInfo, @NotNull BlazeIMAHandlerEventType blazeIMAHandlerEventType) {
        blazeIMAHandlerEventType.getClass();
        this.adInfo = blazeImaAdInfo;
        this.type = blazeIMAHandlerEventType;
    }

    public static /* synthetic */ BlazeImaAdEvent copy$default(BlazeImaAdEvent blazeImaAdEvent, BlazeImaAdInfo blazeImaAdInfo, BlazeIMAHandlerEventType blazeIMAHandlerEventType, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeImaAdInfo = blazeImaAdEvent.adInfo;
        }
        if ((i & 2) != 0) {
            blazeIMAHandlerEventType = blazeImaAdEvent.type;
        }
        return blazeImaAdEvent.copy(blazeImaAdInfo, blazeIMAHandlerEventType);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final BlazeImaAdInfo getAdInfo() {
        return this.adInfo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeIMAHandlerEventType getType() {
        return this.type;
    }

    @NotNull
    public final BlazeImaAdEvent copy(@Nullable BlazeImaAdInfo adInfo, @NotNull BlazeIMAHandlerEventType type) {
        type.getClass();
        return new BlazeImaAdEvent(adInfo, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeImaAdEvent)) {
            return false;
        }
        BlazeImaAdEvent blazeImaAdEvent = (BlazeImaAdEvent) other;
        return Intrinsics.c(this.adInfo, blazeImaAdEvent.adInfo) && this.type == blazeImaAdEvent.type;
    }

    @Nullable
    public final BlazeImaAdInfo getAdInfo() {
        return this.adInfo;
    }

    @NotNull
    public final BlazeIMAHandlerEventType getType() {
        return this.type;
    }

    public int hashCode() {
        BlazeImaAdInfo blazeImaAdInfo = this.adInfo;
        return this.type.hashCode() + ((blazeImaAdInfo == null ? 0 : blazeImaAdInfo.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "BlazeImaAdEvent(adInfo=" + this.adInfo + ", type=" + this.type + ')';
    }
}
