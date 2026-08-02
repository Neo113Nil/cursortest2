package ru.ozon.app.android.mediaupload.di.modules;

import Ib.a;
import Ve.C4598rp;
import We.E;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.mediaupload.di.VideoUploadingOkHttpProvider;
import ru.ozon.app.android.mediaupload.hosts.PDPHosts;
import ru.ozon.app.android.mediaupload.video.api.VideoUploadingApi;
import ru.ozon.app.android.mediaupload.video.api.VideoUploadingComposerApi;
import ru.ozon.app.android.mediaupload.video.api.VideoUploadingMetricsApi;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.hosts.CoreHosts;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/mediaupload/di/modules/VideoUploadModule;", "", "Companion", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class VideoUploadModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\u001b\u001a\u00020\u00182\b\b\u0001\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b \u0010!J)\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u00182\b\b\u0001\u0010\"\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/mediaupload/di/modules/VideoUploadModule$Companion;", "", "<init>", "()V", "LIb/a;", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "environmentServiceLazy", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/storage/hosts/CoreHosts;", "provideCoreHosts", "(LIb/a;Lru/ozon/app/android/utils/AppType;)Lru/ozon/app/android/storage/hosts/CoreHosts;", "hosts", "Lru/ozon/app/android/mediaupload/hosts/PDPHosts;", "providePDPHosts", "(Lru/ozon/app/android/storage/hosts/CoreHosts;)Lru/ozon/app/android/mediaupload/hosts/PDPHosts;", "pdpHosts", "", "provideVideoUploadingBaseHttpUrl", "(Lru/ozon/app/android/mediaupload/hosts/PDPHosts;)Ljava/lang/String;", "provideVideoUploadingMetricsBaseHttpUrl", "provideVideoUploadingBaseWsUrl", "Lru/ozon/app/android/mediaupload/di/VideoUploadingOkHttpProvider;", "builder", "LWe/E;", "provideUploadingOkHttp", "(Lru/ozon/app/android/mediaupload/di/VideoUploadingOkHttpProvider;)LWe/E;", "client", "baseUrl", "Lretrofit2/Retrofit;", "retrofit", "Lru/ozon/app/android/mediaupload/video/api/VideoUploadingApi;", "provideVideoUploadingApi", "(LWe/E;Ljava/lang/String;Lretrofit2/Retrofit;)Lru/ozon/app/android/mediaupload/video/api/VideoUploadingApi;", "metricsBaseUrl", "Lru/ozon/app/android/mediaupload/video/api/VideoUploadingMetricsApi;", "provideVideoUploadingMetricsApi", "(LWe/E;Ljava/lang/String;Lretrofit2/Retrofit;)Lru/ozon/app/android/mediaupload/video/api/VideoUploadingMetricsApi;", "Lru/ozon/app/android/mediaupload/video/api/VideoUploadingComposerApi;", "provideVideoUploadingComposerApi", "(Lretrofit2/Retrofit;)Lru/ozon/app/android/mediaupload/video/api/VideoUploadingComposerApi;", "UPLOAD_VIDEO_OK_HTTP", "Ljava/lang/String;", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CoreHosts provideCoreHosts(@NotNull a<EnvironmentService> environmentServiceLazy, @NotNull AppType appType) {
            Intrinsics.checkNotNullParameter(environmentServiceLazy, "environmentServiceLazy");
            Intrinsics.checkNotNullParameter(appType, "appType");
            return new CoreHosts(environmentServiceLazy, appType);
        }

        @NotNull
        public final PDPHosts providePDPHosts(@NotNull CoreHosts hosts) {
            Intrinsics.checkNotNullParameter(hosts, "hosts");
            return new PDPHosts(hosts);
        }

        @NotNull
        public final E provideUploadingOkHttp(@NotNull VideoUploadingOkHttpProvider builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return builder.build();
        }

        @NotNull
        public final VideoUploadingApi provideVideoUploadingApi(@NotNull E client, @NotNull String baseUrl, @NotNull Retrofit retrofit) {
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Object create = retrofit.newBuilder().baseUrl(baseUrl).client(client).build().create(VideoUploadingApi.class);
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            return (VideoUploadingApi) create;
        }

        @NotNull
        public final String provideVideoUploadingBaseHttpUrl(@NotNull PDPHosts pdpHosts) {
            Intrinsics.checkNotNullParameter(pdpHosts, "pdpHosts");
            return pdpHosts.getVideoUploadingBaseHttpUrl();
        }

        @NotNull
        public final String provideVideoUploadingBaseWsUrl(@NotNull PDPHosts pdpHosts) {
            Intrinsics.checkNotNullParameter(pdpHosts, "pdpHosts");
            return pdpHosts.getVideoUploadingBaseWebSocketUrl();
        }

        @NotNull
        public final VideoUploadingComposerApi provideVideoUploadingComposerApi(@NotNull Retrofit retrofit) {
            return (VideoUploadingComposerApi) C4598rp.b(retrofit, "retrofit", VideoUploadingComposerApi.class, "create(...)");
        }

        @NotNull
        public final VideoUploadingMetricsApi provideVideoUploadingMetricsApi(@NotNull E client, @NotNull String metricsBaseUrl, @NotNull Retrofit retrofit) {
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(metricsBaseUrl, "metricsBaseUrl");
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Object create = retrofit.newBuilder().baseUrl(metricsBaseUrl).client(client).build().create(VideoUploadingMetricsApi.class);
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            return (VideoUploadingMetricsApi) create;
        }

        @NotNull
        public final String provideVideoUploadingMetricsBaseHttpUrl(@NotNull PDPHosts hosts) {
            Intrinsics.checkNotNullParameter(hosts, "hosts");
            return hosts.getVideoUploadingMetricsBaseHttpUrl();
        }

        private Companion() {
        }
    }
}
