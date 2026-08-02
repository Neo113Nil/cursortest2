package ru.ozon.app.android.abtool.data.local.dao;

import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.actions.SearchIntents;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.data.local.entity.FeatureEntity;
import ru.ozon.app.android.abtool.data.model.UpdateStrategy;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\b!\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H§@¢\u0006\u0004\b\f\u0010\u0007J \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\bH§@¢\u0006\u0004\b\u0012\u0010\u000bJ)\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\b2\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013H'¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u001a\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001bJ2\u0010\u001f\u001a\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0097@¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/abtool/data/local/dao/FeatureDao;", "Lru/ozon/app/android/abtool/data/local/dao/BaseDao;", "Lru/ozon/app/android/abtool/data/local/entity/FeatureEntity;", "<init>", "()V", "", "getAll", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", SearchIntents.EXTRA_QUERY, "getFeaturesByQuery", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getFetched", "id", "localValue", "", "updateLocalValue", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "resetLocal", "", "Lru/ozon/app/android/abtool/data/model/UpdateStrategy;", "strategy", "getFeatureByIdAndStrategySync", "(Ljava/lang/String;[Lru/ozon/app/android/abtool/data/model/UpdateStrategy;)Lru/ozon/app/android/abtool/data/local/entity/FeatureEntity;", "", "ids", "deleteIds", "(Ljava/util/Collection;Lkotlin/coroutines/d;)Ljava/lang/Object;", "featureEntities", "", "featureDefaultsCache", "insertFeatures", "(Ljava/util/List;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class FeatureDao extends BaseDao<FeatureEntity> {
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0099, code lost:
    
        if (r7 == r3) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0113 A[EDGE_INSN: B:52:0x0113->B:53:0x0113 BREAK  A[LOOP:1: B:30:0x00a8->B:42:0x00a8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object insertFeatures$suspendImpl(FeatureDao featureDao, List<FeatureEntity> list, Map<String, FeatureEntity> map, d<? super Unit> dVar) {
        FeatureDao$insertFeatures$1 featureDao$insertFeatures$1;
        a aVar;
        int i11;
        HashMap hashMap;
        Map<String, FeatureEntity> map2;
        Object all;
        ArrayList arrayList;
        Iterator it;
        FeatureDao featureDao2;
        HashMap hashMap2;
        Iterator it2;
        FeatureDao featureDao3 = featureDao;
        if (dVar instanceof FeatureDao$insertFeatures$1) {
            featureDao$insertFeatures$1 = (FeatureDao$insertFeatures$1) dVar;
            int i12 = featureDao$insertFeatures$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                featureDao$insertFeatures$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = featureDao$insertFeatures$1.result;
                aVar = a.COROUTINE_SUSPENDED;
                i11 = featureDao$insertFeatures$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    hashMap = new HashMap();
                    for (Object obj2 : list) {
                        hashMap.put(((FeatureEntity) obj2).getId(), obj2);
                    }
                    featureDao$insertFeatures$1.L$0 = featureDao3;
                    map2 = map;
                    featureDao$insertFeatures$1.L$1 = map2;
                    featureDao$insertFeatures$1.L$2 = hashMap;
                    featureDao$insertFeatures$1.label = 1;
                    all = featureDao3.getAll(featureDao$insertFeatures$1);
                } else {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            hashMap2 = (HashMap) featureDao$insertFeatures$1.L$1;
                            featureDao2 = (FeatureDao) featureDao$insertFeatures$1.L$0;
                            s.b(obj);
                            Collection values = hashMap2.values();
                            Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
                            it2 = values.iterator();
                            while (it2.hasNext()) {
                            }
                            return Unit.f71690a;
                        }
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it2 = (Iterator) featureDao$insertFeatures$1.L$1;
                        featureDao2 = (FeatureDao) featureDao$insertFeatures$1.L$0;
                        s.b(obj);
                        while (it2.hasNext()) {
                            FeatureEntity featureEntity = (FeatureEntity) it2.next();
                            Intrinsics.f(featureEntity);
                            featureDao$insertFeatures$1.L$0 = featureDao2;
                            featureDao$insertFeatures$1.L$1 = it2;
                            featureDao$insertFeatures$1.label = 3;
                            if (featureDao2.upsert((FeatureDao) featureEntity, (d<? super Unit>) featureDao$insertFeatures$1) == aVar) {
                                return aVar;
                            }
                        }
                        return Unit.f71690a;
                    }
                    HashMap hashMap3 = (HashMap) featureDao$insertFeatures$1.L$2;
                    Map<String, FeatureEntity> map3 = (Map) featureDao$insertFeatures$1.L$1;
                    FeatureDao featureDao4 = (FeatureDao) featureDao$insertFeatures$1.L$0;
                    s.b(obj);
                    hashMap = hashMap3;
                    featureDao3 = featureDao4;
                    all = obj;
                    map2 = map3;
                }
                arrayList = new ArrayList();
                it = ((List) all).iterator();
                while (true) {
                    if (it.hasNext()) {
                        break;
                    }
                    FeatureEntity featureEntity2 = (FeatureEntity) it.next();
                    String id2 = featureEntity2.getId();
                    FeatureEntity featureEntity3 = map2.get(id2);
                    FeatureEntity copy$default = featureEntity3 != null ? FeatureEntity.copy$default(featureEntity3, null, null, null, null, null, null, featureEntity2.getLocalValue(), null, null, 447, null) : null;
                    FeatureEntity featureEntity4 = (FeatureEntity) hashMap.get(id2);
                    if (featureEntity4 != null) {
                        if (copy$default != null) {
                            hashMap.put(id2, FeatureEntity.copy$default(featureEntity4, null, null, copy$default.getDisplayedName(), null, null, null, copy$default.getLocalValue(), copy$default.getUpdateStrategy(), null, 315, null));
                        }
                    } else if (copy$default == null) {
                        arrayList.add(id2);
                    } else {
                        hashMap.put(id2, copy$default);
                    }
                }
                featureDao$insertFeatures$1.L$0 = featureDao3;
                featureDao$insertFeatures$1.L$1 = hashMap;
                featureDao$insertFeatures$1.L$2 = null;
                featureDao$insertFeatures$1.label = 2;
                if (featureDao3.deleteIds(arrayList, featureDao$insertFeatures$1) != aVar) {
                    HashMap hashMap4 = hashMap;
                    featureDao2 = featureDao3;
                    hashMap2 = hashMap4;
                    Collection values2 = hashMap2.values();
                    Intrinsics.checkNotNullExpressionValue(values2, "<get-values>(...)");
                    it2 = values2.iterator();
                    while (it2.hasNext()) {
                    }
                    return Unit.f71690a;
                }
                return aVar;
            }
        }
        featureDao$insertFeatures$1 = new FeatureDao$insertFeatures$1(featureDao3, dVar);
        Object obj3 = featureDao$insertFeatures$1.result;
        aVar = a.COROUTINE_SUSPENDED;
        i11 = featureDao$insertFeatures$1.label;
        if (i11 != 0) {
        }
        arrayList = new ArrayList();
        it = ((List) all).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        featureDao$insertFeatures$1.L$0 = featureDao3;
        featureDao$insertFeatures$1.L$1 = hashMap;
        featureDao$insertFeatures$1.L$2 = null;
        featureDao$insertFeatures$1.label = 2;
        if (featureDao3.deleteIds(arrayList, featureDao$insertFeatures$1) != aVar) {
        }
        return aVar;
    }

    public abstract Object deleteIds(@NotNull Collection<String> collection, @NotNull d<? super Unit> dVar);

    public abstract Object getAll(@NotNull d<? super List<FeatureEntity>> dVar);

    public abstract FeatureEntity getFeatureByIdAndStrategySync(@NotNull String id2, @NotNull UpdateStrategy[] strategy);

    public abstract Object getFeaturesByQuery(@NotNull String str, @NotNull d<? super List<FeatureEntity>> dVar);

    public abstract Object getFetched(@NotNull d<? super List<FeatureEntity>> dVar);

    public Object insertFeatures(@NotNull List<FeatureEntity> list, @NotNull Map<String, FeatureEntity> map, @NotNull d<? super Unit> dVar) {
        return insertFeatures$suspendImpl(this, list, map, dVar);
    }

    public abstract Object resetLocal(@NotNull String str, @NotNull d<? super Unit> dVar);

    public abstract Object updateLocalValue(@NotNull String str, @NotNull String str2, @NotNull d<? super Unit> dVar);
}
