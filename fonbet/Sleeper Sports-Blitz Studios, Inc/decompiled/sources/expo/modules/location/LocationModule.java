package expo.modules.location;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.GeomagneticField;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.core.app.ActivityCompat;
import androidx.core.location.LocationManagerCompat;
import androidx.core.os.BundleKt;
import androidx.tracing.Trace;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import expo.modules.core.interfaces.ActivityEventListener;
import expo.modules.core.interfaces.LifecycleEventListener;
import expo.modules.core.interfaces.services.UIManager;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.interfaces.taskManager.TaskManagerInterface;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SuspendFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeCache;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptorKt;
import expo.modules.kotlin.types.descriptors.TypeDescriptorOfKt;
import expo.modules.location.LocationHelpers;
import expo.modules.location.records.GeocodeResponse;
import expo.modules.location.records.GeofencingOptions;
import expo.modules.location.records.Heading;
import expo.modules.location.records.HeadingEventResponse;
import expo.modules.location.records.LocationLastKnownOptions;
import expo.modules.location.records.LocationOptions;
import expo.modules.location.records.LocationProviderStatus;
import expo.modules.location.records.LocationResponse;
import expo.modules.location.records.LocationTaskOptions;
import expo.modules.location.records.PermissionDetailsLocationAndroid;
import expo.modules.location.records.PermissionRequestResponse;
import expo.modules.location.records.ReverseGeocodeLocation;
import expo.modules.location.records.ReverseGeocodeResponse;
import expo.modules.location.taskConsumers.GeofencingTaskConsumer;
import expo.modules.location.taskConsumers.LocationTaskConsumer;
import io.github.lukmccall.pika.TypeInfo;
import io.radar.sdk.RadarTrackingOptions;
import io.sentry.protocol.Response;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;

