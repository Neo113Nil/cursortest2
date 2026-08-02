package ru.ozon.app.android.network;

import We.C4871m;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lru/ozon/app/android/network/CustomConnectionPoolProvider;", "", "<init>", "()V", "", "getDurationInMinutes", "()I", "getPoolSize", "LWe/m;", "provideConnectionPool", "()LWe/m;", "Companion", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CustomConnectionPoolProvider {
    private final int getDurationInMinutes() {
        return 5;
    }

    private final int getPoolSize() {
        return 5;
    }

    @NotNull
    public final C4871m provideConnectionPool() {
        int durationInMinutes = getDurationInMinutes();
        int poolSize = getPoolSize();
        long j11 = durationInMinutes;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        return new C4871m(poolSize, j11);
    }
}
