package ru.ozon.app.android.abtool.domain;

import Ak.C2436a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.data.local.entity.ExperimentEntity;
import ru.ozon.app.android.abtool.data.local.entity.FeatureEntity;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/abtool/domain/ConfigsEntity;", "", "", "Lru/ozon/app/android/abtool/data/local/entity/FeatureEntity;", "features", "Lru/ozon/app/android/abtool/data/local/entity/ExperimentEntity;", "experiments", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "copy", "(Ljava/util/List;Ljava/util/List;)Lru/ozon/app/android/abtool/domain/ConfigsEntity;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getFeatures", "()Ljava/util/List;", "getExperiments", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ConfigsEntity {
    private final List<ExperimentEntity> experiments;

    @NotNull
    private final List<FeatureEntity> features;

    public ConfigsEntity(@NotNull List<FeatureEntity> features, List<ExperimentEntity> list) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.features = features;
        this.experiments = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfigsEntity copy$default(ConfigsEntity configsEntity, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = configsEntity.features;
        }
        if ((i11 & 2) != 0) {
            list2 = configsEntity.experiments;
        }
        return configsEntity.copy(list, list2);
    }

    @NotNull
    public final ConfigsEntity copy(@NotNull List<FeatureEntity> features, List<ExperimentEntity> experiments) {
        Intrinsics.checkNotNullParameter(features, "features");
        return new ConfigsEntity(features, experiments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigsEntity)) {
            return false;
        }
        ConfigsEntity configsEntity = (ConfigsEntity) other;
        return Intrinsics.d(this.features, configsEntity.features) && Intrinsics.d(this.experiments, configsEntity.experiments);
    }

    public final List<ExperimentEntity> getExperiments() {
        return this.experiments;
    }

    @NotNull
    public final List<FeatureEntity> getFeatures() {
        return this.features;
    }

    public int hashCode() {
        int hashCode = this.features.hashCode() * 31;
        List<ExperimentEntity> list = this.experiments;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return C2436a.b("ConfigsEntity(features=", this.features, ", experiments=", ")", this.experiments);
    }
}
