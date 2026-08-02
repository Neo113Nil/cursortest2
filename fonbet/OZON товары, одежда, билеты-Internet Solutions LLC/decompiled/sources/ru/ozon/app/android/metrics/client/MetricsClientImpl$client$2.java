package ru.ozon.app.android.metrics.client;

import Qj0.D;
import Qj0.H;
import We.E;
import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.flags.BxSdkOzonNetworkEnabledFlag;
import ru.ozon.app.android.network.gnc.GncOkHttpClientBuilder;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LWe/E;", "invoke", "()LWe/E;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class MetricsClientImpl$client$2 extends AbstractC7737t implements Function0<E> {
    final /* synthetic */ E $client;
    final /* synthetic */ FeatureChecker $featureChecker;
    final /* synthetic */ GncOkHttpClientBuilder $gncOkHttpClientBuilder;
    final /* synthetic */ MetricsClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MetricsClientImpl$client$2(FeatureChecker featureChecker, GncOkHttpClientBuilder gncOkHttpClientBuilder, MetricsClientImpl metricsClientImpl, E e11) {
        super(0);
        this.$featureChecker = featureChecker;
        this.$gncOkHttpClientBuilder = gncOkHttpClientBuilder;
        this.this$0 = metricsClientImpl;
        this.$client = e11;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final E invoke() {
        E modify;
        Application application;
        if (!this.$featureChecker.isEnabled(BxSdkOzonNetworkEnabledFlag.INSTANCE)) {
            modify = this.this$0.modify(this.$client);
            return modify;
        }
        GncOkHttpClientBuilder addAppInterceptor = this.$gncOkHttpClientBuilder.deepCopy().addAppInterceptor(new H(), 0);
        application = this.this$0.application;
        return addAppInterceptor.eventListenerFactory(new D(application, null)).build();
    }
}
