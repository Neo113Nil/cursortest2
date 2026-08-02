package ru.ozon.app.android.video.manager;

import F3.InterfaceC3018x;
import Sc.InterfaceC4008j;
import Sc.k;
import We.E;
import android.content.Context;
import android.net.Uri;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import j3.C7275q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p3.j;
import p3.p;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.video.player.performance.PlayerNamespaceKt;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000f\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/video/manager/ExoManagerLiveImpl;", "Lru/ozon/app/android/video/manager/ExoManagerLive;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LWe/E;", "okHttpClient", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "videoPerfMetricsManager", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/network/abtool/FeatureChecker;LWe/E;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;)V", "", "videoUrl", "Lru/ozon/app/android/video/player/performance/PlayerWidgetInfo;", "widgetInfo", "LF3/x;", "getMediaSource", "(Ljava/lang/String;Ljava/lang/String;)LF3/x;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "LWe/E;", "Lp3/p;", "httpDataSourceFactory$delegate", "LSc/j;", "getHttpDataSourceFactory", "()Lp3/p;", "httpDataSourceFactory", "Lp3/j$a;", "defaultDataSourceFactory$delegate", "getDefaultDataSourceFactory", "()Lp3/j$a;", "defaultDataSourceFactory", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoManagerLiveImpl implements ExoManagerLive {

    /* renamed from: defaultDataSourceFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultDataSourceFactory;

    @NotNull
    private final FeatureChecker featureChecker;

    /* renamed from: httpDataSourceFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j httpDataSourceFactory;

    @NotNull
    private final E okHttpClient;

    public ExoManagerLiveImpl(@NotNull Context context, @NotNull FeatureChecker featureChecker, @NotNull E okHttpClient, @NotNull VideoPerfMetricsManager videoPerfMetricsManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(videoPerfMetricsManager, "videoPerfMetricsManager");
        this.featureChecker = featureChecker;
        this.okHttpClient = okHttpClient;
        this.httpDataSourceFactory = k.b(new ExoManagerLiveImpl$httpDataSourceFactory$2(this, videoPerfMetricsManager));
        this.defaultDataSourceFactory = k.b(new ExoManagerLiveImpl$defaultDataSourceFactory$2(context, this));
    }

    private final j.a getDefaultDataSourceFactory() {
        return (j.a) this.defaultDataSourceFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p getHttpDataSourceFactory() {
        return (p) this.httpDataSourceFactory.getValue();
    }

    @Override // ru.ozon.app.android.video.manager.ExoManager
    @NotNull
    public InterfaceC3018x getMediaSource(@NotNull String videoUrl, String widgetInfo) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Uri parse = Uri.parse(videoUrl);
        C7275q.a aVar = new C7275q.a();
        aVar.i(parse);
        aVar.h(PlayerNamespaceKt.mapToPlayerNamespace(widgetInfo));
        C7275q a11 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
        HlsMediaSource createMediaSource = new HlsMediaSource.Factory(getDefaultDataSourceFactory()).createMediaSource(a11);
        Intrinsics.checkNotNullExpressionValue(createMediaSource, "createMediaSource(...)");
        return createMediaSource;
    }
}
