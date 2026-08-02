package ru.ozon.app.android.initializers.lastlocation;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.location.LocationRepository;
import ru.ozon.app.android.mapcommon.mapcommon.LastLocationRepository;
import ru.ozon.app.android.startup.initializers.ActionInitializer;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/initializers/lastlocation/LastLocationInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "locationRepository", "Lru/ozon/app/android/location/LocationRepository;", "lastLocationRepository", "Lru/ozon/app/android/mapcommon/mapcommon/LastLocationRepository;", "<init>", "(Lru/ozon/app/android/location/LocationRepository;Lru/ozon/app/android/mapcommon/mapcommon/LastLocationRepository;)V", "init", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LastLocationInitializer implements ActionInitializer {

    @NotNull
    private final LastLocationRepository lastLocationRepository;

    @NotNull
    private final LocationRepository locationRepository;

    public LastLocationInitializer(@NotNull LocationRepository locationRepository, @NotNull LastLocationRepository lastLocationRepository) {
        Intrinsics.checkNotNullParameter(locationRepository, "locationRepository");
        Intrinsics.checkNotNullParameter(lastLocationRepository, "lastLocationRepository");
        this.locationRepository = locationRepository;
        this.lastLocationRepository = lastLocationRepository;
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        ProcessLifecycleOwner processLifecycleOwner;
        int i11 = ProcessLifecycleOwner.f43231j;
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        processLifecycleOwner.getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.initializers.lastlocation.LastLocationInitializer$init$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                ProcessLifecycleOwner processLifecycleOwner2;
                Intrinsics.checkNotNullParameter(owner, "owner");
                processLifecycleOwner2 = ProcessLifecycleOwner.f43230i;
                C10727i.c(K.a(processLifecycleOwner2), null, null, new LastLocationInitializer$init$1$onStart$1(LastLocationInitializer.this, null), 3);
            }
        });
    }
}
