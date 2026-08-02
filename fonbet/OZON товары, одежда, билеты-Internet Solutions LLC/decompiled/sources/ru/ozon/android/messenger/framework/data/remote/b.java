package ru.ozon.android.messenger.framework.data.remote;

import We.B;
import We.G;
import We.L;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b implements B {
    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        Integer w02;
        Integer w03;
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        String d11 = chain.request().d("READ_TIMEOUT");
        int readTimeoutMillis = (d11 == null || (w03 = h.w0(d11)) == null) ? chain.readTimeoutMillis() : w03.intValue();
        String d12 = chain.request().d("WRITE_TIMEOUT");
        int writeTimeoutMillis = (d12 == null || (w02 = h.w0(d12)) == null) ? chain.writeTimeoutMillis() : w02.intValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return chain.withReadTimeout(readTimeoutMillis, timeUnit).withWriteTimeout(writeTimeoutMillis, timeUnit).proceed(request);
    }
}
