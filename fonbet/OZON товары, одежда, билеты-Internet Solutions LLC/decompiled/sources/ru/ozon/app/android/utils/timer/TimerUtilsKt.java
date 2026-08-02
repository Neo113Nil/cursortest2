package ru.ozon.app.android.utils.timer;

import Ej.b;
import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.timer.TimerType;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0004¨\u0006\t"}, d2 = {"toTwoDigitString", "", "", "formatTime", "Lru/ozon/app/android/utils/timer/TimerTick;", "formatTimeByType", "type", "Lru/ozon/app/android/utils/timer/TimerType;", "getTimerType", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimerUtilsKt {
    @NotNull
    public static final String formatTime(@NotNull TimerTick timerTick) {
        Intrinsics.checkNotNullParameter(timerTick, "<this>");
        return formatTimeByType(timerTick, getTimerType(timerTick));
    }

    @NotNull
    public static final String formatTimeByType(@NotNull TimerTick timerTick, @NotNull TimerType type) {
        Intrinsics.checkNotNullParameter(timerTick, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        if (type instanceof TimerType.Days) {
            return timerTick.days();
        }
        if (Intrinsics.d(type, TimerType.Hours.INSTANCE)) {
            return timerTick.timeWithHours();
        }
        if (Intrinsics.d(type, TimerType.Minutes.INSTANCE)) {
            return timerTick.time();
        }
        throw new o();
    }

    @NotNull
    public static final TimerType getTimerType(@NotNull TimerTick timerTick) {
        Intrinsics.checkNotNullParameter(timerTick, "<this>");
        return timerTick.getDays() >= 2 ? new TimerType.Days(timerTick.getDays()) : timerTick.getHours() > 0 ? TimerType.Hours.INSTANCE : TimerType.Minutes.INSTANCE;
    }

    @NotNull
    public static final String toTwoDigitString(int i11) {
        return (i11 < 0 || i11 >= 10) ? i11 < 0 ? "00" : String.valueOf(i11) : b.a(i11, "0");
    }
}
