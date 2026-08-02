package F1;

import android.util.Range;
import e1.AbstractC4134a;

/* loaded from: classes.dex */
public class A {

    /* renamed from: a, reason: collision with root package name */
    public long f3232a;

    /* renamed from: b, reason: collision with root package name */
    public long f3233b;

    /* renamed from: c, reason: collision with root package name */
    public double f3234c;

    /* renamed from: d, reason: collision with root package name */
    public Range f3235d;

    public A(float f10) {
        AbstractC4134a.a(f10 > 0.0f);
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f10));
        this.f3235d = range;
        this.f3234c = ((Double) range.getUpper()).doubleValue();
        this.f3232a = -9223372036854775807L;
        this.f3233b = -9223372036854775807L;
    }

    public final double a(long j10, long j11) {
        long j12 = this.f3232a;
        if (j12 != -9223372036854775807L) {
            if (this.f3233b != -9223372036854775807L && j10 != j12) {
                return (j11 - r4) / (j10 - j12);
            }
        }
        return ((Double) this.f3235d.getUpper()).doubleValue();
    }

    public void b(long j10, long j11) {
        AbstractC4134a.a(j10 != -9223372036854775807L);
        AbstractC4134a.a(j11 != -9223372036854775807L);
        f(((Double) this.f3235d.clamp(Double.valueOf(a(j10, j11)))).doubleValue());
        this.f3232a = j10;
        this.f3233b = j11;
    }

    public long c(long j10) {
        if (this.f3232a == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (this.f3233b + ((j10 - r0) * this.f3234c));
    }

    public void d() {
        this.f3234c = ((Double) this.f3235d.getUpper()).doubleValue();
        this.f3232a = -9223372036854775807L;
        this.f3233b = -9223372036854775807L;
    }

    public void e(float f10) {
        AbstractC4134a.a(f10 > 0.0f);
        this.f3235d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f10));
        d();
    }

    public final void f(double d10) {
        this.f3234c = (this.f3234c * 0.800000011920929d) + (d10 * 0.20000000298023224d);
    }
}
