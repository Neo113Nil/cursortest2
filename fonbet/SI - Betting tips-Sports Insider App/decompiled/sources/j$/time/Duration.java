package j$.time;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import j$.time.temporal.ChronoUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class Duration implements j$.time.temporal.o, Comparable<Duration>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final Duration f17279c = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* renamed from: a, reason: collision with root package name */
    public final long f17280a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17281b;

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int compare = Long.compare(this.f17280a, duration2.f17280a);
        return compare != 0 ? compare : this.f17281b - duration2.f17281b;
    }

    static {
        BigInteger.valueOf(1000000000L);
    }

    public static Duration ofDays(long j) {
        return j(j$.com.android.tools.r8.a.T(j, 86400), 0);
    }

    public static Duration ofMinutes(long j) {
        return j(j$.com.android.tools.r8.a.T(j, 60), 0);
    }

    public static Duration k(long j) {
        long j6 = j / 1000000000;
        int i5 = (int) (j % 1000000000);
        if (i5 < 0) {
            i5 = (int) (i5 + 1000000000);
            j6--;
        }
        return j(j6, i5);
    }

    public static Duration j(long j, int i5) {
        if ((i5 | j) == 0) {
            return f17279c;
        }
        return new Duration(j, i5);
    }

    public Duration(long j, int i5) {
        this.f17280a = j;
        this.f17281b = i5;
    }

    public long getSeconds() {
        return this.f17280a;
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.l i(j$.time.temporal.l lVar) {
        long j = this.f17280a;
        if (j != 0) {
            lVar = lVar.d(j, ChronoUnit.SECONDS);
        }
        int i5 = this.f17281b;
        return i5 != 0 ? lVar.d(i5, ChronoUnit.NANOS) : lVar;
    }

    public long toMillis() {
        long j = this.f17280a;
        long j6 = this.f17281b;
        if (j < 0) {
            j++;
            j6 -= 1000000000;
        }
        return j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.T(j, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT), j6 / 1000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.f17280a == duration.f17280a && this.f17281b == duration.f17281b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f17280a;
        return (this.f17281b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        if (this == f17279c) {
            return "PT0S";
        }
        long j = this.f17280a;
        if (j < 0 && this.f17281b > 0) {
            j++;
        }
        long j6 = j / 3600;
        int i5 = (int) ((j % 3600) / 60);
        int i10 = (int) (j % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j6 != 0) {
            sb2.append(j6);
            sb2.append('H');
        }
        if (i5 != 0) {
            sb2.append(i5);
            sb2.append('M');
        }
        if (i10 == 0 && this.f17281b == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (this.f17280a >= 0 || this.f17281b <= 0) {
            sb2.append(i10);
        } else if (i10 == 0) {
            sb2.append("-0");
        } else {
            sb2.append(i10);
        }
        if (this.f17281b > 0) {
            int length = sb2.length();
            if (this.f17280a < 0) {
                sb2.append(2000000000 - this.f17281b);
            } else {
                sb2.append(this.f17281b + 1000000000);
            }
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }

    private Object writeReplace() {
        return new r((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
