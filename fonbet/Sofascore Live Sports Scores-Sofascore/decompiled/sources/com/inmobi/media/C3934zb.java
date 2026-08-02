package com.inmobi.media;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.provider.Settings;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.zaaz;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.identity.zzbi;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.c3n;
import defpackage.duf;
import defpackage.fuf;
import defpackage.h2d;
import defpackage.j2d;
import defpackage.joa;
import defpackage.lu3;
import defpackage.me4;
import defpackage.sq3;
import defpackage.wje;
import defpackage.y6a;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.zb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3934zb implements LocationListener {
    public static final C3934zb a = new C3934zb();
    public static final LocationManager b;
    public static final HandlerThread c;
    public static GoogleApiClient d;
    public static final String e;
    public static boolean f;
    public static final h2d g;

    static {
        HandlerThread handlerThread = new HandlerThread("LThread");
        c = handlerThread;
        e = "zb";
        g = new j2d();
        P6.a(handlerThread, "LThread");
        Context context = AbstractC3424fj.a;
        if (context != null) {
            Object systemService = context.getSystemService("location");
            b = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        }
    }

    public static Location a(Location location, Location location2) {
        if (location == null) {
            e.getClass();
            if (location2 != null) {
                location2.getTime();
            }
            Objects.toString(location2);
            return location2;
        }
        if (location2 == null) {
            e.getClass();
            location.getTime();
            location.toString();
            return location;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        boolean z2 = time < -120000;
        boolean z3 = time > 0;
        if (z) {
            e.getClass();
            location.getTime();
            location.toString();
            return location;
        }
        if (z2) {
            e.getClass();
            location2.getTime();
            location2.toString();
            return location2;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z4 = accuracy > 0;
        boolean z5 = accuracy < 0;
        boolean z6 = accuracy > 200;
        if (z5 || (z3 && !(z4 && z6))) {
            e.getClass();
            location.getTime();
            location.toString();
            return location;
        }
        e.getClass();
        location2.getTime();
        location2.toString();
        return location2;
    }

    public static Location c() {
        try {
            Context context = AbstractC3424fj.a;
            context.getClass();
            Api api = LocationServices.a;
            zzbi zzbiVar = new zzbi(context, zzbi.l, Api.ApiOptions.E7, GoogleApi.Settings.c);
            TaskApiCall.Builder a2 = TaskApiCall.a();
            a2.a = wje.c;
            a2.d = 2414;
            Task h = zzbiVar.h(0, a2.a());
            h.getClass();
            return (Location) h.getResult();
        } catch (Exception unused) {
            return null;
        } catch (IncompatibleClassChangeError e2) {
            e.getClass();
            e2.toString();
            return null;
        }
    }

    public static boolean d() {
        try {
            if (AbstractC3292ag.a(AbstractC3424fj.a, "android.permission.ACCESS_FINE_LOCATION")) {
                return true;
            }
            return AbstractC3292ag.a(AbstractC3424fj.a, "android.permission.ACCESS_COARSE_LOCATION");
        } catch (Exception unused) {
            e.getClass();
            return false;
        }
    }

    public static boolean e() {
        int i;
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            LocationManager locationManager = b;
            return locationManager != null && locationManager.isLocationEnabled();
        }
        try {
            i = Settings.Secure.getInt(context.getContentResolver(), "location_mode");
        } catch (Settings.SettingNotFoundException unused) {
            i = 0;
        }
        return i != 0;
    }

    public static boolean f() {
        try {
            fuf fufVar = duf.a;
            fufVar.getOrCreateKotlinClass(GoogleApiClient.class).getSimpleName();
            fufVar.getOrCreateKotlinClass(FusedLocationProviderClient.class).getSimpleName();
            fufVar.getOrCreateKotlinClass(LocationServices.class).getSimpleName();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    public final void b() {
        LocationManager locationManager = b;
        if (locationManager != null) {
            Criteria criteria = new Criteria();
            criteria.setBearingAccuracy(2);
            criteria.setPowerRequirement(2);
            criteria.setCostAllowed(false);
            String bestProvider = locationManager.getBestProvider(criteria, true);
            if (bestProvider != null) {
                e.getClass();
                locationManager.requestSingleUpdate(bestProvider, this, c.getLooper());
            } else {
                String str = e;
                str.getClass();
                str.getClass();
            }
        }
        Unit unit = Unit.a;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        LocationManager locationManager;
        location.getClass();
        try {
            e.getClass();
            location.getTime();
            location.getLatitude();
            location.getLongitude();
            location.getAccuracy();
            if (!d() || (locationManager = b) == null) {
                return;
            }
            locationManager.removeUpdates(this);
        } catch (Exception e2) {
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e2);
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        str.getClass();
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        str.getClass();
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public static void a(Context context) {
        try {
            GoogleApiClient googleApiClient = d;
            if (googleApiClient == null) {
                e.getClass();
                context.getClass();
                GoogleApiClient.Builder builder = new GoogleApiClient.Builder(context);
                builder.k.add(new C3882xb());
                builder.l.add(new c3n());
                Api api = LocationServices.a;
                Preconditions.j(api, "Api must not be null");
                builder.g.put(api, null);
                List a2 = api.a.a();
                builder.b.addAll(a2);
                builder.a.addAll(a2);
                zaaz a3 = builder.a();
                d = a3;
                a3.a();
                return;
            }
            googleApiClient.a();
        } catch (Exception e2) {
            e.getClass();
            e2.getMessage();
        }
    }

    public static final void a(ConnectionResult connectionResult) {
        connectionResult.getClass();
        f = false;
    }

    public static Location a() {
        Location location;
        Location location2;
        Location location3;
        try {
        } catch (Exception e2) {
            e = e2;
            location = null;
        }
        if (e() && d()) {
            location2 = f ? c() : null;
            try {
                if (b != null && AbstractC3292ag.a(AbstractC3424fj.a, "android.permission.ACCESS_COARSE_LOCATION")) {
                    location3 = a(2, 2);
                }
            } catch (Exception e3) {
                location = location2;
                e = e3;
                e.getClass();
                e.getMessage();
                location2 = location;
                location3 = null;
                if (location2 != null) {
                }
                return a(location2, location3);
            }
            location3 = null;
        } else {
            location2 = null;
            location3 = null;
        }
        if (location2 != null && location3 == null) {
            e.getClass();
            return null;
        }
        return a(location2, location3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(9:5|6|(1:(1:9)(2:29|30))(2:31|(1:33)(1:34))|10|11|(2:15|(1:17))|19|20|21))|10|11|(3:13|15|(0))|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        com.inmobi.media.C3934zb.e.getClass();
        r4.getMessage();
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[Catch: all -> 0x005e, Exception -> 0x0060, TRY_LEAVE, TryCatch #0 {Exception -> 0x0060, blocks: (B:11:0x0041, B:13:0x0049, B:15:0x004f, B:17:0x0058), top: B:10:0x0041, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        C3908yb c3908yb;
        int i;
        h2d h2dVar;
        C3934zb c3934zb;
        try {
            if (sq3Var instanceof C3908yb) {
                c3908yb = (C3908yb) sq3Var;
                int i2 = c3908yb.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3908yb.d = i2 - Integer.MIN_VALUE;
                    Object obj = c3908yb.b;
                    lu3 lu3Var = lu3.a;
                    i = c3908yb.d;
                    if (i != 0) {
                        y6a.M(obj);
                        h2d h2dVar2 = g;
                        c3908yb.a = h2dVar2;
                        c3908yb.d = 1;
                        if (h2dVar2.e(c3908yb) == lu3Var) {
                            return lu3Var;
                        }
                        h2dVar = h2dVar2;
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        h2dVar = c3908yb.a;
                        y6a.M(obj);
                    }
                    c3934zb = a;
                    if (d() && e()) {
                        c3934zb.b();
                        if (!f()) {
                            a(AbstractC3424fj.a);
                        }
                    }
                    return Unit.a;
                }
            }
            c3934zb = a;
            if (d()) {
                c3934zb.b();
                if (!f()) {
                }
            }
            return Unit.a;
        } finally {
            h2dVar.f(null);
        }
        c3908yb = new C3908yb(this, sq3Var);
        Object obj2 = c3908yb.b;
        lu3 lu3Var2 = lu3.a;
        i = c3908yb.d;
        if (i != 0) {
        }
    }

    public static Location a(int i, int i2) {
        String bestProvider;
        Location location;
        Criteria criteria = new Criteria();
        criteria.setAccuracy(i);
        criteria.setPowerRequirement(i2);
        criteria.setCostAllowed(false);
        LocationManager locationManager = b;
        Location location2 = null;
        if (locationManager != null && (bestProvider = locationManager.getBestProvider(criteria, true)) != null) {
            try {
                location = locationManager.getLastKnownLocation(bestProvider);
            } catch (Exception unused) {
                location = null;
            }
            if (location != null || i == 1) {
                location2 = location;
            } else {
                LocationManager locationManager2 = b;
                if (locationManager2 != null) {
                    List<String> providers = locationManager2.getProviders(true);
                    providers.getClass();
                    int size = providers.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i3 = size - 1;
                            String str = providers.get(size);
                            try {
                                LocationManager locationManager3 = b;
                                if (locationManager3 != null && locationManager3.isProviderEnabled(str)) {
                                    try {
                                        location2 = locationManager3.getLastKnownLocation(str);
                                    } catch (SecurityException unused2) {
                                    }
                                    if (location2 != null) {
                                        break;
                                    }
                                }
                            } catch (Exception unused3) {
                            }
                            if (i3 < 0) {
                                break;
                            }
                            size = i3;
                        }
                    }
                }
            }
        }
        e.getClass();
        return location2;
    }

    public static HashMap a(Location location, boolean z, Location location2) {
        HashMap hashMap = new HashMap();
        Context context = AbstractC3424fj.a;
        if (context != null) {
            if (location != null) {
                if (location.getTime() > 0) {
                    hashMap.put("u-ll-ts", Long.valueOf(location.getTime()));
                }
                hashMap.put("u-latlong-accu", a(location));
                hashMap.put("sdk-collected", Integer.valueOf(z ? 1 : 0));
            }
            Hh hh = AbstractC3890xj.a;
            if (AbstractC3424fj.b() == null || AbstractC3890xj.a().getLocationEnabled()) {
                hashMap.put("loc-allowed", Integer.valueOf(e() ? 1 : 0));
            }
            if (location2 != null) {
                hashMap.put("u-latlong-accu-fine", a(location2));
                hashMap.put("u-ll-ts-fine", Long.valueOf(location2.getTime()));
            }
            if (e() && d()) {
                if (AbstractC3292ag.a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                    hashMap.put("loc-granularity", "coarse");
                }
            } else {
                hashMap.put("loc-granularity", "none");
                return hashMap;
            }
        }
        return hashMap;
    }

    public static String a(Location location) {
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        int accuracy = (int) location.getAccuracy();
        StringBuilder sb = new StringBuilder();
        sb.append(latitude);
        sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
        sb.append(longitude);
        return me4.g(accuracy, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, sb);
    }
}
