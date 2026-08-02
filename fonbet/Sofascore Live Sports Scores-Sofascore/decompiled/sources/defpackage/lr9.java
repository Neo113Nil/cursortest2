package defpackage;

import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lr9 {
    public static final m7o c = new m7o();
    public static final long d = Math.round(Math.scalb(Math.random(), 52));
    public static lr9 e;
    public int a;
    public ExecutorService b;

    public static lr9 a() {
        lr9 lr9Var = e;
        if (lr9Var != null) {
            return lr9Var;
        }
        lr9 lr9Var2 = new lr9();
        lr9Var2.a = 0;
        e = lr9Var2;
        return lr9Var2;
    }
}
