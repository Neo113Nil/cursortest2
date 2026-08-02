package ru.ozon.app.android.abtool.data.mapper;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.Experiment;
import ru.ozon.app.android.abtool.data.local.entity.ExperimentEntity;
import ru.ozon.app.android.abtool.data.network.ConfigsResponse;
import ru.ozon.app.android.abtool.presentation.experiments.recycler.ExperimentItem;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005J\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005¨\u0006\f"}, d2 = {"Lru/ozon/app/android/abtool/data/mapper/ExperimentMapper;", "", "<init>", "()V", "mapConfigExperiments", "", "Lru/ozon/app/android/abtool/data/local/entity/ExperimentEntity;", "experiments", "Lru/ozon/app/android/abtool/data/network/ConfigsResponse$Experiment;", "mapExperiments", "Lru/ozon/app/android/abtool/presentation/experiments/recycler/ExperimentItem;", "Lru/ozon/app/android/abtool/Experiment;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExperimentMapper {
    @NotNull
    public final List<ExperimentEntity> mapConfigExperiments(@NotNull List<ConfigsResponse.Experiment> experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        List<ConfigsResponse.Experiment> list = experiments;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (ConfigsResponse.Experiment experiment : list) {
            arrayList.add(new ExperimentEntity(experiment.getId(), experiment.getVariantId(), experiment.getAlias()));
        }
        return arrayList;
    }

    @NotNull
    public final List<ExperimentItem> mapExperiments(@NotNull List<Experiment> experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        StringBuilder sb2 = new StringBuilder();
        List<Experiment> list = experiments;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (Experiment experiment : list) {
            int id2 = experiment.getId();
            h.s(sb2);
            sb2.append("id: " + experiment.getId());
            sb2.append('\n');
            sb2.append("variantId: " + experiment.getVariantId());
            if (!h.K(experiment.getAlias())) {
                sb2.append('\n');
                sb2.append("alias: " + experiment.getAlias());
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            arrayList.add(new ExperimentItem(id2, sb3));
        }
        return arrayList;
    }
}
