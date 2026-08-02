package k5;

import androidx.annotation.NonNull;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: k5.e2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7510e2 extends D0<String> {
    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        return Long.toString(TimeUnit.MILLISECONDS.toMinutes(TimeZone.getDefault().getOffset(Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.getDefault()).getTimeInMillis())));
    }
}
