package ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.model;

import Ak.C2436a;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/TimerVO;", "", "", "timestampEnd", "", "timerTextColor", "timerBackgroundColor", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestampEnd", "()J", "Ljava/lang/String;", "getTimerTextColor", "getTimerBackgroundColor", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TimerVO {
    private final String timerBackgroundColor;
    private final String timerTextColor;
    private final long timestampEnd;

    public TimerVO(long j11, String str, String str2) {
        this.timestampEnd = j11;
        this.timerTextColor = str;
        this.timerBackgroundColor = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerVO)) {
            return false;
        }
        TimerVO timerVO = (TimerVO) other;
        return this.timestampEnd == timerVO.timestampEnd && Intrinsics.d(this.timerTextColor, timerVO.timerTextColor) && Intrinsics.d(this.timerBackgroundColor, timerVO.timerBackgroundColor);
    }

    public final String getTimerBackgroundColor() {
        return this.timerBackgroundColor;
    }

    public final String getTimerTextColor() {
        return this.timerTextColor;
    }

    public final long getTimestampEnd() {
        return this.timestampEnd;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.timestampEnd) * 31;
        String str = this.timerTextColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.timerBackgroundColor;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return C6594f.a(", timerBackgroundColor=", this.timerBackgroundColor, ")", C2436a.c(this.timestampEnd, "TimerVO(timestampEnd=", ", timerTextColor=", this.timerTextColor));
    }
}
