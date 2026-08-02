package net.time4j;

/* loaded from: classes5.dex */
public enum N implements oi.w {
    SECONDS(1.0d),
    NANOSECONDS(1.0E-9d);

    private final double length;

    N(double d10) {
        this.length = d10;
    }

    @Override // oi.w
    public double getLength() {
        return this.length;
    }
}
