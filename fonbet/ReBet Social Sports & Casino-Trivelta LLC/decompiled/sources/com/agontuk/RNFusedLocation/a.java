package com.agontuk.RNFusedLocation;

import V9.AbstractC1755k;
import V9.C1757m;
import V9.InterfaceC1749e;
import V9.InterfaceC1759o;
import android.app.Activity;
import android.content.IntentSender;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.Random;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes.dex */
public class a implements com.agontuk.RNFusedLocation.g {

    /* renamed from: a, reason: collision with root package name */
    public final ReactApplicationContext f28288a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1749e f28289b;

    /* renamed from: c, reason: collision with root package name */
    public final com.agontuk.RNFusedLocation.c f28290c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1759o f28291d;

    /* renamed from: e, reason: collision with root package name */
    public int f28292e;

    /* renamed from: f, reason: collision with root package name */
    public com.agontuk.RNFusedLocation.f f28293f;

    /* renamed from: g, reason: collision with root package name */
    public LocationRequest f28294g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f28295h = false;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC1755k f28296i = new C0459a();

    /* renamed from: j, reason: collision with root package name */
    public final Handler f28297j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    public final Runnable f28298k = new b();

    /* renamed from: com.agontuk.RNFusedLocation.a$a, reason: collision with other inner class name */
    public class C0459a extends AbstractC1755k {
        public C0459a() {
        }

        @Override // V9.AbstractC1755k
        public void onLocationAvailability(LocationAvailability locationAvailability) {
            if (locationAvailability.g() || i.f(a.this.f28288a)) {
                return;
            }
            a.this.f28290c.onLocationError(a.this, com.agontuk.RNFusedLocation.d.POSITION_UNAVAILABLE, "Unable to retrieve location.");
        }

        @Override // V9.AbstractC1755k
        public void onLocationResult(LocationResult locationResult) {
            a.this.f28290c.onLocationChange(a.this, locationResult.h());
            if (a.this.f28295h) {
                a.this.f28297j.removeCallbacks(a.this.f28298k);
                a.this.f28289b.removeLocationUpdates(a.this.f28296i);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f28290c.onLocationError(a.this, com.agontuk.RNFusedLocation.d.TIMEOUT, null);
            a.this.f28289b.removeLocationUpdates(a.this.f28296i);
        }
    }

    public class c implements OnFailureListener {
        public c() {
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            a.this.s();
        }
    }

    public class d implements OnSuccessListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.agontuk.RNFusedLocation.f f28302a;

        public d(com.agontuk.RNFusedLocation.f fVar) {
            this.f28302a = fVar;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Location location) {
            if (location == null || i.c(location) >= this.f28302a.g()) {
                a.this.s();
            } else {
                Log.i(RNFusedLocationModule.TAG, "returning cached location.");
                a.this.f28290c.onLocationChange(a.this, location);
            }
        }
    }

    public class e implements OnFailureListener {
        public e() {
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            com.google.android.gms.common.api.b bVar = (com.google.android.gms.common.api.b) exc;
            int statusCode = bVar.getStatusCode();
            if (statusCode != 6) {
                if (statusCode == 8502 && i.g(a.this.f28288a) && i.h(a.this.f28288a, "gps")) {
                    a.this.v();
                    return;
                } else {
                    a.this.f28290c.onLocationError(a.this, com.agontuk.RNFusedLocation.d.SETTINGS_NOT_SATISFIED, null);
                    return;
                }
            }
            boolean k10 = a.this.f28293f.k();
            boolean j10 = a.this.f28293f.j();
            boolean f10 = i.f(a.this.f28288a);
            if (!k10) {
                if (j10 && f10) {
                    a.this.v();
                    return;
                } else {
                    a.this.f28290c.onLocationError(a.this, f10 ? com.agontuk.RNFusedLocation.d.SETTINGS_NOT_SATISFIED : com.agontuk.RNFusedLocation.d.POSITION_UNAVAILABLE, null);
                    return;
                }
            }
            try {
                com.google.android.gms.common.api.j jVar = (com.google.android.gms.common.api.j) bVar;
                Activity currentActivity = a.this.f28288a.getCurrentActivity();
                if (currentActivity == null) {
                    a.this.f28290c.onLocationError(a.this, com.agontuk.RNFusedLocation.d.INTERNAL_ERROR, "Tried to open location dialog while not attached to an Activity.");
                    return;
                }
                a aVar = a.this;
                aVar.f28292e = aVar.t();
                jVar.b(currentActivity, a.this.f28292e);
            } catch (IntentSender.SendIntentException | ClassCastException unused) {
                a.this.f28290c.onLocationError(a.this, com.agontuk.RNFusedLocation.d.INTERNAL_ERROR, null);
            }
        }
    }

