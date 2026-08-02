package com.agontuk.RNFusedLocation;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.GoogleApiAvailability;
import com.twilio.voice.EventKeys;
import l0.AbstractC5338c;

/* loaded from: classes.dex */
public abstract class i {

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$agontuk$RNFusedLocation$LocationError;

        static {
            int[] iArr = new int[d.values().length];
            $SwitchMap$com$agontuk$RNFusedLocation$LocationError = iArr;
            try {
                iArr[d.PERMISSION_DENIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$agontuk$RNFusedLocation$LocationError[d.POSITION_UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$agontuk$RNFusedLocation$LocationError[d.TIMEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$agontuk$RNFusedLocation$LocationError[d.PLAY_SERVICE_NOT_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$agontuk$RNFusedLocation$LocationError[d.SETTINGS_NOT_SATISFIED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$agontuk$RNFusedLocation$LocationError[d.INTERNAL_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static WritableMap a(d dVar, String str) {
        if (str == null) {
            str = b(dVar);
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(EventKeys.ERROR_CODE, dVar.b());
        createMap.putString("message", str);
        return createMap;
    }

    public static String b(d dVar) {
        int i10 = a.$SwitchMap$com$agontuk$RNFusedLocation$LocationError[dVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "Internal error occurred" : "Location settings are not satisfied." : "Google play service is not available." : "Location request timed out." : "No location provider available." : "Location permission not granted.";
    }

    public static long c(Location location) {
        return (SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000;
    }

    public static boolean d(Context context) {
        return AbstractC5338c.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || AbstractC5338c.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    public static boolean e(Context context) {
        int i10 = GoogleApiAvailability.r().i(context);
        return i10 == 0 || i10 == 18;
    }

    public static boolean f(Context context) {
        boolean isLocationEnabled;
        int i10 = Build.VERSION.SDK_INT;
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            if (i10 < 28) {
                return locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
            }
            isLocationEnabled = locationManager.isLocationEnabled();
            return isLocationEnabled;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean g(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    public static boolean h(Context context, String str) {
        try {
            return ((LocationManager) context.getSystemService("location")).isProviderEnabled(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public static WritableMap i(Location location) {
        float verticalAccuracyMeters;
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("latitude", location.getLatitude());
        createMap2.putDouble("longitude", location.getLongitude());
        createMap2.putDouble("altitude", location.getAltitude());
        createMap2.putDouble("accuracy", location.getAccuracy());
        createMap2.putDouble("heading", location.getBearing());
        createMap2.putDouble("speed", location.getSpeed());
        if (Build.VERSION.SDK_INT >= 26) {
            verticalAccuracyMeters = location.getVerticalAccuracyMeters();
            createMap2.putDouble("altitudeAccuracy", verticalAccuracyMeters);
        }
        createMap.putMap("coords", createMap2);
        createMap.putString("provider", location.getProvider());
        createMap.putDouble(EventKeys.TIMESTAMP, location.getTime());
        createMap.putBoolean("mocked", location.isFromMockProvider());
        return createMap;
    }
}
