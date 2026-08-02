package com.agontuk.RNFusedLocation;

import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes.dex */
public class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final LocationManager f28317a;

    /* renamed from: b, reason: collision with root package name */
    public final com.agontuk.RNFusedLocation.c f28318b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f28319c = false;

    /* renamed from: d, reason: collision with root package name */
    public final LocationListener f28320d = new a();

    /* renamed from: e, reason: collision with root package name */
    public final Handler f28321e = new Handler(Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f28322f = new b();

    public class a implements LocationListener {
        public a() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            e.this.f28318b.onLocationChange(e.this, location);
            if (e.this.f28319c) {
                e.this.f28321e.removeCallbacks(e.this.f28322f);
                e.this.b();
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            e.this.f28318b.onLocationError(e.this, d.POSITION_UNAVAILABLE, null);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i10, Bundle bundle) {
            if (i10 == 2) {
                onProviderEnabled(str);
            } else {
                onProviderDisabled(str);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.f28318b.onLocationError(e.this, d.TIMEOUT, null);
            e.this.b();
        }
    }

    public static /* synthetic */ class c {
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

    public e(ReactApplicationContext reactApplicationContext, com.agontuk.RNFusedLocation.c cVar) {
        this.f28318b = cVar;
        this.f28317a = (LocationManager) reactApplicationContext.getSystemService("location");
    }

    @Override // com.agontuk.RNFusedLocation.g
    public void a(f fVar) {
        this.f28319c = false;
        String i10 = i(fVar.b());
        if (i10 == null) {
            this.f28318b.onLocationError(this, d.POSITION_UNAVAILABLE, null);
        } else {
            k(i10, fVar.f(), fVar.d(), fVar.h());
        }
    }

    @Override // com.agontuk.RNFusedLocation.g
    public void b() {
        this.f28317a.removeUpdates(this.f28320d);
    }

    @Override // com.agontuk.RNFusedLocation.g
    public boolean c(int i10, int i11) {
        return false;
    }

    @Override // com.agontuk.RNFusedLocation.g
    public void d(f fVar) {
        this.f28319c = true;
        String i10 = i(fVar.b());
        if (i10 == null) {
            this.f28318b.onLocationError(this, d.POSITION_UNAVAILABLE, null);
            return;
        }
        Location lastKnownLocation = this.f28317a.getLastKnownLocation(i10);
        if (lastKnownLocation == null || i.c(lastKnownLocation) >= fVar.g()) {
            k(i10, fVar.f(), 0.0f, fVar.h());
        } else {
            Log.i(RNFusedLocationModule.TAG, "returning cached location.");
            this.f28318b.onLocationChange(this, lastKnownLocation);
        }
    }

    public final String i(com.agontuk.RNFusedLocation.b bVar) {
        String bestProvider = this.f28317a.getBestProvider(j(bVar), true);
        if (bestProvider != null) {
            return bestProvider;
        }
        List<String> providers = this.f28317a.getProviders(true);
        if (providers.size() > 0) {
            return providers.get(0);
        }
        return null;
    }

    public final Criteria j(com.agontuk.RNFusedLocation.b bVar) {
        int i10;
        int i11 = c.$SwitchMap$com$agontuk$RNFusedLocation$LocationAccuracy[bVar.ordinal()];
        int i12 = 3;
        int i13 = 1;
        if (i11 != 1) {
            i10 = 2;
            if (i11 != 2) {
                if (i11 == 3) {
                    i12 = 1;
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException("Unexpected value: " + bVar);
                    }
                    i12 = 0;
                    i13 = 0;
                    i10 = 0;
                }
                Criteria criteria = new Criteria();
                criteria.setAccuracy(i10);
                criteria.setBearingAccuracy(i12);
                criteria.setHorizontalAccuracy(i12);
                criteria.setPowerRequirement(i13);
                criteria.setSpeedAccuracy(i12);
                criteria.setVerticalAccuracy(i12);
                return criteria;
            }
            i12 = 2;
        } else {
            i10 = 1;
        }
        i13 = i12;
        Criteria criteria2 = new Criteria();
        criteria2.setAccuracy(i10);
        criteria2.setBearingAccuracy(i12);
        criteria2.setHorizontalAccuracy(i12);
        criteria2.setPowerRequirement(i13);
        criteria2.setSpeedAccuracy(i12);
        criteria2.setVerticalAccuracy(i12);
        return criteria2;
    }

    public final void k(String str, long j10, float f10, long j11) {
        this.f28317a.requestLocationUpdates(str, j10, f10, this.f28320d, Looper.getMainLooper());
        if (!this.f28319c || j11 <= 0 || j11 == LongCompanionObject.MAX_VALUE) {
            return;
        }
        this.f28321e.postDelayed(this.f28322f, j11);
    }
}
