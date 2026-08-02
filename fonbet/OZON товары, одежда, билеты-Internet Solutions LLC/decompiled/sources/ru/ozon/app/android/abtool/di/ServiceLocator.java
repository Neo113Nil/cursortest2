package ru.ozon.app.android.abtool.di;

import Fb0.e;
import Ld0.d;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Tc.j;
import We.B;
import We.E;
import We.InterfaceC4875q;
import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import com.squareup.moshi.Moshi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.i;
import pf0.l;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import ru.ozon.app.android.abtool.AbToolNamespace;
import ru.ozon.app.android.abtool.FeatureServiceConfig;
import ru.ozon.app.android.abtool.data.model.FeatureDTO;
import ru.ozon.app.android.abtool.data.network.serialize.AdditionalParametersAdapterFactory;
import ru.ozon.app.android.abtool.data.network.serialize.NumberMoshiAdapterFactory;
import ru.ozon.app.android.abtool.domain.AbToolConfigFeatures;
import ru.ozon.app.android.abtool.domain.AbToolInteractor;
import ru.ozon.app.android.abtool.domain.DefaultLibsFeatures;
import xb0.InterfaceC10697b;

@InterfaceC3999a
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020!¢\u0006\u0004\b$\u0010#J\u000f\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b&\u0010'R\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R#\u00103\u001a\n .*\u0004\u0018\u00010-0-8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u00104R\u0016\u00105\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00106R\u001b\u0010\u0016\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b9\u0010:R\u001b\u0010>\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00100\u001a\u0004\b<\u0010=R\u0014\u0010\u0018\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010?¨\u0006@"}, d2 = {"Lru/ozon/app/android/abtool/di/ServiceLocator;", "", "<init>", "()V", "Lru/ozon/app/android/abtool/FeatureServiceConfig;", "featureServiceConfig", "", "Lru/ozon/app/android/abtool/data/model/FeatureDTO;", "defaultFeatures", "modifyHostFeatureServiceConfig", "(Lru/ozon/app/android/abtool/FeatureServiceConfig;Ljava/util/List;)Lru/ozon/app/android/abtool/FeatureServiceConfig;", "libsFeatures", "createLibsFeatureConfig", "Lxb0/b;", "ozonIdApi", "LWe/E;", "createOkHttpClient", "(Lxb0/b;)LWe/E;", "Lretrofit2/converter/moshi/MoshiConverterFactory;", "moshiConverterFactory", "okHttpClient", "Lpf0/i;", "ozonNetworkConfig", "", "isAbToolsGNCFeatureFlagEnabled", "Lretrofit2/Retrofit;", "createRetrofit", "(Lru/ozon/app/android/abtool/FeatureServiceConfig;Lretrofit2/converter/moshi/MoshiConverterFactory;LWe/E;Lpf0/i;Z)Lretrofit2/Retrofit;", "LLd0/d;", "globalConfig", "", "initialize", "(Lru/ozon/app/android/abtool/FeatureServiceConfig;LLd0/d;Ljava/util/List;)V", "Lru/ozon/app/android/abtool/domain/AbToolInteractor;", "getAbToolHostInteractor", "()Lru/ozon/app/android/abtool/domain/AbToolInteractor;", "getAbToolLibsInteractor", "Lcom/squareup/moshi/Moshi;", "createMoshi", "()Lcom/squareup/moshi/Moshi;", "Lru/ozon/app/android/abtool/FeatureServiceConfig;", "getFeatureServiceConfig$abzone_release", "()Lru/ozon/app/android/abtool/FeatureServiceConfig;", "setFeatureServiceConfig$abzone_release", "(Lru/ozon/app/android/abtool/FeatureServiceConfig;)V", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "sharedPrefs$delegate", "LSc/j;", "getSharedPrefs$abzone_release", "()Landroid/content/SharedPreferences;", "sharedPrefs", "LLd0/d;", "abToolHostInteractor", "Lru/ozon/app/android/abtool/domain/AbToolInteractor;", "abToolLibsInteractor", "ozonNetworkConfig$delegate", "getOzonNetworkConfig", "()Lpf0/i;", "retrofit$delegate", "getRetrofit", "()Lretrofit2/Retrofit;", "retrofit", "()Z", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ServiceLocator {
    private static AbToolInteractor abToolHostInteractor;
    private static AbToolInteractor abToolLibsInteractor;

    @SuppressLint({"StaticFieldLeak"})
    public static FeatureServiceConfig featureServiceConfig;
    private static d globalConfig;

    @NotNull
    public static final ServiceLocator INSTANCE = new ServiceLocator();

    /* renamed from: sharedPrefs$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j sharedPrefs = k.b(ServiceLocator$sharedPrefs$2.INSTANCE);

    /* renamed from: ozonNetworkConfig$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j ozonNetworkConfig = k.a(n.SYNCHRONIZED, ServiceLocator$ozonNetworkConfig$2.INSTANCE);

    /* renamed from: retrofit$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j retrofit = k.b(ServiceLocator$retrofit$2.INSTANCE);

    private ServiceLocator() {
    }

    private final FeatureServiceConfig createLibsFeatureConfig(FeatureServiceConfig featureServiceConfig2, List<FeatureDTO> libsFeatures) {
        e appDomain = featureServiceConfig2.getAppDomain();
        List U02 = C7714v.U0(C7714v.Y0(C7714v.p0(DefaultLibsFeatures.INSTANCE.getDefaultFeatures(), libsFeatures)));
        Collection<B> interceptors = featureServiceConfig2.getInterceptors();
        Collection<B> networkInterceptors = featureServiceConfig2.getNetworkInterceptors();
        boolean debug = featureServiceConfig2.getDebug();
        InterfaceC4875q cookieJar = featureServiceConfig2.getCookieJar();
        Long refreshIntervalMs = featureServiceConfig2.getRefreshIntervalMs();
        featureServiceConfig2.getAdditionalParametersProvider();
        return new FeatureServiceConfig(appDomain, "platform_mobile", U02, interceptors, networkInterceptors, debug, cookieJar, refreshIntervalMs, null, featureServiceConfig2.getFeatureServicePriority(), featureServiceConfig2.getFetchFromRemoteOnInit(), false, false, 6144, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E createOkHttpClient(InterfaceC10697b ozonIdApi) {
        InterfaceC4875q cookieJar;
        List<B> interceptors = ozonIdApi != null ? ozonIdApi.getInterceptors() : null;
        if (interceptors == null) {
            interceptors = K.f71697a;
        }
        ArrayList p02 = C7714v.p0(getFeatureServiceConfig$abzone_release().getInterceptors(), interceptors);
        Collection<B> networkInterceptors = getFeatureServiceConfig$abzone_release().getNetworkInterceptors();
        if (networkInterceptors == null) {
            networkInterceptors = K.f71697a;
        }
        List<B> networkInterceptors2 = ozonIdApi != null ? ozonIdApi.getNetworkInterceptors() : null;
        if (networkInterceptors2 == null) {
            networkInterceptors2 = K.f71697a;
        }
        ArrayList p03 = C7714v.p0(networkInterceptors2, networkInterceptors);
        if (ozonIdApi == null || (cookieJar = ozonIdApi.getCookieJar()) == null) {
            cookieJar = getFeatureServiceConfig$abzone_release().getCookieJar();
        }
        E.a aVar = new E.a();
        aVar.X(60L, TimeUnit.SECONDS);
        Iterator it = p02.iterator();
        while (it.hasNext()) {
            aVar.a((B) it.next());
        }
        Iterator it2 = p03.iterator();
        while (it2.hasNext()) {
            aVar.b((B) it2.next());
        }
        if (cookieJar != null) {
            aVar.h(cookieJar);
        }
        return new E(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Retrofit createRetrofit(FeatureServiceConfig featureServiceConfig2, MoshiConverterFactory moshiConverterFactory, E okHttpClient, i ozonNetworkConfig2, boolean isAbToolsGNCFeatureFlagEnabled) {
        l ozonNetworkApi;
        Retrofit j11;
        Retrofit.Builder builder = null;
        if (isAbToolsGNCFeatureFlagEnabled && (ozonNetworkApi = DiStoreWrapper.INSTANCE.getOzonNetworkApi()) != null && (j11 = ozonNetworkApi.j(ozonNetworkConfig2)) != null) {
            builder = j11.newBuilder();
        }
        if (builder == null) {
            builder = new Retrofit.Builder().baseUrl(featureServiceConfig2.getAppDomain().e()).client(okHttpClient);
        }
        Retrofit build = builder.addConverterFactory(moshiConverterFactory).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i getOzonNetworkConfig() {
        return (i) ozonNetworkConfig.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Retrofit getRetrofit() {
        return (Retrofit) retrofit.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAbToolsGNCFeatureFlagEnabled() {
        return getSharedPrefs$abzone_release().getBoolean("is_ab_tools_gnc_enabled_key", false);
    }

    private final FeatureServiceConfig modifyHostFeatureServiceConfig(FeatureServiceConfig featureServiceConfig2, List<FeatureDTO> defaultFeatures) {
        e appDomain = featureServiceConfig2.getAppDomain();
        String namespace = featureServiceConfig2.getNamespace();
        ArrayList p02 = C7714v.p0(defaultFeatures, featureServiceConfig2.getFeatures());
        Collection<B> interceptors = featureServiceConfig2.getInterceptors();
        Collection<B> networkInterceptors = featureServiceConfig2.getNetworkInterceptors();
        boolean debug = featureServiceConfig2.getDebug();
        InterfaceC4875q cookieJar = featureServiceConfig2.getCookieJar();
        Long refreshIntervalMs = featureServiceConfig2.getRefreshIntervalMs();
        featureServiceConfig2.getAdditionalParametersProvider();
        return new FeatureServiceConfig(appDomain, namespace, p02, interceptors, networkInterceptors, debug, cookieJar, refreshIntervalMs, null, featureServiceConfig2.getFeatureServicePriority(), featureServiceConfig2.getFetchFromRemoteOnInit(), false, false, 6144, null);
    }

    @NotNull
    public final Moshi createMoshi() {
        Moshi.a aVar = new Moshi.a();
        aVar.a(new NumberMoshiAdapterFactory());
        aVar.a(new AdditionalParametersAdapterFactory());
        Moshi moshi = new Moshi(aVar);
        Intrinsics.checkNotNullExpressionValue(moshi, "build(...)");
        return moshi;
    }

    @NotNull
    public final AbToolInteractor getAbToolHostInteractor() {
        AbToolInteractor abToolInteractor = abToolHostInteractor;
        if (abToolInteractor != null) {
            return abToolInteractor;
        }
        Intrinsics.n("abToolHostInteractor");
        throw null;
    }

    @NotNull
    public final AbToolInteractor getAbToolLibsInteractor() {
        AbToolInteractor abToolInteractor = abToolLibsInteractor;
        if (abToolInteractor != null) {
            return abToolInteractor;
        }
        Intrinsics.n("abToolLibsInteractor");
        throw null;
    }

    @NotNull
    public final FeatureServiceConfig getFeatureServiceConfig$abzone_release() {
        FeatureServiceConfig featureServiceConfig2 = featureServiceConfig;
        if (featureServiceConfig2 != null) {
            return featureServiceConfig2;
        }
        Intrinsics.n("featureServiceConfig");
        throw null;
    }

    public final SharedPreferences getSharedPrefs$abzone_release() {
        return (SharedPreferences) sharedPrefs.getValue();
    }

    public final void initialize(@NotNull FeatureServiceConfig featureServiceConfig2, @NotNull d globalConfig2, @NotNull List<FeatureDTO> libsFeatures) {
        Intrinsics.checkNotNullParameter(featureServiceConfig2, "featureServiceConfig");
        Intrinsics.checkNotNullParameter(globalConfig2, "globalConfig");
        Intrinsics.checkNotNullParameter(libsFeatures, "libsFeatures");
        setFeatureServiceConfig$abzone_release(featureServiceConfig2);
        globalConfig = globalConfig2;
        FeatureServiceConfig modifyHostFeatureServiceConfig = modifyHostFeatureServiceConfig(featureServiceConfig2, C7714v.U0(new AbToolConfigFeatures(featureServiceConfig2).getFeatures()));
        AbToolNamespace abToolNamespace = AbToolNamespace.DEFAULT;
        InterfaceC4008j b11 = k.b(ServiceLocator$initialize$1.INSTANCE);
        j builder = new j();
        if (featureServiceConfig2.getIsPlatformOverridesEnabled()) {
            builder.add("platform_mobile_overrides");
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        abToolHostInteractor = new AbToolInteractor(modifyHostFeatureServiceConfig, isAbToolsGNCFeatureFlagEnabled(), globalConfig2, abToolNamespace, b11, true, false, builder.b());
        abToolLibsInteractor = new AbToolInteractor(createLibsFeatureConfig(featureServiceConfig2, libsFeatures), isAbToolsGNCFeatureFlagEnabled(), globalConfig2, AbToolNamespace.PLATFORM_MOBILE, k.b(ServiceLocator$initialize$3.INSTANCE), featureServiceConfig2.getIsPlatformNamespaceEnabled(), featureServiceConfig2.getIsPlatformOverridesEnabled(), M.f71699a);
    }

    public final void setFeatureServiceConfig$abzone_release(@NotNull FeatureServiceConfig featureServiceConfig2) {
        Intrinsics.checkNotNullParameter(featureServiceConfig2, "<set-?>");
        featureServiceConfig = featureServiceConfig2;
    }
}
