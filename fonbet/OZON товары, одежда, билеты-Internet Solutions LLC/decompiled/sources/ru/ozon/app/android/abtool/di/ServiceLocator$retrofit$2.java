package ru.ozon.app.android.abtool.di;

import We.E;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import pf0.i;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import ru.ozon.app.android.abtool.FeatureServiceConfig;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lretrofit2/Retrofit;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ServiceLocator$retrofit$2 extends AbstractC7737t implements Function0<Retrofit> {
    public static final ServiceLocator$retrofit$2 INSTANCE = new ServiceLocator$retrofit$2();

    ServiceLocator$retrofit$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Retrofit invoke() {
        E createOkHttpClient;
        i ozonNetworkConfig;
        boolean isAbToolsGNCFeatureFlagEnabled;
        Retrofit createRetrofit;
        ServiceLocator serviceLocator = ServiceLocator.INSTANCE;
        MoshiConverterFactory create = MoshiConverterFactory.create(serviceLocator.createMoshi());
        createOkHttpClient = serviceLocator.createOkHttpClient(DiStoreWrapper.INSTANCE.getOzonId());
        FeatureServiceConfig featureServiceConfig$abzone_release = serviceLocator.getFeatureServiceConfig$abzone_release();
        Intrinsics.f(create);
        ozonNetworkConfig = serviceLocator.getOzonNetworkConfig();
        isAbToolsGNCFeatureFlagEnabled = serviceLocator.isAbToolsGNCFeatureFlagEnabled();
        createRetrofit = serviceLocator.createRetrofit(featureServiceConfig$abzone_release, create, createOkHttpClient, ozonNetworkConfig, isAbToolsGNCFeatureFlagEnabled);
        return createRetrofit;
    }
}
