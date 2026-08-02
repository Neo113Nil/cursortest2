package ru.ozon.app.android.video.player.performance.metricsManager;

import De.s;
import He.b;
import Je.InterfaceC3394a;
import Je.e;
import Qj0.z0;
import Sc.o;
import Wc.a;
import We.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.collections.e0;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.video.manager.CacheTransferInfoProvider;
import ru.ozon.app.android.video.player.performance.MetricsVideoTraceEntity;
import ru.ozon.app.android.video.player.performance.PlayerNamespace;
import ru.ozon.app.android.video.player.performance.VideoTraceEntity;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoAssetMap;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricAction;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 R2\u00020\u0001:\u0001RB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010\"\u001a\u00020\u00152\u0016\u0010\u0012\u001a\u0012\u0012\b\u0012\u00060 j\u0002`!\u0012\u0004\u0012\u00020\u00110\u001f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010#JW\u0010-\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0*2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\u0010\u0010)\u001a\f\u0012\b\u0012\u00060 j\u0002`(0'H\u0002¢\u0006\u0004\b-\u0010.J%\u00100\u001a\f\u0012\b\u0012\u00060 j\u0002`(0'2\n\u0010/\u001a\u00060 j\u0002`!H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J/\u0010@\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010<\u001a\u00020;2\u0006\u0010\u001a\u001a\u00020=2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u001b\u0010C\u001a\u00020\u000e2\n\u0010B\u001a\u00060 j\u0002`(H\u0016¢\u0006\u0004\bC\u0010DR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010ER\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010FR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR$\u0010M\u001a\u0012\u0012\b\u0012\u00060 j\u0002`!\u0012\u0004\u0012\u00020\u00110\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR$\u0010O\u001a\u0012\u0012\b\u0012\u00060 j\u0002`!\u0012\u0004\u0012\u00020\u00110\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010NR$\u0010Q\u001a\u0012\u0012\b\u0012\u00060 j\u0002`!\u0012\u0004\u0012\u00020P0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010N¨\u0006S"}, d2 = {"Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerImpl;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "Lru/ozon/app/android/video/manager/CacheTransferInfoProvider;", "cacheTransferListener", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;", "videoPerfMetricsManagerHelper", "<init>", "(Lru/ozon/app/android/video/manager/CacheTransferInfoProvider;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;)V", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;", "videoAsset", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction;", "metricType", "", "handleMetricActionByUrlInternal", "(Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoAssetMap;", "metricsMap", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoAssetMap$GeneralVideoInfo;", "generalVideoInfo", "", "isAwaitMetricsMap", "sendAnalyticsByUrlInternal", "(Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;Lru/ozon/app/android/video/player/performance/metricsManager/VideoAssetMap;Lru/ozon/app/android/video/player/performance/metricsManager/VideoAssetMap$GeneralVideoInfo;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/video/player/performance/MetricsVideoTraceEntity;", "videoTraceEntity", "addVideoMetricsToTrace", "(Lru/ozon/app/android/video/player/performance/MetricsVideoTraceEntity;Lkotlin/coroutines/d;)Ljava/lang/Object;", "runPostDelayedMapCheck", "(Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;)V", "", "", "Lru/ozon/app/android/video/player/performance/metricsManager/BaseVideoUrl;", "addMetricToMap", "(Ljava/util/Map;Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction;)Z", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoAssetMap$VideoPerfMetricsSet;", "metrics", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "cachedVideoUrlsSet", "Lkotlin/Pair;", "", "LQj0/z0$b;", "fillManifestAndFileMetrics", "(Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;Ljava/util/Map;Ljava/util/Set;)Lkotlin/Pair;", "baseUrl", "getCachedUrls", "(Ljava/lang/String;)Ljava/util/Set;", "Lxe/M;", "getOrCreateScope", "()Lxe/M;", "handleMetricActionByUrl", "(Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction;)V", "LWe/z;", "headers", "extractAndPutServerTimingMetrics", "(Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;LWe/z;)V", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction;", "playbackMetrics", "Lru/ozon/app/android/video/player/performance/VideoTraceEntity;", "Lru/ozon/app/android/video/player/performance/PlayerNamespace;", "playerNamespace", "sendAnalyticsByUrl", "(Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction;Lru/ozon/app/android/video/player/performance/VideoTraceEntity;Lru/ozon/app/android/video/player/performance/PlayerNamespace;)V", ImagesContract.URL, "releaseCachedUrls", "(Ljava/lang/String;)V", "Lru/ozon/app/android/video/manager/CacheTransferInfoProvider;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;", "LJe/a;", "mutex", "LJe/a;", "scope", "Lxe/M;", "_metricsMap", "Ljava/util/Map;", "_awaitMetricsMap", "Lxe/B0;", "awaitMetricsCheckJobMap", "Companion", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoPerfMetricsManagerImpl implements VideoPerfMetricsManager {

    @NotNull
    private final Map<String, VideoAssetMap> _awaitMetricsMap;

    @NotNull
    private final Map<String, VideoAssetMap> _metricsMap;

    @NotNull
    private final Map<String, B0> awaitMetricsCheckJobMap;

    @NotNull
    private final CacheTransferInfoProvider cacheTransferListener;

    @NotNull
    private final InterfaceC3394a mutex;

    @NotNull
    private final PerformanceTrackerDelegate performanceTrackerDelegate;

    @NotNull
    private M scope;

    @NotNull
    private final VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper;
    public static final int $stable = 8;

    public VideoPerfMetricsManagerImpl(@NotNull CacheTransferInfoProvider cacheTransferListener, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper) {
        Intrinsics.checkNotNullParameter(cacheTransferListener, "cacheTransferListener");
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        Intrinsics.checkNotNullParameter(videoPerfMetricsManagerHelper, "videoPerfMetricsManagerHelper");
        this.cacheTransferListener = cacheTransferListener;
        this.performanceTrackerDelegate = performanceTrackerDelegate;
        this.videoPerfMetricsManagerHelper = videoPerfMetricsManagerHelper;
        this.mutex = e.a();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(b.f10879b.plus(X0.b()));
        this._metricsMap = new LinkedHashMap();
        this._awaitMetricsMap = new LinkedHashMap();
        this.awaitMetricsCheckJobMap = new LinkedHashMap();
    }

    private final boolean addMetricToMap(Map<String, VideoAssetMap> metricsMap, VideoAsset videoAsset, VideoPerfMetricAction metricType) {
        Set h11;
        Map<VideoAsset, VideoAssetMap.VideoPerfMetricsSet> videoAssetMetricsMap;
        Map n11;
        Map<VideoAsset, VideoAssetMap.VideoPerfMetricsSet> videoAssetMetricsMap2;
        VideoAssetMap.VideoPerfMetricsSet videoPerfMetricsSet;
        Set<VideoPerfMetricAction> videoPerfMetricsSet2;
        Map<VideoAsset, VideoAssetMap.VideoPerfMetricsSet> videoAssetMetricsMap3;
        Map n12;
        Map<VideoAsset, VideoAssetMap.VideoPerfMetricsSet> videoAssetMetricsMap4;
        String castToBaseUrl$video_prodGoogleAllVendorsRelease = VideoAsset.INSTANCE.castToBaseUrl$video_prodGoogleAllVendorsRelease(videoAsset.getVideoUrl());
        boolean z11 = false;
        if (metricsMap.get(castToBaseUrl$video_prodGoogleAllVendorsRelease) == null) {
            metricsMap.put(castToBaseUrl$video_prodGoogleAllVendorsRelease, new VideoAssetMap(false, null, U.i(new Pair(videoAsset, new VideoAssetMap.VideoPerfMetricsSet(false, e0.e(metricType))))));
            return false;
        }
        VideoAssetMap videoAssetMap = metricsMap.get(castToBaseUrl$video_prodGoogleAllVendorsRelease);
        if (((videoAssetMap == null || (videoAssetMetricsMap4 = videoAssetMap.getVideoAssetMetricsMap()) == null) ? null : videoAssetMetricsMap4.get(videoAsset)) == null) {
            VideoAssetMap videoAssetMap2 = metricsMap.get(castToBaseUrl$video_prodGoogleAllVendorsRelease);
            if (videoAssetMap2 != null && (videoAssetMetricsMap3 = videoAssetMap2.getVideoAssetMetricsMap()) != null && (n12 = U.n(videoAssetMetricsMap3, new Pair(videoAsset, new VideoAssetMap.VideoPerfMetricsSet(false, e0.e(metricType))))) != null) {
                VideoAssetMap videoAssetMap3 = metricsMap.get(castToBaseUrl$video_prodGoogleAllVendorsRelease);
                metricsMap.put(castToBaseUrl$video_prodGoogleAllVendorsRelease, new VideoAssetMap(false, videoAssetMap3 != null ? videoAssetMap3.getGeneralVideoInfoOptional() : null, n12));
                return false;
            }
        } else {
            VideoAssetMap videoAssetMap4 = metricsMap.get(castToBaseUrl$video_prodGoogleAllVendorsRelease);
            if (videoAssetMap4 == null || (videoAssetMetricsMap2 = videoAssetMap4.getVideoAssetMetricsMap()) == null || (videoPerfMetricsSet = videoAssetMetricsMap2.get(videoAsset)) == null || (videoPerfMetricsSet2 = videoPerfMetricsSet.getVideoPerfMetricsSet()) == null) {
                h11 = e0.h(metricType);
            } else {
                if (videoPerfMetricsSet2.contains(metricType)) {
                    videoPerfMetricsSet2.remove(metricType);
                }
                h11 = e0.g(videoPerfMetricsSet2, metricType);
            }
            VideoAssetMap videoAssetMap5 = metricsMap.get(castToBaseUrl$video_prodGoogleAllVendorsRelease);
            if (videoAssetMap5 != null && (videoAssetMetricsMap = videoAssetMap5.getVideoAssetMetricsMap()) != null && (n11 = U.n(videoAssetMetricsMap, new Pair(videoAsset, new VideoAssetMap.VideoPerfMetricsSet(VideoPerfMetricsManagerKt.isFileRead(h11), C7714v.X0(h11))))) != null) {
                if (!n11.isEmpty()) {
                    Iterator it = n11.entrySet().iterator();
                    while (it.hasNext()) {
                        if (!((VideoAssetMap.VideoPerfMetricsSet) ((Map.Entry) it.next()).getValue()).getIsFileRead()) {
                            break;
                        }
                    }
                }
                z11 = true;
                VideoAssetMap videoAssetMap6 = metricsMap.get(castToBaseUrl$video_prodGoogleAllVendorsRelease);
                metricsMap.put(castToBaseUrl$video_prodGoogleAllVendorsRelease, new VideoAssetMap(z11, videoAssetMap6 != null ? videoAssetMap6.getGeneralVideoInfoOptional() : null, n11));
            }
        }
        return z11;
    }

    private final Object addVideoMetricsToTrace(MetricsVideoTraceEntity metricsVideoTraceEntity, d<? super Unit> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(s.f6650a, new VideoPerfMetricsManagerImpl$addVideoMetricsToTrace$2(this, metricsVideoTraceEntity, null), dVar);
        return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private final Pair<List<z0.b>, List<z0.b>> fillManifestAndFileMetrics(VideoAsset videoAsset, Map<VideoAsset, VideoAssetMap.VideoPerfMetricsSet> metrics, Set<String> cachedVideoUrlsSet) {
        Pair pair;
        Set<VideoAsset> keySet;
        Iterator<Map.Entry<VideoAsset, VideoAssetMap.VideoPerfMetricsSet>> it;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (metrics != null) {
            Iterator<Map.Entry<VideoAsset, VideoAssetMap.VideoPerfMetricsSet>> it2 = metrics.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<VideoAsset, VideoAssetMap.VideoPerfMetricsSet> next = it2.next();
                VideoAsset key = next.getKey();
                VideoAssetMap.VideoPerfMetricsSet value = next.getValue();
                ArrayList arrayList3 = new ArrayList();
                double d11 = 0.0d;
                Double d12 = null;
                Double d13 = null;
                Double d14 = null;
                Double d15 = null;
                Double d16 = null;
                Double d17 = null;
                Double d18 = null;
                Double d19 = null;
                Double d21 = null;
                Double d22 = null;
                Double d23 = null;
                for (VideoPerfMetricAction videoPerfMetricAction : value.getVideoPerfMetricsSet()) {
                    if (videoPerfMetricAction instanceof VideoPerfMetricAction.PutAppMetricAction) {
                        VideoPerfMetricAction.PutAppMetricAction putAppMetricAction = (VideoPerfMetricAction.PutAppMetricAction) videoPerfMetricAction;
                        String metricName = putAppMetricAction.getMetricName();
                        switch (metricName.hashCode()) {
                            case -2143543668:
                                if (metricName.equals("transferSize")) {
                                    d12 = Double.valueOf(putAppMetricAction.getMetricValue().doubleValue());
                                    break;
                                }
                                break;
                            case -1825923920:
                                if (metricName.equals("serverTime")) {
                                    d16 = Double.valueOf(putAppMetricAction.getMetricValue().doubleValue());
                                    break;
                                }
                                break;
                            case -1483428274:
                                if (metricName.equals("tcpTime")) {
                                    d14 = Double.valueOf(putAppMetricAction.getMetricValue().doubleValue());
                                    break;
                                }
                                break;
                            case -1222995352:
                                if (metricName.equals("tlsTime")) {
                                    d15 = Double.valueOf(putAppMetricAction.getMetricValue().doubleValue());
                                    break;
                                }
                                break;
                            case -577281999:
                                metricName.equals("totalTime");
                                break;
                            case 947814032:
                                if (metricName.equals("timeToFirstByte")) {
                                    d19 = Double.valueOf(putAppMetricAction.getMetricValue().doubleValue());
                                    break;
                                }
                                break;
                            case 1197077847:
                                if (metricName.equals("decodedSize")) {
                                    d23 = Double.valueOf(putAppMetricAction.getMetricValue().doubleValue());
                                    break;
                                }
                                break;
                            case 1201639591:
                                if (metricName.equals("headersSize")) {
                                    d11 = putAppMetricAction.getMetricValue().doubleValue();
                                    break;
                                }
                                break;
                            case 1337313030:
                                if (metricName.equals("timeToLastByte")) {
                                    d21 = Double.valueOf(putAppMetricAction.getMetricValue().doubleValue());
                                    break;
                                }
                                break;
                            case 1439224494:
                                if (metricName.equals("responseTime")) {
                                    d17 = Double.valueOf(putAppMetricAction.getMetricValue().doubleValue());
                                    break;
                                }
                                break;
                            case 1752828704:
                                if (metricName.equals("protocolVersion")) {
                                    d18 = Double.valueOf(putAppMetricAction.getMetricValue().doubleValue());
                                    break;
                                }
                                break;
                            case 1814073238:
                                if (metricName.equals("dnsTime")) {
                                    d13 = Double.valueOf(putAppMetricAction.getMetricValue().doubleValue());
                                    break;
                                }
                                break;
                            case 1926472239:
                                if (metricName.equals("encodedSize")) {
                                    d22 = Double.valueOf(putAppMetricAction.getMetricValue().doubleValue());
                                    break;
                                }
                                break;
                        }
                    } else if (videoPerfMetricAction instanceof VideoPerfMetricAction.PutServerTimingMetricAction) {
                        VideoPerfMetricAction.PutServerTimingMetricAction putServerTimingMetricAction = (VideoPerfMetricAction.PutServerTimingMetricAction) videoPerfMetricAction;
                        it = it2;
                        arrayList3.add(new z0.b.C0478b.a(putServerTimingMetricAction.getParamName(), putServerTimingMetricAction.getParamDur(), putServerTimingMetricAction.getParamDesc()));
                        it2 = it;
                    }
                    it = it2;
                    it2 = it;
                }
                Iterator<Map.Entry<VideoAsset, VideoAssetMap.VideoPerfMetricsSet>> it3 = it2;
                (VideoAsset.INSTANCE.isManifestFile$video_prodGoogleAllVendorsRelease(key.getVideoUrl()) ? arrayList : arrayList2).add(new z0.b(key.getVideoUrl(), new z0.b.a(d13, d14, d15, d16, d17, d18, d19, d21, d22, d23, d11 > 0.0d ? d22 != null ? Double.valueOf(d22.doubleValue() + d11) : null : d12), new z0.b.C0478b(arrayList3)));
                it2 = it3;
            }
        }
        if (metrics == null || (keySet = metrics.keySet()) == null) {
            K k11 = K.f71697a;
            pair = new Pair(k11, k11);
        } else {
            Set<VideoAsset> set = keySet;
            ArrayList arrayList4 = new ArrayList(C7714v.z(set, 10));
            Iterator<T> it4 = set.iterator();
            while (it4.hasNext()) {
                arrayList4.add(((VideoAsset) it4.next()).getVideoUrl());
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            Iterator it5 = arrayList4.iterator();
            while (it5.hasNext()) {
                Object next2 = it5.next();
                if (VideoAsset.INSTANCE.isManifestFile$video_prodGoogleAllVendorsRelease((String) next2)) {
                    arrayList5.add(next2);
                } else {
                    arrayList6.add(next2);
                }
            }
            pair = new Pair(arrayList5, arrayList6);
        }
        List list = (List) pair.a();
        List list2 = (List) pair.b();
        for (String str : cachedVideoUrlsSet) {
            if (VideoAsset.INSTANCE.isManifestFile$video_prodGoogleAllVendorsRelease(str)) {
                if (!list.contains(str)) {
                    arrayList.add(new z0.b(videoAsset.getVideoUrl(), new z0.b.a(2047)));
                }
            } else if (!list2.contains(str)) {
                arrayList2.add(new z0.b(videoAsset.getVideoUrl(), new z0.b.a(2047)));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    private final Set<String> getCachedUrls(String baseUrl) {
        return this.cacheTransferListener.getCachedUrlsByBaseUrl(baseUrl);
    }

    private final M getOrCreateScope() {
        if (!N.f(this.scope)) {
            C10720e0 c10720e0 = C10720e0.f105451a;
            this.scope = N.a(b.f10879b.plus(X0.b()));
        }
        return this.scope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(9:(2:3|(8:5|6|7|8|(1:(1:(1:(1:(6:14|15|16|17|18|19)(2:21|22))(6:23|24|25|17|18|19))(6:26|27|28|17|18|19))(1:29))(3:87|(1:89)|49)|30|31|(5:67|68|(2:70|(6:72|(1:74)(1:80)|(1:77)|79|28|17)(1:81))(1:82)|18|19)(3:37|(7:39|(1:47)(1:45)|46|25|17|18|19)(5:50|51|(3:53|(1:55)(1:61)|(2:57|(3:59|16|17))(1:60))(2:62|(1:64)(2:65|66))|18|19)|49)))|30|31|(1:33)|67|68|(0)(0)|18|19)|92|6|7|8|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0100, code lost:
    
        if (r1.sendAnalyticsByUrlInternal(r11, r2, r4, false, r6) == r0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0193, code lost:
    
        if (r1.sendAnalyticsByUrlInternal(r2, r3, r12, true, r6) == r0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0038, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0039, code lost:
    
        r12 = r0;
        r11 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0160 A[Catch: all -> 0x00df, TryCatch #1 {all -> 0x00df, blocks: (B:31:0x0085, B:33:0x0093, B:35:0x0097, B:37:0x009e, B:39:0x00a2, B:41:0x00ac, B:43:0x00b2, B:45:0x00bb, B:47:0x00e4, B:51:0x010c, B:53:0x0110, B:55:0x011b, B:57:0x0124, B:60:0x013a, B:62:0x0140, B:64:0x0148, B:65:0x014e, B:66:0x0153, B:68:0x0154, B:70:0x0160, B:72:0x0168, B:74:0x0179, B:77:0x0183, B:81:0x019b, B:82:0x01a1), top: B:30:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a1 A[Catch: all -> 0x00df, TRY_LEAVE, TryCatch #1 {all -> 0x00df, blocks: (B:31:0x0085, B:33:0x0093, B:35:0x0097, B:37:0x009e, B:39:0x00a2, B:41:0x00ac, B:43:0x00b2, B:45:0x00bb, B:47:0x00e4, B:51:0x010c, B:53:0x0110, B:55:0x011b, B:57:0x0124, B:60:0x013a, B:62:0x0140, B:64:0x0148, B:65:0x014e, B:66:0x0153, B:68:0x0154, B:70:0x0160, B:72:0x0168, B:74:0x0179, B:77:0x0183, B:81:0x019b, B:82:0x01a1), top: B:30:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006d  */
    /* JADX WARN: Type inference failed for: r11v1, types: [Je.a] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleMetricActionByUrlInternal(VideoAsset videoAsset, VideoPerfMetricAction videoPerfMetricAction, d<? super Unit> dVar) {
        VideoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$1 videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$1;
        int i11;
        InterfaceC3394a interfaceC3394a;
        VideoPerfMetricsManagerImpl videoPerfMetricsManagerImpl;
        VideoAsset videoAsset2;
        VideoAsset videoAsset3;
        InterfaceC3394a interfaceC3394a2;
        try {
            if (dVar instanceof VideoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$1) {
                videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$1 = (VideoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$1) dVar;
                int i12 = videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    VideoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$1 videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12 = videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$1;
                    Object obj = videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.label;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        interfaceC3394a = this.mutex;
                        videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.L$0 = this;
                        videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.L$1 = videoAsset;
                        videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.L$2 = videoPerfMetricAction;
                        videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.L$3 = interfaceC3394a;
                        videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.label = 1;
                        if (interfaceC3394a.a(videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12) != aVar) {
                            videoPerfMetricsManagerImpl = this;
                            videoAsset2 = videoAsset;
                        }
                        return aVar;
                    }
                    if (i11 != 1) {
                        if (i11 == 2) {
                            interfaceC3394a2 = (InterfaceC3394a) videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.L$0;
                            Sc.s.b(obj);
                            Unit unit = Unit.f71690a;
                            interfaceC3394a = interfaceC3394a2;
                            interfaceC3394a.c(null);
                            return Unit.f71690a;
                        }
                        if (i11 == 3) {
                            interfaceC3394a2 = (InterfaceC3394a) videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.L$0;
                            Sc.s.b(obj);
                            Unit unit2 = Unit.f71690a;
                            interfaceC3394a = interfaceC3394a2;
                            interfaceC3394a.c(null);
                            return Unit.f71690a;
                        }
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC3394a2 = (InterfaceC3394a) videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.L$0;
                        Sc.s.b(obj);
                        Unit unit3 = Unit.f71690a;
                        interfaceC3394a = interfaceC3394a2;
                        interfaceC3394a.c(null);
                        return Unit.f71690a;
                    }
                    InterfaceC3394a interfaceC3394a3 = (InterfaceC3394a) videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.L$3;
                    videoPerfMetricAction = (VideoPerfMetricAction) videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.L$2;
                    VideoAsset videoAsset4 = (VideoAsset) videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.L$1;
                    VideoPerfMetricsManagerImpl videoPerfMetricsManagerImpl2 = (VideoPerfMetricsManagerImpl) videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.L$0;
                    Sc.s.b(obj);
                    interfaceC3394a = interfaceC3394a3;
                    videoAsset2 = videoAsset4;
                    videoPerfMetricsManagerImpl = videoPerfMetricsManagerImpl2;
                    String castToBaseUrl$video_prodGoogleAllVendorsRelease = VideoAsset.INSTANCE.castToBaseUrl$video_prodGoogleAllVendorsRelease(videoAsset2.getVideoUrl());
                    if (!(videoPerfMetricAction instanceof VideoPerfMetricAction.PutAppMetricAction) || (videoPerfMetricAction instanceof VideoPerfMetricAction.PutServerTimingMetricAction) || (videoPerfMetricAction instanceof VideoPerfMetricAction.PutVideoPlaybackMetricAction)) {
                        videoAsset3 = videoAsset2;
                        if (videoPerfMetricsManagerImpl.videoPerfMetricsManagerHelper.isUrlActive(videoAsset3.getVideoUrl())) {
                            Unit unit4 = Unit.f71690a;
                        } else if (videoPerfMetricsManagerImpl._awaitMetricsMap.containsKey(castToBaseUrl$video_prodGoogleAllVendorsRelease)) {
                            boolean addMetricToMap = videoPerfMetricsManagerImpl.addMetricToMap(videoPerfMetricsManagerImpl._awaitMetricsMap, videoAsset3, videoPerfMetricAction);
                            VideoAssetMap videoAssetMap = videoPerfMetricsManagerImpl._awaitMetricsMap.get(castToBaseUrl$video_prodGoogleAllVendorsRelease);
                            VideoAssetMap.GeneralVideoInfo generalVideoInfoOptional = videoAssetMap != null ? videoAssetMap.getGeneralVideoInfoOptional() : null;
                            if (addMetricToMap && generalVideoInfoOptional != null) {
                                videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.L$0 = interfaceC3394a;
                                videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.L$1 = null;
                                videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.L$2 = null;
                                videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.L$3 = null;
                                videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.label = 2;
                            }
                            interfaceC3394a2 = interfaceC3394a;
                            Unit unit5 = Unit.f71690a;
                            interfaceC3394a = interfaceC3394a2;
                        } else {
                            videoPerfMetricsManagerImpl.addMetricToMap(videoPerfMetricsManagerImpl._metricsMap, videoAsset3, videoPerfMetricAction);
                        }
                        interfaceC3394a.c(null);
                        return Unit.f71690a;
                    }
                    if (videoPerfMetricAction instanceof VideoPerfMetricAction.SendMetricsAction) {
                        VideoAssetMap videoAssetMap2 = videoPerfMetricsManagerImpl._metricsMap.get(castToBaseUrl$video_prodGoogleAllVendorsRelease);
                        if (videoAssetMap2 == null || videoAssetMap2.getIsAllFilesRead() || ((VideoPerfMetricAction.SendMetricsAction) videoPerfMetricAction).isStartupFailed()) {
                            VideoAssetMap.GeneralVideoInfo generalVideoInfo = new VideoAssetMap.GeneralVideoInfo((VideoPerfMetricAction.SendMetricsAction) videoPerfMetricAction, videoPerfMetricsManagerImpl.getCachedUrls(castToBaseUrl$video_prodGoogleAllVendorsRelease));
                            videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.L$0 = interfaceC3394a;
                            videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.L$1 = null;
                            videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.L$2 = null;
                            videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.L$3 = null;
                            videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.label = 3;
                        } else {
                            videoPerfMetricsManagerImpl._awaitMetricsMap.put(castToBaseUrl$video_prodGoogleAllVendorsRelease, new VideoAssetMap(false, new VideoAssetMap.GeneralVideoInfo((VideoPerfMetricAction.SendMetricsAction) videoPerfMetricAction, videoPerfMetricsManagerImpl.getCachedUrls(castToBaseUrl$video_prodGoogleAllVendorsRelease)), videoAssetMap2.getVideoAssetMetricsMap()));
                            videoPerfMetricsManagerImpl._metricsMap.remove(castToBaseUrl$video_prodGoogleAllVendorsRelease);
                            videoPerfMetricsManagerImpl.runPostDelayedMapCheck(videoAsset2);
                        }
                        interfaceC3394a2 = interfaceC3394a;
                        Unit unit22 = Unit.f71690a;
                        interfaceC3394a = interfaceC3394a2;
                        interfaceC3394a.c(null);
                        return Unit.f71690a;
                    }
                    VideoAsset videoAsset5 = videoAsset2;
                    if (videoPerfMetricAction instanceof VideoPerfMetricAction.SendAwaitMetricsManually) {
                        VideoAssetMap videoAssetMap3 = videoPerfMetricsManagerImpl._awaitMetricsMap.get(castToBaseUrl$video_prodGoogleAllVendorsRelease);
                        VideoAssetMap.GeneralVideoInfo generalVideoInfoOptional2 = videoAssetMap3 != null ? videoAssetMap3.getGeneralVideoInfoOptional() : null;
                        if (generalVideoInfoOptional2 != null) {
                            videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.L$0 = interfaceC3394a;
                            videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.L$1 = null;
                            videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.L$2 = null;
                            videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.L$3 = null;
                            videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12.label = 4;
                            if (videoPerfMetricsManagerImpl.sendAnalyticsByUrlInternal(videoAsset5, videoAssetMap3, generalVideoInfoOptional2, true, videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$12) != aVar) {
                                interfaceC3394a2 = interfaceC3394a;
                                Unit unit32 = Unit.f71690a;
                                interfaceC3394a = interfaceC3394a2;
                            }
                        } else {
                            videoPerfMetricsManagerImpl._awaitMetricsMap.remove(castToBaseUrl$video_prodGoogleAllVendorsRelease);
                        }
                    } else {
                        if (!Intrinsics.d(videoPerfMetricAction, VideoPerfMetricAction.ClearUnusedAnalyticAction.INSTANCE)) {
                            throw new o();
                        }
                        videoPerfMetricsManagerImpl._metricsMap.remove(castToBaseUrl$video_prodGoogleAllVendorsRelease);
                    }
                    interfaceC3394a.c(null);
                    return Unit.f71690a;
                    return aVar;
                }
            }
            String castToBaseUrl$video_prodGoogleAllVendorsRelease2 = VideoAsset.INSTANCE.castToBaseUrl$video_prodGoogleAllVendorsRelease(videoAsset2.getVideoUrl());
            if (videoPerfMetricAction instanceof VideoPerfMetricAction.PutAppMetricAction) {
            }
            videoAsset3 = videoAsset2;
            if (videoPerfMetricsManagerImpl.videoPerfMetricsManagerHelper.isUrlActive(videoAsset3.getVideoUrl())) {
            }
            interfaceC3394a.c(null);
            return Unit.f71690a;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            ?? r11 = interfaceC3394a;
            r11.c(null);
            throw th3;
        }
        videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$1 = new VideoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$1(this, dVar);
        VideoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$1 videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$122 = videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$1;
        Object obj2 = videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$122.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = videoPerfMetricsManagerImpl$handleMetricActionByUrlInternal$122.label;
        if (i11 != 0) {
        }
    }

    private final void runPostDelayedMapCheck(VideoAsset videoAsset) {
        String castToBaseUrl$video_prodGoogleAllVendorsRelease = VideoAsset.INSTANCE.castToBaseUrl$video_prodGoogleAllVendorsRelease(videoAsset.getVideoUrl());
        this.awaitMetricsCheckJobMap.put(castToBaseUrl$video_prodGoogleAllVendorsRelease, C10727i.c(getOrCreateScope(), null, null, new VideoPerfMetricsManagerImpl$runPostDelayedMapCheck$job$1(this, videoAsset, castToBaseUrl$video_prodGoogleAllVendorsRelease, null), 3));
    }

    private final Object sendAnalyticsByUrlInternal(VideoAsset videoAsset, VideoAssetMap videoAssetMap, VideoAssetMap.GeneralVideoInfo generalVideoInfo, boolean z11, d<? super Unit> dVar) {
        String castToBaseUrl$video_prodGoogleAllVendorsRelease = VideoAsset.INSTANCE.castToBaseUrl$video_prodGoogleAllVendorsRelease(videoAsset.getVideoUrl());
        Pair<List<z0.b>, List<z0.b>> fillManifestAndFileMetrics = fillManifestAndFileMetrics(videoAsset, videoAssetMap != null ? videoAssetMap.getVideoAssetMetricsMap() : null, generalVideoInfo.getCacheVideoUrls());
        MetricsVideoTraceEntity metricsVideoTraceEntity = new MetricsVideoTraceEntity(generalVideoInfo.getSendMetricsActionInfo().getPlaybackMetrics(), fillManifestAndFileMetrics.a(), fillManifestAndFileMetrics.b(), generalVideoInfo.getSendMetricsActionInfo().getVideoTraceEntity());
        if (z11) {
            this._awaitMetricsMap.remove(castToBaseUrl$video_prodGoogleAllVendorsRelease);
            B0 remove = this.awaitMetricsCheckJobMap.remove(castToBaseUrl$video_prodGoogleAllVendorsRelease);
            if (remove != null) {
                remove.j(null);
            }
        } else {
            this._metricsMap.remove(castToBaseUrl$video_prodGoogleAllVendorsRelease);
        }
        VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper = this.videoPerfMetricsManagerHelper;
        String videoUrl = videoAsset.getVideoUrl();
        String widgetName = generalVideoInfo.getSendMetricsActionInfo().getVideoTraceEntity().getWidgetName();
        if (widgetName == null) {
            widgetName = "UNSPECIFIED";
        }
        videoPerfMetricsManagerHelper.removeVideoUrlFromActive(videoUrl, widgetName, new VideoPerfMetricsManagerImpl$sendAnalyticsByUrlInternal$2(this, videoAsset));
        Object addVideoMetricsToTrace = addVideoMetricsToTrace(metricsVideoTraceEntity, dVar);
        return addVideoMetricsToTrace == a.COROUTINE_SUSPENDED ? addVideoMetricsToTrace : Unit.f71690a;
    }

    @Override // ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager
    public void extractAndPutServerTimingMetrics(@NotNull VideoAsset videoAsset, @NotNull z headers) {
        Intrinsics.checkNotNullParameter(videoAsset, "videoAsset");
        Intrinsics.checkNotNullParameter(headers, "headers");
        C10727i.c(getOrCreateScope(), null, null, new VideoPerfMetricsManagerImpl$extractAndPutServerTimingMetrics$1(headers, this, videoAsset, null), 3);
    }

    @Override // ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager
    public void handleMetricActionByUrl(@NotNull VideoAsset videoAsset, @NotNull VideoPerfMetricAction metricType) {
        Intrinsics.checkNotNullParameter(videoAsset, "videoAsset");
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        C10727i.c(getOrCreateScope(), null, null, new VideoPerfMetricsManagerImpl$handleMetricActionByUrl$1(this, videoAsset, metricType, null), 3);
    }

    @Override // ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager
    public void releaseCachedUrls(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.cacheTransferListener.removeCacheByBaseUrl(VideoAsset.INSTANCE.castToBaseUrl$video_prodGoogleAllVendorsRelease(url));
    }

    @Override // ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager
    public void sendAnalyticsByUrl(@NotNull VideoAsset videoAsset, @NotNull VideoPerfMetricAction.PutVideoPlaybackMetricAction playbackMetrics, @NotNull VideoTraceEntity videoTraceEntity, @NotNull PlayerNamespace playerNamespace) {
        Intrinsics.checkNotNullParameter(videoAsset, "videoAsset");
        Intrinsics.checkNotNullParameter(playbackMetrics, "playbackMetrics");
        Intrinsics.checkNotNullParameter(videoTraceEntity, "videoTraceEntity");
        Intrinsics.checkNotNullParameter(playerNamespace, "playerNamespace");
        handleMetricActionByUrl(videoAsset, new VideoPerfMetricAction.SendMetricsAction(videoTraceEntity, playbackMetrics, playerNamespace));
    }
}
