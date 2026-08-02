package defpackage;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = sk4.class)
/* loaded from: classes7.dex */
public abstract class rk4 {

    @NotNull
    public static final ik4 Companion = new ik4();
    public static final mk4 a;

    static {
        new qk4(1L).b(1000).b(1000).b(1000).b(60).b(60);
        a = new mk4(1);
        new mk4(Math.multiplyExact(1, 7));
        new ok4(1);
        new ok4(Math.multiplyExact(1, 3));
        int multiplyExact = Math.multiplyExact(1, 12);
        new ok4(multiplyExact);
        new ok4(Math.multiplyExact(multiplyExact, 100));
    }

    public static String a(int i, String str) {
        if (i == 1) {
            return str;
        }
        return i + '-' + str;
    }
}
