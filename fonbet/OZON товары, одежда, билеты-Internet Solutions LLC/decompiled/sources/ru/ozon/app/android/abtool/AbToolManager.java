package ru.ozon.app.android.abtool;

import Ae.B0;
import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import He.b;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import Sc.s;
import Wc.a;
import android.content.SharedPreferences;
import androidx.lifecycle.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.AbToolManager$observerHostExperiments$2;
import ru.ozon.app.android.abtool.AbToolManager$observerLibsExperiments$2;
import ru.ozon.app.android.abtool.data.local.entity.FeatureEntity;
import ru.ozon.app.android.abtool.data.model.FeatureDTO;
import ru.ozon.app.android.abtool.data.repository.AbToggleRepository;
import ru.ozon.app.android.abtool.data.repository.FeatureRepository;
import ru.ozon.app.android.abtool.di.ServiceLocator;
import ru.ozon.app.android.abtool.domain.AbToolInteractor;
import ru.ozon.app.android.abtool.domain.ConfigsEntity;
import ru.ozon.app.android.abtool.domain.DefaultLibsFeatures;
import ru.ozon.app.android.abtool.domain.FeatureDebugModel;
import ru.ozon.app.android.abtool.domain.FeatureDebugModelKt;
import ru.ozon.app.android.abtool.utils.AbVariantUtils;
import ru.ozon.app.android.abtool.utils.CoroutineUtilsKt;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\b*\u0002V[\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0012¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010!J#\u0010%\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060#¢\u0006\u0004\b%\u0010&J\u001b\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b)\u0010*J#\u0010+\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060#¢\u0006\u0004\b+\u0010&J%\u0010.\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b.\u0010/J\u001b\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b2\u00103J\u001b\u00105\u001a\b\u0012\u0004\u0012\u000204002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b5\u00103J \u00107\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b7\u00108J(\u00109\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b9\u0010:J&\u0010=\u001a\b\u0012\u0004\u0012\u00020<002\u0006\u0010;\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b=\u00108J'\u0010>\u001a\u0004\u0018\u00010<2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0006H\u0082@¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0006H\u0002¢\u0006\u0004\bB\u0010\rJ\u0013\u0010D\u001a\u00020C*\u00020CH\u0002¢\u0006\u0004\bD\u0010EJ\u0013\u0010G\u001a\u00020F*\u00020\u0010H\u0002¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010IR\u0014\u0010J\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010KR!\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00050M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR!\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00050M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010O\u001a\u0004\bT\u0010QR\u001b\u0010Z\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010O\u001a\u0004\bX\u0010YR\u001b\u0010_\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010O\u001a\u0004\b]\u0010^R'\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050a0`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010O\u001a\u0004\bc\u0010dR!\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00060`8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bf\u0010O\u001a\u0004\bg\u0010d¨\u0006i"}, d2 = {"Lru/ozon/app/android/abtool/AbToolManager;", "", "Lru/ozon/app/android/abtool/FeatureServiceConfig;", "config", "Lkotlin/Function1;", "", "", "onHostAbVariantsChanged", "onLibsAbVariantsChanged", "onAbVariantsHeaderChanged", "<init>", "(Lru/ozon/app/android/abtool/FeatureServiceConfig;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "fetch", "()V", "featureName", "serviceName", "Lru/ozon/app/android/abtool/AbToolNamespace;", "namespace", "", "getBoolean", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;)Z", "getString", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;)Ljava/lang/String;", "", "getInt", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;)I", "", "getLong", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;)J", "", "getFloat", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;)F", "isOzonQa", "()Z", "isOzonEmployee", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnChangeFeaturesListener", "(Lru/ozon/app/android/abtool/AbToolNamespace;Lkotlin/jvm/functions/Function0;)V", "LAe/B0;", "Lru/ozon/app/android/abtool/FetchStatus;", "getRemoteFetchingStatus", "(Lru/ozon/app/android/abtool/AbToolNamespace;)LAe/B0;", "removeOnChangeFeaturesListener", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "updateByName", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;)V", "", "Lru/ozon/app/android/abtool/Experiment;", "getExperiments", "(Lru/ozon/app/android/abtool/AbToolNamespace;)Ljava/util/List;", "Lru/ozon/app/android/abtool/FeatureFlag;", "getFeatureFlags", "id", "resetLocal", "(Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;Lkotlin/coroutines/d;)Ljava/lang/Object;", "updateLocalValue", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;Lkotlin/coroutines/d;)Ljava/lang/Object;", SearchIntents.EXTRA_QUERY, "Lru/ozon/app/android/abtool/domain/FeatureDebugModel;", "getFeatures", "getFeature", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;)Lru/ozon/app/android/abtool/domain/FeatureDebugModel;", "fetchInternal", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "updateAbToolsGNCFeaturePrefsValue", "Lru/ozon/app/android/abtool/domain/ConfigsEntity;", "removeOverrides", "(Lru/ozon/app/android/abtool/domain/ConfigsEntity;)Lru/ozon/app/android/abtool/domain/ConfigsEntity;", "Lru/ozon/app/android/abtool/domain/AbToolInteractor;", "getInteractor", "(Lru/ozon/app/android/abtool/AbToolNamespace;)Lru/ozon/app/android/abtool/domain/AbToolInteractor;", "Lru/ozon/app/android/abtool/FeatureServiceConfig;", "abToolHostInteractor", "Lru/ozon/app/android/abtool/domain/AbToolInteractor;", "abToolLibsInteractor", "Landroidx/lifecycle/P;", "experimentsHostLiveData$delegate", "LSc/j;", "getExperimentsHostLiveData", "()Landroidx/lifecycle/P;", "experimentsHostLiveData", "experimentsLibsLiveData$delegate", "getExperimentsLibsLiveData", "experimentsLibsLiveData", "ru/ozon/app/android/abtool/AbToolManager$observerHostExperiments$2$1", "observerHostExperiments$delegate", "getObserverHostExperiments", "()Lru/ozon/app/android/abtool/AbToolManager$observerHostExperiments$2$1;", "observerHostExperiments", "ru/ozon/app/android/abtool/AbToolManager$observerLibsExperiments$2$1", "observerLibsExperiments$delegate", "getObserverLibsExperiments", "()Lru/ozon/app/android/abtool/AbToolManager$observerLibsExperiments$2$1;", "observerLibsExperiments", "LAe/h;", "", "abVariantsHeaderFlow$delegate", "getAbVariantsHeaderFlow", "()LAe/h;", "abVariantsHeaderFlow", "abVariantsUpdatedFlow$delegate", "getAbVariantsUpdatedFlow", "abVariantsUpdatedFlow", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AbToolManager {

    @NotNull
    private final AbToolInteractor abToolHostInteractor;

    @NotNull
    private final AbToolInteractor abToolLibsInteractor;

    /* renamed from: abVariantsHeaderFlow$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j abVariantsHeaderFlow;

    /* renamed from: abVariantsUpdatedFlow$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j abVariantsUpdatedFlow;

    @NotNull
    private final FeatureServiceConfig config;

    /* renamed from: experimentsHostLiveData$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j experimentsHostLiveData;

    /* renamed from: experimentsLibsLiveData$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j experimentsLibsLiveData;

    /* renamed from: observerHostExperiments$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j observerHostExperiments;

    /* renamed from: observerLibsExperiments$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j observerLibsExperiments;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.abtool.AbToolManager$1", f = "AbToolManager.kt", l = {87}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.abtool.AbToolManager$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ Function1<String, Unit> $onAbVariantsHeaderChanged;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super String, Unit> function1, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$onAbVariantsHeaderChanged = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return AbToolManager.this.new AnonymousClass1(this.$onAbVariantsHeaderChanged, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC2395h o11 = C2399j.o(AbToolManager.this.getAbVariantsHeaderFlow());
                final Function1<String, Unit> function1 = this.$onAbVariantsHeaderChanged;
                InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.abtool.AbToolManager.1.1
                    @Override // Ae.InterfaceC2397i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((Set<String>) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(Set<String> set, d<? super Unit> dVar) {
                        function1.invoke(AbVariantUtils.INSTANCE.toVariantsHeader(set));
                        return Unit.f71690a;
                    }
                };
                this.label = 1;
                if (o11.collect(interfaceC2397i, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.abtool.AbToolManager$2", f = "AbToolManager.kt", l = {91, 95}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.abtool.AbToolManager$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return AbToolManager.this.new AnonymousClass2(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
        
            if (r5.resetAllToDefaults(r4) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
        
            if (r5.fetchInternal(r4) == r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                if (AbToolManager.this.config.getFetchFromRemoteOnInit()) {
                    AbToolManager abToolManager = AbToolManager.this;
                    this.label = 1;
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            if (!AbToolManager.this.config.getIsPlatformNamespaceEnabled() && !AbToolManager.this.config.getIsPlatformOverridesEnabled()) {
                FeatureRepository featureRepository = AbToolManager.this.abToolLibsInteractor.getFeatureRepository();
                this.label = 2;
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbToolNamespace.values().length];
            try {
                iArr[AbToolNamespace.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbToolNamespace.PLATFORM_MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AbToolManager(@NotNull FeatureServiceConfig config, @NotNull Function1<? super String, Unit> onHostAbVariantsChanged, @NotNull Function1<? super String, Unit> onLibsAbVariantsChanged, @NotNull Function1<? super String, Unit> onAbVariantsHeaderChanged) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(onHostAbVariantsChanged, "onHostAbVariantsChanged");
        Intrinsics.checkNotNullParameter(onLibsAbVariantsChanged, "onLibsAbVariantsChanged");
        Intrinsics.checkNotNullParameter(onAbVariantsHeaderChanged, "onAbVariantsHeaderChanged");
        this.config = config;
        ServiceLocator serviceLocator = ServiceLocator.INSTANCE;
        this.abToolHostInteractor = serviceLocator.getAbToolHostInteractor();
        this.abToolLibsInteractor = serviceLocator.getAbToolLibsInteractor();
        this.experimentsHostLiveData = k.b(new AbToolManager$experimentsHostLiveData$2(this));
        this.experimentsLibsLiveData = k.b(new AbToolManager$experimentsLibsLiveData$2(this));
        this.observerHostExperiments = k.b(new AbToolManager$observerHostExperiments$2(onHostAbVariantsChanged, this));
        this.observerLibsExperiments = k.b(new AbToolManager$observerLibsExperiments$2(onLibsAbVariantsChanged, this));
        this.abVariantsHeaderFlow = k.b(new AbToolManager$abVariantsHeaderFlow$2(this));
        this.abVariantsUpdatedFlow = k.b(new AbToolManager$abVariantsUpdatedFlow$2(this));
        getExperimentsHostLiveData().observeForever(getObserverHostExperiments());
        getExperimentsLibsLiveData().observeForever(getObserverLibsExperiments());
        C10727i.c(CoroutineUtilsKt.getCoroutineScope(), null, null, new AnonymousClass1(onAbVariantsHeaderChanged, null), 3);
        C10727i.c(CoroutineUtilsKt.getCoroutineScope(), null, null, new AnonymousClass2(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchInternal(d<? super Unit> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new AbToolManager$fetchInternal$2(this, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC2395h<Set<String>> getAbVariantsHeaderFlow() {
        return (InterfaceC2395h) this.abVariantsHeaderFlow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final P<String> getExperimentsHostLiveData() {
        return (P) this.experimentsHostLiveData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final P<String> getExperimentsLibsLiveData() {
        return (P) this.experimentsLibsLiveData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbToolInteractor getInteractor(AbToolNamespace abToolNamespace) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[abToolNamespace.ordinal()];
        if (i11 == 1) {
            return this.abToolHostInteractor;
        }
        if (i11 == 2) {
            return this.abToolLibsInteractor;
        }
        throw new o();
    }

    private final AbToolManager$observerHostExperiments$2.AnonymousClass1 getObserverHostExperiments() {
        return (AbToolManager$observerHostExperiments$2.AnonymousClass1) this.observerHostExperiments.getValue();
    }

    private final AbToolManager$observerLibsExperiments$2.AnonymousClass1 getObserverLibsExperiments() {
        return (AbToolManager$observerLibsExperiments$2.AnonymousClass1) this.observerLibsExperiments.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConfigsEntity removeOverrides(ConfigsEntity configsEntity) {
        List<FeatureEntity> features = configsEntity.getFeatures();
        ArrayList arrayList = new ArrayList();
        for (Object obj : features) {
            if (!Intrinsics.d(((FeatureEntity) obj).getServiceName(), "platform_mobile_overrides")) {
                arrayList.add(obj);
            }
        }
        return configsEntity.copy(arrayList, configsEntity.getExperiments());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAbToolsGNCFeaturePrefsValue() {
        DefaultLibsFeatures defaultLibsFeatures = DefaultLibsFeatures.INSTANCE;
        boolean z11 = getBoolean(defaultLibsFeatures.getAbToolsGNCServiceNamePair$abzone_release().f(), defaultLibsFeatures.getAbToolsGNCServiceNamePair$abzone_release().e(), AbToolNamespace.PLATFORM_MOBILE);
        SharedPreferences sharedPrefs$abzone_release = ServiceLocator.INSTANCE.getSharedPrefs$abzone_release();
        Intrinsics.checkNotNullExpressionValue(sharedPrefs$abzone_release, "<get-sharedPrefs>(...)");
        SharedPreferences.Editor edit = sharedPrefs$abzone_release.edit();
        edit.putBoolean("is_ab_tools_gnc_enabled_key", z11);
        edit.apply();
    }

    public final void addOnChangeFeaturesListener(@NotNull AbToolNamespace namespace, @NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(listener, "listener");
        getInteractor(namespace).getFeatureRepository().addOnChangeFeaturesListener(listener);
    }

    public final void fetch() {
        C10727i.c(CoroutineUtilsKt.getCoroutineScope(), null, null, new AbToolManager$fetch$1(this, null), 3);
    }

    @NotNull
    public final InterfaceC2395h<Unit> getAbVariantsUpdatedFlow() {
        return (InterfaceC2395h) this.abVariantsUpdatedFlow.getValue();
    }

    public final boolean getBoolean(@NotNull String featureName, @NotNull String serviceName, @NotNull AbToolNamespace namespace) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        return getInteractor(namespace).getFeatureRepository().getBoolean(featureName, serviceName);
    }

    @NotNull
    public final List<Experiment> getExperiments(@NotNull AbToolNamespace namespace) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        return (List) C10727i.d(g.f71771a, new AbToolManager$getExperiments$1(this, namespace, null));
    }

    public final FeatureDebugModel getFeature(@NotNull String featureName, @NotNull String serviceName, @NotNull AbToolNamespace namespace) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        FeatureEntity feature$abzone_release = getInteractor(namespace).getFeatureRepository().getFeature$abzone_release(serviceName, featureName);
        if (feature$abzone_release != null) {
            return FeatureDebugModelKt.toFeature(feature$abzone_release);
        }
        return null;
    }

    @NotNull
    public final List<FeatureFlag> getFeatureFlags(@NotNull AbToolNamespace namespace) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Collection<FeatureEntity> featureFlags$abzone_release = getInteractor(namespace).getFeatureRepository().getFeatureFlags$abzone_release();
        ArrayList arrayList = new ArrayList(C7714v.z(featureFlags$abzone_release, 10));
        for (FeatureEntity featureEntity : featureFlags$abzone_release) {
            arrayList.add(new FeatureFlag(featureEntity.getServiceName(), featureEntity.getName(), featureEntity.getValue(), featureEntity.getLocalValue(), featureEntity.getUpdateStrategy().name()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[LOOP:0: B:11:0x0054->B:13:0x005a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getFeatures(@NotNull String str, @NotNull AbToolNamespace abToolNamespace, @NotNull d<? super List<FeatureDebugModel>> dVar) {
        AbToolManager$getFeatures$1 abToolManager$getFeatures$1;
        int i11;
        Iterator it;
        if (dVar instanceof AbToolManager$getFeatures$1) {
            abToolManager$getFeatures$1 = (AbToolManager$getFeatures$1) dVar;
            int i12 = abToolManager$getFeatures$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                abToolManager$getFeatures$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = abToolManager$getFeatures$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = abToolManager$getFeatures$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    AbToggleRepository abToggleRepository = getInteractor(abToolNamespace).getAbToggleRepository();
                    abToolManager$getFeatures$1.label = 1;
                    obj = abToggleRepository.getFeatures(str, abToolManager$getFeatures$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(C7714v.z(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(FeatureDebugModelKt.toFeature((FeatureEntity) it.next()));
                }
                return arrayList;
            }
        }
        abToolManager$getFeatures$1 = new AbToolManager$getFeatures$1(this, dVar);
        Object obj2 = abToolManager$getFeatures$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = abToolManager$getFeatures$1.label;
        if (i11 != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(C7714v.z(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    public final float getFloat(@NotNull String featureName, @NotNull String serviceName, @NotNull AbToolNamespace namespace) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        return getInteractor(namespace).getFeatureRepository().getFloat(featureName, serviceName);
    }

    public final int getInt(@NotNull String featureName, @NotNull String serviceName, @NotNull AbToolNamespace namespace) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        return getInteractor(namespace).getFeatureRepository().getInt(featureName, serviceName);
    }

    public final long getLong(@NotNull String featureName, @NotNull String serviceName, @NotNull AbToolNamespace namespace) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        return getInteractor(namespace).getFeatureRepository().getLong(featureName, serviceName);
    }

    @NotNull
    public final B0<FetchStatus> getRemoteFetchingStatus(@NotNull AbToolNamespace namespace) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        return getInteractor(namespace).getFeatureRepository().getRemoteFetchingStatus();
    }

    @NotNull
    public final String getString(@NotNull String featureName, @NotNull String serviceName, @NotNull AbToolNamespace namespace) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        return getInteractor(namespace).getFeatureRepository().getString(featureName, serviceName);
    }

    public final boolean isOzonEmployee() {
        FeatureDTO isOzonEmployee = DefaultLibsFeatures.INSTANCE.isOzonEmployee();
        return this.abToolLibsInteractor.getFeatureRepository().getBoolean(isOzonEmployee.getName(), isOzonEmployee.getServiceName());
    }

    public final boolean isOzonQa() {
        FeatureDTO isOzonQa = DefaultLibsFeatures.INSTANCE.isOzonQa();
        return this.abToolLibsInteractor.getFeatureRepository().getBoolean(isOzonQa.getName(), isOzonQa.getServiceName());
    }

    public final void removeOnChangeFeaturesListener(@NotNull AbToolNamespace namespace, @NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(listener, "listener");
        getInteractor(namespace).getFeatureRepository().removeOnChangeFeaturesListener(listener);
    }

    public final Object resetLocal(@NotNull String str, @NotNull AbToolNamespace abToolNamespace, @NotNull d<? super Unit> dVar) {
        Object resetLocal = getInteractor(abToolNamespace).getAbToggleRepository().resetLocal(str, dVar);
        return resetLocal == a.COROUTINE_SUSPENDED ? resetLocal : Unit.f71690a;
    }

    public final void updateByName(@NotNull String name, @NotNull String value, @NotNull AbToolNamespace namespace) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        getInteractor(namespace).getAbToggleRepository().updateByName(name, value);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateLocalValue(@NotNull String str, @NotNull String str2, @NotNull AbToolNamespace abToolNamespace, @NotNull d<? super Unit> dVar) {
        AbToolManager$updateLocalValue$1 abToolManager$updateLocalValue$1;
        int i11;
        AbToolInteractor abToolInteractor;
        if (dVar instanceof AbToolManager$updateLocalValue$1) {
            abToolManager$updateLocalValue$1 = (AbToolManager$updateLocalValue$1) dVar;
            int i12 = abToolManager$updateLocalValue$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                abToolManager$updateLocalValue$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = abToolManager$updateLocalValue$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = abToolManager$updateLocalValue$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    AbToolInteractor interactor = getInteractor(abToolNamespace);
                    AbToggleRepository abToggleRepository = interactor.getAbToggleRepository();
                    abToolManager$updateLocalValue$1.L$0 = interactor;
                    abToolManager$updateLocalValue$1.label = 1;
                    if (abToggleRepository.updateLocalValue(str, str2, abToolManager$updateLocalValue$1) == aVar) {
                        return aVar;
                    }
                    abToolInteractor = interactor;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abToolInteractor = (AbToolInteractor) abToolManager$updateLocalValue$1.L$0;
                    s.b(obj);
                }
                abToolInteractor.getFeatureRepository().onFeatureChanged();
                return Unit.f71690a;
            }
        }
        abToolManager$updateLocalValue$1 = new AbToolManager$updateLocalValue$1(this, dVar);
        Object obj2 = abToolManager$updateLocalValue$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = abToolManager$updateLocalValue$1.label;
        if (i11 != 0) {
        }
        abToolInteractor.getFeatureRepository().onFeatureChanged();
        return Unit.f71690a;
    }
}