    public class f implements OnSuccessListener {
        public f() {
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(C1757m c1757m) {
            a.this.v();
        }
    }

    public static /* synthetic */ class g {
        static final /* synthetic */ int[] $SwitchMap$com$agontuk$RNFusedLocation$LocationAccuracy;

        static {
            int[] iArr = new int[com.agontuk.RNFusedLocation.b.values().length];
            $SwitchMap$com$agontuk$RNFusedLocation$LocationAccuracy = iArr;
            try {
                iArr[com.agontuk.RNFusedLocation.b.high.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$agontuk$RNFusedLocation$LocationAccuracy[com.agontuk.RNFusedLocation.b.balanced.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$agontuk$RNFusedLocation$LocationAccuracy[com.agontuk.RNFusedLocation.b.low.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$agontuk$RNFusedLocation$LocationAccuracy[com.agontuk.RNFusedLocation.b.passive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public a(ReactApplicationContext reactApplicationContext, com.agontuk.RNFusedLocation.c cVar) {
        this.f28288a = reactApplicationContext;
        this.f28289b = LocationServices.a(reactApplicationContext);
        this.f28290c = cVar;
        this.f28291d = LocationServices.c(reactApplicationContext);
    }

    @Override // com.agontuk.RNFusedLocation.g
    public void a(com.agontuk.RNFusedLocation.f fVar) {
        this.f28295h = false;
        this.f28293f = fVar;
        this.f28294g = r(fVar);
        s();
    }

    @Override // com.agontuk.RNFusedLocation.g
    public void b() {
        this.f28289b.removeLocationUpdates(this.f28296i);
    }

    @Override // com.agontuk.RNFusedLocation.g
    public boolean c(int i10, int i11) {
        if (i10 != this.f28292e) {
            return false;
        }
        if (i11 == -1) {
            v();
            return true;
        }
        boolean j10 = this.f28293f.j();
        boolean f10 = i.f(this.f28288a);
        if (j10 && f10) {
            v();
        } else {
            this.f28290c.onLocationError(this, f10 ? com.agontuk.RNFusedLocation.d.SETTINGS_NOT_SATISFIED : com.agontuk.RNFusedLocation.d.POSITION_UNAVAILABLE, null);
        }
        return true;
    }

    @Override // com.agontuk.RNFusedLocation.g
    public void d(com.agontuk.RNFusedLocation.f fVar) {
        this.f28295h = true;
        this.f28293f = fVar;
        this.f28294g = r(fVar);
        this.f28289b.getLastLocation().addOnSuccessListener(new d(fVar)).addOnFailureListener(new c());
    }

    public final LocationRequest r(com.agontuk.RNFusedLocation.f fVar) {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.h0(u(fVar.b())).f0(fVar.f()).e0(fVar.e()).i0(this.f28295h ? 0.0f : fVar.d());
        return locationRequest;
    }

    public final void s() {
        LocationSettingsRequest.a aVar = new LocationSettingsRequest.a();
        aVar.a(this.f28294g);
        this.f28291d.checkLocationSettings(aVar.b()).addOnSuccessListener(new f()).addOnFailureListener(new e());
    }

    public final int t() {
        return new Random().nextInt(10000);
    }

    public final int u(com.agontuk.RNFusedLocation.b bVar) {
        int i10 = g.$SwitchMap$com$agontuk$RNFusedLocation$LocationAccuracy[bVar.ordinal()];
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
        throw new IllegalStateException("Unexpected value: " + bVar);
    }

    public final void v() {
        this.f28289b.requestLocationUpdates(this.f28294g, this.f28296i, Looper.getMainLooper());
        if (this.f28295h) {
            long h10 = this.f28293f.h();
            if (h10 <= 0 || h10 == LongCompanionObject.MAX_VALUE) {
                return;
            }
            this.f28297j.postDelayed(this.f28298k, h10);
        }
    }
}
