package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class o93 {
    public static rs2 a(Function1... function1Arr) {
        if (function1Arr.length > 0) {
            return new rs2(function1Arr, 1);
        }
        a70.p("Failed requirement.");
        return null;
    }

    public static int b(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            return comparable2 == null ? 0 : -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }
}
