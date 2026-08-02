package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class ov9 {
    public static final cqa a;
    public static final cqa b;

    static {
        try {
            a = new cqa(iv9.class.getDeclaredField("map"));
            try {
                b = new cqa(iv9.class.getDeclaredField("size"));
            } catch (NoSuchFieldException e) {
                a70.j(e);
            }
        } catch (NoSuchFieldException e2) {
            a70.j(e2);
        }
    }
}
