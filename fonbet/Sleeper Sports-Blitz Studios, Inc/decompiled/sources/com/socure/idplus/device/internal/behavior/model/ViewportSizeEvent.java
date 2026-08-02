package com.socure.idplus.device.internal.behavior.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006'"}, d2 = {"Lcom/socure/idplus/device/internal/behavior/model/ViewportSizeEvent;", "", "clientTime", "", "viewportWidth", "", "viewportHeight", "screenWidth", "screenHeight", "devicePixelRatio", "", "orientation", "Lcom/socure/idplus/device/internal/behavior/model/Orientation;", "(JIIIIFLcom/socure/idplus/device/internal/behavior/model/Orientation;)V", "getClientTime", "()J", "getDevicePixelRatio", "()F", "getOrientation", "()Lcom/socure/idplus/device/internal/behavior/model/Orientation;", "getScreenHeight", "()I", "getScreenWidth", "getViewportHeight", "getViewportWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ViewportSizeEvent {

    @SerializedName("clientTime")
    private final long clientTime;

    @SerializedName("devicePixelRatio")
    private final float devicePixelRatio;

    @SerializedName("orientation")
    private final Orientation orientation;

    @SerializedName("screenHeight")
    private final int screenHeight;

    @SerializedName("screenWidth")
    private final int screenWidth;

    @SerializedName("viewportHeight")
    private final int viewportHeight;

    @SerializedName("viewportWidth")
    private final int viewportWidth;

    public ViewportSizeEvent(long j, int i, int i2, int i3, int i4, float f, Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.clientTime = j;
        this.viewportWidth = i;
        this.viewportHeight = i2;
        this.screenWidth = i3;
        this.screenHeight = i4;
        this.devicePixelRatio = f;
        this.orientation = orientation;
    }

    public static /* synthetic */ ViewportSizeEvent copy$default(ViewportSizeEvent viewportSizeEvent, long j, int i, int i2, int i3, int i4, float f, Orientation orientation, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j = viewportSizeEvent.clientTime;
        }
        long j2 = j;
        if ((i5 & 2) != 0) {
            i = viewportSizeEvent.viewportWidth;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = viewportSizeEvent.viewportHeight;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            i3 = viewportSizeEvent.screenWidth;
        }
        int i8 = i3;
        if ((i5 & 16) != 0) {
            i4 = viewportSizeEvent.screenHeight;
        }
        return viewportSizeEvent.copy(j2, i6, i7, i8, i4, (i5 & 32) != 0 ? viewportSizeEvent.devicePixelRatio : f, (i5 & 64) != 0 ? viewportSizeEvent.orientation : orientation);
    }

    /* renamed from: component1, reason: from getter */
    public final long getClientTime() {
        return this.clientTime;
    }

    /* renamed from: component2, reason: from getter */
    public final int getViewportWidth() {
        return this.viewportWidth;
    }

    /* renamed from: component3, reason: from getter */
    public final int getViewportHeight() {
        return this.viewportHeight;
    }

    /* renamed from: component4, reason: from getter */
    public final int getScreenWidth() {
        return this.screenWidth;
    }

    /* renamed from: component5, reason: from getter */
    public final int getScreenHeight() {
        return this.screenHeight;
    }

    /* renamed from: component6, reason: from getter */
    public final float getDevicePixelRatio() {
        return this.devicePixelRatio;
    }

    /* renamed from: component7, reason: from getter */
    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final ViewportSizeEvent copy(long clientTime, int viewportWidth, int viewportHeight, int screenWidth, int screenHeight, float devicePixelRatio, Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return new ViewportSizeEvent(clientTime, viewportWidth, viewportHeight, screenWidth, screenHeight, devicePixelRatio, orientation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewportSizeEvent)) {
            return false;
        }
        ViewportSizeEvent viewportSizeEvent = (ViewportSizeEvent) other;
        return this.clientTime == viewportSizeEvent.clientTime && this.viewportWidth == viewportSizeEvent.viewportWidth && this.viewportHeight == viewportSizeEvent.viewportHeight && this.screenWidth == viewportSizeEvent.screenWidth && this.screenHeight == viewportSizeEvent.screenHeight && Float.compare(this.devicePixelRatio, viewportSizeEvent.devicePixelRatio) == 0 && this.orientation == viewportSizeEvent.orientation;
    }

    public final long getClientTime() {
        return this.clientTime;
    }

    public final float getDevicePixelRatio() {
        return this.devicePixelRatio;
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final int getScreenHeight() {
        return this.screenHeight;
    }

    public final int getScreenWidth() {
        return this.screenWidth;
    }

    public final int getViewportHeight() {
        return this.viewportHeight;
    }

    public final int getViewportWidth() {
        return this.viewportWidth;
    }

    public int hashCode() {
        return this.orientation.hashCode() + ((Float.hashCode(this.devicePixelRatio) + ((Integer.hashCode(this.screenHeight) + ((Integer.hashCode(this.screenWidth) + ((Integer.hashCode(this.viewportHeight) + ((Integer.hashCode(this.viewportWidth) + (Long.hashCode(this.clientTime) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "ViewportSizeEvent(clientTime=" + this.clientTime + ", viewportWidth=" + this.viewportWidth + ", viewportHeight=" + this.viewportHeight + ", screenWidth=" + this.screenWidth + ", screenHeight=" + this.screenHeight + ", devicePixelRatio=" + this.devicePixelRatio + ", orientation=" + this.orientation + ")";
    }
}
