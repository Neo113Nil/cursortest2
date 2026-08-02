package ru.ozon.app.android.orderdetails.timeLeft.presentation;

import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/orderdetails/timeLeft/presentation/TimeLeftVO;", "Ll20/c;", "", "id", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "buttons", "Lru/ozon/app/android/orderdetails/timeLeft/presentation/TimerVO;", DynamicElementDTO.TIMER, "<init>", "(JLjava/util/List;Lru/ozon/app/android/orderdetails/timeLeft/presentation/TimerVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "Lru/ozon/app/android/orderdetails/timeLeft/presentation/TimerVO;", "getTimer", "()Lru/ozon/app/android/orderdetails/timeLeft/presentation/TimerVO;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TimeLeftVO implements c {
    private final List<AtomDTO> buttons;
    private final long id;

    @NotNull
    private final TimerVO timer;

    /* JADX WARN: Multi-variable type inference failed */
    public TimeLeftVO(long j11, List<? extends AtomDTO> list, @NotNull TimerVO timer) {
        Intrinsics.checkNotNullParameter(timer, "timer");
        this.id = j11;
        this.buttons = list;
        this.timer = timer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeLeftVO)) {
            return false;
        }
        TimeLeftVO timeLeftVO = (TimeLeftVO) other;
        return this.id == timeLeftVO.id && Intrinsics.d(this.buttons, timeLeftVO.buttons) && Intrinsics.d(this.timer, timeLeftVO.timer);
    }

    public final List<AtomDTO> getButtons() {
        return this.buttons;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TimerVO getTimer() {
        return this.timer;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        List<AtomDTO> list = this.buttons;
        return this.timer.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<AtomDTO> list = this.buttons;
        TimerVO timerVO = this.timer;
        StringBuilder b11 = b.b(j11, "TimeLeftVO(id=", ", buttons=", list);
        b11.append(", timer=");
        b11.append(timerVO);
        b11.append(")");
        return b11.toString();
    }
}
