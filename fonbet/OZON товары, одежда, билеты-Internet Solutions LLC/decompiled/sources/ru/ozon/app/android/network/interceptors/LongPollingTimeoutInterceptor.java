package ru.ozon.app.android.network.interceptors;

import Ib.a;
import We.B;
import We.G;
import We.L;
import cf.C5824e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Invocation;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.auth.flags.NetworkLongTimeoutSec;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/network/interceptors/LongPollingTimeoutInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "LIb/a;", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(LIb/a;)V", "LWe/G;", "", "isLongPolling", "(LWe/G;)Z", "LWe/B$a;", "", "setLongPollingTimeout", "(LWe/B$a;)V", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "LIb/a;", "", "longTimeoutSec", "Ljava/lang/Long;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LongPollingTimeoutInterceptor extends BXInterceptor {

    @NotNull
    private final a<FeatureService> featureService;
    private Long longTimeoutSec;

    public LongPollingTimeoutInterceptor(@NotNull a<FeatureService> featureService) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.featureService = featureService;
    }

    private final boolean isLongPolling(G g10) {
        Method method;
        Annotation[] annotations;
        if (g10.i(LongPollingTag.class) != null) {
            return true;
        }
        Invocation invocation = (Invocation) g10.i(Invocation.class);
        if (invocation != null && (method = invocation.method()) != null && (annotations = method.getAnnotations()) != null) {
            for (Annotation annotation : annotations) {
                if (annotation instanceof LongPollingAnnotation) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void setLongPollingTimeout(B.a aVar) {
        long longKey;
        C5824e.c timeout = aVar.call().timeout();
        if (timeout == null) {
            timeout = null;
        }
        if (timeout != null) {
            timeout.s();
            Long l11 = this.longTimeoutSec;
            if (l11 != null) {
                longKey = l11.longValue();
            } else {
                longKey = this.featureService.get().getLongKey(NetworkLongTimeoutSec.INSTANCE);
                this.longTimeoutSec = Long.valueOf(longKey);
            }
            timeout.g(longKey, TimeUnit.SECONDS);
            timeout.r();
        }
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        if (isLongPolling(request)) {
            setLongPollingTimeout(chain);
        }
        return chain.proceed(request);
    }
}
