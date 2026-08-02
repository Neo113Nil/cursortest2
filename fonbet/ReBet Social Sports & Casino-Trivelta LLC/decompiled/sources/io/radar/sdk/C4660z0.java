package io.radar.sdk;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Looper;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.Geofence;
import com.huawei.hms.location.GeofenceData;
import com.huawei.hms.location.GeofenceRequest;
import com.huawei.hms.location.GeofenceService;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationResult;
import io.radar.sdk.C4589c;
import io.radar.sdk.L;
import io.radar.sdk.N0;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.radar.sdk.z0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4660z0 extends L {

    /* renamed from: a, reason: collision with root package name */
    public final G0 f50181a;

    /* renamed from: b, reason: collision with root package name */
    public final FusedLocationProviderClient f50182b;

    /* renamed from: c, reason: collision with root package name */
    public final GeofenceService f50183c;

    /* renamed from: io.radar.sdk.z0$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[N0.b.values().length];
            iArr[N0.b.HIGH.ordinal()] = 1;
            iArr[N0.b.MEDIUM.ordinal()] = 2;
            iArr[N0.b.LOW.ordinal()] = 3;
            iArr[N0.b.NONE.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: io.radar.sdk.z0$b */
    public static final class b extends LocationCallback {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function1 f50185b;

        public b(Function1 function1) {
            this.f50185b = function1;
        }
    }

    public C4660z0(Context context, G0 logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f50181a = logger;
        this.f50182b = new FusedLocationProviderClient(context);
        this.f50183c = new GeofenceService(context);
    }

    private final int j(N0.b bVar) {
        int i10 = a.$EnumSwitchMapping$0[bVar.ordinal()];
        if (i10 == 1) {
            return 100;
        }
        if (i10 == 2) {
            return 102;
        }
        if (i10 == 3) {
            return 104;
        }
        if (i10 == 4) {
            return 105;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.radar.sdk.L
    public void a(L.a[] abstractGeofences, L.b abstractGeofenceRequest, PendingIntent pendingIntent, Function1 block) {
        Intrinsics.checkNotNullParameter(abstractGeofences, "abstractGeofences");
        Intrinsics.checkNotNullParameter(abstractGeofenceRequest, "abstractGeofenceRequest");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Intrinsics.checkNotNullParameter(block, "block");
        ArrayList arrayList = new ArrayList();
        for (L.a aVar : abstractGeofences) {
            boolean g10 = aVar.g();
            int i10 = g10;
            if (aVar.h()) {
                i10 = (g10 ? 1 : 0) | 2;
            }
            if (aVar.f()) {
                i10 = (i10 == true ? 1 : 0) | 4;
            }
            Geofence geofence = new Geofence.Builder().setUniqueId(aVar.e()).setRoundArea(aVar.b(), aVar.c(), aVar.d()).setConversions(i10).setDwellDelayTime(aVar.a()).setValidContinueTime(-1L).build();
            Intrinsics.checkNotNullExpressionValue(geofence, "geofence");
            arrayList.add(geofence);
        }
        boolean b10 = abstractGeofenceRequest.b();
        boolean z10 = b10;
        if (abstractGeofenceRequest.c()) {
            z10 = (b10 ? 1 : 0) | 2;
        }
        int i11 = z10;
        if (abstractGeofenceRequest.a()) {
            i11 = (z10 ? 1 : 0) | 4;
        }
        Task createGeofenceList = this.f50183c.createGeofenceList(new GeofenceRequest.Builder().createGeofenceList(arrayList).setInitConversions(i11).build(), pendingIntent);
        createGeofenceList.addOnSuccessListener(new C4658y0(block));
        createGeofenceList.addOnFailureListener(new C4656x0(block));
    }

    @Override // io.radar.sdk.L
    public void b(N0.b desiredAccuracy, Function1 block) {
        Intrinsics.checkNotNullParameter(desiredAccuracy, "desiredAccuracy");
        Intrinsics.checkNotNullParameter(block, "block");
        int j10 = j(desiredAccuracy);
        G0.b(this.f50181a, "Requesting location", null, null, 6, null);
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.setPriority(j10);
        locationRequest.setInterval(0L);
        locationRequest.setFastestInterval(0L);
        locationRequest.setNumUpdates(1);
        this.f50182b.requestLocationUpdates(locationRequest, new b(block), Looper.getMainLooper()).addOnFailureListener(new C4656x0(block));
    }

    @Override // io.radar.sdk.L
    public void c(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f50182b.getLastLocation().addOnSuccessListener(new C4658y0(block)).addOnFailureListener(new C4656x0(block));
    }

    @Override // io.radar.sdk.L
    public Location d(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        GeofenceData dataFromIntent = GeofenceData.getDataFromIntent(intent);
        if (dataFromIntent == null) {
            return null;
        }
        return dataFromIntent.getConvertingLocation();
    }

    @Override // io.radar.sdk.L
    public Location e(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        LocationResult extractResult = LocationResult.extractResult(intent);
        if (extractResult == null) {
            return null;
        }
        return extractResult.getLastLocation();
    }

    @Override // io.radar.sdk.L
    public C4589c.EnumC4597i f(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        GeofenceData dataFromIntent = GeofenceData.getDataFromIntent(intent);
        if (dataFromIntent == null) {
            return null;
        }
        int conversion = dataFromIntent.getConversion();
        return conversion != 1 ? conversion != 4 ? C4589c.EnumC4597i.GEOFENCE_EXIT : C4589c.EnumC4597i.GEOFENCE_DWELL : C4589c.EnumC4597i.GEOFENCE_ENTER;
    }

    @Override // io.radar.sdk.L
    public void g(PendingIntent pendingIntent, Function1 function1) {
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Task deleteGeofenceList = this.f50183c.deleteGeofenceList(pendingIntent);
        deleteGeofenceList.addOnSuccessListener(new C4658y0(function1));
        deleteGeofenceList.addOnFailureListener(new C4656x0(function1));
    }

    @Override // io.radar.sdk.L
    public void h(PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        this.f50182b.removeLocationUpdates(pendingIntent);
    }

    @Override // io.radar.sdk.L
    public void i(N0.b desiredAccuracy, int i10, int i11, PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(desiredAccuracy, "desiredAccuracy");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        int j10 = j(desiredAccuracy);
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.setPriority(j10);
        locationRequest.setInterval(i10 * 1000);
        locationRequest.setFastestInterval(i11 * 1000);
        this.f50182b.requestLocationUpdates(locationRequest, pendingIntent);
    }
}
