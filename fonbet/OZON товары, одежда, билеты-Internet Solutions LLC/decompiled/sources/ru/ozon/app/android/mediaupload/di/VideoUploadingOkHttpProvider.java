package ru.ozon.app.android.mediaupload.di;

import We.B;
import We.E;
import We.F;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import nf.C8590c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.video.metrics.manager.VideoUploadMetricsManager;
import ru.ozon.app.android.mediaupload.video.metrics.network.VideoUploadingPerformanceInterceptor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.flags.BxSdkOzonNetworkEnabledFlag;
import ru.ozon.app.android.network.gnc.GncOkHttpClientBuilder;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/mediaupload/di/VideoUploadingOkHttpProvider;", "", "LWe/E;", "client", "Lru/ozon/app/android/mediaupload/video/metrics/manager/VideoUploadMetricsManager;", "videoUploadMetricsManager", "Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;", "gncOkHttpClientBuilder", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(LWe/E;Lru/ozon/app/android/mediaupload/video/metrics/manager/VideoUploadMetricsManager;Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "build", "()LWe/E;", "LWe/E;", "Lru/ozon/app/android/mediaupload/video/metrics/manager/VideoUploadMetricsManager;", "Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VideoUploadingOkHttpProvider {

    @NotNull
    private final E client;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final GncOkHttpClientBuilder gncOkHttpClientBuilder;

    @NotNull
    private final VideoUploadMetricsManager videoUploadMetricsManager;

    public VideoUploadingOkHttpProvider(@NotNull E client, @NotNull VideoUploadMetricsManager videoUploadMetricsManager, @NotNull GncOkHttpClientBuilder gncOkHttpClientBuilder, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(videoUploadMetricsManager, "videoUploadMetricsManager");
        Intrinsics.checkNotNullParameter(gncOkHttpClientBuilder, "gncOkHttpClientBuilder");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.client = client;
        this.videoUploadMetricsManager = videoUploadMetricsManager;
        this.gncOkHttpClientBuilder = gncOkHttpClientBuilder;
        this.featureChecker = featureChecker;
    }

    @NotNull
    public final E build() {
        Object obj = null;
        if (this.featureChecker.isEnabled(BxSdkOzonNetworkEnabledFlag.INSTANCE)) {
            GncOkHttpClientBuilder deepCopy = this.gncOkHttpClientBuilder.deepCopy();
            String name = C8590c.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            B interceptor = deepCopy.getInterceptor(name);
            C8590c c8590c = interceptor instanceof C8590c ? (C8590c) interceptor : null;
            if (c8590c != null) {
                c8590c.c(C8590c.a.HEADERS);
            }
            deepCopy.removeInterceptor("FlipperOkhttpInterceptor");
            if (this.videoUploadMetricsManager.isMetricsTrackingEnabled()) {
                GncOkHttpClientBuilder.addAppInterceptor$default(deepCopy, new VideoUploadingPerformanceInterceptor(this.videoUploadMetricsManager), 0, 2, null);
            }
            E build = deepCopy.build();
            build.getClass();
            E.a aVar = new E.a(build);
            aVar.V(C7714v.a0(F.HTTP_1_1));
            aVar.d(0L, TimeUnit.MINUTES);
            return new E(aVar);
        }
        E e11 = this.client;
        e11.getClass();
        E.a aVar2 = new E.a(e11);
        ArrayList S11 = aVar2.S();
        Iterator it = S11.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((B) next) instanceof C8590c) {
                obj = next;
                break;
            }
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type okhttp3.logging.HttpLoggingInterceptorWithLimits");
        ((C8590c) obj).c(C8590c.a.HEADERS);
        C.h(S11, VideoUploadingOkHttpProvider$build$2$1$2.INSTANCE);
        if (this.videoUploadMetricsManager.isMetricsTrackingEnabled()) {
            aVar2.a(new VideoUploadingPerformanceInterceptor(this.videoUploadMetricsManager));
        }
        aVar2.V(C7714v.a0(F.HTTP_1_1));
        aVar2.d(0L, TimeUnit.MINUTES);
        return new E(aVar2);
    }
}
