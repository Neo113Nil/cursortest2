package ru.ozon.app.android.video.manager;

import We.E;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import p3.p;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp3/p;", "invoke", "()Lp3/p;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ExoManagerWithCacheImpl$httpDataSourceFactory$2 extends AbstractC7737t implements Function0<p> {
    final /* synthetic */ FeatureChecker $featureChecker;
    final /* synthetic */ VideoPerfMetricsManager $videoPerfMetricsManager;
    final /* synthetic */ ExoManagerWithCacheImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExoManagerWithCacheImpl$httpDataSourceFactory$2(ExoManagerWithCacheImpl exoManagerWithCacheImpl, FeatureChecker featureChecker, VideoPerfMetricsManager videoPerfMetricsManager) {
        super(0);
        this.this$0 = exoManagerWithCacheImpl;
        this.$featureChecker = featureChecker;
        this.$videoPerfMetricsManager = videoPerfMetricsManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final p invoke() {
        E e11;
        e11 = this.this$0.okHttpClient;
        return ExoManagerUtilsKt.getHttpDataSourceFactory(e11, this.$featureChecker, this.$videoPerfMetricsManager);
    }
}
