package ru.ozon.app.android.network.cronet.metrics;

import Ja.i;
import Ma.b;
import Ma.c;
import Ma.d;
import Sc.InterfaceC4008j;
import Sc.k;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/network/cronet/metrics/CronetMetricListenersManager;", "LMa/c;", "<init>", "()V", "LMa/b;", "metrics", "LJa/i;", "request", "LMa/d;", "response", "", "onMetricsCollected", "(LMa/b;LJa/i;LMa/d;)V", "Lru/ozon/app/android/network/cronet/metrics/BaseCronetMetricsListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, ProductAction.ACTION_ADD, "(Lru/ozon/app/android/network/cronet/metrics/BaseCronetMetricsListener;)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners$delegate", "LSc/j;", "getListeners", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CronetMetricListenersManager implements c {

    /* renamed from: listeners$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j listeners = k.b(CronetMetricListenersManager$listeners$2.INSTANCE);

    private final CopyOnWriteArrayList<BaseCronetMetricsListener> getListeners() {
        return (CopyOnWriteArrayList) this.listeners.getValue();
    }

    public final void add(@NotNull BaseCronetMetricsListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getListeners().add(listener);
    }

    @Override // Ma.c
    public void onMetricsCollected(@NotNull b metrics, @NotNull i request, d response) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(request, "request");
        CronetMetricsKey cronetMetricsKey = (CronetMetricsKey) request.h(CronetMetricsPayloadKey.INSTANCE);
        if (cronetMetricsKey == null) {
            return;
        }
        for (BaseCronetMetricsListener baseCronetMetricsListener : getListeners()) {
            if (baseCronetMetricsListener.canHandle(cronetMetricsKey)) {
                baseCronetMetricsListener.onMetricsCollected(metrics, request, response);
            }
        }
    }
}
