package com.socure.docv.capturesdk.common.network.transport;

import com.socure.docv.capturesdk.BuildConfig;
import com.socure.docv.capturesdk.common.network.internal.OkHttpClientBuilder;
import com.socure.docv.capturesdk.common.session.SessionManager;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* compiled from: ApiClient.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0014R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/transport/ApiClient;", "", "()V", "customModelsRetrofit", "Lretrofit2/Retrofit;", "kotlin.jvm.PlatformType", "gsonConvertor", "Lretrofit2/converter/moshi/MoshiConverterFactory;", "mixPanelRetrofit", "stepUpRetrofit", "uploadRetrofit", "getBaseUrl", "", "getCustomModelsService", "Lcom/socure/docv/capturesdk/common/network/transport/CustomModelsApiService;", "getMixPanelApiService", "Lcom/socure/docv/capturesdk/common/network/transport/MixPanelApiService;", "getStepUpService", "Lcom/socure/docv/capturesdk/common/network/transport/StepUpApiService;", "getUploadService", "Lcom/socure/docv/capturesdk/common/network/transport/UploadApiService;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ApiClient {
    public static final int $stable = 8;
    private final Retrofit customModelsRetrofit;
    private final MoshiConverterFactory gsonConvertor;
    private final Retrofit mixPanelRetrofit;
    private final Retrofit stepUpRetrofit;
    private final Retrofit uploadRetrofit;

    public ApiClient() {
        MoshiConverterFactory create = MoshiConverterFactory.create();
        this.gsonConvertor = create;
        this.uploadRetrofit = new Retrofit.Builder().baseUrl(getBaseUrl()).addConverterFactory(create).client(new OkHttpClientBuilder(true).getBuilder()).build();
        this.stepUpRetrofit = new Retrofit.Builder().baseUrl(getBaseUrl()).addConverterFactory(create).client(new OkHttpClientBuilder(false, 1, null).getBuilder()).build();
        this.mixPanelRetrofit = new Retrofit.Builder().baseUrl(BuildConfig.MIX_PANEL_BASE_URL).addConverterFactory(create).client(new OkHttpClientBuilder(false, 1, null).getBuilder()).build();
        this.customModelsRetrofit = new Retrofit.Builder().baseUrl("https://www.socure.com/").client(new OkHttpClient.Builder().connectTimeout(5L, TimeUnit.MINUTES).writeTimeout(5L, TimeUnit.MINUTES).readTimeout(5L, TimeUnit.MINUTES).build()).addConverterFactory(create).build();
    }

    private final String getBaseUrl() {
        String docvUrl = SessionManager.INSTANCE.getDocvUrl();
        if (docvUrl != null) {
            return docvUrl;
        }
        if (SessionManager.INSTANCE.getUseSocureGov()) {
            return BuildConfig.BASE_GOV_UPLOAD_URL;
        }
        return BuildConfig.BASE_STEP_UP_URL;
    }

    public final CustomModelsApiService getCustomModelsService() {
        Object create = this.customModelsRetrofit.create(CustomModelsApiService.class);
        Intrinsics.checkNotNullExpressionValue(create, "customModelsRetrofit.cre…lsApiService::class.java)");
        return (CustomModelsApiService) create;
    }

    public final UploadApiService getUploadService() {
        Object create = this.uploadRetrofit.create(UploadApiService.class);
        Intrinsics.checkNotNullExpressionValue(create, "uploadRetrofit.create(Up…adApiService::class.java)");
        return (UploadApiService) create;
    }

    public final StepUpApiService getStepUpService() {
        Object create = this.stepUpRetrofit.create(StepUpApiService.class);
        Intrinsics.checkNotNullExpressionValue(create, "stepUpRetrofit.create(St…UpApiService::class.java)");
        return (StepUpApiService) create;
    }

    public final MixPanelApiService getMixPanelApiService() {
        Object create = this.mixPanelRetrofit.create(MixPanelApiService.class);
        Intrinsics.checkNotNullExpressionValue(create, "mixPanelRetrofit.create(…elApiService::class.java)");
        return (MixPanelApiService) create;
    }
}
