package k5;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* renamed from: k5.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7491a extends D0<String> {
    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        return String.valueOf(TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime()));
    }
}
