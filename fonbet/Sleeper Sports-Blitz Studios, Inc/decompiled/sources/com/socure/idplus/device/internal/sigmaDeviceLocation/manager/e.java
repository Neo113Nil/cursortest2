package com.socure.idplus.device.internal.sigmaDeviceLocation.manager;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.socure.idplus.device.internal.behavior.model.LocationEvent;
import com.socure.idplus.device.internal.input.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.socure.idplus.device.internal.thread.b f879a;
    public final com.socure.idplus.device.internal.sigmaDeviceLocation.monitor.a b;
    public final g c;

    public e(com.socure.idplus.device.internal.thread.c socureThread) {
        Intrinsics.checkNotNullParameter(socureThread, "socureThread");
        this.f879a = socureThread;
        this.b = new com.socure.idplus.device.internal.sigmaDeviceLocation.monitor.a();
        g gVar = new g(socureThread);
        gVar.a();
        this.c = gVar;
    }

    public final void a(final Context context) {
        Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        boolean isProviderEnabled = ((LocationManager) systemService).isProviderEnabled("gps");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (isProviderEnabled) {
            Intrinsics.checkNotNullParameter(context, "context");
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
            Intrinsics.checkNotNullExpressionValue(googleApiAvailability, "getInstance(...)");
            if (googleApiAvailability.isGooglePlayServicesAvailable(context) == 0) {
                a aVar = new a(booleanRef, this);
                FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
                Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
                com.socure.idplus.device.internal.viewModel.location.c.a(context, fusedLocationProviderClient, aVar);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.socure.idplus.device.internal.sigmaDeviceLocation.manager.e$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.a(Ref.BooleanRef.this, this, context);
                    }
                }, 5000L);
            }
        }
        booleanRef.element = true;
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService2 = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.location.LocationManager");
        a(((LocationManager) systemService2).getLastKnownLocation("gps"));
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.socure.idplus.device.internal.sigmaDeviceLocation.manager.e$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                e.a(Ref.BooleanRef.this, this, context);
            }
        }, 5000L);
    }

    public static final void a(Ref.BooleanRef isInitialized, e this$0, Context context) {
        Intrinsics.checkNotNullParameter(isInitialized, "$isInitialized");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        if (isInitialized.element) {
            return;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        this$0.a(((LocationManager) systemService).getLastKnownLocation("gps"));
    }

    public final void a(Location locationData) {
        if (locationData == null) {
            Intrinsics.checkNotNullParameter("LocationManager", "tag");
            Intrinsics.checkNotNullParameter("Location data is null", "msg");
            com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.f870a;
        } else {
            g gVar = this.c;
            Intrinsics.checkNotNullParameter(locationData, "locationData");
            gVar.a(new LocationEvent(SystemClock.uptimeMillis(), locationData.getLatitude(), locationData.getLongitude(), locationData.getAccuracy(), locationData.getAltitude(), com.socure.idplus.device.internal.viewModel.location.c.a(locationData, com.socure.idplus.device.internal.viewModel.location.a.f901a), locationData.getBearing(), com.socure.idplus.device.internal.viewModel.location.c.a(locationData, com.socure.idplus.device.internal.viewModel.location.a.b), locationData.getSpeed(), com.socure.idplus.device.internal.viewModel.location.c.a(locationData, com.socure.idplus.device.internal.viewModel.location.a.c)));
        }
    }
}
