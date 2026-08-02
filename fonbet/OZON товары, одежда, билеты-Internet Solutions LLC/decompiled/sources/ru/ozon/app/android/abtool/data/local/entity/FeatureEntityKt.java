package ru.ozon.app.android.abtool.data.local.entity;

import B0.A0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0005"}, d2 = {"logFlagSourceFromCache", "", "Lru/ozon/app/android/abtool/data/local/entity/FeatureEntity;", "logFlagSourceFromDb", "logFlagSourceFromDefaults", "abzone_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FeatureEntityKt {
    @NotNull
    public static final String logFlagSourceFromCache(@NotNull FeatureEntity featureEntity) {
        Intrinsics.checkNotNullParameter(featureEntity, "<this>");
        return A0.b("Feature \"", featureEntity.getId(), "\" received from memory cache");
    }

    @NotNull
    public static final String logFlagSourceFromDb(@NotNull FeatureEntity featureEntity) {
        Intrinsics.checkNotNullParameter(featureEntity, "<this>");
        return A0.b("Feature \"", featureEntity.getId(), "\" received from database");
    }

    @NotNull
    public static final String logFlagSourceFromDefaults(@NotNull FeatureEntity featureEntity) {
        Intrinsics.checkNotNullParameter(featureEntity, "<this>");
        return A0.b("Feature \"", featureEntity.getId(), "\" received from defaults cache");
    }
}
