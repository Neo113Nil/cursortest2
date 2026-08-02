package ru.ozon.app.android.pikazon.performance;

import Qj0.r0;
import We.B;
import We.G;
import We.L;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.interceptors.BXInterceptor;
import ru.ozon.app.android.pikazon.glide.loaders.PikazonUrlUUID;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pikazon/performance/PikazonPerformanceTraceKeyInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "<init>", "()V", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "pikazon_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PikazonPerformanceTraceKeyInterceptor extends BXInterceptor {
    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        PikazonUrlUUID pikazonUrlUUID = (PikazonUrlUUID) request.i(PikazonUrlUUID.class);
        String uuid = pikazonUrlUUID != null ? pikazonUrlUUID.getUuid() : null;
        if (uuid != null) {
            G.a aVar = new G.a(request);
            aVar.i(r0.class, new r0(uuid));
            request = aVar.b();
        }
        return chain.proceed(request);
    }
}
