package ru.ozon.app.android.mediaupload.video.metrics.manager;

import He.b;
import Je.InterfaceC3394a;
import Je.e;
import Sg.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.flags.TrackVideoUploadMetricsFlag;
import ru.ozon.app.android.mediaupload.video.api.VideoUploadingMetricsApi;
import ru.ozon.app.android.mediaupload.video.metrics.data.UploadMetricEvent;
import ru.ozon.app.android.mediaupload.video.metrics.network.VideoUploadServerTimingsParser;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.utils.CoroutineUtilsKt;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/mediaupload/video/metrics/manager/VideoUploadMetricsManagerImpl;", "Lru/ozon/app/android/mediaupload/video/metrics/manager/VideoUploadMetricsManager;", "LSg/a;", "analyticsScreenStorage", "Lru/ozon/app/android/mediaupload/video/api/VideoUploadingMetricsApi;", "uploadingMetricsApi", "Lru/ozon/app/android/network/version/AppVersionService;", "appVersionService", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(LSg/a;Lru/ozon/app/android/mediaupload/video/api/VideoUploadingMetricsApi;Lru/ozon/app/android/network/version/AppVersionService;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "uploadProcessId", "", "Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent;", "metricsList", "Lxe/B0;", "sendPerfMetrics", "(Ljava/lang/String;Ljava/util/List;)Lxe/B0;", "metricEvent", "", "addMetric", "(Ljava/lang/String;Lru/ozon/app/android/mediaupload/video/metrics/data/UploadMetricEvent;Lkotlin/coroutines/d;)Ljava/lang/Object;", "onUploadCancelled", "(Ljava/lang/String;)V", "LSg/a;", "Lru/ozon/app/android/mediaupload/video/api/VideoUploadingMetricsApi;", "domain", "Ljava/lang/String;", "", "", "uploadMetricsMap", "Ljava/util/Map;", "LJe/a;", "mutex", "LJe/a;", "Lru/ozon/app/android/mediaupload/video/metrics/network/VideoUploadServerTimingsParser;", "serverTimingParser", "Lru/ozon/app/android/mediaupload/video/metrics/network/VideoUploadServerTimingsParser;", "", "isMetricsTrackingEnabled", "Z", "()Z", "Companion", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VideoUploadMetricsManagerImpl implements VideoUploadMetricsManager {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final a analyticsScreenStorage;

    @NotNull
    private final String domain;
    private final boolean isMetricsTrackingEnabled;

    @NotNull
    private final InterfaceC3394a mutex;

    @NotNull
    private final VideoUploadServerTimingsParser serverTimingParser;

    @NotNull
    private final Map<String, List<UploadMetricEvent>> uploadMetricsMap;

    @NotNull
    private final VideoUploadingMetricsApi uploadingMetricsApi;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/mediaupload/video/metrics/manager/VideoUploadMetricsManagerImpl$Companion;", "", "<init>", "()V", "CLIENT_NAME", "", "CLIENT_VERSION", "CLIENT_TEAM", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public VideoUploadMetricsManagerImpl(@NotNull a analyticsScreenStorage, @NotNull VideoUploadingMetricsApi uploadingMetricsApi, @NotNull AppVersionService appVersionService, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(uploadingMetricsApi, "uploadingMetricsApi");
        Intrinsics.checkNotNullParameter(appVersionService, "appVersionService");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.analyticsScreenStorage = analyticsScreenStorage;
        this.uploadingMetricsApi = uploadingMetricsApi;
        this.domain = appVersionService.getAppName();
        this.uploadMetricsMap = new LinkedHashMap();
        this.mutex = e.a();
        this.serverTimingParser = new VideoUploadServerTimingsParser();
        this.isMetricsTrackingEnabled = featureChecker.isEnabled(TrackVideoUploadMetricsFlag.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final B0 sendPerfMetrics(String uploadProcessId, List<? extends UploadMetricEvent> metricsList) {
        return C10727i.c(CoroutineUtilsKt.getSafeScope(), null, null, new VideoUploadMetricsManagerImpl$sendPerfMetrics$1(this, metricsList, uploadProcessId, null), 3);
    }

    @Override // ru.ozon.app.android.mediaupload.video.metrics.manager.VideoUploadMetricsManager
    public Object addMetric(@NotNull String str, @NotNull UploadMetricEvent uploadMetricEvent, @NotNull d<? super Unit> dVar) {
        if (!getIsMetricsTrackingEnabled()) {
            return Unit.f71690a;
        }
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(b.f10879b, new VideoUploadMetricsManagerImpl$addMetric$2(this, uploadMetricEvent, str, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    @Override // ru.ozon.app.android.mediaupload.video.metrics.manager.VideoUploadMetricsManager
    /* renamed from: isMetricsTrackingEnabled, reason: from getter */
    public boolean getIsMetricsTrackingEnabled() {
        return this.isMetricsTrackingEnabled;
    }

    @Override // ru.ozon.app.android.mediaupload.video.metrics.manager.VideoUploadMetricsManager
    public void onUploadCancelled(@NotNull String uploadProcessId) {
        Intrinsics.checkNotNullParameter(uploadProcessId, "uploadProcessId");
        if (getIsMetricsTrackingEnabled()) {
            C10727i.c(CoroutineUtilsKt.getSafeScope(), null, null, new VideoUploadMetricsManagerImpl$onUploadCancelled$1(this, uploadProcessId, null), 3);
        }
    }
}
