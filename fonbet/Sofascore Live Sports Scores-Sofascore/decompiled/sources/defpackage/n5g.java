package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class n5g {
    public static final ff5 a = new ff5(0, new wtf(5));
    public static final p5g b;
    public static final p5g c;

    static {
        long j = r13.i;
        b = new p5g(j, Float.NaN, true);
        c = new p5g(j, Float.NaN, false);
    }

    public static p5g a(float f, int i, long j, boolean z) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        if ((i & 4) != 0) {
            j = r13.i;
        }
        return (p75.b(f, Float.NaN) && e8k.a(j, r13.i)) ? z ? b : c : new p5g(j, f, z);
    }
}
