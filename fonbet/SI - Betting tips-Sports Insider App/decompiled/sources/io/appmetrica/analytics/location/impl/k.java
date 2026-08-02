package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.cache.LocationDataCacheUpdateScheduler;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k implements ILastKnownUpdater, LocationControllerObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15030a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f15031b;

    /* renamed from: c, reason: collision with root package name */
    public final p f15032c;

    /* renamed from: d, reason: collision with root package name */
    public final IHandlerExecutor f15033d;

    /* renamed from: e, reason: collision with root package name */
    public final n f15034e;

    /* renamed from: f, reason: collision with root package name */
    public final LocationDataCacheUpdateScheduler f15035f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15036g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f15037h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f15038i = new HashMap();
    public Location j;

    public k(@NonNull Context context, @NonNull PermissionExtractor permissionExtractor, @NonNull IHandlerExecutor iHandlerExecutor, @NonNull p pVar) {
        this.f15030a = context;
        this.f15032c = pVar;
        this.f15031b = permissionExtractor;
        this.f15033d = iHandlerExecutor;
        this.f15034e = new n(pVar);
        LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler = new LocationDataCacheUpdateScheduler(iHandlerExecutor, this, pVar.a(), "loc");
        this.f15035f = locationDataCacheUpdateScheduler;
        pVar.a().setUpdateScheduler(locationDataCacheUpdateScheduler);
    }

    public final synchronized Location a() {
        return (Location) this.f15032c.f15049b.getData();
    }

    public final synchronized void b(@NonNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f15037h.remove(lastKnownLocationExtractorProvider.getIdentifier());
    }

    public final synchronized Location c() {
        Location location;
        location = this.j;
        if (location == null) {
            location = a();
        }
        return location;
    }

    public final synchronized void d() {
        try {
            this.f15035f.startUpdates();
            Iterator it = this.f15038i.values().iterator();
            while (it.hasNext()) {
                ((LocationReceiver) it.next()).startLocationUpdates();
            }
            updateLastKnown();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void e() {
        this.f15035f.stopUpdates();
        Iterator it = this.f15038i.values().iterator();
        while (it.hasNext()) {
            ((LocationReceiver) it.next()).stopLocationUpdates();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void startLocationTracking() {
        if (!this.f15036g) {
            this.f15036g = true;
            d();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void stopLocationTracking() {
        if (this.f15036g) {
            this.f15036g = false;
            e();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater
    public final synchronized void updateLastKnown() {
        Iterator it = this.f15037h.values().iterator();
        while (it.hasNext()) {
            ((LastKnownLocationExtractor) it.next()).updateLastKnownLocation();
        }
    }

    public final synchronized void b(@NonNull LocationReceiverProvider locationReceiverProvider) {
        LocationReceiver locationReceiver = (LocationReceiver) this.f15038i.remove(locationReceiverProvider.getIdentifier());
        if (locationReceiver != null && this.f15036g) {
            locationReceiver.stopLocationUpdates();
        }
    }

    public final void a(@NonNull i iVar) {
        this.f15033d.execute(new j(this, iVar));
    }

    public final synchronized void a(@NonNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        LastKnownLocationExtractor extractor = lastKnownLocationExtractorProvider.getExtractor(this.f15030a, this.f15031b, this.f15033d, this.f15034e);
        this.f15037h.put(lastKnownLocationExtractorProvider.getIdentifier(), extractor);
        if (this.f15036g) {
            extractor.updateLastKnownLocation();
        }
    }

    public final synchronized Location b() {
        return this.j;
    }

    public final synchronized void a(@NonNull LocationReceiverProvider locationReceiverProvider) {
        try {
            LocationReceiver locationReceiver = locationReceiverProvider.getLocationReceiver(this.f15030a, this.f15031b, this.f15033d, this.f15034e);
            LocationReceiver locationReceiver2 = (LocationReceiver) this.f15038i.put(locationReceiverProvider.getIdentifier(), locationReceiver);
            if (this.f15036g) {
                if (locationReceiver2 != null) {
                    locationReceiver2.stopLocationUpdates();
                }
                locationReceiver.startLocationUpdates();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a(Location location) {
        if (location != null) {
            this.j = location;
        }
    }
}
