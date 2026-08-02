package ru.ozon.tracker.performance.model;

import B0.C2454a;
import B4.V;
import B90.C2618u;
import B90.C2619v;
import C.J;
import C.o0;
import De.C2860c;
import Ef0.c;
import G.g;
import GR.b;
import N3.C3660k;
import Sc.InterfaceC3999a;
import V.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.networkinfo.models.ConnectionType;
import ru.ozon.tracker.performance.MapLoadingSteps;
import ru.ozon.tracker.sendEvent.Namespace;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001:\rVWXYZ[\\]^_`abBÕ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b!\u0010\"J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0006HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0011\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0003J\u0011\u0010K\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0017HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u0011\u0010M\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0017HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010 HÆ\u0003JÙ\u0001\u0010O\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00172\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 HÆ\u0001J\u0013\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010S\u001a\u00020THÖ\u0001J\t\u0010U\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b9\u00108R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b<\u00108R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>¨\u0006c"}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity;", "", "uuid", "", "requestId", "timestamp", "Lorg/joda/time/DateTime;", "testingToolName", "attributes", "Lru/ozon/tracker/performance/model/TraceEntity$Attributes;", "user", "Lru/ozon/tracker/performance/model/TraceEntity$User;", "page", "Lru/ozon/tracker/performance/model/TraceEntity$Page;", "object", "Lru/ozon/tracker/performance/model/TraceEntity$Obj;", "properties", "Lru/ozon/tracker/performance/model/TraceEntity$Properties;", "widget", "Lru/ozon/tracker/performance/model/TraceEntity$Widget;", "map", "Lru/ozon/tracker/performance/model/TraceEntity$MapSdk;", "metrics", "", "Lru/ozon/tracker/performance/model/TraceEntity$Metric;", "customMetrics", "Lru/ozon/tracker/performance/model/TraceEntity$CustomMetric;", "video", "Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric;", "serverTimings", "Lru/ozon/tracker/performance/model/TraceEntity$ServerTimingData;", "pclpage", "Lru/ozon/tracker/performance/model/TraceEntity$PclPage;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Lru/ozon/tracker/performance/model/TraceEntity$Attributes;Lru/ozon/tracker/performance/model/TraceEntity$User;Lru/ozon/tracker/performance/model/TraceEntity$Page;Lru/ozon/tracker/performance/model/TraceEntity$Obj;Lru/ozon/tracker/performance/model/TraceEntity$Properties;Lru/ozon/tracker/performance/model/TraceEntity$Widget;Lru/ozon/tracker/performance/model/TraceEntity$MapSdk;Ljava/util/List;Ljava/util/List;Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric;Ljava/util/List;Lru/ozon/tracker/performance/model/TraceEntity$PclPage;)V", "getUuid", "()Ljava/lang/String;", "getRequestId", "getTimestamp", "()Lorg/joda/time/DateTime;", "getTestingToolName", "getAttributes", "()Lru/ozon/tracker/performance/model/TraceEntity$Attributes;", "getUser", "()Lru/ozon/tracker/performance/model/TraceEntity$User;", "getPage", "()Lru/ozon/tracker/performance/model/TraceEntity$Page;", "getObject", "()Lru/ozon/tracker/performance/model/TraceEntity$Obj;", "getProperties", "()Lru/ozon/tracker/performance/model/TraceEntity$Properties;", "getWidget", "()Lru/ozon/tracker/performance/model/TraceEntity$Widget;", "getMap", "()Lru/ozon/tracker/performance/model/TraceEntity$MapSdk;", "getMetrics", "()Ljava/util/List;", "getCustomMetrics", "getVideo", "()Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric;", "getServerTimings", "getPclpage", "()Lru/ozon/tracker/performance/model/TraceEntity$PclPage;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "", "other", "hashCode", "", "toString", "PclPage", "Page", "Attributes", "Obj", "Properties", "Widget", "User", "Metric", "MapSdk", "CustomMetric", "VideoMetric", "ServerTimingData", "ErrorDetails", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TraceEntity {
    private final Attributes attributes;
    private final List<CustomMetric> customMetrics;
    private final MapSdk map;
    private final List<Metric> metrics;
    private final Obj object;
    private final Page page;
    private final PclPage pclpage;
    private final Properties properties;
    private final String requestId;
    private final List<ServerTimingData> serverTimings;
    private final String testingToolName;

    @NotNull
    private final DateTime timestamp;
    private final User user;
    private final String uuid;
    private final VideoMetric video;
    private final Widget widget;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B½\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010/\u001a\u00020\u000eJ\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010&\u001a\u0004\b'\u0010%R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010&\u001a\u0004\b(\u0010%R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010&\u001a\u0004\b)\u0010%R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010&\u001a\u0004\b*\u0010%R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010&\u001a\u0004\b+\u0010%R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010&\u001a\u0004\b,\u0010%R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010&\u001a\u0004\b-\u0010%R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010&\u001a\u0004\b.\u0010%¨\u00065"}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity$MapSdk;", "Landroid/os/Parcelable;", "provider", "", "server", "appName", "libVersion", "language", "suggestionProvider", "geocodeProvider", "revgeocodeProvider", "locationUUID", "errorCode", "loadProvidersDuration", "", "mapInitDuration", "vectorFirstTileRenderDuration", "vectorTotalTilesRenderDuration", "firstTilesDownloadDuration", "styleDownloadDuration", "loadProviderDuration", "vectorAvgTileParseDuration", "errorStatusCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getProvider", "()Ljava/lang/String;", "getServer", "getAppName", "getLibVersion", "getLanguage", "getSuggestionProvider", "getGeocodeProvider", "getRevgeocodeProvider", "getLocationUUID", "getErrorCode", "getLoadProvidersDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMapInitDuration", "getVectorFirstTileRenderDuration", "getVectorTotalTilesRenderDuration", "getFirstTilesDownloadDuration", "getStyleDownloadDuration", "getLoadProviderDuration", "getVectorAvgTileParseDuration", "getErrorStatusCode", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MapSdk implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<MapSdk> CREATOR = new a();

        @NotNull
        private final String appName;
        private final String errorCode;
        private final Integer errorStatusCode;
        private final Integer firstTilesDownloadDuration;
        private final String geocodeProvider;
        private final String language;

        @NotNull
        private final String libVersion;
        private final Integer loadProviderDuration;
        private final Integer loadProvidersDuration;
        private final String locationUUID;
        private final Integer mapInitDuration;

        @NotNull
        private final String provider;
        private final String revgeocodeProvider;

        @NotNull
        private final String server;
        private final Integer styleDownloadDuration;
        private final String suggestionProvider;
        private final Integer vectorAvgTileParseDuration;
        private final Integer vectorFirstTileRenderDuration;
        private final Integer vectorTotalTilesRenderDuration;

        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<MapSdk> {
            @Override // android.os.Parcelable.Creator
            public final MapSdk createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MapSdk(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final MapSdk[] newArray(int i11) {
                return new MapSdk[i11];
            }
        }

        public MapSdk(@NotNull String provider, @NotNull String server, @NotNull String appName, @NotNull String libVersion, String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9) {
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(server, "server");
            Intrinsics.checkNotNullParameter(appName, "appName");
            Intrinsics.checkNotNullParameter(libVersion, "libVersion");
            this.provider = provider;
            this.server = server;
            this.appName = appName;
            this.libVersion = libVersion;
            this.language = str;
            this.suggestionProvider = str2;
            this.geocodeProvider = str3;
            this.revgeocodeProvider = str4;
            this.locationUUID = str5;
            this.errorCode = str6;
            this.loadProvidersDuration = num;
            this.mapInitDuration = num2;
            this.vectorFirstTileRenderDuration = num3;
            this.vectorTotalTilesRenderDuration = num4;
            this.firstTilesDownloadDuration = num5;
            this.styleDownloadDuration = num6;
            this.loadProviderDuration = num7;
            this.vectorAvgTileParseDuration = num8;
            this.errorStatusCode = num9;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        public final String getAppName() {
            return this.appName;
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public final Integer getErrorStatusCode() {
            return this.errorStatusCode;
        }

        public final Integer getFirstTilesDownloadDuration() {
            return this.firstTilesDownloadDuration;
        }

        public final String getGeocodeProvider() {
            return this.geocodeProvider;
        }

        public final String getLanguage() {
            return this.language;
        }

        @NotNull
        public final String getLibVersion() {
            return this.libVersion;
        }

        public final Integer getLoadProviderDuration() {
            return this.loadProviderDuration;
        }

        public final Integer getLoadProvidersDuration() {
            return this.loadProvidersDuration;
        }

        public final String getLocationUUID() {
            return this.locationUUID;
        }

        public final Integer getMapInitDuration() {
            return this.mapInitDuration;
        }

        @NotNull
        public final String getProvider() {
            return this.provider;
        }

        public final String getRevgeocodeProvider() {
            return this.revgeocodeProvider;
        }

        @NotNull
        public final String getServer() {
            return this.server;
        }

        public final Integer getStyleDownloadDuration() {
            return this.styleDownloadDuration;
        }

        public final String getSuggestionProvider() {
            return this.suggestionProvider;
        }

        public final Integer getVectorAvgTileParseDuration() {
            return this.vectorAvgTileParseDuration;
        }

        public final Integer getVectorFirstTileRenderDuration() {
            return this.vectorFirstTileRenderDuration;
        }

        public final Integer getVectorTotalTilesRenderDuration() {
            return this.vectorTotalTilesRenderDuration;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.provider);
            dest.writeString(this.server);
            dest.writeString(this.appName);
            dest.writeString(this.libVersion);
            dest.writeString(this.language);
            dest.writeString(this.suggestionProvider);
            dest.writeString(this.geocodeProvider);
            dest.writeString(this.revgeocodeProvider);
            dest.writeString(this.locationUUID);
            dest.writeString(this.errorCode);
            Integer num = this.loadProvidersDuration;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
            Integer num2 = this.mapInitDuration;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num2);
            }
            Integer num3 = this.vectorFirstTileRenderDuration;
            if (num3 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num3);
            }
            Integer num4 = this.vectorTotalTilesRenderDuration;
            if (num4 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num4);
            }
            Integer num5 = this.firstTilesDownloadDuration;
            if (num5 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num5);
            }
            Integer num6 = this.styleDownloadDuration;
            if (num6 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num6);
            }
            Integer num7 = this.loadProviderDuration;
            if (num7 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num7);
            }
            Integer num8 = this.vectorAvgTileParseDuration;
            if (num8 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num8);
            }
            Integer num9 = this.errorStatusCode;
            if (num9 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num9);
            }
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity$Metric;", "Landroid/os/Parcelable;", "type", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;Ljava/lang/Double;)V", "getType", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Double;)Lru/ozon/tracker/performance/model/TraceEntity$Metric;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Metric implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Metric> CREATOR = new a();
        private final String type;
        private final Double value;

        public static final class a implements Parcelable.Creator<Metric> {
            @Override // android.os.Parcelable.Creator
            public final Metric createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Metric(parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
            }

            @Override // android.os.Parcelable.Creator
            public final Metric[] newArray(int i11) {
                return new Metric[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Metric() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Metric copy$default(Metric metric, String str, Double d11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = metric.type;
            }
            if ((i11 & 2) != 0) {
                d11 = metric.value;
            }
            return metric.copy(str, d11);
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final Double getValue() {
            return this.value;
        }

        @NotNull
        public final Metric copy(String type, Double value) {
            return new Metric(type, value);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Metric)) {
                return false;
            }
            Metric metric = (Metric) other;
            return Intrinsics.d(this.type, metric.type) && Intrinsics.d(this.value, metric.value);
        }

        public final String getType() {
            return this.type;
        }

        public final Double getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.type;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Double d11 = this.value;
            return hashCode + (d11 != null ? d11.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Metric(type=" + this.type + ", value=" + this.value + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.type);
            Double d11 = this.value;
            if (d11 == null) {
                dest.writeInt(0);
            } else {
                TY.a.d(dest, 1, d11);
            }
        }

        public Metric(String str, Double d11) {
            this.type = str;
            this.value = d11;
        }

        public /* synthetic */ Metric(String str, Double d11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : d11);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity$Obj;", "Landroid/os/Parcelable;", "type", "", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Obj implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Obj> CREATOR = new a();
        private final String id;
        private final String type;

        public static final class a implements Parcelable.Creator<Obj> {
            @Override // android.os.Parcelable.Creator
            public final Obj createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Obj(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Obj[] newArray(int i11) {
                return new Obj[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Obj() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Obj copy$default(Obj obj, String str, String str2, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                str = obj.type;
            }
            if ((i11 & 2) != 0) {
                str2 = obj.id;
            }
            return obj.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Obj copy(String type, String id2) {
            return new Obj(type, id2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Obj)) {
                return false;
            }
            Obj obj = (Obj) other;
            return Intrinsics.d(this.type, obj.type) && Intrinsics.d(this.id, obj.id);
        }

        public final String getId() {
            return this.id;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.type;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.id;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return e.a("Obj(type=", this.type, ", id=", this.id, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.type);
            dest.writeString(this.id);
        }

        public Obj(String str, String str2) {
            this.type = str;
            this.id = str2;
        }

        public /* synthetic */ Obj(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008d\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010(\u001a\u00020)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020)HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020)R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u00065"}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity$Page;", "Landroid/os/Parcelable;", "current", "", "previous", "currentUrl", "referralUrl", "nextUrl", "ruleId", "layoutId", "layoutVersion", "pageViewId", "previousPageViewId", "composerPageType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrent", "()Ljava/lang/String;", "getPrevious", "getCurrentUrl", "getReferralUrl", "getNextUrl", "getRuleId", "getLayoutId", "getLayoutVersion", "getPageViewId", "getPreviousPageViewId", "getComposerPageType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Page implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Page> CREATOR = new a();
        private final String composerPageType;
        private final String current;
        private final String currentUrl;
        private final String layoutId;
        private final String layoutVersion;
        private final String nextUrl;
        private final String pageViewId;
        private final String previous;
        private final String previousPageViewId;
        private final String referralUrl;
        private final String ruleId;

        public static final class a implements Parcelable.Creator<Page> {
            @Override // android.os.Parcelable.Creator
            public final Page createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Page(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Page[] newArray(int i11) {
                return new Page[i11];
            }
        }

        public Page() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }

        public static /* synthetic */ Page copy$default(Page page, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = page.current;
            }
            if ((i11 & 2) != 0) {
                str2 = page.previous;
            }
            if ((i11 & 4) != 0) {
                str3 = page.currentUrl;
            }
            if ((i11 & 8) != 0) {
                str4 = page.referralUrl;
            }
            if ((i11 & 16) != 0) {
                str5 = page.nextUrl;
            }
            if ((i11 & 32) != 0) {
                str6 = page.ruleId;
            }
            if ((i11 & 64) != 0) {
                str7 = page.layoutId;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str8 = page.layoutVersion;
            }
            if ((i11 & 256) != 0) {
                str9 = page.pageViewId;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                str10 = page.previousPageViewId;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                str11 = page.composerPageType;
            }
            String str12 = str10;
            String str13 = str11;
            String str14 = str8;
            String str15 = str9;
            String str16 = str6;
            String str17 = str7;
            String str18 = str5;
            String str19 = str3;
            return page.copy(str, str2, str19, str4, str18, str16, str17, str14, str15, str12, str13);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCurrent() {
            return this.current;
        }

        /* renamed from: component10, reason: from getter */
        public final String getPreviousPageViewId() {
            return this.previousPageViewId;
        }

        /* renamed from: component11, reason: from getter */
        public final String getComposerPageType() {
            return this.composerPageType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPrevious() {
            return this.previous;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCurrentUrl() {
            return this.currentUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final String getReferralUrl() {
            return this.referralUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final String getNextUrl() {
            return this.nextUrl;
        }

        /* renamed from: component6, reason: from getter */
        public final String getRuleId() {
            return this.ruleId;
        }

        /* renamed from: component7, reason: from getter */
        public final String getLayoutId() {
            return this.layoutId;
        }

        /* renamed from: component8, reason: from getter */
        public final String getLayoutVersion() {
            return this.layoutVersion;
        }

        /* renamed from: component9, reason: from getter */
        public final String getPageViewId() {
            return this.pageViewId;
        }

        @NotNull
        public final Page copy(String current, String previous, String currentUrl, String referralUrl, String nextUrl, String ruleId, String layoutId, String layoutVersion, String pageViewId, String previousPageViewId, String composerPageType) {
            return new Page(current, previous, currentUrl, referralUrl, nextUrl, ruleId, layoutId, layoutVersion, pageViewId, previousPageViewId, composerPageType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Page)) {
                return false;
            }
            Page page = (Page) other;
            return Intrinsics.d(this.current, page.current) && Intrinsics.d(this.previous, page.previous) && Intrinsics.d(this.currentUrl, page.currentUrl) && Intrinsics.d(this.referralUrl, page.referralUrl) && Intrinsics.d(this.nextUrl, page.nextUrl) && Intrinsics.d(this.ruleId, page.ruleId) && Intrinsics.d(this.layoutId, page.layoutId) && Intrinsics.d(this.layoutVersion, page.layoutVersion) && Intrinsics.d(this.pageViewId, page.pageViewId) && Intrinsics.d(this.previousPageViewId, page.previousPageViewId) && Intrinsics.d(this.composerPageType, page.composerPageType);
        }

        public final String getComposerPageType() {
            return this.composerPageType;
        }

        public final String getCurrent() {
            return this.current;
        }

        public final String getCurrentUrl() {
            return this.currentUrl;
        }

        public final String getLayoutId() {
            return this.layoutId;
        }

        public final String getLayoutVersion() {
            return this.layoutVersion;
        }

        public final String getNextUrl() {
            return this.nextUrl;
        }

        public final String getPageViewId() {
            return this.pageViewId;
        }

        public final String getPrevious() {
            return this.previous;
        }

        public final String getPreviousPageViewId() {
            return this.previousPageViewId;
        }

        public final String getReferralUrl() {
            return this.referralUrl;
        }

        public final String getRuleId() {
            return this.ruleId;
        }

        public int hashCode() {
            String str = this.current;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.previous;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.currentUrl;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.referralUrl;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.nextUrl;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.ruleId;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.layoutId;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.layoutVersion;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.pageViewId;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.previousPageViewId;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.composerPageType;
            return hashCode10 + (str11 != null ? str11.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.current;
            String str2 = this.previous;
            String str3 = this.currentUrl;
            String str4 = this.referralUrl;
            String str5 = this.nextUrl;
            String str6 = this.ruleId;
            String str7 = this.layoutId;
            String str8 = this.layoutVersion;
            String str9 = this.pageViewId;
            String str10 = this.previousPageViewId;
            String str11 = this.composerPageType;
            StringBuilder d11 = C3660k.d("Page(current=", str, ", previous=", str2, ", currentUrl=");
            Nh.a.h(d11, str3, ", referralUrl=", str4, ", nextUrl=");
            Nh.a.h(d11, str5, ", ruleId=", str6, ", layoutId=");
            Nh.a.h(d11, str7, ", layoutVersion=", str8, ", pageViewId=");
            Nh.a.h(d11, str9, ", previousPageViewId=", str10, ", composerPageType=");
            return o0.c(d11, str11, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.current);
            dest.writeString(this.previous);
            dest.writeString(this.currentUrl);
            dest.writeString(this.referralUrl);
            dest.writeString(this.nextUrl);
            dest.writeString(this.ruleId);
            dest.writeString(this.layoutId);
            dest.writeString(this.layoutVersion);
            dest.writeString(this.pageViewId);
            dest.writeString(this.previousPageViewId);
            dest.writeString(this.composerPageType);
        }

        public Page(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.current = str;
            this.previous = str2;
            this.currentUrl = str3;
            this.referralUrl = str4;
            this.nextUrl = str5;
            this.ruleId = str6;
            this.layoutId = str7;
            this.layoutVersion = str8;
            this.pageViewId = str9;
            this.previousPageViewId = str10;
            this.composerPageType = str11;
        }

        public /* synthetic */ Page(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str10, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str11);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J<\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006'"}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity$PclPage;", "Landroid/os/Parcelable;", "eventType", "", "reason", "cacheLifeTime", "", "cacheMaxAge", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;)V", "getEventType", "()Ljava/lang/String;", "getReason", "getCacheLifeTime", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCacheMaxAge", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;)Lru/ozon/tracker/performance/model/TraceEntity$PclPage;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class PclPage implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PclPage> CREATOR = new a();
        private final Double cacheLifeTime;
        private final Long cacheMaxAge;

        @NotNull
        private final String eventType;
        private final String reason;

        public static final class a implements Parcelable.Creator<PclPage> {
            @Override // android.os.Parcelable.Creator
            public final PclPage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PclPage(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final PclPage[] newArray(int i11) {
                return new PclPage[i11];
            }
        }

        public PclPage(@NotNull String eventType, String str, Double d11, Long l11) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            this.eventType = eventType;
            this.reason = str;
            this.cacheLifeTime = d11;
            this.cacheMaxAge = l11;
        }

        public static /* synthetic */ PclPage copy$default(PclPage pclPage, String str, String str2, Double d11, Long l11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = pclPage.eventType;
            }
            if ((i11 & 2) != 0) {
                str2 = pclPage.reason;
            }
            if ((i11 & 4) != 0) {
                d11 = pclPage.cacheLifeTime;
            }
            if ((i11 & 8) != 0) {
                l11 = pclPage.cacheMaxAge;
            }
            return pclPage.copy(str, str2, d11, l11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getEventType() {
            return this.eventType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        /* renamed from: component3, reason: from getter */
        public final Double getCacheLifeTime() {
            return this.cacheLifeTime;
        }

        /* renamed from: component4, reason: from getter */
        public final Long getCacheMaxAge() {
            return this.cacheMaxAge;
        }

        @NotNull
        public final PclPage copy(@NotNull String eventType, String reason, Double cacheLifeTime, Long cacheMaxAge) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            return new PclPage(eventType, reason, cacheLifeTime, cacheMaxAge);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PclPage)) {
                return false;
            }
            PclPage pclPage = (PclPage) other;
            return Intrinsics.d(this.eventType, pclPage.eventType) && Intrinsics.d(this.reason, pclPage.reason) && Intrinsics.d(this.cacheLifeTime, pclPage.cacheLifeTime) && Intrinsics.d(this.cacheMaxAge, pclPage.cacheMaxAge);
        }

        public final Double getCacheLifeTime() {
            return this.cacheLifeTime;
        }

        public final Long getCacheMaxAge() {
            return this.cacheMaxAge;
        }

        @NotNull
        public final String getEventType() {
            return this.eventType;
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            int hashCode = this.eventType.hashCode() * 31;
            String str = this.reason;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Double d11 = this.cacheLifeTime;
            int hashCode3 = (hashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
            Long l11 = this.cacheMaxAge;
            return hashCode3 + (l11 != null ? l11.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.eventType;
            String str2 = this.reason;
            Double d11 = this.cacheLifeTime;
            Long l11 = this.cacheMaxAge;
            StringBuilder d12 = C3660k.d("PclPage(eventType=", str, ", reason=", str2, ", cacheLifeTime=");
            d12.append(d11);
            d12.append(", cacheMaxAge=");
            d12.append(l11);
            d12.append(")");
            return d12.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.eventType);
            dest.writeString(this.reason);
            Double d11 = this.cacheLifeTime;
            if (d11 == null) {
                dest.writeInt(0);
            } else {
                TY.a.d(dest, 1, d11);
            }
            Long l11 = this.cacheMaxAge;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l11);
            }
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010;\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010<\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÎ\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010?J\u0006\u0010@\u001a\u00020\u0007J\u0013\u0010A\u001a\u00020\u00112\b\u0010B\u001a\u0004\u0018\u00010CHÖ\u0003J\t\u0010D\u001a\u00020\u0007HÖ\u0001J\t\u0010E\u001a\u00020\u0005HÖ\u0001J\u0016\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001eR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b!\u0010\u001eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010)\u001a\u0004\b\u0010\u0010(R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b*\u0010\u001eR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010)\u001a\u0004\b\u0013\u0010(R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001c¨\u0006K"}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity$Properties;", "Landroid/os/Parcelable;", "connectionType", "Lru/ozon/android/networkinfo/models/ConnectionType;", "contentType", "", "imageHeight", "", "imageWidth", "priority", "statusCode", "statusCodeType", ImagesContract.URL, "cacheType", "edgeIp", "stateId", "isLowPowerMode", "", "videoIndex", "isVideoPlaceholder", "mapLoadingStep", "Lru/ozon/tracker/performance/MapLoadingSteps;", "navigationType", "<init>", "(Lru/ozon/android/networkinfo/models/ConnectionType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Lru/ozon/tracker/performance/MapLoadingSteps;Ljava/lang/String;)V", "getConnectionType", "()Lru/ozon/android/networkinfo/models/ConnectionType;", "getContentType", "()Ljava/lang/String;", "getImageHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImageWidth", "getPriority", "getStatusCode", "getStatusCodeType", "getUrl", "getCacheType", "getEdgeIp", "getStateId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVideoIndex", "getMapLoadingStep", "()Lru/ozon/tracker/performance/MapLoadingSteps;", "getNavigationType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Lru/ozon/android/networkinfo/models/ConnectionType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Lru/ozon/tracker/performance/MapLoadingSteps;Ljava/lang/String;)Lru/ozon/tracker/performance/model/TraceEntity$Properties;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Properties implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Properties> CREATOR = new a();
        private final String cacheType;
        private final ConnectionType connectionType;
        private final String contentType;
        private final String edgeIp;
        private final Integer imageHeight;
        private final Integer imageWidth;
        private final Boolean isLowPowerMode;
        private final Boolean isVideoPlaceholder;
        private final MapLoadingSteps mapLoadingStep;
        private final String navigationType;
        private final Integer priority;
        private final String stateId;
        private final Integer statusCode;
        private final String statusCodeType;
        private final String url;
        private final Integer videoIndex;

        public static final class a implements Parcelable.Creator<Properties> {
            @Override // android.os.Parcelable.Creator
            public final Properties createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ConnectionType connectionType = (ConnectionType) parcel.readParcelable(Properties.class.getClassLoader());
                String readString = parcel.readString();
                Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Properties(connectionType, readString, valueOf3, valueOf4, valueOf5, valueOf6, readString2, readString3, readString4, readString5, readString6, valueOf, valueOf7, valueOf2, parcel.readInt() != 0 ? MapLoadingSteps.valueOf(parcel.readString()) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Properties[] newArray(int i11) {
                return new Properties[i11];
            }
        }

        public Properties() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
        }

        /* renamed from: component1, reason: from getter */
        public final ConnectionType getConnectionType() {
            return this.connectionType;
        }

        /* renamed from: component10, reason: from getter */
        public final String getEdgeIp() {
            return this.edgeIp;
        }

        /* renamed from: component11, reason: from getter */
        public final String getStateId() {
            return this.stateId;
        }

        /* renamed from: component12, reason: from getter */
        public final Boolean getIsLowPowerMode() {
            return this.isLowPowerMode;
        }

        /* renamed from: component13, reason: from getter */
        public final Integer getVideoIndex() {
            return this.videoIndex;
        }

        /* renamed from: component14, reason: from getter */
        public final Boolean getIsVideoPlaceholder() {
            return this.isVideoPlaceholder;
        }

        /* renamed from: component15, reason: from getter */
        public final MapLoadingSteps getMapLoadingStep() {
            return this.mapLoadingStep;
        }

        /* renamed from: component16, reason: from getter */
        public final String getNavigationType() {
            return this.navigationType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getContentType() {
            return this.contentType;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getImageHeight() {
            return this.imageHeight;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getImageWidth() {
            return this.imageWidth;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getPriority() {
            return this.priority;
        }

        /* renamed from: component6, reason: from getter */
        public final Integer getStatusCode() {
            return this.statusCode;
        }

        /* renamed from: component7, reason: from getter */
        public final String getStatusCodeType() {
            return this.statusCodeType;
        }

        /* renamed from: component8, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component9, reason: from getter */
        public final String getCacheType() {
            return this.cacheType;
        }

        @NotNull
        public final Properties copy(ConnectionType connectionType, String contentType, Integer imageHeight, Integer imageWidth, Integer priority, Integer statusCode, String statusCodeType, String url, String cacheType, String edgeIp, String stateId, Boolean isLowPowerMode, Integer videoIndex, Boolean isVideoPlaceholder, MapLoadingSteps mapLoadingStep, @i(name = "navigation_type") String navigationType) {
            return new Properties(connectionType, contentType, imageHeight, imageWidth, priority, statusCode, statusCodeType, url, cacheType, edgeIp, stateId, isLowPowerMode, videoIndex, isVideoPlaceholder, mapLoadingStep, navigationType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Properties)) {
                return false;
            }
            Properties properties = (Properties) other;
            return this.connectionType == properties.connectionType && Intrinsics.d(this.contentType, properties.contentType) && Intrinsics.d(this.imageHeight, properties.imageHeight) && Intrinsics.d(this.imageWidth, properties.imageWidth) && Intrinsics.d(this.priority, properties.priority) && Intrinsics.d(this.statusCode, properties.statusCode) && Intrinsics.d(this.statusCodeType, properties.statusCodeType) && Intrinsics.d(this.url, properties.url) && Intrinsics.d(this.cacheType, properties.cacheType) && Intrinsics.d(this.edgeIp, properties.edgeIp) && Intrinsics.d(this.stateId, properties.stateId) && Intrinsics.d(this.isLowPowerMode, properties.isLowPowerMode) && Intrinsics.d(this.videoIndex, properties.videoIndex) && Intrinsics.d(this.isVideoPlaceholder, properties.isVideoPlaceholder) && this.mapLoadingStep == properties.mapLoadingStep && Intrinsics.d(this.navigationType, properties.navigationType);
        }

        public final String getCacheType() {
            return this.cacheType;
        }

        public final ConnectionType getConnectionType() {
            return this.connectionType;
        }

        public final String getContentType() {
            return this.contentType;
        }

        public final String getEdgeIp() {
            return this.edgeIp;
        }

        public final Integer getImageHeight() {
            return this.imageHeight;
        }

        public final Integer getImageWidth() {
            return this.imageWidth;
        }

        public final MapLoadingSteps getMapLoadingStep() {
            return this.mapLoadingStep;
        }

        public final String getNavigationType() {
            return this.navigationType;
        }

        public final Integer getPriority() {
            return this.priority;
        }

        public final String getStateId() {
            return this.stateId;
        }

        public final Integer getStatusCode() {
            return this.statusCode;
        }

        public final String getStatusCodeType() {
            return this.statusCodeType;
        }

        public final String getUrl() {
            return this.url;
        }

        public final Integer getVideoIndex() {
            return this.videoIndex;
        }

        public int hashCode() {
            ConnectionType connectionType = this.connectionType;
            int hashCode = (connectionType == null ? 0 : connectionType.hashCode()) * 31;
            String str = this.contentType;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.imageHeight;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.imageWidth;
            int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.priority;
            int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.statusCode;
            int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
            String str2 = this.statusCodeType;
            int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.url;
            int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.cacheType;
            int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.edgeIp;
            int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.stateId;
            int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Boolean bool = this.isLowPowerMode;
            int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num5 = this.videoIndex;
            int hashCode13 = (hashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Boolean bool2 = this.isVideoPlaceholder;
            int hashCode14 = (hashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            MapLoadingSteps mapLoadingSteps = this.mapLoadingStep;
            int hashCode15 = (hashCode14 + (mapLoadingSteps == null ? 0 : mapLoadingSteps.hashCode())) * 31;
            String str7 = this.navigationType;
            return hashCode15 + (str7 != null ? str7.hashCode() : 0);
        }

        public final Boolean isLowPowerMode() {
            return this.isLowPowerMode;
        }

        public final Boolean isVideoPlaceholder() {
            return this.isVideoPlaceholder;
        }

        @NotNull
        public String toString() {
            ConnectionType connectionType = this.connectionType;
            String str = this.contentType;
            Integer num = this.imageHeight;
            Integer num2 = this.imageWidth;
            Integer num3 = this.priority;
            Integer num4 = this.statusCode;
            String str2 = this.statusCodeType;
            String str3 = this.url;
            String str4 = this.cacheType;
            String str5 = this.edgeIp;
            String str6 = this.stateId;
            Boolean bool = this.isLowPowerMode;
            Integer num5 = this.videoIndex;
            Boolean bool2 = this.isVideoPlaceholder;
            MapLoadingSteps mapLoadingSteps = this.mapLoadingStep;
            String str7 = this.navigationType;
            StringBuilder sb2 = new StringBuilder("Properties(connectionType=");
            sb2.append(connectionType);
            sb2.append(", contentType=");
            sb2.append(str);
            sb2.append(", imageHeight=");
            c.e(sb2, num, ", imageWidth=", num2, ", priority=");
            c.e(sb2, num3, ", statusCode=", num4, ", statusCodeType=");
            Nh.a.h(sb2, str2, ", url=", str3, ", cacheType=");
            Nh.a.h(sb2, str4, ", edgeIp=", str5, ", stateId=");
            Sh.a.d(bool, str6, ", isLowPowerMode=", ", videoIndex=", sb2);
            C2860c.f(bool2, num5, ", isVideoPlaceholder=", ", mapLoadingStep=", sb2);
            sb2.append(mapLoadingSteps);
            sb2.append(", navigationType=");
            sb2.append(str7);
            sb2.append(")");
            return sb2.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.connectionType, flags);
            dest.writeString(this.contentType);
            Integer num = this.imageHeight;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
            Integer num2 = this.imageWidth;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num2);
            }
            Integer num3 = this.priority;
            if (num3 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num3);
            }
            Integer num4 = this.statusCode;
            if (num4 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num4);
            }
            dest.writeString(this.statusCodeType);
            dest.writeString(this.url);
            dest.writeString(this.cacheType);
            dest.writeString(this.edgeIp);
            dest.writeString(this.stateId);
            Boolean bool = this.isLowPowerMode;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                D40.c.c(dest, 1, bool);
            }
            Integer num5 = this.videoIndex;
            if (num5 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num5);
            }
            Boolean bool2 = this.isVideoPlaceholder;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                D40.c.c(dest, 1, bool2);
            }
            MapLoadingSteps mapLoadingSteps = this.mapLoadingStep;
            if (mapLoadingSteps == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(mapLoadingSteps.name());
            }
            dest.writeString(this.navigationType);
        }

        public Properties(ConnectionType connectionType, String str, Integer num, Integer num2, Integer num3, Integer num4, String str2, String str3, String str4, String str5, String str6, Boolean bool, Integer num5, Boolean bool2, MapLoadingSteps mapLoadingSteps, @i(name = "navigation_type") String str7) {
            this.connectionType = connectionType;
            this.contentType = str;
            this.imageHeight = num;
            this.imageWidth = num2;
            this.priority = num3;
            this.statusCode = num4;
            this.statusCodeType = str2;
            this.url = str3;
            this.cacheType = str4;
            this.edgeIp = str5;
            this.stateId = str6;
            this.isLowPowerMode = bool;
            this.videoIndex = num5;
            this.isVideoPlaceholder = bool2;
            this.mapLoadingStep = mapLoadingSteps;
            this.navigationType = str7;
        }

        public /* synthetic */ Properties(ConnectionType connectionType, String str, Integer num, Integer num2, Integer num3, Integer num4, String str2, String str3, String str4, String str5, String str6, Boolean bool, Integer num5, Boolean bool2, MapLoadingSteps mapLoadingSteps, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : connectionType, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : num2, (i11 & 16) != 0 ? null : num3, (i11 & 32) != 0 ? null : num4, (i11 & 64) != 0 ? null : str2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str3, (i11 & 256) != 0 ? null : str4, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str5, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str6, (i11 & 2048) != 0 ? null : bool, (i11 & 4096) != 0 ? null : num5, (i11 & 8192) != 0 ? null : bool2, (i11 & 16384) != 0 ? null : mapLoadingSteps, (i11 & 32768) != 0 ? null : str7);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001f"}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity$ServerTimingData;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "duration", "", "description", "<init>", "(Ljava/lang/String;Ljava/lang/Number;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getDuration", "()Ljava/lang/Number;", "getDescription", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class ServerTimingData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ServerTimingData> CREATOR = new a();
        private final String description;
        private final Number duration;

        @NotNull
        private final String name;

        public static final class a implements Parcelable.Creator<ServerTimingData> {
            @Override // android.os.Parcelable.Creator
            public final ServerTimingData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ServerTimingData(parcel.readString(), (Number) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ServerTimingData[] newArray(int i11) {
                return new ServerTimingData[i11];
            }
        }

        public ServerTimingData(@NotNull String name, Number number, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.duration = number;
            this.description = str;
        }

        public static /* synthetic */ ServerTimingData copy$default(ServerTimingData serverTimingData, String str, Number number, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = serverTimingData.name;
            }
            if ((i11 & 2) != 0) {
                number = serverTimingData.duration;
            }
            if ((i11 & 4) != 0) {
                str2 = serverTimingData.description;
            }
            return serverTimingData.copy(str, number, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final Number getDuration() {
            return this.duration;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public final ServerTimingData copy(@NotNull String name, Number duration, String description) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new ServerTimingData(name, duration, description);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServerTimingData)) {
                return false;
            }
            ServerTimingData serverTimingData = (ServerTimingData) other;
            return Intrinsics.d(this.name, serverTimingData.name) && Intrinsics.d(this.duration, serverTimingData.duration) && Intrinsics.d(this.description, serverTimingData.description);
        }

        public final String getDescription() {
            return this.description;
        }

        public final Number getDuration() {
            return this.duration;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            Number number = this.duration;
            int hashCode2 = (hashCode + (number == null ? 0 : number.hashCode())) * 31;
            String str = this.description;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.name;
            Number number = this.duration;
            String str2 = this.description;
            StringBuilder sb2 = new StringBuilder("ServerTimingData(name=");
            sb2.append(str);
            sb2.append(", duration=");
            sb2.append(number);
            sb2.append(", description=");
            return o0.c(sb2, str2, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.name);
            dest.writeSerializable(this.duration);
            dest.writeString(this.description);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u0003J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0013\u0010\f¨\u0006&"}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity$User;", "Landroid/os/Parcelable;", "abGroup", "", "regionId", "", "clientId", "", "companyId", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)V", "getAbGroup", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRegionId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getClientId", "()Ljava/lang/String;", "getCompanyId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/tracker/performance/model/TraceEntity$User;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class User implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<User> CREATOR = new a();
        private final Integer abGroup;
        private final String clientId;
        private final Integer companyId;
        private final Long regionId;

        public static final class a implements Parcelable.Creator<User> {
            @Override // android.os.Parcelable.Creator
            public final User createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new User(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final User[] newArray(int i11) {
                return new User[i11];
            }
        }

        public User() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ User copy$default(User user, Integer num, Long l11, String str, Integer num2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = user.abGroup;
            }
            if ((i11 & 2) != 0) {
                l11 = user.regionId;
            }
            if ((i11 & 4) != 0) {
                str = user.clientId;
            }
            if ((i11 & 8) != 0) {
                num2 = user.companyId;
            }
            return user.copy(num, l11, str, num2);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getAbGroup() {
            return this.abGroup;
        }

        /* renamed from: component2, reason: from getter */
        public final Long getRegionId() {
            return this.regionId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getClientId() {
            return this.clientId;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getCompanyId() {
            return this.companyId;
        }

        @NotNull
        public final User copy(Integer abGroup, Long regionId, String clientId, @i(name = "seller_company_id") Integer companyId) {
            return new User(abGroup, regionId, clientId, companyId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof User)) {
                return false;
            }
            User user = (User) other;
            return Intrinsics.d(this.abGroup, user.abGroup) && Intrinsics.d(this.regionId, user.regionId) && Intrinsics.d(this.clientId, user.clientId) && Intrinsics.d(this.companyId, user.companyId);
        }

        public final Integer getAbGroup() {
            return this.abGroup;
        }

        public final String getClientId() {
            return this.clientId;
        }

        public final Integer getCompanyId() {
            return this.companyId;
        }

        public final Long getRegionId() {
            return this.regionId;
        }

        public int hashCode() {
            Integer num = this.abGroup;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Long l11 = this.regionId;
            int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str = this.clientId;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num2 = this.companyId;
            return hashCode3 + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "User(abGroup=" + this.abGroup + ", regionId=" + this.regionId + ", clientId=" + this.clientId + ", companyId=" + this.companyId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.abGroup;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
            Long l11 = this.regionId;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l11);
            }
            dest.writeString(this.clientId);
            Integer num2 = this.companyId;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num2);
            }
        }

        public User(Integer num, Long l11, String str, @i(name = "seller_company_id") Integer num2) {
            this.abGroup = num;
            this.regionId = l11;
            this.clientId = str;
            this.companyId = num2;
        }

        public /* synthetic */ User(Integer num, Long l11, String str, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : num2);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b;\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bë\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010:\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010=\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010B\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010&Jò\u0001\u0010E\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010FJ\u0006\u0010G\u001a\u00020\rJ\u0013\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010KHÖ\u0003J\t\u0010L\u001a\u00020\rHÖ\u0001J\t\u0010M\u001a\u00020\u0003HÖ\u0001J\u0016\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\"\u0010 R\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b#\u0010 R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b$\u0010 R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b)\u0010 R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010'\u001a\u0004\b*\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010'\u001a\u0004\b.\u0010&R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b/\u0010 R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001bR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010'\u001a\u0004\b1\u0010&¨\u0006S"}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity$Widget;", "Landroid/os/Parcelable;", "type", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "vertical", "component", "version", "", "id", "revisionId", "configId", "index", "", "sliceType", "sliceId", "sliceIndex", "originName", "originVertical", "originComponent", "originVersion", "configDtId", "dtName", "timeSpent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)V", "getType", "()Ljava/lang/String;", "getName", "getVertical", "getComponent", "getVersion", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "getRevisionId", "getConfigId", "getIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSliceType", "getSliceId", "getSliceIndex", "getOriginName", "getOriginVertical", "getOriginComponent", "getOriginVersion", "getConfigDtId", "getDtName", "getTimeSpent", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/tracker/performance/model/TraceEntity$Widget;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Widget> CREATOR = new a();
        private final String component;
        private final Long configDtId;
        private final Long configId;
        private final String dtName;
        private final Long id;
        private final Integer index;
        private final String name;
        private final String originComponent;
        private final String originName;
        private final Integer originVersion;
        private final String originVertical;
        private final Long revisionId;
        private final Long sliceId;
        private final Integer sliceIndex;
        private final String sliceType;
        private final Integer timeSpent;
        private final String type;
        private final Long version;
        private final String vertical;

        public static final class a implements Parcelable.Creator<Widget> {
            @Override // android.os.Parcelable.Creator
            public final Widget createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Widget(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Widget[] newArray(int i11) {
                return new Widget[i11];
            }
        }

        public Widget() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        }

        public static /* synthetic */ Widget copy$default(Widget widget, String str, String str2, String str3, String str4, Long l11, Long l12, Long l13, Long l14, Integer num, String str5, Long l15, Integer num2, String str6, String str7, String str8, Integer num3, Long l16, String str9, Integer num4, int i11, Object obj) {
            Integer num5;
            String str10;
            String str11 = (i11 & 1) != 0 ? widget.type : str;
            String str12 = (i11 & 2) != 0 ? widget.name : str2;
            String str13 = (i11 & 4) != 0 ? widget.vertical : str3;
            String str14 = (i11 & 8) != 0 ? widget.component : str4;
            Long l17 = (i11 & 16) != 0 ? widget.version : l11;
            Long l18 = (i11 & 32) != 0 ? widget.id : l12;
            Long l19 = (i11 & 64) != 0 ? widget.revisionId : l13;
            Long l21 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? widget.configId : l14;
            Integer num6 = (i11 & 256) != 0 ? widget.index : num;
            String str15 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? widget.sliceType : str5;
            Long l22 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? widget.sliceId : l15;
            Integer num7 = (i11 & 2048) != 0 ? widget.sliceIndex : num2;
            String str16 = (i11 & 4096) != 0 ? widget.originName : str6;
            String str17 = (i11 & 8192) != 0 ? widget.originVertical : str7;
            String str18 = str11;
            String str19 = (i11 & 16384) != 0 ? widget.originComponent : str8;
            Integer num8 = (i11 & 32768) != 0 ? widget.originVersion : num3;
            Long l23 = (i11 & 65536) != 0 ? widget.configDtId : l16;
            String str20 = (i11 & 131072) != 0 ? widget.dtName : str9;
            if ((i11 & 262144) != 0) {
                str10 = str20;
                num5 = widget.timeSpent;
            } else {
                num5 = num4;
                str10 = str20;
            }
            return widget.copy(str18, str12, str13, str14, l17, l18, l19, l21, num6, str15, l22, num7, str16, str17, str19, num8, l23, str10, num5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component10, reason: from getter */
        public final String getSliceType() {
            return this.sliceType;
        }

        /* renamed from: component11, reason: from getter */
        public final Long getSliceId() {
            return this.sliceId;
        }

        /* renamed from: component12, reason: from getter */
        public final Integer getSliceIndex() {
            return this.sliceIndex;
        }

        /* renamed from: component13, reason: from getter */
        public final String getOriginName() {
            return this.originName;
        }

        /* renamed from: component14, reason: from getter */
        public final String getOriginVertical() {
            return this.originVertical;
        }

        /* renamed from: component15, reason: from getter */
        public final String getOriginComponent() {
            return this.originComponent;
        }

        /* renamed from: component16, reason: from getter */
        public final Integer getOriginVersion() {
            return this.originVersion;
        }

        /* renamed from: component17, reason: from getter */
        public final Long getConfigDtId() {
            return this.configDtId;
        }

        /* renamed from: component18, reason: from getter */
        public final String getDtName() {
            return this.dtName;
        }

        /* renamed from: component19, reason: from getter */
        public final Integer getTimeSpent() {
            return this.timeSpent;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getVertical() {
            return this.vertical;
        }

        /* renamed from: component4, reason: from getter */
        public final String getComponent() {
            return this.component;
        }

        /* renamed from: component5, reason: from getter */
        public final Long getVersion() {
            return this.version;
        }

        /* renamed from: component6, reason: from getter */
        public final Long getId() {
            return this.id;
        }

        /* renamed from: component7, reason: from getter */
        public final Long getRevisionId() {
            return this.revisionId;
        }

        /* renamed from: component8, reason: from getter */
        public final Long getConfigId() {
            return this.configId;
        }

        /* renamed from: component9, reason: from getter */
        public final Integer getIndex() {
            return this.index;
        }

        @NotNull
        public final Widget copy(String type, String name, String vertical, String component, Long version, Long id2, Long revisionId, Long configId, Integer index, String sliceType, Long sliceId, Integer sliceIndex, String originName, String originVertical, String originComponent, Integer originVersion, @i(name = "configdtId") Long configDtId, String dtName, Integer timeSpent) {
            return new Widget(type, name, vertical, component, version, id2, revisionId, configId, index, sliceType, sliceId, sliceIndex, originName, originVertical, originComponent, originVersion, configDtId, dtName, timeSpent);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Widget)) {
                return false;
            }
            Widget widget = (Widget) other;
            return Intrinsics.d(this.type, widget.type) && Intrinsics.d(this.name, widget.name) && Intrinsics.d(this.vertical, widget.vertical) && Intrinsics.d(this.component, widget.component) && Intrinsics.d(this.version, widget.version) && Intrinsics.d(this.id, widget.id) && Intrinsics.d(this.revisionId, widget.revisionId) && Intrinsics.d(this.configId, widget.configId) && Intrinsics.d(this.index, widget.index) && Intrinsics.d(this.sliceType, widget.sliceType) && Intrinsics.d(this.sliceId, widget.sliceId) && Intrinsics.d(this.sliceIndex, widget.sliceIndex) && Intrinsics.d(this.originName, widget.originName) && Intrinsics.d(this.originVertical, widget.originVertical) && Intrinsics.d(this.originComponent, widget.originComponent) && Intrinsics.d(this.originVersion, widget.originVersion) && Intrinsics.d(this.configDtId, widget.configDtId) && Intrinsics.d(this.dtName, widget.dtName) && Intrinsics.d(this.timeSpent, widget.timeSpent);
        }

        public final String getComponent() {
            return this.component;
        }

        public final Long getConfigDtId() {
            return this.configDtId;
        }

        public final Long getConfigId() {
            return this.configId;
        }

        public final String getDtName() {
            return this.dtName;
        }

        public final Long getId() {
            return this.id;
        }

        public final Integer getIndex() {
            return this.index;
        }

        public final String getName() {
            return this.name;
        }

        public final String getOriginComponent() {
            return this.originComponent;
        }

        public final String getOriginName() {
            return this.originName;
        }

        public final Integer getOriginVersion() {
            return this.originVersion;
        }

        public final String getOriginVertical() {
            return this.originVertical;
        }

        public final Long getRevisionId() {
            return this.revisionId;
        }

        public final Long getSliceId() {
            return this.sliceId;
        }

        public final Integer getSliceIndex() {
            return this.sliceIndex;
        }

        public final String getSliceType() {
            return this.sliceType;
        }

        public final Integer getTimeSpent() {
            return this.timeSpent;
        }

        public final String getType() {
            return this.type;
        }

        public final Long getVersion() {
            return this.version;
        }

        public final String getVertical() {
            return this.vertical;
        }

        public int hashCode() {
            String str = this.type;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.vertical;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.component;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Long l11 = this.version;
            int hashCode5 = (hashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Long l12 = this.id;
            int hashCode6 = (hashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.revisionId;
            int hashCode7 = (hashCode6 + (l13 == null ? 0 : l13.hashCode())) * 31;
            Long l14 = this.configId;
            int hashCode8 = (hashCode7 + (l14 == null ? 0 : l14.hashCode())) * 31;
            Integer num = this.index;
            int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
            String str5 = this.sliceType;
            int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Long l15 = this.sliceId;
            int hashCode11 = (hashCode10 + (l15 == null ? 0 : l15.hashCode())) * 31;
            Integer num2 = this.sliceIndex;
            int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str6 = this.originName;
            int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.originVertical;
            int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.originComponent;
            int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
            Integer num3 = this.originVersion;
            int hashCode16 = (hashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Long l16 = this.configDtId;
            int hashCode17 = (hashCode16 + (l16 == null ? 0 : l16.hashCode())) * 31;
            String str9 = this.dtName;
            int hashCode18 = (hashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Integer num4 = this.timeSpent;
            return hashCode18 + (num4 != null ? num4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.type;
            String str2 = this.name;
            String str3 = this.vertical;
            String str4 = this.component;
            Long l11 = this.version;
            Long l12 = this.id;
            Long l13 = this.revisionId;
            Long l14 = this.configId;
            Integer num = this.index;
            String str5 = this.sliceType;
            Long l15 = this.sliceId;
            Integer num2 = this.sliceIndex;
            String str6 = this.originName;
            String str7 = this.originVertical;
            String str8 = this.originComponent;
            Integer num3 = this.originVersion;
            Long l16 = this.configDtId;
            String str9 = this.dtName;
            Integer num4 = this.timeSpent;
            StringBuilder d11 = C3660k.d("Widget(type=", str, ", name=", str2, ", vertical=");
            Nh.a.h(d11, str3, ", component=", str4, ", version=");
            TY.a.e(d11, l11, ", id=", l12, ", revisionId=");
            TY.a.e(d11, l13, ", configId=", l14, ", index=");
            V.f(num, ", sliceType=", str5, ", sliceId=", d11);
            d11.append(l15);
            d11.append(", sliceIndex=");
            d11.append(num2);
            d11.append(", originName=");
            Nh.a.h(d11, str6, ", originVertical=", str7, ", originComponent=");
            C2454a.f(num3, str8, ", originVersion=", ", configDtId=", d11);
            d11.append(l16);
            d11.append(", dtName=");
            d11.append(str9);
            d11.append(", timeSpent=");
            return Ep.a.c(d11, num4, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.type);
            dest.writeString(this.name);
            dest.writeString(this.vertical);
            dest.writeString(this.component);
            Long l11 = this.version;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l11);
            }
            Long l12 = this.id;
            if (l12 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l12);
            }
            Long l13 = this.revisionId;
            if (l13 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l13);
            }
            Long l14 = this.configId;
            if (l14 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l14);
            }
            Integer num = this.index;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
            dest.writeString(this.sliceType);
            Long l15 = this.sliceId;
            if (l15 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l15);
            }
            Integer num2 = this.sliceIndex;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num2);
            }
            dest.writeString(this.originName);
            dest.writeString(this.originVertical);
            dest.writeString(this.originComponent);
            Integer num3 = this.originVersion;
            if (num3 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num3);
            }
            Long l16 = this.configDtId;
            if (l16 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l16);
            }
            dest.writeString(this.dtName);
            Integer num4 = this.timeSpent;
            if (num4 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num4);
            }
        }

        public Widget(String str, String str2, String str3, String str4, Long l11, Long l12, Long l13, Long l14, Integer num, String str5, Long l15, Integer num2, String str6, String str7, String str8, Integer num3, @i(name = "configdtId") Long l16, String str9, Integer num4) {
            this.type = str;
            this.name = str2;
            this.vertical = str3;
            this.component = str4;
            this.version = l11;
            this.id = l12;
            this.revisionId = l13;
            this.configId = l14;
            this.index = num;
            this.sliceType = str5;
            this.sliceId = l15;
            this.sliceIndex = num2;
            this.originName = str6;
            this.originVertical = str7;
            this.originComponent = str8;
            this.originVersion = num3;
            this.configDtId = l16;
            this.dtName = str9;
            this.timeSpent = num4;
        }

        public /* synthetic */ Widget(String str, String str2, String str3, String str4, Long l11, Long l12, Long l13, Long l14, Integer num, String str5, Long l15, Integer num2, String str6, String str7, String str8, Integer num3, Long l16, String str9, Integer num4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : l11, (i11 & 32) != 0 ? null : l12, (i11 & 64) != 0 ? null : l13, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : l14, (i11 & 256) != 0 ? null : num, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str5, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : l15, (i11 & 2048) != 0 ? null : num2, (i11 & 4096) != 0 ? null : str6, (i11 & 8192) != 0 ? null : str7, (i11 & 16384) != 0 ? null : str8, (i11 & 32768) != 0 ? null : num3, (i11 & 65536) != 0 ? null : l16, (i11 & 131072) != 0 ? null : str9, (i11 & 262144) != 0 ? null : num4);
        }
    }

    public TraceEntity(String str, String str2, @NotNull DateTime timestamp, String str3, Attributes attributes, User user, Page page, Obj obj, Properties properties, Widget widget, MapSdk mapSdk, List<Metric> list, List<CustomMetric> list2, VideoMetric videoMetric, List<ServerTimingData> list3, PclPage pclPage) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        this.uuid = str;
        this.requestId = str2;
        this.timestamp = timestamp;
        this.testingToolName = str3;
        this.attributes = attributes;
        this.user = user;
        this.page = page;
        this.object = obj;
        this.properties = properties;
        this.widget = widget;
        this.map = mapSdk;
        this.metrics = list;
        this.customMetrics = list2;
        this.video = videoMetric;
        this.serverTimings = list3;
        this.pclpage = pclPage;
    }

    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component10, reason: from getter */
    public final Widget getWidget() {
        return this.widget;
    }

    /* renamed from: component11, reason: from getter */
    public final MapSdk getMap() {
        return this.map;
    }

    public final List<Metric> component12() {
        return this.metrics;
    }

    public final List<CustomMetric> component13() {
        return this.customMetrics;
    }

    /* renamed from: component14, reason: from getter */
    public final VideoMetric getVideo() {
        return this.video;
    }

    public final List<ServerTimingData> component15() {
        return this.serverTimings;
    }

    /* renamed from: component16, reason: from getter */
    public final PclPage getPclpage() {
        return this.pclpage;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final DateTime getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTestingToolName() {
        return this.testingToolName;
    }

    /* renamed from: component5, reason: from getter */
    public final Attributes getAttributes() {
        return this.attributes;
    }

    /* renamed from: component6, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* renamed from: component7, reason: from getter */
    public final Page getPage() {
        return this.page;
    }

    /* renamed from: component8, reason: from getter */
    public final Obj getObject() {
        return this.object;
    }

    /* renamed from: component9, reason: from getter */
    public final Properties getProperties() {
        return this.properties;
    }

    @NotNull
    public final TraceEntity copy(String uuid, String requestId, @NotNull DateTime timestamp, String testingToolName, Attributes attributes, User user, Page page, Obj object, Properties properties, Widget widget, MapSdk map, List<Metric> metrics, List<CustomMetric> customMetrics, VideoMetric video, List<ServerTimingData> serverTimings, PclPage pclpage) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        return new TraceEntity(uuid, requestId, timestamp, testingToolName, attributes, user, page, object, properties, widget, map, metrics, customMetrics, video, serverTimings, pclpage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraceEntity)) {
            return false;
        }
        TraceEntity traceEntity = (TraceEntity) other;
        return Intrinsics.d(this.uuid, traceEntity.uuid) && Intrinsics.d(this.requestId, traceEntity.requestId) && Intrinsics.d(this.timestamp, traceEntity.timestamp) && Intrinsics.d(this.testingToolName, traceEntity.testingToolName) && Intrinsics.d(this.attributes, traceEntity.attributes) && Intrinsics.d(this.user, traceEntity.user) && Intrinsics.d(this.page, traceEntity.page) && Intrinsics.d(this.object, traceEntity.object) && Intrinsics.d(this.properties, traceEntity.properties) && Intrinsics.d(this.widget, traceEntity.widget) && Intrinsics.d(this.map, traceEntity.map) && Intrinsics.d(this.metrics, traceEntity.metrics) && Intrinsics.d(this.customMetrics, traceEntity.customMetrics) && Intrinsics.d(this.video, traceEntity.video) && Intrinsics.d(this.serverTimings, traceEntity.serverTimings) && Intrinsics.d(this.pclpage, traceEntity.pclpage);
    }

    public final Attributes getAttributes() {
        return this.attributes;
    }

    public final List<CustomMetric> getCustomMetrics() {
        return this.customMetrics;
    }

    public final MapSdk getMap() {
        return this.map;
    }

    public final List<Metric> getMetrics() {
        return this.metrics;
    }

    public final Obj getObject() {
        return this.object;
    }

    public final Page getPage() {
        return this.page;
    }

    public final PclPage getPclpage() {
        return this.pclpage;
    }

    public final Properties getProperties() {
        return this.properties;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final List<ServerTimingData> getServerTimings() {
        return this.serverTimings;
    }

    public final String getTestingToolName() {
        return this.testingToolName;
    }

    @NotNull
    public final DateTime getTimestamp() {
        return this.timestamp;
    }

    public final User getUser() {
        return this.user;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final VideoMetric getVideo() {
        return this.video;
    }

    public final Widget getWidget() {
        return this.widget;
    }

    public int hashCode() {
        String str = this.uuid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.requestId;
        int a11 = b.a(this.timestamp, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.testingToolName;
        int hashCode2 = (a11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Attributes attributes = this.attributes;
        int hashCode3 = (hashCode2 + (attributes == null ? 0 : attributes.hashCode())) * 31;
        User user = this.user;
        int hashCode4 = (hashCode3 + (user == null ? 0 : user.hashCode())) * 31;
        Page page = this.page;
        int hashCode5 = (hashCode4 + (page == null ? 0 : page.hashCode())) * 31;
        Obj obj = this.object;
        int hashCode6 = (hashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
        Properties properties = this.properties;
        int hashCode7 = (hashCode6 + (properties == null ? 0 : properties.hashCode())) * 31;
        Widget widget = this.widget;
        int hashCode8 = (hashCode7 + (widget == null ? 0 : widget.hashCode())) * 31;
        MapSdk mapSdk = this.map;
        int hashCode9 = (hashCode8 + (mapSdk == null ? 0 : mapSdk.hashCode())) * 31;
        List<Metric> list = this.metrics;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<CustomMetric> list2 = this.customMetrics;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        VideoMetric videoMetric = this.video;
        int hashCode12 = (hashCode11 + (videoMetric == null ? 0 : videoMetric.hashCode())) * 31;
        List<ServerTimingData> list3 = this.serverTimings;
        int hashCode13 = (hashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31;
        PclPage pclPage = this.pclpage;
        return hashCode13 + (pclPage != null ? pclPage.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.uuid;
        String str2 = this.requestId;
        DateTime dateTime = this.timestamp;
        String str3 = this.testingToolName;
        Attributes attributes = this.attributes;
        User user = this.user;
        Page page = this.page;
        Obj obj = this.object;
        Properties properties = this.properties;
        Widget widget = this.widget;
        MapSdk mapSdk = this.map;
        List<Metric> list = this.metrics;
        List<CustomMetric> list2 = this.customMetrics;
        VideoMetric videoMetric = this.video;
        List<ServerTimingData> list3 = this.serverTimings;
        PclPage pclPage = this.pclpage;
        StringBuilder d11 = C3660k.d("TraceEntity(uuid=", str, ", requestId=", str2, ", timestamp=");
        d11.append(dateTime);
        d11.append(", testingToolName=");
        d11.append(str3);
        d11.append(", attributes=");
        d11.append(attributes);
        d11.append(", user=");
        d11.append(user);
        d11.append(", page=");
        d11.append(page);
        d11.append(", object=");
        d11.append(obj);
        d11.append(", properties=");
        d11.append(properties);
        d11.append(", widget=");
        d11.append(widget);
        d11.append(", map=");
        d11.append(mapSdk);
        d11.append(", metrics=");
        d11.append(list);
        d11.append(", customMetrics=");
        d11.append(list2);
        d11.append(", video=");
        d11.append(videoMetric);
        d11.append(", serverTimings=");
        d11.append(list3);
        d11.append(", pclpage=");
        d11.append(pclPage);
        d11.append(")");
        return d11.toString();
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001NBÇ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00106\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0017\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\u0011\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003JÚ\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010AJ\u0006\u0010B\u001a\u00020\u0003J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020\u0003HÖ\u0001J\t\u0010H\u001a\u00020\nHÖ\u0001J\u0016\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010 \u001a\u0004\b!\u0010\u001fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\"\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010 \u001a\u0004\b&\u0010\u001fR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b'\u0010\u001bR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010 \u001a\u0004\b(\u0010\u001fR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b)\u0010\u001bR\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/¨\u0006O"}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric;", "Landroid/os/Parcelable;", "index", "", "stallCount", "stallDuration", "", "startupTime", "viewTime", "productType", "", "videoRequestId", "playerLoadTime", "seekCount", "duration", "effectiveStartupTime", "errorCount", "", "errorDetails", "Lru/ozon/tracker/performance/model/TraceEntity$ErrorDetails;", "manifests", "", "Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile;", "files", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/util/Map;Lru/ozon/tracker/performance/model/TraceEntity$ErrorDetails;Ljava/util/List;Ljava/util/List;)V", "getIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStallCount", "getStallDuration", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getStartupTime", "getViewTime", "getProductType", "()Ljava/lang/String;", "getVideoRequestId", "getPlayerLoadTime", "getSeekCount", "getDuration", "getEffectiveStartupTime", "getErrorCount", "()Ljava/util/Map;", "getErrorDetails", "()Lru/ozon/tracker/performance/model/TraceEntity$ErrorDetails;", "getManifests", "()Ljava/util/List;", "getFiles", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/util/Map;Lru/ozon/tracker/performance/model/TraceEntity$ErrorDetails;Ljava/util/List;Ljava/util/List;)Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "VideoFile", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    /* loaded from: classes3.dex */
    public static final /* data */ class VideoMetric implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<VideoMetric> CREATOR = new a();
        private final Double duration;
        private final Integer effectiveStartupTime;
        private final Map<String, Integer> errorCount;
        private final ErrorDetails errorDetails;
        private final List<VideoFile> files;
        private final Integer index;
        private final List<VideoFile> manifests;
        private final Double playerLoadTime;
        private final String productType;
        private final Integer seekCount;
        private final Integer stallCount;
        private final Double stallDuration;
        private final Double startupTime;
        private final String videoRequestId;
        private final Double viewTime;

        public static final class a implements Parcelable.Creator<VideoMetric> {
            @Override // android.os.Parcelable.Creator
            public final VideoMetric createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                ArrayList arrayList;
                ErrorDetails errorDetails;
                ArrayList arrayList2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Double valueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
                Double valueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
                Double valueOf5 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Double valueOf6 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
                Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Double valueOf8 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
                Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        linkedHashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                        i11++;
                        readInt = readInt;
                    }
                }
                ErrorDetails createFromParcel = parcel.readInt() == 0 ? null : ErrorDetails.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    errorDetails = createFromParcel;
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList = new ArrayList(readInt2);
                    errorDetails = createFromParcel;
                    int i12 = 0;
                    while (i12 != readInt2) {
                        i12 = Ak.b.b(VideoFile.CREATOR, parcel, arrayList, i12, 1);
                        readInt2 = readInt2;
                        valueOf = valueOf;
                    }
                }
                Integer num = valueOf;
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt3 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt3);
                    int i13 = 0;
                    while (i13 != readInt3) {
                        i13 = Ak.b.b(VideoFile.CREATOR, parcel, arrayList2, i13, 1);
                        readInt3 = readInt3;
                        arrayList = arrayList;
                    }
                }
                return new VideoMetric(num, valueOf2, valueOf3, valueOf4, valueOf5, readString, readString2, valueOf6, valueOf7, valueOf8, valueOf9, linkedHashMap, errorDetails, arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final VideoMetric[] newArray(int i11) {
                return new VideoMetric[i11];
            }
        }

        public VideoMetric(Integer num, Integer num2, Double d11, Double d12, Double d13, String str, String str2, Double d14, Integer num3, Double d15, Integer num4, Map<String, Integer> map, ErrorDetails errorDetails, List<VideoFile> list, List<VideoFile> list2) {
            this.index = num;
            this.stallCount = num2;
            this.stallDuration = d11;
            this.startupTime = d12;
            this.viewTime = d13;
            this.productType = str;
            this.videoRequestId = str2;
            this.playerLoadTime = d14;
            this.seekCount = num3;
            this.duration = d15;
            this.effectiveStartupTime = num4;
            this.errorCount = map;
            this.errorDetails = errorDetails;
            this.manifests = list;
            this.files = list2;
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getIndex() {
            return this.index;
        }

        /* renamed from: component10, reason: from getter */
        public final Double getDuration() {
            return this.duration;
        }

        /* renamed from: component11, reason: from getter */
        public final Integer getEffectiveStartupTime() {
            return this.effectiveStartupTime;
        }

        public final Map<String, Integer> component12() {
            return this.errorCount;
        }

        /* renamed from: component13, reason: from getter */
        public final ErrorDetails getErrorDetails() {
            return this.errorDetails;
        }

        public final List<VideoFile> component14() {
            return this.manifests;
        }

        public final List<VideoFile> component15() {
            return this.files;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getStallCount() {
            return this.stallCount;
        }

        /* renamed from: component3, reason: from getter */
        public final Double getStallDuration() {
            return this.stallDuration;
        }

        /* renamed from: component4, reason: from getter */
        public final Double getStartupTime() {
            return this.startupTime;
        }

        /* renamed from: component5, reason: from getter */
        public final Double getViewTime() {
            return this.viewTime;
        }

        /* renamed from: component6, reason: from getter */
        public final String getProductType() {
            return this.productType;
        }

        /* renamed from: component7, reason: from getter */
        public final String getVideoRequestId() {
            return this.videoRequestId;
        }

        /* renamed from: component8, reason: from getter */
        public final Double getPlayerLoadTime() {
            return this.playerLoadTime;
        }

        /* renamed from: component9, reason: from getter */
        public final Integer getSeekCount() {
            return this.seekCount;
        }

        @NotNull
        public final VideoMetric copy(Integer index, Integer stallCount, Double stallDuration, Double startupTime, Double viewTime, String productType, String videoRequestId, Double playerLoadTime, Integer seekCount, Double duration, Integer effectiveStartupTime, Map<String, Integer> errorCount, ErrorDetails errorDetails, List<VideoFile> manifests, List<VideoFile> files) {
            return new VideoMetric(index, stallCount, stallDuration, startupTime, viewTime, productType, videoRequestId, playerLoadTime, seekCount, duration, effectiveStartupTime, errorCount, errorDetails, manifests, files);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoMetric)) {
                return false;
            }
            VideoMetric videoMetric = (VideoMetric) other;
            return Intrinsics.d(this.index, videoMetric.index) && Intrinsics.d(this.stallCount, videoMetric.stallCount) && Intrinsics.d(this.stallDuration, videoMetric.stallDuration) && Intrinsics.d(this.startupTime, videoMetric.startupTime) && Intrinsics.d(this.viewTime, videoMetric.viewTime) && Intrinsics.d(this.productType, videoMetric.productType) && Intrinsics.d(this.videoRequestId, videoMetric.videoRequestId) && Intrinsics.d(this.playerLoadTime, videoMetric.playerLoadTime) && Intrinsics.d(this.seekCount, videoMetric.seekCount) && Intrinsics.d(this.duration, videoMetric.duration) && Intrinsics.d(this.effectiveStartupTime, videoMetric.effectiveStartupTime) && Intrinsics.d(this.errorCount, videoMetric.errorCount) && Intrinsics.d(this.errorDetails, videoMetric.errorDetails) && Intrinsics.d(this.manifests, videoMetric.manifests) && Intrinsics.d(this.files, videoMetric.files);
        }

        public final Double getDuration() {
            return this.duration;
        }

        public final Integer getEffectiveStartupTime() {
            return this.effectiveStartupTime;
        }

        public final Map<String, Integer> getErrorCount() {
            return this.errorCount;
        }

        public final ErrorDetails getErrorDetails() {
            return this.errorDetails;
        }

        public final List<VideoFile> getFiles() {
            return this.files;
        }

        public final Integer getIndex() {
            return this.index;
        }

        public final List<VideoFile> getManifests() {
            return this.manifests;
        }

        public final Double getPlayerLoadTime() {
            return this.playerLoadTime;
        }

        public final String getProductType() {
            return this.productType;
        }

        public final Integer getSeekCount() {
            return this.seekCount;
        }

        public final Integer getStallCount() {
            return this.stallCount;
        }

        public final Double getStallDuration() {
            return this.stallDuration;
        }

        public final Double getStartupTime() {
            return this.startupTime;
        }

        public final String getVideoRequestId() {
            return this.videoRequestId;
        }

        public final Double getViewTime() {
            return this.viewTime;
        }

        public int hashCode() {
            Integer num = this.index;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.stallCount;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Double d11 = this.stallDuration;
            int hashCode3 = (hashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
            Double d12 = this.startupTime;
            int hashCode4 = (hashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
            Double d13 = this.viewTime;
            int hashCode5 = (hashCode4 + (d13 == null ? 0 : d13.hashCode())) * 31;
            String str = this.productType;
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.videoRequestId;
            int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Double d14 = this.playerLoadTime;
            int hashCode8 = (hashCode7 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Integer num3 = this.seekCount;
            int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Double d15 = this.duration;
            int hashCode10 = (hashCode9 + (d15 == null ? 0 : d15.hashCode())) * 31;
            Integer num4 = this.effectiveStartupTime;
            int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Map<String, Integer> map = this.errorCount;
            int hashCode12 = (hashCode11 + (map == null ? 0 : map.hashCode())) * 31;
            ErrorDetails errorDetails = this.errorDetails;
            int hashCode13 = (hashCode12 + (errorDetails == null ? 0 : errorDetails.hashCode())) * 31;
            List<VideoFile> list = this.manifests;
            int hashCode14 = (hashCode13 + (list == null ? 0 : list.hashCode())) * 31;
            List<VideoFile> list2 = this.files;
            return hashCode14 + (list2 != null ? list2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Integer num = this.index;
            Integer num2 = this.stallCount;
            Double d11 = this.stallDuration;
            Double d12 = this.startupTime;
            Double d13 = this.viewTime;
            String str = this.productType;
            String str2 = this.videoRequestId;
            Double d14 = this.playerLoadTime;
            Integer num3 = this.seekCount;
            Double d15 = this.duration;
            Integer num4 = this.effectiveStartupTime;
            Map<String, Integer> map = this.errorCount;
            ErrorDetails errorDetails = this.errorDetails;
            List<VideoFile> list = this.manifests;
            List<VideoFile> list2 = this.files;
            StringBuilder f7 = Kk.c.f("VideoMetric(index=", ", stallCount=", num, num2, ", stallDuration=");
            f7.append(d11);
            f7.append(", startupTime=");
            f7.append(d12);
            f7.append(", viewTime=");
            f7.append(d13);
            f7.append(", productType=");
            f7.append(str);
            f7.append(", videoRequestId=");
            f7.append(str2);
            f7.append(", playerLoadTime=");
            f7.append(d14);
            f7.append(", seekCount=");
            f7.append(num3);
            f7.append(", duration=");
            f7.append(d15);
            f7.append(", effectiveStartupTime=");
            f7.append(num4);
            f7.append(", errorCount=");
            f7.append(map);
            f7.append(", errorDetails=");
            f7.append(errorDetails);
            f7.append(", manifests=");
            f7.append(list);
            f7.append(", files=");
            return C2618u.h(f7, list2, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.index;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
            Integer num2 = this.stallCount;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num2);
            }
            Double d11 = this.stallDuration;
            if (d11 == null) {
                dest.writeInt(0);
            } else {
                TY.a.d(dest, 1, d11);
            }
            Double d12 = this.startupTime;
            if (d12 == null) {
                dest.writeInt(0);
            } else {
                TY.a.d(dest, 1, d12);
            }
            Double d13 = this.viewTime;
            if (d13 == null) {
                dest.writeInt(0);
            } else {
                TY.a.d(dest, 1, d13);
            }
            dest.writeString(this.productType);
            dest.writeString(this.videoRequestId);
            Double d14 = this.playerLoadTime;
            if (d14 == null) {
                dest.writeInt(0);
            } else {
                TY.a.d(dest, 1, d14);
            }
            Integer num3 = this.seekCount;
            if (num3 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num3);
            }
            Double d15 = this.duration;
            if (d15 == null) {
                dest.writeInt(0);
            } else {
                TY.a.d(dest, 1, d15);
            }
            Integer num4 = this.effectiveStartupTime;
            if (num4 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num4);
            }
            Map<String, Integer> map = this.errorCount;
            if (map == null) {
                dest.writeInt(0);
            } else {
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeInt(((Number) entry.getValue()).intValue());
                }
            }
            ErrorDetails errorDetails = this.errorDetails;
            if (errorDetails == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                errorDetails.writeToParcel(dest, flags);
            }
            List<VideoFile> list = this.manifests;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator c11 = J.c(dest, 1, list);
                while (c11.hasNext()) {
                    ((VideoFile) c11.next()).writeToParcel(dest, flags);
                }
            }
            List<VideoFile> list2 = this.files;
            if (list2 == null) {
                dest.writeInt(0);
                return;
            }
            Iterator c12 = J.c(dest, 1, list2);
            while (c12.hasNext()) {
                ((VideoFile) c12.next()).writeToParcel(dest, flags);
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002!\"B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile;", "Landroid/os/Parcelable;", ImagesContract.URL, "", "appMetrics", "Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$AppMetrics;", "playerMetrics", "Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$PlayerMetrics;", "<init>", "(Ljava/lang/String;Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$AppMetrics;Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$PlayerMetrics;)V", "getUrl", "()Ljava/lang/String;", "getAppMetrics", "()Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$AppMetrics;", "getPlayerMetrics", "()Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$PlayerMetrics;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AppMetrics", "PlayerMetrics", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class VideoFile implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<VideoFile> CREATOR = new a();
            private final AppMetrics appMetrics;
            private final PlayerMetrics playerMetrics;

            @NotNull
            private final String url;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b*\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u009e\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010,J\u0006\u0010-\u001a\u00020.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020.HÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001J\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020.R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0017\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0018\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0019\u0010\u0012R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001a\u0010\u0012R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001b\u0010\u0012R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001c\u0010\u0012R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001d\u0010\u0012R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001e\u0010\u0012¨\u0006;"}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$AppMetrics;", "Landroid/os/Parcelable;", "dnsTime", "", "tcpTime", "tlsTime", "requestTime", "serverTime", "responseTime", "protocolVersion", "timeToFirstByte", "timeToLastByte", "encodedSize", "decodedSize", "transferSize", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getDnsTime", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTcpTime", "getTlsTime", "getRequestTime", "getServerTime", "getResponseTime", "getProtocolVersion", "getTimeToFirstByte", "getTimeToLastByte", "getEncodedSize", "getDecodedSize", "getTransferSize", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$AppMetrics;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class AppMetrics implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<AppMetrics> CREATOR = new a();
                private final Double decodedSize;
                private final Double dnsTime;
                private final Double encodedSize;
                private final Double protocolVersion;
                private final Double requestTime;
                private final Double responseTime;
                private final Double serverTime;
                private final Double tcpTime;
                private final Double timeToFirstByte;
                private final Double timeToLastByte;
                private final Double tlsTime;
                private final Double transferSize;

                public static final class a implements Parcelable.Creator<AppMetrics> {
                    @Override // android.os.Parcelable.Creator
                    public final AppMetrics createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new AppMetrics(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final AppMetrics[] newArray(int i11) {
                        return new AppMetrics[i11];
                    }
                }

                public AppMetrics() {
                    this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
                }

                public static /* synthetic */ AppMetrics copy$default(AppMetrics appMetrics, Double d11, Double d12, Double d13, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d21, Double d22, Double d23, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        d11 = appMetrics.dnsTime;
                    }
                    if ((i11 & 2) != 0) {
                        d12 = appMetrics.tcpTime;
                    }
                    if ((i11 & 4) != 0) {
                        d13 = appMetrics.tlsTime;
                    }
                    if ((i11 & 8) != 0) {
                        d14 = appMetrics.requestTime;
                    }
                    if ((i11 & 16) != 0) {
                        d15 = appMetrics.serverTime;
                    }
                    if ((i11 & 32) != 0) {
                        d16 = appMetrics.responseTime;
                    }
                    if ((i11 & 64) != 0) {
                        d17 = appMetrics.protocolVersion;
                    }
                    if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                        d18 = appMetrics.timeToFirstByte;
                    }
                    if ((i11 & 256) != 0) {
                        d19 = appMetrics.timeToLastByte;
                    }
                    if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                        d21 = appMetrics.encodedSize;
                    }
                    if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                        d22 = appMetrics.decodedSize;
                    }
                    if ((i11 & 2048) != 0) {
                        d23 = appMetrics.transferSize;
                    }
                    Double d24 = d22;
                    Double d25 = d23;
                    Double d26 = d19;
                    Double d27 = d21;
                    Double d28 = d17;
                    Double d29 = d18;
                    Double d31 = d15;
                    Double d32 = d16;
                    return appMetrics.copy(d11, d12, d13, d14, d31, d32, d28, d29, d26, d27, d24, d25);
                }

                /* renamed from: component1, reason: from getter */
                public final Double getDnsTime() {
                    return this.dnsTime;
                }

                /* renamed from: component10, reason: from getter */
                public final Double getEncodedSize() {
                    return this.encodedSize;
                }

                /* renamed from: component11, reason: from getter */
                public final Double getDecodedSize() {
                    return this.decodedSize;
                }

                /* renamed from: component12, reason: from getter */
                public final Double getTransferSize() {
                    return this.transferSize;
                }

                /* renamed from: component2, reason: from getter */
                public final Double getTcpTime() {
                    return this.tcpTime;
                }

                /* renamed from: component3, reason: from getter */
                public final Double getTlsTime() {
                    return this.tlsTime;
                }

                /* renamed from: component4, reason: from getter */
                public final Double getRequestTime() {
                    return this.requestTime;
                }

                /* renamed from: component5, reason: from getter */
                public final Double getServerTime() {
                    return this.serverTime;
                }

                /* renamed from: component6, reason: from getter */
                public final Double getResponseTime() {
                    return this.responseTime;
                }

                /* renamed from: component7, reason: from getter */
                public final Double getProtocolVersion() {
                    return this.protocolVersion;
                }

                /* renamed from: component8, reason: from getter */
                public final Double getTimeToFirstByte() {
                    return this.timeToFirstByte;
                }

                /* renamed from: component9, reason: from getter */
                public final Double getTimeToLastByte() {
                    return this.timeToLastByte;
                }

                @NotNull
                public final AppMetrics copy(Double dnsTime, Double tcpTime, Double tlsTime, Double requestTime, Double serverTime, Double responseTime, Double protocolVersion, Double timeToFirstByte, Double timeToLastByte, Double encodedSize, Double decodedSize, Double transferSize) {
                    return new AppMetrics(dnsTime, tcpTime, tlsTime, requestTime, serverTime, responseTime, protocolVersion, timeToFirstByte, timeToLastByte, encodedSize, decodedSize, transferSize);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof AppMetrics)) {
                        return false;
                    }
                    AppMetrics appMetrics = (AppMetrics) other;
                    return Intrinsics.d(this.dnsTime, appMetrics.dnsTime) && Intrinsics.d(this.tcpTime, appMetrics.tcpTime) && Intrinsics.d(this.tlsTime, appMetrics.tlsTime) && Intrinsics.d(this.requestTime, appMetrics.requestTime) && Intrinsics.d(this.serverTime, appMetrics.serverTime) && Intrinsics.d(this.responseTime, appMetrics.responseTime) && Intrinsics.d(this.protocolVersion, appMetrics.protocolVersion) && Intrinsics.d(this.timeToFirstByte, appMetrics.timeToFirstByte) && Intrinsics.d(this.timeToLastByte, appMetrics.timeToLastByte) && Intrinsics.d(this.encodedSize, appMetrics.encodedSize) && Intrinsics.d(this.decodedSize, appMetrics.decodedSize) && Intrinsics.d(this.transferSize, appMetrics.transferSize);
                }

                public final Double getDecodedSize() {
                    return this.decodedSize;
                }

                public final Double getDnsTime() {
                    return this.dnsTime;
                }

                public final Double getEncodedSize() {
                    return this.encodedSize;
                }

                public final Double getProtocolVersion() {
                    return this.protocolVersion;
                }

                public final Double getRequestTime() {
                    return this.requestTime;
                }

                public final Double getResponseTime() {
                    return this.responseTime;
                }

                public final Double getServerTime() {
                    return this.serverTime;
                }

                public final Double getTcpTime() {
                    return this.tcpTime;
                }

                public final Double getTimeToFirstByte() {
                    return this.timeToFirstByte;
                }

                public final Double getTimeToLastByte() {
                    return this.timeToLastByte;
                }

                public final Double getTlsTime() {
                    return this.tlsTime;
                }

                public final Double getTransferSize() {
                    return this.transferSize;
                }

                public int hashCode() {
                    Double d11 = this.dnsTime;
                    int hashCode = (d11 == null ? 0 : d11.hashCode()) * 31;
                    Double d12 = this.tcpTime;
                    int hashCode2 = (hashCode + (d12 == null ? 0 : d12.hashCode())) * 31;
                    Double d13 = this.tlsTime;
                    int hashCode3 = (hashCode2 + (d13 == null ? 0 : d13.hashCode())) * 31;
                    Double d14 = this.requestTime;
                    int hashCode4 = (hashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
                    Double d15 = this.serverTime;
                    int hashCode5 = (hashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31;
                    Double d16 = this.responseTime;
                    int hashCode6 = (hashCode5 + (d16 == null ? 0 : d16.hashCode())) * 31;
                    Double d17 = this.protocolVersion;
                    int hashCode7 = (hashCode6 + (d17 == null ? 0 : d17.hashCode())) * 31;
                    Double d18 = this.timeToFirstByte;
                    int hashCode8 = (hashCode7 + (d18 == null ? 0 : d18.hashCode())) * 31;
                    Double d19 = this.timeToLastByte;
                    int hashCode9 = (hashCode8 + (d19 == null ? 0 : d19.hashCode())) * 31;
                    Double d21 = this.encodedSize;
                    int hashCode10 = (hashCode9 + (d21 == null ? 0 : d21.hashCode())) * 31;
                    Double d22 = this.decodedSize;
                    int hashCode11 = (hashCode10 + (d22 == null ? 0 : d22.hashCode())) * 31;
                    Double d23 = this.transferSize;
                    return hashCode11 + (d23 != null ? d23.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "AppMetrics(dnsTime=" + this.dnsTime + ", tcpTime=" + this.tcpTime + ", tlsTime=" + this.tlsTime + ", requestTime=" + this.requestTime + ", serverTime=" + this.serverTime + ", responseTime=" + this.responseTime + ", protocolVersion=" + this.protocolVersion + ", timeToFirstByte=" + this.timeToFirstByte + ", timeToLastByte=" + this.timeToLastByte + ", encodedSize=" + this.encodedSize + ", decodedSize=" + this.decodedSize + ", transferSize=" + this.transferSize + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    Double d11 = this.dnsTime;
                    if (d11 == null) {
                        dest.writeInt(0);
                    } else {
                        TY.a.d(dest, 1, d11);
                    }
                    Double d12 = this.tcpTime;
                    if (d12 == null) {
                        dest.writeInt(0);
                    } else {
                        TY.a.d(dest, 1, d12);
                    }
                    Double d13 = this.tlsTime;
                    if (d13 == null) {
                        dest.writeInt(0);
                    } else {
                        TY.a.d(dest, 1, d13);
                    }
                    Double d14 = this.requestTime;
                    if (d14 == null) {
                        dest.writeInt(0);
                    } else {
                        TY.a.d(dest, 1, d14);
                    }
                    Double d15 = this.serverTime;
                    if (d15 == null) {
                        dest.writeInt(0);
                    } else {
                        TY.a.d(dest, 1, d15);
                    }
                    Double d16 = this.responseTime;
                    if (d16 == null) {
                        dest.writeInt(0);
                    } else {
                        TY.a.d(dest, 1, d16);
                    }
                    Double d17 = this.protocolVersion;
                    if (d17 == null) {
                        dest.writeInt(0);
                    } else {
                        TY.a.d(dest, 1, d17);
                    }
                    Double d18 = this.timeToFirstByte;
                    if (d18 == null) {
                        dest.writeInt(0);
                    } else {
                        TY.a.d(dest, 1, d18);
                    }
                    Double d19 = this.timeToLastByte;
                    if (d19 == null) {
                        dest.writeInt(0);
                    } else {
                        TY.a.d(dest, 1, d19);
                    }
                    Double d21 = this.encodedSize;
                    if (d21 == null) {
                        dest.writeInt(0);
                    } else {
                        TY.a.d(dest, 1, d21);
                    }
                    Double d22 = this.decodedSize;
                    if (d22 == null) {
                        dest.writeInt(0);
                    } else {
                        TY.a.d(dest, 1, d22);
                    }
                    Double d23 = this.transferSize;
                    if (d23 == null) {
                        dest.writeInt(0);
                    } else {
                        TY.a.d(dest, 1, d23);
                    }
                }

                public AppMetrics(Double d11, Double d12, Double d13, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d21, Double d22, Double d23) {
                    this.dnsTime = d11;
                    this.tcpTime = d12;
                    this.tlsTime = d13;
                    this.requestTime = d14;
                    this.serverTime = d15;
                    this.responseTime = d16;
                    this.protocolVersion = d17;
                    this.timeToFirstByte = d18;
                    this.timeToLastByte = d19;
                    this.encodedSize = d21;
                    this.decodedSize = d22;
                    this.transferSize = d23;
                }

                public /* synthetic */ AppMetrics(Double d11, Double d12, Double d13, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d21, Double d22, Double d23, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? null : d11, (i11 & 2) != 0 ? null : d12, (i11 & 4) != 0 ? null : d13, (i11 & 8) != 0 ? null : d14, (i11 & 16) != 0 ? null : d15, (i11 & 32) != 0 ? null : d16, (i11 & 64) != 0 ? null : d17, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : d18, (i11 & 256) != 0 ? null : d19, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : d21, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : d22, (i11 & 2048) != 0 ? null : d23);
                }
            }

            @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$PlayerMetrics;", "Landroid/os/Parcelable;", "videoResolution", "Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$PlayerMetrics$VideoResolution;", "serverTimings", "", "Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$PlayerMetrics$ServerTimingData;", "<init>", "(Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$PlayerMetrics$VideoResolution;Ljava/util/List;)V", "getVideoResolution", "()Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$PlayerMetrics$VideoResolution;", "getServerTimings", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "VideoResolution", "ServerTimingData", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            @j(generateAdapter = true)
            public static final /* data */ class PlayerMetrics implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<PlayerMetrics> CREATOR = new a();
                private final List<ServerTimingData> serverTimings;
                private final VideoResolution videoResolution;

                @j(generateAdapter = true)
                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001f"}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$PlayerMetrics$ServerTimingData;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "duration", "", "description", "<init>", "(Ljava/lang/String;Ljava/lang/Number;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getDuration", "()Ljava/lang/Number;", "getDescription", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class ServerTimingData implements Parcelable {

                    @NotNull
                    public static final Parcelable.Creator<ServerTimingData> CREATOR = new a();

                    @NotNull
                    private final String description;

                    @NotNull
                    private final Number duration;

                    @NotNull
                    private final String name;

                    public static final class a implements Parcelable.Creator<ServerTimingData> {
                        @Override // android.os.Parcelable.Creator
                        public final ServerTimingData createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new ServerTimingData(parcel.readString(), (Number) parcel.readSerializable(), parcel.readString());
                        }

                        @Override // android.os.Parcelable.Creator
                        public final ServerTimingData[] newArray(int i11) {
                            return new ServerTimingData[i11];
                        }
                    }

                    public ServerTimingData(@NotNull String name, @NotNull Number duration, @NotNull String description) {
                        Intrinsics.checkNotNullParameter(name, "name");
                        Intrinsics.checkNotNullParameter(duration, "duration");
                        Intrinsics.checkNotNullParameter(description, "description");
                        this.name = name;
                        this.duration = duration;
                        this.description = description;
                    }

                    public static /* synthetic */ ServerTimingData copy$default(ServerTimingData serverTimingData, String str, Number number, String str2, int i11, Object obj) {
                        if ((i11 & 1) != 0) {
                            str = serverTimingData.name;
                        }
                        if ((i11 & 2) != 0) {
                            number = serverTimingData.duration;
                        }
                        if ((i11 & 4) != 0) {
                            str2 = serverTimingData.description;
                        }
                        return serverTimingData.copy(str, number, str2);
                    }

                    @NotNull
                    /* renamed from: component1, reason: from getter */
                    public final String getName() {
                        return this.name;
                    }

                    @NotNull
                    /* renamed from: component2, reason: from getter */
                    public final Number getDuration() {
                        return this.duration;
                    }

                    @NotNull
                    /* renamed from: component3, reason: from getter */
                    public final String getDescription() {
                        return this.description;
                    }

                    @NotNull
                    public final ServerTimingData copy(@NotNull String name, @NotNull Number duration, @NotNull String description) {
                        Intrinsics.checkNotNullParameter(name, "name");
                        Intrinsics.checkNotNullParameter(duration, "duration");
                        Intrinsics.checkNotNullParameter(description, "description");
                        return new ServerTimingData(name, duration, description);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof ServerTimingData)) {
                            return false;
                        }
                        ServerTimingData serverTimingData = (ServerTimingData) other;
                        return Intrinsics.d(this.name, serverTimingData.name) && Intrinsics.d(this.duration, serverTimingData.duration) && Intrinsics.d(this.description, serverTimingData.description);
                    }

                    @NotNull
                    public final String getDescription() {
                        return this.description;
                    }

                    @NotNull
                    public final Number getDuration() {
                        return this.duration;
                    }

                    @NotNull
                    public final String getName() {
                        return this.name;
                    }

                    public int hashCode() {
                        return this.description.hashCode() + ((this.duration.hashCode() + (this.name.hashCode() * 31)) * 31);
                    }

                    @NotNull
                    public String toString() {
                        String str = this.name;
                        Number number = this.duration;
                        String str2 = this.description;
                        StringBuilder sb2 = new StringBuilder("ServerTimingData(name=");
                        sb2.append(str);
                        sb2.append(", duration=");
                        sb2.append(number);
                        sb2.append(", description=");
                        return o0.c(sb2, str2, ")");
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@NotNull Parcel dest, int flags) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeString(this.name);
                        dest.writeSerializable(this.duration);
                        dest.writeString(this.description);
                    }
                }

                @j(generateAdapter = true)
                @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$PlayerMetrics$VideoResolution;", "Landroid/os/Parcelable;", "width", "", "height", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeight", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/tracker/performance/model/TraceEntity$VideoMetric$VideoFile$PlayerMetrics$VideoResolution;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class VideoResolution implements Parcelable {

                    @NotNull
                    public static final Parcelable.Creator<VideoResolution> CREATOR = new a();
                    private final Integer height;
                    private final Integer width;

                    public static final class a implements Parcelable.Creator<VideoResolution> {
                        @Override // android.os.Parcelable.Creator
                        public final VideoResolution createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new VideoResolution(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                        }

                        @Override // android.os.Parcelable.Creator
                        public final VideoResolution[] newArray(int i11) {
                            return new VideoResolution[i11];
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public VideoResolution() {
                        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                    }

                    public static /* synthetic */ VideoResolution copy$default(VideoResolution videoResolution, Integer num, Integer num2, int i11, Object obj) {
                        if ((i11 & 1) != 0) {
                            num = videoResolution.width;
                        }
                        if ((i11 & 2) != 0) {
                            num2 = videoResolution.height;
                        }
                        return videoResolution.copy(num, num2);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final Integer getWidth() {
                        return this.width;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final Integer getHeight() {
                        return this.height;
                    }

                    @NotNull
                    public final VideoResolution copy(Integer width, Integer height) {
                        return new VideoResolution(width, height);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof VideoResolution)) {
                            return false;
                        }
                        VideoResolution videoResolution = (VideoResolution) other;
                        return Intrinsics.d(this.width, videoResolution.width) && Intrinsics.d(this.height, videoResolution.height);
                    }

                    public final Integer getHeight() {
                        return this.height;
                    }

                    public final Integer getWidth() {
                        return this.width;
                    }

                    public int hashCode() {
                        Integer num = this.width;
                        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                        Integer num2 = this.height;
                        return hashCode + (num2 != null ? num2.hashCode() : 0);
                    }

                    @NotNull
                    public String toString() {
                        return "VideoResolution(width=" + this.width + ", height=" + this.height + ")";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@NotNull Parcel dest, int flags) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        Integer num = this.width;
                        if (num == null) {
                            dest.writeInt(0);
                        } else {
                            Nh.a.f(dest, 1, num);
                        }
                        Integer num2 = this.height;
                        if (num2 == null) {
                            dest.writeInt(0);
                        } else {
                            Nh.a.f(dest, 1, num2);
                        }
                    }

                    public VideoResolution(Integer num, Integer num2) {
                        this.width = num;
                        this.height = num2;
                    }

                    public /* synthetic */ VideoResolution(Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2);
                    }
                }

                public static final class a implements Parcelable.Creator<PlayerMetrics> {
                    @Override // android.os.Parcelable.Creator
                    public final PlayerMetrics createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        ArrayList arrayList = null;
                        VideoResolution createFromParcel = parcel.readInt() == 0 ? null : VideoResolution.CREATOR.createFromParcel(parcel);
                        if (parcel.readInt() != 0) {
                            int readInt = parcel.readInt();
                            ArrayList arrayList2 = new ArrayList(readInt);
                            int i11 = 0;
                            while (i11 != readInt) {
                                i11 = Ak.b.b(ServerTimingData.CREATOR, parcel, arrayList2, i11, 1);
                            }
                            arrayList = arrayList2;
                        }
                        return new PlayerMetrics(createFromParcel, arrayList);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final PlayerMetrics[] newArray(int i11) {
                        return new PlayerMetrics[i11];
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public PlayerMetrics() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ PlayerMetrics copy$default(PlayerMetrics playerMetrics, VideoResolution videoResolution, List list, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        videoResolution = playerMetrics.videoResolution;
                    }
                    if ((i11 & 2) != 0) {
                        list = playerMetrics.serverTimings;
                    }
                    return playerMetrics.copy(videoResolution, list);
                }

                /* renamed from: component1, reason: from getter */
                public final VideoResolution getVideoResolution() {
                    return this.videoResolution;
                }

                public final List<ServerTimingData> component2() {
                    return this.serverTimings;
                }

                @NotNull
                public final PlayerMetrics copy(VideoResolution videoResolution, List<ServerTimingData> serverTimings) {
                    return new PlayerMetrics(videoResolution, serverTimings);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PlayerMetrics)) {
                        return false;
                    }
                    PlayerMetrics playerMetrics = (PlayerMetrics) other;
                    return Intrinsics.d(this.videoResolution, playerMetrics.videoResolution) && Intrinsics.d(this.serverTimings, playerMetrics.serverTimings);
                }

                public final List<ServerTimingData> getServerTimings() {
                    return this.serverTimings;
                }

                public final VideoResolution getVideoResolution() {
                    return this.videoResolution;
                }

                public int hashCode() {
                    VideoResolution videoResolution = this.videoResolution;
                    int hashCode = (videoResolution == null ? 0 : videoResolution.hashCode()) * 31;
                    List<ServerTimingData> list = this.serverTimings;
                    return hashCode + (list != null ? list.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "PlayerMetrics(videoResolution=" + this.videoResolution + ", serverTimings=" + this.serverTimings + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    VideoResolution videoResolution = this.videoResolution;
                    if (videoResolution == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        videoResolution.writeToParcel(dest, flags);
                    }
                    List<ServerTimingData> list = this.serverTimings;
                    if (list == null) {
                        dest.writeInt(0);
                        return;
                    }
                    Iterator c11 = J.c(dest, 1, list);
                    while (c11.hasNext()) {
                        ((ServerTimingData) c11.next()).writeToParcel(dest, flags);
                    }
                }

                public PlayerMetrics(VideoResolution videoResolution, List<ServerTimingData> list) {
                    this.videoResolution = videoResolution;
                    this.serverTimings = list;
                }

                public /* synthetic */ PlayerMetrics(VideoResolution videoResolution, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? null : videoResolution, (i11 & 2) != 0 ? null : list);
                }
            }

            public static final class a implements Parcelable.Creator<VideoFile> {
                @Override // android.os.Parcelable.Creator
                public final VideoFile createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new VideoFile(parcel.readString(), parcel.readInt() == 0 ? null : AppMetrics.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PlayerMetrics.CREATOR.createFromParcel(parcel) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final VideoFile[] newArray(int i11) {
                    return new VideoFile[i11];
                }
            }

            public VideoFile(@NotNull String url, AppMetrics appMetrics, PlayerMetrics playerMetrics) {
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
                this.appMetrics = appMetrics;
                this.playerMetrics = playerMetrics;
            }

            public static /* synthetic */ VideoFile copy$default(VideoFile videoFile, String str, AppMetrics appMetrics, PlayerMetrics playerMetrics, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = videoFile.url;
                }
                if ((i11 & 2) != 0) {
                    appMetrics = videoFile.appMetrics;
                }
                if ((i11 & 4) != 0) {
                    playerMetrics = videoFile.playerMetrics;
                }
                return videoFile.copy(str, appMetrics, playerMetrics);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            /* renamed from: component2, reason: from getter */
            public final AppMetrics getAppMetrics() {
                return this.appMetrics;
            }

            /* renamed from: component3, reason: from getter */
            public final PlayerMetrics getPlayerMetrics() {
                return this.playerMetrics;
            }

            @NotNull
            public final VideoFile copy(@NotNull String url, AppMetrics appMetrics, PlayerMetrics playerMetrics) {
                Intrinsics.checkNotNullParameter(url, "url");
                return new VideoFile(url, appMetrics, playerMetrics);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VideoFile)) {
                    return false;
                }
                VideoFile videoFile = (VideoFile) other;
                return Intrinsics.d(this.url, videoFile.url) && Intrinsics.d(this.appMetrics, videoFile.appMetrics) && Intrinsics.d(this.playerMetrics, videoFile.playerMetrics);
            }

            public final AppMetrics getAppMetrics() {
                return this.appMetrics;
            }

            public final PlayerMetrics getPlayerMetrics() {
                return this.playerMetrics;
            }

            @NotNull
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                int hashCode = this.url.hashCode() * 31;
                AppMetrics appMetrics = this.appMetrics;
                int hashCode2 = (hashCode + (appMetrics == null ? 0 : appMetrics.hashCode())) * 31;
                PlayerMetrics playerMetrics = this.playerMetrics;
                return hashCode2 + (playerMetrics != null ? playerMetrics.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "VideoFile(url=" + this.url + ", appMetrics=" + this.appMetrics + ", playerMetrics=" + this.playerMetrics + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.url);
                AppMetrics appMetrics = this.appMetrics;
                if (appMetrics == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    appMetrics.writeToParcel(dest, flags);
                }
                PlayerMetrics playerMetrics = this.playerMetrics;
                if (playerMetrics == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    playerMetrics.writeToParcel(dest, flags);
                }
            }

            public /* synthetic */ VideoFile(String str, AppMetrics appMetrics, PlayerMetrics playerMetrics, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i11 & 2) != 0 ? null : appMetrics, (i11 & 4) != 0 ? null : playerMetrics);
            }
        }

        public /* synthetic */ VideoMetric(Integer num, Integer num2, Double d11, Double d12, Double d13, String str, String str2, Double d14, Integer num3, Double d15, Integer num4, Map map, ErrorDetails errorDetails, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, num2, d11, d12, d13, str, (i11 & 64) != 0 ? null : str2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : d14, (i11 & 256) != 0 ? null : num3, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : d15, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : num4, (i11 & 2048) != 0 ? null : map, (i11 & 4096) != 0 ? null : errorDetails, (i11 & 8192) != 0 ? null : list, (i11 & 16384) != 0 ? null : list2);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity$CustomMetric;", "Landroid/os/Parcelable;", "metric", "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;D)V", "getMetric", "()Ljava/lang/String;", "getName", "getValue", "()D", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class CustomMetric implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CustomMetric> CREATOR = new a();

        @NotNull
        private final String metric;

        @NotNull
        private final String name;
        private final double value;

        public static final class a implements Parcelable.Creator<CustomMetric> {
            @Override // android.os.Parcelable.Creator
            public final CustomMetric createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomMetric(parcel.readString(), parcel.readString(), parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            public final CustomMetric[] newArray(int i11) {
                return new CustomMetric[i11];
            }
        }

        public CustomMetric(@NotNull String metric, @NotNull String name, double d11) {
            Intrinsics.checkNotNullParameter(metric, "metric");
            Intrinsics.checkNotNullParameter(name, "name");
            this.metric = metric;
            this.name = name;
            this.value = d11;
        }

        public static /* synthetic */ CustomMetric copy$default(CustomMetric customMetric, String str, String str2, double d11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = customMetric.metric;
            }
            if ((i11 & 2) != 0) {
                str2 = customMetric.name;
            }
            if ((i11 & 4) != 0) {
                d11 = customMetric.value;
            }
            return customMetric.copy(str, str2, d11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMetric() {
            return this.metric;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final double getValue() {
            return this.value;
        }

        @NotNull
        public final CustomMetric copy(@NotNull String metric, @NotNull String name, double value) {
            Intrinsics.checkNotNullParameter(metric, "metric");
            Intrinsics.checkNotNullParameter(name, "name");
            return new CustomMetric(metric, name, value);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomMetric)) {
                return false;
            }
            CustomMetric customMetric = (CustomMetric) other;
            return Intrinsics.d(this.metric, customMetric.metric) && Intrinsics.d(this.name, customMetric.name) && Double.compare(this.value, customMetric.value) == 0;
        }

        @NotNull
        public final String getMetric() {
            return this.metric;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final double getValue() {
            return this.value;
        }

        public int hashCode() {
            return Double.hashCode(this.value) + g.a(this.metric.hashCode() * 31, 31, this.name);
        }

        @NotNull
        public String toString() {
            String str = this.metric;
            String str2 = this.name;
            return C2619v.c(C3660k.d("CustomMetric(metric=", str, ", name=", str2, ", value="), this.value, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.metric);
            dest.writeString(this.name);
            dest.writeDouble(this.value);
        }

        public /* synthetic */ CustomMetric(String str, String str2, double d11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? 0.0d : d11);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0003J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0006\u0010\u000f¨\u0006!"}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity$ErrorDetails;", "Landroid/os/Parcelable;", "count", "", "fatalErrorType", "", "isTimeoutError", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "getCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFatalErrorType", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/tracker/performance/model/TraceEntity$ErrorDetails;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class ErrorDetails implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ErrorDetails> CREATOR = new a();
        private final Integer count;
        private final String fatalErrorType;
        private final Boolean isTimeoutError;

        public static final class a implements Parcelable.Creator<ErrorDetails> {
            @Override // android.os.Parcelable.Creator
            public final ErrorDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Boolean bool = null;
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new ErrorDetails(valueOf, readString, bool);
            }

            @Override // android.os.Parcelable.Creator
            public final ErrorDetails[] newArray(int i11) {
                return new ErrorDetails[i11];
            }
        }

        public ErrorDetails(Integer num, String str, Boolean bool) {
            this.count = num;
            this.fatalErrorType = str;
            this.isTimeoutError = bool;
        }

        public static /* synthetic */ ErrorDetails copy$default(ErrorDetails errorDetails, Integer num, String str, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = errorDetails.count;
            }
            if ((i11 & 2) != 0) {
                str = errorDetails.fatalErrorType;
            }
            if ((i11 & 4) != 0) {
                bool = errorDetails.isTimeoutError;
            }
            return errorDetails.copy(num, str, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getCount() {
            return this.count;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFatalErrorType() {
            return this.fatalErrorType;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getIsTimeoutError() {
            return this.isTimeoutError;
        }

        @NotNull
        public final ErrorDetails copy(Integer count, String fatalErrorType, Boolean isTimeoutError) {
            return new ErrorDetails(count, fatalErrorType, isTimeoutError);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorDetails)) {
                return false;
            }
            ErrorDetails errorDetails = (ErrorDetails) other;
            return Intrinsics.d(this.count, errorDetails.count) && Intrinsics.d(this.fatalErrorType, errorDetails.fatalErrorType) && Intrinsics.d(this.isTimeoutError, errorDetails.isTimeoutError);
        }

        public final Integer getCount() {
            return this.count;
        }

        public final String getFatalErrorType() {
            return this.fatalErrorType;
        }

        public int hashCode() {
            Integer num = this.count;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.fatalErrorType;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isTimeoutError;
            return hashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final Boolean isTimeoutError() {
            return this.isTimeoutError;
        }

        @NotNull
        public String toString() {
            Integer num = this.count;
            String str = this.fatalErrorType;
            Boolean bool = this.isTimeoutError;
            StringBuilder sb2 = new StringBuilder("ErrorDetails(count=");
            sb2.append(num);
            sb2.append(", fatalErrorType=");
            sb2.append(str);
            sb2.append(", isTimeoutError=");
            return D3.g.d(sb2, bool, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.count;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
            dest.writeString(this.fatalErrorType);
            Boolean bool = this.isTimeoutError;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                D40.c.c(dest, 1, bool);
            }
        }

        public /* synthetic */ ErrorDetails(Integer num, String str, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, (i11 & 2) != 0 ? null : str, bool);
        }
    }

    public /* synthetic */ TraceEntity(String str, String str2, DateTime dateTime, String str3, Attributes attributes, User user, Page page, Obj obj, Properties properties, Widget widget, MapSdk mapSdk, List list, List list2, VideoMetric videoMetric, List list3, PclPage pclPage, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, dateTime, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : attributes, (i11 & 32) != 0 ? null : user, (i11 & 64) != 0 ? null : page, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : obj, (i11 & 256) != 0 ? null : properties, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : widget, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : mapSdk, (i11 & 2048) != 0 ? null : list, (i11 & 4096) != 0 ? null : list2, (i11 & 8192) != 0 ? null : videoMetric, (i11 & 16384) != 0 ? null : list3, (i11 & 32768) != 0 ? null : pclPage);
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b7\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001^B¹\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eB\u0091\u0001\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001d\u0010\u001fB\u009b\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001d\u0010 J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0007HÆ\u0003J\t\u0010@\u001a\u00020\u0007HÆ\u0003J\t\u0010A\u001a\u00020\u0007HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u0007HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00100J\u0010\u0010I\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u001cHÆ\u0003Jà\u0001\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u001cHÆ\u0001¢\u0006\u0002\u0010QJ\u0006\u0010R\u001a\u00020\u0007J\u0013\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010VHÖ\u0003J\t\u0010W\u001a\u00020\u0007HÖ\u0001J\t\u0010X\u001a\u00020\u0005HÖ\u0001J\u0016\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010$R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010$R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010$R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<¨\u0006_"}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity$Attributes;", "Landroid/os/Parcelable;", "namespace", "Lru/ozon/tracker/sendEvent/Namespace;", "appVersion", "", "buildNumber", "", "screenResolutionX", "screenResolutionY", "domainName", "platform", "deviceType", "osVersion", "deviceModel", "deviceCores", "deviceCpu", "", "deviceRam", "", "userToken", "commitHash", "profileCompilationStatus", "launchSteps", "", "Lru/ozon/tracker/performance/model/TraceEntity$Attributes$Step;", "miniApp", "screenDensity", "", "<init>", "(Lru/ozon/tracker/sendEvent/Namespace;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;F)V", "(Lru/ozon/tracker/sendEvent/Namespace;Ljava/lang/String;IIIFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "(Lru/ozon/tracker/sendEvent/Namespace;Ljava/lang/String;IIIFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNamespace", "()Lru/ozon/tracker/sendEvent/Namespace;", "getAppVersion", "()Ljava/lang/String;", "getBuildNumber", "()I", "getScreenResolutionX", "getScreenResolutionY", "getDomainName", "getPlatform", "getDeviceType", "getOsVersion", "getDeviceModel", "getDeviceCores", "getDeviceCpu", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDeviceRam", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUserToken", "getCommitHash", "getProfileCompilationStatus", "getLaunchSteps", "()Ljava/util/List;", "getMiniApp", "getScreenDensity", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Lru/ozon/tracker/sendEvent/Namespace;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;F)Lru/ozon/tracker/performance/model/TraceEntity$Attributes;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Step", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Attributes implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new a();

        @NotNull
        private final String appVersion;
        private final int buildNumber;
        private final String commitHash;
        private final int deviceCores;
        private final Double deviceCpu;

        @NotNull
        private final String deviceModel;
        private final Long deviceRam;

        @NotNull
        private final String deviceType;

        @NotNull
        private final String domainName;
        private final List<Step> launchSteps;
        private final String miniApp;

        @NotNull
        private final Namespace namespace;

        @NotNull
        private final String osVersion;

        @NotNull
        private final String platform;
        private final String profileCompilationStatus;
        private final float screenDensity;
        private final int screenResolutionX;
        private final int screenResolutionY;
        private final String userToken;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity$Attributes$Step;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "time", "", "<init>", "(Ljava/lang/String;F)V", "getName", "()Ljava/lang/String;", "getTime", "()F", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Step implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Step> CREATOR = new a();

            @NotNull
            private final String name;
            private final float time;

            /* loaded from: classes3.dex */
            public static final class a implements Parcelable.Creator<Step> {
                @Override // android.os.Parcelable.Creator
                public final Step createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Step(parcel.readString(), parcel.readFloat());
                }

                @Override // android.os.Parcelable.Creator
                public final Step[] newArray(int i11) {
                    return new Step[i11];
                }
            }

            public Step(@NotNull String name, float f7) {
                Intrinsics.checkNotNullParameter(name, "name");
                this.name = name;
                this.time = f7;
            }

            public static /* synthetic */ Step copy$default(Step step, String str, float f7, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = step.name;
                }
                if ((i11 & 2) != 0) {
                    f7 = step.time;
                }
                return step.copy(str, f7);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* renamed from: component2, reason: from getter */
            public final float getTime() {
                return this.time;
            }

            @NotNull
            public final Step copy(@NotNull String name, float time) {
                Intrinsics.checkNotNullParameter(name, "name");
                return new Step(name, time);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Step)) {
                    return false;
                }
                Step step = (Step) other;
                return Intrinsics.d(this.name, step.name) && Float.compare(this.time, step.time) == 0;
            }

            @NotNull
            public final String getName() {
                return this.name;
            }

            public final float getTime() {
                return this.time;
            }

            public int hashCode() {
                return Float.hashCode(this.time) + (this.name.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Step(name=" + this.name + ", time=" + this.time + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.name);
                dest.writeFloat(this.time);
            }
        }

        public static final class a implements Parcelable.Creator<Attributes> {
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                String str;
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Namespace valueOf = Namespace.valueOf(parcel.readString());
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                int readInt4 = parcel.readInt();
                Double valueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
                Long valueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                    str = readString;
                } else {
                    int readInt5 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt5);
                    int i11 = 0;
                    while (i11 != readInt5) {
                        i11 = Ak.b.b(Step.CREATOR, parcel, arrayList2, i11, 1);
                        readInt5 = readInt5;
                        readString = readString;
                    }
                    valueOf = valueOf;
                    str = readString;
                    arrayList = arrayList2;
                }
                return new Attributes(valueOf, str, readInt, readInt2, readInt3, readString2, readString3, readString4, readString5, readString6, readInt4, valueOf2, valueOf3, readString7, readString8, readString9, arrayList, parcel.readString(), parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            public final Attributes[] newArray(int i11) {
                return new Attributes[i11];
            }
        }

        public Attributes(@NotNull Namespace namespace, @NotNull String appVersion, int i11, int i12, int i13, @NotNull String domainName, @NotNull String platform, @NotNull String deviceType, @NotNull String osVersion, @NotNull String deviceModel, int i14, Double d11, Long l11, String str, String str2, String str3, List<Step> list, String str4, float f7) {
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            Intrinsics.checkNotNullParameter(domainName, "domainName");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(deviceType, "deviceType");
            Intrinsics.checkNotNullParameter(osVersion, "osVersion");
            Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
            this.namespace = namespace;
            this.appVersion = appVersion;
            this.buildNumber = i11;
            this.screenResolutionX = i12;
            this.screenResolutionY = i13;
            this.domainName = domainName;
            this.platform = platform;
            this.deviceType = deviceType;
            this.osVersion = osVersion;
            this.deviceModel = deviceModel;
            this.deviceCores = i14;
            this.deviceCpu = d11;
            this.deviceRam = l11;
            this.userToken = str;
            this.commitHash = str2;
            this.profileCompilationStatus = str3;
            this.launchSteps = list;
            this.miniApp = str4;
            this.screenDensity = f7;
        }

        public static /* synthetic */ Attributes copy$default(Attributes attributes, Namespace namespace, String str, int i11, int i12, int i13, String str2, String str3, String str4, String str5, String str6, int i14, Double d11, Long l11, String str7, String str8, String str9, List list, String str10, float f7, int i15, Object obj) {
            float f11;
            String str11;
            Namespace namespace2 = (i15 & 1) != 0 ? attributes.namespace : namespace;
            String str12 = (i15 & 2) != 0 ? attributes.appVersion : str;
            int i16 = (i15 & 4) != 0 ? attributes.buildNumber : i11;
            int i17 = (i15 & 8) != 0 ? attributes.screenResolutionX : i12;
            int i18 = (i15 & 16) != 0 ? attributes.screenResolutionY : i13;
            String str13 = (i15 & 32) != 0 ? attributes.domainName : str2;
            String str14 = (i15 & 64) != 0 ? attributes.platform : str3;
            String str15 = (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? attributes.deviceType : str4;
            String str16 = (i15 & 256) != 0 ? attributes.osVersion : str5;
            String str17 = (i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? attributes.deviceModel : str6;
            int i19 = (i15 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? attributes.deviceCores : i14;
            Double d12 = (i15 & 2048) != 0 ? attributes.deviceCpu : d11;
            Long l12 = (i15 & 4096) != 0 ? attributes.deviceRam : l11;
            String str18 = (i15 & 8192) != 0 ? attributes.userToken : str7;
            Namespace namespace3 = namespace2;
            String str19 = (i15 & 16384) != 0 ? attributes.commitHash : str8;
            String str20 = (i15 & 32768) != 0 ? attributes.profileCompilationStatus : str9;
            List list2 = (i15 & 65536) != 0 ? attributes.launchSteps : list;
            String str21 = (i15 & 131072) != 0 ? attributes.miniApp : str10;
            if ((i15 & 262144) != 0) {
                str11 = str21;
                f11 = attributes.screenDensity;
            } else {
                f11 = f7;
                str11 = str21;
            }
            return attributes.copy(namespace3, str12, i16, i17, i18, str13, str14, str15, str16, str17, i19, d12, l12, str18, str19, str20, list2, str11, f11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Namespace getNamespace() {
            return this.namespace;
        }

        @NotNull
        /* renamed from: component10, reason: from getter */
        public final String getDeviceModel() {
            return this.deviceModel;
        }

        /* renamed from: component11, reason: from getter */
        public final int getDeviceCores() {
            return this.deviceCores;
        }

        /* renamed from: component12, reason: from getter */
        public final Double getDeviceCpu() {
            return this.deviceCpu;
        }

        /* renamed from: component13, reason: from getter */
        public final Long getDeviceRam() {
            return this.deviceRam;
        }

        /* renamed from: component14, reason: from getter */
        public final String getUserToken() {
            return this.userToken;
        }

        /* renamed from: component15, reason: from getter */
        public final String getCommitHash() {
            return this.commitHash;
        }

        /* renamed from: component16, reason: from getter */
        public final String getProfileCompilationStatus() {
            return this.profileCompilationStatus;
        }

        public final List<Step> component17() {
            return this.launchSteps;
        }

        /* renamed from: component18, reason: from getter */
        public final String getMiniApp() {
            return this.miniApp;
        }

        /* renamed from: component19, reason: from getter */
        public final float getScreenDensity() {
            return this.screenDensity;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getAppVersion() {
            return this.appVersion;
        }

        /* renamed from: component3, reason: from getter */
        public final int getBuildNumber() {
            return this.buildNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final int getScreenResolutionX() {
            return this.screenResolutionX;
        }

        /* renamed from: component5, reason: from getter */
        public final int getScreenResolutionY() {
            return this.screenResolutionY;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final String getDomainName() {
            return this.domainName;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final String getPlatform() {
            return this.platform;
        }

        @NotNull
        /* renamed from: component8, reason: from getter */
        public final String getDeviceType() {
            return this.deviceType;
        }

        @NotNull
        /* renamed from: component9, reason: from getter */
        public final String getOsVersion() {
            return this.osVersion;
        }

        @NotNull
        public final Attributes copy(@NotNull Namespace namespace, @NotNull String appVersion, int buildNumber, int screenResolutionX, int screenResolutionY, @NotNull String domainName, @NotNull String platform, @NotNull String deviceType, @NotNull String osVersion, @NotNull String deviceModel, int deviceCores, Double deviceCpu, Long deviceRam, String userToken, String commitHash, String profileCompilationStatus, List<Step> launchSteps, String miniApp, float screenDensity) {
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            Intrinsics.checkNotNullParameter(domainName, "domainName");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(deviceType, "deviceType");
            Intrinsics.checkNotNullParameter(osVersion, "osVersion");
            Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
            return new Attributes(namespace, appVersion, buildNumber, screenResolutionX, screenResolutionY, domainName, platform, deviceType, osVersion, deviceModel, deviceCores, deviceCpu, deviceRam, userToken, commitHash, profileCompilationStatus, launchSteps, miniApp, screenDensity);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Attributes)) {
                return false;
            }
            Attributes attributes = (Attributes) other;
            return this.namespace == attributes.namespace && Intrinsics.d(this.appVersion, attributes.appVersion) && this.buildNumber == attributes.buildNumber && this.screenResolutionX == attributes.screenResolutionX && this.screenResolutionY == attributes.screenResolutionY && Intrinsics.d(this.domainName, attributes.domainName) && Intrinsics.d(this.platform, attributes.platform) && Intrinsics.d(this.deviceType, attributes.deviceType) && Intrinsics.d(this.osVersion, attributes.osVersion) && Intrinsics.d(this.deviceModel, attributes.deviceModel) && this.deviceCores == attributes.deviceCores && Intrinsics.d(this.deviceCpu, attributes.deviceCpu) && Intrinsics.d(this.deviceRam, attributes.deviceRam) && Intrinsics.d(this.userToken, attributes.userToken) && Intrinsics.d(this.commitHash, attributes.commitHash) && Intrinsics.d(this.profileCompilationStatus, attributes.profileCompilationStatus) && Intrinsics.d(this.launchSteps, attributes.launchSteps) && Intrinsics.d(this.miniApp, attributes.miniApp) && Float.compare(this.screenDensity, attributes.screenDensity) == 0;
        }

        @NotNull
        public final String getAppVersion() {
            return this.appVersion;
        }

        public final int getBuildNumber() {
            return this.buildNumber;
        }

        public final String getCommitHash() {
            return this.commitHash;
        }

        public final int getDeviceCores() {
            return this.deviceCores;
        }

        public final Double getDeviceCpu() {
            return this.deviceCpu;
        }

        @NotNull
        public final String getDeviceModel() {
            return this.deviceModel;
        }

        public final Long getDeviceRam() {
            return this.deviceRam;
        }

        @NotNull
        public final String getDeviceType() {
            return this.deviceType;
        }

        @NotNull
        public final String getDomainName() {
            return this.domainName;
        }

        public final List<Step> getLaunchSteps() {
            return this.launchSteps;
        }

        public final String getMiniApp() {
            return this.miniApp;
        }

        @NotNull
        public final Namespace getNamespace() {
            return this.namespace;
        }

        @NotNull
        public final String getOsVersion() {
            return this.osVersion;
        }

        @NotNull
        public final String getPlatform() {
            return this.platform;
        }

        public final String getProfileCompilationStatus() {
            return this.profileCompilationStatus;
        }

        public final float getScreenDensity() {
            return this.screenDensity;
        }

        public final int getScreenResolutionX() {
            return this.screenResolutionX;
        }

        public final int getScreenResolutionY() {
            return this.screenResolutionY;
        }

        public final String getUserToken() {
            return this.userToken;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.deviceCores, g.a(g.a(g.a(g.a(g.a(C2454a.a(this.screenResolutionY, C2454a.a(this.screenResolutionX, C2454a.a(this.buildNumber, g.a(this.namespace.hashCode() * 31, 31, this.appVersion), 31), 31), 31), 31, this.domainName), 31, this.platform), 31, this.deviceType), 31, this.osVersion), 31, this.deviceModel), 31);
            Double d11 = this.deviceCpu;
            int hashCode = (a11 + (d11 == null ? 0 : d11.hashCode())) * 31;
            Long l11 = this.deviceRam;
            int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str = this.userToken;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.commitHash;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.profileCompilationStatus;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<Step> list = this.launchSteps;
            int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            String str4 = this.miniApp;
            return Float.hashCode(this.screenDensity) + ((hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            Namespace namespace = this.namespace;
            String str = this.appVersion;
            int i11 = this.buildNumber;
            int i12 = this.screenResolutionX;
            int i13 = this.screenResolutionY;
            String str2 = this.domainName;
            String str3 = this.platform;
            String str4 = this.deviceType;
            String str5 = this.osVersion;
            String str6 = this.deviceModel;
            int i14 = this.deviceCores;
            Double d11 = this.deviceCpu;
            Long l11 = this.deviceRam;
            String str7 = this.userToken;
            String str8 = this.commitHash;
            String str9 = this.profileCompilationStatus;
            List<Step> list = this.launchSteps;
            String str10 = this.miniApp;
            float f7 = this.screenDensity;
            StringBuilder sb2 = new StringBuilder("Attributes(namespace=");
            sb2.append(namespace);
            sb2.append(", appVersion=");
            sb2.append(str);
            sb2.append(", buildNumber=");
            Ek.a.f(i11, i12, ", screenResolutionX=", ", screenResolutionY=", sb2);
            Pk0.i.c(i13, ", domainName=", str2, ", platform=", sb2);
            Nh.a.h(sb2, str3, ", deviceType=", str4, ", osVersion=");
            Nh.a.h(sb2, str5, ", deviceModel=", str6, ", deviceCores=");
            sb2.append(i14);
            sb2.append(", deviceCpu=");
            sb2.append(d11);
            sb2.append(", deviceRam=");
            sb2.append(l11);
            sb2.append(", userToken=");
            sb2.append(str7);
            sb2.append(", commitHash=");
            Nh.a.h(sb2, str8, ", profileCompilationStatus=", str9, ", launchSteps=");
            Cm.e.i(", miniApp=", str10, ", screenDensity=", sb2, list);
            return V.b(f7, ")", sb2);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.namespace.name());
            dest.writeString(this.appVersion);
            dest.writeInt(this.buildNumber);
            dest.writeInt(this.screenResolutionX);
            dest.writeInt(this.screenResolutionY);
            dest.writeString(this.domainName);
            dest.writeString(this.platform);
            dest.writeString(this.deviceType);
            dest.writeString(this.osVersion);
            dest.writeString(this.deviceModel);
            dest.writeInt(this.deviceCores);
            Double d11 = this.deviceCpu;
            if (d11 == null) {
                dest.writeInt(0);
            } else {
                TY.a.d(dest, 1, d11);
            }
            Long l11 = this.deviceRam;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l11);
            }
            dest.writeString(this.userToken);
            dest.writeString(this.commitHash);
            dest.writeString(this.profileCompilationStatus);
            List<Step> list = this.launchSteps;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator c11 = J.c(dest, 1, list);
                while (c11.hasNext()) {
                    ((Step) c11.next()).writeToParcel(dest, flags);
                }
            }
            dest.writeString(this.miniApp);
            dest.writeFloat(this.screenDensity);
        }

        public /* synthetic */ Attributes(Namespace namespace, String str, int i11, int i12, int i13, String str2, String str3, String str4, String str5, String str6, int i14, Double d11, Long l11, String str7, String str8, String str9, List list, String str10, float f7, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this(namespace, str, i11, i12, i13, (i15 & 32) != 0 ? "ozon.ru" : str2, (i15 & 64) != 0 ? "android" : str3, str4, str5, str6, i14, d11, l11, str7, str8, str9, list, (i15 & 131072) != 0 ? null : str10, f7);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Attributes(@NotNull Namespace namespace, @NotNull String appVersion, int i11, int i12, int i13, float f7, @NotNull String domainName, @NotNull String platform, @NotNull String deviceType, @NotNull String osVersion, @NotNull String deviceModel, int i14, Double d11, Long l11, String str, String str2) {
            this(namespace, appVersion, i11, i12, i13, domainName, platform, deviceType, osVersion, deviceModel, i14, d11, l11, str, str2, null, null, null, f7, 131072, null);
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            Intrinsics.checkNotNullParameter(domainName, "domainName");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(deviceType, "deviceType");
            Intrinsics.checkNotNullParameter(osVersion, "osVersion");
            Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @InterfaceC3999a
        public /* synthetic */ Attributes(Namespace namespace, String appVersion, int i11, int i12, int i13, float f7, String domainName, String platform, String deviceType, String osVersion, String deviceModel, int i14, Double d11, Long l11, String str, String str2, String str3) {
            this(namespace, appVersion, i11, i12, i13, domainName, platform, deviceType, osVersion, deviceModel, i14, d11, l11, str, str2, str3, null, null, f7, 131072, null);
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            Intrinsics.checkNotNullParameter(domainName, "domainName");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(deviceType, "deviceType");
            Intrinsics.checkNotNullParameter(osVersion, "osVersion");
            Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        }
    }
}
