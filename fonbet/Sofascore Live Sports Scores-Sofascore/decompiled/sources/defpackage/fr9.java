package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class fr9 {
    public static final e5f c = new e5f("|S||P|");
    public static final e5f d = new e5f("|S|id");
    public static final String[] e = {"*", "FCM", "GCM", ""};
    public final jda a;
    public final String b;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r1.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fr9(r38 r38Var) {
        r38Var.a();
        this.a = new jda(r38Var.a, "com.google.android.gms.appid");
        r38Var.a();
        s48 s48Var = r38Var.c;
        String str = s48Var.e;
        if (str == null) {
            r38Var.a();
            str = s48Var.b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] split = str.split(":");
                if (split.length == 4) {
                    str = split[1];
                }
                str = null;
            }
        }
        this.b = str;
    }
}
