package ru.ozon.app.android.abtool.domain;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.FeatureServiceConfig;
import ru.ozon.app.android.abtool.data.model.FeatureDTO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/abtool/domain/AbToolConfigFeatures;", "", "featureServiceConfig", "Lru/ozon/app/android/abtool/FeatureServiceConfig;", "<init>", "(Lru/ozon/app/android/abtool/FeatureServiceConfig;)V", "features", "", "Lru/ozon/app/android/abtool/data/model/FeatureDTO;", "getFeatures", "()Ljava/util/Set;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AbToolConfigFeatures {

    @NotNull
    private final FeatureServiceConfig featureServiceConfig;

    @NotNull
    private final Set<FeatureDTO> features;

    public AbToolConfigFeatures(@NotNull FeatureServiceConfig featureServiceConfig) {
        Intrinsics.checkNotNullParameter(featureServiceConfig, "featureServiceConfig");
        this.featureServiceConfig = featureServiceConfig;
        this.features = M.f71699a;
    }

    @NotNull
    public final Set<FeatureDTO> getFeatures() {
        return this.features;
    }
}
