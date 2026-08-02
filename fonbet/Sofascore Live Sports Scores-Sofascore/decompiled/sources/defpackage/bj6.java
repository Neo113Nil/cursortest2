package defpackage;

import java.util.Random;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bj6 {
    public Random a;
    public long b;
    public double c;
    public double d;
    public long e;

    public final long a() {
        long j = this.e;
        double d = j;
        this.e = Math.min((long) (this.c * d), this.b);
        double d2 = this.d;
        double d3 = (-d2) * d;
        double d4 = d2 * d;
        z1a.s(d4 >= d3);
        return j + ((long) ((this.a.nextDouble() * (d4 - d3)) + d3));
    }
}
