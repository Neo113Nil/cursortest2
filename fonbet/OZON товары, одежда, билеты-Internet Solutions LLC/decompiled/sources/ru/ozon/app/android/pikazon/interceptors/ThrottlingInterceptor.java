package ru.ozon.app.android.pikazon.interceptors;

import We.B;
import We.L;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pikazon/interceptors/ThrottlingInterceptor;", "LWe/B;", "", "throttleTime", "<init>", "(J)V", "LWe/B$a;", "chain", "LWe/L;", "intercept", "(LWe/B$a;)LWe/L;", "J", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ThrottlingInterceptor implements B {
    private final long throttleTime;

    public ThrottlingInterceptor(long j11) {
        this.throttleTime = j11;
    }

    @Override // We.B
    @NotNull
    public L intercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        try {
            Thread.sleep(this.throttleTime);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        return chain.proceed(chain.request());
    }
}
