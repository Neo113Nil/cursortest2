package io.radar.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.os.Build;
import android.os.SystemClock;
import androidx.core.location.LocationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.offline.DownloadService;
import com.braze.models.BrazeGeofence;
import com.braze.models.IBrazeLocation;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarApiClient;
import io.radar.sdk.RadarApiHelper;
import io.radar.sdk.RadarTrackingOptions;
import io.radar.sdk.model.RadarAddress;
import io.radar.sdk.model.RadarBeacon;
import io.radar.sdk.model.RadarConfig;
import io.radar.sdk.model.RadarContext;
import io.radar.sdk.model.RadarEvent;
import io.radar.sdk.model.RadarGeofence;
import io.radar.sdk.model.RadarInAppMessage;
import io.radar.sdk.model.RadarLog;
import io.radar.sdk.model.RadarPlace;
import io.radar.sdk.model.RadarRegion;
import io.radar.sdk.model.RadarReplay;
import io.radar.sdk.model.RadarRouteMatrix;
import io.radar.sdk.model.RadarRoutes;
import io.radar.sdk.model.RadarTrip;
import io.radar.sdk.model.RadarUser;
import io.radar.sdk.model.RadarVerifiedLocationToken;
import io.sentry.SentryEvent;
import io.sentry.clientreport.DiscardedEvent;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Utf8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RadarApiClient.kt */
@Metadata(d1 = {"\u0000\u0096\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001:\u001e\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJa\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u001a\u001a\u0004\u0018\u00010!H\u0000¢\u0006\u0002\b\"JC\u0010#\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00142\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0004\b%\u0010&J/\u0010'\u001a\u00020\u000e2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010)\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010*H\u0000¢\u0006\u0002\b+J\u001d\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020.H\u0000¢\u0006\u0002\b/JC\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u00122\f\u00103\u001a\b\u0012\u0004\u0012\u000205042\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u000209H\u0000¢\u0006\u0002\b:JC\u0010;\u001a\u00020\u000e2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010>\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u0010\u001a\u001a\u00020?H\u0000¢\u0006\u0004\b@\u0010AJ\u001c\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100C2\u0006\u0010D\u001a\u00020\u0010H\u0002J\u0015\u0010E\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020FH\u0000¢\u0006\u0002\bGJ\u001d\u0010H\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020JH\u0000¢\u0006\u0002\bKJ%\u0010L\u001a\u00020\u000e2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020O0N2\b\u0010\u001a\u001a\u0004\u0018\u00010PH\u0000¢\u0006\u0002\bQJ%\u0010R\u001a\u00020\u000e2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020T0N2\b\u0010\u001a\u001a\u0004\u0018\u00010UH\u0000¢\u0006\u0002\bVJ1\u0010W\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00122\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0004\bX\u0010YJ9\u0010Z\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00122\u0006\u0010[\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001a\u001a\u00020\\2\u0006\u0010]\u001a\u00020\u0019H\u0000¢\u0006\u0004\b^\u0010_JW\u0010`\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00122\b\u0010[\u001a\u0004\u0018\u00010\u00162\u000e\u0010a\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00142\b\u0010b\u001a\u0004\u0018\u00010c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010d\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020eH\u0000¢\u0006\u0004\bf\u0010gJ\u0087\u0001\u0010h\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00122\u0006\u0010[\u001a\u00020\u00162\u000e\u0010i\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00142\u0014\u0010j\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010C2\u000e\u0010k\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00142\u000e\u0010l\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00142\u000e\u0010m\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001a\u001a\u00020nH\u0000¢\u0006\u0004\bo\u0010pJ'\u0010q\u001a\u00020\u000e2\u0006\u0010r\u001a\u00020\u00102\b\u0010b\u001a\u0004\u0018\u00010c2\u0006\u0010\u001a\u001a\u00020sH\u0000¢\u0006\u0002\btJ¸\u0001\u0010u\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00122\u0006\u0010v\u001a\u00020\u00192\u0006\u0010w\u001a\u00020\u00192\u0006\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020\u00192\u000e\u0010{\u001a\n\u0012\u0004\u0012\u00020|\u0018\u00010\u00142\b\b\u0002\u0010)\u001a\u00020\u00192\n\b\u0002\u0010}\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010~\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u007f\u001a\u0004\u0018\u00010\u00192\u000b\b\u0002\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00102\u000b\b\u0002\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00102\u000b\b\u0002\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00102\u000b\b\u0002\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00102\u000b\b\u0002\u0010\u001a\u001a\u0005\u0018\u00010\u0084\u0001H\u0000¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J/\u0010\u0087\u0001\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u00012\b\u0010\u001a\u001a\u0004\u0018\u00010!H\u0000¢\u0006\u0003\b\u008a\u0001J\"\u0010\u008b\u0001\u001a\u00020\u000e2\b\u0010\u008c\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u001a\u001a\u00030\u008e\u0001H\u0000¢\u0006\u0003\b\u008f\u0001J/\u0010\u0090\u0001\u001a\u00020\u000e2\u0007\u0010\u0091\u0001\u001a\u00020\u00102\b\u0010\u0092\u0001\u001a\u00030\u0093\u00012\u000b\b\u0002\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0003\b\u0095\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006¥\u0001"}, d2 = {"Lio/radar/sdk/RadarApiClient;", "", "context", "Landroid/content/Context;", SentryEvent.JsonKeys.LOGGER, "Lio/radar/sdk/RadarLogger;", "apiHelper", "Lio/radar/sdk/RadarApiHelper;", "(Landroid/content/Context;Lio/radar/sdk/RadarLogger;Lio/radar/sdk/RadarApiHelper;)V", "getApiHelper$sdk_release", "()Lio/radar/sdk/RadarApiHelper;", "setApiHelper$sdk_release", "(Lio/radar/sdk/RadarApiHelper;)V", "autocomplete", "", SearchIntents.EXTRA_QUERY, "", "near", "Landroid/location/Location;", "layers", "", "limit", "", "country", "mailable", "", "callback", "Lio/radar/sdk/RadarApiClient$RadarGeocodeApiCallback;", "autocomplete$sdk_release", "(Ljava/lang/String;Landroid/location/Location;[Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lio/radar/sdk/RadarApiClient$RadarGeocodeApiCallback;)V", "createTrip", "options", "Lio/radar/sdk/RadarTripOptions;", "Lio/radar/sdk/RadarApiClient$RadarTripApiCallback;", "createTrip$sdk_release", "geocode", "countries", "geocode$sdk_release", "(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Lio/radar/sdk/RadarApiClient$RadarGeocodeApiCallback;)V", "getConfig", "usage", "verified", "Lio/radar/sdk/RadarApiClient$RadarGetConfigApiCallback;", "getConfig$sdk_release", "getContext", FirebaseAnalytics.Param.LOCATION, "Lio/radar/sdk/RadarApiClient$RadarContextApiCallback;", "getContext$sdk_release", "getDistance", "origin", "destination", "modes", "Ljava/util/EnumSet;", "Lio/radar/sdk/Radar$RadarRouteMode;", "units", "Lio/radar/sdk/Radar$RadarRouteUnits;", "geometryPoints", "Lio/radar/sdk/RadarApiClient$RadarDistanceApiCallback;", "getDistance$sdk_release", "getMatrix", "origins", "destinations", "mode", "Lio/radar/sdk/RadarApiClient$RadarMatrixApiCallback;", "getMatrix$sdk_release", "([Landroid/location/Location;[Landroid/location/Location;Lio/radar/sdk/Radar$RadarRouteMode;Lio/radar/sdk/Radar$RadarRouteUnits;Lio/radar/sdk/RadarApiClient$RadarMatrixApiCallback;)V", "headers", "", "publishableKey", "ipGeocode", "Lio/radar/sdk/RadarApiClient$RadarIpGeocodeApiCallback;", "ipGeocode$sdk_release", "loadImage", "imageUrl", "Lio/radar/sdk/RadarApiHelper$RadarImageApiCallback;", "loadImage$sdk_release", "log", "logs", "", "Lio/radar/sdk/model/RadarLog;", "Lio/radar/sdk/RadarApiClient$RadarLogCallback;", "log$sdk_release", RadarTrackingOptions.KEY_REPLAY, "replays", "Lio/radar/sdk/model/RadarReplay;", "Lio/radar/sdk/RadarApiClient$RadarReplayApiCallback;", "replay$sdk_release", "reverseGeocode", "reverseGeocode$sdk_release", "(Landroid/location/Location;[Ljava/lang/String;Lio/radar/sdk/RadarApiClient$RadarGeocodeApiCallback;)V", "searchBeacons", BrazeGeofence.RADIUS_METERS, "Lio/radar/sdk/RadarApiClient$RadarSearchBeaconsApiCallback;", "cache", "searchBeacons$sdk_release", "(Landroid/location/Location;ILjava/lang/Integer;Lio/radar/sdk/RadarApiClient$RadarSearchBeaconsApiCallback;Z)V", "searchGeofences", "tags", "metadata", "Lorg/json/JSONObject;", "includeGeometry", "Lio/radar/sdk/RadarApiClient$RadarSearchGeofencesApiCallback;", "searchGeofences$sdk_release", "(Landroid/location/Location;Ljava/lang/Integer;[Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/Integer;Ljava/lang/Boolean;Lio/radar/sdk/RadarApiClient$RadarSearchGeofencesApiCallback;)V", "searchPlaces", "chains", "chainMetadata", "categories", "groups", "countryCodes", "Lio/radar/sdk/RadarApiClient$RadarSearchPlacesApiCallback;", "searchPlaces$sdk_release", "(Landroid/location/Location;I[Ljava/lang/String;Ljava/util/Map;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Integer;Lio/radar/sdk/RadarApiClient$RadarSearchPlacesApiCallback;)V", "sendEvent", "name", "Lio/radar/sdk/RadarApiClient$RadarSendEventApiCallback;", "sendEvent$sdk_release", "track", "stopped", DownloadService.KEY_FOREGROUND, "source", "Lio/radar/sdk/Radar$RadarLocationSource;", "replayed", RadarTrackingOptions.KEY_BEACONS, "Lio/radar/sdk/model/RadarBeacon;", "integrityToken", "integrityException", "encrypted", "expectedCountryCode", "expectedStateCode", DiscardedEvent.JsonKeys.REASON, "transactionId", "Lio/radar/sdk/RadarApiClient$RadarTrackApiCallback;", "track$sdk_release", "(Landroid/location/Location;ZZLio/radar/sdk/Radar$RadarLocationSource;Z[Lio/radar/sdk/model/RadarBeacon;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/radar/sdk/RadarApiClient$RadarTrackApiCallback;)V", "updateTrip", "status", "Lio/radar/sdk/model/RadarTrip$RadarTripStatus;", "updateTrip$sdk_release", "validateAddress", "address", "Lio/radar/sdk/model/RadarAddress;", "Lio/radar/sdk/RadarApiClient$RadarValidateAddressAPICallback;", "validateAddress$sdk_release", "verifyEvent", "eventId", "verification", "Lio/radar/sdk/model/RadarEvent$RadarEventVerification;", "verifiedPlaceId", "verifyEvent$sdk_release", "RadarContextApiCallback", "RadarDistanceApiCallback", "RadarGeocodeApiCallback", "RadarGetConfigApiCallback", "RadarIpGeocodeApiCallback", "RadarLogCallback", "RadarMatrixApiCallback", "RadarReplayApiCallback", "RadarSearchBeaconsApiCallback", "RadarSearchGeofencesApiCallback", "RadarSearchPlacesApiCallback", "RadarSendEventApiCallback", "RadarTrackApiCallback", "RadarTripApiCallback", "RadarValidateAddressAPICallback", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarApiClient {
    private RadarApiHelper apiHelper;
    private final Context context;
    private RadarLogger logger;

    public RadarApiClient(Context context, RadarLogger logger, RadarApiHelper apiHelper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(apiHelper, "apiHelper");
        this.context = context;
        this.logger = logger;
        this.apiHelper = apiHelper;
    }

    public /* synthetic */ RadarApiClient(Context context, RadarLogger radarLogger, RadarApiHelper radarApiHelper, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, radarLogger, (i & 4) != 0 ? new RadarApiHelper(radarLogger) : radarApiHelper);
    }

    /* renamed from: getApiHelper$sdk_release, reason: from getter */
    public final RadarApiHelper getApiHelper() {
        return this.apiHelper;
    }

    public final void setApiHelper$sdk_release(RadarApiHelper radarApiHelper) {
        Intrinsics.checkNotNullParameter(radarApiHelper, "<set-?>");
        this.apiHelper = radarApiHelper;
    }

    /* compiled from: RadarApiClient.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001Ji\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/radar/sdk/RadarApiClient$RadarTrackApiCallback;", "", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", UriUtil.LOCAL_RESOURCE_SCHEME, "Lorg/json/JSONObject;", "events", "", "Lio/radar/sdk/model/RadarEvent;", "user", "Lio/radar/sdk/model/RadarUser;", "nearbyGeofences", "Lio/radar/sdk/model/RadarGeofence;", AnalyticsConstantsKt.KEY_CONFIG, "Lio/radar/sdk/model/RadarConfig;", AnalyticsConstantsKt.KEY_TOKEN, "Lio/radar/sdk/model/RadarVerifiedLocationToken;", "(Lio/radar/sdk/Radar$RadarStatus;Lorg/json/JSONObject;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;[Lio/radar/sdk/model/RadarGeofence;Lio/radar/sdk/model/RadarConfig;Lio/radar/sdk/model/RadarVerifiedLocationToken;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RadarTrackApiCallback {
        void onComplete(Radar.RadarStatus status, JSONObject res, RadarEvent[] events, RadarUser user, RadarGeofence[] nearbyGeofences, RadarConfig config, RadarVerifiedLocationToken token);

        /* compiled from: RadarApiClient.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void onComplete$default(RadarTrackApiCallback radarTrackApiCallback, Radar.RadarStatus radarStatus, JSONObject jSONObject, RadarEvent[] radarEventArr, RadarUser radarUser, RadarGeofence[] radarGeofenceArr, RadarConfig radarConfig, RadarVerifiedLocationToken radarVerifiedLocationToken, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i & 2) != 0) {
                    jSONObject = null;
                }
                if ((i & 4) != 0) {
                    radarEventArr = null;
                }
                if ((i & 8) != 0) {
                    radarUser = null;
                }
                if ((i & 16) != 0) {
                    radarGeofenceArr = null;
                }
                if ((i & 32) != 0) {
                    radarConfig = null;
                }
                if ((i & 64) != 0) {
                    radarVerifiedLocationToken = null;
                }
                radarTrackApiCallback.onComplete(radarStatus, jSONObject, radarEventArr, radarUser, radarGeofenceArr, radarConfig, radarVerifiedLocationToken);
            }
        }
    }

    /* compiled from: RadarApiClient.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lio/radar/sdk/RadarApiClient$RadarGetConfigApiCallback;", "", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", AnalyticsConstantsKt.KEY_CONFIG, "Lio/radar/sdk/model/RadarConfig;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RadarGetConfigApiCallback {
        void onComplete(Radar.RadarStatus status, RadarConfig config);

        /* compiled from: RadarApiClient.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void onComplete$default(RadarGetConfigApiCallback radarGetConfigApiCallback, Radar.RadarStatus radarStatus, RadarConfig radarConfig, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i & 2) != 0) {
                    radarConfig = null;
                }
                radarGetConfigApiCallback.onComplete(radarStatus, radarConfig);
            }
        }
    }

    /* compiled from: RadarApiClient.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J?\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH&¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lio/radar/sdk/RadarApiClient$RadarTripApiCallback;", "", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", UriUtil.LOCAL_RESOURCE_SCHEME, "Lorg/json/JSONObject;", "trip", "Lio/radar/sdk/model/RadarTrip;", "events", "", "Lio/radar/sdk/model/RadarEvent;", "(Lio/radar/sdk/Radar$RadarStatus;Lorg/json/JSONObject;Lio/radar/sdk/model/RadarTrip;[Lio/radar/sdk/model/RadarEvent;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RadarTripApiCallback {
        void onComplete(Radar.RadarStatus status, JSONObject res, RadarTrip trip, RadarEvent[] events);

        /* compiled from: RadarApiClient.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void onComplete$default(RadarTripApiCallback radarTripApiCallback, Radar.RadarStatus radarStatus, JSONObject jSONObject, RadarTrip radarTrip, RadarEvent[] radarEventArr, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i & 2) != 0) {
                    jSONObject = null;
                }
                if ((i & 4) != 0) {
                    radarTrip = null;
                }
                if ((i & 8) != 0) {
                    radarEventArr = null;
                }
                radarTripApiCallback.onComplete(radarStatus, jSONObject, radarTrip, radarEventArr);
            }
        }
    }

    /* compiled from: RadarApiClient.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lio/radar/sdk/RadarApiClient$RadarContextApiCallback;", "", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", UriUtil.LOCAL_RESOURCE_SCHEME, "Lorg/json/JSONObject;", "context", "Lio/radar/sdk/model/RadarContext;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RadarContextApiCallback {
        void onComplete(Radar.RadarStatus status, JSONObject res, RadarContext context);

        /* compiled from: RadarApiClient.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void onComplete$default(RadarContextApiCallback radarContextApiCallback, Radar.RadarStatus radarStatus, JSONObject jSONObject, RadarContext radarContext, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i & 2) != 0) {
                    jSONObject = null;
                }
                if ((i & 4) != 0) {
                    radarContext = null;
                }
                radarContextApiCallback.onComplete(radarStatus, jSONObject, radarContext);
            }
        }
    }

    /* compiled from: RadarApiClient.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lio/radar/sdk/RadarApiClient$RadarSearchPlacesApiCallback;", "", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", UriUtil.LOCAL_RESOURCE_SCHEME, "Lorg/json/JSONObject;", "places", "", "Lio/radar/sdk/model/RadarPlace;", "(Lio/radar/sdk/Radar$RadarStatus;Lorg/json/JSONObject;[Lio/radar/sdk/model/RadarPlace;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RadarSearchPlacesApiCallback {
        void onComplete(Radar.RadarStatus status, JSONObject res, RadarPlace[] places);

        /* compiled from: RadarApiClient.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void onComplete$default(RadarSearchPlacesApiCallback radarSearchPlacesApiCallback, Radar.RadarStatus radarStatus, JSONObject jSONObject, RadarPlace[] radarPlaceArr, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i & 2) != 0) {
                    jSONObject = null;
                }
                if ((i & 4) != 0) {
                    radarPlaceArr = null;
                }
                radarSearchPlacesApiCallback.onComplete(radarStatus, jSONObject, radarPlaceArr);
            }
        }
    }

    /* compiled from: RadarApiClient.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lio/radar/sdk/RadarApiClient$RadarSearchGeofencesApiCallback;", "", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", UriUtil.LOCAL_RESOURCE_SCHEME, "Lorg/json/JSONObject;", "geofences", "", "Lio/radar/sdk/model/RadarGeofence;", "(Lio/radar/sdk/Radar$RadarStatus;Lorg/json/JSONObject;[Lio/radar/sdk/model/RadarGeofence;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RadarSearchGeofencesApiCallback {
        void onComplete(Radar.RadarStatus status, JSONObject res, RadarGeofence[] geofences);

        /* compiled from: RadarApiClient.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void onComplete$default(RadarSearchGeofencesApiCallback radarSearchGeofencesApiCallback, Radar.RadarStatus radarStatus, JSONObject jSONObject, RadarGeofence[] radarGeofenceArr, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i & 2) != 0) {
                    jSONObject = null;
                }
                if ((i & 4) != 0) {
                    radarGeofenceArr = null;
                }
                radarSearchGeofencesApiCallback.onComplete(radarStatus, jSONObject, radarGeofenceArr);
            }
        }
    }

    /* compiled from: RadarApiClient.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JW\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tH&¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/radar/sdk/RadarApiClient$RadarSearchBeaconsApiCallback;", "", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", UriUtil.LOCAL_RESOURCE_SCHEME, "Lorg/json/JSONObject;", RadarTrackingOptions.KEY_BEACONS, "", "Lio/radar/sdk/model/RadarBeacon;", "uuids", "", "uids", "(Lio/radar/sdk/Radar$RadarStatus;Lorg/json/JSONObject;[Lio/radar/sdk/model/RadarBeacon;[Ljava/lang/String;[Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RadarSearchBeaconsApiCallback {
        void onComplete(Radar.RadarStatus status, JSONObject res, RadarBeacon[] beacons, String[] uuids, String[] uids);

        /* compiled from: RadarApiClient.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void onComplete$default(RadarSearchBeaconsApiCallback radarSearchBeaconsApiCallback, Radar.RadarStatus radarStatus, JSONObject jSONObject, RadarBeacon[] radarBeaconArr, String[] strArr, String[] strArr2, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i & 2) != 0) {
                    jSONObject = null;
                }
                if ((i & 4) != 0) {
                    radarBeaconArr = null;
                }
                if ((i & 8) != 0) {
                    strArr = null;
                }
                if ((i & 16) != 0) {
                    strArr2 = null;
                }
                radarSearchBeaconsApiCallback.onComplete(radarStatus, jSONObject, radarBeaconArr, strArr, strArr2);
            }
        }
    }

    /* compiled from: RadarApiClient.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\f"}, d2 = {"Lio/radar/sdk/RadarApiClient$RadarValidateAddressAPICallback;", "", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", UriUtil.LOCAL_RESOURCE_SCHEME, "Lorg/json/JSONObject;", "address", "Lio/radar/sdk/model/RadarAddress;", "verificationStatus", "Lio/radar/sdk/Radar$RadarAddressVerificationStatus;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RadarValidateAddressAPICallback {
        void onComplete(Radar.RadarStatus status, JSONObject res, RadarAddress address, Radar.RadarAddressVerificationStatus verificationStatus);

        /* compiled from: RadarApiClient.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void onComplete$default(RadarValidateAddressAPICallback radarValidateAddressAPICallback, Radar.RadarStatus radarStatus, JSONObject jSONObject, RadarAddress radarAddress, Radar.RadarAddressVerificationStatus radarAddressVerificationStatus, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i & 2) != 0) {
                    jSONObject = null;
                }
                if ((i & 4) != 0) {
                    radarAddress = null;
                }
                if ((i & 8) != 0) {
                    radarAddressVerificationStatus = null;
                }
                radarValidateAddressAPICallback.onComplete(radarStatus, jSONObject, radarAddress, radarAddressVerificationStatus);
            }
        }
    }

    /* compiled from: RadarApiClient.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lio/radar/sdk/RadarApiClient$RadarGeocodeApiCallback;", "", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", UriUtil.LOCAL_RESOURCE_SCHEME, "Lorg/json/JSONObject;", "addresses", "", "Lio/radar/sdk/model/RadarAddress;", "(Lio/radar/sdk/Radar$RadarStatus;Lorg/json/JSONObject;[Lio/radar/sdk/model/RadarAddress;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RadarGeocodeApiCallback {
        void onComplete(Radar.RadarStatus status, JSONObject res, RadarAddress[] addresses);

        /* compiled from: RadarApiClient.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void onComplete$default(RadarGeocodeApiCallback radarGeocodeApiCallback, Radar.RadarStatus radarStatus, JSONObject jSONObject, RadarAddress[] radarAddressArr, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i & 2) != 0) {
                    jSONObject = null;
                }
                if ((i & 4) != 0) {
                    radarAddressArr = null;
                }
                radarGeocodeApiCallback.onComplete(radarStatus, jSONObject, radarAddressArr);
            }
        }
    }

    /* compiled from: RadarApiClient.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lio/radar/sdk/RadarApiClient$RadarIpGeocodeApiCallback;", "", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", UriUtil.LOCAL_RESOURCE_SCHEME, "Lorg/json/JSONObject;", "address", "Lio/radar/sdk/model/RadarAddress;", "proxy", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RadarIpGeocodeApiCallback {
        void onComplete(Radar.RadarStatus status, JSONObject res, RadarAddress address, boolean proxy);

        /* compiled from: RadarApiClient.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void onComplete$default(RadarIpGeocodeApiCallback radarIpGeocodeApiCallback, Radar.RadarStatus radarStatus, JSONObject jSONObject, RadarAddress radarAddress, boolean z, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i & 2) != 0) {
                    jSONObject = null;
                }
                if ((i & 4) != 0) {
                    radarAddress = null;
                }
                if ((i & 8) != 0) {
                    z = false;
                }
                radarIpGeocodeApiCallback.onComplete(radarStatus, jSONObject, radarAddress, z);
            }
        }
    }

    /* compiled from: RadarApiClient.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lio/radar/sdk/RadarApiClient$RadarDistanceApiCallback;", "", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", UriUtil.LOCAL_RESOURCE_SCHEME, "Lorg/json/JSONObject;", "routes", "Lio/radar/sdk/model/RadarRoutes;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RadarDistanceApiCallback {
        void onComplete(Radar.RadarStatus status, JSONObject res, RadarRoutes routes);

        /* compiled from: RadarApiClient.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void onComplete$default(RadarDistanceApiCallback radarDistanceApiCallback, Radar.RadarStatus radarStatus, JSONObject jSONObject, RadarRoutes radarRoutes, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i & 2) != 0) {
                    jSONObject = null;
                }
                if ((i & 4) != 0) {
                    radarRoutes = null;
                }
                radarDistanceApiCallback.onComplete(radarStatus, jSONObject, radarRoutes);
            }
        }
    }

    /* compiled from: RadarApiClient.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lio/radar/sdk/RadarApiClient$RadarMatrixApiCallback;", "", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", UriUtil.LOCAL_RESOURCE_SCHEME, "Lorg/json/JSONObject;", "matrix", "Lio/radar/sdk/model/RadarRouteMatrix;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RadarMatrixApiCallback {
        void onComplete(Radar.RadarStatus status, JSONObject res, RadarRouteMatrix matrix);

        /* compiled from: RadarApiClient.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void onComplete$default(RadarMatrixApiCallback radarMatrixApiCallback, Radar.RadarStatus radarStatus, JSONObject jSONObject, RadarRouteMatrix radarRouteMatrix, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i & 2) != 0) {
                    jSONObject = null;
                }
                if ((i & 4) != 0) {
                    radarRouteMatrix = null;
                }
                radarMatrixApiCallback.onComplete(radarStatus, jSONObject, radarRouteMatrix);
            }
        }
    }

    /* compiled from: RadarApiClient.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lio/radar/sdk/RadarApiClient$RadarSendEventApiCallback;", "", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", UriUtil.LOCAL_RESOURCE_SCHEME, "Lorg/json/JSONObject;", "event", "Lio/radar/sdk/model/RadarEvent;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RadarSendEventApiCallback {
        void onComplete(Radar.RadarStatus status, JSONObject res, RadarEvent event);

        /* compiled from: RadarApiClient.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void onComplete$default(RadarSendEventApiCallback radarSendEventApiCallback, Radar.RadarStatus radarStatus, JSONObject jSONObject, RadarEvent radarEvent, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i & 2) != 0) {
                    jSONObject = null;
                }
                if ((i & 4) != 0) {
                    radarEvent = null;
                }
                radarSendEventApiCallback.onComplete(radarStatus, jSONObject, radarEvent);
            }
        }
    }

    /* compiled from: RadarApiClient.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lio/radar/sdk/RadarApiClient$RadarLogCallback;", "", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", UriUtil.LOCAL_RESOURCE_SCHEME, "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RadarLogCallback {
        void onComplete(Radar.RadarStatus status, JSONObject res);

        /* compiled from: RadarApiClient.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void onComplete$default(RadarLogCallback radarLogCallback, Radar.RadarStatus radarStatus, JSONObject jSONObject, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i & 2) != 0) {
                    jSONObject = null;
                }
                radarLogCallback.onComplete(radarStatus, jSONObject);
            }
        }
    }

    /* compiled from: RadarApiClient.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lio/radar/sdk/RadarApiClient$RadarReplayApiCallback;", "", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", UriUtil.LOCAL_RESOURCE_SCHEME, "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RadarReplayApiCallback {
        void onComplete(Radar.RadarStatus status, JSONObject res);

        /* compiled from: RadarApiClient.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void onComplete$default(RadarReplayApiCallback radarReplayApiCallback, Radar.RadarStatus radarStatus, JSONObject jSONObject, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onComplete");
                }
                if ((i & 2) != 0) {
                    jSONObject = null;
                }
                radarReplayApiCallback.onComplete(radarStatus, jSONObject);
            }
        }
    }

    private final Map<String, String> headers(String publishableKey) {
        Map<String, String> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("Authorization", publishableKey), TuplesKt.to("Content-Type", "application/json"), TuplesKt.to("X-Radar-Config", "true"), TuplesKt.to("X-Radar-Device-Make", RadarUtils.INSTANCE.getDeviceMake$sdk_release()), TuplesKt.to("X-Radar-Device-Model", RadarUtils.INSTANCE.getDeviceModel$sdk_release()), TuplesKt.to("X-Radar-Device-OS", RadarUtils.INSTANCE.getDeviceOS$sdk_release()), TuplesKt.to("X-Radar-Device-Type", "Android"), TuplesKt.to("X-Radar-SDK-Version", "3.24.2"), TuplesKt.to("X-Radar-Mobile-Origin", this.context.getPackageName()), TuplesKt.to("X-Radar-Network-Type", RadarUtils.INSTANCE.getConnectionType$sdk_release(this.context).name()), TuplesKt.to("X-Radar-App-Info", new JSONObject(RadarUtils.INSTANCE.getApplicationInfo$sdk_release(this.context)).toString()));
        if (RadarSettings.INSTANCE.isXPlatform$sdk_release(this.context)) {
            mutableMapOf.put("X-Radar-X-Platform-SDK-Type", RadarSettings.INSTANCE.getXPlatformSDKType$sdk_release(this.context));
            mutableMapOf.put("X-Radar-X-Platform-SDK-Version", RadarSettings.INSTANCE.getXPlatformSDKVersion$sdk_release(this.context));
        } else {
            mutableMapOf.put("X-Radar-X-Platform-SDK-Type", "Native");
        }
        String product$sdk_release = RadarSettings.INSTANCE.getProduct$sdk_release(this.context);
        if (product$sdk_release != null) {
            mutableMapOf.put("X-Radar-Product", product$sdk_release);
        }
        return mutableMapOf;
    }

    public static /* synthetic */ void getConfig$sdk_release$default(RadarApiClient radarApiClient, String str, boolean z, RadarGetConfigApiCallback radarGetConfigApiCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            radarGetConfigApiCallback = null;
        }
        radarApiClient.getConfig$sdk_release(str, z, radarGetConfigApiCallback);
    }

    public final void getConfig$sdk_release(String usage, boolean verified, final RadarGetConfigApiCallback callback) {
        String publishableKey$sdk_release = RadarSettings.INSTANCE.getPublishableKey$sdk_release(this.context);
        if (publishableKey$sdk_release == null) {
            if (callback != null) {
                RadarGetConfigApiCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_PUBLISHABLE_KEY, null, 2, null);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("installId=" + RadarSettings.INSTANCE.getInstallId$sdk_release(this.context));
        sb.append("&sessionId=" + RadarSettings.INSTANCE.getSessionId$sdk_release(this.context));
        String id$sdk_release = RadarSettings.INSTANCE.getId$sdk_release(this.context);
        if (id$sdk_release != null) {
            sb.append("&id=" + id$sdk_release);
        }
        sb.append("&locationAuthorization=" + RadarUtils.INSTANCE.getLocationAuthorization$sdk_release(this.context));
        sb.append("&locationAccuracyAuthorization=" + RadarUtils.INSTANCE.getLocationAccuracyAuthorization$sdk_release(this.context));
        sb.append("&verified=" + verified);
        if (usage != null) {
            sb.append("&usage=" + usage);
        }
        String jSONObject = RadarSettings.INSTANCE.getClientSdkConfiguration(this.context).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        sb.append("&clientSdkConfiguration=" + URLEncoder.encode(jSONObject, "utf-8"));
        RadarApiHelper.request$sdk_release$default(this.apiHelper, this.context, "GET", "v1/config?" + ((Object) sb), headers(publishableKey$sdk_release), null, false, new RadarApiHelper.RadarApiCallback() { // from class: io.radar.sdk.RadarApiClient$getConfig$1
            @Override // io.radar.sdk.RadarApiHelper.RadarApiCallback
            public void onComplete(Radar.RadarStatus status, JSONObject res) {
                Intrinsics.checkNotNullParameter(status, "status");
                if (status == Radar.RadarStatus.SUCCESS) {
                    Radar.flushLogs$sdk_release();
                }
                RadarApiClient.RadarGetConfigApiCallback radarGetConfigApiCallback = RadarApiClient.RadarGetConfigApiCallback.this;
                if (radarGetConfigApiCallback != null) {
                    radarGetConfigApiCallback.onComplete(status, RadarConfig.INSTANCE.fromJson(res));
                }
            }
        }, false, true, verified, false, null, 3072, null);
    }

    public final void log$sdk_release(List<RadarLog> logs, final RadarLogCallback callback) {
        Intrinsics.checkNotNullParameter(logs, "logs");
        String publishableKey$sdk_release = RadarSettings.INSTANCE.getPublishableKey$sdk_release(this.context);
        if (publishableKey$sdk_release == null) {
            if (callback != null) {
                RadarLogCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_PUBLISHABLE_KEY, null, 2, null);
                return;
            }
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("id", RadarSettings.INSTANCE.getId$sdk_release(this.context));
            jSONObject.putOpt("deviceId", RadarUtils.INSTANCE.getDeviceId$sdk_release(this.context));
            jSONObject.putOpt("installId", RadarSettings.INSTANCE.getInstallId$sdk_release(this.context));
            jSONObject.putOpt("sessionId", RadarSettings.INSTANCE.getSessionId$sdk_release(this.context));
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = logs.iterator();
            while (it.hasNext()) {
                jSONArray.put(((RadarLog) it.next()).toJson());
            }
            jSONObject.putOpt("logs", jSONArray);
            RadarApiHelper.request$sdk_release$default(this.apiHelper, this.context, "POST", "v1/logs", headers(publishableKey$sdk_release), jSONObject, false, new RadarApiHelper.RadarApiCallback() { // from class: io.radar.sdk.RadarApiClient$log$2
                @Override // io.radar.sdk.RadarApiHelper.RadarApiCallback
                public void onComplete(Radar.RadarStatus status, JSONObject res) {
                    Intrinsics.checkNotNullParameter(status, "status");
                    RadarApiClient.RadarLogCallback radarLogCallback = RadarApiClient.RadarLogCallback.this;
                    if (radarLogCallback != null) {
                        radarLogCallback.onComplete(status, res);
                    }
                }
            }, false, true, false, false, null, 3072, null);
        } catch (JSONException unused) {
            if (callback != null) {
                RadarLogCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_BAD_REQUEST, null, 2, null);
            }
        }
    }

    public final void replay$sdk_release(List<RadarReplay> replays, final RadarReplayApiCallback callback) {
        Intrinsics.checkNotNullParameter(replays, "replays");
        String publishableKey$sdk_release = RadarSettings.INSTANCE.getPublishableKey$sdk_release(this.context);
        if (publishableKey$sdk_release == null) {
            if (callback != null) {
                RadarReplayApiCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_PUBLISHABLE_KEY, null, 2, null);
                return;
            }
            return;
        }
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        Iterator<RadarReplay> it = replays.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getReplayParams());
        }
        jSONObject.putOpt("replays", new JSONArray((Collection) arrayList));
        RadarApiHelper.request$sdk_release$default(this.apiHelper, this.context, "POST", "v1/track/replay", headers(publishableKey$sdk_release), jSONObject, false, new RadarApiHelper.RadarApiCallback() { // from class: io.radar.sdk.RadarApiClient$replay$1
            @Override // io.radar.sdk.RadarApiHelper.RadarApiCallback
            public void onComplete(Radar.RadarStatus status, JSONObject res) {
                JSONObject optJSONObject;
                JSONArray optJSONArray;
                Intrinsics.checkNotNullParameter(status, "status");
                RadarUser radarUser = null;
                if (status != Radar.RadarStatus.SUCCESS) {
                    Radar.sendError$sdk_release$default(Radar.INSTANCE, status, null, 2, null);
                }
                RadarEvent[] fromJson = (res == null || (optJSONArray = res.optJSONArray("events")) == null) ? null : RadarEvent.INSTANCE.fromJson(optJSONArray);
                if (res != null && (optJSONObject = res.optJSONObject("user")) != null) {
                    radarUser = RadarUser.INSTANCE.fromJson(optJSONObject);
                }
                if (fromJson != null && fromJson.length != 0) {
                    Radar.INSTANCE.sendEvents$sdk_release(fromJson, radarUser);
                }
                RadarApiClient.RadarReplayApiCallback radarReplayApiCallback = RadarApiClient.RadarReplayApiCallback.this;
                if (radarReplayApiCallback != null) {
                    radarReplayApiCallback.onComplete(status, res);
                }
            }
        }, true, false, false, false, null, 3072, null);
    }

    public static /* synthetic */ void track$sdk_release$default(RadarApiClient radarApiClient, Location location, boolean z, boolean z2, Radar.RadarLocationSource radarLocationSource, boolean z3, RadarBeacon[] radarBeaconArr, boolean z4, String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, RadarTrackApiCallback radarTrackApiCallback, int i, Object obj) {
        RadarTrackApiCallback radarTrackApiCallback2;
        RadarApiClient radarApiClient2;
        Location location2;
        boolean z5;
        boolean z6;
        Radar.RadarLocationSource radarLocationSource2;
        boolean z7;
        RadarBeacon[] radarBeaconArr2;
        boolean z8 = (i & 64) != 0 ? false : z4;
        String str7 = (i & 128) != 0 ? null : str;
        String str8 = (i & 256) != 0 ? null : str2;
        Boolean bool2 = (i & 512) != 0 ? false : bool;
        String str9 = (i & 1024) != 0 ? null : str3;
        String str10 = (i & 2048) != 0 ? null : str4;
        String str11 = (i & 4096) != 0 ? null : str5;
        String str12 = (i & 8192) != 0 ? null : str6;
        if ((i & 16384) != 0) {
            radarTrackApiCallback2 = null;
            location2 = location;
            z5 = z;
            z6 = z2;
            radarLocationSource2 = radarLocationSource;
            z7 = z3;
            radarBeaconArr2 = radarBeaconArr;
            radarApiClient2 = radarApiClient;
        } else {
            radarTrackApiCallback2 = radarTrackApiCallback;
            radarApiClient2 = radarApiClient;
            location2 = location;
            z5 = z;
            z6 = z2;
            radarLocationSource2 = radarLocationSource;
            z7 = z3;
            radarBeaconArr2 = radarBeaconArr;
        }
        radarApiClient2.track$sdk_release(location2, z5, z6, radarLocationSource2, z7, radarBeaconArr2, z8, str7, str8, bool2, str9, str10, str11, str12, radarTrackApiCallback2);
    }

    public final void track$sdk_release(final Location location, final boolean stopped, boolean foreground, final Radar.RadarLocationSource source, boolean replayed, RadarBeacon[] beacons, boolean verified, String integrityToken, String integrityException, Boolean encrypted, String expectedCountryCode, String expectedStateCode, String reason, String transactionId, final RadarTrackApiCallback callback) {
        boolean z;
        boolean hasVerticalAccuracy;
        boolean hasSpeedAccuracy;
        boolean hasBearingAccuracy;
        float bearingAccuracyDegrees;
        float bearingAccuracyDegrees2;
        float speedAccuracyMetersPerSecond;
        float speedAccuracyMetersPerSecond2;
        float verticalAccuracyMeters;
        float verticalAccuracyMeters2;
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(source, "source");
        String publishableKey$sdk_release = RadarSettings.INSTANCE.getPublishableKey$sdk_release(this.context);
        if (publishableKey$sdk_release == null) {
            if (callback != null) {
                RadarTrackApiCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_PUBLISHABLE_KEY, null, null, null, null, null, null, 126, null);
                return;
            }
            return;
        }
        final JSONObject jSONObject = new JSONObject();
        final RadarTrackingOptions trackingOptions = Radar.getTrackingOptions();
        RadarTripOptions tripOptions$sdk_release = RadarSettings.INSTANCE.getTripOptions$sdk_release(this.context);
        boolean anonymousTrackingEnabled$sdk_release = RadarSettings.INSTANCE.getAnonymousTrackingEnabled$sdk_release(this.context);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.putOpt("anonymous", Boolean.valueOf(anonymousTrackingEnabled$sdk_release));
            if (anonymousTrackingEnabled$sdk_release) {
                jSONObject.putOpt("deviceId", "anonymous");
                jSONObject.putOpt("geofenceIds", new JSONArray((Collection) RadarState.INSTANCE.getGeofenceIds$sdk_release(this.context)));
                jSONObject.putOpt("placeId", RadarState.INSTANCE.getPlaceId$sdk_release(this.context));
                jSONObject.putOpt("regionIds", new JSONArray((Collection) RadarState.INSTANCE.getRegionIds$sdk_release(this.context)));
                jSONObject.putOpt("beaconIds", new JSONArray((Collection) RadarState.INSTANCE.getBeaconIds$sdk_release(this.context)));
            } else {
                jSONObject.putOpt("id", RadarSettings.INSTANCE.getId$sdk_release(this.context));
                jSONObject.putOpt("installId", RadarSettings.INSTANCE.getInstallId$sdk_release(this.context));
                jSONObject.putOpt("userId", RadarSettings.INSTANCE.getUserId$sdk_release(this.context));
                jSONObject.putOpt("deviceId", RadarUtils.INSTANCE.getDeviceId$sdk_release(this.context));
                jSONObject.putOpt("description", RadarSettings.INSTANCE.getDescription$sdk_release(this.context));
                jSONObject.putOpt("metadata", RadarSettings.INSTANCE.getMetadata$sdk_release(this.context));
                jSONObject.putOpt("sessionId", RadarSettings.INSTANCE.getSessionId$sdk_release(this.context));
                String[] tags$sdk_release = RadarSettings.INSTANCE.getTags$sdk_release(this.context);
                if (tags$sdk_release != null) {
                    if (!(tags$sdk_release.length == 0)) {
                        jSONObject.putOpt("userTags", new JSONArray((Collection) ArraysKt.toList(tags$sdk_release)));
                    }
                }
            }
            jSONObject.putOpt("latitude", Double.valueOf(location.getLatitude()));
            jSONObject.putOpt("longitude", Double.valueOf(location.getLongitude()));
            float accuracy = location.getAccuracy();
            if (!location.hasAccuracy() || Float.isNaN(location.getAccuracy()) || accuracy <= 0.0f) {
                accuracy = 1.0f;
            }
            jSONObject.putOpt("accuracy", Float.valueOf(accuracy));
            if (location.hasSpeed() && !Float.isNaN(location.getSpeed())) {
                jSONObject.putOpt("speed", Float.valueOf(location.getSpeed()));
            }
            if (location.hasBearing() && !Float.isNaN(location.getBearing())) {
                jSONObject.putOpt("course", Float.valueOf(location.getBearing()));
            }
            if (location.hasAltitude() && !Double.isNaN(location.getAltitude())) {
                jSONObject.putOpt(IBrazeLocation.ALTITUDE, Double.valueOf(location.getAltitude()));
                jSONObject2.putOpt(IBrazeLocation.ALTITUDE, Double.valueOf(location.getAltitude()));
            }
            if (Build.VERSION.SDK_INT >= 26) {
                hasVerticalAccuracy = location.hasVerticalAccuracy();
                if (hasVerticalAccuracy) {
                    verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                    if (!Float.isNaN(verticalAccuracyMeters)) {
                        verticalAccuracyMeters2 = location.getVerticalAccuracyMeters();
                        jSONObject.putOpt("verticalAccuracy", Float.valueOf(verticalAccuracyMeters2));
                    }
                }
                hasSpeedAccuracy = location.hasSpeedAccuracy();
                if (hasSpeedAccuracy) {
                    speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                    if (!Float.isNaN(speedAccuracyMetersPerSecond)) {
                        speedAccuracyMetersPerSecond2 = location.getSpeedAccuracyMetersPerSecond();
                        jSONObject.putOpt(LocationCompat.EXTRA_SPEED_ACCURACY, Float.valueOf(speedAccuracyMetersPerSecond2));
                    }
                }
                hasBearingAccuracy = location.hasBearingAccuracy();
                if (hasBearingAccuracy) {
                    bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                    if (!Float.isNaN(bearingAccuracyDegrees)) {
                        bearingAccuracyDegrees2 = location.getBearingAccuracyDegrees();
                        jSONObject.putOpt("courseAccuracy", Float.valueOf(bearingAccuracyDegrees2));
                    }
                }
            }
            long j = 1000000;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / j;
            long elapsedRealtimeNanos2 = location.getElapsedRealtimeNanos() / j;
            long j2 = elapsedRealtimeNanos - elapsedRealtimeNanos2;
            if (RadarSettings.INSTANCE.getSdkConfiguration(this.context).getUseForegroundLocationUpdatedAtMsDiff() || !foreground) {
                jSONObject.putOpt("updatedAtMsDiff", Long.valueOf(j2));
            }
            jSONObject.putOpt("locationMs", Long.valueOf(elapsedRealtimeNanos2));
            jSONObject.putOpt(DownloadService.KEY_FOREGROUND, Boolean.valueOf(foreground));
            jSONObject.putOpt("stopped", Boolean.valueOf(stopped));
            jSONObject.putOpt("replayed", Boolean.valueOf(replayed));
            jSONObject.putOpt("deviceType", "Android");
            jSONObject.putOpt("deviceMake", RadarUtils.INSTANCE.getDeviceMake$sdk_release());
            jSONObject.putOpt(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "3.24.2");
            jSONObject.putOpt("deviceModel", RadarUtils.INSTANCE.getDeviceModel$sdk_release());
            jSONObject.putOpt("deviceOS", RadarUtils.INSTANCE.getDeviceOS$sdk_release());
            jSONObject.putOpt("deviceType", "Android");
            jSONObject.putOpt("deviceMake", RadarUtils.INSTANCE.getDeviceMake$sdk_release());
            jSONObject.putOpt("country", RadarUtils.INSTANCE.getCountry$sdk_release());
            jSONObject.putOpt("timeZoneOffset", Integer.valueOf(RadarUtils.INSTANCE.getTimeZoneOffset$sdk_release()));
            jSONObject.putOpt("source", Radar.stringForSource(source));
            if (RadarSettings.INSTANCE.isXPlatform$sdk_release(this.context)) {
                jSONObject.putOpt("xPlatformType", RadarSettings.INSTANCE.getXPlatformSDKType$sdk_release(this.context));
                jSONObject.putOpt("xPlatformSDKVersion", RadarSettings.INSTANCE.getXPlatformSDKVersion$sdk_release(this.context));
            } else {
                jSONObject.putOpt("xPlatformType", "Native");
            }
            jSONObject.putOpt("mocked", Boolean.valueOf(location.isFromMockProvider()));
            if (tripOptions$sdk_release != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.putOpt("version", ExifInterface.GPS_MEASUREMENT_2D);
                jSONObject3.putOpt(RadarTripOptions.KEY_EXTERNAL_ID, tripOptions$sdk_release.getExternalId());
                jSONObject3.putOpt("metadata", tripOptions$sdk_release.getMetadata());
                jSONObject3.putOpt(RadarTripOptions.KEY_DESTINATION_GEOFENCE_TAG, tripOptions$sdk_release.getDestinationGeofenceTag());
                jSONObject3.putOpt(RadarTripOptions.KEY_DESTINATION_GEOFENCE_EXTERNAL_ID, tripOptions$sdk_release.getDestinationGeofenceExternalId());
                jSONObject3.putOpt("mode", Radar.stringForMode(tripOptions$sdk_release.getMode()));
                jSONObject.putOpt("tripOptions", jSONObject3);
            }
            if (trackingOptions.getSyncGeofences() != RadarTrackingOptions.RadarTrackingOptionsSyncGeofences.NONE) {
                jSONObject.putOpt("nearbyGeofences", true);
                jSONObject.putOpt("nearbyGeofencesLimit", Integer.valueOf(trackingOptions.getSyncGeofencesLimit()));
            }
            if (beacons != null) {
                jSONObject.putOpt(RadarTrackingOptions.KEY_BEACONS, RadarBeacon.INSTANCE.toJson(beacons));
            }
            jSONObject.putOpt("locationAuthorization", RadarUtils.INSTANCE.getLocationAuthorization$sdk_release(this.context));
            jSONObject.putOpt("locationAccuracyAuthorization", RadarUtils.INSTANCE.getLocationAccuracyAuthorization$sdk_release(this.context));
            jSONObject.putOpt("trackingOptions", Radar.getTrackingOptions().toJson());
            jSONObject.putOpt("usingRemoteTrackingOptions", Boolean.valueOf(RadarSettings.INSTANCE.getTracking$sdk_release(this.context) && RadarSettings.INSTANCE.getRemoteTrackingOptions$sdk_release(this.context) != null));
            jSONObject.putOpt("locationServicesProvider", RadarSettings.INSTANCE.getLocationServicesProvider$sdk_release(this.context));
            jSONObject.putOpt("verified", Boolean.valueOf(verified));
            if (verified) {
                jSONObject.putOpt("integrityToken", integrityToken);
                jSONObject.putOpt("integrityException", integrityException);
                jSONObject.putOpt("encrypted", encrypted);
                if (expectedCountryCode != null) {
                    jSONObject.putOpt("expectedCountryCode", expectedCountryCode);
                }
                if (expectedStateCode != null) {
                    jSONObject.putOpt("expectedStateCode", expectedStateCode);
                }
                if (reason != null) {
                    jSONObject.putOpt(DiscardedEvent.JsonKeys.REASON, reason);
                }
                if (transactionId != null) {
                    jSONObject.putOpt("transactionId", transactionId);
                }
                JSONArray jSONArray = new JSONArray();
                if (RadarUtils.INSTANCE.hasMultipleDisplays$sdk_release(this.context)) {
                    jSONArray.put("fraud_sharing_multiple_displays");
                }
                if (RadarUtils.INSTANCE.hasVirtualInputDevice$sdk_release(this.context)) {
                    jSONArray.put("fraud_sharing_virtual_input_device");
                }
                if (jSONArray.length() > 0) {
                    jSONObject.putOpt("fraudFailureReasons", jSONArray);
                }
            }
            jSONObject.putOpt(RemoteConfigConstants.RequestFieldKey.APP_ID, this.context.getPackageName());
            try {
                jSONObject.putOpt("appName", this.context.getApplicationInfo().loadLabel(this.context.getPackageManager()).toString());
                z = false;
                try {
                    PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0);
                    jSONObject.putOpt(RemoteConfigConstants.RequestFieldKey.APP_VERSION, packageInfo.versionName);
                    jSONObject.putOpt(RemoteConfigConstants.RequestFieldKey.APP_BUILD, Integer.valueOf(packageInfo.versionCode));
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                z = false;
            }
            if (Radar.getTrackingOptions().getUseMotion()) {
                jSONObject2.putOpt("motionActivityData", RadarState.INSTANCE.getLastMotionActivity$sdk_release(this.context));
                if (location.hasSpeed() && !Float.isNaN(location.getSpeed())) {
                    jSONObject2.putOpt("speed", Float.valueOf(location.getSpeed()));
                }
                if (location.hasBearing() && !Float.isNaN(location.getBearing())) {
                    jSONObject2.putOpt("bearing", Float.valueOf(location.getBearing()));
                }
                jSONObject.putOpt("locationMetadata", jSONObject2);
            }
            if (Radar.getTrackingOptions().getUsePressure() && RadarState.INSTANCE.getLastPressure$sdk_release(this.context) != null) {
                jSONObject2.putOpt("pressureHPa", RadarState.INSTANCE.getLastPressure$sdk_release(this.context));
            }
            if (jSONObject2.length() > 0) {
                jSONObject.putOpt("locationMetadata", jSONObject2);
            }
            jSONObject.putOpt("pushNotificationToken", RadarSettings.INSTANCE.getPushNotificationToken());
            Map<String, String> headers = headers(publishableKey$sdk_release);
            if (anonymousTrackingEnabled$sdk_release) {
                getConfig$sdk_release$default(this, "track", false, null, 6, null);
            }
            boolean z2 = (trackingOptions.getReplay() == RadarTrackingOptions.RadarTrackingOptionsReplay.ALL && Radar.hasReplays$sdk_release() && !verified) ? true : z;
            if (z2) {
                Radar.flushReplays$sdk_release(jSONObject, new Radar.RadarTrackCallback() { // from class: io.radar.sdk.RadarApiClient$track$1
                    @Override // io.radar.sdk.Radar.RadarTrackCallback
                    public void onComplete(Radar.RadarStatus status, Location location2, RadarEvent[] events, RadarUser user) {
                        Intrinsics.checkNotNullParameter(status, "status");
                        RadarApiClient.RadarTrackApiCallback radarTrackApiCallback = RadarApiClient.RadarTrackApiCallback.this;
                        if (radarTrackApiCallback != null) {
                            RadarApiClient.RadarTrackApiCallback.DefaultImpls.onComplete$default(radarTrackApiCallback, status, null, null, null, null, null, null, 126, null);
                        }
                    }
                });
            } else {
                RadarApiHelper.request$sdk_release$default(this.apiHelper, this.context, "POST", "v1/track", headers, jSONObject, true, new RadarApiHelper.RadarApiCallback() { // from class: io.radar.sdk.RadarApiClient$track$2
                    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
                    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
                    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0  */
                    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
                    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
                    /* JADX WARN: Removed duplicated region for block: B:48:0x0117  */
                    /* JADX WARN: Removed duplicated region for block: B:51:0x0136  */
                    /* JADX WARN: Removed duplicated region for block: B:92:0x00d7  */
                    /* JADX WARN: Removed duplicated region for block: B:94:0x008c  */
                    @Override // io.radar.sdk.RadarApiHelper.RadarApiCallback
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public void onComplete(Radar.RadarStatus status, JSONObject res) {
                        Context context;
                        Context context2;
                        Context context3;
                        boolean z3;
                        Context context4;
                        Context context5;
                        Context context6;
                        Context context7;
                        boolean z4;
                        Context context8;
                        RadarGeofence[] geofences;
                        Context context9;
                        Context context10;
                        RadarRegion country;
                        RadarRegion state;
                        RadarRegion dma;
                        RadarRegion postalCode;
                        Context context11;
                        RadarBeacon[] beacons2;
                        Context context12;
                        Intrinsics.checkNotNullParameter(status, "status");
                        if (status != Radar.RadarStatus.SUCCESS || res == null) {
                            if (RadarTrackingOptions.this.getReplay() == RadarTrackingOptions.RadarTrackingOptionsReplay.ALL) {
                                jSONObject.putOpt("replayed", true);
                                Radar.addReplay$sdk_release(jSONObject);
                            } else if (RadarTrackingOptions.this.getReplay() == RadarTrackingOptions.RadarTrackingOptionsReplay.STOPS && stopped && source != Radar.RadarLocationSource.FOREGROUND_LOCATION && source != Radar.RadarLocationSource.BACKGROUND_LOCATION) {
                                RadarState radarState = RadarState.INSTANCE;
                                context = this.context;
                                radarState.setLastFailedStoppedLocation$sdk_release(context, location);
                            }
                            Radar.sendError$sdk_release$default(Radar.INSTANCE, status, null, 2, null);
                            RadarApiClient.RadarTrackApiCallback radarTrackApiCallback = callback;
                            if (radarTrackApiCallback != null) {
                                RadarApiClient.RadarTrackApiCallback.DefaultImpls.onComplete$default(radarTrackApiCallback, status, null, null, null, null, null, null, 126, null);
                                return;
                            }
                            return;
                        }
                        RadarState radarState2 = RadarState.INSTANCE;
                        context2 = this.context;
                        radarState2.setLastFailedStoppedLocation$sdk_release(context2, null);
                        Radar.flushLogs$sdk_release();
                        RadarSettings radarSettings = RadarSettings.INSTANCE;
                        context3 = this.context;
                        radarSettings.updateLastTrackedTime$sdk_release(context3);
                        RadarConfig fromJson = RadarConfig.INSTANCE.fromJson(res);
                        JSONArray optJSONArray = res.optJSONArray("events");
                        RadarEvent[] fromJson2 = optJSONArray != null ? RadarEvent.INSTANCE.fromJson(optJSONArray) : null;
                        JSONObject optJSONObject = res.optJSONObject("user");
                        RadarUser fromJson3 = optJSONObject != null ? RadarUser.INSTANCE.fromJson(optJSONObject) : null;
                        JSONArray optJSONArray2 = res.optJSONArray("nearbyGeofences");
                        RadarGeofence[] fromJson4 = optJSONArray2 != null ? RadarGeofence.INSTANCE.fromJson(optJSONArray2) : null;
                        RadarVerifiedLocationToken fromJson5 = RadarVerifiedLocationToken.INSTANCE.fromJson(res);
                        if (fromJson3 != null) {
                            if (fromJson3.getGeofences() != null) {
                                if (!(fromJson3.getGeofences().length == 0)) {
                                    z4 = true;
                                    boolean z5 = !z4 || (fromJson3.getPlace() == null);
                                    RadarState radarState3 = RadarState.INSTANCE;
                                    context8 = this.context;
                                    radarState3.setCanExit$sdk_release(context8, z5);
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    geofences = fromJson3.getGeofences();
                                    if (geofences != null) {
                                        for (RadarGeofence radarGeofence : geofences) {
                                            linkedHashSet.add(radarGeofence.get_id());
                                        }
                                    }
                                    z3 = true;
                                    RadarState radarState4 = RadarState.INSTANCE;
                                    context9 = this.context;
                                    radarState4.setGeofenceIds$sdk_release(context9, linkedHashSet);
                                    RadarPlace place = fromJson3.getPlace();
                                    String str = place == null ? place.get_id() : null;
                                    RadarState radarState5 = RadarState.INSTANCE;
                                    context10 = this.context;
                                    radarState5.setPlaceId$sdk_release(context10, str);
                                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                    country = fromJson3.getCountry();
                                    if (country != null) {
                                        linkedHashSet2.add(country.get_id());
                                    }
                                    state = fromJson3.getState();
                                    if (state != null) {
                                        linkedHashSet2.add(state.get_id());
                                    }
                                    dma = fromJson3.getDma();
                                    if (dma != null) {
                                        linkedHashSet2.add(dma.get_id());
                                    }
                                    postalCode = fromJson3.getPostalCode();
                                    if (postalCode != null) {
                                        linkedHashSet2.add(postalCode.get_id());
                                    }
                                    RadarState radarState6 = RadarState.INSTANCE;
                                    context11 = this.context;
                                    radarState6.setRegionIds$sdk_release(context11, linkedHashSet2);
                                    LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                    beacons2 = fromJson3.getBeacons();
                                    if (beacons2 != null) {
                                        for (RadarBeacon radarBeacon : beacons2) {
                                            String str2 = radarBeacon.get_id();
                                            if (str2 != null) {
                                                linkedHashSet3.add(str2);
                                            }
                                        }
                                    }
                                    RadarState radarState7 = RadarState.INSTANCE;
                                    context12 = this.context;
                                    radarState7.setBeaconIds$sdk_release(context12, linkedHashSet3);
                                }
                            }
                            z4 = false;
                            if (z4) {
                            }
                            RadarState radarState32 = RadarState.INSTANCE;
                            context8 = this.context;
                            radarState32.setCanExit$sdk_release(context8, z5);
                            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                            geofences = fromJson3.getGeofences();
                            if (geofences != null) {
                            }
                            z3 = true;
                            RadarState radarState42 = RadarState.INSTANCE;
                            context9 = this.context;
                            radarState42.setGeofenceIds$sdk_release(context9, linkedHashSet4);
                            RadarPlace place2 = fromJson3.getPlace();
                            if (place2 == null) {
                            }
                            RadarState radarState52 = RadarState.INSTANCE;
                            context10 = this.context;
                            radarState52.setPlaceId$sdk_release(context10, str);
                            LinkedHashSet linkedHashSet22 = new LinkedHashSet();
                            country = fromJson3.getCountry();
                            if (country != null) {
                            }
                            state = fromJson3.getState();
                            if (state != null) {
                            }
                            dma = fromJson3.getDma();
                            if (dma != null) {
                            }
                            postalCode = fromJson3.getPostalCode();
                            if (postalCode != null) {
                            }
                            RadarState radarState62 = RadarState.INSTANCE;
                            context11 = this.context;
                            radarState62.setRegionIds$sdk_release(context11, linkedHashSet22);
                            LinkedHashSet linkedHashSet32 = new LinkedHashSet();
                            beacons2 = fromJson3.getBeacons();
                            if (beacons2 != null) {
                            }
                            RadarState radarState72 = RadarState.INSTANCE;
                            context12 = this.context;
                            radarState72.setBeaconIds$sdk_release(context12, linkedHashSet32);
                        } else {
                            z3 = true;
                        }
                        if (fromJson2 != null && fromJson3 != null) {
                            RadarSettings radarSettings2 = RadarSettings.INSTANCE;
                            context4 = this.context;
                            radarSettings2.setId$sdk_release(context4, fromJson3.get_id());
                            if (fromJson3.getTrip() == null) {
                                RadarSettings radarSettings3 = RadarSettings.INSTANCE;
                                context6 = this.context;
                                if (radarSettings3.getTripOptions$sdk_release(context6) != null) {
                                    Radar.INSTANCE.getLocationManager$sdk_release().restartPreviousTrackingOptions$sdk_release();
                                    RadarSettings radarSettings4 = RadarSettings.INSTANCE;
                                    context7 = this.context;
                                    radarSettings4.setTripOptions$sdk_release(context7, null);
                                }
                            }
                            RadarSettings radarSettings5 = RadarSettings.INSTANCE;
                            context5 = this.context;
                            radarSettings5.setUserDebug$sdk_release(context5, fromJson3.getDebug());
                            Radar.INSTANCE.sendLocation$sdk_release(location, fromJson3);
                            if (!(fromJson2.length == 0 ? z3 : false)) {
                                Radar.INSTANCE.sendEvents$sdk_release(fromJson2, fromJson3);
                            }
                            if (fromJson5 != null) {
                                Radar.INSTANCE.sendToken$sdk_release(fromJson5);
                            }
                            JSONArray optJSONArray3 = res.optJSONArray("inAppMessages");
                            RadarInAppMessage[] fromJsonArray = optJSONArray3 != null ? RadarInAppMessage.INSTANCE.fromJsonArray(optJSONArray3) : null;
                            if (fromJsonArray != null) {
                                Radar.INSTANCE.showInAppMessages$sdk_release(fromJsonArray);
                            }
                            RadarEvent[] radarEventArr = fromJson2;
                            RadarApiClient.RadarTrackApiCallback radarTrackApiCallback2 = callback;
                            if (radarTrackApiCallback2 != null) {
                                radarTrackApiCallback2.onComplete(Radar.RadarStatus.SUCCESS, res, radarEventArr, fromJson3, fromJson4, fromJson, fromJson5);
                                return;
                            }
                            return;
                        }
                        Radar.sendError$sdk_release$default(Radar.INSTANCE, status, null, 2, null);
                        RadarApiClient.RadarTrackApiCallback radarTrackApiCallback3 = callback;
                        if (radarTrackApiCallback3 != null) {
                            RadarApiClient.RadarTrackApiCallback.DefaultImpls.onComplete$default(radarTrackApiCallback3, Radar.RadarStatus.ERROR_SERVER, null, null, null, null, null, null, 126, null);
                        }
                    }
                }, z2, false, !z2, verified, null, 2048, null);
            }
        } catch (JSONException unused3) {
            if (callback != null) {
                RadarTrackApiCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_BAD_REQUEST, null, null, null, null, null, null, 126, null);
            }
        }
    }

    public static /* synthetic */ void verifyEvent$sdk_release$default(RadarApiClient radarApiClient, String str, RadarEvent.RadarEventVerification radarEventVerification, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        radarApiClient.verifyEvent$sdk_release(str, radarEventVerification, str2);
    }

    public final void verifyEvent$sdk_release(String eventId, RadarEvent.RadarEventVerification verification, String verifiedPlaceId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(verification, "verification");
        String publishableKey$sdk_release = RadarSettings.INSTANCE.getPublishableKey$sdk_release(this.context);
        if (publishableKey$sdk_release == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("verification", verification);
        jSONObject.putOpt("verifiedPlaceId", verifiedPlaceId);
        RadarApiHelper.request$sdk_release$default(this.apiHelper, this.context, "PUT", "v1/events/" + eventId + "/verification", headers(publishableKey$sdk_release), jSONObject, false, null, false, false, false, false, null, 4032, null);
    }

    public final void createTrip$sdk_release(RadarTripOptions options, final RadarTripApiCallback callback) {
        String publishableKey$sdk_release = RadarSettings.INSTANCE.getPublishableKey$sdk_release(this.context);
        if (publishableKey$sdk_release == null) {
            if (callback != null) {
                RadarTripApiCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_PUBLISHABLE_KEY, null, null, null, 14, null);
                return;
            }
            return;
        }
        String externalId = options != null ? options.getExternalId() : null;
        if (externalId == null) {
            if (callback != null) {
                RadarTripApiCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_BAD_REQUEST, null, null, null, 14, null);
                return;
            }
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("userId", RadarSettings.INSTANCE.getUserId$sdk_release(this.context));
        jSONObject.putOpt(RadarTripOptions.KEY_EXTERNAL_ID, externalId);
        if (options.getMetadata() != null) {
            jSONObject.putOpt("metadata", options.getMetadata());
        }
        if (options.getDestinationGeofenceTag() != null) {
            jSONObject.putOpt(RadarTripOptions.KEY_DESTINATION_GEOFENCE_TAG, options.getDestinationGeofenceTag());
        }
        if (options.getDestinationGeofenceExternalId() != null) {
            jSONObject.putOpt(RadarTripOptions.KEY_DESTINATION_GEOFENCE_EXTERNAL_ID, options.getDestinationGeofenceExternalId());
        }
        jSONObject.putOpt("mode", Radar.stringForMode(options.getMode()));
        jSONObject.putOpt(RadarTripOptions.KEY_SCHEDULED_ARRIVAL_AT, RadarUtils.INSTANCE.dateToISOString$sdk_release(options.getScheduledArrivalAt()));
        if (options.getApproachingThreshold() > 0) {
            jSONObject.put(RadarTripOptions.KEY_APPROACHING_THRESHOLD, options.getApproachingThreshold());
        }
        RadarApiHelper.request$sdk_release$default(this.apiHelper, this.context, "POST", "v1/trips", headers(publishableKey$sdk_release), jSONObject, false, new RadarApiHelper.RadarApiCallback() { // from class: io.radar.sdk.RadarApiClient$createTrip$1
            @Override // io.radar.sdk.RadarApiHelper.RadarApiCallback
            public void onComplete(Radar.RadarStatus status, JSONObject res) {
                Intrinsics.checkNotNullParameter(status, "status");
                if (status != Radar.RadarStatus.SUCCESS || res == null) {
                    RadarApiClient.RadarTripApiCallback radarTripApiCallback = RadarApiClient.RadarTripApiCallback.this;
                    if (radarTripApiCallback != null) {
                        RadarApiClient.RadarTripApiCallback.DefaultImpls.onComplete$default(radarTripApiCallback, status, null, null, null, 14, null);
                        return;
                    }
                    return;
                }
                JSONObject optJSONObject = res.optJSONObject("trip");
                RadarTrip fromJson = optJSONObject != null ? RadarTrip.INSTANCE.fromJson(optJSONObject) : null;
                JSONArray optJSONArray = res.optJSONArray("events");
                RadarEvent[] fromJson2 = optJSONArray != null ? RadarEvent.INSTANCE.fromJson(optJSONArray) : null;
                if (fromJson2 != null) {
                    if (!(fromJson2.length == 0)) {
                        Radar.sendEvents$sdk_release$default(Radar.INSTANCE, fromJson2, null, 2, null);
                    }
                }
                RadarApiClient.RadarTripApiCallback radarTripApiCallback2 = RadarApiClient.RadarTripApiCallback.this;
                if (radarTripApiCallback2 != null) {
                    radarTripApiCallback2.onComplete(Radar.RadarStatus.SUCCESS, res, fromJson, fromJson2);
                }
            }
        }, false, false, false, false, null, Utf8.MASK_2BYTES, null);
    }

    public final void updateTrip$sdk_release(RadarTripOptions options, RadarTrip.RadarTripStatus status, final RadarTripApiCallback callback) {
        String publishableKey$sdk_release = RadarSettings.INSTANCE.getPublishableKey$sdk_release(this.context);
        if (publishableKey$sdk_release == null) {
            if (callback != null) {
                RadarTripApiCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_PUBLISHABLE_KEY, null, null, null, 14, null);
                return;
            }
            return;
        }
        String externalId = options != null ? options.getExternalId() : null;
        if (externalId == null) {
            if (callback != null) {
                RadarTripApiCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_BAD_REQUEST, null, null, null, 14, null);
                return;
            }
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("userId", RadarSettings.INSTANCE.getUserId$sdk_release(this.context));
        if (status != null && status != RadarTrip.RadarTripStatus.UNKNOWN) {
            jSONObject.putOpt("status", Radar.stringForTripStatus(status));
        }
        if (options.getMetadata() != null) {
            jSONObject.putOpt("metadata", options.getMetadata());
        }
        if (options.getDestinationGeofenceTag() != null) {
            jSONObject.putOpt(RadarTripOptions.KEY_DESTINATION_GEOFENCE_TAG, options.getDestinationGeofenceTag());
        }
        if (options.getDestinationGeofenceExternalId() != null) {
            jSONObject.putOpt(RadarTripOptions.KEY_DESTINATION_GEOFENCE_EXTERNAL_ID, options.getDestinationGeofenceExternalId());
        }
        jSONObject.putOpt("mode", Radar.stringForMode(options.getMode()));
        jSONObject.putOpt(RadarTripOptions.KEY_SCHEDULED_ARRIVAL_AT, RadarUtils.INSTANCE.dateToISOString$sdk_release(options.getScheduledArrivalAt()));
        if (options.getApproachingThreshold() > 0) {
            jSONObject.put(RadarTripOptions.KEY_APPROACHING_THRESHOLD, options.getApproachingThreshold());
        }
        RadarApiHelper.request$sdk_release$default(this.apiHelper, this.context, "PATCH", "v1/trips/" + externalId + "/update", headers(publishableKey$sdk_release), jSONObject, false, new RadarApiHelper.RadarApiCallback() { // from class: io.radar.sdk.RadarApiClient$updateTrip$1
            @Override // io.radar.sdk.RadarApiHelper.RadarApiCallback
            public void onComplete(Radar.RadarStatus status2, JSONObject res) {
                Intrinsics.checkNotNullParameter(status2, "status");
                if (status2 != Radar.RadarStatus.SUCCESS || res == null) {
                    RadarApiClient.RadarTripApiCallback radarTripApiCallback = RadarApiClient.RadarTripApiCallback.this;
                    if (radarTripApiCallback != null) {
                        RadarApiClient.RadarTripApiCallback.DefaultImpls.onComplete$default(radarTripApiCallback, status2, null, null, null, 14, null);
                        return;
                    }
                    return;
                }
                JSONObject optJSONObject = res.optJSONObject("trip");
                RadarTrip fromJson = optJSONObject != null ? RadarTrip.INSTANCE.fromJson(optJSONObject) : null;
                JSONArray optJSONArray = res.optJSONArray("events");
                RadarEvent[] fromJson2 = optJSONArray != null ? RadarEvent.INSTANCE.fromJson(optJSONArray) : null;
                if (fromJson2 != null) {
                    if (!(fromJson2.length == 0)) {
                        Radar.sendEvents$sdk_release$default(Radar.INSTANCE, fromJson2, null, 2, null);
                    }
                }
                RadarApiClient.RadarTripApiCallback radarTripApiCallback2 = RadarApiClient.RadarTripApiCallback.this;
                if (radarTripApiCallback2 != null) {
                    radarTripApiCallback2.onComplete(Radar.RadarStatus.SUCCESS, res, fromJson, fromJson2);
                }
            }
        }, false, false, false, false, null, Utf8.MASK_2BYTES, null);
    }

    public final void getContext$sdk_release(Location location, final RadarContextApiCallback callback) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String publishableKey$sdk_release = RadarSettings.INSTANCE.getPublishableKey$sdk_release(this.context);
        if (publishableKey$sdk_release == null) {
            RadarContextApiCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("coordinates=" + location.getLatitude() + AbstractJsonLexerKt.COMMA + location.getLongitude());
        StringBuilder sb2 = new StringBuilder("v1/context?");
        sb2.append((Object) sb);
        RadarApiHelper.request$sdk_release$default(this.apiHelper, this.context, "GET", sb2.toString(), headers(publishableKey$sdk_release), null, false, new RadarApiHelper.RadarApiCallback() { // from class: io.radar.sdk.RadarApiClient$getContext$1
            @Override // io.radar.sdk.RadarApiHelper.RadarApiCallback
            public void onComplete(Radar.RadarStatus status, JSONObject res) {
                Intrinsics.checkNotNullParameter(status, "status");
                if (status != Radar.RadarStatus.SUCCESS || res == null) {
                    RadarApiClient.RadarContextApiCallback.DefaultImpls.onComplete$default(RadarApiClient.RadarContextApiCallback.this, status, null, null, 6, null);
                    return;
                }
                JSONObject optJSONObject = res.optJSONObject("context");
                RadarContext fromJson = optJSONObject != null ? RadarContext.INSTANCE.fromJson(optJSONObject) : null;
                if (fromJson != null) {
                    RadarApiClient.RadarContextApiCallback.this.onComplete(Radar.RadarStatus.SUCCESS, res, fromJson);
                } else {
                    RadarApiClient.RadarContextApiCallback.DefaultImpls.onComplete$default(RadarApiClient.RadarContextApiCallback.this, Radar.RadarStatus.ERROR_SERVER, null, null, 6, null);
                }
            }
        }, false, false, false, false, null, Utf8.MASK_2BYTES, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0167 A[LOOP:0: B:41:0x0161->B:43:0x0167, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void searchPlaces$sdk_release(Location location, int radius, String[] chains, Map<String, String> chainMetadata, String[] categories, String[] groups, String[] countryCodes, Integer limit, final RadarSearchPlacesApiCallback callback) {
        boolean z;
        Set<Map.Entry<String, String>> entrySet;
        Iterator<T> it;
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String publishableKey$sdk_release = RadarSettings.INSTANCE.getPublishableKey$sdk_release(this.context);
        if (publishableKey$sdk_release == null) {
            RadarSearchPlacesApiCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("near=" + location.getLatitude() + AbstractJsonLexerKt.COMMA + location.getLongitude());
        StringBuilder sb2 = new StringBuilder("&radius=");
        sb2.append(radius);
        sb.append(sb2.toString());
        sb.append("&limit=" + limit);
        if (chains != null) {
            if (!(chains.length == 0)) {
                StringBuilder sb3 = new StringBuilder("&chains=");
                z = true;
                sb3.append(ArraysKt.joinToString$default(chains, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
                sb.append(sb3.toString());
                if (categories != null) {
                    if ((!(categories.length == 0 ? z : false)) == z) {
                        sb.append("&categories=" + ArraysKt.joinToString$default(categories, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
                    }
                }
                if (groups != null) {
                    if (!(groups.length == 0)) {
                        sb.append("&groups=" + ArraysKt.joinToString$default(groups, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
                    }
                }
                if (countryCodes != null) {
                    if (!(countryCodes.length == 0)) {
                        sb.append("&country=" + ArraysKt.joinToString$default(countryCodes, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
                    }
                }
                if (chainMetadata != null && (entrySet = chainMetadata.entrySet()) != null) {
                    it = entrySet.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        sb.append("&chainMetadata[" + ((String) entry.getKey()) + "]=\"" + ((String) entry.getValue()) + '\"');
                    }
                }
                RadarApiHelper.request$sdk_release$default(this.apiHelper, this.context, "GET", "v1/search/places?" + ((Object) sb), headers(publishableKey$sdk_release), null, false, new RadarApiHelper.RadarApiCallback() { // from class: io.radar.sdk.RadarApiClient$searchPlaces$2
                    @Override // io.radar.sdk.RadarApiHelper.RadarApiCallback
                    public void onComplete(Radar.RadarStatus status, JSONObject res) {
                        Intrinsics.checkNotNullParameter(status, "status");
                        if (status != Radar.RadarStatus.SUCCESS || res == null) {
                            RadarApiClient.RadarSearchPlacesApiCallback.DefaultImpls.onComplete$default(RadarApiClient.RadarSearchPlacesApiCallback.this, status, null, null, 6, null);
                            return;
                        }
                        JSONArray optJSONArray = res.optJSONArray("places");
                        RadarPlace[] fromJson = optJSONArray != null ? RadarPlace.INSTANCE.fromJson(optJSONArray) : null;
                        if (fromJson != null) {
                            RadarApiClient.RadarSearchPlacesApiCallback.this.onComplete(Radar.RadarStatus.SUCCESS, res, fromJson);
                        } else {
                            RadarApiClient.RadarSearchPlacesApiCallback.DefaultImpls.onComplete$default(RadarApiClient.RadarSearchPlacesApiCallback.this, Radar.RadarStatus.ERROR_SERVER, null, null, 6, null);
                        }
                    }
                }, false, false, false, false, null, Utf8.MASK_2BYTES, null);
            }
        }
        z = true;
        if (categories != null) {
        }
        if (groups != null) {
        }
        if (countryCodes != null) {
        }
        if (chainMetadata != null) {
            it = entrySet.iterator();
            while (it.hasNext()) {
            }
        }
        RadarApiHelper.request$sdk_release$default(this.apiHelper, this.context, "GET", "v1/search/places?" + ((Object) sb), headers(publishableKey$sdk_release), null, false, new RadarApiHelper.RadarApiCallback() { // from class: io.radar.sdk.RadarApiClient$searchPlaces$2
            @Override // io.radar.sdk.RadarApiHelper.RadarApiCallback
            public void onComplete(Radar.RadarStatus status, JSONObject res) {
                Intrinsics.checkNotNullParameter(status, "status");
                if (status != Radar.RadarStatus.SUCCESS || res == null) {
                    RadarApiClient.RadarSearchPlacesApiCallback.DefaultImpls.onComplete$default(RadarApiClient.RadarSearchPlacesApiCallback.this, status, null, null, 6, null);
                    return;
                }
                JSONArray optJSONArray = res.optJSONArray("places");
                RadarPlace[] fromJson = optJSONArray != null ? RadarPlace.INSTANCE.fromJson(optJSONArray) : null;
                if (fromJson != null) {
                    RadarApiClient.RadarSearchPlacesApiCallback.this.onComplete(Radar.RadarStatus.SUCCESS, res, fromJson);
                } else {
                    RadarApiClient.RadarSearchPlacesApiCallback.DefaultImpls.onComplete$default(RadarApiClient.RadarSearchPlacesApiCallback.this, Radar.RadarStatus.ERROR_SERVER, null, null, 6, null);
                }
            }
        }, false, false, false, false, null, Utf8.MASK_2BYTES, null);
    }

    public final void searchGeofences$sdk_release(Location location, Integer radius, String[] tags, JSONObject metadata, Integer limit, Boolean includeGeometry, final RadarSearchGeofencesApiCallback callback) {
        Iterator<String> keys;
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String publishableKey$sdk_release = RadarSettings.INSTANCE.getPublishableKey$sdk_release(this.context);
        if (publishableKey$sdk_release == null) {
            RadarSearchGeofencesApiCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("near=" + location.getLatitude() + AbstractJsonLexerKt.COMMA + location.getLongitude());
        if (radius != null) {
            sb.append("&radius=" + radius);
        }
        sb.append("&limit=" + limit);
        if (tags != null) {
            if (!(tags.length == 0)) {
                sb.append("&tags=" + ArraysKt.joinToString$default(tags, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
            }
        }
        if (metadata != null && (keys = metadata.keys()) != null) {
            while (keys.hasNext()) {
                String next = keys.next();
                sb.append("&metadata[" + next + "]=" + metadata.get(next));
            }
        }
        if (includeGeometry != null) {
            sb.append("&includeGeometry=" + includeGeometry);
        }
        RadarApiHelper.request$sdk_release$default(this.apiHelper, this.context, "GET", "v1/search/geofences?" + ((Object) sb), headers(publishableKey$sdk_release), null, false, new RadarApiHelper.RadarApiCallback() { // from class: io.radar.sdk.RadarApiClient$searchGeofences$2
            @Override // io.radar.sdk.RadarApiHelper.RadarApiCallback
            public void onComplete(Radar.RadarStatus status, JSONObject res) {
                Intrinsics.checkNotNullParameter(status, "status");
                if (status != Radar.RadarStatus.SUCCESS || res == null) {
                    RadarApiClient.RadarSearchGeofencesApiCallback.DefaultImpls.onComplete$default(RadarApiClient.RadarSearchGeofencesApiCallback.this, status, null, null, 6, null);
                    return;
                }
                JSONArray optJSONArray = res.optJSONArray("geofences");
                RadarGeofence[] fromJson = optJSONArray != null ? RadarGeofence.INSTANCE.fromJson(optJSONArray) : null;
                if (fromJson != null) {
                    RadarApiClient.RadarSearchGeofencesApiCallback.this.onComplete(Radar.RadarStatus.SUCCESS, res, fromJson);
                } else {
                    RadarApiClient.RadarSearchGeofencesApiCallback.DefaultImpls.onComplete$default(RadarApiClient.RadarSearchGeofencesApiCallback.this, Radar.RadarStatus.ERROR_SERVER, null, null, 6, null);
                }
            }
        }, false, false, false, false, null, Utf8.MASK_2BYTES, null);
    }

    public final void searchBeacons$sdk_release(Location location, int radius, Integer limit, final RadarSearchBeaconsApiCallback callback, boolean cache) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String publishableKey$sdk_release = RadarSettings.INSTANCE.getPublishableKey$sdk_release(this.context);
        if (publishableKey$sdk_release == null) {
            RadarSearchBeaconsApiCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_PUBLISHABLE_KEY, null, null, null, null, 30, null);
            return;
        }
        if (cache && Build.VERSION.SDK_INT >= 26) {
            RadarBeacon[] lastBeacons$sdk_release = RadarState.INSTANCE.getLastBeacons$sdk_release(this.context);
            String[] lastBeaconUUIDs$sdk_release = RadarState.INSTANCE.getLastBeaconUUIDs$sdk_release(this.context);
            String[] lastBeaconUIDs$sdk_release = RadarState.INSTANCE.getLastBeaconUIDs$sdk_release(this.context);
            RadarLogger radarLogger = this.logger;
            StringBuilder sb = new StringBuilder("Using cached search beacons response | lastBeaconUUIDs = ");
            sb.append(lastBeaconUUIDs$sdk_release != null ? ArraysKt.joinToString$default(lastBeaconUUIDs$sdk_release, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) : null);
            sb.append("; lastBeaconUIDs = ");
            sb.append(lastBeaconUIDs$sdk_release != null ? ArraysKt.joinToString$default(lastBeaconUIDs$sdk_release, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) : null);
            RadarLogger.d$default(radarLogger, sb.toString(), null, null, 6, null);
            callback.onComplete(Radar.RadarStatus.SUCCESS, null, lastBeacons$sdk_release, lastBeaconUUIDs$sdk_release, lastBeaconUIDs$sdk_release);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("near=" + location.getLatitude() + AbstractJsonLexerKt.COMMA + location.getLongitude());
        StringBuilder sb3 = new StringBuilder("&radius=");
        sb3.append(radius);
        sb2.append(sb3.toString());
        sb2.append("&limit=" + limit);
        sb2.append("&installId=" + RadarSettings.INSTANCE.getInstallId$sdk_release(this.context));
        RadarApiHelper.request$sdk_release$default(this.apiHelper, this.context, "GET", "v1/search/beacons?" + ((Object) sb2), headers(publishableKey$sdk_release), null, false, new RadarApiHelper.RadarApiCallback() { // from class: io.radar.sdk.RadarApiClient$searchBeacons$1
            @Override // io.radar.sdk.RadarApiHelper.RadarApiCallback
            public void onComplete(Radar.RadarStatus status, JSONObject res) {
                String[] strArr;
                String[] strArr2;
                Context context;
                Context context2;
                Context context3;
                String[] strArr3;
                Context context4;
                Context context5;
                Context context6;
                JSONObject optJSONObject;
                JSONObject optJSONObject2;
                JSONArray optJSONArray;
                JSONObject optJSONObject3;
                JSONObject optJSONObject4;
                JSONArray optJSONArray2;
                Intrinsics.checkNotNullParameter(status, "status");
                RadarBeacon[] radarBeaconArr = null;
                r3 = null;
                r3 = null;
                r3 = null;
                String[] strArr4 = null;
                if (status != Radar.RadarStatus.SUCCESS || res == null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        RadarState radarState = RadarState.INSTANCE;
                        context = RadarApiClient.this.context;
                        radarBeaconArr = radarState.getLastBeacons$sdk_release(context);
                        RadarState radarState2 = RadarState.INSTANCE;
                        context2 = RadarApiClient.this.context;
                        String[] lastBeaconUUIDs$sdk_release2 = radarState2.getLastBeaconUUIDs$sdk_release(context2);
                        RadarState radarState3 = RadarState.INSTANCE;
                        context3 = RadarApiClient.this.context;
                        strArr = lastBeaconUUIDs$sdk_release2;
                        strArr2 = radarState3.getLastBeaconUIDs$sdk_release(context3);
                    } else {
                        strArr = null;
                        strArr2 = null;
                    }
                    callback.onComplete(status, res, radarBeaconArr, strArr, strArr2);
                    return;
                }
                JSONArray optJSONArray3 = res.optJSONArray(RadarTrackingOptions.KEY_BEACONS);
                RadarBeacon[] fromJson = optJSONArray3 != null ? RadarBeacon.INSTANCE.fromJson(optJSONArray3) : null;
                JSONObject optJSONObject5 = res.optJSONObject("meta");
                if (optJSONObject5 == null || (optJSONObject3 = optJSONObject5.optJSONObject("settings")) == null || (optJSONObject4 = optJSONObject3.optJSONObject(RadarTrackingOptions.KEY_BEACONS)) == null || (optJSONArray2 = optJSONObject4.optJSONArray("uuids")) == null) {
                    strArr3 = null;
                } else {
                    int length = optJSONArray2.length();
                    String[] strArr5 = new String[length];
                    for (int i = 0; i < length; i++) {
                        strArr5[i] = optJSONArray2.getString(i);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < length; i2++) {
                        String str = strArr5[i2];
                        Intrinsics.checkNotNull(str);
                        if (str.length() > 0) {
                            arrayList.add(str);
                        }
                    }
                    strArr3 = (String[]) arrayList.toArray(new String[0]);
                }
                JSONObject optJSONObject6 = res.optJSONObject("meta");
                if (optJSONObject6 != null && (optJSONObject = optJSONObject6.optJSONObject("settings")) != null && (optJSONObject2 = optJSONObject.optJSONObject(RadarTrackingOptions.KEY_BEACONS)) != null && (optJSONArray = optJSONObject2.optJSONArray("uids")) != null) {
                    int length2 = optJSONArray.length();
                    String[] strArr6 = new String[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        strArr6[i3] = optJSONArray.getString(i3);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i4 = 0; i4 < length2; i4++) {
                        String str2 = strArr6[i4];
                        Intrinsics.checkNotNull(str2);
                        if (str2.length() > 0) {
                            arrayList2.add(str2);
                        }
                    }
                    strArr4 = (String[]) arrayList2.toArray(new String[0]);
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    RadarState radarState4 = RadarState.INSTANCE;
                    context4 = RadarApiClient.this.context;
                    radarState4.setLastBeacons$sdk_release(context4, fromJson);
                    RadarState radarState5 = RadarState.INSTANCE;
                    context5 = RadarApiClient.this.context;
                    radarState5.setLastBeaconUUIDs$sdk_release(context5, strArr3);
                    RadarState radarState6 = RadarState.INSTANCE;
                    context6 = RadarApiClient.this.context;
                    radarState6.setLastBeaconUIDs$sdk_release(context6, strArr4);
                }
                callback.onComplete(Radar.RadarStatus.SUCCESS, res, fromJson, strArr3, strArr4);
            }
        }, false, false, false, false, null, Utf8.MASK_2BYTES, null);
    }

    public static /* synthetic */ void autocomplete$sdk_release$default(RadarApiClient radarApiClient, String str, Location location, String[] strArr, Integer num, String str2, Boolean bool, RadarGeocodeApiCallback radarGeocodeApiCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            location = null;
        }
        if ((i & 4) != 0) {
            strArr = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            bool = null;
        }
        radarApiClient.autocomplete$sdk_release(str, location, strArr, num, str2, bool, radarGeocodeApiCallback);
    }

    public final void autocomplete$sdk_release(String query, Location near, String[] layers, Integer limit, String country, Boolean mailable, final RadarGeocodeApiCallback callback) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String publishableKey$sdk_release = RadarSettings.INSTANCE.getPublishableKey$sdk_release(this.context);
        if (publishableKey$sdk_release == null) {
            RadarGeocodeApiCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("query=" + query);
        if (near != null) {
            sb.append("&near=" + near.getLatitude() + AbstractJsonLexerKt.COMMA + near.getLongitude());
        }
        if (layers != null) {
            if (!(layers.length == 0)) {
                sb.append("&layers=" + ArraysKt.joinToString$default(layers, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
            }
        }
        sb.append("&limit=" + limit);
        if (country != null) {
            sb.append("&country=" + country);
        }
        if (mailable != null) {
            sb.append("&mailable=" + mailable);
        }
        RadarApiHelper.request$sdk_release$default(this.apiHelper, this.context, "GET", "v1/search/autocomplete?" + ((Object) sb), headers(publishableKey$sdk_release), null, false, new RadarApiHelper.RadarApiCallback() { // from class: io.radar.sdk.RadarApiClient$autocomplete$1
            @Override // io.radar.sdk.RadarApiHelper.RadarApiCallback
            public void onComplete(Radar.RadarStatus status, JSONObject res) {
                Intrinsics.checkNotNullParameter(status, "status");
                if (status != Radar.RadarStatus.SUCCESS || res == null) {
                    RadarApiClient.RadarGeocodeApiCallback.DefaultImpls.onComplete$default(RadarApiClient.RadarGeocodeApiCallback.this, status, null, null, 6, null);
                    return;
                }
                JSONArray optJSONArray = res.optJSONArray("addresses");
                RadarAddress[] fromJson = optJSONArray != null ? RadarAddress.INSTANCE.fromJson(optJSONArray) : null;
                if (fromJson != null) {
                    RadarApiClient.RadarGeocodeApiCallback.this.onComplete(Radar.RadarStatus.SUCCESS, res, fromJson);
                } else {
                    RadarApiClient.RadarGeocodeApiCallback.DefaultImpls.onComplete$default(RadarApiClient.RadarGeocodeApiCallback.this, Radar.RadarStatus.ERROR_SERVER, null, null, 6, null);
                }
            }
        }, false, false, false, false, null, Utf8.MASK_2BYTES, null);
    }

    public final void validateAddress$sdk_release(RadarAddress address, final RadarValidateAddressAPICallback callback) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String publishableKey$sdk_release = RadarSettings.INSTANCE.getPublishableKey$sdk_release(this.context);
        if (publishableKey$sdk_release == null) {
            RadarValidateAddressAPICallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_PUBLISHABLE_KEY, null, null, null, 14, null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("countryCode=" + address.getCountryCode());
        sb.append("&stateCode=" + address.getStateCode());
        sb.append("&city=" + address.getCity());
        sb.append("&postalCode=" + address.getPostalCode());
        if (address.getNumber() != null) {
            sb.append("&number=" + address.getNumber());
        }
        if (address.getStreet() != null) {
            sb.append("&street=" + address.getStreet());
        }
        if (address.getUnit() != null) {
            sb.append("&unit=" + address.getUnit());
        }
        if (address.getAddressLabel() != null) {
            sb.append("&addressLabel=" + address.getAddressLabel());
        }
        RadarApiHelper.request$sdk_release$default(this.apiHelper, this.context, "GET", "v1/addresses/validate?" + ((Object) sb), headers(publishableKey$sdk_release), null, false, new RadarApiHelper.RadarApiCallback() { // from class: io.radar.sdk.RadarApiClient$validateAddress$1
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
            java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
             */
            /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
            @Override // io.radar.sdk.RadarApiHelper.RadarApiCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onComplete(Radar.RadarStatus status, JSONObject res) {
                Radar.RadarAddressVerificationStatus radarAddressVerificationStatus;
                Intrinsics.checkNotNullParameter(status, "status");
                if (status != Radar.RadarStatus.SUCCESS || res == null) {
                    RadarApiClient.RadarValidateAddressAPICallback.DefaultImpls.onComplete$default(RadarApiClient.RadarValidateAddressAPICallback.this, status, null, null, null, 14, null);
                    return;
                }
                JSONObject optJSONObject = res.optJSONObject("address");
                RadarAddress fromJson = optJSONObject != null ? RadarAddress.INSTANCE.fromJson(optJSONObject) : null;
                JSONObject optJSONObject2 = res.optJSONObject("result");
                String optString = optJSONObject2 != null ? optJSONObject2.optString("verificationStatus") : null;
                if (optString != null) {
                    switch (optString.hashCode()) {
                        case -1994383672:
                            if (optString.equals("verified")) {
                                radarAddressVerificationStatus = Radar.RadarAddressVerificationStatus.VERIFIED;
                                break;
                            }
                            break;
                        case -468155295:
                            if (optString.equals("unverified")) {
                                radarAddressVerificationStatus = Radar.RadarAddressVerificationStatus.UNVERIFIED;
                                break;
                            }
                            break;
                        case 1442827226:
                            if (optString.equals("partially verified")) {
                                radarAddressVerificationStatus = Radar.RadarAddressVerificationStatus.PARTIALLY_VERIFIED;
                                break;
                            }
                            break;
                        case 1644168716:
                            if (optString.equals("ambiguous")) {
                                radarAddressVerificationStatus = Radar.RadarAddressVerificationStatus.AMBIGUOUS;
                                break;
                            }
                            break;
                    }
                    if (fromJson == null) {
                        RadarApiClient.RadarValidateAddressAPICallback.this.onComplete(Radar.RadarStatus.SUCCESS, res, fromJson, radarAddressVerificationStatus);
                        return;
                    } else {
                        RadarApiClient.RadarValidateAddressAPICallback.DefaultImpls.onComplete$default(RadarApiClient.RadarValidateAddressAPICallback.this, Radar.RadarStatus.ERROR_SERVER, null, null, null, 14, null);
                        return;
                    }
                }
                radarAddressVerificationStatus = Radar.RadarAddressVerificationStatus.NONE;
                if (fromJson == null) {
                }
            }
        }, false, false, false, false, null, Utf8.MASK_2BYTES, null);
    }

    public static /* synthetic */ void geocode$sdk_release$default(RadarApiClient radarApiClient, String str, String[] strArr, String[] strArr2, RadarGeocodeApiCallback radarGeocodeApiCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            strArr = null;
        }
        if ((i & 4) != 0) {
            strArr2 = null;
        }
        radarApiClient.geocode$sdk_release(str, strArr, strArr2, radarGeocodeApiCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void geocode$sdk_release(String query, String[] layers, String[] countries, final RadarGeocodeApiCallback callback) {
        CharSequence charSequence;
        boolean z;
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String publishableKey$sdk_release = RadarSettings.INSTANCE.getPublishableKey$sdk_release(this.context);
        if (publishableKey$sdk_release == null) {
            RadarGeocodeApiCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("query=" + query);
        if (layers != null) {
            if (!(layers.length == 0)) {
                StringBuilder sb2 = new StringBuilder("&layers=");
                charSequence = ",";
                z = true;
                sb2.append(ArraysKt.joinToString$default(layers, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
                sb.append(sb2.toString());
                if (countries != null) {
                    if ((!(countries.length == 0 ? z : false)) == z) {
                        sb.append("&country=" + ArraysKt.joinToString$default(countries, charSequence, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
                    }
                }
                RadarApiHelper.request$sdk_release$default(this.apiHelper, this.context, "GET", "v1/geocode/forward?" + ((Object) sb), headers(publishableKey$sdk_release), null, false, new RadarApiHelper.RadarApiCallback() { // from class: io.radar.sdk.RadarApiClient$geocode$1
                    @Override // io.radar.sdk.RadarApiHelper.RadarApiCallback
                    public void onComplete(Radar.RadarStatus status, JSONObject res) {
                        Intrinsics.checkNotNullParameter(status, "status");
                        if (status != Radar.RadarStatus.SUCCESS || res == null) {
                            RadarApiClient.RadarGeocodeApiCallback.DefaultImpls.onComplete$default(RadarApiClient.RadarGeocodeApiCallback.this, status, null, null, 6, null);
                            return;
                        }
                        JSONArray optJSONArray = res.optJSONArray("addresses");
                        RadarAddress[] fromJson = optJSONArray != null ? RadarAddress.INSTANCE.fromJson(optJSONArray) : null;
                        if (fromJson != null) {
                            RadarApiClient.RadarGeocodeApiCallback.this.onComplete(Radar.RadarStatus.SUCCESS, res, fromJson);
                        } else {
                            RadarApiClient.RadarGeocodeApiCallback.DefaultImpls.onComplete$default(RadarApiClient.RadarGeocodeApiCallback.this, Radar.RadarStatus.ERROR_SERVER, null, null, 6, null);
                        }
                    }
                }, false, false, false, false, null, Utf8.MASK_2BYTES, null);
            }
        }
        charSequence = ",";
        z = true;
        if (countries != null) {
        }
        RadarApiHelper.request$sdk_release$default(this.apiHelper, this.context, "GET", "v1/geocode/forward?" + ((Object) sb), headers(publishableKey$sdk_release), null, false, new RadarApiHelper.RadarApiCallback() { // from class: io.radar.sdk.RadarApiClient$geocode$1
            @Override // io.radar.sdk.RadarApiHelper.RadarApiCallback
            public void onComplete(Radar.RadarStatus status, JSONObject res) {
                Intrinsics.checkNotNullParameter(status, "status");
                if (status != Radar.RadarStatus.SUCCESS || res == null) {
                    RadarApiClient.RadarGeocodeApiCallback.DefaultImpls.onComplete$default(RadarApiClient.RadarGeocodeApiCallback.this, status, null, null, 6, null);
                    return;
                }
                JSONArray optJSONArray = res.optJSONArray("addresses");
                RadarAddress[] fromJson = optJSONArray != null ? RadarAddress.INSTANCE.fromJson(optJSONArray) : null;
                if (fromJson != null) {
                    RadarApiClient.RadarGeocodeApiCallback.this.onComplete(Radar.RadarStatus.SUCCESS, res, fromJson);
                } else {
                    RadarApiClient.RadarGeocodeApiCallback.DefaultImpls.onComplete$default(RadarApiClient.RadarGeocodeApiCallback.this, Radar.RadarStatus.ERROR_SERVER, null, null, 6, null);
                }
            }
        }, false, false, false, false, null, Utf8.MASK_2BYTES, null);
    }

    public static /* synthetic */ void reverseGeocode$sdk_release$default(RadarApiClient radarApiClient, Location location, String[] strArr, RadarGeocodeApiCallback radarGeocodeApiCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            strArr = null;
        }
        radarApiClient.reverseGeocode$sdk_release(location, strArr, radarGeocodeApiCallback);
    }

    public final void reverseGeocode$sdk_release(Location location, String[] layers, final RadarGeocodeApiCallback callback) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String publishableKey$sdk_release = RadarSettings.INSTANCE.getPublishableKey$sdk_release(this.context);
        if (publishableKey$sdk_release == null) {
            RadarGeocodeApiCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("coordinates=" + location.getLatitude() + AbstractJsonLexerKt.COMMA + location.getLongitude());
        if (layers != null) {
            if (!(layers.length == 0)) {
                sb.append("&layers=" + ArraysKt.joinToString$default(layers, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
            }
        }
        RadarApiHelper.request$sdk_release$default(this.apiHelper, this.context, "GET", "v1/geocode/reverse?" + ((Object) sb), headers(publishableKey$sdk_release), null, false, new RadarApiHelper.RadarApiCallback() { // from class: io.radar.sdk.RadarApiClient$reverseGeocode$1
            @Override // io.radar.sdk.RadarApiHelper.RadarApiCallback
            public void onComplete(Radar.RadarStatus status, JSONObject res) {
                Intrinsics.checkNotNullParameter(status, "status");
                if (status != Radar.RadarStatus.SUCCESS || res == null) {
                    RadarApiClient.RadarGeocodeApiCallback.DefaultImpls.onComplete$default(RadarApiClient.RadarGeocodeApiCallback.this, status, null, null, 6, null);
                    return;
                }
                JSONArray optJSONArray = res.optJSONArray("addresses");
                RadarAddress[] fromJson = optJSONArray != null ? RadarAddress.INSTANCE.fromJson(optJSONArray) : null;
                if (fromJson != null) {
                    RadarApiClient.RadarGeocodeApiCallback.this.onComplete(Radar.RadarStatus.SUCCESS, res, fromJson);
                } else {
                    RadarApiClient.RadarGeocodeApiCallback.DefaultImpls.onComplete$default(RadarApiClient.RadarGeocodeApiCallback.this, Radar.RadarStatus.ERROR_SERVER, null, null, 6, null);
                }
            }
        }, false, false, false, false, null, Utf8.MASK_2BYTES, null);
    }

    public final void ipGeocode$sdk_release(final RadarIpGeocodeApiCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        String publishableKey$sdk_release = RadarSettings.INSTANCE.getPublishableKey$sdk_release(this.context);
        if (publishableKey$sdk_release == null) {
            RadarIpGeocodeApiCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_PUBLISHABLE_KEY, null, null, false, 14, null);
        } else {
            RadarApiHelper.request$sdk_release$default(this.apiHelper, this.context, "GET", "v1/geocode/ip", headers(publishableKey$sdk_release), null, false, new RadarApiHelper.RadarApiCallback() { // from class: io.radar.sdk.RadarApiClient$ipGeocode$1
                @Override // io.radar.sdk.RadarApiHelper.RadarApiCallback
                public void onComplete(Radar.RadarStatus status, JSONObject res) {
                    Intrinsics.checkNotNullParameter(status, "status");
                    if (status != Radar.RadarStatus.SUCCESS || res == null) {
                        RadarApiClient.RadarIpGeocodeApiCallback.DefaultImpls.onComplete$default(RadarApiClient.RadarIpGeocodeApiCallback.this, status, null, null, false, 14, null);
                        return;
                    }
                    JSONObject optJSONObject = res.optJSONObject("address");
                    RadarAddress fromJson = optJSONObject != null ? RadarAddress.INSTANCE.fromJson(optJSONObject) : null;
                    boolean optBoolean = res.optBoolean("proxy");
                    if (fromJson != null) {
                        RadarApiClient.RadarIpGeocodeApiCallback.this.onComplete(Radar.RadarStatus.SUCCESS, res, fromJson, optBoolean);
                    } else {
                        RadarApiClient.RadarIpGeocodeApiCallback.DefaultImpls.onComplete$default(RadarApiClient.RadarIpGeocodeApiCallback.this, Radar.RadarStatus.ERROR_SERVER, null, null, false, 14, null);
                    }
                }
            }, false, false, false, false, null, Utf8.MASK_2BYTES, null);
        }
    }

    public final void getDistance$sdk_release(Location origin, Location destination, EnumSet<Radar.RadarRouteMode> modes, Radar.RadarRouteUnits units, int geometryPoints, final RadarDistanceApiCallback callback) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(modes, "modes");
        Intrinsics.checkNotNullParameter(units, "units");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String publishableKey$sdk_release = RadarSettings.INSTANCE.getPublishableKey$sdk_release(this.context);
        if (publishableKey$sdk_release == null) {
            RadarDistanceApiCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=" + origin.getLatitude() + AbstractJsonLexerKt.COMMA + origin.getLongitude());
        sb.append("&destination=" + destination.getLatitude() + AbstractJsonLexerKt.COMMA + destination.getLongitude());
        ArrayList arrayList = new ArrayList();
        if (modes.contains(Radar.RadarRouteMode.FOOT)) {
            arrayList.add("foot");
        }
        if (modes.contains(Radar.RadarRouteMode.BIKE)) {
            arrayList.add("bike");
        }
        if (modes.contains(Radar.RadarRouteMode.CAR)) {
            arrayList.add("car");
        }
        if (modes.contains(Radar.RadarRouteMode.TRUCK)) {
            arrayList.add("truck");
        }
        if (modes.contains(Radar.RadarRouteMode.MOTORBIKE)) {
            arrayList.add("motorbike");
        }
        sb.append("&modes=" + CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
        if (units == Radar.RadarRouteUnits.METRIC) {
            sb.append("&units=metric");
        } else {
            sb.append("&units=imperial");
        }
        if (geometryPoints > 1) {
            sb.append("&geometryPoints=" + geometryPoints);
        }
        sb.append("&geometry=linestring");
        RadarApiHelper.request$sdk_release$default(this.apiHelper, this.context, "GET", "v1/route/distance?" + ((Object) sb), headers(publishableKey$sdk_release), null, false, new RadarApiHelper.RadarApiCallback() { // from class: io.radar.sdk.RadarApiClient$getDistance$1
            @Override // io.radar.sdk.RadarApiHelper.RadarApiCallback
            public void onComplete(Radar.RadarStatus status, JSONObject res) {
                Intrinsics.checkNotNullParameter(status, "status");
                if (status != Radar.RadarStatus.SUCCESS || res == null) {
                    RadarApiClient.RadarDistanceApiCallback.DefaultImpls.onComplete$default(RadarApiClient.RadarDistanceApiCallback.this, status, null, null, 6, null);
                    return;
                }
                JSONObject optJSONObject = res.optJSONObject("routes");
                RadarRoutes fromJson = optJSONObject != null ? RadarRoutes.INSTANCE.fromJson(optJSONObject) : null;
                if (fromJson != null) {
                    RadarApiClient.RadarDistanceApiCallback.this.onComplete(Radar.RadarStatus.SUCCESS, res, fromJson);
                } else {
                    RadarApiClient.RadarDistanceApiCallback.DefaultImpls.onComplete$default(RadarApiClient.RadarDistanceApiCallback.this, Radar.RadarStatus.ERROR_SERVER, null, null, 6, null);
                }
            }
        }, false, false, false, false, null, Utf8.MASK_2BYTES, null);
    }

    public final void getMatrix$sdk_release(Location[] origins, Location[] destinations, Radar.RadarRouteMode mode, Radar.RadarRouteUnits units, final RadarMatrixApiCallback callback) {
        Intrinsics.checkNotNullParameter(origins, "origins");
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(units, "units");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String publishableKey$sdk_release = RadarSettings.INSTANCE.getPublishableKey$sdk_release(this.context);
        if (publishableKey$sdk_release == null) {
            RadarMatrixApiCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
            return;
        }
        StringBuilder sb = new StringBuilder("origins=");
        int length = origins.length;
        for (int i = 0; i < length; i++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(origins[i].getLatitude());
            sb2.append(AbstractJsonLexerKt.COMMA);
            sb2.append(origins[i].getLongitude());
            sb.append(sb2.toString());
            if (i < origins.length - 1) {
                sb.append("|");
            }
        }
        sb.append("&destinations=");
        int length2 = destinations.length;
        for (int i2 = 0; i2 < length2; i2++) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(destinations[i2].getLatitude());
            sb3.append(AbstractJsonLexerKt.COMMA);
            sb3.append(destinations[i2].getLongitude());
            sb.append(sb3.toString());
            if (i2 < destinations.length - 1) {
                sb.append("|");
            }
        }
        if (mode == Radar.RadarRouteMode.FOOT) {
            sb.append("&mode=foot");
        } else if (mode == Radar.RadarRouteMode.BIKE) {
            sb.append("&mode=bike");
        } else if (mode == Radar.RadarRouteMode.CAR) {
            sb.append("&mode=car");
        } else if (mode == Radar.RadarRouteMode.TRUCK) {
            sb.append("&mode=truck");
        } else if (mode == Radar.RadarRouteMode.MOTORBIKE) {
            sb.append("&mode=motorbike");
        }
        if (units == Radar.RadarRouteUnits.METRIC) {
            sb.append("&units=metric");
        } else {
            sb.append("&units=imperial");
        }
        RadarApiHelper.request$sdk_release$default(this.apiHelper, this.context, "GET", "v1/route/matrix?" + ((Object) sb), headers(publishableKey$sdk_release), null, false, new RadarApiHelper.RadarApiCallback() { // from class: io.radar.sdk.RadarApiClient$getMatrix$1
            @Override // io.radar.sdk.RadarApiHelper.RadarApiCallback
            public void onComplete(Radar.RadarStatus status, JSONObject res) {
                Intrinsics.checkNotNullParameter(status, "status");
                if (status != Radar.RadarStatus.SUCCESS || res == null) {
                    RadarApiClient.RadarMatrixApiCallback.DefaultImpls.onComplete$default(RadarApiClient.RadarMatrixApiCallback.this, status, null, null, 6, null);
                    return;
                }
                JSONArray optJSONArray = res.optJSONArray("matrix");
                RadarRouteMatrix fromJson = optJSONArray != null ? RadarRouteMatrix.INSTANCE.fromJson(optJSONArray) : null;
                if (fromJson != null) {
                    RadarApiClient.RadarMatrixApiCallback.this.onComplete(Radar.RadarStatus.SUCCESS, res, fromJson);
                } else {
                    RadarApiClient.RadarMatrixApiCallback.DefaultImpls.onComplete$default(RadarApiClient.RadarMatrixApiCallback.this, Radar.RadarStatus.ERROR_SERVER, null, null, 6, null);
                }
            }
        }, false, false, false, false, null, Utf8.MASK_2BYTES, null);
    }

    public final void sendEvent$sdk_release(String name, JSONObject metadata, final RadarSendEventApiCallback callback) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String publishableKey$sdk_release = RadarSettings.INSTANCE.getPublishableKey$sdk_release(this.context);
        if (publishableKey$sdk_release == null) {
            RadarSendEventApiCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_PUBLISHABLE_KEY, null, null, 6, null);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("id", RadarSettings.INSTANCE.getId$sdk_release(this.context));
            jSONObject.putOpt("installId", RadarSettings.INSTANCE.getInstallId$sdk_release(this.context));
            jSONObject.putOpt("userId", RadarSettings.INSTANCE.getUserId$sdk_release(this.context));
            jSONObject.putOpt("deviceId", RadarUtils.INSTANCE.getDeviceId$sdk_release(this.context));
            jSONObject.putOpt("type", name);
            jSONObject.putOpt("metadata", metadata);
            RadarApiHelper.request$sdk_release$default(this.apiHelper, this.context, "POST", "v1/events", headers(publishableKey$sdk_release), jSONObject, false, new RadarApiHelper.RadarApiCallback() { // from class: io.radar.sdk.RadarApiClient$sendEvent$1
                @Override // io.radar.sdk.RadarApiHelper.RadarApiCallback
                public void onComplete(Radar.RadarStatus status, JSONObject res) {
                    Intrinsics.checkNotNullParameter(status, "status");
                    if (status != Radar.RadarStatus.SUCCESS || res == null) {
                        RadarApiClient.RadarSendEventApiCallback.DefaultImpls.onComplete$default(RadarApiClient.RadarSendEventApiCallback.this, status, null, null, 6, null);
                        return;
                    }
                    JSONObject optJSONObject = res.optJSONObject("event");
                    RadarEvent fromJson = optJSONObject != null ? RadarEvent.INSTANCE.fromJson(optJSONObject) : null;
                    if (fromJson == null) {
                        RadarApiClient.RadarSendEventApiCallback.DefaultImpls.onComplete$default(RadarApiClient.RadarSendEventApiCallback.this, Radar.RadarStatus.ERROR_SERVER, null, null, 6, null);
                    } else {
                        RadarApiClient.RadarSendEventApiCallback.this.onComplete(Radar.RadarStatus.SUCCESS, res, fromJson);
                    }
                }
            }, false, false, false, false, null, Utf8.MASK_2BYTES, null);
        } catch (JSONException unused) {
            RadarSendEventApiCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_BAD_REQUEST, null, null, 6, null);
        }
    }

    public final void loadImage$sdk_release(String imageUrl, RadarApiHelper.RadarImageApiCallback callback) {
        String str;
        Map<String, String> emptyMap;
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (imageUrl.length() == 0) {
            RadarApiHelper.RadarImageApiCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_BAD_REQUEST, null, 2, null);
            return;
        }
        if (StringsKt.startsWith$default(imageUrl, "http", false, 2, (Object) null)) {
            str = imageUrl;
        } else if (RadarSettings.INSTANCE.getPublishableKey$sdk_release(this.context) == null) {
            RadarApiHelper.RadarImageApiCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_PUBLISHABLE_KEY, null, 2, null);
            return;
        } else {
            str = "v1/assets/" + imageUrl;
        }
        if (!StringsKt.startsWith$default(imageUrl, "http", false, 2, (Object) null)) {
            String publishableKey$sdk_release = RadarSettings.INSTANCE.getPublishableKey$sdk_release(this.context);
            if (publishableKey$sdk_release == null) {
                publishableKey$sdk_release = "";
            }
            emptyMap = headers(publishableKey$sdk_release);
        } else {
            emptyMap = MapsKt.emptyMap();
        }
        this.apiHelper.requestImage$sdk_release(this.context, "GET", str, emptyMap, callback);
    }
}
