package kotlin.time;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.tencent.mmkv.MMKV;
import io.sentry.metrics.MetricsUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.chromium.base.TimeUtils;
import org.chromium.net.NetError;

/* compiled from: Instant.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u001a"}, d2 = {"Lkotlin/time/UnboundLocalDateTime;", "", "year", "", "month", MetricsUnit.Duration.DAY, MetricsUnit.Duration.HOUR, MetricsUnit.Duration.MINUTE, MetricsUnit.Duration.SECOND, "nanosecond", "<init>", "(IIIIIII)V", "getYear", "()I", "getMonth", "getDay", "getHour", "getMinute", "getSecond", "getNanosecond", "toInstant", "Lkotlin/time/Instant;", "offsetSeconds", InAppPurchaseConstants.METHOD_TO_STRING, "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class UnboundLocalDateTime {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int day;
    private final int hour;
    private final int minute;
    private final int month;
    private final int nanosecond;
    private final int second;
    private final int year;

    public UnboundLocalDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.year = i;
        this.month = i2;
        this.day = i3;
        this.hour = i4;
        this.minute = i5;
        this.second = i6;
        this.nanosecond = i7;
    }

    public final int getYear() {
        return this.year;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getDay() {
        return this.day;
    }

    public final int getHour() {
        return this.hour;
    }

    public final int getMinute() {
        return this.minute;
    }

    public final int getSecond() {
        return this.second;
    }

    public final int getNanosecond() {
        return this.nanosecond;
    }

    public final Instant toInstant(int offsetSeconds) {
        long j;
        int i = this.year;
        long j2 = i;
        long j3 = 365 * j2;
        if (j2 >= 0) {
            j = j3 + (((3 + j2) / 4) - ((99 + j2) / 100)) + ((j2 + 399) / 400);
        } else {
            j = j3 - (((j2 / (-4)) - (j2 / (-100))) + (j2 / NetError.ERR_CACHE_MISS));
        }
        long j4 = j + (((r1 * 367) + NetError.ERR_HTTP2_FRAME_SIZE_ERROR) / 12) + (this.day - 1);
        if (this.month > 2) {
            j4 = !InstantKt.isLeapYear(i) ? j4 - 2 : (-1) + j4;
        }
        long j5 = (((j4 - 719528) * MMKV.ExpireInDay) + (((this.hour * MMKV.ExpireInHour) + (this.minute * 60)) + this.second)) - offsetSeconds;
        if (j5 < Instant.INSTANCE.getMIN$kotlin_stdlib().getEpochSeconds() || j5 > Instant.INSTANCE.getMAX$kotlin_stdlib().getEpochSeconds()) {
            throw new InstantFormatException("The parsed date is outside the range representable by Instant (Unix epoch second " + j5 + ')');
        }
        return Instant.INSTANCE.fromEpochSeconds(j5, this.nanosecond);
    }

    public String toString() {
        return "UnboundLocalDateTime(" + this.year + '-' + this.month + '-' + this.day + ' ' + this.hour + AbstractJsonLexerKt.COLON + this.minute + AbstractJsonLexerKt.COLON + this.second + '.' + this.nanosecond + ')';
    }

    /* compiled from: Instant.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lkotlin/time/UnboundLocalDateTime$Companion;", "", "<init>", "()V", "fromInstant", "Lkotlin/time/UnboundLocalDateTime;", "instant", "Lkotlin/time/Instant;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UnboundLocalDateTime fromInstant(Instant instant) {
            long j;
            long j2;
            Intrinsics.checkNotNullParameter(instant, "instant");
            long epochSeconds = instant.getEpochSeconds();
            long j3 = epochSeconds / TimeUtils.SECONDS_PER_DAY;
            if ((epochSeconds ^ TimeUtils.SECONDS_PER_DAY) < 0 && j3 * TimeUtils.SECONDS_PER_DAY != epochSeconds) {
                j3--;
            }
            long j4 = epochSeconds % TimeUtils.SECONDS_PER_DAY;
            int i = (int) (j4 + (TimeUtils.SECONDS_PER_DAY & (((j4 ^ TimeUtils.SECONDS_PER_DAY) & ((-j4) | j4)) >> 63)));
            long j5 = (j3 + 719528) - 60;
            if (j5 < 0) {
                j = -1;
                long j6 = 146097;
                long j7 = ((j5 + 1) / j6) - 1;
                j2 = 400 * j7;
                j5 += (-j7) * j6;
            } else {
                j = -1;
                j2 = 0;
            }
            long j8 = 400;
            long j9 = ((j8 * j5) + 591) / 146097;
            long j10 = 365;
            long j11 = 4;
            long j12 = 100;
            long j13 = j5 - ((((j10 * j9) + (j9 / j11)) - (j9 / j12)) + (j9 / j8));
            if (j13 < 0) {
                j9 += j;
                j13 = j5 - ((((j10 * j9) + (j9 / j11)) - (j9 / j12)) + (j9 / j8));
            }
            long j14 = j9 + j2;
            int i2 = (int) j13;
            int i3 = ((i2 * 5) + 2) / 153;
            int i4 = ((i3 + 2) % 12) + 1;
            int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
            int i6 = (int) (j14 + (i3 / 10));
            int i7 = i / MMKV.ExpireInHour;
            int i8 = i - (i7 * MMKV.ExpireInHour);
            int i9 = i8 / 60;
            return new UnboundLocalDateTime(i6, i4, i5, i7, i9, i8 - (i9 * 60), instant.getNanosecondsOfSecond());
        }
    }
}
