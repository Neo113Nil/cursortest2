package ru.ozon.app.android.abtool.data.repository;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.w0;
import N3.C3660k;
import Sc.r;
import Sc.s;
import Wc.a;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.AbToolLogger;
import ru.ozon.app.android.abtool.FeatureServiceConfig;
import ru.ozon.app.android.abtool.FetchStatus;
import ru.ozon.app.android.abtool.data.local.LocalDataSource;
import ru.ozon.app.android.abtool.data.local.entity.ExperimentEntity;
import ru.ozon.app.android.abtool.data.local.entity.FeatureEntity;
import ru.ozon.app.android.abtool.data.local.entity.FeatureEntityKt;
import ru.ozon.app.android.abtool.data.mapper.ExperimentMapper;
import ru.ozon.app.android.abtool.data.mapper.FeatureMapperKt;
import ru.ozon.app.android.abtool.data.model.UpdateStrategy;
import ru.ozon.app.android.abtool.data.model.ValueType;
import ru.ozon.app.android.abtool.data.network.ConfigsResponse;
import ru.ozon.app.android.abtool.data.network.RemoteDataSource;
import ru.ozon.app.android.abtool.domain.ConfigsEntity;
import ru.ozon.app.android.abtool.utils.CoroutineUtilsKt;
import xe.C10727i;
import xe.I;
import xe.M;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u001e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 w2\u00020\u0001:\u0001wBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b\u001b\u0010\u0016J\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0086@¢\u0006\u0004\b\u001e\u0010\u0016J\u001d\u0010!\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u00020+2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010¢\u0006\u0004\b,\u0010-J\u001b\u00100\u001a\u00020\u00182\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00180.¢\u0006\u0004\b0\u00101J\u001b\u00102\u001a\u00020\u00182\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00180.¢\u0006\u0004\b2\u00101J\r\u00103\u001a\u00020\u0018¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b5\u0010\u0016J \u00108\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b8\u00109J\u0015\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001d0:H\u0000¢\u0006\u0004\b;\u0010<J\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010>\u001a\u00020\u0010H\u0000¢\u0006\u0004\b?\u0010@J!\u0010D\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0010H\u0000¢\u0006\u0004\bB\u0010CJ\u0019\u0010D\u001a\u0004\u0018\u00010\u001d2\u0006\u00106\u001a\u00020\u0010H\u0002¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u0004\u0018\u00010\u001d2\u0006\u00106\u001a\u00020\u0010H\u0002¢\u0006\u0004\bF\u0010EJ \u0010I\u001a\u00020\u00182\u000e\u0010H\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010\u001cH\u0082@¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0018H\u0002¢\u0006\u0004\bK\u00104J'\u0010L\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0001H\u0002¢\u0006\u0004\bL\u0010MJ\u0019\u0010O\u001a\u00020\u00182\b\u0010N\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\bO\u0010PR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010Q\u001a\u0004\bR\u0010SR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010TR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010UR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010VR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010WR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010XR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010XR0\u0010[\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001d0Yj\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001d`Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R$\u0010_\u001a\u0012\u0012\u0004\u0012\u00020\u00100]j\b\u0012\u0004\u0012\u00020\u0010`^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R \u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001d0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR \u0010g\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001d0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010cR\u0016\u0010h\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010XR \u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180.0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020m0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u001d\u0010q\u001a\b\u0012\u0004\u0012\u00020m0p8\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u0018\u0010u\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010v¨\u0006x"}, d2 = {"Lru/ozon/app/android/abtool/data/repository/FeatureRepository;", "", "Lru/ozon/app/android/abtool/FeatureServiceConfig;", "featureServiceConfig", "Lru/ozon/app/android/abtool/data/local/LocalDataSource;", "localDataSource", "Lru/ozon/app/android/abtool/data/network/RemoteDataSource;", "remoteDataSource", "Lru/ozon/app/android/abtool/data/mapper/ExperimentMapper;", "experimentMapper", "Lxe/I;", "ioDispatcher", "", "isRepositoryEnabled", "isOverridesEnabled", "", "", "additionalServices", "<init>", "(Lru/ozon/app/android/abtool/FeatureServiceConfig;Lru/ozon/app/android/abtool/data/local/LocalDataSource;Lru/ozon/app/android/abtool/data/network/RemoteDataSource;Lru/ozon/app/android/abtool/data/mapper/ExperimentMapper;Lxe/I;ZZLjava/util/Set;)V", "Lru/ozon/app/android/abtool/domain/ConfigsEntity;", "fetch", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "configs", "", "updateCache", "(Lru/ozon/app/android/abtool/domain/ConfigsEntity;Lkotlin/coroutines/d;)Ljava/lang/Object;", "fetchAndUpdateCache", "", "Lru/ozon/app/android/abtool/data/local/entity/FeatureEntity;", "getCachedFeatures", "featureName", "serviceName", "getBoolean", "(Ljava/lang/String;Ljava/lang/String;)Z", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "getInt", "(Ljava/lang/String;Ljava/lang/String;)I", "", "getLong", "(Ljava/lang/String;Ljava/lang/String;)J", "", "getFloat", "(Ljava/lang/String;Ljava/lang/String;)F", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnChangeFeaturesListener", "(Lkotlin/jvm/functions/Function0;)V", "removeOnChangeFeaturesListener", "onFeatureChanged", "()V", "resetAllToDefaults", "featureId", AppMeasurementSdk.ConditionalUserProperty.VALUE, "updateFeatureCache", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "getFeatureFlags$abzone_release", "()Ljava/util/Collection;", "getFeatureFlags", AppMeasurementSdk.ConditionalUserProperty.NAME, "getFeaturesByName$abzone_release", "(Ljava/lang/String;)Ljava/util/List;", "getFeaturesByName", "getFeature$abzone_release", "(Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/abtool/data/local/entity/FeatureEntity;", "getFeature", "(Ljava/lang/String;)Lru/ozon/app/android/abtool/data/local/entity/FeatureEntity;", "getFeatureFromDb", "Lru/ozon/app/android/abtool/data/local/entity/ExperimentEntity;", "experiments", "updateExperiments", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "fillPerProcessFlags", "logFlag", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "intervalMs", "refreshWithInterval", "(Ljava/lang/Long;)V", "Lru/ozon/app/android/abtool/FeatureServiceConfig;", "getFeatureServiceConfig", "()Lru/ozon/app/android/abtool/FeatureServiceConfig;", "Lru/ozon/app/android/abtool/data/local/LocalDataSource;", "Lru/ozon/app/android/abtool/data/network/RemoteDataSource;", "Lru/ozon/app/android/abtool/data/mapper/ExperimentMapper;", "Lxe/I;", "Z", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "featureDefaultsCache", "Ljava/util/HashMap;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "supportedServices", "Ljava/util/HashSet;", "Ljava/util/concurrent/ConcurrentHashMap;", "featuresCache", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isFiltered", "Ljava/util/concurrent/atomic/AtomicBoolean;", "perProcessFlags", "isChangedFromRemote", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onChangeFeaturesListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "LAe/w0;", "Lru/ozon/app/android/abtool/FetchStatus;", "_remoteFetchingStatus", "LAe/w0;", "LAe/B0;", "remoteFetchingStatus", "LAe/B0;", "getRemoteFetchingStatus", "()LAe/B0;", "lastRemoteRequestTime", "Ljava/lang/Long;", "Companion", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FeatureRepository {

    @NotNull
    private final w0<FetchStatus> _remoteFetchingStatus;

    @NotNull
    private final ExperimentMapper experimentMapper;

    @NotNull
    private final HashMap<String, FeatureEntity> featureDefaultsCache;

    @NotNull
    private final FeatureServiceConfig featureServiceConfig;

    @NotNull
    private final ConcurrentHashMap<String, FeatureEntity> featuresCache;

    @NotNull
    private final I ioDispatcher;
    private volatile boolean isChangedFromRemote;

    @NotNull
    private final AtomicBoolean isFiltered;
    private final boolean isOverridesEnabled;
    private final boolean isRepositoryEnabled;
    private volatile Long lastRemoteRequestTime;

    @NotNull
    private final LocalDataSource localDataSource;

    @NotNull
    private final CopyOnWriteArrayList<Function0<Unit>> onChangeFeaturesListeners;

    @NotNull
    private final ConcurrentHashMap<String, FeatureEntity> perProcessFlags;

    @NotNull
    private final RemoteDataSource remoteDataSource;

    @NotNull
    private final B0<FetchStatus> remoteFetchingStatus;

    @NotNull
    private final HashSet<String> supportedServices;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.abtool.data.repository.FeatureRepository$2", f = "FeatureRepository.kt", l = {105, 122}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.abtool.data.repository.FeatureRepository$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ List<FeatureEntity> $featureEntities;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(List<FeatureEntity> list, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$featureEntities = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return FeatureRepository.this.new AnonymousClass2(this.$featureEntities, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
        
            if (r1.insertFeatures(r8, r7) == r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0032, code lost:
        
            if (r8 == r0) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object m449getAllFeatureEntityIoAF18A;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                LocalDataSource localDataSource = FeatureRepository.this.localDataSource;
                this.label = 1;
                m449getAllFeatureEntityIoAF18A = localDataSource.m449getAllFeatureEntityIoAF18A(this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
                m449getAllFeatureEntityIoAF18A = ((r) obj).getF26106a();
            }
            FeatureRepository featureRepository = FeatureRepository.this;
            r.Companion companion = r.INSTANCE;
            if (!(m449getAllFeatureEntityIoAF18A instanceof r.b)) {
                for (FeatureEntity featureEntity : (List) m449getAllFeatureEntityIoAF18A) {
                    featureRepository.featuresCache.put(featureEntity.getId(), featureEntity);
                }
            }
            ArrayList arrayList = new ArrayList();
            List<FeatureEntity> list = this.$featureEntities;
            FeatureRepository featureRepository2 = FeatureRepository.this;
            for (FeatureEntity featureEntity2 : list) {
                if (!featureRepository2.featuresCache.containsKey(featureEntity2.getId())) {
                    arrayList.add(featureEntity2);
                    featureRepository2.featuresCache.put(featureEntity2.getId(), featureEntity2);
                }
            }
            if (!arrayList.isEmpty()) {
                LocalDataSource localDataSource2 = FeatureRepository.this.localDataSource;
                this.label = 2;
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    public FeatureRepository(@NotNull FeatureServiceConfig featureServiceConfig, @NotNull LocalDataSource localDataSource, @NotNull RemoteDataSource remoteDataSource, @NotNull ExperimentMapper experimentMapper, @NotNull I ioDispatcher, boolean z11, boolean z12, @NotNull Set<String> additionalServices) {
        Intrinsics.checkNotNullParameter(featureServiceConfig, "featureServiceConfig");
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(experimentMapper, "experimentMapper");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(additionalServices, "additionalServices");
        this.featureServiceConfig = featureServiceConfig;
        this.localDataSource = localDataSource;
        this.remoteDataSource = remoteDataSource;
        this.experimentMapper = experimentMapper;
        this.ioDispatcher = ioDispatcher;
        this.isRepositoryEnabled = z11;
        this.isOverridesEnabled = z12;
        this.featureDefaultsCache = new HashMap<>();
        this.supportedServices = C7714v.S0(additionalServices);
        this.featuresCache = new ConcurrentHashMap<>();
        this.isFiltered = new AtomicBoolean(false);
        this.perProcessFlags = new ConcurrentHashMap<>();
        this.onChangeFeaturesListeners = new CopyOnWriteArrayList<>();
        C0 b11 = E0.b(1, 0, EnumC11113a.DROP_OLDEST, 2);
        b11.tryEmit(new FetchStatus.None());
        this._remoteFetchingStatus = b11;
        this.remoteFetchingStatus = C2399j.a(b11);
        List<FeatureEntity> featureDTOToEntities = FeatureMapperKt.featureDTOToEntities(featureServiceConfig.getFeatures());
        for (FeatureEntity featureEntity : featureDTOToEntities) {
            if (!featureEntity.isDeleted()) {
                this.supportedServices.add(featureEntity.getServiceName());
                this.featureDefaultsCache.put(featureEntity.getId(), featureEntity);
            }
        }
        C10727i.c(CoroutineUtilsKt.getCoroutineScope(), this.ioDispatcher, null, new AnonymousClass2(featureDTOToEntities, null), 2);
        refreshWithInterval(this.featureServiceConfig.getRefreshIntervalMs());
    }

    private final void fillPerProcessFlags() {
        if (!this.isFiltered.getAndSet(true)) {
            for (Map.Entry<String, FeatureEntity> entry : this.featuresCache.entrySet()) {
                String key = entry.getKey();
                FeatureEntity value = entry.getValue();
                if (value.isPerProcess()) {
                    this.perProcessFlags.put(key, value);
                }
            }
        }
        this.featuresCache.putAll(this.perProcessFlags);
    }

    private final FeatureEntity getFeature(String featureId) {
        boolean z11 = this.isRepositoryEnabled;
        if (z11) {
            FeatureEntity featureEntity = this.featuresCache.get(featureId);
            if (featureEntity != null) {
                AbToolLogger.INSTANCE.log(FeatureEntityKt.logFlagSourceFromCache(featureEntity));
                return featureEntity;
            }
            FeatureEntity featureFromDb = getFeatureFromDb(featureId);
            if (featureFromDb != null) {
                AbToolLogger.INSTANCE.log(FeatureEntityKt.logFlagSourceFromDb(featureFromDb));
                return featureFromDb;
            }
            FeatureEntity featureEntity2 = this.featureDefaultsCache.get(featureId);
            if (featureEntity2 == null) {
                return null;
            }
            AbToolLogger.INSTANCE.log(FeatureEntityKt.logFlagSourceFromDefaults(featureEntity2));
            return featureEntity2;
        }
        if (z11 || !this.isOverridesEnabled) {
            FeatureEntity featureEntity3 = this.featureDefaultsCache.get(featureId);
            if (featureEntity3 == null) {
                return null;
            }
            AbToolLogger.INSTANCE.log(FeatureEntityKt.logFlagSourceFromDefaults(featureEntity3));
            return featureEntity3;
        }
        FeatureEntity featureFromDb2 = getFeatureFromDb(featureId);
        if (featureFromDb2 != null) {
            if (featureFromDb2.getOverrideValue() == null) {
                featureFromDb2 = null;
            }
            if (featureFromDb2 != null) {
                AbToolLogger.INSTANCE.log(FeatureEntityKt.logFlagSourceFromDb(featureFromDb2));
                return featureFromDb2;
            }
        }
        FeatureEntity featureEntity4 = this.featureDefaultsCache.get(featureId);
        if (featureEntity4 == null) {
            return null;
        }
        AbToolLogger.INSTANCE.log(FeatureEntityKt.logFlagSourceFromDefaults(featureEntity4));
        return featureEntity4;
    }

    private final FeatureEntity getFeatureFromDb(String featureId) {
        FeatureEntity featureByIdAndStrategySync = this.localDataSource.getFeatureByIdAndStrategySync(featureId, UpdateStrategy.PER_PROCESS, UpdateStrategy.AS_FETCHED);
        if (featureByIdAndStrategySync == null) {
            return null;
        }
        this.featuresCache.put(featureByIdAndStrategySync.getId(), featureByIdAndStrategySync);
        return featureByIdAndStrategySync;
    }

    private final void logFlag(String featureName, String serviceName, Object value) {
        AbToolLogger abToolLogger = AbToolLogger.INSTANCE;
        StringBuilder d11 = C3660k.d("feature flag with serviceName: ", serviceName, " and featureName: ", featureName, " was called. The value is ");
        d11.append(value);
        abToolLogger.log(d11.toString());
    }

    private final void refreshWithInterval(final Long intervalMs) {
        ProcessLifecycleOwner processLifecycleOwner;
        if (intervalMs != null) {
            final kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
            int i11 = ProcessLifecycleOwner.f43231j;
            processLifecycleOwner = ProcessLifecycleOwner.f43230i;
            processLifecycleOwner.getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.abtool.data.repository.FeatureRepository$refreshWithInterval$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onPause(J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    xe.B0 b02 = m11.f71787a;
                    if (b02 != null) {
                        b02.j(null);
                    }
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [T, xe.B0] */
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onResume(J owner) {
                    I i12;
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    xe.B0 b02 = m11.f71787a;
                    if (b02 != null) {
                        b02.j(null);
                    }
                    kotlin.jvm.internal.M<xe.B0> m12 = m11;
                    M coroutineScope = CoroutineUtilsKt.getCoroutineScope();
                    i12 = this.ioDispatcher;
                    m12.f71787a = C10727i.c(coroutineScope, i12, null, new FeatureRepository$refreshWithInterval$1$onResume$1(this, intervalMs, null), 2);
                }
            });
        }
    }

    private final Object updateExperiments(List<ExperimentEntity> list, d<? super Unit> dVar) {
        Object upsertExperimentEntity;
        return (list == null || (upsertExperimentEntity = this.localDataSource.upsertExperimentEntity(list, dVar)) != a.COROUTINE_SUSPENDED) ? Unit.f71690a : upsertExperimentEntity;
    }

    public final void addOnChangeFeaturesListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.isChangedFromRemote) {
            listener.invoke();
        }
        this.onChangeFeaturesListeners.add(listener);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetch(@NotNull d<? super ConfigsEntity> dVar) {
        FeatureRepository$fetch$1 featureRepository$fetch$1;
        int i11;
        Object m451getConfigsgIAlus;
        FeatureRepository featureRepository;
        Throwable b11;
        if (dVar instanceof FeatureRepository$fetch$1) {
            featureRepository$fetch$1 = (FeatureRepository$fetch$1) dVar;
            int i12 = featureRepository$fetch$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                featureRepository$fetch$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = featureRepository$fetch$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = featureRepository$fetch$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    if (!this.isRepositoryEnabled) {
                        return null;
                    }
                    this.lastRemoteRequestTime = new Long(System.currentTimeMillis());
                    RemoteDataSource remoteDataSource = this.remoteDataSource;
                    List<String> U02 = C7714v.U0(this.supportedServices);
                    featureRepository$fetch$1.L$0 = this;
                    featureRepository$fetch$1.label = 1;
                    m451getConfigsgIAlus = remoteDataSource.m451getConfigsgIAlus(U02, featureRepository$fetch$1);
                    if (m451getConfigsgIAlus == aVar) {
                        return aVar;
                    }
                    featureRepository = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    featureRepository = (FeatureRepository) featureRepository$fetch$1.L$0;
                    s.b(obj);
                    m451getConfigsgIAlus = ((r) obj).getF26106a();
                }
                b11 = r.b(m451getConfigsgIAlus);
                if (b11 == null) {
                    featureRepository._remoteFetchingStatus.tryEmit(new FetchStatus.Error(b11));
                    AbToolLogger.logError$default(AbToolLogger.INSTANCE, b11, null, 2, null);
                    return null;
                }
                ConfigsResponse configsResponse = (ConfigsResponse) m451getConfigsgIAlus;
                featureRepository.fillPerProcessFlags();
                List<FeatureEntity> configsToEntities = FeatureMapperKt.configsToEntities(configsResponse.getConfigs());
                List<ConfigsResponse.Experiment> experiment = configsResponse.getExperiment();
                return new ConfigsEntity(configsToEntities, experiment != null ? featureRepository.experimentMapper.mapConfigExperiments(experiment) : null);
            }
        }
        featureRepository$fetch$1 = new FeatureRepository$fetch$1(this, dVar);
        Object obj2 = featureRepository$fetch$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = featureRepository$fetch$1.label;
        if (i11 != 0) {
        }
        b11 = r.b(m451getConfigsgIAlus);
        if (b11 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r2.updateCache(r6, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAndUpdateCache(@NotNull d<? super Unit> dVar) {
        FeatureRepository$fetchAndUpdateCache$1 featureRepository$fetchAndUpdateCache$1;
        int i11;
        FeatureRepository featureRepository;
        ConfigsEntity configsEntity;
        if (dVar instanceof FeatureRepository$fetchAndUpdateCache$1) {
            featureRepository$fetchAndUpdateCache$1 = (FeatureRepository$fetchAndUpdateCache$1) dVar;
            int i12 = featureRepository$fetchAndUpdateCache$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                featureRepository$fetchAndUpdateCache$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = featureRepository$fetchAndUpdateCache$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = featureRepository$fetchAndUpdateCache$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    featureRepository$fetchAndUpdateCache$1.L$0 = this;
                    featureRepository$fetchAndUpdateCache$1.label = 1;
                    obj = fetch(featureRepository$fetchAndUpdateCache$1);
                    if (obj != aVar) {
                        featureRepository = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                featureRepository = (FeatureRepository) featureRepository$fetchAndUpdateCache$1.L$0;
                s.b(obj);
                configsEntity = (ConfigsEntity) obj;
                if (configsEntity != null) {
                    featureRepository$fetchAndUpdateCache$1.L$0 = null;
                    featureRepository$fetchAndUpdateCache$1.label = 2;
                }
                return Unit.f71690a;
            }
        }
        featureRepository$fetchAndUpdateCache$1 = new FeatureRepository$fetchAndUpdateCache$1(this, dVar);
        Object obj2 = featureRepository$fetchAndUpdateCache$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = featureRepository$fetchAndUpdateCache$1.label;
        if (i11 != 0) {
        }
        configsEntity = (ConfigsEntity) obj2;
        if (configsEntity != null) {
        }
        return Unit.f71690a;
    }

    public final boolean getBoolean(@NotNull String featureName, @NotNull String serviceName) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        FeatureEntity feature$abzone_release = getFeature$abzone_release(serviceName, featureName);
        if (feature$abzone_release == null || feature$abzone_release.getValueType() != ValueType.BOOLEAN) {
            AbToolLogger.INSTANCE.log(V.e.a("Requested value featureName = ", featureName, ", serviceName = ", serviceName, " cannot be found or not a boolean"));
            return false;
        }
        boolean parseBoolean = Boolean.parseBoolean(feature$abzone_release.getFeatureValue(this.isOverridesEnabled));
        logFlag(featureName, serviceName, Boolean.valueOf(parseBoolean));
        return parseBoolean;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCachedFeatures(@NotNull d<? super List<FeatureEntity>> dVar) {
        FeatureRepository$getCachedFeatures$1 featureRepository$getCachedFeatures$1;
        int i11;
        Object m449getAllFeatureEntityIoAF18A;
        if (dVar instanceof FeatureRepository$getCachedFeatures$1) {
            featureRepository$getCachedFeatures$1 = (FeatureRepository$getCachedFeatures$1) dVar;
            int i12 = featureRepository$getCachedFeatures$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                featureRepository$getCachedFeatures$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = featureRepository$getCachedFeatures$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = featureRepository$getCachedFeatures$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    LocalDataSource localDataSource = this.localDataSource;
                    featureRepository$getCachedFeatures$1.label = 1;
                    m449getAllFeatureEntityIoAF18A = localDataSource.m449getAllFeatureEntityIoAF18A(featureRepository$getCachedFeatures$1);
                    if (m449getAllFeatureEntityIoAF18A == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    m449getAllFeatureEntityIoAF18A = ((r) obj).getF26106a();
                }
                r.Companion companion = r.INSTANCE;
                if (m449getAllFeatureEntityIoAF18A instanceof r.b) {
                    return m449getAllFeatureEntityIoAF18A;
                }
                return null;
            }
        }
        featureRepository$getCachedFeatures$1 = new FeatureRepository$getCachedFeatures$1(this, dVar);
        Object obj2 = featureRepository$getCachedFeatures$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = featureRepository$getCachedFeatures$1.label;
        if (i11 != 0) {
        }
        r.Companion companion2 = r.INSTANCE;
        if (m449getAllFeatureEntityIoAF18A instanceof r.b) {
        }
    }

    public final FeatureEntity getFeature$abzone_release(@NotNull String serviceName, @NotNull String featureName) {
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        return getFeature(serviceName + featureName);
    }

    @NotNull
    public final Collection<FeatureEntity> getFeatureFlags$abzone_release() {
        Collection<FeatureEntity> values = this.featuresCache.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        return values;
    }

    @NotNull
    public final List<FeatureEntity> getFeaturesByName$abzone_release(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Collection<FeatureEntity> values = this.featuresCache.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (Intrinsics.d(((FeatureEntity) obj).getName(), name)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final float getFloat(@NotNull String featureName, @NotNull String serviceName) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        FeatureEntity feature$abzone_release = getFeature$abzone_release(serviceName, featureName);
        if (feature$abzone_release == null || feature$abzone_release.getValueType() != ValueType.FLOAT) {
            AbToolLogger.INSTANCE.log(V.e.a("Requested value cannot be found featureName = ", featureName, ", serviceName = ", serviceName, " or not a float"));
            return -1.0f;
        }
        float parseFloat = Float.parseFloat(feature$abzone_release.getFeatureValue(this.isOverridesEnabled));
        logFlag(featureName, serviceName, Float.valueOf(parseFloat));
        return parseFloat;
    }

    public final int getInt(@NotNull String featureName, @NotNull String serviceName) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        FeatureEntity feature$abzone_release = getFeature$abzone_release(serviceName, featureName);
        if (feature$abzone_release == null || feature$abzone_release.getValueType() != ValueType.INT) {
            AbToolLogger.INSTANCE.log(V.e.a("Requested value cannot be found featureName = ", featureName, ", serviceName = ", serviceName, " or not an int"));
            return -1;
        }
        int parseInt = Integer.parseInt(feature$abzone_release.getFeatureValue(this.isOverridesEnabled));
        logFlag(featureName, serviceName, Integer.valueOf(parseInt));
        return parseInt;
    }

    public final long getLong(@NotNull String featureName, @NotNull String serviceName) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        FeatureEntity feature$abzone_release = getFeature$abzone_release(serviceName, featureName);
        if (feature$abzone_release == null || feature$abzone_release.getValueType() != ValueType.LONG) {
            AbToolLogger.INSTANCE.log(V.e.a("Requested value cannot be found featureName = ", featureName, ", serviceName = ", serviceName, " or not a long"));
            return -1L;
        }
        long parseLong = Long.parseLong(feature$abzone_release.getFeatureValue(this.isOverridesEnabled));
        logFlag(featureName, serviceName, Long.valueOf(parseLong));
        return parseLong;
    }

    @NotNull
    public final B0<FetchStatus> getRemoteFetchingStatus() {
        return this.remoteFetchingStatus;
    }

    @NotNull
    public final String getString(@NotNull String featureName, @NotNull String serviceName) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        FeatureEntity feature$abzone_release = getFeature$abzone_release(serviceName, featureName);
        if (feature$abzone_release == null || feature$abzone_release.getValueType() != ValueType.STRING) {
            AbToolLogger.INSTANCE.log(V.e.a("Requested value featureName = ", featureName, ", serviceName = ", serviceName, " cannot be found or not a string"));
            return "";
        }
        String featureValue = feature$abzone_release.getFeatureValue(this.isOverridesEnabled);
        logFlag(featureName, serviceName, featureValue);
        return featureValue;
    }

    public final void onFeatureChanged() {
        this._remoteFetchingStatus.tryEmit(new FetchStatus.Succeed());
        Iterator<Function0<Unit>> it = this.onChangeFeaturesListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().invoke();
        }
    }

    public final void removeOnChangeFeaturesListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onChangeFeaturesListeners.remove(listener);
    }

    public final Object resetAllToDefaults(@NotNull d<? super Unit> dVar) {
        Object resetAllToDefaults = this.localDataSource.resetAllToDefaults(this.featureDefaultsCache, dVar);
        return resetAllToDefaults == a.COROUTINE_SUSPENDED ? resetAllToDefaults : Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d0, code lost:
    
        if (r2.updateExperiments(r9, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0079, code lost:
    
        if (r10 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateCache(@NotNull ConfigsEntity configsEntity, @NotNull d<? super Unit> dVar) {
        FeatureRepository$updateCache$1 featureRepository$updateCache$1;
        int i11;
        FeatureRepository featureRepository;
        Object m450getFetchedFeatureEntityIoAF18A;
        if (dVar instanceof FeatureRepository$updateCache$1) {
            featureRepository$updateCache$1 = (FeatureRepository$updateCache$1) dVar;
            int i12 = featureRepository$updateCache$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                featureRepository$updateCache$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = featureRepository$updateCache$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = featureRepository$updateCache$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    LocalDataSource localDataSource = this.localDataSource;
                    List<FeatureEntity> features = configsEntity.getFeatures();
                    HashMap<String, FeatureEntity> hashMap = this.featureDefaultsCache;
                    featureRepository$updateCache$1.L$0 = this;
                    featureRepository$updateCache$1.L$1 = configsEntity;
                    featureRepository$updateCache$1.label = 1;
                    if (localDataSource.upsertWithUpdateValues(features, hashMap, featureRepository$updateCache$1) != aVar) {
                        featureRepository = this;
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    configsEntity = (ConfigsEntity) featureRepository$updateCache$1.L$1;
                    featureRepository = (FeatureRepository) featureRepository$updateCache$1.L$0;
                    s.b(obj);
                } else {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    configsEntity = (ConfigsEntity) featureRepository$updateCache$1.L$1;
                    featureRepository = (FeatureRepository) featureRepository$updateCache$1.L$0;
                    s.b(obj);
                    m450getFetchedFeatureEntityIoAF18A = ((r) obj).getF26106a();
                    r.Companion companion = r.INSTANCE;
                    if (!(m450getFetchedFeatureEntityIoAF18A instanceof r.b)) {
                        for (FeatureEntity featureEntity : (List) m450getFetchedFeatureEntityIoAF18A) {
                            FeatureEntity featureEntity2 = featureRepository.featuresCache.get(featureEntity.getId());
                            if (featureEntity2 == null) {
                                featureRepository.featuresCache.put(featureEntity.getId(), featureEntity);
                            } else if (!featureEntity2.equals(featureEntity)) {
                                featureRepository.featuresCache.put(featureEntity.getId(), featureEntity);
                            }
                        }
                    }
                    featureRepository.isChangedFromRemote = true;
                    featureRepository.onFeatureChanged();
                    List<ExperimentEntity> experiments = configsEntity.getExperiments();
                    featureRepository$updateCache$1.L$0 = null;
                    featureRepository$updateCache$1.L$1 = null;
                    featureRepository$updateCache$1.label = 3;
                }
                LocalDataSource localDataSource2 = featureRepository.localDataSource;
                featureRepository$updateCache$1.L$0 = featureRepository;
                featureRepository$updateCache$1.L$1 = configsEntity;
                featureRepository$updateCache$1.label = 2;
                m450getFetchedFeatureEntityIoAF18A = localDataSource2.m450getFetchedFeatureEntityIoAF18A(featureRepository$updateCache$1);
            }
        }
        featureRepository$updateCache$1 = new FeatureRepository$updateCache$1(this, dVar);
        Object obj2 = featureRepository$updateCache$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = featureRepository$updateCache$1.label;
        if (i11 != 0) {
        }
        LocalDataSource localDataSource22 = featureRepository.localDataSource;
        featureRepository$updateCache$1.L$0 = featureRepository;
        featureRepository$updateCache$1.L$1 = configsEntity;
        featureRepository$updateCache$1.label = 2;
        m450getFetchedFeatureEntityIoAF18A = localDataSource22.m450getFetchedFeatureEntityIoAF18A(featureRepository$updateCache$1);
    }

    public final Object updateFeatureCache(@NotNull String str, @NotNull String str2, @NotNull d<? super Unit> dVar) {
        FeatureEntity feature = getFeature(str);
        if (feature != null && !feature.isPerProcess()) {
            this.featuresCache.put(str, FeatureEntity.copy$default(feature, null, null, null, null, null, null, str2, null, null, 447, null));
        }
        Object updateLocalValue = this.localDataSource.updateLocalValue(str, str2, dVar);
        return updateLocalValue == a.COROUTINE_SUSPENDED ? updateLocalValue : Unit.f71690a;
    }
}
