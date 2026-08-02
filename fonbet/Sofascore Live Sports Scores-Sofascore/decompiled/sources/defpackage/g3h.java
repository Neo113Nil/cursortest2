package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class g3h {
    public static final g80 a = new g80(Float.NaN, Float.NaN);
    public static final q4k b = new q4k(new z1h(1), new z1h(2));
    public static final long c;
    public static final g0i d;

    static {
        long floatToRawIntBits = (Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & 4294967295L);
        c = floatToRawIntBits;
        d = new g0i(new dnd(floatToRawIntBits), 3);
    }
}
