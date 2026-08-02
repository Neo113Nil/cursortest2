package ru.ozon.app.android.abtool.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.data.local.entity.FeatureEntity;
import ru.ozon.app.android.abtool.utils.UpdateStrategyUtilsKt;
import ru.ozon.app.android.abtool.utils.ValueTypeUtilsKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toFeature", "Lru/ozon/app/android/abtool/domain/FeatureDebugModel;", "Lru/ozon/app/android/abtool/data/local/entity/FeatureEntity;", "abzone_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FeatureDebugModelKt {
    @NotNull
    public static final FeatureDebugModel toFeature(@NotNull FeatureEntity featureEntity) {
        Intrinsics.checkNotNullParameter(featureEntity, "<this>");
        return new FeatureDebugModel(featureEntity.getId(), featureEntity.getName(), featureEntity.getServiceName(), featureEntity.getValue(), featureEntity.getLocalValue(), featureEntity.getOverrideValue(), ValueTypeUtilsKt.toFeatureValueType(featureEntity.getValueType()), UpdateStrategyUtilsKt.toFeatureUpdateStrategy(featureEntity.getUpdateStrategy()), featureEntity.getDisplayedName());
    }
}
