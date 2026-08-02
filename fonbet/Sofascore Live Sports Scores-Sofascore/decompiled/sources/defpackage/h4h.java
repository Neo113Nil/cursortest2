package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class h4h {
    public static final ih2 b;
    public static final ih2 c;
    public static final ih2 d;
    public static final ih2 e;
    public static final int a = r4a.L(100, 12, "kotlinx.coroutines.semaphore.maxSpinCycles");
    public static final int f = r4a.L(16, 12, "kotlinx.coroutines.semaphore.segmentSize");

    static {
        int i = 5;
        b = new ih2("PERMIT", i);
        c = new ih2("TAKEN", i);
        d = new ih2("BROKEN", i);
        e = new ih2("CANCELLED", i);
    }
}
