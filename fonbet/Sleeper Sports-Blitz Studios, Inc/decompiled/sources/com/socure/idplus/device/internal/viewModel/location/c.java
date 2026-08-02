package com.socure.idplus.device.internal.viewModel.location;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class c {
    public static float a(Location locationData, a metrics) {
        float verticalAccuracyMeters;
        float bearingAccuracyDegrees;
        float speedAccuracyMetersPerSecond;
        Intrinsics.checkNotNullParameter(locationData, "locationData");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        if (Build.VERSION.SDK_INT < 26) {
            return 0.0f;
        }
        int ordinal = metrics.ordinal();
        if (ordinal == 0) {
            verticalAccuracyMeters = locationData.getVerticalAccuracyMeters();
            return verticalAccuracyMeters;
        }
        if (ordinal == 1) {
            bearingAccuracyDegrees = locationData.getBearingAccuracyDegrees();
            return bearingAccuracyDegrees;
        }
        if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        speedAccuracyMetersPerSecond = locationData.getSpeedAccuracyMetersPerSecond();
        return speedAccuracyMetersPerSecond;
    }

    public static void a(final Context context, FusedLocationProviderClient mFusedLocationClient, final Function1 response) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mFusedLocationClient, "mFusedLocationClient");
        Intrinsics.checkNotNullParameter(response, "response");
        if (!com.socure.idplus.device.internal.permission.a.a(com.socure.idplus.device.internal.permission.b.f873a, context)) {
            response.invoke(null);
            return;
        }
        Task<Location> lastLocation = mFusedLocationClient.getLastLocation();
        final b bVar = new b(response);
        lastLocation.addOnSuccessListener(new OnSuccessListener() { // from class: com.socure.idplus.device.internal.viewModel.location.c$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                c.a(Function1.this, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.socure.idplus.device.internal.viewModel.location.c$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                c.a(Function1.this, context, exc);
            }
        });
    }

    public static final void a(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void a(Function1 response, Context context, Exception it) {
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        response.invoke(((LocationManager) systemService).getLastKnownLocation("gps"));
    }
}
