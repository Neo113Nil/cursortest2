package io.radar.sdk;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.location.GeofencingEvent;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
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

/* compiled from: RadarGoogleLocationClient.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JN\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00100\u0019H\u0016¢\u0006\u0002\u0010\u001eJ5\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2#\u0010\u0018\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\"¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00100\u0019H\u0016J-\u0010$\u001a\u00020\u00102#\u0010\u0018\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\"¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00100\u0019H\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010\"2\u0006\u0010&\u001a\u00020'H\u0016J\u0012\u0010(\u001a\u0004\u0018\u00010\"2\u0006\u0010&\u001a\u00020'H\u0016J\u0012\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010+\u001a\u00020,2\u0006\u0010 \u001a\u00020!H\u0002J5\u0010-\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172#\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0019H\u0016J\u0010\u0010.\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010/\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\u0006\u00100\u001a\u00020,2\u0006\u00101\u001a\u00020,2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lio/radar/sdk/RadarGoogleLocationClient;", "Lio/radar/sdk/RadarAbstractLocationClient;", "context", "Landroid/content/Context;", SentryEvent.JsonKeys.LOGGER, "Lio/radar/sdk/RadarLogger;", "(Landroid/content/Context;Lio/radar/sdk/RadarLogger;)V", "geofencingClient", "Lcom/google/android/gms/location/GeofencingClient;", "getGeofencingClient", "()Lcom/google/android/gms/location/GeofencingClient;", "locationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getLocationClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "addGeofences", "", "abstractGeofences", "", "Lio/radar/sdk/RadarAbstractLocationClient$RadarAbstractGeofence;", "abstractGeofenceRequest", "Lio/radar/sdk/RadarAbstractLocationClient$RadarAbstractGeofenceRequest;", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "block", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "([Lio/radar/sdk/RadarAbstractLocationClient$RadarAbstractGeofence;Lio/radar/sdk/RadarAbstractLocationClient$RadarAbstractGeofenceRequest;Landroid/app/PendingIntent;Lkotlin/jvm/functions/Function1;)V", "getCurrentLocation", RadarTrackingOptions.KEY_DESIRED_ACCURACY, "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsDesiredAccuracy;", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "getLastLocation", "getLocationFromGeofenceIntent", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "getLocationFromLocationIntent", "getSourceFromGeofenceIntent", "Lio/radar/sdk/Radar$RadarLocationSource;", "priorityForDesiredAccuracy", "", "removeGeofences", "removeLocationUpdates", "requestLocationUpdates", "interval", "fastestInterval", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarGoogleLocationClient extends RadarAbstractLocationClient {
    private final Context context;
    private final GeofencingClient geofencingClient;
    private final FusedLocationProviderClient locationClient;
    private final RadarLogger logger;

    /* compiled from: RadarGoogleLocationClient.kt */
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

    public RadarGoogleLocationClient(Context context, RadarLogger logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.context = context;
        this.logger = logger;
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
        this.locationClient = fusedLocationProviderClient;
        GeofencingClient geofencingClient = LocationServices.getGeofencingClient(context);
        Intrinsics.checkNotNullExpressionValue(geofencingClient, "getGeofencingClient(...)");
        this.geofencingClient = geofencingClient;
    }

    public final FusedLocationProviderClient getLocationClient() {
        return this.locationClient;
    }

    public final GeofencingClient getGeofencingClient() {
        return this.geofencingClient;
    }

    @Override // io.radar.sdk.RadarAbstractLocationClient
    public void getCurrentLocation(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy desiredAccuracy, final Function1<? super Location, Unit> block) {
        Intrinsics.checkNotNullParameter(desiredAccuracy, "desiredAccuracy");
        Intrinsics.checkNotNullParameter(block, "block");
        CurrentLocationRequest.Builder priority = new CurrentLocationRequest.Builder().setPriority(priorityForDesiredAccuracy(desiredAccuracy));
        Intrinsics.checkNotNullExpressionValue(priority, "setPriority(...)");
        if (desiredAccuracy == RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.HIGH) {
            priority = priority.setMaxUpdateAgeMillis(0L);
            Intrinsics.checkNotNullExpressionValue(priority, "setMaxUpdateAgeMillis(...)");
        }
        int locationManagerTimeout = RadarSettings.INSTANCE.getSdkConfiguration(this.context).getLocationManagerTimeout();
        if (locationManagerTimeout > 0) {
            RadarLogger.d$default(this.logger, "Requesting location with timeout | timeout = " + locationManagerTimeout, null, null, 6, null);
            priority = priority.setDurationMillis((long) locationManagerTimeout);
            Intrinsics.checkNotNullExpressionValue(priority, "setDurationMillis(...)");
        } else {
            RadarLogger.d$default(this.logger, "Requesting location with default timeout", null, null, 6, null);
        }
        CurrentLocationRequest build = priority.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        Task<Location> currentLocation = this.locationClient.getCurrentLocation(build, (CancellationToken) null);
        final Function1<Location, Unit> function1 = new Function1<Location, Unit>() { // from class: io.radar.sdk.RadarGoogleLocationClient$getCurrentLocation$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Location location) {
                invoke2(location);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Location location) {
                RadarLogger radarLogger;
                radarLogger = RadarGoogleLocationClient.this.logger;
                RadarLogger.d$default(radarLogger, "Received current location", null, null, 6, null);
                block.invoke(location);
            }
        };
        currentLocation.addOnSuccessListener(new OnSuccessListener() { // from class: io.radar.sdk.RadarGoogleLocationClient$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RadarGoogleLocationClient.getCurrentLocation$lambda$0(Function1.this, obj);
            }
        }).addOnCanceledListener(new OnCanceledListener() { // from class: io.radar.sdk.RadarGoogleLocationClient$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.tasks.OnCanceledListener
            public final void onCanceled() {
                RadarGoogleLocationClient.getCurrentLocation$lambda$1(Function1.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrentLocation$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrentLocation$lambda$1(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "$block");
        block.invoke(null);
    }

    @Override // io.radar.sdk.RadarAbstractLocationClient
    public void requestLocationUpdates(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy desiredAccuracy, int interval, int fastestInterval, PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(desiredAccuracy, "desiredAccuracy");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        LocationRequest.Builder minUpdateIntervalMillis = new LocationRequest.Builder(priorityForDesiredAccuracy(desiredAccuracy), interval * 1000).setMinUpdateIntervalMillis(fastestInterval * 1000);
        Intrinsics.checkNotNullExpressionValue(minUpdateIntervalMillis, "setMinUpdateIntervalMillis(...)");
        if (desiredAccuracy == RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.HIGH) {
            minUpdateIntervalMillis = minUpdateIntervalMillis.setMaxUpdateAgeMillis(0L);
            Intrinsics.checkNotNullExpressionValue(minUpdateIntervalMillis, "setMaxUpdateAgeMillis(...)");
        }
        LocationRequest build = minUpdateIntervalMillis.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.locationClient.requestLocationUpdates(build, pendingIntent);
    }

    @Override // io.radar.sdk.RadarAbstractLocationClient
    public void removeLocationUpdates(PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        this.locationClient.removeLocationUpdates(pendingIntent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLastLocation$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // io.radar.sdk.RadarAbstractLocationClient
    public void getLastLocation(final Function1<? super Location, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Task<Location> lastLocation = this.locationClient.getLastLocation();
        final Function1<Location, Unit> function1 = new Function1<Location, Unit>() { // from class: io.radar.sdk.RadarGoogleLocationClient$getLastLocation$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Location location) {
                invoke2(location);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Location location) {
                block.invoke(location);
            }
        };
        lastLocation.addOnSuccessListener(new OnSuccessListener() { // from class: io.radar.sdk.RadarGoogleLocationClient$$ExternalSyntheticLambda4
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RadarGoogleLocationClient.getLastLocation$lambda$2(Function1.this, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: io.radar.sdk.RadarGoogleLocationClient$$ExternalSyntheticLambda5
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                RadarGoogleLocationClient.getLastLocation$lambda$3(Function1.this, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLastLocation$lambda$3(Function1 block, Exception it) {
        Intrinsics.checkNotNullParameter(block, "$block");
        Intrinsics.checkNotNullParameter(it, "it");
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
            Geofence build = new Geofence.Builder().setRequestId(radarAbstractGeofence.getRequestId()).setCircularRegion(radarAbstractGeofence.getLatitude(), radarAbstractGeofence.getLongitude(), radarAbstractGeofence.getRadius()).setExpirationDuration(-1L).setTransitionTypes(i).setLoiteringDelay(radarAbstractGeofence.getDwellDuration()).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
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
        GeofencingRequest build2 = new GeofencingRequest.Builder().addGeofences(arrayList).setInitialTrigger(i2).build();
        Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
        Task<Void> addGeofences = this.geofencingClient.addGeofences(build2, pendingIntent);
        final Function1<Void, Unit> function1 = new Function1<Void, Unit>() { // from class: io.radar.sdk.RadarGoogleLocationClient$addGeofences$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Void r1) {
                invoke2(r1);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Void r2) {
                block.invoke(true);
            }
        };
        addGeofences.addOnSuccessListener(new OnSuccessListener() { // from class: io.radar.sdk.RadarGoogleLocationClient$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RadarGoogleLocationClient.addGeofences$lambda$7$lambda$5(Function1.this, obj);
            }
        });
        addGeofences.addOnFailureListener(new OnFailureListener() { // from class: io.radar.sdk.RadarGoogleLocationClient$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                RadarGoogleLocationClient.addGeofences$lambda$7$lambda$6(Function1.this, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addGeofences$lambda$7$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addGeofences$lambda$7$lambda$6(Function1 block, Exception it) {
        Intrinsics.checkNotNullParameter(block, "$block");
        Intrinsics.checkNotNullParameter(it, "it");
        block.invoke(false);
    }

    @Override // io.radar.sdk.RadarAbstractLocationClient
    public void removeGeofences(PendingIntent pendingIntent, final Function1<? super Boolean, Unit> block) {
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Task<Void> removeGeofences = this.geofencingClient.removeGeofences(pendingIntent);
        final Function1<Void, Unit> function1 = new Function1<Void, Unit>() { // from class: io.radar.sdk.RadarGoogleLocationClient$removeGeofences$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Void r1) {
                invoke2(r1);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Void r2) {
                Function1<Boolean, Unit> function12 = block;
                if (function12 != null) {
                    function12.invoke(true);
                }
            }
        };
        removeGeofences.addOnSuccessListener(new OnSuccessListener() { // from class: io.radar.sdk.RadarGoogleLocationClient$$ExternalSyntheticLambda6
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RadarGoogleLocationClient.removeGeofences$lambda$10$lambda$8(Function1.this, obj);
            }
        });
        removeGeofences.addOnFailureListener(new OnFailureListener() { // from class: io.radar.sdk.RadarGoogleLocationClient$$ExternalSyntheticLambda7
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                RadarGoogleLocationClient.removeGeofences$lambda$10$lambda$9(Function1.this, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeGeofences$lambda$10$lambda$8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeGeofences$lambda$10$lambda$9(Function1 function1, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (function1 != null) {
            function1.invoke(false);
        }
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

    @Override // io.radar.sdk.RadarAbstractLocationClient
    public Location getLocationFromGeofenceIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        GeofencingEvent fromIntent = GeofencingEvent.fromIntent(intent);
        if (fromIntent == null) {
            return null;
        }
        return fromIntent.getTriggeringLocation();
    }

    @Override // io.radar.sdk.RadarAbstractLocationClient
    public Radar.RadarLocationSource getSourceFromGeofenceIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        GeofencingEvent fromIntent = GeofencingEvent.fromIntent(intent);
        if (fromIntent == null) {
            return null;
        }
        int geofenceTransition = fromIntent.getGeofenceTransition();
        if (geofenceTransition == 1) {
            return Radar.RadarLocationSource.GEOFENCE_ENTER;
        }
        if (geofenceTransition == 4) {
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
}
