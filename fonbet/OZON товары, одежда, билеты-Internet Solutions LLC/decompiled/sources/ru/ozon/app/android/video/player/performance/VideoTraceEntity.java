package ru.ozon.app.android.video.player.performance;

import B4.V;
import G.g;
import Kk.C3532b;
import Nh.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.networkinfo.models.ConnectionType;
import ru.ozon.tracker.performance.ObjectTypes;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b!\b\u0081\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b$\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b(\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b)\u0010\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b*\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b+\u0010\u0016R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b,\u0010\u0016R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b0\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/video/player/performance/VideoTraceEntity;", "", "Lru/ozon/android/networkinfo/models/ConnectionType;", "connectionType", "", "videoUrl", "Lru/ozon/tracker/performance/ObjectTypes;", "objectTypes", "widgetName", "", "videoIndex", "pageViewId", "currentPage", "currentUrl", "requestId", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "videoTrackingEnabled", "loadVideoTrackingEnabled", "<init>", "(Lru/ozon/android/networkinfo/models/ConnectionType;Ljava/lang/String;Lru/ozon/tracker/performance/ObjectTypes;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/android/networkinfo/models/ConnectionType;", "getConnectionType", "()Lru/ozon/android/networkinfo/models/ConnectionType;", "Ljava/lang/String;", "getVideoUrl", "Lru/ozon/tracker/performance/ObjectTypes;", "getObjectTypes", "()Lru/ozon/tracker/performance/ObjectTypes;", "getWidgetName", "Ljava/lang/Integer;", "getVideoIndex", "()Ljava/lang/Integer;", "getPageViewId", "getCurrentPage", "getCurrentUrl", "getRequestId", "getName", "Z", "getVideoTrackingEnabled", "()Z", "getLoadVideoTrackingEnabled", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VideoTraceEntity {

    @NotNull
    private final ConnectionType connectionType;
    private final String currentPage;
    private final String currentUrl;
    private final boolean loadVideoTrackingEnabled;

    @NotNull
    private final String name;

    @NotNull
    private final ObjectTypes objectTypes;
    private final String pageViewId;
    private final String requestId;
    private final Integer videoIndex;
    private final boolean videoTrackingEnabled;

    @NotNull
    private final String videoUrl;
    private final String widgetName;

    public VideoTraceEntity(@NotNull ConnectionType connectionType, @NotNull String videoUrl, @NotNull ObjectTypes objectTypes, String str, Integer num, String str2, String str3, String str4, String str5, @NotNull String name, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(connectionType, "connectionType");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(objectTypes, "objectTypes");
        Intrinsics.checkNotNullParameter(name, "name");
        this.connectionType = connectionType;
        this.videoUrl = videoUrl;
        this.objectTypes = objectTypes;
        this.widgetName = str;
        this.videoIndex = num;
        this.pageViewId = str2;
        this.currentPage = str3;
        this.currentUrl = str4;
        this.requestId = str5;
        this.name = name;
        this.videoTrackingEnabled = z11;
        this.loadVideoTrackingEnabled = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoTraceEntity)) {
            return false;
        }
        VideoTraceEntity videoTraceEntity = (VideoTraceEntity) other;
        return this.connectionType == videoTraceEntity.connectionType && Intrinsics.d(this.videoUrl, videoTraceEntity.videoUrl) && this.objectTypes == videoTraceEntity.objectTypes && Intrinsics.d(this.widgetName, videoTraceEntity.widgetName) && Intrinsics.d(this.videoIndex, videoTraceEntity.videoIndex) && Intrinsics.d(this.pageViewId, videoTraceEntity.pageViewId) && Intrinsics.d(this.currentPage, videoTraceEntity.currentPage) && Intrinsics.d(this.currentUrl, videoTraceEntity.currentUrl) && Intrinsics.d(this.requestId, videoTraceEntity.requestId) && Intrinsics.d(this.name, videoTraceEntity.name) && this.videoTrackingEnabled == videoTraceEntity.videoTrackingEnabled && this.loadVideoTrackingEnabled == videoTraceEntity.loadVideoTrackingEnabled;
    }

    @NotNull
    public final ConnectionType getConnectionType() {
        return this.connectionType;
    }

    public final String getCurrentPage() {
        return this.currentPage;
    }

    public final String getCurrentUrl() {
        return this.currentUrl;
    }

    public final boolean getLoadVideoTrackingEnabled() {
        return this.loadVideoTrackingEnabled;
    }

    @NotNull
    public final ObjectTypes getObjectTypes() {
        return this.objectTypes;
    }

    public final String getPageViewId() {
        return this.pageViewId;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final Integer getVideoIndex() {
        return this.videoIndex;
    }

    public final boolean getVideoTrackingEnabled() {
        return this.videoTrackingEnabled;
    }

    @NotNull
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int hashCode = (this.objectTypes.hashCode() + g.a(this.connectionType.hashCode() * 31, 31, this.videoUrl)) * 31;
        String str = this.widgetName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.videoIndex;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.pageViewId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currentPage;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currentUrl;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.requestId;
        return Boolean.hashCode(this.loadVideoTrackingEnabled) + C3532b.a(g.a((hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.name), 31, this.videoTrackingEnabled);
    }

    @NotNull
    public String toString() {
        ConnectionType connectionType = this.connectionType;
        String str = this.videoUrl;
        ObjectTypes objectTypes = this.objectTypes;
        String str2 = this.widgetName;
        Integer num = this.videoIndex;
        String str3 = this.pageViewId;
        String str4 = this.currentPage;
        String str5 = this.currentUrl;
        String str6 = this.requestId;
        String str7 = this.name;
        boolean z11 = this.videoTrackingEnabled;
        boolean z12 = this.loadVideoTrackingEnabled;
        StringBuilder sb2 = new StringBuilder("VideoTraceEntity(connectionType=");
        sb2.append(connectionType);
        sb2.append(", videoUrl=");
        sb2.append(str);
        sb2.append(", objectTypes=");
        sb2.append(objectTypes);
        sb2.append(", widgetName=");
        sb2.append(str2);
        sb2.append(", videoIndex=");
        V.f(num, ", pageViewId=", str3, ", currentPage=", sb2);
        a.h(sb2, str4, ", currentUrl=", str5, ", requestId=");
        a.h(sb2, str6, ", name=", str7, ", videoTrackingEnabled=");
        sb2.append(z11);
        sb2.append(", loadVideoTrackingEnabled=");
        sb2.append(z12);
        sb2.append(")");
        return sb2.toString();
    }
}
