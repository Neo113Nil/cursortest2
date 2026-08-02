package ru.ozon.app.android.pdp.ui.compose.time;

import Bl0.k0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.k;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ \u0010\u0018\u001a\n \u0012*\u0004\u0018\u00010\u00170\u00172\u0006\u0010\u0016\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001c\u001a\u00020\t2\u000e\u0010\u0016\u001a\n \u0012*\u0004\u0018\u00010\u00170\u0017H\u0096\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0011\u0010 \u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000bR\u0011\u0010\"\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b!\u0010\u000bR\u0011\u0010$\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b#\u0010\u000bR\u0011\u0010&\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b%\u0010\u000bR\u0011\u0010(\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b'\u0010\u000bR\u0011\u0010)\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/pdp/ui/compose/time/StablePeriod;", "Lorg/joda/time/k;", "Lorg/joda/time/Period;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Lorg/joda/time/Period;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lorg/joda/time/PeriodType;", "kotlin.jvm.PlatformType", "getPeriodType", "()Lorg/joda/time/PeriodType;", "size", "p0", "Lorg/joda/time/DurationFieldType;", "getFieldType", "(I)Lorg/joda/time/DurationFieldType;", "getValue", "(I)I", "get", "(Lorg/joda/time/DurationFieldType;)I", "Lorg/joda/time/Period;", "getDays", "days", "getHours", "hours", "getMinutes", "minutes", "getSeconds", "seconds", "getWholeHours", "wholeHours", "isExpired", "()Z", "compose-time_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class StablePeriod implements k {

    @NotNull
    private final Period value;

    public StablePeriod(@NotNull Period value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StablePeriod) && Intrinsics.d(this.value, ((StablePeriod) other).value);
    }

    @Override // org.joda.time.k
    public int get(DurationFieldType p02) {
        return this.value.get(p02);
    }

    public final int getDays() {
        return this.value.s();
    }

    @Override // org.joda.time.k
    public DurationFieldType getFieldType(int p02) {
        return this.value.getFieldType(p02);
    }

    public final int getHours() {
        return this.value.u();
    }

    public final int getMinutes() {
        return this.value.y();
    }

    @Override // org.joda.time.k
    public PeriodType getPeriodType() {
        return this.value.getPeriodType();
    }

    public final int getSeconds() {
        return this.value.B();
    }

    @Override // org.joda.time.k
    public int getValue(int p02) {
        return this.value.getValue(p02);
    }

    public final int getWholeHours() {
        Period period = this.value;
        if (period.A() != 0) {
            throw new UnsupportedOperationException("Cannot convert to Hours as this period contains months and months vary in length");
        }
        if (period.D() != 0) {
            throw new UnsupportedOperationException("Cannot convert to Hours as this period contains years and years vary in length");
        }
        return Hours.v(k0.v(k0.s(k0.s(k0.s(((period.y() * 60000) + ((period.B() * 1000) + period.v())) / 3600000, period.u()), period.s() * 24), period.C() * 168))).s();
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public final boolean isExpired() {
        return Intrinsics.d(this.value, Period.f79036b);
    }

    @Override // org.joda.time.k
    public int size() {
        return this.value.size();
    }

    @NotNull
    public String toString() {
        return "StablePeriod(value=" + this.value + ")";
    }
}
