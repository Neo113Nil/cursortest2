package ru.ozon.app.android.abtool.data.mapper;

import U7.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.data.local.entity.FeatureEntity;
import ru.ozon.app.android.abtool.data.model.FeatureDTO;
import ru.ozon.app.android.abtool.data.model.UpdateStrategy;
import ru.ozon.app.android.abtool.data.model.ValueType;
import ru.ozon.app.android.abtool.data.network.ConfigsResponse;
import ru.ozon.app.android.abtool.utils.ValueTypeUtilsKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0001¢\u0006\u0002\b\u0004\u001a\u001d\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00050\u0001H\u0001¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"toEntities", "", "Lru/ozon/app/android/abtool/data/local/entity/FeatureEntity;", "Lru/ozon/app/android/abtool/data/network/ConfigsResponse$Config;", "configsToEntities", "Lru/ozon/app/android/abtool/data/model/FeatureDTO;", "featureDTOToEntities", "abzone_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FeatureMapperKt {
    @NotNull
    public static final List<FeatureEntity> configsToEntities(@NotNull List<ConfigsResponse.Config> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (ConfigsResponse.Config config : list) {
            String serviceName = config.getServiceName();
            for (ConfigsResponse.Config.Attribute attribute : config.getAttributes()) {
                arrayList.add(new FeatureEntity(d.e(serviceName, attribute.getName()), serviceName, null, attribute.getName(), ValueTypeUtilsKt.getValueType(attribute.getType()), attribute.getValue().toString(), null, UpdateStrategy.AS_FETCHED, null, 68, null));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<FeatureEntity> featureDTOToEntities(@NotNull List<FeatureDTO> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<FeatureDTO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (FeatureDTO featureDTO : list2) {
            String e11 = d.e(featureDTO.getServiceName(), featureDTO.getName());
            String serviceName = featureDTO.getServiceName();
            String displayedName = featureDTO.getDisplayedName();
            String name = featureDTO.getName();
            ValueType valueType = featureDTO.getValueType();
            String obj = featureDTO.getDefaultValue().toString();
            Object localValue = featureDTO.getLocalValue();
            arrayList.add(new FeatureEntity(e11, serviceName, displayedName, name, valueType, obj, localValue != null ? localValue.toString() : null, featureDTO.getUpdateStrategy(), null));
        }
        return arrayList;
    }
}
