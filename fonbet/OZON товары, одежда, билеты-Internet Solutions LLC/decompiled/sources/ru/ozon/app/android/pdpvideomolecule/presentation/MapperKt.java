package ru.ozon.app.android.pdpvideomolecule.presentation;

import V.e;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0002¨\u0006\t"}, d2 = {"toTimeString", "", "", "showHours", "", "toTimeStringMinutes", "toTimeStringHours", "roundSeconds", "", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MapperKt {
    private static final int roundSeconds(long j11) {
        return j11 % 1000 >= 500 ? 1 : 0;
    }

    @NotNull
    public static final String toTimeString(long j11, boolean z11) {
        return z11 ? toTimeStringHours(j11) : toTimeStringMinutes(j11);
    }

    private static final String toTimeStringHours(long j11) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j11);
        long minutes = timeUnit.toMinutes(j11) - TimeUnit.HOURS.toMinutes(hours);
        return e.b(new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf((timeUnit.toSeconds(j11) - TimeUnit.MINUTES.toSeconds(minutes)) + roundSeconds(j11))}, 3, "%01d:%02d:%02d", "format(...)");
    }

    private static final String toTimeStringMinutes(long j11) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long minutes = timeUnit.toMinutes(j11);
        return e.b(new Object[]{Long.valueOf(minutes), Long.valueOf((timeUnit.toSeconds(j11) - TimeUnit.MINUTES.toSeconds(minutes)) + roundSeconds(j11))}, 2, "%02d:%02d", "format(...)");
    }
}
