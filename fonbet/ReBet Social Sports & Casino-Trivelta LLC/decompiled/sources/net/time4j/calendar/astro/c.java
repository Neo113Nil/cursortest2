package net.time4j.calendar.astro;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import li.AbstractC5469c;
import net.time4j.A;
import net.time4j.F;
import oi.EnumC5900A;
import qi.C6183d;
import qi.EnumC6185f;

/* loaded from: classes5.dex */
public final class c implements Serializable {
    private static final long serialVersionUID = 486345450973062467L;
    private final EnumC6185f scale;
    private final double value;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$net$time4j$scale$TimeScale;

        static {
            int[] iArr = new int[EnumC6185f.values().length];
            $SwitchMap$net$time4j$scale$TimeScale = iArr;
            try {
                iArr[EnumC6185f.UT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$time4j$scale$TimeScale[EnumC6185f.TT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$time4j$scale$TimeScale[EnumC6185f.POSIX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public c(double d10, EnumC6185f enumC6185f) {
        a(d10, enumC6185f);
        this.value = d10;
        this.scale = enumC6185f;
    }

    public static void a(double d10, EnumC6185f enumC6185f) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException("Value is not finite: " + d10);
        }
        int i10 = a.$SwitchMap$net$time4j$scale$TimeScale[enumC6185f.ordinal()];
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalArgumentException("Unsupported time scale: " + enumC6185f);
        }
        if (Double.compare(990575.0d, d10) > 0 || Double.compare(d10, 2817152.0d) > 0) {
            throw new IllegalArgumentException("Out of range: " + d10);
        }
    }

    public static double d(A a10, EnumC6185f enumC6185f) {
        return ((a10.h(enumC6185f) + e(enumC6185f)) + (a10.g(enumC6185f) / 1.0E9d)) / 86400.0d;
    }

    public static long e(EnumC6185f enumC6185f) {
        int i10 = a.$SwitchMap$net$time4j$scale$TimeScale[enumC6185f.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return 210929832000L;
        }
        if (i10 == 3) {
            return 210866760000L;
        }
        throw new UnsupportedOperationException(enumC6185f.name());
    }

    public static c f(double d10) {
        return new c(d10, EnumC6185f.TT);
    }

    public static c g(A a10) {
        EnumC6185f enumC6185f = EnumC6185f.TT;
        return new c(d(a10, enumC6185f), enumC6185f);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        try {
            objectInputStream.defaultReadObject();
            a(this.value, this.scale);
        } catch (ClassNotFoundException unused) {
            throw new StreamCorruptedException();
        } catch (IllegalArgumentException unused2) {
            throw new StreamCorruptedException();
        }
    }

    public double b() {
        return this.value - 2400000.5d;
    }

    public double c() {
        return this.value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.value == cVar.value && this.scale == cVar.scale) {
                return true;
            }
        }
        return false;
    }

    public A h() {
        EnumC6185f enumC6185f;
        double d10 = this.value * 86400.0d;
        EnumC6185f enumC6185f2 = this.scale;
        if (!C6183d.q().u() && enumC6185f2 != (enumC6185f = EnumC6185f.POSIX)) {
            if (enumC6185f2 == EnumC6185f.TT) {
                F G02 = F.G0((long) Math.floor(b()), EnumC5900A.MODIFIED_JULIAN_DATE);
                d10 -= EnumC6185f.b(G02.n(), G02.o());
            }
            d10 += 6.3072E7d;
            enumC6185f2 = enumC6185f;
        }
        return A.f0(AbstractC5469c.m((long) d10, e(enumC6185f2)), (int) ((d10 - Math.floor(d10)) * 1.0E9d), enumC6185f2);
    }

    public int hashCode() {
        return net.time4j.calendar.astro.a.a(this.value) ^ this.scale.hashCode();
    }

    public String toString() {
        return "JD(" + this.scale.name() + ')' + this.value;
    }
}
