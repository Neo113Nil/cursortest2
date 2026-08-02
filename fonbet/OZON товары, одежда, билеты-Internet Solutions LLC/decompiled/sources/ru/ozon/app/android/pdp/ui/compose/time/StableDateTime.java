package ru.ozon.app.android.pdp.ui.compose.time;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Instant;
import org.joda.time.a;
import org.joda.time.c;
import org.joda.time.f;
import org.joda.time.h;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\n \u0016*\u0004\u0018\u00010\u00150\u0015H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\n \u0016*\u0004\u0018\u00010\u00190\u0019H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001e\u001a\u00020\u000e2\u000e\u0010\u001d\u001a\n \u0016*\u0004\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010 \u001a\u00020\t2\u000e\u0010\r\u001a\n \u0016*\u0004\u0018\u00010\u001c0\u001cH\u0096\u0003¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0011\u0010&\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;", "Lorg/joda/time/f;", "Lorg/joda/time/DateTime;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Lorg/joda/time/DateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "getDayOfMonth", "", "getMillis", "()J", "Lorg/joda/time/a;", "kotlin.jvm.PlatformType", "getChronology", "()Lorg/joda/time/a;", "Lorg/joda/time/Instant;", "toInstant", "()Lorg/joda/time/Instant;", "Lorg/joda/time/h;", "p0", "isAfter", "(Lorg/joda/time/h;)Z", "compareTo", "(Lorg/joda/time/h;)I", "Lorg/joda/time/DateTime;", "Lorg/joda/time/DateTime$Property;", "getMonthOfYear", "()Lorg/joda/time/DateTime$Property;", "monthOfYear", "compose-time_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class StableDateTime implements f {

    @NotNull
    private final DateTime value;

    public StableDateTime(@NotNull DateTime value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    @Override // java.lang.Comparable
    public int compareTo(h other) {
        return this.value.compareTo(other);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StableDateTime) && Intrinsics.d(this.value, ((StableDateTime) other).value);
    }

    @Override // org.joda.time.h
    public a getChronology() {
        return this.value.getChronology();
    }

    public int getDayOfMonth() {
        DateTime dateTime = this.value;
        dateTime.getClass();
        return dateTime.getChronology().g().d(dateTime.getMillis());
    }

    @Override // org.joda.time.h
    public long getMillis() {
        return this.value.getMillis();
    }

    @NotNull
    public final DateTime.Property getMonthOfYear() {
        DateTime.Property h11 = this.value.h();
        Intrinsics.checkNotNullExpressionValue(h11, "monthOfYear(...)");
        return h11;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public boolean isAfter(h p02) {
        DateTime dateTime = this.value;
        dateTime.getClass();
        return dateTime.getMillis() > c.c(p02);
    }

    @Override // org.joda.time.h
    public Instant toInstant() {
        return this.value.toInstant();
    }

    @NotNull
    public String toString() {
        return "StableDateTime(value=" + this.value + ")";
    }
}
