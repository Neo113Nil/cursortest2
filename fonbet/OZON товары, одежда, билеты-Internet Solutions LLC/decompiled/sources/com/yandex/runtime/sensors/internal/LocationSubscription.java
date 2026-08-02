package com.yandex.runtime.sensors.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.Runtime;

/* loaded from: classes9.dex */
public class LocationSubscription implements LocationListener {
    private static final String LOG_TAG = "com.yandex.runtime.sensors.internal.LocationSubscription";
    private final BroadcastReceiver gpsStateReceiver;
    private final LocationManager manager;
    private final float movementThreshold;
    private final NativeLocationSubscriptionWrapper nativeSubscription;
    private final Provider provider;
    private final long reportInterval;

    public enum Provider {
        GPS("gps"),
        NETWORK("network"),
        PASSIVE("passive");

        private String value;

        Provider(String str) {
            this.value = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    public LocationSubscription(Provider provider, long j11, float f7, NativeObject nativeObject) {
        this.provider = provider;
        this.reportInterval = j11;
        this.movementThreshold = f7;
        this.nativeSubscription = new NativeLocationSubscriptionWrapper(nativeObject);
        if (isLocationListenerStatusChangedSupported()) {
            this.gpsStateReceiver = null;
        } else {
            this.gpsStateReceiver = getGpsStateReceiver();
        }
        LocationManager locationManager = (LocationManager) Runtime.getApplicationContext().getSystemService("location");
        this.manager = locationManager;
        if (locationManager == null) {
            throw new RuntimeException("Can't get LocationManager. Missed permission?");
        }
        start();
    }

    private BroadcastReceiver getGpsStateReceiver() {
        return new BroadcastReceiver() { // from class: com.yandex.runtime.sensors.internal.LocationSubscription.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (LocationSubscription.this.manager == null) {
                    return;
                }
                LocationSubscription.this.nativeSubscription.onStatusReceived(LocationSubscription.this.manager.isProviderEnabled("gps"));
            }
        };
    }

    public static boolean isLocationListenerStatusChangedSupported() {
        return Build.VERSION.SDK_INT < 29;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startImpl() {
        LocationSubscription locationSubscription;
        try {
            locationSubscription = this;
            try {
                this.manager.requestLocationUpdates(this.provider.toString(), this.reportInterval, this.movementThreshold, locationSubscription);
            } catch (IllegalArgumentException e11) {
                e = e11;
                Log.e(LOG_TAG, "IllegalArgumentException of calling startProvider", e);
                locationSubscription.nativeSubscription.onStatusReceived(false);
            } catch (SecurityException e12) {
                e = e12;
                Log.e(LOG_TAG, "SecurityException of calling startProvider", e);
                locationSubscription.nativeSubscription.onStatusReceived(false);
            } catch (RuntimeException e13) {
                e = e13;
                Log.e(LOG_TAG, "RuntimeException of calling startProvider", e);
                locationSubscription.nativeSubscription.onStatusReceived(false);
            }
        } catch (IllegalArgumentException e14) {
            e = e14;
            locationSubscription = this;
        } catch (SecurityException e15) {
            e = e15;
            locationSubscription = this;
        } catch (RuntimeException e16) {
            e = e16;
            locationSubscription = this;
        }
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        this.nativeSubscription.onLocationReceived(location);
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
        this.nativeSubscription.onStatusReceived(false);
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i11, Bundle bundle) {
        this.nativeSubscription.onStatusReceived(i11 == 2);
    }

    public void start() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.yandex.runtime.sensors.internal.LocationSubscription.2
            @Override // java.lang.Runnable
            public void run() {
                if (!LocationSubscription.isLocationListenerStatusChangedSupported()) {
                    Runtime.getApplicationContext().registerReceiver(LocationSubscription.this.gpsStateReceiver, new IntentFilter("android.location.PROVIDERS_CHANGED"));
                }
                LocationSubscription.this.startImpl();
            }
        });
    }

    public void stop() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.yandex.runtime.sensors.internal.LocationSubscription.3
            @Override // java.lang.Runnable
            public void run() {
                if (!LocationSubscription.isLocationListenerStatusChangedSupported()) {
                    Runtime.getApplicationContext().unregisterReceiver(LocationSubscription.this.gpsStateReceiver);
                }
                LocationSubscription.this.manager.removeUpdates(LocationSubscription.this);
            }
        });
    }
}
