package com.unity3d.ads.core.domain.offerwall;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import defpackage.bf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J<\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "", "offerwallEvent", "Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "placementName", "", "errorMessage", IronSourceConstants.EVENTS_ERROR_CODE, "", "<init>", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getOfferwallEvent", "()Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "getPlacementName", "()Ljava/lang/String;", "getErrorMessage", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "equals", "", "other", "hashCode", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class OfferwallEventData {

    @Nullable
    private final Integer errorCode;

    @Nullable
    private final String errorMessage;

    @NotNull
    private final OfferwallEvent offerwallEvent;

    @Nullable
    private final String placementName;

    public /* synthetic */ OfferwallEventData(OfferwallEvent offerwallEvent, String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(offerwallEvent, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num);
    }

    public static /* synthetic */ OfferwallEventData copy$default(OfferwallEventData offerwallEventData, OfferwallEvent offerwallEvent, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            offerwallEvent = offerwallEventData.offerwallEvent;
        }
        if ((i & 2) != 0) {
            str = offerwallEventData.placementName;
        }
        if ((i & 4) != 0) {
            str2 = offerwallEventData.errorMessage;
        }
        if ((i & 8) != 0) {
            num = offerwallEventData.errorCode;
        }
        return offerwallEventData.copy(offerwallEvent, str, str2, num);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OfferwallEvent getOfferwallEvent() {
        return this.offerwallEvent;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getPlacementName() {
        return this.placementName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final OfferwallEventData copy(@NotNull OfferwallEvent offerwallEvent, @Nullable String placementName, @Nullable String errorMessage, @Nullable Integer errorCode) {
        offerwallEvent.getClass();
        return new OfferwallEventData(offerwallEvent, placementName, errorMessage, errorCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfferwallEventData)) {
            return false;
        }
        OfferwallEventData offerwallEventData = (OfferwallEventData) other;
        return this.offerwallEvent == offerwallEventData.offerwallEvent && Intrinsics.c(this.placementName, offerwallEventData.placementName) && Intrinsics.c(this.errorMessage, offerwallEventData.errorMessage) && Intrinsics.c(this.errorCode, offerwallEventData.errorCode);
    }

    @Nullable
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final OfferwallEvent getOfferwallEvent() {
        return this.offerwallEvent;
    }

    @Nullable
    public final String getPlacementName() {
        return this.placementName;
    }

    public int hashCode() {
        int hashCode = this.offerwallEvent.hashCode() * 31;
        String str = this.placementName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorMessage;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.errorCode;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("OfferwallEventData(offerwallEvent=");
        sb.append(this.offerwallEvent);
        sb.append(", placementName=");
        sb.append(this.placementName);
        sb.append(", errorMessage=");
        sb.append(this.errorMessage);
        sb.append(", errorCode=");
        return bf3.n(sb, this.errorCode, ')');
    }

    public OfferwallEventData(@NotNull OfferwallEvent offerwallEvent, @Nullable String str, @Nullable String str2, @Nullable Integer num) {
        offerwallEvent.getClass();
        this.offerwallEvent = offerwallEvent;
        this.placementName = str;
        this.errorMessage = str2;
        this.errorCode = num;
    }
}
