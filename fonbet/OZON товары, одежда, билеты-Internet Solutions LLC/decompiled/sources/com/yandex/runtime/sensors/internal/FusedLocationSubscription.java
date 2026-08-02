package com.yandex.runtime.sensors.internal;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.core.content.a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.Runtime;

/* loaded from: classes9.dex */
public class FusedLocationSubscription extends LocationCallback implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    private static final String LOG_TAG = "com.yandex.runtime.sensors.internal.FusedLocationSubscription";
    private FusedLocationProviderClient fusedLocationProviderClient = null;
    private GoogleApiClient googleApiClient = new GoogleApiClient.Builder(Runtime.getApplicationContext()).addApi(LocationServices.API).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
    private LocationRequest locationRequest;
    NativeLocationSubscriptionWrapper nativeSubscription;

    public FusedLocationSubscription(float f7, int i11, NativeObject nativeObject) {
        this.nativeSubscription = new NativeLocationSubscriptionWrapper(nativeObject);
        this.locationRequest = LocationRequest.create().setSmallestDisplacement(f7).setInterval(i11).setPriority(100);
        this.googleApiClient.connect();
    }

    public static final boolean fusedLocationProviderAvailable() {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(Runtime.getApplicationContext()) == 0 && getPlayServicesVersion() >= 11600000;
    }

    private static long getPlayServicesVersion() {
        try {
            return Runtime.getApplicationContext().getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException e11) {
            Log.w(LOG_TAG, "Google Play Services Package not found!", e11);
            return 0L;
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public void onConnected(Bundle bundle) {
        if (a.checkSelfPermission(Runtime.getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") != 0) {
            Log.e(LOG_TAG, "No ACCESS_FINE_LOCATION permission, can't start FusedProvider");
            return;
        }
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(Runtime.getApplicationContext());
        this.fusedLocationProviderClient = fusedLocationProviderClient;
        fusedLocationProviderClient.requestLocationUpdates(this.locationRequest, this, Looper.getMainLooper());
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public void onConnectionFailed(ConnectionResult connectionResult) {
        Log.w(LOG_TAG, "Connection Failed!");
        this.nativeSubscription.onStatusReceived(false);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public void onConnectionSuspended(int i11) {
        Log.w(LOG_TAG, "Connection suspended!");
        this.nativeSubscription.onStatusReceived(false);
    }

    @Override // com.google.android.gms.location.LocationCallback
    public void onLocationResult(LocationResult locationResult) {
        this.nativeSubscription.onLocationReceived(locationResult.getLastLocation());
    }

    public void stop() {
        this.nativeSubscription.onStatusReceived(false);
        FusedLocationProviderClient fusedLocationProviderClient = this.fusedLocationProviderClient;
        if (fusedLocationProviderClient != null) {
            fusedLocationProviderClient.removeLocationUpdates(this);
        }
        this.googleApiClient.disconnect();
    }
}
