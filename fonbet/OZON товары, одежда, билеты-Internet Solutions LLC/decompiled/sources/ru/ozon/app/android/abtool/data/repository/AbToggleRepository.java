package ru.ozon.app.android.abtool.data.repository;

import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.data.local.LocalDataSource;
import ru.ozon.app.android.abtool.data.local.entity.FeatureEntity;
import xe.C10727i;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/abtool/data/repository/AbToggleRepository;", "", "Lru/ozon/app/android/abtool/data/local/LocalDataSource;", "localDataSource", "Lru/ozon/app/android/abtool/data/repository/FeatureRepository;", "featureRepository", "<init>", "(Lru/ozon/app/android/abtool/data/local/LocalDataSource;Lru/ozon/app/android/abtool/data/repository/FeatureRepository;)V", "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "updateByName", "(Ljava/lang/String;Ljava/lang/String;)V", SearchIntents.EXTRA_QUERY, "", "Lru/ozon/app/android/abtool/data/local/entity/FeatureEntity;", "getFeatures", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "id", "updateLocalValue", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "resetLocal", "Lru/ozon/app/android/abtool/data/local/LocalDataSource;", "Lru/ozon/app/android/abtool/data/repository/FeatureRepository;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AbToggleRepository {

    @NotNull
    private final FeatureRepository featureRepository;

    @NotNull
    private final LocalDataSource localDataSource;

    public AbToggleRepository(@NotNull LocalDataSource localDataSource, @NotNull FeatureRepository featureRepository) {
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(featureRepository, "featureRepository");
        this.localDataSource = localDataSource;
        this.featureRepository = featureRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getFeatures(@NotNull String str, @NotNull d<? super List<FeatureEntity>> dVar) {
        AbToggleRepository$getFeatures$1 abToggleRepository$getFeatures$1;
        int i11;
        try {
            if (dVar instanceof AbToggleRepository$getFeatures$1) {
                abToggleRepository$getFeatures$1 = (AbToggleRepository$getFeatures$1) dVar;
                int i12 = abToggleRepository$getFeatures$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    abToggleRepository$getFeatures$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = abToggleRepository$getFeatures$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = abToggleRepository$getFeatures$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        LocalDataSource localDataSource = this.localDataSource;
                        abToggleRepository$getFeatures$1.label = 1;
                        obj = localDataSource.getFeaturesByQuery(str, abToggleRepository$getFeatures$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    return (List) obj;
                }
            }
            if (i11 != 0) {
            }
            return (List) obj;
        } catch (Exception unused) {
            return K.f71697a;
        }
        abToggleRepository$getFeatures$1 = new AbToggleRepository$getFeatures$1(this, dVar);
        Object obj2 = abToggleRepository$getFeatures$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = abToggleRepository$getFeatures$1.label;
    }

    public final Object resetLocal(@NotNull String str, @NotNull d<? super Unit> dVar) {
        Object resetLocal = this.localDataSource.resetLocal(str, dVar);
        return resetLocal == a.COROUTINE_SUSPENDED ? resetLocal : Unit.f71690a;
    }

    public void updateByName(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        C10727i.d(g.f71771a, new AbToggleRepository$updateByName$1(this, name, value, null));
    }

    public final Object updateLocalValue(@NotNull String str, @NotNull String str2, @NotNull d<? super Unit> dVar) {
        Object updateFeatureCache = this.featureRepository.updateFeatureCache(str, str2, dVar);
        return updateFeatureCache == a.COROUTINE_SUSPENDED ? updateFeatureCache : Unit.f71690a;
    }
}
