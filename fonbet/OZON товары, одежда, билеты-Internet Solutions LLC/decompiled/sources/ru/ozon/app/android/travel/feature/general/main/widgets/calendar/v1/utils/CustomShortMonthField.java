package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.utils;

import java.io.Writer;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.a;
import org.joda.time.format.f;
import org.joda.time.j;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\t\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010 J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010!J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\"R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0014\u0010$\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010(\u001a\n '*\u0004\u0018\u00010&0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/utils/CustomShortMonthField;", "Lorg/joda/time/format/f;", "", "", "shortMonths", "<init>", "([Ljava/lang/String;)V", "Lorg/joda/time/j;", "partial", "print", "(Lorg/joda/time/j;)Ljava/lang/String;", "", "instant", "Lorg/joda/time/a;", "chronology", "(JLorg/joda/time/a;)Ljava/lang/String;", "", "estimatePrintedLength", "()I", "Ljava/lang/StringBuffer;", "buf", "chrono", "displayOffset", "Lorg/joda/time/DateTimeZone;", "displayZone", "Ljava/util/Locale;", "locale", "", "printTo", "(Ljava/lang/StringBuffer;JLorg/joda/time/a;ILorg/joda/time/DateTimeZone;Ljava/util/Locale;)V", "Ljava/io/Writer;", "out", "(Ljava/io/Writer;JLorg/joda/time/a;ILorg/joda/time/DateTimeZone;Ljava/util/Locale;)V", "(Ljava/lang/StringBuffer;Lorg/joda/time/j;Ljava/util/Locale;)V", "(Ljava/io/Writer;Lorg/joda/time/j;Ljava/util/Locale;)V", "[Ljava/lang/String;", "estimateLength", "I", "Lorg/joda/time/DateTimeFieldType;", "kotlin.jvm.PlatformType", "monthFieldType", "Lorg/joda/time/DateTimeFieldType;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CustomShortMonthField implements f {
    private final int estimateLength;
    private final DateTimeFieldType monthFieldType;

    @NotNull
    private final String[] shortMonths;

    public CustomShortMonthField(@NotNull String[] shortMonths) {
        Intrinsics.checkNotNullParameter(shortMonths, "shortMonths");
        this.shortMonths = shortMonths;
        if (shortMonths.length == 0) {
            throw new NoSuchElementException();
        }
        int length = shortMonths[0].length();
        Intrinsics.checkNotNullParameter(shortMonths, "<this>");
        int i11 = 1;
        int length2 = shortMonths.length - 1;
        if (1 <= length2) {
            while (true) {
                int length3 = shortMonths[i11].length();
                length = length < length3 ? length3 : length;
                if (i11 == length2) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.estimateLength = length;
        this.monthFieldType = DateTimeFieldType.Y();
    }

    private final String print(j partial) {
        if (!partial.y(this.monthFieldType)) {
            return "�";
        }
        return this.shortMonths[partial.s0(this.monthFieldType) - 1];
    }

    @Override // org.joda.time.format.f
    /* renamed from: estimatePrintedLength, reason: from getter */
    public int getEstimateLength() {
        return this.estimateLength;
    }

    @Override // org.joda.time.format.f
    public void printTo(@NotNull StringBuffer buf, long instant, @NotNull a chrono, int displayOffset, @NotNull DateTimeZone displayZone, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(buf, "buf");
        Intrinsics.checkNotNullParameter(chrono, "chrono");
        Intrinsics.checkNotNullParameter(displayZone, "displayZone");
        Intrinsics.checkNotNullParameter(locale, "locale");
        try {
            buf.append(print(instant, chrono));
        } catch (RuntimeException unused) {
            buf.append((char) 65533);
        }
    }

    @Override // org.joda.time.format.f
    public void printTo(@NotNull Writer out, long instant, @NotNull a chrono, int displayOffset, @NotNull DateTimeZone displayZone, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(chrono, "chrono");
        Intrinsics.checkNotNullParameter(displayZone, "displayZone");
        Intrinsics.checkNotNullParameter(locale, "locale");
        try {
            out.append((CharSequence) print(instant, chrono));
        } catch (RuntimeException unused) {
            out.append((char) 65533);
        }
    }

    private final String print(long instant, a chronology) {
        return this.shortMonths[this.monthFieldType.O(chronology).d(instant) - 1];
    }

    @Override // org.joda.time.format.f
    public void printTo(@NotNull StringBuffer buf, @NotNull j partial, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(buf, "buf");
        Intrinsics.checkNotNullParameter(partial, "partial");
        Intrinsics.checkNotNullParameter(locale, "locale");
        try {
            buf.append(print(partial));
        } catch (RuntimeException unused) {
            buf.append((char) 65533);
        }
    }

    @Override // org.joda.time.format.f
    public void printTo(@NotNull Writer out, @NotNull j partial, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(partial, "partial");
        Intrinsics.checkNotNullParameter(locale, "locale");
        try {
            out.append((CharSequence) print(partial));
        } catch (RuntimeException unused) {
            out.append((char) 65533);
        }
    }
}
