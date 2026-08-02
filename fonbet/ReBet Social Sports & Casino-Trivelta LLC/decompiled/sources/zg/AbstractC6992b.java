package zg;

import vg.C6689a;

/* renamed from: zg.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6992b {
    public static AbstractC6991a a(String str) {
        return b(str, 1);
    }

    public static AbstractC6991a b(String str, int i10) {
        return c(str, i10, "v13");
    }

    public static AbstractC6991a c(String str, int i10, String str2) {
        if (str2.equals("v13")) {
            return i10 == 2 ? new d(str) : new g(str);
        }
        throw new C6689a("Unsupported Version");
    }
}
