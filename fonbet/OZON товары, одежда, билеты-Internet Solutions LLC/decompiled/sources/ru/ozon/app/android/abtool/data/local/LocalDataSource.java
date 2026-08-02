package ru.ozon.app.android.abtool.data.local;

import Sc.r;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.data.local.dao.ExperimentDao;
import ru.ozon.app.android.abtool.data.local.dao.FeatureDao;
import ru.ozon.app.android.abtool.data.local.entity.ExperimentEntity;
import ru.ozon.app.android.abtool.data.local.entity.FeatureEntity;
import ru.ozon.app.android.abtool.data.model.UpdateStrategy;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0086@¢\u0006\u0004\b\u0017\u0010\fJ2\u0010\u001a\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\u0012H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010 \u001a\u00020\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\tH\u0086@¢\u0006\u0004\b \u0010\u001dJ \u0010#\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b%\u0010\u0011J\u0019\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\t0\b¢\u0006\u0004\b&\u0010'J+\u0010-\u001a\u0004\u0018\u00010\n2\u0006\u0010)\u001a\u00020\u000e2\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0*\"\u00020+¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/abtool/data/local/LocalDataSource;", "", "Lru/ozon/app/android/abtool/data/local/dao/FeatureDao;", "featureDao", "Lru/ozon/app/android/abtool/data/local/dao/ExperimentDao;", "experimentDao", "<init>", "(Lru/ozon/app/android/abtool/data/local/dao/FeatureDao;Lru/ozon/app/android/abtool/data/local/dao/ExperimentDao;)V", "LSc/r;", "", "Lru/ozon/app/android/abtool/data/local/entity/FeatureEntity;", "getAllFeatureEntity-IoAF18A", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "getAllFeatureEntity", "", SearchIntents.EXTRA_QUERY, "getFeaturesByQuery", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "featureDefaultsCache", "", "resetAllToDefaults", "(Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getFetchedFeatureEntity-IoAF18A", "getFetchedFeatureEntity", "featureEntities", "upsertWithUpdateValues", "(Ljava/util/List;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "insertFeatures", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/abtool/data/local/entity/ExperimentEntity;", "experimentEntities", "upsertExperimentEntity", "id", AppMeasurementSdk.ConditionalUserProperty.VALUE, "updateLocalValue", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "resetLocal", "getAbVariants-d1pmJ48", "()Ljava/lang/Object;", "getAbVariants", "featureId", "", "Lru/ozon/app/android/abtool/data/model/UpdateStrategy;", "strategy", "getFeatureByIdAndStrategySync", "(Ljava/lang/String;[Lru/ozon/app/android/abtool/data/model/UpdateStrategy;)Lru/ozon/app/android/abtool/data/local/entity/FeatureEntity;", "Lru/ozon/app/android/abtool/data/local/dao/FeatureDao;", "Lru/ozon/app/android/abtool/data/local/dao/ExperimentDao;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LocalDataSource {

    @NotNull
    private final ExperimentDao experimentDao;

    @NotNull
    private final FeatureDao featureDao;

    public LocalDataSource(@NotNull FeatureDao featureDao, @NotNull ExperimentDao experimentDao) {
        Intrinsics.checkNotNullParameter(featureDao, "featureDao");
        Intrinsics.checkNotNullParameter(experimentDao, "experimentDao");
        this.featureDao = featureDao;
        this.experimentDao = experimentDao;
    }

    @NotNull
    /* renamed from: getAbVariants-d1pmJ48, reason: not valid java name */
    public final Object m448getAbVariantsd1pmJ48() {
        try {
            r.Companion companion = r.INSTANCE;
            return this.experimentDao.getExperiments();
        } catch (Exception e11) {
            r.Companion companion2 = r.INSTANCE;
            return s.a(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* renamed from: getAllFeatureEntity-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m449getAllFeatureEntityIoAF18A(@NotNull d<? super r<? extends List<FeatureEntity>>> dVar) {
        LocalDataSource$getAllFeatureEntity$1 localDataSource$getAllFeatureEntity$1;
        int i11;
        try {
            if (dVar instanceof LocalDataSource$getAllFeatureEntity$1) {
                localDataSource$getAllFeatureEntity$1 = (LocalDataSource$getAllFeatureEntity$1) dVar;
                int i12 = localDataSource$getAllFeatureEntity$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    localDataSource$getAllFeatureEntity$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = localDataSource$getAllFeatureEntity$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = localDataSource$getAllFeatureEntity$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        r.Companion companion = r.INSTANCE;
                        FeatureDao featureDao = this.featureDao;
                        localDataSource$getAllFeatureEntity$1.label = 1;
                        obj = featureDao.getAll(localDataSource$getAllFeatureEntity$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    r.Companion companion2 = r.INSTANCE;
                    return obj;
                }
            }
            if (i11 != 0) {
            }
            r.Companion companion22 = r.INSTANCE;
            return obj;
        } catch (Exception e11) {
            r.Companion companion3 = r.INSTANCE;
            return s.a(e11);
        }
        localDataSource$getAllFeatureEntity$1 = new LocalDataSource$getAllFeatureEntity$1(this, dVar);
        Object obj2 = localDataSource$getAllFeatureEntity$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = localDataSource$getAllFeatureEntity$1.label;
    }

    public final FeatureEntity getFeatureByIdAndStrategySync(@NotNull String featureId, @NotNull UpdateStrategy... strategy) {
        Intrinsics.checkNotNullParameter(featureId, "featureId");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        return this.featureDao.getFeatureByIdAndStrategySync(featureId, strategy);
    }

    public final Object getFeaturesByQuery(@NotNull String str, @NotNull d<? super List<FeatureEntity>> dVar) {
        return this.featureDao.getFeaturesByQuery("%" + str + "%", dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* renamed from: getFetchedFeatureEntity-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m450getFetchedFeatureEntityIoAF18A(@NotNull d<? super r<? extends List<FeatureEntity>>> dVar) {
        LocalDataSource$getFetchedFeatureEntity$1 localDataSource$getFetchedFeatureEntity$1;
        int i11;
        try {
            if (dVar instanceof LocalDataSource$getFetchedFeatureEntity$1) {
                localDataSource$getFetchedFeatureEntity$1 = (LocalDataSource$getFetchedFeatureEntity$1) dVar;
                int i12 = localDataSource$getFetchedFeatureEntity$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    localDataSource$getFetchedFeatureEntity$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = localDataSource$getFetchedFeatureEntity$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = localDataSource$getFetchedFeatureEntity$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        r.Companion companion = r.INSTANCE;
                        FeatureDao featureDao = this.featureDao;
                        localDataSource$getFetchedFeatureEntity$1.label = 1;
                        obj = featureDao.getFetched(localDataSource$getFetchedFeatureEntity$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    r.Companion companion2 = r.INSTANCE;
                    return obj;
                }
            }
            if (i11 != 0) {
            }
            r.Companion companion22 = r.INSTANCE;
            return obj;
        } catch (Exception e11) {
            r.Companion companion3 = r.INSTANCE;
            return s.a(e11);
        }
        localDataSource$getFetchedFeatureEntity$1 = new LocalDataSource$getFetchedFeatureEntity$1(this, dVar);
        Object obj2 = localDataSource$getFetchedFeatureEntity$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = localDataSource$getFetchedFeatureEntity$1.label;
    }

    public final Object insertFeatures(@NotNull List<FeatureEntity> list, @NotNull d<? super Unit> dVar) {
        Object insert = this.featureDao.insert((List) list, (d<? super List<Long>>) dVar);
        return insert == a.COROUTINE_SUSPENDED ? insert : Unit.f71690a;
    }

    public final Object resetAllToDefaults(@NotNull Map<String, FeatureEntity> map, @NotNull d<? super Unit> dVar) {
        Object upsertWithUpdateValues = upsertWithUpdateValues(K.f71697a, map, dVar);
        return upsertWithUpdateValues == a.COROUTINE_SUSPENDED ? upsertWithUpdateValues : Unit.f71690a;
    }

    public final Object resetLocal(@NotNull String str, @NotNull d<? super Unit> dVar) {
        Object resetLocal = this.featureDao.resetLocal(str, dVar);
        return resetLocal == a.COROUTINE_SUSPENDED ? resetLocal : Unit.f71690a;
    }

    public final Object updateLocalValue(@NotNull String str, @NotNull String str2, @NotNull d<? super Unit> dVar) {
        Object updateLocalValue = this.featureDao.updateLocalValue(str, str2, dVar);
        return updateLocalValue == a.COROUTINE_SUSPENDED ? updateLocalValue : Unit.f71690a;
    }

    public final Object upsertExperimentEntity(@NotNull List<ExperimentEntity> list, @NotNull d<? super Unit> dVar) {
        Object upsert = this.experimentDao.upsert((List) list, dVar);
        return upsert == a.COROUTINE_SUSPENDED ? upsert : Unit.f71690a;
    }

    public final Object upsertWithUpdateValues(@NotNull List<FeatureEntity> list, @NotNull Map<String, FeatureEntity> map, @NotNull d<? super Unit> dVar) {
        Object insertFeatures = this.featureDao.insertFeatures(list, map, dVar);
        return insertFeatures == a.COROUTINE_SUSPENDED ? insertFeatures : Unit.f71690a;
    }
}
