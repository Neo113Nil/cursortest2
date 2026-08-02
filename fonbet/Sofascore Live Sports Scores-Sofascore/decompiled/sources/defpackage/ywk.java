package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class ywk {
    public static final List a = b.j("period1", "period2", "period3", "period4", "period5", "overtime");
    public static final int b;
    public static final int c;

    static {
        b = b.i(r0) - 1;
        c = r0.size() - 1;
    }

    public static boolean a(String str) {
        return CollectionsKt.c0(a, str) == c;
    }
}
