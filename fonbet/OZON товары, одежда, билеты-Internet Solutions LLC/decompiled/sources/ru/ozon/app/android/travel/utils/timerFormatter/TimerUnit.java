package ru.ozon.app.android.travel.utils.timerFormatter;

import V.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/utils/timerFormatter/TimerUnit;", "", "format", "", "divider", "", "bound", "<init>", "(Ljava/lang/String;JLjava/lang/Long;)V", "Ljava/lang/Long;", "time", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimerUnit {
    private final Long bound;
    private final long divider;

    @NotNull
    private final String format;

    public TimerUnit(@NotNull String format, long j11, Long l11) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.format = format;
        this.divider = j11;
        this.bound = l11;
    }

    @NotNull
    public final String format(long time) {
        long j11 = time / this.divider;
        Long l11 = this.bound;
        if (l11 != null) {
            j11 %= l11.longValue();
        }
        return e.b(new Object[]{Long.valueOf(j11)}, 1, this.format, "format(...)");
    }
}
