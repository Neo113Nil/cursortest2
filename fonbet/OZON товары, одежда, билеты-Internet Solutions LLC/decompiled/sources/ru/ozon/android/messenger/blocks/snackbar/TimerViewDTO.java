package ru.ozon.android.messenger.blocks.snackbar;

import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/android/messenger/blocks/snackbar/TimerViewDTO;", "", "ttl", "", "<init>", "(J)V", "getTtl", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TimerViewDTO {
    public static final int $stable = 0;
    private final long ttl;

    public TimerViewDTO(long j11) {
        this.ttl = j11;
    }

    public static /* synthetic */ TimerViewDTO copy$default(TimerViewDTO timerViewDTO, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = timerViewDTO.ttl;
        }
        return timerViewDTO.copy(j11);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTtl() {
        return this.ttl;
    }

    @NotNull
    public final TimerViewDTO copy(long ttl) {
        return new TimerViewDTO(ttl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TimerViewDTO) && this.ttl == ((TimerViewDTO) other).ttl;
    }

    public final long getTtl() {
        return this.ttl;
    }

    public int hashCode() {
        return Long.hashCode(this.ttl);
    }

    @NotNull
    public String toString() {
        return Sh.b.b(this.ttl, "TimerViewDTO(ttl=", ")");
    }
}
