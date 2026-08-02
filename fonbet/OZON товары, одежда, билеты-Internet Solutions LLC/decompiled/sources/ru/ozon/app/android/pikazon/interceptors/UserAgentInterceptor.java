package ru.ozon.app.android.pikazon.interceptors;

import Ek.a;
import We.B;
import We.G;
import We.L;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pikazon/interceptors/UserAgentInterceptor;", "LWe/B;", "", "userAgent", "<init>", "(Ljava/lang/String;)V", "LWe/B$a;", "chain", "LWe/L;", "intercept", "(LWe/B$a;)LWe/L;", "Ljava/lang/String;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UserAgentInterceptor implements B {

    @NotNull
    private final String userAgent;

    public UserAgentInterceptor(@NotNull String userAgent) {
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        this.userAgent = userAgent;
    }

    @Override // We.B
    @NotNull
    public L intercept(@NotNull B.a chain) throws IOException {
        G.a aVar = new G.a(a.a(chain, "chain"));
        aVar.d("User-Agent", this.userAgent);
        return chain.proceed(aVar.b());
    }
}
