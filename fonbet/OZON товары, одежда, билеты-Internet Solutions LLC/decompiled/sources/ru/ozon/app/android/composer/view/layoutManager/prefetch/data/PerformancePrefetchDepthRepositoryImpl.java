package ru.ozon.app.android.composer.view.layoutManager.prefetch.data;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.layoutManager.prefetch.PrefetchCategory;
import ru.ozon.app.android.composer.view.layoutManager.prefetch.flags.PrefetchHighPerfDeviceFlag;
import ru.ozon.app.android.composer.view.layoutManager.prefetch.flags.PrefetchLowPerfDeviceFlag;
import ru.ozon.app.android.composer.view.layoutManager.prefetch.flags.PrefetchNormalPerfDeviceFlag;
import ru.ozon.app.android.network.abtool.FeatureService;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/composer/view/layoutManager/prefetch/data/PerformancePrefetchDepthRepositoryImpl;", "Lru/ozon/app/android/composer/view/layoutManager/prefetch/data/PerformancePrefetchDepthRepository;", "featureService", "Lru/ozon/app/android/network/abtool/FeatureService;", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;)V", "getBottomMultiplier", "", "prefetchCategory", "Lru/ozon/app/android/composer/view/layoutManager/prefetch/PrefetchCategory;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PerformancePrefetchDepthRepositoryImpl implements PerformancePrefetchDepthRepository {

    @NotNull
    private final FeatureService featureService;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrefetchCategory.values().length];
            try {
                iArr[PrefetchCategory.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrefetchCategory.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrefetchCategory.LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PerformancePrefetchDepthRepositoryImpl(@NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.featureService = featureService;
    }

    @Override // ru.ozon.app.android.composer.view.layoutManager.prefetch.data.PerformancePrefetchDepthRepository
    public float getBottomMultiplier(@NotNull PrefetchCategory prefetchCategory) {
        Intrinsics.checkNotNullParameter(prefetchCategory, "prefetchCategory");
        int i11 = WhenMappings.$EnumSwitchMapping$0[prefetchCategory.ordinal()];
        if (i11 == 1) {
            return this.featureService.getFloatKey(PrefetchHighPerfDeviceFlag.INSTANCE);
        }
        if (i11 == 2) {
            return this.featureService.getFloatKey(PrefetchNormalPerfDeviceFlag.INSTANCE);
        }
        if (i11 == 3) {
            return this.featureService.getFloatKey(PrefetchLowPerfDeviceFlag.INSTANCE);
        }
        throw new o();
    }
}
