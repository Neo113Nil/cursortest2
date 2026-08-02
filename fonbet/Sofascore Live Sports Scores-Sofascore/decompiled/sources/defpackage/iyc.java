package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class iyc {
    public static final long a = v8a.v(14);

    public static final long a(long j, long j2) {
        if (!lfj.d(j2)) {
            is8.a(46, lfj.e(j2), "The multiplier must be in em, but was ");
            return 0L;
        }
        if (lfj.d(j)) {
            a70.l(lfj.e(j2), "). Please declare the style.fontSize with Sp units instead.", "Cannot convert Em to Px when style.fontSize is Em (");
            return 0L;
        }
        long j3 = j & 1095216660480L;
        if (j3 != 0) {
            float c = lfj.c(j2);
            v8a.l(j);
            return v8a.E(j3, lfj.c(j) * c);
        }
        float c2 = lfj.c(j2);
        long j4 = a;
        v8a.l(j4);
        return v8a.E(1095216660480L & j4, lfj.c(j4) * c2);
    }
}
