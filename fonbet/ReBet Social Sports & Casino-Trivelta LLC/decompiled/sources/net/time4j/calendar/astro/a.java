package net.time4j.calendar.astro;

/* loaded from: classes5.dex */
public abstract class a {
    public static int a(double d10) {
        long doubleToLongBits = Double.doubleToLongBits(d10);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public static double b(double d10) {
        while (Double.compare(0.0d, d10) > 0) {
            d10 += 360.0d;
        }
        while (Double.compare(d10, 360.0d) >= 0) {
            d10 -= 360.0d;
        }
        return d10;
    }
}
