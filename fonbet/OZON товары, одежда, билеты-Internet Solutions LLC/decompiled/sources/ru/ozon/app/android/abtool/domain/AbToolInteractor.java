package ru.ozon.app.android.abtool.domain;

import He.b;
import Ld0.d;
import Sc.InterfaceC4008j;
import Sc.k;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.abtool.AbToolNamespace;
import ru.ozon.app.android.abtool.FeatureServiceConfig;
import ru.ozon.app.android.abtool.data.local.LocalDataSource;
import ru.ozon.app.android.abtool.data.local.LocalDatabase;
import ru.ozon.app.android.abtool.data.mapper.ExperimentMapper;
import ru.ozon.app.android.abtool.data.network.AbTestApi;
import ru.ozon.app.android.abtool.data.network.RemoteDataSource;
import ru.ozon.app.android.abtool.data.repository.AbToggleRepository;
import ru.ozon.app.android.abtool.data.repository.AbVariantsDataSource;
import ru.ozon.app.android.abtool.data.repository.AbVariantsDataStoreRepository;
import ru.ozon.app.android.abtool.data.repository.AbVariantsRepository;
import ru.ozon.app.android.abtool.data.repository.FeatureRepository;
import xe.C10720e0;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010-R#\u0010\f\u001a\n 0*\u0004\u0018\u00010/0/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u00103R\u0017\u00104\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u00108\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u0016R\u0017\u0010;\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010\u0019R\u0017\u0010>\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\u001c¨\u0006A"}, d2 = {"Lru/ozon/app/android/abtool/domain/AbToolInteractor;", "", "Lru/ozon/app/android/abtool/FeatureServiceConfig;", "featureServiceConfig", "", "isNewApiEnabled", "LLd0/d;", "globalConfig", "Lru/ozon/app/android/abtool/AbToolNamespace;", "namespace", "LSc/j;", "Lretrofit2/Retrofit;", "retrofit", "isRepositoryEnabled", "isOverridesEnabled", "", "", "additionalServices", "<init>", "(Lru/ozon/app/android/abtool/FeatureServiceConfig;ZLLd0/d;Lru/ozon/app/android/abtool/AbToolNamespace;LSc/j;ZZLjava/util/Set;)V", "Lru/ozon/app/android/abtool/data/repository/AbVariantsRepository;", "createAbVariantsRepository", "()Lru/ozon/app/android/abtool/data/repository/AbVariantsRepository;", "Lru/ozon/app/android/abtool/data/repository/AbVariantsDataStoreRepository;", "createAbVariantsDataStoreRepository", "()Lru/ozon/app/android/abtool/data/repository/AbVariantsDataStoreRepository;", "Lru/ozon/app/android/abtool/data/repository/AbToggleRepository;", "createAbToggleRepository", "()Lru/ozon/app/android/abtool/data/repository/AbToggleRepository;", "Lru/ozon/app/android/abtool/data/repository/FeatureRepository;", "createFeatureRepository", "(Lru/ozon/app/android/abtool/FeatureServiceConfig;)Lru/ozon/app/android/abtool/data/repository/FeatureRepository;", "LLd0/d;", "Lru/ozon/app/android/abtool/AbToolNamespace;", "Z", "Ljava/util/Set;", "Lru/ozon/app/android/abtool/data/local/LocalDatabase;", "database$delegate", "LSc/j;", "getDatabase", "()Lru/ozon/app/android/abtool/data/local/LocalDatabase;", "database", "Lru/ozon/app/android/abtool/data/local/LocalDataSource;", "localDataSource$delegate", "getLocalDataSource", "()Lru/ozon/app/android/abtool/data/local/LocalDataSource;", "localDataSource", "Lru/ozon/app/android/abtool/data/network/AbTestApi;", "kotlin.jvm.PlatformType", "retrofit$delegate", "getRetrofit", "()Lru/ozon/app/android/abtool/data/network/AbTestApi;", "featureRepository", "Lru/ozon/app/android/abtool/data/repository/FeatureRepository;", "getFeatureRepository", "()Lru/ozon/app/android/abtool/data/repository/FeatureRepository;", "abVariantRepository", "Lru/ozon/app/android/abtool/data/repository/AbVariantsRepository;", "getAbVariantRepository", "abVariantDataStoreRepository", "Lru/ozon/app/android/abtool/data/repository/AbVariantsDataStoreRepository;", "getAbVariantDataStoreRepository", "abToggleRepository", "Lru/ozon/app/android/abtool/data/repository/AbToggleRepository;", "getAbToggleRepository", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AbToolInteractor {

    @NotNull
    private final AbToggleRepository abToggleRepository;

    @NotNull
    private final AbVariantsDataStoreRepository abVariantDataStoreRepository;

    @NotNull
    private final AbVariantsRepository abVariantRepository;

    @NotNull
    private final Set<String> additionalServices;

    /* renamed from: database$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j database;

    @NotNull
    private final FeatureRepository featureRepository;

    @NotNull
    private final d globalConfig;
    private final boolean isOverridesEnabled;
    private final boolean isRepositoryEnabled;

    /* renamed from: localDataSource$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j localDataSource;

    @NotNull
    private final AbToolNamespace namespace;

    /* renamed from: retrofit$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j retrofit;

    public AbToolInteractor(@NotNull FeatureServiceConfig featureServiceConfig, boolean z11, @NotNull d globalConfig, @NotNull AbToolNamespace namespace, @NotNull InterfaceC4008j<Retrofit> retrofit, boolean z12, boolean z13, @NotNull Set<String> additionalServices) {
        Intrinsics.checkNotNullParameter(featureServiceConfig, "featureServiceConfig");
        Intrinsics.checkNotNullParameter(globalConfig, "globalConfig");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(additionalServices, "additionalServices");
        this.globalConfig = globalConfig;
        this.namespace = namespace;
        this.isRepositoryEnabled = z12;
        this.isOverridesEnabled = z13;
        this.additionalServices = additionalServices;
        this.database = k.b(new AbToolInteractor$database$2(this));
        this.localDataSource = k.b(new AbToolInteractor$localDataSource$2(this));
        this.retrofit = k.b(new AbToolInteractor$retrofit$2(retrofit, z11));
        this.featureRepository = createFeatureRepository(featureServiceConfig);
        this.abVariantRepository = createAbVariantsRepository();
        this.abVariantDataStoreRepository = createAbVariantsDataStoreRepository();
        this.abToggleRepository = createAbToggleRepository();
    }

    private final AbToggleRepository createAbToggleRepository() {
        return new AbToggleRepository(getLocalDataSource(), this.featureRepository);
    }

    private final AbVariantsDataStoreRepository createAbVariantsDataStoreRepository() {
        return new AbVariantsDataStoreRepository(new AbVariantsDataSource(this.globalConfig.a()));
    }

    private final AbVariantsRepository createAbVariantsRepository() {
        LocalDataSource localDataSource = getLocalDataSource();
        C10720e0 c10720e0 = C10720e0.f105451a;
        return new AbVariantsRepository(localDataSource, b.f10879b, this.isRepositoryEnabled);
    }

    private final FeatureRepository createFeatureRepository(FeatureServiceConfig featureServiceConfig) {
        LocalDataSource localDataSource = getLocalDataSource();
        RemoteDataSource remoteDataSource = new RemoteDataSource(featureServiceConfig, k.b(new AbToolInteractor$createFeatureRepository$1(this)));
        ExperimentMapper experimentMapper = new ExperimentMapper();
        C10720e0 c10720e0 = C10720e0.f105451a;
        return new FeatureRepository(featureServiceConfig, localDataSource, remoteDataSource, experimentMapper, b.f10879b, this.isRepositoryEnabled, this.isOverridesEnabled, this.additionalServices);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocalDatabase getDatabase() {
        return (LocalDatabase) this.database.getValue();
    }

    private final LocalDataSource getLocalDataSource() {
        return (LocalDataSource) this.localDataSource.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbTestApi getRetrofit() {
        return (AbTestApi) this.retrofit.getValue();
    }

    @NotNull
    public final AbToggleRepository getAbToggleRepository() {
        return this.abToggleRepository;
    }

    @NotNull
    public final AbVariantsDataStoreRepository getAbVariantDataStoreRepository() {
        return this.abVariantDataStoreRepository;
    }

    @NotNull
    public final AbVariantsRepository getAbVariantRepository() {
        return this.abVariantRepository;
    }

    @NotNull
    public final FeatureRepository getFeatureRepository() {
        return this.featureRepository;
    }
}