/* compiled from: LocationModule.kt */
@Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u0080\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0080\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010-\u001a\u00020.H\u0016J\u000e\u0010/\u001a\u000200H\u0082@¢\u0006\u0002\u00101J\b\u00102\u001a\u000203H\u0002J\u000e\u00104\u001a\u000200H\u0082@¢\u0006\u0002\u00101J\u000e\u00105\u001a\u000200H\u0082@¢\u0006\u0002\u00101J\u0018\u00106\u001a\u0004\u0018\u0001072\u0006\u00108\u001a\u000209H\u0082@¢\u0006\u0002\u0010:J\u0018\u0010;\u001a\u00020<2\u0006\u00108\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0002J%\u0010@\u001a\u00020<2\u0006\u0010A\u001a\u00020\u000f2\b\u0010B\u001a\u0004\u0018\u00010\u000b2\u0006\u0010C\u001a\u00020D¢\u0006\u0002\u0010EJ\u0018\u0010F\u001a\u00020<2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u0012H\u0002J\u0010\u0010H\u001a\u00020<2\u0006\u0010A\u001a\u00020\u000fH\u0002J\u0010\u0010I\u001a\u00020<2\u0006\u0010J\u001a\u00020\u000bH\u0002J\b\u0010K\u001a\u00020<H\u0002J\b\u0010L\u001a\u00020<H\u0002J\u001d\u0010M\u001a\u00020<2\u0006\u0010N\u001a\u00020\u000b2\u0006\u0010O\u001a\u000207H\u0000¢\u0006\u0002\bPJ\u0010\u0010Q\u001a\u00020!2\u0006\u0010R\u001a\u00020!H\u0002J\u0010\u0010S\u001a\u00020!2\u0006\u0010T\u001a\u00020!H\u0002J\b\u0010U\u001a\u00020<H\u0002J\b\u0010V\u001a\u00020<H\u0002J\b\u0010W\u001a\u00020<H\u0002J\b\u0010X\u001a\u00020<H\u0002J\u0010\u0010Y\u001a\u00020<2\u0006\u0010B\u001a\u00020\u000bH\u0002J\u0010\u0010Z\u001a\u00020<2\u0006\u0010B\u001a\u00020\u000bH\u0002J\b\u0010[\u001a\u00020<H\u0002J\u0010\u0010\\\u001a\u0004\u0018\u00010]H\u0082@¢\u0006\u0002\u00101J\u001c\u0010^\u001a\b\u0012\u0004\u0012\u00020`0_2\u0006\u0010a\u001a\u00020bH\u0082@¢\u0006\u0002\u0010cJ\u001c\u0010d\u001a\b\u0012\u0004\u0012\u00020e0_2\u0006\u0010f\u001a\u00020gH\u0082@¢\u0006\u0002\u0010hJ\b\u0010i\u001a\u00020&H\u0002J\b\u0010j\u001a\u00020&H\u0002J\b\u0010k\u001a\u00020&H\u0002J\b\u0010l\u001a\u00020&H\u0002J\b\u0010m\u001a\u00020&H\u0002J\b\u0010n\u001a\u00020<H\u0016J\b\u0010o\u001a\u00020<H\u0016J\b\u0010p\u001a\u00020<H\u0016J\u0012\u0010q\u001a\u00020<2\b\u0010r\u001a\u0004\u0018\u00010sH\u0016J\u001a\u0010t\u001a\u00020<2\b\u0010u\u001a\u0004\u0018\u00010v2\u0006\u0010w\u001a\u00020\u000bH\u0016J,\u0010x\u001a\u00020<2\b\u0010y\u001a\u0004\u0018\u00010z2\u0006\u0010{\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020\u000b2\b\u0010|\u001a\u0004\u0018\u00010}H\u0016J\u0012\u0010~\u001a\u00020<2\b\u0010\u007f\u001a\u0004\u0018\u00010}H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f`\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010'\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010*¨\u0006\u0081\u0001"}, d2 = {"Lexpo/modules/location/LocationModule;", "Lexpo/modules/kotlin/modules/Module;", "Lexpo/modules/core/interfaces/LifecycleEventListener;", "Landroid/hardware/SensorEventListener;", "Lexpo/modules/core/interfaces/ActivityEventListener;", "<init>", "()V", "mGeofield", "Landroid/hardware/GeomagneticField;", "mLocationCallbacks", "Ljava/util/HashMap;", "", "Lcom/google/android/gms/location/LocationCallback;", "Lkotlin/collections/HashMap;", "mLocationRequests", "Lcom/google/android/gms/location/LocationRequest;", "mPendingLocationRequests", "Ljava/util/ArrayList;", "Lexpo/modules/location/LocationActivityResultListener;", "Lkotlin/collections/ArrayList;", "mContext", "Landroid/content/Context;", "mSensorManager", "Landroid/hardware/SensorManager;", "mUIManager", "Lexpo/modules/core/interfaces/services/UIManager;", "mLocationProvider", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "mGravity", "", "mGeomagnetic", "mHeadingId", "mLastAzimuth", "", "mAccuracy", "mLastUpdate", "", "mGeocoderPaused", "", "mTaskManager", "Lexpo/modules/interfaces/taskManager/TaskManagerInterface;", "getMTaskManager", "()Lexpo/modules/interfaces/taskManager/TaskManagerInterface;", "mTaskManager$delegate", "Lkotlin/Lazy;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "getForegroundPermissionsAsync", "Lexpo/modules/location/records/PermissionRequestResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProviderStatus", "Lexpo/modules/location/records/LocationProviderStatus;", "requestBackgroundPermissionsAsync", "getBackgroundPermissionsAsync", "getLastKnownPositionAsync", "Lexpo/modules/location/records/LocationResponse;", "options", "Lexpo/modules/location/records/LocationLastKnownOptions;", "(Lexpo/modules/location/records/LocationLastKnownOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentPositionAsync", "", "Lexpo/modules/location/records/LocationOptions;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lexpo/modules/kotlin/Promise;", "requestLocationUpdates", "locationRequest", "requestId", "callbacks", "Lexpo/modules/location/LocationRequestCallbacks;", "(Lcom/google/android/gms/location/LocationRequest;Ljava/lang/Integer;Lexpo/modules/location/LocationRequestCallbacks;)V", "addPendingLocationRequest", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "resolveUserSettingsForRequest", "executePendingRequests", "resultCode", "startHeadingUpdate", "sendUpdate", "sendLocationResponse", "watchId", Response.TYPE, "sendLocationResponse$expo_location_release", "calcMagNorth", "azimuth", "calcTrueNorth", "magNorth", "stopHeadingWatch", "destroyHeadingWatch", "startWatching", "stopWatching", "pauseLocationUpdatesForRequest", "removeLocationUpdatesForRequest", "resumeLocationUpdates", "getLastKnownLocation", "Landroid/location/Location;", "geocode", "", "Lexpo/modules/location/records/GeocodeResponse;", "address", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reverseGeocode", "Lexpo/modules/location/records/ReverseGeocodeResponse;", FirebaseAnalytics.Param.LOCATION, "Lexpo/modules/location/records/ReverseGeocodeLocation;", "(Lexpo/modules/location/records/ReverseGeocodeLocation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isMissingForegroundPermissions", "hasForegroundServicePermissions", "isMissingBackgroundPermissions", "shouldAskBackgroundPermissions", "isBackgroundPermissionInManifest", "onHostResume", "onHostPause", "onHostDestroy", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "onAccuracyChanged", "sensor", "Landroid/hardware/Sensor;", "accuracy", "onActivityResult", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Landroid/app/Activity;", "requestCode", "data", "Landroid/content/Intent;", "onNewIntent", SDKConstants.PARAM_INTENT, "Companion", "expo-location_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LocationModule extends Module implements LifecycleEventListener, SensorEventListener, ActivityEventListener {
    public static final int ACCURACY_BALANCED = 3;
    public static final int ACCURACY_BEST_FOR_NAVIGATION = 6;
    public static final int ACCURACY_HIGH = 4;
    public static final int ACCURACY_HIGHEST = 5;
    public static final int ACCURACY_LOW = 2;
    public static final int ACCURACY_LOWEST = 1;
    private static final int CHECK_SETTINGS_REQUEST_CODE = 42;
    public static final double DEGREE_DELTA = 0.0355d;
    public static final int GEOFENCING_EVENT_ENTER = 1;
    public static final int GEOFENCING_EVENT_EXIT = 2;
    private static final String HEADING_EVENT_NAME = "Expo.headingChanged";
    private static final String LOCATION_EVENT_NAME = "Expo.locationChanged";
    public static final float TIME_DELTA = 50.0f;
    private int mAccuracy;
    private Context mContext;
    private boolean mGeocoderPaused;
    private GeomagneticField mGeofield;
    private int mHeadingId;
    private float mLastAzimuth;
    private long mLastUpdate;
    private FusedLocationProviderClient mLocationProvider;
    private SensorManager mSensorManager;
    private UIManager mUIManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "LocationModule";
    private final HashMap<Integer, LocationCallback> mLocationCallbacks = new HashMap<>();
    private final HashMap<Integer, LocationRequest> mLocationRequests = new HashMap<>();
    private ArrayList<LocationActivityResultListener> mPendingLocationRequests = new ArrayList<>();
    private float[] mGravity = new float[9];
    private float[] mGeomagnetic = new float[9];

    /* renamed from: mTaskManager$delegate, reason: from kotlin metadata */
    private final Lazy mTaskManager = LazyKt.lazy(new Function0() { // from class: expo.modules.location.LocationModule$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TaskManagerInterface mTaskManager_delegate$lambda$0;
            mTaskManager_delegate$lambda$0 = LocationModule.mTaskManager_delegate$lambda$0(LocationModule.this);
            return mTaskManager_delegate$lambda$0;
        }
    });

    @Override // expo.modules.core.interfaces.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TaskManagerInterface getMTaskManager() {
        return (TaskManagerInterface) this.mTaskManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaskManagerInterface mTaskManager_delegate$lambda$0(LocationModule locationModule) {
        Object obj;
        try {
            obj = locationModule.getAppContext().getLegacyModuleRegistry().getModule(TaskManagerInterface.class);
        } catch (Exception unused) {
            obj = null;
        }
        TaskManagerInterface taskManagerInterface = (TaskManagerInterface) obj;
        if (taskManagerInterface != null) {
            return taskManagerInterface;
        }
        throw new TaskManagerNotFoundException();
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Object m13470constructorimpl;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent;
        Object m13470constructorimpl4;
        Object m13470constructorimpl5;
        Object m13470constructorimpl6;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent2;
        Object m13470constructorimpl7;
        Object m13470constructorimpl8;
        Object m13470constructorimpl9;
        Object m13470constructorimpl10;
        Object m13470constructorimpl11;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent3;
        Object m13470constructorimpl12;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent4;
        Object m13470constructorimpl13;
        Object m13470constructorimpl14;
        Object m13470constructorimpl15;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent5;
        Object m13470constructorimpl16;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent6;
        LocationModule locationModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (locationModule.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(locationModule);
            moduleDefinitionBuilder.Name("ExpoLocation");
            moduleDefinitionBuilder.getEventListeners().put(EventName.MODULE_CREATE, new BasicEventListener(EventName.MODULE_CREATE, new Function0<Unit>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$OnCreate$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Object obj;
                    Context context;
                    Context context2;
                    LocationModule locationModule2 = LocationModule.this;
                    Context reactContext = locationModule2.getAppContext().getReactContext();
                    if (reactContext != null) {
                        locationModule2.mContext = reactContext;
                        LocationModule locationModule3 = LocationModule.this;
                        try {
                            obj = locationModule3.getAppContext().getLegacyModuleRegistry().getModule(UIManager.class);
                        } catch (Exception unused) {
                            obj = null;
                        }
                        UIManager uIManager = (UIManager) obj;
                        if (uIManager != null) {
                            locationModule3.mUIManager = uIManager;
                            LocationModule locationModule4 = LocationModule.this;
                            context = locationModule4.mContext;
                            if (context == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                                context = null;
                            }
                            locationModule4.mLocationProvider = LocationServices.getFusedLocationProviderClient(context);
                            LocationModule locationModule5 = LocationModule.this;
                            context2 = locationModule5.mContext;
                            if (context2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                                context2 = null;
                            }
                            Object systemService = context2.getSystemService("sensor");
                            SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
                            if (sensorManager != null) {
                                locationModule5.mSensorManager = sensorManager;
                                return;
                            }
                            throw new SensorManagerUnavailable();
                        }
                        throw new MissingUIManagerException();
                    }
                    throw new Exceptions.ReactContextLost();
                }
            }));
            moduleDefinitionBuilder.Events(HEADING_EVENT_NAME, LOCATION_EVENT_NAME);
            AsyncFunctionBuilder AsyncFunction = moduleDefinitionBuilder.AsyncFunction("requestPermissionsAsync");
            SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(AsyncFunction.getName(), new AnyType[0], new LocationModule$definition$lambda$27$$inlined$Coroutine$1(null, this));
            AsyncFunction.setAsyncFunctionComponent(suspendFunctionComponent);
            SuspendFunctionComponent suspendFunctionComponent2 = suspendFunctionComponent;
            AsyncFunctionBuilder AsyncFunction2 = moduleDefinitionBuilder.AsyncFunction("getPermissionsAsync");
            SuspendFunctionComponent suspendFunctionComponent3 = new SuspendFunctionComponent(AsyncFunction2.getName(), new AnyType[0], new LocationModule$definition$lambda$27$$inlined$Coroutine$2(null, this));
            AsyncFunction2.setAsyncFunctionComponent(suspendFunctionComponent3);
            SuspendFunctionComponent suspendFunctionComponent4 = suspendFunctionComponent3;
            AsyncFunctionBuilder AsyncFunction3 = moduleDefinitionBuilder.AsyncFunction("requestForegroundPermissionsAsync");
            SuspendFunctionComponent suspendFunctionComponent5 = new SuspendFunctionComponent(AsyncFunction3.getName(), new AnyType[0], new LocationModule$definition$lambda$27$$inlined$Coroutine$3(null, this));
            AsyncFunction3.setAsyncFunctionComponent(suspendFunctionComponent5);
            SuspendFunctionComponent suspendFunctionComponent6 = suspendFunctionComponent5;
            AsyncFunctionBuilder AsyncFunction4 = moduleDefinitionBuilder.AsyncFunction("requestBackgroundPermissionsAsync");
            SuspendFunctionComponent suspendFunctionComponent7 = new SuspendFunctionComponent(AsyncFunction4.getName(), new AnyType[0], new LocationModule$definition$lambda$27$$inlined$Coroutine$4(null, this));
            AsyncFunction4.setAsyncFunctionComponent(suspendFunctionComponent7);
            SuspendFunctionComponent suspendFunctionComponent8 = suspendFunctionComponent7;
            AsyncFunctionBuilder AsyncFunction5 = moduleDefinitionBuilder.AsyncFunction("getForegroundPermissionsAsync");
            SuspendFunctionComponent suspendFunctionComponent9 = new SuspendFunctionComponent(AsyncFunction5.getName(), new AnyType[0], new LocationModule$definition$lambda$27$$inlined$Coroutine$5(null, this));
            AsyncFunction5.setAsyncFunctionComponent(suspendFunctionComponent9);
            SuspendFunctionComponent suspendFunctionComponent10 = suspendFunctionComponent9;
            AsyncFunctionBuilder AsyncFunction6 = moduleDefinitionBuilder.AsyncFunction("getBackgroundPermissionsAsync");
            SuspendFunctionComponent suspendFunctionComponent11 = new SuspendFunctionComponent(AsyncFunction6.getName(), new AnyType[0], new LocationModule$definition$lambda$27$$inlined$Coroutine$6(null, this));
            AsyncFunction6.setAsyncFunctionComponent(suspendFunctionComponent11);
            SuspendFunctionComponent suspendFunctionComponent12 = suspendFunctionComponent11;
            AsyncFunctionBuilder AsyncFunction7 = moduleDefinitionBuilder.AsyncFunction("getLastKnownPositionAsync");
            String name = AsyncFunction7.getName();
            TypeConverterProvider converters = AsyncFunction7.getConverters();
            AnyType[] anyTypeArr = new AnyType[1];
            AnyType anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(LocationLastKnownOptions.class), false));
            if (anyType == null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.location.records.LocationLastKnownOptions", Reflection.getOrCreateKotlinClass(LocationLastKnownOptions.class), false)), new Function0<KType>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$Coroutine$7
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(LocationLastKnownOptions.class);
                        }
                    }));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                }
                Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                if (m13473exceptionOrNullimpl != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + LocationLastKnownOptions.class.getName(), m13473exceptionOrNullimpl);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                    m13470constructorimpl = null;
                }
                TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                if (typeDescriptor == null) {
                    typeDescriptor = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(LocationLastKnownOptions.class));
                }
                anyType = new AnyType(typeDescriptor, converters);
            }
            anyTypeArr[0] = anyType;
            AsyncFunction7.setAsyncFunctionComponent(new SuspendFunctionComponent(name, anyTypeArr, new LocationModule$definition$lambda$27$$inlined$Coroutine$8(null, this)));
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = moduleDefinitionBuilder;
            TypeConverterProvider converters2 = moduleDefinitionBuilder2.getConverters();
            AnyType[] anyTypeArr2 = new AnyType[1];
            AnyType anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(LocationOptions.class), false));
            if (anyType2 == null) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.location.records.LocationOptions", Reflection.getOrCreateKotlinClass(LocationOptions.class), false)), new Function0<KType>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunctionWithPromise$1
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(LocationOptions.class);
                        }
                    }));
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
                if (m13473exceptionOrNullimpl2 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + LocationOptions.class.getName(), m13473exceptionOrNullimpl2);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                    m13470constructorimpl2 = null;
                }
                TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
                if (typeDescriptor2 == null) {
                    typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(LocationOptions.class));
                }
                anyType2 = new AnyType(typeDescriptor2, converters2);
            }
            anyTypeArr2[0] = anyType2;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("getCurrentPositionAsync", anyTypeArr2, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunctionWithPromise$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    LocationModule.this.getCurrentPositionAsync((LocationOptions) objArr[0], promise);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder2.getAsyncFunctions().put("getCurrentPositionAsync", asyncFunctionWithPromiseComponent);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2 = asyncFunctionWithPromiseComponent;
            ModuleDefinitionBuilder moduleDefinitionBuilder3 = moduleDefinitionBuilder;
            AnyType[] anyTypeArr3 = new AnyType[0];
            Function1<Object[], LocationProviderStatus> function1 = new Function1<Object[], LocationProviderStatus>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$1
                @Override // kotlin.jvm.functions.Function1
                public final LocationProviderStatus invoke(Object[] it) {
                    LocationProviderStatus providerStatus;
                    Intrinsics.checkNotNullParameter(it, "it");
                    providerStatus = LocationModule.this.getProviderStatus();
                    return providerStatus;
                }
            };
            moduleDefinitionBuilder3.getAsyncFunctions().put("getProviderStatusAsync", Intrinsics.areEqual(LocationProviderStatus.class, Integer.TYPE) ? new IntAsyncFunctionComponent("getProviderStatusAsync", anyTypeArr3, function1) : Intrinsics.areEqual(LocationProviderStatus.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("getProviderStatusAsync", anyTypeArr3, function1) : Intrinsics.areEqual(LocationProviderStatus.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("getProviderStatusAsync", anyTypeArr3, function1) : Intrinsics.areEqual(LocationProviderStatus.class, Float.TYPE) ? new FloatAsyncFunctionComponent("getProviderStatusAsync", anyTypeArr3, function1) : Intrinsics.areEqual(LocationProviderStatus.class, String.class) ? new StringAsyncFunctionComponent("getProviderStatusAsync", anyTypeArr3, function1) : new UntypedAsyncFunctionComponent("getProviderStatusAsync", anyTypeArr3, function1));
            ModuleDefinitionBuilder moduleDefinitionBuilder4 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(Integer.class, Promise.class)) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("watchDeviceHeading", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$2
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        LocationModule.this.mHeadingId = ((Integer) promise).intValue();
                        LocationModule.this.startHeadingUpdate();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                TypeConverterProvider converters3 = moduleDefinitionBuilder4.getConverters();
                AnyType[] anyTypeArr4 = new AnyType[1];
                AnyType anyType3 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Integer.class), false));
                if (anyType3 == null) {
                    try {
                        Result.Companion companion5 = Result.INSTANCE;
                        m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.Int", Reflection.getOrCreateKotlinClass(Integer.class), false)), new Function0<KType>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$3
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(Integer.TYPE);
                            }
                        }));
                    } catch (Throwable th3) {
                        Result.Companion companion6 = Result.INSTANCE;
                        m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
                    }
                    Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
                    if (m13473exceptionOrNullimpl3 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + Integer.class.getName(), m13473exceptionOrNullimpl3);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                        m13470constructorimpl3 = null;
                    }
                    TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
                    if (typeDescriptor3 == null) {
                        typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Integer.TYPE));
                    }
                    anyType3 = new AnyType(typeDescriptor3, converters3);
                }
                anyTypeArr4[0] = anyType3;
                Function1<Object[], Unit> function12 = new Function1<Object[], Unit>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$4
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        LocationModule.this.mHeadingId = ((Number) objArr[0]).intValue();
                        LocationModule.this.startHeadingUpdate();
                        return Unit.INSTANCE;
                    }
                };
                intAsyncFunctionComponent = Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("watchDeviceHeading", anyTypeArr4, function12) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("watchDeviceHeading", anyTypeArr4, function12) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("watchDeviceHeading", anyTypeArr4, function12) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("watchDeviceHeading", anyTypeArr4, function12) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("watchDeviceHeading", anyTypeArr4, function12) : new UntypedAsyncFunctionComponent("watchDeviceHeading", anyTypeArr4, function12);
            }
            moduleDefinitionBuilder4.getAsyncFunctions().put("watchDeviceHeading", intAsyncFunctionComponent);
            ModuleDefinitionBuilder moduleDefinitionBuilder5 = moduleDefinitionBuilder;
            TypeConverterProvider converters4 = moduleDefinitionBuilder5.getConverters();
            AnyType[] anyTypeArr5 = new AnyType[2];
            AnyType anyType4 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Integer.class), false));
            if (anyType4 == null) {
                try {
                    Result.Companion companion7 = Result.INSTANCE;
                    m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.Int", Reflection.getOrCreateKotlinClass(Integer.class), false)), new Function0<KType>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunctionWithPromise$3
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Integer.TYPE);
                        }
                    }));
                } catch (Throwable th4) {
                    Result.Companion companion8 = Result.INSTANCE;
                    m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
                }
                Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
                if (m13473exceptionOrNullimpl4 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + Integer.class.getName(), m13473exceptionOrNullimpl4);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                    m13470constructorimpl4 = null;
                }
                TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl4;
                if (typeDescriptor4 == null) {
                    typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Integer.TYPE));
                }
                anyType4 = new AnyType(typeDescriptor4, converters4);
            }
            anyTypeArr5[0] = anyType4;
            AnyType anyType5 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(LocationOptions.class), false));
            if (anyType5 == null) {
                try {
                    Result.Companion companion9 = Result.INSTANCE;
                    m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.location.records.LocationOptions", Reflection.getOrCreateKotlinClass(LocationOptions.class), false)), new Function0<KType>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunctionWithPromise$4
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(LocationOptions.class);
                        }
                    }));
                } catch (Throwable th5) {
                    Result.Companion companion10 = Result.INSTANCE;
                    m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
                }
                Throwable m13473exceptionOrNullimpl5 = Result.m13473exceptionOrNullimpl(m13470constructorimpl5);
                if (m13473exceptionOrNullimpl5 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + LocationOptions.class.getName(), m13473exceptionOrNullimpl5);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl5)) {
                    m13470constructorimpl5 = null;
                }
                TypeDescriptor typeDescriptor5 = (TypeDescriptor) m13470constructorimpl5;
                if (typeDescriptor5 == null) {
                    typeDescriptor5 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(LocationOptions.class));
                }
                anyType5 = new AnyType(typeDescriptor5, converters4);
            }
            anyTypeArr5[1] = anyType5;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent3 = new AsyncFunctionWithPromiseComponent("watchPositionImplAsync", anyTypeArr5, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunctionWithPromise$5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, final Promise promise) {
                    boolean isMissingForegroundPermissions;
                    Context context;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    Object obj = objArr[0];
                    LocationOptions locationOptions = (LocationOptions) objArr[1];
                    final int intValue = ((Number) obj).intValue();
                    isMissingForegroundPermissions = LocationModule.this.isMissingForegroundPermissions();
                    if (isMissingForegroundPermissions) {
                        promise.reject(new LocationUnauthorizedException());
                        return;
                    }
                    final LocationRequest prepareLocationRequest$expo_location_release = LocationHelpers.INSTANCE.prepareLocationRequest$expo_location_release(locationOptions);
                    boolean mayShowUserSettingsDialog = locationOptions.getMayShowUserSettingsDialog();
                    LocationHelpers.Companion companion11 = LocationHelpers.INSTANCE;
                    context = LocationModule.this.mContext;
                    if (context == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mContext");
                        context = null;
                    }
                    if (companion11.hasNetworkProviderEnabled(context) || !mayShowUserSettingsDialog) {
                        LocationHelpers.INSTANCE.requestContinuousUpdates(LocationModule.this, prepareLocationRequest$expo_location_release, intValue, promise);
                        return;
                    }
                    LocationModule locationModule2 = LocationModule.this;
                    final LocationModule locationModule3 = LocationModule.this;
                    locationModule2.addPendingLocationRequest(prepareLocationRequest$expo_location_release, new LocationActivityResultListener() { // from class: expo.modules.location.LocationModule$definition$1$12$1
                        @Override // expo.modules.location.LocationActivityResultListener
                        public void onResult(int resultCode) {
                            if (resultCode == -1) {
                                LocationHelpers.INSTANCE.requestContinuousUpdates(LocationModule.this, prepareLocationRequest$expo_location_release, intValue, promise);
                            } else {
                                promise.reject(new LocationSettingsUnsatisfiedException());
                            }
                        }
                    });
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder5.getAsyncFunctions().put("watchPositionImplAsync", asyncFunctionWithPromiseComponent3);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent4 = asyncFunctionWithPromiseComponent3;
            ModuleDefinitionBuilder moduleDefinitionBuilder6 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(Integer.class, Promise.class)) {
                intAsyncFunctionComponent2 = new AsyncFunctionWithPromiseComponent("removeWatchAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$5
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        boolean isMissingForegroundPermissions;
                        int i;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        int intValue = ((Integer) promise).intValue();
                        isMissingForegroundPermissions = LocationModule.this.isMissingForegroundPermissions();
                        if (!isMissingForegroundPermissions) {
                            i = LocationModule.this.mHeadingId;
                            if (intValue == i) {
                                LocationModule.this.destroyHeadingWatch();
                                return;
                            } else {
                                LocationModule.this.removeLocationUpdatesForRequest(intValue);
                                return;
                            }
                        }
                        throw new LocationUnauthorizedException();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                TypeConverterProvider converters5 = moduleDefinitionBuilder6.getConverters();
                AnyType[] anyTypeArr6 = new AnyType[1];
                AnyType anyType6 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Integer.class), false));
                if (anyType6 == null) {
                    try {
                        Result.Companion companion11 = Result.INSTANCE;
                        m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.Int", Reflection.getOrCreateKotlinClass(Integer.class), false)), new Function0<KType>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$6
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(Integer.TYPE);
                            }
                        }));
                    } catch (Throwable th6) {
                        Result.Companion companion12 = Result.INSTANCE;
                        m13470constructorimpl6 = Result.m13470constructorimpl(ResultKt.createFailure(th6));
                    }
                    Throwable m13473exceptionOrNullimpl6 = Result.m13473exceptionOrNullimpl(m13470constructorimpl6);
                    if (m13473exceptionOrNullimpl6 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + Integer.class.getName(), m13473exceptionOrNullimpl6);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl6)) {
                        m13470constructorimpl6 = null;
                    }
                    TypeDescriptor typeDescriptor6 = (TypeDescriptor) m13470constructorimpl6;
                    if (typeDescriptor6 == null) {
                        typeDescriptor6 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Integer.TYPE));
                    }
                    anyType6 = new AnyType(typeDescriptor6, converters5);
                }
                anyTypeArr6[0] = anyType6;
                Function1<Object[], Unit> function13 = new Function1<Object[], Unit>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$7
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        boolean isMissingForegroundPermissions;
                        int i;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        int intValue = ((Number) objArr[0]).intValue();
                        isMissingForegroundPermissions = LocationModule.this.isMissingForegroundPermissions();
                        if (!isMissingForegroundPermissions) {
                            i = LocationModule.this.mHeadingId;
                            if (intValue == i) {
                                LocationModule.this.destroyHeadingWatch();
                            } else {
                                LocationModule.this.removeLocationUpdatesForRequest(intValue);
                            }
                            return Unit.INSTANCE;
                        }
                        throw new LocationUnauthorizedException();
                    }
                };
                intAsyncFunctionComponent2 = Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("removeWatchAsync", anyTypeArr6, function13) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("removeWatchAsync", anyTypeArr6, function13) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("removeWatchAsync", anyTypeArr6, function13) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("removeWatchAsync", anyTypeArr6, function13) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("removeWatchAsync", anyTypeArr6, function13) : new UntypedAsyncFunctionComponent("removeWatchAsync", anyTypeArr6, function13);
            }
            moduleDefinitionBuilder6.getAsyncFunctions().put("removeWatchAsync", intAsyncFunctionComponent2);
            AsyncFunctionBuilder AsyncFunction8 = moduleDefinitionBuilder.AsyncFunction("geocodeAsync");
            String name2 = AsyncFunction8.getName();
            TypeConverterProvider converters6 = AsyncFunction8.getConverters();
            AnyType[] anyTypeArr7 = new AnyType[1];
            AnyType anyType7 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType7 == null) {
                try {
                    Result.Companion companion13 = Result.INSTANCE;
                    m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$Coroutine$9
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th7) {
                    Result.Companion companion14 = Result.INSTANCE;
                    m13470constructorimpl7 = Result.m13470constructorimpl(ResultKt.createFailure(th7));
                }
                Throwable m13473exceptionOrNullimpl7 = Result.m13473exceptionOrNullimpl(m13470constructorimpl7);
                if (m13473exceptionOrNullimpl7 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl7);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl7)) {
                    m13470constructorimpl7 = null;
                }
                TypeDescriptor typeDescriptor7 = (TypeDescriptor) m13470constructorimpl7;
                if (typeDescriptor7 == null) {
                    typeDescriptor7 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType7 = new AnyType(typeDescriptor7, converters6);
            }
            anyTypeArr7[0] = anyType7;
            AsyncFunction8.setAsyncFunctionComponent(new SuspendFunctionComponent(name2, anyTypeArr7, new LocationModule$definition$lambda$27$$inlined$Coroutine$10(null, this)));
            AsyncFunctionBuilder AsyncFunction9 = moduleDefinitionBuilder.AsyncFunction("reverseGeocodeAsync");
            String name3 = AsyncFunction9.getName();
            TypeConverterProvider converters7 = AsyncFunction9.getConverters();
            AnyType[] anyTypeArr8 = new AnyType[1];
            AnyType anyType8 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ReverseGeocodeLocation.class), false));
            if (anyType8 == null) {
                try {
                    Result.Companion companion15 = Result.INSTANCE;
                    m13470constructorimpl8 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.location.records.ReverseGeocodeLocation", Reflection.getOrCreateKotlinClass(ReverseGeocodeLocation.class), false)), new Function0<KType>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$Coroutine$11
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(ReverseGeocodeLocation.class);
                        }
                    }));
                } catch (Throwable th8) {
                    Result.Companion companion16 = Result.INSTANCE;
                    m13470constructorimpl8 = Result.m13470constructorimpl(ResultKt.createFailure(th8));
                }
                Throwable m13473exceptionOrNullimpl8 = Result.m13473exceptionOrNullimpl(m13470constructorimpl8);
                if (m13473exceptionOrNullimpl8 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + ReverseGeocodeLocation.class.getName(), m13473exceptionOrNullimpl8);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl8)) {
                    m13470constructorimpl8 = null;
                }
                TypeDescriptor typeDescriptor8 = (TypeDescriptor) m13470constructorimpl8;
                if (typeDescriptor8 == null) {
                    typeDescriptor8 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(ReverseGeocodeLocation.class));
                }
                anyType8 = new AnyType(typeDescriptor8, converters7);
            }
            anyTypeArr8[0] = anyType8;
            AsyncFunction9.setAsyncFunctionComponent(new SuspendFunctionComponent(name3, anyTypeArr8, new LocationModule$definition$lambda$27$$inlined$Coroutine$12(null, this)));
            AsyncFunctionBuilder AsyncFunction10 = moduleDefinitionBuilder.AsyncFunction("enableNetworkProviderAsync");
            SuspendFunctionComponent suspendFunctionComponent13 = new SuspendFunctionComponent(AsyncFunction10.getName(), new AnyType[0], new LocationModule$definition$lambda$27$$inlined$Coroutine$13(null, this));
            AsyncFunction10.setAsyncFunctionComponent(suspendFunctionComponent13);
            SuspendFunctionComponent suspendFunctionComponent14 = suspendFunctionComponent13;
            ModuleDefinitionBuilder moduleDefinitionBuilder7 = moduleDefinitionBuilder;
            AnyType[] anyTypeArr9 = new AnyType[0];
            Function1<Object[], Boolean> function14 = new Function1<Object[], Boolean>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$8
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object[] it) {
                    Context context;
                    Intrinsics.checkNotNullParameter(it, "it");
                    LocationHelpers.Companion companion17 = LocationHelpers.INSTANCE;
                    context = LocationModule.this.mContext;
                    if (context == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mContext");
                        context = null;
                    }
                    return Boolean.valueOf(companion17.isAnyProviderAvailable(context));
                }
            };
            moduleDefinitionBuilder7.getAsyncFunctions().put("hasServicesEnabledAsync", Intrinsics.areEqual(Boolean.class, Integer.TYPE) ? new IntAsyncFunctionComponent("hasServicesEnabledAsync", anyTypeArr9, function14) : Intrinsics.areEqual(Boolean.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("hasServicesEnabledAsync", anyTypeArr9, function14) : Intrinsics.areEqual(Boolean.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("hasServicesEnabledAsync", anyTypeArr9, function14) : Intrinsics.areEqual(Boolean.class, Float.TYPE) ? new FloatAsyncFunctionComponent("hasServicesEnabledAsync", anyTypeArr9, function14) : Intrinsics.areEqual(Boolean.class, String.class) ? new StringAsyncFunctionComponent("hasServicesEnabledAsync", anyTypeArr9, function14) : new UntypedAsyncFunctionComponent("hasServicesEnabledAsync", anyTypeArr9, function14));
            ModuleDefinitionBuilder moduleDefinitionBuilder8 = moduleDefinitionBuilder;
            TypeConverterProvider converters8 = moduleDefinitionBuilder8.getConverters();
            AnyType[] anyTypeArr10 = new AnyType[2];
            AnyType anyType9 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType9 == null) {
                try {
                    Result.Companion companion17 = Result.INSTANCE;
                    m13470constructorimpl9 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$9
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th9) {
                    Result.Companion companion18 = Result.INSTANCE;
                    m13470constructorimpl9 = Result.m13470constructorimpl(ResultKt.createFailure(th9));
                }
                Throwable m13473exceptionOrNullimpl9 = Result.m13473exceptionOrNullimpl(m13470constructorimpl9);
                if (m13473exceptionOrNullimpl9 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl9);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl9)) {
                    m13470constructorimpl9 = null;
                }
                TypeDescriptor typeDescriptor9 = (TypeDescriptor) m13470constructorimpl9;
                if (typeDescriptor9 == null) {
                    typeDescriptor9 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType9 = new AnyType(typeDescriptor9, converters8);
            }
            anyTypeArr10[0] = anyType9;
            AnyType anyType10 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(LocationTaskOptions.class), false));
            if (anyType10 == null) {
                try {
                    Result.Companion companion19 = Result.INSTANCE;
                    m13470constructorimpl10 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.location.records.LocationTaskOptions", Reflection.getOrCreateKotlinClass(LocationTaskOptions.class), false)), new Function0<KType>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$10
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(LocationTaskOptions.class);
                        }
                    }));
                } catch (Throwable th10) {
                    Result.Companion companion20 = Result.INSTANCE;
                    m13470constructorimpl10 = Result.m13470constructorimpl(ResultKt.createFailure(th10));
                }
                Throwable m13473exceptionOrNullimpl10 = Result.m13473exceptionOrNullimpl(m13470constructorimpl10);
                if (m13473exceptionOrNullimpl10 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + LocationTaskOptions.class.getName(), m13473exceptionOrNullimpl10);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl10)) {
                    m13470constructorimpl10 = null;
                }
                TypeDescriptor typeDescriptor10 = (TypeDescriptor) m13470constructorimpl10;
                if (typeDescriptor10 == null) {
                    typeDescriptor10 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(LocationTaskOptions.class));
                }
                anyType10 = new AnyType(typeDescriptor10, converters8);
            }
            anyTypeArr10[1] = anyType10;
            Function1<Object[], Unit> function15 = new Function1<Object[], Unit>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$11
                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Object[] objArr) {
                    boolean isMissingForegroundPermissions;
                    boolean hasForegroundServicePermissions;
                    TaskManagerInterface mTaskManager;
                    boolean isMissingBackgroundPermissions;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Object obj = objArr[0];
                    LocationTaskOptions locationTaskOptions = (LocationTaskOptions) objArr[1];
                    String str = (String) obj;
                    boolean z = locationTaskOptions.getForegroundService() != null;
                    isMissingForegroundPermissions = LocationModule.this.isMissingForegroundPermissions();
                    if (isMissingForegroundPermissions) {
                        throw new LocationBackgroundUnauthorizedException();
                    }
                    if (!z) {
                        isMissingBackgroundPermissions = LocationModule.this.isMissingBackgroundPermissions();
                        if (isMissingBackgroundPermissions) {
                            throw new LocationBackgroundUnauthorizedException();
                        }
                    }
                    if (AppForegroundedSingleton.INSTANCE.isForegrounded() || locationTaskOptions.getForegroundService() == null) {
                        hasForegroundServicePermissions = LocationModule.this.hasForegroundServicePermissions();
                        if (hasForegroundServicePermissions) {
                            mTaskManager = LocationModule.this.getMTaskManager();
                            mTaskManager.registerTask(str, LocationTaskConsumer.class, locationTaskOptions.toMutableMap$expo_location_release());
                            return Unit.INSTANCE;
                        }
                        throw new ForegroundServicePermissionsException();
                    }
                    throw new ForegroundServiceStartNotAllowedException();
                }
            };
            moduleDefinitionBuilder8.getAsyncFunctions().put("startLocationUpdatesAsync", Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("startLocationUpdatesAsync", anyTypeArr10, function15) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("startLocationUpdatesAsync", anyTypeArr10, function15) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("startLocationUpdatesAsync", anyTypeArr10, function15) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("startLocationUpdatesAsync", anyTypeArr10, function15) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("startLocationUpdatesAsync", anyTypeArr10, function15) : new UntypedAsyncFunctionComponent("startLocationUpdatesAsync", anyTypeArr10, function15));
            ModuleDefinitionBuilder moduleDefinitionBuilder9 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(String.class, Promise.class)) {
                intAsyncFunctionComponent3 = new AsyncFunctionWithPromiseComponent("stopLocationUpdatesAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$12
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        TaskManagerInterface mTaskManager;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        mTaskManager = LocationModule.this.getMTaskManager();
                        mTaskManager.unregisterTask((String) promise, LocationTaskConsumer.class);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                TypeConverterProvider converters9 = moduleDefinitionBuilder9.getConverters();
                AnyType[] anyTypeArr11 = new AnyType[1];
                AnyType anyType11 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
                if (anyType11 == null) {
                    try {
                        Result.Companion companion21 = Result.INSTANCE;
                        m13470constructorimpl11 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$13
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(String.class);
                            }
                        }));
                    } catch (Throwable th11) {
                        Result.Companion companion22 = Result.INSTANCE;
                        m13470constructorimpl11 = Result.m13470constructorimpl(ResultKt.createFailure(th11));
                    }
                    Throwable m13473exceptionOrNullimpl11 = Result.m13473exceptionOrNullimpl(m13470constructorimpl11);
                    if (m13473exceptionOrNullimpl11 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl11);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl11)) {
                        m13470constructorimpl11 = null;
                    }
                    TypeDescriptor typeDescriptor11 = (TypeDescriptor) m13470constructorimpl11;
                    if (typeDescriptor11 == null) {
                        typeDescriptor11 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                    }
                    anyType11 = new AnyType(typeDescriptor11, converters9);
                }
                anyTypeArr11[0] = anyType11;
                Function1<Object[], Unit> function16 = new Function1<Object[], Unit>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$14
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        TaskManagerInterface mTaskManager;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        mTaskManager = LocationModule.this.getMTaskManager();
                        mTaskManager.unregisterTask(str, LocationTaskConsumer.class);
                        return Unit.INSTANCE;
                    }
                };
                intAsyncFunctionComponent3 = Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("stopLocationUpdatesAsync", anyTypeArr11, function16) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("stopLocationUpdatesAsync", anyTypeArr11, function16) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("stopLocationUpdatesAsync", anyTypeArr11, function16) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("stopLocationUpdatesAsync", anyTypeArr11, function16) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("stopLocationUpdatesAsync", anyTypeArr11, function16) : new UntypedAsyncFunctionComponent("stopLocationUpdatesAsync", anyTypeArr11, function16);
            }
            moduleDefinitionBuilder9.getAsyncFunctions().put("stopLocationUpdatesAsync", intAsyncFunctionComponent3);
            ModuleDefinitionBuilder moduleDefinitionBuilder10 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(String.class, Promise.class)) {
                intAsyncFunctionComponent4 = new AsyncFunctionWithPromiseComponent("hasStartedLocationUpdatesAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$15
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        TaskManagerInterface mTaskManager;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        mTaskManager = LocationModule.this.getMTaskManager();
                        mTaskManager.taskHasConsumerOfClass((String) promise, LocationTaskConsumer.class);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                TypeConverterProvider converters10 = moduleDefinitionBuilder10.getConverters();
                AnyType[] anyTypeArr12 = new AnyType[1];
                AnyType anyType12 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
                if (anyType12 == null) {
                    try {
                        Result.Companion companion23 = Result.INSTANCE;
                        m13470constructorimpl12 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$16
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(String.class);
                            }
                        }));
                    } catch (Throwable th12) {
                        Result.Companion companion24 = Result.INSTANCE;
                        m13470constructorimpl12 = Result.m13470constructorimpl(ResultKt.createFailure(th12));
                    }
                    Throwable m13473exceptionOrNullimpl12 = Result.m13473exceptionOrNullimpl(m13470constructorimpl12);
                    if (m13473exceptionOrNullimpl12 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl12);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl12)) {
                        m13470constructorimpl12 = null;
                    }
                    TypeDescriptor typeDescriptor12 = (TypeDescriptor) m13470constructorimpl12;
                    if (typeDescriptor12 == null) {
                        typeDescriptor12 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                    }
                    anyType12 = new AnyType(typeDescriptor12, converters10);
                }
                anyTypeArr12[0] = anyType12;
                Function1<Object[], Boolean> function17 = new Function1<Object[], Boolean>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$17
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(Object[] objArr) {
                        TaskManagerInterface mTaskManager;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        mTaskManager = LocationModule.this.getMTaskManager();
                        return Boolean.valueOf(mTaskManager.taskHasConsumerOfClass(str, LocationTaskConsumer.class));
                    }
                };
                intAsyncFunctionComponent4 = Intrinsics.areEqual(Boolean.class, Integer.TYPE) ? new IntAsyncFunctionComponent("hasStartedLocationUpdatesAsync", anyTypeArr12, function17) : Intrinsics.areEqual(Boolean.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("hasStartedLocationUpdatesAsync", anyTypeArr12, function17) : Intrinsics.areEqual(Boolean.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("hasStartedLocationUpdatesAsync", anyTypeArr12, function17) : Intrinsics.areEqual(Boolean.class, Float.TYPE) ? new FloatAsyncFunctionComponent("hasStartedLocationUpdatesAsync", anyTypeArr12, function17) : Intrinsics.areEqual(Boolean.class, String.class) ? new StringAsyncFunctionComponent("hasStartedLocationUpdatesAsync", anyTypeArr12, function17) : new UntypedAsyncFunctionComponent("hasStartedLocationUpdatesAsync", anyTypeArr12, function17);
            }
            moduleDefinitionBuilder10.getAsyncFunctions().put("hasStartedLocationUpdatesAsync", intAsyncFunctionComponent4);
            ModuleDefinitionBuilder moduleDefinitionBuilder11 = moduleDefinitionBuilder;
            TypeConverterProvider converters11 = moduleDefinitionBuilder11.getConverters();
            AnyType[] anyTypeArr13 = new AnyType[2];
            AnyType anyType13 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType13 == null) {
                try {
                    Result.Companion companion25 = Result.INSTANCE;
                    m13470constructorimpl13 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$18
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th13) {
                    Result.Companion companion26 = Result.INSTANCE;
                    m13470constructorimpl13 = Result.m13470constructorimpl(ResultKt.createFailure(th13));
                }
                Throwable m13473exceptionOrNullimpl13 = Result.m13473exceptionOrNullimpl(m13470constructorimpl13);
                if (m13473exceptionOrNullimpl13 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl13);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl13)) {
                    m13470constructorimpl13 = null;
                }
                TypeDescriptor typeDescriptor13 = (TypeDescriptor) m13470constructorimpl13;
                if (typeDescriptor13 == null) {
                    typeDescriptor13 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType13 = new AnyType(typeDescriptor13, converters11);
            }
            anyTypeArr13[0] = anyType13;
            AnyType anyType14 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(GeofencingOptions.class), false));
            if (anyType14 == null) {
                try {
                    Result.Companion companion27 = Result.INSTANCE;
                    m13470constructorimpl14 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.location.records.GeofencingOptions", Reflection.getOrCreateKotlinClass(GeofencingOptions.class), false)), new Function0<KType>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$19
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(GeofencingOptions.class);
                        }
                    }));
                } catch (Throwable th14) {
                    Result.Companion companion28 = Result.INSTANCE;
                    m13470constructorimpl14 = Result.m13470constructorimpl(ResultKt.createFailure(th14));
                }
                Throwable m13473exceptionOrNullimpl14 = Result.m13473exceptionOrNullimpl(m13470constructorimpl14);
                if (m13473exceptionOrNullimpl14 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + GeofencingOptions.class.getName(), m13473exceptionOrNullimpl14);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl14)) {
                    m13470constructorimpl14 = null;
                }
                TypeDescriptor typeDescriptor14 = (TypeDescriptor) m13470constructorimpl14;
                if (typeDescriptor14 == null) {
                    typeDescriptor14 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(GeofencingOptions.class));
                }
                anyType14 = new AnyType(typeDescriptor14, converters11);
            }
            anyTypeArr13[1] = anyType14;
            Function1<Object[], Unit> function18 = new Function1<Object[], Unit>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$20
                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Object[] objArr) {
                    boolean isMissingBackgroundPermissions;
                    TaskManagerInterface mTaskManager;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Object obj = objArr[0];
                    GeofencingOptions geofencingOptions = (GeofencingOptions) objArr[1];
                    String str = (String) obj;
                    isMissingBackgroundPermissions = LocationModule.this.isMissingBackgroundPermissions();
                    if (!isMissingBackgroundPermissions) {
                        mTaskManager = LocationModule.this.getMTaskManager();
                        mTaskManager.registerTask(str, GeofencingTaskConsumer.class, geofencingOptions.toMap$expo_location_release());
                        return Unit.INSTANCE;
                    }
                    throw new LocationBackgroundUnauthorizedException();
                }
            };
            moduleDefinitionBuilder11.getAsyncFunctions().put("startGeofencingAsync", Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("startGeofencingAsync", anyTypeArr13, function18) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("startGeofencingAsync", anyTypeArr13, function18) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("startGeofencingAsync", anyTypeArr13, function18) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("startGeofencingAsync", anyTypeArr13, function18) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("startGeofencingAsync", anyTypeArr13, function18) : new UntypedAsyncFunctionComponent("startGeofencingAsync", anyTypeArr13, function18));
            ModuleDefinitionBuilder moduleDefinitionBuilder12 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(String.class, Promise.class)) {
                intAsyncFunctionComponent5 = new AsyncFunctionWithPromiseComponent("hasStartedGeofencingAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$21
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        boolean isMissingBackgroundPermissions;
                        TaskManagerInterface mTaskManager;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        String str = (String) promise;
                        isMissingBackgroundPermissions = LocationModule.this.isMissingBackgroundPermissions();
                        if (!isMissingBackgroundPermissions) {
                            mTaskManager = LocationModule.this.getMTaskManager();
                            mTaskManager.taskHasConsumerOfClass(str, GeofencingTaskConsumer.class);
                            return;
                        }
                        throw new LocationBackgroundUnauthorizedException();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                TypeConverterProvider converters12 = moduleDefinitionBuilder12.getConverters();
                AnyType[] anyTypeArr14 = new AnyType[1];
                AnyType anyType15 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
                if (anyType15 == null) {
                    try {
                        Result.Companion companion29 = Result.INSTANCE;
                        m13470constructorimpl15 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$22
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(String.class);
                            }
                        }));
                    } catch (Throwable th15) {
                        Result.Companion companion30 = Result.INSTANCE;
                        m13470constructorimpl15 = Result.m13470constructorimpl(ResultKt.createFailure(th15));
                    }
                    Throwable m13473exceptionOrNullimpl15 = Result.m13473exceptionOrNullimpl(m13470constructorimpl15);
                    if (m13473exceptionOrNullimpl15 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl15);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl15)) {
                        m13470constructorimpl15 = null;
                    }
                    TypeDescriptor typeDescriptor15 = (TypeDescriptor) m13470constructorimpl15;
                    if (typeDescriptor15 == null) {
                        typeDescriptor15 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                    }
                    anyType15 = new AnyType(typeDescriptor15, converters12);
                }
                anyTypeArr14[0] = anyType15;
                Function1<Object[], Boolean> function19 = new Function1<Object[], Boolean>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$23
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(Object[] objArr) {
                        boolean isMissingBackgroundPermissions;
                        TaskManagerInterface mTaskManager;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        isMissingBackgroundPermissions = LocationModule.this.isMissingBackgroundPermissions();
                        if (!isMissingBackgroundPermissions) {
                            mTaskManager = LocationModule.this.getMTaskManager();
                            return Boolean.valueOf(mTaskManager.taskHasConsumerOfClass(str, GeofencingTaskConsumer.class));
                        }
                        throw new LocationBackgroundUnauthorizedException();
                    }
                };
                intAsyncFunctionComponent5 = Intrinsics.areEqual(Boolean.class, Integer.TYPE) ? new IntAsyncFunctionComponent("hasStartedGeofencingAsync", anyTypeArr14, function19) : Intrinsics.areEqual(Boolean.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("hasStartedGeofencingAsync", anyTypeArr14, function19) : Intrinsics.areEqual(Boolean.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("hasStartedGeofencingAsync", anyTypeArr14, function19) : Intrinsics.areEqual(Boolean.class, Float.TYPE) ? new FloatAsyncFunctionComponent("hasStartedGeofencingAsync", anyTypeArr14, function19) : Intrinsics.areEqual(Boolean.class, String.class) ? new StringAsyncFunctionComponent("hasStartedGeofencingAsync", anyTypeArr14, function19) : new UntypedAsyncFunctionComponent("hasStartedGeofencingAsync", anyTypeArr14, function19);
            }
            moduleDefinitionBuilder12.getAsyncFunctions().put("hasStartedGeofencingAsync", intAsyncFunctionComponent5);
            ModuleDefinitionBuilder moduleDefinitionBuilder13 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(String.class, Promise.class)) {
                intAsyncFunctionComponent6 = new AsyncFunctionWithPromiseComponent("stopGeofencingAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$24
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        boolean isMissingBackgroundPermissions;
                        TaskManagerInterface mTaskManager;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        String str = (String) promise;
                        isMissingBackgroundPermissions = LocationModule.this.isMissingBackgroundPermissions();
                        if (!isMissingBackgroundPermissions) {
                            mTaskManager = LocationModule.this.getMTaskManager();
                            mTaskManager.unregisterTask(str, GeofencingTaskConsumer.class);
                            return;
                        }
                        throw new LocationBackgroundUnauthorizedException();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                TypeConverterProvider converters13 = moduleDefinitionBuilder13.getConverters();
                AnyType[] anyTypeArr15 = new AnyType[1];
                AnyType anyType16 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
                if (anyType16 == null) {
                    try {
                        Result.Companion companion31 = Result.INSTANCE;
                        m13470constructorimpl16 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$25
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(String.class);
                            }
                        }));
                    } catch (Throwable th16) {
                        Result.Companion companion32 = Result.INSTANCE;
                        m13470constructorimpl16 = Result.m13470constructorimpl(ResultKt.createFailure(th16));
                    }
                    Throwable m13473exceptionOrNullimpl16 = Result.m13473exceptionOrNullimpl(m13470constructorimpl16);
                    if (m13473exceptionOrNullimpl16 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl16);
                    }
                    TypeDescriptor typeDescriptor16 = (TypeDescriptor) (Result.m13476isFailureimpl(m13470constructorimpl16) ? null : m13470constructorimpl16);
                    if (typeDescriptor16 == null) {
                        typeDescriptor16 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                    }
                    anyType16 = new AnyType(typeDescriptor16, converters13);
                }
                anyTypeArr15[0] = anyType16;
                Function1<Object[], Unit> function110 = new Function1<Object[], Unit>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$AsyncFunction$26
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        boolean isMissingBackgroundPermissions;
                        TaskManagerInterface mTaskManager;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        isMissingBackgroundPermissions = LocationModule.this.isMissingBackgroundPermissions();
                        if (!isMissingBackgroundPermissions) {
                            mTaskManager = LocationModule.this.getMTaskManager();
                            mTaskManager.unregisterTask(str, GeofencingTaskConsumer.class);
                            return Unit.INSTANCE;
                        }
                        throw new LocationBackgroundUnauthorizedException();
                    }
                };
                intAsyncFunctionComponent6 = Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("stopGeofencingAsync", anyTypeArr15, function110) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("stopGeofencingAsync", anyTypeArr15, function110) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("stopGeofencingAsync", anyTypeArr15, function110) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("stopGeofencingAsync", anyTypeArr15, function110) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("stopGeofencingAsync", anyTypeArr15, function110) : new UntypedAsyncFunctionComponent("stopGeofencingAsync", anyTypeArr15, function110);
            }
            moduleDefinitionBuilder13.getAsyncFunctions().put("stopGeofencingAsync", intAsyncFunctionComponent6);
            moduleDefinitionBuilder.getEventListeners().put(EventName.ACTIVITY_ENTERS_FOREGROUND, new BasicEventListener(EventName.ACTIVITY_ENTERS_FOREGROUND, new Function0<Unit>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$OnActivityEntersForeground$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    AppForegroundedSingleton.INSTANCE.setForegrounded(true);
                }
            }));
            moduleDefinitionBuilder.getEventListeners().put(EventName.ACTIVITY_ENTERS_BACKGROUND, new BasicEventListener(EventName.ACTIVITY_ENTERS_BACKGROUND, new Function0<Unit>() { // from class: expo.modules.location.LocationModule$definition$lambda$27$$inlined$OnActivityEntersBackground$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    AppForegroundedSingleton.INSTANCE.setForegrounded(false);
                }
            }));
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getForegroundPermissionsAsync(Continuation<? super PermissionRequestResponse> continuation) {
        LocationModule$getForegroundPermissionsAsync$1 locationModule$getForegroundPermissionsAsync$1;
        Object coroutine_suspended;
        int i;
        Permissions permissions;
        Object permissionsWithPermissionsManager$expo_location_release;
        PermissionRequestResponse permissionRequestResponse;
        PermissionRequestResponse permissionRequestResponse2;
        String str;
        if (continuation instanceof LocationModule$getForegroundPermissionsAsync$1) {
            locationModule$getForegroundPermissionsAsync$1 = (LocationModule$getForegroundPermissionsAsync$1) continuation;
            if ((locationModule$getForegroundPermissionsAsync$1.label & Integer.MIN_VALUE) != 0) {
                locationModule$getForegroundPermissionsAsync$1.label -= Integer.MIN_VALUE;
                Object obj = locationModule$getForegroundPermissionsAsync$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = locationModule$getForegroundPermissionsAsync$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    permissions = getAppContext().getPermissions();
                    if (permissions != null) {
                        locationModule$getForegroundPermissionsAsync$1.L$0 = permissions;
                        locationModule$getForegroundPermissionsAsync$1.label = 1;
                        obj = LocationHelpers.INSTANCE.getPermissionsWithPermissionsManager$expo_location_release(permissions, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, locationModule$getForegroundPermissionsAsync$1);
                    } else {
                        throw new NoPermissionsModuleException();
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        permissionRequestResponse = (PermissionRequestResponse) locationModule$getForegroundPermissionsAsync$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        permissionRequestResponse2 = (PermissionRequestResponse) obj;
                        if (permissionRequestResponse.getGranted()) {
                            str = "none";
                        } else {
                            str = "coarse";
                        }
                        if (permissionRequestResponse2.getGranted()) {
                            str = "fine";
                        }
                        permissionRequestResponse.setAndroid(new PermissionDetailsLocationAndroid(str));
                        return permissionRequestResponse;
                    }
                    permissions = (Permissions) locationModule$getForegroundPermissionsAsync$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                PermissionRequestResponse permissionRequestResponse3 = (PermissionRequestResponse) obj;
                locationModule$getForegroundPermissionsAsync$1.L$0 = permissionRequestResponse3;
                locationModule$getForegroundPermissionsAsync$1.label = 2;
                permissionsWithPermissionsManager$expo_location_release = LocationHelpers.INSTANCE.getPermissionsWithPermissionsManager$expo_location_release(permissions, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, locationModule$getForegroundPermissionsAsync$1);
                if (permissionsWithPermissionsManager$expo_location_release != coroutine_suspended) {
                    permissionRequestResponse = permissionRequestResponse3;
                    obj = permissionsWithPermissionsManager$expo_location_release;
                    permissionRequestResponse2 = (PermissionRequestResponse) obj;
                    if (permissionRequestResponse.getGranted()) {
                    }
                    if (permissionRequestResponse2.getGranted()) {
                    }
                    permissionRequestResponse.setAndroid(new PermissionDetailsLocationAndroid(str));
                    return permissionRequestResponse;
                }
                return coroutine_suspended;
            }
        }
        locationModule$getForegroundPermissionsAsync$1 = new LocationModule$getForegroundPermissionsAsync$1(this, continuation);
        Object obj2 = locationModule$getForegroundPermissionsAsync$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = locationModule$getForegroundPermissionsAsync$1.label;
        if (i != 0) {
        }
        PermissionRequestResponse permissionRequestResponse32 = (PermissionRequestResponse) obj2;
        locationModule$getForegroundPermissionsAsync$1.L$0 = permissionRequestResponse32;
        locationModule$getForegroundPermissionsAsync$1.label = 2;
        permissionsWithPermissionsManager$expo_location_release = LocationHelpers.INSTANCE.getPermissionsWithPermissionsManager$expo_location_release(permissions, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, locationModule$getForegroundPermissionsAsync$1);
        if (permissionsWithPermissionsManager$expo_location_release != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocationProviderStatus getProviderStatus() {
        Context context = this.mContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        boolean isProviderEnabled = locationManager.isProviderEnabled("gps");
        boolean isProviderEnabled2 = locationManager.isProviderEnabled("network");
        boolean isLocationEnabled = LocationManagerCompat.isLocationEnabled(locationManager);
        boolean isProviderEnabled3 = locationManager.isProviderEnabled("passive");
        LocationProviderStatus locationProviderStatus = new LocationProviderStatus(null, null, null, false, null, 31, null);
        locationProviderStatus.setBackgroundModeEnabled(Boolean.valueOf(isLocationEnabled));
        locationProviderStatus.setGpsAvailable(Boolean.valueOf(isProviderEnabled));
        locationProviderStatus.setNetworkAvailable(Boolean.valueOf(isProviderEnabled2));
        locationProviderStatus.setLocationServicesEnabled(isLocationEnabled);
        locationProviderStatus.setPassiveAvailable(Boolean.valueOf(isProviderEnabled3));
        return locationProviderStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r6 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestBackgroundPermissionsAsync(Continuation<? super PermissionRequestResponse> continuation) {
        LocationModule$requestBackgroundPermissionsAsync$1 locationModule$requestBackgroundPermissionsAsync$1;
        int i;
        if (continuation instanceof LocationModule$requestBackgroundPermissionsAsync$1) {
            locationModule$requestBackgroundPermissionsAsync$1 = (LocationModule$requestBackgroundPermissionsAsync$1) continuation;
            if ((locationModule$requestBackgroundPermissionsAsync$1.label & Integer.MIN_VALUE) != 0) {
                locationModule$requestBackgroundPermissionsAsync$1.label -= Integer.MIN_VALUE;
                Object obj = locationModule$requestBackgroundPermissionsAsync$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = locationModule$requestBackgroundPermissionsAsync$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!isBackgroundPermissionInManifest()) {
                        throw new NoPermissionInManifestException("ACCESS_BACKGROUND_LOCATION");
                    }
                    if (!shouldAskBackgroundPermissions()) {
                        locationModule$requestBackgroundPermissionsAsync$1.label = 1;
                        Object foregroundPermissionsAsync = getForegroundPermissionsAsync(locationModule$requestBackgroundPermissionsAsync$1);
                        if (foregroundPermissionsAsync != coroutine_suspended) {
                            return foregroundPermissionsAsync;
                        }
                    } else {
                        Permissions permissions = getAppContext().getPermissions();
                        if (permissions != null) {
                            locationModule$requestBackgroundPermissionsAsync$1.label = 2;
                            obj = LocationHelpers.INSTANCE.askForPermissionsWithPermissionsManager$expo_location_release(permissions, new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, locationModule$requestBackgroundPermissionsAsync$1);
                        } else {
                            throw new NoPermissionsModuleException();
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new PermissionRequestResponse((Bundle) obj);
            }
        }
        locationModule$requestBackgroundPermissionsAsync$1 = new LocationModule$requestBackgroundPermissionsAsync$1(this, continuation);
        Object obj2 = locationModule$requestBackgroundPermissionsAsync$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = locationModule$requestBackgroundPermissionsAsync$1.label;
        if (i != 0) {
        }
        return new PermissionRequestResponse((Bundle) obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getBackgroundPermissionsAsync(Continuation<? super PermissionRequestResponse> continuation) {
        if (!isBackgroundPermissionInManifest()) {
            throw new NoPermissionInManifestException("ACCESS_BACKGROUND_LOCATION");
        }
        if (!shouldAskBackgroundPermissions()) {
            return getForegroundPermissionsAsync(continuation);
        }
        Permissions permissions = getAppContext().getPermissions();
        if (permissions != null) {
            return LocationHelpers.INSTANCE.getPermissionsWithPermissionsManager$expo_location_release(permissions, new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, continuation);
        }
        throw new NoPermissionsModuleException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getLastKnownPositionAsync(LocationLastKnownOptions locationLastKnownOptions, Continuation<? super LocationResponse> continuation) {
        LocationModule$getLastKnownPositionAsync$1 locationModule$getLastKnownPositionAsync$1;
        int i;
        Location location;
        if (continuation instanceof LocationModule$getLastKnownPositionAsync$1) {
            locationModule$getLastKnownPositionAsync$1 = (LocationModule$getLastKnownPositionAsync$1) continuation;
            if ((locationModule$getLastKnownPositionAsync$1.label & Integer.MIN_VALUE) != 0) {
                locationModule$getLastKnownPositionAsync$1.label -= Integer.MIN_VALUE;
                Object obj = locationModule$getLastKnownPositionAsync$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = locationModule$getLastKnownPositionAsync$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (isMissingForegroundPermissions()) {
                        throw new LocationUnauthorizedException();
                    }
                    locationModule$getLastKnownPositionAsync$1.L$0 = locationLastKnownOptions;
                    locationModule$getLastKnownPositionAsync$1.label = 1;
                    obj = getLastKnownLocation(locationModule$getLastKnownPositionAsync$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    locationLastKnownOptions = (LocationLastKnownOptions) locationModule$getLastKnownPositionAsync$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                location = (Location) obj;
                if (location == null && LocationHelpers.INSTANCE.isLocationValid$expo_location_release(location, locationLastKnownOptions)) {
                    return new LocationResponse(location);
                }
                return null;
            }
        }
        locationModule$getLastKnownPositionAsync$1 = new LocationModule$getLastKnownPositionAsync$1(this, continuation);
        Object obj2 = locationModule$getLastKnownPositionAsync$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = locationModule$getLastKnownPositionAsync$1.label;
        if (i != 0) {
        }
        location = (Location) obj2;
        if (location == null) {
            return null;
        }
        return new LocationResponse(location);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getCurrentPositionAsync(LocationOptions options, final Promise promise) {
        LocationRequest prepareLocationRequest$expo_location_release = LocationHelpers.INSTANCE.prepareLocationRequest$expo_location_release(options);
        final CurrentLocationRequest prepareCurrentLocationRequest$expo_location_release = LocationHelpers.INSTANCE.prepareCurrentLocationRequest$expo_location_release(options);
        boolean mayShowUserSettingsDialog = options.getMayShowUserSettingsDialog();
        if (isMissingForegroundPermissions()) {
            promise.reject(new LocationUnauthorizedException());
            return;
        }
        LocationHelpers.Companion companion = LocationHelpers.INSTANCE;
        Context context = this.mContext;
        FusedLocationProviderClient fusedLocationProviderClient = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        if (companion.hasNetworkProviderEnabled(context) || !mayShowUserSettingsDialog) {
            LocationHelpers.Companion companion2 = LocationHelpers.INSTANCE;
            FusedLocationProviderClient fusedLocationProviderClient2 = this.mLocationProvider;
            if (fusedLocationProviderClient2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLocationProvider");
            } else {
                fusedLocationProviderClient = fusedLocationProviderClient2;
            }
            companion2.requestSingleLocation(fusedLocationProviderClient, prepareCurrentLocationRequest$expo_location_release, promise);
            return;
        }
        addPendingLocationRequest(prepareLocationRequest$expo_location_release, new LocationActivityResultListener() { // from class: expo.modules.location.LocationModule$getCurrentPositionAsync$1
            @Override // expo.modules.location.LocationActivityResultListener
            public void onResult(int resultCode) {
                FusedLocationProviderClient fusedLocationProviderClient3;
                if (resultCode == -1) {
                    LocationHelpers.Companion companion3 = LocationHelpers.INSTANCE;
                    fusedLocationProviderClient3 = LocationModule.this.mLocationProvider;
                    if (fusedLocationProviderClient3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mLocationProvider");
                        fusedLocationProviderClient3 = null;
                    }
                    companion3.requestSingleLocation(fusedLocationProviderClient3, prepareCurrentLocationRequest$expo_location_release, promise);
                    return;
                }
                promise.reject(new LocationSettingsUnsatisfiedException());
            }
        });
    }

    public final void requestLocationUpdates(LocationRequest locationRequest, Integer requestId, final LocationRequestCallbacks callbacks) {
        Intrinsics.checkNotNullParameter(locationRequest, "locationRequest");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        FusedLocationProviderClient fusedLocationProviderClient = this.mLocationProvider;
        if (fusedLocationProviderClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLocationProvider");
            fusedLocationProviderClient = null;
        }
        LocationCallback locationCallback = new LocationCallback() { // from class: expo.modules.location.LocationModule$requestLocationUpdates$locationCallback$1
            private boolean isLocationAvailable;

            /* renamed from: isLocationAvailable, reason: from getter */
            public final boolean getIsLocationAvailable() {
                return this.isLocationAvailable;
            }

            public final void setLocationAvailable(boolean z) {
                this.isLocationAvailable = z;
            }

            @Override // com.google.android.gms.location.LocationCallback
            public void onLocationResult(LocationResult locationResult) {
                Intrinsics.checkNotNullParameter(locationResult, "locationResult");
                Location lastLocation = locationResult.getLastLocation();
                if (lastLocation != null) {
                    LocationRequestCallbacks.this.onLocationChanged(lastLocation);
                } else if (!this.isLocationAvailable) {
                    LocationRequestCallbacks.this.onLocationError(new LocationUnavailableException());
                } else {
                    LocationRequestCallbacks.this.onRequestFailed(new LocationUnknownException());
                }
            }

            @Override // com.google.android.gms.location.LocationCallback
            public void onLocationAvailability(LocationAvailability locationAvailability) {
                Intrinsics.checkNotNullParameter(locationAvailability, "locationAvailability");
                this.isLocationAvailable = locationAvailability.isLocationAvailable();
            }
        };
        if (requestId != null) {
            this.mLocationCallbacks.put(requestId, locationCallback);
            this.mLocationRequests.put(requestId, locationRequest);
        }
        try {
            fusedLocationProviderClient.requestLocationUpdates(locationRequest, locationCallback, Looper.getMainLooper());
            callbacks.onRequestSuccess();
        } catch (SecurityException e) {
            callbacks.onRequestFailed(new LocationRequestRejectedException(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addPendingLocationRequest(LocationRequest locationRequest, LocationActivityResultListener listener) {
        this.mPendingLocationRequests.add(listener);
        if (this.mPendingLocationRequests.size() == 1) {
            resolveUserSettingsForRequest(locationRequest);
        }
    }

    private final void resolveUserSettingsForRequest(LocationRequest locationRequest) {
        LocationSettingsRequest.Builder addLocationRequest = new LocationSettingsRequest.Builder().addLocationRequest(locationRequest);
        Intrinsics.checkNotNullExpressionValue(addLocationRequest, "addLocationRequest(...)");
        Context context = this.mContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        SettingsClient settingsClient = LocationServices.getSettingsClient(context);
        Intrinsics.checkNotNullExpressionValue(settingsClient, "getSettingsClient(...)");
        Task<LocationSettingsResponse> checkLocationSettings = settingsClient.checkLocationSettings(addLocationRequest.build());
        Intrinsics.checkNotNullExpressionValue(checkLocationSettings, "checkLocationSettings(...)");
        final Function1 function1 = new Function1() { // from class: expo.modules.location.LocationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit resolveUserSettingsForRequest$lambda$32;
                resolveUserSettingsForRequest$lambda$32 = LocationModule.resolveUserSettingsForRequest$lambda$32(LocationModule.this, (LocationSettingsResponse) obj);
                return resolveUserSettingsForRequest$lambda$32;
            }
        };
        checkLocationSettings.addOnSuccessListener(new OnSuccessListener() { // from class: expo.modules.location.LocationModule$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Function1.this.invoke(obj);
            }
        });
        checkLocationSettings.addOnFailureListener(new OnFailureListener() { // from class: expo.modules.location.LocationModule$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                LocationModule.resolveUserSettingsForRequest$lambda$34(LocationModule.this, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resolveUserSettingsForRequest$lambda$32(LocationModule locationModule, LocationSettingsResponse locationSettingsResponse) {
        locationModule.executePendingRequests(-1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveUserSettingsForRequest$lambda$34(LocationModule locationModule, Exception e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (((ApiException) e).getStatusCode() == 6) {
            try {
                ResolvableApiException resolvableApiException = (ResolvableApiException) e;
                UIManager uIManager = locationModule.mUIManager;
                if (uIManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUIManager");
                    uIManager = null;
                }
                uIManager.registerActivityEventListener(locationModule);
                resolvableApiException.startResolutionForResult(locationModule.getAppContext().getThrowingActivity(), 42);
                return;
            } catch (Throwable unused) {
                locationModule.executePendingRequests(0);
                return;
            }
        }
        locationModule.executePendingRequests(0);
    }

    private final void executePendingRequests(int resultCode) {
        Iterator<LocationActivityResultListener> it = this.mPendingLocationRequests.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            LocationActivityResultListener next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            next.onResult(resultCode);
        }
        this.mPendingLocationRequests.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startHeadingUpdate() {
        Context context = this.mContext;
        SensorManager sensorManager = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        Context context2 = this.mContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context2 = null;
        }
        if (ActivityCompat.checkSelfPermission(context2, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            Context context3 = this.mContext;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context3 = null;
            }
            if (ActivityCompat.checkSelfPermission(context3, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                return;
            }
        }
        Location lastKnownLocation = locationManager.getLastKnownLocation("gps");
        if (lastKnownLocation == null) {
            lastKnownLocation = locationManager.getLastKnownLocation("network");
        }
        if (lastKnownLocation != null) {
            this.mGeofield = new GeomagneticField((float) lastKnownLocation.getLatitude(), (float) lastKnownLocation.getLongitude(), (float) lastKnownLocation.getAltitude(), System.currentTimeMillis());
        } else {
            LocationRequest build = new LocationRequest.Builder(100, 0L).setMaxUpdates(1).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            LocationCallback locationCallback = new LocationCallback() { // from class: expo.modules.location.LocationModule$startHeadingUpdate$locationCallback$1
                @Override // com.google.android.gms.location.LocationCallback
                public void onLocationResult(LocationResult locationResult) {
                    Intrinsics.checkNotNullParameter(locationResult, "locationResult");
                    Location lastLocation = locationResult.getLastLocation();
                    if (lastLocation != null) {
                        LocationModule.this.mGeofield = new GeomagneticField((float) lastLocation.getLatitude(), (float) lastLocation.getLongitude(), (float) lastLocation.getAltitude(), System.currentTimeMillis());
                    }
                }
            };
            FusedLocationProviderClient fusedLocationProviderClient = this.mLocationProvider;
            if (fusedLocationProviderClient == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLocationProvider");
                fusedLocationProviderClient = null;
            }
            Intrinsics.checkNotNull(fusedLocationProviderClient.requestLocationUpdates(build, locationCallback, Looper.getMainLooper()));
        }
        SensorManager sensorManager2 = this.mSensorManager;
        if (sensorManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSensorManager");
            sensorManager2 = null;
        }
        LocationModule locationModule = this;
        SensorManager sensorManager3 = this.mSensorManager;
        if (sensorManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSensorManager");
            sensorManager3 = null;
        }
        sensorManager2.registerListener(locationModule, sensorManager3.getDefaultSensor(2), 3);
        SensorManager sensorManager4 = this.mSensorManager;
        if (sensorManager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSensorManager");
            sensorManager4 = null;
        }
        SensorManager sensorManager5 = this.mSensorManager;
        if (sensorManager5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSensorManager");
        } else {
            sensorManager = sensorManager5;
        }
        sensorManager4.registerListener(locationModule, sensorManager.getDefaultSensor(1), 3);
    }

    private final void sendUpdate() {
        float[] fArr = new float[9];
        if (SensorManager.getRotationMatrix(fArr, new float[9], this.mGravity, this.mGeomagnetic)) {
            float[] fArr2 = new float[3];
            SensorManager.getOrientation(fArr, fArr2);
            if (Math.abs(fArr2[0] - this.mLastAzimuth) <= 0.0355d || System.currentTimeMillis() - this.mLastUpdate <= 50.0f) {
                return;
            }
            this.mLastAzimuth = fArr2[0];
            this.mLastUpdate = System.currentTimeMillis();
            float calcMagNorth = calcMagNorth(fArr2[0]);
            sendEvent(HEADING_EVENT_NAME, new HeadingEventResponse(Integer.valueOf(this.mHeadingId), new Heading(calcTrueNorth(calcMagNorth), calcMagNorth, this.mAccuracy)).toBundle$expo_location_release());
        }
    }

    public final void sendLocationResponse$expo_location_release(int watchId, LocationResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Bundle bundleOf = BundleKt.bundleOf();
        bundleOf.putBundle(FirebaseAnalytics.Param.LOCATION, (Bundle) response.toBundle$expo_location_release(Bundle.class));
        bundleOf.putInt("watchId", watchId);
        sendEvent(LOCATION_EVENT_NAME, bundleOf);
    }

    private final float calcMagNorth(float azimuth) {
        float f = 360;
        return (((float) Math.toDegrees(azimuth)) + f) % f;
    }

    private final float calcTrueNorth(float magNorth) {
        GeomagneticField geomagneticField = this.mGeofield;
        if (isMissingForegroundPermissions()) {
            geomagneticField = null;
        }
        if (geomagneticField == null) {
            return -1.0f;
        }
        return (magNorth + geomagneticField.getDeclination()) % 360;
    }

    private final void stopHeadingWatch() {
        SensorManager sensorManager = this.mSensorManager;
        if (sensorManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSensorManager");
            sensorManager = null;
        }
        sensorManager.unregisterListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void destroyHeadingWatch() {
        stopHeadingWatch();
        this.mGravity = new float[9];
        this.mGeomagnetic = new float[9];
        this.mGeofield = null;
        this.mHeadingId = 0;
        this.mLastAzimuth = 0.0f;
        this.mAccuracy = 0;
    }

    private final void startWatching() {
        if (!isMissingForegroundPermissions()) {
            this.mGeocoderPaused = false;
        }
        resumeLocationUpdates();
    }

    private final void stopWatching() {
        if (Geocoder.isPresent() && !isMissingForegroundPermissions()) {
            this.mGeocoderPaused = true;
        }
        for (Integer num : this.mLocationCallbacks.keySet()) {
            Intrinsics.checkNotNullExpressionValue(num, "next(...)");
            pauseLocationUpdatesForRequest(num.intValue());
        }
    }

    private final void pauseLocationUpdatesForRequest(int requestId) {
        LocationCallback locationCallback = this.mLocationCallbacks.get(Integer.valueOf(requestId));
        if (locationCallback != null) {
            FusedLocationProviderClient fusedLocationProviderClient = this.mLocationProvider;
            if (fusedLocationProviderClient == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLocationProvider");
                fusedLocationProviderClient = null;
            }
            fusedLocationProviderClient.removeLocationUpdates(locationCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeLocationUpdatesForRequest(int requestId) {
        pauseLocationUpdatesForRequest(requestId);
        this.mLocationCallbacks.remove(Integer.valueOf(requestId));
        this.mLocationRequests.remove(Integer.valueOf(requestId));
    }

    private final void resumeLocationUpdates() {
        LocationRequest locationRequest;
        for (Integer num : this.mLocationCallbacks.keySet()) {
            Intrinsics.checkNotNullExpressionValue(num, "next(...)");
            int intValue = num.intValue();
            LocationCallback locationCallback = this.mLocationCallbacks.get(Integer.valueOf(intValue));
            if (locationCallback == null || (locationRequest = this.mLocationRequests.get(Integer.valueOf(intValue))) == null) {
                return;
            }
            try {
                FusedLocationProviderClient fusedLocationProviderClient = this.mLocationProvider;
                if (fusedLocationProviderClient == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLocationProvider");
                    fusedLocationProviderClient = null;
                }
                Intrinsics.checkNotNull(fusedLocationProviderClient.requestLocationUpdates(locationRequest, locationCallback, Looper.myLooper()));
            } catch (SecurityException e) {
                Integer.valueOf(Log.e(TAG, "Error occurred while resuming location updates: " + e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getLastKnownLocation(Continuation<? super Location> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        try {
            FusedLocationProviderClient fusedLocationProviderClient = this.mLocationProvider;
            if (fusedLocationProviderClient == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLocationProvider");
                fusedLocationProviderClient = null;
            }
            Task<Location> lastLocation = fusedLocationProviderClient.getLastLocation();
            final Function1<Location, Unit> function1 = new Function1<Location, Unit>() { // from class: expo.modules.location.LocationModule$getLastKnownLocation$2$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Location location) {
                    invoke2(location);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Location location) {
                    Continuation<Location> continuation2 = safeContinuation2;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m13470constructorimpl(location));
                }
            };
            Intrinsics.checkNotNull(lastLocation.addOnSuccessListener(new OnSuccessListener(function1) { // from class: expo.modules.location.LocationModule$sam$com_google_android_gms_tasks_OnSuccessListener$0
                private final /* synthetic */ Function1 function;

                {
                    Intrinsics.checkNotNullParameter(function1, "function");
                    this.function = function1;
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final /* synthetic */ void onSuccess(Object obj) {
                    this.function.invoke(obj);
                }
            }).addOnCanceledListener(new OnCanceledListener() { // from class: expo.modules.location.LocationModule$getLastKnownLocation$2$2
                @Override // com.google.android.gms.tasks.OnCanceledListener
                public final void onCanceled() {
                    Continuation<Location> continuation2 = safeContinuation2;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m13470constructorimpl(null));
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: expo.modules.location.LocationModule$getLastKnownLocation$2$3
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Continuation<Location> continuation2 = safeContinuation2;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m13470constructorimpl(null));
                }
            }));
        } catch (SecurityException unused) {
            Result.Companion companion = Result.INSTANCE;
            safeContinuation2.resumeWith(Result.m13470constructorimpl(null));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object geocode(String str, Continuation<? super List<GeocodeResponse>> continuation) {
        Context context = null;
        if (this.mGeocoderPaused) {
            throw new GeocodeException("Geocoder is not running", null, 2, null);
        }
        if (isMissingForegroundPermissions()) {
            throw new LocationUnauthorizedException();
        }
        if (!Geocoder.isPresent()) {
            throw new NoGeocodeException();
        }
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        SafeContinuation safeContinuation2 = safeContinuation;
        Context context2 = this.mContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        } else {
            context = context2;
        }
        List<Address> fromLocationName = new Geocoder(context, Locale.getDefault()).getFromLocationName(str, 1);
        if (fromLocationName == null) {
            Result.Companion companion = Result.INSTANCE;
            safeContinuation2.resumeWith(Result.m13470constructorimpl(CollectionsKt.emptyList()));
        } else {
            ArrayList arrayList = new ArrayList();
            for (Address address : fromLocationName) {
                Location location = new Location("gps");
                location.setLatitude(address.getLatitude());
                location.setLongitude(address.getLongitude());
                GeocodeResponse from = GeocodeResponse.INSTANCE.from(location);
                if (from != null) {
                    arrayList.add(from);
                }
            }
            Result.Companion companion2 = Result.INSTANCE;
            safeContinuation2.resumeWith(Result.m13470constructorimpl(arrayList));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object reverseGeocode(ReverseGeocodeLocation reverseGeocodeLocation, Continuation<? super List<ReverseGeocodeResponse>> continuation) {
        if (this.mGeocoderPaused) {
            throw new GeocodeException("Geocoder is not running", null, 2, null);
        }
        if (isMissingForegroundPermissions()) {
            throw new LocationUnauthorizedException();
        }
        if (!Geocoder.isPresent()) {
            throw new NoGeocodeException();
        }
        Location location = new Location("");
        location.setLatitude(reverseGeocodeLocation.getLatitude());
        location.setLongitude(reverseGeocodeLocation.getLongitude());
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        SafeContinuation safeContinuation2 = safeContinuation;
        Context context = this.mContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        List<Address> fromLocation = new Geocoder(context, Locale.getDefault()).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
        if (fromLocation == null) {
            Result.Companion companion = Result.INSTANCE;
            safeContinuation2.resumeWith(Result.m13470constructorimpl(CollectionsKt.emptyList()));
        } else {
            ArrayList arrayList = new ArrayList();
            for (Address address : fromLocation) {
                ReverseGeocodeResponse reverseGeocodeResponse = address != null ? new ReverseGeocodeResponse(address) : null;
                if (reverseGeocodeResponse != null) {
                    arrayList.add(reverseGeocodeResponse);
                }
            }
            Result.Companion companion2 = Result.INSTANCE;
            safeContinuation2.resumeWith(Result.m13470constructorimpl(arrayList));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMissingForegroundPermissions() {
        Permissions permissions = getAppContext().getPermissions();
        if (permissions != null) {
            return (permissions.hasGrantedPermissions("android.permission.ACCESS_FINE_LOCATION") || permissions.hasGrantedPermissions("android.permission.ACCESS_COARSE_LOCATION")) ? false : true;
        }
        throw new Exceptions.AppContextLost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasForegroundServicePermissions() {
        Permissions permissions = getAppContext().getPermissions();
        if (permissions != null) {
            if (Build.VERSION.SDK_INT >= 34) {
                return permissions.hasGrantedPermissions("android.permission.FOREGROUND_SERVICE") && permissions.hasGrantedPermissions("android.permission.FOREGROUND_SERVICE_LOCATION");
            }
            if (Build.VERSION.SDK_INT >= 28) {
                return permissions.hasGrantedPermissions("android.permission.FOREGROUND_SERVICE");
            }
            return true;
        }
        throw new Exceptions.AppContextLost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMissingBackgroundPermissions() {
        Permissions permissions = getAppContext().getPermissions();
        if (permissions != null) {
            return Build.VERSION.SDK_INT >= 29 && !permissions.hasGrantedPermissions("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        return true;
    }

    private final boolean shouldAskBackgroundPermissions() {
        return Build.VERSION.SDK_INT >= 29;
    }

    private final boolean isBackgroundPermissionInManifest() {
        if (Build.VERSION.SDK_INT < 29) {
            return true;
        }
        Permissions permissions = getAppContext().getPermissions();
        if (permissions != null) {
            return permissions.isPermissionPresentInManifest("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        throw new NoPermissionsModuleException();
    }

    /* compiled from: LocationModule.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lexpo/modules/location/LocationModule$Companion;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG$expo_location_release", "()Ljava/lang/String;", "LOCATION_EVENT_NAME", "HEADING_EVENT_NAME", "CHECK_SETTINGS_REQUEST_CODE", "", "ACCURACY_LOWEST", "ACCURACY_LOW", "ACCURACY_BALANCED", "ACCURACY_HIGH", "ACCURACY_HIGHEST", "ACCURACY_BEST_FOR_NAVIGATION", "GEOFENCING_EVENT_ENTER", "GEOFENCING_EVENT_EXIT", "DEGREE_DELTA", "", "TIME_DELTA", "", "expo-location_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getTAG$expo_location_release() {
            return LocationModule.TAG;
        }
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostResume() {
        startWatching();
        startHeadingUpdate();
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostPause() {
        stopWatching();
        stopHeadingWatch();
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostDestroy() {
        stopWatching();
        stopHeadingWatch();
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        if (event == null) {
            return;
        }
        if (event.sensor.getType() == 1) {
            float[] values = event.values;
            Intrinsics.checkNotNullExpressionValue(values, "values");
            this.mGravity = values;
        } else if (event.sensor.getType() == 2) {
            float[] values2 = event.values;
            Intrinsics.checkNotNullExpressionValue(values2, "values");
            this.mGeomagnetic = values2;
        }
        sendUpdate();
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        this.mAccuracy = accuracy;
    }

    @Override // expo.modules.core.interfaces.ActivityEventListener
    public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
        if (requestCode != 42) {
            return;
        }
        executePendingRequests(resultCode);
        UIManager uIManager = this.mUIManager;
        if (uIManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUIManager");
            uIManager = null;
        }
        uIManager.unregisterActivityEventListener(this);
    }
}
