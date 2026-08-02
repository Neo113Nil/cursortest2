package com.socure.docv.capturesdk.common.analytics.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MetricData.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012 \b\u0002\u0010\u0004\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001`\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010#\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001`\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003Jc\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032 \b\u0002\u0010\u0004\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001`\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R2\u0010\u0004\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001d¨\u0006/"}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/model/Capabilities;", "", RRWebVideoEvent.JsonKeys.FRAME_RATE, "Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxInt;", "facingMode", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "width", ViewProps.ASPECT_RATIO, "Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxDouble;", "deviceId", "height", "(Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxInt;Ljava/util/ArrayList;Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxInt;Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxDouble;Ljava/lang/String;Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxInt;)V", "getAspectRatio", "()Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxDouble;", "setAspectRatio", "(Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxDouble;)V", "getDeviceId", "()Ljava/lang/String;", "setDeviceId", "(Ljava/lang/String;)V", "getFacingMode", "()Ljava/util/ArrayList;", "setFacingMode", "(Ljava/util/ArrayList;)V", "getFrameRate", "()Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxInt;", "setFrameRate", "(Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxInt;)V", "getHeight", "setHeight", "getWidth", "setWidth", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Capabilities {
    public static final int $stable = 8;
    private MinMaxDouble aspectRatio;
    private String deviceId;
    private ArrayList<String> facingMode;
    private MinMaxInt frameRate;
    private MinMaxInt height;
    private MinMaxInt width;

    public static /* synthetic */ Capabilities copy$default(Capabilities capabilities, MinMaxInt minMaxInt, ArrayList arrayList, MinMaxInt minMaxInt2, MinMaxDouble minMaxDouble, String str, MinMaxInt minMaxInt3, int i, Object obj) {
        if ((i & 1) != 0) {
            minMaxInt = capabilities.frameRate;
        }
        if ((i & 2) != 0) {
            arrayList = capabilities.facingMode;
        }
        if ((i & 4) != 0) {
            minMaxInt2 = capabilities.width;
        }
        if ((i & 8) != 0) {
            minMaxDouble = capabilities.aspectRatio;
        }
        if ((i & 16) != 0) {
            str = capabilities.deviceId;
        }
        if ((i & 32) != 0) {
            minMaxInt3 = capabilities.height;
        }
        String str2 = str;
        MinMaxInt minMaxInt4 = minMaxInt3;
        return capabilities.copy(minMaxInt, arrayList, minMaxInt2, minMaxDouble, str2, minMaxInt4);
    }

    /* renamed from: component1, reason: from getter */
    public final MinMaxInt getFrameRate() {
        return this.frameRate;
    }

    public final ArrayList<String> component2() {
        return this.facingMode;
    }

    /* renamed from: component3, reason: from getter */
    public final MinMaxInt getWidth() {
        return this.width;
    }

    /* renamed from: component4, reason: from getter */
    public final MinMaxDouble getAspectRatio() {
        return this.aspectRatio;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component6, reason: from getter */
    public final MinMaxInt getHeight() {
        return this.height;
    }

    public final Capabilities copy(MinMaxInt frameRate, ArrayList<String> facingMode, MinMaxInt width, MinMaxDouble aspectRatio, String deviceId, MinMaxInt height) {
        Intrinsics.checkNotNullParameter(width, "width");
        Intrinsics.checkNotNullParameter(height, "height");
        return new Capabilities(frameRate, facingMode, width, aspectRatio, deviceId, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Capabilities)) {
            return false;
        }
        Capabilities capabilities = (Capabilities) other;
        return Intrinsics.areEqual(this.frameRate, capabilities.frameRate) && Intrinsics.areEqual(this.facingMode, capabilities.facingMode) && Intrinsics.areEqual(this.width, capabilities.width) && Intrinsics.areEqual(this.aspectRatio, capabilities.aspectRatio) && Intrinsics.areEqual(this.deviceId, capabilities.deviceId) && Intrinsics.areEqual(this.height, capabilities.height);
    }

    public int hashCode() {
        MinMaxInt minMaxInt = this.frameRate;
        int hashCode = (minMaxInt == null ? 0 : minMaxInt.hashCode()) * 31;
        ArrayList<String> arrayList = this.facingMode;
        int hashCode2 = (((hashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31) + this.width.hashCode()) * 31;
        MinMaxDouble minMaxDouble = this.aspectRatio;
        int hashCode3 = (hashCode2 + (minMaxDouble == null ? 0 : minMaxDouble.hashCode())) * 31;
        String str = this.deviceId;
        return ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.height.hashCode();
    }

    public String toString() {
        return "Capabilities(frameRate=" + this.frameRate + ", facingMode=" + this.facingMode + ", width=" + this.width + ", aspectRatio=" + this.aspectRatio + ", deviceId=" + this.deviceId + ", height=" + this.height + ")";
    }

    public Capabilities(MinMaxInt minMaxInt, ArrayList<String> arrayList, MinMaxInt width, MinMaxDouble minMaxDouble, String str, MinMaxInt height) {
        Intrinsics.checkNotNullParameter(width, "width");
        Intrinsics.checkNotNullParameter(height, "height");
        this.frameRate = minMaxInt;
        this.facingMode = arrayList;
        this.width = width;
        this.aspectRatio = minMaxDouble;
        this.deviceId = str;
        this.height = height;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Capabilities(MinMaxInt minMaxInt, ArrayList arrayList, MinMaxInt minMaxInt2, MinMaxDouble minMaxDouble, String str, MinMaxInt minMaxInt3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(minMaxInt, arrayList, minMaxInt2, minMaxDouble, r7, r8);
        MinMaxInt minMaxInt4;
        String str2;
        minMaxInt = (i & 1) != 0 ? null : minMaxInt;
        arrayList = (i & 2) != 0 ? null : arrayList;
        minMaxDouble = (i & 8) != 0 ? null : minMaxDouble;
        if ((i & 16) != 0) {
            minMaxInt4 = minMaxInt3;
            str2 = null;
        } else {
            minMaxInt4 = minMaxInt3;
            str2 = str;
        }
    }

    public final MinMaxInt getFrameRate() {
        return this.frameRate;
    }

    public final void setFrameRate(MinMaxInt minMaxInt) {
        this.frameRate = minMaxInt;
    }

    public final ArrayList<String> getFacingMode() {
        return this.facingMode;
    }

    public final void setFacingMode(ArrayList<String> arrayList) {
        this.facingMode = arrayList;
    }

    public final MinMaxInt getWidth() {
        return this.width;
    }

    public final void setWidth(MinMaxInt minMaxInt) {
        Intrinsics.checkNotNullParameter(minMaxInt, "<set-?>");
        this.width = minMaxInt;
    }

    public final MinMaxDouble getAspectRatio() {
        return this.aspectRatio;
    }

    public final void setAspectRatio(MinMaxDouble minMaxDouble) {
        this.aspectRatio = minMaxDouble;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final void setDeviceId(String str) {
        this.deviceId = str;
    }

    public final MinMaxInt getHeight() {
        return this.height;
    }

    public final void setHeight(MinMaxInt minMaxInt) {
        Intrinsics.checkNotNullParameter(minMaxInt, "<set-?>");
        this.height = minMaxInt;
    }
}
