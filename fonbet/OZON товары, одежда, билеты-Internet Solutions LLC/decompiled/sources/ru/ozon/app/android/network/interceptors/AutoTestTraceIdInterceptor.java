package ru.ozon.app.android.network.interceptors;

import Ib.a;
import Lm0.a;
import We.B;
import We.G;
import We.L;
import We.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.interceptors.dependencies.AutoTestTraceIdInterceptorDependencies;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/network/interceptors/AutoTestTraceIdInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "LIb/a;", "Lru/ozon/app/android/network/interceptors/dependencies/AutoTestTraceIdInterceptorDependencies;", "dependencies", "<init>", "(LIb/a;)V", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "LIb/a;", "Companion", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutoTestTraceIdInterceptor extends BXInterceptor {

    @NotNull
    private final a<AutoTestTraceIdInterceptorDependencies> dependencies;

    public AutoTestTraceIdInterceptor(@NotNull a<AutoTestTraceIdInterceptorDependencies> dependencies) {
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        this.dependencies = dependencies;
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        z r11;
        String c11;
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        L proceed = chain.proceed(request);
        if (this.dependencies.get().isAutoTestUser() && (c11 = (r11 = proceed.r()).c("x-o3-trace-id")) != null) {
            a.b bVar = Lm0.a.f17149a;
            bVar.b("AutoTest");
            bVar.i("composerTraceId: { request_url: %s, trace_id: %s, page_type: %s }", request.j(), c11, r11.c("x-o3-page-type"));
        }
        return proceed;
    }
}
