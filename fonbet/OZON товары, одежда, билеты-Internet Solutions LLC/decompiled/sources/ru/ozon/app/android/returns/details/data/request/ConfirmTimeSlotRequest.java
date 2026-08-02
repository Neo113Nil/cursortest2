package ru.ozon.app.android.returns.details.data.request;

import GR.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/returns/details/data/request/ConfirmTimeSlotRequest;", "", "id", "", "from", "Lorg/joda/time/DateTime;", "to", "timeZoneOffset", "", "<init>", "(JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;)V", "getId", "()J", "getFrom", "()Lorg/joda/time/DateTime;", "getTo", "getTimeZoneOffset", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ConfirmTimeSlotRequest {
    public static final int $stable = 8;

    @NotNull
    private final DateTime from;
    private final long id;

    @NotNull
    private final String timeZoneOffset;

    @NotNull
    private final DateTime to;

    public ConfirmTimeSlotRequest(@i(name = "Id") long j11, @i(name = "From") @NotNull DateTime from, @i(name = "To") @NotNull DateTime to, @i(name = "TimeZoneOffset") @NotNull String timeZoneOffset) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        Intrinsics.checkNotNullParameter(timeZoneOffset, "timeZoneOffset");
        this.id = j11;
        this.from = from;
        this.to = to;
        this.timeZoneOffset = timeZoneOffset;
    }

    public static /* synthetic */ ConfirmTimeSlotRequest copy$default(ConfirmTimeSlotRequest confirmTimeSlotRequest, long j11, DateTime dateTime, DateTime dateTime2, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = confirmTimeSlotRequest.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            dateTime = confirmTimeSlotRequest.from;
        }
        DateTime dateTime3 = dateTime;
        if ((i11 & 4) != 0) {
            dateTime2 = confirmTimeSlotRequest.to;
        }
        DateTime dateTime4 = dateTime2;
        if ((i11 & 8) != 0) {
            str = confirmTimeSlotRequest.timeZoneOffset;
        }
        return confirmTimeSlotRequest.copy(j12, dateTime3, dateTime4, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final DateTime getFrom() {
        return this.from;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final DateTime getTo() {
        return this.to;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTimeZoneOffset() {
        return this.timeZoneOffset;
    }

    @NotNull
    public final ConfirmTimeSlotRequest copy(@i(name = "Id") long id2, @i(name = "From") @NotNull DateTime from, @i(name = "To") @NotNull DateTime to, @i(name = "TimeZoneOffset") @NotNull String timeZoneOffset) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        Intrinsics.checkNotNullParameter(timeZoneOffset, "timeZoneOffset");
        return new ConfirmTimeSlotRequest(id2, from, to, timeZoneOffset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmTimeSlotRequest)) {
            return false;
        }
        ConfirmTimeSlotRequest confirmTimeSlotRequest = (ConfirmTimeSlotRequest) other;
        return this.id == confirmTimeSlotRequest.id && Intrinsics.d(this.from, confirmTimeSlotRequest.from) && Intrinsics.d(this.to, confirmTimeSlotRequest.to) && Intrinsics.d(this.timeZoneOffset, confirmTimeSlotRequest.timeZoneOffset);
    }

    @NotNull
    public final DateTime getFrom() {
        return this.from;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getTimeZoneOffset() {
        return this.timeZoneOffset;
    }

    @NotNull
    public final DateTime getTo() {
        return this.to;
    }

    public int hashCode() {
        return this.timeZoneOffset.hashCode() + b.a(this.to, b.a(this.from, Long.hashCode(this.id) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "ConfirmTimeSlotRequest(id=" + this.id + ", from=" + this.from + ", to=" + this.to + ", timeZoneOffset=" + this.timeZoneOffset + ")";
    }
}
