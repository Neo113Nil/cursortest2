package ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v1.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v1/data/TimeoutAndActionDTO;", "", "time", "Lorg/joda/time/DateTime;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lorg/joda/time/DateTime;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getTime", "()Lorg/joda/time/DateTime;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TimeoutAndActionDTO {
    public static final int $stable = 8;

    @NotNull
    private final AtomActionDTO action;

    @NotNull
    private final DateTime time;

    public TimeoutAndActionDTO(@NotNull DateTime time, @NotNull AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(action, "action");
        this.time = time;
        this.action = action;
    }

    public static /* synthetic */ TimeoutAndActionDTO copy$default(TimeoutAndActionDTO timeoutAndActionDTO, DateTime dateTime, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dateTime = timeoutAndActionDTO.time;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = timeoutAndActionDTO.action;
        }
        return timeoutAndActionDTO.copy(dateTime, atomActionDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final DateTime getTime() {
        return this.time;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final TimeoutAndActionDTO copy(@NotNull DateTime time, @NotNull AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(action, "action");
        return new TimeoutAndActionDTO(time, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeoutAndActionDTO)) {
            return false;
        }
        TimeoutAndActionDTO timeoutAndActionDTO = (TimeoutAndActionDTO) other;
        return Intrinsics.d(this.time, timeoutAndActionDTO.time) && Intrinsics.d(this.action, timeoutAndActionDTO.action);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final DateTime getTime() {
        return this.time;
    }

    public int hashCode() {
        return this.action.hashCode() + (this.time.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "TimeoutAndActionDTO(time=" + this.time + ", action=" + this.action + ")";
    }
}
