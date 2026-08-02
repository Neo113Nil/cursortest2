package ru.ozon.app.android.mediaupload.video.metrics.network;

import P4.f;
import We.B;
import We.G;
import We.L;
import We.z;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.coroutines.g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.video.metrics.data.UploadMetricEvent;
import ru.ozon.app.android.mediaupload.video.metrics.manager.VideoUploadMetricsManager;
import ru.ozon.app.android.network.interceptors.BXInterceptor;
import xe.C10727i;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/mediaupload/video/metrics/network/VideoUploadingPerformanceInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "Lru/ozon/app/android/mediaupload/video/metrics/manager/VideoUploadMetricsManager;", "videoUploadMetricsManager", "<init>", "(Lru/ozon/app/android/mediaupload/video/metrics/manager/VideoUploadMetricsManager;)V", "", "uploadProcessId", "uploadRequestId", "", "startMs", "LWe/G;", "request", "LWe/L;", "response", "", "handleMetric", "(Ljava/lang/String;Ljava/lang/String;JLWe/G;LWe/L;)V", "LWe/B$a;", "chain", "onIntercept", "(LWe/B$a;)LWe/L;", "Lru/ozon/app/android/mediaupload/video/metrics/manager/VideoUploadMetricsManager;", "Companion", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VideoUploadingPerformanceInterceptor extends BXInterceptor {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final VideoUploadMetricsManager videoUploadMetricsManager;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/mediaupload/video/metrics/network/VideoUploadingPerformanceInterceptor$Companion;", "", "<init>", "()V", "SERVER_TIMING_HEADER_NAME", "", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public VideoUploadingPerformanceInterceptor(@NotNull VideoUploadMetricsManager videoUploadMetricsManager) {
        Intrinsics.checkNotNullParameter(videoUploadMetricsManager, "videoUploadMetricsManager");
        this.videoUploadMetricsManager = videoUploadMetricsManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    private final void handleMetric(String uploadProcessId, String uploadRequestId, long startMs, G request, L response) {
        ?? r02;
        UploadMetricEvent.EventType checkUpload;
        if (uploadProcessId == null) {
            return;
        }
        if (response != null) {
            z r11 = response.r();
            ArrayList arrayList = new ArrayList();
            Iterator<Pair<? extends String, ? extends String>> it = r11.iterator();
            while (it.hasNext()) {
                Pair<? extends String, ? extends String> next = it.next();
                if (Intrinsics.d(next.e(), "Server-Timing")) {
                    arrayList.add(next);
                }
            }
            r02 = new ArrayList(C7714v.z(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                r02.add((String) ((Pair) it2.next()).f());
            }
        } else {
            r02 = K.f71697a;
        }
        int m11 = response != null ? response.m() : 0;
        String str = (String) request.i(String.class);
        if (Intrinsics.d(str, "chunkUploadTag")) {
            We.K a11 = request.a();
            checkUpload = new UploadMetricEvent.EventType.UploadV2(a11 != null ? a11.contentLength() : 0L, r02);
        } else {
            checkUpload = Intrinsics.d(str, "checkUploadedTag") ? new UploadMetricEvent.EventType.CheckUpload(r02) : null;
        }
        UploadMetricEvent.EventType eventType = checkUpload;
        if (eventType != null) {
            C10727i.d(g.f71771a, new VideoUploadingPerformanceInterceptor$handleMetric$1$1(this, uploadProcessId, eventType, uploadRequestId, startMs, m11, null));
        }
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        long currentTimeMillis = System.currentTimeMillis();
        String b11 = f.b("toString(...)");
        G request = chain.request();
        request.getClass();
        G.a aVar = new G.a(request);
        aVar.a("x-o3-vua-request-id", b11);
        G b12 = aVar.b();
        String d11 = b12.d("x-o3-vua-process-id");
        try {
            L proceed = chain.proceed(b12);
            handleMetric(d11, b11, currentTimeMillis, b12, proceed);
            return proceed;
        } catch (Throwable th2) {
            handleMetric(d11, b11, currentTimeMillis, b12, null);
            throw th2;
        }
    }
}
