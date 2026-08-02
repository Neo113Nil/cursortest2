package ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/TimerVO;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lorg/joda/time/DateTime;", "endTime", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lorg/joda/time/DateTime;", "getEndTime", "()Lorg/joda/time/DateTime;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TimerVO {

    @NotNull
    private final DateTime endTime;

    @NotNull
    private final String title;

    public TimerVO(@NotNull String title, @NotNull DateTime endTime) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        this.title = title;
        this.endTime = endTime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerVO)) {
            return false;
        }
        TimerVO timerVO = (TimerVO) other;
        return Intrinsics.d(this.title, timerVO.title) && Intrinsics.d(this.endTime, timerVO.endTime);
    }

    @NotNull
    public final DateTime getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.endTime.hashCode() + (this.title.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "TimerVO(title=" + this.title + ", endTime=" + this.endTime + ")";
    }
}
