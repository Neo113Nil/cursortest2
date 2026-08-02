package ru.ozon.app.android.network.cronet;

import We.B;
import We.C4862d;
import We.E;
import We.InterfaceC4875q;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import ei0.InterfaceC6369b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.cronet.metrics.BaseCronetMetricsListener;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001Je\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/network/cronet/CronetOkHttpClientProvider;", "", "LWe/E;", "okHttpClient", "Lru/ozon/app/android/network/cronet/CronetConfig;", "cronetConfig", "LWe/q;", "clientCookieJar", "LWe/d;", "clientCache", "LWe/B;", "encodingInterceptor", "Lru/ozon/app/android/network/cronet/metrics/BaseCronetMetricsListener;", "metricListener", "Lru/ozon/app/android/network/cronet/CronetEventListenerFactory;", "cronetEventListenerFactory", "Lei0/b;", "ozonTracker", "provide", "(LWe/E;Lru/ozon/app/android/network/cronet/CronetConfig;LWe/q;LWe/d;LWe/B;Lru/ozon/app/android/network/cronet/metrics/BaseCronetMetricsListener;Lru/ozon/app/android/network/cronet/CronetEventListenerFactory;Lei0/b;)LWe/E;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CronetOkHttpClientProvider {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ E provide$default(CronetOkHttpClientProvider cronetOkHttpClientProvider, E e11, CronetConfig cronetConfig, InterfaceC4875q interfaceC4875q, C4862d c4862d, B b11, BaseCronetMetricsListener baseCronetMetricsListener, CronetEventListenerFactory cronetEventListenerFactory, InterfaceC6369b interfaceC6369b, int i11, Object obj) {
            InterfaceC6369b interfaceC6369b2;
            CronetOkHttpClientProvider cronetOkHttpClientProvider2;
            E e12;
            CronetConfig cronetConfig2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: provide");
            }
            if ((i11 & 4) != 0) {
                interfaceC4875q = InterfaceC4875q.f33801a;
            }
            InterfaceC4875q interfaceC4875q2 = interfaceC4875q;
            C4862d c4862d2 = (i11 & 8) != 0 ? null : c4862d;
            B b12 = (i11 & 16) != 0 ? null : b11;
            BaseCronetMetricsListener baseCronetMetricsListener2 = (i11 & 32) != 0 ? null : baseCronetMetricsListener;
            CronetEventListenerFactory cronetEventListenerFactory2 = (i11 & 64) != 0 ? null : cronetEventListenerFactory;
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                interfaceC6369b2 = null;
                cronetOkHttpClientProvider2 = cronetOkHttpClientProvider;
                cronetConfig2 = cronetConfig;
                e12 = e11;
            } else {
                interfaceC6369b2 = interfaceC6369b;
                cronetOkHttpClientProvider2 = cronetOkHttpClientProvider;
                e12 = e11;
                cronetConfig2 = cronetConfig;
            }
            return cronetOkHttpClientProvider2.provide(e12, cronetConfig2, interfaceC4875q2, c4862d2, b12, baseCronetMetricsListener2, cronetEventListenerFactory2, interfaceC6369b2);
        }
    }

    @NotNull
    E provide(@NotNull E okHttpClient, @NotNull CronetConfig cronetConfig, @NotNull InterfaceC4875q clientCookieJar, C4862d clientCache, B encodingInterceptor, BaseCronetMetricsListener metricListener, CronetEventListenerFactory cronetEventListenerFactory, InterfaceC6369b ozonTracker);
}
