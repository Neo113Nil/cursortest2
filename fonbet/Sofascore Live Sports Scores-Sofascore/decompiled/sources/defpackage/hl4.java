package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hl4 implements Comparable {
    public static final ccd c = new ccd();
    public static final long d = -3153600000000000000L;
    public final long a;
    public volatile boolean b;

    public hl4(long j) {
        long nanoTime = System.nanoTime();
        long min = Math.min(3153600000000000000L, Math.max(d, j));
        this.a = nanoTime + min;
        this.b = min <= 0;
    }

    public final boolean a() {
        if (this.b) {
            return true;
        }
        if (this.a - System.nanoTime() > 0) {
            return false;
        }
        this.b = true;
        return true;
    }

    public final long b() {
        long nanoTime = System.nanoTime();
        if (!this.b && this.a - nanoTime <= 0) {
            this.b = true;
        }
        return this.a - nanoTime;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        hl4 hl4Var = (hl4) obj;
        hl4Var.getClass();
        long j = this.a - hl4Var.a;
        if (j < 0) {
            return -1;
        }
        return j > 0 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof hl4) && this.a == ((hl4) obj).a;
    }

    public final int hashCode() {
        return Arrays.asList(c, Long.valueOf(this.a)).hashCode();
    }

    public final String toString() {
        long b = b();
        long abs = Math.abs(b) / 1000000000;
        long abs2 = Math.abs(b) % 1000000000;
        StringBuilder sb = new StringBuilder();
        if (b < 0) {
            sb.append('-');
        }
        sb.append(abs);
        if (abs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb.append("s from now");
        return sb.toString();
    }
}
