package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.data;

import Ak.C2436a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/data/Timer;", "", "timeLeft", "", "textColor", "", "textStyle", "position", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/data/TimerPosition;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/data/TimerPosition;)V", "getTimeLeft", "()J", "getTextColor", "()Ljava/lang/String;", "getTextStyle", "getPosition", "()Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/data/TimerPosition;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Timer {
    public static final int $stable = 0;

    @NotNull
    private final TimerPosition position;
    private final String textColor;
    private final String textStyle;
    private final long timeLeft;

    public Timer(long j11, String str, String str2, @NotNull TimerPosition position) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.timeLeft = j11;
        this.textColor = str;
        this.textStyle = str2;
        this.position = position;
    }

    public static /* synthetic */ Timer copy$default(Timer timer, long j11, String str, String str2, TimerPosition timerPosition, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = timer.timeLeft;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = timer.textColor;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = timer.textStyle;
        }
        String str4 = str2;
        if ((i11 & 8) != 0) {
            timerPosition = timer.position;
        }
        return timer.copy(j12, str3, str4, timerPosition);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimeLeft() {
        return this.timeLeft;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTextStyle() {
        return this.textStyle;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TimerPosition getPosition() {
        return this.position;
    }

    @NotNull
    public final Timer copy(long timeLeft, String textColor, String textStyle, @NotNull TimerPosition position) {
        Intrinsics.checkNotNullParameter(position, "position");
        return new Timer(timeLeft, textColor, textStyle, position);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Timer)) {
            return false;
        }
        Timer timer = (Timer) other;
        return this.timeLeft == timer.timeLeft && Intrinsics.d(this.textColor, timer.textColor) && Intrinsics.d(this.textStyle, timer.textStyle) && this.position == timer.position;
    }

    @NotNull
    public final TimerPosition getPosition() {
        return this.position;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final String getTextStyle() {
        return this.textStyle;
    }

    public final long getTimeLeft() {
        return this.timeLeft;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.timeLeft) * 31;
        String str = this.textColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.textStyle;
        return this.position.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.timeLeft;
        String str = this.textColor;
        String str2 = this.textStyle;
        TimerPosition timerPosition = this.position;
        StringBuilder c11 = C2436a.c(j11, "Timer(timeLeft=", ", textColor=", str);
        c11.append(", textStyle=");
        c11.append(str2);
        c11.append(", position=");
        c11.append(timerPosition);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ Timer(long j11, String str, String str2, TimerPosition timerPosition, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, str, str2, (i11 & 8) != 0 ? TimerPosition.SUBTITLE : timerPosition);
    }
}
