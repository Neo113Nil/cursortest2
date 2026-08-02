package ru.ozon.app.android.abtool.utils;

import G.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.data.local.entity.FeatureEntity;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a3\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a1\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\u0005¨\u0006\f"}, d2 = {"", "Lru/ozon/app/android/abtool/data/local/entity/FeatureEntity;", "hostFeatures", "libsFeatures", "overridePlatformFlagsIfPossible", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "", "getOverrideName", "(Lru/ozon/app/android/abtool/data/local/entity/FeatureEntity;)Ljava/lang/String;", "newFeatures", "cachedFeatures", "mergeCachedFeaturesWithNew", "abzone_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MasterFlagUtilsKt {
    @NotNull
    public static final String getOverrideName(@NotNull FeatureEntity featureEntity) {
        Intrinsics.checkNotNullParameter(featureEntity, "<this>");
        return g.c(featureEntity.getServiceName(), "--", featureEntity.getName());
    }

    @NotNull
    public static final List<FeatureEntity> mergeCachedFeaturesWithNew(@NotNull List<FeatureEntity> newFeatures, @NotNull List<FeatureEntity> cachedFeatures) {
        Intrinsics.checkNotNullParameter(newFeatures, "newFeatures");
        Intrinsics.checkNotNullParameter(cachedFeatures, "cachedFeatures");
        List<FeatureEntity> list = newFeatures;
        int h11 = U.h(C7714v.z(list, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (Object obj : list) {
            FeatureEntity featureEntity = (FeatureEntity) obj;
            linkedHashMap.put(featureEntity.getServiceName() + "|" + featureEntity.getName(), obj);
        }
        ArrayList p02 = C7714v.p0(cachedFeatures, newFeatures);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = p02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            FeatureEntity featureEntity2 = (FeatureEntity) next;
            if (hashSet.add(featureEntity2.getServiceName() + "|" + featureEntity2.getName())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            FeatureEntity featureEntity3 = (FeatureEntity) it2.next();
            FeatureEntity featureEntity4 = (FeatureEntity) linkedHashMap.get(featureEntity3.getServiceName() + "|" + featureEntity3.getName());
            if (featureEntity4 != null) {
                featureEntity3 = featureEntity4;
            }
            arrayList2.add(featureEntity3);
        }
        return arrayList2;
    }

    @NotNull
    public static final List<FeatureEntity> overridePlatformFlagsIfPossible(List<FeatureEntity> list, @NotNull List<FeatureEntity> libsFeatures) {
        FeatureEntity featureEntity;
        Object obj;
        Intrinsics.checkNotNullParameter(libsFeatures, "libsFeatures");
        List<FeatureEntity> list2 = libsFeatures;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (FeatureEntity featureEntity2 : list2) {
            String overrideName = getOverrideName(featureEntity2);
            String str = null;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    FeatureEntity featureEntity3 = (FeatureEntity) obj;
                    if (Intrinsics.d(featureEntity3.getServiceName(), "platform_mobile_overrides") && Intrinsics.d(featureEntity3.getName(), overrideName)) {
                        break;
                    }
                }
                featureEntity = (FeatureEntity) obj;
            } else {
                featureEntity = null;
            }
            if (featureEntity != null) {
                str = featureEntity.getValue();
            }
            arrayList.add(FeatureEntity.copy$default(featureEntity2, null, null, null, null, null, null, null, null, str, 255, null));
        }
        return arrayList;
    }
}
