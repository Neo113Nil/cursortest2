package ru.ozon.app.android.orderdetails.timeLeft.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/orderdetails/timeLeft/data/TimeLeftDTO;", "", "buttons", "", "Lru/ozon/uni/atoms/data/AtomDTO;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/orderdetails/timeLeft/data/TimerDTO;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/orderdetails/timeLeft/data/TimerDTO;)V", "getButtons", "()Ljava/util/List;", "getTimer", "()Lru/ozon/app/android/orderdetails/timeLeft/data/TimerDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TimeLeftDTO {
    public static final int $stable = 8;
    private final List<AtomDTO> buttons;

    @NotNull
    private final TimerDTO timer;

    /* JADX WARN: Multi-variable type inference failed */
    public TimeLeftDTO(List<? extends AtomDTO> list, @NotNull TimerDTO timer) {
        Intrinsics.checkNotNullParameter(timer, "timer");
        this.buttons = list;
        this.timer = timer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TimeLeftDTO copy$default(TimeLeftDTO timeLeftDTO, List list, TimerDTO timerDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = timeLeftDTO.buttons;
        }
        if ((i11 & 2) != 0) {
            timerDTO = timeLeftDTO.timer;
        }
        return timeLeftDTO.copy(list, timerDTO);
    }

    public final List<AtomDTO> component1() {
        return this.buttons;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TimerDTO getTimer() {
        return this.timer;
    }

    @NotNull
    public final TimeLeftDTO copy(List<? extends AtomDTO> buttons, @NotNull TimerDTO timer) {
        Intrinsics.checkNotNullParameter(timer, "timer");
        return new TimeLeftDTO(buttons, timer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeLeftDTO)) {
            return false;
        }
        TimeLeftDTO timeLeftDTO = (TimeLeftDTO) other;
        return Intrinsics.d(this.buttons, timeLeftDTO.buttons) && Intrinsics.d(this.timer, timeLeftDTO.timer);
    }

    public final List<AtomDTO> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final TimerDTO getTimer() {
        return this.timer;
    }

    public int hashCode() {
        List<AtomDTO> list = this.buttons;
        return this.timer.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "TimeLeftDTO(buttons=" + this.buttons + ", timer=" + this.timer + ")";
    }
}
