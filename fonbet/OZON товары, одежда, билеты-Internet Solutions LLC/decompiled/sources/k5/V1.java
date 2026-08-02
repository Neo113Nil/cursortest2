package k5;

import androidx.annotation.NonNull;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
final class V1 extends D0<String> {
    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        return String.valueOf(TimeZone.getDefault().inDaylightTime(new Date()) ? TimeUnit.MILLISECONDS.toMinutes(r0.getDSTSavings()) : 0L);
    }
}
