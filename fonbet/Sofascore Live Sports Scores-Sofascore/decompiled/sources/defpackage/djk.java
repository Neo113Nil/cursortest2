package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class djk {
    public static final xj4 a;

    static {
        wib wibVar = uj4.b;
        sbk sbkVar = new sbk(14);
        wibVar.getClass();
        wj4 wj4Var = new wj4(new ef0(0));
        sbkVar.invoke(wj4Var);
        a = new xj4(wj4Var.build(), 0);
    }

    public static final int a(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
