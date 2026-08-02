package io.radar.sdk;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Looper;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.Geofence;
import com.huawei.hms.location.GeofenceData;
import com.huawei.hms.location.GeofenceRequest;
import com.huawei.hms.location.GeofenceService;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationResult;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarAbstractLocationClient;
import io.radar.sdk.RadarTrackingOptions;
import io.sentry.SentryEvent;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadarHuaweiLocationClient.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JN\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00100\u0019H\u0016¢\u0006\u0002\u0010\u001eJ5\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2#\u0010\u0018\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\"¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00100\u0019H\u0016J-\u0010$\u001a\u00020\u00102#\u0010\u0018\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\"¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00100\u0019H\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010\"2\u0006\u0010&\u001a\u00020'H\u0016J\u0012\u0010(\u001a\u0004\u0018\u00010\"2\u0006\u0010&\u001a\u00020'H\u0016J\u0012\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010+\u001a\u00020,2\u0006\u0010 \u001a\u00020!H\u0002J5\u0010-\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172#\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0019H\u0016J\u0010\u0010.\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010/\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\u0006\u00100\u001a\u00020,2\u0006\u00101\u001a\u00020,2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lio/radar/sdk/RadarHuaweiLocationClient;", "Lio/radar/sdk/RadarAbstractLocationClient;", "context", "Landroid/content/Context;", SentryEvent.JsonKeys.LOGGER, "Lio/radar/sdk/RadarLogger;", "(Landroid/content/Context;Lio/radar/sdk/RadarLogger;)V", "geofenceService", "Lcom/huawei/hms/location/GeofenceService;", "getGeofenceService", "()Lcom/huawei/hms/location/GeofenceService;", "locationClient", "Lcom/huawei/hms/location/FusedLocationProviderClient;", "getLocationClient", "()Lcom/huawei/hms/location/FusedLocationProviderClient;", "addGeofences", "", "abstractGeofences", "", "Lio/radar/sdk/RadarAbstractLocationClient$RadarAbstractGeofence;", "abstractGeofenceRequest", "Lio/radar/sdk/RadarAbstractLocationClient$RadarAbstractGeofenceRequest;", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "block", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "([Lio/radar/sdk/RadarAbstractLocationClient$RadarAbstractGeofence;Lio/radar/sdk/RadarAbstractLocationClient$RadarAbstractGeofenceRequest;Landroid/app/PendingIntent;Lkotlin/jvm/functions/Function1;)V", "getCurrentLocation", RadarTrackingOptions.KEY_DESIRED_ACCURACY, "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsDesiredAccuracy;", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "getLastLocation", "getLocationFromGeofenceIntent", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "getLocationFromLocationIntent", "getSourceFromGeofenceIntent", "Lio/radar/sdk/Radar$RadarLocationSource;", "priorityForDesiredAccuracy", "", "removeGeofences", "removeLocationUpdates", "requestLocationUpdates", "interval", "fastestInterval", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarHuaweiLocationClient extends RadarAbstractLocationClient {
    private final GeofenceService geofenceService;
    private final FusedLocationProviderClient locationClient;
    private final RadarLogger logger;

    /* compiled from: RadarHuaweiLocationClient.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.values().length];
            try {
                iArr[RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RadarHuaweiLocationClient(Context context, RadarLogger logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
        this.locationClient = new FusedLocationProviderClient(context);
        this.geofenceService = new GeofenceService(context);
    }

    public final FusedLocationProviderClient getLocationClient() {
        return this.locationClient;
    }

    public final GeofenceService getGeofenceService() {
        return this.geofenceService;
    }

    @Override // io.radar.sdk.RadarAbstractLocationClient
    public void getCurrentLocation(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy desiredAccuracy, final Function1<? super Location, Unit> block) {
        Intrinsics.checkNotNullParameter(desiredAccuracy, "desiredAccuracy");
        Intrinsics.checkNotNullParameter(block, "block");
        int priorityForDesiredAccuracy = priorityForDesiredAccuracy(desiredAccuracy);
        RadarLogger.d$default(this.logger, "Requesting location", null, null, 6, null);
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.setPriority(priorityForDesiredAccuracy);
        locationRequest.setInterval(0L);
        locationRequest.setFastestInterval(0L);
        locationRequest.setNumUpdates(1);
        this.locationClient.requestLocationUpdates(locationRequest, new LocationCallback() { // from class: io.radar.sdk.RadarHuaweiLocationClient$getCurrentLocation$1
            public void onLocationResult(LocationResult locationResult) {
                RadarLogger radarLogger;
                Intrinsics.checkNotNullParameter(locationResult, "locationResult");
                radarLogger = RadarHuaweiLocationClient.this.logger;
                RadarLogger.d$default(radarLogger, "Received current location", null, null, 6, null);
                block.invoke(locationResult.getLastLocation());
            }
        }, Looper.getMainLooper()).addOnFailureListener(new OnFailureListener() { // from class: io.radar.sdk.RadarHuaweiLocationClient$$ExternalSyntheticLambda0
            public final void onFailure(Exception exc) {
                RadarHuaweiLocationClient.getCurrentLocation$lambda$1(Function1.this, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrentLocation$lambda$1(Function1 block, Exception exc) {
        Intrinsics.checkNotNullParameter(block, "$block");
        block.invoke(null);
    }

    @Override // io.radar.sdk.RadarAbstractLocationClient
    public void requestLocationUpdates(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy desiredAccuracy, int interval, int fastestInterval, PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(desiredAccuracy, "desiredAccuracy");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        int priorityForDesiredAccuracy = priorityForDesiredAccuracy(desiredAccuracy);
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.setPriority(priorityForDesiredAccuracy);
        locationRequest.setInterval(interval * 1000);
        locationRequest.setFastestInterval(fastestInterval * 1000);
        this.locationClient.requestLocationUpdates(locationRequest, pendingIntent);
    }

    @Override // io.radar.sdk.RadarAbstractLocationClient
    public void removeLocationUpdates(PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        this.locationClient.removeLocationUpdates(pendingIntent);
    }

    @Override // io.radar.sdk.RadarAbstractLocationClient
    public void getLastLocation(final Function1<? super Location, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.locationClient.getLastLocation().addOnSuccessListener(new OnSuccessListener() { // from class: io.radar.sdk.RadarHuaweiLocationClient$$ExternalSyntheticLambda3
            public final void onSuccess(Object obj) {
                RadarHuaweiLocationClient.getLastLocation$lambda$3(Function1.this, (Location) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: io.radar.sdk.RadarHuaweiLocationClient$$ExternalSyntheticLambda4
            public final void onFailure(Exception exc) {
                RadarHuaweiLocationClient.getLastLocation$lambda$4(Function1.this, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLastLocation$lambda$3(Function1 block, Location location) {
        Intrinsics.checkNotNullParameter(block, "$block");
        block.invoke(location);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLastLocation$lambda$4(Function1 block, Exception exc) {
        Intrinsics.checkNotNullParameter(block, "$block");
        block.invoke(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.radar.sdk.RadarAbstractLocationClient
    public void addGeofences(RadarAbstractLocationClient.RadarAbstractGeofence[] abstractGeofences, RadarAbstractLocationClient.RadarAbstractGeofenceRequest abstractGeofenceRequest, PendingIntent pendingIntent, final Function1<? super Boolean, Unit> block) {
        Intrinsics.checkNotNullParameter(abstractGeofences, "abstractGeofences");
        Intrinsics.checkNotNullParameter(abstractGeofenceRequest, "abstractGeofenceRequest");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Intrinsics.checkNotNullParameter(block, "block");
        ArrayList arrayList = new ArrayList();
        for (RadarAbstractLocationClient.RadarAbstractGeofence radarAbstractGeofence : abstractGeofences) {
            boolean transitionEnter = radarAbstractGeofence.getTransitionEnter();
            int i = transitionEnter;
            if (radarAbstractGeofence.getTransitionExit()) {
                i = (transitionEnter ? 1 : 0) | 2;
            }
            if (radarAbstractGeofence.getTransitionDwell()) {
                i = (i == true ? 1 : 0) | 4;
            }
            Geofence build = new Geofence.Builder().setUniqueId(radarAbstractGeofence.getRequestId()).setRoundArea(radarAbstractGeofence.getLatitude(), radarAbstractGeofence.getLongitude(), radarAbstractGeofence.getRadius()).setConversions(i).setDwellDelayTime(radarAbstractGeofence.getDwellDuration()).setValidContinueTime(-1L).build();
            Intrinsics.checkNotNull(build);
            arrayList.add(build);
        }
        boolean initialTriggerEnter = abstractGeofenceRequest.getInitialTriggerEnter();
        boolean z = initialTriggerEnter;
        if (abstractGeofenceRequest.getInitialTriggerExit()) {
            z = (initialTriggerEnter ? 1 : 0) | 2;
        }
        int i2 = z;
        if (abstractGeofenceRequest.getInitialTriggerDwell()) {
            i2 = (z ? 1 : 0) | 4;
        }
        Task createGeofenceList = this.geofenceService.createGeofenceList(new GeofenceRequest.Builder().createGeofenceList(arrayList).setInitConversions(i2).build(), pendingIntent);
        createGeofenceList.addOnSuccessListener(new OnSuccessListener() { // from class: io.radar.sdk.RadarHuaweiLocationClient$$ExternalSyntheticLambda5
            public final void onSuccess(Object obj) {
                RadarHuaweiLocationClient.addGeofences$lambda$8$lambda$6(Function1.this, (Void) obj);
            }
        });
        createGeofenceList.addOnFailureListener(new OnFailureListener() { // from class: io.radar.sdk.RadarHuaweiLocationClient$$ExternalSyntheticLambda6
            public final void onFailure(Exception exc) {
                RadarHuaweiLocationClient.addGeofences$lambda$8$lambda$7(Function1.this, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addGeofences$lambda$8$lambda$6(Function1 block, Void r1) {
        Intrinsics.checkNotNullParameter(block, "$block");
        block.invoke(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addGeofences$lambda$8$lambda$7(Function1 block, Exception exc) {
        Intrinsics.checkNotNullParameter(block, "$block");
        block.invoke(false);
    }

    @Override // io.radar.sdk.RadarAbstractLocationClient
    public void removeGeofences(PendingIntent pendingIntent, final Function1<? super Boolean, Unit> block) {
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Task deleteGeofenceList = this.geofenceService.deleteGeofenceList(pendingIntent);
        deleteGeofenceList.addOnSuccessListener(new OnSuccessListener() { // from class: io.radar.sdk.RadarHuaweiLocationClient$$ExternalSyntheticLambda1
            public final void onSuccess(Object obj) {
                RadarHuaweiLocationClient.removeGeofences$lambda$11$lambda$9(Function1.this, (Void) obj);
            }
        });
        deleteGeofenceList.addOnFailureListener(new OnFailureListener() { // from class: io.radar.sdk.RadarHuaweiLocationClient$$ExternalSyntheticLambda2
            public final void onFailure(Exception exc) {
                RadarHuaweiLocationClient.removeGeofences$lambda$11$lambda$10(Function1.this, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeGeofences$lambda$11$lambda$9(Function1 function1, Void r1) {
        if (function1 != null) {
            function1.invoke(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeGeofences$lambda$11$lambda$10(Function1 function1, Exception exc) {
        if (function1 != null) {
            function1.invoke(false);
        }
    }

    @Override // io.radar.sdk.RadarAbstractLocationClient
    public Location getLocationFromGeofenceIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        GeofenceData dataFromIntent = GeofenceData.getDataFromIntent(intent);
        if (dataFromIntent == null) {
            return null;
        }
        return dataFromIntent.getConvertingLocation();
    }

    @Override // io.radar.sdk.RadarAbstractLocationClient
    public Radar.RadarLocationSource getSourceFromGeofenceIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        GeofenceData dataFromIntent = GeofenceData.getDataFromIntent(intent);
        if (dataFromIntent == null) {
            return null;
        }
        int conversion = dataFromIntent.getConversion();
        if (conversion == 1) {
            return Radar.RadarLocationSource.GEOFENCE_ENTER;
        }
        if (conversion == 4) {
            return Radar.RadarLocationSource.GEOFENCE_DWELL;
        }
        return Radar.RadarLocationSource.GEOFENCE_EXIT;
    }

    @Override // io.radar.sdk.RadarAbstractLocationClient
    public Location getLocationFromLocationIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        LocationResult extractResult = LocationResult.extractResult(intent);
        if (extractResult == null) {
            return null;
        }
        return extractResult.getLastLocation();
    }

    private final int priorityForDesiredAccuracy(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy desiredAccuracy) {
        int i = WhenMappings.$EnumSwitchMapping$0[desiredAccuracy.ordinal()];
        if (i == 1) {
            return 100;
        }
        if (i == 2) {
            return 102;
        }
        if (i == 3) {
            return 104;
        }
        if (i == 4) {
            return 105;
        }
        throw new NoWhenBranchMatchedException();
    }
}
