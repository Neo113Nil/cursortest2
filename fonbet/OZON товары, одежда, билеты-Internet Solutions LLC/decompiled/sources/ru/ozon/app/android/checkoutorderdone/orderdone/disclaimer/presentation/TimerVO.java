package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.presentation;

import Ak.C2436a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.data.TimerPosition;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/TimerVO;", "", "", "deadline", "", "textColor", "textStyle", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/data/TimerPosition;", "position", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/data/TimerPosition;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getDeadline", "()J", "Ljava/lang/String;", "getTextColor", "getTextStyle", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/data/TimerPosition;", "getPosition", "()Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/data/TimerPosition;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TimerVO {
    private final long deadline;

    @NotNull
    private final TimerPosition position;
    private final String textColor;
    private final String textStyle;

    public TimerVO(long j11, String str, String str2, @NotNull TimerPosition position) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.deadline = j11;
        this.textColor = str;
        this.textStyle = str2;
        this.position = position;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerVO)) {
            return false;
        }
        TimerVO timerVO = (TimerVO) other;
        return this.deadline == timerVO.deadline && Intrinsics.d(this.textColor, timerVO.textColor) && Intrinsics.d(this.textStyle, timerVO.textStyle) && this.position == timerVO.position;
    }

    public final long getDeadline() {
        return this.deadline;
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

    public int hashCode() {
        int hashCode = Long.hashCode(this.deadline) * 31;
        String str = this.textColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.textStyle;
        return this.position.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.deadline;
        String str = this.textColor;
        String str2 = this.textStyle;
        TimerPosition timerPosition = this.position;
        StringBuilder c11 = C2436a.c(j11, "TimerVO(deadline=", ", textColor=", str);
        c11.append(", textStyle=");
        c11.append(str2);
        c11.append(", position=");
        c11.append(timerPosition);
        c11.append(")");
        return c11.toString();
    }
}
