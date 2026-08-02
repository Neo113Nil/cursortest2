package ru.ozon.app.android.abtool;

import Ae.B0;
import Ld0.c;
import Ld0.f;
import Nd0.b;
import Sc.InterfaceC4008j;
import Sc.k;
import Wc.a;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.data.model.FeatureDTO;
import ru.ozon.app.android.abtool.di.ServiceLocator;
import ru.ozon.app.android.abtool.domain.FeatureDebugModel;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010!J%\u0010%\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0#H\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b)\u0010*J%\u0010+\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0#H\u0016¢\u0006\u0004\b+\u0010&J'\u0010.\u001a\u00020\t2\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b.\u0010/J\u001d\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b2\u00103J\u001d\u00105\u001a\b\u0012\u0004\u0012\u000204002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b5\u00103J)\u00109\u001a\u0004\u0018\u0001062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b7\u00108J(\u0010=\u001a\b\u0012\u0004\u0012\u000206002\u0006\u0010:\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0080@¢\u0006\u0004\b;\u0010<J\"\u0010@\u001a\u00020\t2\u0006\u0010>\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0080@¢\u0006\u0004\b?\u0010<J*\u0010C\u001a\u00020\t2\u0006\u0010>\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0080@¢\u0006\u0004\bA\u0010BR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010GR$\u0010H\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010N\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bN\u0010I\u001a\u0004\bO\u0010K\"\u0004\bP\u0010MR*\u0010Q\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\bQ\u0010I\u0012\u0004\bT\u0010\u000b\u001a\u0004\bR\u0010K\"\u0004\bS\u0010MR!\u0010Z\u001a\b\u0012\u0004\u0012\u00020\t0U8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001b\u0010_\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010W\u001a\u0004\b]\u0010^¨\u0006`"}, d2 = {"Lru/ozon/app/android/abtool/AbToolImpl;", "Lru/ozon/app/android/abtool/AbTool;", "Lru/ozon/app/android/abtool/AbToolLibsApi;", "Lru/ozon/app/android/abtool/FeatureServiceConfig;", "featureServiceConfig", "LLd0/c;", "store", "<init>", "(Lru/ozon/app/android/abtool/FeatureServiceConfig;LLd0/c;)V", "", "onInstantPluginsCreated", "()V", "fetch", "", "featureName", "serviceName", "Lru/ozon/app/android/abtool/AbToolNamespace;", "namespace", "", "getBoolean", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;)Z", "getString", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;)Ljava/lang/String;", "", "getInt", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;)I", "", "getLong", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;)J", "", "getFloat", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;)F", "isOzonQa", "()Z", "isOzonEmployee", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnChangeFeaturesListener", "(Lru/ozon/app/android/abtool/AbToolNamespace;Lkotlin/jvm/functions/Function0;)V", "LAe/B0;", "Lru/ozon/app/android/abtool/FetchStatus;", "getRemoteFetchingStatus", "(Lru/ozon/app/android/abtool/AbToolNamespace;)LAe/B0;", "removeOnChangeFeaturesListener", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "updateByName", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;)V", "", "Lru/ozon/app/android/abtool/Experiment;", "getExperiments", "(Lru/ozon/app/android/abtool/AbToolNamespace;)Ljava/util/List;", "Lru/ozon/app/android/abtool/FeatureFlag;", "getFeatureFlags", "Lru/ozon/app/android/abtool/domain/FeatureDebugModel;", "getFeatureUiState$abzone_release", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;)Lru/ozon/app/android/abtool/domain/FeatureDebugModel;", "getFeatureUiState", SearchIntents.EXTRA_QUERY, "getFeatureUiStates$abzone_release", "(Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getFeatureUiStates", "id", "resetLocal$abzone_release", "resetLocal", "updateLocalValue$abzone_release", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;Lkotlin/coroutines/d;)Ljava/lang/Object;", "updateLocalValue", "Lru/ozon/app/android/abtool/FeatureServiceConfig;", "getFeatureServiceConfig$abzone_release", "()Lru/ozon/app/android/abtool/FeatureServiceConfig;", "LLd0/c;", "abVariants", "Ljava/lang/String;", "getAbVariants", "()Ljava/lang/String;", "setAbVariants", "(Ljava/lang/String;)V", "abVariantsHeader", "getAbVariantsHeader", "setAbVariantsHeader", "libsAbVariants", "getLibsAbVariants", "setLibsAbVariants", "getLibsAbVariants$annotations", "LAe/h;", "abVariantsUpdatedFlow$delegate", "LSc/j;", "getAbVariantsUpdatedFlow", "()LAe/h;", "abVariantsUpdatedFlow", "Lru/ozon/app/android/abtool/AbToolManager;", "abToolManager$delegate", "getAbToolManager", "()Lru/ozon/app/android/abtool/AbToolManager;", "abToolManager", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AbToolImpl implements AbTool, AbToolLibsApi {

    /* renamed from: abToolManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j abToolManager;
    private String abVariants;
    private String abVariantsHeader;

    /* renamed from: abVariantsUpdatedFlow$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j abVariantsUpdatedFlow;

    @NotNull
    private final FeatureServiceConfig featureServiceConfig;
    private String libsAbVariants;

    @NotNull
    private final c store;

    public AbToolImpl(@NotNull FeatureServiceConfig featureServiceConfig, @NotNull c store) {
        Intrinsics.checkNotNullParameter(featureServiceConfig, "featureServiceConfig");
        Intrinsics.checkNotNullParameter(store, "store");
        this.featureServiceConfig = featureServiceConfig;
        this.store = store;
        this.abVariantsUpdatedFlow = k.b(new AbToolImpl$abVariantsUpdatedFlow$2(this));
        this.abToolManager = k.b(new AbToolImpl$abToolManager$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbToolManager getAbToolManager() {
        return (AbToolManager) this.abToolManager.getValue();
    }

    @Override // ru.ozon.app.android.abtool.AbToolBaseApi
    public void addOnChangeFeaturesListener(@NotNull AbToolNamespace namespace, @NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(listener, "listener");
        getAbToolManager().addOnChangeFeaturesListener(namespace, listener);
    }

    @Override // ru.ozon.app.android.abtool.AbToolBaseApi
    public void fetch() {
        getAbToolManager().fetch();
    }

    @Override // ru.ozon.app.android.abtool.AbToolBaseApi
    public boolean getBoolean(@NotNull String featureName, @NotNull String serviceName, @NotNull AbToolNamespace namespace) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        return getAbToolManager().getBoolean(featureName, serviceName, namespace);
    }

    @Override // ru.ozon.app.android.abtool.AbTool
    @NotNull
    public List<Experiment> getExperiments(@NotNull AbToolNamespace namespace) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        return (List) C10727i.d(g.f71771a, new AbToolImpl$getExperiments$1(this, namespace, null));
    }

    @Override // ru.ozon.app.android.abtool.AbTool
    @NotNull
    public List<FeatureFlag> getFeatureFlags(@NotNull AbToolNamespace namespace) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        return getAbToolManager().getFeatureFlags(namespace);
    }

    @NotNull
    /* renamed from: getFeatureServiceConfig$abzone_release, reason: from getter */
    public final FeatureServiceConfig getFeatureServiceConfig() {
        return this.featureServiceConfig;
    }

    public final FeatureDebugModel getFeatureUiState$abzone_release(@NotNull String featureName, @NotNull String serviceName, @NotNull AbToolNamespace namespace) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        return getAbToolManager().getFeature(featureName, serviceName, namespace);
    }

    public final Object getFeatureUiStates$abzone_release(@NotNull String str, @NotNull AbToolNamespace abToolNamespace, @NotNull d<? super List<FeatureDebugModel>> dVar) {
        return getAbToolManager().getFeatures(str, abToolNamespace, dVar);
    }

    @Override // ru.ozon.app.android.abtool.AbToolBaseApi
    public float getFloat(@NotNull String featureName, @NotNull String serviceName, @NotNull AbToolNamespace namespace) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        return getAbToolManager().getFloat(featureName, serviceName, namespace);
    }

    @Override // ru.ozon.app.android.abtool.AbToolBaseApi
    public int getInt(@NotNull String featureName, @NotNull String serviceName, @NotNull AbToolNamespace namespace) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        return getAbToolManager().getInt(featureName, serviceName, namespace);
    }

    @Override // ru.ozon.app.android.abtool.AbToolBaseApi
    public long getLong(@NotNull String featureName, @NotNull String serviceName, @NotNull AbToolNamespace namespace) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        return getAbToolManager().getLong(featureName, serviceName, namespace);
    }

    @Override // ru.ozon.app.android.abtool.AbToolBaseApi
    @NotNull
    public B0<FetchStatus> getRemoteFetchingStatus(@NotNull AbToolNamespace namespace) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        return getAbToolManager().getRemoteFetchingStatus(namespace);
    }

    @Override // ru.ozon.app.android.abtool.AbToolBaseApi
    @NotNull
    public String getString(@NotNull String featureName, @NotNull String serviceName, @NotNull AbToolNamespace namespace) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        return getAbToolManager().getString(featureName, serviceName, namespace);
    }

    @Override // ru.ozon.app.android.abtool.AbToolLibsApi
    public boolean isOzonEmployee() {
        return getAbToolManager().isOzonEmployee();
    }

    @Override // ru.ozon.app.android.abtool.AbToolLibsApi
    public boolean isOzonQa() {
        return getAbToolManager().isOzonQa();
    }

    @Override // Ld0.e
    public void onInstantPluginsCreated() {
        AbToolLogger.INSTANCE.init(this.store.c().b() == b.DEBUG);
        ServiceLocator serviceLocator = ServiceLocator.INSTANCE;
        FeatureServiceConfig featureServiceConfig = this.featureServiceConfig;
        Ld0.d c11 = this.store.c();
        List<f> f7 = this.store.f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : f7) {
            if (obj instanceof FeatureDTO) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet a11 = this.store.a().a();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : a11) {
            if (obj2 instanceof FeatureDTO) {
                arrayList2.add(obj2);
            }
        }
        serviceLocator.initialize(featureServiceConfig, c11, C7714v.p0(arrayList2, arrayList));
        getAbToolManager();
    }

    @Override // ru.ozon.app.android.abtool.AbToolBaseApi
    public void removeOnChangeFeaturesListener(@NotNull AbToolNamespace namespace, @NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(listener, "listener");
        getAbToolManager().removeOnChangeFeaturesListener(namespace, listener);
    }

    public final Object resetLocal$abzone_release(@NotNull String str, @NotNull AbToolNamespace abToolNamespace, @NotNull d<? super Unit> dVar) {
        Object resetLocal = getAbToolManager().resetLocal(str, abToolNamespace, dVar);
        return resetLocal == a.COROUTINE_SUSPENDED ? resetLocal : Unit.f71690a;
    }

    public void setAbVariants(String str) {
        this.abVariants = str;
    }

    public void setAbVariantsHeader(String str) {
        this.abVariantsHeader = str;
    }

    public void setLibsAbVariants(String str) {
        this.libsAbVariants = str;
    }

    @Override // ru.ozon.app.android.abtool.AbTool
    public void updateByName(@NotNull String name, @NotNull String value, @NotNull AbToolNamespace namespace) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        getAbToolManager().updateByName(name, value, namespace);
    }

    public final Object updateLocalValue$abzone_release(@NotNull String str, @NotNull String str2, @NotNull AbToolNamespace abToolNamespace, @NotNull d<? super Unit> dVar) {
        Object updateLocalValue = getAbToolManager().updateLocalValue(str, str2, abToolNamespace, dVar);
        return updateLocalValue == a.COROUTINE_SUSPENDED ? updateLocalValue : Unit.f71690a;
    }
}
