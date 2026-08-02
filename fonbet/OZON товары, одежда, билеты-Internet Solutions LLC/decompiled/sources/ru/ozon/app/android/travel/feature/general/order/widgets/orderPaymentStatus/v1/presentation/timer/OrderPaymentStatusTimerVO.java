package ru.ozon.app.android.travel.feature.general.order.widgets.orderPaymentStatus.v1.presentation.timer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/presentation/timer/OrderPaymentStatusTimerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lorg/joda/time/DateTime;", "endTime", "deadline", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(JLorg/joda/time/DateTime;Ljava/lang/Long;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lorg/joda/time/DateTime;", "getEndTime", "()Lorg/joda/time/DateTime;", "Ljava/lang/Long;", "getDeadline", "()Ljava/lang/Long;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderPaymentStatusTimerVO implements c {

    @NotNull
    private final AtomAction action;
    private final Long deadline;
    private final DateTime endTime;
    private final long id;

    public OrderPaymentStatusTimerVO(long j11, DateTime dateTime, Long l11, @NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.id = j11;
        this.endTime = dateTime;
        this.deadline = l11;
        this.action = action;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderPaymentStatusTimerVO)) {
            return false;
        }
        OrderPaymentStatusTimerVO orderPaymentStatusTimerVO = (OrderPaymentStatusTimerVO) other;
        return this.id == orderPaymentStatusTimerVO.id && Intrinsics.d(this.endTime, orderPaymentStatusTimerVO.endTime) && Intrinsics.d(this.deadline, orderPaymentStatusTimerVO.deadline) && Intrinsics.d(this.action, orderPaymentStatusTimerVO.action);
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    public final Long getDeadline() {
        return this.deadline;
    }

    public final DateTime getEndTime() {
        return this.endTime;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        DateTime dateTime = this.endTime;
        int hashCode2 = (hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Long l11 = this.deadline;
        return this.action.hashCode() + ((hashCode2 + (l11 != null ? l11.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "OrderPaymentStatusTimerVO(id=" + this.id + ", endTime=" + this.endTime + ", deadline=" + this.deadline + ", action=" + this.action + ")";
    }
}
