package io.seon.androidsdk.service;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.GnssCapabilities;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.facebook.hermes.intl.Constants;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.seon.androidsdk.service.h4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4939h4 extends AbstractC4950j implements LocationListener {

    /* renamed from: J, reason: collision with root package name */
    public static final String f53328J;

    /* renamed from: K, reason: collision with root package name */
    public static final Map f53329K;

    /* renamed from: t, reason: collision with root package name */
    public static final String[] f53330t = {"latitude", "longitude", "accuracy", "is_cached", "status", "is_simulated", "mock_location_apps", EventKeys.TIMESTAMP};

    /* renamed from: B, reason: collision with root package name */
    public Location f53331B;

    /* renamed from: C, reason: collision with root package name */
    public Location f53332C;

    /* renamed from: D, reason: collision with root package name */
    public Location f53333D;

    /* renamed from: E, reason: collision with root package name */
    public GeolocationProbe$LocationStatus f53334E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f53335F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f53336G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f53337H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f53338I;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f53339e = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public Jh.a f53340g;

    /* renamed from: n, reason: collision with root package name */
    public Context f53341n;

    /* renamed from: o, reason: collision with root package name */
    public LocationManager f53342o;

    /* renamed from: p, reason: collision with root package name */
    public PackageManager f53343p;

    /* renamed from: q, reason: collision with root package name */
    public CountDownLatch f53344q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f53345r;

    static {
        Lh.a.d(C4939h4.class);
        f53328J = "fused";
        HashMap hashMap = new HashMap();
        hashMap.put("network", 1);
        hashMap.put("fused", 2);
        hashMap.put("gps", 3);
        f53329K = Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void A(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            this.f53342o.requestLocationUpdates(str, x(str), 0.0f, this);
            this.f53338I = true;
        }
    }

    public final boolean B(Location location) {
        boolean isComplete;
        if (location != null) {
            if (TimeUnit.NANOSECONDS.toSeconds(SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) <= Math.max(this.f53340g.b(), 0.01d)) {
                if (Build.VERSION.SDK_INT < 33) {
                    return (location.getProvider() == null || !location.hasAccuracy() || location.getTime() == 0 || location.getElapsedRealtimeNanos() == 0) ? false : true;
                }
                isComplete = location.isComplete();
                return isComplete;
            }
        }
        return false;
    }

    public final boolean C(final ArrayList arrayList) {
        this.f53344q = new CountDownLatch(1);
        Runnable runnable = new Runnable() { // from class: io.seon.androidsdk.service.S3
            @Override // java.lang.Runnable
            public final void run() {
                C4939h4.this.A(arrayList);
            }
        };
        synchronized (V.class) {
            V.s(runnable);
        }
        try {
            if (this.f53344q.await(this.f53340g.a(), TimeUnit.MILLISECONDS)) {
                return true;
            }
            if (!this.f53340g.d()) {
                this.f53342o.removeUpdates(this);
                this.f53336G = false;
            }
            this.f53334E = GeolocationProbe$LocationStatus.TIMEOUT;
            this.f53332C = this.f53331B;
            return false;
        } catch (Exception unused) {
            if (!this.f53340g.d()) {
                this.f53342o.removeUpdates(this);
                this.f53336G = false;
            }
            this.f53334E = GeolocationProbe$LocationStatus.FAIL;
            this.f53332C = this.f53331B;
            return false;
        }
    }

    public final Boolean D(GnssCapabilities gnssCapabilities) {
        return Boolean.valueOf(Build.VERSION.SDK_INT >= 31 ? gnssCapabilities.hasMeasurements() : false);
    }

    public final Boolean E(String str) {
        return Boolean.valueOf(str.contains("OTHER_MODES_POWER"));
    }

    public final Boolean F(GnssCapabilities gnssCapabilities) {
        return Boolean.valueOf(Build.VERSION.SDK_INT >= 31 ? gnssCapabilities.hasNavigationMessages() : false);
    }

    public final Boolean G(String str) {
        return Boolean.valueOf(str.contains("SCHEDULING"));
    }

    public final Boolean H(String str) {
        return Boolean.valueOf(str.contains("TOTAL_POWER"));
    }

    public final float I() {
        return a0().getAccuracy();
    }

    public final Boolean J(String str) {
        return Boolean.valueOf(str.contains("SINGLEBAND_TRACKING_POWER"));
    }

    public final double K() {
        return a0().getAltitude();
    }

    public final Boolean L(String str) {
        return Boolean.valueOf(str.contains("MULTIBAND_TRACKING_POWER"));
    }

    public final float M() {
        return a0().getBearing();
    }

    public final Boolean N(String str) {
        return Boolean.valueOf(str.contains("SINGLEBAND_ACQUISITION_POWER"));
    }

    public final float O() {
        float bearingAccuracyDegrees;
        if (Build.VERSION.SDK_INT < 26) {
            return -1.0f;
        }
        bearingAccuracyDegrees = a0().getBearingAccuracyDegrees();
        return bearingAccuracyDegrees;
    }

    public final Boolean P(String str) {
        return Boolean.valueOf(str.contains("MULTIBAND_ACQUISITION_POWER"));
    }

    public final List Q() {
        LocationManager locationManager = this.f53342o;
        return locationManager == null ? this.f53339e : locationManager.getProviders(true);
    }

    public final Map R() {
        HashMap hashMap = new HashMap();
        hashMap.put("altitude", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.T3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Double.valueOf(C4939h4.this.K());
            }
        }));
        hashMap.put("bearing", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.V3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Float.valueOf(C4939h4.this.M());
            }
        }));
        hashMap.put("bearing_accuracy", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.W3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Float.valueOf(C4939h4.this.O());
            }
        }));
        hashMap.put("extras", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.X3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4939h4.this.S();
            }
        }));
        hashMap.put("speed", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.Y3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Float.valueOf(C4939h4.this.g0());
            }
        }));
        hashMap.put("speed_accuracy", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.Z3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Float.valueOf(C4939h4.this.h0());
            }
        }));
        hashMap.put("vertical_accuracy", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.a4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Float.valueOf(C4939h4.this.s());
            }
        }));
        hashMap.put(EventKeys.TIMESTAMP, AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.b4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Long.valueOf(C4939h4.this.r());
            }
        }));
        hashMap.put("provider", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.c4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4939h4.this.f0();
            }
        }));
        hashMap.put("age_sec", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.d4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                Long u10;
                u10 = C4939h4.this.u();
                return u10;
            }
        }));
        hashMap.put("providers_enabled", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.U3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4939h4.this.Q();
            }
        }));
        return hashMap;
    }

    public final Map S() {
        Bundle extras = a0().getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : extras.keySet()) {
            hashMap.put(str, extras.get(str));
        }
        return hashMap;
    }

    public final Jh.a T() {
        return this.f53340g;
    }

    public final Map U() {
        final GnssCapabilities gnssCapabilities;
        final String gnssCapabilities2;
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        gnssCapabilities = this.f53342o.getGnssCapabilities();
        gnssCapabilities2 = gnssCapabilities.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("has_antenna_info", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.K3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                Boolean y10;
                y10 = C4939h4.this.y(gnssCapabilities);
                return y10;
            }
        }));
        hashMap.put("has_measurements", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.L3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                Boolean D10;
                D10 = C4939h4.this.D(gnssCapabilities);
                return D10;
            }
        }));
        hashMap.put("has_navigation_messages", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.M3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                Boolean F10;
                F10 = C4939h4.this.F(gnssCapabilities);
                return F10;
            }
        }));
        hashMap.put("has_scheduling", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.N3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                Boolean G10;
                G10 = C4939h4.this.G(gnssCapabilities2);
                return G10;
            }
        }));
        hashMap.put("has_power_total", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.O3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                Boolean H10;
                H10 = C4939h4.this.H(gnssCapabilities2);
                return H10;
            }
        }));
        hashMap.put("has_power_singleband_tracking", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.P3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                Boolean J10;
                J10 = C4939h4.this.J(gnssCapabilities2);
                return J10;
            }
        }));
        hashMap.put("has_power_multiband_tracking", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.Q3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                Boolean L10;
                L10 = C4939h4.this.L(gnssCapabilities2);
                return L10;
            }
        }));
        hashMap.put("has_power_singleband_acquisition", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.R3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                Boolean N10;
                N10 = C4939h4.this.N(gnssCapabilities2);
                return N10;
            }
        }));
        hashMap.put("has_power_multiband_acquisition", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.I3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                Boolean P10;
                P10 = C4939h4.this.P(gnssCapabilities2);
                return P10;
            }
        }));
        hashMap.put("has_power_other_modes", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.J3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                Boolean E10;
                E10 = C4939h4.this.E(gnssCapabilities2);
                return E10;
            }
        }));
        return hashMap;
    }

    public final String V() {
        String gnssHardwareModelName;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        gnssHardwareModelName = this.f53342o.getGnssHardwareModelName();
        return gnssHardwareModelName;
    }

    public final int W() {
        int gnssYearOfHardware;
        if (Build.VERSION.SDK_INT < 28) {
            return -1;
        }
        gnssYearOfHardware = this.f53342o.getGnssYearOfHardware();
        return gnssYearOfHardware;
    }

    public final boolean X() {
        return this.f53335F;
    }

    public final boolean Y() {
        boolean isMock;
        Location a02 = a0();
        if (Build.VERSION.SDK_INT < 31) {
            return a02.isFromMockProvider();
        }
        isMock = a02.isMock();
        return isMock;
    }

    public final double Z() {
        return a0().getLatitude();
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final void a(C4878a c4878a) {
        try {
            Context a10 = c4878a.a();
            this.f53368b = c4878a;
            this.f53341n = a10;
            this.f53342o = (LocationManager) a10.getSystemService("location");
            this.f53343p = a10.getPackageManager();
            Location location = new Location(Constants.COLLATION_DEFAULT);
            this.f53331B = location;
            this.f53334E = GeolocationProbe$LocationStatus.UNKNOWN;
            if (this.f53342o != null && this.f53343p != null) {
                if (!t()) {
                    if (this.f53334E == GeolocationProbe$LocationStatus.NO_SUPPORT) {
                        this.f53332C = this.f53331B;
                        return;
                    }
                    return;
                }
                if (this.f53345r && this.f53342o.isProviderEnabled("gps")) {
                    this.f53339e.add("gps");
                }
                LocationManager locationManager = this.f53342o;
                String str = f53328J;
                if (locationManager.isProviderEnabled(str)) {
                    this.f53339e.add(str);
                }
                if (this.f53342o.isProviderEnabled("network")) {
                    this.f53339e.add("network");
                }
                if (this.f53342o.isProviderEnabled("passive")) {
                    this.f53339e.add("passive");
                }
                if (this.f53340g.d()) {
                    v();
                }
                w();
                return;
            }
            this.f53332C = location;
            this.f53334E = GeolocationProbe$LocationStatus.NO_SUPPORT;
        } catch (Exception unused) {
        }
    }

    public final Location a0() {
        Location location = this.f53332C;
        if (location == this.f53331B) {
            return location;
        }
        if (this.f53337H || B(location)) {
            if (!this.f53337H) {
                if (TimeUnit.NANOSECONDS.toSeconds(SystemClock.elapsedRealtimeNanos() - this.f53332C.getElapsedRealtimeNanos()) > 600) {
                    this.f53335F = true;
                }
            }
            return this.f53332C;
        }
        GeolocationProbe$LocationStatus geolocationProbe$LocationStatus = this.f53334E;
        this.f53335F = false;
        this.f53334E = GeolocationProbe$LocationStatus.UNKNOWN;
        if (t()) {
            if (geolocationProbe$LocationStatus == GeolocationProbe$LocationStatus.DISABLED || geolocationProbe$LocationStatus == GeolocationProbe$LocationStatus.NO_PERMISSION) {
                if (!this.f53339e.contains("gps") && this.f53345r && this.f53342o.isProviderEnabled("gps")) {
                    this.f53339e.add("gps");
                }
                ArrayList arrayList = this.f53339e;
                String str = f53328J;
                if (!arrayList.contains(str) && this.f53342o.isProviderEnabled(str)) {
                    this.f53339e.add(str);
                }
                if (!this.f53339e.contains("network") && this.f53342o.isProviderEnabled("network")) {
                    this.f53339e.add("network");
                }
            }
            if (this.f53339e.size() != 0) {
                Iterator it = this.f53339e.iterator();
                while (it.hasNext()) {
                    Location lastKnownLocation = this.f53342o.getLastKnownLocation((String) it.next());
                    if (!B(lastKnownLocation)) {
                        lastKnownLocation = null;
                    }
                    if (lastKnownLocation != null) {
                        this.f53335F = true;
                        this.f53334E = GeolocationProbe$LocationStatus.SUCCESS;
                        this.f53332C = lastKnownLocation;
                        return lastKnownLocation;
                    }
                }
                if (C(this.f53339e)) {
                    return this.f53332C;
                }
                if (this.f53334E == GeolocationProbe$LocationStatus.UNKNOWN) {
                    this.f53334E = GeolocationProbe$LocationStatus.FAIL;
                }
                if (this.f53332C == null) {
                    this.f53332C = this.f53331B;
                }
                return this.f53332C;
            }
            this.f53334E = GeolocationProbe$LocationStatus.NO_PROVIDER;
        } else if (this.f53336G) {
            this.f53342o.removeUpdates(this);
            this.f53336G = false;
        }
        Location location2 = this.f53331B;
        this.f53332C = location2;
        return location2;
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final Map b() {
        HashMap hashMap = new HashMap();
        hashMap.put("experimental_device_location", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.E3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4939h4.this.R();
            }
        }));
        hashMap.put("gnss_capabilities", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.F3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4939h4.this.U();
            }
        }));
        hashMap.put("gnss_hardware_model_name", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.G3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4939h4.this.V();
            }
        }));
        hashMap.put("gnss_year_of_hardware", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.H3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Integer.valueOf(C4939h4.this.W());
            }
        }));
        GeolocationProbe$LocationStatus geolocationProbe$LocationStatus = this.f53334E;
        GeolocationProbe$LocationStatus geolocationProbe$LocationStatus2 = GeolocationProbe$LocationStatus.SUCCESS;
        if (geolocationProbe$LocationStatus != geolocationProbe$LocationStatus2 && geolocationProbe$LocationStatus != GeolocationProbe$LocationStatus.NO_SUPPORT) {
            this.f53332C = null;
            this.f53334E = GeolocationProbe$LocationStatus.UNKNOWN;
        }
        Location location = this.f53333D;
        if (location != null) {
            this.f53332C = location;
            this.f53335F = false;
            this.f53334E = geolocationProbe$LocationStatus2;
        }
        this.f53337H = false;
        this.f53338I = false;
        if (!t()) {
            return hashMap;
        }
        if (this.f53340g.d()) {
            V.p(new RunnableC4915e4(this));
        }
        RunnableC4923f4 runnableC4923f4 = new RunnableC4923f4(this);
        synchronized (V.class) {
            V.s(runnableC4923f4);
        }
        return hashMap;
    }

    public final GeolocationProbe$LocationStatus b0() {
        return this.f53334E;
    }

    public final long c0() {
        if (this.f53332C == null) {
            return -1L;
        }
        return System.currentTimeMillis() - TimeUnit.NANOSECONDS.toMillis(SystemClock.elapsedRealtimeNanos() - this.f53332C.getElapsedRealtimeNanos());
    }

    public final double d0() {
        return a0().getLongitude();
    }

    public final List e0() {
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT < 30) {
            for (PackageInfo packageInfo : this.f53343p.getInstalledPackages(4096)) {
                if (!packageInfo.packageName.equals(this.f53341n.getPackageName()) && (strArr = packageInfo.requestedPermissions) != null && Arrays.asList(strArr).contains("android.permission.ACCESS_MOCK_LOCATION")) {
                    arrayList.add(packageInfo.packageName);
                }
            }
        }
        return arrayList;
    }

    public final String f0() {
        return a0().getProvider();
    }

    public final float g0() {
        return a0().getSpeed();
    }

    public final float h0() {
        float speedAccuracyMetersPerSecond;
        if (Build.VERSION.SDK_INT < 26) {
            return -1.0f;
        }
        speedAccuracyMetersPerSecond = a0().getSpeedAccuracyMetersPerSecond();
        return speedAccuracyMetersPerSecond;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (r5.f53337H != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        r5.f53332C = r6;
        r5.f53335F = false;
        r5.f53334E = io.seon.androidsdk.service.GeolocationProbe$LocationStatus.SUCCESS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        r5.f53333D = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        if (r5.f53337H != false) goto L21;
     */
    @Override // android.location.LocationListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLocationChanged(Location location) {
        if (B(location)) {
            if (B(this.f53332C)) {
                Map map = f53329K;
                Integer num = (Integer) map.get(location.getProvider());
                Integer num2 = (Integer) map.get(this.f53332C.getProvider());
                if (num2 == null || (num != null && ((num.equals(num2) && location.getAccuracy() < this.f53332C.getAccuracy()) || num.intValue() > num2.intValue()))) {
                }
            }
            CountDownLatch countDownLatch = this.f53344q;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            if (this.f53338I) {
                if (!this.f53340g.d()) {
                    this.f53342o.removeUpdates(this);
                }
                this.f53338I = false;
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        boolean t10 = t();
        if (!str.equals("gps") && !this.f53345r) {
            this.f53339e.remove("gps");
        }
        this.f53339e.remove(str);
        if ((!t10 || this.f53339e.size() == 0) && this.f53336G) {
            this.f53342o.removeUpdates(this);
            this.f53336G = false;
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        boolean t10 = t();
        if (!t10 && this.f53336G) {
            this.f53342o.removeUpdates(this);
            this.f53336G = false;
        }
        if (!str.equals("gps") || this.f53345r) {
            this.f53339e.add(str);
            if (t10) {
                if (this.f53340g.d()) {
                    V.p(new RunnableC4915e4(this));
                }
                RunnableC4923f4 runnableC4923f4 = new RunnableC4923f4(this);
                synchronized (V.class) {
                    V.s(runnableC4923f4);
                }
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i10, Bundle bundle) {
        if (i10 == 2) {
            onProviderEnabled(str);
        } else {
            onProviderDisabled(str);
        }
    }

    public final long r() {
        return a0().getTime();
    }

    public final float s() {
        float verticalAccuracyMeters;
        if (Build.VERSION.SDK_INT < 26) {
            return -1.0f;
        }
        verticalAccuracyMeters = a0().getVerticalAccuracyMeters();
        return verticalAccuracyMeters;
    }

    public final boolean t() {
        GeolocationProbe$LocationStatus geolocationProbe$LocationStatus;
        boolean isLocationEnabled;
        if (this.f53343p.hasSystemFeature("android.hardware.location")) {
            if (Build.VERSION.SDK_INT >= 28) {
                isLocationEnabled = this.f53342o.isLocationEnabled();
                if (!isLocationEnabled) {
                    geolocationProbe$LocationStatus = GeolocationProbe$LocationStatus.DISABLED;
                }
            }
            if (V.k(this.f53341n, "android.permission.ACCESS_FINE_LOCATION") && this.f53343p.hasSystemFeature("android.hardware.location.gps")) {
                this.f53345r = true;
                return true;
            }
            if (V.k(this.f53341n, "android.permission.ACCESS_COARSE_LOCATION")) {
                this.f53345r = false;
                return true;
            }
            geolocationProbe$LocationStatus = GeolocationProbe$LocationStatus.NO_PERMISSION;
        } else {
            geolocationProbe$LocationStatus = GeolocationProbe$LocationStatus.NO_SUPPORT;
        }
        this.f53334E = geolocationProbe$LocationStatus;
        this.f53345r = false;
        return false;
    }

    public final Long u() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toSeconds(SystemClock.elapsedRealtimeNanos() - this.f53332C.getElapsedRealtimeNanos()));
    }

    public final void v() {
        try {
            try {
                if (!this.f53340g.c() || this.f53339e.size() == 0) {
                    w();
                    return;
                }
                Iterator it = this.f53339e.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    this.f53342o.requestLocationUpdates(str, x(str), 0.0f, this);
                    this.f53336G = true;
                }
            } catch (Exception unused) {
                w();
            }
        } catch (Exception unused2) {
        }
    }

    public final void w() {
        try {
            if (this.f53342o.isProviderEnabled("passive")) {
                this.f53342o.requestLocationUpdates("passive", x("passive"), 0.0f, this);
            }
        } catch (Exception unused) {
        }
    }

    public final long x(String str) {
        if (this.f53340g.b() <= 0) {
            return 100L;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = timeUnit.toMillis(this.f53340g.b());
        return Math.max(millis / 2, Math.max(millis - timeUnit.toMillis(Objects.equals(str, "gps") ? 30L : 10L), 100L));
    }

    public final Boolean y(GnssCapabilities gnssCapabilities) {
        return Boolean.valueOf(Build.VERSION.SDK_INT >= 31 ? gnssCapabilities.hasAntennaInfo() : false);
    }

    public final void z(Jh.a aVar) {
        if (aVar == null) {
            aVar = new Jh.b().a();
        }
        Jh.a aVar2 = this.f53340g;
        boolean z10 = aVar2 == null || aVar2.d();
        this.f53340g = aVar;
        if (this.f53342o == null || this.f53343p == null) {
            return;
        }
        boolean t10 = t();
        if (this.f53340g.d()) {
            if (z10 || !t10) {
                return;
            }
            V.p(new RunnableC4915e4(this));
            V.p(new RunnableC4923f4(this));
            return;
        }
        if (z10) {
            this.f53342o.removeUpdates(this);
            this.f53336G = false;
            if (t10) {
                RunnableC4923f4 runnableC4923f4 = new RunnableC4923f4(this);
                synchronized (V.class) {
                    V.s(runnableC4923f4);
                }
            }
        }
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final Map a() {
        Jh.a aVar = this.f53340g;
        if (aVar == null || !aVar.c()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("latitude", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.w3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Double.valueOf(C4939h4.this.Z());
            }
        }));
        this.f53337H = true;
        hashMap.put("longitude", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.x3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Double.valueOf(C4939h4.this.d0());
            }
        }));
        hashMap.put("accuracy", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.y3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Float.valueOf(C4939h4.this.I());
            }
        }));
        hashMap.put("is_cached", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.z3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Boolean.valueOf(C4939h4.this.X());
            }
        }));
        hashMap.put("status", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.A3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4939h4.this.b0();
            }
        }));
        hashMap.put("is_simulated", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.B3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Boolean.valueOf(C4939h4.this.Y());
            }
        }));
        hashMap.put("mock_location_apps", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.C3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C4939h4.this.e0();
            }
        }));
        hashMap.put(EventKeys.TIMESTAMP, AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.D3
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return Long.valueOf(C4939h4.this.c0());
            }
        }));
        return hashMap;
    }
}
