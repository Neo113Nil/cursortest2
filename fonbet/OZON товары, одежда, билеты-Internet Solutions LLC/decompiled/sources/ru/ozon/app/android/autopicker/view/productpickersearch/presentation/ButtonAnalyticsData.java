package ru.ozon.app.android.autopicker.view.productpickersearch.presentation;

import C.o0;
import G.g;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.model.TrinityEventEntityKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ButtonAnalyticsData;", "", "", "trackingInfoId", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTrackingInfoId", "getActionType", "getStatus", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ButtonAnalyticsData {

    @NotNull
    private final String actionType;

    @NotNull
    private final String status;

    @NotNull
    private final String trackingInfoId;

    public ButtonAnalyticsData(@NotNull String trackingInfoId, @NotNull String actionType, @NotNull String status) {
        Intrinsics.checkNotNullParameter(trackingInfoId, "trackingInfoId");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(status, "status");
        this.trackingInfoId = trackingInfoId;
        this.actionType = actionType;
        this.status = status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonAnalyticsData)) {
            return false;
        }
        ButtonAnalyticsData buttonAnalyticsData = (ButtonAnalyticsData) other;
        return Intrinsics.d(this.trackingInfoId, buttonAnalyticsData.trackingInfoId) && Intrinsics.d(this.actionType, buttonAnalyticsData.actionType) && Intrinsics.d(this.status, buttonAnalyticsData.status);
    }

    @NotNull
    public final String getActionType() {
        return this.actionType;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTrackingInfoId() {
        return this.trackingInfoId;
    }

    public int hashCode() {
        return this.status.hashCode() + g.a(this.trackingInfoId.hashCode() * 31, 31, this.actionType);
    }

    @NotNull
    public String toString() {
        String str = this.trackingInfoId;
        String str2 = this.actionType;
        return o0.c(C3660k.d("ButtonAnalyticsData(trackingInfoId=", str, ", actionType=", str2, ", status="), this.status, ")");
    }
}
