package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.badge;

import V.e;
import Xc.a;
import Xc.b;
import android.annotation.SuppressLint;
import android.icu.text.PluralRules;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListVO;
import ru.ozon.app.android.travel.utils.timerFlow.TimerFlow;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J\u001e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListTimerFormatter;", "Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerFormatter;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListTimerFormatter$Time;", "wordDeclension", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text$Timer$WordDeclension;", "locale", "Ljava/util/Locale;", "<init>", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text$Timer$WordDeclension;Ljava/util/Locale;)V", "pluralToIndex", "", "", "", "formatRemaining", "millis", "", "pluralize", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "forms", "", "Companion", "Time", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListTimerFormatter implements TimerFlow.TimerFormatter<Time> {

    @NotNull
    private final Locale locale;

    @NotNull
    private final Map<String, Integer> pluralToIndex;

    @NotNull
    private final StaticCouponListVO.ContentItem.Badge.Text.Timer.WordDeclension wordDeclension;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListTimerFormatter$Companion;", "", "<init>", "()V", "SECONDS_IN_MINUTE", "", "MINUTES_IN_HOUR", "HOURS_IN_DAY", "MILLIS_IN_SECOND", "MILLIS_IN_MINUTE", "MILLIS_IN_HOUR", "MILLIS_IN_DAY", "PLURALIZE_FALLBACK", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListTimerFormatter$Time;", "", "", "remaining", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListTimerFormatter$Time$Format;", "format", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListTimerFormatter$Time$Format;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRemaining", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListTimerFormatter$Time$Format;", "getFormat", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListTimerFormatter$Time$Format;", "Format", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Time {

        @NotNull
        private final Format format;

        @NotNull
        private final String remaining;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListTimerFormatter$Time$Format;", "", "<init>", "(Ljava/lang/String;I)V", "TIMER", "DAYS", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Format {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Format[] $VALUES;
            public static final Format TIMER = new Format("TIMER", 0);
            public static final Format DAYS = new Format("DAYS", 1);

            private static final /* synthetic */ Format[] $values() {
                return new Format[]{TIMER, DAYS};
            }

            static {
                Format[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private Format(String str, int i11) {
            }

            public static Format valueOf(String str) {
                return (Format) Enum.valueOf(Format.class, str);
            }

            public static Format[] values() {
                return (Format[]) $VALUES.clone();
            }
        }

        public Time(@NotNull String remaining, @NotNull Format format) {
            Intrinsics.checkNotNullParameter(remaining, "remaining");
            Intrinsics.checkNotNullParameter(format, "format");
            this.remaining = remaining;
            this.format = format;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Time)) {
                return false;
            }
            Time time = (Time) other;
            return Intrinsics.d(this.remaining, time.remaining) && this.format == time.format;
        }

        @NotNull
        public final Format getFormat() {
            return this.format;
        }

        @NotNull
        public final String getRemaining() {
            return this.remaining;
        }

        public int hashCode() {
            return this.format.hashCode() + (this.remaining.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Time(remaining=" + this.remaining + ", format=" + this.format + ")";
        }
    }

    public StaticCouponListTimerFormatter(@NotNull StaticCouponListVO.ContentItem.Badge.Text.Timer.WordDeclension wordDeclension, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(wordDeclension, "wordDeclension");
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.wordDeclension = wordDeclension;
        this.locale = locale;
        this.pluralToIndex = U.j(new Pair("one", 0), new Pair("few", 1), new Pair("many", 2), new Pair("other", 3));
    }

    private final String pluralize(double value, List<String> forms) {
        Integer num = this.pluralToIndex.get(PluralRules.forLocale(this.locale).select(value));
        String str = (String) C7714v.Q(num != null ? num.intValue() : 0, forms);
        return str == null ? "" : str;
    }

    @Override // ru.ozon.app.android.travel.utils.timerFlow.TimerFlow.TimerFormatter
    @SuppressLint({"DefaultLocale"})
    @NotNull
    public Time formatRemaining(long millis) {
        String str;
        long j11 = millis / 86400000;
        long j12 = (millis % 86400000) / 3600000;
        long j13 = (millis % 3600000) / 60000;
        long j14 = (millis % 60000) / 1000;
        if (j11 < 1) {
            return new Time(e.b(new Object[]{Long.valueOf(j12), Long.valueOf(j13), Long.valueOf(j14)}, 3, "%02d:%02d:%02d", "format(...)"), Time.Format.TIMER);
        }
        String pluralize = pluralize(j11, this.wordDeclension.getDay());
        if (j12 > 0) {
            str = j11 + " " + pluralize + " " + j12 + " " + pluralize(j12, this.wordDeclension.getHour());
        } else {
            str = j11 + " " + pluralize;
        }
        return new Time(str, Time.Format.DAYS);
    }
}
