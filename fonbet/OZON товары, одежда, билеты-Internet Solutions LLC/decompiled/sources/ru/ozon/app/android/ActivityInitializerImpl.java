package ru.ozon.app.android;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.location.ComposerLocationRepository;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\b\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ActivityInitializerImpl;", "Lru/ozon/app/android/ActivityInitializer;", "areaRepository", "Lru/ozon/app/android/location/ComposerLocationRepository;", "<init>", "(Lru/ozon/app/android/location/ComposerLocationRepository;)V", "startActivityInitializationSequence", "", "initLocation", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActivityInitializerImpl implements ActivityInitializer {

    @NotNull
    private final ComposerLocationRepository areaRepository;

    public ActivityInitializerImpl(@NotNull ComposerLocationRepository areaRepository) {
        Intrinsics.checkNotNullParameter(areaRepository, "areaRepository");
        this.areaRepository = areaRepository;
    }

    private final void initLocation() {
        this.areaRepository.initLocation();
    }

    @Override // ru.ozon.app.android.ActivityInitializer
    public void startActivityInitializationSequence(boolean initLocation) {
        if (initLocation) {
            initLocation();
        }
    }
}
