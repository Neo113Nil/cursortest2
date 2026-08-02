package K6;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public interface b {
    @D6.d
    default long now() {
        return TimeUnit.NANOSECONDS.toMillis(nowNanos());
    }

    @D6.d
    long nowNanos();
}
